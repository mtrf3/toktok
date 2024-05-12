package X;

import android.text.TextUtils;
import com.google.gson.j;
import com.google.gson.m;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AGW implements InterfaceC36621EYv<String> {
    public final /* synthetic */ AdSettingsActivity LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;

    public AGW(AdSettingsActivity adSettingsActivity, boolean z) {
        this.LJLIL = adSettingsActivity;
        this.LJLILLLLZI = z;
    }

    @Override // X.InterfaceC36621EYv
    public final void LIZJ(InterfaceC37276Ek4<String> interfaceC37276Ek4, Throwable th) {
        C26045AKb c26045AKb = new C26045AKb(this.LJLIL);
        c26045AKb.LJIIIZ("Request Failed");
        c26045AKb.LJIIJ();
    }

    @Override // X.InterfaceC36621EYv
    public final void LJII(InterfaceC37276Ek4<String> interfaceC37276Ek4, C64797Pbt<String> c64797Pbt) {
        String str;
        j LJJIJ;
        AwemeCommerceStruct commerceVideoAuthInfo;
        j LJJIJ2;
        if (c64797Pbt != null && c64797Pbt.LIZIZ() && (str = c64797Pbt.LIZIZ) != null) {
            m LLFZ = this.LJLIL.LLFZ(str);
            String str2 = null;
            if (LLFZ != null && (LJJIJ2 = LLFZ.LJJIJ("status_msg")) != null) {
                str2 = LJJIJ2.LJJIFFI();
            }
            if (!TextUtils.isEmpty(str2)) {
                C26045AKb c26045AKb = new C26045AKb(this.LJLIL);
                c26045AKb.LJIIIZ(str2);
                c26045AKb.LJIIJ();
            }
            if (LLFZ != null && (LJJIJ = LLFZ.LJJIJ("status_code")) != null && LJJIJ.LJIILJJIL() == 0) {
                AI9 accessory = ((AI8) this.LJLIL._$_findCachedViewById(R.id.qp)).getAccessory();
                o.LJII(accessory, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxCellAccessory.Switch");
                AEY aey = (AEY) accessory;
                int i = 1;
                aey.LJIILIIL(!this.LJLILLLLZI);
                Z8A.LIZIZ.postDarkModeStatusEvent(aey.LJIIL());
                Aweme aweme = AdSettingsActivity.LJLL;
                if (aweme == null || (commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) == null) {
                    return;
                }
                if (!aey.LJIIL()) {
                    i = 2;
                }
                commerceVideoAuthInfo.setDarkPostStatus(i);
            }
        }
    }
}
