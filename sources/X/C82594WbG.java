package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* renamed from: X.WbG, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82594WbG {
    public static InterfaceC84498XEg LIZIZ;
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C82606WbS.LJLIL);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C82607WbT.LJLIL);

    public static boolean LIZ(Effect effect) {
        int i;
        Integer LJJIL;
        String effectId = effect.getEffectId();
        if (effectId != null && (LJJIL = C38350F3i.LJJIL(effectId)) != null) {
            i = LJJIL.intValue();
        } else {
            i = -1;
        }
        if (i < 0) {
            return true;
        }
        InterfaceC84498XEg LIZIZ2 = C82593WbF.LIZIZ();
        if ((LIZIZ2 != null && LIZIZ2.LJJIJLIJ(effect)) || effect.getEffectType() != 0) {
            return true;
        }
        return false;
    }
}
