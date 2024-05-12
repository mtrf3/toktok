package com.ss.android.ugc.aweme.bnpl.network.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class InstitutionIcon extends F9E implements Serializable {
    public static final int $stable = 0;

    @InterfaceC65349Pkn("dark")
    public final String dark;

    @InterfaceC65349Pkn("light")
    public final String light;

    public static /* synthetic */ InstitutionIcon copy$default(InstitutionIcon institutionIcon, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = institutionIcon.dark;
        }
        if ((i & 2) != 0) {
            str2 = institutionIcon.light;
        }
        return institutionIcon.copy(str, str2);
    }

    public final InstitutionIcon copy(String dark, String light) {
        o.LJIIIZ(dark, "dark");
        o.LJIIIZ(light, "light");
        return new InstitutionIcon(dark, light);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.dark, this.light};
    }

    public final String getDark() {
        return this.dark;
    }

    public final String getLight() {
        return this.light;
    }

    public InstitutionIcon(String dark, String light) {
        o.LJIIIZ(dark, "dark");
        o.LJIIIZ(light, "light");
        this.dark = dark;
        this.light = light;
    }
}
