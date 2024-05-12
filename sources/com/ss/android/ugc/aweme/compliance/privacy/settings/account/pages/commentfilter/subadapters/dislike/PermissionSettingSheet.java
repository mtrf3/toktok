package com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.commentfilter.subadapters.dislike;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C188727au;
import X.C234529Ii;
import X.C235119Kp;
import X.C29S;
import X.C3C5;
import X.C66647QDr;
import X.C71942SLi;
import X.C76800UCe;
import X.C90903hW;
import X.C9KF;
import X.FMX;
import X.InterfaceC219588ja;
import X.SKL;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class PermissionSettingSheet extends Fragment implements InterfaceC219588ja {
    public static final /* synthetic */ int LJLJL = 0;
    public String LJLIL;
    public boolean LJLILLLLZI;
    public Integer LJLJI;
    public PermissionSettingItemViewModel LJLJJI;
    public int LJLJJL;
    public final Map<Integer, View> LJLJJLL = new LinkedHashMap();

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.InterfaceC219588ja
    public final C235119Kp createNavActions() {
        C235119Kp c235119Kp = new C235119Kp();
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_x_mark_small;
        LIZJ.LIZIZ(new AqS162S0100000_12(this, 176));
        c235119Kp.LIZIZ(LIZJ);
        String str = this.LJLIL;
        if (str != null) {
            C9KF c9kf = new C9KF();
            c9kf.LIZJ = str;
            c235119Kp.LIZJ = c9kf;
        }
        return c235119Kp;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJJLL).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        PermissionSettingItemViewModel permissionSettingItemViewModel;
        int intValue;
        int intValue2;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.LJLIL = arguments.getString("title");
            this.LJLILLLLZI = arguments.getBoolean("controlFlag");
            this.LJLJI = Integer.valueOf(arguments.getInt("settingType", 1));
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity == null) {
                mo49getActivity = this;
            }
            PermissionSettingViewModel permissionSettingViewModel = (PermissionSettingViewModel) new ViewModelProvider(mo49getActivity).get(PermissionSettingViewModel.class);
            Integer num = this.LJLJI;
            if (num != null && (intValue2 = num.intValue()) != 1) {
                if (intValue2 != 2) {
                    if (intValue2 != 3) {
                        permissionSettingItemViewModel = permissionSettingViewModel.LJLIL;
                    } else {
                        permissionSettingItemViewModel = permissionSettingViewModel.LJLILLLLZI;
                    }
                } else {
                    permissionSettingItemViewModel = permissionSettingViewModel.LJLJI;
                }
            } else {
                permissionSettingItemViewModel = permissionSettingViewModel.LJLIL;
            }
            this.LJLJJI = permissionSettingItemViewModel;
            if (permissionSettingItemViewModel != null) {
                permissionSettingItemViewModel.mv0(new SKL(this));
                PermissionSettingItemViewModel permissionSettingItemViewModel2 = this.LJLJJI;
                if (permissionSettingItemViewModel2 != null) {
                    Integer value = permissionSettingItemViewModel2.LJLJI.getValue();
                    if (value == null) {
                        intValue = 0;
                    } else {
                        intValue = value.intValue();
                    }
                    this.LJLJJL = intValue;
                    return;
                }
                o.LJIJI("viewModel");
                throw null;
            }
            o.LJIJI("viewModel");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        getContext();
        ((RecyclerView) _$_findCachedViewById(R.id.ftq)).setLayoutManager(new WrapLinearLayoutManager(1));
        String str2 = null;
        ((RecyclerView) _$_findCachedViewById(R.id.ftq)).setItemAnimator(null);
        ((RecyclerView) _$_findCachedViewById(R.id.ftq)).setAdapter(new C71942SLi(this));
        if (this.LJLILLLLZI) {
            str2 = getString(R.string.dik);
        }
        TextView textView = (TextView) _$_findCachedViewById(R.id.lgi);
        if (textView != null) {
            if (str2 == null || str2.length() == 0) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(str2);
            }
        }
        Integer num = this.LJLJI;
        int i = this.LJLJJL;
        if (num == null) {
            return;
        }
        if (num.intValue() == 1) {
            str = "comment_filter_offensive_show";
        } else if (num.intValue() == 2) {
            str = "comment_filter_profanity_show";
        } else if (num.intValue() != 3) {
            return;
        } else {
            str = "comment_filter_advertisements_show";
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("original_level", C66647QDr.LIZ(i));
        FMX.LJIIL(str, c188727au.LIZ);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.ahl, viewGroup, false);
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
