package com.ss.android.ugc.aweme.relation.usercard.impl.cell;

import X.ActivityC45651qj;
import X.C26338AVi;
import X.C27484AqW;
import X.C32151Nz;
import X.C57826Mmk;
import X.C57846Mn4;
import X.C76800UCe;
import X.C84193Sd;
import X.C9AC;
import X.C9AE;
import X.EnumC53695L5n;
import X.FT5;
import X.O6R;
import X.X1D;
import android.app.Activity;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.tux.tag.TuxTag;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.ss.android.ugc.aweme.relation.model.RecUser;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS172S0200000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class RectRecUserCell<ITEM extends C57826Mmk> extends BaseRectRecUserCell<C57826Mmk> {
    public TuxTag LJLJJLL;

    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.BaseRectRecUserCell, com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell
    public int V() {
        return R.layout.cai;
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.cell.BasePowerCell, com.bytedance.ies.powerlist.PowerCell
    public void onItemViewCreated() {
        super.onItemViewCreated();
        View findViewById = this.itemView.findViewById(R.id.n7b);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.video_reason)");
        this.LJLJJLL = (TuxTag) findViewById;
        C9AE.LIZ(this.itemView, C9AC.LIGHT_MASK, 0.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell
    public final void i0(C57846Mn4 uiConfig, C57826Mmk item) {
        ActivityC45651qj activityC45651qj;
        o.LJIIIZ(uiConfig, "uiConfig");
        o.LJIIIZ(item, "item");
        super.i0(uiConfig, item);
        if (uiConfig.LJJII) {
            Activity LIZ = FT5.LIZ(this.itemView, "itemView.context");
            Fragment fragment = null;
            if ((LIZ instanceof ActivityC45651qj) && (activityC45651qj = (ActivityC45651qj) LIZ) != null) {
                fragment = C84193Sd.LIZ(activityC45651qj).gv0();
            }
            ((RelationButton) this.itemView.findViewById(R.id.iu_)).setRequestListener(new AqS172S0200000_9((RectRecUserCell) this, fragment, (Fragment) 4));
        }
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.BaseRectRecUserCell, com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell
    public final void l0(RecUser user, C57846Mn4 uiConfig) {
        String videoItemReason;
        o.LJIIIZ(uiConfig, "uiConfig");
        o.LJIIIZ(user, "user");
        super.l0(user, uiConfig);
        MatchedFriendStruct matchedFriendStruct = user.getMatchedFriendStruct();
        if (matchedFriendStruct != null && (videoItemReason = matchedFriendStruct.getVideoItemReason()) != null && videoItemReason.length() != 0) {
            TuxTag tuxTag = this.LJLJJLL;
            if (tuxTag != null) {
                tuxTag.setText(videoItemReason);
                TuxTag tuxTag2 = this.LJLJJLL;
                if (tuxTag2 != null) {
                    tuxTag2.setVisibility(0);
                    if (C76800UCe.LIZ != null) {
                        return;
                    }
                } else {
                    o.LJIJI("videoReasonTagView");
                    throw null;
                }
            } else {
                o.LJIJI("videoReasonTagView");
                throw null;
            }
        }
        TuxTag tuxTag3 = this.LJLJJLL;
        if (tuxTag3 != null) {
            tuxTag3.setVisibility(8);
        } else {
            o.LJIJI("videoReasonTagView");
            throw null;
        }
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell
    public final void n0(RecUser user, C57846Mn4 uiConfig) {
        boolean z;
        o.LJIIIZ(uiConfig, "uiConfig");
        o.LJIIIZ(user, "user");
        boolean t0 = t0(user, uiConfig);
        if (uiConfig.LIZLLL == 201) {
            z = true;
        } else {
            z = false;
        }
        View button = this.itemView.findViewById(R.id.iu_);
        int i = uiConfig.LJ;
        if (i != 501) {
            if (i == 502) {
                o.LJIIIIZZ(button, "button");
                C27484AqW.LJI(button, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(80))), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(28))));
            }
        } else if (!z || t0) {
            o.LJIIIIZZ(button, "button");
            C27484AqW.LJI(button, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(88))), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(28))));
        } else {
            o.LJIIIIZZ(button, "button");
            C27484AqW.LJI(button, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(LiveTryModeCountDownThresholdSetting.DEFAULT)))), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(28))));
        }
        switch (uiConfig.LIZ) {
            case 100:
                AbsRecUserCell.f0(s0(), O6R.LJJIIZ(C32151Nz.LJIIZILJ(48)));
                int v0 = v0(O6R.LJJIIZ(C32151Nz.LJIIZILJ(56)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(48)));
                C27484AqW.LJI(getSocPubAvatarFrameLayout(), Integer.valueOf(v0), Integer.valueOf(v0));
                return;
            case 101:
            case 102:
                AbsRecUserCell.f0(s0(), O6R.LJJIIZ(C32151Nz.LJIIZILJ(56)));
                int v02 = v0(O6R.LJJIIZ(C32151Nz.LJIIZILJ(64)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(56)));
                C27484AqW.LJI(getSocPubAvatarFrameLayout(), Integer.valueOf(v02), Integer.valueOf(v02));
                return;
            case 103:
            case 104:
                AbsRecUserCell.f0(s0(), O6R.LJJIIZ(C32151Nz.LJIIZILJ(36)));
                int v03 = v0(O6R.LJJIIZ(C32151Nz.LJIIZILJ(44)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(36)));
                C27484AqW.LJI(getSocPubAvatarFrameLayout(), Integer.valueOf(v03), Integer.valueOf(v03));
                return;
            default:
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("not supported current variant: ");
                LIZ.append(uiConfig.LIZ);
                throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
        }
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.BaseRectRecUserCell, com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell
    public void o0(RecUser user, C57846Mn4 uiConfig) {
        o.LJIIIZ(uiConfig, "uiConfig");
        o.LJIIIZ(user, "user");
        switch (uiConfig.LIZ) {
            case 100:
                View findViewById = this.itemView.findViewById(R.id.kdm);
                o.LJIIIIZZ(findViewById, "itemView.start_space");
                C27484AqW.LJII(findViewById, Integer.valueOf(v0(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)))), null, 2);
                View itemView = this.itemView;
                o.LJIIIIZZ(itemView, "itemView");
                C26338AVi.LJIIIZ(itemView, null, Integer.valueOf(uiConfig.LJIIJJI), null, Integer.valueOf(uiConfig.LJIIJJI), 21);
                View findViewById2 = this.itemView.findViewById(R.id.gj9);
                o.LJIIIIZZ(findViewById2, "itemView.middle_area_layout");
                C26338AVi.LJIIIZ(findViewById2, Integer.valueOf(v0(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)))), null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12))), null, 26);
                return;
            case 101:
                View findViewById3 = this.itemView.findViewById(R.id.kdm);
                o.LJIIIIZZ(findViewById3, "itemView.start_space");
                C27484AqW.LJII(findViewById3, Integer.valueOf(v0(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)))), null, 2);
                View itemView2 = this.itemView;
                o.LJIIIIZZ(itemView2, "itemView");
                C26338AVi.LJIIIZ(itemView2, 0, Integer.valueOf(uiConfig.LJIIJJI), 0, Integer.valueOf(uiConfig.LJIIJJI), 16);
                View findViewById4 = this.itemView.findViewById(R.id.gj9);
                o.LJIIIIZZ(findViewById4, "itemView.middle_area_layout");
                C26338AVi.LJIIIZ(findViewById4, Integer.valueOf(v0(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)))), null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12))), null, 26);
                return;
            case 102:
            default:
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("not supported current variant: ");
                LIZ.append(uiConfig.LIZ);
                throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
            case 103:
            case 104:
                View findViewById5 = this.itemView.findViewById(R.id.kdm);
                o.LJIIIIZZ(findViewById5, "itemView.start_space");
                C27484AqW.LJII(findViewById5, Integer.valueOf(v0(O6R.LJJIIZ(C32151Nz.LJIIZILJ(6)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(10)))), null, 2);
                View itemView3 = this.itemView;
                o.LJIIIIZZ(itemView3, "itemView");
                C26338AVi.LJIIIZ(itemView3, null, Integer.valueOf(uiConfig.LJIIJJI), null, Integer.valueOf(uiConfig.LJIIJJI), 21);
                View findViewById6 = this.itemView.findViewById(R.id.gj9);
                o.LJIIIIZZ(findViewById6, "itemView.middle_area_layout");
                C26338AVi.LJIIIZ(findViewById6, Integer.valueOf(v0(O6R.LJJIIZ(C32151Nz.LJIIZILJ(4)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)))), null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(6))), null, 26);
                return;
        }
    }

    public final int v0(int i, int i2) {
        if (getSocPubAvatarFrameLayout().getMode() == EnumC53695L5n.NONE) {
            return i2;
        }
        return i;
    }
}
