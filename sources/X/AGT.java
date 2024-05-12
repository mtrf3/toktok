package X;

import com.google.gson.j;
import com.google.gson.m;
import com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AGT implements InterfaceC36621EYv<String> {
    public final /* synthetic */ AdSettingsActivity LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;

    public AGT(AdSettingsActivity adSettingsActivity, boolean z) {
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
        m LLFZ;
        j LJJIJ;
        if (c64797Pbt != null && c64797Pbt.LIZIZ() && (str = c64797Pbt.LIZIZ) != null && (LLFZ = this.LJLIL.LLFZ(str)) != null && (LJJIJ = LLFZ.LJJIJ("status_code")) != null && LJJIJ.LJIILJJIL() == 0) {
            AI9 accessory = ((AI8) this.LJLIL._$_findCachedViewById(R.id.qp)).getAccessory();
            o.LJII(accessory, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxCellAccessory.Switch");
            AEY aey = (AEY) accessory;
            aey.LJIILIIL(!this.LJLILLLLZI);
            aey.LJIIL();
            C2U8.LIZ(new AGU());
        }
    }
}
