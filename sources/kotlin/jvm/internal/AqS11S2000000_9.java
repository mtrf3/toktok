package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C27943Axv;
import X.C41835GbP;
import X.C56045Lz7;
import X.C57819Mmd;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.M4B;
import X.M7C;
import X.MG6;
import X.ORZ;
import X.SY4;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PlayListInfo;
import java.util.List;

/* loaded from: classes10.dex */
public class AqS11S2000000_9 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public String s0;
    public String s1;

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
            default:
                return null;
        }
    }

    public final void invoke$0(SY4 it) {
        o.LJIIIZ(it, "it");
        it.setText(this.s0);
        it.setButtonSize(3);
        if (ORZ.LJLJJI(this.s1, MG6.LIZLLL)) {
            it.setButtonVariant(1);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS11S2000000_9(java.lang.String r3, int r4) {
        /*
            r2 = this;
            r2.$t = r4
            switch(r4) {
                case 3: goto L11;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.s0 = r3
            java.lang.String r0 = "mall_home"
            r1.s1 = r0
            r0 = 1
        Ld:
            r1.<init>(r0)
            return
        L11:
            r1 = r2
            java.lang.String r0 = "unity"
            r1.s0 = r0
            r1.s1 = r3
            r0 = 1
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS11S2000000_9.<init>(java.lang.String, int):void");
    }

    public static final Object invoke$0(AqS11S2000000_9 aqS11S2000000_9, Object obj) {
        M4B trackerConfig = (M4B) obj;
        o.LJIIIZ(trackerConfig, "$this$trackerConfig");
        trackerConfig.LIZ(aqS11S2000000_9.s0);
        trackerConfig.LIZIZ(aqS11S2000000_9.s1);
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AqS11S2000000_9 aqS11S2000000_9, Object obj) {
        aqS11S2000000_9.invoke$0((SY4) obj);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS11S2000000_9 aqS11S2000000_9, Object obj) {
        C41835GbP param = (C41835GbP) obj;
        o.LJIIIZ(param, "param");
        return C41835GbP.L(param, aqS11S2000000_9.s0, "show_on_video", 0, aqS11S2000000_9.s1, "text", 493);
    }

    public static final Object invoke$3(AqS11S2000000_9 aqS11S2000000_9, Object obj) {
        C27943Axv sendLog = (C27943Axv) obj;
        o.LJIIIZ(sendLog, "$this$sendLog");
        sendLog.LIZLLL("data_from", aqS11S2000000_9.s0);
        sendLog.LIZLLL("data_is_error", "1");
        sendLog.LIZLLL("data_error_reason", aqS11S2000000_9.s1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS11S2000000_9 aqS11S2000000_9, Object obj) {
        C27943Axv sendLog = (C27943Axv) obj;
        o.LJIIIZ(sendLog, "$this$sendLog");
        sendLog.LIZLLL("resource_from", aqS11S2000000_9.s0);
        sendLog.LIZLLL("page_name", aqS11S2000000_9.s1);
        C56045Lz7.LIZ.getClass();
        sendLog.LJ(C56045Lz7.LIZJ());
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS11S2000000_9 aqS11S2000000_9, Object obj) {
        C57819Mmd configTracker = (C57819Mmd) obj;
        o.LJIIIZ(configTracker, "$this$configTracker");
        String str = aqS11S2000000_9.s0;
        o.LJIIIZ(str, "<set-?>");
        configTracker.LIZ = str;
        configTracker.LIZIZ = "related_pop_up";
        configTracker.LJ = true;
        String str2 = aqS11S2000000_9.s1;
        o.LJIIIZ(str2, "<set-?>");
        configTracker.LJIIIIZZ = str2;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS11S2000000_9 aqS11S2000000_9, Object obj) {
        String str;
        PlayListInfo playListInfo;
        M7C it = (M7C) obj;
        o.LJIIIZ(it, "it");
        List<Aweme> list = it.LJLIL;
        if (list != null) {
            String str2 = aqS11S2000000_9.s0;
            String str3 = aqS11S2000000_9.s1;
            for (Aweme aweme : list) {
                PlayListInfo playListInfo2 = aweme.playlist_info;
                if (playListInfo2 != null) {
                    str = playListInfo2.getMixId();
                } else {
                    str = null;
                }
                if (ujb.o.LJJJJIZL(str, str2, false) && (playListInfo = aweme.playlist_info) != null) {
                    playListInfo.setMixName(str3);
                }
            }
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS11S2000000_9(String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
    }
}
