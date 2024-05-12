package X;

import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Bgl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29427Bgl extends AbstractC38127Exn<JSONObject, Object> {
    @Override // X.AbstractC38127Exn
    public final Object invoke(JSONObject jSONObject, C38131Exr context) {
        EnumC29607Bjf enumC29607Bjf;
        long j;
        long j2;
        Boolean bool;
        JSONObject params = jSONObject;
        o.LJIIIZ(params, "params");
        o.LJIIIZ(context, "context");
        boolean z = false;
        int optInt = params.optInt("default_panel", 0);
        if (optInt != 0) {
            if (optInt != 1) {
                if (optInt != 2) {
                    enumC29607Bjf = EnumC29607Bjf.DEFAULT;
                } else {
                    enumC29607Bjf = EnumC29607Bjf.MATCH;
                }
            } else {
                enumC29607Bjf = EnumC29607Bjf.PROP;
            }
        } else {
            enumC29607Bjf = EnumC29607Bjf.GIFT;
        }
        int optInt2 = params.optInt("is_skip_first_recharge_gift", 0);
        if (params.has("gift_id")) {
            j = JSONObjectProtectorUtils.getLong(params, "gift_id");
        } else {
            j = 0;
        }
        if (enumC29607Bjf == EnumC29607Bjf.MATCH && params.has("card_id")) {
            j2 = JSONObjectProtectorUtils.getLong(params, "card_id");
        } else {
            j2 = 0;
        }
        if (optInt2 == 0) {
            IGiftService iGiftService = (IGiftService) CN1.LIZ(IGiftService.class);
            if (iGiftService != null) {
                bool = Boolean.valueOf(iGiftService.hasFirstRechargeGift());
            } else {
                bool = null;
            }
            if (C29306Beo.LJJIFFI(bool)) {
                IGiftService iGiftService2 = (IGiftService) CN1.LIZ(IGiftService.class);
                if (iGiftService2 != null) {
                    iGiftService2.openGiftDialog("gift");
                }
                return C770830u.LIZLLL("code", 1);
            }
        }
        C29428Bgm c29428Bgm = new C29428Bgm();
        if (j == 0 && optInt == 1) {
            IGiftService iGiftService3 = (IGiftService) CN1.LIZ(IGiftService.class);
            if (iGiftService3 != null) {
                j = iGiftService3.getFirstSubscribeGiftId();
            } else {
                j = 0;
            }
            if (j != 0) {
                c29428Bgm.LJ = RunnableC29429Bgn.LJLIL;
            }
        }
        c29428Bgm.LIZIZ = j;
        c29428Bgm.LJIIJJI = j2;
        if (params.has("gift_enter_from")) {
            c29428Bgm.LIZJ = JSONObjectProtectorUtils.getString(params, "gift_enter_from");
        }
        if (params.has("enter_from_quick_rose")) {
            try {
                if (JSONObjectProtectorUtils.getInt(params, "enter_from_quick_rose") == 1) {
                    z = true;
                }
            } catch (Exception unused) {
            }
            c29428Bgm.LJIIIZ = z;
        }
        c29428Bgm.LIZ = enumC29607Bjf;
        IGiftService iGiftService4 = (IGiftService) CN1.LIZ(IGiftService.class);
        if (iGiftService4 != null) {
            iGiftService4.openGiftDialogFromJSB(c29428Bgm);
        }
        return C770830u.LIZLLL("code", 1);
    }
}
