package X;

import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class EZ0 extends EZ6 {
    public final /* synthetic */ LinkedHashMap<String, String> LIZ;
    public final /* synthetic */ C76732zl LIZIZ;
    public final /* synthetic */ C68322mC<String> LIZJ;
    public final /* synthetic */ C68322mC<Throwable> LIZLLL;

    @Override // X.EZ6
    public final String LIZ() {
        return this.LIZJ.element;
    }

    @Override // X.EZ6
    public final Throwable LIZIZ() {
        return this.LIZLLL.element;
    }

    @Override // X.EZ6
    public final Integer LIZJ() {
        return Integer.valueOf(this.LIZIZ.element);
    }

    @Override // X.EZ6
    public final LinkedHashMap<String, String> LIZLLL() {
        return this.LIZ;
    }

    public EZ0(LinkedHashMap linkedHashMap, C76732zl c76732zl, C68322mC c68322mC, C68322mC c68322mC2) {
        this.LIZ = linkedHashMap;
        this.LIZIZ = c76732zl;
        this.LIZJ = c68322mC;
        this.LIZLLL = c68322mC2;
    }
}
