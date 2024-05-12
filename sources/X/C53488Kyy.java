package X;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import com.bytedance.android.livesdk.util.GlobalContext;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Kyy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53488Kyy extends AbstractC65781Prl implements InterfaceC65784Pro<LinearGradient> {
    public static final C53488Kyy LJLIL = new C53488Kyy();

    public C53488Kyy() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final LinearGradient invoke() {
        int i;
        int i2;
        Integer LJ;
        Integer LJ2;
        Context applicationContext = GlobalContext.getApplicationContext();
        if (applicationContext != null && (LJ2 = C79045V0n.LJ(R.attr.e6, applicationContext)) != null) {
            i = LJ2.intValue();
        } else {
            i = -59548;
        }
        Context applicationContext2 = GlobalContext.getApplicationContext();
        if (applicationContext2 != null && (LJ = C79045V0n.LJ(R.attr.e5, applicationContext2)) != null) {
            i2 = LJ.intValue();
        } else {
            i2 = -1231723;
        }
        return new LinearGradient(0.0f, 0.0f, 100.0f, 100.0f, i, i2, Shader.TileMode.MIRROR);
    }
}
