package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C200617u5;
import X.C43I;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* loaded from: classes4.dex */
public class AqS12S0200100_3 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public long j2;
    public Object l0;
    public Object l1;

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

    public static final Object invoke$0(AqS12S0200100_3 aqS12S0200100_3, Object obj) {
        C200617u5 setState = (C200617u5) obj;
        o.LJIIIZ(setState, "$this$setState");
        VideoDiggVM videoDiggVM = (VideoDiggVM) aqS12S0200100_3.l0;
        long j = aqS12S0200100_3.j2;
        Aweme aweme = (Aweme) aqS12S0200100_3.l1;
        boolean z = true;
        if (aweme.getUserDigg() != 1) {
            z = false;
        }
        return C200617u5.LIZ(setState, videoDiggVM.lv0(j, aweme, z), null, null, null, 29);
    }

    public static final Object invoke$1(AqS12S0200100_3 aqS12S0200100_3, Object it) {
        o.LJIIIZ(it, "it");
        VideoDiggVM videoDiggVM = (VideoDiggVM) aqS12S0200100_3.l0;
        videoDiggVM.setState(new AqS12S0200100_3(videoDiggVM, aqS12S0200100_3.j2, (Aweme) aqS12S0200100_3.l1, 2));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS12S0200100_3 aqS12S0200100_3, Object obj) {
        C200617u5 setState = (C200617u5) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C200617u5.LIZ(setState, ((VideoDiggVM) aqS12S0200100_3.l0).lv0(aqS12S0200100_3.j2, (Aweme) aqS12S0200100_3.l1, true), new C43I(Boolean.valueOf(setState.LJLIL)), null, null, 25);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS12S0200100_3(VideoDiggVM videoDiggVM, long j, Aweme aweme, int i) {
        super(1);
        this.$t = i;
        this.l0 = videoDiggVM;
        this.j2 = j;
        this.l1 = aweme;
    }
}
