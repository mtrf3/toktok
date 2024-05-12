package X;

import Y.ACListenerS27S0100000_7;
import Y.AObjectS127S0200000_7;
import Y.AObjectS44S0400000_7;
import Y.IDCListenerS283S0100000_7;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HR5 extends C18Z {
    public final Activity LJLJI;
    public ImageView LJLJJI;
    public ImageView LJLJJL;
    public ImageView LJLJJLL;
    public TuxTextView LJLJL;
    public AObjectS44S0400000_7 LJLJLJ;
    public AObjectS127S0200000_7 LJLJLLL;

    public final void LJIJJ() {
        Drawable LIZIZ = C04270Et.LIZIZ(getContext(), R.drawable.b2d);
        Drawable LIZIZ2 = C04270Et.LIZIZ(getContext(), R.drawable.b2c);
        ImageView imageView = this.LJLJJI;
        if (imageView != null) {
            if (C78605Ut7.LJFF("android.permission.CAMERA")) {
                LIZIZ2 = LIZIZ;
            }
            imageView.setImageDrawable(LIZIZ2);
        }
        Drawable LIZIZ3 = C04270Et.LIZIZ(getContext(), R.drawable.b2f);
        ImageView imageView2 = this.LJLJJL;
        if (imageView2 != null) {
            if (C78605Ut7.LJFF("android.permission.RECORD_AUDIO")) {
                LIZIZ3 = LIZIZ;
            }
            imageView2.setImageDrawable(LIZIZ3);
        }
        Drawable LIZIZ4 = C04270Et.LIZIZ(getContext(), R.drawable.b2e);
        ImageView imageView3 = this.LJLJJLL;
        if (imageView3 != null) {
            if (!C78605Ut7.LIZLLL()) {
                LIZIZ = LIZIZ4;
            }
            imageView3.setImageDrawable(LIZIZ);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HR5(Activity activity) {
        super(activity, 0);
        o.LJIIIZ(activity, "activity");
        this.LJLJI = activity;
    }

    @Override // X.C18Z, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.ca6, (ViewGroup) findViewById(R.id.bst), false);
        setContentView(LLLLIILL);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setBackgroundDrawableResource(android.R.color.transparent);
        }
        this.LJLJJI = (ImageView) LLLLIILL.findViewById(R.id.ezo);
        this.LJLJJL = (ImageView) LLLLIILL.findViewById(R.id.f6x);
        this.LJLJJLL = (ImageView) LLLLIILL.findViewById(R.id.f35);
        this.LJLJL = (TuxTextView) LLLLIILL.findViewById(R.id.a0x);
        TextView textView = (TextView) LLLLIILL.findViewById(R.id.krt);
        String string = getContext().getString(R.string.rts, getContext().getString(R.string.rtl), getContext().getString(R.string.rtp));
        o.LJIIIIZZ(string, "context.getString(\n     …crophone_title)\n        )");
        textView.setText(string);
        LLLLIILL.findViewById(R.id.d9b).setVisibility(8);
        LJIJJ();
        C16880lQ.LJIIJ(new ACListenerS27S0100000_7(this, 55), LLLLIILL.findViewById(R.id.aeg));
        TuxTextView tuxTextView = this.LJLJL;
        if (tuxTextView != null) {
            C16880lQ.LJJJJI(tuxTextView, new ACListenerS27S0100000_7(this, 56));
        }
        setOnCancelListener(new IDCListenerS283S0100000_7(this, 1));
    }
}
