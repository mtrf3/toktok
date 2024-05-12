package X;

import Y.ARunnableS25S0200000_6;
import android.text.TextUtils;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.concurrent.ThreadFactory;

/* renamed from: X.Ew6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class ThreadFactoryC38022Ew6 implements ThreadFactory {
    public final String LJLIL;
    public final int LJLILLLLZI;
    public final boolean LJLJI;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        PthreadThread pthreadThread = new PthreadThread(new ARunnableS25S0200000_6(this, runnable, 22), "BlockThreadPool$BlockThreadFactory");
        pthreadThread.setName(this.LJLIL);
        pthreadThread.setDaemon(this.LJLJI);
        return pthreadThread;
    }

    public ThreadFactoryC38022Ew6(String str, int i) {
        this.LJLIL = "block-thread";
        this.LJLILLLLZI = 10;
        if (!TextUtils.isEmpty(str)) {
            this.LJLIL = str;
        }
        this.LJLILLLLZI = i;
        this.LJLJI = false;
    }
}
