package X;

import com.google.gson.Gson;
import com.google.gson.e;
import com.google.gson.j;
import com.google.gson.m;
import com.google.gson.p;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.AqS49S1000000_11;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class Q1T {
    public static final Lock LIZLLL;
    public static final Lock LJ;
    public static final Gson LJFF;
    public static final Q1T LJI = new Q1T();
    public static final java.util.Map<String, Q1R> LIZ = new LinkedHashMap();
    public static final EnumC62492cn LIZIZ = EnumC62492cn.PARSE_AT_STORE;
    public static String LIZJ = "";

    static {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        Lock readLock = reentrantReadWriteLock.readLock();
        o.LJFF(readLock, "rwLock.readLock()");
        LIZLLL = readLock;
        Lock writeLock = reentrantReadWriteLock.writeLock();
        o.LJFF(writeLock, "rwLock.writeLock()");
        LJ = writeLock;
        LJFF = new Gson();
    }

    public final String toString() {
        m mVar;
        try {
            mVar = new m();
            e eVar = new e();
            eVar.LJIILIIL = true;
            Gson LIZ2 = eVar.LIZ();
            mVar.LJJII("strategy_set_map", LIZ2.LJIJJLI(null));
            m mVar2 = new m();
            for (Map.Entry entry : ((LinkedHashMap) LIZ).entrySet()) {
                mVar2.LJJII((String) entry.getKey(), (j) LIZ2.LJI(((Q1R) entry.getValue()).toString(), m.class));
            }
            mVar.LJJII("strategy_set", mVar2);
            mVar.LJJII("signature", new p(LIZJ));
        } catch (Throwable th) {
            C3C4 LIZ3 = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ3);
            C3C5.m10exceptionOrNullimpl(LIZ3);
            mVar = new m();
        }
        String jVar = mVar.toString();
        o.LJFF(jVar, "toJsonObject().toString()");
        return jVar;
    }

    public static Q1R LIZ(String strategyName) {
        o.LJIIJ(strategyName, "strategyName");
        return (Q1R) LIZIZ(new AqS49S1000000_11(strategyName, 3));
    }

    public static Object LIZIZ(InterfaceC65784Pro interfaceC65784Pro) {
        try {
            Lock lock = LIZLLL;
            if (lock.tryLock()) {
                try {
                    Object invoke = interfaceC65784Pro.invoke();
                    lock.unlock();
                    return invoke;
                } catch (Throwable th) {
                    LIZLLL.unlock();
                    throw th;
                }
            }
            return null;
        } catch (InterruptedException unused) {
            return null;
        }
    }
}
