package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.4n6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C119844n6 extends ConstraintLayout {
    public final C5H3 LJLIL;
    public final C5H3 LJLILLLLZI;
    public final C5H3 LJLJI;

    private final ImageView getMAvatarView() {
        return (ImageView) this.LJLIL.getValue();
    }

    private final ConstraintLayout getMFulfilledLayout() {
        return (ConstraintLayout) this.LJLILLLLZI.getValue();
    }

    private final ConstraintLayout getMThanksLayout() {
        return (ConstraintLayout) this.LJLJI.getValue();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C119844n6(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C119844n6(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.dn_, this, true);
        ImageView imageView = (ImageView) findViewById(R.id.ega);
        Bitmap decodeResource = BitmapFactory.decodeResource(C15380j0.LJIIJ(), R.drawable.co2);
        o.LJIIIIZZ(decodeResource, "decodeResource(ResUtil.g…wish_list_anchor_not_set)");
        imageView.setImageBitmap(C119824n4.LIZ(C15380j0.LIZ(6.0f), decodeResource));
        this.LJLIL = C78996UzQ.LJJIJIIJI(new AqS151S0100000_1(this, 32));
        this.LJLILLLLZI = C78996UzQ.LJJIJIIJI(new AqS151S0100000_1(this, 33));
        this.LJLJI = C78996UzQ.LJJIJIIJI(new AqS151S0100000_1(this, 34));
    }
}
