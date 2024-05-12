package X;

import android.view.View;
import java.util.Iterator;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class OXL extends AbstractC65781Prl implements InterfaceC88471Ynr<View, Integer, C76800UCe> {
    public final /* synthetic */ OXH LJLIL;
    public final /* synthetic */ Integer LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ String LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OXL(OXH oxh, Integer num, String str, String str2, String str3, String str4) {
        super(2);
        this.LJLIL = oxh;
        this.LJLILLLLZI = num;
        this.LJLJI = str;
        this.LJLJJI = str2;
        this.LJLJJL = str3;
        this.LJLJJLL = str4;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(View view, Integer num) {
        View rootView = view;
        num.intValue();
        o.LJIIIZ(rootView, "rootView");
        OXH oxh = this.LJLIL;
        Iterator<InterfaceC62486Ofi> it = oxh.LIZLLL.LIZJ.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            InterfaceC62486Ofi next = it.next();
            if (o.LJ(next.key(), "save_image")) {
                ((C42598Gni) next).LJLJI = new AqS160S0100000_10(oxh, 466);
                break;
            }
        }
        OXH oxh2 = this.LJLIL;
        Integer num2 = this.LJLILLLLZI;
        String str = this.LJLJI;
        String str2 = this.LJLJJI;
        String str3 = this.LJLJJL;
        String str4 = this.LJLJJLL;
        int LJIILL = KL2.LJIILL(oxh2.LIZ, rootView.getHeight());
        if (num2 != null && num2.intValue() == 1) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("panel_height", LJIILL);
            jSONObject.put("panel_frame", jSONObject2);
            C38049EwX c38049EwX = oxh2.LIZIZ;
            if (c38049EwX != null) {
                c38049EwX.LJIIIIZZ("H5_sharePanelFrame", jSONObject);
            }
            InterfaceC60761Nsz interfaceC60761Nsz = oxh2.LIZJ;
            if (interfaceC60761Nsz != null) {
                interfaceC60761Nsz.LJIIIZ("H5_sharePanelFrame", jSONObject);
            }
        }
        OXR.LIZIZ(str, str2, str3, str4);
        return C76800UCe.LIZ;
    }
}
