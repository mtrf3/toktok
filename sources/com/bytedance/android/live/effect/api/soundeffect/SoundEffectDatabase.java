package com.bytedance.android.live.effect.api.soundeffect;

import X.AbstractC03300Ba;
import X.C0BV;
import X.C0BW;
import X.C15380j0;
import X.InterfaceC09770Zx;

/* loaded from: classes.dex */
public abstract class SoundEffectDatabase extends AbstractC03300Ba {
    public static final SoundEffectDatabase LJIIL;

    public abstract InterfaceC09770Zx LJIJ();

    static {
        C0BW LIZ = C0BV.LIZ(C15380j0.LIZLLL(), SoundEffectDatabase.class, "db_live_effect");
        LIZ.LIZJ();
        LJIIL = (SoundEffectDatabase) LIZ.LIZIZ();
    }
}
