package com.ss.android.ugc.aweme.commercialize.model;

import X.HH1;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class AdDefaultContainerInfoStruct implements Serializable {

    @InterfaceC65349Pkn("background_color")
    public final String backgroundColor;

    @InterfaceC65349Pkn("button_icon_url")
    public final String buttonIconUrl;

    @InterfaceC65349Pkn("button_text")
    public final String buttonText;

    @InterfaceC65349Pkn("change_color_seconds")
    public final int changeColorSeconds;

    /* JADX WARN: Multi-variable type inference failed */
    public AdDefaultContainerInfoStruct() {
        this(null, 0 == true ? 1 : 0, 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getButtonIconUrl() {
        return this.buttonIconUrl;
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final int getChangeColorSeconds() {
        return this.changeColorSeconds;
    }

    public AdDefaultContainerInfoStruct(String str, String str2, int i, String str3) {
        HH1.LIZ(str, "backgroundColor", str2, "buttonIconUrl", str3, "buttonText");
        this.backgroundColor = str;
        this.buttonIconUrl = str2;
        this.changeColorSeconds = i;
        this.buttonText = str3;
    }

    public /* synthetic */ AdDefaultContainerInfoStruct(String str, String str2, int i, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "#" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? "" : str3);
    }
}
