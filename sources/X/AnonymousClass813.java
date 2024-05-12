package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ui.feed.FeedPhotoSlideAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.813, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass813 implements InterfaceC59098NHi {
    public final /* synthetic */ FeedPhotoSlideAssem LIZ;
    public final /* synthetic */ Aweme LIZIZ;

    @Override // X.InterfaceC59098NHi
    public final Aweme getAweme() {
        Aweme it = this.LIZIZ;
        o.LJIIIIZZ(it, "it");
        return it;
    }

    @Override // X.InterfaceC44391HbX
    public final Context getContext() {
        Context context = this.LIZ.Y3().getContext();
        o.LJIIIIZZ(context, "contentView.context");
        return context;
    }

    public AnonymousClass813(FeedPhotoSlideAssem feedPhotoSlideAssem, Aweme aweme) {
        this.LIZ = feedPhotoSlideAssem;
        this.LIZIZ = aweme;
    }
}
