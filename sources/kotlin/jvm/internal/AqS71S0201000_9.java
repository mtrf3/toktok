package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C57826Mmk;
import X.C57834Mms;
import X.C76800UCe;
import X.HandlerC56918MVm;
import X.InterfaceC65784Pro;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.relation.usercard.ability.AuthCardCellTrackAbility;
import com.ss.android.ugc.aweme.relation.usercard.ability.RecUserCellTrackAbility;

/* loaded from: classes10.dex */
public class AqS71S0201000_9 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

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
            case 4:
                return invoke$4(this);
            default:
                return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0113, code lost:
    
        if (r0 != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x011f, code lost:
    
        if (r5 != null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0121, code lost:
    
        r6.LJLL.add(new X.C7DH(r2, r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0130, code lost:
    
        r6.LJLLI.add(new X.C1800374t(r5, r4));
        r6.LJIILJJIL();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x011d, code lost:
    
        if (com.ss.android.ugc.aweme.experiment.CommentPreloadExperiment.LIZ().getOnlyUnreadNotice() == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00e5, code lost:
    
        if (r1 < com.ss.android.ugc.aweme.notification.perf.NoticeVideoManager.LIZIZ().triggerPreloadCondition) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AqS71S0201000_9 r8) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS71S0201000_9.invoke$0(kotlin.jvm.internal.AqS71S0201000_9):java.lang.Object");
    }

    public static final Object invoke$1(AqS71S0201000_9 aqS71S0201000_9) {
        ((AuthCardCellTrackAbility) aqS71S0201000_9.l0).LIZ(aqS71S0201000_9.i2, (C57834Mms) aqS71S0201000_9.l1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS71S0201000_9 aqS71S0201000_9) {
        ((AuthCardCellTrackAbility) aqS71S0201000_9.l0).LIZ(aqS71S0201000_9.i2, (C57834Mms) aqS71S0201000_9.l1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS71S0201000_9 aqS71S0201000_9) {
        ((RecUserCellTrackAbility) aqS71S0201000_9.l0).LJ(aqS71S0201000_9.i2, (C57826Mmk) aqS71S0201000_9.l1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS71S0201000_9 aqS71S0201000_9) {
        ((RecUserCellTrackAbility) aqS71S0201000_9.l0).LJ(aqS71S0201000_9.i2, (C57826Mmk) aqS71S0201000_9.l1);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS71S0201000_9(BaseNotice baseNotice, HandlerC56918MVm handlerC56918MVm, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = baseNotice;
        this.l1 = handlerC56918MVm;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS71S0201000_9(AuthCardCellTrackAbility authCardCellTrackAbility, int i, C57834Mms c57834Mms, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = authCardCellTrackAbility;
        this.i2 = i;
        this.l1 = c57834Mms;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS71S0201000_9(RecUserCellTrackAbility recUserCellTrackAbility, C57826Mmk c57826Mmk, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = recUserCellTrackAbility;
        this.l1 = c57826Mmk;
        this.i2 = i;
    }
}
