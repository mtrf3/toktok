package X;

import android.content.Context;
import android.os.Handler;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.PrivilegeLogExtra;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveBadgeCodeOptSetting;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.CWu */
/* loaded from: classes6.dex */
public final class C31472CWu {
    public final Handler LIZ;
    public C31647CbT LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final List<AbstractC31462CWk<? extends AbstractC31467CWp>> LJ;
    public final List<AbstractC31476CWy<? extends AbstractC31467CWp>> LJFF;
    public final ArrayList<CX2> LJI;
    public int LJII;
    public AbstractC65781Prl LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public final boolean LJIIJJI;

    public C31472CWu() {
        this(false, 15);
    }

    public static boolean LJ(int i) {
        return i == 1 || i == 0 || i == 3 || i == 4 || i == 6 || i == 7 || i == 8;
    }

    public final void LIZJ() {
        ((ArrayList) this.LJ).clear();
        if (this.LJIIJJI) {
            Iterator<CX2> it = this.LJI.iterator();
            while (it.hasNext()) {
                CX2 next = it.next();
                if (next != null) {
                    next.LJLIL = true;
                }
            }
        }
        Iterator it2 = ((ArrayList) this.LJFF).iterator();
        while (it2.hasNext()) {
            AbstractC31476CWy abstractC31476CWy = (AbstractC31476CWy) it2.next();
            if (abstractC31476CWy != null) {
                abstractC31476CWy.LJ();
            }
        }
        ((ArrayList) this.LJFF).clear();
        Handler handler = this.LIZ;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.LJIIIIZZ = null;
    }

    public final void LJI() {
        Iterator<CX2> it = this.LJI.iterator();
        while (it.hasNext()) {
            CX2 next = it.next();
            if (next != null) {
                next.LJLIL = true;
            }
        }
        if (!this.LJ.isEmpty()) {
            ((ArrayList) this.LJ).clear();
        }
        if (!this.LJFF.isEmpty()) {
            for (AbstractC31476CWy<? extends AbstractC31467CWp> abstractC31476CWy : this.LJFF) {
                if (abstractC31476CWy != null) {
                    abstractC31476CWy.LJ();
                }
            }
            ((ArrayList) this.LJFF).clear();
        }
        this.LJIIIZ = 0;
        this.LJII = 10;
        this.LJIIJ = 3;
    }

    public final void LJIIIIZZ() {
        for (AbstractC31476CWy<? extends AbstractC31467CWp> abstractC31476CWy : this.LJFF) {
            if (abstractC31476CWy != null) {
                abstractC31476CWy.LJFF();
            }
        }
    }

    public static boolean LJII(BadgeStruct badgeStruct) {
        if (badgeStruct == null) {
            return false;
        }
        if (badgeStruct.badgeScene != 8 && badgeStruct.badgeScene != 10) {
            return false;
        }
        return true;
    }

    public final boolean LIZIZ(int i) {
        if (i == 0 || i == 4) {
            return true;
        }
        if (i == 1 || i == 3) {
            int i2 = this.LJIIIZ;
            this.LJIIIZ = i2 + 1;
            if (i2 < this.LJIIJ) {
                return true;
            }
        } else if (i == 6 || i == 7 || i == 8) {
            return true;
        }
        return false;
    }

    public /* synthetic */ C31472CWu(boolean z, int i) {
        this(null, null, false, (i & 8) != 0 ? false : z);
    }

    public static boolean LIZLLL(boolean z, BadgeStruct badgeStruct) {
        if (C78609UtB.LJJJZ(z) || badgeStruct == null || (badgeStruct.badgeScene != 4 && badgeStruct.badgeScene != 7)) {
            return true;
        }
        return false;
    }

    public static void LJFF(int i, BadgeStruct badgeStruct, User user) {
        String str;
        Object obj;
        if (!LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_privilege_show", LiveLogMonitorSampleSetting.getSAMPLE_0())) {
            return;
        }
        boolean z = true;
        if (i != 0) {
            if (i != 1) {
                if (i != 4) {
                    str = "";
                } else {
                    str = "active_user_rank";
                }
            } else {
                str = "comment_area";
            }
        } else {
            str = "profile_card";
        }
        if (!o.LJ(str, "") && badgeStruct.logExtra != null) {
            if (user.getLiveRoomId() == 0) {
                z = false;
            }
            PrivilegeLogExtra privilegeLogExtra = badgeStruct.logExtra;
            if (privilegeLogExtra != null) {
                BZI LIZ = C28787BRn.LIZ("livesdk_privilege_show");
                String str2 = "anchor";
                if (C29306Beo.LJIIJJI(DataChannelGlobal.LJLJJI)) {
                    obj = "anchor";
                } else {
                    obj = "user";
                }
                LIZ.LJIJJ(obj, "user_type");
                if (!z) {
                    str2 = "user";
                }
                LIZ.LJIJJ(str2, "to_user_type");
                LIZ.LJIJJ(str, "privilege_scenario");
                LIZ.LJIJJ("badge", "privilege_type");
                LIZ.LJIJJ(Long.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()), "user_id");
                LIZ.LJIJJ(Long.valueOf(user.getId()), "to_user_id");
                LIZ.LJIJJ(privilegeLogExtra.privilege_id, "privilege_id");
                LIZ.LJIJJ(privilegeLogExtra.privilege_order_id, "privilege_order_id");
                LIZ.LJIJJ(privilegeLogExtra.privilege_version, "privilege_version_id");
                LIZ.LJIJJ(privilegeLogExtra.data_version, "data_version_id");
                LIZ.LJIJJ(Integer.valueOf(BM1.LIZJ), "online_user");
                if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ.LJIILL())) {
                    LIZ.LJIIZILJ();
                    LIZ.LJJIIJZLJL();
                    return;
                }
                LIZ.LJJIJ();
                LIZ.LJI();
                BJM bjm = BJM.LJLIL;
                LIZ.LJIJJ(BJM.LIZLLL(), "action_type");
                LIZ.LJIJJ(bjm.LIZJ(), "live_type");
                LIZ.LJJIIZI();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [X.Yns, X.Prl] */
    public final void LIZ(AbstractC31462CWk<? extends AbstractC31467CWp> abstractC31462CWk, boolean z, boolean z2) {
        if (z) {
            ((ArrayList) this.LJ).clear();
        }
        if (abstractC31462CWk != null && !((ArrayList) this.LJ).contains(abstractC31462CWk)) {
            ArrayList arrayList = (ArrayList) this.LJ;
            arrayList.add(abstractC31462CWk);
            C40675Fxn.LJJLIIIJ(arrayList, CX1.LJLIL);
            ?? r1 = this.LJIIIIZZ;
            if (r1 != 0) {
                r1.invoke(Boolean.valueOf(z2));
            }
        }
    }

    public C31472CWu(Handler handler, C31647CbT c31647CbT, boolean z, boolean z2) {
        this.LIZ = handler;
        this.LIZIZ = c31647CbT;
        this.LIZJ = z;
        this.LIZLLL = z2;
        if (handler == null) {
            this.LIZ = new Handler(C16880lQ.LLJJJJ());
        }
        this.LJ = new ArrayList();
        this.LJFF = new ArrayList();
        this.LJI = new ArrayList<>();
        this.LJII = 10;
        this.LJIIJ = 3;
        this.LJIIJJI = LiveBadgeCodeOptSetting.INSTANCE.useOpt();
    }

    public final void LJIILIIL(AbstractC31476CWy<? extends AbstractC31467CWp> abstractC31476CWy, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, boolean z, boolean z2) {
        ((ArrayList) this.LJFF).remove(abstractC31476CWy);
        LIZ(abstractC31476CWy, z, z2);
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public static /* synthetic */ void LJIIL(C31472CWu c31472CWu, boolean z, Context context, List list, InterfaceC88472Yns interfaceC88472Yns, int i, User user) {
        c31472CWu.LJIIJ(z, context, list, null, interfaceC88472Yns, i, user, null, false);
    }

    public static /* synthetic */ void LJIIJJI(C31472CWu c31472CWu, boolean z, Context context, BadgeStruct badgeStruct, InterfaceC88472Yns interfaceC88472Yns, int i, User user, boolean z2) {
        c31472CWu.LJIIIZ(z, context, badgeStruct, null, interfaceC88472Yns, i, user, z2, null, false);
    }

    public final void LJIIJ(boolean z, Context context, List<BadgeStruct> list, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC88472Yns<? super BadgeStruct, C76800UCe> interfaceC88472Yns, int i, User user, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2, boolean z2) {
        boolean z3;
        if (list == null || list.isEmpty() || context == null) {
            ((ArrayList) this.LJ).clear();
            ((ArrayList) this.LJFF).clear();
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (LJ(i)) {
            ArrayList arrayList2 = new ArrayList();
            for (BadgeStruct badgeStruct : list) {
                BadgeStruct badgeStruct2 = badgeStruct;
                if (badgeStruct2 != null && badgeStruct2.combineBadgeStruct != null && LIZLLL(z, badgeStruct2)) {
                    arrayList2.add(badgeStruct);
                }
            }
            arrayList.addAll(arrayList2);
        } else {
            ArrayList arrayList3 = new ArrayList();
            for (BadgeStruct badgeStruct3 : list) {
                if (LIZLLL(z, badgeStruct3)) {
                    arrayList3.add(badgeStruct3);
                }
            }
            arrayList.addAll(arrayList3);
        }
        ORS.LJJLIL(new AqS171S0100000_5(this, 529), arrayList);
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    BadgeStruct badgeStruct4 = (BadgeStruct) next;
                    if (z2) {
                        this.LJIIIZ = 0;
                    }
                    if (i2 == 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    LJIIIZ(z, context, badgeStruct4, interfaceC65784Pro, interfaceC88472Yns, i, user, z3, interfaceC65784Pro2, z2);
                    i2 = i3;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if (r34 != null) goto L94;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(boolean r28, android.content.Context r29, com.bytedance.android.live.base.model.user.BadgeStruct r30, X.InterfaceC65784Pro<X.C76800UCe> r31, X.InterfaceC88472Yns<? super com.bytedance.android.live.base.model.user.BadgeStruct, X.C76800UCe> r32, int r33, com.bytedance.android.live.base.model.user.User r34, boolean r35, X.InterfaceC65784Pro<X.C76800UCe> r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31472CWu.LJIIIZ(boolean, android.content.Context, com.bytedance.android.live.base.model.user.BadgeStruct, X.Pro, X.Yns, int, com.bytedance.android.live.base.model.user.User, boolean, X.Pro, boolean):void");
    }
}
