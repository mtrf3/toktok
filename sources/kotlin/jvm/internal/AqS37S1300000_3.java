package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.ActivityC86117Xqz;
import X.AnonymousClass784;
import X.C1793572d;
import X.C183317Hj;
import X.C184077Kh;
import X.C214378bB;
import X.C214528bQ;
import X.C26045AKb;
import X.C2U8;
import X.C34K;
import X.C50420Jqa;
import X.C65352Pkq;
import X.C71897SJp;
import X.C76800UCe;
import X.C78926UyI;
import X.C7HF;
import X.C7HR;
import X.C7IK;
import X.C8W0;
import X.InterfaceC175156u7;
import X.InterfaceC65784Pro;
import X.InterfaceC82683Wch;
import X.InterfaceC87283bg;
import X.X1D;
import androidx.credentials.playservices.HiddenActivity$$ExternalSyntheticOutline0;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.aweme.upvote.event.UpvotePublishMobParam;
import com.ss.android.ugc.aweme.upvote.publish.UpvotePublishVM;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public class AqS37S1300000_3 extends AbstractC65781Prl implements InterfaceC65784Pro {
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

    public static final Object invoke$0(AqS37S1300000_3 aqS37S1300000_3) {
        InterfaceC82683Wch interfaceC82683Wch;
        boolean LJI = ((InterfaceC175156u7) aqS37S1300000_3.l1).LJI();
        ((C34K) aqS37S1300000_3.l2).element = true;
        ((InterfaceC175156u7) aqS37S1300000_3.l1).LIZIZ(aqS37S1300000_3.s0, !((C71897SJp) aqS37S1300000_3.l3).isChecked(), LJI);
        InterfaceC82683Wch interfaceC82683Wch2 = C1793572d.LIZ;
        if (interfaceC82683Wch2 != null && interfaceC82683Wch2.isShowing() && (interfaceC82683Wch = C1793572d.LIZ) != null) {
            interfaceC82683Wch.dismiss();
        }
        return Boolean.FALSE;
    }

    public static final Object invoke$1(AqS37S1300000_3 aqS37S1300000_3) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("store hierarchy data in Fragment: ");
        LIZ.append((Fragment) aqS37S1300000_3.l1);
        LIZ.append(", key is ");
        LIZ.append(aqS37S1300000_3.s0);
        LIZ.append(", data is ");
        LIZ.append((InterfaceC87283bg) aqS37S1300000_3.l2);
        LIZ.append(", container[this] is ");
        LIZ.append(((ConcurrentHashMap) ((Assembler) aqS37S1300000_3.l3).LJLILLLLZI).get((Fragment) aqS37S1300000_3.l1));
        return X1D.LIZIZ(LIZ);
    }

    public static final Object invoke$2(AqS37S1300000_3 aqS37S1300000_3) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("store hierarchy data in Assem: ");
        LIZ.append((C8W0) aqS37S1300000_3.l1);
        LIZ.append(", key is ");
        LIZ.append(aqS37S1300000_3.s0);
        LIZ.append(", data is ");
        LIZ.append((InterfaceC87283bg) aqS37S1300000_3.l2);
        LIZ.append(", container[this] is ");
        LIZ.append(((ConcurrentHashMap) ((Assembler) aqS37S1300000_3.l3).LJLILLLLZI).get((C8W0) aqS37S1300000_3.l1));
        return X1D.LIZIZ(LIZ);
    }

    public static final Object invoke$3(AqS37S1300000_3 aqS37S1300000_3) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("store hierarchy data in Activity: ");
        LIZ.append((ActivityC45651qj) aqS37S1300000_3.l1);
        LIZ.append(", key is ");
        LIZ.append(aqS37S1300000_3.s0);
        LIZ.append(", data is ");
        LIZ.append((InterfaceC87283bg) aqS37S1300000_3.l2);
        LIZ.append(", container[this] is ");
        LIZ.append(((ConcurrentHashMap) ((Assembler) aqS37S1300000_3.l3).LJLILLLLZI).get((ActivityC45651qj) aqS37S1300000_3.l1));
        return X1D.LIZIZ(LIZ);
    }

    public static final Object invoke$4(AqS37S1300000_3 aqS37S1300000_3) {
        ActivityC45651qj activityC45651qj = (ActivityC45651qj) aqS37S1300000_3.l1;
        String str = aqS37S1300000_3.s0;
        Integer num = (Integer) aqS37S1300000_3.l2;
        UpvotePublishMobParam upvotePublishMobParam = (UpvotePublishMobParam) aqS37S1300000_3.l3;
        C214378bB c214378bB = new C214378bB(C65352Pkq.LIZ(UpvotePublishVM.class), null, C214528bQ.LJLIL, C78926UyI.LJJII(activityC45651qj, false), C184077Kh.LJLIL, C7HF.INSTANCE, C78926UyI.LJIIJJI(activityC45651qj), C78926UyI.LJIILL(activityC45651qj));
        UpvotePublishVM.kv0((UpvotePublishVM) c214378bB.getValue(), str, null, null, null, num, false, 46);
        ((UpvotePublishVM) c214378bB.getValue()).mv0(str, upvotePublishMobParam);
        if ((C7HR.LIZ() || AnonymousClass784.LIZ()) && !C7IK.LIZJ().getBoolean(C7IK.LIZ("has_show_repost_public_tips_"), false)) {
            C26045AKb c26045AKb = new C26045AKb(activityC45651qj);
            c26045AKb.LJIIIIZZ(R.string.g7n);
            c26045AKb.LJIIJ();
            C7IK.LIZJ().storeBoolean(C7IK.LIZ("has_show_repost_public_tips_"), true);
        }
        if (C183317Hj.LIZ() == 5 || C183317Hj.LIZ() == 6) {
            C50420Jqa c50420Jqa = new C50420Jqa(78);
            c50420Jqa.LJLJI = HiddenActivity$$ExternalSyntheticOutline0.m("show_tooltip_after_resume", false, "quick_share_aid", str);
            C2U8.LIZ(c50420Jqa);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS37S1300000_3(ActivityC45651qj activityC45651qj, String str, Integer num, UpvotePublishMobParam upvotePublishMobParam, int i) {
        super(0);
        this.$t = i;
        this.l1 = activityC45651qj;
        this.s0 = str;
        this.l2 = num;
        this.l3 = upvotePublishMobParam;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS37S1300000_3(InterfaceC175156u7 interfaceC175156u7, C34K c34k, C71897SJp c71897SJp, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = interfaceC175156u7;
        this.l2 = c34k;
        this.l3 = c71897SJp;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS37S1300000_3(C8W0 c8w0, String str, InterfaceC87283bg interfaceC87283bg, Assembler assembler, int i) {
        super(0);
        this.$t = i;
        this.l1 = c8w0;
        this.s0 = str;
        this.l2 = interfaceC87283bg;
        this.l3 = assembler;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS37S1300000_3(ActivityC86117Xqz activityC86117Xqz, String str, InterfaceC87283bg interfaceC87283bg, Assembler assembler, int i) {
        super(0);
        this.$t = i;
        this.l1 = activityC86117Xqz;
        this.s0 = str;
        this.l2 = interfaceC87283bg;
        this.l3 = assembler;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS37S1300000_3(Fragment fragment, String str, InterfaceC87283bg interfaceC87283bg, Assembler assembler, int i) {
        super(0);
        this.$t = i;
        this.l1 = fragment;
        this.s0 = str;
        this.l2 = interfaceC87283bg;
        this.l3 = assembler;
    }
}
