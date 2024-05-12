package Y;

import X.AbstractC03300Ba;
import X.C0BI;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes.dex */
public class IDd0S16S0000000 extends C0BI {
    public final int $t;

    public static final String LIZIZ$0(IDd0S16S0000000 iDd0S16S0000000) {
        return "DELETE FROM sound_effect_database";
    }

    public static final String LIZIZ$1(IDd0S16S0000000 iDd0S16S0000000) {
        return "DELETE FROM SystemIdInfo where work_spec_id=?";
    }

    public static final String LIZIZ$10(IDd0S16S0000000 iDd0S16S0000000) {
        return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
    }

    public static final String LIZIZ$11(IDd0S16S0000000 iDd0S16S0000000) {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }

    public static final String LIZIZ$2(IDd0S16S0000000 iDd0S16S0000000) {
        return "DELETE from WorkProgress where work_spec_id=?";
    }

    public static final String LIZIZ$3(IDd0S16S0000000 iDd0S16S0000000) {
        return "DELETE FROM WorkProgress";
    }

    public static final String LIZIZ$4(IDd0S16S0000000 iDd0S16S0000000) {
        return "DELETE FROM workspec WHERE id=?";
    }

    public static final String LIZIZ$5(IDd0S16S0000000 iDd0S16S0000000) {
        return "UPDATE workspec SET output=? WHERE id=?";
    }

    public static final String LIZIZ$6(IDd0S16S0000000 iDd0S16S0000000) {
        return "UPDATE workspec SET period_start_time=? WHERE id=?";
    }

    public static final String LIZIZ$7(IDd0S16S0000000 iDd0S16S0000000) {
        return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
    }

    public static final String LIZIZ$8(IDd0S16S0000000 iDd0S16S0000000) {
        return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
    }

    public static final String LIZIZ$9(IDd0S16S0000000 iDd0S16S0000000) {
        return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
    }

    @Override // X.C0BI
    public final String LIZIZ() {
        switch (this.$t) {
            case 0:
                return LIZIZ$0(this);
            case 1:
                return LIZIZ$1(this);
            case 2:
                return LIZIZ$2(this);
            case 3:
                return LIZIZ$3(this);
            case 4:
                return LIZIZ$4(this);
            case 5:
                return LIZIZ$5(this);
            case 6:
                return LIZIZ$6(this);
            case 7:
                return LIZIZ$7(this);
            case 8:
                return LIZIZ$8(this);
            case 9:
                return LIZIZ$9(this);
            case 10:
                return LIZIZ$10(this);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return LIZIZ$11(this);
            default:
                return super.LIZIZ();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDd0S16S0000000(AbstractC03300Ba abstractC03300Ba, int i) {
        super(abstractC03300Ba);
        this.$t = i;
    }
}
