package com.bytedance.android.livesdk.i18n;

import X.AbstractC73672Svk;
import X.C0NB;
import X.C16880lQ;
import X.C28467BFf;
import X.C73411SrX;
import X.C73969T1h;
import X.E8L;
import X.InterfaceC64986Pew;
import X.Q7L;
import X.T16;
import X.X1D;
import X.Y80;
import X.Y86;
import Y.AfS67S0100000_15;
import Y.IDCallbackS369S0100000_15;
import Y.IDaS224S0100000_15;
import android.os.Handler;
import android.os.SystemClock;

/* loaded from: classes16.dex */
public final class I18nUpdateManager {
    public static final long[] LJIIIIZZ = {3000, 6000, 9000, 60000, 60000, 60000, 600000};
    public static final I18nApi LJIIIZ = (I18nApi) Q7L.LIZIZ(I18nApi.class);
    public final String LIZ;
    public final Handler LIZIZ;
    public Y86 LIZJ;
    public boolean LIZLLL;
    public int LJ;
    public long LJFF;
    public long LJI;
    public C73411SrX LJII;

    /* loaded from: classes14.dex */
    public interface I18nApi {
        @E8L("/webcast/setting/i18n/package/")
        AbstractC73672Svk<C28467BFf<I18nApiResult>> update(@InterfaceC64986Pew("locale") String str, @InterfaceC64986Pew("cur_version") long j);
    }

    public final void LIZ(Throwable th) {
        long j;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("update on error: ");
        LIZ.append(th.toString());
        C0NB.LJ("i18n_translation", X1D.LIZIZ(LIZ));
        int i = this.LJ + 1;
        this.LJ = i;
        Handler handler = this.LIZIZ;
        long[] jArr = LJIIIIZZ;
        if (i >= 7 || i < 0) {
            j = jArr[6];
        } else {
            j = jArr[i];
        }
        handler.sendEmptyMessageDelayed(0, j);
    }

    public final void LIZIZ(long j) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("update is called, current version is ");
        LIZ.append(j);
        C0NB.LIZIZ("i18n_translation", X1D.LIZIZ(LIZ));
        if (this.LIZLLL || this.LIZIZ.hasMessages(0)) {
            if (this.LIZLLL) {
                C0NB.LIZIZ("i18n_translation", "now is downloading, quit update");
                return;
            } else {
                C0NB.LIZIZ("i18n_translation", "now is waiting for retry, quit update");
                return;
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = this.LJFF;
        if (elapsedRealtime > j2 && elapsedRealtime - j2 < 60000) {
            C0NB.LIZIZ("i18n_translation", "in freeze time, quit update");
            return;
        }
        this.LJI = j;
        this.LIZLLL = true;
        try {
            this.LJII = (C73411SrX) LJIIIZ.update(this.LIZ, j).LJJJ(C73969T1h.LIZIZ()).LJJL(T16.LIZ()).LJJJLL(new AfS67S0100000_15(this, 14), new AfS67S0100000_15(this, 15), new IDaS224S0100000_15(this, 2));
        } catch (Throwable th) {
            C0NB.LJI("I18nUpdateManager", th);
        }
    }

    public I18nUpdateManager(String str, Y80 y80) {
        IDCallbackS369S0100000_15 iDCallbackS369S0100000_15 = new IDCallbackS369S0100000_15(this, 0);
        this.LJII = null;
        this.LIZ = str;
        this.LIZJ = y80;
        this.LIZIZ = new Handler(C16880lQ.LLJJJJ(), iDCallbackS369S0100000_15);
    }
}
