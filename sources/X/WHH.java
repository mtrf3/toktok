package X;

import android.content.Context;
import com.ss.android.ugc.aweme.editSticker.text.bean.OuterEffectTextLayoutConfig;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.editSticker.text.bean.EffectTextBean$parseEffectTextRes$2$1", f = "EffectTextBean.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class WHH extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ List<C157916Hr> LJLIL;
    public final /* synthetic */ C157776Hd LJLILLLLZI;
    public final /* synthetic */ OuterEffectTextLayoutConfig LJLJI;
    public final /* synthetic */ Context LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WHH(List<C157916Hr> list, C157776Hd c157776Hd, OuterEffectTextLayoutConfig outerEffectTextLayoutConfig, Context context, InterfaceC67352kd<? super WHH> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = list;
        this.LJLILLLLZI = c157776Hd;
        this.LJLJI = outerEffectTextLayoutConfig;
        this.LJLJJI = context;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new WHH(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x03a3, code lost:
    
        if (r6 == r40.getType()) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x021b, code lost:
    
        if (r8 == r25.getMode()) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0376  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r58) {
        /*
            Method dump skipped, instructions count: 1134
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WHH.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
