package X;

import android.content.Context;
import android.util.AttributeSet;
import com.zhiliaoapp.musically.R;
import defpackage.a1;

/* renamed from: X.MDm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56450MDm extends C56448MDk {
    public final int LLF;
    public final int LLFF;
    public final int LLFFF;
    public final int LLFII;
    public final int LLFZ;
    public int LLI;

    @Override // X.C56448MDk
    public final void LIZJ(int i) {
        float progressHeight;
        float f = this.LLFFF;
        float f2 = this.LLFF;
        int i2 = this.LLI;
        int i3 = this.LLFZ;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    progressHeight = 0.0f;
                } else {
                    setProgressHeight(f2);
                    progressHeight = getProgressHeight() / 2;
                    i2 = this.LLFII;
                    this.LLI = i2;
                    i3 = this.LLFZ;
                }
            } else {
                setProgressHeight(f2);
                progressHeight = getProgressHeight() / 2;
                i2 = this.LLFII;
                this.LLI = i2;
                i3 = this.LLFZ;
            }
        } else {
            setProgressHeight(this.LLF);
            progressHeight = getProgressHeight() / 2;
            i2 = this.LLFII;
            this.LLI = i2;
            i3 = this.LLFZ;
        }
        C81238VuU mutableSeekBar = getMutableSeekBar();
        if (mutableSeekBar != null) {
            C54840Lfg.LJLIIL(0, mutableSeekBar);
            C81238VuU.LIZLLL(mutableSeekBar, Integer.valueOf(this.LLI), Integer.valueOf(i3), Float.valueOf(getProgressHeight()), Float.valueOf(progressHeight), false, 112);
            C81238VuU.LJ(mutableSeekBar, Float.valueOf(f), Float.valueOf(f), Float.valueOf(f2), Integer.valueOf(i2), 0.0f, false, 1008);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56450MDm(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LLF = (int) KL2.LIZJ(context, 2.0f);
        this.LLFF = (int) KL2.LIZJ(context, 6.0f);
        this.LLFFF = (int) KL2.LIZJ(context, 12.0f);
        this.LLFII = C04330Ez.LIZIZ(context, R.color.ar);
        int LIZIZ = C04330Ez.LIZIZ(context, R.color.bg);
        this.LLFZ = C04330Ez.LIZIZ(context, R.color.ba);
        this.LLI = LIZIZ;
    }
}
