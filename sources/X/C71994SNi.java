package X;

import android.content.Context;
import android.os.Parcelable;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.ss.android.ugc.aweme.compliance.privacy.sdk.ui.privateaccount.PrivateAccountConfig;
import com.ss.android.ugc.aweme.compliance.privacy.sdk.ui.privateaccount.PrivateAccountViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.SNi, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71994SNi implements SHG {
    public static final C71994SNi LIZ = new C71994SNi();

    @Override // X.SHG
    public final SLJ LIZ(Context context, ViewModelStoreOwner viewModelStoreOwner, LifecycleOwner lifecycleOwner, Parcelable parcelable, SKL skl) {
        o.LJIIIZ(viewModelStoreOwner, "viewModelStoreOwner");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        PrivateAccountViewModel privateAccountViewModel = (PrivateAccountViewModel) new ViewModelProvider(viewModelStoreOwner).get(PrivateAccountViewModel.class);
        privateAccountViewModel.getClass();
        privateAccountViewModel.LJLJJL = context;
        privateAccountViewModel.mv0(skl);
        return new C72014SOc(privateAccountViewModel, context, lifecycleOwner, (PrivateAccountConfig) parcelable, skl);
    }
}
