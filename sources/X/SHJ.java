package X;

import android.content.Context;
import android.os.Parcelable;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import com.ss.android.ugc.tiktok.tpsc.settings.account.GroupTitleAdapterConfigs;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SHJ implements SHK {
    public static final SHJ LIZ = new SHJ();

    @Override // X.SHK
    public final List<SLJ> LIZ(Context context, ViewModelStoreOwner viewModelStoreOwner, LifecycleOwner lifecycleOwner, Parcelable parcelable, SKL skl) {
        o.LJIIIZ(viewModelStoreOwner, "viewModelStoreOwner");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        if (!(parcelable instanceof GroupTitleAdapterConfigs)) {
            return C61878OQg.INSTANCE;
        }
        GroupTitleAdapterConfigs groupTitleAdapterConfigs = (GroupTitleAdapterConfigs) parcelable;
        SHM shm = new SHM(context, groupTitleAdapterConfigs);
        List<? extends SLJ> LIZ2 = SHI.LIZ(context, viewModelStoreOwner, lifecycleOwner, groupTitleAdapterConfigs.subAdapter, skl);
        shm.LJLL = LIZ2;
        return ORZ.LLIIIZ(LIZ2, C47261Igj.LJJIJ(shm));
    }
}
