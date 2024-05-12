package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.relation.auth.widget.contact.ContactMaFWidgetVM;
import com.ss.android.ugc.aweme.rss.feed.models.RssFeedParam;
import com.ss.android.ugc.aweme.rss.feed.viewmodel.RssFeedViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Okh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62795Okh implements ViewModelProvider.Factory {
    public final /* synthetic */ int LIZ = 0;
    public final Object LIZIZ;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, C0VK c0vk) {
        switch (this.LIZ) {
            case 0:
                return C09L.LIZIZ(this, cls, c0vk);
            default:
                return C09L.LIZIZ(this, cls, c0vk);
        }
    }

    public C62795Okh(P1U config) {
        o.LJIIIZ(config, "config");
        this.LIZIZ = config;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final ViewModel create(Class modelClass) {
        switch (this.LIZ) {
            case 0:
                o.LJIIIZ(modelClass, "modelClass");
                return new ContactMaFWidgetVM((P1U) this.LIZIZ);
            default:
                o.LJIIIZ(modelClass, "modelClass");
                return new RssFeedViewModel((RssFeedParam) this.LIZIZ, AJY.LIZIZ);
        }
    }

    public C62795Okh(RssFeedParam rssFeedParam) {
        o.LJIIIZ(rssFeedParam, "rssFeedParam");
        this.LIZIZ = rssFeedParam;
    }
}
