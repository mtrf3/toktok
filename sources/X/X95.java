package X;

import com.bef.effectsdk.RequirementResourceMapper;

/* loaded from: classes16.dex */
public final class X95 {
    public static final String[] LIZ(String[] strArr) {
        try {
            return RequirementResourceMapper.nativePeekResourcesNeededByRequirements(strArr);
        } catch (UnsatisfiedLinkError unused) {
            C12310e3.LIZIZ.getClass();
            C12310e3.LIZIZ("RequirementResourceMapper", "not load effect so", null);
            try {
                X97.LIZ.loadLibrary("effect");
                C3C5.m7constructorimpl(C76800UCe.LIZ);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
            return RequirementResourceMapper.nativePeekResourcesNeededByRequirements(strArr);
        }
    }
}
