package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C0NB;
import X.C30868C9o;
import X.C74801TXh;
import X.C74838TYs;
import X.C75023TcR;
import X.C75457TjR;
import X.C75724Tnk;
import X.C75981Trt;
import X.C76265TwT;
import X.C76279Twh;
import X.C76696U8e;
import X.C76800UCe;
import X.C78070UkU;
import X.C78071UkV;
import X.CN1;
import X.EnumC76178Tv4;
import X.InterfaceC65784Pro;
import X.InterfaceC76768UAy;
import X.N2K;
import X.U4R;
import X.U8H;
import X.U8K;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.voicechat.main.guest.VoiceChatWatchWidget;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DslLayoutKt;
import com.bytedance.android.livesdk.comp.api.linkcore.model.JoinRtcChannelResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostCrossRoomPushSDKSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class AqS68S0110000_13 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS68S0110000_13 aqS68S0110000_13) {
        long j;
        FollowInfo followInfo;
        String LIZ = C74801TXh.LIZ(aqS68S0110000_13.z1);
        C75023TcR.LIZLLL.LIZJ("key_checkAABCallback");
        Room room = ((VoiceChatWatchWidget) aqS68S0110000_13.l0).LJLJI;
        if (room != null) {
            User owner = room.getOwner();
            if (owner != null && (followInfo = owner.getFollowInfo()) != null) {
                j = followInfo.getFollowStatus();
            } else {
                j = 0;
            }
            C75457TjR.LJIJJLI(j, LIZ, C75457TjR.LJ(C74838TYs.LJ().LJJ), ((IInteractService) CN1.LIZ(IInteractService.class)).ta0());
            ((VoiceChatWatchWidget) aqS68S0110000_13.l0).onInteractIconClick(true);
        } else {
            C30868C9o.LIZJ(R.string.sp2);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS68S0110000_13 aqS68S0110000_13) {
        EnumC76178Tv4 LJ;
        if (aqS68S0110000_13.z1) {
            LJ = C76265TwT.LIZIZ.LJ();
        } else {
            LJ = C76265TwT.LIZ.LJ();
        }
        if (LJ == EnumC76178Tv4.INVITED) {
            ((C76279Twh) aqS68S0110000_13.l0).LJIJ(null, aqS68S0110000_13.z1);
        } else if (EnumC76178Tv4.START.compareTo(LJ) <= 0 && LJ.compareTo(EnumC76178Tv4.FINISH) < 0) {
            C76279Twh.LJJII((C76279Twh) aqS68S0110000_13.l0, 101, true, false, null, 16);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS68S0110000_13 aqS68S0110000_13) {
        ((C76279Twh) aqS68S0110000_13.l0).LJIJJLI(aqS68S0110000_13.z1);
        C0NB.LJ("TwoMatchViewAnchorPrese", "error status for invite dialog");
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS68S0110000_13 aqS68S0110000_13) {
        if (aqS68S0110000_13.z1) {
            InterfaceC76768UAy interfaceC76768UAy = (InterfaceC76768UAy) aqS68S0110000_13.l0;
            if (interfaceC76768UAy != null) {
                interfaceC76768UAy.LIZIZ(new JoinRtcChannelResult(null));
            }
        } else {
            InterfaceC76768UAy interfaceC76768UAy2 = (InterfaceC76768UAy) aqS68S0110000_13.l0;
            if (interfaceC76768UAy2 != null) {
                interfaceC76768UAy2.LIZJ(LinkCoreError.Companion.getFORCE_JOIN_RTC_CHANNEL_INIT_ERROR(), null);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS68S0110000_13 aqS68S0110000_13) {
        U4R.LIZLLL("LinkLayoutManager", "reset");
        U8K.LIZLLL = null;
        U8K.LJ = null;
        U8K.LJFF = null;
        ((U8H) aqS68S0110000_13.l0).LJIJJ().LIZ();
        if (aqS68S0110000_13.z1) {
            ((U8H) aqS68S0110000_13.l0).LJJJI(DslLayoutKt.getNormalLayout());
        }
        U8H u8h = (U8H) aqS68S0110000_13.l0;
        u8h.LJJJJJ.LJJLIIIJJIZ(u8h.LJJIII(), 2);
        ((U8H) aqS68S0110000_13.l0).LJIIIIZZ();
        C76696U8e LJJIII = ((U8H) aqS68S0110000_13.l0).LJJIII();
        LJJIII.LJLL = null;
        if (MtCoHostCrossRoomPushSDKSetting.isEnable()) {
            LJJIII.LJLLI.clear();
        }
        for (Map.Entry<String, N2K> entry : ((U8H) aqS68S0110000_13.l0).LJIILL().entrySet()) {
            entry.getValue().LIZ(entry.getKey());
        }
        ((U8H) aqS68S0110000_13.l0).LJIILL().clear();
        HashMap<String, Map<String, String>> LJIIZILJ = ((U8H) aqS68S0110000_13.l0).LJIIZILJ();
        U8H u8h2 = (U8H) aqS68S0110000_13.l0;
        synchronized (LJIIZILJ) {
            u8h2.LJIIZILJ().clear();
        }
        HashMap<String, Map<String, String>> LJIJ = ((U8H) aqS68S0110000_13.l0).LJIJ();
        U8H u8h3 = (U8H) aqS68S0110000_13.l0;
        synchronized (LJIJ) {
            u8h3.LJIJ().clear();
        }
        HashMap<String, Map<String, JSONObject>> LJIILLIIL = ((U8H) aqS68S0110000_13.l0).LJIILLIIL();
        U8H u8h4 = (U8H) aqS68S0110000_13.l0;
        synchronized (LJIILLIIL) {
            u8h4.LJIILLIIL().clear();
        }
        ((U8H) aqS68S0110000_13.l0).LJJJLZIJ();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS68S0110000_13 aqS68S0110000_13) {
        C78071UkV c78071UkV;
        ((C78070UkU) aqS68S0110000_13.l0).getClass();
        if (!aqS68S0110000_13.z1 && (c78071UkV = ((C78070UkU) aqS68S0110000_13.l0).LJFF) != null) {
            c78071UkV.LIZ();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS68S0110000_13 aqS68S0110000_13) {
        C78071UkV c78071UkV;
        ((C78070UkU) aqS68S0110000_13.l0).getClass();
        if (!aqS68S0110000_13.z1 && (c78071UkV = ((C78070UkU) aqS68S0110000_13.l0).LJFF) != null) {
            c78071UkV.LIZ();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS68S0110000_13 aqS68S0110000_13) {
        C75724Tnk.LIZLLL(aqS68S0110000_13.z1, (C75981Trt) aqS68S0110000_13.l0, "private_account");
        return C76800UCe.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS68S0110000_13(X.C76279Twh r3, boolean r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            switch(r5) {
                case 1: goto Lf;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r3
            r1.z1 = r4
            r0 = 0
        Lb:
            r1.<init>(r0)
            return
        Lf:
            r1 = r2
            r1.z1 = r4
            r1.l0 = r3
            r0 = 0
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS68S0110000_13.<init>(X.Twh, boolean, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS68S0110000_13(U8H u8h, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = u8h;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS68S0110000_13(C78070UkU c78070UkU, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c78070UkU;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS68S0110000_13(boolean z, C75981Trt c75981Trt, int i) {
        super(0);
        this.$t = i;
        this.z1 = z;
        this.l0 = c75981Trt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS68S0110000_13(boolean z, boolean z2, InterfaceC76768UAy<JoinRtcChannelResult> interfaceC76768UAy) {
        super(0);
        this.$t = interfaceC76768UAy;
        this.z1 = z;
        this.l0 = z2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS68S0110000_13(boolean z, VoiceChatWatchWidget voiceChatWatchWidget, int i) {
        super(0);
        this.$t = i;
        this.z1 = z;
        this.l0 = voiceChatWatchWidget;
    }
}
