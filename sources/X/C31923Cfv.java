package X;

import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.gift.model.GiftPanelJsbData;
import com.bytedance.android.livesdk.model.Gift;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Cfv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31923Cfv extends AbstractC38123Exj<JSONObject, GiftPanelJsbData> {
    @Override // X.AbstractC38123Exj
    public final void onTerminate() {
    }

    @Override // X.AbstractC38082Ex4
    public final EnumC38078Ex0 getPermissionGroup() {
        return EnumC38078Ex0.PRIVATE;
    }

    @Override // X.AbstractC38123Exj
    public final void invoke(JSONObject jSONObject, C38131Exr context) {
        Integer num;
        int i;
        GiftPage giftPage;
        int i2;
        GiftPage giftPage2;
        JSONObject params = jSONObject;
        o.LJIIIZ(params, "params");
        o.LJIIIZ(context, "context");
        IInteractService iInteractService = (IInteractService) CN1.LIZ(IInteractService.class);
        Object obj = params.get("pageType");
        if (obj instanceof Integer) {
            num = (Integer) obj;
        } else {
            num = null;
        }
        boolean z = false;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        List<GiftPage> giftPages = ((IGiftService) CN1.LIZ(IGiftService.class)).getGiftPages();
        if (giftPages != null) {
            Iterator<GiftPage> it = giftPages.iterator();
            while (true) {
                if (it.hasNext()) {
                    giftPage2 = it.next();
                    GiftPage giftPage3 = giftPage2;
                    if (giftPage3 != null && giftPage3.pageType == i) {
                        break;
                    }
                } else {
                    giftPage2 = null;
                    break;
                }
            }
            giftPage = giftPage2;
        } else {
            giftPage = null;
        }
        GiftPanelJsbData giftPanelJsbData = new GiftPanelJsbData();
        ArrayList arrayList = new ArrayList();
        if (giftPage != null) {
            List<Gift> list = giftPage.gifts;
            if (list != null) {
                Iterator<Gift> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next());
                }
            }
            if (giftPage.gifts != null) {
                i2 = 1;
                giftPanelJsbData.code = i2;
                giftPanelJsbData.data = arrayList;
                if (!iInteractService.VY() || (iInteractService.Xu0() && iInteractService.Yu0() >= 1)) {
                    z = true;
                }
                giftPanelJsbData.isMultiGuestRoom = z;
                finishWithResult(giftPanelJsbData);
            }
        }
        i2 = 0;
        giftPanelJsbData.code = i2;
        giftPanelJsbData.data = arrayList;
        if (!iInteractService.VY()) {
        }
        z = true;
        giftPanelJsbData.isMultiGuestRoom = z;
        finishWithResult(giftPanelJsbData);
    }
}
