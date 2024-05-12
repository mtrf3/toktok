package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkmicLayoutTrackerEnableSetting;
import com.bytedance.android.livesdk.model.message.LinkerEnlargeStatusSynContent;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.Tbz, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C74995Tbz {
    public static final C75015TcJ LJII;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJIIIIZZ;
    public static final int LJIIIZ;
    public static final long LJIIJ;
    public static final String LJIIJJI;
    public static final String LJIIL;
    public static final int LJIILIIL;
    public static final String LJIILJJIL;
    public final DataChannel LIZ;
    public Layout LIZIZ;
    public String LIZJ;
    public int LJ;
    public final java.util.Map<String, Boolean> LIZLLL = new LinkedHashMap();
    public final C31657Cbd LJFF = new C31657Cbd("MULTI_GUEST_DATA_HOLDER");
    public final C62822Ol8 LJI = C221108m2.LIZIZ(C75012TcG.LJLIL);

    static {
        TBT tbt = new TBT(C74995Tbz.class, "multiGuestDataHolder", "getMultiGuestDataHolder()Lcom/bytedance/android/live/liveinteract/multiguestv3/main/common/MultiGuestDataHolder;", 0);
        C65352Pkq.LIZ.getClass();
        LJIIIIZZ = new InterfaceC74236TBo[]{tbt};
        LJII = new C75015TcJ();
        LJIIIZ = -1;
        LJIIJ = -1L;
        LJIIJJI = "";
        LJIIL = "zoomed_linkmic_id";
        LJIILIIL = 1;
        LJIILJJIL = "ZoomModel";
    }

    public void LIZJ() {
        this.LIZJ = null;
        this.LIZIZ = null;
        ((LinkedHashMap) this.LIZLLL).clear();
        ((C73318Sq2) this.LJI.getValue()).LIZLLL();
    }

    public final Layout LJ() {
        if (this.LIZIZ == null) {
            this.LIZIZ = LIZIZ();
        }
        return this.LIZIZ;
    }

    public boolean LJFF() {
        boolean z;
        String str = this.LIZJ;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    public static String LJII() {
        String str;
        InterfaceC31805Ce1 interfaceC31805Ce1;
        AbstractC74727TUl LIZ;
        List LJJI;
        Object obj;
        String str2;
        AbstractC74727TUl LIZ2;
        List LJJI2;
        String str3;
        long currentUserId = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
        int i = C75008TcC.LIZ[C74998Tc2.LIZIZ().ordinal()];
        Object obj2 = null;
        if (i != 1) {
            if (i == 2 || i == 3) {
                TQ8 LIZ3 = C74998Tc2.LIZ();
                if (LIZ3 != null && (LIZ2 = LIZ3.LIZ()) != null && (LJJI2 = LIZ2.LJJI()) != null) {
                    Iterator it = LJJI2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        User user = ((LinkListUser) next).user;
                        if (user != null && user.getId() == currentUserId) {
                            obj2 = next;
                            break;
                        }
                    }
                    LinkListUser linkListUser = (LinkListUser) obj2;
                    if (linkListUser != null && (str3 = linkListUser.linkMicId) != null) {
                        return str3;
                    }
                }
                LJII.getClass();
                str = LJIIJJI;
            } else {
                throw new C162476Zf();
            }
        } else {
            Object obj3 = C75559Tl5.LIZIZ.LIZJ().get("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
            if ((obj3 instanceof InterfaceC31805Ce1) && (interfaceC31805Ce1 = (InterfaceC31805Ce1) obj3) != null && (LIZ = interfaceC31805Ce1.LIZ()) != null && (LJJI = LIZ.LJJI()) != null) {
                Iterator it2 = LJJI.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj = it2.next();
                        User user2 = ((LinkPlayerInfo) obj).mUser;
                        if (user2 != null && user2.getId() == currentUserId) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                LinkPlayerInfo linkPlayerInfo = (LinkPlayerInfo) obj;
                if (linkPlayerInfo != null && (str2 = linkPlayerInfo.mInteractIdStr) != null) {
                    return str2;
                }
            }
            LJII.getClass();
            str = LJIIJJI;
        }
        if (str != null) {
            return str;
        }
        return "";
    }

    public final Layout LIZIZ() {
        String str;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings;
        EnumC74991Tbv LJJ;
        Layout x1;
        InterfaceC75579TlP LJJIIJZLJL = C77412UZs.LJJIIJZLJL();
        if (LJJIIJZLJL == null || (x1 = LJJIIJZLJL.x1()) == null) {
            InterfaceC75579TlP LJJIIJZLJL2 = C77412UZs.LJJIIJZLJL();
            if (LJJIIJZLJL2 != null) {
                MultiGuestDataHolder multiGuestDataHolder = (MultiGuestDataHolder) this.LJFF.LIZ(this, LJIIIIZZ[0]);
                if (multiGuestDataHolder == null || (multiLiveAnchorPanelSettings = multiGuestDataHolder.LJIIJ) == null || (LJJ = C86793Y4n.LJJ(multiLiveAnchorPanelSettings)) == null || (str = LJJ.getBusinessType()) == null) {
                    str = "";
                }
                return LJJIIJZLJL2.v1(str);
            }
            return null;
        }
        return x1;
    }

    public C74995Tbz(DataChannel dataChannel) {
        this.LIZ = dataChannel;
    }

    public boolean LJI(String linkMicId) {
        o.LJIIIZ(linkMicId, "linkMicId");
        return C74947TbD.LJIIZILJ(Long.valueOf(C74998Tc2.LIZJ(linkMicId)));
    }

    public void LJIIJ(LinkerEnlargeStatusSynContent linkerEnlargeStatusSynContent) {
        C28733BPl.LJIILIIL().LJIIIIZZ(LJIILJJIL, C113554cx.LJJLIIIIJ(new OSZ("action", "zoomFromLinkScreenChangeMessage"), new OSZ("linkerEnlargeStatusSynContent", linkerEnlargeStatusSynContent.toString())));
    }

    public final void LJIIJJI(String zoomLinkMicId) {
        boolean z;
        o.LJIIIZ(zoomLinkMicId, "zoomLinkMicId");
        if (zoomLinkMicId.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        String str = null;
        if (!z) {
            Layout LJ = LJ();
            if (LJ != null) {
                str = LJ.getLayoutId();
            }
            LJIILJJIL(this, zoomLinkMicId, LJ(), LJIIIZ(this, zoomLinkMicId), 0);
            InterfaceC75579TlP LJJIIJZLJL = C77412UZs.LJJIIJZLJL();
            if (LJJIIJZLJL != null) {
                ((U8H) LJJIIJZLJL).A1(str, true);
            }
            if (LinkmicLayoutTrackerEnableSetting.INSTANCE.enable()) {
                C74979Tbj.LIZ.LJI(true);
                return;
            }
            return;
        }
        Layout LJ2 = LJ();
        if (LJ2 != null) {
            str = LJ2.getLayoutId();
        }
        LJIILLIIL(this, 0);
        InterfaceC75579TlP LJJIIJZLJL2 = C77412UZs.LJJIIJZLJL();
        if (LJJIIJZLJL2 != null) {
            ((U8H) LJJIIJZLJL2).A1(str, true);
        }
        if (!LinkmicLayoutTrackerEnableSetting.INSTANCE.enable()) {
            return;
        }
        C74979Tbj.LIZ.LJI(false);
    }

    public final String LJIIL(String linkMicId) {
        Layout LJ;
        o.LJIIIZ(linkMicId, "linkMicId");
        Layout LJ2 = LJ();
        if ((LJ2 == null || LJ2.getZoomLayoutId() == null) && ((LJ = LJ()) == null || LJ.getAnchorZoomLayoutId() == null)) {
            Layout LJ3 = LJ();
            if (LJ3 == null) {
                return null;
            }
            return LJ3.getLayoutId();
        }
        if (LJFF()) {
            if (LJI(linkMicId)) {
                Layout LJ4 = LJ();
                if (LJ4 == null) {
                    return null;
                }
                return LJ4.getAnchorZoomLayoutId();
            }
            Layout LJ5 = LJ();
            if (LJ5 == null) {
                return null;
            }
            return LJ5.getZoomLayoutId();
        }
        if (LJI(linkMicId)) {
            Layout LJ6 = LJ();
            if (LJ6 == null) {
                return null;
            }
            return LJ6.getAnchorZoomLayoutId();
        }
        Layout LJ7 = LJ();
        if (LJ7 == null) {
            return null;
        }
        return LJ7.getZoomLayoutId();
    }

    public static /* synthetic */ int LJIIIZ(C74995Tbz c74995Tbz, String str) {
        return c74995Tbz.LJIIIIZZ(str, C77412UZs.LJJIIJZLJL());
    }

    public static void LJIILLIIL(C74995Tbz c74995Tbz, int i) {
        InterfaceC75579TlP LJJIIJZLJL = C77412UZs.LJJIIJZLJL();
        c74995Tbz.LJ = i;
        if (LJJIIJZLJL != null) {
            ((U8H) LJJIIJZLJL).s1(null, C113554cx.LJJJLIIL());
        }
        c74995Tbz.LIZJ = null;
        c74995Tbz.LIZIZ = null;
    }

    public final int LIZ(String linkMicId, boolean z) {
        o.LJIIIZ(linkMicId, "linkMicId");
        EnumC75006TcA LIZIZ = C74998Tc2.LIZIZ();
        if (LIZIZ == null) {
            LIZIZ = EnumC75006TcA.AUDIENCE;
        }
        int i = C75007TcB.LIZ[LIZIZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return 0;
                }
                throw new C162476Zf();
            }
            return 4;
        }
        if (z) {
            if (LJFF() && o.LJ(this.LIZJ, linkMicId)) {
                return 3;
            }
            if (LJI(linkMicId)) {
                return 1;
            }
            return 2;
        }
        return 5;
    }

    public int LJIIIIZZ(String linkMicId, InterfaceC75579TlP interfaceC75579TlP) {
        java.util.Map<String, OnLineMicInfo> LIZ;
        OnLineMicInfo onLineMicInfo;
        MicPositionInfo micPositionData;
        o.LJIIIZ(linkMicId, "linkMicId");
        InterfaceC75579TlP LJJIIJZLJL = C77412UZs.LJJIIJZLJL();
        if (LJJIIJZLJL != null && (LIZ = LJJIIJZLJL.LIZ()) != null && (onLineMicInfo = LIZ.get(linkMicId)) != null && (micPositionData = onLineMicInfo.getMicPositionData()) != null) {
            return micPositionData.getPosition();
        }
        return LJIIIZ;
    }

    public static java.util.Map LIZLLL(int i, String str, boolean z) {
        String str2;
        Long l;
        int i2;
        HashMap LIZ = C1R5.LIZ(str, "linkMicId");
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        Room room = (Room) dataChannelGlobal.mv0(C29044Baa.class);
        if (room == null || (str2 = Long.valueOf(room.getOwnerUserId()).toString()) == null) {
            str2 = "";
        }
        LIZ.put("anchor_id", str2);
        LIZ.put("guest_user_id", String.valueOf(C74998Tc2.LIZJ(str)));
        Room room2 = (Room) dataChannelGlobal.mv0(C29044Baa.class);
        if (room2 != null) {
            l = Long.valueOf(room2.getId());
        } else {
            l = null;
        }
        LIZ.put("room_id", String.valueOf(l));
        LIZ.put(WM7.SCENE_SERVICE, String.valueOf(i));
        LIZ.put("channel_id", C78886Uxe.LJJJLL(C8E.LJ()));
        if (z) {
            i2 = LJIILIIL;
        } else {
            i2 = 0;
        }
        LIZ.put("is_reject_enlarge_screen", String.valueOf(i2));
        LIZ.put("linkmic_id", str);
        return LIZ;
    }

    public final java.util.Map LJIILL(int i, String str, java.util.Map map) {
        int i2;
        int i3 = LJIIIZ;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (o.LJ(entry.getKey(), str)) {
                    MicPositionInfo micPositionData = ((OnLineMicInfo) entry.getValue()).getMicPositionData();
                    if (micPositionData != null) {
                        i3 = micPositionData.getPosition();
                    } else {
                        i3 = LJIIIZ;
                    }
                }
            }
        }
        if (i3 == LJIIIZ || i == 0) {
            return C113554cx.LJJJLIIL();
        }
        boolean LJI = LJI(str);
        int i4 = i - 1;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (i4 != 0) {
            int i5 = 0;
            if (LJI) {
                while (i5 < i) {
                    linkedHashMap.put(Integer.valueOf(i5), Integer.valueOf(i5));
                    i5++;
                }
            } else {
                while (i5 < i) {
                    if (i5 == i3) {
                        i2 = i4;
                    } else if (i5 < i3) {
                        i2 = i5;
                    } else {
                        i2 = i5 - 1;
                    }
                    linkedHashMap.put(Integer.valueOf(i5), Integer.valueOf(i2));
                    i5++;
                }
            }
        }
        return linkedHashMap;
    }

    public final void LJIILIIL(String linkMicId, Layout layout, int i, InterfaceC75579TlP interfaceC75579TlP) {
        o.LJIIIZ(linkMicId, "linkMicId");
        if (!LJFF() || LJ() == null) {
            this.LIZIZ = layout;
        }
        this.LIZJ = linkMicId;
        if (i != 0) {
            this.LJ = i;
        }
        int i2 = 0;
        if (this instanceof C74994Tby) {
            if (interfaceC75579TlP != null) {
                java.util.Map<String, OnLineMicInfo> LIZLLL = interfaceC75579TlP.LIZLLL();
                Layout LJ = LJ();
                if (LJ != null) {
                    i2 = LJ.getMicCount();
                }
                interfaceC75579TlP.s1(LJIIL(linkMicId), LJIILL(i2, linkMicId, LIZLLL));
                return;
            }
            return;
        }
        if (interfaceC75579TlP == null) {
            return;
        }
        java.util.Map<String, OnLineMicInfo> LIZ = interfaceC75579TlP.LIZ();
        Layout LJ2 = LJ();
        if (LJ2 != null) {
            i2 = LJ2.getMicCount();
        }
        interfaceC75579TlP.s1(LJIIL(linkMicId), LJIILL(i2, linkMicId, LIZ));
    }

    public static /* synthetic */ void LJIILJJIL(C74995Tbz c74995Tbz, String str, Layout layout, int i, int i2) {
        c74995Tbz.LJIILIIL(str, layout, i2, C77412UZs.LJJIIJZLJL());
    }
}
