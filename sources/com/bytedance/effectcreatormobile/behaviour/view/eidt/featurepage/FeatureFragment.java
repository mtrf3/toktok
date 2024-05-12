package com.bytedance.effectcreatormobile.behaviour.view.eidt.featurepage;

import X.C16880lQ;
import X.C1C8;
import X.C221108m2;
import X.C62822Ol8;
import X.C93624aTs;
import X.C93745aVp;
import X.C93750aVu;
import X.C94069ab3;
import X.C94071ab5;
import X.C94192ad2;
import X.C94419agh;
import X.EnumC93441aQv;
import X.InterfaceC06750Oh;
import Y.IDObserverS227S0100000_42;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.effectcreatormobile.behaviour.base.BehaviourBaseFragment;
import com.bytedance.effectcreatormobile.behaviour.viewmodel.EditViewModel;
import com.bytedance.effectcreatormobile.behaviour.viewmodel.FeatureViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.IDqS419S0100000_42;
import kotlin.jvm.internal.IDqS423S0100000_42;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class FeatureFragment extends BehaviourBaseFragment<C94192ad2> {
    public static final /* synthetic */ int LJLJL = 0;
    public final C62822Ol8 LJLJI = C93745aVp.LIZJ(this, FeatureViewModel.class);
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new IDqS423S0100000_42(this, 13));
    public final C94069ab3 LJLJJL = new C94069ab3(this);
    public final C94071ab5 LJLJJLL = new C94071ab5(this);

    public final EditViewModel Gl() {
        return (EditViewModel) this.LJLJJI.getValue();
    }

    public final FeatureViewModel Hl() {
        return (FeatureViewModel) this.LJLJI.getValue();
    }

    public final boolean Il() {
        EnumC93441aQv enumC93441aQv;
        C93624aTs<EnumC93441aQv> c93624aTs;
        MutableLiveData<EnumC93441aQv> mutableLiveData;
        EditViewModel Gl = Gl();
        if (Gl != null && (c93624aTs = Gl.LJLJI) != null && (mutableLiveData = c93624aTs.LIZ) != null) {
            enumC93441aQv = mutableLiveData.getValue();
        } else {
            enumC93441aQv = null;
        }
        if (enumC93441aQv == EnumC93441aQv.VIEW_TYPE_TRIGGER_EXTRA) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.effectcreatormobile.behaviour.base.BehaviourBaseFragment
    public final InterfaceC06750Oh Dl(LayoutInflater inflater, ViewGroup viewGroup) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.dv1, viewGroup, false);
        int i = R.id.f2l;
        if (LLLLIILL.findViewById(R.id.f2l) != null) {
            i = R.id.h0y;
            View findViewById = LLLLIILL.findViewById(R.id.h0y);
            if (findViewById != null) {
                i = R.id.noq;
                RelativeLayout relativeLayout = (RelativeLayout) LLLLIILL.findViewById(R.id.noq);
                if (relativeLayout != null) {
                    i = R.id.not;
                    RecyclerView recyclerView = (RecyclerView) LLLLIILL.findViewById(R.id.not);
                    if (recyclerView != null) {
                        i = R.id.now;
                        RecyclerView recyclerView2 = (RecyclerView) LLLLIILL.findViewById(R.id.now);
                        if (recyclerView2 != null) {
                            i = R.id.npl;
                            AppCompatTextView appCompatTextView = (AppCompatTextView) LLLLIILL.findViewById(R.id.npl);
                            if (appCompatTextView != null) {
                                i = R.id.nq1;
                                if (LLLLIILL.findViewById(R.id.nq1) != null) {
                                    i = R.id.mo5;
                                    if (LLLLIILL.findViewById(R.id.mo5) != null) {
                                        return new C94192ad2((ConstraintLayout) LLLLIILL, findViewById, relativeLayout, recyclerView, recyclerView2, appCompatTextView);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(LLLLIILL.getResources().getResourceName(i)));
    }

    @Override // com.bytedance.effectcreatormobile.behaviour.base.BehaviourBaseFragment
    public final void xl(View view, Bundle bundle) {
        RecyclerView recyclerView;
        View view2;
        C93624aTs<EnumC93441aQv> c93624aTs;
        MutableLiveData<EnumC93441aQv> mutableLiveData;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        RecyclerView recyclerView4;
        RecyclerView recyclerView5;
        o.LJIIIZ(view, "view");
        C94192ad2 Al = Al();
        if (Al != null && (recyclerView5 = Al.LJLJJL) != null) {
            getContext();
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
            linearLayoutManager.LLJJIII(1);
            recyclerView5.setLayoutManager(linearLayoutManager);
        }
        C94192ad2 Al2 = Al();
        if (Al2 != null && (recyclerView4 = Al2.LJLJJL) != null) {
            recyclerView4.setAdapter(this.LJLJJL);
        }
        C94192ad2 Al3 = Al();
        if (Al3 != null && (recyclerView3 = Al3.LJLJJI) != null) {
            getContext();
            LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager();
            linearLayoutManager2.LLJJIII(0);
            recyclerView3.setLayoutManager(linearLayoutManager2);
        }
        C94192ad2 Al4 = Al();
        if (Al4 != null && (recyclerView2 = Al4.LJLJJI) != null) {
            recyclerView2.setAdapter(this.LJLJJLL);
        }
        C1C8 c1c8 = new C1C8(new C94419agh(this));
        C94192ad2 Al5 = Al();
        if (Al5 != null) {
            recyclerView = Al5.LJLJJI;
        } else {
            recyclerView = null;
        }
        c1c8.LJII(recyclerView);
        Hl().LJLILLLLZI.LIZ.observe(getViewLifecycleOwner(), new IDObserverS227S0100000_42(this, 17));
        EditViewModel Gl = Gl();
        if (Gl != null && (c93624aTs = Gl.LJLJI) != null && (mutableLiveData = c93624aTs.LIZ) != null) {
            mutableLiveData.observe(getViewLifecycleOwner(), new IDObserverS227S0100000_42(this, 18));
        }
        Hl().LJLJI.LIZ.observe(getViewLifecycleOwner(), new IDObserverS227S0100000_42(this, 19));
        C94192ad2 Al6 = Al();
        if (Al6 != null && (view2 = Al6.LJLILLLLZI) != null) {
            C93750aVu.LIZIZ(view2, new IDqS419S0100000_42(this, 70));
        }
        wl(new IDqS423S0100000_42(this, LiveTryModeCountDownThresholdSetting.DEFAULT));
    }
}
