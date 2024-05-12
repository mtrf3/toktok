package com.ss.android.ugc.aweme.video;

import X.AbstractC029409q;
import X.AbstractC030309z;
import X.AbstractC72278SYg;
import X.ActivityC45651qj;
import X.C0A2;
import X.C10A;
import X.C113554cx;
import X.C141335gf;
import X.C15490jB;
import X.C16880lQ;
import X.C187227Wk;
import X.C223338pd;
import X.C29S;
import X.C2NU;
import X.C3C5;
import X.C50420Jqa;
import X.C57939MoZ;
import X.C62646OiI;
import X.C72808Sho;
import X.C73024SlI;
import X.C73026SlK;
import X.C76800UCe;
import X.C90903hW;
import X.CFX;
import X.CN1;
import X.EnumC73023SlH;
import X.InterfaceC57784Mm4;
import X.InterfaceC73019SlD;
import X.OSZ;
import X.QD3;
import X.SY4;
import X.SYL;
import X.TBR;
import X.TBT;
import Y.ACListenerS32S0100000_12;
import Y.IDcS6S0200000_1;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.SharedViewModelProvider;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdk.api.revenue.subscription.event.OpenNewRecordPage;
import com.bytedance.android.livesdk.api.revenue.subscription.event.SubOnlyVideoDeleteEvent;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.ies.powerlist.PowerAdapter;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.video.model.SubOnlyVideoViewModel;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes13.dex */
public final class SubOnlyVideoContentFragment extends Fragment implements InterfaceC73019SlD {
    public static final /* synthetic */ int LJLLL = 0;
    public boolean LJLIL;
    public long LJLILLLLZI;
    public View LJLJJL;
    public View LJLJJLL;
    public View LJLJL;
    public View LJLJLJ;
    public View LJLJLLL;
    public SYL LJLL;
    public SubOnlyVideoViewModel LJLLI;
    public boolean LJLLILLLL;
    public final Map<Integer, View> LJLLJ = new LinkedHashMap();
    public String LJLJI = "";
    public String LJLJJI = "";

    @Override // X.InterfaceC73019SlD
    public final C73026SlK LJJJIL() {
        SYL syl = this.LJLL;
        if (syl != null) {
            return new C73026SlK(syl, new C73024SlI(this));
        }
        return null;
    }

    public final void wl() {
        if (o.LJ(this.LJLJJI, "live_take_page")) {
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity != null) {
                mo49getActivity.finish();
            }
            DataChannelGlobal.LJLJJI.sv0(OpenNewRecordPage.class, C113554cx.LJJL(new OSZ("type", "sub_only_video"), new OSZ("need_mob_shoot", "1")));
            return;
        }
        ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(getContext(), UriProtector.parse("aweme://openRecord").buildUpon().appendQueryParameter("type", "sub_only_video").appendQueryParameter("need_mob_shoot", "1").build());
    }

    public final void xl() {
        C223338pd c223338pd;
        View view = this.LJLJJLL;
        if (view != null && (c223338pd = (C223338pd) view.findViewById(R.id.lud)) != null) {
            c223338pd.LIZJ();
        }
        View view2 = this.LJLJJLL;
        if (view2 == null) {
            return;
        }
        view2.setVisibility(8);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZJ().LJIJ(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLLJ).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.LJLLILLLL) {
            vl();
            this.LJLLILLLL = false;
        }
    }

    public final void vl() {
        C72808Sho<InterfaceC57784Mm4> state;
        if (getContext() != null) {
            if (!C2NU.LIZ.LIZIZ()) {
                Al(EnumC73023SlH.NETWORK_ERROR);
                return;
            }
        }
        final SubOnlyVideoViewModel subOnlyVideoViewModel = this.LJLLI;
        if (subOnlyVideoViewModel != null) {
            SYL syl = this.LJLL;
            if (syl != null && (state = syl.getState()) != null) {
                subOnlyVideoViewModel.setListState(state);
            }
            SYL syl2 = this.LJLL;
            if (syl2 != null) {
                syl2.LJLJLLL((AbstractC72278SYg) new TBR(subOnlyVideoViewModel) { // from class: X.SlJ
                    @Override // X.TBR, X.AbstractC74222TBa, X.InterfaceC74226TBe
                    public final Object get() {
                        return ((AssemListViewModel) this.receiver).getConfig();
                    }
                }.get());
            }
        }
    }

    public final void Al(EnumC73023SlH enumC73023SlH) {
        C223338pd c223338pd;
        int ordinal = enumC73023SlH.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        return;
                    }
                    View view = this.LJLJJLL;
                    if (view != null) {
                        view.setVisibility(0);
                    }
                    View view2 = this.LJLJJLL;
                    if (view2 != null && (c223338pd = (C223338pd) view2.findViewById(R.id.lud)) != null) {
                        c223338pd.LIZIZ();
                    }
                    View view3 = this.LJLJJL;
                    if (view3 != null) {
                        view3.setVisibility(0);
                    }
                    View view4 = this.LJLJLLL;
                    if (view4 != null) {
                        view4.setVisibility(8);
                    }
                    View view5 = this.LJLJLJ;
                    if (view5 != null) {
                        view5.setVisibility(8);
                    }
                    View view6 = this.LJLJL;
                    if (view6 == null) {
                        return;
                    }
                    view6.setVisibility(8);
                    return;
                }
                xl();
                View view7 = this.LJLJJL;
                if (view7 != null) {
                    view7.setVisibility(0);
                }
                View view8 = this.LJLJLLL;
                if (view8 != null) {
                    view8.setVisibility(8);
                }
                View view9 = this.LJLJLJ;
                if (view9 != null) {
                    view9.setVisibility(8);
                }
                View view10 = this.LJLJL;
                if (view10 == null) {
                    return;
                }
                view10.setVisibility(0);
                return;
            }
            xl();
            View view11 = this.LJLJJL;
            if (view11 != null) {
                view11.setVisibility(0);
            }
            View view12 = this.LJLJLLL;
            if (view12 != null) {
                view12.setVisibility(8);
            }
            View view13 = this.LJLJL;
            if (view13 != null) {
                view13.setVisibility(8);
            }
            View view14 = this.LJLJLJ;
            if (view14 == null) {
                return;
            }
            view14.setVisibility(0);
            return;
        }
        xl();
        View view15 = this.LJLJJL;
        if (view15 != null) {
            view15.setVisibility(8);
        }
        View view16 = this.LJLJLJ;
        if (view16 != null) {
            view16.setVisibility(8);
        }
        View view17 = this.LJLJL;
        if (view17 != null) {
            view17.setVisibility(8);
        }
        View view18 = this.LJLJLLL;
        if (view18 != null) {
            view18.setVisibility(0);
        }
        SYL syl = this.LJLL;
        if (syl == null) {
            return;
        }
        syl.LJLI(0);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        GridLayoutManager gridLayoutManager;
        o.LJIIIZ(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        SYL syl = this.LJLL;
        if (syl != null) {
            C0A2 layoutManager = syl.getLayoutManager();
            if ((layoutManager instanceof GridLayoutManager) && (gridLayoutManager = (GridLayoutManager) layoutManager) != null) {
                gridLayoutManager.LLJLIL(3);
            }
            syl.LJJJJZI();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.LJLIL = arguments.getBoolean("is_author");
            this.LJLILLLLZI = arguments.getLong("user_id");
            String string = arguments.getString("sec_user_id", "");
            o.LJIIIIZZ(string, "it.getString(SEC_USER_ID, \"\")");
            this.LJLJI = string;
            String string2 = arguments.getString("enter_from", "");
            o.LJIIIIZZ(string2, "it.getString(ENTER_FROM, \"\")");
            this.LJLJJI = string2;
        }
        Lifecycle lifecycle = getLifecycle();
        o.LJIIIIZZ(lifecycle, "lifecycle");
        SubOnlyVideoViewModel subOnlyVideoViewModel = (SubOnlyVideoViewModel) new SharedViewModelProvider((ViewModelProvider.Factory) null, 1, (DefaultConstructorMarker) null).get(lifecycle, "sub_only_video", SubOnlyVideoViewModel.class);
        subOnlyVideoViewModel.LJLIL = this.LJLIL;
        subOnlyVideoViewModel.LJLILLLLZI = this.LJLILLLLZI;
        String str = this.LJLJI;
        o.LJIIIZ(str, "<set-?>");
        subOnlyVideoViewModel.LJLJI = str;
        String str2 = this.LJLJJI;
        o.LJIIIZ(str2, "<set-?>");
        subOnlyVideoViewModel.LJLJJI = str2;
        subOnlyVideoViewModel.initialize(this);
        this.LJLLI = subOnlyVideoViewModel;
        EventBus.LIZJ().LJIILJJIL(this);
    }

    @QD3
    public final void onMyEnterpriseProfileEvent(C62646OiI event) {
        o.LJIIIZ(event, "event");
        this.LJLLILLLL = true;
    }

    @QD3
    public final void onPrivateModelEvent(C187227Wk event) {
        o.LJIIIZ(event, "event");
        if (event.LJLILLLLZI != null) {
            this.LJLLILLLL = true;
        }
    }

    @QD3
    public final void onVideoEvent(C50420Jqa event) {
        o.LJIIIZ(event, "event");
        if (event.LJLIL == 2) {
            this.LJLLILLLL = true;
            DataChannelGlobal.LJLJJI.rv0(SubOnlyVideoDeleteEvent.class);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        View findViewById;
        View findViewById2;
        SY4 sy4;
        View findViewById3;
        SY4 sy42;
        SY4 sy43;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LJLJJL = view.findViewById(R.id.cd4);
        this.LJLJJLL = ((ViewStub) view.findViewById(R.id.g8c)).inflate();
        Al(EnumC73023SlH.LOADING);
        View inflate = ((ViewStub) view.findViewById(R.id.gyu)).inflate();
        this.LJLJL = inflate;
        if (inflate != null && (sy43 = (SY4) inflate.findViewById(R.id.izm)) != null) {
            C16880lQ.LJJIZ(sy43, new ACListenerS32S0100000_12(this, 84));
        }
        View view2 = this.LJLJL;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        View inflate2 = ((ViewStub) view.findViewById(R.id.cvt)).inflate();
        this.LJLJLJ = inflate2;
        if (inflate2 != null && (sy42 = (SY4) inflate2.findViewById(R.id.byf)) != null) {
            C16880lQ.LJJIZ(sy42, new ACListenerS32S0100000_12(this, 86));
        }
        View view3 = this.LJLJLJ;
        if (view3 != null && (findViewById3 = view3.findViewById(R.id.cve)) != null) {
            C15490jB.LJ(findViewById3, CFX.LIZ("tiktok_live_broadcast_resource", "tiktok_live_broadcast_demand_1"), "live_sub_only_video_empty_list_pic.png");
        }
        View view4 = this.LJLJLJ;
        if (view4 != null) {
            view4.setVisibility(8);
        }
        View inflate3 = ((ViewStub) view.findViewById(R.id.n6i)).inflate();
        this.LJLJLLL = inflate3;
        SYL syl = null;
        if (inflate3 != null) {
            syl = (SYL) inflate3.findViewById(R.id.n6g);
        }
        this.LJLL = syl;
        View view5 = this.LJLJLLL;
        if (view5 != null && (sy4 = (SY4) view5.findViewById(R.id.byf)) != null) {
            C16880lQ.LJJIZ(sy4, new ACListenerS32S0100000_12(this, 85));
        }
        if (!this.LJLIL) {
            View view6 = this.LJLJLLL;
            if (view6 != null && (findViewById2 = view6.findViewById(R.id.byk)) != null) {
                findViewById2.setVisibility(8);
            }
            View view7 = this.LJLJLLL;
            if (view7 != null && (findViewById = view7.findViewById(R.id.byx)) != null) {
                findViewById.setVisibility(8);
            }
        }
        SYL syl2 = this.LJLL;
        if (syl2 != null) {
            syl2.LJII(new AbstractC030309z() { // from class: X.4mp
                @Override // X.AbstractC030309z
                public final void LJ(Rect rect, View view8, RecyclerView recyclerView, C0AC c0ac) {
                    int i;
                    int LIZJ = C1JX.LIZJ(rect, "outRect", view8, "view", recyclerView, "parent", c0ac, "state", view8);
                    int i2 = 1;
                    if (LIZJ % 3 == 1) {
                        rect.left = C15380j0.LIZ(1.0f);
                        rect.right = C15380j0.LIZ(1.0f);
                    } else {
                        rect.left = 0;
                        rect.right = 0;
                    }
                    GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                    if (gridLayoutManager != null) {
                        i2 = gridLayoutManager.LLIIIL;
                    }
                    if (LIZJ < i2) {
                        rect.top = 0;
                    } else {
                        rect.top = C15380j0.LIZ(1.0f);
                    }
                    C0A2 layoutManager = recyclerView.getLayoutManager();
                    if (layoutManager != null) {
                        i = layoutManager.LJJJJZ();
                    } else {
                        i = i2;
                    }
                    if (LIZJ >= i - i2) {
                        rect.bottom = 0;
                    } else {
                        rect.top = C15380j0.LIZ(1.0f);
                    }
                }
            }, -1);
            getContext();
            WrapGridLayoutManager wrapGridLayoutManager = new WrapGridLayoutManager(3, 1, false);
            wrapGridLayoutManager.LLIILII = new IDcS6S0200000_1(syl2, wrapGridLayoutManager, 1);
            syl2.setLayoutManager(wrapGridLayoutManager);
            syl2.LLLF.LJZL(SubOnlyVideoItemCell.class);
            C57939MoZ c57939MoZ = new C57939MoZ();
            c57939MoZ.LIZIZ = true;
            c57939MoZ.LIZ = 2;
            c57939MoZ.LIZJ = SubOnlyVideoFooterCell.class;
            syl2.setListConfig(c57939MoZ);
            AbstractC029409q adapter = syl2.getAdapter();
            o.LJII(adapter, "null cannot be cast to non-null type com.bytedance.ies.powerlist.PowerAdapter");
            ((PowerAdapter) adapter).LLF(this, SubOnlyVideoContentFragment.class);
        }
        SubOnlyVideoViewModel subOnlyVideoViewModel = this.LJLLI;
        if (subOnlyVideoViewModel != null) {
            AssemViewModel.asyncSubscribe$default(subOnlyVideoViewModel, new TBT() { // from class: X.7U5
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    C7U4 c7u4 = (C7U4) obj;
                    c7u4.getClass();
                    return C208708Ha.LIZLLL(c7u4);
                }
            }, null, new AqS178S0100000_12(this, 299), new AqS162S0100000_12(this, 923), new AqS178S0100000_12(this, 300), 2, null);
        }
        View view8 = this.LJLJLLL;
        if (view8 != null) {
            view8.setVisibility(8);
        }
        vl();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.bpf, viewGroup, false);
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
