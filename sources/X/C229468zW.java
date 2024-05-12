package X;

import kotlin.jvm.internal.o;

/* renamed from: X.8zW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C229468zW implements InterfaceC88763e4 {
    public final InterfaceC65462ha LJJJIL(String str, String str2, long j, int i, String str3, String str4, boolean z, Integer num, int i2) {
        XGR LIZIZ = XGJ.LIZ().LIZIZ(new C229508za(str, str2, j, i, str3, str4, z, num, i2));
        AbstractC54815LfH abstractC54815LfH = (AbstractC54815LfH) C229528zc.LIZIZ.getValue();
        if (o.LJ(C229538zd.class, C229538zd.class)) {
            LIZIZ.LIZ(new C84569XGz(new C57354Mf8(abstractC54815LfH, null, null, C229538zd.class, C229538zd.class)));
            C78977Uz7.LJJIJL(LIZIZ, EnumC199577sP.NetWhenCacheMiss);
            return LIZIZ.LIZIZ();
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("po is ");
        LIZ.append(C229538zd.class);
        LIZ.append(", do is ");
        LIZ.append(C229538zd.class);
        LIZ.append(", please pass the onFetchCache and onQueryNet param to map cache");
        String LIZIZ2 = X1D.LIZIZ(LIZ);
        LIZIZ2.toString();
        throw new IllegalStateException(LIZIZ2);
    }
}
