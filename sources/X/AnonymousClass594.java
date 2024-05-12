package X;

import kotlin.jvm.internal.o;

/* renamed from: X.594, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass594 extends C5B4<C5A6> {
    public static final int LJLJJLL;
    public static final int LJLJL;
    public static final int LJLJLJ;
    public static final int LJLJLLL;
    public final AnonymousClass597 LJLJJI;
    public final C5A6 LJLJJL;

    static {
        int LIZ;
        int i;
        int i2;
        int i3;
        if (C1291054w.LIZIZ() != null) {
            Integer LIZIZ = C1291054w.LIZIZ();
            o.LJI(LIZIZ);
            LIZ = LIZIZ.intValue();
        } else {
            LIZ = C134845Qy.LIZ(40.0f);
        }
        LJLJJLL = LIZ;
        Integer num = null;
        if (C1291054w.LJ().LJJII != null && Integer.valueOf(C134855Qz.LIZ(r0.intValue())) != null) {
            if (C1291054w.LJ().LJJII != null) {
                num = Integer.valueOf(C134855Qz.LIZ(r0.intValue()));
            }
            o.LJI(num);
            i = num.intValue();
        } else {
            i = C1300758p.LIZJ;
        }
        LJLJL = i;
        if (C1291054w.LIZIZ() != null && (C1300758p.LIZLLL - LIZ) / 2 < 0) {
            i2 = 0;
        } else {
            i2 = (C1300758p.LIZLLL - LIZ) / 2;
        }
        LJLJLJ = i2;
        if (C1291054w.LIZIZ() != null && (C1300758p.LIZLLL - LIZ) / 2 < 0) {
            Integer num2 = C1291054w.LJ().LJJIFFI;
            o.LJI(num2);
            i3 = num2.intValue();
        } else {
            i3 = C1300758p.LIZLLL - i2;
        }
        LJLJLLL = i3;
    }

    @Override // X.C5B4
    public final /* bridge */ /* synthetic */ C5A6 LIZ() {
        return this.LJLJJL;
    }

    @Override // X.C5B4, X.C5A5
    public final void setClipping(boolean z) {
        super.setClipping(z);
        if (z) {
            this.LJLJJI.LIZIZ();
        }
    }

    @Override // X.C5B4, X.C5A5
    public final void setTimelineScale(float f) {
        super.setTimelineScale(f);
        this.LJLJJI.LIZIZ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass594(C29S context, AnonymousClass592 anonymousClass592) {
        super(context);
        o.LJIIIZ(context, "context");
        this.LJLJJI = anonymousClass592;
        C5A6 c5a6 = new C5A6(context);
        c5a6.setFrameFetcher$editor_trackpanel_release(new C59J(anonymousClass592));
        this.LJLJJL = c5a6;
    }
}
