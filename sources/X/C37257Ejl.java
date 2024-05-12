package X;

import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import kotlin.jvm.internal.o;

/* renamed from: X.Ejl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37257Ejl implements InterfaceC37126Ehe {
    public final /* synthetic */ InterfaceC88472Yns<Boolean, C76800UCe> LJLIL;

    /* JADX WARN: Multi-variable type inference failed */
    public C37257Ejl(InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        this.LJLIL = interfaceC88472Yns;
    }

    @Override // X.InterfaceC37126Ehe
    public final void onSuccess(String name, boolean z) {
        o.LJIIIZ(name, "name");
        IPluginService iPluginService = C37256Ejk.LIZIZ;
        if (iPluginService.LIZJ() != null) {
            C39647FhD.LIZLLL(EF7.LIZIZ());
        }
        InterfaceC88472Yns<Boolean, C76800UCe> interfaceC88472Yns = this.LJLIL;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Boolean.TRUE);
        }
        iPluginService.LIZJ().getClass();
        C37123Ehb.LJIIZILJ("com.ss.android.ugc.aweme.df_pipo_bnpl", true);
    }

    @Override // X.InterfaceC37126Ehe
    public final void onFailed(String str, boolean z, int i) {
        InterfaceC88472Yns<Boolean, C76800UCe> interfaceC88472Yns = this.LJLIL;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Boolean.FALSE);
        }
        C37256Ejk.LIZIZ.LIZJ().getClass();
        C37123Ehb.LJIIZILJ("com.ss.android.ugc.aweme.df_pipo_bnpl", false);
    }
}
