package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;

/* renamed from: X.Ftb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40415Ftb {
    public static long LIZ;
    public static final C40413FtZ LIZIZ;

    static {
        EnumC40416Ftc enumC40416Ftc = EnumC40416Ftc.ACTIVATION;
        LIZIZ = new C40413FtZ(enumC40416Ftc);
        if (C40420Ftg.LIZ()) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(enumC40416Ftc);
            LIZ2.append(": start play time saving timer");
            C39333Fc9.LIZ(X1D.LIZIZ(LIZ2));
            new PthreadTimer("PlayTimeTriggerHelper").schedule(new C40414Fta(), 0L, 120000L);
        }
    }
}
