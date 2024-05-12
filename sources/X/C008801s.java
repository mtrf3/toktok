package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.01s, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C008801s extends ListView {
    public final int LJLIL;
    public final int LJLILLLLZI;

    public C008801s(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.b3l, R.attr.b3r});
        this.LJLILLLLZI = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.LJLIL = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
