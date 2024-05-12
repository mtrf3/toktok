package X;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;

/* renamed from: X.025, reason: invalid class name */
/* loaded from: classes.dex */
public class AnonymousClass025 {
    public final C008901t LIZ;
    public final int LIZIZ;

    public final DialogInterfaceC39771hF LIZ() {
        final int i;
        DialogInterfaceC39771hF dialogInterfaceC39771hF = new DialogInterfaceC39771hF(this.LIZ.LIZ, this.LIZIZ);
        final C008901t c008901t = this.LIZ;
        final AlertController alertController = dialogInterfaceC39771hF.LJLJI;
        View view = c008901t.LJ;
        if (view != null) {
            alertController.LJJIIJ = view;
        } else {
            CharSequence charSequence = c008901t.LIZLLL;
            if (charSequence != null) {
                alertController.LJ = charSequence;
                TextView textView = alertController.LJJII;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = c008901t.LIZJ;
            if (drawable != null) {
                alertController.LJJI = drawable;
                alertController.LJJ = 0;
                ImageView imageView = alertController.LJJIFFI;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    alertController.LJJIFFI.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = c008901t.LJFF;
        if (charSequence2 != null) {
            alertController.LJFF = charSequence2;
            TextView textView2 = alertController.LJJIII;
            if (textView2 != null) {
                textView2.setText(charSequence2);
            }
        }
        CharSequence charSequence3 = c008901t.LJI;
        if (charSequence3 != null) {
            alertController.LJ(-1, charSequence3, c008901t.LJII);
        }
        CharSequence charSequence4 = c008901t.LJIIIIZZ;
        if (charSequence4 != null) {
            alertController.LJ(-2, charSequence4, c008901t.LJIIIZ);
        }
        CharSequence charSequence5 = c008901t.LJIIJ;
        if (charSequence5 != null) {
            alertController.LJ(-3, charSequence5, c008901t.LJIIJJI);
        }
        if (c008901t.LJIILL != null || c008901t.LJIILLIIL != null) {
            C008801s c008801s = (C008801s) C16880lQ.LLLZIIL(alertController.LJJIJIIJI, c008901t.LIZIZ, null);
            if (c008901t.LJIJI) {
                i = alertController.LJJIJIIJIL;
            } else {
                i = alertController.LJJIJIL;
            }
            ListAdapter listAdapter = c008901t.LJIILLIIL;
            if (listAdapter == null) {
                final Context context = c008901t.LIZ;
                final CharSequence[] charSequenceArr = c008901t.LJIILL;
                listAdapter = new ArrayAdapter<CharSequence>(context, i, charSequenceArr) { // from class: X.01v
                    @Override // android.widget.ArrayAdapter, android.widget.Adapter
                    public final long getItemId(int i2) {
                        return i2;
                    }

                    @Override // android.widget.BaseAdapter, android.widget.Adapter
                    public final boolean hasStableIds() {
                        return true;
                    }
                };
            }
            alertController.LJJIIJZLJL = listAdapter;
            alertController.LJJIIZ = c008901t.LJIJJ;
            if (c008901t.LJIIZILJ != null) {
                c008801s.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: X.024
                    @Override // android.widget.AdapterView.OnItemClickListener
                    public final void onItemClick(AdapterView<?> adapterView, View view2, int i2, long j) {
                        C008901t.this.LJIIZILJ.onClick(alertController.LIZIZ, i2);
                        if (!C008901t.this.LJIJI) {
                            alertController.LIZIZ.dismiss();
                        }
                    }
                });
            }
            if (c008901t.LJIJI) {
                c008801s.setChoiceMode(1);
            }
            alertController.LJI = c008801s;
        }
        View view2 = c008901t.LJIJ;
        if (view2 != null) {
            alertController.LJII = view2;
            alertController.LJIIIIZZ = 0;
            alertController.LJIIIZ = false;
        }
        dialogInterfaceC39771hF.setCancelable(this.LIZ.LJIIL);
        if (this.LIZ.LJIIL) {
            dialogInterfaceC39771hF.setCanceledOnTouchOutside(true);
        }
        dialogInterfaceC39771hF.setOnCancelListener(this.LIZ.LJIILIIL);
        this.LIZ.getClass();
        dialogInterfaceC39771hF.setOnDismissListener(null);
        DialogInterface.OnKeyListener onKeyListener = this.LIZ.LJIILJJIL;
        if (onKeyListener != null) {
            dialogInterfaceC39771hF.setOnKeyListener(onKeyListener);
        }
        return dialogInterfaceC39771hF;
    }

    public final DialogInterfaceC39771hF LJ() {
        DialogInterfaceC39771hF LIZ = LIZ();
        if (!new C03880Dg(2).LIZJ(300000, "androidx/appcompat/app/AlertDialog", "show", LIZ, new Object[0], "void", new C65300Pk0(false, "()V", "3346266148871148260")).LIZ) {
            LIZ.show();
        }
        return LIZ;
    }

    public AnonymousClass025(Context context) {
        this(context, DialogInterfaceC39771hF.LJIJJ(0, context));
    }

    public final void LIZIZ(int i) {
        C008901t c008901t = this.LIZ;
        c008901t.LJFF = c008901t.LIZ.getText(i);
    }

    public AnonymousClass025(Context context, int i) {
        this.LIZ = new C008901t(new ContextThemeWrapper(context, DialogInterfaceC39771hF.LJIJJ(i, context)));
        this.LIZIZ = i;
    }

    public final void LIZJ(int i, DialogInterface.OnClickListener onClickListener) {
        C008901t c008901t = this.LIZ;
        c008901t.LJIIIIZZ = c008901t.LIZ.getText(i);
        this.LIZ.LJIIIZ = onClickListener;
    }

    public final void LIZLLL(int i, DialogInterface.OnClickListener onClickListener) {
        C008901t c008901t = this.LIZ;
        c008901t.LJI = c008901t.LIZ.getText(i);
        this.LIZ.LJII = onClickListener;
    }
}
