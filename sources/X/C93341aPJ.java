package X;

import com.bytedance.pitaya.log.PitayaLogger;
import com.bytedance.pitaya.thirdcomponent.stddelegate.PitayaInnerServiceProvider;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.aPJ, reason: case insensitive filesystem */
/* loaded from: classes30.dex */
public final class C93341aPJ extends AbstractC65781Prl implements InterfaceC65784Pro<HashMap<Class<?>, Object>> {
    public static final C93341aPJ LJLIL = new C93341aPJ();

    public C93341aPJ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final HashMap<Class<?>, Object> invoke() {
        HashMap<Class<?>, Object> hashMap = new HashMap<>();
        for (Map.Entry<String, String> entry : PitayaInnerServiceProvider.INSTANCE.getServiceMap().entrySet()) {
            try {
                Class<?> cls = Class.forName(entry.getKey());
                Class<?> cls2 = Class.forName(entry.getValue());
                hashMap.put(cls, cls2.newInstance());
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("create instance ");
                LIZ.append(cls.getName());
                LIZ.append(" -> ");
                LIZ.append(cls2.getName());
                PitayaLogger.LIZ("PTY_SER_PRO", X1D.LIZIZ(LIZ));
            } catch (Throwable th) {
                PitayaLogger.LJ(th, null, 6);
            }
        }
        if (PitayaInnerServiceProvider.INSTANCE.getServiceMap().isEmpty()) {
            PitayaLogger.LIZ("PTY_SER_PRO", "absClass to implClass map is empty, is you using tob version?");
        }
        return hashMap;
    }
}
