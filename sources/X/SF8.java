package X;

import android.content.Context;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CpfElem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.IDqS436S0100000_12;

/* loaded from: classes13.dex */
public final class SF8 extends PopupWindow {
    public final View LIZ;
    public final List<CpfElem> LIZIZ;
    public final InterfaceC88473Ynt<SF8, Integer, CpfElem, C76800UCe> LIZJ;
    public final InterfaceC88472Yns<Integer, C76800UCe> LIZLLL;
    public final InterfaceC65784Pro<C76800UCe> LJ;
    public final SF7 LJFF;
    public List<CpfElem> LJI = new ArrayList();

    @Override // android.widget.PopupWindow
    public final void dismiss() {
        if (!isShowing()) {
            return;
        }
        super.dismiss();
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJ;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public SF8(Context context, T5T t5t, List list, IDqS436S0100000_12 iDqS436S0100000_12, AqS178S0100000_12 aqS178S0100000_12, AqS162S0100000_12 aqS162S0100000_12) {
        this.LIZ = t5t;
        this.LIZIZ = list;
        this.LIZJ = iDqS436S0100000_12;
        this.LIZLLL = aqS178S0100000_12;
        this.LJ = aqS162S0100000_12;
        View inflate = View.inflate(context, R.layout.a0x, null);
        ListView listView = (ListView) inflate.findViewById(R.id.gaq);
        SF7 sf7 = new SF7(context, ORZ.LLJILJILJ(list));
        this.LJFF = sf7;
        sf7.LJLJI = new AqS194S0100000_12(this, 230);
        listView.setAdapter((ListAdapter) sf7);
        setWidth(KL2.LJIIJJI(context) - C79081V1x.LJII(32));
        setHeight(-2);
        setOutsideTouchable(false);
        setElevation(2.0f);
        setContentView(inflate);
    }
}
