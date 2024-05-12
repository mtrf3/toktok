package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LevelListDrawable;
import android.text.Html;
import android.widget.TextView;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SGA implements Html.ImageGetter {
    public final Context LIZ;
    public final TextView LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final /* synthetic */ SG4 LJFF;

    @Override // android.text.Html.ImageGetter
    public final Drawable getDrawable(String source) {
        o.LJIIIZ(source, "source");
        LevelListDrawable levelListDrawable = new LevelListDrawable();
        W5U.LJIIIIZZ(source).LJIIIZ(new SG9(this.LJFF, this, levelListDrawable));
        return levelListDrawable;
    }

    public SGA(SG4 sg4, Context context, TextView container, int i, int i2, int i3) {
        o.LJIIIZ(container, "container");
        this.LJFF = sg4;
        this.LIZ = context;
        this.LIZIZ = container;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = i3;
    }
}
