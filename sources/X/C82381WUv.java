package X;

import Y.ACListenerS27S0100000_7;
import android.view.View;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.WUv, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82381WUv implements WV3 {
    public boolean LJLIL = true;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLILLLLZI;
    public final /* synthetic */ I3X LJLJI;
    public final /* synthetic */ ActivityC45651qj LJLJJI;
    public final /* synthetic */ View.OnClickListener LJLJJL;
    public final /* synthetic */ ViewOnTouchListenerC82377WUr LJLJJLL;
    public final /* synthetic */ InterfaceC82086WJm LJLJL;

    @Override // X.WV3
    public final boolean LJLLLLLL() {
        return false;
    }

    @Override // X.WV3
    public final /* synthetic */ void ba() {
    }

    @Override // X.WV3
    public final void LJJIJIIJIL() {
        this.LJLJJLL.setCurrentScaleMode(0);
        this.LJLJL.LJL();
    }

    @Override // X.WV3
    public final void LJJJJI() {
        if (C43150Gwc.LIZ) {
            C43150Gwc.LIZ = false;
            C43150Gwc.LIZLLL("record_start");
        }
        C145995oB c145995oB = new C145995oB();
        c145995oB.LIZLLL("shoot_way", "scan");
        c145995oB.LIZLLL("camera", C78880UxY.LJJIJIIJI(C60903NvH.LJIIJJI().LJJIL().getCameraPosition(1)));
        FMX.LJIIL("record_demo", c145995oB.LIZ);
        I3X i3x = this.LJLJI;
        if (i3x != null) {
            i3x.Sk0(0);
        }
    }

    @Override // X.WV3
    public final void LLJJJJJIL() {
        I9L i9l = new I9L("record end");
        I3X i3x = this.LJLJI;
        if (i3x != null) {
            i3x.Ec0(i9l);
        }
    }

    @Override // X.WV3
    public final void LLLLIILLL() {
        this.LJLILLLLZI.invoke();
    }

    @Override // X.WV3
    public final boolean LLLLZ() {
        return C78598Ut0.LJIIL(this.LJLJL);
    }

    @Override // X.WV3
    public final void LLLZL() {
        this.LJLJJL.onClick(this.LJLJJLL);
    }

    @Override // X.WV3
    public final void LLIL(int i) {
        I3X i3x;
        ActivityC45651qj activityC45651qj = this.LJLJJI;
        o.LJI(activityC45651qj);
        if (!((ShortVideoContextViewModel) ViewModelProviders.of(activityC45651qj).get(ShortVideoContextViewModel.class)).gv0() && (i3x = this.LJLJI) != null) {
            i3x.r10(new C44237HXt(i, 0, 30));
        }
    }

    @Override // X.WV3
    public final void LLLLLZL(float f) {
        int i;
        if (C52264KfE.LIZ) {
            i = 0;
        } else {
            i = 100;
        }
        float f2 = i + f;
        if (this.LJLIL && f2 >= 0.0f) {
            ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) C165706es.LJII(this.LJLJJLL, null, 6).get(ShortVideoContextViewModel.class)).LJLIL;
            G8U.LIZ(1, shortVideoContext.LJI(), shortVideoContext.shootWay, "press_record_button");
            this.LJLIL = false;
        }
        this.LJLJJLL.setHasBeenMoveScaled(true);
        this.LJLJL.LLILII(f, this.LJLJJLL.getY());
    }

    public C82381WUv(ACListenerS27S0100000_7 aCListenerS27S0100000_7, ActivityC45651qj activityC45651qj, InterfaceC82086WJm interfaceC82086WJm, I3X i3x, ViewOnTouchListenerC82377WUr viewOnTouchListenerC82377WUr, AqS163S0100000_13 aqS163S0100000_13) {
        this.LJLILLLLZI = aqS163S0100000_13;
        this.LJLJI = i3x;
        this.LJLJJI = activityC45651qj;
        this.LJLJJL = aCListenerS27S0100000_7;
        this.LJLJJLL = viewOnTouchListenerC82377WUr;
        this.LJLJL = interfaceC82086WJm;
    }
}
