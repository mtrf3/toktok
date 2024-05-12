package X;

import android.graphics.drawable.Drawable;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class C0M {
    public boolean LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final LiveMode LJ;
    public boolean LJFF;
    public final Drawable LJI;
    public final Drawable LJII;

    public /* synthetic */ C0M(int i, int i2, int i3, LiveMode liveMode) {
        this(i, i2, i3, liveMode, false, null, null);
    }

    public C0M(int i, int i2, int i3, LiveMode liveMode, boolean z, Drawable drawable, Drawable drawable2) {
        o.LJIIIZ(liveMode, "liveMode");
        this.LIZ = false;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = i3;
        this.LJ = liveMode;
        this.LJFF = z;
        this.LJI = drawable;
        this.LJII = drawable2;
    }
}
