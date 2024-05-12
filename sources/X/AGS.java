package X;

import android.text.TextUtils;
import android.widget.TextView;
import com.google.gson.j;
import com.google.gson.m;
import com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AGS implements InterfaceC36621EYv<String> {
    public final /* synthetic */ AdSettingsActivity LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;

    public AGS(AdSettingsActivity adSettingsActivity, boolean z) {
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
        String str2;
        int i;
        boolean z;
        j LJJIJ;
        j LJJIJ2;
        if (c64797Pbt != null && c64797Pbt.LIZIZ() && (str = c64797Pbt.LIZIZ) != null) {
            m LLFZ = this.LJLIL.LLFZ(str);
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
            if (LLFZ != null && (LJJIJ = LLFZ.LJJIJ("status_code")) != null) {
                i = LJJIJ.LJIILJJIL();
            } else {
                i = -1;
            }
            AI9 accessory = ((AI8) this.LJLIL._$_findCachedViewById(R.id.ts)).getAccessory();
            o.LJII(accessory, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxCellAccessory.Switch");
            AEY aey = (AEY) accessory;
            if (i == 0) {
                if (!this.LJLILLLLZI) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = this.LJLILLLLZI;
            }
            aey.LJIILIIL(z);
            ((TextView) this.LJLIL._$_findCachedViewById(R.id.b7k)).setEnabled(!z);
            if (z) {
                this.LJLIL._$_findCachedViewById(R.id.fhc).setVisibility(0);
                String str3 = this.LJLIL.LJLILLLLZI;
                if (str3 == null || str3.length() == 0) {
                    this.LJLIL._$_findCachedViewById(R.id.m7k).setVisibility(0);
                    this.LJLIL._$_findCachedViewById(R.id.fhd).setVisibility(8);
                } else {
                    this.LJLIL._$_findCachedViewById(R.id.m7k).setVisibility(8);
                    this.LJLIL._$_findCachedViewById(R.id.fhd).setVisibility(0);
                }
            } else {
                this.LJLIL._$_findCachedViewById(R.id.fhc).setVisibility(8);
                this.LJLIL._$_findCachedViewById(R.id.m7k).setVisibility(8);
                this.LJLIL._$_findCachedViewById(R.id.fhd).setVisibility(8);
            }
            this.LJLIL.LLIIIILZ(z);
        }
    }
}
