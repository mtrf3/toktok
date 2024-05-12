package X;

import com.bytedance.android.livesdk.livesetting.other.subscribe_enhance.SubscriptionExpireRemindHourSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommercelive.business.common.room.PreviewBagHelper$previewBag$2", f = "PreviewBagHelper.kt", l = {57, SubscriptionExpireRemindHourSetting.DEFAULT}, m = "invokeSuspend")
/* renamed from: X.Rvw, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71136Rvw extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public long LJLIL;
    public int LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C71139Rvz LJLJJI;
    public final /* synthetic */ boolean LJLJJL;
    public final /* synthetic */ Room LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71136Rvw(C71139Rvz c71139Rvz, boolean z, Room room, InterfaceC67352kd<? super C71136Rvw> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = c71139Rvz;
        this.LJLJJL = z;
        this.LJLJJLL = room;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C71136Rvw c71136Rvw = new C71136Rvw(this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
        c71136Rvw.LJLJI = obj;
        return c71136Rvw;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71136Rvw.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
