package X;

import Y.IDCListenerS135S0100000;
import Y.IDCListenerS83S0200000;
import Y.IDRunnableS6S0101000;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.live.effect.api.StickerPanelHideEvent;
import com.bytedance.android.live.effect.api.StickerPanelShowEvent;
import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import com.bytedance.android.livesdk.dataChannel.GreenScreenCreatorBlockChannel;
import com.bytedance.android.livesdk.dataChannel.LiveDialogStatusChannel;
import com.bytedance.android.livesdk.dataChannel.StickerCancelChannel;
import com.bytedance.android.livesdk.dataChannel.StickerHintShowChannel;
import com.bytedance.android.livesdk.livesetting.banner.EffectMemoryPositionOptSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEffectHouseEffectSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.1Io, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC30741Io implements InterfaceC08010Td, View.OnLayoutChangeListener {
    public final DataChannel LJLIL;
    public final View LJLILLLLZI;
    public final C05960Lg LJLJI;
    public C05900La LJLJJI;
    public final C80664VlE LJLJJL;
    public final ViewPager LJLJJLL;
    public C76956UIe LJLJL;
    public final StickerEffectViewModel LJLJLJ;
    public final C30801Iu LJLJLLL;
    public final ViewGroup LJLL;
    public final C0PS LJLLI;
    public final List<C32001Nk> LJLLILLLL;
    public final List<C32001Nk> LJLLJ;
    public InterfaceC30494Bxy LJLLL;
    public LiveEffect LJLLLL;
    public int LJLLLLLL;
    public long LJLZ;
    public int LJZ;
    public C30751Ip LJZI;
    public LiveEffect LJZL;

    @Override // X.InterfaceC08010Td
    public final void LIZ() {
        LiveEffect liveEffect;
        this.LJZ = this.LJLJJL.getSelectedTabPosition();
        C32041No.LJIILIIL(SystemClock.elapsedRealtime() - this.LJLZ, this.LJLIL, "close", false, false);
        C30751Ip c30751Ip = this.LJZI;
        if (c30751Ip != null) {
            C39591gx.LIZJ.remove(c30751Ip);
        }
        Iterator it = ((ArrayList) this.LJLJLLL.LJLLILLLL).iterator();
        while (it.hasNext()) {
            C0G1 c0g1 = (C0G1) it.next();
            c0g1.LJIIIIZZ.LJLLLLLL = false;
            c0g1.LIZIZ = false;
        }
        C30522ByQ c30522ByQ = LiveEffect.Companion;
        LiveEffect liveEffect2 = this.LJZL;
        C40641ie c40641ie = C40641ie.LJLIL;
        c40641ie.getClass();
        C0WZ c0wz = C40641ie.LJLJJLL;
        if (c0wz != null) {
            liveEffect = c0wz.LIZ;
        } else {
            liveEffect = null;
        }
        c30522ByQ.getClass();
        if (C30522ByQ.LIZ(liveEffect2, liveEffect)) {
            c40641ie.r40();
        }
        C0LU.LIZ = null;
        C1HD.LIZIZ = null;
        C1HC c1hc = C1HD.LIZJ;
        if (c1hc != null) {
            C12890ez.LIZ().LJIILJJIL(c1hc);
        }
        C1HD.LIZJ = null;
        InterfaceC30494Bxy interfaceC30494Bxy = this.LJLLL;
        if (interfaceC30494Bxy != null) {
            interfaceC30494Bxy.LIZ(C0TY.LIZIZ);
        }
        if (C29306Beo.LJJI()) {
            C0NA.LIZJ(C65352Pkq.LIZ(StickerHintShowChannel.class));
        } else {
            this.LJLIL.qv0(StickerPanelHideEvent.class, this.LJLLL);
        }
        C32041No.LIZIZ = "normal_icon";
        this.LJLLLLLL = 0;
        this.LJLILLLLZI.removeOnLayoutChangeListener(this);
        this.LJLIL.rv0(LiveDialogStatusChannel.class, new C29602Bja(false, 0, hashCode(), EnumC29596BjU.DIALOG_BIZ_SECONDARY_EFFECT_PANEL, EnumC29601BjZ.STICKER_EFFECT_PANEL));
    }

    @Override // X.InterfaceC08010Td
    public final View getView() {
        View rootView = this.LJLILLLLZI;
        o.LJIIIIZZ(rootView, "rootView");
        return rootView;
    }

    @Override // X.InterfaceC08010Td
    public final void onDialogBackground() {
        this.LJLJLLL.LJJIIJ();
    }

    @Override // X.InterfaceC08010Td
    public final void onDialogForeground() {
        this.LJLJLLL.LJJIIJZLJL();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, X.1Ip] */
    @Override // X.InterfaceC08010Td
    public final void LIZIZ(DialogFragment fragment) {
        LiveEffect liveEffect;
        String str;
        int i;
        String str2;
        o.LJIIIZ(fragment, "fragment");
        C42681lw LIZ = C12880ey.LIZ();
        String STICKER = C0TY.LIZIZ;
        o.LJIIIIZZ(STICKER, "STICKER");
        this.LJLLLL = (LiveEffect) ORZ.LJLLLL(LIZ.LIZ(STICKER));
        Iterator it = ((ArrayList) this.LJLLILLLL).iterator();
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (it.hasNext()) {
                String str3 = ((C32001Nk) it.next()).LJLILLLLZI;
                LiveEffect liveEffect2 = this.LJLLLL;
                if (liveEffect2 == null || (str2 = liveEffect2.effectPanelKey) == null) {
                    str2 = "";
                }
                if (o.LJ(str3, str2)) {
                    break;
                } else {
                    i2++;
                }
            } else {
                i2 = -1;
                break;
            }
        }
        this.LJZ = i2;
        if (!EffectMemoryPositionOptSetting.INSTANCE.inExperiment() && (i = this.LJZ) >= 0) {
            C15610jN.LIZJ(new IDRunnableS6S0101000(i, this, 21), 200L);
        }
        C40641ie.LJLIL.getClass();
        C0WZ c0wz = C40641ie.LJLJJLL;
        if (c0wz != null) {
            liveEffect = c0wz.LIZ;
        } else {
            liveEffect = null;
        }
        this.LJZL = liveEffect;
        if (liveEffect == null) {
            str = "normal_icon";
        } else {
            str = "special_icon";
        }
        C32041No.LIZIZ = str;
        if (liveEffect != null) {
            z = liveEffect.isFromOtherUser;
        }
        C32041No.LJIIJ = z;
        this.LJLZ = SystemClock.elapsedRealtime();
        this.LJLILLLLZI.addOnLayoutChangeListener(this);
        InterfaceC30494Bxy interfaceC30494Bxy = this.LJLLL;
        if (interfaceC30494Bxy != null) {
            interfaceC30494Bxy.LIZJ(C0TY.LIZIZ);
        }
        if (C29306Beo.LJJI()) {
            C0NA.LIZIZ(C65352Pkq.LIZ(StickerHintShowChannel.class));
        } else {
            this.LJLIL.pv0(StickerPanelShowEvent.class);
        }
        if (this.LJZL != null || C0LU.LIZ != null) {
            this.LJLJLLL.notifyDataSetChanged();
        }
        InterfaceC30494Bxy interfaceC30494Bxy2 = this.LJLLL;
        if (interfaceC30494Bxy2 != null) {
            interfaceC30494Bxy2.LJ(this.LJLL);
        }
        Iterator it2 = ((ArrayList) this.LJLJLLL.LJLLILLLL).iterator();
        while (it2.hasNext()) {
            C0G1 c0g1 = (C0G1) it2.next();
            c0g1.LIZ();
            c0g1.LIZIZ = true;
            C40771ir c40771ir = c0g1.LJIIIIZZ;
            c40771ir.LJLLLLLL = true;
            LiveEffect liveEffect3 = c40771ir.LJLJJLL;
            if (liveEffect3 != null) {
                c40771ir.LLIL(liveEffect3);
            }
            if (c40771ir.LJLJL) {
                c40771ir.LLFZ(c40771ir.LJLJJL);
                c40771ir.LJLJJL = null;
            }
        }
        XKX.LIZLLL(ViewModelKt.getViewModelScope(this.LJLJLJ), null, null, new C2BI(this, null), 3);
        C05960Lg c05960Lg = this.LJLJI;
        c05960Lg.getClass();
        C42681lw LIZ2 = C12880ey.LIZ();
        String STICKER2 = C0TY.LIZIZ;
        o.LJIIIIZZ(STICKER2, "STICKER");
        if (ORZ.LJLLLL(LIZ2.LJIIIIZZ(STICKER2)) == null) {
            c05960Lg.setVisibility(8);
        }
        if (LiveEffectHouseEffectSetting.INSTANCE.shouldShowInfo()) {
            this.LJLJJI = (C05900La) this.LJLILLLLZI.findViewById(R.id.crj);
            ?? r1 = new C17H() { // from class: X.1Ip
                @Override // X.C17H
                public final void LIZ(LiveEffect liveEffect4) {
                    ViewOnLayoutChangeListenerC30741Io.LJ(ViewOnLayoutChangeListenerC30741Io.this, null, liveEffect4, 1);
                }

                @Override // X.C17H
                public final void LIZIZ(LiveEffect liveEffect4) {
                    ViewOnLayoutChangeListenerC30741Io.LJ(ViewOnLayoutChangeListenerC30741Io.this, liveEffect4, null, 2);
                }
            };
            this.LJZI = r1;
            C39591gx.LIZJ.add(r1);
            C05900La c05900La = this.LJLJJI;
            if (c05900La != null) {
                c05900La.setClickListener(new IDqS420S0100000(this, 75));
            }
        }
        this.LJLJLLL.LJJIIZI();
        C05900La c05900La2 = this.LJLJJI;
        if (c05900La2 != null) {
            c05900La2.LIZJ(this.LJLLLL);
        }
    }

    public final void LIZJ(LiveEffect liveEffect) {
        List<Object> list = this.LJLJLJ.LJLJJI.LJLJLJ.LJLILLLLZI;
        if (ORZ.LJLJJI(liveEffect, list)) {
            this.LJLJI.LIZ(liveEffect, true);
            return;
        }
        Iterator<Object> it = list.iterator();
        while (it.hasNext()) {
            if (C78880UxY.LJJJJL((LiveEffect) it.next(), liveEffect)) {
                this.LJLJI.LIZ(liveEffect, true);
                return;
            }
        }
        this.LJLJI.LIZ(liveEffect, false);
    }

    public ViewOnLayoutChangeListenerC30741Io(Context context, DataChannel dataChannel) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(dataChannel, "dataChannel");
        this.LJLIL = dataChannel;
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.d2c, C16880lQ.LLZIL(context), null);
        this.LJLILLLLZI = LLLZIIL;
        View findViewById = LLLZIIL.findViewById(R.id.d5i);
        o.LJIIIIZZ(findViewById, "rootView.findViewById(R.id.favorite_view)");
        final C05960Lg c05960Lg = (C05960Lg) findViewById;
        this.LJLJI = c05960Lg;
        View findViewById2 = LLLZIIL.findViewById(R.id.kz9);
        o.LJIIIIZZ(findViewById2, "rootView.findViewById(R.id.tab_strip)");
        C80664VlE c80664VlE = (C80664VlE) findViewById2;
        this.LJLJJL = c80664VlE;
        View findViewById3 = LLLZIIL.findViewById(R.id.kin);
        o.LJIIIIZZ(findViewById3, "rootView.findViewById(R.id.sticker_pager)");
        ViewPager viewPager = (ViewPager) findViewById3;
        this.LJLJJLL = viewPager;
        String STICKER = C0TY.LIZIZ;
        o.LJIIIIZZ(STICKER, "STICKER");
        StickerEffectViewModel stickerEffectViewModel = (StickerEffectViewModel) new ViewModelProvider(C30686C2o.LJLIL, new C38991fz(new C39011g1(STICKER), new C44821pO())).get(StickerEffectViewModel.class);
        this.LJLJLJ = stickerEffectViewModel;
        C30801Iu c30801Iu = new C30801Iu(dataChannel, STICKER, C12890ez.LIZ(), context, stickerEffectViewModel);
        this.LJLJLLL = c30801Iu;
        this.LJLL = (ViewGroup) LLLZIIL.findViewById(R.id.nbw);
        C0PS c0ps = new C0PS(c80664VlE, viewPager);
        this.LJLLI = c0ps;
        this.LJLLILLLL = new ArrayList();
        this.LJLLJ = new ArrayList();
        this.LJZ = -1;
        C0PQ c0pq = new C0PQ() { // from class: X.1In
            @Override // X.C0PQ
            public final void LIZ(LiveEffect liveEffect, LiveEffect liveEffect2) {
                ViewOnLayoutChangeListenerC30741Io viewOnLayoutChangeListenerC30741Io = ViewOnLayoutChangeListenerC30741Io.this;
                viewOnLayoutChangeListenerC30741Io.LJLLLL = liveEffect2;
                viewOnLayoutChangeListenerC30741Io.LIZLLL(liveEffect, liveEffect2);
            }
        };
        c05960Lg.LJLL = dataChannel;
        LinearLayout.inflate(c05960Lg.getContext(), R.layout.d2_, c05960Lg);
        if (U4D.LIZ()) {
            c05960Lg.getMIconIV().setImageResource(R.drawable.crt);
        }
        IDCListenerS83S0200000 iDCListenerS83S0200000 = new IDCListenerS83S0200000(dataChannel, c05960Lg, 4);
        c05960Lg.setOnClickListener(new ViewOnClickListenerC13880ga(iDCListenerS83S0200000));
        c05960Lg.getMIconIV().setOnClickListener(new ViewOnClickListenerC13880ga(iDCListenerS83S0200000));
        c05960Lg.getMIconIV().setOnStateChangeListener(new InterfaceC05930Ld() { // from class: X.1Ii
            @Override // X.InterfaceC05930Ld
            public final void LIZ() {
                InterfaceC05950Lf favoriteStatusListener = C05960Lg.this.getFavoriteStatusListener();
                if (favoriteStatusListener != null) {
                    C05960Lg c05960Lg2 = C05960Lg.this;
                    favoriteStatusListener.LIZ(c05960Lg2.LJLJJL, c05960Lg2.LJLJJI);
                }
            }

            @Override // X.InterfaceC05930Ld
            public final void LIZIZ(int i) {
                if (i == 1) {
                    C05960Lg.this.getMIconIV().setSelected(C05960Lg.this.LJLJJI);
                }
            }
        });
        dataChannel.lv0(dataChannel.LJLJJI, StickerCancelChannel.class, new IDqS416S0100000(c05960Lg, 131));
        dataChannel.ov0(dataChannel.LJLJJI, GreenScreenCreatorBlockChannel.class, new IDqS416S0100000(c05960Lg, 132));
        c05960Lg.setShowEnable(true);
        C29306Beo.LJI(c05960Lg);
        c05960Lg.setFavoriteStatusListener(new InterfaceC05950Lf() { // from class: X.1Ir
            @Override // X.InterfaceC05950Lf
            public final void LIZ(LiveEffect liveEffect, boolean z) {
                String str;
                Long l;
                String str2;
                int i;
                Effect effect;
                ((C32537Cpp) ViewOnLayoutChangeListenerC30741Io.this.LJLIL.gv0(C54282Bc.class)).LIZ = "icon";
                String str3 = null;
                if (liveEffect != null) {
                    ViewOnLayoutChangeListenerC30741Io viewOnLayoutChangeListenerC30741Io = ViewOnLayoutChangeListenerC30741Io.this;
                    XKX.LIZLLL(ViewModelKt.getViewModelScope(viewOnLayoutChangeListenerC30741Io.LJLJLJ), null, null, new C2BK(viewOnLayoutChangeListenerC30741Io, liveEffect, z, null), 3);
                }
                BZI LIZ = C28787BRn.LIZ("livesdk_live_favorite_click");
                LIZ.LJIILLIIL(ViewOnLayoutChangeListenerC30741Io.this.LJLIL);
                DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
                LIZ.LJIJJ(dataChannelGlobal.mv0(C55012Dx.class), "enter_from");
                LIZ.LJIJJ(dataChannelGlobal.mv0(C2E4.class), "banner_id");
                LIZ.LJIJJ(dataChannelGlobal.mv0(C2E5.class), "banner_from");
                if (z) {
                    str = "favorite";
                } else {
                    str = "cancel_favorite";
                }
                LIZ.LJIJJ(str, "click_type");
                if (liveEffect != null) {
                    l = Long.valueOf(liveEffect.effectId);
                } else {
                    l = null;
                }
                LIZ.LJIJJ(l, "sticker_id");
                if (liveEffect != null) {
                    str2 = liveEffect.getResourceId();
                } else {
                    str2 = null;
                }
                LIZ.LJIJJ(str2, "resource_id");
                if (liveEffect != null) {
                    str3 = liveEffect.effectPanelKey;
                }
                LIZ.LJIJJ(str3, "tab");
                LIZ.LJIJJ(String.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(C78880UxY.LJJJZ(liveEffect))) ? 1 : 0), "is_avatar");
                LIZ.LJIJJ(String.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(C77412UZs.LJIL(liveEffect))) ? 1 : 0), "is_group_sticker");
                LIZ.LJIJJ(Integer.valueOf(C32041No.LJIILLIIL ? 1 : 0), "is_new_anchor_guide");
                if (liveEffect != null && (effect = liveEffect.getEffect()) != null) {
                    i = effect.getSource();
                } else {
                    i = 0;
                }
                LIZ.LJIJJ(Integer.valueOf(i), "source");
                LIZ.LJIJJ("icon", "method");
                LIZ.LJJIIJZLJL();
            }
        });
        XKX.LIZLLL(ViewModelKt.getViewModelScope(stickerEffectViewModel), null, null, new C2BL(this, null), 3);
        LLLZIIL.findViewById(R.id.kgv).getBackground().setAlpha(255);
        C16880lQ.LJIIJ(new IDCListenerS135S0100000(this, 59), LLLZIIL.findViewById(R.id.atf));
        c30801Iu.LJLJL = c0pq;
        C42691lx.LIZLLL = new WeakReference<>(c0pq);
        new WeakReference(c0pq);
        C11020by.LIZ = new WeakReference<>(c0pq);
        viewPager.setAdapter(c30801Iu);
        viewPager.setOffscreenPageLimit(1);
        c80664VlE.LJIILLIIL(viewPager, false, false);
        c80664VlE.LIZIZ(new InterfaceC77393UYz() { // from class: X.1Im
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
                int i;
                String str;
                ViewOnLayoutChangeListenerC30741Io viewOnLayoutChangeListenerC30741Io = ViewOnLayoutChangeListenerC30741Io.this;
                viewOnLayoutChangeListenerC30741Io.LJLJL = c76956UIe;
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
                InterfaceC30494Bxy interfaceC30494Bxy = viewOnLayoutChangeListenerC30741Io.LJLLL;
                if (interfaceC30494Bxy != null) {
                    if (c32001Nk != null) {
                        str = c32001Nk.LJLIL;
                        str2 = c32001Nk.LJLILLLLZI;
                    } else {
                        str = null;
                    }
                    interfaceC30494Bxy.LJII(str, str2);
                }
                ViewOnLayoutChangeListenerC30741Io.this.getClass();
                C30801Iu c30801Iu2 = ViewOnLayoutChangeListenerC30741Io.this.LJLJLLL;
                if (c76956UIe != null) {
                    i = c76956UIe.LIZLLL;
                } else {
                    i = 0;
                }
                c30801Iu2.LJJIIZ(i);
            }
        });
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(stickerEffectViewModel.sv0());
        String LJIILJJIL = C15380j0.LJIILJJIL(R.string.kzy);
        o.LJIIIIZZ(LJIILJJIL, "getString(R.string.pm_effecttab_trending)");
        arrayList.add(new C32001Nk(LJIILJJIL, "", true));
        c30801Iu.setData(arrayList);
        c0ps.LIZLLL = stickerEffectViewModel.sv0().size();
        c0ps.LIZ(arrayList);
        InterfaceC30442Bx8.s.LIZ(Boolean.TRUE);
        C29306Beo.LJJLIIIJJIZ(0, C15380j0.LIZ(262.0f), viewPager);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(com.bytedance.android.livesdkapi.depend.model.LiveEffect r7, com.bytedance.android.livesdkapi.depend.model.LiveEffect r8) {
        /*
            r6 = this;
            X.Bxy r0 = r6.LJLLL
            r4 = 0
            if (r0 == 0) goto L54
            if (r8 == 0) goto Lc0
            X.By0 r0 = r8.logParams
            r1 = 0
            if (r0 != 0) goto Lbc
        Lc:
            if (r8 == 0) goto Lc0
            X.J0d<java.lang.Integer> r0 = X.InterfaceC30442Bx8.i2
            java.lang.Object r0 = r0.LIZJ()
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto Lb4
        L18:
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r6.LJLIL
            X.C31701Mg.LIZJ(r0, r1)
            X.1Mf r0 = X.C31691Mf.LIZ
            r0.LJIIL()
        L22:
            X.J0d<java.lang.Integer> r0 = X.InterfaceC30442Bx8.i2
            java.lang.Object r0 = r0.LIZJ()
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto L9d
        L2c:
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r6.LJLIL
            X.C31701Mg.LIZJ(r0, r1)
            X.1Mf r0 = X.C31691Mf.LIZ
            r0.LJIIJJI()
        L36:
            X.Bxy r0 = r6.LJLLL
            if (r0 == 0) goto L3d
            r0.LIZLLL(r8)
        L3d:
            X.1lw r1 = X.C12890ez.LIZ()
            java.lang.String r0 = X.C0TY.LIZIZ
            r1.LJJIIJ(r0, r7, r8)
            X.Bxy r0 = r6.LJLLL
            if (r0 == 0) goto L4d
            r0.LIZIZ(r8)
        L4d:
            X.0La r0 = r6.LJLJJI
            if (r0 == 0) goto L54
            r0.LIZJ(r8)
        L54:
            X.1Iu r0 = r6.LJLJLLL
            r0.LJJIIZI()
            r6.LIZJ(r8)
            if (r8 == 0) goto L9c
            com.bytedance.android.livesdk.livesetting.broadcast.LiveStickerRecentTabSwitchSetting r0 = com.bytedance.android.livesdk.livesetting.broadcast.LiveStickerRecentTabSwitchSetting.INSTANCE
            boolean r0 = r0.canShowRecentTab()
            if (r0 == 0) goto L9c
            com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel r0 = r6.LJLJLJ
            X.2pa r2 = androidx.lifecycle.ViewModelKt.getViewModelScope(r0)
            X.2BJ r1 = new X.2BJ
            r1.<init>(r6, r8, r4)
            r0 = 3
            X.XKX.LIZLLL(r2, r4, r4, r1, r0)
            java.lang.String r1 = r8.effectPanelKey
            java.lang.String r0 = "Recents"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 != 0) goto L9c
            X.0PS r5 = r6.LJLLI
            r5.getClass()
            X.BxC r0 = X.C30446BxC.LIZ
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = X.C30446BxC.LIZJ(r0)
            if (r0 == 0) goto L9c
            androidx.lifecycle.LifecycleOwner r3 = r0.LJLJJI
            if (r3 == 0) goto L9c
            X.Bwc r2 = X.EnumC30410Bwc.LIVE_EFFECT_RECENT_TAB
            kotlin.jvm.internal.IDqS416S0100000 r1 = new kotlin.jvm.internal.IDqS416S0100000
            r0 = 130(0x82, float:1.82E-43)
            r1.<init>(r5, r0)
            X.C30444BxA.LIZIZ(r2, r3, r4, r1)
        L9c:
            return
        L9d:
            int r0 = r0.intValue()
            if (r0 == 0) goto La4
            goto L2c
        La4:
            boolean r0 = X.C77412UZs.LJIL(r7)
            if (r0 == 0) goto L36
            X.1lw r1 = X.C12890ez.LIZ()
            java.lang.String r0 = X.C0TY.LIZIZ
            r1.LIZLLL(r0)
            goto L36
        Lb4:
            int r0 = r0.intValue()
            if (r0 == 0) goto L22
            goto L18
        Lbc:
            r0.LIZJ = r1
            goto Lc
        Lc0:
            if (r7 == 0) goto L4d
            X.1lw r1 = X.C12890ez.LIZ()
            java.lang.String r0 = X.C0TY.LIZIZ
            r1.LIZLLL(r0)
            X.Bxy r0 = r6.LJLLL
            if (r0 == 0) goto L4d
            r0.LJFF(r7)
            goto L4d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnLayoutChangeListenerC30741Io.LIZLLL(com.bytedance.android.livesdkapi.depend.model.LiveEffect, com.bytedance.android.livesdkapi.depend.model.LiveEffect):void");
    }

    public static void LJ(ViewOnLayoutChangeListenerC30741Io viewOnLayoutChangeListenerC30741Io, LiveEffect liveEffect, LiveEffect liveEffect2, int i) {
        int i2;
        if ((i & 1) != 0) {
            liveEffect = null;
        }
        if ((i & 2) != 0) {
            liveEffect2 = null;
        }
        viewOnLayoutChangeListenerC30741Io.LIZLLL(liveEffect, liveEffect2);
        List<C32001Nk> list = viewOnLayoutChangeListenerC30741Io.LJLLILLLL;
        C76956UIe c76956UIe = viewOnLayoutChangeListenerC30741Io.LJLJL;
        if (c76956UIe != null) {
            i2 = c76956UIe.LIZLLL;
        } else {
            i2 = 0;
        }
        XKX.LIZLLL(ViewModelKt.getViewModelScope(viewOnLayoutChangeListenerC30741Io.LJLJLJ), null, null, new C2BM(viewOnLayoutChangeListenerC30741Io, ((C32001Nk) ListProtector.get(list, i2)).LJLILLLLZI, null), 3);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int height = this.LJLILLLLZI.getHeight() - this.LJLILLLLZI.findViewById(R.id.cc0).getHeight();
        if (this.LJLLLLLL != height) {
            this.LJLLLLLL = height;
            this.LJLIL.rv0(LiveDialogStatusChannel.class, new C29602Bja(true, height, hashCode(), EnumC29596BjU.DIALOG_BIZ_SECONDARY_EFFECT_PANEL, EnumC29601BjZ.STICKER_EFFECT_PANEL));
        }
    }
}
