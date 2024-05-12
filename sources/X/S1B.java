package X;

import android.widget.TextView;
import com.google.android.play.core.assetpacks.r2;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S1B extends r2 {
    public static final S14 LJLIL = new S14();
    public static DialogC71377Rzp LJLILLLLZI;

    public static boolean LJIILLIIL(C7F9 c7f9) {
        Aweme aweme;
        List<AnchorCommonStruct> anchors;
        if (c7f9 == null || (aweme = c7f9.LIZ) == null || (anchors = aweme.getAnchors()) == null) {
            return false;
        }
        if (!anchors.isEmpty()) {
            Iterator<AnchorCommonStruct> it = anchors.iterator();
            while (it.hasNext()) {
                if (it.next().getType() != EnumC42934Gt8.ANCHOR_BOOKTOK.getTYPE()) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean LJIIZILJ(C7F9 c7f9) {
        Aweme aweme;
        List<AnchorCommonStruct> anchors;
        if (c7f9 == null || (aweme = c7f9.LIZ) == null || (anchors = aweme.getAnchors()) == null) {
            return false;
        }
        if (!anchors.isEmpty()) {
            Iterator<AnchorCommonStruct> it = anchors.iterator();
            while (it.hasNext()) {
                if (it.next().getType() != EnumC42934Gt8.ANCHOR_MOVIETOK.getTYPE()) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean LJIJ(C7F9 c7f9) {
        List<AnchorCommonStruct> anchors = c7f9.LIZ.getAnchors();
        o.LJIIIIZZ(anchors, "chain.aweme().anchors");
        if (anchors.isEmpty()) {
            return true;
        }
        for (AnchorCommonStruct anchorCommonStruct : anchors) {
            if (anchorCommonStruct.getType() != EnumC42934Gt8.ANCHOR_SHOP_MIX.getTYPE() && anchorCommonStruct.getType() != EnumC42934Gt8.ANCHOR_SHOP_WINDOW.getTYPE() && anchorCommonStruct.getType() != EnumC42934Gt8.ANCHOR_SHOP_LINK.getTYPE()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.play.core.assetpacks.r2
    public final void LJIIJJI(C7F9 c7f9) {
        for (S1E s1e : c7f9.LIZJ()) {
            s1e.LJIJJ(s1e.LJIIIZ().LJJLL());
        }
    }

    @Override // com.google.android.play.core.assetpacks.r2
    public final boolean LJIILL(C7F9 chain) {
        o.LJIIIZ(chain, "chain");
        if (chain.LIZIZ() > 1) {
            return true;
        }
        return false;
    }

    public static void LJIJJ(S1F s1f, C7F9 c7f9) {
        s1f.rootView().setVisibility(0);
        s1f.LJIILIIL().setVisibility(0);
        s1f.LJIIL().setVisibility(8);
        s1f.LJIIJJI().setVisibility(8);
        s1f.LJIILIIL().setIconRes(R.raw.icon_chevron_down_fill);
        C27570Aru.LJIIIZ(s1f.LJIILIIL(), O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)));
        C26338AVi.LJI(s1f.LJIILIIL(), 0, 0, AnonymousClass391.LIZJ(8), 0, false, 16);
        s1f.LJIILIIL().setIconWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)));
        s1f.LJIILIIL().setIconHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)));
        TextView LJIILJJIL = s1f.LJIILJJIL();
        LJIILJJIL.setVisibility(0);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append('(');
        LIZ.append(c7f9.LIZIZ());
        LIZ.append(')');
        LJIILJJIL.setText(X1D.LIZIZ(LIZ));
        s1f.LIZLLL().setClickable(false);
    }

    @Override // com.google.android.play.core.assetpacks.r2
    public final void LJIIL(S1F tagView, C7F9 chain) {
        o.LJIIIZ(chain, "chain");
        o.LJIIIZ(tagView, "tagView");
        super.LJIIL(tagView, chain);
        try {
            if (chain.LIZIZ() < 2) {
                for (S1E s1e : chain.LIZJ()) {
                    if (s1e instanceof S0Q) {
                        s1e.LJIILL(tagView.LJIIIZ(), s1e.LJIIIZ().LJJLL(), true);
                    }
                }
                return;
            }
            for (S1E s1e2 : chain.LIZJ()) {
                s1e2.LJIILL(tagView.LJIIIZ(), s1e2.LJIIIZ().LJJLL(), false);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d8, code lost:
    
        if (r7 == false) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    @Override // com.google.android.play.core.assetpacks.r2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILIIL(X.S1F r18, X.C7F9 r19) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.S1B.LJIILIIL(X.S1F, X.7F9):void");
    }

    public static final void LJIJI(C8IM c8im, S1E s1e, C7F9 c7f9, S1B s1b, InterfaceC88471Ynr interfaceC88471Ynr) {
        C188727au LIZ = C44100HSm.LIZ(s1e, c7f9, "click_list", s1b.LJIILL(c7f9));
        HashMap<String, String> showContentInfo = c8im.getShowContentInfo();
        if (showContentInfo != null) {
            for (Map.Entry<String, String> entry : showContentInfo.entrySet()) {
                LIZ.LJI(entry.getKey(), entry.getValue());
            }
        }
        s1e.LJI(LIZ);
        interfaceC88471Ynr.invoke(Boolean.TRUE, Boolean.FALSE);
    }
}
