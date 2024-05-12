package kotlin.jvm.internal;

import X.AbstractC226378uX;
import X.AbstractC49325JXl;
import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.C49133JQb;
import X.C76800UCe;
import X.C78685UuP;
import X.InterfaceC88473Ynt;
import X.X1D;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.assem.addyours.AddYoursEntranceButtonAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.List;
import java.util.Set;

/* loaded from: classes4.dex */
public class IDqS13S0400000_3 extends AbstractC65781Prl implements InterfaceC88473Ynt {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x006c, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.IDqS13S0400000_3 r17, java.lang.Object r18, java.lang.Object r19, java.lang.Object r20) {
        /*
            r0 = r20
            r7 = r18
            r1 = r19
            com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct r7 = (com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct) r7
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r15 = r1.booleanValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r14 = r0.booleanValue()
            r2 = r17
            if (r7 == 0) goto L6e
            java.lang.Object r3 = r2.l0
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = (com.ss.android.ugc.aweme.feed.model.Aweme) r3
            java.lang.Object r4 = r2.l1
            X.8uX r4 = (X.AbstractC226378uX) r4
            java.lang.Object r1 = r2.l2
            X.1qj r1 = (X.ActivityC45651qj) r1
            java.lang.Object r0 = r2.l3
            com.ss.android.ugc.aweme.feed.assem.addyours.AddYoursEntranceButtonAssem r0 = (com.ss.android.ugc.aweme.feed.assem.addyours.AddYoursEntranceButtonAssem) r0
            com.ss.android.ugc.aweme.addyours.model.AddYourRecordParam r6 = new com.ss.android.ugc.aweme.addyours.model.AddYourRecordParam
            r8 = 0
            boolean r9 = X.C226388uY.LJ()
            java.lang.String r10 = "personal_homepage"
            java.lang.String r11 = "add_yours"
            java.lang.String r12 = "add_yours_bottom_button"
            int r5 = r3.getFollowStatus()
            java.lang.String r13 = java.lang.String.valueOf(r5)
            r16 = 0
            r4.getClass()
            boolean r4 = r4 instanceof X.C226348uU
            java.lang.Integer r18 = java.lang.Integer.valueOf(r4)
            r4 = r6
            r19 = 1538(0x602, float:2.155E-42)
            r17 = r16
            r20 = r16
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            X.8l2 r5 = X.C220488l2.LIZIZ
            r5.LJIIJ(r1, r3, r4)
            X.5H3 r1 = r0.LLIIIL
            java.lang.Object r3 = r1.getValue()
            com.ss.android.ugc.aweme.feed.assem.addyours.AddYoursEntranceButtonVM r3 = (com.ss.android.ugc.aweme.feed.assem.addyours.AddYoursEntranceButtonVM) r3
            java.lang.Object r1 = X.C51029K0z.LJIILLIIL(r0)
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r1 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r1
            java.lang.String r0 = "add_yours_bottom_button_click"
            r3.lv0(r0, r1)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L8b
        L6e:
            java.lang.Object r2 = r2.l0
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = (com.ss.android.ugc.aweme.feed.model.Aweme) r2
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "cannot get valid add yours for aweme, aid="
            r1.append(r0)
            java.lang.String r0 = r2.getAid()
            r1.append(r0)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.String r0 = "AddYoursEntranceButtonAssem"
            X.C221018lt.LJFF(r0, r1)
        L8b:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.IDqS13S0400000_3.invoke$0(kotlin.jvm.internal.IDqS13S0400000_3, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$1(IDqS13S0400000_3 iDqS13S0400000_3, Object obj, Object obj2, Object obj3) {
        Aweme aweme = (Aweme) obj;
        AbstractC49325JXl hostFeed = (AbstractC49325JXl) obj2;
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        o.LJIIIZ(aweme, "$this$null");
        o.LJIIIZ(hostFeed, "hostFeed");
        if (C78685UuP.LJJJZ(aweme.getAid()) && !((Set) iDqS13S0400000_3.l0).contains(aweme.getAid())) {
            Set set = (Set) iDqS13S0400000_3.l0;
            String aid = aweme.getAid();
            o.LJIIIIZZ(aid, "this.aid");
            set.add(aid);
            if (booleanValue) {
                ListProtector.add((List) iDqS13S0400000_3.l1, 0, aweme);
            } else {
                ((List) iDqS13S0400000_3.l1).add(aweme);
            }
        } else {
            if (C78685UuP.LJJJZ(aweme.getAid()) && ((Set) iDqS13S0400000_3.l0).contains(aweme.getAid())) {
                Set set2 = (Set) iDqS13S0400000_3.l2;
                String aid2 = aweme.getAid();
                o.LJIIIIZZ(aid2, "this.aid");
                set2.add(aid2);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("duplicated aid:");
                LIZ.append(aweme.getAid());
                C49133JQb.LIZ("fallbackHelper", X1D.LIZIZ(LIZ));
            }
            if (hostFeed.getAweme() != null) {
                ((List) iDqS13S0400000_3.l3).remove(hostFeed);
                C49133JQb.LIZ("fallbackHelper", "remove duplicated feed");
            }
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS13S0400000_3(Aweme aweme, AbstractC226378uX abstractC226378uX, ActivityC45651qj activityC45651qj, AddYoursEntranceButtonAssem addYoursEntranceButtonAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = aweme;
        this.l1 = abstractC226378uX;
        this.l2 = activityC45651qj;
        this.l3 = addYoursEntranceButtonAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS13S0400000_3(Set set, Set<String> set2, List<Aweme> list, Set<String> set3, List<SearchMixFeed> list2) {
        super(3);
        this.$t = list2;
        this.l0 = set;
        this.l1 = set2;
        this.l2 = list;
        this.l3 = set3;
    }
}
