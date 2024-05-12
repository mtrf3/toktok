package com.bytedance.android.live.liveinteract.match.ui.fragment;

import X.ActivityC45651qj;
import X.B5G;
import X.C05170If;
import X.C05630Jz;
import X.C10A;
import X.C141335gf;
import X.C15380j0;
import X.C15490jB;
import X.C15640jQ;
import X.C16880lQ;
import X.C221108m2;
import X.C29306Beo;
import X.C29S;
import X.C2A7;
import X.C3C5;
import X.C47061t0;
import X.C47121t6;
import X.C51029K0z;
import X.C62822Ol8;
import X.C75768ToS;
import X.C75832TpU;
import X.C75883TqJ;
import X.C76029Tsf;
import X.C76100Tto;
import X.C76101Ttp;
import X.C76102Ttq;
import X.C76260TwO;
import X.C76261TwP;
import X.C76265TwT;
import X.C76272Twa;
import X.C76280Twi;
import X.C76800UCe;
import X.C8E;
import X.C90903hW;
import X.CFX;
import X.EnumC76178Tv4;
import X.InterfaceC40159FpT;
import X.InterfaceC65784Pro;
import X.InterfaceC75477Tjl;
import Y.ARunnableS49S0100000_13;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.match.business.contract.InteractPkInviteContract$View;
import com.bytedance.android.live.liveinteract.match.business.event.BattleReMatchStateChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleStateChannel;
import com.bytedance.android.live.liveinteract.match.model.PrepareBattleResponse;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class InteractBattleInviteFragment extends InteractPkInviteContract$View {
    public static final /* synthetic */ int LLF = 0;
    public boolean LJLJLLL;
    public C47121t6 LJLL;
    public C47061t0 LJLLI;
    public C47061t0 LJLLILLLL;
    public C47121t6 LJLLJ;
    public C47061t0 LJLLL;
    public C47061t0 LJLLLL;
    public C2A7 LJLLLLLL;
    public DataChannel LJLZ;
    public Room LJZ;
    public SparkContext LJZI;
    public long LL;
    public final Map<Integer, View> LLD = new LinkedHashMap();
    public InterfaceC65784Pro<C76800UCe> LJLJJL = C76101Ttp.LJLIL;
    public InterfaceC65784Pro<C76800UCe> LJLJJLL = C76100Tto.LJLIL;
    public InterfaceC65784Pro<C76800UCe> LJLJL = C76102Ttq.LJLIL;
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(new AqS163S0100000_13(this, 62));
    public final C76260TwO LJZL = new C76260TwO(this);

    @Override // com.bytedance.android.live.liveinteract.match.business.contract.InteractPkInviteContract$View
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLD).clear();
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsView
    public final C76029Tsf vl() {
        int i;
        ViewGroup viewGroup;
        C76029Tsf c76029Tsf = new C76029Tsf();
        String LJIILJJIL = C15380j0.LJIILJJIL(R.string.mxq);
        o.LJIIIIZZ(LJIILJJIL, "getString(R.string.pm_ma…ft_option_entrance_title)");
        c76029Tsf.LIZ = LJIILJJIL;
        if (this.LJZL != null) {
            i = C76260TwO.LIZIZ();
        } else {
            i = 0;
        }
        c76029Tsf.LIZIZ = i + 176;
        c76029Tsf.LJFF = true;
        PrepareBattleResponse.ResponseData responseData = C76265TwT.LJIILL;
        if (responseData != null && responseData.ruleGuideUrl != null) {
            LayoutInflater LLZIL = C16880lQ.LLZIL(getContext());
            View view = getView();
            View view2 = null;
            if (view instanceof ViewGroup) {
                viewGroup = (ViewGroup) view;
            } else {
                viewGroup = null;
            }
            View LLLLIILL = C16880lQ.LLLLIILL(LLZIL, R.layout.dkk, viewGroup, false);
            if (LLLLIILL != null) {
                C29306Beo.LJJJLL(LLLLIILL, 500L, new AqS171S0100000_5(this, 32));
                view2 = LLLLIILL;
            }
            c76029Tsf.LJ = view2;
        }
        return c76029Tsf;
    }

    public final void wl() {
        C76280Twi c76280Twi;
        this.LJLJJL.invoke();
        C76272Twa c76272Twa = C76272Twa.LIZ;
        boolean z = this.LJLJLLL;
        JSONObject jSONObject = new JSONObject();
        C76272Twa.LJIJJ(jSONObject, z);
        C76272Twa.LJIJ(jSONObject);
        if (z) {
            c76280Twi = C76265TwT.LIZIZ;
        } else {
            c76280Twi = C76265TwT.LIZ;
        }
        c76272Twa.LJIILLIIL(jSONObject, c76280Twi);
        C05630Jz.LJI(jSONObject, "invite_type", String.valueOf(z ? 1 : 0));
        C76272Twa.LJJJLIIL(c76272Twa, "inivte_panel_invite_click", jSONObject, z, null, 56);
    }

    public final void xl() {
        C76280Twi c76280Twi;
        Text text;
        if (this.LJLJLLL) {
            c76280Twi = C76265TwT.LIZIZ;
        } else {
            c76280Twi = C76265TwT.LIZ;
        }
        if (c76280Twi.LJ() == EnumC76178Tv4.INVITED) {
            C2A7 c2a7 = this.LJLLLLLL;
            if (c2a7 != null) {
                c2a7.setText(C15380j0.LJIILJJIL(R.string.kmu));
            }
            C2A7 c2a72 = this.LJLLLLLL;
            if (c2a72 != null) {
                c2a72.LJJLL(R.style.a3a);
            }
            C2A7 c2a73 = this.LJLLLLLL;
            if (c2a73 != null) {
                C29306Beo.LJJJLL(c2a73, 500L, new AqS179S0100000_13(this, 68));
            }
        } else {
            C2A7 c2a74 = this.LJLLLLLL;
            if (c2a74 != null) {
                c2a74.setText(C15380j0.LJIILJJIL(R.string.mxg));
            }
            C2A7 c2a75 = this.LJLLLLLL;
            if (c2a75 != null) {
                c2a75.LJJLL(R.style.a2z);
            }
            C2A7 c2a76 = this.LJLLLLLL;
            if (c2a76 != null) {
                C29306Beo.LJJJLL(c2a76, 500L, new AqS179S0100000_13(this, 69));
            }
            if (this.LJLJLLL && C76261TwP.LIZ()) {
                C76261TwP.LIZ = true;
                C2A7 c2a77 = this.LJLLLLLL;
                if (c2a77 != null) {
                    c2a77.post(new ARunnableS49S0100000_13(this, 26));
                }
            }
        }
        C76260TwO c76260TwO = this.LJZL;
        if (c76260TwO != null) {
            boolean z = this.LJLJLLL;
            PrepareBattleResponse.ResponseData responseData = C76265TwT.LJIILL;
            if (responseData != null) {
                text = responseData.giftEventDesc;
            } else {
                text = null;
            }
            c76260TwO.LJ(z, text, false);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.match.business.contract.InteractPkInviteContract$View, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        InterfaceC40159FpT LJIILL;
        super.onDestroyView();
        SparkContext sparkContext = this.LJZI;
        if (sparkContext != null && (LJIILL = sparkContext.LJIILL()) != null) {
            LJIILL.close();
        }
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        User user;
        int i;
        int i2;
        int i3;
        int i4;
        C75883TqJ c75883TqJ;
        String str;
        String str2;
        int i5;
        int i6;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LJLL = (C47121t6) view.findViewById(R.id.it5);
        this.LJLLI = (C47061t0) view.findViewById(R.id.it3);
        this.LJLLILLLL = (C47061t0) view.findViewById(R.id.isw);
        this.LJLLJ = (C47121t6) view.findViewById(R.id.an2);
        this.LJLLL = (C47061t0) view.findViewById(R.id.an0);
        this.LJLLLL = (C47061t0) view.findViewById(R.id.amy);
        C76260TwO c76260TwO = this.LJZL;
        if (c76260TwO != null) {
            InterfaceC75477Tjl mDialog = this.LJLIL;
            o.LJIIIIZZ(mDialog, "mDialog");
            c76260TwO.LIZ(view, mDialog, this.LJLJL);
        }
        this.LJLLLLLL = (C2A7) view.findViewById(R.id.ert);
        Room room = this.LJZ;
        Object obj = null;
        ImageModel imageModel = null;
        if (room != null) {
            user = room.getOwner();
        } else {
            user = null;
        }
        if (C8E.LIZLLL().LLIFFJFJJ()) {
            Iterator<C75883TqJ> it = C8E.LIZLLL().LJIILJJIL().iterator();
            while (true) {
                if (it.hasNext()) {
                    c75883TqJ = it.next();
                    C75883TqJ c75883TqJ2 = c75883TqJ;
                    if (user == null || c75883TqJ2.LIZ != user.getId()) {
                        break;
                    }
                } else {
                    c75883TqJ = null;
                    break;
                }
            }
            C75883TqJ c75883TqJ3 = c75883TqJ;
            if (c75883TqJ3 != null) {
                C47121t6 c47121t6 = this.LJLLJ;
                if (c47121t6 != null) {
                    C75768ToS c75768ToS = c75883TqJ3.LJIIZILJ;
                    if (c75768ToS != null) {
                        str = c75768ToS.LIZ;
                        str2 = c75768ToS.LIZIZ;
                    } else {
                        str = null;
                        str2 = null;
                    }
                    c47121t6.setText(C05170If.LIZIZ(str, str2));
                }
                C47061t0 c47061t0 = this.LJLLL;
                C75768ToS c75768ToS2 = c75883TqJ3.LJIIZILJ;
                if (c75768ToS2 != null) {
                    imageModel = c75768ToS2.LIZJ;
                }
                if (c47061t0 != null) {
                    i5 = c47061t0.getWidth();
                } else {
                    i5 = 0;
                }
                C47061t0 c47061t02 = this.LJLLL;
                if (c47061t02 != null) {
                    i6 = c47061t02.getHeight();
                } else {
                    i6 = 0;
                }
                C15640jQ.LJIIIZ(c47061t0, imageModel, i5, i6, ((Number) this.LJLJLJ.getValue()).intValue(), null);
            }
        } else {
            B5G.LIZIZ();
            Object obj2 = ((ConcurrentHashMap) LinkCrossRoomDataHolder.LJLJI).get("data_guest_user");
            if (obj2 != null) {
                obj = obj2;
            }
            User user2 = (User) obj;
            if (user2 != null) {
                C47121t6 c47121t62 = this.LJLLJ;
                if (c47121t62 != null) {
                    c47121t62.setText(C05170If.LIZ(user2));
                }
                C47061t0 c47061t03 = this.LJLLL;
                ImageModel avatarThumb = user2.getAvatarThumb();
                C47061t0 c47061t04 = this.LJLLL;
                if (c47061t04 != null) {
                    i = c47061t04.getWidth();
                } else {
                    i = 0;
                }
                C47061t0 c47061t05 = this.LJLLL;
                if (c47061t05 != null) {
                    i2 = c47061t05.getHeight();
                } else {
                    i2 = 0;
                }
                C15640jQ.LJIIIZ(c47061t03, avatarThumb, i, i2, ((Number) this.LJLJLJ.getValue()).intValue(), null);
            }
        }
        if (user != null) {
            C47121t6 c47121t63 = this.LJLL;
            if (c47121t63 != null) {
                c47121t63.setText(C05170If.LIZ(user));
            }
            C47061t0 c47061t06 = this.LJLLI;
            ImageModel avatarThumb2 = user.getAvatarThumb();
            C47061t0 c47061t07 = this.LJLLI;
            if (c47061t07 != null) {
                i3 = c47061t07.getWidth();
            } else {
                i3 = 0;
            }
            C47061t0 c47061t08 = this.LJLLI;
            if (c47061t08 != null) {
                i4 = c47061t08.getHeight();
            } else {
                i4 = 0;
            }
            C15640jQ.LJIIIZ(c47061t06, avatarThumb2, i3, i4, ((Number) this.LJLJLJ.getValue()).intValue(), null);
        }
        C15490jB.LJ(this.LJLLILLLL, CFX.LIZ("tiktok_live_link_mic", "tiktok_live_interaction_normal_1"), "ttlive_match_red_group_bg.png");
        C15490jB.LJ(this.LJLLLL, CFX.LIZ("tiktok_live_link_mic", "tiktok_live_interaction_normal_1"), "ttlive_match_blue_group_bg.png");
        xl();
        if (this.LJLJLLL) {
            DataChannel dataChannel = this.LJLZ;
            if (dataChannel != null) {
                dataChannel.lv0(this, BattleReMatchStateChannel.class, new AqS179S0100000_13(this, 65));
            }
            DataChannel dataChannel2 = this.LJLZ;
            if (dataChannel2 != null) {
                dataChannel2.lv0(this, BattleStateChannel.class, new AqS179S0100000_13(this, 66));
                return;
            }
            return;
        }
        DataChannel dataChannel3 = this.LJLZ;
        if (dataChannel3 == null) {
            return;
        }
        dataChannel3.lv0(this, BattleStateChannel.class, new AqS179S0100000_13(this, 67));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C76280Twi c76280Twi;
        String str;
        Room room;
        o.LJIIIZ(inflater, "inflater");
        this.LJZL.LIZJ(this.LJLJLLL);
        C29S c29s = null;
        C75832TpU.LIZ.LJJIJ(null, null, this.LJLJLLL);
        C76272Twa c76272Twa = C76272Twa.LIZ;
        boolean z = this.LJLJLLL;
        JSONObject jSONObject = new JSONObject();
        C76272Twa.LJIJJ(jSONObject, z);
        C76272Twa.LJIJ(jSONObject);
        if (z) {
            c76280Twi = C76265TwT.LIZIZ;
        } else {
            c76280Twi = C76265TwT.LIZ;
        }
        c76272Twa.LJIILLIIL(jSONObject, c76280Twi);
        C05630Jz.LJI(jSONObject, "invite_type", String.valueOf(z ? 1 : 0));
        if (c76280Twi.LJ() == EnumC76178Tv4.START) {
            str = "withdraw";
        } else {
            str = "invite";
        }
        C05630Jz.LJI(jSONObject, "state", str);
        C76272Twa.LJJJLIIL(c76272Twa, "invite_panel_popu_show", jSONObject, z, null, 56);
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
        this.LJLZ = LJIILIIL;
        if (LJIILIIL != null) {
            room = (Room) LJIILIIL.kv0(RoomChannel.class);
        } else {
            room = null;
        }
        this.LJZ = room;
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.d1r, viewGroup, false);
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
