package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestUseLinkmicAloggerSetting;

/* renamed from: X.Bqn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30049Bqn {
    public static final /* synthetic */ int LIZJ = 0;
    public final String LIZ;
    public C29422Bgg LIZIZ;

    public C30049Bqn(String str) {
        String LIZIZ;
        this.LIZ = str;
        if (!TextUtils.equals(str, "start_co_host") && !TextUtils.equals(str, "start_match") && !TextUtils.equals(str, "start_rematch")) {
            if (MultiGuestUseLinkmicAloggerSetting.INSTANCE.isEnable()) {
                StackTraceElement LJ = C32014ChO.LJ();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(U44.BIZ.getValue());
                LIZ.append('_');
                LIZ.append("LinkStartEvent");
                LIZ.append('_');
                LIZ.append(LJ.getLineNumber());
                LIZIZ = X1D.LIZIZ(LIZ);
            } else {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(U44.BIZ.getValue());
                LIZ2.append('_');
                LIZ2.append("LinkStartEvent");
                LIZ2.append('_');
                LIZ2.append(17);
                LIZIZ = X1D.LIZIZ(LIZ2);
            }
            C32014ChO.LIZJ(LIZIZ, "type error", null);
        }
    }
}
