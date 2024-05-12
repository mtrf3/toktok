package X;

import android.os.Bundle;

/* renamed from: X.FuD, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40453FuD {
    public static int LIZ(Bundle bundle) {
        String string = bundle.getString("previous_uid");
        String curUserId = R41.LIZ().getCurUserId();
        boolean isNullUid = R41.LIZ().isNullUid(string);
        boolean isNullUid2 = R41.LIZ().isNullUid(curUserId);
        if (isNullUid) {
            if (!isNullUid2) {
                return 0;
            }
        } else if (!isNullUid2) {
            return 1;
        }
        return 2;
    }

    public static C10K<Bundle> LIZIZ(Bundle bundle, C40392FtE c40392FtE) {
        C10K<Bundle> LIZIZ;
        if (bundle == null) {
            bundle = new Bundle();
        }
        ((InterfaceC40454FuE) C58725N2z.LIZIZ(InterfaceC40454FuE.class)).LIZJ();
        int LIZ = LIZ(bundle);
        if (LIZ == 0) {
            LIZIZ = C40390FtC.LIZ(bundle);
        } else if (LIZ == 1) {
            LIZIZ = C40390FtC.LIZJ(bundle);
        } else {
            LIZIZ = C40390FtC.LIZIZ(bundle, c40392FtE);
        }
        C2U8.LIZ(new C175256uH(LIZ));
        return LIZIZ.LJIILL(new C10I() { // from class: X.OUO
            @Override // X.C10I
            public final Object then(C10K c10k) {
                R41.LJ().uploadAccountNum(true);
                return c10k.LJIIJJI();
            }
        });
    }
}
