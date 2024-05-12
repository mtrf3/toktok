package com.bytedance.android.live.effect.karaoke.fragments;

import X.AbstractC07660Ru;
import X.ActivityC45651qj;
import X.C03880Dg;
import X.C0A2;
import X.C0K5;
import X.C0NB;
import X.C10A;
import X.C141335gf;
import X.C15380j0;
import X.C16880lQ;
import X.C21210sP;
import X.C26U;
import X.C29306Beo;
import X.C29S;
import X.C2AK;
import X.C2GD;
import X.C35671ad;
import X.C3C5;
import X.C40171ht;
import X.C47071t1;
import X.C51029K0z;
import X.C65300Pk0;
import X.C76104Tts;
import X.C76800UCe;
import X.C90903hW;
import X.EnumC05740Kk;
import X.EnumC07630Rr;
import X.EnumC07640Rs;
import X.EnumC31066CHe;
import X.InterfaceC88472Yns;
import X.OSZ;
import X.QXX;
import X.RunnableC31065CHd;
import X.XKX;
import Y.IDcS169S0100000;
import Y.IDrS40S0100000;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.IDqS443S0100000;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public abstract class KaraokeSongListFragment extends BaseFragment {
    public RunnableC31065CHd LJLIL;
    public C35671ad LJLILLLLZI;
    public C0K5 LJLJI;
    public KaraokeViewModel LJLJJL;
    public int LJLJLJ;
    public DataChannel LJLJLLL;
    public C76104Tts LJLL;
    public final Map<Integer, View> LJLLI = new LinkedHashMap();
    public final C26U LJLJJI = new C26U();
    public long LJLJJLL = -4;
    public EnumC05740Kk LJLJL = EnumC05740Kk.UNKNOWN;

    public int Hl() {
        return -1;
    }

    public void Il(EnumC07630Rr actionType) {
        o.LJIIIZ(actionType, "actionType");
    }

    public void Jl(EnumC07640Rs actionType, long j) {
        o.LJIIIZ(actionType, "actionType");
    }

    public void Kl(AbstractC07660Ru state) {
        o.LJIIIZ(state, "state");
    }

    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLI).clear();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void vl() {
    }

    public final C35671ad Al() {
        C35671ad c35671ad = this.LJLILLLLZI;
        if (c35671ad != null) {
            return c35671ad;
        }
        o.LJIJI("ksongAdapter");
        throw null;
    }

    public final RunnableC31065CHd Dl() {
        RunnableC31065CHd runnableC31065CHd = this.LJLIL;
        if (runnableC31065CHd != null) {
            return runnableC31065CHd;
        }
        o.LJIJI("songListView");
        throw null;
    }

    public final C0K5 Gl() {
        C0K5 c0k5 = this.LJLJI;
        if (c0k5 != null) {
            return c0k5;
        }
        o.LJIJI("stateView");
        throw null;
    }

    public void Ll() {
        ConcurrentHashMap<Long, OSZ<Integer, Integer>> concurrentHashMap;
        OSZ<Integer, Integer> osz;
        LinearLayoutManager linearLayoutManager;
        KaraokeViewModel karaokeViewModel = this.LJLJJL;
        if (karaokeViewModel != null && (concurrentHashMap = karaokeViewModel.LJLL) != null && (osz = concurrentHashMap.get(Long.valueOf(this.LJLJJLL))) != null) {
            C0A2 layoutManager = Dl().getLayoutManager();
            if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
                linearLayoutManager.LJFF(osz.getFirst().intValue(), osz.getSecond().intValue());
            }
        }
    }

    public void wl() {
        C0NB.LIZIZ("KaraokeSongListFragment", "fetchMoreData");
        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C2AK(this, null), 3);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        C76104Tts c76104Tts = this.LJLL;
        if (c76104Tts != null) {
            c76104Tts.LIZIZ();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        KaraokeViewModel karaokeViewModel;
        super.onResume();
        KaraokeViewModel karaokeViewModel2 = this.LJLJJL;
        if (karaokeViewModel2 != null) {
            karaokeViewModel2.Gv0(this.LJLJJLL);
        }
        vl();
        if (this.LJLJLJ == 1 && (karaokeViewModel = this.LJLJJL) != null) {
            List<OSZ<Long, Integer>> LIZJ = karaokeViewModel.LLFFF.LIZJ();
            C35671ad Al = Al();
            Iterator it = ((ArrayList) LIZJ).iterator();
            while (it.hasNext()) {
                OSZ osz = (OSZ) it.next();
                Al.LJLLLLLL(((Number) osz.getSecond()).intValue(), ((Number) osz.getFirst()).longValue());
            }
        }
        Ll();
        C76104Tts c76104Tts = this.LJLL;
        if (c76104Tts != null) {
            c76104Tts.LIZJ(false);
        }
    }

    public QXX xl() {
        return this.LJLJJI;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        if (r22 == false) goto L18;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onHiddenChanged(boolean r22) {
        /*
            r21 = this;
            X.0Dg r4 = new X.0Dg
            r0 = 2
            r4.<init>(r0)
            r0 = 1
            java.lang.Object[] r9 = new java.lang.Object[r0]
            r2 = r22
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r12 = 0
            r9[r12] = r0
            X.Pk0 r11 = new X.Pk0
            java.lang.String r1 = "(Z)V"
            java.lang.String r0 = "8721219861883699075"
            r11.<init>(r12, r1, r0)
            r5 = 10501(0x2905, float:1.4715E-41)
            java.lang.String r15 = "com/bytedance/android/live/effect/karaoke/fragments/KaraokeSongListFragment"
            java.lang.String r16 = "onHiddenChanged"
            java.lang.String r19 = "void"
            r10 = r21
            r13 = r4
            r14 = r5
            r17 = r10
            r18 = r9
            r20 = r11
            X.Ff9 r0 = r13.LIZJ(r14, r15, r16, r17, r18, r19, r20)
            boolean r0 = r0.LIZ
            if (r0 == 0) goto L3e
            r8 = 0
            java.lang.String r6 = "com/bytedance/android/live/effect/karaoke/fragments/KaraokeSongListFragment"
            java.lang.String r7 = "onHiddenChanged"
            r4.LIZIZ(r5, r6, r7, r8, r9, r10, r11, r12)
            return
        L3e:
            super.onHiddenChanged(r2)
            boolean r0 = r10.isResumed()
            if (r0 == 0) goto L64
            if (r2 == 0) goto L5c
            X.Tts r0 = r10.LJLL
            if (r0 == 0) goto L50
            r0.LIZIZ()
        L50:
            r8 = 0
            r5 = 10501(0x2905, float:1.4715E-41)
            java.lang.String r6 = "com/bytedance/android/live/effect/karaoke/fragments/KaraokeSongListFragment"
            java.lang.String r7 = "onHiddenChanged"
            r12 = 1
            r4.LIZIZ(r5, r6, r7, r8, r9, r10, r11, r12)
            return
        L5c:
            X.Tts r0 = r10.LJLL
            if (r0 == 0) goto L66
            r0.LIZJ(r12)
            goto L66
        L64:
            if (r2 != 0) goto L50
        L66:
            boolean r0 = r10.isResumed()
            if (r0 == 0) goto L50
            com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel r2 = r10.LJLJJL
            if (r2 == 0) goto L75
            long r0 = r10.LJLJJLL
            r2.Gv0(r0)
        L75:
            androidx.lifecycle.LifecycleCoroutineScope r3 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r10)
            X.2AL r2 = new X.2AL
            r1 = 0
            r2.<init>(r10, r1)
            r0 = 3
            X.XKX.LIZLLL(r3, r1, r1, r2, r0)
            goto L50
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment.onHiddenChanged(boolean):void");
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        int i;
        EnumC31066CHe enumC31066CHe;
        EnumC05740Kk enumC05740Kk;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LJLJLLL = C51029K0z.LJIILIIL(this);
        View findViewById = view.findViewById(R.id.ke8);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.state_view)");
        this.LJLJI = (C0K5) findViewById;
        this.LJLJJL = C21210sP.LIZJ(C51029K0z.LJIILIIL(this));
        Bundle arguments = getArguments();
        if (arguments != null) {
            long j = arguments.getLong("tab", -4L);
            this.LJLJJLL = j;
            EnumC05740Kk.Companion.getClass();
            if (j == -999) {
                enumC05740Kk = EnumC05740Kk.QUEUE;
            } else if (j == -998) {
                enumC05740Kk = EnumC05740Kk.REQUEST;
            } else if (j == -997) {
                enumC05740Kk = EnumC05740Kk.SEARCH;
            } else {
                enumC05740Kk = EnumC05740Kk.LIBRARY;
            }
            this.LJLJL = enumC05740Kk;
        }
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
        if (LJIILIIL != null && C29306Beo.LJIIJ(LJIILIIL)) {
            i = 1;
        } else {
            i = 2;
        }
        this.LJLJLJ = i;
        C29306Beo.LJJIZ(C51029K0z.LJIILIIL(this));
        View findViewById2 = view.findViewById(R.id.fdm);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.karaoke_song_list)");
        this.LJLIL = (RunnableC31065CHd) findViewById2;
        Dl().setPauseLoadImageWhenScrollWithoutExperiment(30);
        Dl().setItemAnimator(new C40171ht());
        RunnableC31065CHd Dl = Dl();
        this.LJLILLLLZI = new C35671ad(this.LJLJLJ, this.LJLJL, xl(), new IDqS420S0100000(this, 168), new IDqS416S0100000(this, 299));
        Dl.setAdapter(Al());
        Dl.getContext();
        Dl.setLayoutManager(new LinearLayoutManager(1, false));
        if (this.LJLJJLL == -999) {
            enumC31066CHe = EnumC31066CHe.KARAOKE_QUEUE;
        } else {
            enumC31066CHe = EnumC31066CHe.KARAOKE_COMMON;
        }
        RecyclerView.RecycledViewPool LJLJL = Dl.LJLJL(enumC31066CHe, true);
        if (LJLJL != null) {
            LJLJL.setMaxRecycledViews(0, 8);
        }
        int Hl = Hl();
        if (Hl != -1) {
            Gl().setEmptyViewSrc(Hl);
        }
        this.LJLL = new C76104Tts(1, Dl(), new IDqS443S0100000(this, 32));
        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C2GD(this, null), 3);
        Dl().LJIIJJI(new IDrS40S0100000(this, 4));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.d_e, viewGroup, false);
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

    public final void Ml(int i, int i2, InterfaceC88472Yns<? super DialogInterface, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super DialogInterface, C76800UCe> interfaceC88472Yns2) {
        C47071t1 c47071t1 = new C47071t1(getContext());
        c47071t1.LIZJ = C15380j0.LJIILJJIL(i);
        c47071t1.LJIILIIL(C15380j0.LJIILJJIL(i2), new IDcS169S0100000(interfaceC88472Yns, 13));
        c47071t1.LJIIJ(C15380j0.LJIILJJIL(R.string.jws), new IDcS169S0100000(interfaceC88472Yns2, 14));
        c47071t1.LJIILL = false;
        c47071t1.LJIILJJIL = false;
        LiveDialog LIZ = c47071t1.LIZ();
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", LIZ, new Object[0], "void", new C65300Pk0(false, "()V", "8721219861883699075")).LIZ) {
            return;
        }
        LIZ.show();
    }
}
