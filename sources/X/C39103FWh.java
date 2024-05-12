package X;

import android.os.Handler;
import android.os.Message;
import com.bytedance.mt.protector.impl.PatternProtector;
import java.util.regex.Pattern;

/* renamed from: X.FWh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39103FWh implements InterfaceC39114FWs {
    public static final Pattern LIZ = PatternProtector.compile("(\\$\\d+)+$");

    @Override // X.InterfaceC39114FWs
    public final boolean LIZ(Message message) {
        Handler target = message.getTarget();
        if (target == null) {
            return false;
        }
        String name = target.getClass().getName();
        if (name.contains("android.graphics.SurfaceTexture")) {
            return false;
        }
        return LIZ.matcher(name).find();
    }
}
