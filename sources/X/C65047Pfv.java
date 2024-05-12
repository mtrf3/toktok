package X;

import com.bytedance.android.livesdk.livesetting.message.LiveUplinkStrategySetting;

/* renamed from: X.Pfv, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65047Pfv implements InterfaceC65049Pfx {
    public final /* synthetic */ C65045Pft LIZ;

    public C65047Pfv(C65045Pft c65045Pft) {
        this.LIZ = c65045Pft;
    }

    @Override // X.InterfaceC65049Pfx
    public final boolean LIZIZ(Class cls) {
        String LJLLJ;
        java.util.Map<String, java.util.Map<String, Long>> uplinkApiAllowedList = LiveUplinkStrategySetting.INSTANCE.getUplinkApiAllowedList();
        this.LIZ.getClass();
        if (cls == null) {
            LJLLJ = "";
        } else {
            LJLLJ = C16880lQ.LJLLJ(cls);
        }
        return uplinkApiAllowedList.containsKey(LJLLJ);
    }

    @Override // X.InterfaceC65049Pfx
    public final <T> T LIZ(Class<T> cls, T t) {
        return (T) this.LIZ.LIZIZ(cls, t);
    }
}
