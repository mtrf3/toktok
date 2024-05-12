package X;

import Y.ACListenerS33S0100000_13;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.zhiliaoapp.musically.R;
import tikcast.api.anchor_data.RealtimeLiveCenterDetailData;
import webcast.data.RealtimeLiveCenterBaseData;
import webcast.data.RealtimeLiveCenterShopData;

/* loaded from: classes14.dex */
public final class UEC extends UED {
    public final boolean LJLIL;
    public final LinearLayout LJLILLLLZI;
    public boolean LJLJI;
    public final /* synthetic */ UEF LJLJJI;

    public static String M(long j) {
        if (j < 0) {
            return "-";
        }
        if (j < 1000) {
            return String.valueOf(j);
        }
        if (j < 1000000) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(((float) Math.floor(((((float) j) * 1.0f) / 1000) * r3)) / 10);
            LIZ.append('K');
            return X1D.LIZIZ(LIZ);
        }
        if (j < 1000000000) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(((float) Math.floor(((((float) j) * 1.0f) / 1000000) * r3)) / 10);
            LIZ2.append('M');
            return X1D.LIZIZ(LIZ2);
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(((float) Math.floor(((((float) j) * 1.0f) / 1000000000) * r3)) / 10);
        LIZ3.append('B');
        return X1D.LIZIZ(LIZ3);
    }

    @Override // X.UED
    public final void L(int i) {
        Boolean bool;
        RealtimeLiveCenterDetailData realtimeLiveCenterDetailData;
        RealtimeLiveCenterShopData realtimeLiveCenterShopData;
        long j;
        RealtimeLiveCenterShopData realtimeLiveCenterShopData2;
        RealtimeLiveCenterBaseData realtimeLiveCenterBaseData;
        RealtimeLiveCenterShopData realtimeLiveCenterShopData3;
        RealtimeLiveCenterDetailData realtimeLiveCenterDetailData2 = this.LJLJJI.LJLIL.LJLJLLL;
        Boolean bool2 = null;
        if (realtimeLiveCenterDetailData2 != null && (realtimeLiveCenterShopData3 = realtimeLiveCenterDetailData2.shopInfo) != null) {
            bool = Boolean.valueOf(realtimeLiveCenterShopData3.showShopData);
        } else {
            bool = null;
        }
        boolean LJJIFFI = C29306Beo.LJJIFFI(bool);
        C29306Beo.LJJLIIIJJI(this.LJLILLLLZI, LJJIFFI);
        if (this.LJLJJI.LJLIL.LJLJJLL && LJJIFFI) {
            BZI LIZ = C28787BRn.LIZ("livesdk_tiktokec_live_center_show");
            LIZ.LJIILLIIL(this.LJLJJI.LJLIL.LJLIL);
            LIZ.LJIJJ("TEMAI", "EVENT_ORIGIN_FEATURE");
            LIZ.LJIJJ(Long.valueOf(this.LJLJJI.LJLIL.getBroadcastDuration() * 1000), "duration_after_live_take");
            LIZ.LJJIIJZLJL();
            this.LJLJJI.LJLIL.LJLJJLL = false;
        }
        if (!this.LJLJI) {
            this.LJLJI = true;
            View view = this.itemView;
            ((TextView) view.findViewById(R.id.euo).findViewById(R.id.ett)).setText(R.string.jv3);
            ((TextView) view.findViewById(R.id.ev1).findViewById(R.id.ett)).setText(R.string.jv2);
            ((TextView) view.findViewById(R.id.et8).findViewById(R.id.ett)).setText(R.string.jv1);
        }
        if (this.LJLJJI.LJLIL.getBroadcastDuration() < 180 || C29306Beo.LJJII(this.LJLJJI.LJLIL.LJLIL)) {
            return;
        }
        RealtimeLiveCenterDetailData realtimeLiveCenterDetailData3 = this.LJLJJI.LJLIL.LJLJLLL;
        if (realtimeLiveCenterDetailData3 != null && (realtimeLiveCenterBaseData = realtimeLiveCenterDetailData3.baseInfo) != null) {
            View view2 = this.itemView;
            ((TextView) view2.findViewById(R.id.evk).findViewById(R.id.ets)).setText(M(realtimeLiveCenterBaseData.liveWatchCnt));
            ((TextView) view2.findViewById(R.id.eu1).findViewById(R.id.ets)).setText(M(realtimeLiveCenterBaseData.liveNewFansUcnt));
            if (this.LJLIL) {
                ((TextView) view2.findViewById(R.id.etu).findViewById(R.id.ets)).setText(M(realtimeLiveCenterBaseData.totalScore));
                ((TextView) view2.findViewById(R.id.eu2).findViewById(R.id.ets)).setText(M(realtimeLiveCenterBaseData.liveConsumeUcnt));
            } else {
                ((TextView) view2.findViewById(R.id.ete).findViewById(R.id.ets)).setText(M(realtimeLiveCenterBaseData.liveCommentCnt));
                ((TextView) view2.findViewById(R.id.eub).findViewById(R.id.ets)).setText(M(realtimeLiveCenterBaseData.liveLikeCnt));
            }
        }
        RealtimeLiveCenterDetailData realtimeLiveCenterDetailData4 = this.LJLJJI.LJLIL.LJLJLLL;
        if (realtimeLiveCenterDetailData4 != null && (realtimeLiveCenterShopData2 = realtimeLiveCenterDetailData4.shopInfo) != null) {
            bool2 = Boolean.valueOf(realtimeLiveCenterShopData2.showShopData);
        }
        boolean LJJIFFI2 = C29306Beo.LJJIFFI(bool2);
        C29306Beo.LJJLIIIJJI(this.LJLILLLLZI, LJJIFFI2);
        if (!LJJIFFI2 || (realtimeLiveCenterDetailData = this.LJLJJI.LJLIL.LJLJLLL) == null || (realtimeLiveCenterShopData = realtimeLiveCenterDetailData.shopInfo) == null) {
            return;
        }
        View view3 = this.itemView;
        TextView textView = (TextView) view3.findViewById(R.id.euo).findViewById(R.id.ets);
        try {
            j = CastLongProtector.parseLong(realtimeLiveCenterShopData.revenueAmount);
        } catch (NumberFormatException unused) {
            j = 0;
        }
        textView.setText(M(j));
        ((TextView) view3.findViewById(R.id.ev1).findViewById(R.id.ets)).setText(M(realtimeLiveCenterShopData.unitSales));
        ((TextView) view3.findViewById(R.id.et8).findViewById(R.id.ets)).setText(M(realtimeLiveCenterShopData.buyers));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UEC(UEF uef, View view) {
        super(view);
        Boolean bool;
        RoomAuthStatus roomAuthStatus;
        this.LJLJJI = uef;
        Room LJJIJLIJ = C29306Beo.LJJIJLIJ(uef.LJLIL.LJLIL);
        if (LJJIJLIJ != null && (roomAuthStatus = LJJIJLIJ.getRoomAuthStatus()) != null) {
            bool = Boolean.valueOf(roomAuthStatus.enableGift);
        } else {
            bool = null;
        }
        boolean LJJIFFI = C29306Beo.LJJIFFI(bool);
        this.LJLIL = LJJIFFI;
        this.LJLILLLLZI = (LinearLayout) view.findViewById(R.id.jy3);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.leftMargin = C15380j0.LIZ(16.0f);
        marginLayoutParams.rightMargin = C15380j0.LIZ(16.0f);
        marginLayoutParams.topMargin = C15380j0.LIZ(34.0f);
        view.setLayoutParams(marginLayoutParams);
        ((TextView) view.findViewById(R.id.evk).findViewById(R.id.ett)).setText(R.string.mpv);
        ((TextView) view.findViewById(R.id.eu1).findViewById(R.id.ett)).setText(R.string.mps);
        if (LJJIFFI) {
            ((TextView) view.findViewById(R.id.etu).findViewById(R.id.ett)).setText(R.string.mpr);
            C1Q4 LIZLLL = C259910h.LIZLLL(R.attr.atw, view.getContext());
            if (LIZLLL != null) {
                LIZLLL.setBounds(C15380j0.LIZ(10.0f), 0, C15380j0.LIZ(24.0f), C15380j0.LIZ(14.0f));
                LIZLLL.setTint(C15380j0.LIZIZ(R.color.abg));
            } else {
                LIZLLL = null;
            }
            ((AppCompatTextView) view.findViewById(R.id.etu).findViewById(R.id.ett)).setCompoundDrawablesRelative(null, null, LIZLLL, null);
            C16880lQ.LJJIIZ((C47121t6) view.findViewById(R.id.etu).findViewById(R.id.ett), new ACListenerS33S0100000_13(this, 61));
            ((TextView) view.findViewById(R.id.eu2).findViewById(R.id.ett)).setText(R.string.mpt);
            C29306Beo.LJI(view.findViewById(R.id.ete));
            C29306Beo.LJI(view.findViewById(R.id.eub));
            return;
        }
        ((TextView) view.findViewById(R.id.ete).findViewById(R.id.ett)).setText(R.string.mpq);
        ((TextView) view.findViewById(R.id.eub).findViewById(R.id.ett)).setText(R.string.mpu);
        C29306Beo.LJI(view.findViewById(R.id.etu));
        C29306Beo.LJI(view.findViewById(R.id.eu2));
    }
}
