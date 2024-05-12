package com.ss.android.ugc.aweme.im.sdk.relations.ui.fragment;

import X.AbstractC84083Rs;
import X.AbstractC93453ld;
import X.ActivityC45651qj;
import X.C101043xs;
import X.C107114Ih;
import X.C107124Ii;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C29S;
import X.C34B;
import X.C39419FdX;
import X.C3C5;
import X.C3R2;
import X.C3RZ;
import X.C63682Oz0;
import X.C65777Prh;
import X.C73318Sq2;
import X.C73340SqO;
import X.C76800UCe;
import X.C90903hW;
import X.C92723kS;
import X.C92743kU;
import X.C93443lc;
import X.ORZ;
import X.ViewOnTouchListenerC93253lJ;
import Y.AObserverS65S0200000_1;
import Y.AObserverS69S0100000_1;
import Y.IDObjectS174S0100000_1;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.relations.viewmodel.RelationViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class RelationSelectFragment extends AmeBaseFragment {
    public View LJLIL;
    public ViewOnTouchListenerC93253lJ LJLILLLLZI;
    public SharePackage LJLJI;
    public boolean LJLJJI;
    public LinkedHashSet<IMContact> LJLJJL;
    public boolean LJLJJLL;
    public BaseContent LJLJL;
    public Map<String, String> LJLJLJ;
    public boolean LJLJLLL;
    public RelationViewModel LJLLJ;
    public final Map<Integer, View> LJLLL = new LinkedHashMap();
    public boolean LJLL = true;
    public String LJLLI = "";
    public int LJLLILLLL = -1;

    public final void LJIIJJI() {
        C3RZ LJ;
        RelationViewModel relationViewModel = this.LJLLJ;
        if (relationViewModel != null) {
            AbstractC84083Rs abstractC84083Rs = relationViewModel.LJLIL;
            if (!abstractC84083Rs.LJ().LJI && abstractC84083Rs.LJ().LIZ() && (LJ = abstractC84083Rs.LJ()) != null) {
                LJ.LJIIIZ();
            }
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        IDObjectS174S0100000_1 iDObjectS174S0100000_1;
        EditText editText;
        super.onDestroy();
        ViewOnTouchListenerC93253lJ viewOnTouchListenerC93253lJ = this.LJLILLLLZI;
        if (viewOnTouchListenerC93253lJ != null && (iDObjectS174S0100000_1 = viewOnTouchListenerC93253lJ.LJLLILLLL) != null && (editText = viewOnTouchListenerC93253lJ.LJLJL) != null) {
            editText.removeTextChangedListener(iDObjectS174S0100000_1);
        }
        ViewOnTouchListenerC93253lJ viewOnTouchListenerC93253lJ2 = this.LJLILLLLZI;
        if (viewOnTouchListenerC93253lJ2 != null) {
            viewOnTouchListenerC93253lJ2.LJZ = null;
        }
        RelationViewModel relationViewModel = this.LJLLJ;
        if (relationViewModel != null) {
            AbstractC84083Rs abstractC84083Rs = relationViewModel.LJLIL;
            C34B.LJI(abstractC84083Rs.LJLILLLLZI, "unSubscribe");
            abstractC84083Rs.LJLJI = null;
            AbstractC84083Rs abstractC84083Rs2 = relationViewModel.LJLIL;
            abstractC84083Rs2.LJLLILLLL = null;
            ((C73318Sq2) abstractC84083Rs2.LJLLJ.getValue()).LIZLLL();
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLLL).clear();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        AbstractC93453ld abstractC93453ld;
        super.onResume();
        ViewOnTouchListenerC93253lJ viewOnTouchListenerC93253lJ = this.LJLILLLLZI;
        if (viewOnTouchListenerC93253lJ != null && (abstractC93453ld = viewOnTouchListenerC93253lJ.LJLLJ) != null) {
            abstractC93453ld.notifyDataSetChanged();
        }
        RelationViewModel relationViewModel = this.LJLLJ;
        if (relationViewModel != null) {
            List LLJILJILJ = ORZ.LLJILJILJ(relationViewModel.LJLIL.LIZIZ());
            relationViewModel.LJLILLLLZI.setValue(new C92743kU(LLJILJILJ));
            if (!((ArrayList) LLJILJILJ).isEmpty()) {
                relationViewModel.zr0(C65777Prh.LIZIZ(LLJILJILJ), relationViewModel.LJLIL.LJ().LIZ());
            } else {
                relationViewModel.LJLIL.LIZLLL();
            }
        }
    }

    public final void LLIIIL(String keyword) {
        o.LJIIIZ(keyword, "keyword");
        RelationViewModel relationViewModel = this.LJLLJ;
        if (relationViewModel != null) {
            if (keyword.length() == 0) {
                relationViewModel.LJLILLLLZI.setValue(new C92723kS(ORZ.LLJILJILJ(relationViewModel.LJLIL.LIZIZ())));
                return;
            }
            AbstractC84083Rs abstractC84083Rs = relationViewModel.LJLIL;
            keyword.toString();
            abstractC84083Rs.LJIIIIZZ(keyword);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            SharePackage sharePackage = (SharePackage) arguments.getParcelable("share_package");
            this.LJLJI = sharePackage;
            if (sharePackage != null) {
                String string = sharePackage.extras.getString("author_user_name", "");
                o.LJIIIIZZ(string, "mSharePackage!!.extras\n …ing(AUTHOR_USER_NAME, \"\")");
                this.LJLLI = string;
                SharePackage sharePackage2 = this.LJLJI;
                o.LJI(sharePackage2);
                this.LJLLILLLL = sharePackage2.extras.getInt("share_im_limit_tip_type", -1);
            }
            this.LJLJL = (BaseContent) arguments.getSerializable("share_content");
            this.LJLJLJ = (Map) GsonProtectorUtils.fromJson(C63682Oz0.LIZ, arguments.getString("share_ext_map"), new TypeToken<Map<String, ? extends String>>() { // from class: X.2Qw
            }.getType());
            this.LJLJJI = arguments.getBoolean("key_relation_list_use_sort", false);
            this.LJLJJLL = arguments.getBoolean("extra_no_title");
            this.LJLJJL = (LinkedHashSet) arguments.getSerializable("key_selected_contact");
            this.LJLL = arguments.getBoolean("key_include_group_chat", true);
        }
        final boolean LIZIZ = C39419FdX.LIZIZ();
        this.LJLJLLL = LIZIZ;
        final SharePackage sharePackage3 = this.LJLJI;
        final boolean z = this.LJLJJI;
        final boolean z2 = this.LJLL;
        RelationViewModel relationViewModel = (RelationViewModel) ViewModelProviders.of(this, new ViewModelProvider.Factory(sharePackage3, z, LIZIZ, z2) { // from class: X.3Rp
            public final SharePackage LIZ;
            public final boolean LIZIZ;
            public final boolean LIZJ;

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final /* synthetic */ ViewModel create(Class cls, C0VK c0vk) {
                return C09L.LIZIZ(this, cls, c0vk);
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final <T extends ViewModel> T create(Class<T> modelClass) {
                int i;
                AbstractC84083Rs c3r5;
                o.LJIIIZ(modelClass, "modelClass");
                SharePackage sharePackage4 = this.LIZ;
                boolean z3 = this.LIZIZ;
                boolean z4 = this.LIZJ;
                if (sharePackage4 != null) {
                    i = 2;
                } else {
                    i = 0;
                }
                C3R9 c3r9 = new C3R9(i, C3RJ.LIZ(sharePackage4));
                c3r9.LJIIIIZZ = z4;
                c3r9.LJIIJ = !z4;
                if (sharePackage4 != null) {
                    c3r9.LJI = true;
                }
                if (z3) {
                    c3r5 = new C3R2(c3r9);
                } else {
                    c3r5 = new C3R5(c3r9);
                }
                return new RelationViewModel(c3r5);
            }

            {
                this.LIZ = sharePackage3;
                this.LIZIZ = LIZIZ;
                this.LIZJ = z2;
            }
        }).get(RelationViewModel.class);
        this.LJLLJ = relationViewModel;
        if (relationViewModel != null) {
            relationViewModel.LJLIL.LJFF(relationViewModel);
            AbstractC84083Rs abstractC84083Rs = relationViewModel.LJLIL;
            abstractC84083Rs.getClass();
            abstractC84083Rs.LJLLILLLL = relationViewModel;
        }
        RelationViewModel relationViewModel2 = this.LJLLJ;
        if (relationViewModel2 != null) {
            relationViewModel2.LJLILLLLZI.observe(this, new AObserverS65S0200000_1(this, relationViewModel2, 19));
            relationViewModel2.LJLJI.observe(this, new AObserverS69S0100000_1(this, 146));
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ViewGroup viewGroup;
        String str;
        Bundle bundle2;
        Bundle bundle3;
        Bundle bundle4;
        String string;
        Bundle bundle5;
        ViewOnTouchListenerC93253lJ viewOnTouchListenerC93253lJ;
        List<Integer> list;
        List<String> list2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        View view2 = this.LJLIL;
        C107114Ih c107114Ih = null;
        if (C73340SqO.LJJIJ(mo49getActivity()) && view2 != null) {
            if (this.LJLJLLL) {
                ActivityC45651qj mo49getActivity = mo49getActivity();
                o.LJII(mo49getActivity, "null cannot be cast to non-null type android.app.Activity");
                boolean z = this.LJLJJLL;
                RelationViewModel relationViewModel = this.LJLLJ;
                if (relationViewModel != null) {
                    AbstractC84083Rs abstractC84083Rs = relationViewModel.LJLIL;
                    if (abstractC84083Rs instanceof C3R2) {
                        list = ((C3R2) abstractC84083Rs).LJIIJ();
                    } else {
                        list = null;
                    }
                } else {
                    list = null;
                }
                RelationViewModel relationViewModel2 = this.LJLLJ;
                if (relationViewModel2 != null) {
                    AbstractC84083Rs abstractC84083Rs2 = relationViewModel2.LJLIL;
                    if (abstractC84083Rs2 instanceof C3R2) {
                        list2 = ((C3R2) abstractC84083Rs2).LJIIJJI();
                    } else {
                        list2 = null;
                    }
                } else {
                    list2 = null;
                }
                viewOnTouchListenerC93253lJ = new C93443lc(mo49getActivity, view2, z, list, list2);
            } else {
                ActivityC45651qj mo49getActivity2 = mo49getActivity();
                o.LJII(mo49getActivity2, "null cannot be cast to non-null type android.app.Activity");
                viewOnTouchListenerC93253lJ = new ViewOnTouchListenerC93253lJ(mo49getActivity2, view2, this.LJLJJLL);
            }
            this.LJLILLLLZI = viewOnTouchListenerC93253lJ;
        }
        ViewOnTouchListenerC93253lJ viewOnTouchListenerC93253lJ2 = this.LJLILLLLZI;
        if (viewOnTouchListenerC93253lJ2 != null) {
            viewOnTouchListenerC93253lJ2.LJZ = this;
            SharePackage sharePackage = this.LJLJI;
            viewOnTouchListenerC93253lJ2.LJLJI = sharePackage;
            if (sharePackage != null && (bundle5 = sharePackage.extras) != null) {
                str = bundle5.getString("multi_share_msg");
            } else {
                str = null;
            }
            viewOnTouchListenerC93253lJ2.LJLLLLLL = str;
            SharePackage sharePackage2 = viewOnTouchListenerC93253lJ2.LJLJI;
            String str2 = "";
            if (sharePackage2 != null && (bundle4 = sharePackage2.extras) != null && (string = bundle4.getString("aid", "")) != null) {
                str2 = string;
            }
            viewOnTouchListenerC93253lJ2.LJLZ = str2;
            SharePackage sharePackage3 = viewOnTouchListenerC93253lJ2.LJLJI;
            if (sharePackage3 != null && (bundle3 = sharePackage3.extras) != null) {
                bundle3.remove("multi_share_msg");
            }
            SharePackage sharePackage4 = viewOnTouchListenerC93253lJ2.LJLJI;
            if (sharePackage4 != null && (bundle2 = sharePackage4.extras) != null) {
                bundle2.remove("aid");
            }
            if (viewOnTouchListenerC93253lJ2.LJLJI != null) {
                viewOnTouchListenerC93253lJ2.LIZIZ();
            }
            if (viewOnTouchListenerC93253lJ2.LJLJI == null) {
                C101043xs c101043xs = viewOnTouchListenerC93253lJ2.LJLLI;
                if (c101043xs != null) {
                    c101043xs.setTitle(R.string.h94);
                    View rightView = c101043xs.getRightView();
                    if (rightView != null) {
                        rightView.setVisibility(8);
                    }
                    c101043xs.setLeftText(R.string.h4t);
                }
            } else {
                C101043xs c101043xs2 = viewOnTouchListenerC93253lJ2.LJLLI;
                if (c101043xs2 != null) {
                    c101043xs2.setTitle(R.string.h95);
                    View rightView2 = c101043xs2.getRightView();
                    if (rightView2 != null) {
                        rightView2.setVisibility(0);
                    }
                }
                viewOnTouchListenerC93253lJ2.LJIIIZ();
            }
        }
        ViewOnTouchListenerC93253lJ viewOnTouchListenerC93253lJ3 = this.LJLILLLLZI;
        if (viewOnTouchListenerC93253lJ3 != null) {
            viewOnTouchListenerC93253lJ3.LJLJJI = this.LJLJL;
            viewOnTouchListenerC93253lJ3.LJLJJL = this.LJLJLJ;
            LinkedHashSet<IMContact> linkedHashSet = this.LJLJJL;
            if (linkedHashSet != null) {
                AbstractC93453ld abstractC93453ld = viewOnTouchListenerC93253lJ3.LJLLJ;
                if (abstractC93453ld != null) {
                    abstractC93453ld.LJLJJLL = linkedHashSet;
                }
                viewOnTouchListenerC93253lJ3.LJIIIIZZ();
                viewOnTouchListenerC93253lJ3.LJIIL();
                AbstractC93453ld abstractC93453ld2 = viewOnTouchListenerC93253lJ3.LJLLJ;
                if (abstractC93453ld2 != null) {
                    abstractC93453ld2.notifyDataSetChanged();
                }
            }
        }
        if (this.LJLLILLLL > 0 && !TextUtils.isEmpty(this.LJLLI)) {
            ActivityC45651qj mo49getActivity3 = mo49getActivity();
            if (mo49getActivity3 != null) {
                c107114Ih = new C107114Ih(mo49getActivity3);
            }
            View view3 = this.LJLIL;
            if (view3 != null && (viewGroup = (ViewGroup) view3.findViewById(R.id.jti)) != null) {
                viewGroup.addView(c107114Ih);
            }
            C107124Ii c107124Ii = new C107124Ii(this.LJLLI, this.LJLLILLLL, 1);
            if (c107114Ih != null) {
                c107114Ih.LIZJ(c107124Ii);
            }
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        View LLLLIILL;
        o.LJIIIZ(inflater, "inflater");
        if (this.LJLJLLL) {
            LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.b27, viewGroup, false);
        } else {
            LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.b26, viewGroup, false);
        }
        this.LJLIL = LLLLIILL;
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
    }
}
