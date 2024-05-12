package X;

import android.util.Pair;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.vesdk.VEEditor;
import com.ss.android.vesdk.VERecordData;
import com.ss.android.vesdk.runtime.VEEditorResManager;
import kotlin.jvm.internal.AqS66S0201000_2;
import kotlin.jvm.internal.o;
import v5.n;

/* renamed from: X.5P4, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5P4 extends C5LR {
    public final InterfaceC153045zY LJ;
    public final MultiEditVideoRecordData LJFF;
    public final n<Boolean> LJI;
    public VEEditorResManager LJII;

    @Override // X.InterfaceC133425Lm
    public final C10K<Boolean> prepare() {
        if (LIZJ() != null) {
            this.LJI.LJ(Boolean.TRUE);
        } else if (!this.LIZIZ) {
            VERecordData LJIIJJI = C46104I7o.LJIIJJI(this.LJFF);
            if (LJIIJJI.getSegmentData().size() == 1) {
                VERecordData.VERecordSegmentData vERecordSegmentData = (VERecordData.VERecordSegmentData) ListProtector.remove(LJIIJJI.getSegmentData(), 0);
                Pair<Integer, Integer> playInOutTime = this.LJFF.getPlayInOutTime();
                LJIIJJI.getSegmentData().add(new VERecordData.VERecordSegmentData(vERecordSegmentData.mVideo, vERecordSegmentData.mVideoLength, vERecordSegmentData.mAudio, vERecordSegmentData.mAudioLength, vERecordSegmentData.mVideoSpeed, vERecordSegmentData.mSpeed, vERecordSegmentData.mRotate, ((Number) playInOutTime.first).longValue() * 1000, 1000 * ((Number) playInOutTime.second).longValue(), true));
            }
            final VEEditorResManager vEEditorResManager = new VEEditorResManager(this.LJ.getWorkspace());
            this.LJII = vEEditorResManager;
            this.LIZIZ = true;
            VEEditor.LJIIZILJ(vEEditorResManager, LJIIJJI, -1, -1, new YOW() { // from class: X.5P5
                @Override // X.YOW
                public final void LIZ(int i) {
                    C6QQ.LIZ(new AqS66S0201000_2(C5P4.this, vEEditorResManager, i, 1));
                }

                @Override // X.YOW
                public final void LIZIZ(double d) {
                    InterfaceC88472Yns<? super Double, C76800UCe> interfaceC88472Yns = C5P4.this.LIZLLL;
                    if (interfaceC88472Yns != null) {
                        interfaceC88472Yns.invoke(Double.valueOf(d));
                    }
                }
            });
        }
        C10K<Boolean> c10k = this.LJI.LIZ;
        o.LJIIIIZZ(c10k, "prepareTask.task");
        return c10k;
    }

    @Override // X.C5LR
    public final InterfaceC153045zY LIZLLL() {
        return this.LJ;
    }

    @Override // X.C5LR
    public final VEEditorResManager LJFF() {
        return this.LJII;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5P4(InterfaceC153045zY srcVEEditor, MultiEditVideoRecordData recordData) {
        super(srcVEEditor);
        o.LJIIIZ(srcVEEditor, "srcVEEditor");
        o.LJIIIZ(recordData, "recordData");
        this.LJ = srcVEEditor;
        this.LJFF = recordData;
        this.LJI = new n<>();
    }
}
