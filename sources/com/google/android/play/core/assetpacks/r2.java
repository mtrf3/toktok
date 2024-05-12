package com.google.android.play.core.assetpacks;

import X.C07770Sf;
import X.C141335gf;
import X.C16880lQ;
import X.C1B6;
import X.C1M1;
import X.C22830v1;
import X.C26045AKb;
import X.C3C5;
import X.C44100HSm;
import X.C50521ya;
import X.C50541yc;
import X.C52217KeT;
import X.C61337O5l;
import X.C76800UCe;
import X.C7F9;
import X.C7G7;
import X.EnumC42934Gt8;
import X.HSS;
import X.InterfaceC07790Sh;
import X.InterfaceC153055zZ;
import X.InterfaceC44105HSr;
import X.InterfaceC45785Hy1;
import X.InterfaceC71484S3s;
import X.InterfaceC88472Yns;
import X.S0Q;
import X.S1D;
import X.S1E;
import X.S1F;
import X.S1I;
import X.S1T;
import X.X1D;
import Y.ACListenerS37S0300000_12;
import Y.ARunnableS23S0300000_12;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pipo.ocr.view.CardOcrActivity;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.AnchorCustomData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ThreadFactory;
import kotlin.jvm.internal.IDqS425S0100000;

/* loaded from: classes13.dex */
public class r2 implements InterfaceC153055zZ, InterfaceC45785Hy1, InterfaceC71484S3s {
    public void LIZ(AVMusic aVMusic, boolean z) {
    }

    public void LIZIZ(AVMusic aVMusic, boolean z) {
    }

    public void LJIIJJI(C7F9 c7f9) {
        throw null;
    }

    public boolean LJIILL(C7F9 c7f9) {
        throw null;
    }

    @Override // X.InterfaceC153055zZ
    public Object a() {
        return C16880lQ.LLLLZLLLI(new ThreadFactory() { // from class: com.google.android.play.core.assetpacks.l2
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new PthreadThread(runnable, "UpdateListenerExecutor");
            }
        });
    }

    public static boolean LJ(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return C1B6.LIZIZ(str);
    }

    public static void LJFF(String str) {
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (!file.exists()) {
                LJIIJ(file.getPath());
            }
        }
    }

    public static String LJIIIZ(String str) {
        StringBuilder LIZ = X1D.LIZ();
        return defpackage.b1.LIZIZ(str, LIZ, ".mp3", LIZ);
    }

    public static void LJIIJ(String str) {
        try {
            File file = new File(str);
            if (file.getParentFile().exists()) {
                file.mkdir();
            } else {
                LJIIJ(file.getParent());
                file.mkdir();
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static void LIZLLL(C7F9 c7f9, InterfaceC88472Yns interfaceC88472Yns) {
        AnchorCustomData anchorCustomData = c7f9.LIZ.getAnchorCustomData();
        if (anchorCustomData != null && anchorCustomData.getShouldOpen()) {
            S1E LIZLLL = c7f9.LIZLLL();
            if (LIZLLL != null) {
                interfaceC88472Yns.invoke(LIZLLL);
            }
            anchorCustomData.setShouldOpen(false);
        }
    }

    public static final InterfaceC07790Sh LJI(InterfaceC07790Sh interfaceC07790Sh, InterfaceC88472Yns onDraw) {
        kotlin.jvm.internal.o.LJIIIZ(interfaceC07790Sh, "<this>");
        kotlin.jvm.internal.o.LJIIIZ(onDraw, "onDraw");
        return interfaceC07790Sh.LLLIIIL(new C50521ya(onDraw));
    }

    public static final InterfaceC07790Sh LJII(C1M1 c1m1, InterfaceC88472Yns onBuildDrawCache) {
        kotlin.jvm.internal.o.LJIIIZ(c1m1, "<this>");
        kotlin.jvm.internal.o.LJIIIZ(onBuildDrawCache, "onBuildDrawCache");
        return C07770Sf.LIZ(c1m1, androidx.compose.ui.platform.g1.LIZ, new IDqS425S0100000(onBuildDrawCache, (InterfaceC88472Yns<? super C22830v1, C76800UCe>) 3));
    }

    public static final InterfaceC07790Sh LJIIIIZZ(InterfaceC07790Sh interfaceC07790Sh, InterfaceC88472Yns onDraw) {
        kotlin.jvm.internal.o.LJIIIZ(interfaceC07790Sh, "<this>");
        kotlin.jvm.internal.o.LJIIIZ(onDraw, "onDraw");
        return interfaceC07790Sh.LLLIIIL(new C50541yc(onDraw));
    }

    @Override // X.InterfaceC71484S3s
    public void LIZJ(CardOcrActivity activity, String str) {
        kotlin.jvm.internal.o.LJIIIZ(activity, "activity");
        C26045AKb c26045AKb = new C26045AKb(activity);
        c26045AKb.LJIIIZ(str);
        c26045AKb.LIZLLL(3000L);
        c26045AKb.LJIIJ();
    }

    public void LJIIL(S1F tagView, C7F9 chain) {
        kotlin.jvm.internal.o.LJIIIZ(chain, "chain");
        kotlin.jvm.internal.o.LJIIIZ(tagView, "tagView");
        tagView.LJIIIZ().setVisibility(0);
        S1E LIZLLL = chain.LIZLLL();
        if (LIZLLL == null) {
            return;
        }
        boolean LIZ = tagView.LIZ(C44100HSm.LIZIZ(chain, LIZLLL, LJIILL(chain)));
        try {
            for (S1E s1e : chain.LIZJ()) {
                s1e.LJIIZILJ(chain, s1e.getClass().getName(), LIZ);
                boolean isShown = tagView.LJIIIZ().isShown();
                if (!LIZ) {
                    s1e.LJIIL(C44100HSm.LIZIZ(chain, s1e, LJIILL(chain)), isShown);
                }
            }
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        if (!LIZ) {
            try {
                if (chain.LIZJ().size() == 1 && (LIZLLL instanceof S1T)) {
                    if (!((S1T) LIZLLL).LJLLI) {
                        tagView.LJIIIIZZ().postDelayed(new ARunnableS23S0300000_12(LIZLLL, tagView, C44100HSm.LIZIZ(chain, LIZLLL, LJIILL(chain)), 0), 500L);
                    } else {
                        LIZLLL.LJ(C44100HSm.LIZIZ(chain, LIZLLL, LJIILL(chain)));
                    }
                    tagView.LJIIIZ().setVisibility(0);
                } else {
                    LIZLLL.LJ(C44100HSm.LIZIZ(chain, LIZLLL, LJIILL(chain)));
                    tagView.LJIIIZ().setVisibility(0);
                }
                C3C5.m7constructorimpl(LIZLLL);
            } catch (Throwable th2) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th2));
            }
            Iterator<S1E> it = chain.LIZJ().iterator();
            while (it.hasNext()) {
                it.next().LJII(chain, tagView, this);
            }
            return;
        }
        InterfaceC44105HSr LJIIIZ = LIZLLL.LJIIIZ();
        ArrayList<S1I> arrayList = S1D.LIZLLL;
        if ((arrayList instanceof Collection) && arrayList.isEmpty()) {
            return;
        }
        Iterator<S1I> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            S1I next = it2.next();
            Aweme LJJLL = LJIIIZ.LJJLL();
            Object obj = ListProtector.get(LJIIIZ.LJJLL().getAnchors(), 0);
            kotlin.jvm.internal.o.LJIIIIZZ(obj, "context.aweme().anchors[0]");
            if (next.LIZ(LJJLL, (AnchorCommonStruct) obj, true, LIZLLL.type())) {
                if (LIZLLL instanceof S0Q) {
                    ((HSS) LIZLLL).LJJJI(C44100HSm.LIZIZ(chain, LIZLLL, LJIILL(chain)));
                    return;
                } else {
                    if (LIZLLL.type() == EnumC42934Gt8.POI.getTYPE()) {
                        return;
                    }
                    LIZLLL.LJ(C44100HSm.LIZIZ(chain, LIZLLL, LJIILL(chain)));
                    return;
                }
            }
        }
    }

    public void LJIILIIL(S1F s1f, C7F9 c7f9) {
        if (C52217KeT.LIZ() && s1f.LJIIJ() == C7G7.FEED_MULTI_TAG_LAYOUT) {
            C61337O5l.LJIIIIZZ(s1f.LJIIIIZZ(), 0, 0);
            C61337O5l.LJIIIIZZ(s1f.LJIILIIL(), 0, 0);
        }
        s1f.LIZJ();
        S1E LIZLLL = c7f9.LIZLLL();
        if (LIZLLL != null) {
            LIZLLL.LIZLLL(s1f.LJII());
            s1f.LJIIIZ().setVisibility(0);
            LIZLLL.LJIIIZ().LJJLIIJ();
            C16880lQ.LJIIJ(new ACListenerS37S0300000_12(this, LIZLLL, c7f9, 4), s1f.rootView());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ee, code lost:
    
        if (r4 == false) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LJIILJJIL(X.S1F r11, X.C7F9 r12) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.r2.LJIILJJIL(X.S1F, X.7F9):void");
    }
}
