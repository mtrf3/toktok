package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LevelListDrawable;
import android.text.Html;
import android.widget.TextView;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SGB implements Html.ImageGetter {
    public final Context LIZ;
    public final TextView LIZIZ;

    @Override // android.text.Html.ImageGetter
    public final Drawable getDrawable(String source) {
        o.LJIIIZ(source, "source");
        LevelListDrawable levelListDrawable = new LevelListDrawable();
        W5U.LJIIIIZZ(source).LJIIIZ(new SGC(this, levelListDrawable));
        return levelListDrawable;
    }

    public SGB(Context context, TextView container) {
        o.LJIIIZ(container, "container");
        this.LIZ = context;
        this.LIZIZ = container;
    }
}
