package X;

import Y.AObserverS80S0100000_12;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsAgreementRecord;
import com.ss.android.ugc.tiktok.tpsc.settings.account.PrivacySettingsAdapterConfigs;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.chat.chat.ChatViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS99S0101000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SND extends SN1<ChatViewModel> {
    @Override // X.SN1
    public final String LLIIII() {
        return "chatsets";
    }

    @Override // X.SN1
    public final boolean LLIIIJ(int i) {
        if (i != 1) {
            C72041SPd.LIZ.getClass();
            PrivacySettingsAgreementRecord LIZIZ = C72041SPd.LIZIZ("advertiser_update_dm_consent");
            if (LIZIZ != null && LIZIZ.status == 1) {
                C26227ARb c26227ARb = new C26227ARb(this.LJLIL);
                c26227ARb.LJ(R.string.eih);
                c26227ARb.LIZ(R.string.eig);
                UC0.LIZJ(c26227ARb, new AqS99S0101000_12(this, i, 26));
                c26227ARb.LJI().LIZLLL();
                C72043SPf.LIZIZ(2, "advertiser_update_dm_consent");
                C72039SPb.LJFF(2, "advertiser_update_dm_consent");
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SND(ChatViewModel viewModel, Context context, LifecycleOwner lifecycleOwner, PrivacySettingsAdapterConfigs configs, SKL toastHolder) {
        super(viewModel, context, toastHolder);
        int i;
        int i2;
        int i3;
        Integer num;
        o.LJIIIZ(viewModel, "viewModel");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(configs, "configs");
        o.LJIIIZ(toastHolder, "toastHolder");
        LJLLLLLL(C78966Uyw.LJI(R.string.p9i));
        SL4 sl4 = new SL4();
        sl4.LJIILLIIL = 1;
        LLIFFJFJJ(sl4, 1, false);
        AbstractC71913SKf.LIZJ(sl4, R.string.eol);
        sl4.LJ = Integer.valueOf(R.string.eok);
        LJLLLLLL(sl4.LIZ());
        SL4 sl42 = new SL4();
        sl42.LJIILLIIL = 4;
        LLIFFJFJJ(sl42, 4, false);
        AbstractC71913SKf.LIZJ(sl42, R.string.eoq);
        C71909SKb.LIZ.getClass();
        C71909SKb.LIZJ().LIZ();
        if (C72028SOq.LJII()) {
            i = R.string.elg;
        } else {
            i = R.string.eor;
        }
        sl42.LJ = Integer.valueOf(i);
        LJLLLLLL(sl42.LIZ());
        C71909SKb.LIZJ().LIZ();
        boolean LJIIZILJ = C72028SOq.LJIIZILJ();
        SL4 sl43 = new SL4();
        sl43.LJIILLIIL = 2;
        LLIFFJFJJ(sl43, 2, false);
        C71909SKb.LIZJ().LIZ();
        if (C72028SOq.LJII()) {
            i2 = R.string.elf;
        } else if (LJIIZILJ) {
            i2 = R.string.gnx;
        } else {
            i2 = R.string.jbq;
        }
        AbstractC71913SKf.LIZJ(sl43, i2);
        C71909SKb.LIZJ().LIZ();
        if (C72028SOq.LJII()) {
            i3 = R.string.gnw;
        } else {
            if (LJIIZILJ) {
                num = null;
                sl43.LJ = num;
                LJLLLLLL(sl43.LIZ());
                SL4 sl44 = new SL4();
                sl44.LJIILLIIL = 3;
                LLIFFJFJJ(sl44, 3, false);
                AbstractC71913SKf.LIZJ(sl44, R.string.eoo);
                sl44.LJ = Integer.valueOf(R.string.eop);
                LJLLLLLL(sl44.LIZ());
                viewModel.LJLJI.observe(lifecycleOwner, new AObserverS80S0100000_12(this, 127));
                viewModel.LJLJJI.observe(lifecycleOwner, new AObserverS80S0100000_12(this, 128));
            }
            i3 = R.string.enj;
        }
        num = Integer.valueOf(i3);
        sl43.LJ = num;
        LJLLLLLL(sl43.LIZ());
        SL4 sl442 = new SL4();
        sl442.LJIILLIIL = 3;
        LLIFFJFJJ(sl442, 3, false);
        AbstractC71913SKf.LIZJ(sl442, R.string.eoo);
        sl442.LJ = Integer.valueOf(R.string.eop);
        LJLLLLLL(sl442.LIZ());
        viewModel.LJLJI.observe(lifecycleOwner, new AObserverS80S0100000_12(this, 127));
        viewModel.LJLJJI.observe(lifecycleOwner, new AObserverS80S0100000_12(this, 128));
    }
}
