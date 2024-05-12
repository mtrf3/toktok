package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C27943Axv;
import X.C56045Lz7;
import X.C56090Lzq;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* loaded from: classes10.dex */
public class AqS0S0010100_9 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public long j1;
    public boolean z0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS0S0010100_9 aqS0S0010100_9, Object obj) {
        String str;
        C27943Axv sendLog = (C27943Axv) obj;
        o.LJIIIZ(sendLog, "$this$sendLog");
        sendLog.LIZLLL("duration", Long.valueOf(aqS0S0010100_9.j1));
        if (aqS0S0010100_9.z0) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        sendLog.LIZLLL("is_data_cache", str);
        C56045Lz7.LIZ.getClass();
        sendLog.LIZLLL("enter_from", C56045Lz7.LIZIZ());
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS0S0010100_9 aqS0S0010100_9, Object obj) {
        String str;
        C27943Axv sendLog = (C27943Axv) obj;
        o.LJIIIZ(sendLog, "$this$sendLog");
        sendLog.LIZLLL("duration", Long.valueOf(aqS0S0010100_9.j1));
        if (aqS0S0010100_9.z0) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        sendLog.LIZLLL("is_data_cache", str);
        C56045Lz7.LIZ.getClass();
        sendLog.LIZLLL("enter_from", C56045Lz7.LIZIZ());
        sendLog.LJ(C56045Lz7.LIZJ());
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS0S0010100_9 aqS0S0010100_9, Object obj) {
        String str;
        C27943Axv sendLog = (C27943Axv) obj;
        o.LJIIIZ(sendLog, "$this$sendLog");
        sendLog.LIZLLL("duration", Long.valueOf(aqS0S0010100_9.j1));
        if (aqS0S0010100_9.z0) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        sendLog.LIZLLL("is_data_cache", str);
        C56045Lz7.LIZ.getClass();
        sendLog.LIZLLL("enter_from", C56045Lz7.LIZIZ());
        sendLog.LIZLLL("coldboot_to_click_duration", Long.valueOf(C56090Lzq.LIZIZ));
        sendLog.LJ(C56045Lz7.LIZJ());
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS0S0010100_9(long j, boolean z, int i) {
        super(1);
        this.$t = i;
        this.j1 = j;
        this.z0 = z;
    }
}
