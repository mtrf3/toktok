package X;

import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.beauty.manager.BeautySource$sendRequest$1$handleEffectFetchResponseSuccess$1", f = "BeautySource.kt", l = {791}, m = "invokeSuspend")
/* renamed from: X.WkB, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83147WkB extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C68322mC LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ C83158WkM LJLJI;
    public final /* synthetic */ EffectChannelResponse LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83147WkB(C83158WkM c83158WkM, EffectChannelResponse effectChannelResponse, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c83158WkM;
        this.LJLJJI = effectChannelResponse;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C83147WkB(this.LJLJI, this.LJLJJI, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0219 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01e4 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v17, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v0, types: [T, java.util.ArrayList] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r48) {
        /*
            Method dump skipped, instructions count: 1078
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C83147WkB.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
