package X;

import Y.ARunnableS45S0100000_9;
import Y.IDCListenerS246S0100000_9;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.LLq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C54114LLq extends AbstractC54111LLn {
    public boolean LJIIL;

    @Override // X.AbstractC54111LLn
    public final void LIZJ(int i, boolean z) {
    }

    @Override // X.AbstractC54111LLn
    public int LJIILIIL(boolean z) {
        return 92;
    }

    @Override // X.AbstractC54111LLn
    public final void LJIJJ() {
    }

    @Override // X.AbstractC54111LLn
    public final void LJJI() {
        C2QU.LIZ(new ARunnableS45S0100000_9(this, 225), DQG.LIZJ());
    }

    @Override // X.AbstractC54111LLn
    public final ImageView LJ() {
        ImageView imageView = new ImageView(this.LIZ.getContext());
        imageView.setImageDrawable(this.LIZJ.LIZLLL(R.drawable.aw6, this.LIZ.getContext()));
        int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(8));
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(LJJIIZ, LJJIIZ);
        layoutParams.setMargins(O6R.LJJIIZ(C32151Nz.LJIIZILJ(14)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(6)), 0, 0);
        layoutParams.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(14)));
        layoutParams.gravity = 49;
        imageView.setLayoutParams(layoutParams);
        return imageView;
    }

    @Override // X.AbstractC54111LLn
    public ImageView LJFF() {
        ImageView imageView = new ImageView(this.LIZ.getContext());
        imageView.setScaleType(LJJIJIIJIL());
        imageView.setLayoutParams(LJJIJIIJI());
        return imageView;
    }

    @Override // X.AbstractC54111LLn
    public ImageView LJI() {
        ImageView imageView = new ImageView(this.LIZ.getContext());
        imageView.setScaleType(LJJIJIIJIL());
        imageView.setLayoutParams(LJJIJIIJI());
        return imageView;
    }

    @Override // X.AbstractC54111LLn
    public final ImageView LJII() {
        ImageView imageView = new ImageView(this.LIZ.getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageDrawable(this.LIZJ.LIZLLL(R.drawable.aw2, imageView.getContext()));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        imageView.setLayoutParams(layoutParams);
        return imageView;
    }

    @Override // X.AbstractC54111LLn
    public TuxTextView LJIIIIZZ() {
        int i;
        Context context = this.LIZ.getContext();
        o.LJIIIIZZ(context, "materialIconTab.context");
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setTuxFont(LJIILIIL(false));
        tuxTextView.setTextColor(C04330Ez.LIZIZ(this.LIZ.getContext(), R.color.bd));
        tuxTextView.setLetterSpacing(0.01f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 81;
        layoutParams.topMargin = C7MY.LIZIZ(25);
        tuxTextView.setLayoutParams(layoutParams);
        tuxTextView.setGravity(17);
        tuxTextView.setSingleLine(true);
        Resources resources = tuxTextView.getResources();
        int LIZ = C00F.LIZ(31744, 0, "plus_button_add_text", true);
        if (LIZ != 1) {
            if (LIZ != 2) {
                i = R.string.bgp;
            } else {
                i = R.string.g6y;
            }
        } else {
            i = R.string.g6i;
        }
        tuxTextView.setText(resources.getString(i));
        return tuxTextView;
    }

    @Override // X.AbstractC54111LLn
    public final void LJIILL() {
        if (LJJII(LH5.SELECT, this.LIZIZ, false)) {
            LJJIII();
        }
    }

    @Override // X.AbstractC54111LLn
    public final void LJIIZILJ() {
        if (LJJII(LH5.UNSELECT, this.LIZIZ, false)) {
            LJJIII();
        }
    }

    public boolean LJJIIJ() {
        if (C00F.LIZ(31744, 0, "plus_button_add_text", true) <= 0) {
            return false;
        }
        return true;
    }

    public FrameLayout.LayoutParams LJJIIZ() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        Double valueOf = Double.valueOf(16.5d);
        layoutParams.setMargins(O6R.LJJIIZ(C32151Nz.LJIIZILJ(valueOf)), C7MY.LIZIZ(5), O6R.LJJIIZ(C32151Nz.LJIIZILJ(valueOf)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(Double.valueOf(20.5d))));
        return layoutParams;
    }

    public FrameLayout.LayoutParams LJJIJIIJI() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        return layoutParams;
    }

    @Override // X.AbstractC54111LLn
    public final void LJIILLIIL() {
        Boolean bool;
        if (!R3A.LJII()) {
            return;
        }
        ImageView imageView = this.LIZ.LJLJJI;
        Object obj = null;
        if (imageView != null) {
            obj = imageView.getTag(R.id.ec6);
        }
        if ((obj instanceof Boolean) && (bool = (Boolean) obj) != null && bool.booleanValue()) {
            return;
        }
        LJJI();
    }

    @Override // X.AbstractC54111LLn
    public final void LJJIII() {
        LJIIIZ();
        LJJI();
    }

    public ImageView.ScaleType LJJIIZI() {
        return ImageView.ScaleType.CENTER_INSIDE;
    }

    public ImageView.ScaleType LJJIJIIJIL() {
        return ImageView.ScaleType.CENTER;
    }

    public C54114LLq(C54113LLp c54113LLp) {
        super(c54113LLp);
        c54113LLp.addOnAttachStateChangeListener(new IDCListenerS246S0100000_9(this, 9));
        if (LJJII(LH5.UNSELECT, this.LIZLLL.LJ, true)) {
            LJJIII();
        }
    }

    @Override // X.AbstractC54111LLn
    public final void LJIL(L7P tabBackgroundStyle) {
        o.LJIIIZ(tabBackgroundStyle, "tabBackgroundStyle");
        if (LJJII(LH5.UNSELECT, tabBackgroundStyle, true)) {
            LJJIII();
        }
    }

    public Drawable LJJIIJZLJL(L7P backgroundStyle) {
        int i;
        o.LJIIIZ(backgroundStyle, "backgroundStyle");
        if (backgroundStyle == L7P.LIGHT) {
            i = R.drawable.avm;
        } else {
            i = R.drawable.avn;
        }
        return this.LIZJ.LIZLLL(i, this.LIZ.getContext());
    }

    public Drawable LJJIJ(L7P backgroundStyle) {
        int i;
        o.LJIIIZ(backgroundStyle, "backgroundStyle");
        if (backgroundStyle == L7P.LIGHT) {
            i = R.drawable.avq;
        } else {
            i = R.drawable.avp;
        }
        return this.LIZJ.LIZLLL(i, this.LIZ.getContext());
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0012, code lost:
    
        if (r4 != false) goto L8;
     */
    @Override // X.AbstractC54111LLn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJII(X.LH5 r2, X.L7P r3, boolean r4) {
        /*
            r1 = this;
            java.lang.String r0 = "tabStatus"
            kotlin.jvm.internal.o.LJIIIZ(r2, r0)
            java.lang.String r0 = "backgroundStyle"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            X.L7P r0 = r1.LIZIZ
            if (r0 != r3) goto L12
            if (r4 != 0) goto L14
            r0 = 0
            return r0
        L12:
            if (r4 == 0) goto L20
        L14:
            r1.LJIIIZ()
            boolean r0 = r1.LJJIIJ()
            if (r0 == 0) goto L20
            r1.LJIIJJI()
        L20:
            X.L7P r0 = r1.LIZIZ
            if (r0 == r3) goto L27
            r1.LIZIZ = r3
            r4 = 1
        L27:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54114LLq.LJJII(X.LH5, X.L7P, boolean):boolean");
    }
}
