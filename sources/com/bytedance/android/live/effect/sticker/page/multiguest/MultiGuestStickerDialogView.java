package com.bytedance.android.live.effect.sticker.page.multiguest;

import X.C0G1;
import X.C0PQ;
import X.C0PS;
import X.C0TY;
import X.C0WF;
import X.C11060c2;
import X.C16880lQ;
import X.C29306Beo;
import X.C30686C2o;
import X.C30801Iu;
import X.C32001Nk;
import X.C38991fz;
import X.C39011g1;
import X.C41191jX;
import X.C44821pO;
import X.C76956UIe;
import X.C80664VlE;
import X.InterfaceC08010Td;
import X.InterfaceC30442Bx8;
import X.InterfaceC77393UYz;
import Y.IDCListenerS135S0100000;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.live.effect.MultiGuestStickerSelectedEvent;
import com.bytedance.android.live.effect.api.MultiGuestStickerFullPanelHiddenStateChangedEvent;
import com.bytedance.android.live.effect.sticker.data.MultiGuestStickerViewModel;
import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import com.bytedance.android.live.effect.sticker.page.multiguest.MultiGuestStickerDialogView;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestLeakOptSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class MultiGuestStickerDialogView extends BaseMultiGuestStickerView implements InterfaceC08010Td {
    public final int LJLLJ;
    public final C11060c2 LJLLL;
    public final C30801Iu LJLLLL;
    public C76956UIe LJLLLLLL;
    public final List<C32001Nk> LJLZ;
    public final List<C32001Nk> LJZ;

    @Override // X.InterfaceC08010Td
    public final void LIZ() {
    }

    @Override // X.InterfaceC08010Td
    public final void LIZIZ(DialogFragment fragment) {
        o.LJIIIZ(fragment, "fragment");
    }

    @Override // com.bytedance.android.live.effect.sticker.page.multiguest.BaseMultiGuestStickerView
    public final String LIZLLL() {
        return "more";
    }

    @Override // X.InterfaceC08010Td
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onDialogForeground() {
        LiveEffect liveEffect;
        C30801Iu c30801Iu;
        BaseMultiGuestStickerView.LJLLILLLL = true;
        C30801Iu c30801Iu2 = this.LJLLLL;
        if (c30801Iu2 != null) {
            c30801Iu2.LJJIIJZLJL();
        }
        C76956UIe c76956UIe = this.LJLLLLLL;
        if (c76956UIe != null && (c30801Iu = this.LJLLLL) != null) {
            c30801Iu.LJJIIZ(c76956UIe.LIZLLL);
        }
        if (C29306Beo.LJJIIJ(LJ())) {
            C30801Iu c30801Iu3 = this.LJLLLL;
            if (c30801Iu3 != null) {
                liveEffect = c30801Iu3.LJLJLJ;
            } else {
                liveEffect = null;
            }
            this.LJLJL = liveEffect;
            C41191jX c41191jX = this.LJLL;
            String STICKER_INTERACT = C0TY.LIZJ;
            o.LJIIIIZZ(STICKER_INTERACT, "STICKER_INTERACT");
            c41191jX.LIZJ(STICKER_INTERACT);
            this.LJLL.LJ(this.LJLJJI);
        }
    }

    @Override // com.bytedance.android.live.effect.sticker.page.multiguest.BaseMultiGuestStickerView, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
        if (event == Lifecycle.Event.ON_RESUME) {
            onDialogForeground();
        } else if (event == Lifecycle.Event.ON_STOP) {
            onDialogBackground();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // com.bytedance.android.live.effect.sticker.page.multiguest.BaseMultiGuestStickerView
    public final View LIZJ() {
        int i;
        LayoutInflater LLZIL = C16880lQ.LLZIL(this.LJLIL.getContext());
        if (this.LJLLJ == 2) {
            i = R.layout.d2a;
        } else {
            i = R.layout.d2b;
        }
        View LLLZIIL = C16880lQ.LLLZIIL(i, LLZIL, this.LJLLL.LIZJ);
        o.LJIIIIZZ(LLLZIIL, "from(fragment.context)\n …arentViewGroup,\n        )");
        return LLLZIIL;
    }

    @Override // com.bytedance.android.live.effect.sticker.page.multiguest.BaseMultiGuestStickerView
    public final void LJI() {
        C30801Iu c30801Iu = this.LJLLLL;
        if (c30801Iu != null) {
            c30801Iu.LJJIIJ();
        }
    }

    @Override // com.bytedance.android.live.effect.sticker.page.multiguest.BaseMultiGuestStickerView
    public final void LJII() {
        C30801Iu c30801Iu = this.LJLLLL;
        if (c30801Iu != null) {
            c30801Iu.LJJIIJZLJL();
        }
    }

    @Override // X.InterfaceC08010Td
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onDialogBackground() {
        C30801Iu c30801Iu = this.LJLLLL;
        if (c30801Iu != null) {
            c30801Iu.LJJIIJ();
        }
    }

    @Override // X.InterfaceC08010Td
    public final View getView() {
        return LJ();
    }

    @Override // com.bytedance.android.live.effect.sticker.page.multiguest.BaseMultiGuestStickerView
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        super.onDestroy();
        BaseMultiGuestStickerView.LJLLILLLL = false;
        if (LiveSdkMultiGuestLeakOptSetting.INSTANCE.isEnable()) {
            C30801Iu c30801Iu = this.LJLLLL;
            if (c30801Iu != null) {
                Iterator it = ((ArrayList) c30801Iu.LJLLILLLL).iterator();
                while (it.hasNext()) {
                    C0G1 c0g1 = (C0G1) it.next();
                    c0g1.LJIIIIZZ.LJLLLLLL = false;
                    c0g1.LIZIZ = false;
                }
            }
            this.LJLIL.getLifecycle().removeObserver(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiGuestStickerDialogView(Fragment fragment, ViewGroup propsAlbumContainer, int i, IFilterManager iFilterManager, final C0WF c0wf, C11060c2 guestBean) {
        super(fragment, iFilterManager, c0wf, propsAlbumContainer, guestBean.LIZIZ, guestBean.LIZ);
        C30801Iu c30801Iu;
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(propsAlbumContainer, "propsAlbumContainer");
        o.LJIIIZ(guestBean, "guestBean");
        this.LJLLJ = i;
        this.LJLLL = guestBean;
        View findViewById = LJ().findViewById(R.id.kz9);
        o.LJIIIIZZ(findViewById, "rootView.findViewById(R.id.tab_strip)");
        C80664VlE c80664VlE = (C80664VlE) findViewById;
        View findViewById2 = LJ().findViewById(R.id.kin);
        o.LJIIIIZZ(findViewById2, "rootView.findViewById(R.id.sticker_pager)");
        ViewPager viewPager = (ViewPager) findViewById2;
        C0PS c0ps = new C0PS(c80664VlE, viewPager);
        String STICKER = C0TY.LIZIZ;
        o.LJIIIIZZ(STICKER, "STICKER");
        StickerEffectViewModel stickerEffectViewModel = (StickerEffectViewModel) new ViewModelProvider(C30686C2o.LJLIL, new C38991fz(new C39011g1(STICKER), new C44821pO())).get(StickerEffectViewModel.class);
        Context context = fragment.getContext();
        if (context != null) {
            DataChannel dataChannel = this.LJLJJLL;
            String STICKER_INTERACT = C0TY.LIZJ;
            o.LJIIIIZZ(STICKER_INTERACT, "STICKER_INTERACT");
            c30801Iu = new C30801Iu(dataChannel, STICKER_INTERACT, c0wf, context, stickerEffectViewModel);
        } else {
            c30801Iu = null;
        }
        this.LJLLLL = c30801Iu;
        ArrayList arrayList = new ArrayList();
        this.LJLZ = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.LJZ = arrayList2;
        LJFF();
        C16880lQ.LJIIJ(new IDCListenerS135S0100000(this, 53), LJ().findViewById(R.id.atf));
        C16880lQ.LJIIJ(new IDCListenerS135S0100000(this, 54), LJ().findViewById(R.id.atd));
        if (c30801Iu != null) {
            c30801Iu.LJLJL = new C0PQ() { // from class: X.1HL
                @Override // X.C0PQ
                public final void LIZ(LiveEffect liveEffect, LiveEffect liveEffect2) {
                    C0WF c0wf2;
                    if (liveEffect2 == null) {
                        if (liveEffect != null) {
                            C0WF c0wf3 = C0WF.this;
                            if (c0wf3 != null) {
                                c0wf3.LIZLLL(C0TY.LIZJ);
                            }
                            this.LJLL.LJFF(liveEffect);
                        }
                    } else {
                        if (C77412UZs.LJIL(liveEffect) && (c0wf2 = C0WF.this) != null) {
                            c0wf2.LIZLLL(C0TY.LIZJ);
                        }
                        this.LJLL.getClass();
                        C0WF c0wf4 = C0WF.this;
                        if (c0wf4 != null) {
                            c0wf4.LJJIIJ(C0TY.LIZJ, liveEffect, liveEffect2);
                        }
                        this.LJLL.LIZIZ(liveEffect2);
                    }
                    MultiGuestStickerDialogView multiGuestStickerDialogView = this;
                    multiGuestStickerDialogView.LJLJL = liveEffect2;
                    DataChannel dataChannel2 = multiGuestStickerDialogView.LJLJJLL;
                    if (dataChannel2 != null) {
                        dataChannel2.qv0(MultiGuestStickerSelectedEvent.class, new C07680Rw(liveEffect2));
                    }
                }
            };
        }
        viewPager.setAdapter(c30801Iu);
        viewPager.setOffscreenPageLimit(3);
        c80664VlE.LJIILLIIL(viewPager, false, false);
        c80664VlE.LIZIZ(new InterfaceC77393UYz() { // from class: X.1HM
            @Override // X.InterfaceC77393UYz
            public final void LIZ() {
            }

            @Override // X.InterfaceC77393UYz
            public final void LIZIZ(C76956UIe c76956UIe) {
            }

            @Override // X.InterfaceC77393UYz
            public final void LIZJ(C76956UIe c76956UIe) {
                Object obj;
                C32001Nk c32001Nk;
                String str;
                String str2 = null;
                if (c76956UIe != null) {
                    obj = c76956UIe.LIZ;
                } else {
                    obj = null;
                }
                if (obj instanceof C32001Nk) {
                    c32001Nk = (C32001Nk) obj;
                } else {
                    c32001Nk = null;
                }
                MultiGuestStickerDialogView multiGuestStickerDialogView = MultiGuestStickerDialogView.this;
                int i2 = 1;
                if (multiGuestStickerDialogView.LJLLLLLL != null) {
                    C41191jX c41191jX = multiGuestStickerDialogView.LJLL;
                    if (c32001Nk != null) {
                        str = c32001Nk.LJLIL;
                        str2 = c32001Nk.LJLILLLLZI;
                    } else {
                        str = null;
                    }
                    c41191jX.LJII(str, str2);
                }
                MultiGuestStickerDialogView multiGuestStickerDialogView2 = MultiGuestStickerDialogView.this;
                multiGuestStickerDialogView2.LJLLLLLL = c76956UIe;
                C30801Iu c30801Iu2 = multiGuestStickerDialogView2.LJLLLL;
                if (c30801Iu2 != null) {
                    if (c76956UIe != null) {
                        i2 = c76956UIe.LIZLLL;
                    }
                    c30801Iu2.LJJIIZ(i2);
                }
            }
        });
        List<C32001Nk> value = ((MultiGuestStickerViewModel) this.LJLJLJ.getValue()).LJLJJL.getValue();
        if (value != null) {
            arrayList2.clear();
            arrayList2.addAll(value);
            arrayList.clear();
            arrayList.add(new C32001Nk("favorite", "favorite", false));
            arrayList.addAll(arrayList2);
            if (c30801Iu != null) {
                c30801Iu.setData(arrayList);
            }
            c0ps.LIZLLL = 1;
            c0ps.LIZ(arrayList);
            if (c30801Iu != null) {
                C76956UIe c76956UIe = this.LJLLLLLL;
                c30801Iu.LJJIIZ(c76956UIe != null ? c76956UIe.LIZLLL : 1);
            }
        }
        InterfaceC30442Bx8.s.LIZ(Boolean.TRUE);
        DataChannel dataChannel2 = this.LJLJJLL;
        if (dataChannel2 != null) {
            dataChannel2.lv0(LiveSdkMultiGuestLeakOptSetting.INSTANCE.isEnable() ? fragment : null, MultiGuestStickerFullPanelHiddenStateChangedEvent.class, new IDqS416S0100000(this, 83));
        }
        if (LiveSdkMultiGuestLeakOptSetting.INSTANCE.isEnable()) {
            fragment.getLifecycle().addObserver(this);
        }
    }
}
