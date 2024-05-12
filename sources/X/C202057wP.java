package X;

import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.assem.videocomment.VideoCommentAssem;
import defpackage.g0;
import kotlin.jvm.internal.o;

/* renamed from: X.7wP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C202057wP extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoCommentAssem, C202067wQ, C76800UCe> {
    public static final C202057wP LJLIL = new C202057wP();

    public C202057wP() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoCommentAssem videoCommentAssem, C202067wQ c202067wQ) {
        View view;
        VideoCommentAssem selectSubscribe = videoCommentAssem;
        C202067wQ it = c202067wQ;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(it, "it");
        C201887w8 c201887w8 = selectSubscribe.LLIIZ;
        if (c201887w8 != null) {
            int i = 0;
            if (it.LJLJL) {
                C204257zx.LJI("comment helper, small screen");
                View view2 = c201887w8.LIZJ;
                if (view2 != null) {
                    C26338AVi.LJI(view2, C65429Pm5.LIZIZ(it.LJLJI), null, C65429Pm5.LIZIZ(it.LJLJJI), C65429Pm5.LIZIZ(it.LJLLI), false, 18);
                }
                View view3 = c201887w8.LIZLLL;
                if (view3 != null) {
                    g0.LJJIJIIJI(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(it.LJLJLLL))) + O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(it.LJLJLJ))) + C278817o.LIZ(it.LJLIL), O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(it.LJLL))) + C278817o.LIZ(it.LJLIL), view3);
                    C26338AVi.LJIIIZ(view3, C65429Pm5.LIZIZ(it.LJLJLJ), null, C65429Pm5.LIZIZ(it.LJLJLLL), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(it.LJLL)))), 18);
                }
                View view4 = c201887w8.LJFF;
                if (view4 != null) {
                    g0.LJJIJIIJI(C278817o.LIZ(it.LJLILLLLZI), O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(it.LJLILLLLZI))), view4);
                }
                TuxTextView tuxTextView = c201887w8.LJII;
                if (tuxTextView != null) {
                    tuxTextView.LJJJ(it.LJLILLLLZI);
                }
                TuxTextView tuxTextView2 = c201887w8.LJI;
                if (tuxTextView2 != null) {
                    tuxTextView2.setTuxFont(82);
                    Integer valueOf = Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(it.LJLJJLL))));
                    C8D3.LIZJ();
                    C26338AVi.LJI(tuxTextView2, null, valueOf, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(0)) / 2), null, false, 25);
                    C26338AVi.LJIIIZ(tuxTextView2, null, null, null, Integer.valueOf(C204257zx.LIZ() + C278817o.LIZ(it.LJLJJL)), 23);
                    if (!c201887w8.LIZ) {
                        tuxTextView2.setTuxFont(42);
                    }
                    C204257zx.LJII(tuxTextView2);
                }
            } else {
                C204257zx.LJI("comment helper, big screen");
                View view5 = c201887w8.LIZJ;
                if (view5 != null) {
                    C26338AVi.LJI(view5, C65429Pm5.LIZIZ(it.LJLJI), null, C65429Pm5.LIZIZ(it.LJLJJI), C65429Pm5.LIZIZ(it.LJLLI), false, 18);
                }
                if (!C204257zx.LJFF() && !C202677xP.LIZ()) {
                    i = C7MY.LIZIZ(2);
                }
                View view6 = c201887w8.LIZLLL;
                if (view6 != null) {
                    g0.LJJIJIIJI(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(it.LJLJLLL))) + O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(it.LJLJLJ))) + C278817o.LIZ(it.LJLIL), O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(it.LJLL))) + C278817o.LIZ(it.LJLIL) + i, view6);
                    C26338AVi.LJIIIZ(view6, Integer.valueOf(C278817o.LIZ(it.LJLJLJ)), Integer.valueOf(i), Integer.valueOf(C278817o.LIZ(it.LJLJLLL)), Integer.valueOf(C278817o.LIZ(it.LJLL)), 16);
                }
                View view7 = c201887w8.LJFF;
                if (view7 != null) {
                    g0.LJJIJIIJI(C278817o.LIZ(it.LJLILLLLZI), O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(it.LJLILLLLZI))), view7);
                }
                TuxTextView tuxTextView3 = c201887w8.LJII;
                if (tuxTextView3 != null) {
                    tuxTextView3.LJJJ(it.LJLILLLLZI);
                }
                TuxTextView tuxTextView4 = c201887w8.LJI;
                if (tuxTextView4 != null) {
                    C26338AVi.LJIIIZ(tuxTextView4, null, null, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(it.LJLJJL)))), 23);
                    Integer valueOf2 = Integer.valueOf(C204257zx.LIZ() + C278817o.LIZ(it.LJLJJLL));
                    C8D3.LIZJ();
                    C26338AVi.LJI(tuxTextView4, null, valueOf2, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(0)) / 2), null, false, 25);
                    if (!c201887w8.LIZ) {
                        tuxTextView4.setTuxFont(72);
                    }
                    C204257zx.LJII(tuxTextView4);
                    if (c201887w8.LIZ) {
                        tuxTextView4.setTuxFont(72);
                    }
                }
            }
            if (C202677xP.LIZIZ() && (view = c201887w8.LJ) != null) {
                g0.LJJIJIIJI(C7MY.LIZIZ(16), O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)), view);
            }
        }
        return C76800UCe.LIZ;
    }
}
