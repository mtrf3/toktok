package X;

import com.ss.android.ugc.aweme.search.pages.result.bot.model.PollingInfo;
import com.ss.android.ugc.aweme.search.pages.result.bot.model.TakoInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.Jc1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49517Jc1 implements C33Q {
    public final boolean LJLIL;
    public final PollingInfo LJLILLLLZI;
    public final boolean LJLJI;
    public final int LJLJJI;
    public final long LJLJJL;
    public final AbstractC72932td<TakoInfo> LJLJJLL;
    public final Integer LJLJL;
    public final String LJLJLJ;
    public final String LJLJLLL;
    public final Boolean LJLL;

    public C49517Jc1() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49517Jc1)) {
            return false;
        }
        C49517Jc1 c49517Jc1 = (C49517Jc1) obj;
        return this.LJLIL == c49517Jc1.LJLIL && o.LJ(this.LJLILLLLZI, c49517Jc1.LJLILLLLZI) && this.LJLJI == c49517Jc1.LJLJI && this.LJLJJI == c49517Jc1.LJLJJI && this.LJLJJL == c49517Jc1.LJLJJL && o.LJ(this.LJLJJLL, c49517Jc1.LJLJJLL) && o.LJ(this.LJLJL, c49517Jc1.LJLJL) && o.LJ(this.LJLJLJ, c49517Jc1.LJLJLJ) && o.LJ(this.LJLJLLL, c49517Jc1.LJLJLLL) && o.LJ(this.LJLL, c49517Jc1.LJLL);
    }

    public final boolean LIZ() {
        int LIZIZ;
        Integer num;
        Integer limit;
        int i = this.LJLJJI;
        PollingInfo pollingInfo = this.LJLILLLLZI;
        if (pollingInfo != null && (limit = pollingInfo.getLimit()) != null) {
            LIZIZ = limit.intValue();
        } else {
            LIZIZ = C49543JcR.LIZIZ();
        }
        if (i < LIZIZ && ((num = this.LJLJL) == null || num.intValue() == 1)) {
            return true;
        }
        return false;
    }

    public final int LIZJ() {
        Integer limit;
        PollingInfo pollingInfo = this.LJLILLLLZI;
        if (pollingInfo != null && (limit = pollingInfo.getLimit()) != null) {
            return limit.intValue();
        }
        return C49543JcR.LIZIZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        boolean z = this.LJLIL;
        int i = 1;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i2 = r0 * 31;
        PollingInfo pollingInfo = this.LJLILLLLZI;
        int i3 = 0;
        if (pollingInfo == null) {
            hashCode = 0;
        } else {
            hashCode = pollingInfo.hashCode();
        }
        int i4 = (i2 + hashCode) * 31;
        if (!this.LJLJI) {
            i = 0;
        }
        int LIZ = C03090Af.LIZ(this.LJLJJLL, JBR.LIZJ(this.LJLJJL, (((i4 + i) * 31) + this.LJLJJI) * 31, 31), 31);
        Integer num = this.LJLJL;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i5 = (LIZ + hashCode2) * 31;
        String str = this.LJLJLJ;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i6 = (i5 + hashCode3) * 31;
        String str2 = this.LJLJLLL;
        if (str2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str2.hashCode();
        }
        int i7 = (i6 + hashCode4) * 31;
        Boolean bool = this.LJLL;
        if (bool != null) {
            i3 = bool.hashCode();
        }
        return i7 + i3;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TakoPollingState(clientTrigger=");
        LIZ.append(this.LJLIL);
        LIZ.append(", pollingInfo=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", isPolling=");
        LIZ.append(this.LJLJI);
        LIZ.append(", pollingIndex=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", pollingStartTime=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", botInfoResponse=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", pollingStatus=");
        LIZ.append(this.LJLJL);
        LIZ.append(", searchId=");
        LIZ.append(this.LJLJLJ);
        LIZ.append(", botIconPath=");
        LIZ.append(this.LJLJLLL);
        LIZ.append(", botIconSuccess=");
        return C78920UyC.LIZIZ(LIZ, this.LJLL, ')', LIZ);
    }

    public /* synthetic */ C49517Jc1(int i) {
        this(false, null, false, 0, 0L, C33X.LIZ, null, null, null, null);
    }

    public C49517Jc1(boolean z, PollingInfo pollingInfo, boolean z2, int i, long j, AbstractC72932td<TakoInfo> botInfoResponse, Integer num, String str, String str2, Boolean bool) {
        o.LJIIIZ(botInfoResponse, "botInfoResponse");
        this.LJLIL = z;
        this.LJLILLLLZI = pollingInfo;
        this.LJLJI = z2;
        this.LJLJJI = i;
        this.LJLJJL = j;
        this.LJLJJLL = botInfoResponse;
        this.LJLJL = num;
        this.LJLJLJ = str;
        this.LJLJLLL = str2;
        this.LJLL = bool;
    }

    public static C49517Jc1 LIZIZ(C49517Jc1 c49517Jc1, boolean z, PollingInfo pollingInfo, boolean z2, int i, long j, AbstractC72932td abstractC72932td, Integer num, String str, String str2, Boolean bool, int i2) {
        Boolean bool2 = bool;
        String str3 = str2;
        String str4 = str;
        Integer num2 = num;
        PollingInfo pollingInfo2 = pollingInfo;
        boolean z3 = z;
        boolean z4 = z2;
        int i3 = i;
        long j2 = j;
        AbstractC72932td botInfoResponse = abstractC72932td;
        if ((i2 & 1) != 0) {
            z3 = c49517Jc1.LJLIL;
        }
        if ((i2 & 2) != 0) {
            pollingInfo2 = c49517Jc1.LJLILLLLZI;
        }
        if ((i2 & 4) != 0) {
            z4 = c49517Jc1.LJLJI;
        }
        if ((i2 & 8) != 0) {
            i3 = c49517Jc1.LJLJJI;
        }
        if ((i2 & 16) != 0) {
            j2 = c49517Jc1.LJLJJL;
        }
        if ((i2 & 32) != 0) {
            botInfoResponse = c49517Jc1.LJLJJLL;
        }
        if ((i2 & 64) != 0) {
            num2 = c49517Jc1.LJLJL;
        }
        if ((i2 & 128) != 0) {
            str4 = c49517Jc1.LJLJLJ;
        }
        if ((i2 & 256) != 0) {
            str3 = c49517Jc1.LJLJLLL;
        }
        if ((i2 & 512) != 0) {
            bool2 = c49517Jc1.LJLL;
        }
        c49517Jc1.getClass();
        o.LJIIIZ(botInfoResponse, "botInfoResponse");
        return new C49517Jc1(z3, pollingInfo2, z4, i3, j2, botInfoResponse, num2, str4, str3, bool2);
    }
}
