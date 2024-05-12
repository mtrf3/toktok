package X;

import Y.ACListenerS27S0100000_7;
import Y.ARunnableS43S0100000_7;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Gy7, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ProgressDialogC43243Gy7 extends ProgressDialog implements DialogInterface.OnKeyListener {
    public final String LJLIL;
    public final InterfaceC65784Pro<C76800UCe> LJLILLLLZI;
    public final long LJLJI;
    public View LJLJJI;
    public ImageView LJLJJL;
    public TextView LJLJJLL;
    public KUR LJLJL;

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        return false;
    }

    @Override // android.app.ProgressDialog, android.app.AlertDialog, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        boolean z;
        int i;
        FrameLayout.LayoutParams layoutParams;
        super.onCreate(bundle);
        setContentView(R.layout.k1);
        View findViewById = findViewById(R.id.j71);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.root)");
        this.LJLJJI = findViewById;
        View findViewById2 = findViewById(R.id.b3o);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.cancelImageView)");
        this.LJLJJL = (ImageView) findViewById2;
        View findViewById3 = findViewById(R.id.ib2);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.progress_text)");
        this.LJLJJLL = (TextView) findViewById3;
        View findViewById4 = findViewById(R.id.kf_);
        o.LJIIIIZZ(findViewById4, "findViewById(R.id.status_view)");
        this.LJLJL = (KUR) findViewById4;
        String str = this.LJLIL;
        int i2 = 1;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        TextView textView = this.LJLJJLL;
        if (textView != null) {
            textView.setText(str);
            if (z) {
                i = 8;
            } else {
                i = 0;
            }
            textView.setVisibility(i);
            KUR kur = this.LJLJL;
            if (kur != null) {
                ViewGroup.LayoutParams layoutParams2 = kur.getLayoutParams();
                if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
                    if (z) {
                        i2 = 17;
                    }
                    if (layoutParams.gravity != i2) {
                        layoutParams.gravity = i2;
                        KUR kur2 = this.LJLJL;
                        if (kur2 != null) {
                            kur2.setLayoutParams(layoutParams);
                        } else {
                            o.LJIJI("dmtStatusView");
                            throw null;
                        }
                    }
                }
                setCanceledOnTouchOutside(false);
                KUR kur3 = this.LJLJL;
                if (kur3 != null) {
                    KUY kuy = new KUY(getContext());
                    kuy.LIZLLL();
                    kur3.setBuilder(kuy);
                    KUR kur4 = this.LJLJL;
                    if (kur4 != null) {
                        kur4.LJIIIZ();
                        ImageView imageView = this.LJLJJL;
                        if (imageView != null) {
                            C16880lQ.LJIILLIIL(imageView, new ACListenerS27S0100000_7(this, 202));
                            View view = this.LJLJJI;
                            if (view != null) {
                                view.postDelayed(new ARunnableS43S0100000_7(this, 153), this.LJLJI);
                                return;
                            } else {
                                o.LJIJI("rootView");
                                throw null;
                            }
                        }
                        o.LJIJI("cancelView");
                        throw null;
                    }
                    o.LJIJI("dmtStatusView");
                    throw null;
                }
                o.LJIJI("dmtStatusView");
                throw null;
            }
            o.LJIJI("dmtStatusView");
            throw null;
        }
        o.LJIJI("progressTextView");
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressDialogC43243Gy7(Context context, String loadingTextPrefix, InterfaceC65784Pro<C76800UCe> cancelListener, long j) {
        super(context, R.style.a5l);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(loadingTextPrefix, "loadingTextPrefix");
        o.LJIIIZ(cancelListener, "cancelListener");
        this.LJLIL = loadingTextPrefix;
        this.LJLILLLLZI = cancelListener;
        this.LJLJI = j;
    }
}
