package X;

import Y.AObserverS77S0100000_9;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.commentfilter.CommentFilterModel;
import com.ss.android.ugc.tiktok.tpsc.base.BasePrivacySettingViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS159S0200000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SLA extends SN1<BasePrivacySettingViewModel> {
    @Override // X.SN1
    public final String LLIIII() {
        return "filter_spam";
    }

    @Override // X.SN1
    public final void LLIIIL(int i) {
        String str;
        super.LLIIIL(i);
        if (i == 1) {
            str = "ai_filter_on";
        } else {
            str = "ai_filter_off";
        }
        FMX.LJIIL(str, new C188727au().LIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SLA(CommentFilterModel commentFilterModel, Context context, LifecycleOwner lifecycleOwner, SKL skl) {
        super(commentFilterModel.LJLJJI, context, skl);
        Boolean bool;
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        try {
            bool = C2YJ.LIZIZ.LIZ.getEnableCommentOffensiveFilterSwitch();
        } catch (Exception unused) {
            bool = Boolean.FALSE;
        }
        SL3 sl3 = new SL3();
        sl3.LJIILLIIL = 1;
        sl3.LJIIZILJ = 2;
        AbstractC71913SKf.LIZJ(sl3, R.string.qus);
        sl3.LJ = Integer.valueOf(R.string.djy);
        sl3.LJ(this.LJLL);
        sl3.LJIILL = C53397KxV.LJLIL;
        sl3.LJIIIZ = new AqS159S0200000_12(this, context, 78);
        sl3.LJIIJ = new C53396KxU(this);
        sl3.LJIIIIZZ = new C53398KxW(this);
        sl3.LJII = new C71984SMy(this, bool);
        LJLLLLLL(sl3.LIZ());
        this.LJLL.LJLJI.observe(lifecycleOwner, new AObserverS77S0100000_9(this, 71));
        this.LJLL.LJLJJI.observe(lifecycleOwner, new AObserverS77S0100000_9(this, 72));
    }
}
