package Y;

import X.AbstractC193937jJ;
import X.C10I;
import X.C10K;
import X.C181847Bs;
import X.C182977Gb;
import X.C182987Gc;
import X.C76800UCe;
import com.ss.android.ugc.aweme.nows.interaction.viewmodel.NowLikeViewModel;
import kotlin.jvm.internal.AqS169S0100000_3;

/* loaded from: classes4.dex */
public class AgS27S0301000_3 implements C10I {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.C10I
    public final Object then(C10K c10k) {
        switch (this.$t) {
            case 0:
                return then$0(this, c10k);
            case 1:
                return then$1(this, c10k);
            default:
                return null;
        }
    }

    public static final Object then$0(AgS27S0301000_3 agS27S0301000_3, C10K c10k) {
        if (c10k.LJIIL() || c10k.LJIILJJIL() || !((Boolean) c10k.LJIIJJI()).booleanValue()) {
            ((NowLikeViewModel) agS27S0301000_3.l0).setState(new AqS169S0100000_3(c10k, (C10K<Boolean>) 355));
            ((NowLikeViewModel) agS27S0301000_3.l0).jv0(true);
        } else {
            ((NowLikeViewModel) agS27S0301000_3.l0).setState(C182977Gb.LJLIL);
            ((NowLikeViewModel) agS27S0301000_3.l0).lv0(false, (AbstractC193937jJ) agS27S0301000_3.l1, (C181847Bs) agS27S0301000_3.l2, agS27S0301000_3.i3);
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$1(AgS27S0301000_3 agS27S0301000_3, C10K c10k) {
        if (c10k.LJIIL() || c10k.LJIILJJIL() || !((Boolean) c10k.LJIIJJI()).booleanValue()) {
            ((NowLikeViewModel) agS27S0301000_3.l0).setState(new AqS169S0100000_3(c10k, (C10K<Boolean>) 356));
            ((NowLikeViewModel) agS27S0301000_3.l0).jv0(false);
        } else {
            ((NowLikeViewModel) agS27S0301000_3.l0).setState(C182987Gc.LJLIL);
            ((NowLikeViewModel) agS27S0301000_3.l0).lv0(true, (AbstractC193937jJ) agS27S0301000_3.l1, (C181847Bs) agS27S0301000_3.l2, agS27S0301000_3.i3);
        }
        return C76800UCe.LIZ;
    }

    public AgS27S0301000_3(NowLikeViewModel nowLikeViewModel, AbstractC193937jJ abstractC193937jJ, C181847Bs c181847Bs, int i, int i2) {
        this.$t = i2;
        this.l0 = nowLikeViewModel;
        this.l1 = abstractC193937jJ;
        this.l2 = c181847Bs;
        this.i3 = i;
    }
}
