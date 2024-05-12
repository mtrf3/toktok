package X;

import java.util.Arrays;
import kotlin.jvm.internal.o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class Q6W implements InterfaceC66439Q5r {
    public static final /* synthetic */ Q6W[] LJLILLLLZI;
    public static final Q6W SHARE_STORY_ASSET;
    public final int LJLIL = 20170417;

    @Override // X.InterfaceC66439Q5r
    public String getAction() {
        return "com.facebook.platform.action.request.SHARE_STORY";
    }

    static {
        Q6W q6w = new Q6W();
        SHARE_STORY_ASSET = q6w;
        LJLILLLLZI = new Q6W[]{q6w};
    }

    public static Q6W[] values() {
        return (Q6W[]) Arrays.copyOf(LJLILLLLZI, 1);
    }

    @Override // X.InterfaceC66439Q5r
    public int getMinVersion() {
        return this.LJLIL;
    }

    public static Q6W valueOf(String value) {
        o.LJIIIZ(value, "value");
        return (Q6W) Enum.valueOf(Q6W.class, value);
    }
}
