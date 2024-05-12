package X;

import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.Gu0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42988Gu0 extends AbstractC43178Gx4 {
    public final String LIZ = "follow_user";
    public final String LIZIZ = "unfollow_user";

    @Override // X.AbstractC43178Gx4
    public final String LIZJ() {
        return "abnor_follow";
    }

    @Override // X.AbstractC43178Gx4
    public final long LIZLLL() {
        return TimeUnit.HOURS.toMillis(2L);
    }

    @Override // X.AbstractC43178Gx4
    public final String LIZIZ() {
        long currentTimeMillis = System.currentTimeMillis() - LIZLLL();
        C43176Gx2 c43176Gx2 = C43176Gx2.LIZ;
        String str = this.LIZ;
        c43176Gx2.getClass();
        List<C43189GxF> LJ = C43176Gx2.LJ(currentTimeMillis, str);
        List<C43189GxF> LJ2 = C43176Gx2.LJ(currentTimeMillis, this.LIZIZ);
        StringBuilder sb = new StringBuilder();
        if (!LJ.isEmpty()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("FollowError: ");
            LIZ.append(LJ.size());
            LIZ.append("(ECode:");
            sb.append(X1D.LIZIZ(LIZ));
            for (C43189GxF c43189GxF : LJ) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(c43189GxF.LIZLLL);
                LIZ2.append(',');
                sb.append(X1D.LIZIZ(LIZ2));
            }
            sb.deleteCharAt(sb.length() - 1);
            sb.append(");");
        }
        if (!LJ2.isEmpty()) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("UnFollowError: ");
            LIZ3.append(LJ2.size());
            LIZ3.append("(ECode:");
            sb.append(X1D.LIZIZ(LIZ3));
            for (C43189GxF c43189GxF2 : LJ2) {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append(c43189GxF2.LIZLLL);
                LIZ4.append(',');
                sb.append(X1D.LIZIZ(LIZ4));
            }
            sb.deleteCharAt(sb.length() - 1);
            sb.append(");");
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "result.toString()");
        return sb2;
    }

    @Override // X.AbstractC43178Gx4
    public final boolean LIZ(String type) {
        o.LJIIIZ(type, "type");
        if (o.LJ(type, this.LIZ)) {
            return true;
        }
        return o.LJ(type, this.LIZIZ);
    }
}
