package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.ss.android.ugc.aweme.im.sdk.share.viewmodel.SharePanelImHeadViewModel;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4OM, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4OM implements ViewModelProvider.Factory {
    public final SharePackage LIZ;
    public final List<InterfaceC62225ObV> LIZIZ;
    public final C4OT LIZJ;
    public final SharePanelViewModel LIZLLL;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, C0VK c0vk) {
        return C09L.LIZIZ(this, cls, c0vk);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        return new SharePanelImHeadViewModel(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL);
    }

    public C4OM(SharePackage sharePackage, List channelList, InterfaceC108744Oo interfaceC108744Oo, SharePanelViewModel sharePanelViewModel) {
        o.LJIIIZ(channelList, "channelList");
        this.LIZ = sharePackage;
        this.LIZIZ = channelList;
        this.LIZJ = interfaceC108744Oo;
        this.LIZLLL = sharePanelViewModel;
    }
}
