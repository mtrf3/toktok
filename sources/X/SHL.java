package X;

import android.content.Context;
import android.os.Parcelable;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.batchdelete.BatchDeleteAdapterConfigs;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SHL implements SHG {
    public static final SHL LIZ = new SHL();

    @Override // X.SHG
    public final SLJ LIZ(Context context, ViewModelStoreOwner viewModelStoreOwner, LifecycleOwner lifecycleOwner, Parcelable parcelable, SKL skl) {
        o.LJIIIZ(viewModelStoreOwner, "viewModelStoreOwner");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        if (!(parcelable instanceof BatchDeleteAdapterConfigs)) {
            return null;
        }
        return new SHN(context, (BatchDeleteAdapterConfigs) parcelable);
    }
}
