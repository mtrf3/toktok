package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.rank.impl.list.RankListDialog;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.rank.model.RankTabInfo;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.UiG, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77932UiG implements InterfaceC80659Vl9 {
    public final /* synthetic */ RankListDialog LIZ;

    @Override // X.InterfaceC80659Vl9
    public final void LIZ() {
    }

    public C77932UiG(RankListDialog rankListDialog) {
        this.LIZ = rankListDialog;
    }

    @Override // X.InterfaceC80659Vl9
    public final void LIZIZ(C80654Vl4 c80654Vl4) {
        TextView textView;
        W5G w5g;
        int i;
        if (c80654Vl4 != null) {
            View view = c80654Vl4.LJ;
            if (view != null && (w5g = (W5G) view.findViewById(R.id.e_q)) != null) {
                RankListDialog rankListDialog = this.LIZ;
                int i2 = 0;
                w5g.setVisibility(0);
                int i3 = CZ5.LIZ[rankListDialog.wl().LIZIZ().LJLJJI.ordinal()];
                boolean z = true;
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            w5g.setVisibility(8);
                        } else {
                            CZ2 cz2 = rankListDialog.LJLJL;
                            if (cz2 != null) {
                                i = ((RankTabInfo) ListProtector.get(cz2.LJLJL, c80654Vl4.LIZLLL)).rankType;
                            } else {
                                i = 0;
                            }
                            CZ2 cz22 = rankListDialog.LJLJL;
                            if (cz22 != null) {
                                i2 = ((RankTabInfo) ListProtector.get(cz22.LJLJL, c80654Vl4.LIZLLL)).LJLILLLLZI;
                            }
                            RankTypeV2 LIZ = BPN.LIZ(i, i2);
                            if (!o.LJ(LIZ, RankTypeV2.LIZJ)) {
                                z = o.LJ(LIZ, RankTypeV2.LJIIJJI);
                            }
                            if (z) {
                                C15490jB.LJ(w5g, CFX.LIZ("tiktok_live_basic_resource", "tiktok_live_revenue_demand_1"), "ttlive_rank_tab_weekly_rookie_rank.png");
                            } else {
                                C15490jB.LJ(w5g, CFX.LIZ("tiktok_live_basic_resource", "tiktok_live_revenue_normal_1"), "ttlive_rank_tab_weekly_rank.png");
                            }
                        }
                    } else {
                        w5g.setImageResource(R.drawable.d_w);
                    }
                } else {
                    w5g.setImageResource(R.drawable.d_x);
                }
            }
            View view2 = c80654Vl4.LJ;
            if (view2 != null && (textView = (TextView) view2.findViewById(android.R.id.text1)) != null) {
                textView.setTextColor(C04330Ez.LIZIZ(textView.getContext(), R.color.ck));
                if (C30922CBq.LIZIZ) {
                    textView.setTag("Selected");
                }
            }
        }
    }

    @Override // X.InterfaceC80659Vl9
    public final void LIZJ(C80654Vl4 c80654Vl4) {
        TextView textView;
        ImageView imageView;
        View view = c80654Vl4.LJ;
        if (view != null && (imageView = (ImageView) view.findViewById(R.id.e_q)) != null) {
            imageView.setVisibility(8);
        }
        View view2 = c80654Vl4.LJ;
        if (view2 != null && (textView = (TextView) view2.findViewById(android.R.id.text1)) != null) {
            textView.setTextColor(C04330Ez.LIZIZ(textView.getContext(), R.color.cv));
            if (C30922CBq.LIZIZ) {
                textView.setTag("Unselected");
            }
        }
    }
}
