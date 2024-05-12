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
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.HRl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ProgressDialogC44073HRl extends ProgressDialog implements DialogInterface.OnKeyListener {
    public static final /* synthetic */ int LJLJLLL = 0;
    public final EnumC44076HRo LJLIL;
    public ViewGroup LJLILLLLZI;
    public ImageView LJLJI;
    public TuxTextView LJLJJI;
    public KUR LJLJJL;
    public boolean LJLJJLL;
    public int LJLJL;
    public InterfaceC44082HRu LJLJLJ;

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        return false;
    }

    public final void LIZ() {
        ViewGroup.LayoutParams layoutParams;
        TuxTextView tuxTextView = this.LJLJJI;
        if (tuxTextView != null) {
            tuxTextView.setTuxFont(42);
        }
        ImageView imageView = this.LJLJI;
        FrameLayout.LayoutParams layoutParams2 = null;
        if (imageView != null) {
            layoutParams = imageView.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if ((layoutParams instanceof FrameLayout.LayoutParams) && (layoutParams2 = (FrameLayout.LayoutParams) layoutParams) != null) {
            layoutParams2.gravity = 8388661;
        }
        ImageView imageView2 = this.LJLJI;
        if (imageView2 == null) {
            return;
        }
        imageView2.setLayoutParams(layoutParams2);
    }

    @Override // android.app.ProgressDialog, android.app.AlertDialog, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        ViewGroup viewGroup;
        super.onCreate(bundle);
        setContentView(R.layout.bj4);
        this.LJLILLLLZI = (ViewGroup) findViewById(R.id.j71);
        this.LJLJI = (ImageView) findViewById(R.id.b3o);
        this.LJLJJI = (TuxTextView) findViewById(R.id.ib2);
        this.LJLJJL = (KUR) findViewById(R.id.kf_);
        int i = C44077HRp.LIZ[this.LJLIL.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4 && (viewGroup = this.LJLILLLLZI) != null) {
                        viewGroup.postDelayed(new ARunnableS43S0100000_7(this, 146), 10000L);
                    }
                } else {
                    ViewGroup viewGroup2 = this.LJLILLLLZI;
                    if (viewGroup2 != null) {
                        viewGroup2.postDelayed(new ARunnableS43S0100000_7(this, 145), 5000L);
                    }
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
            C16880lQ.LJIILLIIL(imageView3, new ACListenerS27S0100000_7(this, 190));
        }
    }

    @Override // android.app.ProgressDialog, android.app.AlertDialog
    public final void setMessage(CharSequence charSequence) {
        int i;
        super.setMessage(charSequence);
        if (this.LJLJJLL) {
            TuxTextView tuxTextView = this.LJLJJI;
            if (tuxTextView != null) {
                tuxTextView.setText(charSequence);
            }
            TuxTextView tuxTextView2 = this.LJLJJI;
            if (tuxTextView2 == null) {
                return;
            }
            if (TextUtils.isEmpty(charSequence)) {
                i = 8;
            } else {
                i = 0;
            }
            tuxTextView2.setVisibility(i);
        }
    }

    @Override // android.app.ProgressDialog
    public final void setProgress(int i) {
        if (i < this.LJLJL) {
            return;
        }
        if (this.LJLJJLL) {
            StringBuilder sb = new StringBuilder();
            sb.append(getContext().getResources().getString(R.string.rjz));
            sb.append(i);
            sb.append("%");
            TuxTextView tuxTextView = this.LJLJJI;
            if (tuxTextView != null) {
                tuxTextView.setText(sb);
            }
        }
        this.LJLJL = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressDialogC44073HRl(Context context, int i, EnumC44076HRo cancelType) {
        super(context, i);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(cancelType, "cancelType");
        this.LJLIL = cancelType;
    }
}
