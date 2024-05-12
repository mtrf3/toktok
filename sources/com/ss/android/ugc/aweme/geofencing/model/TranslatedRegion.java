package com.ss.android.ugc.aweme.geofencing.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class TranslatedRegion extends F9E implements Serializable {
    public boolean LJLIL;

    @InterfaceC65349Pkn("string_code")
    public final String code;

    @InterfaceC65349Pkn("translation")
    public final String translation;

    public static /* synthetic */ TranslatedRegion copy$default(TranslatedRegion translatedRegion, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = translatedRegion.code;
        }
        if ((i & 2) != 0) {
            str2 = translatedRegion.translation;
        }
        if ((i & 4) != 0) {
            z = translatedRegion.LJLIL;
        }
        return translatedRegion.copy(str, str2, z);
    }

    public final TranslatedRegion copy(String code, String translation, boolean z) {
        o.LJIIIZ(code, "code");
        o.LJIIIZ(translation, "translation");
        return new TranslatedRegion(code, translation, z);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.code, this.translation, Boolean.valueOf(this.LJLIL)};
    }

    public final String getCode() {
        return this.code;
    }

    public final boolean getSelected() {
        return this.LJLIL;
    }

    public final String getTranslation() {
        return this.translation;
    }

    public final void setSelected(boolean z) {
        this.LJLIL = z;
    }

    public TranslatedRegion(String code, String translation, boolean z) {
        o.LJIIIZ(code, "code");
        o.LJIIIZ(translation, "translation");
        this.code = code;
        this.translation = translation;
        this.LJLIL = z;
    }

    public /* synthetic */ TranslatedRegion(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? false : z);
    }
}
