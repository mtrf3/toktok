package X;

import Y.ARunnableS11S0201000_8;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import defpackage.i0;
import java.util.concurrent.ThreadFactory;

/* renamed from: X.CXu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ThreadFactoryC31498CXu implements ThreadFactory {
    public static final /* synthetic */ int LJLILLLLZI = 0;
    public final String LJLIL;

    static {
        C16880lQ.LJLLJ(ThreadFactoryC31498CXu.class);
    }

    public ThreadFactoryC31498CXu(String str) {
        this.LJLIL = i0.LJFF("ttnet-", str);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new PthreadThread(new ARunnableS11S0201000_8(1, this, runnable, 5), this.LJLIL);
    }
}
