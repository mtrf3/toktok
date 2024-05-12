package X;

import android.content.Context;
import android.os.Build;
import com.bytedance.common.wschannel.client.AbsWsClientService;

/* renamed from: X.QMg, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66870QMg {
    public final InterfaceC66869QMf LIZ;
    public final Class<? extends AbsWsClientService> LIZIZ;

    public C66870QMg(Context context, Class<? extends AbsWsClientService> cls) {
        if (Build.VERSION.SDK_INT >= 26 && context.getApplicationInfo().targetSdkVersion >= 26) {
            this.LIZ = new C66939QOx(this, context);
        } else {
            this.LIZ = new C66871QMh(this, context);
        }
        this.LIZIZ = cls;
    }
}
