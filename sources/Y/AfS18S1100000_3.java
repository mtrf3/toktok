package Y;

import X.AbstractC36908Ee8;
import X.C192487gy;
import X.C1FP;
import X.C64920Pds;
import X.C69432nz;
import X.C76082yi;
import X.C7H0;
import X.C7H1;
import X.C7H2;
import X.C7HV;
import X.C7NO;
import X.C7NP;
import X.EF7;
import X.EnumC177746yI;
import X.InterfaceC64592gB;
import X.RBY;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteCacheState;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.upvote.publish.UpvotePublishVM;
import java.util.List;
import kotlin.jvm.internal.AqS57S1100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class AfS18S1100000_3 implements InterfaceC64592gB {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            case 3:
                accept$3(this, obj);
                return;
            case 4:
                accept$4(this, obj);
                return;
            case 5:
                accept$5(this, obj);
                return;
            case 6:
                accept$6(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS18S1100000_3 afS18S1100000_3, Object obj) {
        String str;
        RBY LJFF;
        AbstractC36908Ee8 abstractC36908Ee8 = (AbstractC36908Ee8) obj;
        abstractC36908Ee8.checkValid();
        String str2 = afS18S1100000_3.s0;
        if (str2 != null) {
            IAccountService LJIJ = AccountService.LJIJ();
            if (LJIJ != null && (LJFF = LJIJ.LJFF()) != null) {
                str = LJFF.getCurUserId();
            } else {
                str = null;
            }
            if (!o.LJ(str2, str)) {
                return;
            }
        }
        Keva keva = ((C192487gy) afS18S1100000_3.l1).LIZIZ;
        if (keva != null) {
            keva.storeString("CollectionCache", GsonProtectorUtils.toJson(C69432nz.LIZ(), abstractC36908Ee8));
        }
    }

    public static final void accept$1(AfS18S1100000_3 afS18S1100000_3, Object obj) {
        if (((BaseResponse) obj).status_code > 0) {
            if (((C7NO) afS18S1100000_3.l1) == C7NO.BLUR) {
                C7NP.LIZJ.remove(afS18S1100000_3.s0);
            }
            if (((C7NO) afS18S1100000_3.l1) == C7NO.VISIBLE) {
                C7NP.LIZLLL.remove(afS18S1100000_3.s0);
            }
        }
    }

    public static final void accept$2(AfS18S1100000_3 afS18S1100000_3, Object obj) {
        if (((C7NO) afS18S1100000_3.l1) == C7NO.BLUR) {
            C7NP.LIZJ.remove(afS18S1100000_3.s0);
        }
        if (((C7NO) afS18S1100000_3.l1) == C7NO.VISIBLE) {
            C7NP.LIZLLL.remove(afS18S1100000_3.s0);
        }
    }

    public static final void accept$3(AfS18S1100000_3 afS18S1100000_3, Object obj) {
        Throwable it = (Throwable) obj;
        UpvoteStruct LJIIIIZZ = C1FP.LJIIIIZZ(C7H2.LIZ(afS18S1100000_3.s0));
        if (LJIIIIZZ == null) {
            return;
        }
        if (C1FP.LJIIZILJ(it)) {
            C76082yi.LIZ(afS18S1100000_3.s0);
            C7HV.LIZIZ.LJIILJJIL().LJII(afS18S1100000_3.s0, EnumC177746yI.PERMISSION_DENIED);
            return;
        }
        String text = LJIIIIZZ.getText();
        if (text == null || text.length() == 0) {
            C7H1.LJIILJJIL(afS18S1100000_3.s0, UpvoteCacheState.PUBLISH_FAILED);
            ((UpvotePublishVM) afS18S1100000_3.l1).setState(new AqS57S1100000_3(it, afS18S1100000_3.s0, 14));
        } else {
            C7H1.LJIILIIL(afS18S1100000_3.s0, UpvoteCacheState.PUBLISH_FAILED);
        }
        UpvotePublishVM upvotePublishVM = (UpvotePublishVM) afS18S1100000_3.l1;
        o.LJIIIIZZ(it, "it");
        upvotePublishVM.LJLIL.LJI(C64920Pds.LIZ(EF7.LIZIZ(), it));
    }

    public static final void accept$4(AfS18S1100000_3 afS18S1100000_3, Object obj) {
        Throwable it = (Throwable) obj;
        UpvotePublishVM upvotePublishVM = (UpvotePublishVM) afS18S1100000_3.l1;
        String str = afS18S1100000_3.s0;
        o.LJIIIIZZ(it, "it");
        upvotePublishVM.jv0(str, it);
        ((UpvotePublishVM) afS18S1100000_3.l1).LJLIL.LJI(C64920Pds.LIZ(EF7.LIZIZ(), it));
    }

    public static final void accept$5(AfS18S1100000_3 afS18S1100000_3, Object obj) {
        Throwable it = (Throwable) obj;
        UpvotePublishVM upvotePublishVM = (UpvotePublishVM) afS18S1100000_3.l1;
        String str = afS18S1100000_3.s0;
        o.LJIIIIZZ(it, "it");
        upvotePublishVM.jv0(str, it);
        ((UpvotePublishVM) afS18S1100000_3.l1).LJLIL.LJI(C64920Pds.LIZ(EF7.LIZIZ(), it));
    }

    public static final void accept$6(AfS18S1100000_3 afS18S1100000_3, Object obj) {
        List<UpvoteStruct> upvotes;
        Throwable t = (Throwable) obj;
        UpvoteList LIZ = C7H2.LIZ(afS18S1100000_3.s0);
        if (LIZ == null || (upvotes = LIZ.getUpvotes()) == null || upvotes.isEmpty()) {
            C7H0 c7h0 = (C7H0) afS18S1100000_3.l1;
            if (c7h0 != null) {
                o.LJIIIIZZ(t, "t");
                c7h0.LIZ(t);
                return;
            }
            return;
        }
        C7H0 c7h02 = (C7H0) afS18S1100000_3.l1;
        if (c7h02 == null) {
            return;
        }
        c7h02.LIZIZ(LIZ);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS18S1100000_3(com.ss.android.ugc.aweme.upvote.publish.UpvotePublishVM r2, java.lang.String r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            switch(r4) {
                case 3: goto Le;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l1 = r2
            r0.s0 = r3
        La:
            r0.<init>()
            return
        Le:
            r0 = r1
            r0.s0 = r3
            r0.l1 = r2
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS18S1100000_3.<init>(com.ss.android.ugc.aweme.upvote.publish.UpvotePublishVM, java.lang.String, int):void");
    }

    public AfS18S1100000_3(String str, Object obj, int i) {
        this.$t = i;
        this.s0 = str;
        this.l1 = obj;
    }

    public AfS18S1100000_3(long j, C7H0 c7h0, String str, int i) {
        this.$t = i;
        this.s0 = str;
        this.l1 = c7h0;
    }
}
