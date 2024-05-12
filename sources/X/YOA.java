package X;

import Y.ARunnableS51S0100000_15;
import com.ss.android.ttve.nativePort.TEReverseCallback;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import com.ss.android.vesdk.VEEditor;
import com.ss.android.vesdk.runtime.VEEditorResManager;

/* loaded from: classes16.dex */
public final class YOA implements InterfaceC133905Ni {
    public final /* synthetic */ VEEditor LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI = true;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ TEReverseCallback LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ VEEditorResManager LJLJL;
    public final /* synthetic */ YOW LJLJLJ;

    @Override // X.InterfaceC133905Ni
    public final void LIZ(int i, int i2, float f, String str) {
        boolean z;
        if (i != 4103) {
            if (i != 4105) {
                return;
            }
            this.LJLJJL.onProgressChanged(f * 0.5d);
            return;
        }
        VEEditor vEEditor = this.LJLIL;
        synchronized (vEEditor) {
            if (vEEditor.LLIIII.getNativeHandler() != 0) {
                z = true;
            } else {
                z = false;
            }
        }
        if (!z) {
            return;
        }
        if (this.LJLILLLLZI) {
            TEVideoUtils.nativeReverseAllIVideo2(this.LJLJI, this.LJLJJI, this.LJLJJL);
        } else {
            TEVideoUtils.nativeReverseAllIFrameVideoAndMuxAudio2(this.LJLJI, this.LJLJJLL, this.LJLJJI, this.LJLJJL);
        }
        new PthreadThread(new ARunnableS51S0100000_15(this, 55), "k/VEEditor$11").start();
    }

    public YOA(VEEditor vEEditor, String str, String str2, TEReverseCallback tEReverseCallback, String str3, VEEditorResManager vEEditorResManager, YOW yow) {
        this.LJLIL = vEEditor;
        this.LJLJI = str;
        this.LJLJJI = str2;
        this.LJLJJL = tEReverseCallback;
        this.LJLJJLL = str3;
        this.LJLJL = vEEditorResManager;
        this.LJLJLJ = yow;
    }
}
