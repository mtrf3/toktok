package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.assem.share.VideoShareAssem;
import com.ss.android.ugc.aweme.feed.assem.share.VideoShareViewModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import defpackage.g0;
import kotlin.jvm.internal.o;

/* renamed from: X.7zc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C204047zc extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoShareAssem, C202067wQ, C76800UCe> {
    public static final C204047zc LJLIL = new C204047zc();

    public C204047zc() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoShareAssem videoShareAssem, C202067wQ c202067wQ) {
        AnonymousClass800 anonymousClass800;
        C202067wQ c202067wQ2;
        VideoShareAssem selectSubscribe = videoShareAssem;
        C202067wQ it = c202067wQ;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(it, "it");
        C204117zj u4 = selectSubscribe.u4();
        if (u4 != null) {
            if (C63081OpJ.LLJJIII(((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme())) {
                c202067wQ2 = C202067wQ.L(it, C79081V1x.LJJIIZI(Integer.valueOf(C8ON.LIZIZ())) - C204257zx.LJ(), false, 3071);
            } else {
                c202067wQ2 = it;
            }
            if (c202067wQ2.LJLJL) {
                View view = u4.LIZJ;
                if (view != null) {
                    if (!C202677xP.LIZ()) {
                        g0.LJJIJIIJI(-2, -2, view);
                    } else {
                        g0.LJJIJIIJI(O6R.LJJIIZ(C32151Nz.LJIIZILJ(45)), -2, view);
                    }
                    C26338AVi.LJI(view, C65429Pm5.LIZIZ(c202067wQ2.LJLJI), null, C65429Pm5.LIZIZ(c202067wQ2.LJLJJI), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(c202067wQ2.LJLLI)))), false, 18);
                }
                int LIZJ = C204257zx.LIZJ();
                ConstraintLayout constraintLayout = u4.LIZLLL;
                if (constraintLayout != null) {
                    g0.LJJIJIIJI(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(c202067wQ2.LJLJLLL))) + O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(c202067wQ2.LJLJLJ))) + C278817o.LIZ(c202067wQ2.LJLIL), O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(c202067wQ2.LJLL))) + C278817o.LIZ(c202067wQ2.LJLIL) + LIZJ, constraintLayout);
                    C26338AVi.LJIIIZ(constraintLayout, Integer.valueOf(C278817o.LIZ(c202067wQ2.LJLJLJ)), Integer.valueOf(LIZJ), Integer.valueOf(C278817o.LIZ(c202067wQ2.LJLJLLL)), Integer.valueOf(C278817o.LIZ(c202067wQ2.LJLL)), 16);
                }
                C62846OlW c62846OlW = u4.LJ;
                if (c62846OlW != null) {
                    g0.LJJIJIIJI(C278817o.LIZ(c202067wQ2.LJLILLLLZI), O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(c202067wQ2.LJLILLLLZI))), c62846OlW);
                }
                TuxTextView tuxTextView = u4.LJFF;
                if (tuxTextView != null) {
                    if (u4.LIZ) {
                        tuxTextView.setTuxFont(82);
                    } else {
                        tuxTextView.setTuxFont(42);
                    }
                    if (C202677xP.LIZIZ()) {
                        tuxTextView.setMinWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(c202067wQ2.LJLJLLL))) + O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(c202067wQ2.LJLJLJ))) + C278817o.LIZ(c202067wQ2.LJLIL));
                    }
                    tuxTextView.setMinTextSize(1.0f);
                    int LIZ = C278817o.LIZ(c202067wQ2.LJLJJLL);
                    int LJ = C204257zx.LJ();
                    C8D3.LIZJ();
                    C26338AVi.LJI(tuxTextView, null, Integer.valueOf(LIZ), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(0)) / 2), Integer.valueOf(LJ), false, 17);
                    C204257zx.LJII(tuxTextView);
                }
            } else {
                int LIZJ2 = C204257zx.LIZJ();
                ConstraintLayout constraintLayout2 = u4.LIZLLL;
                if (constraintLayout2 != null) {
                    g0.LJJIJIIJI(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(c202067wQ2.LJLJLLL))) + O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(c202067wQ2.LJLJLJ))) + C278817o.LIZ(c202067wQ2.LJLIL), O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(c202067wQ2.LJLL))) + C278817o.LIZ(c202067wQ2.LJLIL) + LIZJ2, constraintLayout2);
                    C26338AVi.LJIIIZ(constraintLayout2, Integer.valueOf(C278817o.LIZ(c202067wQ2.LJLJLJ)), Integer.valueOf(LIZJ2), Integer.valueOf(C278817o.LIZ(c202067wQ2.LJLJLLL)), Integer.valueOf(C278817o.LIZ(c202067wQ2.LJLL)), 16);
                }
                C62846OlW c62846OlW2 = u4.LJ;
                if (c62846OlW2 != null) {
                    g0.LJJIJIIJI(C278817o.LIZ(c202067wQ2.LJLILLLLZI), O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(c202067wQ2.LJLILLLLZI))), c62846OlW2);
                }
                TuxTextView tuxTextView2 = u4.LJFF;
                if (tuxTextView2 != null) {
                    tuxTextView2.setMinTextSize(1.0f);
                    if (u4.LIZ) {
                        tuxTextView2.setTuxFont(72);
                    } else {
                        tuxTextView2.setTuxFont(72);
                    }
                    if (C202677xP.LIZIZ()) {
                        tuxTextView2.setMinWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(c202067wQ2.LJLJLLL))) + O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(c202067wQ2.LJLJLJ))) + C278817o.LIZ(c202067wQ2.LJLIL));
                    }
                    int LIZ2 = C278817o.LIZ(c202067wQ2.LJLJJLL);
                    int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(C204257zx.LJ())));
                    C8D3.LIZJ();
                    C26338AVi.LJI(tuxTextView2, null, Integer.valueOf(LIZ2), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(0)) / 2), Integer.valueOf(LJJIIZ), false, 17);
                    C204257zx.LJII(tuxTextView2);
                }
                View view2 = u4.LIZJ;
                if (view2 != null) {
                    C26338AVi.LJI(view2, C65429Pm5.LIZIZ(c202067wQ2.LJLJI), null, C65429Pm5.LIZIZ(c202067wQ2.LJLJJI), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(c202067wQ2.LJLLI)))), false, 18);
                }
            }
        }
        selectSubscribe.z4().LJLJLLL = it.LJLILLLLZI;
        VideoShareViewModel z4 = selectSubscribe.z4();
        float f = selectSubscribe.z4().LJLJLLL;
        C204237zv c204237zv = (C204237zv) z4.getState();
        AnonymousClass800 anonymousClass8002 = ((C204237zv) z4.getState()).LJLJI;
        if (anonymousClass8002 != null) {
            anonymousClass800 = AnonymousClass800.LIZ(anonymousClass8002, null, new ViewGroup.LayoutParams(C278817o.LIZ(f), C278817o.LIZ(f)), 1);
        } else {
            anonymousClass800 = null;
        }
        C204237zv.LIZ(c204237zv, null, anonymousClass800, null, null, null, null, 123);
        return C76800UCe.LIZ;
    }
}
