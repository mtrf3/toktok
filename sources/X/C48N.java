package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.48N, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C48N {
    public static final /* synthetic */ C48N[] LJLIL;
    public static final C48N PROPERTY_CHANGE;
    public static final C48N REAL_MESSAGE;

    public C48N() {
        throw null;
    }

    public static C48N valueOf(String str) {
        return (C48N) V0N.LJJJ(C48N.class, str);
    }

    public static C48N[] values() {
        return (C48N[]) LJLIL.clone();
    }

    public abstract String transformMessageType(String str);

    static {
        C48N c48n = new C48N() { // from class: X.48P
            @Override // X.C48N
            public final String transformMessageType(String str) {
                return str;
            }
        };
        REAL_MESSAGE = c48n;
        C48N c48n2 = new C48N() { // from class: X.48O
            @Override // X.C48N
            public final String transformMessageType(String str) {
                return "fast_emoji";
            }
        };
        PROPERTY_CHANGE = c48n2;
        LJLIL = new C48N[]{c48n, c48n2};
    }

    public C48N(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
    }
}
