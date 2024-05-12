package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.gift.base.platform.core.sendv2.presend.PreSendGiftChecker$incomingSendGift$1", f = "PreSendGiftChecker.kt", l = {LiveBroadcastTaskResourceIdSetting.DEFAULT, 47}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class UVI extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ UVV LJLILLLLZI;
    public final /* synthetic */ C32816CuK LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UVI(UVV uvv, C32816CuK c32816CuK, InterfaceC67352kd<? super UVI> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = uvv;
        this.LJLJI = c32816CuK;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new UVI(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0099 A[Catch: Exception -> 0x00f4, TryCatch #0 {Exception -> 0x00f4, blocks: (B:9:0x008e, B:10:0x0091, B:12:0x0099, B:15:0x00bc, B:16:0x0052, B:17:0x0055, B:19:0x005d, B:20:0x0081, B:24:0x001c), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00bc A[Catch: Exception -> 0x00f4, TRY_LEAVE, TryCatch #0 {Exception -> 0x00f4, blocks: (B:9:0x008e, B:10:0x0091, B:12:0x0099, B:15:0x00bc, B:16:0x0052, B:17:0x0055, B:19:0x005d, B:20:0x0081, B:24:0x001c), top: B:2:0x000a }] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UVI.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
