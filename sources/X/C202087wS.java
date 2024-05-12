package X;

import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggAssem;
import defpackage.g0;
import kotlin.jvm.internal.o;

/* renamed from: X.7wS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C202087wS extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoDiggAssem, C202067wQ, C76800UCe> {
    public static final C202087wS LJLIL = new C202087wS();

    public C202087wS() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoDiggAssem videoDiggAssem, C202067wQ c202067wQ) {
        C202467x4 c202467x4;
        TuxTextView tuxTextView;
        VideoDiggAssem selectSubscribe = videoDiggAssem;
        C202067wQ it = c202067wQ;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(it, "it");
        C202477x5 u4 = selectSubscribe.u4();
        if (it.LJLJL) {
            C204257zx.LJI("digg helper, small screen");
            View view = u4.LIZIZ;
            if (view != null) {
                C26338AVi.LJI(view, C65429Pm5.LIZIZ(it.LJLJI), null, C65429Pm5.LIZIZ(it.LJLJJI), C65429Pm5.LIZIZ(it.LJLLI), false, 18);
            }
            View view2 = u4.LIZJ;
            if (view2 != null) {
                g0.LJJIJIIJI(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(it.LJLJLLL))) + O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(it.LJLJLJ))) + C278817o.LIZ(it.LJLIL), O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(it.LJLL))) + C278817o.LIZ(it.LJLIL), view2);
                C26338AVi.LJIIIZ(view2, C65429Pm5.LIZIZ(it.LJLJLJ), null, C65429Pm5.LIZIZ(it.LJLJLLL), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(it.LJLL)))), 18);
            }
            if (u4.LIZ && !C202677xP.LIZ()) {
                C202467x4 c202467x42 = u4.LIZLLL;
                if (c202467x42 != null) {
                    g0.LJJIJIIJI(C278817o.LIZ(it.LJLIL), O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(it.LJLIL))), c202467x42);
                }
            } else {
                C202467x4 c202467x43 = u4.LIZLLL;
                if (c202467x43 != null) {
                    g0.LJJIJIIJI(C278817o.LIZ(it.LJLILLLLZI), O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(it.LJLILLLLZI))), c202467x43);
                }
            }
            if (!u4.LIZ && (tuxTextView = u4.LJ) != null) {
                tuxTextView.setTuxFont(42);
            }
            TuxTextView tuxTextView2 = u4.LJ;
            if (tuxTextView2 != null) {
                tuxTextView2.setTextSize(1, 11.0f);
                C26338AVi.LJIIIZ(tuxTextView2, null, null, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(it.LJLJJL)))), 23);
                Integer valueOf = Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(it.LJLJJLL))));
                C8D3.LIZJ();
                C26338AVi.LJI(tuxTextView2, null, valueOf, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(0)) / 2), null, false, 25);
                C204257zx.LJII(tuxTextView2);
            }
        } else {
            C204257zx.LJI("digg helper, big screen");
            View view3 = u4.LIZIZ;
            if (view3 != null) {
                C26338AVi.LJI(view3, C65429Pm5.LIZIZ(it.LJLJI), null, C65429Pm5.LIZIZ(it.LJLJJI), C65429Pm5.LIZIZ(it.LJLLI), false, 18);
            }
            View view4 = u4.LIZJ;
            if (view4 != null) {
                g0.LJJIJIIJI(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(it.LJLJLLL))) + O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(it.LJLJLJ))) + C278817o.LIZ(it.LJLIL), O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(it.LJLL))) + C278817o.LIZ(it.LJLIL), view4);
                C26338AVi.LJIIIZ(view4, C65429Pm5.LIZIZ(it.LJLJLJ), null, C65429Pm5.LIZIZ(it.LJLJLLL), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(it.LJLL)))), 18);
            }
            if (!u4.LIZ) {
                C202467x4 c202467x44 = u4.LIZLLL;
                if (c202467x44 != null) {
                    g0.LJJIJIIJI(C278817o.LIZ(it.LJLILLLLZI), O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(it.LJLILLLLZI))), c202467x44);
                }
                TuxTextView tuxTextView3 = u4.LJ;
                if (tuxTextView3 != null) {
                    tuxTextView3.setTuxFont(72);
                }
            } else if (!C202677xP.LIZ() && (c202467x4 = u4.LIZLLL) != null) {
                g0.LJJIJIIJI(C278817o.LIZ(it.LJLIL), O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(it.LJLIL))), c202467x4);
            }
            TuxTextView tuxTextView4 = u4.LJ;
            if (tuxTextView4 != null) {
                C26338AVi.LJIIIZ(tuxTextView4, null, null, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(it.LJLJJL)))), 23);
                Integer valueOf2 = Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(it.LJLJJLL))));
                C8D3.LIZJ();
                C26338AVi.LJI(tuxTextView4, null, valueOf2, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(0)) / 2), null, false, 25);
                C204257zx.LJII(tuxTextView4);
                if (u4.LIZ) {
                    tuxTextView4.setTuxFont(72);
                }
            }
        }
        selectSubscribe.r4().setState(C200597u3.LJLIL);
        return C76800UCe.LIZ;
    }
}
