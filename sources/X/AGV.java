package X;

import android.text.TextUtils;
import com.google.gson.j;
import com.google.gson.m;
import com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity;

/* loaded from: classes5.dex */
public final class AGV implements InterfaceC36621EYv<String> {
    public final /* synthetic */ AdSettingsActivity LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ long LJLJI;

    @Override // X.InterfaceC36621EYv
    public final void LIZJ(InterfaceC37276Ek4<String> interfaceC37276Ek4, Throwable th) {
        C26045AKb c26045AKb = new C26045AKb(this.LJLIL);
        c26045AKb.LJIIIZ("Request Failed");
        c26045AKb.LJIIJ();
    }

    @Override // X.InterfaceC36621EYv
    public final void LJII(InterfaceC37276Ek4<String> interfaceC37276Ek4, C64797Pbt<String> c64797Pbt) {
        String str;
        String str2;
        j LJJIJ;
        j LJJIJ2;
        if (c64797Pbt != null && c64797Pbt.LIZIZ() && (str = c64797Pbt.LIZIZ) != null) {
            m LLFZ = this.LJLIL.LLFZ(str);
            String str3 = null;
            if (LLFZ != null && (LJJIJ2 = LLFZ.LJJIJ("status_msg")) != null) {
                str2 = LJJIJ2.LJJIFFI();
            } else {
                str2 = null;
            }
            if (!TextUtils.isEmpty(str2)) {
                C26045AKb c26045AKb = new C26045AKb(this.LJLIL);
                c26045AKb.LJIIIZ(str2);
                c26045AKb.LJIIJ();
            }
            if (LLFZ != null && (LJJIJ = LLFZ.LJJIJ("video_code")) != null) {
                str3 = LJJIJ.LJJIFFI();
            }
            if (!TextUtils.isEmpty(str3)) {
                this.LJLIL.LLIIIJ(1, this.LJLILLLLZI, this.LJLJI, str3);
            }
        }
    }

    public AGV(AdSettingsActivity adSettingsActivity, long j, long j2) {
        this.LJLIL = adSettingsActivity;
        this.LJLILLLLZI = j;
        this.LJLJI = j2;
    }
}
