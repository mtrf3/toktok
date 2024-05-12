package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.4n5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C119834n5 extends ConstraintLayout {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C119834n5(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C119834n5(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.dnb, this, true);
        ImageView imageView = (ImageView) findViewById(R.id.ega);
        Bitmap decodeResource = BitmapFactory.decodeResource(C15380j0.LJIIJ(), R.drawable.co2);
        o.LJIIIIZZ(decodeResource, "decodeResource(ResUtil.g…wish_list_anchor_not_set)");
        imageView.setImageBitmap(C119824n4.LIZ(C15380j0.LIZ(6.0f), decodeResource));
    }
}
