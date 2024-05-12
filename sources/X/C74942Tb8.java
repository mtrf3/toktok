package X;

import java.util.List;

/* renamed from: X.Tb8, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74942Tb8 {
    public static /* synthetic */ void LIZ(InterfaceC74941Tb7 interfaceC74941Tb7, List list, List list2, List list3, long j, int i) {
        long j2 = j;
        List list4 = list;
        List list5 = list2;
        List list6 = null;
        if ((i & 1) != 0) {
            list4 = null;
        }
        if ((i & 2) != 0) {
            list5 = null;
        }
        if ((i & 4) == 0) {
            list6 = list3;
        }
        if ((i & 8) != 0) {
            j2 = 0;
        }
        interfaceC74941Tb7.e6(j2, list4, list5, list6);
    }
}
