package X;

import com.ss.ugc.android.editor.track.TrackState;
import kotlin.jvm.internal.o;

/* renamed from: X.50s, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1280250s extends F9E {
    public final TrackState LJLIL;
    public final float LJLILLLLZI;
    public final float LJLJI;
    public final float LJLJJI;
    public final float LJLJJL;
    public final boolean LJLJJLL;
    public final float LJLJL;
    public final float LJLJLJ;
    public final float LJLJLLL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Float.valueOf(this.LJLILLLLZI), Float.valueOf(this.LJLJI), Float.valueOf(this.LJLJJI), Float.valueOf(this.LJLJJL), Boolean.valueOf(this.LJLJJLL), Float.valueOf(this.LJLJL), Float.valueOf(this.LJLJLJ), Float.valueOf(this.LJLJLLL)};
    }

    public /* synthetic */ C1280250s(TrackState trackState, float f, float f2, float f3) {
        this(trackState, f, 0.0f, f2, f3, true, 0.0f, 0.0f, 0.0f);
    }

    public static C1280250s L(C1280250s c1280250s, TrackState trackState, float f, float f2, float f3, float f4, boolean z, int i) {
        float f5;
        float f6;
        float f7;
        float f8 = f;
        TrackState trackState2 = trackState;
        float f9 = f2;
        float f10 = f3;
        float f11 = f4;
        boolean z2 = z;
        if ((i & 1) != 0) {
            trackState2 = c1280250s.LJLIL;
        }
        if ((i & 2) != 0) {
            f8 = c1280250s.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            f9 = c1280250s.LJLJI;
        }
        if ((i & 8) != 0) {
            f10 = c1280250s.LJLJJI;
        }
        if ((i & 16) != 0) {
            f11 = c1280250s.LJLJJL;
        }
        if ((i & 32) != 0) {
            z2 = c1280250s.LJLJJLL;
        }
        if ((i & 64) != 0) {
            f5 = c1280250s.LJLJL;
        } else {
            f5 = 0.0f;
        }
        if ((i & 128) != 0) {
            f6 = c1280250s.LJLJLJ;
        } else {
            f6 = 0.0f;
        }
        if ((i & 256) != 0) {
            f7 = c1280250s.LJLJLLL;
        } else {
            f7 = 0.0f;
        }
        o.LJIIIZ(trackState2, "trackState");
        return new C1280250s(trackState2, f8, f9, f10, f11, z2, f5, f6, f7);
    }

    public C1280250s(TrackState trackState, float f, float f2, float f3, float f4, boolean z, float f5, float f6, float f7) {
        o.LJIIIZ(trackState, "trackState");
        this.LJLIL = trackState;
        this.LJLILLLLZI = f;
        this.LJLJI = f2;
        this.LJLJJI = f3;
        this.LJLJJL = f4;
        this.LJLJJLL = z;
        this.LJLJL = f5;
        this.LJLJLJ = f6;
        this.LJLJLLL = f7;
    }
}
