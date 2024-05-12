package X;

import Y.ARunnableS35S0200000_16;
import android.os.Handler;
import com.bytedance.android.livesdk.model.message.RankAnimationInfo;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.YdK, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87818YdK {
    public final C87820YdM LIZ;
    public final InterfaceC87839Ydf LIZIZ;
    public final boolean LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public int LJFF;
    public final int LJI;
    public final int LJII;
    public final float LJIIIIZZ;
    public final int LJIIIZ;
    public final float LJIIJ;
    public C31521CYr LJIIJJI;
    public boolean LJIIL;
    public C31521CYr LJIILIIL;
    public AbstractC87817YdJ LJIILJJIL;
    public final Handler LJIILL;
    public Runnable LJIILLIIL;
    public ARunnableS35S0200000_16 LJIIZILJ;
    public ARunnableS35S0200000_16 LJIJ;

    public final void LIZ(AbstractC87817YdJ abstractC87817YdJ) {
        this.LJIILJJIL = abstractC87817YdJ;
        if (abstractC87817YdJ == null) {
            C31521CYr c31521CYr = this.LJIILIIL;
            this.LJIILIIL = null;
            if (c31521CYr != null) {
                RankAnimationInfo rankAnimationInfo = c31521CYr.LJFF;
                if (rankAnimationInfo != null && rankAnimationInfo.type == EnumC31519CYp.BEFORE_SETTLE.getType()) {
                    C87820YdM c87820YdM = this.LIZ;
                    ((AbstractC87817YdJ) c87820YdM.LJIIIZ.LIZ(c87820YdM, C87820YdM.LJIIL[8])).LIZLLL(c31521CYr);
                    return;
                }
                RankAnimationInfo rankAnimationInfo2 = c31521CYr.LJFF;
                if (rankAnimationInfo2 == null || rankAnimationInfo2.type != EnumC31519CYp.BEFORE_SETTLE_SIMPLE.getType()) {
                    return;
                }
                C87820YdM c87820YdM2 = this.LIZ;
                ((AbstractC87817YdJ) c87820YdM2.LJIIJ.LIZ(c87820YdM2, C87820YdM.LJIIL[9])).LIZLLL(c31521CYr);
            }
        }
    }

    public C87818YdK(C87820YdM animationManager, InterfaceC87839Ydf iAnimationFinishListener, boolean z) {
        o.LJIIIZ(animationManager, "animationManager");
        o.LJIIIZ(iAnimationFinishListener, "iAnimationFinishListener");
        this.LIZ = animationManager;
        this.LIZIZ = iAnimationFinishListener;
        this.LIZJ = z;
        this.LIZLLL = C15380j0.LIZ(40.0f);
        this.LJ = C15380j0.LIZIZ(R.color.yi);
        this.LJFF = C15380j0.LIZIZ(R.color.ca);
        this.LJI = C15380j0.LIZIZ(R.color.a_b);
        this.LJII = C15380j0.LIZIZ(R.color.a4x);
        this.LJIIIIZZ = C15380j0.LIZ(11.0f);
        this.LJIIIZ = 12;
        this.LJIIJ = C15380j0.LIZ(18.0f);
        this.LJIIL = true;
        this.LJIILL = new Handler(C16880lQ.LLJJJJ());
    }
}
