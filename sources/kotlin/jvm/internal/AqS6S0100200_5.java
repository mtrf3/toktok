package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C0NB;
import X.C28992BZk;
import X.C29028BaK;
import X.C29774BmM;
import X.C29788Bma;
import X.C29789Bmb;
import X.C29791Bmd;
import X.C29800Bmm;
import X.C30868C9o;
import X.C32537Cpp;
import X.C76800UCe;
import X.EnumC28583BJr;
import X.InterfaceC88472Yns;
import Y.ARunnableS41S0100000_5;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.livesdk.api.revenue.level.event.UserLevelChannel;
import com.bytedance.android.livesdk.api.revenue.level.event.UserLevelEvent;
import com.bytedance.android.livesdk.impl.revenue.level.viewmodel.UserLevelViewModel;
import com.bytedance.android.livesdk.livesetting.broadcast.HandlerThreadOptSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public class AqS6S0100200_5 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public long j1;
    public long j2;
    public Object l0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Long, O] */
    public static final Object invoke$0(AqS6S0100200_5 aqS6S0100200_5, Object obj) {
        C29800Bmm c29800Bmm;
        Integer num;
        int i;
        BadgeStruct badgeStruct;
        BadgeStruct badgeStruct2;
        Integer num2;
        long longValue = ((Number) obj).longValue();
        DataChannel dataChannel = ((UserLevelViewModel) aqS6S0100200_5.l0).getDataChannel();
        if (dataChannel != null) {
            c29800Bmm = (C29800Bmm) dataChannel.kv0(UserLevelChannel.class);
        } else {
            c29800Bmm = null;
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        Long l = (Long) dataChannelGlobal.mv0(C29028BaK.class);
        ((C32537Cpp) dataChannelGlobal.gv0(C29028BaK.class)).LIZ = Long.valueOf(aqS6S0100200_5.j1);
        long j = aqS6S0100200_5.j1;
        if (l == null || l.longValue() != j) {
            Boolean bool = Boolean.TRUE;
            Long valueOf = Long.valueOf(aqS6S0100200_5.j1);
            if (c29800Bmm != null) {
                num2 = Integer.valueOf(c29800Bmm.LIZ);
            } else {
                num2 = null;
            }
            C28992BZk.LIZLLL(bool, l, valueOf, num2, "success", longValue - aqS6S0100200_5.j2);
        } else {
            Boolean bool2 = Boolean.FALSE;
            Long valueOf2 = Long.valueOf(aqS6S0100200_5.j1);
            if (c29800Bmm != null) {
                num = Integer.valueOf(c29800Bmm.LIZ);
            } else {
                num = null;
            }
            C28992BZk.LIZLLL(bool2, l, valueOf2, num, "same mode failed", longValue - aqS6S0100200_5.j2);
        }
        if (c29800Bmm != null) {
            long j2 = aqS6S0100200_5.j1;
            EnumC28583BJr enumC28583BJr = EnumC28583BJr.USER_LEVEL_SWITCH_STATUS_ON;
            if (j2 == enumC28583BJr.getValue()) {
                i = 1;
            } else {
                i = 2;
            }
            long j3 = aqS6S0100200_5.j1;
            EnumC28583BJr enumC28583BJr2 = EnumC28583BJr.USER_LEVEL_SWITCH_STATUS_OFF;
            if (j3 == enumC28583BJr2.getValue()) {
                badgeStruct = null;
            } else {
                badgeStruct = c29800Bmm.LIZJ;
            }
            if (aqS6S0100200_5.j1 == enumC28583BJr2.getValue()) {
                badgeStruct2 = null;
            } else {
                badgeStruct2 = c29800Bmm.LIZLLL;
            }
            C29800Bmm LIZIZ = C29800Bmm.LIZIZ(c29800Bmm, badgeStruct, badgeStruct2, i, 0, 4, 12243);
            UserLevelViewModel userLevelViewModel = (UserLevelViewModel) aqS6S0100200_5.l0;
            long j4 = aqS6S0100200_5.j1;
            DataChannel dataChannel2 = userLevelViewModel.getDataChannel();
            if (dataChannel2 != null) {
                dataChannel2.rv0(UserLevelChannel.class, LIZIZ);
            }
            if (j4 == enumC28583BJr2.getValue()) {
                DataChannel dataChannel3 = userLevelViewModel.getDataChannel();
                if (dataChannel3 != null) {
                    dataChannel3.qv0(UserLevelEvent.class, C29789Bmb.LIZ);
                }
            } else if (j4 == enumC28583BJr.getValue()) {
                DataChannel dataChannel4 = userLevelViewModel.getDataChannel();
                if (dataChannel4 != null) {
                    dataChannel4.qv0(UserLevelEvent.class, C29788Bma.LIZ);
                }
                userLevelViewModel.DK(false, null, "opt_api", Boolean.FALSE, "");
                AqS155S0100000_5 aqS155S0100000_5 = new AqS155S0100000_5(userLevelViewModel, 218);
                if (HandlerThreadOptSetting.INSTANCE.enable()) {
                    ARunnableS41S0100000_5 aRunnableS41S0100000_5 = new ARunnableS41S0100000_5(aqS155S0100000_5, 251);
                    Handler LIZ = C29774BmM.LIZ();
                    if (LIZ != null) {
                        LIZ.postDelayed(aRunnableS41S0100000_5, 1000L);
                    }
                } else {
                    C29791Bmd c29791Bmd = C29791Bmd.LIZJ;
                    Looper looper = c29791Bmd.LIZIZ.getLooper();
                    o.LJIIIIZZ(looper, "backGroundThread.looper");
                    if (!o.LJ(looper, Looper.myLooper())) {
                        C0NB.LIZIZ("UserLevelViewModel", "UserLevelViewModel current thread is background looper");
                        c29791Bmd.LIZ(1000L, new ARunnableS41S0100000_5(aqS155S0100000_5, 252));
                    } else {
                        aqS155S0100000_5.invoke();
                    }
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS6S0100200_5 aqS6S0100200_5, Object obj) {
        C29800Bmm c29800Bmm;
        long longValue = ((Number) obj).longValue();
        C30868C9o.LIZJ(R.string.mg2);
        DataChannel dataChannel = ((UserLevelViewModel) aqS6S0100200_5.l0).getDataChannel();
        Integer num = null;
        if (dataChannel != null) {
            c29800Bmm = (C29800Bmm) dataChannel.kv0(UserLevelChannel.class);
        } else {
            c29800Bmm = null;
        }
        Long l = (Long) DataChannelGlobal.LJLJJI.mv0(C29028BaK.class);
        Boolean bool = Boolean.FALSE;
        Long valueOf = Long.valueOf(aqS6S0100200_5.j1);
        if (c29800Bmm != null) {
            num = Integer.valueOf(c29800Bmm.LIZ);
        }
        C28992BZk.LIZLLL(bool, l, valueOf, num, "network failed", longValue - aqS6S0100200_5.j2);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS6S0100200_5(UserLevelViewModel userLevelViewModel, long j, long j2, int i) {
        super(1);
        this.$t = i;
        this.l0 = userLevelViewModel;
        this.j1 = j;
        this.j2 = j2;
    }
}
