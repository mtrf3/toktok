package X;

import Y.AObserverS80S0100000_12;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.tiktok.tpsc.settings.account.PrivacySettingsAdapterConfigs;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.nearby.NearbyVisibilityViewModel;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.SLm, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71946SLm extends SN1<NearbyVisibilityViewModel> {
    public boolean LJLLJ;

    @Override // X.SN1
    public final String LLIIII() {
        return "post_to_nearby";
    }

    @Override // X.SN1, X.SLJ
    public final boolean LL() {
        if (super.LL()) {
            C71909SKb.LIZ.getClass();
            C71909SKb.LIZJ().LIZ();
            if (C72028SOq.LJIIJJI()) {
                return true;
            }
        }
        return false;
    }

    @Override // X.SLJ
    /* renamed from: LLFFF */
    public final void onViewAttachedToWindow(SKV holder) {
        String str;
        o.LJIIIZ(holder, "holder");
        super.onViewAttachedToWindow(holder);
        if (LL() && this.LJLLJ) {
            boolean z = false;
            this.LJLLJ = false;
            Integer value = this.LJLL.LJLJI.getValue();
            if (value != null && value.intValue() == 1) {
                z = true;
            }
            C72028SOq LIZ = C0N3.LIZ(C71909SKb.LIZ);
            LinkedHashMap LIZ2 = C0JU.LIZ("enter_from", "privacy_setting");
            if (z) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            LIZ2.put("is_allow", str);
            LIZ.getClass();
            FMX.LJIIL("show_nearby_visibility", LIZ2);
        }
    }

    @Override // X.SN1
    public final void LLIIIL(int i) {
        String str;
        super.LLIIIL(i);
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        C71909SKb.LIZ.getClass();
        C71909SKb.LIZJ().LIZ();
        C72028SOq.LJIILJJIL(z);
        C72028SOq LIZ = C71909SKb.LIZJ().LIZ();
        LinkedHashMap LIZ2 = C0JU.LIZ("enter_from", "privacy_setting");
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ2.put("is_allow", str);
        LIZ.getClass();
        FMX.LJIIL("toggle_nearby_visibility", LIZ2);
    }

    @Override // X.SLJ, X.AbstractC029409q
    public final /* bridge */ /* synthetic */ void onViewAttachedToWindow(SKV skv) {
        onViewAttachedToWindow(skv);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71946SLm(NearbyVisibilityViewModel viewModel, Context context, LifecycleOwner lifecycleOwner, PrivacySettingsAdapterConfigs configs, SKL toastHolder) {
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
        C71909SKb.LIZ.getClass();
        C71909SKb.LIZJ().LIZ();
        OSZ<String, CharSequence> LIZJ = C72028SOq.LIZJ(context);
        String first = LIZJ.getFirst();
        CharSequence second = LIZJ.getSecond();
        if (first != null) {
            AbstractC71913SKf.LIZLLL(sl3, first);
        }
        if (second != null) {
            sl3.LJFF = second;
        }
        LJLLLLLL(sl3.LIZ());
        viewModel.LJLJI.observe(lifecycleOwner, new AObserverS80S0100000_12(this, 57));
        viewModel.LJLJJI.observe(lifecycleOwner, new AObserverS80S0100000_12(this, 58));
        this.LJLLJ = true;
    }
}
