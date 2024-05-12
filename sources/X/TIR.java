package X;

import Y.ACListenerS21S0100000_1;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public abstract class TIR implements InterfaceC72862Sig {
    public final ActivityC45651qj LIZ;

    public void LIZIZ(Effect curEffect) {
        o.LJIIIZ(curEffect, "curEffect");
    }

    public void LIZJ(Effect curEffect) {
        o.LJIIIZ(curEffect, "curEffect");
    }

    public void LJ(Effect curEffect) {
        o.LJIIIZ(curEffect, "curEffect");
    }

    public void LJFF(Effect curEffect) {
        o.LJIIIZ(curEffect, "curEffect");
    }

    public abstract void LJI(Effect effect);

    public TIR(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        this.LIZ = activity;
    }

    public final void LIZLLL(Effect curEffect) {
        o.LJIIIZ(curEffect, "curEffect");
        if (this.LIZ.isFinishing()) {
            return;
        }
        C245319jz c245319jz = new C245319jz();
        C252669vq LIZIZ = C06530Nl.LIZIZ(R.string.fsi);
        LIZIZ.LIZJ = 1;
        LIZIZ.LJ = new ACListenerS21S0100000_1(new AqS143S0200000_12(this, curEffect, 159), (InterfaceC88472Yns<? super View, C76800UCe>) 27);
        C252669vq LIZIZ2 = C06530Nl.LIZIZ(R.string.fse);
        LIZIZ2.LJ = new ACListenerS21S0100000_1(new AqS143S0200000_12(this, curEffect, 160), (InterfaceC88472Yns<? super View, C76800UCe>) 27);
        c245319jz.LIZIZ(LIZIZ, LIZIZ2);
        c245319jz.LIZ.LJLIL = new TIS(this, curEffect);
        TuxActionSheet LIZJ = c245319jz.LIZJ();
        FragmentManager supportFragmentManager = this.LIZ.getSupportFragmentManager();
        o.LJIIIIZZ(supportFragmentManager, "activity.supportFragmentManager");
        LIZJ.show(supportFragmentManager, "BlockSticker");
    }
}
