package lh3;

import X.C40197Fq5;
import X.C51556KLg;
import X.VNU;
import com.bytedance.ies.xelement.LynxImpressionView;
import com.bytedance.ies.xelement.LynxVideoManager;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.ss.android.ugc.aweme.base.xelements.UISingleVideo;
import com.ss.android.ugc.aweme.search.lynx.xsearch.searchlist.core.ui.LynxSearchList;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public class IDaS85S0000000_8 extends C40197Fq5 {
    public final int $t;

    @Override // X.C40197Fq5
    public final LynxUI<?> LIZLLL(VNU vnu) {
        switch (this.$t) {
            case 0:
                return LIZLLL$0(this, vnu);
            case 1:
                return LIZLLL$1(this, vnu);
            case 2:
                return LIZLLL$2(this, vnu);
            case 3:
                return LIZLLL$3(this, vnu);
            case 4:
                return LIZLLL$4(this, vnu);
            default:
                return super.LIZLLL(vnu);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public IDaS85S0000000_8(int r5) {
        /*
            r4 = this;
            r4.$t = r5
            switch(r5) {
                case 0: goto L20;
                case 1: goto L1a;
                case 2: goto L14;
                case 3: goto Le;
                default: goto L5;
            }
        L5:
            r0 = r4
            r3 = 0
            java.lang.String r2 = "search-list"
            r1 = r3
        La:
            r0.<init>(r2, r3, r1)
            return
        Le:
            r0 = r4
            r3 = 0
            java.lang.String r2 = "x-ttk-map-view"
            r1 = r3
            goto La
        L14:
            r0 = r4
            r3 = 0
            java.lang.String r2 = "x-single-video"
            r1 = r3
            goto La
        L1a:
            r0 = r4
            r3 = 0
            java.lang.String r2 = "x-video"
            r1 = r3
            goto La
        L20:
            r0 = r4
            r3 = 0
            java.lang.String r2 = "x-impression-view"
            r1 = r3
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: lh3.IDaS85S0000000_8.<init>(int):void");
    }

    public static final LynxUI LIZLLL$0(IDaS85S0000000_8 iDaS85S0000000_8, VNU context) {
        o.LJIIIZ(context, "context");
        return new LynxImpressionView(context);
    }

    public static final LynxUI LIZLLL$1(IDaS85S0000000_8 iDaS85S0000000_8, VNU vnu) {
        return new LynxVideoManager(vnu);
    }

    public static final LynxUI LIZLLL$2(IDaS85S0000000_8 iDaS85S0000000_8, VNU vnu) {
        return new UISingleVideo(vnu);
    }

    public static final LynxUI LIZLLL$3(IDaS85S0000000_8 iDaS85S0000000_8, VNU context) {
        o.LJIIIZ(context, "context");
        C51556KLg.LIZ.getClass();
        return C51556KLg.LIZ().LJJJJ(context);
    }

    public static final LynxUI LIZLLL$4(IDaS85S0000000_8 iDaS85S0000000_8, VNU context) {
        o.LJIIIZ(context, "context");
        return new LynxSearchList(context);
    }
}
