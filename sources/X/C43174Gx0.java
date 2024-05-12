package X;

import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.Gx0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43174Gx0 extends AbstractC43178Gx4 {
    @Override // X.AbstractC43178Gx4
    public final String LIZJ() {
        return "abnor_download";
    }

    @Override // X.AbstractC43178Gx4
    public final long LIZLLL() {
        return TimeUnit.HOURS.toMillis(2L);
    }

    @Override // X.AbstractC43178Gx4
    public final String LIZIZ() {
        long currentTimeMillis = System.currentTimeMillis() - LIZLLL();
        C43176Gx2.LIZ.getClass();
        List LJ = C43176Gx2.LJ(currentTimeMillis, "download_start");
        List LJ2 = C43176Gx2.LJ(currentTimeMillis, "download_cancel");
        List LJ3 = C43176Gx2.LJ(currentTimeMillis, "download_success");
        List<C43189GxF> LJ4 = C43176Gx2.LJ(currentTimeMillis, "download_error");
        List LJ5 = C43176Gx2.LJ(currentTimeMillis, "water_mark_start");
        List LJ6 = C43176Gx2.LJ(currentTimeMillis, "water_mark_cancel");
        List LJ7 = C43176Gx2.LJ(currentTimeMillis, "water_mark_success");
        List LJ8 = C43176Gx2.LJ(currentTimeMillis, "water_mark_error");
        StringBuilder sb = new StringBuilder();
        if (!LJ.isEmpty()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("DownloadTimes: ");
            LIZ.append(LJ.size());
            LIZ.append(';');
            sb.append(X1D.LIZIZ(LIZ));
        }
        if (!LJ2.isEmpty()) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("DownloadCancel: ");
            LIZ2.append(LJ2.size());
            LIZ2.append(';');
            sb.append(X1D.LIZIZ(LIZ2));
        }
        if (!LJ3.isEmpty()) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("DownloadSuccess: ");
            LIZ3.append(LJ3.size());
            LIZ3.append(';');
            sb.append(X1D.LIZIZ(LIZ3));
        }
        if (!LJ4.isEmpty()) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("DownloadError: ");
            LIZ4.append(LJ4.size());
            LIZ4.append("(ECode:");
            sb.append(X1D.LIZIZ(LIZ4));
            boolean z = true;
            for (C43189GxF c43189GxF : LJ4) {
                if (!z) {
                    sb.append(",");
                }
                sb.append(c43189GxF.LIZLLL);
                z = false;
            }
            sb.append(");");
        }
        if (!LJ5.isEmpty()) {
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("WatermarkTimes: ");
            LIZ5.append(LJ5.size());
            LIZ5.append(';');
            sb.append(X1D.LIZIZ(LIZ5));
        }
        if (!LJ6.isEmpty()) {
            StringBuilder LIZ6 = X1D.LIZ();
            LIZ6.append("WatermarkCancel: ");
            LIZ6.append(LJ6.size());
            LIZ6.append(';');
            sb.append(X1D.LIZIZ(LIZ6));
        }
        if (!LJ7.isEmpty()) {
            StringBuilder LIZ7 = X1D.LIZ();
            LIZ7.append("WatermarkSuccess: ");
            LIZ7.append(LJ7.size());
            LIZ7.append(';');
            sb.append(X1D.LIZIZ(LIZ7));
        }
        if (!LJ8.isEmpty()) {
            StringBuilder LIZ8 = X1D.LIZ();
            LIZ8.append("WatermarkError: ");
            LIZ8.append(LJ8.size());
            LIZ8.append(';');
            sb.append(X1D.LIZIZ(LIZ8));
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "result.toString()");
        return sb2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:3:0x000c A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0055 A[RETURN, SYNTHETIC] */
    @Override // X.AbstractC43178Gx4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ(java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "type"
            kotlin.jvm.internal.o.LJIIIZ(r2, r0)
            int r0 = r2.hashCode()
            switch(r0) {
                case -1826452220: goto L44;
                case -210589876: goto L3b;
                case 71186961: goto L32;
                case 974485393: goto L29;
                case 987458027: goto L20;
                case 1051818558: goto L4d;
                case 1064791192: goto L17;
                case 1092137657: goto Le;
                default: goto Lc;
            }
        Lc:
            r0 = 0
        Ld:
            return r0
        Le:
            java.lang.String r0 = "water_mark_success"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L55
            goto Lc
        L17:
            java.lang.String r0 = "water_mark_start"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L55
            goto Lc
        L20:
            java.lang.String r0 = "download_start"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L55
            goto Lc
        L29:
            java.lang.String r0 = "download_error"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L55
            goto Lc
        L32:
            java.lang.String r0 = "download_cancel"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L55
            goto Lc
        L3b:
            java.lang.String r0 = "download_success"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L55
            goto Lc
        L44:
            java.lang.String r0 = "water_mark_cancel"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L55
            goto Lc
        L4d:
            java.lang.String r0 = "water_mark_error"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lc
        L55:
            r0 = 1
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43174Gx0.LIZ(java.lang.String):boolean");
    }
}
