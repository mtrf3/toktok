package X;

import Y.AObserverS75S0200000_12;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.tiktok.tpsc.settings.account.PrivacySettingsAdapterConfigs;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.collection.MusicCollectionViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.SLx, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71957SLx extends AbstractC71980SMu {
    public final MusicCollectionViewModel LJLLILLLL;

    @Override // X.AbstractC71980SMu
    public final String LLII() {
        return "favorite_music";
    }

    @Override // X.AbstractC71980SMu
    public final void LLIIII() {
        C72028SOq LIZ = C0N3.LIZ(C71909SKb.LIZ);
        C71969SMj c71969SMj = new C71969SMj();
        c71969SMj.LIZIZ("enter_from", "privacy_and_safety_settings");
        java.util.Map<String, String> map = c71969SMj.LIZ;
        C07250Qf.LIZLLL(map, "EventMapBuilder()\n      …               .builder()", LIZ, "enter_favorite_sound_permission", map);
        SmartRouter.buildRoute(this.LJLIL, "aweme://privacy/setting/page?target=music_collection").open();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71957SLx(MusicCollectionViewModel viewModel, Context context, LifecycleOwner lifecycleOwner, PrivacySettingsAdapterConfigs configs, SKL toastHolder) {
        super(context, toastHolder);
        o.LJIIIZ(viewModel, "viewModel");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(configs, "configs");
        o.LJIIIZ(toastHolder, "toastHolder");
        this.LJLLILLLL = viewModel;
        SK9 sk9 = new SK9();
        AbstractC71980SMu.LLFZ(this, sk9);
        sk9.LJIILIIL = new C71958SLy(this);
        AbstractC71913SKf.LIZJ(sk9, R.string.gak);
        sk9.LIZIZ(R.raw.icon_bookmark_fill);
        SKZ LIZ = sk9.LIZ();
        LJLLLLLL(LIZ);
        viewModel.LJLJI.observe(lifecycleOwner, new AObserverS75S0200000_12(this, LIZ, 50));
    }
}
