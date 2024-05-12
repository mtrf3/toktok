package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class MaskExtraModule implements Serializable {

    @InterfaceC65349Pkn("btn_text")
    public String btnText;

    @InterfaceC65349Pkn("pop_window")
    public MaskPopWindow popWindow;

    @InterfaceC65349Pkn("module_type")
    public int type;

    @InterfaceC65349Pkn("url")
    public String url;

    /* JADX WARN: Multi-variable type inference failed */
    public MaskExtraModule() {
        this(0, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ MaskExtraModule copy$default(MaskExtraModule maskExtraModule, int i, String str, String str2, MaskPopWindow maskPopWindow, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = maskExtraModule.type;
        }
        if ((i2 & 2) != 0) {
            str = maskExtraModule.btnText;
        }
        if ((i2 & 4) != 0) {
            str2 = maskExtraModule.url;
        }
        if ((i2 & 8) != 0) {
            maskPopWindow = maskExtraModule.popWindow;
        }
        return maskExtraModule.copy(i, str, str2, maskPopWindow);
    }

    public final MaskExtraModule copy(int i, String str, String str2, MaskPopWindow maskPopWindow) {
        return new MaskExtraModule(i, str, str2, maskPopWindow);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MaskExtraModule)) {
            return false;
        }
        MaskExtraModule maskExtraModule = (MaskExtraModule) obj;
        return this.type == maskExtraModule.type && o.LJ(this.btnText, maskExtraModule.btnText) && o.LJ(this.url, maskExtraModule.url) && o.LJ(this.popWindow, maskExtraModule.popWindow);
    }

    public int hashCode() {
        int i = this.type * 31;
        String str = this.btnText;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.url;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        MaskPopWindow maskPopWindow = this.popWindow;
        return hashCode2 + (maskPopWindow != null ? maskPopWindow.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MaskExtraModule(type=");
        LIZ.append(this.type);
        LIZ.append(", btnText=");
        LIZ.append(this.btnText);
        LIZ.append(", url=");
        LIZ.append(this.url);
        LIZ.append(", popWindow=");
        LIZ.append(this.popWindow);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final String getBtnText() {
        return this.btnText;
    }

    public final MaskPopWindow getPopWindow() {
        return this.popWindow;
    }

    public final int getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public MaskExtraModule(int i, String str, String str2, MaskPopWindow maskPopWindow) {
        this.type = i;
        this.btnText = str;
        this.url = str2;
        this.popWindow = maskPopWindow;
    }

    public /* synthetic */ MaskExtraModule(int i, String str, String str2, MaskPopWindow maskPopWindow, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? null : maskPopWindow);
    }
}
