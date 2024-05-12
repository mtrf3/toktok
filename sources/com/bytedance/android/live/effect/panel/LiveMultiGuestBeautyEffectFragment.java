package com.bytedance.android.live.effect.panel;

import X.ActivityC45651qj;
import X.C0K4;
import X.C0K5;
import X.C0WD;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C1HA;
import X.C221108m2;
import X.C29306Beo;
import X.C29S;
import X.C2GI;
import X.C30686C2o;
import X.C37301dG;
import X.C3C5;
import X.C42151l5;
import X.C44171oL;
import X.C51029K0z;
import X.C54162Aq;
import X.C62822Ol8;
import X.C62848OlY;
import X.C76800UCe;
import X.C76923UGx;
import X.C90903hW;
import X.InterfaceC08180Tu;
import X.InterfaceC31981Ni;
import X.UH2;
import X.XKQ;
import X.XKX;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.effect.ForceRefreshSmallItemBeautyListPanel;
import com.bytedance.android.live.effect.OnLiveEffectSelectedEvent;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.effect.api.LinkVideoReleaseComposerManagerEvent;
import com.bytedance.android.live.effect.panel.LiveMultiGuestBeautyEffectFragment;
import com.bytedance.android.live.effect.smallitem.LiveSmallItemBeautyViewModel;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3BeautyControlGroupAppLogSetting;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class LiveMultiGuestBeautyEffectFragment extends BaseFragment {
    public static final /* synthetic */ int LJLLLL = 0;
    public InterfaceC31981Ni LJLILLLLZI;
    public C76923UGx LJLJI;
    public C0K5 LJLJJI;
    public TextView LJLJJL;
    public InterfaceC08180Tu LJLJJLL;
    public DataChannel LJLJL;
    public String LJLJLJ;
    public String LJLJLLL;
    public LiveSmallItemBeautyViewModel LJLL;
    public boolean LJLLI;
    public XKQ LJLLJ;
    public final Map<Integer, View> LJLLL = new LinkedHashMap();
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new IDqS420S0100000(this, 57));
    public final C1HA LJLLILLLL = new C0WD() { // from class: X.1HA
        @Override // X.C0WD
        public final void Z00(LiveEffect liveEffect, String str, boolean z) {
            DataChannel dataChannel;
            if (o.LJ(str, C0TY.LIZJ) && (dataChannel = LiveMultiGuestBeautyEffectFragment.this.LJLJL) != null) {
                dataChannel.pv0(ForceRefreshSmallItemBeautyListPanel.class);
            }
        }
    };

    public final void vl() {
        InterfaceC08180Tu interfaceC08180Tu = this.LJLJJLL;
        if (interfaceC08180Tu != null) {
            InterfaceC31981Ni interfaceC31981Ni = this.LJLILLLLZI;
            if (interfaceC31981Ni != null) {
                List<LiveEffect> LIZ = interfaceC31981Ni.LIZ("liveguestbeauty");
                ArrayList LIZIZ = s1.LIZIZ(LIZ, "composerManagerB.getCurr…MULTI_GUEST_BEAUTY_PANEL)");
                for (LiveEffect liveEffect : LIZ) {
                    if (o.LJ(liveEffect.effectPanelName, this.LJLJLJ)) {
                        LIZIZ.add(liveEffect);
                    }
                }
                boolean z = false;
                if (!LIZIZ.isEmpty()) {
                    Iterator it = LIZIZ.iterator();
                    while (it.hasNext()) {
                        LiveEffect liveEffect2 = (LiveEffect) it.next();
                        if (!liveEffect2.isExclusive) {
                            InterfaceC31981Ni interfaceC31981Ni2 = this.LJLILLLLZI;
                            if (interfaceC31981Ni2 != null) {
                                if (C29306Beo.LJJIFFI(Boolean.valueOf(interfaceC31981Ni2.LJIIL(liveEffect2)))) {
                                }
                            } else {
                                o.LJIJI("composerManagerB");
                                throw null;
                            }
                        }
                        z = true;
                    }
                }
                interfaceC08180Tu.LIZ(C29306Beo.LJJIFFI(Boolean.valueOf(z)));
                return;
            }
            o.LJIJI("composerManagerB");
            throw null;
        }
        o.LJIJI("beautyCallback");
        throw null;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        XKQ xkq = this.LJLLJ;
        if (xkq != null) {
            xkq.LIZIZ(C62848OlY.LIZ("fragment on destroy", null));
        }
        InterfaceC31981Ni interfaceC31981Ni = this.LJLILLLLZI;
        if (interfaceC31981Ni != null) {
            interfaceC31981Ni.LJIILJJIL(this.LJLLILLLL);
        } else {
            o.LJIJI("composerManagerB");
            throw null;
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLLL).clear();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        InterfaceC08180Tu interfaceC08180Tu = this.LJLJJLL;
        if (interfaceC08180Tu != null) {
            ImageView LJI = interfaceC08180Tu.LJI();
            if (LJI != null) {
                C29306Beo.LJJJLL(LJI, 500L, new IDqS416S0100000(this, 302));
            }
            View findViewById = view.findViewById(R.id.cst);
            o.LJIIIIZZ(findViewById, "rootView.findViewById(R.id.effect_state_layout)");
            this.LJLJJI = (C0K5) findViewById;
            this.LJLJL = C51029K0z.LJIILIIL(this);
            this.LJLLI = false;
            C42151l5.LJIILIIL = false;
            if (mo49getActivity() != null) {
                this.LJLL = (LiveSmallItemBeautyViewModel) new ViewModelProvider(C30686C2o.LJLIL, new C37301dG(new C44171oL("liveguestbeauty", false))).get(LiveSmallItemBeautyViewModel.class);
            }
            this.LJLLJ = XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C2GI(this, null), 3);
            C0K5 c0k5 = this.LJLJJI;
            if (c0k5 != null) {
                c0k5.LJFF();
                DataChannel dataChannel = this.LJLJL;
                if (dataChannel != null) {
                    dataChannel.lv0(this, OnLiveEffectSelectedEvent.class, new IDqS416S0100000(this, 78));
                    dataChannel.lv0(this, LinkVideoReleaseComposerManagerEvent.class, new IDqS416S0100000(this, 79));
                }
                C76923UGx c76923UGx = this.LJLJI;
                if (c76923UGx != null) {
                    c76923UGx.setOnLevelChangeListener(new UH2() { // from class: X.1jR
                        @Override // X.UH1
                        public final void LIZ(int i) {
                            LiveMultiGuestBeautyEffectFragment liveMultiGuestBeautyEffectFragment = LiveMultiGuestBeautyEffectFragment.this;
                            liveMultiGuestBeautyEffectFragment.LJLLI = true;
                            ((C24290xN) liveMultiGuestBeautyEffectFragment.LJLIL.getValue()).LJ(i);
                            LiveMultiGuestBeautyEffectFragment.this.vl();
                            C42151l5.LJIILIIL = true;
                        }

                        @Override // X.UH2, X.UH1
                        public final void LIZIZ(int i) {
                            int i2;
                            Integer num;
                            int i3;
                            LiveEffect.ComposerConfig smallItemConfig;
                            if (LiveMultiGuestBeautyEffectFragment.this.LJLLI) {
                                InterfaceC06390Mx LIZ = CN1.LIZ(IEffectService.class);
                                o.LJIIIIZZ(LIZ, "getService(T::class.java)");
                                if (((IEffectService) LIZ).getMultiGuestBeautyLogManager() != null) {
                                    LiveEffect liveEffect = ((C24290xN) LiveMultiGuestBeautyEffectFragment.this.LJLIL.getValue()).LJIILIIL;
                                    InterfaceC08180Tu interfaceC08180Tu2 = LiveMultiGuestBeautyEffectFragment.this.LJLJJLL;
                                    Integer num2 = null;
                                    if (interfaceC08180Tu2 != null) {
                                        java.util.Map<String, String> commonParams = interfaceC08180Tu2.LJII();
                                        DataChannel dataChannel2 = LiveMultiGuestBeautyEffectFragment.this.LJLJL;
                                        o.LJIIIZ(commonParams, "commonParams");
                                        if (liveEffect != null && (smallItemConfig = liveEffect.getSmallItemConfig()) != null) {
                                            i2 = smallItemConfig.LIZ;
                                        } else {
                                            i2 = 0;
                                        }
                                        if (LinkMicMultiGuestV3BeautyControlGroupAppLogSetting.INSTANCE.getValue() && i2 != 0 && liveEffect != null) {
                                            BZI LIZ2 = C28787BRn.LIZ("livesdk_guest_connection_beauty_select");
                                            LIZ2.LJIILLIIL(dataChannel2);
                                            LiveEffect.ComposerConfig smallItemConfig2 = liveEffect.getSmallItemConfig();
                                            if (smallItemConfig2 != null) {
                                                num = Integer.valueOf(smallItemConfig2.LIZ);
                                            } else {
                                                num = null;
                                            }
                                            LiveEffect.ComposerConfig smallItemConfig3 = liveEffect.getSmallItemConfig();
                                            if (smallItemConfig3 != null) {
                                                num2 = Integer.valueOf(smallItemConfig3.LIZIZ);
                                            }
                                            LIZ2.LJIJJ(Integer.valueOf(o.LJ(num, num2) ? 1 : 0), "is_default_value");
                                            LiveEffect.ComposerConfig smallItemConfig4 = liveEffect.getSmallItemConfig();
                                            if (smallItemConfig4 != null) {
                                                i3 = smallItemConfig4.LIZ;
                                            } else {
                                                i3 = 0;
                                            }
                                            LIZ2.LJIJJ(String.valueOf(O6R.LJJIIZ(C12920f2.LIZLLL(liveEffect, i3) * 100.0f) / 100.0f), "beauty_value");
                                            LIZ2.LJJIFFI(commonParams);
                                            C77412UZs.LJJIIZ(LIZ2, liveEffect);
                                            LIZ2.LJJIIJZLJL();
                                        }
                                    } else {
                                        o.LJIJI("beautyCallback");
                                        throw null;
                                    }
                                }
                                LiveMultiGuestBeautyEffectFragment.this.LJLLI = false;
                            }
                        }
                    });
                    C0K5 c0k52 = this.LJLJJI;
                    if (c0k52 != null) {
                        c0k52.setErrorClickListener(new C0K4() { // from class: X.1H9
                            @Override // X.C0K4
                            public final void LIZIZ() {
                                XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(LiveMultiGuestBeautyEffectFragment.this), null, null, new C54172Ar(LiveMultiGuestBeautyEffectFragment.this, null), 3);
                            }
                        });
                        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C54162Aq(this, null), 3);
                        InterfaceC31981Ni interfaceC31981Ni = this.LJLILLLLZI;
                        if (interfaceC31981Ni != null) {
                            interfaceC31981Ni.LJIIIZ(this.LJLLILLLL);
                            return;
                        } else {
                            o.LJIJI("composerManagerB");
                            throw null;
                        }
                    }
                    o.LJIJI("effectStateLayout");
                    throw null;
                }
                o.LJIJI("seekbar");
                throw null;
            }
            o.LJIJI("effectStateLayout");
            throw null;
        }
        o.LJIJI("beautyCallback");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        C29S c29s = null;
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.de2, null, false);
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
