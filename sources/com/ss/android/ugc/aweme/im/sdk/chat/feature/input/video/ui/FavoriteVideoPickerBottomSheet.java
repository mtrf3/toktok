package com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.ui;

import X.AbstractC030109x;
import X.ActivityC45651qj;
import X.C107084Ie;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C1HQ;
import X.C221108m2;
import X.C223338pd;
import X.C234529Ii;
import X.C235119Kp;
import X.C29S;
import X.C3C5;
import X.C4BJ;
import X.C62822Ol8;
import X.C71492S4a;
import X.C76800UCe;
import X.C772831o;
import X.C85323Wm;
import X.C90903hW;
import X.C9KF;
import X.InterfaceC219588ja;
import X.S42;
import Y.AObserverS69S0100000_1;
import Y.AObserverS75S0200000_12;
import Y.AObserverS77S0100000_9;
import Y.AObserverS80S0100000_12;
import Y.IDrS50S0100000_12;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class FavoriteVideoPickerBottomSheet extends BaseFragment implements DialogInterface.OnDismissListener, InterfaceC219588ja {
    public ConstraintLayout LJLIL;
    public RecyclerView LJLILLLLZI;
    public ProgressBar LJLJI;
    public View LJLJJI;
    public View LJLJJL;
    public C4BJ LJLJJLL;
    public final Map<Integer, View> LJLL = new LinkedHashMap();
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 587));
    public final IDrS50S0100000_12 LJLJLJ = new IDrS50S0100000_12(this, 4);
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(C71492S4a.LJLIL);

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLL).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLL;
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

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // X.InterfaceC219588ja
    public final C235119Kp createNavActions() {
        C235119Kp c235119Kp = new C235119Kp();
        C9KF c9kf = new C9KF();
        String string = getString(R.string.hs_);
        o.LJIIIIZZ(string, "getString(R.string.likelist_title)");
        c9kf.LIZJ = string;
        c235119Kp.LIZJ = c9kf;
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_x_mark_small;
        LIZJ.LIZIZ(new AqS162S0100000_12(this, 586));
        c235119Kp.LIZIZ(LIZJ);
        c235119Kp.LIZLLL = true;
        return c235119Kp;
    }

    public final FavoriteVideoPickerViewModel vl() {
        return (FavoriteVideoPickerViewModel) this.LJLJL.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        ((Number) this.LJLJLLL.getValue()).longValue();
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        long currentTimeMillis = System.currentTimeMillis() - ((Number) this.LJLJLLL.getValue()).longValue();
        C85323Wm eventSender = C772831o.LIZ();
        o.LJIIIZ(eventSender, "eventSender");
        C1HQ c1hq = new C1HQ();
        c1hq.put("enter_from", "chat");
        c1hq.put("duration", String.valueOf(currentTimeMillis));
        eventSender.LIZIZ("video_stay_time", c1hq);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.jw7);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.sheet_list)");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        this.LJLILLLLZI = recyclerView;
        mo49getActivity();
        recyclerView.setLayoutManager(new WrapGridLayoutManager(3, 1, false));
        recyclerView.setAdapter(new S42(vl()));
        recyclerView.LJII(new C107084Ie(recyclerView.getResources().getDimensionPixelSize(R.dimen.ug), 1), -1);
        recyclerView.LJIIJJI(this.LJLJLJ);
        AbstractC030109x itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.LJFF = 0L;
        }
        FavoriteVideoPickerViewModel vl = vl();
        vl.LJLJL.observe(this, new AObserverS80S0100000_12(this, 19));
        vl.LJLJJLL.observe(this, new AObserverS75S0200000_12(this, vl, 12));
        vl.LJLJLLL.observe(this, new AObserverS80S0100000_12(this, 20));
        vl.LJLL.observe(this, new AObserverS77S0100000_9(this, 15));
        vl.LJLLI.observe(this, new AObserverS77S0100000_9(view, 16));
        vl.LJLJLJ.observe(this, new AObserverS69S0100000_1(this, 30));
        View findViewById2 = view.findViewById(R.id.cvu);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.empty_view)");
        this.LJLJJL = findViewById2;
        View findViewById3 = view.findViewById(R.id.g95);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.loading_view_container)");
        this.LJLJJI = findViewById3;
        View findViewById4 = view.findViewById(R.id.g94);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.loading_view)");
        ((C223338pd) findViewById4).LIZIZ();
        View findViewById5 = view.findViewById(R.id.iac);
        o.LJIIIIZZ(findViewById5, "view.findViewById(R.id.progress_bar)");
        this.LJLJI = (ProgressBar) findViewById5;
        vl().gv0();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        Aweme aweme;
        super.onActivityResult(i, i2, intent);
        if (i == 6248 && i2 == -1) {
            if (intent != null) {
                Serializable serializableExtra = intent.getSerializableExtra("send_video");
                if ((serializableExtra instanceof Aweme) && (aweme = (Aweme) serializableExtra) != null) {
                    vl().hv0(aweme);
                    return;
                }
                return;
            }
            return;
        }
        vl().hv0(null);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.b7o, viewGroup, false);
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
