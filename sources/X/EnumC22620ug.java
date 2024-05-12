package X;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.0ug, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC22620ug implements Executor {
    public static final EnumC22620ug LJLIL;
    public static final /* synthetic */ EnumC22620ug[] LJLILLLLZI;

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }

    static {
        EnumC22620ug enumC22620ug = new EnumC22620ug();
        LJLIL = enumC22620ug;
        LJLILLLLZI = new EnumC22620ug[]{enumC22620ug};
    }

    public static EnumC22620ug[] values() {
        return (EnumC22620ug[]) LJLILLLLZI.clone();
    }

    public static EnumC22620ug valueOf(String str) {
        return (EnumC22620ug) V0N.LJJJ(EnumC22620ug.class, str);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
