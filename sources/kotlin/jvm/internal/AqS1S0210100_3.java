package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C200367tg;
import X.C200617u5;
import X.InterfaceC88472Yns;
import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.viewmodel.PostDiggViewModel;

/* loaded from: classes4.dex */
public class AqS1S0210100_3 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public long j3;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS1S0210100_3 aqS1S0210100_3, Object obj) {
        C200617u5 setState = (C200617u5) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C200617u5.LIZ(setState, ((VideoDiggVM) aqS1S0210100_3.l0).lv0(aqS1S0210100_3.j3, (Aweme) aqS1S0210100_3.l1, aqS1S0210100_3.z2), null, null, null, 29);
    }

    public static final Object invoke$1(AqS1S0210100_3 aqS1S0210100_3, Object obj) {
        C200367tg setState = (C200367tg) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C200367tg.LIZ(setState, ((PostDiggViewModel) aqS1S0210100_3.l0).gv0(aqS1S0210100_3.j3, (Aweme) aqS1S0210100_3.l1, aqS1S0210100_3.z2));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS1S0210100_3(VideoDiggVM videoDiggVM, long j, Aweme aweme, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = videoDiggVM;
        this.j3 = j;
        this.l1 = aweme;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS1S0210100_3(PostDiggViewModel postDiggViewModel, long j, Aweme aweme, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = postDiggViewModel;
        this.j3 = j;
        this.l1 = aweme;
        this.z2 = z;
    }
}
