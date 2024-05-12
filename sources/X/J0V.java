package X;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class J0V implements Callable<List<Object>>, InterfaceC48038ItG<Object, List<Object>> {
    public static final J0V INSTANCE;
    public static final /* synthetic */ J0V[] LJLIL;

    static {
        J0V j0v = new J0V();
        INSTANCE = j0v;
        LJLIL = new J0V[]{j0v};
    }

    public static J0V[] values() {
        return (J0V[]) LJLIL.clone();
    }

    @Override // java.util.concurrent.Callable
    public List<Object> call() {
        return new ArrayList();
    }

    public static <T> Callable<List<T>> asCallable() {
        return INSTANCE;
    }

    public static <T, O> InterfaceC48038ItG<O, List<T>> asFunction() {
        return INSTANCE;
    }

    public static J0V valueOf(String str) {
        return (J0V) V0N.LJJJ(J0V.class, str);
    }

    @Override // X.InterfaceC48038ItG
    public List<Object> apply(Object obj) {
        return new ArrayList();
    }
}
