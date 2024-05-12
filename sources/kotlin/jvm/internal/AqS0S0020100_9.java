package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C27943Axv;
import X.C56045Lz7;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* loaded from: classes10.dex */
public class AqS0S0020100_9 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public long j2;
    public boolean z0;
    public boolean z1;

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

    public static final Object invoke$0(AqS0S0020100_9 aqS0S0020100_9, Object obj) {
        Object obj2;
        C27943Axv sendLog = (C27943Axv) obj;
        o.LJIIIZ(sendLog, "$this$sendLog");
        sendLog.LIZLLL("duration", Long.valueOf(aqS0S0020100_9.j2));
        String str = "1";
        if (aqS0S0020100_9.z0) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        sendLog.LIZLLL("is_market_gecko_cache", obj2);
        if (!aqS0S0020100_9.z1) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        sendLog.LIZLLL("is_market_data_cache", str);
        C56045Lz7.LIZ.getClass();
        sendLog.LIZLLL("enter_from", C56045Lz7.LIZIZ());
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS0S0020100_9 aqS0S0020100_9, Object obj) {
        Object obj2;
        C27943Axv sendLog = (C27943Axv) obj;
        o.LJIIIZ(sendLog, "$this$sendLog");
        sendLog.LIZLLL("duration", Long.valueOf(aqS0S0020100_9.j2));
        String str = "1";
        if (aqS0S0020100_9.z0) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        sendLog.LIZLLL("is_recommend_gecko_cache", obj2);
        if (!aqS0S0020100_9.z1) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        sendLog.LIZLLL("is_recommend_data_cache", str);
        C56045Lz7.LIZ.getClass();
        sendLog.LIZLLL("enter_from", C56045Lz7.LIZIZ());
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS0S0020100_9(long j, boolean z, boolean z2, int i) {
        super(1);
        this.$t = i;
        this.j2 = j;
        this.z0 = z;
        this.z1 = z2;
    }
}
