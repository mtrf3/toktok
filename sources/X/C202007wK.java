package X;

import android.animation.TimeInterpolator;

/* renamed from: X.7wK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C202007wK extends AbstractC65781Prl implements InterfaceC65784Pro<TimeInterpolator> {
    public static final C202007wK LJLIL = new C202007wK();

    public C202007wK() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final /* bridge */ /* synthetic */ TimeInterpolator invoke() {
        return new TimeInterpolator() { // from class: X.7wL
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                return (float) ((Math.sin(((f - 1) * 6.283185307179586d) / 4) * Math.pow(2.0d, (-10) * f)) + 1);
            }
        };
    }
}
