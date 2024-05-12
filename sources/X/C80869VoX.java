package X;

import android.content.Context;
import android.util.AttributeSet;
import com.zhiliaoapp.musically.R;

/* renamed from: X.VoX, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80869VoX extends AbstractC80871VoZ<C80601VkD> {
    public static final /* synthetic */ int LJLLJ = 0;

    public int getIndicatorDirection() {
        return ((C80601VkD) this.LJLIL).LJIIIIZZ;
    }

    public int getIndicatorInset() {
        return ((C80601VkD) this.LJLIL).LJII;
    }

    public int getIndicatorSize() {
        return ((C80601VkD) this.LJLIL).LJI;
    }

    public void setIndicatorDirection(int i) {
        ((C80601VkD) this.LJLIL).LJIIIIZZ = i;
        invalidate();
    }

    public void setIndicatorInset(int i) {
        S s = this.LJLIL;
        if (((C80601VkD) s).LJII != i) {
            ((C80601VkD) s).LJII = i;
            invalidate();
        }
    }

    public void setIndicatorSize(int i) {
        S s = this.LJLIL;
        if (((C80601VkD) s).LJI != i) {
            ((C80601VkD) s).LJI = i;
            s.LIZ();
            invalidate();
        }
    }

    @Override // X.AbstractC80871VoZ
    public void setTrackThickness(int i) {
        super.setTrackThickness(i);
        this.LJLIL.LIZ();
    }

    public C80869VoX(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.a3d, R.style.a0e);
        Context context2 = getContext();
        C80601VkD c80601VkD = (C80601VkD) this.LJLIL;
        setIndeterminateDrawable(new C80873Vob(context2, c80601VkD, new C80868VoW(c80601VkD), new C80881Voj(c80601VkD)));
        Context context3 = getContext();
        C80601VkD c80601VkD2 = (C80601VkD) this.LJLIL;
        setProgressDrawable(new C80874Voc(context3, c80601VkD2, new C80868VoW(c80601VkD2)));
    }

    @Override // X.AbstractC80871VoZ
    public final C80601VkD LIZ(Context context, AttributeSet attributeSet) {
        return new C80601VkD(context, attributeSet);
    }
}
