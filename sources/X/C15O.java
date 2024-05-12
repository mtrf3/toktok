package X;

import com.ss.ttlivestreamer.core.utils.SafeHandlerThreadPoolExecutor;

/* renamed from: X.15O, reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class C15O implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ Object LJLJI;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.LJLIL) {
            case 0:
                AbstractC534928b abstractC534928b = (AbstractC534928b) this.LJLJI;
                ((C43431n9) abstractC534928b.LJLIL).setLayoutType(this.LJLILLLLZI);
                return;
            default:
                SafeHandlerThreadPoolExecutor.LIZ(this.LJLILLLLZI, (String) this.LJLJI);
                return;
        }
    }

    public /* synthetic */ C15O(int i, int i2, Object obj) {
        this.LJLIL = i2;
        this.LJLJI = obj;
        this.LJLILLLLZI = i;
    }
}
