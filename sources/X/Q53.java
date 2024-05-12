package X;

import java.util.Arrays;

/* loaded from: classes12.dex */
public enum Q53 {
    SUCCESS("success"),
    CANCEL("cancel"),
    ERROR("error");

    public final String LJLIL;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static Q53[] valuesCustom() {
        return (Q53[]) Arrays.copyOf(values(), 3);
    }

    public final String getLoggingValue() {
        return this.LJLIL;
    }

    Q53(String str) {
        this.LJLIL = str;
    }
}
