package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import kotlin.jvm.internal.o;

/* renamed from: X.Gi7, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42251Gi7 implements InterfaceC50046JkY {
    public final /* synthetic */ IAVPublishService LIZ;
    public final /* synthetic */ View LIZIZ;

    public C42251Gi7(IAVPublishService iAVPublishService, View view) {
        this.LIZ = iAVPublishService;
        this.LIZIZ = view;
    }

    @Override // X.InterfaceC50046JkY
    public final /* synthetic */ void LIZ() {
    }

    @Override // X.InterfaceC50046JkY
    public final /* synthetic */ void LIZJ() {
    }

    @Override // X.InterfaceC50046JkY
    public final void LIZIZ(boolean z) {
        if (!z) {
            IAVPublishService iAVPublishService = this.LIZ;
            Context context = this.LIZIZ.getContext();
            o.LJIIIIZZ(context, "view.context");
            iAVPublishService.removeProgress(C45804HyK.LJJIFFI(context));
        }
    }
}
