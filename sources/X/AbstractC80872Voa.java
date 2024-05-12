package X;

import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Voa, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC80872Voa extends Drawable implements Animatable {
    public static final C80876Voe LJLLI = new C80876Voe(Float.class);
    public final Context LJLIL;
    public final AbstractC80600VkC LJLILLLLZI;
    public ValueAnimator LJLJJI;
    public ValueAnimator LJLJJL;
    public List<C0FH> LJLJJLL;
    public boolean LJLJL;
    public float LJLJLJ;
    public int LJLL;
    public final Paint LJLJLLL = new Paint();
    public C80880Voi LJLJI = new C80880Voi();

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        LJFF(true, true, false);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        LJFF(false, true, false);
    }

    public final float LIZIZ() {
        AbstractC80600VkC abstractC80600VkC = this.LJLILLLLZI;
        if (abstractC80600VkC.LJ != 0 || abstractC80600VkC.LJFF != 0) {
            return this.LJLJLJ;
        }
        return 1.0f;
    }

    public final boolean LIZJ() {
        ValueAnimator valueAnimator = this.LJLJJL;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return false;
        }
        return true;
    }

    public final boolean LIZLLL() {
        ValueAnimator valueAnimator = this.LJLJJI;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        if (LIZLLL() || LIZJ()) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.LJLL;
    }

    public static /* synthetic */ void LIZ(AbstractC80872Voa abstractC80872Voa) {
        super.setVisible(false, false);
    }

    public final void LJI(C80879Voh c80879Voh) {
        List<C0FH> list = this.LJLJJLL;
        if (list != null && ((ArrayList) list).contains(c80879Voh)) {
            ((ArrayList) this.LJLJJLL).remove(c80879Voh);
            if (((ArrayList) this.LJLJJLL).isEmpty()) {
                this.LJLJJLL = null;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.LJLL = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.LJLJLLL.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public AbstractC80872Voa(Context context, AbstractC80600VkC abstractC80600VkC) {
        this.LJLIL = context;
        this.LJLILLLLZI = abstractC80600VkC;
        setAlpha(255);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        return LJ(z, z2, true);
    }

    public final boolean LJ(boolean z, boolean z2, boolean z3) {
        boolean z4;
        C80880Voi c80880Voi = this.LJLJI;
        ContentResolver contentResolver = this.LJLIL.getContentResolver();
        c80880Voi.getClass();
        float f = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (z3 && f > 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        return LJFF(z, z2, z4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a7, code lost:
    
        if (r6.LJLILLLLZI.LJ != 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a9, code lost:
    
        if (r8 != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00af, code lost:
    
        if (r2.isPaused() != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b5, code lost:
    
        r2.resume();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b4, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b1, code lost:
    
        r2.start();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c2, code lost:
    
        r0 = r6.LJLJL;
        r6.LJLJL = true;
        r2.end();
        r6.LJLJL = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00cb, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00bd, code lost:
    
        if (r6.LJLILLLLZI.LJFF != 0) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean LJFF(boolean r7, boolean r8, boolean r9) {
        /*
            r6 = this;
            android.animation.ValueAnimator r2 = r6.LJLJJI
            r0 = 500(0x1f4, double:2.47E-321)
            r5 = 2
            if (r2 != 0) goto L34
            X.Voe r3 = X.AbstractC80872Voa.LJLLI
            float[] r2 = new float[r5]
            r2 = {x00dc: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r6, r3, r2)
            r6.LJLJJI = r2
            r2.setDuration(r0)
            android.animation.ValueAnimator r3 = r6.LJLJJI
            X.1Je r2 = X.C80237VeL.LIZIZ
            r3.setInterpolator(r2)
            android.animation.ValueAnimator r4 = r6.LJLJJI
            if (r4 == 0) goto L28
            boolean r2 = r4.isRunning()
            if (r2 != 0) goto Ld4
        L28:
            r6.LJLJJI = r4
            Y.ALAdapterS11S0100000_14 r3 = new Y.ALAdapterS11S0100000_14
            r2 = 50
            r3.<init>(r6, r2)
            r4.addListener(r3)
        L34:
            android.animation.ValueAnimator r2 = r6.LJLJJL
            if (r2 != 0) goto L65
            X.Voe r3 = X.AbstractC80872Voa.LJLLI
            float[] r2 = new float[r5]
            r2 = {x00e4: FILL_ARRAY_DATA , data: [1065353216, 0} // fill-array
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r6, r3, r2)
            r6.LJLJJL = r2
            r2.setDuration(r0)
            android.animation.ValueAnimator r1 = r6.LJLJJL
            X.1Je r0 = X.C80237VeL.LIZIZ
            r1.setInterpolator(r0)
            android.animation.ValueAnimator r2 = r6.LJLJJL
            if (r2 == 0) goto L59
            boolean r0 = r2.isRunning()
            if (r0 != 0) goto Lcc
        L59:
            r6.LJLJJL = r2
            Y.ALAdapterS11S0100000_14 r1 = new Y.ALAdapterS11S0100000_14
            r0 = 51
            r1.<init>(r6, r0)
            r2.addListener(r1)
        L65:
            boolean r0 = r6.isVisible()
            r1 = 0
            if (r0 != 0) goto L6f
            if (r7 != 0) goto L71
            return r1
        L6f:
            if (r7 == 0) goto L8e
        L71:
            android.animation.ValueAnimator r2 = r6.LJLJJI
        L73:
            r3 = 1
            if (r9 != 0) goto L91
            boolean r0 = r2.isRunning()
            if (r0 == 0) goto L84
            r2.end()
        L7f:
            boolean r0 = super.setVisible(r7, r1)
            return r0
        L84:
            boolean r0 = r6.LJLJL
            r6.LJLJL = r3
            r2.end()
            r6.LJLJL = r0
            goto L7f
        L8e:
            android.animation.ValueAnimator r2 = r6.LJLJJL
            goto L73
        L91:
            boolean r0 = r2.isRunning()
            if (r0 == 0) goto L98
            return r1
        L98:
            if (r7 == 0) goto La0
            boolean r0 = super.setVisible(r7, r1)
            if (r0 == 0) goto Lc0
        La0:
            r1 = 1
            if (r7 == 0) goto Lb9
        La3:
            X.VkC r0 = r6.LJLILLLLZI
            int r0 = r0.LJ
            if (r0 == 0) goto Lc2
        La9:
            if (r8 != 0) goto Lb1
            boolean r0 = r2.isPaused()
            if (r0 != 0) goto Lb5
        Lb1:
            r2.start()
        Lb4:
            return r1
        Lb5:
            r2.resume()
            goto Lb4
        Lb9:
            X.VkC r0 = r6.LJLILLLLZI
            int r0 = r0.LJFF
            if (r0 == 0) goto Lc2
            goto La9
        Lc0:
            r1 = 0
            goto La3
        Lc2:
            boolean r0 = r6.LJLJL
            r6.LJLJL = r3
            r2.end()
            r6.LJLJL = r0
            return r1
        Lcc:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Cannot set hideAnimator while the current hideAnimator is running."
            r1.<init>(r0)
            throw r1
        Ld4:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Cannot set showAnimator while the current showAnimator is running."
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC80872Voa.LJFF(boolean, boolean, boolean):boolean");
    }
}
