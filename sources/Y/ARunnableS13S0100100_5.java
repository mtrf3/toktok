package Y;

import X.AbstractC28221B5t;
import X.BCN;
import X.BKP;
import X.BV4;
import X.C04120Ee;
import X.C15380j0;
import X.C1A;
import X.C1EW;
import X.C30160Bsa;
import X.C30627C0h;
import X.C30637C0r;
import X.C30725C4b;
import X.C30868C9o;
import X.C31319CQx;
import X.CS2;
import com.bytedance.android.livesdk.LiveRoomFragment;
import com.bytedance.android.livesdk.dataChannel.CaptchaLivePauseTimeChannel;
import com.bytedance.android.livesdk.model.message.Question;
import com.bytedance.android.livesdk.qa.QAApi;
import com.bytedance.android.livesdk.qa.QuestionCardWidget;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class ARunnableS13S0100100_5 implements Runnable {
    public final int $t;
    public long j1;
    public Object l0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        Long l;
        ((QuestionCardWidget) this.l0).LJZ(false);
        QuestionCardWidget questionCardWidget = (QuestionCardWidget) this.l0;
        Question question = questionCardWidget.LJLJI;
        if (question != null) {
            QAApi qAApi = (QAApi) C1A.LIZJ(QAApi.class);
            DataChannel dataChannel = questionCardWidget.dataChannel;
            if (dataChannel != null) {
                l = (Long) dataChannel.kv0(BCN.class);
            } else {
                l = null;
            }
            o.LJI(l);
            C1EW.LIZ(qAApi.endAnswer(l.longValue(), question.questionId)).LJJJLIIL(new AfS57S0100000_5(questionCardWidget, 161), BV4.LJLIL);
            questionCardWidget.LLFF(question, 1);
        }
        int i = ((int) this.j1) / 60;
        String LJIIIIZZ = C15380j0.LJIIIIZZ(R.plurals.nd, i, Integer.valueOf(i));
        if (((QuestionCardWidget) this.l0).LJLILLLLZI) {
            C30868C9o.LJI(LJIIIIZZ);
        }
    }

    public static final void run$0(ARunnableS13S0100100_5 aRunnableS13S0100100_5) {
        boolean LIZ;
        try {
            C30637C0r.LIZ(aRunnableS13S0100100_5.j1, (C04120Ee) aRunnableS13S0100100_5.l0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS13S0100100_5 aRunnableS13S0100100_5) {
        boolean LIZ;
        try {
            C30627C0h.LJIILL(aRunnableS13S0100100_5.j1, ((C04120Ee) aRunnableS13S0100100_5.l0).LIZJ - C30725C4b.LIZ(), (C04120Ee) aRunnableS13S0100100_5.l0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS13S0100100_5 aRunnableS13S0100100_5) {
        BKP bkp;
        LiveRoomFragment liveRoomFragment = (LiveRoomFragment) aRunnableS13S0100100_5.l0;
        long j = aRunnableS13S0100100_5.j1;
        AbstractC28221B5t abstractC28221B5t = liveRoomFragment.LLFFF;
        if (abstractC28221B5t != null && (bkp = liveRoomFragment.LLIIII) != null && bkp.LJLJJL == 0) {
            abstractC28221B5t.LJIJI(j);
        }
    }

    public static final void run$3(ARunnableS13S0100100_5 aRunnableS13S0100100_5) {
        boolean LIZ;
        try {
            aRunnableS13S0100100_5.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS13S0100100_5 aRunnableS13S0100100_5) {
        ((C30160Bsa) aRunnableS13S0100100_5.l0).LJLJJI.LJLJJL.rv0(CaptchaLivePauseTimeChannel.class, Long.valueOf(aRunnableS13S0100100_5.j1));
    }

    public static final void run$5(ARunnableS13S0100100_5 aRunnableS13S0100100_5) {
        ((CS2) aRunnableS13S0100100_5.l0).LIZ(aRunnableS13S0100100_5.j1);
    }

    public static final void run$6(ARunnableS13S0100100_5 aRunnableS13S0100100_5) {
        ((CS2) aRunnableS13S0100100_5.l0).LIZ(aRunnableS13S0100100_5.j1);
    }

    public static final void run$7(ARunnableS13S0100100_5 aRunnableS13S0100100_5) {
        C31319CQx c31319CQx = (C31319CQx) aRunnableS13S0100100_5.l0;
        long j = aRunnableS13S0100100_5.j1;
        if (!C31319CQx.LJLIL(j, c31319CQx.LJLLLLLL) && !C31319CQx.LJLIL(j, c31319CQx.LJLZ)) {
            C31319CQx.LJLIL(j, c31319CQx.LJZ);
        }
    }

    public ARunnableS13S0100100_5(long j, Object obj, int i) {
        this.$t = i;
        this.j1 = j;
        this.l0 = obj;
    }
}
