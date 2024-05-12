package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* renamed from: X.GxQ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC43200GxQ implements Runnable {
    public final /* synthetic */ float LJLIL;
    public final /* synthetic */ C43199GxP LJLILLLLZI;
    public final /* synthetic */ VideoPublishEditModel LJLJI;

    public RunnableC43200GxQ(float f, C43199GxP c43199GxP, VideoPublishEditModel videoPublishEditModel) {
        this.LJLIL = f;
        this.LJLILLLLZI = c43199GxP;
        this.LJLJI = videoPublishEditModel;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            float f = this.LJLIL;
            if (f <= 100.0f && C43213Gxd.LIZJ) {
                C43199GxP c43199GxP = this.LJLILLLLZI;
                VideoPublishEditModel videoPublishEditModel = this.LJLJI;
                C43206GxW.LIZIZ = 2;
                C43206GxW.LIZJ = (int) f;
                C43206GxW.LIZLLL = videoPublishEditModel;
                c43199GxP.getClass();
                C2U8.LIZ(new C43203GxT());
            }
        } finally {
            if (LIZ) {
            }
        }
    }
}
