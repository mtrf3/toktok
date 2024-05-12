package X;

import java.util.HashSet;
import java.util.concurrent.Callable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.6an, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC163176an implements Callable<java.util.Set<Object>> {
    public static final EnumC163176an LJLIL;
    public static final /* synthetic */ EnumC163176an[] LJLILLLLZI;

    static {
        EnumC163176an enumC163176an = new EnumC163176an();
        LJLIL = enumC163176an;
        LJLILLLLZI = new EnumC163176an[]{enumC163176an};
    }

    public static EnumC163176an[] values() {
        return (EnumC163176an[]) LJLILLLLZI.clone();
    }

    @Override // java.util.concurrent.Callable
    public final java.util.Set<Object> call() {
        return new HashSet();
    }

    public static EnumC163176an valueOf(String str) {
        return (EnumC163176an) V0N.LJJJ(EnumC163176an.class, str);
    }
}
