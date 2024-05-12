package Y;

import X.B5G;
import X.C05170If;
import X.C0NB;
import X.C15380j0;
import X.C30868C9o;
import X.C32014ChO;
import X.C75492Tk0;
import X.C75516TkO;
import X.C75870Tq6;
import X.C75878TqE;
import X.C76312TxE;
import X.EnumC75674Tmw;
import X.InterfaceC64592gB;
import X.InterfaceC75495Tk3;
import X.InterfaceC75871Tq7;
import X.InterfaceC76347Txn;
import X.InterfaceC76348Txo;
import X.InterfaceC76675U7j;
import X.Q3U;
import X.Q9E;
import X.Q9G;
import X.TVU;
import X.TZI;
import X.U7A;
import X.U7T;
import X.U7U;
import X.X1D;
import android.app.Activity;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.multilive.model.GuestMicCameraManageResponse;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchQualityOptimizeSetting;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import com.ss.android.ugc.aweme.experiment.MemoryDegradationSettings;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class AfS33S0201000_13 implements InterfaceC64592gB {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            case 3:
                accept$3(this, obj);
                return;
            case 4:
                accept$4(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS33S0201000_13 afS33S0201000_13, Object obj) {
        switch (afS33S0201000_13.i2) {
            case 0:
                C75492Tk0 c75492Tk0 = (C75492Tk0) afS33S0201000_13.l0;
                C75878TqE c75878TqE = (C75878TqE) afS33S0201000_13.l1;
                Throwable th = (Throwable) obj;
                c75492Tk0.getClass();
                EnumC75674Tmw enumC75674Tmw = EnumC75674Tmw.NONE;
                c75492Tk0.LJJJJZI(enumC75674Tmw);
                c75492Tk0.LJJJJLL();
                ((InterfaceC75495Tk3) c75492Tk0.mView).M80(enumC75674Tmw);
                LinkCrossRoomDataHolder LIZIZ = B5G.LIZIZ();
                int i = LIZIZ.LJJZZI + 1;
                LIZIZ.LJJZZI = i;
                c75878TqE.LJJIJL(enumC75674Tmw, th, i);
                TVU.LJIIZILJ("co-host", th);
                C75516TkO.LIZ.LIZIZ(600, "multi-guest host check permission error", th, null);
                return;
            default:
                Q9E q9e = (Q9E) afS33S0201000_13.l0;
                MemoryDegradationSettings memoryDegradationSettings = (MemoryDegradationSettings) afS33S0201000_13.l1;
                q9e.getClass();
                if (((Activity) obj).getComponentName().getClassName().contains(memoryDegradationSettings.activityName) && !q9e.LIZIZ) {
                    int i2 = memoryDegradationSettings.size2Degradation;
                    Q3U.LIZ.execute(new ARunnableS7S0200100_11(new Q9G(q9e), Q9E.LIZ(memoryDegradationSettings.memoryType), i2 * 1024 * 1024, 2));
                    return;
                }
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$1(AfS33S0201000_13 afS33S0201000_13, Object obj) {
        InterfaceC75871Tq7 interfaceC75871Tq7;
        InterfaceC76347Txn LIZ;
        BaseResponse baseResponse = (BaseResponse) obj;
        C75870Tq6 c75870Tq6 = (C75870Tq6) afS33S0201000_13.l0;
        InterfaceC76348Txo interfaceC76348Txo = ((C76312TxE) afS33S0201000_13.l1).LIZ;
        if (interfaceC76348Txo != null && (LIZ = interfaceC76348Txo.LIZ()) != null) {
            interfaceC75871Tq7 = LIZ.LIZIZ();
        } else {
            interfaceC75871Tq7 = null;
        }
        c75870Tq6.LJIIL();
        c75870Tq6.LJIILL(interfaceC75871Tq7);
        c75870Tq6.LJIILJJIL("battle_info_succeed");
        BattleInfoResponse info = (BattleInfoResponse) baseResponse.data;
        if (((C76312TxE) afS33S0201000_13.l1).LIZ == null) {
            C0NB.LJIIIZ("MatchFeedWidgetPresenter", "checkBattleInfo, info success, return by viewInterface");
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("checkBattleInfo, info=");
        LIZ2.append(info);
        C0NB.LJIIIZ("MatchFeedWidgetPresenter", X1D.LIZIZ(LIZ2));
        InterfaceC76348Txo interfaceC76348Txo2 = ((C76312TxE) afS33S0201000_13.l1).LIZ;
        if (interfaceC76348Txo2 != null) {
            o.LJIIIIZZ(info, "info");
            if (!interfaceC76348Txo2.b0(info, afS33S0201000_13.i2)) {
                if (!LiveMatchQualityOptimizeSetting.INSTANCE.enableOptimize()) {
                    return;
                }
                ((C76312TxE) afS33S0201000_13.l1).LIZ(afS33S0201000_13.i2);
                return;
            }
        }
        C0NB.LJIIIZ("MatchFeedWidgetPresenter", "checkBattleInfo viewInterface?.handleBattleInfo(info, type) == true");
    }

    public static final void accept$2(AfS33S0201000_13 afS33S0201000_13, Object obj) {
        C32014ChO.LJFF(U7T.LJJJJJ(2046), "handlePermitApplyMessage Notify listener success");
        if (afS33S0201000_13.i2 == 1) {
            U7T u7t = (U7T) afS33S0201000_13.l0;
            U7U.LJIIZILJ(u7t.LJIIIZ, u7t, ((U7A) afS33S0201000_13.l1).LIZIZ, false, false, false, false, "business_multi_guest_guest_receive_permit_apply_msg", null, 184);
            U7T u7t2 = (U7T) afS33S0201000_13.l0;
            CopyOnWriteArrayList<InterfaceC76675U7j> copyOnWriteArrayList = u7t2.LJIIIIZZ;
            U7A u7a = (U7A) afS33S0201000_13.l1;
            Iterator<InterfaceC76675U7j> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().LJJJJLL(u7t2, u7a);
            }
        }
    }

    public static final void accept$3(AfS33S0201000_13 afS33S0201000_13, Object obj) {
        if (afS33S0201000_13.i2 == 1) {
            U7T u7t = (U7T) afS33S0201000_13.l0;
            U7U.LJIIZILJ(u7t.LJIIIZ, u7t, ((U7A) afS33S0201000_13.l1).LIZIZ, false, false, false, false, "business_multi_guest_anchor_receive_accept_invite_msg", null, 188);
            U7T u7t2 = (U7T) afS33S0201000_13.l0;
            CopyOnWriteArrayList<InterfaceC76675U7j> copyOnWriteArrayList = u7t2.LJIIIIZZ;
            U7A u7a = (U7A) afS33S0201000_13.l1;
            Iterator<InterfaceC76675U7j> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().LJJIL(u7t2, u7a);
            }
            return;
        }
        U7T u7t3 = (U7T) afS33S0201000_13.l0;
        CopyOnWriteArrayList<InterfaceC76675U7j> copyOnWriteArrayList2 = u7t3.LJIIIIZZ;
        U7A u7a2 = (U7A) afS33S0201000_13.l1;
        Iterator<InterfaceC76675U7j> it2 = copyOnWriteArrayList2.iterator();
        while (it2.hasNext()) {
            it2.next().LJJ(u7t3, u7a2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$4(AfS33S0201000_13 afS33S0201000_13, Object obj) {
        boolean z;
        GuestMicCameraManageResponse.ResponseData responseData;
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse != null && (responseData = (GuestMicCameraManageResponse.ResponseData) baseResponse.data) != null && responseData.ratelimit) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            TZI tzi = (TZI) afS33S0201000_13.l0;
            User user = (User) afS33S0201000_13.l1;
            int i = (int) ((GuestMicCameraManageResponse.ResponseData) baseResponse.data).expirationTime;
            tzi.getClass();
            C30868C9o.LJI(C15380j0.LJIIIIZZ(R.plurals.nt, i, C05170If.LIZ(user), Integer.valueOf(i)));
            return;
        }
        TZI tzi2 = (TZI) afS33S0201000_13.l0;
        int i2 = afS33S0201000_13.i2;
        User user2 = (User) afS33S0201000_13.l1;
        tzi2.getClass();
        if (i2 != 0) {
            if (i2 != 2) {
                return;
            }
            C30868C9o.LJI(C15380j0.LJIILL(R.string.n_i, C05170If.LIZ(user2)));
            return;
        }
        C30868C9o.LJI(C15380j0.LJIILL(R.string.nbz, C05170If.LIZ(user2)));
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS33S0201000_13(int r2, X.U7T r3, X.U7A r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            switch(r5) {
                case 2: goto L10;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.i2 = r2
            r0.l0 = r3
            r0.l1 = r4
        Lc:
            r0.<init>()
            return
        L10:
            r0 = r1
            r0.l0 = r3
            r0.i2 = r2
            r0.l1 = r4
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS33S0201000_13.<init>(int, X.U7T, X.U7A, int):void");
    }

    public AfS33S0201000_13(int i, Object obj, Object obj2, int i2) {
        this.$t = i2;
        this.i2 = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
