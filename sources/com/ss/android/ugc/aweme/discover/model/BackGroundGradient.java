package com.ss.android.ugc.aweme.discover.model;

import X.F9E;
import X.HH1;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class BackGroundGradient extends F9E implements Serializable {

    @InterfaceC65349Pkn("center_color")
    public final String centerColor;

    @InterfaceC65349Pkn("end_color")
    public final String endColor;

    @InterfaceC65349Pkn("start_color")
    public final String startColor;

    public static /* synthetic */ BackGroundGradient copy$default(BackGroundGradient backGroundGradient, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = backGroundGradient.startColor;
        }
        if ((i & 2) != 0) {
            str2 = backGroundGradient.centerColor;
        }
        if ((i & 4) != 0) {
            str3 = backGroundGradient.endColor;
        }
        return backGroundGradient.copy(str, str2, str3);
    }

    public final BackGroundGradient copy(String startColor, String centerColor, String endColor) {
        o.LJIIIZ(startColor, "startColor");
        o.LJIIIZ(centerColor, "centerColor");
        o.LJIIIZ(endColor, "endColor");
        return new BackGroundGradient(startColor, centerColor, endColor);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.startColor, this.centerColor, this.endColor};
    }

    public final String getCenterColor() {
        return this.centerColor;
    }

    public final String getEndColor() {
        return this.endColor;
    }

    public final String getStartColor() {
        return this.startColor;
    }

    public BackGroundGradient(String str, String str2, String str3) {
        HH1.LIZ(str, "startColor", str2, "centerColor", str3, "endColor");
        this.startColor = str;
        this.centerColor = str2;
        this.endColor = str3;
    }
}
