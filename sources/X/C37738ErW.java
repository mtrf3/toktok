package X;

import android.content.Context;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import kotlin.jvm.internal.o;

/* renamed from: X.ErW, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37738ErW implements InterfaceC37126Ehe {
    public final /* synthetic */ IPluginService LJLIL;
    public final /* synthetic */ Context LJLILLLLZI;

    @Override // X.InterfaceC37126Ehe
    public final void onFailed(String packageName, boolean z, int i) {
        o.LJIIIZ(packageName, "packageName");
    }

    public C37738ErW(IPluginService iPluginService, Context context) {
        this.LJLIL = iPluginService;
        this.LJLILLLLZI = context;
    }

    @Override // X.InterfaceC37126Ehe
    public final void onSuccess(String packageName, boolean z) {
        o.LJIIIZ(packageName, "packageName");
        try {
            if (this.LJLIL.LIZJ() != null) {
                C39647FhD.LIZLLL(this.LJLILLLLZI);
                C39647FhD.LJ(this.LJLILLLLZI);
                try {
                    C16880lQ.LLJJJIL("v8_libfull.cr");
                } catch (Throwable unused) {
                }
                try {
                    C16880lQ.LLJJJIL("napi_v8");
                } catch (Throwable unused2) {
                }
                C16880lQ.LLJJJIL("lynx_v8_bridge");
            }
        } catch (Throwable unused3) {
        }
    }
}
