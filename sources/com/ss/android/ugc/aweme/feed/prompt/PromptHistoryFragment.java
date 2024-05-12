package com.ss.android.ugc.aweme.feed.prompt;

import X.ASL;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C17N;
import X.C184077Kh;
import X.C188727au;
import X.C2068389v;
import X.C214298b3;
import X.C214528bQ;
import X.C234529Ii;
import X.C235119Kp;
import X.C237659Uj;
import X.C237669Uk;
import X.C237709Uo;
import X.C238299Wv;
import X.C29S;
import X.C2U8;
import X.C3C5;
import X.C45804HyK;
import X.C54984Li0;
import X.C63081OpJ;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73305Spp;
import X.C73306Spq;
import X.C76800UCe;
import X.C78613UtF;
import X.C78926UyI;
import X.C79045V0n;
import X.C90903hW;
import X.C9KF;
import X.C9Y7;
import X.FMX;
import X.InterfaceC219588ja;
import X.InterfaceC237779Uv;
import X.InterfaceC65784Pro;
import X.TBT;
import X.XKX;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.prompt.PromptHistoryFragment;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PromptHistoryFragment extends Fragment implements InterfaceC219588ja, DialogInterface.OnDismissListener {
    public final C214298b3 LJLIL;
    public FeedPromptViewModel LJLILLLLZI;
    public final Map<Integer, View> LJLJI = new LinkedHashMap();

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJI;
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

    public final void wl() {
        Al(true);
        C73305Spp c73305Spp = (C73305Spp) _$_findCachedViewById(R.id.kf_);
        if (c73305Spp != null) {
            C73306Spq c73306Spq = new C73306Spq();
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_large_watch_history;
            c2068389v.LJ = Integer.valueOf(R.attr.gp);
            c73306Spq.LIZJ = 0;
            c73306Spq.LIZIZ = c2068389v;
            String string = getString(R.string.ji0);
            o.LJIIIIZZ(string, "getString(R.string.pfFee…efPage_emptyState_header)");
            c73306Spq.LJFF = string;
            String string2 = getString(R.string.jhz);
            o.LJIIIIZZ(string2, "getString(R.string.pfFee…PrefPage_emptyState_desc)");
            c73306Spq.LJI = string2;
            c73305Spp.setStatus(c73306Spq);
        }
    }

    public PromptHistoryFragment() {
        C65776Prg LIZ = C65352Pkq.LIZ(PromptHistorySheetVM.class);
        this.LJLIL = new C214298b3(LIZ, new AqS154S0100000_4(LIZ, 341), C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C237659Uj.INSTANCE, (InterfaceC65784Pro) null, 384);
    }

    @Override // X.InterfaceC219588ja
    public final C235119Kp createNavActions() {
        C235119Kp c235119Kp = new C235119Kp();
        C9KF c9kf = new C9KF();
        String string = getString(R.string.ji1);
        o.LJIIIIZZ(string, "getString(R.string.pfFee…FYP_managPrefPage_header)");
        c9kf.LIZJ = string;
        c235119Kp.LIZJ = c9kf;
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_x_mark;
        LIZJ.LIZLLL = true;
        LIZJ.LIZIZ(new AqS154S0100000_4(this, 340));
        c235119Kp.LIZIZ(LIZJ);
        if (getParentFragmentManager().LJJJJIZL() > 0) {
            C234529Ii LIZJ2 = s1.LIZJ();
            LIZJ2.LIZJ = R.raw.icon_chevron_left_offset_ltr;
            LIZJ2.LIZLLL = true;
            LIZJ2.LIZIZ(new AqS154S0100000_4(this, 339));
            c235119Kp.LIZLLL(LIZJ2);
        }
        return c235119Kp;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJI).clear();
    }

    public final void Al(boolean z) {
        if (z) {
            View _$_findCachedViewById = _$_findCachedViewById(R.id.kf_);
            if (_$_findCachedViewById != null) {
                C17N.LJJLIIIJJI(_$_findCachedViewById);
            }
            View _$_findCachedViewById2 = _$_findCachedViewById(R.id.isd);
            if (_$_findCachedViewById2 != null) {
                C17N.LJJIIJZLJL(_$_findCachedViewById2);
                return;
            }
            return;
        }
        C73305Spp c73305Spp = (C73305Spp) _$_findCachedViewById(R.id.kf_);
        if (c73305Spp != null && c73305Spp.getVisibility() != 4) {
            c73305Spp.setVisibility(4);
        }
        View _$_findCachedViewById3 = _$_findCachedViewById(R.id.isd);
        if (_$_findCachedViewById3 == null) {
            return;
        }
        C17N.LJJLIIIJJI(_$_findCachedViewById3);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        String str2;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString("event_type")) == null) {
            str = "homepage_hot";
        }
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (str2 = arguments2.getString("enter_method")) == null) {
            str2 = "icon";
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str);
        c188727au.LJIIIZ("enter_method", str2);
        FMX.LJIIL("enter_history_list", c188727au.LIZ);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        FeedPromptViewModel feedPromptViewModel = this.LJLILLLLZI;
        if (feedPromptViewModel != null && o.LJ(feedPromptViewModel.LJLJLJ, Boolean.TRUE)) {
            C2U8.LIZ(new C54984Li0(null, 19, Boolean.TRUE, 2, ""));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            this.LJLILLLLZI = C238299Wv.LIZ(mo49getActivity);
        }
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.isd);
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        C9Y7 c9y7 = new C9Y7();
        c9y7.LJLILLLLZI = new InterfaceC237779Uv() { // from class: X.9Uu
            @Override // X.InterfaceC237779Uv
            public final void LIZIZ(C237749Us prompt) {
                o.LJIIIZ(prompt, "prompt");
                PromptHistoryFragment promptHistoryFragment = PromptHistoryFragment.this;
                Context context = promptHistoryFragment.getContext();
                if (context != null) {
                    C26227ARb LIZ = C3AW.LIZ(context);
                    LIZ.LJFF(promptHistoryFragment.getString(R.string.ji5));
                    LIZ.LIZIZ(promptHistoryFragment.getString(R.string.ji4));
                    UC0.LIZJ(LIZ, new AqS135S0200000_4(promptHistoryFragment, prompt, 258));
                    LIZ.LJIIIIZZ = false;
                    LIZ.LJI().LIZLLL();
                }
            }

            @Override // X.InterfaceC237779Uv
            public final void LIZ(SmartImageView itemView, C237749Us prompt) {
                String aid;
                String str;
                String str2;
                o.LJIIIZ(itemView, "itemView");
                o.LJIIIZ(prompt, "prompt");
                Aweme aweme = prompt.LJLIL.getAweme();
                if (aweme != null && (aid = aweme.getAid()) != null) {
                    PromptHistoryFragment promptHistoryFragment = PromptHistoryFragment.this;
                    promptHistoryFragment.getClass();
                    C020506f LIZ = C020506f.LIZ(itemView, itemView.getWidth(), itemView.getHeight());
                    SmartRoute buildRoute = SmartRouter.buildRoute(promptHistoryFragment.mo49getActivity(), "aweme://aweme/detail/");
                    Bundle LIZ2 = C0H1.LIZ("id", aid);
                    LIZ2.putString("userid", ((RBX) HG3.LJIILL()).getCurUserId());
                    LIZ2.putString("sec_userid", ((RBX) HG3.LJIILL()).getCurSecUserId());
                    LIZ2.putBoolean("is_clean_mode", true);
                    buildRoute.withParam(LIZ2);
                    buildRoute.withBundleAnimation(LIZ.LIZLLL());
                    buildRoute.withParam("activity_has_activity_options", true);
                    buildRoute.open();
                    Bundle arguments = promptHistoryFragment.getArguments();
                    if (arguments == null || (str = arguments.getString("event_type")) == null) {
                        str = "homepage_hot";
                    }
                    Bundle arguments2 = promptHistoryFragment.getArguments();
                    if (arguments2 == null || (str2 = arguments2.getString("enter_method")) == null) {
                        str2 = "icon";
                    }
                    String returnedQuery = prompt.LJLIL.getReturnedQuery();
                    C188727au LIZLLL = KNV.LIZLLL(returnedQuery, "content");
                    LIZLLL.LJIIIZ("enter_from", str);
                    LIZLLL.LJIIIZ("enter_method", str2);
                    LIZLLL.LJIIIZ("content", returnedQuery);
                    LIZLLL.LJIIIZ("group_id", aid);
                    FMX.LJIIL("history_example_play", LIZLLL.LIZ);
                }
            }
        };
        ((RecyclerView) _$_findCachedViewById(R.id.isd)).setAdapter(c9y7);
        AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LJLIL.getValue(), new TBT() { // from class: X.9Ul
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C237689Um) obj).LJLIL;
            }
        }, null, new AqS170S0100000_4(this, 1344), new AqS154S0100000_4(this, 1208), new AqS135S0200000_4(this, c9y7, 256), 2, null);
        C73305Spp c73305Spp = (C73305Spp) _$_findCachedViewById(R.id.kf_);
        if (c73305Spp != null) {
            View findViewById = view.findViewById(R.id.g94);
            o.LJIIIIZZ(findViewById, "view.loading_view");
            c73305Spp.LIZJ(findViewById);
        }
        wl();
        PromptHistorySheetVM promptHistorySheetVM = (PromptHistorySheetVM) this.LJLIL.getValue();
        promptHistorySheetVM.setState(C237669Uk.LJLIL);
        XKX.LIZLLL(ViewModelKt.getViewModelScope(promptHistorySheetVM), C78613UtF.LIZJ, null, new C237709Uo(promptHistorySheetVM, null), 2);
    }

    public final void vl(int i, boolean z) {
        FeedPromptViewModel feedPromptViewModel;
        MutableLiveData<Integer> gv0;
        FeedPromptViewModel feedPromptViewModel2 = this.LJLILLLLZI;
        if (feedPromptViewModel2 != null && (gv0 = feedPromptViewModel2.gv0()) != null) {
            gv0.postValue(Integer.valueOf(i));
        }
        if (!z || (feedPromptViewModel = this.LJLILLLLZI) == null) {
            return;
        }
        feedPromptViewModel.LJLJLJ = Boolean.TRUE;
    }

    public final void xl(Context context, Bundle bundle) {
        FragmentManager supportFragmentManager;
        o.LJIIIZ(context, "context");
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        if (LJJIFFI == null || (supportFragmentManager = LJJIFFI.getSupportFragmentManager()) == null) {
            return;
        }
        setArguments(bundle);
        ASL asl = new ASL();
        asl.LIZ.LJLLILLLL = this;
        asl.LJI(1);
        TuxSheet tuxSheet = asl.LIZ;
        tuxSheet.LJZI = false;
        tuxSheet.LJZL = true;
        tuxSheet.LJLJI = true;
        Integer LJI = C79045V0n.LJI(R.attr.c9, context);
        TuxSheet tuxSheet2 = asl.LIZ;
        tuxSheet2.LJLJL = LJI;
        tuxSheet2.LJLILLLLZI = this;
        tuxSheet2.show(supportFragmentManager, "PromptHistoryFragment");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup.LayoutParams layoutParams;
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.ae1, viewGroup, false);
        Context context = getContext();
        if (context != null) {
            int LJJJJJL = C63081OpJ.LJJJJJL(context);
            if (viewGroup != null && (layoutParams = viewGroup.getLayoutParams()) != null) {
                layoutParams.height = (int) (LJJJJJL * 0.68d);
            }
        }
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
