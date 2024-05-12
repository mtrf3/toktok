package X;

/* loaded from: classes16.dex */
public final class YIA extends RuntimeException {
    public final YI5 zzavo() {
        return new YI5(getMessage());
    }

    public YIA(YIZ yiz) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }
}
