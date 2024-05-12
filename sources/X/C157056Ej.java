package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.viewmodel.VideoPublishViewModel;
import defpackage.e1;
import kotlin.jvm.internal.o;

/* renamed from: X.6Ej, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C157056Ej extends AbstractC157016Ef {
    public final VideoPublishEditModel LJII;

    @Override // X.AbstractC157016Ef
    public final boolean LJ() {
        return e1.LIZ(31744, "enable_long_video_audio_copyright_detection", true, false);
    }

    @Override // X.AbstractC157016Ef
    public final int LIZ() {
        if (C146545p4.LIZ()) {
            return EnumC139485dg.LONG_VIDEO_NEW.getScene();
        }
        return EnumC139485dg.LONG_VIDEO.getScene();
    }

    @Override // X.AbstractC157016Ef
    public final VideoPublishEditModel LIZIZ() {
        return this.LJII;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C157056Ej(VideoPublishEditModel model, WM7 rootScene, VideoPublishViewModel viewModel) {
        super(model, rootScene, viewModel);
        o.LJIIIZ(model, "model");
        o.LJIIIZ(rootScene, "rootScene");
        o.LJIIIZ(viewModel, "viewModel");
        this.LJII = model;
    }
}
