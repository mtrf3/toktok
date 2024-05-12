package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C12310e3;
import X.C47325Ihl;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import X.X1D;
import X.XBG;
import com.ss.android.ugc.aweme.music.ui.reuseaudio.ReuseAudioPlayer;
import com.ss.android.ugc.aweme.music.ui.reuseaudio.ReuseAudioViewModel;
import com.ss.android.ugc.aweme.profile.ui.v2.I18nUserProfileFragmentV3;

/* loaded from: classes16.dex */
public class AqS82S1100000_15 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS82S1100000_15 aqS82S1100000_15) {
        C12310e3 c12310e3 = C12310e3.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[Effect][WaitForLock][");
        LIZ.append(aqS82S1100000_15.s0);
        LIZ.append("][WaitForModelDownload][");
        LIZ.append(((XBG) aqS82S1100000_15.l1).LJIIIIZZ.getName());
        LIZ.append(']');
        String LIZIZ = X1D.LIZIZ(LIZ);
        c12310e3.getClass();
        C12310e3.LIZLLL("JKL", LIZIZ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS82S1100000_15 aqS82S1100000_15) {
        ReuseAudioPlayer reuseAudioPlayer = ((ReuseAudioViewModel) aqS82S1100000_15.l1).LJLJL;
        if (reuseAudioPlayer != null) {
            C47325Ihl c47325Ihl = new C47325Ihl();
            String str = aqS82S1100000_15.s0;
            c47325Ihl.LJI = true;
            c47325Ihl.LIZ = str;
            reuseAudioPlayer.LJLIL.LIZLLL(c47325Ihl);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS82S1100000_15 aqS82S1100000_15) {
        ((I18nUserProfileFragmentV3) aqS82S1100000_15.l1).iM(aqS82S1100000_15.s0);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS82S1100000_15(XBG xbg, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = xbg;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS82S1100000_15(ReuseAudioViewModel reuseAudioViewModel, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = reuseAudioViewModel;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS82S1100000_15(I18nUserProfileFragmentV3 i18nUserProfileFragmentV3, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = i18nUserProfileFragmentV3;
        this.s0 = str;
    }
}
