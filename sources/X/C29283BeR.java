package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.broadcast.guide.GuidanceSceneKt$performActionByScene$1$1", f = "GuidanceScene.kt", l = {92, 99, 109, 110, 115, 116, 122, 123}, m = "invokeSuspend")
/* renamed from: X.BeR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29283BeR extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public DataChannel LJLILLLLZI;
    public int LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ C29285BeT LJLJJL;
    public final /* synthetic */ DataChannel LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29283BeR(C29285BeT c29285BeT, DataChannel dataChannel, InterfaceC67352kd<? super C29283BeR> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJL = c29285BeT;
        this.LJLJJLL = dataChannel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C29283BeR c29283BeR = new C29283BeR(this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
        c29283BeR.LJLJJI = obj;
        return c29283BeR;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00d9, code lost:
    
        if (r14 == null) goto L34;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0005. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0109 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0125 A[RETURN] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29283BeR.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
