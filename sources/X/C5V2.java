package X;

import android.app.Dialog;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.5V2, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5V2 extends Dialog {
    public View LJLIL;

    @Override // android.app.Dialog
    public final void show() {
        if (!new C03880Dg(2).LIZJ(300000, "android/app/Dialog", "show", this, new Object[0], "void", new C65300Pk0(false, "()V", "-3937361585996702367")).LIZ) {
            super.show();
        }
        View view = this.LJLIL;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        View view = this.LJLIL;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5V2(ActivityC45651qj context) {
        super(context, R.style.jg);
        o.LJIIIZ(context, "context");
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.bnf);
        this.LJLIL = findViewById(R.id.g94);
        Window window = getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            window.setAttributes(attributes);
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(null, null, null));
            Paint paint = shapeDrawable.getPaint();
            o.LJIIIIZZ(paint, "drawable.paint");
            paint.setColor(0);
            window.setBackgroundDrawable(shapeDrawable);
        }
        setCanceledOnTouchOutside(false);
    }
}
