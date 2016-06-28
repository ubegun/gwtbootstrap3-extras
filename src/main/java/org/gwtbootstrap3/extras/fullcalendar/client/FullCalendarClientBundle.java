package org.gwtbootstrap3.extras.fullcalendar.client;

/*
 * #%L
 * GwtBootstrap3
 * %%
 * Copyright (C) 2013 - 2014 GwtBootstrap3
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.resources.client.TextResource;

public interface FullCalendarClientBundle extends ClientBundle {

    public static final FullCalendarClientBundle INSTANCE = GWT.create(FullCalendarClientBundle.class);

    @Source("resource/css/fullcalendar-2.0.0.cache.css")
    @CssResource.NotStrict
    CssResource fullCalendarCss();

    @Source("resource/css/fullcalendar-2.0.0.cache.print.css")
    @CssResource.NotStrict
    CssResource fullCalendarPrintCss();

    @Source("resource/js/fullcalendar-2.0.0.min.cache.js")
    TextResource getFullCalendarJS();

    @Source("resource/js/gcal-2.0.0.cache.js")
    TextResource getGoogleCalJS();

    @Source("resource/js/jquery-ui-1.10.4.custom.min.cache.js")
    TextResource getCustomDragResizeJS();

    @Source("resource/js/moment-2.6.0.min.cache.js")
    TextResource getMomentJS();

    //langauge files
    @Source("resource/js/lang.cache.2.0.0/ar-ma.js")
    TextResource getArabicMorocan();

    @Source("resource/js/lang.cache.2.0.0/ar.js")
    TextResource getArabic();

    @Source("resource/js/lang.cache.2.0.0/bg.js")
    TextResource getBulgarian();

    @Source("resource/js/lang.cache.2.0.0/ca.js")
    TextResource getCatalan();

    @Source("resource/js/lang.cache.2.0.0/cs.js")
    TextResource getCzech();

    @Source("resource/js/lang.cache.2.0.0/da.js")
    TextResource getDanish();

    @Source("resource/js/lang.cache.2.0.0/de.js")
    TextResource getGerman();

    @Source("resource/js/lang.cache.2.0.0/el.js")
    TextResource getGreek();

    @Source("resource/js/lang.cache.2.0.0/en-au.js")
    TextResource getEnglishAustralian();

    @Source("resource/js/lang.cache.2.0.0/en-ca.js")
    TextResource getEnglishCanadian();

    @Source("resource/js/lang.cache.2.0.0/en-gb.js")
    TextResource getEnglishBritish();

    @Source("resource/js/lang.cache.2.0.0/es.js")
    TextResource getSpanish();

    @Source("resource/js/lang.cache.2.0.0/fa.js")
    TextResource getFarsi();

    @Source("resource/js/lang.cache.2.0.0/fi.js")
    TextResource getFinnish();

    @Source("resource/js/lang.cache.2.0.0/fr-ca.js")
    TextResource getFrenchCanadian();

    @Source("resource/js/lang.cache.2.0.0/fr.js")
    TextResource getFrench();

    @Source("resource/js/lang.cache.2.0.0/hi.js")
    TextResource getHindi();

    @Source("resource/js/lang.cache.2.0.0/hr.js")
    TextResource getCroatian();

    @Source("resource/js/lang.cache.2.0.0/hu.js")
    TextResource getHungarian();

    @Source("resource/js/lang.cache.2.0.0/it.js")
    TextResource getItalian();

    @Source("resource/js/lang.cache.2.0.0/ja.js")
    TextResource getJapanese();

    @Source("resource/js/lang.cache.2.0.0/ko.js")
    TextResource getKorean();

    @Source("resource/js/lang.cache.2.0.0/lt.js")
    TextResource getLithuanian();

    @Source("resource/js/lang.cache.2.0.0/lv.js")
    TextResource getLatvian();

    @Source("resource/js/lang.cache.2.0.0/nl.js")
    TextResource getDutch();

    @Source("resource/js/lang.cache.2.0.0/pl.js")
    TextResource getPolish();

    @Source("resource/js/lang.cache.2.0.0/pt-br.js")
    TextResource getPortugeseBrazil();

    @Source("resource/js/lang.cache.2.0.0/pt.js")
    TextResource getPortugese();

    @Source("resource/js/lang.cache.2.0.0/ro.js")
    TextResource getRomanian();

    @Source("resource/js/lang.cache.2.0.0/ru.js")
    TextResource getRussian();

    @Source("resource/js/lang.cache.2.0.0/sk.js")
    TextResource getSlovak();

    @Source("resource/js/lang.cache.2.0.0/sl.js")
    TextResource getSlovenian();

    @Source("resource/js/lang.cache.2.0.0/sr-cyr.js")
    TextResource getSerbianCyrillic();

    @Source("resource/js/lang.cache.2.0.0/sr.js")
    TextResource getSerbian();

    @Source("resource/js/lang.cache.2.0.0/sv.js")
    TextResource getSweedish();

    @Source("resource/js/lang.cache.2.0.0/th.js")
    TextResource getThai();

    @Source("resource/js/lang.cache.2.0.0/tr.js")
    TextResource getTurkish();

    @Source("resource/js/lang.cache.2.0.0/uk.js")
    TextResource getUkrainian();

    @Source("resource/js/lang.cache.2.0.0/vi.js")
    TextResource getVietnamese();

    @Source("resource/js/lang.cache.2.0.0/zh-cn.js")
    TextResource getChineseChina();

    @Source("resource/js/lang.cache.2.0.0/zh-tw.js")
    TextResource getChineseTaiwan();
}
