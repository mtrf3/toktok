package X;

import android.view.LayoutInflater;
import android.view.View;
import com.bytedance.android.livesdk.chatroom.api.BenefitView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class CDN<T> implements InterfaceC86003Zc {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ CDM LJLILLLLZI;
    public final /* synthetic */ List<CDP> LJLJI;

    public CDN(int i, CDM cdm, List<CDP> list) {
        this.LJLIL = i;
        this.LJLILLLLZI = cdm;
        this.LJLJI = list;
    }

    @Override // X.InterfaceC86003Zc
    public final void subscribe(InterfaceC73573Su9<List<View>> interfaceC73573Su9) {
        int i;
        int i2;
        BenefitView benefitView;
        BenefitView benefitView2;
        ArrayList arrayList = new ArrayList();
        if (this.LJLIL <= 4) {
            i = 2;
        } else {
            i = 3;
        }
        int i3 = ((r1 + i) - 1) / i;
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i4 * i;
            LayoutInflater LLZIL = C16880lQ.LLZIL(this.LJLILLLLZI.LJLIL.getContext());
            if (i == 2) {
                i2 = R.layout.dgw;
            } else {
                i2 = R.layout.dgv;
            }
            View LLLLIILL = C16880lQ.LLLLIILL(LLZIL, i2, this.LJLILLLLZI.LJLIL, false);
            CDM cdm = this.LJLILLLLZI;
            C28290B8k c28290B8k = (C28290B8k) LLLLIILL.findViewById(R.id.aid);
            CDP cdp = (CDP) ORZ.LJLLLLLL(i5, this.LJLJI);
            BenefitView benefitView3 = null;
            if (cdp != null) {
                benefitView = cdp.LIZIZ;
            } else {
                benefitView = null;
            }
            cdm.getClass();
            CDM.M(c28290B8k, benefitView);
            CDM cdm2 = this.LJLILLLLZI;
            C28290B8k c28290B8k2 = (C28290B8k) LLLLIILL.findViewById(R.id.aie);
            CDP cdp2 = (CDP) ORZ.LJLLLLLL(i5 + 1, this.LJLJI);
            if (cdp2 != null) {
                benefitView2 = cdp2.LIZIZ;
            } else {
                benefitView2 = null;
            }
            cdm2.getClass();
            CDM.M(c28290B8k2, benefitView2);
            CDM cdm3 = this.LJLILLLLZI;
            C28290B8k c28290B8k3 = (C28290B8k) LLLLIILL.findViewById(R.id.aif);
            CDP cdp3 = (CDP) ORZ.LJLLLLLL(i5 + 2, this.LJLJI);
            if (cdp3 != null) {
                benefitView3 = cdp3.LIZIZ;
            }
            cdm3.getClass();
            CDM.M(c28290B8k3, benefitView3);
            if (i4 > 0) {
                C29306Beo.LJJLIIIJILLIZJL(C15380j0.LIZ(8.0f), LLLLIILL);
            }
            arrayList.add(LLLLIILL);
        }
        interfaceC73573Su9.onNext(arrayList);
    }
}
