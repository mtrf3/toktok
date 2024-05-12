package X;

import android.view.View;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;

/* renamed from: X.WUw, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82382WUw implements WV3 {
    public boolean LJLIL = true;
    public final /* synthetic */ I3X LJLILLLLZI;
    public final /* synthetic */ ActivityC45651qj LJLJI;
    public final /* synthetic */ View.OnClickListener LJLJJI;
    public final /* synthetic */ ViewOnTouchListenerC82377WUr LJLJJL;
    public final /* synthetic */ InterfaceC82086WJm LJLJJLL;
    public final /* synthetic */ WV4 LJLJL;

    @Override // X.WV3
    public final boolean LJLLLLLL() {
        return false;
    }

    @Override // X.WV3
    public final void LLLLIILLL() {
    }

    @Override // X.WV3
    public final void LJJIJIIJIL() {
        this.LJLJJL.setCurrentScaleMode(0);
        this.LJLJJLL.LJL();
    }

    @Override // X.WV3
    public final void LJJJJI() {
        if (C43150Gwc.LIZ) {
            C43150Gwc.LIZ = false;
            C43150Gwc.LIZLLL("record_start");
        }
        this.LJLILLLLZI.Sk0(0);
    }

    @Override // X.WV3
    public final void LLJJJJJIL() {
        this.LJLILLLLZI.Ec0(new I9L("record end"));
    }

    @Override // X.WV3
    public final boolean LLLLZ() {
        return C78598Ut0.LJIIL(this.LJLJJLL);
    }

    @Override // X.WV3
    public final void LLLZL() {
        this.LJLJJI.onClick(this.LJLJJL);
    }

    @Override // X.WV3
    public final void ba() {
        C6FZ c6fz = this.LJLJL.LIZ;
        long currentTimeMillis = System.currentTimeMillis() - this.LJLJJL.getActionDownTime();
        c6fz.getClass();
        C6FZ.LIZIZ(c6fz, "click_record", currentTimeMillis, false, 12);
    }

    @Override // X.WV3
    public final void LLIL(int i) {
        if (((ShortVideoContextViewModel) ViewModelProviders.of(this.LJLJI).get(ShortVideoContextViewModel.class)).gv0()) {
            return;
        }
        this.LJLILLLLZI.r10(new C44237HXt(i));
    }

    @Override // X.WV3
    public final void LLLLLZL(float f) {
        float f2;
        if (!C52264KfE.LIZ) {
            f2 = 100.0f + f;
        } else {
            f2 = f;
        }
        if (this.LJLIL && f2 >= 0.0f) {
            ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) C165706es.LIZLLL(this.LJLJJL).get(ShortVideoContextViewModel.class)).LJLIL;
            if (shortVideoContext != null) {
                G8U.LIZ(1, shortVideoContext.LJI(), shortVideoContext.shootWay, "press_record_button");
            }
            this.LJLIL = false;
        }
        this.LJLJJL.setHasBeenMoveScaled(true);
        this.LJLJJLL.LLILII(f, this.LJLJJL.getY());
    }

    public C82382WUw(WV4 wv4, I3X i3x, ActivityC45651qj activityC45651qj, View.OnClickListener onClickListener, ViewOnTouchListenerC82377WUr viewOnTouchListenerC82377WUr, InterfaceC82086WJm interfaceC82086WJm) {
        this.LJLJL = wv4;
        this.LJLILLLLZI = i3x;
        this.LJLJI = activityC45651qj;
        this.LJLJJI = onClickListener;
        this.LJLJJL = viewOnTouchListenerC82377WUr;
        this.LJLJJLL = interfaceC82086WJm;
    }
}
