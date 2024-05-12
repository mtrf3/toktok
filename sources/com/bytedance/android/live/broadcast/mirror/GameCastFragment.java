package com.bytedance.android.live.broadcast.mirror;

import X.ActivityC45651qj;
import X.AnonymousClass078;
import X.BZI;
import X.C05400Jc;
import X.C0JQ;
import X.C0JV;
import X.C0NB;
import X.C10A;
import X.C141335gf;
import X.C15490jB;
import X.C16880lQ;
import X.C1GF;
import X.C28787BRn;
import X.C29306Beo;
import X.C29S;
import X.C30868C9o;
import X.C3C5;
import X.C47061t0;
import X.C47121t6;
import X.C48189Ivh;
import X.C51029K0z;
import X.C5H3;
import X.C61099NyR;
import X.C76800UCe;
import X.C78996UzQ;
import X.C79045V0n;
import X.C90903hW;
import X.CN1;
import X.EnumC135205Si;
import X.InterfaceC32901Qw;
import X.InterfaceC61107NyZ;
import X.InterfaceC86149XrV;
import X.V10;
import X.X1D;
import Y.IDCListenerS135S0100000;
import Y.IDRunnableS85S0100000;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.byted.cast.common.source.ServiceInfo;
import com.bytedance.android.live.broadcast.mirror.GameCastFragment;
import com.bytedance.android.livesdk.comp.api.game.service.IGameService;
import com.bytedance.android.livesdk.dataChannel.LiveCastChannel;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes.dex */
public final class GameCastFragment extends BaseFragment implements View.OnClickListener, InterfaceC86149XrV, InterfaceC32901Qw {
    public static final /* synthetic */ int LJLLJ = 0;
    public boolean LJLIL;
    public EnumC135205Si LJLILLLLZI;
    public long LJLJI;
    public C47061t0 LJLJJI;
    public C47121t6 LJLJJL;
    public C47121t6 LJLJJLL;
    public C47061t0 LJLJL;
    public View LJLJLJ;
    public C47121t6 LJLJLLL;
    public C47121t6 LJLL;
    public final C5H3 LJLLI;
    public boolean LJLLILLLL;

    @Override // X.InterfaceC86149XrV
    public final void finish() {
    }

    @Override // X.InterfaceC86149XrV
    public final Fragment getFragment() {
        return this;
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, X.InterfaceC12810er
    public final /* synthetic */ int getThemeOverlay(Context context) {
        return V10.LIZ();
    }

    @Override // X.InterfaceC86149XrV
    public final boolean onBackPressed() {
        return false;
    }

    public GameCastFragment() {
        new LinkedHashMap();
        this.LJLIL = true;
        this.LJLILLLLZI = EnumC135205Si.STOPPED;
        this.LJLLI = C78996UzQ.LJJIJIIJI(new IDqS420S0100000(this, 38));
    }

    public final boolean vl() {
        List<ServiceInfo> list;
        ServiceInfo serviceInfo;
        C0NB.LIZIZ("GameLive_ByteCast", "connectAndCast");
        C1GF c1gf = (C1GF) DataChannelGlobal.LJLJJI.mv0(MirrorCastDevicesChannel.class);
        if (c1gf != null && (list = c1gf.LJLIL) != null) {
            Iterator<ServiceInfo> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    serviceInfo = it.next();
                    String str = serviceInfo.name;
                    o.LJIIIIZZ(str, "it.name");
                    if (s.LJJJLZIJ(str, "TTLiveStudioAndroid", false)) {
                        break;
                    }
                } else {
                    serviceInfo = null;
                    break;
                }
            }
            final ServiceInfo serviceInfo2 = serviceInfo;
            if (serviceInfo2 != null) {
                if (Build.VERSION.SDK_INT >= 33 && !new AnonymousClass078(requireContext()).LIZIZ()) {
                    this.LJLLILLLL = false;
                    ActivityC45651qj mo49getActivity = mo49getActivity();
                    if (mo49getActivity != null) {
                        C61099NyR.LIZIZ.LIZIZ(mo49getActivity, TokenCert.Companion.with("bpea-live_cast_service_notification")).LIZ("android.permission.POST_NOTIFICATIONS").LIZJ(new InterfaceC61107NyZ() { // from class: X.1GL
                            @Override // X.InterfaceC61107NyZ
                            public final void LIZ() {
                                C0NB.LIZIZ("GameCastFragment", "notification permissions onCanceled");
                                DataChannelGlobal.LJLJJI.tv0(LiveCastChannel.class, EnumC135205Si.NOTIFICATION_PERMISSIONS_ERROR);
                            }

                            @Override // X.InterfaceC61107NyZ
                            public final void LIZIZ(C164906da... results) {
                                o.LJIIIZ(results, "results");
                                DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
                                Object mv0 = dataChannelGlobal.mv0(LiveCastChannel.class);
                                EnumC61598OFm enumC61598OFm = ((C164906da) ORY.LJJIL(results)).LIZIZ;
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append("notification permissions resultType");
                                LIZ.append(enumC61598OFm);
                                C0NB.LIZIZ("GameCastFragment", X1D.LIZIZ(LIZ));
                                if (enumC61598OFm == EnumC61598OFm.GRANTED) {
                                    C0NB.LIZIZ("GameCastFragment", "notification permissions is granted");
                                    C05400Jc.LJIIJ(ServiceInfo.this, this);
                                    return;
                                }
                                EnumC135205Si enumC135205Si = EnumC135205Si.NOTIFICATION_PERMISSIONS_ERROR;
                                if (mv0 == enumC135205Si) {
                                    GameCastFragment gameCastFragment = this;
                                    gameCastFragment.LJLLILLLL = true;
                                    C40210FqI.LJI(gameCastFragment.mo49getActivity());
                                    return;
                                }
                                dataChannelGlobal.tv0(LiveCastChannel.class, enumC135205Si);
                            }
                        });
                    }
                    return false;
                }
                C05400Jc.LJIIJ(serviceInfo2, this);
                DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
                BZI LIZ = C28787BRn.LIZ("livesdk_screencasting_livestudio_btn_click");
                LIZ.LJIILLIIL(LJIILIIL);
                LIZ.LJIJJ(Long.valueOf(C0JV.LIZ()), "anchor_id");
                LIZ.LJIJJ(LiveMode.LIVE_STUDIO.logStreamingType, "live_type");
                LIZ.LJJIIJZLJL();
                return true;
            }
        }
        return false;
    }

    public final void xl() {
        View view;
        if (this.LJLIL && (view = (View) this.LJLLI.getValue()) != null) {
            view.setRotation(view.getRotation() + 3.0f);
            view.postOnAnimation(new IDRunnableS85S0100000(this, 55));
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        dataChannelGlobal.getClass();
        dataChannelGlobal.jv0(this);
        if (!C05400Jc.LJII) {
            C05400Jc.LJII();
            C05400Jc.LJIIJJI();
            dataChannelGlobal.tv0(LiveCastChannel.class, EnumC135205Si.INIT);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.LJLIL = false;
        C05400Jc.LJIIJJI();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Object mv0 = DataChannelGlobal.LJLJJI.mv0(LiveCastChannel.class);
        if (mv0 == null || EnumC135205Si.INIT == mv0 || EnumC135205Si.BROWSING == mv0) {
            EnumC135205Si enumC135205Si = EnumC135205Si.BROWSING;
            C05400Jc.LIZ.LIZ();
            Al(enumC135205Si);
        }
        if (this.LJLLILLLL && Build.VERSION.SDK_INT >= 33 && new AnonymousClass078(requireContext()).LIZIZ()) {
            EnumC135205Si enumC135205Si2 = EnumC135205Si.BROWSING;
            C05400Jc.LIZ.LIZ();
            Al(enumC135205Si2);
            this.LJLLILLLL = false;
        }
    }

    public final void Al(EnumC135205Si enumC135205Si) {
        int i;
        Integer LJI;
        String LIZIZ;
        String string;
        int i2;
        Integer LJI2;
        int i3;
        Integer LJI3;
        this.LJLILLLLZI = enumC135205Si;
        int[] iArr = C0JQ.LIZ;
        int i4 = iArr[enumC135205Si.ordinal()];
        if (i4 != 1) {
            if (i4 != 2 && i4 != 3) {
                if (i4 != 4) {
                    C47121t6 c47121t6 = this.LJLJJL;
                    if (c47121t6 != null) {
                        c47121t6.setText(getString(R.string.led));
                    }
                    C47121t6 c47121t62 = this.LJLJJLL;
                    if (c47121t62 != null) {
                        c47121t62.setSelected(false);
                        c47121t62.setText("");
                    }
                    this.LJLIL = true;
                    C29306Beo.LJJLJLI((View) this.LJLLI.getValue());
                    xl();
                    C05400Jc.LIZ.LIZ();
                    wl(0);
                    C47061t0 c47061t0 = this.LJLJL;
                    if (c47061t0 != null) {
                        C29306Beo.LJI(c47061t0);
                    }
                    View view = this.LJLJLJ;
                    if (view != null) {
                        C29306Beo.LJIIIZ(view);
                    }
                    C47121t6 c47121t63 = this.LJLJLLL;
                    if (c47121t63 != null) {
                        C29306Beo.LJIIIZ(c47121t63);
                    }
                    C47121t6 c47121t64 = this.LJLL;
                    if (c47121t64 != null) {
                        C29306Beo.LJIIIZ(c47121t64);
                        return;
                    }
                    return;
                }
                C47121t6 c47121t65 = this.LJLJJL;
                if (c47121t65 != null) {
                    c47121t65.setText(getString(R.string.le3));
                }
                C47121t6 c47121t66 = this.LJLJJLL;
                if (c47121t66 != null) {
                    c47121t66.setSelected(false);
                    c47121t66.setText(getString(R.string.k4k));
                    Context context = c47121t66.getContext();
                    if (context != null && (LJI3 = C79045V0n.LJI(R.attr.bnt, context)) != null) {
                        i3 = LJI3.intValue();
                    } else {
                        i3 = 0;
                    }
                    c47121t66.setTextColor(i3);
                }
                C47061t0 c47061t02 = this.LJLJL;
                if (c47061t02 != null) {
                    C29306Beo.LJJLJLI(c47061t02);
                }
                View view2 = this.LJLJLJ;
                if (view2 != null) {
                    C29306Beo.LJJLJLI(view2);
                }
                C47121t6 c47121t67 = this.LJLJLLL;
                if (c47121t67 != null) {
                    C29306Beo.LJJLJLI(c47121t67);
                }
                C47121t6 c47121t68 = this.LJLL;
                if (c47121t68 != null) {
                    C29306Beo.LJJLJLI(c47121t68);
                }
                this.LJLIL = false;
                C29306Beo.LJI((View) this.LJLLI.getValue());
                wl(1);
                return;
            }
            C47121t6 c47121t69 = this.LJLJJL;
            if (c47121t69 != null) {
                if (iArr[enumC135205Si.ordinal()] == 2) {
                    LIZIZ = getString(R.string.nzu);
                } else {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(getString(R.string.mkn));
                    LIZ.append(", ");
                    LIZ.append(getString(R.string.mko));
                    LIZIZ = X1D.LIZIZ(LIZ);
                }
                c47121t69.setText(LIZIZ);
            }
            C47121t6 c47121t610 = this.LJLJJLL;
            if (c47121t610 != null) {
                c47121t610.setSelected(true);
                C47121t6 c47121t611 = this.LJLJJLL;
                if (c47121t611 != null) {
                    if (iArr[enumC135205Si.ordinal()] == 2) {
                        string = getString(R.string.nzt);
                    } else {
                        string = getString(R.string.ng8);
                    }
                    c47121t611.setText(string);
                }
                Context context2 = c47121t610.getContext();
                if (context2 != null && (LJI2 = C79045V0n.LJI(R.attr.bmu, context2)) != null) {
                    i2 = LJI2.intValue();
                } else {
                    i2 = 0;
                }
                c47121t610.setTextColor(i2);
            }
            this.LJLIL = false;
            C29306Beo.LJI((View) this.LJLLI.getValue());
            wl(2);
            C47061t0 c47061t03 = this.LJLJL;
            if (c47061t03 != null) {
                C29306Beo.LJI(c47061t03);
            }
            View view3 = this.LJLJLJ;
            if (view3 != null) {
                C29306Beo.LJIIIZ(view3);
            }
            C47121t6 c47121t612 = this.LJLJLLL;
            if (c47121t612 != null) {
                C29306Beo.LJIIIZ(c47121t612);
            }
            C47121t6 c47121t613 = this.LJLL;
            if (c47121t613 == null) {
                return;
            }
            C29306Beo.LJIIIZ(c47121t613);
            return;
        }
        C47121t6 c47121t614 = this.LJLJJL;
        if (c47121t614 != null) {
            c47121t614.setText(getString(R.string.le2));
        }
        C47121t6 c47121t615 = this.LJLJJLL;
        if (c47121t615 != null) {
            c47121t615.setSelected(true);
            c47121t615.setText(getString(R.string.k4k));
            Context context3 = c47121t615.getContext();
            if (context3 != null && (LJI = C79045V0n.LJI(R.attr.bmu, context3)) != null) {
                i = LJI.intValue();
            } else {
                i = 0;
            }
            c47121t615.setTextColor(i);
        }
        this.LJLIL = false;
        C29306Beo.LJI((View) this.LJLLI.getValue());
        wl(0);
        C47061t0 c47061t04 = this.LJLJL;
        if (c47061t04 != null) {
            C29306Beo.LJI(c47061t04);
        }
        View view4 = this.LJLJLJ;
        if (view4 != null) {
            C29306Beo.LJIIIZ(view4);
        }
        C47121t6 c47121t616 = this.LJLJLLL;
        if (c47121t616 != null) {
            C29306Beo.LJIIIZ(c47121t616);
        }
        C47121t6 c47121t617 = this.LJLL;
        if (c47121t617 == null) {
            return;
        }
        C29306Beo.LJIIIZ(c47121t617);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.LJLJI < 1000) {
            return;
        }
        this.LJLJI = currentTimeMillis;
        if (!C48189Ivh.LJI(getContext())) {
            C30868C9o.LIZJ(R.string.liz);
            return;
        }
        int i = C0JQ.LIZ[this.LJLILLLLZI.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i == 5) {
                        C05400Jc.LIZ.LIZ();
                    }
                } else {
                    return;
                }
            } else {
                C05400Jc.LJ();
                Al(EnumC135205Si.BROWSING);
            }
        } else if (view != null && view.isSelected() && vl()) {
            return;
        }
        C0NB.LIZIZ("GameLive_ByteCast", "there is no available devices or it is already casting...");
    }

    public final void wl(int i) {
        String str;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    str = "";
                } else {
                    str = "ttlive_game_cast_wireless_failed.png";
                }
            } else {
                str = "ttlive_game_cast_wireless_succeed.png";
            }
        } else {
            str = "ttlive_game_cast_wireless_loading.png";
        }
        if (str.length() == 0) {
            return;
        }
        C15490jB.LJ(this.LJLJJI, "tiktok_live_game_demand_1", str);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Object LIZ;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.b6m);
        if (findViewById != null) {
            C16880lQ.LJIIJ(new IDCListenerS135S0100000(this, 28), findViewById);
        }
        C05400Jc.LJ();
        this.LJLJJI = (C47061t0) view.findViewById(R.id.b6j);
        this.LJLJJL = (C47121t6) view.findViewById(R.id.l5_);
        C47121t6 c47121t6 = (C47121t6) view.findViewById(R.id.avo);
        this.LJLJJLL = c47121t6;
        if (c47121t6 != null) {
            C16880lQ.LJJIIZ(c47121t6, this);
        }
        this.LJLJL = (C47061t0) view.findViewById(R.id.b6n);
        this.LJLJLJ = view.findViewById(R.id.cdn);
        this.LJLJLLL = (C47121t6) view.findViewById(R.id.l8m);
        C47121t6 c47121t62 = (C47121t6) view.findViewById(R.id.l8n);
        this.LJLL = c47121t62;
        if (c47121t62 != null) {
            c47121t62.setText(getString(R.string.oxe));
        }
        C47061t0 c47061t0 = this.LJLJL;
        if (c47061t0 != null) {
            C16880lQ.LJJI(c47061t0, new IDCListenerS135S0100000(this, 31));
        }
        C15490jB.LJ(this.LJLJL, "tiktok_live_game_demand_1", "ttlive_game_cast_wired_end.png");
        C16880lQ.LJIIJ(new View.OnClickListener() { // from class: X.0JR
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
            }
        }, view);
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        dataChannelGlobal.ov0(MirrorCastDevicesChannel.class, this, new IDqS416S0100000(this, 47));
        dataChannelGlobal.ov0(LiveCastChannel.class, this, new IDqS416S0100000(this, 48));
        try {
            LIZ = Boolean.valueOf(C05400Jc.LJII);
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            C0NB.LJI("GameLive_ByteCast", m10exceptionOrNullimpl);
            C30868C9o.LIZJ(R.string.nnu);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity != null) {
                mo49getActivity.finish();
            }
        }
        if (C3C5.m13isSuccessimpl(LIZ)) {
            if (((Boolean) LIZ).booleanValue()) {
                Al(EnumC135205Si.CASTING);
            } else {
                C05400Jc.LIZ.LIZ();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        ((IGameService) CN1.LIZ(IGameService.class)).Tm();
        C05400Jc.LJI(i, i2, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.d3k, viewGroup, false);
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
