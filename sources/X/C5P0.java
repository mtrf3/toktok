package X;

import androidx.lifecycle.LiveData;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEEditorListener;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.vesdk.VEEditor;
import com.ss.android.vesdk.VERecordData;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.VEUtils;
import com.ss.android.vesdk.runtime.VEEditorResManager;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS7S0401000_2;
import kotlin.jvm.internal.o;
import v5.n;

/* renamed from: X.5P0, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5P0 extends C5LR {
    public final InterfaceC153045zY LJ;
    public final MultiEditVideoRecordData LJFF;
    public final EditPreviewInfo LJI;
    public final LiveData<C5M2> LJII;
    public VEEditorResManager LJIIIIZZ;
    public final C122034qd LJIIIZ;
    public final C133505Lu LJIIJ;

    @Override // X.InterfaceC133425Lm
    public final C10K<Boolean> prepare() {
        final NLEEditor nLEEditor;
        String str;
        NLETrackSlot LJIIIIZZ;
        NLESegment LJI;
        NLEResourceNode LIZIZ;
        final n nVar = new n();
        if (LIZJ() != null) {
            nVar.LJ(Boolean.TRUE);
        } else if (!this.LIZIZ) {
            C122034qd LJJI = C17N.LJJI(this.LJ);
            if (LJJI != null) {
                nLEEditor = LJJI.LJIIJ;
            } else {
                nLEEditor = null;
            }
            VERecordData LJIIJJI = C46104I7o.LJIIJJI(this.LJFF);
            if (nLEEditor != null) {
                nLEEditor.removeConsumer(this.LJIIJ);
            }
            VecNLETrackSlotSPtr LJIILL = this.LJIIIZ.LJIIJ.LJ().getMainTrack().LJIILL();
            int i = 0;
            if (!LJIILL.isEmpty()) {
                Iterator<NLETrackSlot> it = LJIILL.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (C17J.LJJIL(it.next())) {
                        List<VERecordData.VERecordSegmentData> segmentData = LJIIJJI.getSegmentData();
                        o.LJIIIIZZ(segmentData, "recordVEData.segmentData");
                        for (VERecordData.VERecordSegmentData vERecordSegmentData : segmentData) {
                            int i2 = i + 1;
                            if (i >= 0) {
                                VERecordData.VERecordSegmentData vERecordSegmentData2 = vERecordSegmentData;
                                NLETrackSlot nLETrackSlot = (NLETrackSlot) ORZ.LJLLLLLL(i, this.LJIIIZ.LJIIJ.LJ().getMainTrack().LJIILL());
                                if (nLETrackSlot == null || (LJIIIIZZ = nLETrackSlot.LJIIIIZZ()) == null || (LJI = LJIIIIZZ.LJI()) == null || (LIZIZ = LJI.LIZIZ()) == null || (str = LIZIZ.LIZJ()) == null) {
                                    str = vERecordSegmentData2.mVideo;
                                }
                                vERecordSegmentData2.mVideo = str;
                                i = i2;
                            } else {
                                C47261Igj.LJJJJJ();
                                throw null;
                            }
                        }
                    }
                }
            }
            VESize calcTargetRes = VEUtils.calcTargetRes(this.LJI.getTotalVideoWidth(), this.LJI.getTotalVideoHeight(), C17N.LJJLIIIJILLIZJL(this.LJI), this.LJI.getPreviewWidth());
            final VEEditorResManager vEEditorResManager = new VEEditorResManager(this.LJ.getWorkspace());
            this.LJIIIIZZ = vEEditorResManager;
            this.LIZIZ = true;
            VEEditor.LJIIZILJ(vEEditorResManager, LJIIJJI, calcTargetRes.width, calcTargetRes.height, new YOW() { // from class: X.5P1
                @Override // X.YOW
                public final void LIZ(int i3) {
                    C6QQ.LIZ(new AqS7S0401000_2(C5P0.this, (C5P0) vEEditorResManager, (VEEditorResManager) nLEEditor, (NLEEditor) i3, (int) nVar, (n<Boolean>) 4));
                }

                @Override // X.YOW
                public final void LIZIZ(double d) {
                    InterfaceC88472Yns<? super Double, C76800UCe> interfaceC88472Yns = C5P0.this.LIZLLL;
                    if (interfaceC88472Yns != null) {
                        interfaceC88472Yns.invoke(Double.valueOf(d));
                    }
                }
            });
        }
        C10K c10k = nVar.LIZ;
        o.LJIIIIZZ(c10k, "prepareTask.task");
        return c10k;
    }

    @Override // X.C5LR
    public final InterfaceC153045zY LIZLLL() {
        return this.LJ;
    }

    @Override // X.C5LR
    public final VEEditorResManager LJFF() {
        return this.LJIIIIZZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.5Lu] */
    public C5P0(InterfaceC153045zY srcVEEditor, MultiEditVideoRecordData recordData, EditPreviewInfo editPreviewInfo, LiveData<C5M2> liveData) {
        super(srcVEEditor);
        o.LJIIIZ(srcVEEditor, "srcVEEditor");
        o.LJIIIZ(recordData, "recordData");
        o.LJIIIZ(editPreviewInfo, "editPreviewInfo");
        this.LJ = srcVEEditor;
        this.LJFF = recordData;
        this.LJI = editPreviewInfo;
        this.LJII = liveData;
        C122034qd LJJI = C17N.LJJI(srcVEEditor);
        if (LJJI != null) {
            this.LJIIIZ = LJJI;
            this.LJIIJ = new NLEEditorListener() { // from class: X.5Lu
                @Override // com.bytedance.ies.nle.editor_jni.NLEEditorListener
                public final void onChanged() {
                    String str;
                    C5M2 value;
                    EffectCategoryResponse effectCategoryResponse;
                    if (C5P0.this.LIZJ() != null) {
                        VecNLETrackSlotSPtr LJIILL = C5P0.this.LJIIIZ.LJIIJ.LJ().getMainTrack().LJIILL();
                        if (!LJIILL.isEmpty()) {
                            Iterator<NLETrackSlot> it = LJIILL.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                if (C17J.LJJIL(it.next())) {
                                    LiveData<C5M2> liveData2 = C5P0.this.LJII;
                                    if (liveData2 != null && (value = liveData2.getValue()) != null && (effectCategoryResponse = value.LIZIZ) != null) {
                                        str = effectCategoryResponse.getKey();
                                    } else {
                                        str = null;
                                    }
                                    if (!C164996dj.LIZJ(str)) {
                                        C5P0.this.LIZ();
                                        return;
                                    }
                                }
                            }
                        }
                    }
                    C5P0.this.LJIIIZ.LJIIJ.removeConsumer(this);
                }
            };
        } else {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }
}
