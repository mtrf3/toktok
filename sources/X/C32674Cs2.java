package X;

import android.os.SystemClock;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.GiftPanelLeafViewModel;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftPanelSwipeSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftListOptSetting;
import com.bytedance.android.livesdk.widgets.giftwidget.viewmodel.GiftLeafRootViewModel;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Cs2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32674Cs2 extends AbstractC32474Coo {
    public final /* synthetic */ C32676Cs4 LIZ;
    public final /* synthetic */ String LIZIZ;

    @Override // X.AbstractC32474Coo
    public final void LIZIZ() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v3, types: [boolean] */
    @Override // X.AbstractC32474Coo
    public final void LIZLLL() {
        MutableLiveData<EnumC32736Ct2> mutableLiveData;
        C32444CoK.LIZ(this.LIZ.LJLLLLLL, "onSyncLoading: ");
        C32733Csz c32733Csz = this.LIZ.LLF;
        if (c32733Csz != null) {
            c32733Csz.setVisibility(8);
        }
        CVT cvt = this.LIZ.LLD;
        int i = 0;
        if (cvt != null) {
            cvt.setVisibility(0);
        }
        C32694CsM.LIZLLL++;
        C32694CsM.LJ = SystemClock.uptimeMillis();
        int i2 = C32694CsM.LIZLLL;
        try {
            i = C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("show_count", i2);
        jSONObject3.put("is_network_available", i);
        jSONObject3.put("is_gift_list_optimized", LiveGiftListOptSetting.INSTANCE.getValue() ? 1 : 0);
        C32455CoV.LJII(jSONObject3, jSONObject);
        BZI LIZ = C28787BRn.LIZ("gift_panel_loading_view_show");
        LIZ.LJIIZILJ();
        LIZ.LJJ(jSONObject3);
        LIZ.LJJ(jSONObject2);
        LIZ.LJJ(jSONObject);
        LIZ.LJJIIJZLJL();
        C0K2.LJI("gift_panel_loading_view_show", jSONObject3, jSONObject2, jSONObject);
        C32676Cs4 c32676Cs4 = this.LIZ;
        c32676Cs4.LLILL = 2;
        GiftPanelLeafViewModel LJJIJIL = c32676Cs4.LJJIJIL();
        if (LJJIJIL == null || (mutableLiveData = LJJIJIL.LJLJL) == null) {
            return;
        }
        mutableLiveData.setValue(EnumC32736Ct2.LOADING);
    }

    @Override // X.AbstractC32474Coo
    public final void LIZJ(List list) {
        MutableLiveData<EnumC32736Ct2> mutableLiveData;
        C32506CpK<AbstractC32350Cmo> c32506CpK;
        CVT cvt;
        C32733Csz c32733Csz = this.LIZ.LLF;
        if (c32733Csz != null) {
            c32733Csz.setVisibility(8);
        }
        if (!LiveGiftPanelSwipeSetting.INSTANCE.isEnabled() && (cvt = this.LIZ.LLD) != null) {
            cvt.setVisibility(8);
        }
        if (list != null) {
            C32676Cs4 c32676Cs4 = this.LIZ;
            c32676Cs4.LLILLIZIL = 0;
            c32676Cs4.LJJJJJ(1, list);
            GiftLeafRootViewModel LJJIJLIJ = c32676Cs4.LJJIJLIJ();
            if (LJJIJLIJ != null && (c32506CpK = LJJIJLIJ.LJLJJL) != null) {
                c32506CpK.LIZ(new C32351Cmp());
            }
            GiftPanelLeafViewModel LJJIJIL = c32676Cs4.LJJIJIL();
            if (LJJIJIL == null || (mutableLiveData = LJJIJIL.LJLJL) == null) {
                return;
            }
            mutableLiveData.setValue(EnumC32736Ct2.SUCCESS);
        }
    }

    public C32674Cs2(C32676Cs4 c32676Cs4, String str) {
        this.LIZ = c32676Cs4;
        this.LIZIZ = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC32474Coo
    public final void LIZ(int i, String message) {
        int i2;
        String str;
        String str2;
        MutableLiveData<EnumC32736Ct2> mutableLiveData;
        o.LJIIIZ(message, "message");
        C32694CsM.LIZIZ = i;
        C32694CsM.LIZJ = message;
        CVT cvt = this.LIZ.LLD;
        if (cvt != null) {
            cvt.setVisibility(8);
        }
        C32733Csz c32733Csz = this.LIZ.LLF;
        if (c32733Csz != null) {
            c32733Csz.setVisibility(0);
        }
        int i3 = C32694CsM.LJI + 1;
        C32694CsM.LJI = i3;
        long uptimeMillis = SystemClock.uptimeMillis() - C32129CjF.LIZ.LJIIJ;
        long uptimeMillis2 = SystemClock.uptimeMillis() - C32694CsM.LJ;
        try {
            i2 = C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
            i2 = 0;
        }
        JSONObject LIZLLL = C770830u.LIZLLL("show_count", i3);
        LiveGiftListOptSetting liveGiftListOptSetting = LiveGiftListOptSetting.INSTANCE;
        if (liveGiftListOptSetting.getValue()) {
            str = "error_code_v2";
        } else {
            str = "error_code";
        }
        LIZLLL.put(str, i);
        LIZLLL.put("is_network_available", i2);
        LIZLLL.put("is_gift_list_optimized", liveGiftListOptSetting.getValue() ? 1 : 0);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("click_error_show_duration", uptimeMillis);
        jSONObject.put("loading_error_show_duration", uptimeMillis2);
        JSONObject jSONObject2 = new JSONObject();
        if (liveGiftListOptSetting.getValue()) {
            str2 = "error_msg_v2";
        } else {
            str2 = "error_msg";
        }
        jSONObject2.put(str2, message);
        C32455CoV.LJII(LIZLLL, jSONObject2);
        BZI LIZ = C28787BRn.LIZ("gift_panel_error_view_show");
        LIZ.LJIIZILJ();
        LIZ.LJJ(LIZLLL);
        LIZ.LJJ(jSONObject);
        LIZ.LJJ(jSONObject2);
        LIZ.LJJIIJZLJL();
        C0K2.LJI("gift_panel_error_view_show", LIZLLL, jSONObject, jSONObject2);
        C32676Cs4 c32676Cs4 = this.LIZ;
        c32676Cs4.LLILL = 0;
        GiftPanelLeafViewModel LJJIJIL = c32676Cs4.LJJIJIL();
        if (LJJIJIL != null && (mutableLiveData = LJJIJIL.LJLJL) != null) {
            mutableLiveData.setValue(EnumC32736Ct2.FAILED);
        }
        C32694CsM.LJFF++;
        C32676Cs4 c32676Cs42 = this.LIZ;
        C32733Csz c32733Csz2 = c32676Cs42.LLF;
        if (c32733Csz2 != null) {
            c32733Csz2.LIZ(new C32761CtR(c32676Cs42, this.LIZIZ));
        }
    }
}
