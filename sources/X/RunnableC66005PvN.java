package X;

import android.content.Intent;
import android.os.Bundle;
import com.bytedance.android.alog.Alog;
import com.ss.android.agilelogger.ALog;

/* renamed from: X.PvN, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC66005PvN implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ EnumC66006PvO LJLILLLLZI;
    public final /* synthetic */ Throwable LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ Object LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ long LJLJL;
    public final /* synthetic */ long LJLJLJ;

    public final void LIZ() {
        String LJFF;
        int level2AlogCoreLevel = ALog.level2AlogCoreLevel(this.LJLIL);
        EnumC66006PvO enumC66006PvO = this.LJLILLLLZI;
        if (enumC66006PvO == null) {
            if (this.LJLJI != null) {
                if (this.LJLJJI == null) {
                    LJFF = "";
                } else {
                    StringBuilder LIZ = X1D.LIZ();
                    LJFF = JBR.LJFF(LIZ, this.LJLJJI, "\n", LIZ);
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(LJFF);
                LIZ2.append(PN1.LIZ(this.LJLJI));
                X1D.LIZIZ(LIZ2);
            }
        } else {
            EnumC66006PvO enumC66006PvO2 = EnumC66006PvO.BORDER;
            if (enumC66006PvO == enumC66006PvO2) {
                C66007PvP.LIZJ(enumC66006PvO2, this.LJLJJI);
            } else {
                EnumC66006PvO enumC66006PvO3 = EnumC66006PvO.JSON;
                if (enumC66006PvO == enumC66006PvO3) {
                    C66007PvP.LIZJ(enumC66006PvO3, this.LJLJJI);
                } else {
                    EnumC66006PvO enumC66006PvO4 = EnumC66006PvO.BUNDLE;
                    if (enumC66006PvO == enumC66006PvO4) {
                        C66007PvP.LIZIZ(enumC66006PvO4, (Bundle) this.LJLJJL);
                    } else {
                        EnumC66006PvO enumC66006PvO5 = EnumC66006PvO.INTENT;
                        if (enumC66006PvO == enumC66006PvO5) {
                            C66007PvP.LIZ(enumC66006PvO5, (Intent) this.LJLJJL);
                        } else {
                            EnumC66006PvO enumC66006PvO6 = EnumC66006PvO.THROWABLE;
                            if (enumC66006PvO == enumC66006PvO6) {
                                C66007PvP.LJ(enumC66006PvO6, (Throwable) this.LJLJJL);
                            } else {
                                EnumC66006PvO enumC66006PvO7 = EnumC66006PvO.THREAD;
                                if (enumC66006PvO == enumC66006PvO7) {
                                    C66007PvP.LIZLLL(enumC66006PvO7, (Thread) this.LJLJJL);
                                } else {
                                    EnumC66006PvO enumC66006PvO8 = EnumC66006PvO.STACKTRACE;
                                    if (enumC66006PvO == enumC66006PvO8) {
                                        C66007PvP.LJFF(enumC66006PvO8, (StackTraceElement[]) this.LJLJJL);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        String str = this.LJLJJLL;
        String str2 = this.LJLJJI;
        long j = this.LJLJL;
        long j2 = this.LJLJLJ;
        Alog alog = C15280iq.LIZ;
        if (alog != null) {
            alog.LJIIL(level2AlogCoreLevel, j, j2, str, str2);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC66005PvN(int i, EnumC66006PvO enumC66006PvO, Throwable th, String str, Object obj, String str2, long j, long j2) {
        this.LJLIL = i;
        this.LJLILLLLZI = enumC66006PvO;
        this.LJLJI = th;
        this.LJLJJI = str;
        this.LJLJJL = obj;
        this.LJLJJLL = str2;
        this.LJLJL = j;
        this.LJLJLJ = j2;
    }
}
