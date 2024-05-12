package lh3;

import X.C40197Fq5;
import X.C72830SiA;
import X.C79943VZb;
import X.VNU;
import X.VZY;
import X.VZZ;
import com.bytedance.ies.xelement.LynxAudio;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.shadow.text.InlineTextShadowNode;
import com.lynx.tasm.behavior.shadow.text.RawTextShadowNode;
import com.lynx.tasm.behavior.shadow.text.TextSelectionShadowNode;
import com.lynx.tasm.behavior.shadow.text.TextShadowNode;
import com.lynx.tasm.behavior.ui.LynxFlattenUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.list.UIList;
import com.lynx.tasm.behavior.ui.list.UIListItem;
import com.lynx.tasm.behavior.ui.scroll.UIBounceView;
import com.lynx.tasm.behavior.ui.scroll.UIScrollView;
import com.lynx.tasm.behavior.ui.text.FlattenUIText;
import com.lynx.tasm.behavior.ui.text.UIText;
import com.lynx.tasm.behavior.ui.view.UIComponent;
import com.lynx.tasm.behavior.ui.view.UIView;
import com.ss.android.ugc.aweme.base.xelements.xaudio.ActivityMonitorImpl;
import com.ss.android.ugc.tiktok.spark_base.R$drawable;

/* loaded from: classes15.dex */
public class IDaS87S0000000_14 extends C40197Fq5 {
    public final int $t;

    @Override // X.C40197Fq5
    public final LynxFlattenUI LIZIZ(VNU vnu) {
        switch (this.$t) {
            case 2:
                return LIZIZ$0(this, vnu);
            case 3:
                return LIZIZ$1(this, vnu);
            case 9:
                return LIZIZ$2(this, vnu);
            default:
                return super.LIZIZ(vnu);
        }
    }

    @Override // X.C40197Fq5
    public final ShadowNode LIZJ() {
        switch (this.$t) {
            case 3:
                return LIZJ$0(this);
            case 4:
                return LIZJ$1(this);
            case 5:
                return LIZJ$2(this);
            case 6:
                return LIZJ$3(this);
            default:
                return super.LIZJ();
        }
    }

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
            case 5:
            case 6:
            default:
                return super.LIZLLL(vnu);
            case 7:
                return LIZLLL$4(this, vnu);
            case 8:
                return LIZLLL$5(this, vnu);
            case 9:
                return LIZLLL$6(this, vnu);
            case 10:
                return LIZLLL$7(this, vnu);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public IDaS87S0000000_14(int r5) {
        /*
            r4 = this;
            r4.$t = r5
            switch(r5) {
                case 0: goto L44;
                case 1: goto L3e;
                case 2: goto L38;
                case 3: goto L32;
                case 4: goto L2c;
                case 5: goto L26;
                case 6: goto L20;
                case 7: goto L1a;
                case 8: goto L14;
                case 9: goto Le;
                default: goto L5;
            }
        L5:
            r0 = r4
            r3 = 0
            r2 = 1
            java.lang.String r1 = "list"
        La:
            r0.<init>(r1, r3, r2)
            return
        Le:
            r0 = r4
            java.lang.String r1 = "component"
            r3 = 1
            r2 = r3
            goto La
        L14:
            r0 = r4
            r3 = 0
            r2 = 1
            java.lang.String r1 = "bounce-view"
            goto La
        L1a:
            r0 = r4
            r3 = 0
            r2 = 1
            java.lang.String r1 = "scroll-view"
            goto La
        L20:
            r0 = r4
            r3 = 0
            r2 = 1
            java.lang.String r1 = "text-selection"
            goto La
        L26:
            r0 = r4
            r3 = 0
            r2 = 1
            java.lang.String r1 = "inline-text"
            goto La
        L2c:
            r0 = r4
            r3 = 0
            r2 = 1
            java.lang.String r1 = "raw-text"
            goto La
        L32:
            r0 = r4
            java.lang.String r1 = "text"
            r3 = 1
            r2 = r3
            goto La
        L38:
            r0 = r4
            java.lang.String r1 = "view"
            r3 = 1
            r2 = r3
            goto La
        L3e:
            r0 = r4
            r3 = 0
            r2 = 1
            java.lang.String r1 = "list-item"
            goto La
        L44:
            r0 = r4
            r3 = 0
            java.lang.String r1 = "x-audio"
            r2 = r3
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: lh3.IDaS87S0000000_14.<init>(int):void");
    }

    public static final ShadowNode LIZJ$0(IDaS87S0000000_14 iDaS87S0000000_14) {
        return new TextShadowNode();
    }

    public static final ShadowNode LIZJ$1(IDaS87S0000000_14 iDaS87S0000000_14) {
        return new RawTextShadowNode();
    }

    public static final ShadowNode LIZJ$2(IDaS87S0000000_14 iDaS87S0000000_14) {
        return new InlineTextShadowNode();
    }

    public static final ShadowNode LIZJ$3(IDaS87S0000000_14 iDaS87S0000000_14) {
        return new TextSelectionShadowNode();
    }

    public static final LynxFlattenUI LIZIZ$0(IDaS87S0000000_14 iDaS87S0000000_14, VNU vnu) {
        return new LynxFlattenUI(vnu);
    }

    public static final LynxFlattenUI LIZIZ$1(IDaS87S0000000_14 iDaS87S0000000_14, VNU vnu) {
        return new FlattenUIText(vnu);
    }

    public static final LynxFlattenUI LIZIZ$2(IDaS87S0000000_14 iDaS87S0000000_14, VNU vnu) {
        return new LynxFlattenUI(vnu);
    }

    public static final LynxUI LIZLLL$0(IDaS87S0000000_14 iDaS87S0000000_14, VNU vnu) {
        VZY player;
        LynxAudio lynxAudio = new LynxAudio(vnu);
        C79943VZb c79943VZb = new C79943VZb();
        c79943VZb.LIZ = new ActivityMonitorImpl();
        c79943VZb.LIZIZ = new C72830SiA();
        c79943VZb.LIZJ = R$drawable.icon;
        lynxAudio.LJLIL = c79943VZb;
        VZZ vzz = (VZZ) lynxAudio.mView;
        if (vzz != null && (player = vzz.getPlayer()) != null) {
            player.LJIIZILJ(c79943VZb);
        }
        return lynxAudio;
    }

    public static final LynxUI LIZLLL$1(IDaS87S0000000_14 iDaS87S0000000_14, VNU vnu) {
        return new UIListItem(vnu);
    }

    public static final LynxUI LIZLLL$2(IDaS87S0000000_14 iDaS87S0000000_14, VNU vnu) {
        return new UIView(vnu);
    }

    public static final LynxUI LIZLLL$3(IDaS87S0000000_14 iDaS87S0000000_14, VNU vnu) {
        return new UIText(vnu);
    }

    public static final LynxUI LIZLLL$4(IDaS87S0000000_14 iDaS87S0000000_14, VNU vnu) {
        return new UIScrollView(vnu);
    }

    public static final LynxUI LIZLLL$5(IDaS87S0000000_14 iDaS87S0000000_14, VNU vnu) {
        return new UIBounceView(vnu);
    }

    public static final LynxUI LIZLLL$6(IDaS87S0000000_14 iDaS87S0000000_14, VNU vnu) {
        return new UIComponent(vnu);
    }

    public static final LynxUI LIZLLL$7(IDaS87S0000000_14 iDaS87S0000000_14, VNU vnu) {
        return new UIList(vnu);
    }
}
