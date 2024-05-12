package X;

/* loaded from: classes16.dex */
public final class XJG {
    public static final ThreadLocal<AbstractC78624UtQ> LIZ = new ThreadLocal<>();

    public static AbstractC78624UtQ LIZ() {
        ThreadLocal<AbstractC78624UtQ> threadLocal = LIZ;
        AbstractC78624UtQ abstractC78624UtQ = threadLocal.get();
        if (abstractC78624UtQ == null) {
            XJI xji = new XJI(C16880lQ.LLLLIIIILLL());
            threadLocal.set(xji);
            return xji;
        }
        return abstractC78624UtQ;
    }
}
