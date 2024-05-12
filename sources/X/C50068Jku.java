package X;

import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;

/* renamed from: X.Jku, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50068Jku {
    public static /* synthetic */ void LIZIZ(InterfaceC50067Jkt interfaceC50067Jkt, DynamicPatch dynamicPatch, java.util.Map map, boolean z, boolean z2, int i) {
        boolean z3 = z2;
        java.util.Map map2 = map;
        boolean z4 = z;
        if ((i & 2) != 0) {
            map2 = null;
        }
        if ((i & 4) != 0) {
            z4 = false;
        }
        if ((i & 8) != 0) {
            z3 = false;
        }
        interfaceC50067Jkt.LJI(dynamicPatch, map2, z4, z3, false, null);
    }
}
