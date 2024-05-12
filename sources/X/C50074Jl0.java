package X;

import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;

/* renamed from: X.Jl0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50074Jl0 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C50073Jkz c50073Jkz) {
        String str;
        InterfaceC50075Jl1 c50072Jky;
        int originType;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("Processing schema: ");
        DynamicPatch dynamicPatch = c50073Jkz.LIZIZ;
        if (dynamicPatch != null) {
            str = dynamicPatch.schema;
        } else {
            str = null;
        }
        LIZ2.append(str);
        X1D.LIZIZ(LIZ2);
        DynamicPatch dynamicPatch2 = c50073Jkz.LIZIZ;
        if (dynamicPatch2 != null && (originType = dynamicPatch2.getOriginType()) != 0 && originType != 80) {
            if (originType == 81) {
                c50072Jky = new C50275JoF();
            } else {
                throw new UnsupportedOperationException(KMP.LJ("Unknown DynamicPatch's origin_type: ", originType));
            }
        } else {
            c50072Jky = new C50072Jky();
        }
        c50072Jky.LIZ(c50073Jkz);
    }
}
