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
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Gy3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ProgressDialogC43239Gy3 extends ProgressDialog implements DialogInterface.OnKeyListener {
    public static final /* synthetic */ int LJLJLLL = 0;
    public final EnumC42288Gii LJLIL;
    public ViewGroup LJLILLLLZI;
    public ImageView LJLJI;
    public TextView LJLJJI;
    public KUR LJLJJL;
    public boolean LJLJJLL;
    public int LJLJL;
    public InterfaceC43240Gy4 LJLJLJ;

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        return false;
    }

    public final void LIZ(CharSequence charSequence) {
        int i;
        FrameLayout.LayoutParams layoutParams;
        TextView textView = this.LJLJJI;
        if (textView != null) {
            textView.setText(charSequence);
        }
        TextView textView2 = this.LJLJJI;
        if (textView2 != null) {
            if (TextUtils.isEmpty(charSequence)) {
                i = 8;
            } else {
                i = 0;
            }
            textView2.setVisibility(i);
        }
        KUR kur = this.LJLJJL;
        ViewGroup.LayoutParams layoutParams2 = null;
        if (kur != null) {
            layoutParams2 = kur.getLayoutParams();
        }
        if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
            int i2 = 1;
            if (charSequence == null || charSequence.length() == 0) {
                i2 = 17;
            }
            if (layoutParams.gravity != i2) {
                layoutParams.gravity = i2;
                KUR kur2 = this.LJLJJL;
                if (kur2 == null) {
                    return;
                }
                kur2.setLayoutParams(layoutParams);
            }
        }
    }

    @Override // android.app.ProgressDialog, android.app.AlertDialog, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        ViewGroup viewGroup;
        super.onCreate(bundle);
        setContentView(R.layout.k1);
        this.LJLILLLLZI = (ViewGroup) findViewById(R.id.j71);
        this.LJLJI = (ImageView) findViewById(R.id.b3o);
        this.LJLJJI = (TextView) findViewById(R.id.ib2);
        this.LJLJJL = (KUR) findViewById(R.id.kf_);
        int i = C42289Gij.LIZ[this.LJLIL.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3 && (viewGroup = this.LJLILLLLZI) != null) {
                    viewGroup.postDelayed(new ARunnableS43S0100000_7(this, 149), 5000L);
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
        setProgress(this.LJLJL);
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
            C16880lQ.LJIILLIIL(imageView3, new ACListenerS27S0100000_7(this, 197));
        }
    }

    @Override // android.app.ProgressDialog, android.app.AlertDialog
    public final void setMessage(CharSequence charSequence) {
        super.setMessage(charSequence);
        if (this.LJLJJLL) {
            LIZ(charSequence);
        }
    }

    @Override // android.app.ProgressDialog
    public final void setProgress(int i) {
        if (i < this.LJLJL) {
            return;
        }
        if (this.LJLJJLL) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(getContext().getResources().getString(R.string.rjz));
            LIZ.append(i);
            LIZ.append('%');
            LIZ(X1D.LIZIZ(LIZ));
        }
        this.LJLJL = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProgressDialogC43239Gy3(Context context, EnumC42288Gii cancelType) {
        this(context, cancelType, 0);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(cancelType, "cancelType");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressDialogC43239Gy3(Context context, EnumC42288Gii cancelType, int i) {
        super(context, R.style.a5l);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(cancelType, "cancelType");
        this.LJLIL = cancelType;
    }
}
