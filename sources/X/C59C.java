package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;

/* renamed from: X.59C, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C59C {
    public static /* synthetic */ void LIZ(C59B c59b, NLETrackSlot nLETrackSlot, EnumC127354zD enumC127354zD, boolean z, boolean z2, int i) {
        if ((i & 2) != 0) {
            enumC127354zD = EnumC127354zD.LINE;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        c59b.LIZJ(nLETrackSlot, enumC127354zD, z, z2);
    }
}
