package com.ss.android.ugc.gamora.recorder.sticker.optionlist.viewpager;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C221108m2;
import X.C29S;
import X.C3C5;
import X.C62822Ol8;
import X.C76800UCe;
import X.C78496UrM;
import X.C78800UwG;
import X.C78801UwH;
import X.C78804UwK;
import X.C90903hW;
import X.InterfaceC78821Uwb;
import X.InterfaceC84497XEf;
import Y.AObserverS81S0100000_13;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class OptionCategoryFragment extends Fragment {
    public final List<C78801UwH> LJLIL;
    public final InterfaceC84497XEf LJLILLLLZI;
    public final InterfaceC78821Uwb LJLJI;
    public final Effect LJLJJI;
    public final Effect LJLJJL;
    public final C78804UwK LJLJJLL;
    public RecyclerView LJLJL;
    public final boolean LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final Map<Integer, View> LJLL;

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLL).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.hc7);
        RecyclerView recyclerView = (RecyclerView) findViewById;
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        o.LJIIIIZZ(findViewById, "view.findViewById<Recycl…ERTICAL, false)\n        }");
        RecyclerView recyclerView2 = (RecyclerView) findViewById;
        this.LJLJL = recyclerView2;
        recyclerView2.setAdapter(new C78800UwG(this.LJLJI, this.LJLIL, this.LJLJJLL, new AqS179S0100000_13(this, 338)));
        C78804UwK c78804UwK = this.LJLJJLL;
        if (c78804UwK != null) {
            RecyclerView recyclerView3 = this.LJLJL;
            if (recyclerView3 != null) {
                recyclerView3.LJLI(c78804UwK.LJLJJI);
            } else {
                o.LJIJI("recyclerView");
                throw null;
            }
        }
        ((OptionCategoryViewModel) this.LJLJLLL.getValue()).LJLJLLL.observe(this, new AObserverS81S0100000_13(this, 54));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        View LIZIZ = C78496UrM.LIZIZ(layoutInflater, "inflater", layoutInflater, R.layout.bz4, viewGroup, false, "inflater.inflate(R.layou…layout, container, false)");
        try {
            ViewTreeLifecycleOwner.set(LIZIZ, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(LIZIZ, this);
            C10A.LIZIZ(LIZIZ, this);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity instanceof C29S) {
                c29s = (C29S) mo49getActivity;
            } else {
                c29s = null;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return LIZIZ;
    }

    public OptionCategoryFragment(List<C78801UwH> annotationList, InterfaceC84497XEf effectPlatform, InterfaceC78821Uwb manager, Effect panelEffect, Effect effect, C78804UwK c78804UwK) {
        o.LJIIIZ(annotationList, "annotationList");
        o.LJIIIZ(effectPlatform, "effectPlatform");
        o.LJIIIZ(manager, "manager");
        o.LJIIIZ(panelEffect, "panelEffect");
        this.LJLL = new LinkedHashMap();
        this.LJLIL = annotationList;
        this.LJLILLLLZI = effectPlatform;
        this.LJLJI = manager;
        this.LJLJJI = panelEffect;
        this.LJLJJL = effect;
        this.LJLJJLL = c78804UwK;
        this.LJLJLJ = annotationList.isEmpty() ^ true ? o.LJ(((C78801UwH) ListProtector.get(annotationList, 0)).LIZ, "Green Screen") : false;
        this.LJLJLLL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 270));
    }
}
