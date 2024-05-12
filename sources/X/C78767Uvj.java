package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Uvj, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78767Uvj extends T59 {
    public final int LJLJJI;
    public final View LJLJJL;
    public Drawable LJLJJLL;

    @Override // android.text.style.ImageSpan, android.text.style.DynamicDrawableSpan
    public final Drawable getDrawable() {
        Drawable drawable = this.LJLJJLL;
        if (drawable == null) {
            Drawable drawable2 = super.getDrawable();
            o.LJIIIIZZ(drawable2, "super.getDrawable()");
            return drawable2;
        }
        return drawable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C78767Uvj(Drawable drawable, int i, UrlModel urlModel, View descView) {
        super(drawable);
        o.LJIIIZ(descView, "descView");
        this.LJLJJI = i;
        this.LJLJJL = descView;
        C78765Uvh.LJIILJJIL(urlModel, i, i, new C78768Uvk(this));
    }
}
