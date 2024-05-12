package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ss.android.ugc.aweme.search.ecom.data.Product;
import com.zhiliaoapp.musically.R;
import defpackage.a1;

/* renamed from: X.JNf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49059JNf extends LinearLayout {
    public final TextView LJLIL;
    public Product LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49059JNf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int i;
        a1.LJFF(context, "context");
        C49072JNs.LIZ.getClass();
        C62822Ol8 c62822Ol8 = C49072JNs.LIZIZ;
        if (((Number) c62822Ol8.getValue()).intValue() == 1) {
            i = R.layout.cj7;
        } else if (((Number) c62822Ol8.getValue()).intValue() == 2) {
            i = R.layout.cj6;
        } else {
            i = R.layout.cj5;
        }
        LinearLayout.inflate(context, i, this);
        this.LJLIL = (TextView) findViewById(R.id.n4a);
    }
}
