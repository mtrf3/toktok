package X;

import android.content.Context;
import android.util.AttributeSet;
import com.zhiliaoapp.musically.R;

/* renamed from: X.GOy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41460GOy extends C26011AIt {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41460GOy(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C04560Fw.LIZ(context, "context", attributeSet, "attr");
        setLeftTuxIcon(R.raw.icon_film_star);
        if (!GP1.LIZ) {
            setTitle(R.string.c43);
        } else {
            setTitle(R.string.s4r);
        }
        setLabelText("");
    }
}
