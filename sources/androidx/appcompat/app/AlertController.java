package androidx.appcompat.app;

import X.C008801s;
import X.C16880lQ;
import X.C18Z;
import X.C45631qh;
import X.HandlerC009001u;
import Y.IDCListenerS135S0100000;
import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class AlertController {
    public final Context LIZ;
    public final C18Z LIZIZ;
    public final Window LIZJ;
    public final int LIZLLL;
    public CharSequence LJ;
    public CharSequence LJFF;
    public C008801s LJI;
    public View LJII;
    public int LJIIIIZZ;
    public boolean LJIIIZ;
    public Button LJIIJ;
    public CharSequence LJIIJJI;
    public Message LJIIL;
    public Drawable LJIILIIL;
    public Button LJIILJJIL;
    public CharSequence LJIILL;
    public Message LJIILLIIL;
    public Drawable LJIIZILJ;
    public Button LJIJ;
    public CharSequence LJIJI;
    public Message LJIJJ;
    public Drawable LJIJJLI;
    public C45631qh LJIL;
    public int LJJ;
    public Drawable LJJI;
    public ImageView LJJIFFI;
    public TextView LJJII;
    public TextView LJJIII;
    public View LJJIIJ;
    public ListAdapter LJJIIJZLJL;
    public final int LJJIIZI;
    public final int LJJIJ;
    public final int LJJIJIIJI;
    public final int LJJIJIIJIL;
    public final int LJJIJIL;
    public final boolean LJJIJL;
    public final HandlerC009001u LJJIJLIJ;
    public int LJJIIZ = -1;
    public final IDCListenerS135S0100000 LJJIL = new IDCListenerS135S0100000(this, 3);

    public static boolean LIZ(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (LIZ(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static void LIZIZ(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    public static ViewGroup LIZLLL(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                C16880lQ.LJLLL(view2, (ViewGroup) parent);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.01u] */
    public AlertController(Context context, final C18Z c18z, Window window) {
        this.LIZ = context;
        this.LIZIZ = c18z;
        this.LIZJ = window;
        this.LJJIJLIJ = new Handler(c18z) { // from class: X.01u
            public final WeakReference<DialogInterface> LIZ;

            {
                this.LIZ = new WeakReference<>(c18z);
            }

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                int i = message.what;
                if (i != -3 && i != -2 && i != -1) {
                    if (i != 1) {
                        return;
                    }
                    ((DialogInterface) message.obj).dismiss();
                    return;
                }
                ((DialogInterface.OnClickListener) message.obj).onClick(this.LIZ.get(), message.what);
            }
        };
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.layout, com.zhiliaoapp.musically.R.attr.a0g, com.zhiliaoapp.musically.R.attr.a0i, com.zhiliaoapp.musically.R.attr.aox, com.zhiliaoapp.musically.R.attr.aoy, com.zhiliaoapp.musically.R.attr.b1j, com.zhiliaoapp.musically.R.attr.baz, com.zhiliaoapp.musically.R.attr.bbg}, com.zhiliaoapp.musically.R.attr.vf, 0);
        this.LJJIIZI = obtainStyledAttributes.getResourceId(0, 0);
        this.LJJIJ = obtainStyledAttributes.getResourceId(2, 0);
        this.LJJIJIIJI = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.LJJIJIIJIL = obtainStyledAttributes.getResourceId(7, 0);
        this.LJJIJIL = obtainStyledAttributes.getResourceId(3, 0);
        this.LJJIJL = obtainStyledAttributes.getBoolean(6, true);
        this.LIZLLL = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        c18z.LJIJI(1);
    }

    public static void LIZJ(View view, View view2, View view3) {
        int i;
        int i2 = 0;
        if (view2 != null) {
            if (view.canScrollVertically(-1)) {
                i = 0;
            } else {
                i = 4;
            }
            view2.setVisibility(i);
        }
        if (view3 != null) {
            if (!view.canScrollVertically(1)) {
                i2 = 4;
            }
            view3.setVisibility(i2);
        }
    }

    public final void LJ(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message message;
        if (onClickListener != null) {
            message = obtainMessage(i, onClickListener);
        } else {
            message = null;
        }
        if (i != -3) {
            if (i != -2) {
                if (i == -1) {
                    this.LJIIJJI = charSequence;
                    this.LJIIL = message;
                    this.LJIILIIL = null;
                    return;
                }
                throw new IllegalArgumentException("Button does not exist");
            }
            this.LJIILL = charSequence;
            this.LJIILLIIL = message;
            this.LJIIZILJ = null;
            return;
        }
        this.LJIJI = charSequence;
        this.LJIJJ = message;
        this.LJIJJLI = null;
    }
}
