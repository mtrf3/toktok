package X;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.6l6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC169566l6 implements Executor {
    public static final EnumC169566l6 LJLIL;
    public static final /* synthetic */ EnumC169566l6[] LJLILLLLZI;

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }

    static {
        EnumC169566l6 enumC169566l6 = new EnumC169566l6();
        LJLIL = enumC169566l6;
        LJLILLLLZI = new EnumC169566l6[]{enumC169566l6};
    }

    public static EnumC169566l6[] values() {
        return (EnumC169566l6[]) LJLILLLLZI.clone();
    }

    public static EnumC169566l6 valueOf(String str) {
        return (EnumC169566l6) V0N.LJJJ(EnumC169566l6.class, str);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
