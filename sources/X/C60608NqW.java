package X;

import android.app.Application;
import android.content.Context;
import com.weekend.recorder.api.IAutoRecorder;
import kotlin.jvm.internal.o;

/* renamed from: X.NqW, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60608NqW implements IAutoRecorder {
    public static final /* synthetic */ InterfaceC74236TBo[] LIZ;
    public static final C62822Ol8 LIZIZ;
    public static final C60608NqW LIZJ;

    static {
        TBT tbt = new TBT(C65352Pkq.LIZ(C60608NqW.class), "recorder", "getRecorder()Lcom/weekend/recorder/api/IAutoRecorder;");
        C65352Pkq.LIZ.getClass();
        LIZ = new InterfaceC74236TBo[]{tbt};
        LIZJ = new C60608NqW();
        LIZIZ = C221108m2.LIZIZ(C60609NqX.LJLIL);
    }

    public static IAutoRecorder LIZ() {
        return (IAutoRecorder) LIZIZ.getValue();
    }

    @Override // com.weekend.recorder.api.IAutoRecorder
    public final boolean getWeekEndRecorderSwitch(Context context) {
        o.LJIIJ(context, "context");
        IAutoRecorder LIZ2 = LIZ();
        if (LIZ2 != null && LIZ2.getWeekEndRecorderSwitch(context)) {
            return true;
        }
        return false;
    }

    @Override // com.weekend.recorder.api.IAutoRecorder
    public final void setUserEmailPrefix(String emailPrefix) {
        o.LJIIJ(emailPrefix, "emailPrefix");
        IAutoRecorder LIZ2 = LIZ();
        if (LIZ2 != null) {
            LIZ2.setUserEmailPrefix(emailPrefix);
        }
    }

    @Override // com.weekend.recorder.api.IAutoRecorder
    public final void switchEnable(Context context, boolean z) {
        o.LJIIJ(context, "context");
        IAutoRecorder LIZ2 = LIZ();
        if (LIZ2 != null) {
            LIZ2.switchEnable(context, z);
        }
    }

    @Override // com.weekend.recorder.api.IAutoRecorder
    public final void init(String appId, String channel, Application application, InterfaceC59857NeP networkDepend, InterfaceC39580Fg8 deviceInfoDepend) {
        o.LJIIJ(appId, "appId");
        o.LJIIJ(channel, "channel");
        o.LJIIJ(application, "application");
        o.LJIIJ(networkDepend, "networkDepend");
        o.LJIIJ(deviceInfoDepend, "deviceInfoDepend");
        IAutoRecorder LIZ2 = LIZ();
        if (LIZ2 != null) {
            LIZ2.init(appId, channel, application, networkDepend, deviceInfoDepend);
        }
    }
}
