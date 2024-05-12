package Y;

import X.AbstractC028509h;
import X.AbstractC32698CsQ;
import X.C30896CAq;
import X.C32676Cs4;
import X.C32691CsJ;
import X.C32742Ct8;
import X.C32774Cte;
import X.CJ0;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.feed.drawerfeed.DrawerFeedLiveFragmentV2;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.GiftPanelLeafViewModel;
import com.zhiliaoapp.musically.R;
import emotes.ui.EmotePreviewDialog;
import java.util.LinkedList;

/* loaded from: classes6.dex */
public class IDcS37S0100000_5 extends AbstractC028509h {
    public final int $t;
    public Object l0;

    @Override // X.AbstractC028509h
    public final int LJFF(int i) {
        switch (this.$t) {
            case 0:
                return LJFF$0(this, i);
            case 1:
                return LJFF$1(this, i);
            case 2:
                return LJFF$2(this, i);
            case 3:
                return LJFF$3(this, i);
            case 4:
                return LJFF$4(this, i);
            case 5:
                return LJFF$5(this, i);
            default:
                return super.LJFF(i);
        }
    }

    public IDcS37S0100000_5(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final int LJFF$0(IDcS37S0100000_5 iDcS37S0100000_5, int i) {
        MutableLiveData<LinkedList<AbstractC32698CsQ<? extends C30896CAq>>> mutableLiveData;
        LinkedList<AbstractC32698CsQ<? extends C30896CAq>> value;
        GiftPanelLeafViewModel LJJIJIL = ((C32676Cs4) iDcS37S0100000_5.l0).LJJIJIL();
        if (LJJIJIL != null && (mutableLiveData = LJJIJIL.LJLILLLLZI) != null && (value = mutableLiveData.getValue()) != null && value.size() > i) {
            if ((value.get(i) instanceof C32742Ct8) || (value.get(i) instanceof C32774Cte)) {
                return 2;
            }
            return 1;
        }
        return 1;
    }

    public static final int LJFF$1(IDcS37S0100000_5 iDcS37S0100000_5, int i) {
        MutableLiveData<LinkedList<AbstractC32698CsQ<? extends C30896CAq>>> mutableLiveData;
        LinkedList<AbstractC32698CsQ<? extends C30896CAq>> value;
        GiftPanelLeafViewModel LJJIJIL = ((C32676Cs4) iDcS37S0100000_5.l0).LJJIJIL();
        if (LJJIJIL != null && (mutableLiveData = LJJIJIL.LJLILLLLZI) != null && (value = mutableLiveData.getValue()) != null && value.size() > i) {
            if ((value.get(i) instanceof C32742Ct8) || (value.get(i) instanceof C32774Cte)) {
                return 2;
            }
            return 1;
        }
        return 1;
    }

    public static final int LJFF$2(IDcS37S0100000_5 iDcS37S0100000_5, int i) {
        MutableLiveData<LinkedList<AbstractC32698CsQ<? extends C30896CAq>>> mutableLiveData;
        LinkedList<AbstractC32698CsQ<? extends C30896CAq>> value;
        GiftPanelLeafViewModel giftPanelLeafViewModel = ((C32691CsJ) iDcS37S0100000_5.l0).LJLJJI;
        if (giftPanelLeafViewModel != null && (mutableLiveData = giftPanelLeafViewModel.LJLILLLLZI) != null && (value = mutableLiveData.getValue()) != null && value.size() > i) {
            if ((value.get(i) instanceof C32742Ct8) || (value.get(i) instanceof C32774Cte)) {
                return 2;
            }
            return 1;
        }
        return 1;
    }

    public static final int LJFF$3(IDcS37S0100000_5 iDcS37S0100000_5, int i) {
        if (((EmotePreviewDialog) iDcS37S0100000_5.l0).LJLJJI.getItemViewType(i) == 1) {
            return 1;
        }
        return 5;
    }

    public static final int LJFF$4(IDcS37S0100000_5 iDcS37S0100000_5, int i) {
        if (((CJ0) iDcS37S0100000_5.l0).LJLILLLLZI.getItemViewType(i) == 0) {
            return ((CJ0) iDcS37S0100000_5.l0).LJLJLJ;
        }
        return 1;
    }

    public static final int LJFF$5(IDcS37S0100000_5 iDcS37S0100000_5, int i) {
        if (((DrawerFeedLiveFragmentV2) iDcS37S0100000_5.l0).LJLJJI.getItemViewType(i) == R.layout.d77) {
            return 1;
        }
        return 2;
    }
}
