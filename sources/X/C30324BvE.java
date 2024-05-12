package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.broadcast.guide.GuidanceViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.broadcast.guide.GuidanceViewModel$attach$1", f = "GuidanceViewModel.kt", l = {117}, m = "invokeSuspend")
/* renamed from: X.BvE, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30324BvE extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ GuidanceViewModel LJLILLLLZI;
    public final /* synthetic */ DataChannel LJLJI;
    public final /* synthetic */ LifecycleOwner LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30324BvE(GuidanceViewModel guidanceViewModel, DataChannel dataChannel, LifecycleOwner lifecycleOwner, InterfaceC67352kd<? super C30324BvE> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = guidanceViewModel;
        this.LJLJI = dataChannel;
        this.LJLJJI = lifecycleOwner;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C30324BvE(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0103, code lost:
    
        if (1 != 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00fe, code lost:
    
        if (1 != 0) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fb  */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, X.0px, O] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 521
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30324BvE.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
