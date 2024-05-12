package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C16880lQ;
import X.C16970lZ;
import X.C72434Sbm;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import X.W5F;
import X.W5U;
import android.app.Activity;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.inbox.widget.multi.MultiViewModel;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;

/* loaded from: classes10.dex */
public class AqS108S0101000_9 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            default:
                return null;
        }
    }

    public final void invoke$0() {
        W5F LJ = W5U.LJ(this.i1);
        LJ.LIZIZ("VideoMusicCoverAssem");
        LJ.LJJIIJ = (SmartImageView) this.l0;
        C16880lQ.LLJJJ(LJ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0282, code lost:
    
        if ((r9 & 8) != 8) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0278  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AqS108S0101000_9 r32) {
        /*
            Method dump skipped, instructions count: 1073
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS108S0101000_9.invoke$0(kotlin.jvm.internal.AqS108S0101000_9):java.lang.Object");
    }

    public static final Object invoke$1(AqS108S0101000_9 aqS108S0101000_9) {
        super/*X.SY4*/.setButtonVariant(aqS108S0101000_9.i1);
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AqS108S0101000_9 aqS108S0101000_9) {
        aqS108S0101000_9.invoke$0();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS108S0101000_9 aqS108S0101000_9) {
        View LIZLLL = C16970lZ.LIZLLL((Activity) aqS108S0101000_9.l0, aqS108S0101000_9.i1);
        o.LJIIIIZZ(LIZLLL, "inflate(context, layoutId)");
        return LIZLLL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS108S0101000_9(int i, C72434Sbm c72434Sbm, int i2) {
        super(0);
        this.$t = i2;
        this.i1 = i;
        this.l0 = c72434Sbm;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS108S0101000_9(Activity activity, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = activity;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS108S0101000_9(MultiViewModel multiViewModel, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = multiViewModel;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS108S0101000_9(RelationButton relationButton, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = relationButton;
        this.i1 = i;
    }
}
