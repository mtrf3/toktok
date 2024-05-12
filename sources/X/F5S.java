package X;

import com.bytedance.bdlocation.df.ILocationPluginInstallListener;

/* loaded from: classes7.dex */
public final class F5S implements InterfaceC37126Ehe {
    public final /* synthetic */ ILocationPluginInstallListener LJLIL;

    public F5S(ILocationPluginInstallListener iLocationPluginInstallListener) {
        this.LJLIL = iLocationPluginInstallListener;
    }

    @Override // X.InterfaceC37126Ehe
    public final void onSuccess(String str, boolean z) {
        StringBuilder LIZIZ = C25620zW.LIZIZ("install onSuccess >>packageName ", str, "  listener>>");
        LIZIZ.append(this.LJLIL);
        C221018lt.LIZ("LocationPluginService", X1D.LIZIZ(LIZIZ));
        ILocationPluginInstallListener iLocationPluginInstallListener = this.LJLIL;
        if (iLocationPluginInstallListener != null) {
            iLocationPluginInstallListener.onSuccess(str, z);
        }
    }

    @Override // X.InterfaceC37126Ehe
    public final void onFailed(String str, boolean z, int i) {
        StringBuilder LJ = AnonymousClass028.LJ("install onFailed >>packageName ", str, "  >> reason ", i, "  listener>>");
        LJ.append(this.LJLIL);
        C221018lt.LIZ("LocationPluginService", X1D.LIZIZ(LJ));
        ILocationPluginInstallListener iLocationPluginInstallListener = this.LJLIL;
        if (iLocationPluginInstallListener != null) {
            iLocationPluginInstallListener.onFailed(str, z, i);
        }
    }
}
