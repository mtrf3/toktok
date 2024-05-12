package X;

import android.os.Build;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import kotlin.jvm.internal.AqS0S0000001_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6OJ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6OJ extends C6OL<C159366Ng> implements InterfaceC159496Nt {
    public final C159366Ng LJI;
    public final C1NS<TextStickerModel> LJII;

    @Override // X.InterfaceC159496Nt
    public final void LIZ() {
        this.LIZIZ.LIZIZ(this.LIZ);
    }

    @Override // X.InterfaceC159496Nt
    public final void LIZIZ() {
        int i;
        C6OK c6ok = this.LIZIZ;
        float progress = c6ok.LIZ.getProgress();
        if (Build.VERSION.SDK_INT >= 26) {
            i = c6ok.LIZ.getMin();
        } else {
            i = 0;
        }
        float f = i;
        float max = c6ok.LIZ.getMax();
        float f2 = c6ok.LIZLLL;
        float f3 = c6ok.LJ;
        if (progress > f) {
            if (progress >= max) {
                f2 = f3;
            } else {
                f2 = C06420Na.LIZIZ(progress, f, f3, (max - progress) * f2) / (max - f);
            }
        }
        if (LIZLLL() / LIZJ() == f2) {
            return;
        }
        LJI(LIZJ() * f2);
    }

    @Override // X.C6OL
    public final float LIZJ() {
        return this.LJI.getDefaultTextSize();
    }

    @Override // X.C6OL
    public final float LIZLLL() {
        return this.LJII.LJ.getFontModel().fontSize;
    }

    @Override // X.C6OL
    public final void LJ() {
        super.LJ();
        this.LJI.setFontTypeChangedListener(this);
    }

    @Override // X.C6OL
    public final void LJFF() {
        super.LJFF();
        this.LJI.setFontTypeChangedListener(null);
    }

    @Override // X.C6OL
    public final void LJI(float f) {
        if (O6R.LJJIIZ(f) != this.LJII.LJ.getFontModel().fontSize) {
            this.LJII.LJ(new AqS0S0000001_2(f, 9));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6OJ(C159366Ng view, C6OK sizeHelper, C6OS c6os, C1NS c1ns) {
        super(view, sizeHelper, c6os);
        o.LJIIIZ(view, "view");
        o.LJIIIZ(sizeHelper, "sizeHelper");
        this.LJI = view;
        this.LJII = c1ns;
    }
}
