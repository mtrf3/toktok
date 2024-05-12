package X;

import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YTW {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C87432YTc.LJLIL);

    public static C87434YTe LIZ() {
        return (C87434YTe) LIZ.getValue();
    }

    public static final void LIZLLL(String str) {
        C87434YTe LIZ2 = LIZ();
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("audio device connected, scenario: ");
        LIZ3.append(str);
        LIZ3.append(", try to resume");
        LIZ2.LJIIIIZZ(X1D.LIZIZ(LIZ3));
    }

    public static final void LIZIZ(Boolean bool, String scenario) {
        o.LJIIIZ(scenario, "scenario");
        C87434YTe LIZ2 = LIZ();
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("audio reconnected, scenario: ");
        LIZ3.append(scenario);
        LIZ3.append(",  will resume: ");
        LIZ3.append(bool);
        LIZ2.LJIIIIZZ(X1D.LIZIZ(LIZ3));
    }

    public static final void LIZJ(Boolean bool, String str) {
        C87434YTe LIZ2 = LIZ();
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("scenario: ");
        LIZ3.append(str);
        LIZ3.append(", resuming result: ");
        LIZ3.append(bool);
        LIZ2.LJIIIIZZ(X1D.LIZIZ(LIZ3));
    }
}
