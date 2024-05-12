package X;

import android.content.Context;
import com.ss.android.ugc.aweme.services.external.ability.IAVEffectService;

/* renamed from: X.XVw, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84956XVw implements IAVEffectService.IAVEffectReadyCallback<InterfaceC84498XEg> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ java.util.Map<String, String> LJLILLLLZI;
    public final /* synthetic */ AbstractC73851Syd<C84768XOq> LJLJI;
    public final /* synthetic */ IAVEffectService LJLJJI;
    public final /* synthetic */ Context LJLJJL;
    public final /* synthetic */ InterfaceC73573Su9<C84767XOp> LJLJJLL;

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVEffectService.IAVEffectReadyCallback
    public final void finish(InterfaceC84498XEg interfaceC84498XEg) {
        InterfaceC84498XEg interfaceC84498XEg2 = interfaceC84498XEg;
        if (interfaceC84498XEg2 != null) {
            String str = this.LJLIL;
            java.util.Map<String, String> map = this.LJLILLLLZI;
            AbstractC73851Syd<C84768XOq> abstractC73851Syd = this.LJLJI;
            IAVEffectService iAVEffectService = this.LJLJJI;
            Context context = this.LJLJJL;
            InterfaceC73573Su9<C84767XOp> interfaceC73573Su9 = this.LJLJJLL;
            if (str != null) {
                interfaceC84498XEg2.LIZ(C47261Igj.LJJIJ(str), map, new C84957XVx(context, iAVEffectService, interfaceC73573Su9, abstractC73851Syd, str, map));
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
    }

    public C84956XVw(Context context, IAVEffectService iAVEffectService, C73433Srt c73433Srt, AbstractC73851Syd abstractC73851Syd, String str, java.util.Map map) {
        this.LJLIL = str;
        this.LJLILLLLZI = map;
        this.LJLJI = abstractC73851Syd;
        this.LJLJJI = iAVEffectService;
        this.LJLJJL = context;
        this.LJLJJLL = c73433Srt;
    }
}
