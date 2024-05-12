package com.ss.android.ugc.aweme.settingsrequest.model;

import X.C16880lQ;
import X.C9A0;
import X.InterfaceC65349Pkn;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class PopupSetting extends BaseResponse {

    @InterfaceC65349Pkn("count")
    public int count;

    @InterfaceC65349Pkn("id")
    public String id;

    @InterfaceC65349Pkn("popupBatch")
    public int popupBatch;

    @InterfaceC65349Pkn("text")
    public PopupText popupText;

    @InterfaceC65349Pkn("show_interval")
    public int showInterval;

    @InterfaceC65349Pkn("show_time")
    public int show_time;

    /* loaded from: classes10.dex */
    public static final class ButtonActionStruct {

        @InterfaceC65349Pkn("action_type")
        public int actionType;

        @InterfaceC65349Pkn("target")
        public String target;
    }

    /* loaded from: classes10.dex */
    public static final class ButtonStruct {

        @InterfaceC65349Pkn("action")
        public ButtonActionStruct buttonActionStruct;

        @InterfaceC65349Pkn("style")
        public C9A0 style;

        @InterfaceC65349Pkn("text")
        public String text;
    }

    /* loaded from: classes10.dex */
    public static final class PopupText {

        @InterfaceC65349Pkn("buttons")
        public List<ButtonStruct> buttons;

        @InterfaceC65349Pkn("context")
        public String context;

        @InterfaceC65349Pkn("image")
        public UrlStruct image;

        @InterfaceC65349Pkn("labels")
        public List<ButtonStruct> labels;

        @InterfaceC65349Pkn("title")
        public String title;
    }

    /* loaded from: classes10.dex */
    public static final class UrlStruct {

        @InterfaceC65349Pkn("height")
        public int height;

        @InterfaceC65349Pkn("uri")
        public String uri;

        @InterfaceC65349Pkn("url_key")
        public String url_key;

        @InterfaceC65349Pkn("url_list")
        public String[] url_list = new String[0];

        @InterfaceC65349Pkn("width")
        public int width;
    }

    public final String LJ() {
        try {
            PopupText popupText = this.popupText;
            o.LJI(popupText);
            List<ButtonStruct> list = popupText.buttons;
            o.LJI(list);
            ButtonActionStruct buttonActionStruct = ((ButtonStruct) ListProtector.get(list, 1)).buttonActionStruct;
            o.LJI(buttonActionStruct);
            return buttonActionStruct.target;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public final String LJI() {
        try {
            PopupText popupText = this.popupText;
            o.LJI(popupText);
            List<ButtonStruct> list = popupText.buttons;
            o.LJI(list);
            ButtonActionStruct buttonActionStruct = ((ButtonStruct) ListProtector.get(list, 0)).buttonActionStruct;
            o.LJI(buttonActionStruct);
            return buttonActionStruct.target;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }
}
