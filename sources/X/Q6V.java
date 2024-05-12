package X;

import java.util.Arrays;
import kotlin.jvm.internal.o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class Q6V implements InterfaceC66439Q5r {
    public static final /* synthetic */ Q6V[] LJLILLLLZI;
    public static final Q6V SHARE_CAMERA_EFFECT;
    public final int LJLIL = 20170417;

    @Override // X.InterfaceC66439Q5r
    public String getAction() {
        return "com.facebook.platform.action.request.CAMERA_EFFECT";
    }

    static {
        Q6V q6v = new Q6V();
        SHARE_CAMERA_EFFECT = q6v;
        LJLILLLLZI = new Q6V[]{q6v};
    }

    public static Q6V[] values() {
        return (Q6V[]) Arrays.copyOf(LJLILLLLZI, 1);
    }

    @Override // X.InterfaceC66439Q5r
    public int getMinVersion() {
        return this.LJLIL;
    }

    public static Q6V valueOf(String value) {
        o.LJIIIZ(value, "value");
        return (Q6V) Enum.valueOf(Q6V.class, value);
    }
}
