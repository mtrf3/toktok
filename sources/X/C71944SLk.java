package X;

import Y.AObserverS80S0100000_12;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.tiktok.tpsc.settings.account.PrivacySettingsAdapterConfigs;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.collection.MusicCollectionViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.SLk, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71944SLk extends SN1<MusicCollectionViewModel> {
    @Override // X.SN1
    public final String LLIIII() {
        return "favorite_music";
    }

    @Override // X.SN1
    public final void LLIIIL(int i) {
        String str;
        String str2 = ((MusicCollectionViewModel) this.LJLL).LJLJL;
        C72028SOq LIZ = C0N3.LIZ(C71909SKb.LIZ);
        C71969SMj c71969SMj = new C71969SMj();
        c71969SMj.LIZIZ("enter_from", str2);
        if (i == 1) {
            str = "on";
        } else {
            str = "off";
        }
        c71969SMj.LIZIZ("to_status", str);
        java.util.Map<String, String> map = c71969SMj.LIZ;
        C07250Qf.LIZLLL(map, "EventMapBuilder()\n      …               .builder()", LIZ, "change_favorite_sound_status", map);
        super.LLIIIL(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71944SLk(MusicCollectionViewModel viewModel, Context context, LifecycleOwner lifecycleOwner, PrivacySettingsAdapterConfigs configs, SKL toastHolder) {
        super(viewModel, context, toastHolder);
        o.LJIIIZ(viewModel, "viewModel");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(configs, "configs");
        o.LJIIIZ(toastHolder, "toastHolder");
        SL3 sl3 = new SL3();
        sl3.LJIILLIIL = 1;
        sl3.LJIIZILJ = 2;
        LLIFFJFJJ(sl3, 1, false);
        AbstractC71913SKf.LIZJ(sl3, R.string.cir);
        sl3.LJ = Integer.valueOf(R.string.ciq);
        LJLLLLLL(sl3.LIZ());
        viewModel.LJLJI.observe(lifecycleOwner, new AObserverS80S0100000_12(this, 166));
        viewModel.LJLJJI.observe(lifecycleOwner, new AObserverS80S0100000_12(this, 167));
    }
}
