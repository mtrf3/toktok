package X;

import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UWE extends UWI {
    public final String LJLJJI;
    public final String LJLJJL;

    public static /* synthetic */ UWE copy$default(UWE uwe, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = uwe.getMessage();
        }
        if ((i & 2) != 0) {
            str2 = uwe.getExtraMessage();
        }
        return uwe.copy(str, str2);
    }

    public final String component1() {
        return getMessage();
    }

    public final String component2() {
        return getExtraMessage();
    }

    public final UWE copy(String str, String str2) {
        return new UWE(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UWE)) {
            return false;
        }
        UWE uwe = (UWE) obj;
        return o.LJ(getMessage(), uwe.getMessage()) && o.LJ(getExtraMessage(), uwe.getExtraMessage());
    }

    public int hashCode() {
        return ((getMessage() == null ? 0 : getMessage().hashCode()) * 31) + (getExtraMessage() != null ? getExtraMessage().hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Other(message=");
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

    public UWE(String str, String str2) {
        super(-1, str, str2, null);
        this.LJLJJI = str;
        this.LJLJJL = str2;
    }
}
