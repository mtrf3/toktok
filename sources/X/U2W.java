package X;

import Y.ACListenerS33S0100000_13;
import Y.IDComparatorS343S0100000_13;
import android.content.Context;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;
import webcast.data.multi_guest_play.ShowListUser;

/* loaded from: classes14.dex */
public final class U2W extends U2N {
    public static final /* synthetic */ int LL = 0;
    public final InterfaceC76536U2a LJLL;
    public List<? extends LinkPlayerInfo> LJLLI;
    public final C75271TgR LJLLILLLL;
    public Long LJLLJ;
    public final Boolean LJLLL;
    public final DataChannel LJLLLL;
    public C2A7 LJLLLLLL;
    public final HashMap<String, Integer> LJLZ;
    public boolean LJZ;
    public InterfaceC65784Pro<C76800UCe> LJZI;
    public final C1C8 LJZL;

    @Override // X.U2N
    public final void LJJIIZ() {
        this.LJLJLLL.LJLZ(C76553U2r.class, new U2S(new U2Z(this), this.LJLLLL));
        this.LJLJLLL.LJLZ(C74900TaS.class, new C75140TeK(null));
        this.LJLJLLL.LJLZ(C53606L2c.class, new U2Y(new AqS163S0100000_13(this, 552)));
    }

    @Override // X.U2N, X.U2M
    public final void LJJIIJZLJL() {
        int i;
        Integer valueOf;
        super.LJJIIJZLJL();
        this.LJLLLLLL = (C2A7) findViewById(R.id.jzv);
        this.LJZL.LJII(this.LJLJL);
        LiveIconView liveIconView = this.LJLJJL;
        if (liveIconView != null) {
            C16880lQ.LJJII(liveIconView, new ACListenerS33S0100000_13(this, 182));
        }
        LiveIconView liveIconView2 = this.LJLJJLL;
        if (liveIconView2 != null) {
            C16880lQ.LJJII(liveIconView2, new ACListenerS33S0100000_13(this, 183));
        }
        U35 LIZ = TQA.LIZ();
        if (LIZ != null) {
            i = LIZ.LJII();
        } else {
            i = 0;
        }
        LJJIJ(i);
        U35 LIZ2 = TQA.LIZ();
        if (LIZ2 == null || (valueOf = Integer.valueOf(LIZ2.LJII())) == null) {
            return;
        }
        if (valueOf.intValue() == 0) {
            LJJIJIIJI(this.LJLLI, false, false);
        } else {
            if (valueOf == null) {
                return;
            }
            if (valueOf.intValue() != 1 && valueOf.intValue() != 2) {
                return;
            }
            LJJIJIL(this.LJLLILLLL);
        }
    }

    public static final int LJJIIZI(String str) {
        InterfaceC76652U6m LJZL;
        OnLineMicInfo LJII;
        MicPositionInfo micPositionData;
        InterfaceC76652U6m LJZL2;
        OnLineMicInfo LIZIZ;
        MicPositionInfo micPositionData2;
        EnumC74778TWk LIZJ = C59994Ngc.LIZJ();
        if (LIZJ == EnumC74778TWk.FLOATING_FIX || LIZJ == EnumC74778TWk.GRID_FIX) {
            InterfaceC75441TjB R6 = C8E.LJ().R6();
            if (R6 != null && (LJZL = R6.LJZL()) != null && (LJII = LJZL.LJII(str)) != null && (micPositionData = LJII.getMicPositionData()) != null) {
                return micPositionData.getPosition();
            }
        } else {
            InterfaceC75441TjB R62 = C8E.LJ().R6();
            if (R62 != null && (LJZL2 = R62.LJZL()) != null && (LIZIZ = LJZL2.LIZIZ(str)) != null && (micPositionData2 = LIZIZ.getMicPositionData()) != null) {
                return micPositionData2.getPosition();
            }
        }
        return -1;
    }

    public final void LJJIJ(int i) {
        C2A7 c2a7;
        if (i != 0) {
            if (i != 1 && i != 2) {
                if (i != 3 || (c2a7 = this.LJLLLLLL) == null) {
                    return;
                }
                c2a7.setText(C15380j0.LJIILJJIL(R.string.nd_));
                c2a7.LJJLL(R.style.a3b);
                C16880lQ.LJJIII(c2a7, ViewOnClickListenerC76537U2b.LJLIL);
                return;
            }
            C2A7 c2a72 = this.LJLLLLLL;
            if (c2a72 == null) {
                return;
            }
            c2a72.setText(C15380j0.LJIILJJIL(R.string.nd_));
            c2a72.LJJLL(R.style.a3b);
            C16880lQ.LJJIII(c2a72, new ACListenerS33S0100000_13(this, 184));
            return;
        }
        C2A7 c2a73 = this.LJLLLLLL;
        if (c2a73 == null) {
            return;
        }
        c2a73.setText(C15380j0.LJIILJJIL(R.string.ndd));
        c2a73.LJJLL(R.style.a32);
        C29306Beo.LJJJLL(c2a73, 500L, new AqS179S0100000_13(this, 584));
    }

    public final void LJJIJIL(C75271TgR c75271TgR) {
        boolean z;
        C0NB.LIZIZ("LiveShowAnchorListDialog", "updateUserListWhenInShow");
        if (c75271TgR == null) {
            return;
        }
        C73129Smz c73129Smz = this.LJLJLLL;
        CJ2 cj2 = new CJ2();
        if (!InterfaceC30442Bx8.e0.LIZJ().booleanValue()) {
            cj2.add(new C53606L2c(0));
        }
        ShowListUser showListUser = c75271TgR.LIZ;
        if (showListUser != null) {
            cj2.add(new C76553U2r(showListUser, true, -1));
            this.LJLZ.put(showListUser.linkmicIdStr, Integer.valueOf(showListUser.order));
        }
        List<ShowListUser> list = c75271TgR.LIZIZ;
        if (list != null) {
            for (ShowListUser showListUser2 : list) {
                cj2.add(new C76553U2r(showListUser2, true, -1));
                this.LJLZ.put(showListUser2.linkmicIdStr, Integer.valueOf(showListUser2.order));
            }
        }
        List<ShowListUser> list2 = c75271TgR.LIZJ;
        if (list2 != null) {
            if (!list2.isEmpty()) {
                String LJIILJJIL = C15380j0.LJIILJJIL(R.string.ndb);
                o.LJIIIIZZ(LJIILJJIL, "getString(R.string.pm_mu…showPanel_finished_title)");
                cj2.add(new C74900TaS(LJIILJJIL, 6));
            }
            for (ShowListUser showListUser3 : list2) {
                List<? extends LinkPlayerInfo> list3 = this.LJLLI;
                if (list3 != null) {
                    Iterator<? extends LinkPlayerInfo> it = list3.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        LinkPlayerInfo next = it.next();
                        if (o.LJ(next.mInteractIdStr, showListUser3.linkmicIdStr)) {
                            if (next != null) {
                                z = true;
                            }
                        }
                    }
                }
                z = false;
                cj2.add(new C76553U2r(showListUser3, z, -1));
                this.LJLZ.put(showListUser3.linkmicIdStr, Integer.valueOf(showListUser3.order));
            }
        }
        c73129Smz.LJZ(cj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJIJIIJIL(List<? extends LinkPlayerInfo> list, boolean z) {
        C0NB.LIZIZ("LiveShowAnchorListDialog", "updateUserListWhenInIdleForUpdate");
        if (list == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, Integer> entry : this.LJLZ.entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue());
        }
        Iterator<? extends LinkPlayerInfo> it = list.iterator();
        while (it.hasNext()) {
            String str = it.next().mInteractIdStr;
            if (hashMap.get(str) != null) {
                hashMap.remove(str);
            } else {
                arrayList.add(str);
            }
        }
        if (!hashMap.isEmpty()) {
            for (Map.Entry entry2 : hashMap.entrySet()) {
                this.LJLZ.remove(entry2.getKey());
                for (Map.Entry<String, Integer> entry3 : this.LJLZ.entrySet()) {
                    if (entry3.getValue().intValue() > ((Number) entry2.getValue()).intValue()) {
                        this.LJLZ.put(entry3.getKey(), Integer.valueOf(entry3.getValue().intValue() - 1));
                    }
                }
            }
        }
        if (!arrayList.isEmpty()) {
            int size = this.LJLZ.size();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                size++;
                this.LJLZ.put(it2.next(), Integer.valueOf(size));
            }
        }
        LJJIJIIJI(list, true, z);
    }

    public final void LJJIJIIJI(List<? extends LinkPlayerInfo> list, boolean z, boolean z2) {
        int intValue;
        C0NB.LIZIZ("LiveShowAnchorListDialog", "updateUserListWhenInIdle");
        if (list == null) {
            return;
        }
        C73129Smz c73129Smz = this.LJLJLLL;
        CJ2 cj2 = new CJ2();
        if (!InterfaceC30442Bx8.e0.LIZJ().booleanValue()) {
            cj2.add(new C53606L2c(0));
        }
        if (!z) {
            int i = 0;
            for (LinkPlayerInfo linkPlayerInfo : ORZ.LLILII(new IDComparatorS343S0100000_13(this, 2), list)) {
                HashMap<String, Integer> hashMap = this.LJLZ;
                String str = linkPlayerInfo.mInteractIdStr;
                o.LJIIIIZZ(str, "it.interactId");
                i++;
                hashMap.put(str, Integer.valueOf(i));
            }
        }
        for (LinkPlayerInfo linkPlayerInfo2 : ORZ.LLILII(new IDComparatorS343S0100000_13(this, 1), list)) {
            ShowListUser showListUser = new ShowListUser();
            showListUser.userId = linkPlayerInfo2.mUser.getId();
            showListUser.status = 0;
            Integer num = this.LJLZ.get(linkPlayerInfo2.mInteractIdStr);
            if (num == null) {
                String str2 = linkPlayerInfo2.mInteractIdStr;
                o.LJIIIIZZ(str2, "linkedGuest.interactId");
                intValue = LJJIIZI(str2);
            } else {
                intValue = num.intValue();
            }
            showListUser.order = intValue;
            String LIZ = C05170If.LIZ(linkPlayerInfo2.mUser);
            o.LJIIIIZZ(LIZ, "getDisplayName(linkedGuest.user)");
            showListUser.nickname = LIZ;
            showListUser.avatarThumb = linkPlayerInfo2.mUser.getAvatarThumb();
            String str3 = linkPlayerInfo2.mInteractIdStr;
            o.LJIIIIZZ(str3, "linkedGuest.interactId");
            showListUser.linkmicIdStr = str3;
            cj2.add(new C76553U2r(showListUser, true, linkPlayerInfo2.appVersion));
        }
        c73129Smz.LJZ(cj2);
        if (z2) {
            this.LJLJLLL.notifyDataSetChanged();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U2W(Context context, U37 listener, List list, C75271TgR c75271TgR, Long l, Boolean bool, DataChannel dataChannel) {
        super(context, 1);
        o.LJIIIZ(listener, "listener");
        this.LJLL = listener;
        this.LJLLI = list;
        this.LJLLILLLL = c75271TgR;
        this.LJLLJ = l;
        this.LJLLL = bool;
        this.LJLLLL = dataChannel;
        this.LJLZ = new HashMap<>();
        this.LJZL = new C1C8(new U2X(this));
    }
}
