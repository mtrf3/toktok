package X;

import android.view.View;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.choosemusic.model.ChooseMusicWithSceneViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XW9 extends AbstractC80590Vk2 {
    public final /* synthetic */ XW8 LIZ;

    public XW9(XW8 xw8) {
        this.LIZ = xw8;
    }

    @Override // X.AbstractC80590Vk2
    public final void LIZ(View view, float f) {
        TCT tct = this.LIZ.LJLL;
        if (tct != null) {
            tct.LIZIZ(f);
        } else {
            o.LJIJI("commerceChooseMusicHelper");
            throw null;
        }
    }

    @Override // X.AbstractC80590Vk2
    public final void LIZIZ(int i, View view) {
        if (i == 5) {
            TuxTextView tuxTextView = this.LIZ.LJLJLLL;
            if (tuxTextView != null && tuxTextView.getVisibility() == 0) {
                KeyboardUtils.LIZIZ(this.LIZ.LJLJLLL);
            } else {
                TuxTextView tuxTextView2 = this.LIZ.LJLJLJ;
                if (tuxTextView2 != null) {
                    KeyboardUtils.LIZIZ(tuxTextView2);
                } else {
                    o.LJIJI("tvTitle");
                    throw null;
                }
            }
            this.LIZ.LLJILJIL();
            if (o.LJ(this.LIZ.LLJJI().hv0().getValue(), XWE.LIZ)) {
                XW8 xw8 = this.LIZ;
                xw8.getClass();
                NavigationScene LJIIJJI = C78923UyF.LJIIJJI(xw8);
                if (LJIIJJI != null) {
                    new C42653Gob();
                    LJIIJJI.LLJJJ(new C42654Goc(new C82161WMj()));
                }
                ChooseMusicWithSceneViewModel LLJJI = this.LIZ.LLJJI();
                XWD state = XWD.LIZ;
                LLJJI.getClass();
                o.LJIIIZ(state, "state");
                LLJJI.hv0().setValue(state);
            }
        }
    }
}
