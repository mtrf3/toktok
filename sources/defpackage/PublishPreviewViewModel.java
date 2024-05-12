package defpackage;

import X.InterfaceC224558rb;
import X.M89;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PublishPreviewViewModel extends DataCenter {
    public static final /* synthetic */ int LJLJLJ = 0;
    public final LifecycleOwner LJLJL;

    /* loaded from: classes4.dex */
    public static final class a {
    }

    public PublishPreviewViewModel(LifecycleOwner lifecycleOwner, M89 param) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(param, "param");
        this.LJLJL = lifecycleOwner;
        this.LJLJI = lifecycleOwner;
        InterfaceC224558rb publishPreviewmanager = AVExternalServiceImpl.LIZ().publishService().getPublishPreviewmanager();
        o.LJIIIIZZ(publishPreviewmanager, "get().getService(IExtern…e().publishPreviewmanager");
        publishPreviewmanager.LIZJ("publish_preview_view_model", new n1(this));
    }
}
