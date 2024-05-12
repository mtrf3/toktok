package X;

import Y.ACallableS56S0300000_7;
import Y.AgS110S0200000_7;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.HFs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43768HFs extends AbstractC43762HFm {
    public final VideoPublishEditModel LIZLLL;

    @Override // X.HGP
    public final String LIZ() {
        return "extract_upload";
    }

    @Override // X.AbstractC43762HFm
    public final List<HFD> LIZIZ() {
        List<AutoCutMediaModel> LJIIZILJ = C45087Hml.LJIIZILJ(this.LIZLLL);
        if (C77413UZt.LJIILL(LJIIZILJ)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) LJIIZILJ).iterator();
        while (it.hasNext()) {
            AutoCutMediaModel autoCutMediaModel = (AutoCutMediaModel) it.next();
            HFD hfd = new HFD();
            hfd.LIZ = autoCutMediaModel.filePath;
            hfd.LIZIZ = autoCutMediaModel.cutDuration;
            hfd.LIZJ = autoCutMediaModel.speed;
            arrayList.add(hfd);
        }
        return arrayList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43768HFs(VideoPublishEditModel mModel) {
        super(mModel.creativeInfo);
        o.LJIIIZ(mModel, "mModel");
        this.LIZLLL = mModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List, java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.ArrayList] */
    @Override // X.AbstractC43762HFm
    public final void LJFF(HGQ hgq) {
        boolean z;
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, "AutoCutFrameExtractor#start");
        super.LJFF(hgq);
        if (!AbstractC43762HFm.LIZJ()) {
            return;
        }
        ?? LJIIZILJ = C45087Hml.LJIIZILJ(this.LIZLLL);
        if (C44384HbQ.LJLL(this.LIZLLL)) {
            VideoPublishEditModel model = this.LIZLLL;
            o.LJIIIZ(model, "model");
            C5K0.LIZ(2);
            NLEEditor nLEEditor = new NLEEditor();
            nLEEditor.LJI(model.nleData);
            nLEEditor.LIZIZ();
            nLEEditor.LIZJ();
            NLEModel LJ = nLEEditor.LJ();
            LJIIZILJ = new ArrayList();
            VecNLETrackSPtr tracks = LJ.getTracks();
            if (tracks != null) {
                Iterator<NLETrack> it = tracks.iterator();
                while (it.hasNext()) {
                    Iterator<NLETrackSlot> it2 = it.next().LJIILL().iterator();
                    while (it2.hasNext()) {
                        NLESegmentVideo LJJ = NLESegmentVideo.LJJ(it2.next().LJI());
                        if (LJJ != null && o.LJ(LJJ.getExtra("is_mutable"), "true")) {
                            String LIZJ = LJJ.LIZIZ().LIZJ();
                            o.LJIIIIZZ(LIZJ, "resource.resourceFile");
                            if (LJJ.LIZIZ().LJFF() == EnumC123874tb.VIDEO) {
                                z = true;
                            } else {
                                z = false;
                            }
                            long j = 1000;
                            LJIIZILJ.add(new AutoCutMediaModel(LIZJ, null, 0, 0, z, 0L, LJJ.LJIILIIL() / j, (LJJ.LJIIL() - LJJ.LJIILIIL()) / j, 0.0f, null, 814, null));
                        }
                    }
                }
            }
        }
        if (C77413UZt.LJIILL(LJIIZILJ)) {
            return;
        }
        ?? LIZ = X1D.LIZ();
        LIZ.append("AutoCutFrameExtractor#mediaList: ");
        LIZ.append(LJIIZILJ);
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ));
        ArrayList arrayList = new ArrayList();
        for (Object obj : LJIIZILJ) {
            if (((AutoCutMediaModel) obj).isVideoType) {
                arrayList.add(obj);
            }
        }
        C10K.LIZJ(new ACallableS56S0300000_7(this, arrayList, ORZ.LLIIIILZ(LJIIZILJ, arrayList), 11)).LIZLLL(new AgS110S0200000_7((HGD) hgq, this, 18));
    }
}
