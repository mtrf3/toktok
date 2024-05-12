package X;

import defpackage.s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UWG extends UWI {
    public final String LJLJJI;
    public final String LJLJJL;
    public final Integer LJLJJLL;

    public static /* synthetic */ UWG copy$default(UWG uwg, String str, String str2, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = uwg.getMessage();
        }
        if ((i & 2) != 0) {
            str2 = uwg.getExtraMessage();
        }
        if ((i & 4) != 0) {
            num = uwg.LJLJJLL;
        }
        return uwg.copy(str, str2, num);
    }

    public final String component1() {
        return getMessage();
    }

    public final String component2() {
        return getExtraMessage();
    }

    public final UWG copy(String str, String str2, Integer num) {
        return new UWG(str, str2, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UWG)) {
            return false;
        }
        UWG uwg = (UWG) obj;
        return o.LJ(getMessage(), uwg.getMessage()) && o.LJ(getExtraMessage(), uwg.getExtraMessage()) && o.LJ(this.LJLJJLL, uwg.LJLJJLL);
    }

    public int hashCode() {
        int hashCode = (((getMessage() == null ? 0 : getMessage().hashCode()) * 31) + (getExtraMessage() == null ? 0 : getExtraMessage().hashCode())) * 31;
        Integer num = this.LJLJJLL;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("HotDataFailed(message=");
        LIZ.append(getMessage());
        LIZ.append(", extraMessage=");
        LIZ.append(getExtraMessage());
        LIZ.append(", serverCode=");
        return s0.LIZJ(LIZ, this.LJLJJLL, ')', LIZ);
    }

    @Override // X.UWI
    public String getExtraMessage() {
        return this.LJLJJL;
    }

    @Override // X.UWI, java.lang.Throwable
    public String getMessage() {
        return this.LJLJJI;
    }

    public final Integer getServerCode() {
        return this.LJLJJLL;
    }

    public UWG(String str, String str2, Integer num) {
        super(100, str, str2, null);
        this.LJLJJI = str;
        this.LJLJJL = str2;
        this.LJLJJLL = num;
    }

    public /* synthetic */ UWG(String str, String str2, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? -1 : num);
    }
}
