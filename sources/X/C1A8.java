package X;

import android.graphics.Rect;
import android.graphics.Region;
import android.widget.FrameLayout;
import com.appsflyer.AppsFlyerLib;
import com.bytedance.android.live.liveinteract.linkroom.widget.LinkControlWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.MultiGuestAnchorAvatarBgWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.MultiGuestV3AnchorWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3GuestWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.reservation.anchor.MultiGuestV3AnchorReservationWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.reservation.guest.MultiGuestV3GuestReservationWidget;
import com.bytedance.android.live.liveinteract.multihost.biz.link.MultiCoHostWidget;
import com.bytedance.android.live.liveinteract.voicechat.main.VoiceChatControlWidget;
import com.bytedance.android.live.liveinteract.voicechat.main.anchor.VoiceChatAnchorWidget;
import com.bytedance.android.live.liveinteract.voicechat.main.guest.VoiceChatWatchWidget;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.comment.likelist.model.LikeListResponse;
import com.ss.android.ugc.aweme.ecommerce.slark.impl.TrackNodeStore;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.1A8, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1A8 implements Q9C, InterfaceC48038ItG, InterfaceC30069Br7, InterfaceC15710jX {
    public static final C1A8 LJLIL = new C1A8();

    @Override // X.InterfaceC30069Br7
    public void LJ() {
    }

    @Override // X.Q9C
    public void onError(String p1) {
        o.LJIIIZ(p1, "p1");
    }

    @Override // X.InterfaceC30069Br7
    public VoiceChatAnchorWidget LIZLLL() {
        return new VoiceChatAnchorWidget();
    }

    @Override // X.InterfaceC30069Br7
    public VoiceChatWatchWidget LJI() {
        return new VoiceChatWatchWidget();
    }

    @Override // X.InterfaceC30069Br7
    public MultiGuestAnchorAvatarBgWidget LJIIJ() {
        return new MultiGuestAnchorAvatarBgWidget();
    }

    @Override // X.Q9C
    public void onSuccess() {
        AppsFlyerLib.getInstance().anonymizeUser(FLO.LIZLLL);
    }

    public static final boolean LJIIL(C07210Qb c07210Qb) {
        if (C0QZ.LIZ(c07210Qb.LJFF(), C07230Qd.LJIIIIZZ) == null) {
            return true;
        }
        return false;
    }

    public static final boolean LJIILIIL(C07210Qb c07210Qb) {
        C1JY LIZLLL;
        if (!LJIJJ(c07210Qb) || o.LJ(C0QZ.LIZ(c07210Qb.LJFF, C07230Qd.LJIIJ), Boolean.TRUE)) {
            C29321Dc LJIILL = LJIILL(c07210Qb.LIZJ, C45591qd.LJLIL);
            if (LJIILL == null) {
                return false;
            }
            C1DT LJIILLIIL = C1E4.LJIILLIIL(LJIILL);
            if (LJIILLIIL != null && (LIZLLL = C78598Ut0.LIZLLL(LJIILLIIL)) != null && o.LJ(C0QZ.LIZ(LIZLLL, C07230Qd.LJIIJ), Boolean.TRUE)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean LJIJJ(C07210Qb c07210Qb) {
        return c07210Qb.LJFF.LJII(C0QY.LJII);
    }

    @Override // X.InterfaceC30069Br7
    public MultiCoHostWidget LIZ(boolean z) {
        return new MultiCoHostWidget(z);
    }

    @Override // X.InterfaceC30069Br7
    public MultiGuestV3AnchorWidget LIZIZ(FrameLayout container) {
        o.LJIIIZ(container, "container");
        return new MultiGuestV3AnchorWidget(container);
    }

    @Override // X.InterfaceC30069Br7
    public MultiGuestV3AnchorReservationWidget LIZJ(FrameLayout container) {
        o.LJIIIZ(container, "container");
        return new MultiGuestV3AnchorReservationWidget(container);
    }

    @Override // X.InterfaceC30069Br7
    public LinkControlWidget LJFF(InterfaceC32212Cka interfaceC32212Cka) {
        return new LinkControlWidget(interfaceC32212Cka);
    }

    @Override // X.InterfaceC30069Br7
    public MultiGuestV3GuestReservationWidget LJII(FrameLayout container) {
        o.LJIIIZ(container, "container");
        return new MultiGuestV3GuestReservationWidget(container);
    }

    @Override // X.InterfaceC30069Br7
    public MultiGuestV3GuestWidget LJIIIIZZ(FrameLayout container) {
        o.LJIIIZ(container, "container");
        return new MultiGuestV3GuestWidget(container);
    }

    @Override // X.InterfaceC30069Br7
    public void LJIIIZ(UB9 ub9) {
        if (ub9 != null) {
            C75559Tl5.LIZIZ.LJI(ub9, "LIVE_VIDEO_CLIENT_FACTORY");
        }
    }

    @Override // X.InterfaceC30069Br7
    public VoiceChatControlWidget LJIIJJI(TX9 tx9) {
        return new VoiceChatControlWidget(tx9);
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        String str;
        String recType;
        LikeListResponse resp = (LikeListResponse) obj;
        o.LJIIIZ(resp, "resp");
        List<User> likeList = resp.getLikeList();
        if (likeList != null) {
            for (User user : likeList) {
                MatchedFriendStruct matchedFriendStruct = user.getMatchedFriendStruct();
                if (matchedFriendStruct != null && (recType = matchedFriendStruct.getRecType()) != null) {
                    user.setRecType(recType);
                }
                BaseResponse.ServerTimeExtra serverTimeExtra = resp.extra;
                if (serverTimeExtra == null || (str = serverTimeExtra.logid) == null) {
                    str = "";
                }
                user.setRequestId(str);
            }
        }
        return resp;
    }

    @Override // X.InterfaceC15710jX
    public void onFinish(boolean z) {
        if (!z) {
            CL6.LIZIZ("match_in_progress");
        }
        C75622Tm6.LJIJI(EnumC76429Tz7.START_ANIMATION, z, null);
    }

    public static final C1A4 LJIILJJIL(int i, List list) {
        o.LJIIIZ(list, "<this>");
        int size = ((ArrayList) list).size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((C1A4) ListProtector.get(list, i2)).LJLIL == i) {
                return (C1A4) ListProtector.get(list, i2);
            }
        }
        return null;
    }

    public static final C29321Dc LJIILL(C29321Dc c29321Dc, InterfaceC88472Yns interfaceC88472Yns) {
        for (C29321Dc LJIJJLI = c29321Dc.LJIJJLI(); LJIJJLI != null; LJIJJLI = LJIJJLI.LJIJJLI()) {
            if (((Boolean) interfaceC88472Yns.invoke(LJIJJLI)).booleanValue()) {
                return LJIJJLI;
            }
        }
        return null;
    }

    public static final Object LJIIZILJ(InterfaceC71003Rtn interfaceC71003Rtn, String str) {
        o.LJIIIZ(interfaceC71003Rtn, "<this>");
        Object obj = C78948Uye.LJIILJJIL(interfaceC71003Rtn, "lib_track_builtin_lane_param_pass").get((Object) str);
        if (obj == null) {
            return null;
        }
        return obj;
    }

    public static final Object LJIJ(String preNodeId, String str) {
        o.LJIIIZ(preNodeId, "preNodeId");
        C68212m1 c68212m1 = TrackNodeStore.LIZ.get(preNodeId);
        if (c68212m1 != null) {
            return LJIIZILJ(c68212m1, str);
        }
        return null;
    }

    public static final void LJIJI(String nodeId, InterfaceC88472Yns interfaceC88472Yns) {
        o.LJIIIZ(nodeId, "nodeId");
        C68212m1 c68212m1 = TrackNodeStore.LIZ.get(nodeId);
        if (c68212m1 == null) {
            return;
        }
        C70576Rmu c70576Rmu = new C70576Rmu();
        C78915Uy7.LJJIZ(c70576Rmu, "lib_track_builtin_lane_param_pass", new AqS170S0100000_4(interfaceC88472Yns, (InterfaceC88472Yns<? super APY, C76800UCe>) 356));
        c68212m1.LJLILLLLZI.LIZJ(c70576Rmu);
    }

    public static final void LJIILLIIL(Region region, C07210Qb c07210Qb, java.util.Map map, C07210Qb c07210Qb2) {
        boolean z;
        C1DT c1dt;
        boolean z2;
        C10390ax c10390ax;
        C10390ax c10390ax2;
        C29321Dc c29321Dc;
        C29321Dc c29321Dc2 = c07210Qb2.LIZJ;
        if (!c29321Dc2.LJZI || !c29321Dc2.LJJIIZ()) {
            z = true;
        } else {
            z = false;
        }
        if (!region.isEmpty() || c07210Qb2.LJI == c07210Qb.LJI) {
            if (z && !c07210Qb2.LIZLLL) {
                return;
            }
            if (c07210Qb2.LJFF.LJLILLLLZI) {
                c1dt = C1E4.LJIILL(c07210Qb2.LIZJ);
                if (c1dt == null) {
                    c1dt = c07210Qb2.LIZ;
                }
            } else {
                c1dt = c07210Qb2.LIZ;
            }
            o.LJIIIZ(c1dt, "<this>");
            if (!c1dt.LJIIIIZZ().LJLJL) {
                c10390ax = C10390ax.LJ;
            } else {
                if (C0QZ.LIZ(c1dt.LJJJJ(), C0QY.LIZIZ) != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    c10390ax = C78977Uz7.LJJIIZI(C78840Uwu.LJJIIZI(c1dt, 8));
                } else {
                    AbstractC538029g LJJIIZI = C78840Uwu.LJJIIZI(c1dt, 8);
                    if (!LJJIIZI.LIZLLL()) {
                        c10390ax = C10390ax.LJ;
                    } else {
                        InterfaceC274415w LJJIL = C78977Uz7.LJJIL(LJJIIZI);
                        C10350at c10350at = LJJIIZI.LJZL;
                        if (c10350at == null) {
                            c10350at = new C10350at();
                            LJJIIZI.LJZL = c10350at;
                        }
                        long LJLLJ = LJJIIZI.LJLLJ(LJJIIZI.LL());
                        c10350at.LIZ = -C10430b1.LIZLLL(LJLLJ);
                        c10350at.LIZIZ = -C10430b1.LIZIZ(LJLLJ);
                        c10350at.LIZJ = C10430b1.LIZLLL(LJLLJ) + LJJIIZI.LJJZZIII();
                        c10350at.LIZLLL = C10430b1.LIZIZ(LJLLJ) + LJJIIZI.LJJZZI();
                        while (true) {
                            if (LJJIIZI != LJJIL) {
                                LJJIIZI.LLIIIZ(c10350at, false, true);
                                if (c10350at.LIZIZ()) {
                                    c10390ax = C10390ax.LJ;
                                    break;
                                } else {
                                    LJJIIZI = LJJIIZI.LJLJLLL;
                                    o.LJI(LJJIIZI);
                                }
                            } else {
                                c10390ax = new C10390ax(c10350at.LIZ, c10350at.LIZIZ, c10350at.LIZJ, c10350at.LIZLLL);
                                break;
                            }
                        }
                    }
                }
            }
            Rect LJJJJZ = C78939UyV.LJJJJZ(c10390ax);
            Region region2 = new Region();
            region2.set(LJJJJZ);
            int i = c07210Qb2.LJI;
            if (i == c07210Qb.LJI) {
                i = -1;
            }
            if (region2.op(region, region2, Region.Op.INTERSECT)) {
                Integer valueOf = Integer.valueOf(i);
                Rect bounds = region2.getBounds();
                o.LJIIIIZZ(bounds, "region.bounds");
                map.put(valueOf, new C05I(c07210Qb2, bounds));
                List LJ = c07210Qb2.LJ(false);
                for (int size = LJ.size() - 1; -1 < size; size--) {
                    LJIILLIIL(region, c07210Qb, map, (C07210Qb) ListProtector.get(LJ, size));
                }
                region.op(LJJJJZ, region, Region.Op.REVERSE_DIFFERENCE);
                return;
            }
            if (c07210Qb2.LIZLLL) {
                C07210Qb LJI = c07210Qb2.LJI();
                if (LJI != null && (c29321Dc = LJI.LIZJ) != null && c29321Dc.LJZI) {
                    c10390ax2 = LJI.LIZLLL();
                } else {
                    c10390ax2 = new C10390ax(0.0f, 0.0f, 10.0f, 10.0f);
                }
                map.put(Integer.valueOf(i), new C05I(c07210Qb2, C78939UyV.LJJJJZ(c10390ax2)));
                return;
            }
            if (i == -1) {
                Integer valueOf2 = Integer.valueOf(i);
                Rect bounds2 = region2.getBounds();
                o.LJIIIIZZ(bounds2, "region.bounds");
                map.put(valueOf2, new C05I(c07210Qb2, bounds2));
            }
        }
    }
}
