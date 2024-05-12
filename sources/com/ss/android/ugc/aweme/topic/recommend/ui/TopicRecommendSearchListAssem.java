package com.ss.android.ugc.aweme.topic.recommend.ui;

import X.C184077Kh;
import X.C185817Qz;
import X.C2068389v;
import X.C212428Vi;
import X.C214368bA;
import X.C214378bB;
import X.C214528bQ;
import X.C55230Lly;
import X.C56412MCa;
import X.C57939MoZ;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72808Sho;
import X.C73306Spq;
import X.C78926UyI;
import X.C7PR;
import X.C8W0;
import X.C8YN;
import X.InterfaceC55235Lm3;
import X.InterfaceC65784Pro;
import X.SYL;
import X.TBT;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.detail.prefab.DetailListAssem;
import com.ss.android.ugc.aweme.topic.book.recommend.BookRecommendSearchCell;
import com.ss.android.ugc.aweme.topic.recommend.vm.TopicRecommendListVM;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class TopicRecommendSearchListAssem extends DetailListAssem {
    public final C214378bB LJLLLL;

    @Override // com.ss.android.ugc.aweme.prefab.ListAssem
    public final void Q3() {
        SYL M3 = M3();
        M3.setListConfig(N3());
        AssemListViewModel assemListViewModel = (AssemListViewModel) this.LJLLLL.getValue();
        if (assemListViewModel.state == null) {
            assemListViewModel.setListState(new C72808Sho<>());
        }
        M3.LJLJLLL(((AssemListViewModel) this.LJLLLL.getValue()).getConfig());
        M3().setItemAnimator(null);
        C8YN.LJII(this, (AssemViewModel) this.LJLLLL.getValue(), new TBT() { // from class: X.7Qx
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C184937Np) obj).LJLIL;
            }
        }, null, new AqS185S0100000_3(this, 93), 6);
    }

    public TopicRecommendSearchListAssem() {
        InterfaceC65784Pro LJIILJJIL;
        new LinkedHashMap();
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(this, 1086);
        C65776Prg LIZ = C65352Pkq.LIZ(TopicRecommendListVM.class);
        C185817Qz c185817Qz = C185817Qz.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJIILJJIL = new AqS153S0100000_3((C8W0) this, 1085);
        } else {
            LJIILJJIL = C78926UyI.LJIILJJIL(this, true);
        }
        this.LJLLLL = new C214378bB(LIZ, aqS153S0100000_3, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, c185817Qz, LJIILJJIL, C78926UyI.LJIIZILJ(this, true));
    }

    @Override // com.ss.android.ugc.aweme.prefab.ListAssem
    public final C57939MoZ N3() {
        C57939MoZ c57939MoZ = new C57939MoZ();
        c57939MoZ.LIZIZ = true;
        c57939MoZ.LJII = true;
        c57939MoZ.LIZ = 5;
        return c57939MoZ;
    }

    @Override // com.ss.android.ugc.aweme.prefab.ListAssem
    public final AssemListViewModel P3() {
        return (AssemListViewModel) this.LJLLLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.detail.prefab.DetailListAssem, com.ss.android.ugc.aweme.prefab.ListAssem, com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Integer num;
        String str;
        String str2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        Object obj = getConfig().LJ.get("topic_type");
        Integer num2 = null;
        if (obj instanceof Integer) {
            num = (Integer) obj;
        } else {
            num = null;
        }
        C7PR c7pr = C7PR.BOOK;
        int type = c7pr.getType();
        if (num != null && num.intValue() == type) {
            C73306Spq L3 = L3();
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_large_magnify_glass;
            c2068389v.LJ = Integer.valueOf(R.attr.gp);
            L3.LIZJ = 0;
            L3.LIZIZ = c2068389v;
            Object obj2 = getConfig().LJ.get("empty_title");
            if (obj2 instanceof String) {
                str = (String) obj2;
            } else {
                str = null;
            }
            String str3 = "";
            if (str == null) {
                str = "";
            }
            L3.LJFF = str;
            Object obj3 = getConfig().LJ.get("empty_desc");
            if ((obj3 instanceof String) && (str2 = (String) obj3) != null) {
                str3 = str2;
            }
            L3.LJI = str3;
        }
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            InterfaceC55235Lm3 LIZJ = C55230Lly.LIZJ(LIZLLL, null);
            Object obj4 = getConfig().LJ.get("topic_type");
            if (obj4 instanceof Integer) {
                num2 = (Integer) obj4;
            }
            int type2 = c7pr.getType();
            if (num2 != null && num2.intValue() == type2) {
                M3().LLLF.LJZL(BookRecommendSearchCell.class);
            }
            SYL M3 = M3();
            getContext();
            M3.setLayoutManager(new LinearLayoutManager(1, false));
            M3().setLifecycleOwner(this);
            AssemViewModel assemViewModel = (AssemViewModel) this.LJLLLL.getValue();
            C56412MCa c56412MCa = new C56412MCa();
            c56412MCa.LIZ = true;
            assemViewModel.asyncSubscribe(new TBT() { // from class: X.7Qy
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj5) {
                    C184937Np c184937Np = (C184937Np) obj5;
                    c184937Np.getClass();
                    return C208708Ha.LIZLLL(c184937Np);
                }
            }, c56412MCa, this, new AqS169S0100000_3(LIZJ, 496), new AqS153S0100000_3(LIZJ, 1084), new AqS134S0200000_3(this, LIZJ, 158));
            R3();
            U3();
        }
    }
}
