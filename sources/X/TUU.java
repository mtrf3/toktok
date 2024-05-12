package X;

import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAnchorPanelTypeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestBusinessUserManagerUseDisposableMapSetting;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public abstract class TUU implements TRS, OnMessageListener, InterfaceC75402TiY {
    public static final ArrayList<Integer> LJLLJ = C47261Igj.LJII(19, 20, 21);
    public final Room LJLIL;
    public final long LJLILLLLZI;
    public final IMessageManager LJLJI;
    public final LifecycleOwner LJLJJI;
    public C73495Sst LJLJJL;
    public final ConcurrentHashMap<String, InterfaceC92693kP> LJLJJLL;
    public int LJLJL;
    public InterfaceC65784Pro<Integer> LJLJLJ;
    public final TR9 LJLJLLL;
    public final C62822Ol8 LJLL;
    public final C62822Ol8 LJLLI;
    public MultiGuestDataHolder LJLLILLLL;

    public abstract AbstractC74727TUl LJIIJ();

    public abstract void LJIILJJIL(List<LinkUser> list, List<LinkUser> list2, List<LinkUser> list3);

    public abstract void LJIILL(LinkMessage linkMessage);

    public abstract List<Integer> LJIIZILJ(String str);

    public static boolean LJIILLIIL() {
        if (MultiGuestAnchorPanelTypeSetting.INSTANCE.isTwoTabType() || ((TUT.LIZIZ() || TUT.LIZ()) && MultiGuestBusinessUserManagerUseDisposableMapSetting.INSTANCE.isOpt())) {
            return true;
        }
        return false;
    }

    public final List<TUI> LJIIJJI() {
        return (List) this.LJLLI.getValue();
    }

    @Override // X.TRS
    public void init() {
        IMessageManager iMessageManager = this.LJLJI;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(EnumC31509CYf.LINK_MESSAGE.getIntType(), this);
        }
        C8E.LJ().e3(this.LJLJLLL);
    }

    @Override // X.TRS
    public void release() {
        C73495Sst c73495Sst = this.LJLJJL;
        if (c73495Sst != null) {
            c73495Sst.dispose();
        }
        Iterator<Map.Entry<String, InterfaceC92693kP>> it = this.LJLJJLL.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().dispose();
        }
        this.LJLJJLL.clear();
        IMessageManager iMessageManager = this.LJLJI;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(EnumC31509CYf.LINK_MESSAGE.getIntType(), this);
        }
        C8E.LJ().X3(this.LJLJLLL);
        LJIIJJI().clear();
        ((HashMap) this.LJLL.getValue()).clear();
        LJIIJ().LJJIIJZLJL();
        C74838TYs.LJ().LJJ = 0;
        MultiGuestDataHolder multiGuestDataHolder = this.LJLLILLLL;
        if (multiGuestDataHolder != null) {
            multiGuestDataHolder.LJIJ(0);
        }
        this.LJLLILLLL = null;
        ((java.util.Map) C58578Mys.LIZIZ.getValue()).clear();
        C58578Mys.LIZ = "";
    }

    @Override // X.TRS
    public final String LIZIZ(long j) {
        return (String) ((HashMap) this.LJLL.getValue()).get(Long.valueOf(j));
    }

    @Override // X.TRS
    public final void LIZJ(AqS163S0100000_13 aqS163S0100000_13) {
        this.LJLJLJ = aqS163S0100000_13;
    }

    @Override // X.TRS
    public final void LIZLLL(TUI listener) {
        o.LJIIIZ(listener, "listener");
        LJIIJJI().remove(listener);
    }

    @Override // X.TRS
    public final void LJ(TUI listener) {
        o.LJIIIZ(listener, "listener");
        LJIIJJI().add(listener);
    }

    @Override // X.TRS
    public final void LJI(MultiGuestDataHolder dataHolder) {
        o.LJIIIZ(dataHolder, "dataHolder");
        this.LJLLILLLL = dataHolder;
    }

    @Override // X.TRS
    public final void LJII(int i) {
        this.LJLJL = i;
    }

    public void LJIIL(Throwable t) {
        o.LJIIIZ(t, "t");
        Iterator<TUI> it = LJIIJJI().iterator();
        while (it.hasNext()) {
            it.next().LJJIJL(t);
        }
    }

    public final void LJIJ(int i) {
        Iterator<TUI> it = LJIIJJI().iterator();
        while (it.hasNext()) {
            it.next().LLILII(LJIIJ(), i);
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        LinkMessage linkMessage;
        if ((iMessage instanceof LinkMessage) && (linkMessage = (LinkMessage) iMessage) != null && LJLLJ.contains(Integer.valueOf(linkMessage.messageType)) && linkMessage.LIZJ() == EnumC74706TTq.AUDIENCE_LINKMIC) {
            LJIILL(linkMessage);
        }
    }

    @Override // X.TRS
    public final void LJIIIZ(long j, String str) {
        if (j == 0) {
            return;
        }
        ((HashMap) this.LJLL.getValue()).put(Long.valueOf(j), str);
    }

    public void LJIILIIL(MultiLiveGuestInfoList multiLiveGuestInfoList, String source) {
        boolean z;
        Integer num;
        long j;
        Long l;
        int i;
        MultiGuestDataHolder multiGuestDataHolder;
        o.LJIIIZ(source, "source");
        if (!TextUtils.isEmpty(multiLiveGuestInfoList.fanTicketIconUrl) && (multiGuestDataHolder = this.LJLLILLLL) != null) {
            multiGuestDataHolder.LJJIL = multiLiveGuestInfoList.fanTicketIconUrl;
        }
        ArrayList arrayList = new ArrayList();
        for (LinkPlayerInfo linkPlayerInfo : LJIIJ().LJIJI()) {
            long id = linkPlayerInfo.mUser.getId();
            String str = linkPlayerInfo.mInteractIdStr;
            o.LJIIIIZZ(str, "it.interactId");
            arrayList.add(new TU0(id, str, linkPlayerInfo.LIZ));
        }
        if (!TextUtils.isEmpty(source)) {
            JSONObject LIZLLL = FT5.LIZLLL("source", source);
            C05630Jz.LJI(LIZLLL, "user_list", arrayList.toString());
            C74736TUu.LIZ.LJIL(0, "refresh_user_list", LIZLLL, true);
            C74736TUu.LJIJJ(LJIIJ().LJIJI());
            ((HashSet) C74838TYs.LJ().LJIL).clear();
            C74838TYs LJ = C74838TYs.LJ();
            if (C76917UGr.LJJIII(LJIIJ()) > 0) {
                z = true;
            } else {
                z = false;
            }
            LJ.LJIIIIZZ(z);
            C74838TYs LJ2 = C74838TYs.LJ();
            int LJJIII = C76917UGr.LJJIII(LJIIJ());
            LJ2.getClass();
            int max = Math.max(LJJIII, 0);
            TUX tux = LJ2.LJFF;
            if (tux != null) {
                if (tux.LIZ != 0 && max == 0) {
                    tux.LIZIZ.LJLJLJ.LJJJJZ();
                }
                tux.LIZ = max;
            }
            TUW tuw = LJ2.LJII;
            if (tuw != null && (i = tuw.LIZ) != max) {
                if (i == 0) {
                    if (max > 0) {
                        tuw.LIZIZ.LL();
                    }
                } else if (i > 0 && max == 0) {
                    tuw.LIZIZ.LJZ();
                }
                tuw.LIZ = max;
            }
            LJ2.LJJ = max;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("afterFetch linkedGuestNum:");
            LIZ.append(C76917UGr.LJJIII(LJIIJ()));
            LIZ.append(" dataHolder:");
            MultiGuestDataHolder multiGuestDataHolder2 = this.LJLLILLLL;
            if (multiGuestDataHolder2 != null) {
                num = Integer.valueOf(multiGuestDataHolder2.hashCode());
            } else {
                num = null;
            }
            QZY.LIZJ(LIZ, num, LIZ, "voice_chat");
            MultiGuestDataHolder multiGuestDataHolder3 = this.LJLLILLLL;
            if (multiGuestDataHolder3 != null) {
                multiGuestDataHolder3.LJIJ(C76917UGr.LJJIII(LJIIJ()));
            }
            if (this.LJLLILLLL != null) {
                C76917UGr.LJJIII(LJIIJ());
            }
            for (LinkPlayerInfo linkPlayerInfo2 : LJIIJ().LJIJI()) {
                TYR tyr = TS8.LIZ;
                User user = linkPlayerInfo2.mUser;
                if (user != null) {
                    j = user.getId();
                } else {
                    j = 0;
                }
                tyr.LJ(j, linkPlayerInfo2.mInteractIdStr);
                int i2 = linkPlayerInfo2.LIZ;
                if (i2 == 2 || (i2 == 1 && linkPlayerInfo2.mRoleType == 4)) {
                    java.util.Set<Long> set = C74838TYs.LJ().LJIL;
                    User user2 = linkPlayerInfo2.mUser;
                    if (user2 != null) {
                        l = Long.valueOf(user2.getId());
                    } else {
                        l = null;
                    }
                    ((HashSet) set).add(l);
                }
                if (linkPlayerInfo2.mRoleType == 1) {
                    C74838TYs.LJ().LJIILIIL = linkPlayerInfo2.mInteractIdStr;
                }
            }
            if (TextUtils.equals(source, "message_linked_list_change") || TextUtils.equals(source, "fetch_on_moderator_by_message") || TextUtils.equals(source, "reserve_message")) {
                LJIJ(4);
                return;
            } else {
                LJIJ(1);
                return;
            }
        }
        "Failed requirement.".toString();
        throw new IllegalArgumentException("Failed requirement.");
    }

    public TUU(Room room, long j, IMessageManager iMessageManager, LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(room, "room");
        this.LJLIL = room;
        this.LJLILLLLZI = j;
        this.LJLJI = iMessageManager;
        this.LJLJJI = lifecycleOwner;
        this.LJLJJLL = new ConcurrentHashMap<>();
        this.LJLJLLL = new TR9(this);
        this.LJLL = C221108m2.LIZIZ(TRC.LJLIL);
        this.LJLLI = C221108m2.LIZIZ(TUG.LJLIL);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bb  */
    @Override // X.TRS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(java.lang.String r24, int r25, X.InterfaceC88472Yns<? super X.TZX<com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo, com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList>, X.C76800UCe> r26, X.InterfaceC88472Yns<? super X.TZX<com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo, com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList>, X.C76800UCe> r27) {
        /*
            r23 = this;
            r0 = r23
            long r4 = r0.LJLILLLLZI
            r2 = -1
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 != 0) goto Lb
            return
        Lb:
            r1 = r24
            java.util.List r2 = r0.LJIIZILJ(r1)
            java.lang.String r11 = r2.toString()
            boolean r2 = LJIILLIIL()
            if (r2 == 0) goto L35
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.3kP> r2 = r0.LJLJJLL
            boolean r2 = r2.containsKey(r11)
            if (r2 == 0) goto L35
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.3kP> r2 = r0.LJLJJLL
            java.lang.Object r2 = r2.get(r11)
            X.3kP r2 = (X.InterfaceC92693kP) r2
            if (r2 == 0) goto L30
            r2.dispose()
        L30:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.3kP> r2 = r0.LJLJJLL
            r2.remove(r11)
        L35:
            boolean r2 = LJIILLIIL()
            if (r2 != 0) goto L47
            com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAnchorPanelTypeSetting r2 = com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAnchorPanelTypeSetting.INSTANCE
            boolean r2 = r2.isTwoTabType()
            if (r2 != 0) goto Lba
            X.Sst r2 = r0.LJLJJL
            if (r2 != 0) goto Lba
        L47:
            long r16 = X.C31012CFc.LIZIZ()
            boolean r2 = X.TUZ.LIZ()
            if (r2 == 0) goto L5f
            com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder r2 = r0.LJLLILLLL     // Catch: java.lang.Exception -> L5f
            if (r2 == 0) goto L5f
            com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings r2 = r2.LJIIJ     // Catch: java.lang.Exception -> L5f
            if (r2 == 0) goto L5f
            long r2 = r2.applierSortGiftScoreThreshold     // Catch: java.lang.Exception -> L5f
            int r15 = (int) r2     // Catch: java.lang.Exception -> L5f
            if (r15 <= 0) goto L5f
            goto L60
        L5f:
            r15 = 0
        L60:
            java.lang.Class<com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiLiveApi> r2 = com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiLiveApi.class
            java.lang.Object r4 = X.Q7L.LIZIZ(r2)
            com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiLiveApi r4 = (com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiLiveApi) r4
            com.bytedance.android.livesdkapi.depend.model.live.Room r2 = r0.LJLIL
            long r5 = r2.getId()
            com.bytedance.android.livesdkapi.depend.model.live.Room r2 = r0.LJLIL
            long r7 = r2.getOwnerUserId()
            long r9 = r0.LJLILLLLZI
            r12 = 0
            int r3 = r0.LJLJL
            r2 = 1
            if (r3 != r2) goto Lbb
            r13 = 1
        L7d:
            r14 = r25
            X.SvC r2 = r4.getListByType(r5, r7, r9, r11, r12, r13, r14, r15)
            X.SvC r4 = X.T28.LIZLLL(r2)
            Y.IDaS8S1100000_13 r3 = new Y.IDaS8S1100000_13
            r2 = 9
            r3.<init>(r0, r11, r2)
            X.Sse r2 = r4.LJIIIZ(r3)
            X.TUV r15 = new X.TUV
            r22 = r27
            r20 = r26
            r18 = r0
            r19 = r11
            r21 = r1
            r15.<init>(r16, r18, r19, r20, r21, r22)
            Y.AfS5S1100100_13 r1 = new Y.AfS5S1100100_13
            r8 = 5
            r3 = r1
            r4 = r16
            r6 = r11
            r7 = r0
            r3.<init>(r4, r6, r7, r8)
            X.3kP r2 = r2.LJJII(r15, r1)
            r1 = r2
            X.Sst r1 = (X.C73495Sst) r1
            r0.LJLJJL = r1
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.3kP> r0 = r0.LJLJJLL
            r0.put(r11, r2)
        Lba:
            return
        Lbb:
            r13 = 0
            goto L7d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TUU.LJFF(java.lang.String, int, X.Yns, X.Yns):void");
    }
}
