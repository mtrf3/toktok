package com.ss.android.ugc.aweme.feed.prompt.panel;

import X.ASQ;
import X.ActivityC45651qj;
import X.C10A;
import X.C10H;
import X.C10K;
import X.C116414hZ;
import X.C116754i7;
import X.C141335gf;
import X.C16880lQ;
import X.C2060386t;
import X.C234529Ii;
import X.C235119Kp;
import X.C237639Uh;
import X.C238299Wv;
import X.C26244ARs;
import X.C29S;
import X.C2U8;
import X.C38995FSd;
import X.C3C5;
import X.C48203Ivv;
import X.C54984Li0;
import X.C63081OpJ;
import X.C73411SrX;
import X.C76800UCe;
import X.C90903hW;
import X.C9KF;
import X.C9UV;
import X.C9UY;
import X.EF7;
import X.InterfaceC116774i9;
import X.InterfaceC219588ja;
import X.InterfaceC64592gB;
import X.T16;
import X.V1B;
import Y.ACListenerS24S0100000_4;
import Y.ACListenerS39S0200000_4;
import Y.ACallableS107S0100000_4;
import Y.AfS56S0100000_4;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.feed.prompt.FeedPromptViewModel;
import com.ss.android.ugc.aweme.feed.prompt.api.FeedPromptApi;
import com.ss.android.ugc.aweme.feed.prompt.data.PromptStruct;
import com.ss.android.ugc.aweme.feed.prompt.data.RecommendPromptResponse;
import com.ss.android.ugc.aweme.feed.prompt.panel.PromptMainPageFragment;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PromptMainPageFragment extends Fragment implements InterfaceC219588ja, DialogInterface.OnDismissListener {
    public static final /* synthetic */ int LJLJLJ = 0;
    public FeedPromptViewModel LJLILLLLZI;
    public RecommendPromptResponse LJLJI;
    public String LJLJJI;
    public C73411SrX LJLJJL;
    public final Map<Integer, View> LJLJL = new LinkedHashMap();
    public final C116754i7 LJLIL = new C116754i7();
    public final C10H LJLJJLL = new C10H();

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJL;
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

    public final void Al() {
        List<PromptStruct> data;
        RecommendPromptResponse recommendPromptResponse = this.LJLJI;
        if (recommendPromptResponse == null || (data = recommendPromptResponse.getPrompts()) == null || data.isEmpty()) {
            Dl(999998);
            return;
        }
        if (data.size() > 3) {
            data = data.subList(0, 3);
        }
        C116414hZ c116414hZ = (C116414hZ) _$_findCachedViewById(R.id.ie2);
        if (c116414hZ != null) {
            c116414hZ.setVisibility(8);
        }
        View _$_findCachedViewById = _$_findCachedViewById(R.id.kf_);
        if (_$_findCachedViewById != null) {
            _$_findCachedViewById.setVisibility(8);
        }
        View _$_findCachedViewById2 = _$_findCachedViewById(R.id.isd);
        if (_$_findCachedViewById2 != null) {
            _$_findCachedViewById2.setVisibility(0);
        }
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.isd);
        if (recyclerView == null) {
            return;
        }
        C116754i7 c116754i7 = this.LJLIL;
        c116754i7.getClass();
        o.LJIIIZ(data, "data");
        c116754i7.LJLIL = data;
        recyclerView.setAdapter(c116754i7);
    }

    @Override // X.InterfaceC219588ja
    public final C235119Kp createNavActions() {
        C235119Kp c235119Kp = new C235119Kp();
        C9KF c9kf = new C9KF();
        c9kf.LIZJ = "";
        c235119Kp.LIZJ = c9kf;
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_watch_history;
        LIZJ.LIZLLL = true;
        LIZJ.LIZIZ(new AqS154S0100000_4(this, 344));
        c235119Kp.LIZLLL(LIZJ);
        C234529Ii LIZJ2 = s1.LIZJ();
        LIZJ2.LIZJ = R.raw.icon_x_mark;
        LIZJ2.LIZLLL = true;
        LIZJ2.LIZIZ(new AqS154S0100000_4(this, 345));
        c235119Kp.LIZIZ(LIZJ2);
        return c235119Kp;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C73411SrX c73411SrX = this.LJLJJL;
        if (c73411SrX != null && !c73411SrX.isDisposed()) {
            c73411SrX.dispose();
        }
        this.LJLJJLL.LIZ();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJL).clear();
    }

    public final void vl() {
        if (!C48203Ivv.LJ(EF7.LIZIZ())) {
            Dl(999999);
            return;
        }
        C116414hZ c116414hZ = (C116414hZ) _$_findCachedViewById(R.id.ie2);
        if (c116414hZ != null) {
            c116414hZ.setVisibility(0);
        }
        View _$_findCachedViewById = _$_findCachedViewById(R.id.isd);
        if (_$_findCachedViewById != null) {
            _$_findCachedViewById.setVisibility(8);
        }
        View _$_findCachedViewById2 = _$_findCachedViewById(R.id.kf_);
        if (_$_findCachedViewById2 != null) {
            _$_findCachedViewById2.setVisibility(8);
        }
        C10K.LIZIZ(new ACallableS107S0100000_4(this, 2), C38995FSd.LIZLLL(), this.LJLJJLL.LIZIZ());
    }

    public final void Dl(int i) {
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity == null || mo49getActivity.isDestroyed() || !V1B.LJJZZI(mo49getActivity, false)) {
            return;
        }
        this.LJLJI = null;
        switch (i) {
            case 999998:
                TextView textView = (TextView) _$_findCachedViewById(R.id.kf3);
                if (textView != null) {
                    textView.setText(R.string.jhw);
                    break;
                }
                break;
            case 999999:
                TextView textView2 = (TextView) _$_findCachedViewById(R.id.kf3);
                if (textView2 != null) {
                    textView2.setText(R.string.jh3);
                    break;
                }
                break;
        }
        C116414hZ c116414hZ = (C116414hZ) _$_findCachedViewById(R.id.ie2);
        if (c116414hZ != null) {
            c116414hZ.setVisibility(8);
        }
        View _$_findCachedViewById = _$_findCachedViewById(R.id.isd);
        if (_$_findCachedViewById != null) {
            _$_findCachedViewById.setVisibility(8);
        }
        View _$_findCachedViewById2 = _$_findCachedViewById(R.id.kf_);
        if (_$_findCachedViewById2 == null) {
            return;
        }
        _$_findCachedViewById2.setVisibility(0);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString("event_type")) == null) {
            str = "homepage_hot";
        }
        C26244ARs.LIZLLL(str, "long_press");
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        boolean z;
        FeedPromptViewModel feedPromptViewModel;
        String str;
        FeedPromptViewModel feedPromptViewModel2 = this.LJLILLLLZI;
        if (feedPromptViewModel2 != null) {
            z = o.LJ(feedPromptViewModel2.LJLJLJ, Boolean.TRUE);
        } else {
            z = false;
        }
        if (z && ((feedPromptViewModel = this.LJLILLLLZI) == null || feedPromptViewModel.LJLIL == null)) {
            Boolean bool = Boolean.TRUE;
            if (feedPromptViewModel == null || (str = feedPromptViewModel.LJLJI) == null) {
                str = "";
            }
            C2U8.LIZ(new C54984Li0(null, 19, bool, 2, str));
        }
        FeedPromptViewModel feedPromptViewModel3 = this.LJLILLLLZI;
        if (feedPromptViewModel3 != null) {
            feedPromptViewModel3.LJLL = null;
        }
    }

    public final boolean wl(View view) {
        Integer num;
        MutableLiveData<Integer> gv0;
        FeedPromptViewModel feedPromptViewModel = this.LJLILLLLZI;
        if (feedPromptViewModel == null || (gv0 = feedPromptViewModel.gv0()) == null || (num = gv0.getValue()) == null) {
            num = 0;
        }
        if (num.intValue() < 20) {
            return false;
        }
        String str = this.LJLJJI;
        if (str == null) {
            str = "panel";
        }
        C9UV.LIZ(view, str);
        C26244ARs.LJFF(str, "reach_limit");
        return true;
    }

    public final void xl(PromptStruct promptStruct) {
        boolean z;
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.putSerializable("chosen_prompt", promptStruct);
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            arguments2.putSerializable("prompt_result", this.LJLJI);
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            if (promptStruct != null) {
                z = true;
            } else {
                z = false;
            }
            arguments3.putSerializable("from_prompt", Boolean.valueOf(z));
        }
        PromptTextEditFragment promptTextEditFragment = new PromptTextEditFragment();
        promptTextEditFragment.setArguments(getArguments());
        ASQ.LJIILIIL(this, promptTextEditFragment, true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(final View view, Bundle bundle) {
        String str;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            this.LJLILLLLZI = C238299Wv.LIZ(mo49getActivity);
        }
        Bundle arguments = getArguments();
        String str2 = null;
        if (arguments != null) {
            str = arguments.getString("source_page");
        } else {
            str = null;
        }
        this.LJLJJI = str;
        FeedPromptViewModel feedPromptViewModel = this.LJLILLLLZI;
        if (feedPromptViewModel != null) {
            str2 = feedPromptViewModel.LJLL;
        }
        if (C2060386t.LIZ(str2)) {
            ((ImageView) _$_findCachedViewById(R.id.eoq)).setVisibility(0);
            ((TextView) _$_findCachedViewById(R.id.l5r)).setText("");
        } else {
            ((ImageView) _$_findCachedViewById(R.id.eoq)).setVisibility(8);
            ((TextView) _$_findCachedViewById(R.id.l5r)).setText(str2);
        }
        LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(R.id.kf_);
        if (linearLayout != null) {
            C16880lQ.LJIIZILJ(linearLayout, new ACListenerS24S0100000_4(this, 302));
        }
        C16880lQ.LJIJ((RelativeLayout) _$_findCachedViewById(R.id.l4k), new ACListenerS39S0200000_4(this, view, 105));
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.isd);
        if (recyclerView != null) {
            getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager() { // from class: com.ss.android.ugc.aweme.feed.prompt.panel.PromptMainPageFragment$initListView$1
                @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
                public final boolean LJIL() {
                    return false;
                }
            });
        }
        C116754i7 c116754i7 = this.LJLIL;
        InterfaceC116774i9 interfaceC116774i9 = new InterfaceC116774i9() { // from class: X.9UW
            @Override // X.InterfaceC116774i9
            public final void LIZ(PromptStruct prompt, int i) {
                String str3;
                o.LJIIIZ(prompt, "prompt");
                Bundle arguments2 = PromptMainPageFragment.this.getArguments();
                if (arguments2 == null || (str3 = arguments2.getString("event_type")) == null) {
                    str3 = "homepage_hot";
                }
                String prompt2 = prompt.getPrompt();
                if (prompt2 == null) {
                    prompt2 = "";
                }
                C26244ARs.LIZ(i, str3, "panel_home_page", prompt2);
                if (!PromptMainPageFragment.this.wl(view)) {
                    PromptMainPageFragment.this.xl(prompt);
                }
            }

            @Override // X.InterfaceC116774i9
            public final void LIZIZ(PromptStruct prompt, int i) {
                String str3;
                o.LJIIIZ(prompt, "prompt");
                Bundle arguments2 = PromptMainPageFragment.this.getArguments();
                if (arguments2 == null || (str3 = arguments2.getString("event_type")) == null) {
                    str3 = "homepage_hot";
                }
                String prompt2 = prompt.getPrompt();
                if (prompt2 == null) {
                    prompt2 = "";
                }
                C26244ARs.LJII(i, str3, "panel_home_page", prompt2);
            }
        };
        c116754i7.getClass();
        c116754i7.LJLILLLLZI = interfaceC116774i9;
        if (this.LJLJI != null) {
            Al();
        } else {
            vl();
        }
        FeedPromptApi.LIZ.getClass();
        C237639Uh.LIZ().instructionsAll(C9UY.LITE.getValue()).LJJL(T16.LIZ()).LJJJ(T16.LIZ()).LJJJLIIL(new AfS56S0100000_4(this, 153), new InterfaceC64592gB() { // from class: X.9Et
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup.LayoutParams layoutParams;
        o.LJIIIZ(inflater, "inflater");
        Context context = getContext();
        if (context != null) {
            int LJJJJJL = C63081OpJ.LJJJJJL(context);
            if (viewGroup != null && (layoutParams = viewGroup.getLayoutParams()) != null) {
                layoutParams.height = (int) (LJJJJJL * 0.68d);
            }
        }
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.ae4, viewGroup, false);
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
