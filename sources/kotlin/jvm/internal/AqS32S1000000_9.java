package kotlin.jvm.internal;

import X.AUM;
import X.AbstractC65781Prl;
import X.C141335gf;
import X.C221018lt;
import X.C27943Axv;
import X.C3C5;
import X.C43I;
import X.C54617Lc5;
import X.C54619Lc7;
import X.C54652Lce;
import X.C54662Lco;
import X.C55714Ltm;
import X.C55983Ly7;
import X.C56045Lz7;
import X.C56569MIb;
import X.C57629MjZ;
import X.C57819Mmd;
import X.C58620MzY;
import X.C72912tb;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.M4B;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public class AqS32S1000000_9 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public String s0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case 9:
                return invoke$9(this, obj);
            case 10:
                return invoke$10(this, obj);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this, obj);
            case 12:
                return invoke$12(this, obj);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            case 15:
                return invoke$15(this, obj);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return invoke$16(this, obj);
            case 17:
                return invoke$17(this, obj);
            case 18:
                return invoke$18(this, obj);
            default:
                return null;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS32S1000000_9(int r3) {
        /*
            r2 = this;
            r2.$t = r3
            switch(r3) {
                case 6: goto Lf;
                default: goto L5;
            }
        L5:
            r1 = r2
            java.lang.String r0 = "publish_landing"
            r1.s0 = r0
            r0 = 1
        Lb:
            r1.<init>(r0)
            return
        Lf:
            r1 = r2
            java.lang.String r0 = "unity"
            r1.s0 = r0
            r0 = 1
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS32S1000000_9.<init>(int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS32S1000000_9(String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
    }

    public static final Object invoke$0(AqS32S1000000_9 aqS32S1000000_9, Object obj) {
        AUM configTracker = (AUM) obj;
        o.LJIIIZ(configTracker, "$this$configTracker");
        String str = aqS32S1000000_9.s0;
        o.LJIIIZ(str, "<set-?>");
        configTracker.LIZ = str;
        configTracker.LIZJ = "head";
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS32S1000000_9 aqS32S1000000_9, Object obj) {
        Object LIZ;
        JSONObject sendEventTrackingAsync = (JSONObject) obj;
        o.LJIIIZ(sendEventTrackingAsync, "$this$sendEventTrackingAsync");
        try {
            LIZ = sendEventTrackingAsync.put("enter_from", aqS32S1000000_9.s0);
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            C221018lt.LIZLLL("FeedSkylightEventTracker", m10exceptionOrNullimpl);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(AqS32S1000000_9 aqS32S1000000_9, Object obj) {
        C54617Lc5 setState = (C54617Lc5) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C54617Lc5.LIZ(setState, null, false, new C43I(new C54619Lc7(true, false, false, true, aqS32S1000000_9.s0, 10)), null, 11);
    }

    public static final Object invoke$11(AqS32S1000000_9 aqS32S1000000_9, Object obj) {
        Map onEventV3 = (Map) obj;
        o.LJIIIZ(onEventV3, "$this$onEventV3");
        onEventV3.put("enter_from", "homepage_nearby");
        C54652Lce.LJ("group_id", onEventV3, aqS32S1000000_9.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$12(AqS32S1000000_9 aqS32S1000000_9, Object obj) {
        Map onEventV3 = (Map) obj;
        o.LJIIIZ(onEventV3, "$this$onEventV3");
        onEventV3.put("enter_from", "homepage_nearby");
        C54652Lce.LJ("group_id", onEventV3, aqS32S1000000_9.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$13(AqS32S1000000_9 aqS32S1000000_9, Object obj) {
        M4B trackerConfig = (M4B) obj;
        o.LJIIIZ(trackerConfig, "$this$trackerConfig");
        trackerConfig.LIZ(aqS32S1000000_9.s0);
        trackerConfig.LIZIZ = "download";
        return C76800UCe.LIZ;
    }

    public static final Object invoke$14(AqS32S1000000_9 aqS32S1000000_9, Object obj) {
        M4B trackerConfig = (M4B) obj;
        o.LJIIIZ(trackerConfig, "$this$trackerConfig");
        trackerConfig.LIZ(aqS32S1000000_9.s0);
        trackerConfig.LIZIZ = "download";
        return C76800UCe.LIZ;
    }

    public static final Object invoke$15(AqS32S1000000_9 aqS32S1000000_9, Object obj) {
        C54662Lco setState = (C54662Lco) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C54662Lco.LIZ(setState, aqS32S1000000_9.s0, null, null, null, null, null, null, 126);
    }

    public static final Object invoke$16(AqS32S1000000_9 aqS32S1000000_9, Object obj) {
        C57629MjZ setState = (C57629MjZ) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C57629MjZ.LIZ(setState, null, null, null, null, false, null, null, null, new C43I(aqS32S1000000_9.s0), 255);
    }

    public static final Object invoke$17(AqS32S1000000_9 aqS32S1000000_9, Object obj) {
        C58620MzY log = (C58620MzY) obj;
        o.LJIIIZ(log, "$this$log");
        C56569MIb.LIZ.getClass();
        log.LJII(C56569MIb.LJIILIIL, aqS32S1000000_9.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$18(AqS32S1000000_9 aqS32S1000000_9, Object obj) {
        String str;
        M4B trackerConfig = (M4B) obj;
        o.LJIIIZ(trackerConfig, "$this$trackerConfig");
        String str2 = aqS32S1000000_9.s0;
        if (str2 != null) {
            str = C55714Ltm.LIZLLL(str2);
        } else {
            str = "";
        }
        trackerConfig.LIZ = str;
        trackerConfig.LIZIZ = "auto";
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS32S1000000_9 aqS32S1000000_9, Object obj) {
        M4B trackerConfig = (M4B) obj;
        o.LJIIIZ(trackerConfig, "$this$trackerConfig");
        trackerConfig.LIZ(aqS32S1000000_9.s0);
        trackerConfig.LIZIZ = "auto";
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS32S1000000_9 aqS32S1000000_9, Object obj) {
        C57819Mmd $receiver = (C57819Mmd) obj;
        o.LJIIIZ($receiver, "$this$$receiver");
        $receiver.LIZ = "following_list";
        $receiver.LIZJ(aqS32S1000000_9.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS32S1000000_9 aqS32S1000000_9, Object obj) {
        C57819Mmd configTracker = (C57819Mmd) obj;
        o.LJIIIZ(configTracker, "$this$configTracker");
        configTracker.LIZ = "following_list";
        configTracker.LIZJ(aqS32S1000000_9.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS32S1000000_9 aqS32S1000000_9, Object obj) {
        M4B trackerConfig = (M4B) obj;
        o.LJIIIZ(trackerConfig, "$this$trackerConfig");
        trackerConfig.LIZ = "homepage_follow";
        trackerConfig.LIZIZ(aqS32S1000000_9.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS32S1000000_9 aqS32S1000000_9, Object obj) {
        C27943Axv sendLog = (C27943Axv) obj;
        o.LJIIIZ(sendLog, "$this$sendLog");
        sendLog.LIZLLL("data_from", aqS32S1000000_9.s0);
        sendLog.LIZLLL("data_is_error", CardStruct.IStatusCode.DEFAULT);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS32S1000000_9 aqS32S1000000_9, Object obj) {
        C27943Axv sendLog = (C27943Axv) obj;
        o.LJIIIZ(sendLog, "$this$sendLog");
        String str = aqS32S1000000_9.s0;
        if (str == null) {
            str = "";
        }
        sendLog.LIZLLL("open_from", str);
        C56045Lz7.LIZ.getClass();
        C56045Lz7.LIZ(sendLog);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(AqS32S1000000_9 aqS32S1000000_9, Object obj) {
        C27943Axv sendLog = (C27943Axv) obj;
        o.LJIIIZ(sendLog, "$this$sendLog");
        sendLog.LIZLLL("tab_name", aqS32S1000000_9.s0);
        C56045Lz7.LIZ.getClass();
        C56045Lz7.LIZ(sendLog);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(AqS32S1000000_9 aqS32S1000000_9, Object obj) {
        C55983Ly7 setState = (C55983Ly7) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C55983Ly7.L(setState, null, null, null, null, null, new C72912tb(aqS32S1000000_9.s0), 31);
    }
}
