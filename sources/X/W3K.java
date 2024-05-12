package X;

import com.ss.android.ugc.aweme.sticker.panel.info.EffectInfoViewModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.sticker.panel.info.EffectInfoViewModel$processFavoritesClicked$2$1$1", f = "EffectInfoViewModel.kt", l = {258, 259}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class W3K extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ InterfaceC74443TJn LJLILLLLZI;
    public final /* synthetic */ Effect LJLJI;
    public final /* synthetic */ Boolean LJLJJI;
    public final /* synthetic */ EffectInfoViewModel LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W3K(EffectInfoViewModel effectInfoViewModel, InterfaceC74443TJn interfaceC74443TJn, Effect effect, Boolean bool, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = interfaceC74443TJn;
        this.LJLJI = effect;
        this.LJLJJI = bool;
        this.LJLJJL = effectInfoViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new W3K(this.LJLJJL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x001c, code lost:
    
        r0 = r6.LJIIIIZZ(X.EnumC74442TJm.PANEL, r11.LJLJI, kotlin.jvm.internal.o.LJ(r11.LJLJJI, java.lang.Boolean.TRUE));
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005f A[Catch: Exception -> 0x0081, TryCatch #0 {Exception -> 0x0081, blocks: (B:9:0x0054, B:10:0x0057, B:12:0x005f, B:14:0x0065, B:15:0x0068, B:16:0x006b, B:18:0x006f, B:20:0x0077, B:24:0x0035, B:25:0x0038, B:26:0x003a, B:30:0x0018, B:32:0x001c, B:34:0x002c), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f A[Catch: Exception -> 0x0081, TryCatch #0 {Exception -> 0x0081, blocks: (B:9:0x0054, B:10:0x0057, B:12:0x005f, B:14:0x0065, B:15:0x0068, B:16:0x006b, B:18:0x006f, B:20:0x0077, B:24:0x0035, B:25:0x0038, B:26:0x003a, B:30:0x0018, B:32:0x001c, B:34:0x002c), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0053 A[RETURN] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r11.LJLIL
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L15
            if (r0 == r3) goto L35
            if (r0 != r4) goto Ld
            goto L54
        Ld:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L15:
            X.C141335gf.LIZJ(r12)
            X.TJn r6 = r11.LJLILLLLZI     // Catch: java.lang.Exception -> L81
            if (r6 == 0) goto L3a
            com.ss.android.ugc.effectmanager.effect.model.Effect r5 = r11.LJLJI     // Catch: java.lang.Exception -> L81
            java.lang.Boolean r1 = r11.LJLJJI     // Catch: java.lang.Exception -> L81
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L81
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)     // Catch: java.lang.Exception -> L81
            X.SvC r0 = X.C74441TJl.LIZ(r6, r5, r0)     // Catch: java.lang.Exception -> L81
            if (r0 == 0) goto L3a
            r11.LJLIL = r3     // Catch: java.lang.Exception -> L81
            java.lang.Object r12 = X.C77318UWc.LIZ(r0, r11)     // Catch: java.lang.Exception -> L81
            if (r12 != r2) goto L38
            return r2
        L35:
            X.C141335gf.LIZJ(r12)     // Catch: java.lang.Exception -> L81
        L38:
            java.util.List r12 = (java.util.List) r12     // Catch: java.lang.Exception -> L81
        L3a:
            X.UtN r0 = X.C36636EZk.LIZ     // Catch: java.lang.Exception -> L81
            X.W3J r5 = new X.W3J     // Catch: java.lang.Exception -> L81
            X.TJn r7 = r11.LJLILLLLZI     // Catch: java.lang.Exception -> L81
            java.lang.Boolean r9 = r11.LJLJJI     // Catch: java.lang.Exception -> L81
            com.ss.android.ugc.aweme.sticker.panel.info.EffectInfoViewModel r6 = r11.LJLJJL     // Catch: java.lang.Exception -> L81
            com.ss.android.ugc.effectmanager.effect.model.Effect r8 = r11.LJLJI     // Catch: java.lang.Exception -> L81
            r10 = 0
            r5.<init>(r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L81
            r11.LJLIL = r4     // Catch: java.lang.Exception -> L81
            java.lang.Object r0 = X.XKX.LJI(r0, r5, r11)     // Catch: java.lang.Exception -> L81
            if (r0 != r2) goto L57
            return r2
        L54:
            X.C141335gf.LIZJ(r12)     // Catch: java.lang.Exception -> L81
        L57:
            com.ss.android.ugc.aweme.sticker.panel.info.EffectInfoViewModel r0 = r11.LJLJJL     // Catch: java.lang.Exception -> L81
            X.THX r2 = r0.Mv0()     // Catch: java.lang.Exception -> L81
            if (r2 == 0) goto L6b
            com.ss.android.ugc.effectmanager.effect.model.Effect r1 = r11.LJLJI     // Catch: java.lang.Exception -> L81
            java.lang.Boolean r0 = r11.LJLJJI     // Catch: java.lang.Exception -> L81
            if (r0 == 0) goto L68
            r0.booleanValue()     // Catch: java.lang.Exception -> L81
        L68:
            r2.LIZ(r1)     // Catch: java.lang.Exception -> L81
        L6b:
            java.lang.Boolean r0 = r11.LJLJJI     // Catch: java.lang.Exception -> L81
            if (r0 == 0) goto L89
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Exception -> L81
            r0 = r0 ^ 1
            if (r0 != r3) goto L89
            com.ss.android.ugc.aweme.sticker.panel.info.EffectInfoViewModel r0 = r11.LJLJJL     // Catch: java.lang.Exception -> L81
            X.1Fi<X.W2O> r1 = r0.LJLLLLLL     // Catch: java.lang.Exception -> L81
            X.W2R r0 = X.W2R.LIZ     // Catch: java.lang.Exception -> L81
            r1.LJI(r0)     // Catch: java.lang.Exception -> L81
            goto L89
        L81:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            X.H78.LIZJ(r0)
        L89:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W3K.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
