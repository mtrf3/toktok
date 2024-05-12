package X;

import Y.ACListenerS37S0200000_2;
import Y.IDTListenerS88S0200000_2;
import android.animation.ObjectAnimator;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.6nq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C171266nq extends RecyclerView.ViewHolder {
    public final C158186Is LJLIL;
    public final C170466mY LJLILLLLZI;
    public final C72790ShW LJLJI;
    public final ImageView LJLJJI;
    public ObjectAnimator LJLJJL;
    public int LJLJJLL;
    public final /* synthetic */ C171246no LJLJL;

    public final void L() {
        ObjectAnimator objectAnimator = this.LJLJJL;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            this.LJLJJL.cancel();
        }
        this.LJLIL.setRotation(0.0f);
        this.LJLIL.setImageResource(R.drawable.tf);
    }

    public final void M(boolean z) {
        int i;
        if (!z) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(0.0f);
            this.LJLJI.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            i = R.color.bh;
        } else {
            this.LJLJI.setColorFilter((ColorFilter) null);
            i = R.color.bc;
        }
        C170466mY c170466mY = this.LJLILLLLZI;
        c170466mY.setTextColor(c170466mY.getResources().getColor(i));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C171266nq(C171246no c171246no, View view) {
        super(view);
        this.LJLJL = c171246no;
        this.LJLJJLL = 1;
        C72790ShW c72790ShW = (C72790ShW) view.findViewById(R.id.ki1);
        this.LJLJI = c72790ShW;
        c72790ShW.LJLLILLLL = true;
        if (C149015t3.LIZIZ()) {
            c72790ShW.setRectFRadius(KL2.LIZJ(c72790ShW.getContext(), 8.0f));
            c72790ShW.setClipStyle(1);
        }
        C170466mY c170466mY = (C170466mY) view.findViewById(R.id.kk9);
        this.LJLILLLLZI = c170466mY;
        c170466mY.LJJIJIL();
        c170466mY.setHorizontalFadingEdgeEnabled(true);
        c170466mY.setFadingEdgeLength((int) KL2.LIZJ(c170466mY.getContext(), 4.0f));
        this.LJLIL = (C158186Is) view.findViewById(R.id.f2f);
        this.LJLJJI = (ImageView) view.findViewById(R.id.f28);
        c72790ShW.setOnTouchListener(new IDTListenerS88S0200000_2(this, view, 1));
        c72790ShW.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS37S0200000_2(this, view, 1)));
    }
}
