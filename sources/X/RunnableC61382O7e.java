package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;

/* renamed from: X.O7e, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class RunnableC61382O7e implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ Object LJLJI;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.LJLIL) {
            case 0:
                O7W o7w = (O7W) this.LJLJI;
                long min = Math.min(o7w.LLIFFJFJJ.LJIIIIZZ(), this.LJLILLLLZI);
                PthreadTimer pthreadTimer = o7w.LLIIIZ;
                if (pthreadTimer != null) {
                    pthreadTimer.cancel();
                }
                o7w.LLFF = min;
                int i = (int) (min / 1000);
                o7w.LLIIIL = i;
                o7w.LJLLLL.setText(o7w.LJI(i));
                o7w.LLIIII.removeMessages(1);
                o7w.LLIIII.sendEmptyMessageDelayed(1, o7w.LLFF);
                o7w.LLIIIZ = null;
                PthreadTimer pthreadTimer2 = new PthreadTimer("DASplashView2");
                o7w.LLIIIZ = pthreadTimer2;
                pthreadTimer2.scheduleAtFixedRate(new C61393O7p(o7w), (o7w.LLFF % 1000) + 1000, 1000L);
                return;
            default:
                C178406zM.LJIIL(this.LJLILLLLZI, (String) this.LJLJI);
                return;
        }
    }

    public /* synthetic */ RunnableC61382O7e(long j, int i, Object obj) {
        this.LJLIL = i;
        this.LJLJI = obj;
        this.LJLILLLLZI = j;
    }
}
