package X;

import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import kotlin.jvm.internal.o;

/* renamed from: X.7v6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C201247v6 extends AbstractC65781Prl implements InterfaceC65784Pro<Interpolator> {
    public static final C201247v6 LJLIL = new C201247v6();

    public C201247v6() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Interpolator invoke() {
        PathInterpolator LIZIZ = C18950ol.LIZIZ(0.42f, 0.0f, 0.58f, 1.0f);
        o.LJIIIIZZ(LIZIZ, "create(\n            0.42…            1f,\n        )");
        return LIZIZ;
    }
}