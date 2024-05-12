package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* renamed from: X.5je, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC143185je implements InterfaceC147355qN {
    public final VideoPublishEditModel LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;

    public AbstractC143185je(VideoPublishEditModel editModel) {
        o.LJIIIZ(editModel, "editModel");
        this.LIZ = editModel;
    }

    @Override // X.InterfaceC147355qN
    public int LIZ(boolean z) {
        if (z) {
            return this.LIZ.videoHeight();
        }
        return this.LIZ.sourceVideoHeight();
    }

    @Override // X.InterfaceC147355qN
    public int LJFF(boolean z) {
        if (z) {
            return this.LIZ.videoWidth();
        }
        return this.LIZ.sourceVideoWidth();
    }

    @Override // X.InterfaceC147355qN
    public final void LIZJ(boolean z, boolean z2) {
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZ.getCoverPublishModel().setNeedExpandCompiledSize(z);
        this.LIZ.mVideoCanvasWidth = LIZLLL();
        this.LIZ.mVideoCanvasHeight = LJI();
        this.LIZ.mOutVideoWidth = LIZIZ();
        this.LIZ.mOutVideoHeight = LJ();
    }
}
