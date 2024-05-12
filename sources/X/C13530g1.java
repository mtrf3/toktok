package X;

import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* renamed from: X.0g1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13530g1 {
    public static final C21D LIZJ = new C21D(CoroutineExceptionHandler.LJJJJIZL);
    public final C13420fq LIZ;
    public final C64962gm LIZIZ;

    public C13530g1(C13420fq asyncTypefaceCache) {
        MBB injectedContext = MBB.INSTANCE;
        o.LJIIIZ(asyncTypefaceCache, "asyncTypefaceCache");
        o.LJIIIZ(injectedContext, "injectedContext");
        this.LIZ = asyncTypefaceCache;
        this.LIZIZ = C48841JEv.LIZ(LIZJ.plus(injectedContext).plus(new C60741Nsf((InterfaceC79150V4o) injectedContext.get(InterfaceC79150V4o.LJJJJJ))));
    }
}
