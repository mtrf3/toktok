package X;

import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictPage;
import com.ss.android.ugc.aweme.utils.Au2S15S0100000_4;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.ApO, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C27414ApO extends TBS implements InterfaceC88472Yns<SY4, C76800UCe> {
    public C27414ApO(DistrictPage districtPage) {
        super(1, districtPage, DistrictPage.class, "initButton", "initButton(Lcom/bytedance/tux/button/TuxButton;)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(SY4 sy4) {
        SY4 p0 = sy4;
        o.LJIIIZ(p0, "p0");
        DistrictPage districtPage = (DistrictPage) this.receiver;
        districtPage.getClass();
        p0.setText(R.string.f3h);
        p0.setButtonSize(3);
        C16880lQ.LJIIJ(new Au2S15S0100000_4(districtPage, 96, 42), p0);
        return C76800UCe.LIZ;
    }
}
