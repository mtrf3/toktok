package X;

import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.tiktok.tpsc.base.BasePrivacySettingViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.SKz, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC71933SKz extends AbstractC71913SKf {
    public MutableLiveData<Integer> LJIILIIL;
    public MutableLiveData<Boolean> LJIILJJIL;

    public final void LJ(BasePrivacySettingViewModel viewModel) {
        o.LJIIIZ(viewModel, "viewModel");
        this.LJIILIIL = viewModel.LJLJI;
        this.LJIILJJIL = viewModel.LJLJJI;
    }
}
