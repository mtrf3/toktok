package X;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.ITz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C46687ITz {
    public static final /* synthetic */ int LIZIZ = 0;
    public final ConcurrentHashMap<String, AbstractC48510J2c> LIZ = new ConcurrentHashMap<>();

    public AbstractC48510J2c LIZ(String serviceName) {
        o.LJIIIZ(serviceName, "serviceName");
        return null;
    }

    public AbstractC48510J2c LIZIZ(String str) {
        return this.LIZ.get(str);
    }
}
