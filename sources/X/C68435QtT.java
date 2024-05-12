package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;

/* renamed from: X.QtT, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68435QtT {
    public static C68435QtT LIZJ;
    public final Context LIZ;
    public volatile String LIZIZ;

    public C68435QtT(Context context) {
        this.LIZ = C16880lQ.LLLLL(context);
    }

    public static C68435QtT LIZ(Context context) {
        QH7.LJIIIIZZ(context);
        synchronized (C68435QtT.class) {
            if (LIZJ == null) {
                C68438QtW.LIZ(context);
                LIZJ = new C68435QtT(context);
            }
        }
        return LIZJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003f A[EDGE_INSN: B:21:0x003f->B:17:0x003f BREAK  A[LOOP:0: B:8:0x0043->B:20:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZIZ(int r16) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68435QtT.LIZIZ(int):boolean");
    }

    public static final AbstractBinderC68448Qtg LIZJ(PackageInfo packageInfo, AbstractBinderC68448Qtg... abstractBinderC68448QtgArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null || signatureArr.length != 1) {
            return null;
        }
        BinderC68444Qtc binderC68444Qtc = new BinderC68444Qtc(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < abstractBinderC68448QtgArr.length; i++) {
            if (abstractBinderC68448QtgArr[i].equals(binderC68444Qtc)) {
                return abstractBinderC68448QtgArr[i];
            }
        }
        return null;
    }

    public static final boolean LIZLLL(PackageInfo packageInfo, boolean z) {
        AbstractBinderC68448Qtg LIZJ2;
        if (packageInfo != null && packageInfo.signatures != null) {
            if (z) {
                LIZJ2 = LIZJ(packageInfo, C68443Qtb.LIZ);
            } else {
                LIZJ2 = LIZJ(packageInfo, C68443Qtb.LIZ[0]);
            }
            if (LIZJ2 != null) {
                return true;
            }
        }
        return false;
    }
}
