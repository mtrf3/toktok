package kotlin.jvm.internal;

import X.AbstractC216018dp;
import X.AbstractC216708ew;
import X.AbstractC217068fW;
import X.AbstractC65781Prl;
import X.C113554cx;
import X.C169576l7;
import X.C188117Zv;
import X.C217078fX;
import X.C217128fc;
import X.C219608jc;
import X.C219618jd;
import X.C51029K0z;
import X.C61878OQg;
import X.C76800UCe;
import X.FMX;
import X.InterfaceC64592gB;
import X.InterfaceC88472Yns;
import X.OSZ;
import X.T16;
import Y.AfS55S0100000_3;
import com.ss.android.ugc.aweme.addyours.model.AddYoursAvatar;
import com.ss.android.ugc.aweme.addyours.model.UserInvitee;
import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM;
import com.ss.android.ugc.aweme.watch.history.api.WatchHistoryApi;
import com.ss.android.ugc.aweme.watch.history.core.WatchHistoryContentAssem;
import com.ss.android.ugc.aweme.watch.history.core.WatchHistoryListViewModel;
import com.ss.android.ugc.tiktok.addyours.hub.ability.AddYoursHubAbility;
import com.ss.android.ugc.tiktok.addyours.hub.assem.AddYoursHubItemCellAssem;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class AqS28S0100100_3 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public long j1;
    public Object l0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0031, code lost:
    
        if (r1 == 1) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AqS28S0100100_3 r10, java.lang.Object r11) {
        /*
            r6 = r11
            X.7u5 r6 = (X.C200617u5) r6
            java.lang.String r0 = "$this$setState"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            java.lang.Object r5 = r10.l0
            com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM r5 = (com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM) r5
            long r2 = r10.j1
            java.lang.Object r0 = r5.gv0()
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            if (r0 == 0) goto L43
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r0.getAweme()
        L1a:
            java.lang.Object r0 = r10.l0
            com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM r0 = (com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM) r0
            java.lang.Object r0 = r0.gv0()
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            if (r0 == 0) goto L41
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            if (r0 == 0) goto L41
            int r1 = r0.getUserDigg()
            r0 = 1
            if (r1 != r0) goto L41
        L33:
            X.7u8 r7 = r5.lv0(r2, r4, r0)
            r8 = 0
            r11 = 29
            r9 = r8
            r10 = r8
            X.7u5 r0 = X.C200617u5.LIZ(r6, r7, r8, r9, r10, r11)
            return r0
        L41:
            r0 = 0
            goto L33
        L43:
            r4 = 0
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS28S0100100_3.invoke$0(kotlin.jvm.internal.AqS28S0100100_3, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$1(AqS28S0100100_3 aqS28S0100100_3, Object obj) {
        AbstractC216708ew<AbstractC216018dp> it = (AbstractC216708ew) obj;
        o.LJIIIZ(it, "it");
        return Boolean.valueOf(((AbstractC217068fW) aqS28S0100100_3.l0).LJIIJJI(aqS28S0100100_3.j1, it));
    }

    public static final Object invoke$2(AqS28S0100100_3 aqS28S0100100_3, Object it) {
        o.LJIIIZ(it, "it");
        if (!((WatchHistoryContentAssem) aqS28S0100100_3.l0).LJLJJL) {
            FMX.LJIILL("load_account_history", new OSZ("api", "type"), new OSZ(String.valueOf(System.currentTimeMillis() - aqS28S0100100_3.j1), "timing"));
            ((WatchHistoryContentAssem) aqS28S0100100_3.l0).LJLJJL = true;
        }
        WatchHistoryContentAssem watchHistoryContentAssem = (WatchHistoryContentAssem) aqS28S0100100_3.l0;
        watchHistoryContentAssem.withState(watchHistoryContentAssem.A3(), new AqS169S0100000_3((WatchHistoryContentAssem) aqS28S0100100_3.l0, 541));
        WatchHistoryListViewModel A3 = ((WatchHistoryContentAssem) aqS28S0100100_3.l0).A3();
        if (A3.LJLJL == null) {
            WatchHistoryApi.LIZ.getClass();
            A3.disposeOnClear(C188117Zv.LIZIZ.getDialogCopy().LJJL(T16.LIZ()).LJJJLIIL(new AfS55S0100000_3(A3, 43), new InterfaceC64592gB() { // from class: X.7Zu
                @Override // X.InterfaceC64592gB
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                }
            }));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS28S0100100_3 aqS28S0100100_3, Object obj) {
        AbstractC216708ew<AbstractC216018dp> it = (AbstractC216708ew) obj;
        o.LJIIIZ(it, "it");
        ((C217078fX) aqS28S0100100_3.l0).LJIIJJI(aqS28S0100100_3.j1, it);
        return Boolean.TRUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.6l7, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.ArrayList] */
    public static final Object invoke$4(AqS28S0100100_3 aqS28S0100100_3, Object obj) {
        ?? r4;
        String str;
        C219608jc mB;
        String str2;
        ?? openInvitePanel = (C169576l7) obj;
        o.LJIIIZ(openInvitePanel, "$this$openInvitePanel");
        List<AddYoursAvatar> suggestInviteeAvatars = ((C219618jd) C51029K0z.LJIILLIIL((AddYoursHubItemCellAssem) aqS28S0100100_3.l0)).LJLILLLLZI.getSuggestInviteeAvatars();
        if (suggestInviteeAvatars != null) {
            r4 = new ArrayList();
            for (AddYoursAvatar addYoursAvatar : suggestInviteeAvatars) {
                o.LJIIIZ(addYoursAvatar, "<this>");
                Long uid = addYoursAvatar.getUid();
                if (uid == null || (str2 = uid.toString()) == null) {
                    str2 = "";
                }
                r4.add(new UserInvitee(str2, addYoursAvatar.getUserNickname(), null, addYoursAvatar.getUserAvatar(), null, null, false, false, 244, null));
            }
        } else {
            r4 = C61878OQg.INSTANCE;
        }
        openInvitePanel.setPreSelectedUser(r4);
        OSZ[] oszArr = new OSZ[6];
        oszArr[0] = new OSZ("aweme", ((C219618jd) C51029K0z.LJIILLIIL((AddYoursHubItemCellAssem) aqS28S0100100_3.l0)).LJLILLLLZI.getVideo());
        oszArr[1] = new OSZ("topic_id", Long.valueOf(aqS28S0100100_3.j1));
        oszArr[2] = new OSZ("extra_topic_title", ((C219618jd) C51029K0z.LJIILLIIL((AddYoursHubItemCellAssem) aqS28S0100100_3.l0)).LJLILLLLZI.getText());
        oszArr[3] = new OSZ("enter_from", "add_yours_topic_list_page");
        oszArr[4] = new OSZ("enter_method", "click_hub_invite_button");
        AddYoursHubAbility addYoursHubAbility = (AddYoursHubAbility) ((AddYoursHubItemCellAssem) aqS28S0100100_3.l0).LLFII.getValue();
        if (addYoursHubAbility != null && (mB = addYoursHubAbility.mB()) != null) {
            str = mB.LIZJ;
        } else {
            str = null;
        }
        oszArr[5] = new OSZ("extra_previous_page", str);
        openInvitePanel.setExtras(C113554cx.LJJL(oszArr));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        if ((r3 - r0) > r2.LIZLLL) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$5(kotlin.jvm.internal.AqS28S0100100_3 r6, java.lang.Object r7) {
        /*
            X.8ew r7 = (X.AbstractC216708ew) r7
            java.lang.String r0 = "it"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            java.lang.Object r2 = r6.l0
            X.8fc r2 = (X.C217128fc) r2
            X.8f1 r0 = r2.LIZ
            X.8eI r0 = r0.LIZJ
            X.Ynr<? super X.8dp, ? super java.lang.Long, java.lang.Boolean> r4 = r0.LJ
            r5 = 0
            r3 = 1
            if (r4 == 0) goto L3a
            T extends X.8dp r2 = r7.LIZ
            long r0 = r6.j1
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object r0 = r4.invoke(r2, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != r3) goto L35
            java.lang.Object r0 = r6.l0
            X.8fc r0 = (X.C217128fc) r0
            X.8f1 r0 = r0.LIZ
            X.8eI r0 = r0.LIZJ
            r0.getClass()
        L34:
            r5 = 1
        L35:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            return r0
        L3a:
            long r3 = r6.j1
            T extends X.8dp r0 = r7.LIZ
            if (r0 != 0) goto L4a
            r0 = 0
        L42:
            long r3 = r3 - r0
            long r1 = r2.LIZLLL
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L35
            goto L34
        L4a:
            long r0 = r0.LIZJ
            goto L42
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS28S0100100_3.invoke$5(kotlin.jvm.internal.AqS28S0100100_3, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS28S0100100_3(long j, AddYoursHubItemCellAssem addYoursHubItemCellAssem, int i) {
        super(1);
        this.$t = i;
        this.l0 = addYoursHubItemCellAssem;
        this.j1 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0000: IPUT (r6 I:int), (r2 I:kotlin.jvm.internal.AqS28S0100100_3) (LINE:50397184) kotlin.jvm.internal.AqS28S0100100_3.$t int, block:B:1:0x0000 */
    public AqS28S0100100_3(AbstractC217068fW abstractC217068fW, AbstractC217068fW<T> abstractC217068fW2, long j) {
        super(1);
        int i;
        this.$t = i;
        this.l0 = abstractC217068fW;
        this.j1 = abstractC217068fW2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS28S0100100_3(C217078fX c217078fX, long j, int i) {
        super(1);
        this.$t = i;
        this.l0 = c217078fX;
        this.j1 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS28S0100100_3(C217128fc c217128fc, long j, int i) {
        super(1);
        this.$t = i;
        this.l0 = c217128fc;
        this.j1 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS28S0100100_3(VideoDiggVM videoDiggVM, long j, int i) {
        super(1);
        this.$t = i;
        this.l0 = videoDiggVM;
        this.j1 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS28S0100100_3(WatchHistoryContentAssem watchHistoryContentAssem, long j, int i) {
        super(1);
        this.$t = i;
        this.l0 = watchHistoryContentAssem;
        this.j1 = j;
    }
}
