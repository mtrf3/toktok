package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public abstract class UWI extends Exception {
    public static final UWJ Companion = new UWJ();
    public final int LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;

    public final int getClientCode() {
        return this.LJLIL;
    }

    public String getExtraMessage() {
        return this.LJLILLLLZI;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.LJLJI;
    }

    public UWI(int i, String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this.LJLIL = i;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
    }
}
