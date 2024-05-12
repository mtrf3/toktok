package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeConfigV1;
import com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.vesdk.VEEditor;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.HlY, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45012HlY<T> implements InterfaceC66992k3 {
    public final /* synthetic */ C45004HlQ LJLIL;
    public final /* synthetic */ VideoPublishEditModel LJLILLLLZI;
    public final /* synthetic */ C72242sW LJLJI;

    public C45012HlY(C45004HlQ c45004HlQ, VideoPublishEditModel videoPublishEditModel, C72242sW c72242sW) {
        this.LJLIL = c45004HlQ;
        this.LJLILLLLZI = videoPublishEditModel;
        this.LJLJI = c72242sW;
    }

    @Override // X.InterfaceC66992k3
    public final void subscribe(InterfaceC65052gv<CompileProbeResult> interfaceC65052gv) {
        String str;
        int LIZJ;
        List<EditVideoSegment> videoList;
        EditVideoSegment editVideoSegment;
        TEVideoUtils.nativeCancelCompileProbe();
        InterfaceC147355qN invoke = this.LJLIL.LIZIZ.invoke(this.LJLILLLLZI);
        this.LJLJI.element = System.currentTimeMillis();
        EditPreviewInfo previewInfo = this.LJLILLLLZI.getPreviewInfo();
        if (previewInfo == null || (videoList = previewInfo.getVideoList()) == null || (editVideoSegment = (EditVideoSegment) ListProtector.get(videoList, 0)) == null || (str = editVideoSegment.getVideoPath()) == null) {
            str = "";
        }
        String LJIILLIIL = C5YW.LIZIZ().LJIILLIIL(this.LJLILLLLZI);
        int LIZIZ = invoke.LIZIZ();
        int LJ = invoke.LJ();
        CompileProbeConfigV1 compileProbeConfigV1 = this.LJLIL.LIZJ;
        o.LJI(compileProbeConfigV1);
        long startPointMs = compileProbeConfigV1.getStartPointMs();
        CompileProbeConfigV1 compileProbeConfigV12 = this.LJLIL.LIZJ;
        o.LJI(compileProbeConfigV12);
        long endPointMs = compileProbeConfigV12.getEndPointMs();
        VideoPublishEditModel videoPublishEditModel = this.LJLILLLLZI;
        o.LJIIIZ(videoPublishEditModel, "<this>");
        String LIZIZ2 = C44654Hfm.LIZIZ(H7R.LJJJJI(videoPublishEditModel));
        C73578SuE c73578SuE = (C73578SuE) interfaceC65052gv;
        C45015Hlb c45015Hlb = new C45015Hlb(c73578SuE, this.LJLJI);
        synchronized (VEEditor.LLJLILLLLZIIL) {
            if (!VEEditor.LLJLL) {
                VEEditor.LLJLL = true;
                LIZJ = VEEditor.LIZJ(str, LJIILLIIL, LIZIZ, LJ, startPointMs, endPointMs, LIZIZ2, 1, c45015Hlb, null);
                VEEditor.LLJLL = false;
                if (LIZJ == 0) {
                    return;
                }
            } else {
                LIZJ = -2;
            }
        }
        c73578SuE.tryOnError(new C45016Hlc(new C45030Hlq(LIZJ)));
    }
}
