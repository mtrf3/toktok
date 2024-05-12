package X;

import com.bytedance.keva.Keva;
import java.util.concurrent.TimeUnit;

/* renamed from: X.FtY, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40412FtY<TTaskResult, TContinuationResult> implements C10I {
    public static final C40412FtY<TTaskResult, TContinuationResult> LIZ = new C40412FtY<>();

    @Override // X.C10I
    public final Object then(C10K c10k) {
        EnumC40416Ftc enumC40416Ftc = EnumC40416Ftc.WALLPAPER;
        C40413FtZ c40413FtZ = new C40413FtZ(enumC40416Ftc);
        boolean z = false;
        if (!C40410FtW.LIZ()) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(enumC40416Ftc);
            LIZ2.append(" :Installation time is less than 7 days");
            C39333Fc9.LIZ(X1D.LIZIZ(LIZ2));
        } else if (c40413FtZ.LJ) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(enumC40416Ftc);
            LIZ3.append(" not show, isClickedSubmit=true");
            C39333Fc9.LIZ(X1D.LIZIZ(LIZ3));
        } else if (!C62011OVj.LJI()) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append(enumC40416Ftc);
            LIZ4.append(" not show, not use plugin");
            C39333Fc9.LIZ(X1D.LIZIZ(LIZ4));
        } else {
            long currentTimeMillis = System.currentTimeMillis() - c40413FtZ.LIZJ;
            TimeUnit timeUnit = TimeUnit.DAYS;
            if (currentTimeMillis < timeUnit.toMillis(30L)) {
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append(enumC40416Ftc);
                LIZ5.append(" not show, It happened in 30 days");
                C39333Fc9.LIZ(X1D.LIZIZ(LIZ5));
            } else {
                long j = c40413FtZ.LJII;
                long currentTimeMillis2 = System.currentTimeMillis();
                c40413FtZ.LJII = currentTimeMillis2;
                Keva keva = c40413FtZ.LIZ;
                StringBuilder LIZ6 = X1D.LIZ();
                keva.storeLong(JBR.LJFF(LIZ6, c40413FtZ.LIZIZ, "key_last_try_show_time", LIZ6), currentTimeMillis2);
                if (j == 0) {
                    StringBuilder LIZ7 = X1D.LIZ();
                    LIZ7.append(enumC40416Ftc);
                    LIZ7.append(" not show, first try show time");
                    C39333Fc9.LIZ(X1D.LIZIZ(LIZ7));
                } else if (currentTimeMillis2 - j < timeUnit.toMillis(30L) && C40418Fte.LIZ()) {
                    z = true;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
