package X;

import java.util.Arrays;

/* loaded from: classes12.dex */
public enum Q5V {
    NONE(null),
    ONLY_ME("only_me"),
    FRIENDS("friends"),
    EVERYONE("everyone");

    public final String LJLIL;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static Q5V[] valuesCustom() {
        return (Q5V[]) Arrays.copyOf(values(), 4);
    }

    public final String getNativeProtocolAudience() {
        return this.LJLIL;
    }

    Q5V(String str) {
        this.LJLIL = str;
    }
}
