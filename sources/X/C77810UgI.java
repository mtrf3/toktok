package X;

import android.content.Context;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.model.GiftsBoxInfoForSend;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import kotlin.jvm.internal.o;

/* renamed from: X.UgI, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77810UgI extends AbstractC77812UgK {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        String str;
        int i;
        int i2;
        int i3;
        GiftsBoxInfoForSend giftsBoxInfoForSend;
        Object LIZ;
        InterfaceC77811UgJ interfaceC77811UgJ = (InterfaceC77811UgJ) xBaseParamModel;
        o.LJIIIZ(type, "type");
        C0NB.LIZIZ("SendGiftV2Tag", "SendGiftV2 called");
        long longValue = interfaceC77811UgJ.getGiftId().longValue();
        int intValue = interfaceC77811UgJ.getGiftCount().intValue();
        String giftType = interfaceC77811UgJ.getGiftType();
        long parseLong = CastLongProtector.parseLong(interfaceC77811UgJ.getToUserId());
        String secToUserId = interfaceC77811UgJ.getSecToUserId();
        long parseLong2 = CastLongProtector.parseLong(interfaceC77811UgJ.getToRoomId());
        InterfaceC77813UgL eventData = interfaceC77811UgJ.getEventData();
        C15900jq c15900jq = new C15900jq(eventData.getGiftEnterSource(), eventData.getGiftEnterMethod(), eventData.getGiftEnterPage(), eventData.getExtra());
        String str2 = "";
        if (interfaceC77811UgJ.getGiftExtra() == null) {
            str = "";
        } else {
            str = interfaceC77811UgJ.getGiftExtra();
        }
        String fromUserId = interfaceC77811UgJ.getFromUserId();
        if (fromUserId != null) {
            CastLongProtector.parseLong(fromUserId);
        }
        interfaceC77811UgJ.getSecFromUserId();
        Number closeGiftPanel = interfaceC77811UgJ.getCloseGiftPanel();
        if (closeGiftPanel != null) {
            i = closeGiftPanel.intValue();
        } else {
            i = 0;
        }
        boolean clientShowComboButton = interfaceC77811UgJ.getClientShowComboButton();
        int intValue2 = interfaceC77811UgJ.getComboButtonAwaitBehaviour().intValue();
        interfaceC77811UgJ.getAllowCharge();
        Number comboOffsetX = interfaceC77811UgJ.getComboOffsetX();
        if (comboOffsetX != null) {
            i2 = comboOffsetX.intValue();
        } else {
            i2 = 0;
        }
        Number comboOffsetY = interfaceC77811UgJ.getComboOffsetY();
        if (comboOffsetY != null) {
            i3 = comboOffsetY.intValue();
        } else {
            i3 = 0;
        }
        String giftsInBox = interfaceC77811UgJ.getGiftsInBox();
        Context context = null;
        if (longValue <= 0 || intValue <= 0) {
            XBaseModel LIZJ = ED5.LIZJ(InterfaceC77802UgA.class, null);
            ((InterfaceC77802UgA) LIZJ).setErrorCode(0);
            c37356ElM.onSuccess((XBaseResultModel) LIZJ, "Gift Id or Gift Count invalid");
            return;
        }
        if (giftsInBox == null || giftsInBox.length() == 0) {
            giftsBoxInfoForSend = null;
        } else {
            try {
                LIZ = (GiftsBoxInfoForSend) C09650Zl.LIZIZ.LJI(giftsInBox, GiftsBoxInfoForSend.class);
                C3C5.m7constructorimpl(LIZ);
            } catch (Throwable th) {
                LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
            }
            C3C5.m10exceptionOrNullimpl(LIZ);
            if (C3C5.m12isFailureimpl(LIZ)) {
                LIZ = null;
            }
            giftsBoxInfoForSend = (GiftsBoxInfoForSend) LIZ;
        }
        String toUserNickName = interfaceC77811UgJ.getToUserNickName();
        if (toUserNickName != null) {
            str2 = toUserNickName;
        }
        C33801Ui c33801Ui = new C33801Ui(longValue, intValue, giftType, parseLong, secToUserId, str2, c15900jq, str, parseLong2, i, clientShowComboButton, intValue2, i2, i3, giftsBoxInfoForSend, giftsInBox, new C77801Ug9(c37356ElM, this));
        IGiftService iGiftService = (IGiftService) CN1.LIZ(IGiftService.class);
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        if (interfaceC38263Ezz != null) {
            context = interfaceC38263Ezz.getContext();
        }
        iGiftService.sendGiftInternal(context, c33801Ui);
    }
}
