package X;

import Y.ARunnableS44S0100000_8;
import com.ss.android.ugc.feed.platform.panel.digg.DiggPanelComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KR2 implements Runnable {
    public final /* synthetic */ EnumC35454Dvm LJLIL;
    public final /* synthetic */ ActivityC45651qj LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ DiggPanelComponent LJLJJL;

    public KR2(EnumC35454Dvm enumC35454Dvm, ActivityC45651qj activityC45651qj, String str, long j, DiggPanelComponent diggPanelComponent) {
        this.LJLIL = enumC35454Dvm;
        this.LJLILLLLZI = activityC45651qj;
        this.LJLJI = str;
        this.LJLJJI = j;
        this.LJLJJL = diggPanelComponent;
    }

    public final void LIZ() {
        if (this.LJLIL == EnumC35454Dvm.TOP_DARK) {
            C26045AKb c26045AKb = new C26045AKb(this.LJLILLLLZI);
            c26045AKb.LJFF(R.raw.icon_color_gradient_heart);
            c26045AKb.LJIIIZ(this.LJLJI);
            c26045AKb.LIZLLL(this.LJLJJI);
            c26045AKb.LJIIJ();
            return;
        }
        DialogC136735Yf dialogC136735Yf = new DialogC136735Yf(this.LJLILLLLZI);
        if (!new C03880Dg(2).LIZJ(300000, "com/ss/android/ugc/aweme/feed/widget/LargeToastDialog", "show", dialogC136735Yf, new Object[0], "void", new C65300Pk0(false, "()V", "196704724018314515")).LIZ) {
            dialogC136735Yf.show();
        }
        String message = this.LJLJI;
        o.LJIIIZ(message, "message");
        dialogC136735Yf.LJLIL.setIconRes(R.raw.icon_color_gradient_heart);
        dialogC136735Yf.LJLILLLLZI.setText(message);
        IViewPagerComponentAbility viewPagerComponentAbility = this.LJLJJL.getViewPagerComponentAbility();
        if (viewPagerComponentAbility == null) {
            return;
        }
        viewPagerComponentAbility.postDelayed(new ARunnableS44S0100000_8(dialogC136735Yf, 1), this.LJLJJI);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
