package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.performance.RankOptimizeSetting;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.Uio, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77966Uio extends CZA<C77988UjA, C77973Uiv> {
    public final DataChannel LIZLLL;
    public final int LJ;
    public final InterfaceC65784Pro<Object> LJFF;

    @Override // X.CZA, X.AbstractC31414CUo
    public final void LJFF(RecyclerView.ViewHolder viewHolder) {
        C77973Uiv holder = (C77973Uiv) viewHolder;
        o.LJIIIZ(holder, "holder");
        super.LJFF(holder);
        if (RankOptimizeSetting.INSTANCE.getValue()) {
            CountDownTimerC77998UjK countDownTimerC77998UjK = holder.LJLJJLL;
            if (countDownTimerC77998UjK != null) {
                countDownTimerC77998UjK.cancel();
            }
            CountDownTimerC77998UjK countDownTimerC77998UjK2 = holder.LJLJJLL;
            if (countDownTimerC77998UjK2 == null) {
                return;
            }
            countDownTimerC77998UjK2.LIZ = null;
        }
    }

    @Override // X.CZA, X.AbstractC31414CUo
    public final void LIZ(RecyclerView.ViewHolder viewHolder, Object obj) {
        int i;
        C77973Uiv holder = (C77973Uiv) viewHolder;
        C77988UjA data = (C77988UjA) obj;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(data, "data");
        int i2 = this.LJ;
        InterfaceC65784Pro<Object> callback = this.LJFF;
        o.LJIIIZ(callback, "callback");
        Text text = null;
        if (holder.LJLJJI != i2) {
            holder.LJLJJI = i2;
            C77993UjF c77993UjF = new C77993UjF(holder, callback);
            holder.LJLJJL = data.LIZJ;
            CountDownTimerC77998UjK countDownTimerC77998UjK = holder.LJLJJLL;
            if (countDownTimerC77998UjK != null) {
                countDownTimerC77998UjK.cancel();
            }
            CountDownTimerC77998UjK countDownTimerC77998UjK2 = holder.LJLJJLL;
            if (countDownTimerC77998UjK2 != null) {
                countDownTimerC77998UjK2.LIZ = null;
            }
            CountDownTimerC77998UjK countDownTimerC77998UjK3 = new CountDownTimerC77998UjK(holder.LJLJJL * 1000);
            countDownTimerC77998UjK3.start();
            countDownTimerC77998UjK3.LIZ = c77993UjF;
            holder.LJLJJLL = countDownTimerC77998UjK3;
        }
        int i3 = data.LJ;
        if (i3 != 1) {
            if (i3 != 2) {
                C15490jB.LJ(holder.LJLIL, "tiktok_live_revenue_demand_1", "ttlive_icon_rank_league_stage_locked_gift.png");
            } else {
                C15490jB.LJ(holder.LJLIL, "tiktok_live_revenue_demand_1", "ttlive_icon_rank_league_stage_locked_viewer.png");
            }
        } else {
            C15490jB.LJ(holder.LJLIL, "tiktok_live_revenue_demand_1", "ttlive_icon_rank_league_stage_locked_gift.png");
        }
        holder.LJLILLLLZI.setVisibility(0);
        holder.LJLJI.setVisibility(0);
        long j = holder.LJLJJL;
        int i4 = data.LIZLLL;
        long j2 = 86400;
        long j3 = j / j2;
        long j4 = j % j2;
        long j5 = 3600;
        long j6 = j4 / j5;
        long j7 = j4 % j5;
        long j8 = 60;
        long j9 = j7 / j8;
        long j10 = j7 % j8;
        if (j3 > 0) {
            if (i4 == 2) {
                i = R.plurals.q5;
            } else {
                i = R.plurals.q2;
            }
        } else if (j6 > 0) {
            if (i4 == 2) {
                i = R.plurals.q6;
            } else {
                i = R.plurals.q3;
            }
            j3 = j6;
        } else if (j9 > 0) {
            if (i4 == 2) {
                i = R.plurals.q7;
            } else {
                i = R.plurals.q4;
            }
            j3 = j9;
        } else {
            if (i4 == 2) {
                i = R.plurals.q8;
            } else {
                i = R.plurals.q1;
            }
            j3 = j10;
        }
        TextView textView = holder.LJLILLLLZI;
        String LJII = C15380j0.LJII(i, (int) j3);
        o.LJIIIIZZ(LJII, "getQuantityString(key, num.toInt())");
        String LIZIZ = Q8U.LIZIZ(new Object[]{String.valueOf(j3)}, 1, LJII, "format(format, *args)");
        boolean z = C31512CYi.LIZIZ;
        C78934UyQ.LJJIIJZLJL(textView, LIZIZ, z);
        TextView textView2 = holder.LJLJI;
        RankListV2Response.BriefDescription briefDescription = data.LIZIZ;
        if (briefDescription != null) {
            text = briefDescription.rule;
        }
        C78934UyQ.LJJIIJZLJL(textView2, CXJ.LJFF(text, "").toString(), z);
    }

    @Override // X.CZA
    public final C77973Uiv LJI(View view, ViewGroup viewGroup) {
        Boolean bool;
        DataChannel dataChannel = this.LIZLLL;
        if ((dataChannel == null || (bool = (Boolean) dataChannel.kv0(BCW.class)) == null || bool.booleanValue()) && viewGroup != null) {
            view.getLayoutParams().height = viewGroup.getHeight();
        }
        return new C77973Uiv(view);
    }

    public C77966Uio(DataChannel dataChannel, int i, AqS163S0100000_13 aqS163S0100000_13) {
        super(R.layout.dcd, Boolean.FALSE);
        this.LIZLLL = dataChannel;
        this.LJ = i;
        this.LJFF = aqS163S0100000_13;
    }
}
