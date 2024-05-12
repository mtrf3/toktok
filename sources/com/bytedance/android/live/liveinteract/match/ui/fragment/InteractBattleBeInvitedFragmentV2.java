package com.bytedance.android.live.liveinteract.match.ui.fragment;

import X.ActivityC45651qj;
import X.B5G;
import X.C05170If;
import X.C10A;
import X.C141335gf;
import X.C15380j0;
import X.C15490jB;
import X.C15640jQ;
import X.C16880lQ;
import X.C221108m2;
import X.C276516r;
import X.C29059Bap;
import X.C29306Beo;
import X.C29401Dk;
import X.C29S;
import X.C30868C9o;
import X.C3C5;
import X.C47061t0;
import X.C47121t6;
import X.C47151t9;
import X.C51029K0z;
import X.C62822Ol8;
import X.C75457TjR;
import X.C75545Tkr;
import X.C75768ToS;
import X.C75832TpU;
import X.C75883TqJ;
import X.C76029Tsf;
import X.C76185TvB;
import X.C76265TwT;
import X.C76272Twa;
import X.C76800UCe;
import X.C8E;
import X.C90903hW;
import X.CFX;
import X.EnumC31158CKs;
import X.EnumC75614Tly;
import X.EnumC75831TpT;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.match.business.contract.InteractPkBeInvitedContract$View;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class InteractBattleBeInvitedFragmentV2 extends InteractPkBeInvitedContract$View {
    public static final /* synthetic */ int LJLZ = 0;
    public int LJLJJL;
    public long LJLJJLL;
    public C47121t6 LJLJL;
    public C47121t6 LJLJLJ;
    public C47061t0 LJLJLLL;
    public C47061t0 LJLL;
    public C47061t0 LJLLI;
    public C47061t0 LJLLILLLL;
    public Room LJLLJ;
    public final Map<Integer, View> LJLLLLLL = new LinkedHashMap();
    public final C76185TvB LJLLL = new C76185TvB(this);
    public final C62822Ol8 LJLLLL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 61));

    @Override // com.bytedance.android.live.liveinteract.match.business.contract.InteractPkBeInvitedContract$View
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLLLLL).clear();
    }

    @Override // com.bytedance.android.live.liveinteract.match.business.contract.InteractPkBeInvitedContract$View, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsView
    public final C76029Tsf vl() {
        C76185TvB c76185TvB = this.LJLLL;
        boolean z = true;
        if (this.LJLJJL != 1) {
            z = false;
        }
        c76185TvB.getClass();
        int LIZ = C76185TvB.LIZ(z);
        C76029Tsf c76029Tsf = new C76029Tsf();
        String LJIILJJIL = C15380j0.LJIILJJIL(R.string.my7);
        o.LJIIIIZZ(LJIILJJIL, "getString(R.string.pm_match_invite_panel_title)");
        c76029Tsf.LIZ = LJIILJJIL;
        c76029Tsf.LIZIZ = LIZ + 172;
        c76029Tsf.LJFF = false;
        return c76029Tsf;
    }

    @Override // com.bytedance.android.live.liveinteract.match.business.contract.InteractPkBeInvitedContract$View
    public final void wl(Throwable throwable) {
        o.LJIIIZ(throwable, "throwable");
        if ((throwable instanceof C29401Dk) && ((C276516r) throwable).getErrorCode() == 4004048) {
            C30868C9o.LIZJ(R.string.mih);
        } else {
            C30868C9o.LIZJ(R.string.sqr);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.match.business.contract.InteractPkBeInvitedContract$View
    public final void xl(Throwable throwable) {
        o.LJIIIZ(throwable, "throwable");
        C30868C9o.LIZJ(R.string.sqr);
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
        this.LJLJLLL = (C47061t0) view.findViewById(R.id.it3);
        this.LJLJL = (C47121t6) view.findViewById(R.id.it5);
        this.LJLLI = (C47061t0) view.findViewById(R.id.isw);
        this.LJLJLJ = (C47121t6) view.findViewById(R.id.an2);
        this.LJLL = (C47061t0) view.findViewById(R.id.an0);
        this.LJLLILLLL = (C47061t0) view.findViewById(R.id.amy);
        View findViewById = view.findViewById(R.id.lx);
        if (findViewById != null) {
            C29306Beo.LJJJLL(findViewById, 500L, new AqS179S0100000_13(this, 63));
        }
        View findViewById2 = view.findViewById(R.id.c4h);
        if (findViewById2 != null) {
            C29306Beo.LJJJLL(findViewById2, 500L, new AqS179S0100000_13(this, 64));
        }
        C76185TvB c76185TvB = this.LJLLL;
        c76185TvB.getClass();
        c76185TvB.LIZ = (C47151t9) view.findViewById(R.id.dtu);
        c76185TvB.LIZIZ = (C47121t6) view.findViewById(R.id.dtt);
        Room room = this.LJLLJ;
        ImageModel imageModel = null;
        if (room != null) {
            user = room.getOwner();
        } else {
            user = null;
        }
        boolean z = true;
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
                C47121t6 c47121t6 = this.LJLJLJ;
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
                C47061t0 c47061t0 = this.LJLL;
                C75768ToS c75768ToS2 = c75883TqJ3.LJIIZILJ;
                if (c75768ToS2 != null) {
                    imageModel = c75768ToS2.LIZJ;
                }
                if (c47061t0 != null) {
                    i5 = c47061t0.getWidth();
                } else {
                    i5 = 0;
                }
                C47061t0 c47061t02 = this.LJLL;
                if (c47061t02 != null) {
                    i6 = c47061t02.getHeight();
                } else {
                    i6 = 0;
                }
                C15640jQ.LJIIIZ(c47061t0, imageModel, i5, i6, ((Number) this.LJLLLL.getValue()).intValue(), null);
            }
        } else {
            B5G.LIZIZ();
            Object obj = ((ConcurrentHashMap) LinkCrossRoomDataHolder.LJLJI).get("data_guest_user");
            if (obj == null) {
                obj = null;
            }
            User user2 = (User) obj;
            C47121t6 c47121t62 = this.LJLJLJ;
            if (c47121t62 != null) {
                c47121t62.setText(C05170If.LIZ(user2));
            }
            C47061t0 c47061t03 = this.LJLL;
            if (user2 != null) {
                imageModel = user2.getAvatarThumb();
            }
            C47061t0 c47061t04 = this.LJLL;
            if (c47061t04 != null) {
                i = c47061t04.getWidth();
            } else {
                i = 0;
            }
            C47061t0 c47061t05 = this.LJLL;
            if (c47061t05 != null) {
                i2 = c47061t05.getHeight();
            } else {
                i2 = 0;
            }
            C15640jQ.LJIIIZ(c47061t03, imageModel, i, i2, ((Number) this.LJLLLL.getValue()).intValue(), null);
        }
        if (user != null) {
            C47121t6 c47121t63 = this.LJLJL;
            if (c47121t63 != null) {
                c47121t63.setText(C05170If.LIZ(user));
            }
            C47061t0 c47061t06 = this.LJLJLLL;
            ImageModel avatarThumb = user.getAvatarThumb();
            C47061t0 c47061t07 = this.LJLJLLL;
            if (c47061t07 != null) {
                i3 = c47061t07.getWidth();
            } else {
                i3 = 0;
            }
            C47061t0 c47061t08 = this.LJLJLLL;
            if (c47061t08 != null) {
                i4 = c47061t08.getHeight();
            } else {
                i4 = 0;
            }
            C15640jQ.LJIIIZ(c47061t06, avatarThumb, i3, i4, ((Number) this.LJLLLL.getValue()).intValue(), null);
        }
        C15490jB.LJ(this.LJLLI, CFX.LIZ("tiktok_live_link_mic", "tiktok_live_interaction_normal_1"), "ttlive_match_red_group_bg.png");
        C15490jB.LJ(this.LJLLILLLL, CFX.LIZ("tiktok_live_link_mic", "tiktok_live_interaction_normal_1"), "ttlive_match_blue_group_bg.png");
        C76185TvB c76185TvB2 = this.LJLLL;
        if (this.LJLJJL != 1) {
            z = false;
        }
        c76185TvB2.LIZIZ(z);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z;
        Room room;
        String str;
        String str2;
        String str3;
        o.LJIIIZ(inflater, "inflater");
        if (this.LJLJJL == 1) {
            z = true;
        } else {
            z = false;
        }
        JSONObject jSONObject = new JSONObject();
        C76272Twa c76272Twa = C76272Twa.LIZ;
        C76272Twa.LJIJJ(jSONObject, z);
        C76272Twa.LJJJLIIL(c76272Twa, "receive_panel_show", jSONObject, z, null, 56);
        if (!C8E.LIZLLL().LLIFFJFJJ()) {
            long j = this.LJLJJLL;
            HashMap hashMap = new HashMap();
            C75457TjR.LIZ(hashMap);
            C75545Tkr.LIZJ(hashMap, B5G.LIZIZ().LJIIJ, false);
            long currentTimeMillis = System.currentTimeMillis();
            C75457TjR.LIZJ = currentTimeMillis;
            hashMap.put("time_stamp", String.valueOf(currentTimeMillis));
            hashMap.put("connection_type", EnumC75831TpT.MANUAL_PK.getType());
            if (B5G.LIZIZ().LJIIL) {
                str = "inviter";
            } else {
                str = "invitee";
            }
            hashMap.put("anchor_type", str);
            if (z) {
                if (C76265TwT.LJI()) {
                    str3 = "draw";
                } else {
                    str3 = "not_draw";
                }
                hashMap.put("oncemore_type", str3);
            }
            hashMap.put("pk_id", String.valueOf(j));
            hashMap.put("relation_type", String.valueOf(B5G.LIZIZ().LJJLIIIJJI));
            if (B5G.LIZIZ().LJIIJ == EnumC75614Tly.RANDOM_LINK_MIC_RECOMMEND) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            hashMap.put("is_quick_recommend", str2);
            if (DataChannelGlobal.LJLJJI.mv0(C29059Bap.class) == EnumC31158CKs.SHOW) {
                hashMap.put("event_page", "live_extended_comment_filed");
            }
            C75832TpU.LJI(hashMap, z);
            C75457TjR.LJJI("livesdk_connected_popup_show", hashMap);
        } else {
            C75832TpU.LIZ.LJIJJ(Long.valueOf(B5G.LIZIZ().LJI), false, null, this.LJLJJLL, z, "");
        }
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
        C29S c29s = null;
        if (LJIILIIL != null) {
            room = (Room) LJIILIIL.kv0(RoomChannel.class);
        } else {
            room = null;
        }
        this.LJLLJ = room;
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.d1q, viewGroup, false);
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
