package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.sticker.core.ChangeAvatarCreateInfoStickerUtils$fetchAvatarInfoSticker$2$1$onSuccess$1", f = "ChangeAvatarCreateInfoStickerUtils.kt", l = {C61447O9r.LJIIJ}, m = "invokeSuspend")
/* renamed from: X.5ZI, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5ZI extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public int LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ EffectChannelResponse LJLJJI;
    public final /* synthetic */ InterfaceC67352kd<List<? extends OSZ<C121514pn, ? extends Effect>>> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C5ZI(EffectChannelResponse effectChannelResponse, InterfaceC67352kd<? super List<? extends OSZ<C121514pn, ? extends Effect>>> interfaceC67352kd, InterfaceC67352kd<? super C5ZI> interfaceC67352kd2) {
        super(2, interfaceC67352kd2);
        this.LJLJJI = effectChannelResponse;
        this.LJLJJL = interfaceC67352kd;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C5ZI c5zi = new C5ZI(this.LJLJJI, this.LJLJJL, interfaceC67352kd);
        c5zi.LJLJI = obj;
        return c5zi;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x009d, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0032 -> B:5:0x0015). Please report as a decompilation issue!!! */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            X.NAu r7 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r9.LJLILLLLZI
            r6 = 1
            r5 = 0
            if (r0 == 0) goto L35
            if (r0 != r6) goto L89
            java.lang.Object r2 = r9.LJLIL
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r1 = r9.LJLJI
            java.util.Collection r1 = (java.util.Collection) r1
            X.C141335gf.LIZJ(r10)
        L15:
            if (r10 == 0) goto L1a
            r1.add(r10)
        L1a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L91
            java.lang.Object r0 = r2.next()
            X.2mE r0 = (X.InterfaceC68342mE) r0
            if (r0 == 0) goto L1a
            r9.LJLJI = r1
            r9.LJLIL = r2
            r9.LJLILLLLZI = r6
            java.lang.Object r10 = r0.LJI(r9)
            if (r10 != r7) goto L15
            return r7
        L35:
            X.C141335gf.LIZJ(r10)
            java.lang.Object r8 = r9.LJLJI
            X.2pa r8 = (X.InterfaceC70422pa) r8
            com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse r0 = r9.LJLJJI
            if (r0 == 0) goto L9f
            java.util.List r1 = r0.getCategoryResponseList()
            if (r1 == 0) goto L9f
            java.util.ArrayList r4 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C32I.LJJL(r1, r0)
            r4.<init>(r0)
            java.util.Iterator r3 = r1.iterator()
        L55:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L7f
            java.lang.Object r2 = r3.next()
            com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse r2 = (com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse) r2
            java.util.List r1 = r2.getTotalEffects()
            X.V0R r0 = X.V0Q.Default
            java.lang.Object r0 = X.ORZ.LLIIL(r1, r0)
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = (com.ss.android.ugc.effectmanager.effect.model.Effect) r0
            if (r0 == 0) goto L7d
            X.5ZF r1 = new X.5ZF
            r1.<init>(r2, r0, r5)
            r0 = 3
            X.XKn r0 = X.XKX.LIZIZ(r8, r5, r5, r1, r0)
        L79:
            r4.add(r0)
            goto L55
        L7d:
            r0 = r5
            goto L79
        L7f:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r4.iterator()
            goto L1a
        L89:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L91:
            if (r1 == 0) goto L9f
            X.2kd<java.util.List<? extends X.OSZ<X.4pn, ? extends com.ss.android.ugc.effectmanager.effect.model.Effect>>> r0 = r9.LJLJJL
            X.C3C5.m7constructorimpl(r1)
            r0.resumeWith(r1)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto La9
        L9f:
            X.2kd<java.util.List<? extends X.OSZ<X.4pn, ? extends com.ss.android.ugc.effectmanager.effect.model.Effect>>> r1 = r9.LJLJJL
            X.OQg r0 = X.C61878OQg.INSTANCE
            X.C3C5.m7constructorimpl(r0)
            r1.resumeWith(r0)
        La9:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5ZI.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
