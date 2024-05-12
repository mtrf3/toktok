package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C27943Axv;
import X.C43I;
import X.C54617Lc5;
import X.C56045Lz7;
import X.C56090Lzq;
import X.C57629MjZ;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.MT0;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.discover.viewmodel.TrendsTabState;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.inbox.skylight.plat.InboxSkylightListState;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.InboxHorizontalListState;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;

/* loaded from: classes10.dex */
public class AqS14S0010000_9 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public boolean z0;

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
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case 9:
                return invoke$9(this, obj);
            case 10:
                return invoke$10(this, obj);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this, obj);
            case 12:
                return invoke$12(this, obj);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS14S0010000_9(int i) {
        super(1);
        this.$t = i;
        this.z0 = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS14S0010000_9(boolean z, int i) {
        super(1);
        this.$t = i;
        this.z0 = z;
    }

    public static final Object invoke$0(AqS14S0010000_9 aqS14S0010000_9, Object obj) {
        C54617Lc5 setState = (C54617Lc5) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C54617Lc5.LIZ(setState, null, aqS14S0010000_9.z0, null, null, 13);
    }

    public static final Object invoke$1(AqS14S0010000_9 aqS14S0010000_9, Object obj) {
        InboxSkylightListState setState = (InboxSkylightListState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return InboxSkylightListState.copy$default(setState, null, null, null, null, new C43I(Boolean.valueOf(aqS14S0010000_9.z0)), 15, null);
    }

    public static final Object invoke$10(AqS14S0010000_9 aqS14S0010000_9, Object obj) {
        InboxHorizontalListState setState = (InboxHorizontalListState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return InboxHorizontalListState.copy$default(setState, null, null, null, null, new C43I(Boolean.valueOf(aqS14S0010000_9.z0)), 15, null);
    }

    public static final Object invoke$11(AqS14S0010000_9 aqS14S0010000_9, Object obj) {
        MT0 setState = (MT0) obj;
        o.LJIIIZ(setState, "$this$setState");
        return MT0.LIZ(setState, null, null, null, null, null, null, null, false, aqS14S0010000_9.z0, null, 1791);
    }

    public static final Object invoke$12(AqS14S0010000_9 aqS14S0010000_9, Object obj) {
        MT0 setState = (MT0) obj;
        o.LJIIIZ(setState, "$this$setState");
        return MT0.LIZ(setState, null, null, null, null, null, null, null, aqS14S0010000_9.z0, false, null, 1919);
    }

    public static final Object invoke$13(AqS14S0010000_9 aqS14S0010000_9, Object obj) {
        C57629MjZ setState = (C57629MjZ) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C57629MjZ.LIZ(setState, null, null, null, null, false, null, null, new C43I(Boolean.valueOf(aqS14S0010000_9.z0)), null, 383);
    }

    public static final Object invoke$14(AqS14S0010000_9 aqS14S0010000_9, Object obj) {
        boolean z;
        BaseNotice it = (BaseNotice) obj;
        o.LJIIIZ(it, "it");
        int i = it.type;
        if (i == 50 || i == 13 || i == 1000 || (i == 2008 && aqS14S0010000_9.z0)) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$2(AqS14S0010000_9 aqS14S0010000_9, Object obj) {
        InboxHorizontalListState setState = (InboxHorizontalListState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return InboxHorizontalListState.copy$default(setState, null, null, null, null, new C43I(Boolean.valueOf(aqS14S0010000_9.z0)), 15, null);
    }

    public static final Object invoke$3(AqS14S0010000_9 aqS14S0010000_9, Object obj) {
        UserStory updateMineUserStory = (UserStory) obj;
        o.LJIIIZ(updateMineUserStory, "$this$updateMineUserStory");
        return UserStory.copy$default(updateMineUserStory, null, 0L, 0L, aqS14S0010000_9.z0, 0L, 0L, false, false, 0L, false, null, false, 0L, null, false, false, null, 0, false, 524279, null);
    }

    public static final Object invoke$4(AqS14S0010000_9 aqS14S0010000_9, Object obj) {
        TrendsTabState setState = (TrendsTabState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return TrendsTabState.copy$default(setState, false, null, aqS14S0010000_9.z0, null, false, 27, null);
    }

    public static final Object invoke$5(AqS14S0010000_9 aqS14S0010000_9, Object obj) {
        TrendsTabState setState = (TrendsTabState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return TrendsTabState.copy$default(setState, false, null, false, null, aqS14S0010000_9.z0, 15, null);
    }

    public static final Object invoke$6(AqS14S0010000_9 aqS14S0010000_9, Object obj) {
        TrendsTabState setState = (TrendsTabState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return TrendsTabState.copy$default(setState, aqS14S0010000_9.z0, null, false, null, false, 30, null);
    }

    public static final Object invoke$7(AqS14S0010000_9 aqS14S0010000_9, Object obj) {
        InboxSkylightListState setState = (InboxSkylightListState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return InboxSkylightListState.copy$default(setState, null, null, null, null, new C43I(Boolean.valueOf(aqS14S0010000_9.z0)), 15, null);
    }

    public static final Object invoke$8(AqS14S0010000_9 aqS14S0010000_9, Object obj) {
        InboxSkylightListState setState = (InboxSkylightListState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return InboxSkylightListState.copy$default(setState, null, null, null, null, new C43I(Boolean.valueOf(aqS14S0010000_9.z0)), 15, null);
    }

    public static final Object invoke$9(AqS14S0010000_9 aqS14S0010000_9, Object obj) {
        Object obj2;
        Object obj3;
        C27943Axv sendLog = (C27943Axv) obj;
        o.LJIIIZ(sendLog, "$this$sendLog");
        sendLog.LIZLLL("page_name", "mall");
        boolean z = aqS14S0010000_9.z0;
        String str = CardStruct.IStatusCode.DEFAULT;
        if (!z) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        sendLog.LIZLLL("is_success", obj2);
        C56045Lz7.LIZ.getClass();
        sendLog.LIZLLL("enter_from", C56045Lz7.LIZIZ());
        if (!C56090Lzq.LIZ()) {
            obj3 = "1";
        } else {
            obj3 = CardStruct.IStatusCode.DEFAULT;
        }
        sendLog.LIZLLL("is_first_install_launch", obj3);
        if (!C56090Lzq.LIZIZ()) {
            str = "1";
        }
        sendLog.LIZLLL("is_first_show_mall", str);
        return C76800UCe.LIZ;
    }
}
