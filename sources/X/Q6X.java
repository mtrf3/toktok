package X;

import java.util.Arrays;
import kotlin.jvm.internal.o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class Q6X implements InterfaceC66439Q5r {
    public static final /* synthetic */ Q6X[] LJLILLLLZI;
    public static final Q6X OG_ACTION_DIALOG;
    public final int LJLIL = 20130618;

    @Override // X.InterfaceC66439Q5r
    public String getAction() {
        return "com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG";
    }

    static {
        Q6X q6x = new Q6X();
        OG_ACTION_DIALOG = q6x;
        LJLILLLLZI = new Q6X[]{q6x};
    }

    public static Q6X[] values() {
        return (Q6X[]) Arrays.copyOf(LJLILLLLZI, 1);
    }

    @Override // X.InterfaceC66439Q5r
    public int getMinVersion() {
        return this.LJLIL;
    }

    public static Q6X valueOf(String value) {
        o.LJIIIZ(value, "value");
        return (Q6X) Enum.valueOf(Q6X.class, value);
    }
}
