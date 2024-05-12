package X;

import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.jvm.internal.o;

/* renamed from: X.17C, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C17C {
    public static final /* synthetic */ int LIZ = 0;

    public abstract void LIZ(RectF rectF, int i, int i2, float f, float f2, boolean z);

    public abstract float LIZJ(int i);

    public C17C() {
        C15380j0.LIZ(10.0f);
        Float valueOf = Float.valueOf(0.0f);
        C47261Igj.LJII(valueOf, valueOf, valueOf);
        C15380j0.LIZ(3.0f);
        C15380j0.LIZ(5.5f);
    }

    public float LIZLLL(int i, Rect lyricsRect) {
        o.LJIIIZ(lyricsRect, "lyricsRect");
        return (lyricsRect.height() - i) - 0.0f;
    }
}
