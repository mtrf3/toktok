package X;

import Y.ACListenerS27S0100000_7;
import android.app.AlertDialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.I6j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class AlertDialogC46073I6j extends AlertDialog {
    public boolean LJLIL;
    public CharSequence LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public I7Y LJLJL;
    public TextView LJLJLJ;
    public C74063T4x LJLJLLL;
    public ImageView LJLL;
    public TextView LJLLI;
    public View LJLLILLLL;

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        C74063T4x c74063T4x = this.LJLJLLL;
        if (c74063T4x != null) {
            c74063T4x.LIZIZ();
            super.dismiss();
        } else {
            o.LJIJI("mLodingProgressView");
            throw null;
        }
    }

    public AlertDialogC46073I6j(ActivityC45651qj activityC45651qj) {
        super(activityC45651qj, 3);
        this.LJLJJLL = 100;
    }

    public final void LIZ(int i) {
        if (this.LJLIL) {
            TextView textView = this.LJLLI;
            if (textView != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(i);
                LIZ.append('%');
                textView.setText(X1D.LIZIZ(LIZ));
                C74063T4x c74063T4x = this.LJLJLLL;
                if (c74063T4x != null) {
                    c74063T4x.setProgress(i);
                } else {
                    o.LJIJI("mLodingProgressView");
                    throw null;
                }
            } else {
                o.LJIJI("mProgressTextView");
                throw null;
            }
        }
        this.LJLJJL = i;
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        setContentView(R.layout.bng);
        View findViewById = findViewById(R.id.j71);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.root)");
        this.LJLLILLLL = findViewById;
        View findViewById2 = findViewById(R.id.ghd);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.message)");
        this.LJLJLJ = (TextView) findViewById2;
        View findViewById3 = findViewById(R.id.f6h);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.iv_loading)");
        this.LJLJLLL = (C74063T4x) findViewById3;
        View findViewById4 = findViewById(R.id.b3o);
        o.LJIIIIZZ(findViewById4, "findViewById(R.id.cancelImageView)");
        this.LJLL = (ImageView) findViewById4;
        View findViewById5 = findViewById(R.id.ia9);
        o.LJIIIIZZ(findViewById5, "findViewById(R.id.progress)");
        this.LJLLI = (TextView) findViewById5;
        ImageView imageView = this.LJLL;
        if (imageView != null) {
            C16880lQ.LJIILLIIL(imageView, new ACListenerS27S0100000_7(this, 156));
            this.LJLIL = true;
            setMessage(this.LJLILLLLZI);
            boolean z = this.LJLJI;
            int i2 = 0;
            if (this.LJLIL) {
                C74063T4x c74063T4x = this.LJLJLLL;
                if (c74063T4x != null) {
                    c74063T4x.setIndeterminate(z);
                    TextView textView = this.LJLLI;
                    if (textView != null) {
                        if (z) {
                            i = 4;
                        } else {
                            i = 0;
                        }
                        textView.setVisibility(i);
                    } else {
                        o.LJIJI("mProgressTextView");
                        throw null;
                    }
                } else {
                    o.LJIJI("mLodingProgressView");
                    throw null;
                }
            }
            this.LJLJI = z;
            int i3 = this.LJLJJLL;
            if (this.LJLIL) {
                C74063T4x c74063T4x2 = this.LJLJLLL;
                if (c74063T4x2 != null) {
                    c74063T4x2.setMaxProgress(i3);
                } else {
                    o.LJIJI("mLodingProgressView");
                    throw null;
                }
            }
            this.LJLJJLL = i3;
            LIZ(this.LJLJJL);
            setCanceledOnTouchOutside(false);
            boolean z2 = this.LJLJJI;
            if (this.LJLIL) {
                ImageView imageView2 = this.LJLL;
                if (imageView2 != null) {
                    if (!z2) {
                        i2 = 8;
                    }
                    imageView2.setVisibility(i2);
                } else {
                    o.LJIJI("mCancelView");
                    throw null;
                }
            }
            this.LJLJJI = z2;
            return;
        }
        o.LJIJI("mCancelView");
        throw null;
    }

    @Override // android.app.AlertDialog
    public final void setMessage(CharSequence charSequence) {
        int i;
        if (this.LJLIL) {
            TextView textView = this.LJLJLJ;
            if (textView != null) {
                textView.setText(charSequence);
                TextView textView2 = this.LJLJLJ;
                if (textView2 != null) {
                    if (TextUtils.isEmpty(charSequence)) {
                        i = 8;
                    } else {
                        i = 0;
                    }
                    textView2.setVisibility(i);
                } else {
                    o.LJIJI("mMessageView");
                    throw null;
                }
            } else {
                o.LJIJI("mMessageView");
                throw null;
            }
        }
        this.LJLILLLLZI = charSequence;
    }
}
