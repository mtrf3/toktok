package com.bytedance.android.livesdk.model;

import X.C30957CCz;
import X.CD6;
import X.InterfaceC64604PXc;
import java.util.Map;

/* loaded from: classes6.dex */
public final class _UserAttr_ProtoEncoder implements InterfaceC64604PXc<UserAttr> {
    public static int LIZJ(UserAttr userAttr) {
        int LJIIIZ = C30957CCz.LJIIIZ(4, userAttr.muteDuration) + C30957CCz.LJ(3) + C30957CCz.LJ(2) + C30957CCz.LJ(1);
        Map<Integer, Integer> map = userAttr.adminPermissions;
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<Integer, Integer> entry : userAttr.adminPermissions.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    int LJII = C30957CCz.LJII(2, entry.getValue()) + C30957CCz.LJII(1, entry.getKey());
                    LJIIIZ += CD6.LIZ(5) + CD6.LIZIZ(LJII) + LJII;
                }
            }
        }
        return LJIIIZ;
    }

    public static void LIZIZ(CD6 cd6, UserAttr userAttr) {
        boolean z = userAttr.isMuted;
        cd6.LIZLLL(1, 0);
        cd6.LJ(z ? 1 : 0);
        boolean z2 = userAttr.isAdmin;
        cd6.LIZLLL(2, 0);
        cd6.LJ(z2 ? 1 : 0);
        boolean z3 = userAttr.isSuperAdmin;
        cd6.LIZLLL(3, 0);
        cd6.LJ(z3 ? 1 : 0);
        long j = userAttr.muteDuration;
        cd6.LIZLLL(4, 0);
        cd6.LJFF(j);
        Map<Integer, Integer> map = userAttr.adminPermissions;
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<Integer, Integer> entry : userAttr.adminPermissions.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    cd6.LIZLLL(5, 2);
                    cd6.LJ(C30957CCz.LJII(2, entry.getValue()) + C30957CCz.LJII(1, entry.getKey()));
                    C30957CCz.LIZIZ(cd6, 1, entry.getKey());
                    C30957CCz.LIZIZ(cd6, 2, entry.getValue());
                }
            }
        }
    }

    @Override // X.InterfaceC64604PXc
    public final void LIZ(CD6 cd6, UserAttr userAttr) {
        LIZIZ(cd6, userAttr);
    }
}
