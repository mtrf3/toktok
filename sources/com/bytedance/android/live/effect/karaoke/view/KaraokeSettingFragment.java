package com.bytedance.android.live.effect.karaoke.view;

import X.ActivityC45651qj;
import X.C05820Ks;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C21210sP;
import X.C29306Beo;
import X.C29S;
import X.C2AS;
import X.C2AT;
import X.C37911eF;
import X.C3C5;
import X.C40731in;
import X.C41071jL;
import X.C51029K0z;
import X.C538629m;
import X.C54992Dv;
import X.C76800UCe;
import X.C76923UGx;
import X.C90903hW;
import X.CN1;
import X.InterfaceC21020s6;
import X.InterfaceC30442Bx8;
import X.InterfaceC32901Qw;
import X.UH2;
import X.V10;
import X.XKX;
import Y.IDCListenerS135S0100000;
import Y.IDCListenerS201S0100000;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.effect.karaoke.view.KaraokeSettingFragment;
import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveKaraokeEchoAllowListSetting;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.ttlivestreamer.livestreamv2.filter.IAudioFilterManager;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class KaraokeSettingFragment extends BaseFragment implements InterfaceC32901Qw {
    public View LJLIL;
    public C41071jL LJLILLLLZI;
    public View LJLJI;
    public C41071jL LJLJJI;
    public C41071jL LJLJJL;
    public View LJLJJLL;
    public TextView LJLJL;
    public C76923UGx LJLJLJ;
    public TextView LJLJLLL;
    public C76923UGx LJLL;
    public C05820Ks LJLLI;
    public View LJLLILLLL;
    public View LJLLJ;
    public TextView LJLLL;
    public RecyclerView LJLLLL;
    public C40731in LJLLLLLL;
    public KaraokeViewModel LJLZ;
    public IAudioFilterManager LJZ;
    public DataChannel LJZI;
    public int LJZL;
    public int LL;
    public final Map<Integer, View> LLD = new LinkedHashMap();

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, X.InterfaceC12810er
    public final /* synthetic */ int getThemeOverlay(Context context) {
        return V10.LIZ();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LLD).clear();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        IAudioFilterManager iAudioFilterManager;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LJZI = C51029K0z.LJIILIIL(this);
        InterfaceC21020s6 interfaceC21020s6 = (InterfaceC21020s6) DataChannelGlobal.LJLJJI.mv0(C54992Dv.class);
        if (interfaceC21020s6 != null) {
            iAudioFilterManager = interfaceC21020s6.getAudioFilterMgr();
        } else {
            iAudioFilterManager = null;
        }
        this.LJZ = iAudioFilterManager;
        View findViewById = view.findViewById(R.id.aej);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.back_btn)");
        this.LJLIL = findViewById;
        View findViewById2 = view.findViewById(R.id.gbd);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.lyrics_switch)");
        this.LJLILLLLZI = (C41071jL) findViewById2;
        View findViewById3 = view.findViewById(R.id.gbe);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.lyrics_switch_click_area)");
        this.LJLJI = findViewById3;
        View findViewById4 = view.findViewById(R.id.hdx);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.original_switch)");
        this.LJLJJI = (C41071jL) findViewById4;
        View findViewById5 = view.findViewById(R.id.iox);
        o.LJIIIIZZ(findViewById5, "view.findViewById(R.id.reaction_switch)");
        this.LJLJJL = (C41071jL) findViewById5;
        View findViewById6 = view.findViewById(R.id.iov);
        o.LJIIIIZZ(findViewById6, "view.findViewById(R.id.reaction_hint)");
        this.LJLJJLL = findViewById6;
        View findViewById7 = view.findViewById(R.id.nde);
        o.LJIIIIZZ(findViewById7, "view.findViewById(R.id.vocal_volume_progress)");
        this.LJLJLJ = (C76923UGx) findViewById7;
        View findViewById8 = view.findViewById(R.id.ndf);
        o.LJIIIIZZ(findViewById8, "view.findViewById(R.id.vocal_volume_value)");
        this.LJLJL = (TextView) findViewById8;
        View findViewById9 = view.findViewById(R.id.my);
        o.LJIIIIZZ(findViewById9, "view.findViewById(R.id.a…paniment_volume_progress)");
        this.LJLL = (C76923UGx) findViewById9;
        View findViewById10 = view.findViewById(R.id.n0);
        o.LJIIIIZZ(findViewById10, "view.findViewById(R.id.accompaniment_volume_value)");
        this.LJLJLLL = (TextView) findViewById10;
        View findViewById11 = view.findViewById(R.id.lbx);
        o.LJIIIIZZ(findViewById11, "view.findViewById(R.id.tone_progress)");
        this.LJLLI = (C05820Ks) findViewById11;
        View findViewById12 = view.findViewById(R.id.lbv);
        o.LJIIIIZZ(findViewById12, "view.findViewById(R.id.tone_minus)");
        this.LJLLILLLL = findViewById12;
        View findViewById13 = view.findViewById(R.id.lbw);
        o.LJIIIIZZ(findViewById13, "view.findViewById(R.id.tone_plus)");
        this.LJLLJ = findViewById13;
        View findViewById14 = view.findViewById(R.id.lby);
        o.LJIIIIZZ(findViewById14, "view.findViewById(R.id.tone_value)");
        this.LJLLL = (TextView) findViewById14;
        View findViewById15 = view.findViewById(R.id.k7j);
        o.LJIIIIZZ(findViewById15, "view.findViewById(R.id.sound_effect_view)");
        this.LJLLLL = (RecyclerView) findViewById15;
        View view2 = this.LJLIL;
        if (view2 != null) {
            C29306Beo.LJJJLL(view2, 500L, new IDqS416S0100000(this, 15));
            if (!LiveKaraokeEchoAllowListSetting.INSTANCE.enable()) {
                C41071jL c41071jL = this.LJLJJL;
                if (c41071jL != null) {
                    C29306Beo.LJI(c41071jL);
                    View view3 = this.LJLJJLL;
                    if (view3 != null) {
                        C29306Beo.LJI(view3);
                    } else {
                        o.LJIJI("reactionHint");
                        throw null;
                    }
                } else {
                    o.LJIJI("reactionSwitch");
                    throw null;
                }
            }
            C41071jL c41071jL2 = this.LJLJJL;
            if (c41071jL2 != null) {
                c41071jL2.setSaveEnabled(false);
                C41071jL c41071jL3 = this.LJLILLLLZI;
                if (c41071jL3 != null) {
                    c41071jL3.setSaveEnabled(false);
                    C41071jL c41071jL4 = this.LJLJJI;
                    if (c41071jL4 != null) {
                        c41071jL4.setSaveEnabled(false);
                        C41071jL c41071jL5 = this.LJLJJL;
                        if (c41071jL5 != null) {
                            c41071jL5.setChecked(((IBroadcastService) CN1.LIZ(IBroadcastService.class)).getEchoHelper().LIZ());
                            C41071jL c41071jL6 = this.LJLJJL;
                            if (c41071jL6 != null) {
                                c41071jL6.setOnCheckedChangeListener(new IDCListenerS201S0100000(this, 0));
                                View view4 = this.LJLJI;
                                if (view4 != null) {
                                    C16880lQ.LJIIJ(new IDCListenerS135S0100000(this, 7), view4);
                                    C41071jL c41071jL7 = this.LJLILLLLZI;
                                    if (c41071jL7 != null) {
                                        c41071jL7.setOnCheckedChangeListener(new IDCListenerS201S0100000(this, 1));
                                        C41071jL c41071jL8 = this.LJLJJI;
                                        if (c41071jL8 != null) {
                                            c41071jL8.setOnCheckedChangeListener(new IDCListenerS201S0100000(this, 2));
                                            C76923UGx c76923UGx = this.LJLJLJ;
                                            if (c76923UGx != null) {
                                                c76923UGx.LIZJ(100, 0, 0, true);
                                                C76923UGx c76923UGx2 = this.LJLL;
                                                if (c76923UGx2 != null) {
                                                    c76923UGx2.LIZJ(100, 0, 0, true);
                                                    C76923UGx c76923UGx3 = this.LJLJLJ;
                                                    if (c76923UGx3 != null) {
                                                        c76923UGx3.setPercent(C21210sP.LJ());
                                                        TextView textView = this.LJLJL;
                                                        if (textView != null) {
                                                            textView.setText(String.valueOf(InterfaceC30442Bx8.C3.LIZJ()));
                                                            C76923UGx c76923UGx4 = this.LJLL;
                                                            if (c76923UGx4 != null) {
                                                                c76923UGx4.setPercent(C21210sP.LIZLLL());
                                                                TextView textView2 = this.LJLJLLL;
                                                                if (textView2 != null) {
                                                                    textView2.setText(String.valueOf(InterfaceC30442Bx8.D3.LIZJ()));
                                                                    C76923UGx c76923UGx5 = this.LJLJLJ;
                                                                    if (c76923UGx5 != null) {
                                                                        c76923UGx5.setOnLevelChangeListener(new UH2() { // from class: X.1il
                                                                            @Override // X.UH2, X.UH1
                                                                            public final void onStart() {
                                                                                KaraokeSettingFragment.this.LJZL = C21210sP.LJ();
                                                                            }

                                                                            @Override // X.UH1
                                                                            public final void LIZ(int i) {
                                                                                Boolean bool;
                                                                                IAudioFilterManager iAudioFilterManager2;
                                                                                if (KaraokeSettingFragment.this.LJLZ != null) {
                                                                                    bool = Boolean.valueOf(!r0.LJLZ);
                                                                                } else {
                                                                                    bool = null;
                                                                                }
                                                                                if (C29306Beo.LJJIFFI(bool) && (iAudioFilterManager2 = KaraokeSettingFragment.this.LJZ) != null) {
                                                                                    iAudioFilterManager2.setVoiceVolume(C21210sP.LIZIZ(i));
                                                                                }
                                                                                TextView textView3 = KaraokeSettingFragment.this.LJLJL;
                                                                                if (textView3 != null) {
                                                                                    textView3.setText(String.valueOf(i));
                                                                                } else {
                                                                                    o.LJIJI("vocalVolumeValue");
                                                                                    throw null;
                                                                                }
                                                                            }

                                                                            @Override // X.UH2, X.UH1
                                                                            public final void LIZIZ(int i) {
                                                                                float LIZIZ = C21210sP.LIZIZ(KaraokeSettingFragment.this.LJZL);
                                                                                float LIZIZ2 = C21210sP.LIZIZ(i);
                                                                                if (LIZIZ != LIZIZ2) {
                                                                                    C21180sM.LJIIIZ(KaraokeSettingFragment.this.LJZI, "vocal", LIZIZ2);
                                                                                }
                                                                                InterfaceC30442Bx8.C3.LIZ(Integer.valueOf(i));
                                                                            }
                                                                        });
                                                                        C76923UGx c76923UGx6 = this.LJLL;
                                                                        if (c76923UGx6 != null) {
                                                                            c76923UGx6.setOnLevelChangeListener(new UH2() { // from class: X.1im
                                                                                @Override // X.UH2, X.UH1
                                                                                public final void onStart() {
                                                                                    KaraokeSettingFragment.this.LL = C21210sP.LIZLLL();
                                                                                }

                                                                                @Override // X.UH1
                                                                                public final void LIZ(int i) {
                                                                                    Boolean bool;
                                                                                    IAudioFilterManager iAudioFilterManager2;
                                                                                    if (KaraokeSettingFragment.this.LJLZ != null) {
                                                                                        bool = Boolean.valueOf(!r0.LJLZ);
                                                                                    } else {
                                                                                        bool = null;
                                                                                    }
                                                                                    if (C29306Beo.LJJIFFI(bool) && (iAudioFilterManager2 = KaraokeSettingFragment.this.LJZ) != null) {
                                                                                        iAudioFilterManager2.setBGMVolume(C21210sP.LIZ(i));
                                                                                    }
                                                                                    TextView textView3 = KaraokeSettingFragment.this.LJLJLLL;
                                                                                    if (textView3 != null) {
                                                                                        textView3.setText(String.valueOf(i));
                                                                                    } else {
                                                                                        o.LJIJI("accompanimentVolumeValue");
                                                                                        throw null;
                                                                                    }
                                                                                }

                                                                                @Override // X.UH2, X.UH1
                                                                                public final void LIZIZ(int i) {
                                                                                    float LIZ = C21210sP.LIZ(KaraokeSettingFragment.this.LL);
                                                                                    float LIZ2 = C21210sP.LIZ(i);
                                                                                    if (LIZ != LIZ2) {
                                                                                        C21180sM.LJIIIZ(KaraokeSettingFragment.this.LJZI, "instrumental", LIZ2);
                                                                                    }
                                                                                    InterfaceC30442Bx8.D3.LIZ(Integer.valueOf(i));
                                                                                }
                                                                            });
                                                                            View view5 = this.LJLLILLLL;
                                                                            if (view5 != null) {
                                                                                C16880lQ.LJIIJ(new IDCListenerS135S0100000(this, 8), view5);
                                                                                View view6 = this.LJLLJ;
                                                                                if (view6 != null) {
                                                                                    C16880lQ.LJIIJ(new IDCListenerS135S0100000(this, 9), view6);
                                                                                    C05820Ks c05820Ks = this.LJLLI;
                                                                                    if (c05820Ks != null) {
                                                                                        c05820Ks.setOnToneChangeListener(new IDqS416S0100000(this, 16));
                                                                                        this.LJLZ = C21210sP.LIZJ(C51029K0z.LJIILIIL(this));
                                                                                        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C538629m(this, null), 3);
                                                                                        this.LJLLLLLL = new C40731in(this.LJZI, this, this.LJLZ);
                                                                                        RecyclerView recyclerView = this.LJLLLL;
                                                                                        if (recyclerView != null) {
                                                                                            recyclerView.getContext();
                                                                                            recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
                                                                                            recyclerView.LJII(new C37911eF(18.0f, 18.0f, 12.0f), -1);
                                                                                            C40731in c40731in = this.LJLLLLLL;
                                                                                            if (c40731in != null) {
                                                                                                recyclerView.setAdapter(c40731in);
                                                                                                recyclerView.setHasFixedSize(true);
                                                                                                recyclerView.setItemAnimator(null);
                                                                                                XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C2AS(this, null), 3);
                                                                                                XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C2AT(this, null), 3);
                                                                                                return;
                                                                                            }
                                                                                            o.LJIJI("soundEffectAdapter");
                                                                                            throw null;
                                                                                        }
                                                                                        o.LJIJI("soundEffectView");
                                                                                        throw null;
                                                                                    }
                                                                                    o.LJIJI("toneProgress");
                                                                                    throw null;
                                                                                }
                                                                                o.LJIJI("tonePlusIcon");
                                                                                throw null;
                                                                            }
                                                                            o.LJIJI("toneMinusIcon");
                                                                            throw null;
                                                                        }
                                                                        o.LJIJI("accompanimentVolumeProgress");
                                                                        throw null;
                                                                    }
                                                                    o.LJIJI("vocalVolumeProgress");
                                                                    throw null;
                                                                }
                                                                o.LJIJI("accompanimentVolumeValue");
                                                                throw null;
                                                            }
                                                            o.LJIJI("accompanimentVolumeProgress");
                                                            throw null;
                                                        }
                                                        o.LJIJI("vocalVolumeValue");
                                                        throw null;
                                                    }
                                                    o.LJIJI("vocalVolumeProgress");
                                                    throw null;
                                                }
                                                o.LJIJI("accompanimentVolumeProgress");
                                                throw null;
                                            }
                                            o.LJIJI("vocalVolumeProgress");
                                            throw null;
                                        }
                                        o.LJIJI("originalSwitch");
                                        throw null;
                                    }
                                    o.LJIJI("lyricsSwitch");
                                    throw null;
                                }
                                o.LJIJI("lyricsClickArea");
                                throw null;
                            }
                            o.LJIJI("reactionSwitch");
                            throw null;
                        }
                        o.LJIJI("reactionSwitch");
                        throw null;
                    }
                    o.LJIJI("originalSwitch");
                    throw null;
                }
                o.LJIJI("lyricsSwitch");
                throw null;
            }
            o.LJIJI("reactionSwitch");
            throw null;
        }
        o.LJIJI("backBtn");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.d__, viewGroup, false);
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
