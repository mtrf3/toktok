package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessNewStartDialog;
import com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessStartFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.BAg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28338BAg implements LHW {
    public final /* synthetic */ DrawGuessNewStartDialog LJLIL;

    @Override // X.InterfaceC54357LUz
    public final void LIZJ(C78856UxA tab) {
        o.LJIIIZ(tab, "tab");
    }

    public C28338BAg(DrawGuessNewStartDialog drawGuessNewStartDialog) {
        this.LJLIL = drawGuessNewStartDialog;
    }

    @Override // X.InterfaceC54357LUz
    public final void LIZ(C78856UxA tab) {
        View view;
        C47121t6 c47121t6;
        o.LJIIIZ(tab, "tab");
        if (this.LJLIL.isViewValid && (view = tab.LJFF) != null && (c47121t6 = (C47121t6) view.findViewById(R.id.kyq)) != null) {
            C87277YNd.LJJIIJZLJL(c47121t6, R.color.cu);
        }
    }

    @Override // X.InterfaceC54357LUz
    public final void LIZIZ(C78856UxA tab) {
        C47121t6 c47121t6;
        o.LJIIIZ(tab, "tab");
        if (this.LJLIL.isViewValid) {
            View view = tab.LJFF;
            if (view != null && (c47121t6 = (C47121t6) view.findViewById(R.id.kyq)) != null) {
                C87277YNd.LJJIIJZLJL(c47121t6, R.color.ck);
            }
            int i = tab.LJ;
            if (i != 0) {
                if (i != 1) {
                    return;
                }
                DrawGuessNewStartDialog drawGuessNewStartDialog = this.LJLIL;
                FragmentManager childFragmentManager = drawGuessNewStartDialog.getChildFragmentManager();
                C1B3 LIZ = C1B6.LIZ(childFragmentManager, childFragmentManager);
                LIZ.LJIIL((Fragment) drawGuessNewStartDialog.LJLILLLLZI.getValue());
                LIZ.LJIIIZ(drawGuessNewStartDialog.vl());
                LIZ.LJIILJJIL();
                DrawGuessStartFragment vl = drawGuessNewStartDialog.vl();
                vl.LJLJLJ = false;
                LiveEditText liveEditText = (LiveEditText) vl._$_findCachedViewById(R.id.cos);
                if (liveEditText != null) {
                    C29306Beo.LJII(liveEditText);
                }
                Fragment fragment = (Fragment) drawGuessNewStartDialog.LJLILLLLZI.getValue();
                fragment.getClass();
                BZI LIZ2 = C28787BRn.LIZ("livesdk_anchor_pictionary_freely_panel_show");
                LIZ2.LJIILLIIL(C51029K0z.LJIILIIL(fragment));
                BAI.LIZ(LIZ2);
                LIZ2.LJJIIJZLJL();
                return;
            }
            DrawGuessNewStartDialog drawGuessNewStartDialog2 = this.LJLIL;
            FragmentManager childFragmentManager2 = drawGuessNewStartDialog2.getChildFragmentManager();
            C1B3 LIZ3 = C1B6.LIZ(childFragmentManager2, childFragmentManager2);
            LIZ3.LJIIL(drawGuessNewStartDialog2.vl());
            LIZ3.LJIIIZ((Fragment) drawGuessNewStartDialog2.LJLILLLLZI.getValue());
            LIZ3.LJIILJJIL();
            drawGuessNewStartDialog2.vl().getClass();
            drawGuessNewStartDialog2.LJLILLLLZI.getValue().getClass();
        }
    }
}
