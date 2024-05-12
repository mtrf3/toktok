package X;

import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteAssem;
import defpackage.g0;
import kotlin.jvm.internal.o;

/* renamed from: X.7yS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C203327yS extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoFavoriteAssem, C202067wQ, C76800UCe> {
    public static final C203327yS LJLIL = new C203327yS();

    public C203327yS() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoFavoriteAssem videoFavoriteAssem, C202067wQ c202067wQ) {
        C203417yb c203417yb;
        C203417yb c203417yb2;
        VideoFavoriteAssem selectSubscribe = videoFavoriteAssem;
        C202067wQ it = c202067wQ;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(it, "it");
        C203347yU c203347yU = selectSubscribe.LLIIIJ;
        if (c203347yU != null) {
            int i = 0;
            if (it.LJLJL) {
                C204257zx.LJI("favorite helper, small screen");
                View view = c203347yU.LIZIZ;
                if (view != null) {
                    C26338AVi.LJI(view, C65429Pm5.LIZIZ(it.LJLJI), null, C65429Pm5.LIZIZ(it.LJLJJI), C65429Pm5.LIZIZ(it.LJLLI), false, 18);
                }
                View view2 = c203347yU.LIZLLL;
                if (view2 != null) {
                    g0.LJJIJIIJI(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(it.LJLJLLL))) + O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(it.LJLJLJ))) + C278817o.LIZ(it.LJLIL), O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(it.LJLL))) + C278817o.LIZ(it.LJLIL), view2);
                    C26338AVi.LJIIIZ(view2, C65429Pm5.LIZIZ(it.LJLJLJ), null, C65429Pm5.LIZIZ(it.LJLJLLL), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(it.LJLL)))), 18);
                }
                if (!c203347yU.LIZ) {
                    C203417yb c203417yb3 = c203347yU.LJ;
                    if (c203417yb3 != null) {
                        g0.LJJIJIIJI(C278817o.LIZ(it.LJLILLLLZI), O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(it.LJLILLLLZI))), c203417yb3);
                    }
                    TuxTextView tuxTextView = c203347yU.LJFF;
                    if (tuxTextView != null) {
                        tuxTextView.setTuxFont(42);
                    }
                } else if (!C202677xP.LIZ() && (c203417yb2 = c203347yU.LJ) != null) {
                    g0.LJJIJIIJI(C278817o.LIZ(it.LJLIL), O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(it.LJLIL))), c203417yb2);
                }
                TuxTextView tuxTextView2 = c203347yU.LJFF;
                if (tuxTextView2 != null) {
                    tuxTextView2.setTextSize(1, 11.0f);
                    C26338AVi.LJIIIZ(tuxTextView2, null, null, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(it.LJLJJL)))), 23);
                    Integer valueOf = Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(it.LJLJJLL))));
                    C8D3.LIZJ();
                    C26338AVi.LJI(tuxTextView2, null, valueOf, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(0)) / 2), null, false, 25);
                    C204257zx.LJII(tuxTextView2);
                }
            } else {
                C204257zx.LJI("favorite helper,big screen");
                View view3 = c203347yU.LIZIZ;
                if (view3 != null) {
                    C26338AVi.LJI(view3, C65429Pm5.LIZIZ(it.LJLJI), null, C65429Pm5.LIZIZ(it.LJLJJI), C65429Pm5.LIZIZ(it.LJLLI), false, 18);
                }
                View view4 = c203347yU.LIZLLL;
                if (view4 != null) {
                    g0.LJJIJIIJI(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(it.LJLJLLL))) + O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(it.LJLJLJ))) + C278817o.LIZ(it.LJLIL), O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(it.LJLL))) + C278817o.LIZ(it.LJLIL), view4);
                    C26338AVi.LJIIIZ(view4, C65429Pm5.LIZIZ(it.LJLJLJ), null, C65429Pm5.LIZIZ(it.LJLJLLL), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(it.LJLL)))), 18);
                }
                if (!c203347yU.LIZ) {
                    C203417yb c203417yb4 = c203347yU.LJ;
                    if (c203417yb4 != null) {
                        g0.LJJIJIIJI(C278817o.LIZ(it.LJLILLLLZI), O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(it.LJLILLLLZI))), c203417yb4);
                    }
                    TuxTextView tuxTextView3 = c203347yU.LJFF;
                    if (tuxTextView3 != null) {
                        tuxTextView3.setTuxFont(72);
                    }
                } else if (!C202677xP.LIZ() && (c203417yb = c203347yU.LJ) != null) {
                    g0.LJJIJIIJI(C278817o.LIZ(it.LJLIL), O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(it.LJLIL))), c203417yb);
                }
                TuxTextView tuxTextView4 = c203347yU.LJFF;
                if (tuxTextView4 != null) {
                    Integer valueOf2 = Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(it.LJLJJLL))));
                    C8D3.LIZJ();
                    C26338AVi.LJI(tuxTextView4, null, valueOf2, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(0)) / 2), null, false, 25);
                    int LIZ = C278817o.LIZ(it.LJLJJL);
                    if (!C204257zx.LJFF() && C202677xP.LIZIZ()) {
                        i = C7MY.LIZIZ(4);
                    }
                    C26338AVi.LJIIIZ(tuxTextView4, null, null, null, Integer.valueOf(LIZ + i), 23);
                    C204257zx.LJII(tuxTextView4);
                    if (c203347yU.LIZ) {
                        tuxTextView4.setTuxFont(72);
                    }
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
