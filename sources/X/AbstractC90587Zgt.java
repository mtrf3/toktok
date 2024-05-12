package X;

import Y.IDCListenerS136S0100000_24;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageButton;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;

/* renamed from: X.Zgt, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public abstract class AbstractC90587Zgt extends RecyclerView.ViewHolder {
    public ZY4 LJLIL;
    public final ImageButton LJLILLLLZI;
    public final C90572Zge LJLJI;
    public final /* synthetic */ DialogC90863ZlL LJLJJI;

    public final void L(ZY4 zy4) {
        boolean z;
        this.LJLIL = zy4;
        int i = zy4.LJIILJJIL;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        this.LJLILLLLZI.setActivated(z);
        C16880lQ.LJIILL(this.LJLILLLLZI, new IDCListenerS136S0100000_24(this, 6));
        this.LJLJI.setTag(this.LJLIL);
        this.LJLJI.setMax(zy4.LJIILL);
        this.LJLJI.setProgress(i);
        this.LJLJI.setOnSeekBarChangeListener(this.LJLJJI.LJZ);
    }

    public final void setMute(boolean z) {
        if (this.LJLILLLLZI.isActivated() == z) {
            return;
        }
        this.LJLILLLLZI.setActivated(z);
        if (z) {
            ((HashMap) this.LJLJJI.LL).put(this.LJLIL.LIZJ, Integer.valueOf(this.LJLJI.getProgress()));
        } else {
            ((HashMap) this.LJLJJI.LL).remove(this.LJLIL.LIZJ);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC90587Zgt(DialogC90863ZlL dialogC90863ZlL, View view, ImageButton imageButton, C90572Zge c90572Zge) {
        super(view);
        int LIZIZ;
        int LIZIZ2;
        this.LJLJJI = dialogC90863ZlL;
        this.LJLILLLLZI = imageButton;
        this.LJLJI = c90572Zge;
        Context context = dialogC90863ZlL.LJLLI;
        Drawable LJFF = C07840Sm.LJFF(C04270Et.LIZIZ(context, R.drawable.g0));
        if (ZXT.LJIIIIZZ(context)) {
            C07820Sk.LJI(LJFF, C04330Ez.LIZIZ(context, R.color.a9));
        }
        imageButton.setImageDrawable(LJFF);
        Context context2 = dialogC90863ZlL.LJLLI;
        if (ZXT.LJIIIIZZ(context2)) {
            LIZIZ = C04330Ez.LIZIZ(context2, R.color.a1);
            LIZIZ2 = C04330Ez.LIZIZ(context2, R.color.z);
        } else {
            LIZIZ = C04330Ez.LIZIZ(context2, R.color.a0);
            LIZIZ2 = C04330Ez.LIZIZ(context2, R.color.y);
        }
        if (c90572Zge.LJLJJL != LIZIZ) {
            Color.alpha(LIZIZ);
            c90572Zge.LJLJJL = LIZIZ;
        }
        if (c90572Zge.LJLJJLL != LIZIZ2) {
            Color.alpha(LIZIZ2);
            c90572Zge.LJLJJLL = LIZIZ2;
        }
    }
}
