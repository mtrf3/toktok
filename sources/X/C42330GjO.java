package X;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.GjO, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42330GjO implements WMD {
    public final String LIZ = AnonymousClass629.LIZ("randomUUID().toString()");
    public final String LIZIZ = AnonymousClass629.LIZ("randomUUID().toString()");
    public String LIZJ;
    public String LIZLLL;

    @Override // X.WMD
    public final void LJIIZILJ() {
        java.util.Map<String, Bundle> map = C59122Ts.LIZ;
        C65777Prh.LIZJ(map).remove(this.LIZJ);
        ((HashMap) map).remove(this.LIZ);
        String str = this.LIZJ;
        String str2 = this.LIZLLL;
        ExecutorService executorService = C42331GjP.LIZJ;
        executorService.execute(new RunnableC42332GjQ(str, str2));
        executorService.execute(new RunnableC42332GjQ(this.LIZ, this.LIZIZ));
    }

    @Override // X.WMD
    public final Bundle onRestoreInstanceState(Bundle bundle) {
        String string;
        Bundle LJFF;
        String string2 = bundle.getString("Key_TikTokCTSceneStateSaveStrategy_Scene");
        if (string2 == null || (string = bundle.getString("Key_TikTokCTSceneStateSaveStrategy_Verify")) == null) {
            return null;
        }
        this.LIZJ = string2;
        this.LIZLLL = string;
        Bundle bundle2 = (Bundle) ((HashMap) C59122Ts.LIZ).get(string2);
        if (bundle2 != null) {
            return bundle2;
        }
        C42336GjU c42336GjU = C42331GjP.LIZ;
        c42336GjU.getClass();
        if (!c42336GjU.LIZLLL().getBoolean(string, false)) {
            return null;
        }
        byte[] LJ = c42336GjU.LJ(string2);
        if (LJ.length == 0 || (LJFF = C78934UyQ.LJFF(LJ)) == null || LJFF.size() <= 0) {
            return null;
        }
        return LJFF;
    }

    @Override // X.WMD
    public final void LJIJ(Bundle hostOutState, Bundle bundle) {
        o.LJIIIZ(hostOutState, "hostOutState");
        if (!hostOutState.containsKey("Key_TikTokCTSceneStateSaveStrategy_Scene") && !hostOutState.containsKey("Key_TikTokCTSceneStateSaveStrategy_Verify")) {
            hostOutState.putString("Key_TikTokCTSceneStateSaveStrategy_Scene", this.LIZ);
            hostOutState.putString("Key_TikTokCTSceneStateSaveStrategy_Verify", this.LIZIZ);
            ((HashMap) C59122Ts.LIZ).put(this.LIZ, bundle);
            String uuid = this.LIZ;
            String verifyId = this.LIZIZ;
            o.LJIIIZ(uuid, "uuid");
            o.LJIIIZ(verifyId, "verifyId");
            byte[] LJJIII = C78934UyQ.LJJIII(bundle);
            if (LJJIII.length == 0) {
                return;
            }
            RunnableC42329GjN runnableC42329GjN = new RunnableC42329GjN(uuid, System.currentTimeMillis(), null, verifyId, LJJIII);
            if (C42331GjP.LIZLLL.getCount() == 0) {
                C42331GjP.LIZLLL = new CountDownLatch(1);
            }
            ((ArrayList) C42331GjP.LIZIZ).add(runnableC42329GjN);
            C42331GjP.LIZJ.execute(runnableC42329GjN);
            if (!C84763XOl.LJIIJJI) {
                return;
            }
            try {
                C42331GjP.LIZLLL.await(2000L, TimeUnit.MILLISECONDS);
                return;
            } catch (InterruptedException e) {
                C16880lQ.LLLLIIL(e);
                return;
            }
        }
        throw new IllegalStateException("Host have multi scene environment");
    }
}
