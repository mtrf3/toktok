package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.rss.link.models.RssLinkParam;
import com.ss.android.ugc.aweme.rss.link.viewmodel.RssLinkViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.AEo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25902AEo implements ViewModelProvider.Factory {
    public final RssLinkParam LIZ;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, C0VK c0vk) {
        return C09L.LIZIZ(this, cls, c0vk);
    }

    public C25902AEo(RssLinkParam rssLinkParam) {
        o.LJIIIZ(rssLinkParam, "rssLinkParam");
        this.LIZ = rssLinkParam;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        return new RssLinkViewModel(this.LIZ, AJY.LIZIZ);
    }
}
