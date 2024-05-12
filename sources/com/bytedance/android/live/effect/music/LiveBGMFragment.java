package com.bytedance.android.live.effect.music;

import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.C0CM;
import X.C0KV;
import X.C0KX;
import X.C10A;
import X.C141335gf;
import X.C14260hC;
import X.C14320hI;
import X.C14340hK;
import X.C14360hM;
import X.C14410hR;
import X.C16880lQ;
import X.C1H3;
import X.C259910h;
import X.C29306Beo;
import X.C29S;
import X.C2BY;
import X.C2ET;
import X.C2EU;
import X.C2EV;
import X.C32537Cpp;
import X.C33481Tc;
import X.C33591Tn;
import X.C3C5;
import X.C42941mM;
import X.C51029K0z;
import X.C54102Ak;
import X.C73411SrX;
import X.C73969T1h;
import X.C76800UCe;
import X.C90903hW;
import X.InterfaceC14440hU;
import X.InterfaceC30442Bx8;
import X.ORX;
import X.XKX;
import Y.IDLAdapterS2S0100000;
import Y.IDfS292S0100000;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsSeekBar;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.effect.api.LiveBGMFragmentShowLogEvent;
import com.bytedance.android.livesdk.dataChannel.BGMDismissVolumeBarEvent;
import com.bytedance.android.livesdk.dataChannel.BGMRefreshVolumeBarEvent;
import com.bytedance.android.livesdk.ui.EnforceDarkModeFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;
import webcast.data.MusicSong;

/* loaded from: classes.dex */
public final class LiveBGMFragment extends EnforceDarkModeFragment implements InterfaceC14440hU {
    public C42941mM LJLILLLLZI;
    public BGMSongListViewModel LJLJI;
    public BGMPlaylistViewModel LJLJJI;
    public C73411SrX LJLJJL;
    public C14340hK LJLJLJ;
    public int LJLJLLL;
    public long LJLL;
    public LiveIconView LJLLI;
    public View LJLLILLLL;
    public LiveIconView LJLLJ;
    public View LJLLL;
    public LiveIconView LJLLLL;
    public View LJLLLLLL;
    public View LJLZ;
    public View LJZ;
    public View LJZI;
    public boolean LJZL;
    public final Map<Integer, View> LL = new LinkedHashMap();
    public final AnimatorSet LJLJJLL = new AnimatorSet();
    public final AnimatorSet LJLJL = new AnimatorSet();

    @Override // X.InterfaceC14440hU
    public final void Ee() {
    }

    @Override // X.InterfaceC14440hU
    public final void LJJJLL() {
        xl(false);
    }

    @Override // com.bytedance.android.livesdk.ui.EnforceDarkModeFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LL).clear();
    }

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LL;
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

    @Override // X.InterfaceC14440hU
    public final void h9() {
        xl(true);
    }

    @Override // com.bytedance.android.livesdk.ui.EnforceDarkModeFragment, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final void Dl() {
        this.LJLJJLL.cancel();
        ObjectAnimator duration = ObjectAnimator.ofFloat(_$_findCachedViewById(R.id.akf), (Property<View, Float>) View.ALPHA, 1.0f, 0.0f).setDuration(300L);
        o.LJIIIIZZ(duration, "ofFloat(bgm_volume_bar, …tDuration(ANIM_DELAY_300)");
        AnimatorSet animatorSet = this.LJLJL;
        animatorSet.play(duration);
        animatorSet.start();
        animatorSet.addListener(new IDLAdapterS2S0100000(this, 3));
    }

    public final void Gl() {
        BGMPlaylistViewModel bGMPlaylistViewModel = this.LJLJJI;
        if (bGMPlaylistViewModel != null) {
            List<MusicSong> jv0 = bGMPlaylistViewModel.jv0();
            BGMPlaylistViewModel bGMPlaylistViewModel2 = this.LJLJJI;
            if (bGMPlaylistViewModel2 != null) {
                MusicSong musicSong = bGMPlaylistViewModel2.LJLIL.LJ;
                if (jv0.isEmpty()) {
                    ((LiveIconView) _$_findCachedViewById(R.id.akh)).setIconTint(C259910h.LIZJ(R.attr.ara, _$_findCachedViewById(R.id.akh)));
                    wl(_$_findCachedViewById(R.id.ake), false);
                } else {
                    ((LiveIconView) _$_findCachedViewById(R.id.akh)).setIconTint(C259910h.LIZJ(R.attr.ar7, _$_findCachedViewById(R.id.akh)));
                    wl(_$_findCachedViewById(R.id.ake), true);
                }
                if (musicSong == null || ((!jv0.isEmpty()) && musicSong != null && ((MusicSong) ListProtector.get(jv0, 0)).id == musicSong.id)) {
                    LiveIconView liveIconView = this.LJLLI;
                    if (liveIconView != null) {
                        liveIconView.setIconTint(C259910h.LIZJ(R.attr.ara, _$_findCachedViewById(R.id.akh)));
                    }
                    wl(this.LJLLILLLL, false);
                } else {
                    LiveIconView liveIconView2 = this.LJLLI;
                    if (liveIconView2 != null) {
                        liveIconView2.setIconTint(C259910h.LIZJ(R.attr.ar7, _$_findCachedViewById(R.id.akh)));
                    }
                    wl(this.LJLLILLLL, true);
                }
                if (musicSong == null) {
                    LiveIconView liveIconView3 = this.LJLLJ;
                    if (liveIconView3 != null) {
                        liveIconView3.setIconTint(C259910h.LIZJ(R.attr.ara, _$_findCachedViewById(R.id.akh)));
                    }
                    wl(this.LJLLL, false);
                    LiveIconView liveIconView4 = this.LJLLLL;
                    if (liveIconView4 != null) {
                        liveIconView4.setIconTint(C259910h.LIZJ(R.attr.ara, _$_findCachedViewById(R.id.akh)));
                    }
                    wl(this.LJLLLLLL, false);
                    return;
                }
                LiveIconView liveIconView5 = this.LJLLJ;
                if (liveIconView5 != null) {
                    liveIconView5.setIconTint(C259910h.LIZJ(R.attr.ar7, _$_findCachedViewById(R.id.akh)));
                }
                wl(this.LJLLL, true);
                LiveIconView liveIconView6 = this.LJLLLL;
                if (liveIconView6 != null) {
                    liveIconView6.setIconTint(C259910h.LIZJ(R.attr.ar7, _$_findCachedViewById(R.id.akh)));
                }
                wl(this.LJLLLLLL, true);
                return;
            }
            o.LJIJI("playlistViewModel");
            throw null;
        }
        o.LJIJI("playlistViewModel");
        throw null;
    }

    public final void vl() {
        C73411SrX c73411SrX = this.LJLJJL;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        this.LJLJJL = (C73411SrX) AbstractC73672Svk.LJJLIIIJLJLI(2L, TimeUnit.SECONDS).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new IDfS292S0100000(this, 8));
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        Integer num;
        super.onDestroy();
        C14260hC.LJFF(this);
        C73411SrX c73411SrX = this.LJLJJL;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        BGMSongListViewModel bGMSongListViewModel = this.LJLJI;
        if (bGMSongListViewModel != null) {
            bGMSongListViewModel.LJLLJ = true;
            long currentTimeMillis = (System.currentTimeMillis() - this.LJLL) / 1000;
            DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
            if (LJIILIIL == null || (num = (Integer) LJIILIIL.kv0(C2BY.class)) == null || num.intValue() != 1) {
                C14360hM.LJI(currentTimeMillis, C51029K0z.LJIILIIL(this), "normal", false);
                return;
            }
            return;
        }
        o.LJIJI("songListViewModel");
        throw null;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        List<BGMListFragment> list;
        super.onResume();
        C42941mM c42941mM = this.LJLILLLLZI;
        if (c42941mM != null && (list = c42941mM.LJLLI) != null) {
            for (BGMListFragment bGMListFragment : list) {
                long j = bGMListFragment.LJLJJLL;
                BGMSongListViewModel bGMSongListViewModel = this.LJLJI;
                if (bGMSongListViewModel != null) {
                    if (j == bGMSongListViewModel.LJLLILLLL) {
                        bGMListFragment.onResume();
                    }
                } else {
                    o.LJIJI("songListViewModel");
                    throw null;
                }
            }
        }
    }

    public final void Al(int i) {
        if (i == 0) {
            ((LiveIconView) _$_findCachedViewById(R.id.akh)).setIconAttr(R.attr.ave);
        } else if (i < 50) {
            ((LiveIconView) _$_findCachedViewById(R.id.akh)).setIconAttr(R.attr.avb);
        } else {
            ((LiveIconView) _$_findCachedViewById(R.id.akh)).setIconAttr(R.attr.avc);
        }
    }

    public final void xl(boolean z) {
        if (z) {
            LiveIconView liveIconView = this.LJLLJ;
            if (liveIconView != null) {
                liveIconView.setIconAttr(R.attr.aur);
                return;
            }
            return;
        }
        LiveIconView liveIconView2 = this.LJLLJ;
        if (liveIconView2 == null) {
            return;
        }
        liveIconView2.setIconAttr(R.attr.av3);
    }

    public static void wl(View view, boolean z) {
        if (view != null) {
            view.setClickable(z);
            view.setEnabled(z);
        }
    }

    /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Integer, O] */
    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LJLLI = (LiveIconView) view.findViewById(R.id.ak7);
        this.LJLLILLLL = view.findViewById(R.id.ak6);
        this.LJLLJ = (LiveIconView) view.findViewById(R.id.aka);
        this.LJLLL = view.findViewById(R.id.ak_);
        this.LJLLLL = (LiveIconView) view.findViewById(R.id.ak9);
        this.LJLLLLLL = view.findViewById(R.id.ak8);
        this.LJLZ = view.findViewById(R.id.akb);
        this.LJZ = view.findViewById(R.id.player_view);
        this.LJZI = view.findViewById(R.id.g94);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            this.LJLJI = (BGMSongListViewModel) ViewModelProviders.of(mo49getActivity, new C33591Tn(new C14410hR(), C51029K0z.LJIILIIL(this))).get(BGMSongListViewModel.class);
            ActivityC45651qj mo49getActivity2 = mo49getActivity();
            if (mo49getActivity2 != null) {
                this.LJLJJI = (BGMPlaylistViewModel) ViewModelProviders.of(mo49getActivity2, new C33481Tc(new C14320hI(), C51029K0z.LJIILIIL(this))).get(BGMPlaylistViewModel.class);
                XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C2ET(this, null), 3);
                XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C2EU(this, null), 3);
            }
        }
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
        getContext();
        this.LJLILLLLZI = new C42941mM(this, LJIILIIL);
        C0KV tab_strip = (C0KV) _$_findCachedViewById(R.id.kz9);
        o.LJIIIIZZ(tab_strip, "tab_strip");
        DataChannel LJIILIIL2 = C51029K0z.LJIILIIL(this);
        BGMSongListViewModel bGMSongListViewModel = this.LJLJI;
        if (bGMSongListViewModel != null) {
            this.LJLJLJ = new C14340hK(tab_strip, LJIILIIL2, bGMSongListViewModel);
            ((C0CM) _$_findCachedViewById(R.id.ak5)).setAdapter(this.LJLILLLLZI);
            _$_findCachedViewById(R.id.ak5).setSaveEnabled(false);
            ((C0CM) _$_findCachedViewById(R.id.ak5)).setOffscreenPageLimit(2);
            new C0KX((C0KV) _$_findCachedViewById(R.id.kz9), (C0CM) _$_findCachedViewById(R.id.ak5), false, ORX.LIZIZ).LIZ();
            C14260hC.LIZ(this);
            Gl();
            xl(C14260hC.LJIIJJI);
            Al((int) (InterfaceC30442Bx8.P.LIZJ().floatValue() * 200.0f));
            DataChannel LJIILIIL3 = C51029K0z.LJIILIIL(this);
            if (LJIILIIL3 != null) {
                ((C32537Cpp) LJIILIIL3.gv0(C2BY.class)).LIZ = 0;
            }
            View view2 = this.LJLLILLLL;
            if (view2 != null) {
                C29306Beo.LJJJLL(view2, 500L, new IDqS416S0100000(this, 236));
            }
            View view3 = this.LJLLL;
            if (view3 != null) {
                C29306Beo.LJJJLL(view3, 500L, new IDqS416S0100000(this, 237));
            }
            View view4 = this.LJLLLLLL;
            if (view4 != null) {
                C29306Beo.LJJJLL(view4, 500L, new IDqS416S0100000(this, 219));
            }
            View view5 = this.LJLZ;
            if (view5 != null) {
                C29306Beo.LJJJLL(view5, 500L, new IDqS416S0100000(this, 220));
            }
            ((C1H3) _$_findCachedViewById(R.id.akf)).setDataChannel(C51029K0z.LJIILIIL(this));
            ((AbsSeekBar) _$_findCachedViewById(R.id.akf)).setMax(100);
            View bgm_volume_area = _$_findCachedViewById(R.id.ake);
            o.LJIIIIZZ(bgm_volume_area, "bgm_volume_area");
            C29306Beo.LJJJLL(bgm_volume_area, 500L, new IDqS416S0100000(this, 221));
            DataChannel LJIILIIL4 = C51029K0z.LJIILIIL(this);
            if (LJIILIIL4 != null) {
                LJIILIIL4.lv0(this, BGMDismissVolumeBarEvent.class, new IDqS416S0100000(this, 222));
            }
            DataChannel LJIILIIL5 = C51029K0z.LJIILIIL(this);
            if (LJIILIIL5 != null) {
                LJIILIIL5.lv0(this, BGMRefreshVolumeBarEvent.class, new IDqS416S0100000(this, 223));
            }
            DataChannel LJIILIIL6 = C51029K0z.LJIILIIL(this);
            if (LJIILIIL6 != null) {
                LJIILIIL6.lv0(this, LiveBGMFragmentShowLogEvent.class, new IDqS416S0100000(this, 225));
            }
            C29306Beo.LJJIIJZLJL(this, null, new C2EV(this, null), 3);
            C29306Beo.LJI(this.LJZ);
            C29306Beo.LJJLJLI(this.LJZI);
            this.LJLL = System.currentTimeMillis();
            XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C54102Ak(this, null), 3);
            InterfaceC30442Bx8.LLL.LIZ(Boolean.FALSE);
            return;
        }
        o.LJIJI("songListViewModel");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.cuq, viewGroup, false);
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
