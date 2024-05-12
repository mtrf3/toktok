package X;

import Y.AObjectS148S0100000_11;
import android.view.View;
import com.ss.android.ugc.aweme.setting.page.BasePage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.QgP, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67625QgP extends AbstractViewOnClickListenerC67619QgJ {
    @Override // X.AEW
    /* renamed from: LJIIJJI */
    public final AEL LJIIIIZZ() {
        return new AEL(LJIILIIL(R.string.qx0, new Object[0]), 1, LJIILIIL(R.string.r1s, new Object[0]), null, this, null, LJIILIIL(R.string.cfl, new Object[0]), true, 7896);
    }

    @Override // X.AbstractViewOnClickListenerC67619QgJ
    public final void LJIILL() {
        LJIIJ(new C67626QgQ(this, R.string.r1s));
        LJIIZILJ("GECKO");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C67625QgP(BasePage basePage) {
        super(basePage);
        o.LJIIIZ(basePage, "basePage");
    }

    @Override // X.AbstractViewOnClickListenerC67619QgJ
    public final void LJIILLIIL(View v) {
        o.LJIIIZ(v, "v");
        LJIILJJIL().LJLJI.setValue(new OSZ<>(Integer.valueOf(R.string.cfm), new AObjectS148S0100000_11(this, 2)));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("module", "GECKO");
        jSONObject.put("size", this.LJLLLL);
        FMX.LJIILJJIL("clean_gecko_file", jSONObject);
    }
}
