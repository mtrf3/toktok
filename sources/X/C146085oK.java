package X;

import android.content.Context;
import com.bytedance.ies.cutsame.cut_android.NLEPrepareListener;
import com.bytedance.ies.cutsame.cut_android.NLETemplateSource;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.ugc.aweme.cutsame.CutsameDataItem;
import com.ss.android.ugc.cut_ui.CutSource;
import com.ss.android.ugc.cut_ui.MediaItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.o;

/* renamed from: X.5oK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C146085oK extends C5MG {
    public NLEModel LJJIJIIJI;
    public NLEEditor LJJIJIIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C146085oK(C135235Sl c135235Sl) {
        super(c135235Sl);
        C38995FSd.LJ();
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x0038, code lost:
    
        if (r4 != null) goto L9;
     */
    @Override // X.C5MG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bytedance.ies.nle.editor_jni.NLEEditor LJII(dmt.av.video.VEPreviewParams r12) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C146085oK.LJII(dmt.av.video.VEPreviewParams):com.bytedance.ies.nle.editor_jni.NLEEditor");
    }

    public final void LJJIJIIJI(CutSource cutSource, CutsameDataItem cutsameDataItem, final ArrayList<MediaItem> arrayList) {
        C60903NvH.LJIIJJI().LIZIZ().LIZIZ(cutsameDataItem);
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final Context LIZ = C5L7.LIZ();
        NLETemplateSource nLETemplateSource = new NLETemplateSource(LIZ, cutSource, cutsameDataItem.md5);
        nLETemplateSource.LJ(new C82876Wfo(new C82869Wfh(LIZ)));
        nLETemplateSource.LJI(C45244HpI.LIZ.LIZ(EnumC172756qF.CUTSAME));
        nLETemplateSource.LIZ(new NLEPrepareListener() { // from class: X.5oL
            @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
            public final void onProgress(float f, String str) {
            }

            @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
            public final void onPreSuccess(NLETemplateModel nLETemplateModel) {
                if (nLETemplateModel != null) {
                    C127334zB.LIZJ(nLETemplateModel, LIZ, arrayList);
                }
            }

            @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
            public final void onSuccess(NLETemplateModel nLETemplateModel) {
                if (nLETemplateModel != null) {
                    VecNLETrackSPtr tracks = nLETemplateModel.getTracks();
                    o.LJIIIIZZ(tracks, "tracks");
                    Iterator<NLETrack> it = tracks.iterator();
                    while (it.hasNext()) {
                        it.next().setExtra("business", "cutsame");
                    }
                    nLETemplateModel.setCanvasRatio(nLETemplateModel.getCanvasRatio());
                }
                C146085oK c146085oK = this;
                NLEModel saveToDraft = NLETemplateModel.saveToDraft(nLETemplateModel);
                o.LJIIIIZZ(saveToDraft, "saveToDraft(model)");
                c146085oK.LJJIJIIJI = saveToDraft;
                C146085oK c146085oK2 = this;
                NLEEditor nLEEditor = c146085oK2.LJJIJIIJIL;
                if (nLEEditor != null) {
                    NLEModel nLEModel = c146085oK2.LJJIJIIJI;
                    if (nLEModel != null) {
                        nLEEditor.LJII(nLEModel);
                        countDownLatch.countDown();
                        return;
                    } else {
                        o.LJIJI("nModel");
                        throw null;
                    }
                }
                o.LJIJI("nleEditor");
                throw null;
            }

            @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
            public final void onError(int i, String str) {
                countDownLatch.countDown();
            }
        });
        nLETemplateSource.LIZJ();
        countDownLatch.await();
    }
}
