package X;

import Y.AUListenerS103S0200000_14;
import Y.IDAListenerS44S0200000_14;
import android.animation.ValueAnimator;
import android.view.animation.Interpolator;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live_settings.LiveSettingModel;
import com.bytedance.android.live_settings.SettingsDataProvider;
import com.bytedance.android.livesdkapi.host.IHostSetting;
import com.bytedance.sdk.xbridge.runtime.depend.IHostContextDepend;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Uh3, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77857Uh3 implements SettingsDataProvider, IHostContextDepend, C0K7, InterfaceC77762UfW {
    public static final C77857Uh3 LJLIL = new C77857Uh3();

    @Override // X.InterfaceC77762UfW
    public void LIZ() {
        BZI LIZ = C28787BRn.LIZ("livesdk_exchange_billing_address_change_done");
        LIZ.LJIJJ("live_gift", "request_page");
        LIZ.LJIJJ("anchor_income", "charge_reason");
        LIZ.LJJIIJZLJL();
    }

    @Override // com.bytedance.android.live_settings.SettingsDataProvider
    public HashMap getLiveSettingMap() {
        HashMap hashMap = new HashMap();
        try {
            HashMap<String, LiveSettingModel> modelMap = CK5.LIZ.getModelMap();
            if (modelMap == null) {
                modelMap = new HashMap<>();
            }
            return modelMap;
        } catch (Exception unused) {
            return hashMap;
        }
    }

    @Override // com.bytedance.android.live_settings.SettingsDataProvider
    public String getCurrentUid() {
        return C0DC.LIZ();
    }

    @Override // com.bytedance.sdk.xbridge.runtime.depend.IHostContextDepend
    public boolean isBoeEnable() {
        return ((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).enableBoe();
    }

    @Override // X.InterfaceC77762UfW
    public void LIZIZ(String pageType) {
        o.LJIIIZ(pageType, "pageType");
        BZI LIZIZ = C0JU.LIZIZ("livesdk_exchange_billing_address_location_show", "live_gift", "request_page", "anchor_income", "charge_reason");
        LIZIZ.LJIJJ(pageType, "page_type");
        LIZIZ.LJJIIJZLJL();
    }

    @Override // X.C0K7
    public void LJIILLIIL(LiveDialog liveDialog) {
        liveDialog.dismiss();
    }

    @Override // com.bytedance.android.live_settings.SettingsDataProvider
    public void deleteUselessExposedVids(String vids) {
        o.LJIIIZ(vids, "vids");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("deleteUselessExposedVids: ");
        LIZ.append(vids);
        C0NB.LJIIIZ("LivePreciseExposure", X1D.LIZIZ(LIZ));
        ((IHostSetting) CN1.LIZ(IHostSetting.class)).deleteUselessExposedVids(vids);
    }

    @Override // com.bytedance.android.live_settings.SettingsDataProvider
    public void setExposedVids(String vids) {
        o.LJIIIZ(vids, "vids");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setExposedVids: ");
        LIZ.append(vids);
        C0NB.LJIIIZ("LivePreciseExposure", X1D.LIZIZ(LIZ));
        ((IHostSetting) CN1.LIZ(IHostSetting.class)).setExposedVids(vids);
    }

    @Override // com.bytedance.android.live_settings.SettingsDataProvider
    public void setExposedVidsByUid(String vids) {
        o.LJIIIZ(vids, "vids");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setExposedVidsByUid: ");
        LIZ.append(vids);
        C0NB.LJIIIZ("LivePreciseExposure", X1D.LIZIZ(LIZ));
        ((IHostSetting) CN1.LIZ(IHostSetting.class)).setExposedVidsByUid(vids);
    }

    public static void LIZJ(KOV kov, int i) {
        int currentItem;
        Interpolator LIZLLL = C55953Lxd.LIZLLL();
        int width = kov.getWidth();
        o.LJIIIZ(kov, "<this>");
        if (C90193gN.LIZ()) {
            currentItem = (kov.getCurrentItem() - i) * width;
        } else {
            currentItem = (i - kov.getCurrentItem()) * width;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, currentItem);
        ofInt.addUpdateListener(new AUListenerS103S0200000_14(new C76732zl(), kov, 4));
        ofInt.addListener(new IDAListenerS44S0200000_14(kov, kov, 1));
        ofInt.setInterpolator(LIZLLL);
        ofInt.setDuration(300L);
        ofInt.start();
    }

    public static void LIZLLL(FragmentManager fragmentManager, String str, String str2) {
        C26224AQy c26224AQy = new C26224AQy();
        if (str != null) {
            c26224AQy.LIZIZ(str);
        }
        if (str2 != null) {
            C77858Uh4 c77858Uh4 = C77858Uh4.LJLIL;
            c26224AQy.LJII = str2;
            c26224AQy.LJIIIZ = c77858Uh4;
        }
        c26224AQy.LIZ().LIZ.show(fragmentManager, (String) null);
    }
}
