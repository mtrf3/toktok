package X;

import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import kotlin.jvm.internal.o;

/* renamed from: X.7vB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C201297vB extends AbstractC65781Prl implements InterfaceC65784Pro<Interpolator> {
    public static final C201297vB LJLIL = new C201297vB();

    public C201297vB() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Interpolator invoke() {
        PathInterpolator LIZIZ = C18950ol.LIZIZ(0.25f, 0.0f, 0.25f, 1.0f);
        o.LJIIIIZZ(LIZIZ, "create(\n            0.25…            1f,\n        )");
        return LIZIZ;
    }
}
