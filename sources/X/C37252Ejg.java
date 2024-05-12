package X;

import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import kotlin.jvm.internal.o;

/* renamed from: X.Ejg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37252Ejg implements InterfaceC37126Ehe {
    public final /* synthetic */ IPluginService LJLIL;

    public C37252Ejg(IPluginService iPluginService) {
        this.LJLIL = iPluginService;
    }

    @Override // X.InterfaceC37126Ehe
    public final void onSuccess(String packageName, boolean z) {
        o.LJIIIZ(packageName, "packageName");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Bytevc1enc8Plugin -> plugin install success, packageName=");
        LIZ.append(packageName);
        H7B.LIZ(X1D.LIZIZ(LIZ));
        if (this.LJLIL.LIZJ() != null) {
            C37123Ehb.LJIIZILJ(packageName, true);
        }
    }

    @Override // X.InterfaceC37126Ehe
    public final void onFailed(String packageName, boolean z, int i) {
        o.LJIIIZ(packageName, "packageName");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Bytevc1enc8Plugin -> plugin download failed, packageName=");
        LIZ.append(packageName);
        LIZ.append(", reason = ");
        LIZ.append(i);
        H7B.LIZ(X1D.LIZIZ(LIZ));
        if (this.LJLIL.LIZJ() != null) {
            C37123Ehb.LJIIZILJ(packageName, false);
        }
    }
}
