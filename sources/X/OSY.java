package X;

import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftResourceDownloadTimeOutSetting;
import com.bytedance.android.livesdk.livesetting.gift.LynxUrlStorage;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.mt.protector.impl.UriProtector;
import fjb.a;
import java.io.File;
import ujb.o;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.gift.base.platform.business.tray.LiveGiftTrayDisplayController$checkLynxResourceFallback$1", f = "LiveGiftTrayDisplayController.kt", l = {295}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class OSY extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ GiftMessage LJLILLLLZI;
    public final /* synthetic */ C78069UkT LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OSY(GiftMessage giftMessage, C78069UkT c78069UkT, InterfaceC67352kd<? super OSY> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = giftMessage;
        this.LJLJI = c78069UkT;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new OSY(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Boolean bool;
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
            GiftMessage giftMessage = this.LJLILLLLZI;
            AssetsModel LIZIZ = C32341Cmf.LIZIZ(C32394CnW.LIZ(giftMessage.mGift, giftMessage.colorId));
            if (LIZIZ != null && LIZIZ.resourceType == AssetsModel.RESOURCE_TYPE_LYNX) {
                String str = LIZIZ.lynxUrlSettingsKey;
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                String str3 = LynxUrlStorage.INSTANCE.getValue().get(str);
                if (str3 == null) {
                    str3 = "";
                }
                String queryParameter = UriProtector.getQueryParameter(UriProtector.parse(str3), "channel");
                if (queryParameter != null) {
                    str2 = queryParameter;
                }
                File LJFF = C15510jD.LJFF(str2, "/");
                StringBuilder LIZLLL = C06540Nm.LIZLLL("channel is ", str2, ", gift key is ", str, " file is exist ");
                if (LJFF != null) {
                    bool = Boolean.valueOf(LJFF.exists());
                } else {
                    bool = null;
                }
                LIZLLL.append(bool);
                C0NB.LJIIIZ("LynxGiftChannelPreload", X1D.LIZIZ(LIZLLL));
                if ((!o.LJJJJJL(str2)) && (LJFF == null || !LJFF.exists())) {
                    long value = LiveGiftResourceDownloadTimeOutSetting.INSTANCE.getValue();
                    C9QB c9qb = new C9QB(str2, null);
                    this.LJLIL = 1;
                    obj = C74209TAn.LIZJ(value, c9qb, this);
                    if (obj == enumC58928NAu) {
                        return enumC58928NAu;
                    }
                }
            }
            this.LJLJI.LJIIJJI();
            return C76800UCe.LIZ;
        }
        if (obj == null) {
            C78983UzD.LJIJ(new Throwable("load gecko resource timeout"), "LynxGiftChannelPreload");
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("load gecko resource success ");
        LIZ.append(obj);
        C0NB.LJIIIZ("LynxGiftChannelPreload", X1D.LIZIZ(LIZ));
        this.LJLJI.LJIIJJI();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
