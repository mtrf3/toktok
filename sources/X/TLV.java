package X;

import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TLV implements InterfaceC80707Vlv {
    public final /* synthetic */ TLW LIZ;

    @Override // X.InterfaceC80707Vlv
    public final void LIZ(C164456cr c164456cr) {
    }

    @Override // X.InterfaceC80707Vlv
    public final void LIZIZ(C164456cr c164456cr) {
    }

    public TLV(TLW tlw) {
        this.LIZ = tlw;
    }

    @Override // X.InterfaceC80707Vlv
    public final void LIZJ(C164456cr tab, boolean z) {
        Object first;
        o.LJIIIZ(tab, "tab");
        int i = tab.LIZJ;
        OSZ osz = (OSZ) ORZ.LJLLLLLL(i, this.LIZ.LIZ);
        if (osz != null && (first = osz.getFirst()) != null) {
            TLW tlw = this.LIZ;
            if (i < tlw.LIZIZ.getCount()) {
                tlw.LIZLLL.setCurrentItem(i, true);
            }
            TLW tlw2 = this.LIZ;
            if (tlw2.LJII) {
                Object tag = ((View) ((InterfaceC65784Pro) ((OSZ) ListProtector.get(tlw2.LIZ, i)).getSecond()).invoke()).getTag(R.id.em_);
                if (!(tag instanceof InterfaceC74488TLg)) {
                    tag = null;
                }
                InterfaceC74488TLg interfaceC74488TLg = (InterfaceC74488TLg) tag;
                if (interfaceC74488TLg != null) {
                    interfaceC74488TLg.loadData();
                }
            }
            this.LIZ.LIZJ.onNext(new OSZ<>(first, Integer.valueOf(i)));
        }
    }
}
