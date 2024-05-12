package X;

import com.ss.android.ugc.aweme.commercialize.profile.impl.ad.ProfileFeedSwipeEvent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS48S1000000_10;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

@InterfaceC55644Lse(service = {InterfaceC55531Lqp.class})
/* renamed from: X.NFd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59041NFd implements InterfaceC55531Lqp {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJL;
    public final InterfaceC59043NFf LJLIL;
    public int LJLJJI;
    public String LJLJJL;
    public final OF1 LJLILLLLZI = C1DF.LJJIFFI(this, C59044NFg.LJLIL);
    public final OF1 LJLJI = C1DF.LJJIFFI(this, C59045NFh.LJLIL);
    public final N0Z LJLJJLL = new N0Z(new Object[0]);

    static {
        TBT tbt = new TBT(C59041NFd.class, "listModel", "getListModel()Lcom/ss/android/ugc/aweme/common/presenter/BaseListModel;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLJL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C59041NFd.class, "author", "getAuthor()Lcom/ss/android/ugc/aweme/profile/model/User;", 0, c65351Pkp)};
    }

    public final AbstractC51036K1g<Aweme, ?> LIZJ() {
        return (AbstractC51036K1g) this.LJLILLLLZI.LIZ(this, LJLJL[0]);
    }

    @Override // X.InterfaceC41034G8o
    public final /* bridge */ /* synthetic */ InterfaceC59043NFf L9() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC41000G7g
    public final void initialize() {
        C59367NRr.LIZJ(this);
    }

    public C59041NFd(C55529Lqn c55529Lqn) {
        this.LJLIL = c55529Lqn;
    }

    public static final void LIZLLL(String str) {
        new AqS48S1000000_10(str, 1);
    }

    @Override // X.InterfaceC55531Lqp
    public final void NJ(AbstractC51036K1g<Aweme, ?> listModel) {
        Integer num;
        Integer num2;
        o.LJIIIZ(listModel, "listModel");
        StringBuilder sb = new StringBuilder("on exit inner feed: aweme size = ");
        List<Aweme> items = listModel.getItems();
        if (items != null) {
            num = Integer.valueOf(items.size());
        } else {
            num = null;
        }
        sb.append(num);
        sb.append(", ad size = ");
        List<Aweme> items2 = listModel.getItems();
        if (items2 != null) {
            ArrayList arrayList = new ArrayList();
            for (Aweme aweme : items2) {
                if (aweme.isAd()) {
                    arrayList.add(aweme);
                }
            }
            num2 = Integer.valueOf(arrayList.size());
        } else {
            num2 = null;
        }
        sb.append(num2);
        LIZLLL(sb.toString());
        this.LJLJJL = null;
        N0Z n0z = this.LJLJJLL;
        if (n0z.LJIIIIZZ == 0) {
            ProfileFeedSwipeEvent profileFeedSwipeEvent = new ProfileFeedSwipeEvent();
            profileFeedSwipeEvent.LIZLLL(0, "value");
            n0z.LJJIFFI(profileFeedSwipeEvent);
        }
        EventBus.LIZJ().LJIJ(this);
    }

    @Override // X.InterfaceC55531Lqp
    public final void oY(Aweme aweme) {
        List<Aweme> items;
        o.LJIIIZ(aweme, "aweme");
        AbstractC51036K1g<Aweme, ?> LIZJ = LIZJ();
        if (LIZJ == null || (items = LIZJ.getItems()) == null) {
            return;
        }
        Iterator<Aweme> it = items.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (o.LJ(it.next().getAid(), aweme.getAid())) {
                if (i < 0) {
                    return;
                }
                Iterator<Aweme> it2 = items.iterator();
                int i2 = 0;
                while (it2.hasNext()) {
                    if (o.LJ(it2.next().getAid(), this.LJLJJL)) {
                        if (i2 < 0) {
                            return;
                        }
                        if (i2 - i <= 0) {
                            LIZ(1, (User) this.LJLJI.LIZ(this, LJLJL[1]), aweme.getAid(), LIZJ);
                        }
                        if (aweme.isAd()) {
                            this.LJLJJI = 0;
                            return;
                        } else {
                            this.LJLJJI++;
                            return;
                        }
                    }
                    i2++;
                }
                return;
            }
            i++;
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onDetailQuit(C55281Lmn event) {
        List<Aweme> items;
        List<Aweme> items2;
        o.LJIIIZ(event, "event");
        AbstractC51036K1g<Aweme, ?> LIZJ = LIZJ();
        if (LIZJ != null && (items = LIZJ.getItems()) != null) {
            List LLJILJILJ = ORZ.LLJILJILJ(items);
            ArrayList arrayList = new ArrayList();
            for (Object obj : LLJILJILJ) {
                if (((Aweme) obj).isAd()) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                AbstractC51036K1g<Aweme, ?> LIZJ2 = LIZJ();
                if (LIZJ2 != null && (items2 = LIZJ2.getItems()) != null) {
                    items2.remove(next);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    @X.QD3(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSwipeVideo(X.C59046NFi r7) {
        /*
            r6 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            X.N0Z r4 = r6.LJLJJLL
            r4.getClass()
            boolean r0 = r4.LJIIIZ
            if (r0 == 0) goto Lf
        Le:
            return
        Lf:
            java.lang.Integer r2 = r7.LJLIL
            java.lang.Integer r0 = r7.LJLILLLLZI
            r3 = 1
            if (r2 == 0) goto L86
            if (r0 == 0) goto L86
            int r1 = r0.intValue()
            int r0 = r2.intValue()
            if (r0 >= r1) goto L84
            r0 = 1
        L23:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            if (r0 == 0) goto L86
            boolean r0 = r0.booleanValue()
        L2d:
            java.lang.String r2 = "value"
            if (r0 == 0) goto L48
            int r0 = r4.LJIIIIZZ
            int r0 = r0 + 1
            r4.LJIIIIZZ = r0
            com.ss.android.ugc.aweme.commercialize.profile.impl.ad.ProfileFeedSwipeEvent r1 = new com.ss.android.ugc.aweme.commercialize.profile.impl.ad.ProfileFeedSwipeEvent
            r1.<init>()
            int r0 = r4.LJIIIIZZ
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.LIZLLL(r0, r2)
            r4.LJJIFFI(r1)
        L48:
            java.lang.Integer r5 = r7.LJLIL
            java.lang.Integer r0 = r7.LJLILLLLZI
            if (r5 == 0) goto Le
            if (r0 == 0) goto Le
            int r1 = r0.intValue()
            int r0 = r5.intValue()
            if (r0 <= r1) goto L82
            r0 = 1
        L5b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            if (r0 == 0) goto Le
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Le
            int r0 = r4.LJIIIIZZ
            if (r0 != 0) goto L7f
            r0 = -1
            r4.LJIIIIZZ = r0
            com.ss.android.ugc.aweme.commercialize.profile.impl.ad.ProfileFeedSwipeEvent r1 = new com.ss.android.ugc.aweme.commercialize.profile.impl.ad.ProfileFeedSwipeEvent
            r1.<init>()
            int r0 = r4.LJIIIIZZ
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.LIZLLL(r0, r2)
            r4.LJJIFFI(r1)
        L7f:
            r4.LJIIIZ = r3
            goto Le
        L82:
            r0 = 0
            goto L5b
        L84:
            r0 = 0
            goto L23
        L86:
            r0 = 0
            goto L2d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59041NFd.onSwipeVideo(X.NFi):void");
    }

    @Override // X.InterfaceC55531Lqp
    public final void it0(AbstractC51036K1g<Aweme, ?> listModel, String str) {
        Integer num;
        o.LJIIIZ(listModel, "listModel");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("enter feed size = ");
        List<Aweme> items = listModel.getItems();
        if (items != null) {
            num = Integer.valueOf(items.size());
        } else {
            num = null;
        }
        LIZ.append(num);
        LIZLLL(X1D.LIZIZ(LIZ));
        LIZ(0, (User) this.LJLJI.LIZ(this, LJLJL[1]), str, listModel);
        EventBus.LIZJ().LJIILJJIL(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014f A[LOOP:1: B:63:0x0149->B:65:0x014f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015d  */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v2, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v4, types: [X.OQg] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(int r13, com.ss.android.ugc.aweme.profile.model.User r14, java.lang.String r15, X.AbstractC51036K1g<com.ss.android.ugc.aweme.feed.model.Aweme, ?> r16) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59041NFd.LIZ(int, com.ss.android.ugc.aweme.profile.model.User, java.lang.String, X.K1g):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(int r16, java.lang.String r17, java.util.List r18, X.InterfaceC67352kd r19) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59041NFd.LIZIZ(int, java.lang.String, java.util.List, X.2kd):java.lang.Object");
    }
}
