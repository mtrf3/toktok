package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C27943Axv;
import X.C38995FSd;
import X.C56045Lz7;
import X.C76800UCe;
import X.InterfaceC46334IGk;
import X.InterfaceC88472Yns;
import Y.ARunnableS44S0100000_8;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public class AqS18S0000100_8 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public long j0;

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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS18S0000100_8(long j, int i) {
        super(1);
        this.$t = i;
        this.j0 = j;
    }

    public static final Object invoke$0(AqS18S0000100_8 aqS18S0000100_8, Object obj) {
        C27943Axv sendLog = (C27943Axv) obj;
        o.LJIIIZ(sendLog, "$this$sendLog");
        sendLog.LIZLLL("duration", Long.valueOf(aqS18S0000100_8.j0));
        C56045Lz7.LIZ.getClass();
        sendLog.LIZLLL("enter_from", C56045Lz7.LIZIZ());
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS18S0000100_8 aqS18S0000100_8, Object obj) {
        InterfaceC46334IGk preloader = (InterfaceC46334IGk) obj;
        o.LJIIIZ(preloader, "preloader");
        C38995FSd.LJ().schedule(new ARunnableS44S0100000_8(preloader, 202), aqS18S0000100_8.j0, TimeUnit.MILLISECONDS);
        return C76800UCe.LIZ;
    }
}
