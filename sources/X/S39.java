package X;

import android.view.View;
import kotlin.jvm.internal.AqS162S0100000_12;
import yv5.b;
import yv5.b.a;

/* loaded from: classes13.dex */
public abstract class S39<VIEW extends View, DATA, STYLE, STYLE_HANDLER extends b.a<STYLE>> extends S2R<VIEW, DATA> {
    public STYLE_HANDLER LIZLLL;
    public final C62822Ol8 LJ;

    public abstract STYLE_HANDLER LIZLLL();

    public abstract STYLE_HANDLER LJ(STYLE style);

    public final STYLE_HANDLER LJFF() {
        STYLE_HANDLER style_handler = this.LIZLLL;
        if (style_handler == null) {
            return (S3G) this.LJ.getValue();
        }
        return style_handler;
    }

    public S39(VIEW view) {
        super(view);
        this.LJ = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1254));
    }

    public final void LJI(STYLE style) {
        this.LIZLLL = LJ(style);
    }
}
