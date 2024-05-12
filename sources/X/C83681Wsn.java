package X;

import Y.ARunnableS18S0101000_14;
import android.os.Handler;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import kotlin.jvm.internal.o;

/* renamed from: X.Wsn, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83681Wsn implements InterfaceC83707WtD {
    public final Handler LIZ;
    public final InterfaceC83707WtD LIZIZ;

    @Override // X.InterfaceC83707WtD
    public final void LIZ(int i) {
        this.LIZ.post(new ARunnableS18S0101000_14(i, this, 9));
    }

    @Override // X.InterfaceC83707WtD
    public final void LIZIZ(int i) {
        this.LIZIZ.LIZIZ(i);
    }

    public C83681Wsn(SafeHandler mHandler, C83594WrO c83594WrO) {
        o.LJIIIZ(mHandler, "mHandler");
        this.LIZ = mHandler;
        this.LIZIZ = c83594WrO;
    }
}
