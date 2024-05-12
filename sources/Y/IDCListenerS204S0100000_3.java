package Y;

import X.AnonymousClass744;
import X.AnonymousClass745;
import X.C116484hg;
import X.C200067tC;
import X.C228108xK;
import X.C228228xW;
import X.C36576EXc;
import X.C68322mC;
import X.C71Y;
import X.ORZ;
import X.UC0;
import X.X1D;
import X.XKX;
import android.widget.CompoundButton;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.comment.viewerlist.ui.VideoViewHistoryAuthorizationFragmentV2;
import com.ss.android.ugc.aweme.favorites.business.collection.InputNameSheetFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.assem.BillboardSettingsAssem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.BillboardGlobalViewModel;
import com.ss.android.ugc.aweme.mix.mixdetail.viewholder.MixFeedManageCell;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS8S0010000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class IDCListenerS204S0100000_3 implements CompoundButton.OnCheckedChangeListener {
    public final int $t;
    public Object l0;

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.$t) {
            case 0:
                onCheckedChanged$0(this, compoundButton, z);
                return;
            case 1:
                onCheckedChanged$1(this, compoundButton, z);
                return;
            case 2:
                onCheckedChanged$2(this, compoundButton, z);
                return;
            case 3:
                onCheckedChanged$3(this, compoundButton, z);
                return;
            case 4:
                onCheckedChanged$4(this, compoundButton, z);
                return;
            case 5:
                onCheckedChanged$5(this, compoundButton, z);
                return;
            default:
                return;
        }
    }

    public IDCListenerS204S0100000_3(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onCheckedChanged$0(IDCListenerS204S0100000_3 iDCListenerS204S0100000_3, CompoundButton compoundButton, boolean z) {
        ((VideoViewHistoryAuthorizationFragmentV2) iDCListenerS204S0100000_3.l0).LJLJJLL = z;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("check status changed ");
        LIZ.append(z);
        C71Y.LIZ("VideoViewHistoryPopV2", X1D.LIZIZ(LIZ));
    }

    public static final void onCheckedChanged$1(IDCListenerS204S0100000_3 iDCListenerS204S0100000_3, CompoundButton compoundButton, boolean z) {
        String str;
        InputNameSheetFragment inputNameSheetFragment = (InputNameSheetFragment) iDCListenerS204S0100000_3.l0;
        if (z) {
            str = "on";
        } else {
            str = "off";
        }
        C116484hg.LIZ("public_status", str, "make_favorite_collection_public");
        inputNameSheetFragment.LJLLI = z;
    }

    public static final void onCheckedChanged$2(IDCListenerS204S0100000_3 iDCListenerS204S0100000_3, CompoundButton compoundButton, boolean z) {
        BillboardGlobalViewModel billboardGlobalViewModel = (BillboardGlobalViewModel) ((BillboardSettingsAssem) iDCListenerS204S0100000_3.l0).LJLIL.getValue();
        billboardGlobalViewModel.setStateImmediate(new AqS8S0010000_3(z, 43));
        XKX.LIZLLL(ViewModelKt.getViewModelScope(billboardGlobalViewModel), C36576EXc.LIZJ, null, new C200067tC(billboardGlobalViewModel.getState().LJLILLLLZI, billboardGlobalViewModel, null, z), 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v8, types: [T, java.util.ArrayList] */
    public static final void onCheckedChanged$3(IDCListenerS204S0100000_3 iDCListenerS204S0100000_3, CompoundButton compoundButton, boolean z) {
        C228108xK item = ((MixFeedManageCell) iDCListenerS204S0100000_3.l0).getItem();
        if (item != null) {
            MixFeedManageCell mixFeedManageCell = (MixFeedManageCell) iDCListenerS204S0100000_3.l0;
            if (z) {
                AssemViewModel assemViewModel = (AssemViewModel) mixFeedManageCell.LJLIL.getValue();
                String id = item.LJLJI;
                o.LJIIIZ(id, "id");
                List<String> list = ((C228228xW) assemViewModel.getVmDispatcher().getState()).LJLILLLLZI;
                C68322mC c68322mC = new C68322mC();
                c68322mC.element = new ArrayList();
                if (list != null) {
                    if (list.contains(id)) {
                        return;
                    }
                    UC0.LIZLLL((ArrayList) c68322mC.element, ORZ.LLJI(list));
                    ((ArrayList) c68322mC.element).add(id);
                }
                assemViewModel.setStateImmediate(new AqS169S0100000_3(c68322mC, (C68322mC<List<Aweme>>) 991));
                return;
            }
            AssemViewModel assemViewModel2 = (AssemViewModel) mixFeedManageCell.LJLIL.getValue();
            String id2 = item.LJLJI;
            o.LJIIIZ(id2, "id");
            List<String> list2 = ((C228228xW) assemViewModel2.getVmDispatcher().getState()).LJLILLLLZI;
            C68322mC c68322mC2 = new C68322mC();
            c68322mC2.element = new ArrayList();
            if (list2 == null || !list2.contains(id2)) {
                return;
            }
            UC0.LIZLLL((ArrayList) c68322mC2.element, ORZ.LLJI(list2));
            ((ArrayList) c68322mC2.element).remove(id2);
            assemViewModel2.setState(new AqS169S0100000_3(c68322mC2, (C68322mC<List<Aweme>>) 996));
        }
    }

    public static final void onCheckedChanged$4(IDCListenerS204S0100000_3 iDCListenerS204S0100000_3, CompoundButton compoundButton, boolean z) {
        AnonymousClass744 anonymousClass744 = (AnonymousClass744) iDCListenerS204S0100000_3.l0;
        if (anonymousClass744.LLIIIILZ) {
            anonymousClass744.V(z);
        } else {
            anonymousClass744.U(z);
        }
    }

    public static final void onCheckedChanged$5(IDCListenerS204S0100000_3 iDCListenerS204S0100000_3, CompoundButton compoundButton, boolean z) {
        AnonymousClass745 anonymousClass745 = (AnonymousClass745) iDCListenerS204S0100000_3.l0;
        if (anonymousClass745.LLILII) {
            anonymousClass745.V(z);
        } else {
            anonymousClass745.U(z);
        }
    }
}
