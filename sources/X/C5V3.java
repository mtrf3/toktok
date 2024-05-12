package X;

import android.app.Dialog;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.5V3, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5V3 extends Dialog {
    public ImageView LJLIL;

    @Override // android.app.Dialog
    public final void onBackPressed() {
    }

    @Override // android.app.Dialog
    public final void show() {
        if (!new C03880Dg(2).LIZJ(300000, "android/app/Dialog", "show", this, new Object[0], "void", new C65300Pk0(false, "()V", "-7155789565214943216")).LIZ) {
            super.show();
        }
        LIZ(true);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        LIZ(false);
    }

    public C5V3(C29S c29s) {
        super(c29s, R.style.jg);
    }

    public final void LIZ(boolean z) {
        if (z) {
            ImageView imageView = this.LJLIL;
            if (imageView != null) {
                imageView.startAnimation(AnimationUtils.loadAnimation(imageView.getContext(), R.anim.gf));
                return;
            }
            return;
        }
        ImageView imageView2 = this.LJLIL;
        if (imageView2 == null) {
            return;
        }
        imageView2.clearAnimation();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.bn_);
        this.LJLIL = (ImageView) findViewById(R.id.f6h);
        Window window = getWindow();
        o.LJI(window);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        Window window2 = getWindow();
        o.LJI(window2);
        window2.setAttributes(attributes);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(null, null, null));
        shapeDrawable.getPaint().setColor(0);
        Window window3 = getWindow();
        o.LJI(window3);
        window3.setBackgroundDrawable(shapeDrawable);
        setCanceledOnTouchOutside(false);
    }
}
