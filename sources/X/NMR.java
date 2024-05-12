package X;

import android.app.Activity;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

/* loaded from: classes11.dex */
public final class NMR extends AbstractC008101l {
    public final /* synthetic */ FrameLayout LIZJ;
    public final /* synthetic */ NOO LIZLLL;
    public final /* synthetic */ C68322mC<Fragment> LJ;
    public final /* synthetic */ boolean LJFF;
    public final /* synthetic */ Activity LJI;

    @Override // X.AbstractC008101l
    public final void LIZ() {
        NMS nms;
        ActivityC45651qj activityC45651qj;
        FragmentManager supportFragmentManager;
        if (this.LIZJ.getVisibility() == 0) {
            NOO noo = this.LIZLLL;
            FrameLayout frameLayout = this.LIZJ;
            InterfaceC36571c5 interfaceC36571c5 = this.LJ.element;
            if (interfaceC36571c5 instanceof NMS) {
                nms = (NMS) interfaceC36571c5;
            } else {
                nms = null;
            }
            boolean z = this.LJFF;
            noo.getClass();
            if (frameLayout.getVisibility() != 8) {
                frameLayout.setVisibility(8);
                if (nms != null) {
                    nms.onHide();
                }
                if (!z) {
                    IWF.LJJLIIIIJ().LIZIZ();
                }
            }
            Fragment fragment = this.LJ.element;
            if (fragment != null) {
                Activity activity = this.LJI;
                if ((activity instanceof ActivityC45651qj) && (activityC45651qj = (ActivityC45651qj) activity) != null && (supportFragmentManager = activityC45651qj.getSupportFragmentManager()) != null) {
                    C1B3 c1b3 = new C1B3(supportFragmentManager);
                    c1b3.LJJI(fragment);
                    c1b3.LJI();
                }
            }
            this.LJ.element = null;
        }
        LIZIZ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NMR(FrameLayout frameLayout, NOO noo, C68322mC<Fragment> c68322mC, boolean z, Activity activity) {
        super(true);
        this.LIZJ = frameLayout;
        this.LIZLLL = noo;
        this.LJ = c68322mC;
        this.LJFF = z;
        this.LJI = activity;
    }
}
