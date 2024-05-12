package X;

import com.bytedance.effectcreatormobile.objectselect.gif.GifsViewModel;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.effectcreatormobile.objectselect.gif.GifsViewModel$downloadGif$1", f = "GifsViewModel.kt", l = {99, 101, 102, 103, 106}, m = "invokeSuspend")
/* renamed from: X.alv, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94743alv extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public ProviderEffect LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ GifsViewModel LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ ProviderEffect LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94743alv(GifsViewModel gifsViewModel, int i, ProviderEffect providerEffect, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = gifsViewModel;
        this.LJLJJI = i;
        this.LJLJJL = providerEffect;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94743alv(this.LJLJI, this.LJLJJI, this.LJLJJL, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061 A[Catch: Exception -> 0x0084, TryCatch #0 {Exception -> 0x0084, blocks: (B:15:0x001c, B:17:0x0072, B:18:0x0075, B:22:0x0059, B:23:0x005c, B:25:0x0061, B:30:0x0048, B:32:0x004e), top: B:2:0x000a }] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r10.LJLILLLLZI
            r5 = 0
            r4 = 5
            r6 = 4
            r7 = 3
            r8 = 2
            r9 = 1
            if (r0 == 0) goto L27
            if (r0 == r9) goto L23
            if (r0 == r8) goto L59
            if (r0 == r7) goto L20
            if (r0 == r6) goto L1c
            if (r0 != r4) goto L95
            X.C141335gf.LIZJ(r11)
        L19:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L1c:
            X.C141335gf.LIZJ(r11)     // Catch: java.lang.Exception -> L84
            goto L19
        L20:
            com.ss.android.ugc.effectmanager.effect.model.ProviderEffect r8 = r10.LJLIL
            goto L72
        L23:
            X.C141335gf.LIZJ(r11)
            goto L48
        L27:
            X.C141335gf.LIZJ(r11)
            com.bytedance.effectcreatormobile.objectselect.gif.GifsViewModel r0 = r10.LJLJI
            X.XLM r0 = r0.LJLJI
            java.lang.Object r0 = r0.getValue()
            boolean r0 = r0 instanceof X.C94060aau
            if (r0 != 0) goto L39
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L39:
            com.bytedance.effectcreatormobile.objectselect.gif.GifsViewModel r2 = r10.LJLJI
            int r1 = r10.LJLJJI
            X.aQW r0 = X.EnumC93416aQW.Loading
            r10.LJLILLLLZI = r9
            X.UCe r0 = r2.hv0(r1, r5, r0)
            if (r0 != r3) goto L48
            return r3
        L48:
            com.bytedance.effectcreatormobile.ckeapi.api.objectselect.GifRepository r1 = X.C93817aWz.LIZ()     // Catch: java.lang.Exception -> L84
            if (r1 == 0) goto L19
            com.ss.android.ugc.effectmanager.effect.model.ProviderEffect r0 = r10.LJLJJL     // Catch: java.lang.Exception -> L84
            r10.LJLILLLLZI = r8     // Catch: java.lang.Exception -> L84
            java.lang.Object r11 = r1.downloadGif(r0, r10)     // Catch: java.lang.Exception -> L84
            if (r11 != r3) goto L5c
            goto L9d
        L59:
            X.C141335gf.LIZJ(r11)     // Catch: java.lang.Exception -> L84
        L5c:
            r8 = r11
            com.ss.android.ugc.effectmanager.effect.model.ProviderEffect r8 = (com.ss.android.ugc.effectmanager.effect.model.ProviderEffect) r8     // Catch: java.lang.Exception -> L84
            if (r8 == 0) goto L19
            com.bytedance.effectcreatormobile.objectselect.gif.GifsViewModel r2 = r10.LJLJI     // Catch: java.lang.Exception -> L84
            int r1 = r10.LJLJJI     // Catch: java.lang.Exception -> L84
            X.aQW r0 = X.EnumC93416aQW.Success     // Catch: java.lang.Exception -> L84
            r10.LJLIL = r8     // Catch: java.lang.Exception -> L84
            r10.LJLILLLLZI = r7     // Catch: java.lang.Exception -> L84
            X.UCe r0 = r2.hv0(r1, r8, r0)     // Catch: java.lang.Exception -> L84
            if (r0 != r3) goto L75
            goto L9e
        L72:
            X.C141335gf.LIZJ(r11)     // Catch: java.lang.Exception -> L84
        L75:
            com.bytedance.effectcreatormobile.objectselect.gif.GifsViewModel r0 = r10.LJLJI     // Catch: java.lang.Exception -> L84
            X.XLL r0 = r0.LJLJLLL     // Catch: java.lang.Exception -> L84
            r10.LJLIL = r5     // Catch: java.lang.Exception -> L84
            r10.LJLILLLLZI = r6     // Catch: java.lang.Exception -> L84
            java.lang.Object r0 = r0.emit(r8, r10)     // Catch: java.lang.Exception -> L84
            if (r0 != r3) goto L19
            goto L9f
        L84:
            com.bytedance.effectcreatormobile.objectselect.gif.GifsViewModel r2 = r10.LJLJI
            int r1 = r10.LJLJJI
            X.aQW r0 = X.EnumC93416aQW.Fail
            r10.LJLIL = r5
            r10.LJLILLLLZI = r4
            X.UCe r0 = r2.hv0(r1, r5, r0)
            if (r0 != r3) goto L19
            return r3
        L95:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L9d:
            return r3
        L9e:
            return r3
        L9f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94743alv.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
