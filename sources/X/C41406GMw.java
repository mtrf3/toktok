package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.services.external.ability.IOpenPhotoNextService;
import com.ss.android.ugc.aweme.services.external.ability.IPageToFinish;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.GMw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41406GMw extends AbstractC65781Prl implements InterfaceC65784Pro<C74502wA> {
    public static final C41406GMw LJLIL = new C41406GMw();

    public C41406GMw() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2wA] */
    @Override // X.InterfaceC65784Pro
    public final C74502wA invoke() {
        return new IOpenPhotoNextService() { // from class: X.2wA
            @Override // com.ss.android.ugc.aweme.services.external.ability.IOpenPhotoNextService
            public final void gotoNextPage(ActivityC45651qj context, boolean z, Bundle bundle, List<String> paths, IPageToFinish listener) {
                o.LJIIIZ(context, "context");
                o.LJIIIZ(bundle, "bundle");
                o.LJIIIZ(paths, "paths");
                o.LJIIIZ(listener, "listener");
                context.runOnUiThread(new GL9(context, z, bundle, paths, listener));
            }
        };
    }
}
