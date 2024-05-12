package Y;

import X.A8M;
import X.A8N;
import X.A8O;
import X.A8P;
import X.A8R;
import X.AVL;
import X.AVM;
import X.AVW;
import X.C188727au;
import X.C254739zB;
import X.C78685UuP;
import X.C7VX;
import X.FMX;
import X.HG3;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.model.PriceInfo;
import com.ss.android.ugc.aweme.paid.content.consumption.PaidContentAnchorExtraModel;
import com.ss.android.ugc.aweme.paid.content.consumption.PaidContentCustomAnchorViewModel;
import com.ss.android.ugc.aweme.paidcontent.assem.PaidContentCollectionDetailDescriptionAssem;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.multiaccount.CheckAccountBottomSheetFragment;
import com.ss.android.ugc.aweme.profile.ui.multiaccount.ChooseAccountBottomSheetFragment;
import com.ss.android.ugc.aweme.user.SignificantUserInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS19S0310000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class AObserverS68S0200000_4 implements Observer {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                return;
            case 1:
                onChanged$1(this, obj);
                return;
            case 2:
                onChanged$2(this, obj);
                return;
            case 3:
                onChanged$3(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void onChanged$0(AObserverS68S0200000_4 aObserverS68S0200000_4, Object obj) {
        A8R a8r;
        String str;
        A8N a8n = (A8N) obj;
        if (o.LJ(a8n, A8P.LIZ)) {
            A8R a8r2 = (A8R) aObserverS68S0200000_4.l0;
            if (a8r2 != null) {
                PaidContentAnchorExtraModel paidContentAnchorExtraModel = ((PaidContentCustomAnchorViewModel) aObserverS68S0200000_4.l1).LJLJI;
                if (paidContentAnchorExtraModel != null) {
                    str = paidContentAnchorExtraModel.postTitle;
                } else {
                    str = null;
                }
                a8r2.setPricingTitle$anchor_business_release(str);
                return;
            }
            return;
        }
        if (a8n instanceof A8M) {
            A8R a8r3 = (A8R) aObserverS68S0200000_4.l0;
            if (a8r3 == null) {
                return;
            }
            a8r3.setPricingTitle$anchor_business_release(((A8M) a8n).LIZ);
            return;
        }
        if (!(a8n instanceof A8O) || (a8r = (A8R) aObserverS68S0200000_4.l0) == null) {
            return;
        }
        a8r.setPricingTitle$anchor_business_release(((A8O) a8n).LIZ);
    }

    public static final void onChanged$1(AObserverS68S0200000_4 aObserverS68S0200000_4, Object obj) {
        List<SignificantUserInfo> accountProfiles = (List) obj;
        RecyclerView recyclerView = (RecyclerView) aObserverS68S0200000_4.l0;
        ((CheckAccountBottomSheetFragment) aObserverS68S0200000_4.l1).getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        RecyclerView recyclerView2 = (RecyclerView) aObserverS68S0200000_4.l0;
        AVL avl = ((CheckAccountBottomSheetFragment) aObserverS68S0200000_4.l1).LJLIL;
        if (avl != null) {
            recyclerView2.setAdapter(avl);
            CheckAccountBottomSheetFragment checkAccountBottomSheetFragment = (CheckAccountBottomSheetFragment) aObserverS68S0200000_4.l1;
            checkAccountBottomSheetFragment.LJLJI = accountProfiles;
            AVL avl2 = checkAccountBottomSheetFragment.LJLIL;
            if (avl2 != null) {
                o.LJIIIIZZ(accountProfiles, "accountProfiles");
                ((ArrayList) avl2.LJLJJI).clear();
                ((ArrayList) avl2.LJLJJI).addAll(accountProfiles);
                avl2.notifyDataSetChanged();
                C188727au c188727au = new C188727au();
                c188727au.LJFF(AVW.LIZ(accountProfiles), "detail_info");
                c188727au.LIZLLL(accountProfiles.size(), "account_cnt");
                c188727au.LJIIIZ("enter_method", "auto");
                c188727au.LJIIIZ("enter_from", "login_page");
                FMX.LJIIL("account_list_unfold", c188727au.LIZ);
                return;
            }
            o.LJIJI("adapter");
            throw null;
        }
        o.LJIJI("adapter");
        throw null;
    }

    public static final void onChanged$2(AObserverS68S0200000_4 aObserverS68S0200000_4, Object obj) {
        List accountProfiles = (List) obj;
        RecyclerView recyclerView = (RecyclerView) aObserverS68S0200000_4.l0;
        ((ChooseAccountBottomSheetFragment) aObserverS68S0200000_4.l1).getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        RecyclerView recyclerView2 = (RecyclerView) aObserverS68S0200000_4.l0;
        AVM avm = ((ChooseAccountBottomSheetFragment) aObserverS68S0200000_4.l1).LJLIL;
        if (avm != null) {
            recyclerView2.setAdapter(avm);
            AVM avm2 = ((ChooseAccountBottomSheetFragment) aObserverS68S0200000_4.l1).LJLIL;
            if (avm2 != null) {
                o.LJIIIIZZ(accountProfiles, "accountProfiles");
                ((ArrayList) avm2.LJLJJL).clear();
                ((ArrayList) avm2.LJLJJL).addAll(accountProfiles);
                avm2.notifyDataSetChanged();
                C188727au c188727au = new C188727au();
                c188727au.LJFF(AVW.LIZ(accountProfiles), "detail_info");
                c188727au.LIZLLL(accountProfiles.size(), "account_cnt");
                c188727au.LJIIIZ("enter_method", ((ChooseAccountBottomSheetFragment) aObserverS68S0200000_4.l1).vl().LIZIZ);
                c188727au.LJIIIZ("channel", ((ChooseAccountBottomSheetFragment) aObserverS68S0200000_4.l1).vl().LIZJ);
                c188727au.LJIIIZ("enter_from", ((ChooseAccountBottomSheetFragment) aObserverS68S0200000_4.l1).vl().LIZ);
                c188727au.LJIIIZ("channel", ((ChooseAccountBottomSheetFragment) aObserverS68S0200000_4.l1).vl().LIZJ);
                c188727au.LJIIIZ("sdk_name", ((ChooseAccountBottomSheetFragment) aObserverS68S0200000_4.l1).vl().LIZLLL);
                c188727au.LJIIIZ("sdk_version", ((ChooseAccountBottomSheetFragment) aObserverS68S0200000_4.l1).vl().LJ);
                FMX.LJIIL("account_list_unfold", c188727au.LIZ);
                return;
            }
            o.LJIJI("adapter");
            throw null;
        }
        o.LJIJI("adapter");
        throw null;
    }

    public static final void onChanged$3(AObserverS68S0200000_4 aObserverS68S0200000_4, Object obj) {
        String str;
        C254739zB c254739zB = (C254739zB) ((Map) obj).get(Long.valueOf(((CollectionDetailModel) aObserverS68S0200000_4.l0).getCollectionId()));
        if (c254739zB != null) {
            PaidContentCollectionDetailDescriptionAssem paidContentCollectionDetailDescriptionAssem = (PaidContentCollectionDetailDescriptionAssem) aObserverS68S0200000_4.l1;
            CollectionDetailModel collectionDetailModel = (CollectionDetailModel) aObserverS68S0200000_4.l0;
            paidContentCollectionDetailDescriptionAssem.LJLILLLLZI.onNext(c254739zB);
            String curUserId = HG3.LJIILL().getCurUserId();
            User collectionCreator = collectionDetailModel.getCollectionCreator();
            String str2 = null;
            if (collectionCreator != null) {
                str = collectionCreator.getUid();
            } else {
                str = null;
            }
            boolean equals = curUserId.equals(str);
            if (!c254739zB.LJFF && C78685UuP.LJJJZ(c254739zB.LIZLLL)) {
                paidContentCollectionDetailDescriptionAssem.O3(collectionDetailModel, c254739zB.LJ);
            } else if (C7VX.LIZ() && collectionDetailModel.getDiscountedPriceInfo() != null) {
                PriceInfo discountedPriceInfo = collectionDetailModel.getDiscountedPriceInfo();
                if (discountedPriceInfo != null) {
                    str2 = discountedPriceInfo.getPriceInUsd();
                }
                paidContentCollectionDetailDescriptionAssem.O3(collectionDetailModel, str2);
            }
            paidContentCollectionDetailDescriptionAssem.withState(paidContentCollectionDetailDescriptionAssem.E3(), new AqS19S0310000_4(paidContentCollectionDetailDescriptionAssem, equals, collectionDetailModel, c254739zB, 0));
        }
    }

    public AObserverS68S0200000_4(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
