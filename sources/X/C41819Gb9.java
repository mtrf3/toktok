package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.Gb9, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C41819Gb9 extends RuntimeException {
    public final String LJLIL;
    public final Throwable LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: Multi-variable type inference failed */
    public C41819Gb9() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C41819Gb9(String str) {
        this(str, null, 2, 0 == true ? 1 : 0);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.LJLILLLLZI;
    }

    public final int getErrorCode() {
        return this.LJLJI;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.LJLIL;
    }

    public final String optMessage(String defaultValue) {
        o.LJIIIZ(defaultValue, "defaultValue");
        String message = getMessage();
        if (message == null) {
            return defaultValue;
        }
        return message;
    }

    public final void setErrorCode(int i) {
        this.LJLJI = i;
    }

    public C41819Gb9(String str, Throwable th) {
        this.LJLIL = str;
        this.LJLILLLLZI = th;
        this.LJLJI = LiveLayoutPreloadThreadPriority.DEFAULT;
    }

    public /* synthetic */ C41819Gb9(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : th);
    }

    public static /* synthetic */ String optMessage$default(C41819Gb9 c41819Gb9, String str, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                str = "";
            }
            return c41819Gb9.optMessage(str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: optMessage");
    }
}
