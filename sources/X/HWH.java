package X;

import Y.ACListenerS27S0100000_7;
import Y.ARunnableS43S0100000_7;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HWH extends ProgressDialog implements DialogInterface.OnKeyListener {
    public static final /* synthetic */ int LJLJLLL = 0;
    public final HWK LJLIL;
    public ViewGroup LJLILLLLZI;
    public ImageView LJLJI;
    public TextView LJLJJI;
    public KUR LJLJJL;
    public boolean LJLJJLL;
    public int LJLJL;
    public HWI LJLJLJ;

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        return false;
    }

    @Override // android.app.ProgressDialog, android.app.AlertDialog, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        ViewGroup viewGroup;
        super.onCreate(bundle);
        setContentView(R.layout.buf);
        this.LJLILLLLZI = (ViewGroup) findViewById(R.id.j71);
        this.LJLJI = (ImageView) findViewById(R.id.b3o);
        this.LJLJJI = (TextView) findViewById(R.id.ib2);
        this.LJLJJL = (KUR) findViewById(R.id.kf_);
        int i = HWJ.LIZ[this.LJLIL.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3 && (viewGroup = this.LJLILLLLZI) != null) {
                    viewGroup.postDelayed(new ARunnableS43S0100000_7(this, 111), 5000L);
                }
            } else {
                ImageView imageView = this.LJLJI;
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
            }
        } else {
            ImageView imageView2 = this.LJLJI;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
        }
        this.LJLJJLL = true;
        TextView textView = this.LJLJJI;
        if (textView != null) {
            textView.setText(getContext().getResources().getString(R.string.rjz));
        }
        KUR kur = this.LJLJJL;
        if (kur != null) {
            KUY kuy = new KUY(getContext());
            kuy.LIZLLL();
            kur.setBuilder(kuy);
        }
        KUR kur2 = this.LJLJJL;
        if (kur2 != null) {
            kur2.LJIIIZ();
        }
        setCanceledOnTouchOutside(false);
        ImageView imageView3 = this.LJLJI;
        if (imageView3 != null) {
            C16880lQ.LJIILLIIL(imageView3, new ACListenerS27S0100000_7(this, 93));
        }
    }

    @Override // android.app.ProgressDialog, android.app.AlertDialog
    public final void setMessage(CharSequence charSequence) {
        int i;
        super.setMessage(charSequence);
        if (this.LJLJJLL) {
            TextView textView = this.LJLJJI;
            if (textView != null) {
                textView.setText(charSequence);
            }
            TextView textView2 = this.LJLJJI;
            if (textView2 == null) {
                return;
            }
            if (TextUtils.isEmpty(charSequence)) {
                i = 8;
            } else {
                i = 0;
            }
            textView2.setVisibility(i);
        }
    }

    @Override // android.app.ProgressDialog
    public final void setProgress(int i) {
        if (i < this.LJLJL) {
            return;
        }
        if (this.LJLJJLL) {
            TextView textView = this.LJLJJI;
            o.LJI(textView);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(getContext().getResources().getString(R.string.rjz));
            LIZ.append(i);
            LIZ.append('%');
            textView.setText(X1D.LIZIZ(LIZ));
        }
        this.LJLJL = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HWH(Context context, HWK cancelType) {
        this(context, cancelType, 0);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(cancelType, "cancelType");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HWH(Context context, HWK cancelType, int i) {
        super(context, R.style.a9a);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(cancelType, "cancelType");
        this.LJLIL = cancelType;
    }
}
