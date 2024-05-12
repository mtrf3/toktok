package X;

import Y.ARunnableS51S0100000_15;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import com.ss.android.vesdk.VEEditor;

/* loaded from: classes16.dex */
public final class YOM implements InterfaceC133905Ni {
    public final /* synthetic */ VEEditor LJLIL;
    public final /* synthetic */ YOW LJLILLLLZI;

    public YOM(VEEditor vEEditor, YOW yow) {
        this.LJLIL = vEEditor;
        this.LJLILLLLZI = yow;
    }

    @Override // X.InterfaceC133905Ni
    public final void LIZ(int i, int i2, float f, String str) {
        new PthreadThread(new ARunnableS51S0100000_15(this, 56), "k/VEEditor$12").start();
    }
}
