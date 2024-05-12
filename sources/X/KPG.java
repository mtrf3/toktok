package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.ss.android.ugc.aweme.search.detail.filter.viewmodel.FilterVM;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KPG implements InterfaceC51672KPs {
    public boolean LIZ = true;
    public final /* synthetic */ KPJ LIZIZ;
    public final /* synthetic */ SYL LIZJ;

    @Override // X.InterfaceC51672KPs
    public final void LIZ() {
        FilterVM LJIIIZ = this.LIZIZ.LJIIIZ();
        EnumC51554KLe enumC51554KLe = EnumC51554KLe.SLIDE_LEFT_OPEN;
        KPJ kpj = this.LIZIZ;
        SYL syl = this.LIZJ;
        kpj.getClass();
        LJIIIZ.hv0(enumC51554KLe, KPJ.LJIIJJI(syl));
    }

    @Override // X.InterfaceC51672KPs
    public final void LIZJ() {
        FilterVM LJIIIZ = this.LIZIZ.LJIIIZ();
        EnumC51554KLe enumC51554KLe = EnumC51554KLe.SLIDE_RIGHT_CLOSE;
        KPJ kpj = this.LIZIZ;
        SYL syl = this.LIZJ;
        kpj.getClass();
        LJIIIZ.hv0(enumC51554KLe, KPJ.LJIIJJI(syl));
    }

    @Override // X.InterfaceC51672KPs
    public final void LIZIZ(float f) {
        float f2;
        LinearLayoutManager linearLayoutManager;
        KPS kps;
        if (this.LIZ && f > 0.0f) {
            C252449vU state = this.LIZIZ.LJIIIZ().getState();
            SYL syl = this.LIZJ;
            C252449vU c252449vU = state;
            Iterator it = ((ArrayList) syl.getState().LJII()).iterator();
            int i = 0;
            while (true) {
                String str = null;
                if (it.hasNext()) {
                    InterfaceC57784Mm4 interfaceC57784Mm4 = (InterfaceC57784Mm4) it.next();
                    String str2 = c252449vU.LJLJJI;
                    if ((interfaceC57784Mm4 instanceof KPS) && (kps = (KPS) interfaceC57784Mm4) != null) {
                        str = kps.LJLIL;
                    }
                    if (o.LJ(str2, str)) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    i = -1;
                    break;
                }
            }
            Integer valueOf = Integer.valueOf(i);
            if (valueOf.intValue() >= 0) {
                int intValue = valueOf.intValue();
                C0A2 layoutManager = syl.getLayoutManager();
                if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
                    linearLayoutManager.LJFF(intValue, 0);
                }
                this.LIZ = false;
            }
        }
        if (f <= 0.5d) {
            f2 = f * 2;
        } else {
            f2 = 1.0f;
        }
        this.LIZIZ.LIZ(1.0f - f2);
        FilterVM LJIIIZ = this.LIZIZ.LJIIIZ();
        LJIIIZ.getClass();
        LJIIIZ.setStateImmediate(new KP9(f2, C78939UyV.LJIL(f2)));
    }

    public KPG(SYL syl, KPJ kpj) {
        this.LIZIZ = kpj;
        this.LIZJ = syl;
    }
}
