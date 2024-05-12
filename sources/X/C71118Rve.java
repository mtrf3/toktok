package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.ecommercelive.business.audience.api.data.VoucherInfo;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.utils.Au2S20S0100000_12;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.IDqS436S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.Rve, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71118Rve extends AbstractC31728Ccm {
    public boolean LJLIL;
    public VoucherInfo LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public C71110RvW LJLJJL;
    public IDqS436S0100000_12 LJLJJLL;
    public AqS178S0100000_12 LJLJL;
    public AqS194S0100000_12 LJLJLJ;
    public AqS162S0100000_12 LJLJLLL;
    public AqS194S0100000_12 LJLL;
    public final InterfaceC31752CdA LJLLI;

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final InterfaceC31687Cc7 LIZ() {
        return null;
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final Animation LIZJ() {
        Context context;
        float f;
        int i;
        C71110RvW c71110RvW = this.LJLJJL;
        if (c71110RvW != null) {
            context = c71110RvW.getContext();
        } else {
            context = null;
        }
        InterfaceC31752CdA liveSlotService = this.LJLLI;
        o.LJIIIIZZ(liveSlotService, "liveSlotService");
        Rect LIZ = C71126Rvm.LIZ(context, liveSlotService);
        if (LIZ != null) {
            f = LIZ.exactCenterX();
        } else {
            f = 0.0f;
        }
        if (LIZ == null) {
            i = 1;
        } else {
            i = 0;
        }
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, i, f, 1, 1.0f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setDuration(300L);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(alphaAnimation);
        return animationSet;
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final String getScheme() {
        return null;
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final Animation LIZLLL() {
        Context context;
        float f;
        int i;
        if (this.LJLIL) {
            return C62850Ola.LIZIZ(1.0f, 0.0f, 100L);
        }
        C71110RvW c71110RvW = this.LJLJJL;
        if (c71110RvW != null) {
            context = c71110RvW.getContext();
        } else {
            context = null;
        }
        InterfaceC31752CdA liveSlotService = this.LJLLI;
        o.LJIIIIZZ(liveSlotService, "liveSlotService");
        Rect LIZ = C71126Rvm.LIZ(context, liveSlotService);
        if (LIZ != null) {
            f = LIZ.exactCenterX();
        } else {
            f = 0.0f;
        }
        if (LIZ == null) {
            i = 1;
        } else {
            i = 0;
        }
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, i, f, 1, 1.0f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setDuration(300L);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(alphaAnimation);
        return animationSet;
    }

    public C71118Rve(C48502J1u c48502J1u) {
        LiveOuterService.LJJJLL().LJJJJJL();
        this.LJLLI = C31750Cd8.LIZ;
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final View LJFF(Context context) {
        o.LJIIIZ(context, "context");
        C71110RvW c71110RvW = new C71110RvW(context, this.LJLJJLL, this.LJLJL, this.LJLL);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) context.getResources().getDimension(R.dimen.pr));
        layoutParams.gravity = 16;
        layoutParams.setMarginStart(C45804HyK.LJJI(12));
        layoutParams.bottomMargin = C45804HyK.LJJI(8);
        c71110RvW.setLayoutParams(layoutParams);
        if (this.LJLJLJ != null) {
            C16880lQ.LJIIJ(new Au2S20S0100000_12(this, 82, 42, 42), c71110RvW);
        }
        this.LJLJJL = c71110RvW;
        VoucherInfo voucherInfo = this.LJLILLLLZI;
        if (voucherInfo != null) {
            c71110RvW.LJJLL(voucherInfo, this.LJLJI, this.LJLJJI);
        }
        return c71110RvW;
    }

    @Override // X.AbstractC31728Ccm, com.bytedance.android.live.slot.IFrameSlot
    public final void LJII(String str) {
        AqS162S0100000_12 aqS162S0100000_12 = this.LJLJLLL;
        if (aqS162S0100000_12 != null) {
            aqS162S0100000_12.invoke();
        }
    }
}
