package X;

import Y.AObserverS75S0200000_12;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.tiktok.tpsc.data.effectcount.InteractionVideoCount;
import com.ss.android.ugc.tiktok.tpsc.data.effectcount.VideoCount;
import com.ss.android.ugc.tiktok.tpsc.settings.account.PrivacySettingsAdapterConfigs;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.comment.CommentViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS159S0200000_12;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SME extends SN1<CommentViewModel> {
    public Integer LJLLJ;

    @Override // X.SN1
    public final String LLIIII() {
        return "comment";
    }

    public static final SKZ LLIIIZ(InterfaceC65784Pro<Boolean> interfaceC65784Pro) {
        VideoCount videoCount;
        C71909SKb.LIZ.getClass();
        SKK LIZLLL = C71909SKb.LIZLLL();
        C72041SPd.LIZ.getClass();
        InteractionVideoCount LIZLLL2 = C72041SPd.LIZLLL();
        if (LIZLLL2 != null) {
            videoCount = LIZLLL2.comment;
        } else {
            videoCount = null;
        }
        return LIZLLL.LJFF(interfaceC65784Pro, videoCount, R.string.b5y, R.plurals.a5, R.plurals.a6);
    }

    @Override // X.SN1
    public final void LLIIIL(int i) {
        String str;
        super.LLIIIL(i);
        C71969SMj c71969SMj = new C71969SMj();
        c71969SMj.LIZIZ("enter_from", "privacy_and_safety_settings");
        if (i != 0) {
            if (i != 1) {
                if (i != 3) {
                    str = "";
                } else {
                    str = "no one";
                }
            } else {
                str = "friends";
            }
        } else {
            str = "public";
        }
        C71909SKb.LIZ.getClass();
        C72028SOq LIZ = C71909SKb.LIZJ().LIZ();
        c71969SMj.LIZIZ("to_status", str);
        java.util.Map<String, String> map = c71969SMj.LIZ;
        C07250Qf.LIZLLL(map, "eventMapBuilder.appendPa…S, statusLabel).builder()", LIZ, "disable_account_comment", map);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SME(CommentViewModel viewModel, Context context, LifecycleOwner lifecycleOwner, PrivacySettingsAdapterConfigs configs, SKL toastHolder) {
        super(viewModel, context, toastHolder);
        int i;
        int i2;
        int i3;
        Integer valueOf;
        o.LJIIIZ(viewModel, "viewModel");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(configs, "configs");
        o.LJIIIZ(toastHolder, "toastHolder");
        this.LJLLJ = viewModel.LJLJI.getValue();
        C71909SKb.LIZ.getClass();
        C71909SKb.LIZJ().LIZ();
        if (C72028SOq.LJIIL()) {
            i = R.string.twk;
        } else {
            i = R.string.p9g;
        }
        LJLLLLLL(C78966Uyw.LJI(i));
        SL4 sl4 = new SL4();
        sl4.LJIILLIIL = 0;
        LLIFFJFJJ(sl4, 0, false);
        if (C78966Uyw.LJJIJL()) {
            i2 = R.string.jdc;
        } else {
            i2 = R.string.blo;
        }
        AbstractC71913SKf.LIZJ(sl4, i2);
        LJLLLLLL(sl4.LIZ());
        LJLLLLLL(LLIIIZ(new AqS162S0100000_12(this, 3)));
        C71909SKb.LIZJ().LIZ();
        boolean LJIIZILJ = C72028SOq.LJIIZILJ();
        SL4 sl42 = new SL4();
        sl42.LJIILLIIL = 1;
        LLIFFJFJJ(sl42, 1, false);
        if (LJIIZILJ) {
            i3 = R.string.gnw;
        } else {
            i3 = R.string.jbq;
        }
        AbstractC71913SKf.LIZJ(sl42, i3);
        if (LJIIZILJ) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(R.string.gna);
        }
        sl42.LJ = valueOf;
        LJLLLLLL(sl42.LIZ());
        LJLLLLLL(LLIIIZ(new AqS162S0100000_12(this, 4)));
        SL4 sl43 = new SL4();
        sl43.LJIILLIIL = 3;
        LLIFFJFJJ(sl43, 3, false);
        AbstractC71913SKf.LIZJ(sl43, R.string.p9_);
        sl43.LJI = new AqS159S0200000_12(this, context, 1);
        LJLLLLLL(sl43.LIZ());
        viewModel.LJLJI.observe(lifecycleOwner, new AObserverS75S0200000_12(lifecycleOwner, this, 1));
        viewModel.LJLJJI.observe(lifecycleOwner, new AObserverS75S0200000_12(this, viewModel, 2));
    }
}
