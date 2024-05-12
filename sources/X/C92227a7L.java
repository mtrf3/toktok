package X;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.a7L, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92227a7L extends F9E implements C33Q {
    public final EnumC91916a2K LJLIL;
    public final EnumC91974a3G LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final boolean LJLJJL;
    public final String LJLJJLL;
    public final String LJLJL;
    public final String LJLJLJ;
    public final long LJLJLLL;
    public final boolean LJLL;
    public final String LJLLI;
    public final String LJLLILLLL;
    public final String LJLLJ;
    public final boolean LJLLL;
    public final String LJLLLL;
    public final String LJLLLLLL;

    public C92227a7L() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, Boolean.valueOf(this.LJLJJL), this.LJLJJLL, this.LJLJL, this.LJLJLJ, Long.valueOf(this.LJLJLLL), Boolean.valueOf(this.LJLL), this.LJLLI, this.LJLLILLLL, this.LJLLJ, Boolean.valueOf(this.LJLLL), this.LJLLLL, this.LJLLLLLL};
    }

    public /* synthetic */ C92227a7L(int i) {
        this(EnumC91916a2K.LOADING, EnumC91974a3G.NORMAL, "", "", false, "", "", "", 0L, false, "", "", "", false, "", "");
    }

    public C92227a7L(EnumC91916a2K status, EnumC91974a3G inputStatus, String amountDue, String totalDue, boolean z, String suggestAmount, String minAmount, String currency, long j, boolean z2, String inProgressMsg, String inProgressScheme, String repaymentDetailSchema, boolean z3, String errorMessage, String errorToast) {
        o.LJIIIZ(status, "status");
        o.LJIIIZ(inputStatus, "inputStatus");
        o.LJIIIZ(amountDue, "amountDue");
        o.LJIIIZ(totalDue, "totalDue");
        o.LJIIIZ(suggestAmount, "suggestAmount");
        o.LJIIIZ(minAmount, "minAmount");
        o.LJIIIZ(currency, "currency");
        o.LJIIIZ(inProgressMsg, "inProgressMsg");
        o.LJIIIZ(inProgressScheme, "inProgressScheme");
        o.LJIIIZ(repaymentDetailSchema, "repaymentDetailSchema");
        o.LJIIIZ(errorMessage, "errorMessage");
        o.LJIIIZ(errorToast, "errorToast");
        this.LJLIL = status;
        this.LJLILLLLZI = inputStatus;
        this.LJLJI = amountDue;
        this.LJLJJI = totalDue;
        this.LJLJJL = z;
        this.LJLJJLL = suggestAmount;
        this.LJLJL = minAmount;
        this.LJLJLJ = currency;
        this.LJLJLLL = j;
        this.LJLL = z2;
        this.LJLLI = inProgressMsg;
        this.LJLLILLLL = inProgressScheme;
        this.LJLLJ = repaymentDetailSchema;
        this.LJLLL = z3;
        this.LJLLLL = errorMessage;
        this.LJLLLLLL = errorToast;
    }

    public static C92227a7L L(C92227a7L c92227a7L, EnumC91916a2K enumC91916a2K, EnumC91974a3G enumC91974a3G, String str, String str2, boolean z, String str3, String str4, String str5, long j, boolean z2, String str6, String str7, String str8, boolean z3, String str9, int i) {
        String errorMessage;
        String suggestAmount = str3;
        boolean z4 = z;
        String totalDue = str2;
        String amountDue = str;
        boolean z5 = z2;
        EnumC91916a2K status = enumC91916a2K;
        EnumC91974a3G inputStatus = enumC91974a3G;
        String minAmount = str4;
        String currency = str5;
        long j2 = j;
        String inProgressMsg = str6;
        String inProgressScheme = str7;
        boolean z6 = z3;
        String repaymentDetailSchema = str8;
        String errorToast = str9;
        if ((i & 1) != 0) {
            status = c92227a7L.LJLIL;
        }
        if ((i & 2) != 0) {
            inputStatus = c92227a7L.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            amountDue = c92227a7L.LJLJI;
        }
        if ((i & 8) != 0) {
            totalDue = c92227a7L.LJLJJI;
        }
        if ((i & 16) != 0) {
            z4 = c92227a7L.LJLJJL;
        }
        if ((i & 32) != 0) {
            suggestAmount = c92227a7L.LJLJJLL;
        }
        if ((i & 64) != 0) {
            minAmount = c92227a7L.LJLJL;
        }
        if ((i & 128) != 0) {
            currency = c92227a7L.LJLJLJ;
        }
        if ((i & 256) != 0) {
            j2 = c92227a7L.LJLJLLL;
        }
        if ((i & 512) != 0) {
            z5 = c92227a7L.LJLL;
        }
        if ((i & 1024) != 0) {
            inProgressMsg = c92227a7L.LJLLI;
        }
        if ((i & 2048) != 0) {
            inProgressScheme = c92227a7L.LJLLILLLL;
        }
        if ((i & 4096) != 0) {
            repaymentDetailSchema = c92227a7L.LJLLJ;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            z6 = c92227a7L.LJLLL;
        }
        if ((i & 16384) != 0) {
            errorMessage = c92227a7L.LJLLLL;
        } else {
            errorMessage = null;
        }
        if ((i & 32768) != 0) {
            errorToast = c92227a7L.LJLLLLLL;
        }
        c92227a7L.getClass();
        o.LJIIIZ(status, "status");
        o.LJIIIZ(inputStatus, "inputStatus");
        o.LJIIIZ(amountDue, "amountDue");
        o.LJIIIZ(totalDue, "totalDue");
        o.LJIIIZ(suggestAmount, "suggestAmount");
        o.LJIIIZ(minAmount, "minAmount");
        o.LJIIIZ(currency, "currency");
        o.LJIIIZ(inProgressMsg, "inProgressMsg");
        o.LJIIIZ(inProgressScheme, "inProgressScheme");
        o.LJIIIZ(repaymentDetailSchema, "repaymentDetailSchema");
        o.LJIIIZ(errorMessage, "errorMessage");
        o.LJIIIZ(errorToast, "errorToast");
        boolean z7 = z6;
        boolean z8 = z5;
        return new C92227a7L(status, inputStatus, amountDue, totalDue, z4, suggestAmount, minAmount, currency, j2, z8, inProgressMsg, inProgressScheme, repaymentDetailSchema, z7, errorMessage, errorToast);
    }
}
