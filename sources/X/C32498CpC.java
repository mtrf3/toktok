package X;

import android.os.SystemClock;
import com.bytedance.android.livesdk.model.GiftPanelBanner;
import org.json.JSONObject;
import ujb.o;

/* renamed from: X.CpC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32498CpC extends AbstractC65781Prl implements InterfaceC88473Ynt<Long, Integer, String, C76800UCe> {
    public final /* synthetic */ C32507CpL LJLIL;
    public final /* synthetic */ GiftPanelBanner LJLILLLLZI;
    public final /* synthetic */ C32500CpE LJLJI;
    public final /* synthetic */ GiftPanelBanner LJLJJI;
    public final /* synthetic */ AbstractC32698CsQ<? extends C30896CAq> LJLJJL;
    public final /* synthetic */ AbstractC32698CsQ<? extends C30896CAq> LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32498CpC(C32507CpL c32507CpL, GiftPanelBanner giftPanelBanner, C32500CpE c32500CpE, GiftPanelBanner giftPanelBanner2, AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ, AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ2) {
        super(3);
        this.LJLIL = c32507CpL;
        this.LJLILLLLZI = giftPanelBanner;
        this.LJLJI = c32500CpE;
        this.LJLJJI = giftPanelBanner2;
        this.LJLJJL = abstractC32698CsQ;
        this.LJLJJLL = abstractC32698CsQ2;
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(Long l, Integer num, String str) {
        long longValue = l.longValue();
        Integer num2 = num;
        long j = this.LJLIL.LJFF;
        long uptimeMillis = SystemClock.uptimeMillis() - longValue;
        JSONObject LIZLLL = Q7K.LIZLLL("gift_id", j);
        LIZLLL.put("load_time", uptimeMillis);
        if (num2 != null) {
            LIZLLL.put("error_code", num2.intValue());
        }
        if (str != null) {
            LIZLLL.put("error_message", str);
        }
        C0K2.LJI("ttlive_sdk_panel_lynx_banner_load_error", new JSONObject(), LIZLLL, new JSONObject());
        if ((!o.LJJJJJL(C32499CpD.LIZ(this.LJLILLLLZI.displayText))) && this.LJLILLLLZI.leftIcon != null) {
            this.LJLJI.LJJIJIIJI(this.LJLJJI, this.LJLIL, this.LJLJJL, this.LJLJJLL);
        } else {
            this.LJLJI.LJJIJ(this.LJLIL, this.LJLJJL);
        }
        return C76800UCe.LIZ;
    }
}
