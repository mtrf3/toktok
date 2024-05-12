package X;

import Y.AObjectS148S0100000_11;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.setting.page.BasePage;
import com.ss.android.ugc.aweme.setting.page.diskmanager.DiskViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AqS35S0001000_11;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.QgN, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67623QgN extends AbstractViewOnClickListenerC67619QgJ {
    @Override // X.AEW
    /* renamed from: LJIIJJI */
    public final AEL LJIIIIZZ() {
        String LJIILIIL = LJIILIIL(R.string.qx0, new Object[0]);
        Integer num = this.LJLJLJ;
        o.LJI(num);
        return new AEL(LJIILIIL, 1, LJIILIIL(num.intValue(), new Object[0]), null, this, null, LJIILIIL(R.string.qxg, new Object[0]), true, 7896);
    }

    @Override // X.AbstractViewOnClickListenerC67619QgJ
    public final void LJIILL() {
        String str;
        Integer num = this.LJLJLJ;
        o.LJI(num);
        LJIIJ(new C67626QgQ(this, num.intValue()));
        LJIIZILJ("RESOURCE");
        ArrayList arrayList = new ArrayList(LJIIL());
        int i = 0;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                InterfaceC37286EkE interfaceC37286EkE = (InterfaceC37286EkE) it.next();
                if (interfaceC37286EkE != null) {
                    str = interfaceC37286EkE.LJ();
                } else {
                    str = null;
                }
                if (o.LJ(str, "RESOURCE") && (i = i + 1) < 0) {
                    C47261Igj.LJJJJIZL();
                    throw null;
                }
            }
        }
        LJIIJ(new AqS35S0001000_11(i, 1));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C67623QgN(BasePage basePage) {
        super(basePage);
        o.LJIIIZ(basePage, "basePage");
    }

    @Override // X.AbstractViewOnClickListenerC67619QgJ
    public final void LJIILLIIL(View v) {
        MutableLiveData<OSZ<Integer, InterfaceC88472Yns<ARN, C76800UCe>>> mutableLiveData;
        o.LJIIIZ(v, "v");
        DiskViewModel LJIILJJIL = LJIILJJIL();
        if (LJIILJJIL != null && (mutableLiveData = LJIILJJIL.LJLJI) != null) {
            Integer num = this.LJLLILLLL;
            o.LJI(num);
            mutableLiveData.setValue(new OSZ<>(num, new AObjectS148S0100000_11(this, 1)));
        }
        JSONObject LIZJ = C65232Piu.LIZJ("module", "RESOURCE");
        LIZJ.put("size", this.LJLLL);
        FMX.LJIILJJIL("clean_resource_file", LIZJ);
    }
}
