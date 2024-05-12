package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C0F0;
import X.C16880lQ;
import X.C221018lt;
import X.C35363DuJ;
import X.C53432Ky4;
import X.C76800UCe;
import X.ENH;
import X.FBA;
import X.InterfaceC65784Pro;
import X.LVL;
import X.MS5;
import X.X1D;
import android.graphics.Paint;
import com.bytedance.android.livesdk.livesetting.other.FollowLiveBubbleConfig;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.inbox.cache.PreloadManager;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeList;
import com.ss.android.ugc.aweme.notice.repo.api.NotificationApi;
import defpackage.b0;

/* loaded from: classes7.dex */
public class AqS44S0001000_6 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public int i0;

    @Override // X.InterfaceC65784Pro
    public /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public final void invoke$0() {
        boolean booleanValue;
        String str;
        int i;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("fetch start thread=");
        LIZ.append(C16880lQ.LLLLIIIILLL());
        C221018lt.LJFF("NCManager", X1D.LIZIZ(LIZ));
        LVL.LJLIL.getClass();
        boolean z = true;
        if (ENH.LIZ()) {
            booleanValue = true;
        } else {
            Object LIZJ = C0F0.LIZIZ().LIZJ(Boolean.TRUE, "following_inbox_bubble_enable");
            o.LJIIIIZZ(LIZJ, "get()\n                .g…box_bubble_enable\", true)");
            booleanValue = ((Boolean) LIZJ).booleanValue();
        }
        boolean z2 = false;
        if (booleanValue && ((i = this.i0) == 1 || i == 10 || i == 11)) {
            int i2 = ((FollowLiveBubbleConfig) LVL.LJLJI.getValue()).expGroup;
            if (2 > i2 || i2 >= 4) {
                z = false;
            }
            z2 = z;
        }
        NoticeList LIZ2 = NotificationApi.LIZ(this.i0, C35363DuJ.LIZ(), z2, C53432Ky4.LJ());
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("fetch end ");
        LogPbBean logPb = LIZ2.getLogPb();
        if (logPb != null) {
            str = logPb.getImprId();
        } else {
            str = null;
        }
        b0.LJFF(LIZ3, str, LIZ3, "NCManager");
        MS5.LJI(new AqS106S0101000_6(LIZ2, this.i0, 2));
        PreloadManager.LIZJ(LIZ2, this.i0);
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AqS44S0001000_6 aqS44S0001000_6) {
        aqS44S0001000_6.invoke$0();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS44S0001000_6 aqS44S0001000_6) {
        Paint paint = new Paint(1);
        paint.setColor(aqS44S0001000_6.i0);
        return paint;
    }

    public static final Object invoke$2(AqS44S0001000_6 aqS44S0001000_6) {
        FBA.LIZJ.LIZ(aqS44S0001000_6.i0);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS44S0001000_6(int i, int i2) {
        super(0);
        this.$t = i2;
        this.i0 = i;
    }
}
