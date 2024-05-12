package com.ss.android.ugc.aweme.mix.addfeed;

import X.AbstractC029409q;
import X.AbstractC72278SYg;
import X.ActivityC45651qj;
import X.C02Y;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C1B3;
import X.C1DI;
import X.C221108m2;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C29S;
import X.C2P7;
import X.C3C5;
import X.C42555Gn1;
import X.C48203Ivv;
import X.C62822Ol8;
import X.C63081OpJ;
import X.C65352Pkq;
import X.C73305Spp;
import X.C73306Spq;
import X.C73312Spw;
import X.C76800UCe;
import X.C79594VLq;
import X.C85428Xfs;
import X.C85429Xft;
import X.C85430Xfu;
import X.C85432Xfw;
import X.C85436Xg0;
import X.C90903hW;
import X.C9KF;
import X.InterfaceC62865Olp;
import X.InterfaceC74236TBo;
import X.InterfaceC85435Xfz;
import X.OSZ;
import X.QD3;
import X.SY4;
import X.SYL;
import X.T35;
import X.T3D;
import X.TBT;
import X.VN9;
import X.ViewOnTouchListenerC85434Xfy;
import X.WIP;
import Y.ACListenerS35S0100000_15;
import Y.ACListenerS49S0200000_15;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.powerlist.PowerAdapter;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.ies.powerlist.page.config.PowerPageSource;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mix.addfeed.viewmodel.GetMixListViewModel;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.servicimpl.SplitVideoServiceImpl;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS157S0200000_10;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import q03.IDaS203S0200000_10;

/* loaded from: classes16.dex */
public final class AddFeedToMixFragment extends Fragment implements InterfaceC85435Xfz {
    public static final /* synthetic */ int LJLZ = 0;
    public Aweme LJLILLLLZI;
    public boolean LJLJJL;
    public InterfaceC62865Olp LJLJJLL;
    public boolean LJLL;
    public C235119Kp LJLLI;
    public boolean LJLLILLLL;
    public T3D LJLLJ;
    public final Map<Integer, View> LJLLLLLL = new LinkedHashMap();
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 324));
    public String LJLJI = "";
    public String LJLJJI = "";
    public String LJLJL = "";
    public String LJLJLJ = "";
    public String LJLJLLL = "";
    public final C62822Ol8 LJLLL = C221108m2.LIZIZ(C85432Xfw.LJLIL);
    public final AqS181S0100000_15 LJLLLL = new AqS181S0100000_15(this, 76);

    public final void Al() {
        this.LJLLILLLL = false;
        ((C73305Spp) _$_findCachedViewById(R.id.w4)).LJFF();
        ((PowerPageSource) wl().LJLLI.getValue()).getOperator().refresh();
    }

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLLLLL;
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

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        T3D t3d = this.LJLLJ;
        if (t3d != null) {
            t3d.LIZIZ();
        }
        this.LJLLJ = null;
        super.onDestroy();
    }

    public final GetMixListViewModel wl() {
        return (GetMixListViewModel) this.LJLIL.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        View view = getView();
        if (view != null) {
            view.setFocusableInTouchMode(true);
            view.requestFocus();
            view.setOnKeyListener(new WIP(this));
        }
    }

    public final void vl() {
        try {
            FragmentManager fragmentManager = getFragmentManager();
            if (fragmentManager != null) {
                C1B3 c1b3 = new C1B3(fragmentManager);
                c1b3.LJIIJJI(R.anim.fv, R.anim.g2, 0, 0);
                c1b3.LJJI(this);
                c1b3.LJIILLIIL();
            }
        } catch (IllegalStateException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public final void xl() {
        Context context = _$_findCachedViewById(R.id.w4).getContext();
        o.LJIIIIZZ(context, "add_status_view.context");
        OSZ<String, String> LIZ = T35.LIZ(context);
        if (this.LJLLJ == null) {
            this.LJLLJ = new T3D(new AqS165S0100000_15(this, 475), new AqS165S0100000_15(this, 476), true);
        }
        T3D t3d = this.LJLLJ;
        if (t3d != null) {
            t3d.LIZ();
        }
        C73305Spp c73305Spp = (C73305Spp) _$_findCachedViewById(R.id.w4);
        C73306Spq c73306Spq = new C73306Spq();
        C73312Spw.LJIIIIZZ(c73306Spq, LIZ.getFirst(), LIZ.getSecond(), 0, new AqS165S0100000_15(this, 477), 28);
        c73305Spp.setStatus(c73306Spq);
    }

    /* loaded from: classes16.dex */
    public static final class AddFeedToMixListCell extends PowerCell<C85429Xft> {
        public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLILLLLZI;
        public final C85436Xg0 LJLIL = new C85436Xg0(this);

        static {
            TBT tbt = new TBT(AddFeedToMixListCell.class, "control", "getControl()Lcom/ss/android/ugc/aweme/mix/addfeed/IMixFeedControl;", 0);
            C65352Pkq.LIZ.getClass();
            LJLILLLLZI = new InterfaceC74236TBo[]{tbt};
        }

        @Override // com.bytedance.ies.powerlist.PowerCell
        public final void onBindItemView(C85429Xft c85429Xft) {
            C85429Xft t = c85429Xft;
            o.LJIIIZ(t, "t");
            int i = t.LJLJJI;
            if (i != 0) {
                if (i != 1) {
                    return;
                }
                ((AppCompatImageView) this.itemView.findViewById(R.id.eua)).setBackgroundResource(R.drawable.bru);
                ((TuxTextView) this.itemView.findViewById(R.id.euh)).setTuxFont(41);
                ((TextView) this.itemView.findViewById(R.id.euh)).setText(t.LJLILLLLZI);
                ((CompoundButton) this.itemView.findViewById(R.id.eup)).setChecked(t.LJLJJLL);
                C16880lQ.LJIJJ((C02Y) this.itemView.findViewById(R.id.eup), new ACListenerS49S0200000_15(this, t, 17));
                ((ImageView) this.itemView.findViewById(R.id.euq)).setVisibility(8);
                this.itemView.findViewById(R.id.eup).setVisibility(0);
                C16880lQ.LJIIJ(new ACListenerS49S0200000_15(this, t, 18), this.itemView);
                return;
            }
            ((AppCompatImageView) this.itemView.findViewById(R.id.eua)).setBackgroundResource(R.drawable.brr);
            ((TuxTextView) this.itemView.findViewById(R.id.euh)).setTuxFont(42);
            ((TextView) this.itemView.findViewById(R.id.euh)).setText(R.string.dys);
            this.itemView.findViewById(R.id.eup).setVisibility(8);
            ((AppCompatImageView) this.itemView.findViewById(R.id.euq)).setBackgroundResource(R.drawable.brj);
            ((ImageView) this.itemView.findViewById(R.id.euq)).setVisibility(0);
            C16880lQ.LJIIJ(new ACListenerS35S0100000_15(this, 110), this.itemView);
        }

        @Override // com.bytedance.ies.powerlist.PowerCell
        public final View onCreateItemView(ViewGroup viewGroup) {
            return C1DI.LIZ(viewGroup, "parent", R.layout.bt1, viewGroup, false, "from(parent.context).inf…o_mixlist, parent, false)");
        }
    }

    @Override // X.InterfaceC85435Xfz
    public final void Tf(VN9 vn9) {
        SY4 sy4 = (SY4) _$_findCachedViewById(R.id.aul);
        if (sy4 == null) {
            return;
        }
        sy4.setEnabled(vn9.LIZ);
    }

    @Override // X.InterfaceC85435Xfz
    public final void hc0(C79594VLq c79594VLq) {
        if (c79594VLq.LIZ) {
            this.LJLJL = c79594VLq.LIZIZ;
        }
    }

    @Override // X.InterfaceC85435Xfz
    public final void lE(C85428Xfs c85428Xfs) {
        this.LJLLLL.invoke(c85428Xfs);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Serializable serializable;
        String str;
        boolean z;
        String str2;
        String string;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        String str3 = null;
        if (arguments != null) {
            serializable = arguments.getSerializable("key_add_mix_aweme");
        } else {
            serializable = null;
        }
        this.LJLILLLLZI = (Aweme) serializable;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            str = arguments2.getString("key_choosed_mix_id");
        } else {
            str = null;
        }
        this.LJLJI = str;
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            str3 = arguments3.getString("key_choosed_mix_name");
        }
        this.LJLJL = str3;
        wl().LJLJL = this.LJLILLLLZI;
        GetMixListViewModel wl = wl();
        String str4 = this.LJLJI;
        String str5 = "";
        if (str4 == null) {
            str4 = "";
        }
        wl.getClass();
        wl.LJLJJLL = str4;
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            z = arguments4.getBoolean("key_full_scrren", false);
        } else {
            z = false;
        }
        this.LJLJJL = z;
        Bundle arguments5 = getArguments();
        if (arguments5 == null || (str2 = arguments5.getString("enter_from")) == null) {
            str2 = "";
        }
        this.LJLJLJ = str2;
        Bundle arguments6 = getArguments();
        if (arguments6 != null && (string = arguments6.getString("enter_method")) != null) {
            str5 = string;
        }
        this.LJLJLLL = str5;
        GetMixListViewModel wl2 = wl();
        String enterFrom = this.LJLJLJ;
        String enterMethod = this.LJLJLLL;
        wl2.getClass();
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        wl2.LJLJLJ = enterFrom;
        wl2.LJLJLLL = enterMethod;
        if (this.LJLJJL) {
            wl().LJLJI = false;
            wl().LJLL = true;
        }
        if (SplitVideoServiceImpl.LIZ().showPlayList() || SplitVideoServiceImpl.LIZ().playListAutoTake()) {
            wl().LJLJJI = true;
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onCreateMixListSuccess(C2P7 event) {
        o.LJIIIZ(event, "event");
        if (!event.LJLJJL && event.LJLIL && !TextUtils.isEmpty(event.LJLJI) && !TextUtils.isEmpty(event.LJLILLLLZI)) {
            ((C73305Spp) _$_findCachedViewById(R.id.w4)).LJFF();
            ((C73305Spp) _$_findCachedViewById(R.id.w4)).setVisibility(0);
            GetMixListViewModel wl = wl();
            String mixId = event.LJLJI;
            wl.getClass();
            o.LJIIIZ(mixId, "mixId");
            wl.LJLJJLL = mixId;
            wl.LJLIL = -1;
            wl.LJLILLLLZI = null;
            ((PowerPageSource) wl().LJLLI.getValue()).getOperator().refresh();
            if (!TextUtils.isEmpty(event.LJLJI)) {
                String str = event.LJLJI;
                this.LJLJJI = str;
                this.LJLJI = str;
                this.LJLJL = event.LJLILLLLZI;
                ((SY4) _$_findCachedViewById(R.id.aul)).setEnabled(true);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        if (!C42555Gn1.LIZ()) {
            _$_findCachedViewById(R.id.w4).setOnTouchListener(ViewOnTouchListenerC85434Xfy.LJLIL);
        }
        ((C73305Spp) _$_findCachedViewById(R.id.w4)).LJFF();
        ((C73305Spp) _$_findCachedViewById(R.id.w4)).setVisibility(0);
        C235119Kp c235119Kp = new C235119Kp();
        this.LJLLI = c235119Kp;
        if (this.LJLJJL) {
            if (((IAVPublishService) this.LJLLL.getValue()).shouldShowAddToMixWithinSheet()) {
                C234529Ii LIZJ = s1.LIZJ();
                LIZJ.LIZJ = R.raw.icon_x_mark;
                LIZJ.LIZLLL = true;
                LIZJ.LIZIZ(new AqS165S0100000_15(this, 830));
                c235119Kp.LIZIZ(LIZJ);
            } else {
                View findViewById = view.findViewById(R.id.ht1);
                Context context = findViewById.getContext();
                o.LJIIIIZZ(context, "root.context");
                findViewById.setPadding(0, C63081OpJ.LJJJJLI(context), 0, 0);
                C234529Ii LIZJ2 = s1.LIZJ();
                LIZJ2.LIZJ = R.raw.icon_arrow_left_ltr;
                LIZJ2.LIZLLL = true;
                LIZJ2.LIZIZ(new AqS157S0200000_10(this, view, 32));
                c235119Kp.LIZLLL(LIZJ2);
            }
            _$_findCachedViewById(R.id.b27).setVisibility(0);
            ((TextView) _$_findCachedViewById(R.id.aul)).setText(getResources().getText(R.string.exd));
        } else {
            C234529Ii LIZJ3 = s1.LIZJ();
            LIZJ3.LIZJ = R.raw.icon_x_mark;
            LIZJ3.LIZLLL = true;
            LIZJ3.LIZIZ(new AqS165S0100000_15(this, 831));
            c235119Kp.LIZIZ(LIZJ3);
            _$_findCachedViewById(R.id.b27).setVisibility(8);
        }
        C9KF c9kf = new C9KF();
        String string = getString(R.string.bg4);
        o.LJIIIIZZ(string, "getString(R.string.add_to_playlist)");
        c9kf.LIZJ = string;
        c235119Kp.LIZJ = c9kf;
        C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.gwg);
        C235119Kp c235119Kp2 = this.LJLLI;
        if (c235119Kp2 != null) {
            c252709vu.setNavActions(c235119Kp2);
            ((C252709vu) _$_findCachedViewById(R.id.gwg)).LJIILJJIL(true);
            if (!TextUtils.isEmpty(this.LJLJI) && !TextUtils.isEmpty(this.LJLJL)) {
                ((SY4) _$_findCachedViewById(R.id.aul)).setEnabled(true);
                this.LJLL = true;
            }
            RecyclerView pw_list = (RecyclerView) _$_findCachedViewById(R.id.igv);
            o.LJIIIIZZ(pw_list, "pw_list");
            AbstractC029409q adapter = pw_list.getAdapter();
            o.LJII(adapter, "null cannot be cast to non-null type com.bytedance.ies.powerlist.PowerAdapter");
            ((PowerAdapter) adapter).LLF(this, AddFeedToMixFragment.class);
            ((SYL) _$_findCachedViewById(R.id.igv)).LLLF.LJZL(AddFeedToMixListCell.class, DefaultMixListCell.class);
            ((SYL) _$_findCachedViewById(R.id.igv)).LJLJLLL((AbstractC72278SYg) wl().LJLLI.getValue());
            ((RecyclerView) _$_findCachedViewById(R.id.igv)).setItemAnimator(null);
            View btn_add = _$_findCachedViewById(R.id.aul);
            o.LJIIIIZZ(btn_add, "btn_add");
            C16880lQ.LJIIJ(new IDaS203S0200000_10(this, view, 2), btn_add);
            ((SYL) _$_findCachedViewById(R.id.igv)).LJLJLJ(new C85430Xfu(this));
            Context context2 = getContext();
            if (context2 != null) {
                z = C48203Ivv.LJ(context2);
            } else {
                z = true;
            }
            if (C42555Gn1.LIZ() && !z) {
                this.LJLLILLLL = true;
                xl();
            } else {
                ((PowerPageSource) wl().LJLLI.getValue()).getOperator().refresh();
            }
            EventBus.LIZJ().LJIILJJIL(this);
            return;
        }
        o.LJIJI("navActions");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.bt_, viewGroup, false);
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
