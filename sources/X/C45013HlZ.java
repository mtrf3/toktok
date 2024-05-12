package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeConfigV2;
import com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.vesdk.VEEditor;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.HlZ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45013HlZ<T> implements InterfaceC66992k3 {
    public final /* synthetic */ C72242sW LJLIL;
    public final /* synthetic */ VideoPublishEditModel LJLILLLLZI;
    public final /* synthetic */ C45005HlR LJLJI;

    public C45013HlZ(C72242sW c72242sW, VideoPublishEditModel videoPublishEditModel, C45005HlR c45005HlR) {
        this.LJLIL = c72242sW;
        this.LJLILLLLZI = videoPublishEditModel;
        this.LJLJI = c45005HlR;
    }

    @Override // X.InterfaceC66992k3
    public final void subscribe(InterfaceC65052gv<CompileProbeResult> interfaceC65052gv) {
        String str;
        int LIZJ;
        List<EditVideoSegment> videoList;
        EditVideoSegment editVideoSegment;
        TEVideoUtils.nativeCancelCompileProbe();
        this.LJLIL.element = System.currentTimeMillis();
        EditPreviewInfo previewInfo = this.LJLILLLLZI.getPreviewInfo();
        if (previewInfo == null || (videoList = previewInfo.getVideoList()) == null || (editVideoSegment = (EditVideoSegment) ListProtector.get(videoList, 0)) == null || (str = editVideoSegment.getVideoPath()) == null) {
            str = "";
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C60903NvH.LJ.getCacheDir().getPath());
        LIZ.append(File.separator);
        String LIZIZ = X1D.LIZIZ(LIZ);
        CompileProbeConfigV2 compileProbeConfigV2 = this.LJLJI.LIZJ;
        o.LJI(compileProbeConfigV2);
        long startPointMs = compileProbeConfigV2.getStartPointMs();
        CompileProbeConfigV2 compileProbeConfigV22 = this.LJLJI.LIZJ;
        o.LJI(compileProbeConfigV22);
        long endPointMs = compileProbeConfigV22.getEndPointMs();
        VideoPublishEditModel videoPublishEditModel = this.LJLILLLLZI;
        o.LJIIIZ(videoPublishEditModel, "<this>");
        String LIZIZ2 = C44654Hfm.LIZIZ(H7R.LJJJJI(videoPublishEditModel));
        CompileProbeConfigV2 compileProbeConfigV23 = this.LJLJI.LIZJ;
        o.LJI(compileProbeConfigV23);
        int probeType = compileProbeConfigV23.getProbeType();
        CompileProbeConfigV2 compileProbeConfigV24 = this.LJLJI.LIZJ;
        o.LJI(compileProbeConfigV24);
        compileProbeConfigV24.getBitrateStrategy();
        C73578SuE c73578SuE = (C73578SuE) interfaceC65052gv;
        C45014Hla c45014Hla = new C45014Hla(this.LJLJI, this.LJLILLLLZI, c73578SuE, this.LJLIL);
        synchronized (VEEditor.LLJLILLLLZIIL) {
            if (!VEEditor.LLJLL) {
                VEEditor.LLJLL = true;
                if (probeType == 0) {
                    P4Q.LJII("VEEditor", "compile use not hard encode, not soft encode");
                    LIZJ = -100;
                } else {
                    LIZJ = VEEditor.LIZJ(str, LIZIZ, 1080, 1920, startPointMs, endPointMs, LIZIZ2, probeType, null, c45014Hla);
                    VEEditor.LLJLL = false;
                }
            } else {
                LIZJ = -2;
            }
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("HWCompileProbe -> CompileProbeV2: compileProbe() method is called, checkResult = ");
        LIZ2.append(LIZJ);
        H78.LIZ(X1D.LIZIZ(LIZ2));
        if (LIZJ != 0) {
            c73578SuE.tryOnError(new C45016Hlc(new C45030Hlq(LIZJ)));
        }
    }
}
