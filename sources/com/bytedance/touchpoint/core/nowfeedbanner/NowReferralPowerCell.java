package com.bytedance.touchpoint.core.nowfeedbanner;

import X.C221108m2;
import X.C248419oz;
import X.C29701Eo;
import X.C59042Tk;
import X.C62822Ol8;
import X.InterfaceC55100Ljs;
import X.InterfaceC55235Lm3;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.ext_power_list.AssemPowerCell;
import com.bytedance.tux.input.TuxTextView;
import kotlin.jvm.internal.AqS154S0100000_4;

/* loaded from: classes5.dex */
public final class NowReferralPowerCell extends AssemPowerCell<NowReferralAssem, C59042Tk> implements InterfaceC55100Ljs {
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(C248419oz.LJLIL);
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(new AqS154S0100000_4(this, 25));
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 26));
    public NowReferralAssem LJLL;

    @Override // com.bytedance.ext_power_list.AssemPowerCell, X.InterfaceC55100Ljs
    public final InterfaceC55235Lm3 getParentScope() {
        return (InterfaceC55235Lm3) this.LJLJLJ.getValue();
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell, X.InterfaceC55100Ljs
    public final ViewModelStoreOwner getViewModelStoreOwner() {
        return (ViewModelStoreOwner) this.LJLJLLL.getValue();
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final NowReferralAssem L() {
        NowReferralAssem nowReferralAssem = new NowReferralAssem();
        this.LJLL = nowReferralAssem;
        return nowReferralAssem;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        RelativeLayout relativeLayout;
        super.onViewAttachedToWindow();
        NowReferralAssem nowReferralAssem = this.LJLL;
        if (nowReferralAssem != null && (relativeLayout = nowReferralAssem.LLFF) != null) {
            relativeLayout.setVisibility(0);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        NowReferralAssem nowReferralAssem = this.LJLL;
        if (nowReferralAssem != null) {
            C29701Eo c29701Eo = nowReferralAssem.LLFZ;
            if (c29701Eo != null) {
                c29701Eo.cancelAnimation();
            }
            C29701Eo c29701Eo2 = nowReferralAssem.LLFZ;
            if (c29701Eo2 != null) {
                c29701Eo2.clearAnimation();
            }
            RelativeLayout relativeLayout = nowReferralAssem.LLFF;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(8);
            }
            TuxTextView tuxTextView = nowReferralAssem.LLFFF;
            if (tuxTextView != null) {
                tuxTextView.setVisibility(4);
            }
            TuxTextView tuxTextView2 = nowReferralAssem.LLFII;
            if (tuxTextView2 != null) {
                tuxTextView2.setVisibility(4);
            }
            FrameLayout frameLayout = nowReferralAssem.LLI;
            if (frameLayout != null) {
                frameLayout.setVisibility(4);
            }
        }
    }
}
