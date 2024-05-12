package com.ss.android.ugc.aweme.ktv;

import X.F9E;
import X.HH1;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SimpleEffect extends F9E implements Serializable {
    public String defaultColor;
    public final String id;
    public boolean isItalic;
    public final String name;
    public final String path;
    public final String resId;

    public static /* synthetic */ SimpleEffect copy$default(SimpleEffect simpleEffect, String str, String str2, String str3, String str4, boolean z, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = simpleEffect.id;
        }
        if ((i & 2) != 0) {
            str2 = simpleEffect.resId;
        }
        if ((i & 4) != 0) {
            str3 = simpleEffect.name;
        }
        if ((i & 8) != 0) {
            str4 = simpleEffect.path;
        }
        if ((i & 16) != 0) {
            z = simpleEffect.isItalic;
        }
        if ((i & 32) != 0) {
            str5 = simpleEffect.defaultColor;
        }
        return simpleEffect.copy(str, str2, str3, str4, z, str5);
    }

    public final SimpleEffect copy(String id, String resId, String str, String path, boolean z, String str2) {
        o.LJIIIZ(id, "id");
        o.LJIIIZ(resId, "resId");
        o.LJIIIZ(path, "path");
        return new SimpleEffect(id, resId, str, path, z, str2);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.id, this.resId, this.name, this.path, Boolean.valueOf(this.isItalic), this.defaultColor};
    }

    public final String getDefaultColor() {
        return this.defaultColor;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getResId() {
        return this.resId;
    }

    public final boolean isItalic() {
        return this.isItalic;
    }

    public final void setDefaultColor(String str) {
        this.defaultColor = str;
    }

    public final void setItalic(boolean z) {
        this.isItalic = z;
    }

    public SimpleEffect(String str, String str2, String str3, String str4, boolean z, String str5) {
        HH1.LIZ(str, "id", str2, "resId", str4, "path");
        this.id = str;
        this.resId = str2;
        this.name = str3;
        this.path = str4;
        this.isItalic = z;
        this.defaultColor = str5;
    }

    public /* synthetic */ SimpleEffect(String str, String str2, String str3, String str4, boolean z, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : str5);
    }
}
