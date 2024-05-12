package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C76800UCe;
import X.InterfaceC88471Ynr;
import com.ss.android.ugc.aweme.feed.assem.progressbar.VideoProgressBarAssem;
import com.ss.android.ugc.aweme.feed.assem.progressbar.VideoProgressBarViewModel;

/* loaded from: classes16.dex */
public class AqS65S0000000_15 extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public final int $t;

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS65S0000000_15(int i) {
        super(2);
        this.$t = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS65S0000000_15(VideoProgressBarAssem videoProgressBarAssem, int i) {
        super(2);
        this.$t = i;
    }

    public static final Object invoke$0(AqS65S0000000_15 aqS65S0000000_15, Object obj, Object obj2) {
        VideoProgressBarAssem selectSubscribe = (VideoProgressBarAssem) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (obj2 != null) {
            VideoProgressBarViewModel r4 = selectSubscribe.r4();
            r4.getClass();
            r4.setState(new AqS18S0010000_14(true, 33));
            selectSubscribe.u4();
            selectSubscribe.z4();
            selectSubscribe.A4();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS65S0000000_15 aqS65S0000000_15, Object obj, Object obj2) {
        VideoProgressBarAssem selectSubscribe = (VideoProgressBarAssem) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (obj2 != null) {
            VideoProgressBarViewModel r4 = selectSubscribe.r4();
            r4.getClass();
            r4.setState(new AqS18S0010000_14(false, 33));
            selectSubscribe.C4();
            selectSubscribe.A4();
            selectSubscribe.B4();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS65S0000000_15 aqS65S0000000_15, Object current, Object event) {
        o.LJIIIZ(current, "current");
        o.LJIIIZ(event, "event");
        return C76800UCe.LIZ;
    }
}
