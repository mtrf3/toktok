package X;

/* renamed from: X.ODf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC61539ODf<IN, OUT> extends AbstractC61551ODr<IN, OUT> {
    public java.util.Map<String, OEA> LJI;

    @Override // X.AbstractC61551ODr
    public final void LIZ(Object... objArr) {
        Object obj;
        if (objArr != null && objArr.length == 1 && (obj = objArr[0]) != null) {
            try {
                this.LJI = (java.util.Map) obj;
                return;
            } catch (ClassCastException e) {
                throw new IllegalArgumentException(e);
            }
        }
        throw new IllegalStateException("args error");
    }
}
