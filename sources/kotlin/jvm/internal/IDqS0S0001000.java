package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.AbstractC73638SvC;
import X.C11400ca;
import X.C1V9;
import X.C1VA;
import X.C22M;
import X.C28467BFf;
import X.C68322mC;
import X.InterfaceC274115t;
import X.InterfaceC88472Yns;
import com.bytedance.android.live.broadcast.api.blockword.model.BlockWord;
import com.bytedance.android.livesdk.chatroom.api.LinkReviewApi;
import com.bytedance.android.livesdk.chatroom.model.LatestBanRecordInfo;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import tikcast.api.perception.ViolationStatusResponse;

/* loaded from: classes.dex */
public class IDqS0S0001000 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i0;

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
    public IDqS0S0001000(int i) {
        super(1);
        this.$t = i;
        this.i0 = 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS0S0001000(int i, int i2) {
        super(1);
        this.$t = i2;
        this.i0 = i;
    }

    public static final Object invoke$0(IDqS0S0001000 iDqS0S0001000, Object obj) {
        LinkReviewApi requestReason = (LinkReviewApi) obj;
        o.LJIIIZ(requestReason, "$this$requestReason");
        AbstractC73638SvC<C28467BFf<LatestBanRecordInfo>> bannedInfo = requestReason.bannedInfo(iDqS0S0001000.i0);
        o.LJIIIIZZ(bannedInfo, "bannedInfo(banType)");
        return bannedInfo;
    }

    public static final Object invoke$1(IDqS0S0001000 iDqS0S0001000, Object obj) {
        LinkReviewApi requestReason = (LinkReviewApi) obj;
        o.LJIIIZ(requestReason, "$this$requestReason");
        AbstractC73638SvC<C28467BFf<LatestBanRecordInfo>> bannedInfo = requestReason.bannedInfo(iDqS0S0001000.i0);
        o.LJIIIIZZ(bannedInfo, "bannedInfo(banType)");
        return bannedInfo;
    }

    public static final Object invoke$10(IDqS0S0001000 iDqS0S0001000, Object obj) {
        InterfaceC274115t it = (InterfaceC274115t) obj;
        o.LJIIIZ(it, "it");
        return Integer.valueOf(it.LJJJI(iDqS0S0001000.i0));
    }

    public static final Object invoke$11(IDqS0S0001000 iDqS0S0001000, Object obj) {
        C11400ca it = (C11400ca) obj;
        o.LJIIIZ(it, "it");
        return Integer.valueOf(it.LIZ - iDqS0S0001000.i0);
    }

    public static final Object invoke$12(IDqS0S0001000 iDqS0S0001000, Object obj) {
        boolean z;
        BlockWord it = (BlockWord) obj;
        o.LJIIIZ(it, "it");
        if (it.id == iDqS0S0001000.i0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$13(IDqS0S0001000 iDqS0S0001000, Object obj) {
        C1V9 KVEventSession = (C1V9) obj;
        o.LJIIIZ(KVEventSession, "KVEventSession");
        C68322mC c68322mC = new C68322mC();
        C1VA.LJIIJJI(C1VA.LIZLLL, new IDqS4S0201000(c68322mC, (C68322mC<C22M>) KVEventSession, (C1V9) iDqS0S0001000.i0, 1));
        return c68322mC.element;
    }

    public static final Object invoke$14(IDqS0S0001000 iDqS0S0001000, Object obj) {
        C1V9 KVEventSession = (C1V9) obj;
        o.LJIIIZ(KVEventSession, "KVEventSession");
        C68322mC c68322mC = new C68322mC();
        C1VA.LJIIJJI(C1VA.LIZLLL, new IDqS4S0201000(c68322mC, (C68322mC<C22M>) KVEventSession, (C1V9) iDqS0S0001000.i0, 2));
        return c68322mC.element;
    }

    public static final Object invoke$2(IDqS0S0001000 iDqS0S0001000, Object obj) {
        int i;
        LinkReviewApi requestReason = (LinkReviewApi) obj;
        o.LJIIIZ(requestReason, "$this$requestReason");
        int i2 = iDqS0S0001000.i0;
        if (i2 != 2 && i2 != 13) {
            i = 0;
        } else {
            i = 3;
        }
        AbstractC73638SvC<C28467BFf<ViolationStatusResponse.ResponseData>> requestViolation = requestReason.requestViolation(i);
        o.LJIIIIZZ(requestViolation, "requestViolation(\n      …           }\n           )");
        return requestViolation;
    }

    public static final Object invoke$3(IDqS0S0001000 iDqS0S0001000, Object obj) {
        InterfaceC274115t it = (InterfaceC274115t) obj;
        o.LJIIIZ(it, "it");
        return Integer.valueOf(it.LJJLIIIJILLIZJL(iDqS0S0001000.i0));
    }

    public static final Object invoke$4(IDqS0S0001000 iDqS0S0001000, Object obj) {
        InterfaceC274115t it = (InterfaceC274115t) obj;
        o.LJIIIZ(it, "it");
        return Integer.valueOf(it.LJJLJLI(iDqS0S0001000.i0));
    }

    public static final Object invoke$5(IDqS0S0001000 iDqS0S0001000, Object obj) {
        InterfaceC274115t it = (InterfaceC274115t) obj;
        o.LJIIIZ(it, "it");
        return Integer.valueOf(it.LJJLIIIJLLLLLLLZ(iDqS0S0001000.i0));
    }

    public static final Object invoke$6(IDqS0S0001000 iDqS0S0001000, Object obj) {
        InterfaceC274115t it = (InterfaceC274115t) obj;
        o.LJIIIZ(it, "it");
        return Integer.valueOf(it.LJJJI(iDqS0S0001000.i0));
    }

    public static final Object invoke$7(IDqS0S0001000 iDqS0S0001000, Object obj) {
        InterfaceC274115t it = (InterfaceC274115t) obj;
        o.LJIIIZ(it, "it");
        return Integer.valueOf(it.LJJLIIIJILLIZJL(iDqS0S0001000.i0));
    }

    public static final Object invoke$8(IDqS0S0001000 iDqS0S0001000, Object obj) {
        InterfaceC274115t it = (InterfaceC274115t) obj;
        o.LJIIIZ(it, "it");
        return Integer.valueOf(it.LJJLJLI(iDqS0S0001000.i0));
    }

    public static final Object invoke$9(IDqS0S0001000 iDqS0S0001000, Object obj) {
        InterfaceC274115t it = (InterfaceC274115t) obj;
        o.LJIIIZ(it, "it");
        return Integer.valueOf(it.LJJLIIIJLLLLLLLZ(iDqS0S0001000.i0));
    }
}
