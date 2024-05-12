package X;

import com.ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import kotlin.jvm.internal.o;

/* renamed from: X.XVy, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84958XVy implements IAVEffectService.IAVEffectReadyCallback<InterfaceC84498XEg> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ java.util.Map<String, String> LJLILLLLZI;
    public final /* synthetic */ AbstractC73851Syd<C84768XOq> LJLJI;
    public final /* synthetic */ InterfaceC73573Su9<C84767XOp> LJLJJI;

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVEffectService.IAVEffectReadyCallback
    public final void finish(InterfaceC84498XEg interfaceC84498XEg) {
        InterfaceC84498XEg interfaceC84498XEg2 = interfaceC84498XEg;
        if (interfaceC84498XEg2 != null) {
            String str = this.LJLIL;
            java.util.Map<String, String> map = this.LJLILLLLZI;
            AbstractC73851Syd<C84768XOq> abstractC73851Syd = this.LJLJI;
            InterfaceC73573Su9<C84767XOp> interfaceC73573Su9 = this.LJLJJI;
            o.LJI(str);
            interfaceC84498XEg2.LJ(C47261Igj.LJJIJ(str), false, map, new XW0(abstractC73851Syd, interfaceC73573Su9));
        }
    }

    public C84958XVy(String str, java.util.Map map, AbstractC73851Syd abstractC73851Syd, C73433Srt c73433Srt) {
        this.LJLIL = str;
        this.LJLILLLLZI = map;
        this.LJLJI = abstractC73851Syd;
        this.LJLJJI = c73433Srt;
    }
}
