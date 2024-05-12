package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.ss.android.ugc.aweme.im.sdk.common.data.api.TikTokImApi;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.activitystatus.data.ActivityStatusGuidePopupAckUtils$ack$2", f = "ActivityStatusGuidePopupAckUtils.kt", l = {LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40}, m = "invokeSuspend")
/* renamed from: X.2iM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65942iM extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C65942iM(String str, InterfaceC67352kd<? super C65942iM> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C65942iM(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            TikTokImApi LIZ = C30U.LIZ();
            String str = this.LJLILLLLZI;
            this.LJLIL = 1;
            if (C80753Ex.LIZ(LIZ, "inbox_activity_status", "inbox", 2, null, str, this, 8) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
