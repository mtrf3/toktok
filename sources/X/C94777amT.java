package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorEnableInnerBeautyMaxValue;
import com.bytedance.effectcreatormobile.resource.ep.impl.DefaultResourceProvider;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.effectcreatormobile.resource.ep.impl.DefaultResourceProvider$panelFetch$1", f = "DefaultResourceProvider.kt", l = {80, 81, 82, 83, 84, LiveAnchorEnableInnerBeautyMaxValue.DEFAULT}, m = "invokeSuspend")
/* renamed from: X.amT, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94777amT extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public EffectChannelResponse LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ DefaultResourceProvider LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ AbstractC94465ahR LJLJJL;
    public final /* synthetic */ InterfaceC93663aUV LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94777amT(DefaultResourceProvider defaultResourceProvider, String str, AbstractC94465ahR abstractC94465ahR, InterfaceC93663aUV interfaceC93663aUV, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = defaultResourceProvider;
        this.LJLJJI = str;
        this.LJLJJL = abstractC94465ahR;
        this.LJLJJLL = interfaceC93663aUV;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94777amT(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
    
        if (r7 != null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0087, code lost:
    
        if (r0 != null) goto L38;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d A[RETURN] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r8.LJLILLLLZI
            r5 = 0
            r3 = 0
            switch(r0) {
                case 0: goto L11;
                case 1: goto L22;
                case 2: goto L3c;
                case 3: goto L51;
                case 4: goto L69;
                case 5: goto L82;
                case 6: goto L9e;
                default: goto L9;
            }
        L9:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L11:
            X.C141335gf.LIZJ(r9)
            com.bytedance.effectcreatormobile.resource.ep.impl.DefaultResourceProvider r2 = r8.LJLJI
            java.lang.String r1 = r8.LJLJJI
            r0 = 1
            r8.LJLILLLLZI = r0
            java.lang.Object r9 = r2.fetchEffectListFromCache(r1, r8)
            if (r9 != r4) goto L25
            return r4
        L22:
            X.C141335gf.LIZJ(r9)
        L25:
            r7 = r9
            com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse r7 = (com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse) r7
            if (r7 == 0) goto L59
            com.bytedance.effectcreatormobile.resource.ep.impl.DefaultResourceProvider r6 = r8.LJLJI
            X.ahR r2 = r8.LJLJJL
            X.aUV r1 = r8.LJLJJLL
            r8.LJLIL = r7
            r0 = 2
            r8.LJLILLLLZI = r0
            java.lang.Object r0 = r6.onFetchPanelSuccess(r2, r1, r7, r8)
            if (r0 != r4) goto L41
            return r4
        L3c:
            com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse r7 = r8.LJLIL
            X.C141335gf.LIZJ(r9)
        L41:
            com.bytedance.effectcreatormobile.resource.ep.impl.DefaultResourceProvider r2 = r8.LJLJI
            java.lang.String r1 = r8.LJLJJI
            r8.LJLIL = r7
            r0 = 3
            r8.LJLILLLLZI = r0
            java.lang.Object r0 = r2.fetchEffectList(r1, r5, r8)
            if (r0 != r4) goto L56
            return r4
        L51:
            com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse r7 = r8.LJLIL
            X.C141335gf.LIZJ(r9)
        L56:
            if (r7 == 0) goto L59
            goto La1
        L59:
            com.bytedance.effectcreatormobile.resource.ep.impl.DefaultResourceProvider r2 = r8.LJLJI
            java.lang.String r1 = r8.LJLJJI
            r8.LJLIL = r3
            r0 = 4
            r8.LJLILLLLZI = r0
            java.lang.Object r9 = r2.fetchEffectList(r1, r5, r8)
            if (r9 != r4) goto L6c
            return r4
        L69:
            X.C141335gf.LIZJ(r9)
        L6c:
            com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse r9 = (com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse) r9
            if (r9 == 0) goto L8a
            com.bytedance.effectcreatormobile.resource.ep.impl.DefaultResourceProvider r3 = r8.LJLJI
            X.ahR r2 = r8.LJLJJL
            X.aUV r1 = r8.LJLJJLL
            r8.LJLIL = r9
            r0 = 5
            r8.LJLILLLLZI = r0
            java.lang.Object r0 = r3.onFetchPanelSuccess(r2, r1, r9, r8)
            if (r0 != r4) goto La1
            return r4
        L82:
            com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse r0 = r8.LJLIL
            X.C141335gf.LIZJ(r9)
            if (r0 == 0) goto L8a
            goto La1
        L8a:
            X.UtN r2 = X.C36636EZk.LIZ
            X.amS r1 = new X.amS
            r1.<init>(r8, r3)
            r8.LJLIL = r3
            r0 = 6
            r8.LJLILLLLZI = r0
            java.lang.Object r0 = X.XKX.LJI(r2, r1, r8)
            if (r0 != r4) goto La1
            return r4
        L9e:
            X.C141335gf.LIZJ(r9)
        La1:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94777amT.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
