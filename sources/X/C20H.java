package X;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.20H, reason: invalid class name */
/* loaded from: classes.dex */
public final class C20H extends AbstractC65781Prl implements InterfaceC65784Pro<C1R9> {
    public static final C20H LJLIL = new C20H();

    public C20H() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1R9] */
    @Override // X.InterfaceC65784Pro
    public final C1R9 invoke() {
        return new InterfaceC11100c6() { // from class: X.1R9
            public final ConcurrentHashMap<Class<? extends InterfaceC11080c4>, InterfaceC11080c4> LIZIZ = new ConcurrentHashMap<>();

            @Override // X.InterfaceC11100c6
            public final <T extends InterfaceC11080c4> T LIZIZ(Class<T> cls) {
                T t = (T) this.LIZIZ.get(cls);
                if (cls.isInstance(t)) {
                    o.LJII(t, "null cannot be cast to non-null type T of com.bytedance.android.live.experiment.impl.ExperimentManager.getExperiment");
                    return t;
                }
                return null;
            }

            @Override // X.InterfaceC11100c6
            public final InterfaceC11080c4 LIZ(Class cls, C77704Uea c77704Uea) {
                InterfaceC11080c4 LIZIZ = LIZIZ(cls);
                if (LIZIZ == null) {
                    return c77704Uea;
                }
                return LIZIZ;
            }

            @Override // X.InterfaceC11100c6
            public final <T extends InterfaceC11080c4> void LIZJ(Class<T> cls, T t) {
                this.LIZIZ.put(cls, t);
            }
        };
    }
}
