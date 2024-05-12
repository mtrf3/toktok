package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C141335gf;
import X.C221018lt;
import X.C38891fp;
import X.C3C5;
import X.C73433Srt;
import X.C76800UCe;
import X.InterfaceC39061FUr;
import X.InterfaceC65784Pro;
import X.InterfaceC73573Su9;
import X.LVL;
import android.content.Context;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeList;

/* loaded from: classes7.dex */
public class AqS69S0201000_6 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS69S0201000_6 aqS69S0201000_6) {
        Object LIZ;
        NoticeList noticeList = (NoticeList) aqS69S0201000_6.l0;
        int i = aqS69S0201000_6.i2;
        try {
            C221018lt.LJFF("NCManager", "NoticeCountManager#rxInitNoticeCount");
            LVL.LJLIL.getClass();
            LIZ = Boolean.valueOf(LVL.LJJIIJZLJL(noticeList, i));
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        InterfaceC73573Su9 emitter = (InterfaceC73573Su9) aqS69S0201000_6.l1;
        if (C3C5.m13isSuccessimpl(LIZ)) {
            boolean booleanValue = ((Boolean) LIZ).booleanValue();
            o.LJIIIIZZ(emitter, "emitter");
            C38891fp.LJJIJ(emitter, Boolean.valueOf(booleanValue));
        }
        InterfaceC73573Su9 emitter2 = (InterfaceC73573Su9) aqS69S0201000_6.l1;
        if (C3C5.m10exceptionOrNullimpl(LIZ) != null) {
            o.LJIIIIZZ(emitter2, "emitter");
            C38891fp.LJJIJ(emitter2, Boolean.FALSE);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0022, code lost:
    
        return X.C76800UCe.LIZ;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AqS69S0201000_6 r13) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS69S0201000_6.invoke$1(kotlin.jvm.internal.AqS69S0201000_6):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS69S0201000_6(int i, Context context, InterfaceC39061FUr interfaceC39061FUr, int i2) {
        super(0);
        this.$t = i2;
        this.i2 = i;
        this.l0 = interfaceC39061FUr;
        this.l1 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS69S0201000_6(NoticeList noticeList, int i, C73433Srt c73433Srt, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = noticeList;
        this.i2 = i;
        this.l1 = c73433Srt;
    }
}
