package X;

import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import kotlin.jvm.internal.o;

/* renamed from: X.7vA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C201287vA extends AbstractC65781Prl implements InterfaceC65784Pro<Interpolator> {
    public static final C201287vA LJLIL = new C201287vA();

    public C201287vA() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Interpolator invoke() {
        PathInterpolator LIZIZ = C18950ol.LIZIZ(0.25f, 0.0f, 0.25f, 1.0f);
        o.LJIIIIZZ(LIZIZ, "create(\n            0.25…            1f,\n        )");
        return LIZIZ;
    }
}
