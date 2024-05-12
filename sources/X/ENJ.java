package X;

import com.ss.android.ugc.aweme.inbox.cache.PreloadManager;

/* loaded from: classes7.dex */
public final class ENJ implements InterfaceC36081EEb {
    @Override // X.InterfaceC36081EEb
    public final void LIZ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BootFinishCallBack - delay ");
        long j = PreloadManager.LJI;
        LIZ.append(j);
        LIZ.append(" ms");
        C221018lt.LJFF("PreloadManager", X1D.LIZIZ(LIZ));
        PreloadManager.LJ.postDelayed(ENK.LJLIL, j);
    }
}
