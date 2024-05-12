package X;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Message;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Ina, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47686Ina implements Handler.Callback {
    public final int LJLIL;
    public final long LJLILLLLZI;
    public final Handler LJLJI;
    public final ConcurrentHashMap<SurfaceTexture, Long> LJLJJI;

    public C47686Ina() {
        Object value = IZ8.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-surfaceTextureStoreMaxSize>(...)");
        this.LJLIL = ((Number) value).intValue();
        Object value2 = IZ8.LJLIL.getValue();
        o.LJIIIIZZ(value2, "<get-surfaceTextureStoreValidTime>(...)");
        this.LJLILLLLZI = ((Number) value2).longValue();
        this.LJLJI = new Handler(C16880lQ.LLJJJJ(), this);
        this.LJLJJI = new ConcurrentHashMap<>();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message msg) {
        o.LJIIIZ(msg, "msg");
        if (msg.what == 0) {
            try {
                new C47685InZ(this).invoke();
                return true;
            } catch (Throwable unused) {
                return true;
            }
        }
        return true;
    }
}
