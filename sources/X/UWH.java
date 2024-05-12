package X;

import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UWH extends UWI {
    public final String LJLJJI;
    public final String LJLJJL;

    public static /* synthetic */ UWH copy$default(UWH uwh, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = uwh.getMessage();
        }
        if ((i & 2) != 0) {
            str2 = uwh.getExtraMessage();
        }
        return uwh.copy(str, str2);
    }

    public final String component1() {
        return getMessage();
    }

    public final String component2() {
        return getExtraMessage();
    }

    public final UWH copy(String str, String str2) {
        return new UWH(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UWH)) {
            return false;
        }
        UWH uwh = (UWH) obj;
        return o.LJ(getMessage(), uwh.getMessage()) && o.LJ(getExtraMessage(), uwh.getExtraMessage());
    }

    public int hashCode() {
        return ((getMessage() == null ? 0 : getMessage().hashCode()) * 31) + (getExtraMessage() != null ? getExtraMessage().hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MergeDataFailed(message=");
        LIZ.append(getMessage());
        LIZ.append(", extraMessage=");
        LIZ.append(getExtraMessage());
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.UWI
    public String getExtraMessage() {
        return this.LJLJJL;
    }

    @Override // X.UWI, java.lang.Throwable
    public String getMessage() {
        return this.LJLJJI;
    }

    public UWH(String str, String str2) {
        super(102, str, str2, null);
        this.LJLJJI = str;
        this.LJLJJL = str2;
    }
}
