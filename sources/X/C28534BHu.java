package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.hashtag.PreviewHashtagDialog;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.BHu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C28534BHu extends TBS implements InterfaceC88472Yns<EnumC28536BHw, C76800UCe> {
    public C28534BHu(Object obj) {
        super(1, obj, PreviewHashtagDialog.class, "switchPage", "switchPage(Lcom/bytedance/android/livesdk/dataChannel/HashtagDialogPage;)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(EnumC28536BHw enumC28536BHw) {
        Fragment wl;
        EnumC28536BHw p0 = enumC28536BHw;
        o.LJIIIZ(p0, "p0");
        PreviewHashtagDialog previewHashtagDialog = (PreviewHashtagDialog) this.receiver;
        previewHashtagDialog.getClass();
        if (p0 == EnumC28536BHw.FINISH) {
            previewHashtagDialog.dismiss();
        } else {
            FragmentManager childFragmentManager = previewHashtagDialog.getChildFragmentManager();
            C1B3 LIZ = C1B6.LIZ(childFragmentManager, childFragmentManager);
            if (p0 != EnumC28536BHw.GO_BACK) {
                int i = C28535BHv.LIZ[p0.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        wl = previewHashtagDialog.vl();
                    }
                    previewHashtagDialog.wl().setUserVisibleHint(false);
                } else {
                    wl = previewHashtagDialog.wl();
                }
                if (wl != null) {
                    LIZ.LJIIJJI(R.anim.hc, R.anim.h_, 0, 0);
                    LIZ.LJIIIIZZ(R.id.xl, 1, wl, null);
                }
                previewHashtagDialog.wl().setUserVisibleHint(false);
            } else {
                List<Fragment> list = previewHashtagDialog.getChildFragmentManager().LJJJJLI();
                o.LJIIIIZZ(list, "list");
                Fragment fragment = (Fragment) ORZ.LJLLLLLL(C47261Igj.LJJI(list), list);
                if (fragment != null) {
                    LIZ.LJIIJJI(R.anim.h9, R.anim.hd, 0, 0);
                    LIZ.LJJI(fragment);
                }
                previewHashtagDialog.wl().setUserVisibleHint(true);
            }
            LIZ.LJIILJJIL();
        }
        return C76800UCe.LIZ;
    }
}
