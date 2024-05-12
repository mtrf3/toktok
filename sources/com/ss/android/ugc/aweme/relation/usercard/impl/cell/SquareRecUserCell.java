package com.ss.android.ugc.aweme.relation.usercard.impl.cell;

import X.C27484AqW;
import X.C32151Nz;
import X.C57826Mmk;
import X.C57846Mn4;
import X.C9AC;
import X.C9AE;
import X.O6R;
import X.X1D;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.relation.model.RecUser;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class SquareRecUserCell extends BaseSquareRecUserCell<C57826Mmk> {
    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell
    public final void n0(RecUser user, C57846Mn4 uiConfig) {
        o.LJIIIZ(uiConfig, "uiConfig");
        o.LJIIIZ(user, "user");
        View findViewById = this.itemView.findViewById(R.id.aop);
        o.LJII(findViewById, "null cannot be cast to non-null type com.ss.android.ugc.aweme.relation.follow.ui.RelationButton");
        View findViewById2 = this.itemView.findViewById(R.id.le3);
        o.LJII(findViewById2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView");
        SmartAvatarImageView smartAvatarImageView = (SmartAvatarImageView) findViewById2;
        switch (uiConfig.LIZ) {
            case 100:
                AbsRecUserCell.f0(smartAvatarImageView, O6R.LJJIIZ(C32151Nz.LJIIZILJ(96)));
                C27484AqW.LJI(findViewById, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(126))), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(28))));
                View itemView = this.itemView;
                o.LJIIIIZZ(itemView, "itemView");
                C27484AqW.LJI(itemView, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(150))), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(210))));
                break;
            case 101:
                AbsRecUserCell.f0(smartAvatarImageView, O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(LiveTryModeCountDownThresholdSetting.DEFAULT))));
                C27484AqW.LJI(findViewById, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(136))), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(28))));
                break;
            case 102:
            default:
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("not supported current variant: ");
                LIZ.append(uiConfig.LIZ);
                throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
            case 103:
                AbsRecUserCell.f0(smartAvatarImageView, O6R.LJJIIZ(C32151Nz.LJIIZILJ(56)));
                C27484AqW.LJI(findViewById, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(90))), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(28))));
                View itemView2 = this.itemView;
                o.LJIIIIZZ(itemView2, "itemView");
                C27484AqW.LJI(itemView2, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(144))), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(169))));
                break;
            case 104:
                AbsRecUserCell.f0(smartAvatarImageView, O6R.LJJIIZ(C32151Nz.LJIIZILJ(56)));
                C27484AqW.LJI(findViewById, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(118))), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(28))));
                View itemView3 = this.itemView;
                o.LJIIIIZZ(itemView3, "itemView");
                C27484AqW.LJI(itemView3, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(150))), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(177))));
                break;
        }
        C9AE.LIZ(this.itemView, C9AC.SCALE, 0.0f);
    }
}
