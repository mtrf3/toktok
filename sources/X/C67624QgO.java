package X;

import Y.AObjectS148S0100000_11;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.setting.page.BasePage;
import com.ss.android.ugc.aweme.setting.page.diskmanager.DiskViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.QgO, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67624QgO extends AbstractViewOnClickListenerC67619QgJ {
    @Override // X.AEW
    /* renamed from: LJIIJJI */
    public final AEL LJIIIIZZ() {
        String LJIILIIL = LJIILIIL(R.string.qx0, new Object[0]);
        Integer num = this.LJLJJLL;
        o.LJI(num);
        return new AEL(LJIILIIL, 1, LJIILIIL(num.intValue(), new Object[0]), null, this, null, LJIILIIL(R.string.qxf, new Object[0]), true, 7896);
    }

    @Override // X.AbstractViewOnClickListenerC67619QgJ
    public final void LJIILL() {
        Integer num = this.LJLJJLL;
        o.LJI(num);
        LJIIJ(new C67626QgQ(this, num.intValue()));
        LJIIZILJ("CACHE");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C67624QgO(BasePage basePage) {
        super(basePage);
        o.LJIIIZ(basePage, "basePage");
    }

    @Override // X.AbstractViewOnClickListenerC67619QgJ
    public final void LJIILLIIL(View v) {
        MutableLiveData<OSZ<Integer, InterfaceC88472Yns<ARN, C76800UCe>>> mutableLiveData;
        o.LJIIIZ(v, "v");
        DiskViewModel LJIILJJIL = LJIILJJIL();
        if (LJIILJJIL != null && (mutableLiveData = LJIILJJIL.LJLJI) != null) {
            Integer num = this.LJLLI;
            o.LJI(num);
            mutableLiveData.setValue(new OSZ<>(num, new AObjectS148S0100000_11(this, 0)));
        }
        JSONObject LIZJ = C65232Piu.LIZJ("module", "CACHE");
        LIZJ.put("size", this.LJLLJ);
        FMX.LJIILJJIL("clean_temp_file", LIZJ);
    }
}
