package com.bytedance.android.livesdk.impl.revenue.subscription.ui;

import X.ActivityC45651qj;
import X.BZI;
import X.C10A;
import X.C141335gf;
import X.C15380j0;
import X.C16880lQ;
import X.C1B3;
import X.C1B6;
import X.C28546BIg;
import X.C28787BRn;
import X.C29306Beo;
import X.C29S;
import X.C30869C9p;
import X.C3C5;
import X.C61712OJw;
import X.C61713OJx;
import X.C73943T0h;
import X.C76800UCe;
import X.C90903hW;
import X.CN1;
import X.EnumC28543BId;
import X.EnumC28545BIf;
import X.InterfaceC73984T1w;
import Y.ACListenerS25S0100000_5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class SubOnlyVideoListFragment extends Fragment implements InterfaceC73984T1w {
    public boolean LJLIL;
    public long LJLILLLLZI;
    public String LJLJI;
    public String LJLJJI;
    public LiveIconView LJLJJL;
    public LiveIconView LJLJJLL;
    public Integer LJLJL;

    public SubOnlyVideoListFragment() {
        new LinkedHashMap();
        this.LJLJI = "";
        this.LJLJJI = "";
    }

    @Override // X.InterfaceC73984T1w
    public final boolean onBackPressed() {
        int i;
        List<Fragment> LJJJJLI;
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager != null && (LJJJJLI = fragmentManager.LJJJJLI()) != null) {
            i = LJJJJLI.size();
        } else {
            i = 0;
        }
        if (i <= 1) {
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity != null) {
                mo49getActivity.finish();
            }
        } else {
            C73943T0h.LIZ().LIZIZ(new C28546BIg(EnumC28543BId.SUB_ONLY_VIDEO_PAGE, EnumC28545BIf.CLOSE, (String) null, 12));
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        Integer num = this.LJLJL;
        if (num != null) {
            int intValue = num.intValue();
            C61713OJx LIZIZ = C61712OJw.LIZIZ(this);
            LIZIZ.LIZIZ.LJIIJ(true);
            LIZIZ.LJIIIIZZ(intValue);
            LIZIZ.LIZJ();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.LJLIL = arguments.getBoolean("is_author", false);
            this.LJLILLLLZI = arguments.getLong("user_id", 0L);
            String string = arguments.getString("sec_user_id", "");
            o.LJIIIIZZ(string, "it.getString(SEC_USER_ID, \"\")");
            this.LJLJI = string;
            String string2 = arguments.getString("enter_from", "");
            o.LJIIIIZZ(string2, "it.getString(ENTER_FROM, \"\")");
            this.LJLJJI = string2;
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        C1B3 LIZ = C1B6.LIZ(childFragmentManager, childFragmentManager);
        LIZ.LJIIIIZZ(R.id.dm7, 1, ((IHostAction) CN1.LIZ(IHostAction.class)).getSubOnlyVideoContentFragment(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI), null);
        LIZ.LJIILJJIL();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Integer num;
        Window window;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LJLJJL = (LiveIconView) view.findViewById(R.id.aeg);
        LiveIconView liveIconView = (LiveIconView) view.findViewById(R.id.d4s);
        this.LJLJJLL = liveIconView;
        if (!this.LJLIL) {
            C29306Beo.LJI(liveIconView);
        }
        LiveIconView liveIconView2 = this.LJLJJL;
        if (liveIconView2 != null) {
            C16880lQ.LJJII(liveIconView2, new ACListenerS25S0100000_5(this, 173));
        }
        LiveIconView liveIconView3 = this.LJLJJLL;
        if (liveIconView3 != null) {
            C16880lQ.LJJII(liveIconView3, new ACListenerS25S0100000_5(this, 174));
        }
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (window = mo49getActivity.getWindow()) != null) {
            num = Integer.valueOf(window.getStatusBarColor());
        } else {
            num = null;
        }
        this.LJLJL = num;
        C61713OJx LIZIZ = C61712OJw.LIZIZ(this);
        LIZIZ.LIZIZ.LJIIJ(true);
        LIZIZ.LJIIIIZZ(C15380j0.LIZIZ(R.color.abc));
        LIZIZ.LIZJ();
        BZI LIZ = C28787BRn.LIZ("livesdk_sub_only_video_page_show");
        LIZ.LJIJJ(this.LJLJJI, "enter_from");
        C30869C9p.LIZ(this.LJLILLLLZI, LIZ, "anchor_id");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.d5l, viewGroup, false);
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
