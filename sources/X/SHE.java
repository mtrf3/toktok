package X;

import android.content.Context;
import android.os.Parcelable;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import com.ss.android.ugc.tiktok.tpsc.settings.account.DisclosureAdapterConfigs;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SHE implements SHG {
    public static final SHE LIZ = new SHE();

    @Override // X.SHG
    public final SLJ LIZ(Context context, ViewModelStoreOwner viewModelStoreOwner, LifecycleOwner lifecycleOwner, Parcelable parcelable, SKL skl) {
        o.LJIIIZ(viewModelStoreOwner, "viewModelStoreOwner");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        if (!(parcelable instanceof DisclosureAdapterConfigs)) {
            return null;
        }
        return new SHF((DisclosureAdapterConfigs) parcelable, context);
    }
}
