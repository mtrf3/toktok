package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LevelListDrawable;
import android.text.Html;
import android.widget.TextView;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SGD implements Html.ImageGetter {
    public final Context LIZ;
    public final TextView LIZIZ;
    public final int LIZJ;
    public final Float LIZLLL;
    public final /* synthetic */ SG5 LJ;

    @Override // android.text.Html.ImageGetter
    public final Drawable getDrawable(String source) {
        o.LJIIIZ(source, "source");
        LevelListDrawable levelListDrawable = new LevelListDrawable();
        W5U.LJIIIIZZ(source).LJIIIZ(new SGE(this, levelListDrawable, this.LJ));
        return levelListDrawable;
    }

    public SGD(SG5 sg5, Context context, TextView container, int i, Float f) {
        o.LJIIIZ(container, "container");
        this.LJ = sg5;
        this.LIZ = context;
        this.LIZIZ = container;
        this.LIZJ = i;
        this.LIZLLL = f;
    }
}
