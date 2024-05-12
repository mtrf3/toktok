package com.bytedance.android.live.liveinteract.multimatch.business.dialog;

import X.AbstractC030109x;
import X.AbstractC030309z;
import X.AbstractC28931Bp;
import X.AbstractC76233Tvx;
import X.ActivityC45651qj;
import X.B5G;
import X.C05630Jz;
import X.C10A;
import X.C141335gf;
import X.C15380j0;
import X.C15490jB;
import X.C15640jQ;
import X.C16880lQ;
import X.C221108m2;
import X.C29306Beo;
import X.C29701Eo;
import X.C29S;
import X.C2A7;
import X.C30725C4b;
import X.C30868C9o;
import X.C3C5;
import X.C47061t0;
import X.C47121t6;
import X.C51029K0z;
import X.C62822Ol8;
import X.C75768ToS;
import X.C75832TpU;
import X.C75883TqJ;
import X.C76029Tsf;
import X.C76236Tw0;
import X.C76237Tw1;
import X.C76238Tw2;
import X.C76239Tw3;
import X.C76242Tw6;
import X.C76244Tw8;
import X.C76260TwO;
import X.C76261TwP;
import X.C76265TwT;
import X.C76271TwZ;
import X.C76534U1y;
import X.C76800UCe;
import X.C8E;
import X.C90903hW;
import X.CFX;
import X.EnumC75644TmS;
import X.EnumC76178Tv4;
import X.EnumC76248TwC;
import X.EnumC76319TxL;
import X.FT5;
import X.InterfaceC65784Pro;
import X.InterfaceC75477Tjl;
import X.U24;
import X.ViewOnClickListenerC76241Tw5;
import Y.ACListenerS33S0100000_13;
import Y.AObserverS76S0200000_13;
import Y.ARunnableS49S0100000_13;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.match.business.event.BattleInvitingTimeLeftChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleReMatchStateChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleStateChannel;
import com.bytedance.android.live.liveinteract.multimatch.business.dialog.contract.MultiMatchInviteContract$AbsView;
import com.bytedance.android.live.liveinteract.multimatch.event.LinkedUserLeftEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchTrackRepeatReportAvoidSetting;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.MultiMatchPrepareResponse;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class MultiMatchInviteFragmentV2 extends MultiMatchInviteContract$AbsView implements U24 {
    public static final /* synthetic */ int LLIIII = 0;
    public LiveIconView LJLJL;
    public C47061t0 LJLJLJ;
    public LiveIconView LJLJLLL;
    public C47061t0 LJLL;
    public C47061t0 LJLLI;
    public LiveIconView LJLLILLLL;
    public C47061t0 LJLLJ;
    public LiveIconView LJLLL;
    public C47061t0 LJLLLL;
    public C47061t0 LJLLLLLL;
    public C47121t6 LJLZ;
    public C47121t6 LJZ;
    public C47121t6 LJZI;
    public C29701Eo LJZL;
    public C29701Eo LL;
    public C29701Eo LLD;
    public RecyclerView LLF;
    public C76534U1y LLFF;
    public boolean LLFFF;
    public C2A7 LLFII;
    public final C62822Ol8 LLFZ;
    public InterfaceC65784Pro<C76800UCe> LLI;
    public final C76260TwO LLIFFJFJJ;
    public final Map<Integer, View> LLII = new LinkedHashMap();
    public boolean LJLJJLL = true;

    @Override // com.bytedance.android.live.liveinteract.multimatch.business.dialog.contract.MultiMatchInviteContract$AbsView
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLII).clear();
    }

    @Override // com.bytedance.android.live.liveinteract.multimatch.business.dialog.contract.MultiMatchInviteContract$AbsView, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public MultiMatchInviteFragmentV2() {
        B5G.LIZIZ();
        this.LLFZ = C221108m2.LIZIZ(new AqS163S0100000_13(this, 152));
        this.LLI = C76242Tw6.LJLIL;
        this.LLIFFJFJJ = new C76260TwO(this);
    }

    public final void Dl() {
        long j;
        boolean z;
        C76271TwZ c76271TwZ = C76271TwZ.LIZ;
        C75883TqJ Y3 = Y3();
        if (Y3 != null) {
            j = Y3.LIZ;
        } else {
            j = 0;
        }
        AbstractC76233Tvx abstractC76233Tvx = (AbstractC76233Tvx) this.LJLILLLLZI;
        if (abstractC76233Tvx != null && abstractC76233Tvx.LJII()) {
            z = true;
        } else {
            z = false;
        }
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LJFF(jSONObject, "teammate_id", j);
        C76271TwZ.LJJ(jSONObject, z);
        C76271TwZ.LJJZZIII(c76271TwZ, "invite_panel_click", jSONObject, FT5.LIZLLL("role_type", "inviter"), null, false, 8);
        if (!this.LJLJJLL && LiveMatchTrackRepeatReportAvoidSetting.INSTANCE.getValue()) {
            return;
        }
        this.LJLJJLL = false;
        AbstractC76233Tvx abstractC76233Tvx2 = (AbstractC76233Tvx) this.LJLILLLLZI;
        if (abstractC76233Tvx2 != null) {
            abstractC76233Tvx2.LJIIIZ(new AqS163S0100000_13(this, 153));
        }
        C76029Tsf c76029Tsf = new C76029Tsf();
        String LJIILJJIL = C15380j0.LJIILJJIL(R.string.owp);
        o.LJIIIIZZ(LJIILJJIL, "getString(R.string.pm_wa…her_hosts_to_start_match)");
        c76029Tsf.LIZ = LJIILJJIL;
        this.LLIFFJFJJ.getClass();
        c76029Tsf.LIZIZ = C76260TwO.LIZIZ() + 334;
        c76029Tsf.LJFF = true;
        MultiMatchPrepareResponse multiMatchPrepareResponse = C76265TwT.LJIILLIIL;
        if (multiMatchPrepareResponse != null && multiMatchPrepareResponse.ruleGuideUrl != null) {
            c76029Tsf.LJ = xl();
        }
        this.LJLIL.f9(c76029Tsf);
        C47121t6 c47121t6 = this.LJLZ;
        if (c47121t6 != null) {
            C29306Beo.LJJLJLI(c47121t6);
        }
        C47121t6 c47121t62 = this.LJZ;
        if (c47121t62 != null) {
            C29306Beo.LJJLJLI(c47121t62);
        }
        C47121t6 c47121t63 = this.LJZI;
        if (c47121t63 != null) {
            C29306Beo.LJJLJLI(c47121t63);
        }
        C29701Eo c29701Eo = this.LJZL;
        if (c29701Eo != null) {
            C29306Beo.LJJLJLI(c29701Eo);
        }
        C29701Eo c29701Eo2 = this.LL;
        if (c29701Eo2 != null) {
            C29306Beo.LJJLJLI(c29701Eo2);
        }
        C29701Eo c29701Eo3 = this.LLD;
        if (c29701Eo3 != null) {
            C29306Beo.LJJLJLI(c29701Eo3);
        }
        this.LLFFF = true;
        Hl("invite");
    }

    public final int Gl() {
        return ((Number) this.LLFZ.getValue()).intValue();
    }

    public final void Il() {
        EnumC76178Tv4 LJ;
        C76244Tw8 LJI;
        AbstractC76233Tvx abstractC76233Tvx = (AbstractC76233Tvx) this.LJLILLLLZI;
        boolean z = false;
        if (abstractC76233Tvx != null && abstractC76233Tvx.LJII()) {
            LJ = C76265TwT.LIZIZ.LJ();
        } else {
            LJ = C76265TwT.LIZ.LJ();
        }
        Text text = null;
        if (LJ.compareTo(EnumC76178Tv4.INVITED) >= 0 && LJ.compareTo(EnumC76178Tv4.START) < 0) {
            C2A7 c2a7 = this.LLFII;
            if (c2a7 != null) {
                c2a7.LJJLL(R.style.a3a);
            }
            C2A7 c2a72 = this.LLFII;
            if (c2a72 != null) {
                c2a72.setText(C15380j0.LJIILJJIL(R.string.kmu));
            }
            C2A7 c2a73 = this.LLFII;
            if (c2a73 != null) {
                c2a73.setEnabled(true);
            }
            C2A7 c2a74 = this.LLFII;
            if (c2a74 != null) {
                C16880lQ.LJJIII(c2a74, new ACListenerS33S0100000_13(this, 50));
            }
            RecyclerView recyclerView = this.LLF;
            if (recyclerView != null) {
                recyclerView.setAlpha(0.5f);
            }
        } else {
            RecyclerView recyclerView2 = this.LLF;
            if (recyclerView2 != null) {
                recyclerView2.setAlpha(1.0f);
            }
            this.LJLIL.f9(vl());
            C2A7 c2a75 = this.LLFII;
            if (c2a75 != null) {
                c2a75.setText(C15380j0.LJIILJJIL(R.string.mxg));
            }
            C2A7 c2a76 = this.LLFII;
            if (c2a76 != null) {
                c2a76.LJJLL(R.style.a2z);
            }
            AbstractC76233Tvx abstractC76233Tvx2 = (AbstractC76233Tvx) this.LJLILLLLZI;
            if (abstractC76233Tvx2 != null && (LJI = abstractC76233Tvx2.LJI()) != null && LJI.LJII != null) {
                C2A7 c2a77 = this.LLFII;
                if (c2a77 != null) {
                    c2a77.setEnabled(true);
                }
                C2A7 c2a78 = this.LLFII;
                if (c2a78 != null) {
                    C16880lQ.LJJIII(c2a78, new ACListenerS33S0100000_13(this, 51));
                }
                AbstractC76233Tvx abstractC76233Tvx3 = (AbstractC76233Tvx) this.LJLILLLLZI;
                if (abstractC76233Tvx3 != null && abstractC76233Tvx3.LJII() && C76261TwP.LIZ()) {
                    C76261TwP.LIZ = true;
                    C2A7 c2a79 = this.LLFII;
                    if (c2a79 != null) {
                        c2a79.postDelayed(new ARunnableS49S0100000_13(this, 48), 100L);
                    }
                }
            } else {
                C2A7 c2a710 = this.LLFII;
                if (c2a710 != null) {
                    c2a710.setEnabled(false);
                }
                C2A7 c2a711 = this.LLFII;
                if (c2a711 != null) {
                    C16880lQ.LJJIII(c2a711, ViewOnClickListenerC76241Tw5.LJLIL);
                }
            }
            C47121t6 c47121t6 = this.LJLZ;
            if (c47121t6 != null) {
                C29306Beo.LJI(c47121t6);
            }
            C47121t6 c47121t62 = this.LJZ;
            if (c47121t62 != null) {
                C29306Beo.LJI(c47121t62);
            }
            C47121t6 c47121t63 = this.LJZI;
            if (c47121t63 != null) {
                C29306Beo.LJI(c47121t63);
            }
            C29701Eo c29701Eo = this.LJZL;
            if (c29701Eo != null) {
                C29306Beo.LJIIIZ(c29701Eo);
            }
            C29701Eo c29701Eo2 = this.LL;
            if (c29701Eo2 != null) {
                C29306Beo.LJIIIZ(c29701Eo2);
            }
            C29701Eo c29701Eo3 = this.LLD;
            if (c29701Eo3 != null) {
                C29306Beo.LJIIIZ(c29701Eo3);
            }
        }
        C76260TwO c76260TwO = this.LLIFFJFJJ;
        AbstractC76233Tvx abstractC76233Tvx4 = (AbstractC76233Tvx) this.LJLILLLLZI;
        if (abstractC76233Tvx4 != null && abstractC76233Tvx4.LJII()) {
            z = true;
        }
        MultiMatchPrepareResponse multiMatchPrepareResponse = C76265TwT.LJIILLIIL;
        if (multiMatchPrepareResponse != null) {
            text = multiMatchPrepareResponse.giftEventDesc;
        }
        c76260TwO.LJ(z, text, true);
    }

    @Override // X.U24
    public final C75883TqJ Y3() {
        C76244Tw8 LJI;
        AbstractC76233Tvx abstractC76233Tvx = (AbstractC76233Tvx) this.LJLILLLLZI;
        if (abstractC76233Tvx != null && (LJI = abstractC76233Tvx.LJI()) != null) {
            return LJI.LJII;
        }
        return null;
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsView
    public final C76029Tsf vl() {
        C76029Tsf c76029Tsf = new C76029Tsf();
        String LJIILJJIL = C15380j0.LJIILJJIL(R.string.mxi);
        o.LJIIIIZZ(LJIILJJIL, "getString(R.string.pm_ma…h_chooseteam_panel_title)");
        c76029Tsf.LIZ = LJIILJJIL;
        this.LLIFFJFJJ.getClass();
        c76029Tsf.LIZIZ = C76260TwO.LIZIZ() + 334;
        c76029Tsf.LJFF = true;
        MultiMatchPrepareResponse multiMatchPrepareResponse = C76265TwT.LJIILLIIL;
        if (multiMatchPrepareResponse != null && multiMatchPrepareResponse.ruleGuideUrl != null) {
            c76029Tsf.LJ = xl();
        }
        return c76029Tsf;
    }

    @Override // com.bytedance.android.live.liveinteract.multimatch.business.dialog.contract.MultiMatchInviteContract$AbsView
    public final int wl() {
        this.LLIFFJFJJ.getClass();
        return C76260TwO.LIZIZ() + 386;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        AbstractC76233Tvx abstractC76233Tvx = (AbstractC76233Tvx) this.LJLILLLLZI;
        if (abstractC76233Tvx != null) {
            abstractC76233Tvx.LJ();
        }
        if (!this.LLFFF) {
            Hl("left");
        }
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
        if (LJIILIIL != null) {
            LJIILIIL.jv0(this);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multimatch.business.dialog.contract.MultiMatchInviteContract$AbsView
    public final void Al() {
        Il();
    }

    public final void Hl(String str) {
        List<C75883TqJ> list;
        List<C75883TqJ> list2;
        C76236Tw0 LJFF;
        C76244Tw8 LJI;
        MutableLiveData<List<C75883TqJ>> mutableLiveData;
        C76244Tw8 LJI2;
        MutableLiveData<List<C75883TqJ>> mutableLiveData2;
        C76534U1y c76534U1y = this.LLFF;
        if (c76534U1y != null && c76534U1y.LJLILLLLZI) {
            C75832TpU c75832TpU = C75832TpU.LIZ;
            AbstractC76233Tvx abstractC76233Tvx = (AbstractC76233Tvx) this.LJLILLLLZI;
            EnumC76319TxL enumC76319TxL = null;
            if (abstractC76233Tvx != null && (LJI2 = abstractC76233Tvx.LJI()) != null && (mutableLiveData2 = LJI2.LJ) != null) {
                list = mutableLiveData2.getValue();
            } else {
                list = null;
            }
            AbstractC76233Tvx abstractC76233Tvx2 = (AbstractC76233Tvx) this.LJLILLLLZI;
            if (abstractC76233Tvx2 != null && (LJI = abstractC76233Tvx2.LJI()) != null && (mutableLiveData = LJI.LJFF) != null) {
                list2 = mutableLiveData.getValue();
            } else {
                list2 = null;
            }
            AbstractC76233Tvx abstractC76233Tvx3 = (AbstractC76233Tvx) this.LJLILLLLZI;
            if (abstractC76233Tvx3 != null && (LJFF = abstractC76233Tvx3.LJFF()) != null) {
                enumC76319TxL = LJFF.LIZJ;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("report_time", str);
            C75832TpU.LJIIJJI(linkedHashMap, enumC76319TxL);
            linkedHashMap.put("channel_id", String.valueOf(B5G.LIZIZ().LJFF));
            C75832TpU.LJFF(c75832TpU, linkedHashMap, false, false, 6);
            C75832TpU.LJIILIIL(linkedHashMap);
            C75832TpU.LJIILJJIL(list, list2, linkedHashMap);
            C75832TpU.LIZ(linkedHashMap);
            C75832TpU.LJJJIL(c75832TpU, "livesdk_group_pk_teammate_selection_click", linkedHashMap, "1");
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multimatch.business.dialog.contract.MultiMatchInviteContract$AbsView
    public final void LLJJIII(Throwable throwable) {
        o.LJIIIZ(throwable, "throwable");
        C30868C9o.LIZJ(R.string.sqr);
    }

    @Override // X.U24
    public final void h0(C75883TqJ coHostUser) {
        AbstractC76233Tvx abstractC76233Tvx;
        o.LJIIIZ(coHostUser, "coHostUser");
        if (!C76265TwT.LJFF() && (abstractC76233Tvx = (AbstractC76233Tvx) this.LJLILLLLZI) != null) {
            abstractC76233Tvx.LJIIIIZZ(coHostUser);
        }
    }

    public final void Jl(List<C75883TqJ> list, Map<Long, Boolean> map) {
        int i;
        int i2;
        ImageModel imageModel;
        int i3;
        int i4;
        if (list == null || list.size() != 2) {
            return;
        }
        C75883TqJ c75883TqJ = (C75883TqJ) ListProtector.get(list, 0);
        ImageModel imageModel2 = null;
        if (c75883TqJ != null) {
            LiveIconView liveIconView = this.LJLLILLLL;
            C75768ToS c75768ToS = c75883TqJ.LJIIZILJ;
            if (c75768ToS != null) {
                imageModel = c75768ToS.LIZJ;
            } else {
                imageModel = null;
            }
            if (liveIconView != null) {
                i3 = liveIconView.getWidth();
            } else {
                i3 = 0;
            }
            LiveIconView liveIconView2 = this.LJLLILLLL;
            if (liveIconView2 != null) {
                i4 = liveIconView2.getHeight();
            } else {
                i4 = 0;
            }
            C15640jQ.LJIIIZ(liveIconView, imageModel, i3, i4, Gl(), null);
            if (map != null && o.LJ(map.get(Long.valueOf(c75883TqJ.LIZ)), Boolean.TRUE)) {
                C47061t0 c47061t0 = this.LJLLJ;
                if (c47061t0 != null) {
                    c47061t0.setVisibility(0);
                }
                C47121t6 c47121t6 = this.LJZ;
                if (c47121t6 != null) {
                    C29306Beo.LJI(c47121t6);
                }
                C29701Eo c29701Eo = this.LL;
                if (c29701Eo != null) {
                    C29306Beo.LJIIIZ(c29701Eo);
                }
            } else {
                C47061t0 c47061t02 = this.LJLLJ;
                if (c47061t02 != null) {
                    c47061t02.setVisibility(8);
                }
            }
        }
        C75883TqJ c75883TqJ2 = (C75883TqJ) ListProtector.get(list, 1);
        if (c75883TqJ2 == null) {
            return;
        }
        LiveIconView liveIconView3 = this.LJLLL;
        C75768ToS c75768ToS2 = c75883TqJ2.LJIIZILJ;
        if (c75768ToS2 != null) {
            imageModel2 = c75768ToS2.LIZJ;
        }
        if (liveIconView3 != null) {
            i = liveIconView3.getWidth();
        } else {
            i = 0;
        }
        LiveIconView liveIconView4 = this.LJLLL;
        if (liveIconView4 != null) {
            i2 = liveIconView4.getHeight();
        } else {
            i2 = 0;
        }
        C15640jQ.LJIIIZ(liveIconView3, imageModel2, i, i2, Gl(), null);
        if (map != null && o.LJ(map.get(Long.valueOf(c75883TqJ2.LIZ)), Boolean.TRUE)) {
            C47061t0 c47061t03 = this.LJLLLL;
            if (c47061t03 != null) {
                c47061t03.setVisibility(0);
            }
            C47121t6 c47121t62 = this.LJZI;
            if (c47121t62 != null) {
                C29306Beo.LJI(c47121t62);
            }
            C29701Eo c29701Eo2 = this.LLD;
            if (c29701Eo2 == null) {
                return;
            }
            C29306Beo.LJIIIZ(c29701Eo2);
            return;
        }
        C47061t0 c47061t04 = this.LJLLLL;
        if (c47061t04 == null) {
            return;
        }
        c47061t04.setVisibility(8);
    }

    public final void Kl(List<C75883TqJ> list, Map<Long, Boolean> map) {
        int i;
        int i2;
        ImageModel imageModel;
        int i3;
        int i4;
        if (list == null || list.size() != 2) {
            return;
        }
        C75883TqJ c75883TqJ = (C75883TqJ) ListProtector.get(list, 0);
        ImageModel imageModel2 = null;
        if (c75883TqJ != null) {
            LiveIconView liveIconView = this.LJLJL;
            C75768ToS c75768ToS = c75883TqJ.LJIIZILJ;
            if (c75768ToS != null) {
                imageModel = c75768ToS.LIZJ;
            } else {
                imageModel = null;
            }
            if (liveIconView != null) {
                i3 = liveIconView.getWidth();
            } else {
                i3 = 0;
            }
            LiveIconView liveIconView2 = this.LJLJL;
            if (liveIconView2 != null) {
                i4 = liveIconView2.getHeight();
            } else {
                i4 = 0;
            }
            C15640jQ.LJIIIZ(liveIconView, imageModel, i3, i4, Gl(), null);
            if (map != null && o.LJ(map.get(Long.valueOf(c75883TqJ.LIZ)), Boolean.TRUE)) {
                C47061t0 c47061t0 = this.LJLJLJ;
                if (c47061t0 != null) {
                    c47061t0.setVisibility(0);
                }
            } else {
                C47061t0 c47061t02 = this.LJLJLJ;
                if (c47061t02 != null) {
                    c47061t02.setVisibility(8);
                }
            }
        }
        C75883TqJ c75883TqJ2 = (C75883TqJ) ListProtector.get(list, 1);
        if (c75883TqJ2 != null) {
            LiveIconView liveIconView3 = this.LJLJLLL;
            C75768ToS c75768ToS2 = c75883TqJ2.LJIIZILJ;
            if (c75768ToS2 != null) {
                imageModel2 = c75768ToS2.LIZJ;
            }
            if (liveIconView3 != null) {
                i = liveIconView3.getWidth();
            } else {
                i = 0;
            }
            LiveIconView liveIconView4 = this.LJLJLLL;
            if (liveIconView4 != null) {
                i2 = liveIconView4.getHeight();
            } else {
                i2 = 0;
            }
            C15640jQ.LJIIIZ(liveIconView3, imageModel2, i, i2, Gl(), null);
            if (map != null && o.LJ(map.get(Long.valueOf(c75883TqJ2.LIZ)), Boolean.TRUE)) {
                C47061t0 c47061t03 = this.LJLL;
                if (c47061t03 != null) {
                    c47061t03.setVisibility(0);
                }
                C47121t6 c47121t6 = this.LJLZ;
                if (c47121t6 != null) {
                    C29306Beo.LJI(c47121t6);
                }
                C29701Eo c29701Eo = this.LJZL;
                if (c29701Eo != null) {
                    C29306Beo.LJIIIZ(c29701Eo);
                }
            } else {
                C47061t0 c47061t04 = this.LJLL;
                if (c47061t04 != null) {
                    c47061t04.setVisibility(8);
                }
            }
        }
        Il();
        C76534U1y c76534U1y = this.LLFF;
        if (c76534U1y == null) {
            return;
        }
        c76534U1y.notifyItemRangeChanged(0, c76534U1y.getItemCount());
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        AbstractC030109x abstractC030109x;
        Room room;
        ImageModel imageModel;
        int i;
        int i2;
        Long l;
        EnumC76248TwC reason;
        boolean z;
        List<C75883TqJ> list;
        List<C75883TqJ> list2;
        EnumC75644TmS enumC75644TmS;
        EnumC76319TxL enumC76319TxL;
        boolean z2;
        String str;
        List<C75883TqJ> list3;
        C76244Tw8 LJI;
        MutableLiveData<List<C75883TqJ>> mutableLiveData;
        C76244Tw8 LJI2;
        MutableLiveData<List<C75883TqJ>> mutableLiveData2;
        String value;
        C76236Tw0 LJFF;
        C76236Tw0 LJFF2;
        C76244Tw8 LJI3;
        MutableLiveData<List<C75883TqJ>> mutableLiveData3;
        C76244Tw8 LJI4;
        MutableLiveData<List<C75883TqJ>> mutableLiveData4;
        C76236Tw0 LJFF3;
        C76244Tw8 LJI5;
        C75883TqJ c75883TqJ;
        C76244Tw8 LJI6;
        long j;
        User owner;
        User owner2;
        AbstractC030109x abstractC030109x2;
        C76244Tw8 LJI7;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        AbstractC76233Tvx abstractC76233Tvx = (AbstractC76233Tvx) this.LJLILLLLZI;
        boolean z3 = true;
        if (abstractC76233Tvx != null && abstractC76233Tvx.LJII()) {
            C76265TwT.LIZIZ.LJ();
        } else {
            C76265TwT.LIZ.LJ();
        }
        AbstractC76233Tvx abstractC76233Tvx2 = (AbstractC76233Tvx) this.LJLILLLLZI;
        List<C75883TqJ> list4 = null;
        if (abstractC76233Tvx2 != null && (LJI7 = abstractC76233Tvx2.LJI()) != null) {
            LJI7.LJIIL = false;
        }
        RecyclerView recyclerView = this.LLF;
        if (recyclerView != null) {
            abstractC030109x = recyclerView.getItemAnimator();
        } else {
            abstractC030109x = null;
        }
        if (abstractC030109x instanceof AbstractC28931Bp) {
            RecyclerView recyclerView2 = this.LLF;
            if (recyclerView2 != null) {
                abstractC030109x2 = recyclerView2.getItemAnimator();
            } else {
                abstractC030109x2 = null;
            }
            o.LJII(abstractC030109x2, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
            ((AbstractC28931Bp) abstractC030109x2).LJI = false;
        }
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
        if (LJIILIIL != null) {
            room = (Room) LJIILIIL.kv0(RoomChannel.class);
        } else {
            room = null;
        }
        LiveIconView liveIconView = this.LJLJL;
        if (room != null && (owner2 = room.getOwner()) != null) {
            imageModel = owner2.getAvatarThumb();
        } else {
            imageModel = null;
        }
        LiveIconView liveIconView2 = this.LJLJL;
        if (liveIconView2 != null) {
            i = liveIconView2.getWidth();
        } else {
            i = 0;
        }
        LiveIconView liveIconView3 = this.LJLJL;
        if (liveIconView3 != null) {
            i2 = liveIconView3.getHeight();
        } else {
            i2 = 0;
        }
        C15640jQ.LJIIIZ(liveIconView, imageModel, i, i2, Gl(), null);
        this.LLFF = new C76534U1y(this);
        RecyclerView recyclerView3 = this.LLF;
        if (recyclerView3 != null) {
            getContext();
            recyclerView3.setLayoutManager(new GridLayoutManager(3));
        }
        RecyclerView recyclerView4 = this.LLF;
        if (recyclerView4 != null) {
            recyclerView4.LJII(new AbstractC030309z() { // from class: X.4mr
                @Override // X.AbstractC030309z
                public final void LJ(Rect rect, View view2, RecyclerView recyclerView5, C0AC c0ac) {
                    T28.LJ(rect, "outRect", view2, "view", recyclerView5, "parent", c0ac, "state");
                    super.LJ(rect, view2, recyclerView5, c0ac);
                    RecyclerView.LJJJJIZL(view2);
                    rect.set(C15380j0.LIZ(4.0f), 0, C15380j0.LIZ(4.0f), 0);
                }
            }, -1);
        }
        RecyclerView recyclerView5 = this.LLF;
        if (recyclerView5 != null) {
            recyclerView5.setAdapter(this.LLFF);
        }
        AbstractC76233Tvx abstractC76233Tvx3 = (AbstractC76233Tvx) this.LJLILLLLZI;
        long j2 = 0;
        if (abstractC76233Tvx3 != null && (LJI6 = abstractC76233Tvx3.LJI()) != null) {
            C76534U1y c76534U1y = this.LLFF;
            if (c76534U1y != null) {
                List<C75883TqJ> LJIILJJIL = C8E.LIZLLL().LJIILJJIL();
                ArrayList arrayList = new ArrayList();
                for (C75883TqJ c75883TqJ2 : LJIILJJIL) {
                    long j3 = c75883TqJ2.LIZ;
                    if (room != null && (owner = room.getOwner()) != null) {
                        j = owner.getId();
                    } else {
                        j = 0;
                    }
                    if (j3 != j) {
                        arrayList.add(c75883TqJ2);
                    }
                }
                c76534U1y.setData(arrayList);
            }
            if (C8E.LIZLLL().LJIILJJIL().size() != 4) {
                this.LJLIL.dismiss();
            }
            LJI6.LIZIZ.setValue(C8E.LIZLLL().LJIILJJIL());
            LJI6.LIZIZ.observe(this, new AObserverS76S0200000_13(this, room, 13));
            LJI6.LJ.observe(this, new AObserverS76S0200000_13(this, LJI6, 14));
            Kl(LJI6.LJ.getValue(), LJI6.LJI.getValue());
            LJI6.LJFF.observe(this, new AObserverS76S0200000_13(this, LJI6, 15));
            Jl(LJI6.LJFF.getValue(), LJI6.LJI.getValue());
            LJI6.LJI.observe(this, new AObserverS76S0200000_13(this, LJI6, 16));
        }
        DataChannel LJIILIIL2 = C51029K0z.LJIILIIL(this);
        if (LJIILIIL2 != null) {
            LJIILIIL2.lv0(this, BattleInvitingTimeLeftChannel.class, new AqS179S0100000_13(this, 605));
            LJIILIIL2.lv0(this, BattleStateChannel.class, new AqS179S0100000_13(this, 606));
            LJIILIIL2.lv0(this, BattleReMatchStateChannel.class, new AqS179S0100000_13(this, 607));
        }
        Il();
        C76271TwZ c76271TwZ = C76271TwZ.LIZ;
        AbstractC76233Tvx abstractC76233Tvx4 = (AbstractC76233Tvx) this.LJLILLLLZI;
        if (abstractC76233Tvx4 != null && (LJI5 = abstractC76233Tvx4.LJI()) != null && (c75883TqJ = LJI5.LJII) != null) {
            l = Long.valueOf(c75883TqJ.LIZ);
        } else {
            l = null;
        }
        AbstractC76233Tvx abstractC76233Tvx5 = (AbstractC76233Tvx) this.LJLILLLLZI;
        if (abstractC76233Tvx5 == null || (LJFF3 = abstractC76233Tvx5.LJFF()) == null || (reason = LJFF3.LJFF) == null) {
            reason = EnumC76248TwC.CLICKICON;
        }
        o.LJIIIZ(reason, "reason");
        JSONObject jSONObject = new JSONObject();
        if (l != null) {
            j2 = l.longValue();
        }
        C05630Jz.LJFF(jSONObject, "teammate_id", j2);
        JSONObject jSONObject2 = new JSONObject();
        C05630Jz.LJFF(jSONObject2, "prepare_invite_duration", C30725C4b.LIZ() - C76271TwZ.LIZIZ);
        JSONObject jSONObject3 = new JSONObject();
        C05630Jz.LJI(jSONObject3, "role_type", "inviter");
        C05630Jz.LJI(jSONObject3, "reason", reason.getType());
        c76271TwZ.LJJZZI("invite_panel_show", jSONObject, jSONObject3, jSONObject2, false);
        AbstractC76233Tvx abstractC76233Tvx6 = (AbstractC76233Tvx) this.LJLILLLLZI;
        if (abstractC76233Tvx6 != null) {
            abstractC76233Tvx6.LIZJ();
        }
        DataChannel LJIILIIL3 = C51029K0z.LJIILIIL(this);
        if (LJIILIIL3 != null) {
            LJIILIIL3.mv0(LinkedUserLeftEvent.class, this, new AqS179S0100000_13(this, 209));
        }
        C75832TpU c75832TpU = C75832TpU.LIZ;
        C2A7 c2a7 = this.LLFII;
        if (c2a7 != null) {
            z = c2a7.isEnabled();
        } else {
            z = false;
        }
        AbstractC76233Tvx abstractC76233Tvx7 = (AbstractC76233Tvx) this.LJLILLLLZI;
        if (abstractC76233Tvx7 != null && (LJI4 = abstractC76233Tvx7.LJI()) != null && (mutableLiveData4 = LJI4.LJ) != null) {
            list = mutableLiveData4.getValue();
        } else {
            list = null;
        }
        AbstractC76233Tvx abstractC76233Tvx8 = (AbstractC76233Tvx) this.LJLILLLLZI;
        if (abstractC76233Tvx8 != null && (LJI3 = abstractC76233Tvx8.LJI()) != null && (mutableLiveData3 = LJI3.LJFF) != null) {
            list2 = mutableLiveData3.getValue();
        } else {
            list2 = null;
        }
        AbstractC76233Tvx abstractC76233Tvx9 = (AbstractC76233Tvx) this.LJLILLLLZI;
        if (abstractC76233Tvx9 != null && (LJFF2 = abstractC76233Tvx9.LJFF()) != null) {
            enumC75644TmS = LJFF2.LJ;
        } else {
            enumC75644TmS = null;
        }
        AbstractC76233Tvx abstractC76233Tvx10 = (AbstractC76233Tvx) this.LJLILLLLZI;
        if (abstractC76233Tvx10 != null && (LJFF = abstractC76233Tvx10.LJFF()) != null) {
            enumC76319TxL = LJFF.LIZJ;
        } else {
            enumC76319TxL = null;
        }
        AbstractC76233Tvx abstractC76233Tvx11 = (AbstractC76233Tvx) this.LJLILLLLZI;
        if (abstractC76233Tvx11 != null && abstractC76233Tvx11.LJII()) {
            z2 = true;
        } else {
            z2 = false;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_start_clickable", str);
        C75832TpU.LJIIJJI(linkedHashMap, enumC76319TxL);
        if (enumC75644TmS != null && (value = enumC75644TmS.getValue()) != null) {
            linkedHashMap.put("show_reason", value);
        }
        linkedHashMap.put("channel_id", String.valueOf(B5G.LIZIZ().LJFF));
        C75832TpU.LJFF(c75832TpU, linkedHashMap, false, false, 6);
        C75832TpU.LJIILIIL(linkedHashMap);
        C75832TpU.LJIILJJIL(list, list2, linkedHashMap);
        C75832TpU.LJI(linkedHashMap, z2);
        C75832TpU.LIZ(linkedHashMap);
        C75832TpU.LJJJIL(c75832TpU, "livesdk_group_pk_teammate_selection_show", linkedHashMap, "1");
        AbstractC76233Tvx abstractC76233Tvx12 = (AbstractC76233Tvx) this.LJLILLLLZI;
        if (abstractC76233Tvx12 == null || !abstractC76233Tvx12.LJII()) {
            z3 = false;
        }
        AbstractC76233Tvx abstractC76233Tvx13 = (AbstractC76233Tvx) this.LJLILLLLZI;
        if (abstractC76233Tvx13 != null && (LJI2 = abstractC76233Tvx13.LJI()) != null && (mutableLiveData2 = LJI2.LJ) != null) {
            list3 = mutableLiveData2.getValue();
        } else {
            list3 = null;
        }
        AbstractC76233Tvx abstractC76233Tvx14 = (AbstractC76233Tvx) this.LJLILLLLZI;
        if (abstractC76233Tvx14 != null && (LJI = abstractC76233Tvx14.LJI()) != null && (mutableLiveData = LJI.LJFF) != null) {
            list4 = mutableLiveData.getValue();
        }
        c75832TpU.LJJIJ(list3, list4, z3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z;
        EnumC76178Tv4 LJ;
        C29S c29s;
        AbstractC76233Tvx abstractC76233Tvx;
        C76244Tw8 LJI;
        MutableLiveData<Map<Long, Boolean>> mutableLiveData;
        Map<Long, Boolean> value;
        o.LJIIIZ(inflater, "inflater");
        boolean z2 = false;
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.czj, viewGroup, false);
        LLLLIILL.findViewById(R.id.eri);
        this.LJLJL = (LiveIconView) LLLLIILL.findViewById(R.id.jmz);
        this.LJLJLJ = (C47061t0) LLLLIILL.findViewById(R.id.jmx);
        this.LJLJLLL = (LiveIconView) LLLLIILL.findViewById(R.id.l1x);
        this.LJLL = (C47061t0) LLLLIILL.findViewById(R.id.l1w);
        this.LJLLILLLL = (LiveIconView) LLLLIILL.findViewById(R.id.j3n);
        this.LJLLJ = (C47061t0) LLLLIILL.findViewById(R.id.j3o);
        this.LJLLL = (LiveIconView) LLLLIILL.findViewById(R.id.j3t);
        this.LJLLLL = (C47061t0) LLLLIILL.findViewById(R.id.j3u);
        this.LLF = (RecyclerView) LLLLIILL.findViewById(R.id.fto);
        this.LLFII = (C2A7) LLLLIILL.findViewById(R.id.ert);
        this.LJLLI = (C47061t0) LLLLIILL.findViewById(R.id.f5j);
        this.LJLLLLLL = (C47061t0) LLLLIILL.findViewById(R.id.f5i);
        this.LJLZ = (C47121t6) LLLLIILL.findViewById(R.id.l1z);
        this.LJZ = (C47121t6) LLLLIILL.findViewById(R.id.j3q);
        this.LJZI = (C47121t6) LLLLIILL.findViewById(R.id.j3w);
        this.LJZL = (C29701Eo) LLLLIILL.findViewById(R.id.l20);
        this.LL = (C29701Eo) LLLLIILL.findViewById(R.id.j3r);
        this.LLD = (C29701Eo) LLLLIILL.findViewById(R.id.j3x);
        C15490jB.LJIIL(this.LJZL, CFX.LIZ("tiktok_live_link_mic", "tiktok_live_interaction_demand_1"), "live_match_wave_red.zip", "", true, null, C76237Tw1.LJLIL, 32);
        C15490jB.LJIIL(this.LL, CFX.LIZ("tiktok_live_link_mic", "tiktok_live_interaction_demand_1"), "live_match_wave_blue.zip", "", true, null, C76238Tw2.LJLIL, 32);
        C15490jB.LJIIL(this.LLD, CFX.LIZ("tiktok_live_link_mic", "tiktok_live_interaction_demand_1"), "live_match_wave_blue.zip", "", true, null, C76239Tw3.LJLIL, 32);
        C15490jB.LJ(this.LJLLI, CFX.LIZ("tiktok_live_watch_resource", "tiktok_live_interaction_demand_1"), "ttlive_match_invite_red_group_bg.png");
        C15490jB.LJ(this.LJLLLLLL, CFX.LIZ("tiktok_live_watch_resource", "tiktok_live_interaction_demand_1"), "ttlive_match_invite_blue_group_bg.png");
        C76260TwO c76260TwO = this.LLIFFJFJJ;
        AbstractC76233Tvx abstractC76233Tvx2 = (AbstractC76233Tvx) this.LJLILLLLZI;
        if (abstractC76233Tvx2 != null && abstractC76233Tvx2.LJII()) {
            z = true;
        } else {
            z = false;
        }
        c76260TwO.LIZJ(z);
        C76260TwO c76260TwO2 = this.LLIFFJFJJ;
        InterfaceC75477Tjl mDialog = this.LJLIL;
        o.LJIIIIZZ(mDialog, "mDialog");
        c76260TwO2.LIZ(LLLLIILL, mDialog, this.LLI);
        AbstractC76233Tvx abstractC76233Tvx3 = (AbstractC76233Tvx) this.LJLILLLLZI;
        if (abstractC76233Tvx3 != null && abstractC76233Tvx3.LJII()) {
            z2 = true;
        }
        if (z2) {
            LJ = C76265TwT.LIZIZ.LJ();
        } else {
            LJ = C76265TwT.LIZ.LJ();
        }
        if (LJ != EnumC76178Tv4.INVITED && (abstractC76233Tvx = (AbstractC76233Tvx) this.LJLILLLLZI) != null && (LJI = abstractC76233Tvx.LJI()) != null && (mutableLiveData = LJI.LJI) != null && (value = mutableLiveData.getValue()) != null) {
            value.clear();
        }
        try {
            ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
            C10A.LIZIZ(LLLLIILL, this);
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
        return LLLLIILL;
    }
}
