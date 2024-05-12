package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.C44729Hgz;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import X.W5G;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* loaded from: classes8.dex */
public class AqS40S1300000_7 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS40S1300000_7 aqS40S1300000_7) {
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) aqS40S1300000_7.l1;
        ActivityC45651qj activityC45651qj = (ActivityC45651qj) aqS40S1300000_7.l2;
        W5G w5g = (W5G) aqS40S1300000_7.l3;
        String coverPath = aqS40S1300000_7.s0;
        o.LJIIIIZZ(coverPath, "coverPath");
        C44729Hgz.LJJJJLL(activityC45651qj, w5g, videoPublishEditModel, coverPath);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS40S1300000_7 aqS40S1300000_7) {
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) aqS40S1300000_7.l1;
        ActivityC45651qj activityC45651qj = (ActivityC45651qj) aqS40S1300000_7.l2;
        W5G w5g = (W5G) aqS40S1300000_7.l3;
        String coverPath = aqS40S1300000_7.s0;
        o.LJIIIIZZ(coverPath, "coverPath");
        C44729Hgz.LJJJJLL(activityC45651qj, w5g, videoPublishEditModel, coverPath);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS40S1300000_7(ActivityC45651qj activityC45651qj, W5G w5g, VideoPublishEditModel videoPublishEditModel, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = videoPublishEditModel;
        this.l2 = activityC45651qj;
        this.l3 = w5g;
        this.s0 = str;
    }
}
