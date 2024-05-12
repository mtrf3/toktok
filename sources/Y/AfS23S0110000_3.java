package Y;

import X.C111144Xu;
import X.C176996x5;
import X.InterfaceC55317LnN;
import X.InterfaceC64592gB;
import X.InterfaceC88471Ynr;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionContentResponse;
import com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionContentViewModel;
import kotlin.jvm.internal.AqS46S0110000_3;

/* loaded from: classes4.dex */
public class AfS23S0110000_3 implements InterfaceC64592gB {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            case 3:
                accept$3(this, obj);
                return;
            case 4:
                accept$4(this, obj);
                return;
            case 5:
                accept$5(this, obj);
                return;
            case 6:
                accept$6(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS23S0110000_3 afS23S0110000_3, Object obj) {
        ((C176996x5) afS23S0110000_3.l0).LJJJJ(afS23S0110000_3.z1);
    }

    public static final void accept$1(AfS23S0110000_3 afS23S0110000_3, Object obj) {
        DetailFragmentPanel detailFragmentPanel = (DetailFragmentPanel) afS23S0110000_3.l0;
        boolean z = afS23S0110000_3.z1;
        C111144Xu c111144Xu = (C111144Xu) obj;
        detailFragmentPanel.getClass();
        float f = 0.0f;
        if (c111144Xu.LIZ != null && detailFragmentPanel.getCurrentPlayAweme() != null && TextUtils.equals(c111144Xu.LIZ.getAid(), detailFragmentPanel.getCurrentPlayAweme().getAid()) && c111144Xu.LIZIZ) {
            detailFragmentPanel.LLII.ae(true);
            detailFragmentPanel.LLII.ml(0.0f);
            return;
        }
        detailFragmentPanel.LLII.ae(z);
        InterfaceC55317LnN interfaceC55317LnN = detailFragmentPanel.LLII;
        if (!z) {
            f = 1.0f;
        }
        interfaceC55317LnN.ml(f);
    }

    public static final void accept$2(AfS23S0110000_3 afS23S0110000_3, Object obj) {
        ((VideoCollectionContentViewModel) afS23S0110000_3.l0).setState(new AqS46S0110000_3((CollectionContentResponse) obj, afS23S0110000_3.z1, 5));
    }

    public static final void accept$3(AfS23S0110000_3 afS23S0110000_3, Object obj) {
        ((VideoCollectionContentViewModel) afS23S0110000_3.l0).setState(new AqS46S0110000_3((CollectionContentResponse) obj, afS23S0110000_3.z1, 17));
    }

    public static final void accept$4(AfS23S0110000_3 afS23S0110000_3, Object obj) {
        ((VideoCollectionContentViewModel) afS23S0110000_3.l0).setState(new AqS46S0110000_3((CollectionContentResponse) obj, afS23S0110000_3.z1, 19));
    }

    public static final void accept$5(AfS23S0110000_3 afS23S0110000_3, Object obj) {
        if (obj == null) {
            ((InterfaceC88471Ynr) afS23S0110000_3.l0).invoke(Boolean.FALSE, Boolean.valueOf(afS23S0110000_3.z1));
            return;
        }
        ((InterfaceC88471Ynr) afS23S0110000_3.l0).invoke(Boolean.TRUE, Boolean.valueOf(!afS23S0110000_3.z1));
    }

    public static final void accept$6(AfS23S0110000_3 afS23S0110000_3, Object obj) {
        ((InterfaceC88471Ynr) afS23S0110000_3.l0).invoke(Boolean.FALSE, Boolean.valueOf(afS23S0110000_3.z1));
    }

    public AfS23S0110000_3(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
