package X;

import android.content.Context;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LH4 extends LCP {
    public final LH6 LIZLLL;
    public final L7P LJ;
    public final LH5 LJFF;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LH4(Context context, String tag, String title, LH6 icon) {
        super(context, tag, title);
        LH5 defaultStatus;
        L7P defaultBackground = L7P.DARK;
        if (o.LJ(tag, "HOME")) {
            defaultStatus = LH5.SELECT;
        } else {
            defaultStatus = LH5.UNSELECT;
        }
        o.LJIIIZ(context, "context");
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(title, "title");
        o.LJIIIZ(icon, "icon");
        o.LJIIIZ(defaultBackground, "defaultBackground");
        o.LJIIIZ(defaultStatus, "defaultStatus");
        this.LIZLLL = icon;
        this.LJ = defaultBackground;
        this.LJFF = defaultStatus;
    }
}
