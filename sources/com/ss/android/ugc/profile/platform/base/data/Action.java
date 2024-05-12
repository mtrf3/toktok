package com.ss.android.ugc.profile.platform.base.data;

import X.C9GF;
import X.C9GG;
import X.C9GH;
import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes5.dex */
public final class Action implements Serializable {

    @InterfaceC65349Pkn("dialog")
    public C9GG dialog;

    @InterfaceC65349Pkn("router")
    public RouterInfo router;

    @InterfaceC65349Pkn("sheet")
    public SheetInfo sheet;

    @InterfaceC65349Pkn("toast")
    public C9GH toast;

    @InterfaceC65349Pkn("type")
    public String type;

    /* loaded from: classes5.dex */
    public static final class RouterInfo implements Serializable {

        @InterfaceC65349Pkn("url")
        public String url;

        public final String getUrl() {
            return this.url;
        }

        public final void setUrl(String str) {
            this.url = str;
        }
    }

    /* loaded from: classes5.dex */
    public static final class SheetInfo implements Serializable {
        public static final C9GF Companion = new Object() { // from class: X.9GF
        };

        @InterfaceC65349Pkn("type")
        public Integer sheetType;

        public final Integer getSheetType() {
            return this.sheetType;
        }

        public final void setSheetType(Integer num) {
            this.sheetType = num;
        }
    }

    public final C9GG getDialog() {
        return this.dialog;
    }

    public final RouterInfo getRouter() {
        return this.router;
    }

    public final SheetInfo getSheet() {
        return this.sheet;
    }

    public final C9GH getToast() {
        return this.toast;
    }

    public final String getType() {
        return this.type;
    }

    public final void setDialog(C9GG c9gg) {
        this.dialog = c9gg;
    }

    public final void setRouter(RouterInfo routerInfo) {
        this.router = routerInfo;
    }

    public final void setSheet(SheetInfo sheetInfo) {
        this.sheet = sheetInfo;
    }

    public final void setToast(C9GH c9gh) {
        this.toast = c9gh;
    }

    public final void setType(String str) {
        this.type = str;
    }
}
