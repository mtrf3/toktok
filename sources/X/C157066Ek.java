package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.viewmodel.VideoPublishViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.6Ek, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C157066Ek extends AbstractC157016Ef {
    public final VideoPublishEditModel LJII;

    @Override // X.AbstractC157016Ef
    public final int LIZ() {
        return EnumC139485dg.SHORT_VIDEO.getScene();
    }

    @Override // X.AbstractC157016Ef
    public final boolean LJ() {
        return C5HR.LIZ();
    }

    @Override // X.AbstractC157016Ef
    public final VideoPublishEditModel LIZIZ() {
        return this.LJII;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C157066Ek(VideoPublishEditModel model, WM7 rootScene, VideoPublishViewModel viewModel) {
        super(model, rootScene, viewModel);
        o.LJIIIZ(model, "model");
        o.LJIIIZ(rootScene, "rootScene");
        o.LJIIIZ(viewModel, "viewModel");
        this.LJII = model;
    }
}
