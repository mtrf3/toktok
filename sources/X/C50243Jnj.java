package X;

import Y.AObserverS76S0100000_8;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import com.ss.android.ugc.aweme.search.pages.common.theme.ThemeViewModel;
import com.ss.android.ugc.aweme.search.pages.result.common.topbarefficiency.core.viewmodel.SearchContainerHeaderVM;
import kotlin.jvm.internal.o;

/* renamed from: X.Jnj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50243Jnj extends Drawable {
    public final ThemeViewModel LIZ;
    public final SearchContainerHeaderVM LIZIZ;
    public LinearGradient LIZJ;
    public int LIZLLL;
    public final int[] LJ = {0, 0, 0};
    public float LJFF;
    public final Paint LJI;
    public int LJII;
    public int LJIIIIZZ;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void LIZ() {
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 0.0f, this.LJ, (float[]) null, Shader.TileMode.CLAMP);
        this.LIZJ = linearGradient;
        this.LJI.setShader(linearGradient);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZIZ() {
        SearchContainerHeaderVM searchContainerHeaderVM;
        NextLiveData nextLiveData;
        Integer num;
        float f;
        NextLiveData nextLiveData2;
        if (C49804Jge.LJJIZ() && (searchContainerHeaderVM = this.LIZIZ) != null && (nextLiveData = searchContainerHeaderVM.LJLLJ) != null && nextLiveData.getValue() != 0) {
            SearchContainerHeaderVM searchContainerHeaderVM2 = this.LIZIZ;
            if (searchContainerHeaderVM2 == null || (nextLiveData2 = searchContainerHeaderVM2.LJLLJ) == null || (num = (Integer) nextLiveData2.getValue()) == null) {
                num = 0;
            }
            int intValue = num.intValue();
            int i = this.LJIIIIZZ;
            int i2 = i + intValue;
            if (i2 > 0) {
                f = ((this.LJFF * i) + intValue) / i2;
            } else {
                f = this.LJFF;
            }
            int i3 = this.LIZLLL;
            this.LIZJ = new LinearGradient(0.0f, 0.0f, 0.0f, this.LJIIIIZZ + intValue, new int[]{i3, i3, 0}, new float[]{0.0f, f, 1.0f}, Shader.TileMode.CLAMP);
        } else {
            float[] fArr = {0.0f, this.LJFF, 1.0f};
            int i4 = this.LIZLLL;
            this.LIZJ = new LinearGradient(0.0f, 0.0f, 0.0f, this.LJIIIIZZ, new int[]{i4, i4, 0}, fArr, Shader.TileMode.CLAMP);
        }
        this.LJI.setShader(this.LIZJ);
    }

    public C50243Jnj(ActivityC45651qj activityC45651qj) {
        float f;
        NextLiveData nextLiveData;
        ThemeViewModel themeViewModel = this.LIZ;
        if (themeViewModel != null) {
            f = 1.0f;
            if (themeViewModel.LJLJJI) {
                int i = themeViewModel.LJLJI;
                int i2 = themeViewModel.LJLILLLLZI;
                if ((i + i2) / 2 >= i2) {
                    f = ((r0 - i2) * 1.0f) / i;
                }
            }
        } else {
            f = 0.0f;
        }
        this.LJFF = f;
        this.LJI = new Paint();
        if (activityC45651qj != null) {
            ThemeViewModel themeViewModel2 = (ThemeViewModel) ViewModelProviders.of(activityC45651qj).get(ThemeViewModel.class);
            this.LIZ = themeViewModel2;
            if (themeViewModel2 != null) {
                MutableLiveData<C50240Jng> hv0 = themeViewModel2.hv0();
                if (hv0 != null) {
                    hv0.observe(activityC45651qj, new AObserverS76S0100000_8(this, 152));
                }
                MutableLiveData<C50240Jng> gv0 = themeViewModel2.gv0();
                if (gv0 != null) {
                    gv0.observe(activityC45651qj, new AObserverS76S0100000_8(this, 153));
                }
            }
            if (C49804Jge.LJJIZ()) {
                SearchContainerHeaderVM searchContainerHeaderVM = (SearchContainerHeaderVM) ViewModelProviders.of(activityC45651qj).get(SearchContainerHeaderVM.class);
                this.LIZIZ = searchContainerHeaderVM;
                if (searchContainerHeaderVM != null && (nextLiveData = searchContainerHeaderVM.LJLLJ) != null) {
                    nextLiveData.observe(activityC45651qj, new AObserverS76S0100000_8(this, 154));
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Integer num;
        NextLiveData nextLiveData;
        o.LJIIIZ(canvas, "canvas");
        if (this.LIZJ == null) {
            LIZ();
        }
        float width = getBounds().width();
        canvas.translate(0.0f, this.LJII * (-1.0f));
        if (C49804Jge.LJJIZ()) {
            float f = this.LJIIIIZZ;
            SearchContainerHeaderVM searchContainerHeaderVM = this.LIZIZ;
            if (searchContainerHeaderVM == null || (nextLiveData = searchContainerHeaderVM.LJLLJ) == null || (num = (Integer) nextLiveData.getValue()) == null) {
                num = 0;
            }
            o.LJIIIIZZ(num, "searchContainerHeaderVM?.rvTopPadding?.value ?: 0");
            canvas.drawRect(0.0f, 0.0f, width, num.floatValue() + f, this.LJI);
        } else {
            canvas.drawRect(0.0f, 0.0f, width, this.LJIIIIZZ, this.LJI);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onDraw, gradientEndPos = ");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(", startPos = ");
        LIZ.append(this.LJII);
        LIZ.append(", startColor = ");
        LIZ.append(this.LIZLLL);
        X1D.LIZIZ(LIZ);
    }
}
