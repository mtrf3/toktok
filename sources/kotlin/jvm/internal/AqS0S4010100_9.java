package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C27943Axv;
import X.C56045Lz7;
import X.C71313Ryn;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* loaded from: classes10.dex */
public class AqS0S4010100_9 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public long j5;
    public String s0;
    public String s1;
    public String s2;
    public String s3;
    public boolean z4;

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

    public static final Object invoke$0(AqS0S4010100_9 aqS0S4010100_9, Object obj) {
        String str;
        C27943Axv c27943Axv = (C27943Axv) obj;
        C71313Ryn.LIZLLL(c27943Axv, "$this$sendLog", "EVENT_ORIGIN_FEATURE", "TEMAI", "page_name", "mall");
        c27943Axv.LIZLLL("previous_page", aqS0S4010100_9.s0);
        C56045Lz7.LIZ.getClass();
        c27943Axv.LIZLLL("enter_from", C56045Lz7.LIZIZ());
        c27943Axv.LIZLLL("stay_time", Long.valueOf(aqS0S4010100_9.j5));
        c27943Axv.LIZLLL("quit_type", aqS0S4010100_9.s1);
        if (aqS0S4010100_9.z4) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c27943Axv.LIZLLL("is_load_data", str);
        String str2 = aqS0S4010100_9.s2;
        if (str2 != null && str2.length() > 0) {
            c27943Axv.LIZLLL("page_skin_type", aqS0S4010100_9.s2);
        }
        c27943Axv.LIZLLL("page_struc_type", aqS0S4010100_9.s3);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS0S4010100_9 aqS0S4010100_9, Object obj) {
        String str;
        C27943Axv c27943Axv = (C27943Axv) obj;
        C71313Ryn.LIZLLL(c27943Axv, "$this$sendLog", "EVENT_ORIGIN_FEATURE", "TEMAI", "page_name", "mall");
        c27943Axv.LIZLLL("previous_page", aqS0S4010100_9.s0);
        C56045Lz7.LIZ.getClass();
        c27943Axv.LIZLLL("enter_from", C56045Lz7.LIZIZ());
        c27943Axv.LIZLLL("stay_time", Long.valueOf(aqS0S4010100_9.j5));
        c27943Axv.LIZLLL("quit_type", aqS0S4010100_9.s1);
        if (aqS0S4010100_9.z4) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c27943Axv.LIZLLL("is_load_data", str);
        String str2 = aqS0S4010100_9.s2;
        if (str2 != null && str2.length() > 0) {
            c27943Axv.LIZLLL("page_skin_type", aqS0S4010100_9.s2);
        }
        c27943Axv.LIZLLL("page_struc_type", aqS0S4010100_9.s3);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS0S4010100_9(long j, String str, String str2, String str3, String str4, boolean z, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.j5 = j;
        this.s1 = str2;
        this.z4 = z;
        this.s2 = str3;
        this.s3 = str4;
    }
}
