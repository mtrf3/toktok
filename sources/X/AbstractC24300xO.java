package X;

/* renamed from: X.0xO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC24300xO {
    public long LIZ;
    public long LIZIZ;
    public String LIZJ;
    public StackTraceElement[] LIZLLL;

    public final String LIZ() {
        StringBuilder sb = new StringBuilder();
        for (int i = 9; i < this.LIZLLL.length; i++) {
            sb.append("\tat ");
            sb.append(this.LIZLLL[i].toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
