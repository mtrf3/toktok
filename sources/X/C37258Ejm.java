package X;

import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import kotlin.jvm.internal.o;

/* renamed from: X.Ejm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37258Ejm implements InterfaceC37126Ehe {
    public final /* synthetic */ IPluginService LJLIL;
    public final /* synthetic */ C67996QmO LJLILLLLZI;
    public final /* synthetic */ C37259Ejn LJLJI;

    @Override // X.InterfaceC37126Ehe
    public final void onSuccess(String packageName, boolean z) {
        o.LJIIIZ(packageName, "packageName");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VECodecDownloadTask -> VECodec plugin install success, packageName is ");
        LIZ.append(packageName);
        H78.LIZ(X1D.LIZIZ(LIZ));
        try {
            if (this.LJLIL.LIZJ() != null) {
                C37259Ejn c37259Ejn = this.LJLJI;
                C67996QmO c67996QmO = this.LJLILLLLZI;
                C37123Ehb.LJIIZILJ(packageName, true);
                C39647FhD.LIZLLL(c37259Ejn.LJI);
                c37259Ejn.LJIIJJI(c67996QmO);
            }
        } catch (Throwable th) {
            this.LJLILLLLZI.LJ(null, true);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("VECodecDownloadTask -> VECodec plugin onPluginInstallSuccess callback failed");
            LIZ2.append(th.getMessage());
            H78.LIZJ(X1D.LIZIZ(LIZ2));
        }
    }

    public C37258Ejm(IPluginService iPluginService, C67996QmO c67996QmO, C37259Ejn c37259Ejn) {
        this.LJLIL = iPluginService;
        this.LJLILLLLZI = c67996QmO;
        this.LJLJI = c37259Ejn;
    }

    @Override // X.InterfaceC37126Ehe
    public final void onFailed(String packageName, boolean z, int i) {
        o.LJIIIZ(packageName, "packageName");
        if (this.LJLIL.LIZJ() != null) {
            C37123Ehb.LJIIZILJ(packageName, false);
        }
        this.LJLILLLLZI.LJ(null, true);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VECodecDownloadTask -> VECodec plugin download failed, reason = ");
        LIZ.append(i);
        H78.LIZ(X1D.LIZIZ(LIZ));
    }
}
