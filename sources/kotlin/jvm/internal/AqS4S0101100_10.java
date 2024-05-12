package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C56592MIy;
import X.C58620MzY;
import X.C58684N1k;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.N1V;
import X.N4D;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.commercialize.media.impl.handler.detail.substitutemusic.v2.CommerceMusicSubstituteMusicListViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* loaded from: classes11.dex */
public class AqS4S0101100_10 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i1;
    public long j2;
    public Object l0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS4S0101100_10 aqS4S0101100_10, Object obj) {
        int i;
        C58620MzY log = (C58620MzY) obj;
        o.LJIIIZ(log, "$this$log");
        log.LJIIJ((Aweme) aqS4S0101100_10.l0);
        N4D.LIZ.getClass();
        log.LJII(N4D.LJIIIIZZ, Double.valueOf(aqS4S0101100_10.j2 / 1000.0d));
        log.LJII(N4D.LJFF, Integer.valueOf(aqS4S0101100_10.i1));
        C56592MIy c56592MIy = N4D.LJII;
        long j = aqS4S0101100_10.j2;
        Video video = ((Aweme) aqS4S0101100_10.l0).getVideo();
        boolean z = false;
        if (video != null) {
            i = video.getDuration();
        } else {
            i = 0;
        }
        if (j > i) {
            z = true;
        }
        log.LJII(c56592MIy, Boolean.valueOf(z));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS4S0101100_10 aqS4S0101100_10, Object obj) {
        boolean z;
        C58620MzY log = (C58620MzY) obj;
        o.LJIIIZ(log, "$this$log");
        log.LJIIJ(ListProtector.get(((CommerceMusicSubstituteMusicListViewModel) aqS4S0101100_10.l0).hv0(), aqS4S0101100_10.i1));
        N4D.LIZ.getClass();
        log.LJII(N4D.LJIILLIIL, Long.valueOf(aqS4S0101100_10.j2 / 1000));
        C56592MIy c56592MIy = N4D.LJIILL;
        if (aqS4S0101100_10.j2 > ((MusicModel) ListProtector.get(((CommerceMusicSubstituteMusicListViewModel) aqS4S0101100_10.l0).hv0(), aqS4S0101100_10.i1)).getDuration()) {
            z = true;
        } else {
            z = false;
        }
        log.LJII(c56592MIy, Boolean.valueOf(z));
        log.LJII(N4D.LJIILJJIL, Integer.valueOf(aqS4S0101100_10.i1));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS4S0101100_10 aqS4S0101100_10, Object obj) {
        C58620MzY logAd = (C58620MzY) obj;
        o.LJIIIZ(logAd, "$this$logAd");
        C58684N1k.LIZ.getClass();
        logAd.LJII(C58684N1k.LJIILJJIL, Integer.valueOf(((N1V) aqS4S0101100_10.l0).LIZIZ));
        logAd.LJII(C58684N1k.LJIILL, ((N1V) aqS4S0101100_10.l0).LJII);
        logAd.LJII(C58684N1k.LJJ, ((N1V) aqS4S0101100_10.l0).LJII);
        logAd.LJII(C58684N1k.LJIL, Integer.valueOf(aqS4S0101100_10.i1));
        logAd.LJII(C58684N1k.LJIJI, Long.valueOf(aqS4S0101100_10.j2));
        logAd.LJII(C58684N1k.LJJIJIL, Integer.valueOf(((N1V) aqS4S0101100_10.l0).LJIILLIIL));
        logAd.LJII(C58684N1k.LJJJJL, "iab");
        logAd.LJII(C58684N1k.LJJJJJ, "h5");
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS4S0101100_10(N1V n1v, int i, long j, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = n1v;
        this.i1 = i;
        this.j2 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS4S0101100_10(CommerceMusicSubstituteMusicListViewModel commerceMusicSubstituteMusicListViewModel, int i, long j, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = commerceMusicSubstituteMusicListViewModel;
        this.i1 = i;
        this.j2 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS4S0101100_10(Aweme aweme, long j, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = aweme;
        this.j2 = j;
        this.i1 = i;
    }
}
