package X;

import android.content.Context;
import android.util.Pair;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.ss.android.vesdk.VEEditor;
import com.ss.android.vesdk.VERecordData;
import com.ss.android.vesdk.VESize;
import dmt.av.video.VEPreviewMusicParams;
import dmt.av.video.VEPreviewParams;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.5Id, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C132555Id extends C5MG {
    public static final /* synthetic */ int LJJIJIL = 0;
    public int LJJIJIIJI;
    public int LJJIJIIJIL;

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJIJIIJI() {
        C121914qR LJJIII;
        InterfaceC133095Kf interfaceC133095Kf = this.LJIIIIZZ;
        o.LJII(interfaceC133095Kf, "null cannot be cast to non-null type dmt.av.video.VEPreviewParams");
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = ((VEPreviewParams) interfaceC133095Kf).recordData;
        MultiEditVideoRecordData multiEditVideoRecordData = multiEditVideoStatusRecordData.curMultiEditVideoRecordData;
        int i = multiEditVideoStatusRecordData.currentEditIndex;
        if (multiEditVideoStatusRecordData.isMultiEditRetake) {
            int i2 = 0;
            if (multiEditVideoStatusRecordData.segmentSizeChange || this.LJIILIIL) {
                Pair<Integer, Integer> playInOutTime = multiEditVideoRecordData.getPlayInOutTime();
                Integer num = (Integer) playInOutTime.first;
                Integer num2 = (Integer) playInOutTime.second;
                List<MultiEditVideoSegmentRecordData> list = multiEditVideoRecordData.segmentDataList;
                o.LJIIIIZZ(list, "editVideoRecordData.segmentDataList");
                int i3 = 0;
                for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : list) {
                    int i4 = i3 + 1;
                    if (i3 >= 0) {
                        MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData2 = multiEditVideoSegmentRecordData;
                        if (i3 < i) {
                            i2 += (int) (multiEditVideoSegmentRecordData2.getEndTime() - multiEditVideoSegmentRecordData2.getStartTime());
                        }
                        i3 = i4;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
                C46104I7o.LJIIJJI(multiEditVideoRecordData).setTimeRange(num.intValue() * 1000, num2.intValue() * 1000);
                LJJIJIL(LJJ(), multiEditVideoRecordData);
                ((C133765Mu) LJJ()).LLJILJIL(true);
                ((C133765Mu) LJJ()).LLJJJIL(i2, VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek);
                return;
            }
            if (C77413UZt.LJIILL(multiEditVideoRecordData.segmentDataList)) {
                return;
            }
            MultiEditVideoRecordData LIZIZ = C6BI.LIZIZ(multiEditVideoRecordData, null);
            LIZIZ.resetTimeData();
            Object obj = ListProtector.get(LIZIZ.segmentDataList, i);
            LIZIZ.segmentDataList.clear();
            LIZIZ.segmentDataList.add(obj);
            List<MultiEditVideoSegmentRecordData> list2 = multiEditVideoRecordData.segmentDataList;
            o.LJIIIIZZ(list2, "editVideoRecordData.segmentDataList");
            int i5 = 0;
            int i6 = 0;
            for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData3 : list2) {
                int i7 = i5 + 1;
                if (i5 >= 0) {
                    MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData4 = multiEditVideoSegmentRecordData3;
                    if (i5 < i) {
                        i6 += (int) (multiEditVideoSegmentRecordData4.getEndTime() - multiEditVideoSegmentRecordData4.getStartTime());
                    }
                    i5 = i7;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
            long startTime = ((MultiEditVideoSegmentRecordData) ListProtector.get(multiEditVideoRecordData.segmentDataList, i)).getStartTime();
            long endTime = ((MultiEditVideoSegmentRecordData) ListProtector.get(multiEditVideoRecordData.segmentDataList, i)).getEndTime();
            if (multiEditVideoRecordData.isPlaySingleSegmentMusic()) {
                LJJIJIL(LJJ(), multiEditVideoRecordData);
                int i8 = (int) (endTime - startTime);
                C122034qd LJJI = C17N.LJJI(LJJ());
                if (LJJI != null && (LJJIII = LJJI.LJFF().LJJIII()) != null) {
                    int i9 = i6 + multiEditVideoRecordData.musicTrimIn;
                    int i10 = multiEditVideoRecordData.musicDuration;
                    if (i9 > i10) {
                        i9 %= i10;
                    }
                    LJJIII.LIZJ = i9;
                    LJJIII.LIZLLL = i9 + i8;
                    LJJIII.LJIILLIIL = false;
                    LJJI.LJFF().LJJJJJL(LJJIII);
                }
            }
            ((C133765Mu) LJJ()).LLJILJIL(true);
            int i11 = (int) startTime;
            ((C133765Mu) LJJ()).LLLFZ(i11, (int) endTime);
            ((C133765Mu) LJJ()).LLJJJIL(i11, VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C132555Id(C135235Sl c135235Sl) {
        super(c135235Sl);
        C38995FSd.LJ();
    }

    public static final boolean LJJIJIIJIL(VEPreviewParams vEPreviewParams) {
        if (vEPreviewParams.isStoryEditMode || !vEPreviewParams.mIsFromDraft) {
            return false;
        }
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = vEPreviewParams.recordData;
        if (multiEditVideoStatusRecordData != null && multiEditVideoStatusRecordData.isSupportMultiEdit && multiEditVideoStatusRecordData.curMultiEditVideoRecordData != null) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C5MG
    public final NLEEditor LJII(VEPreviewParams params) {
        boolean z;
        o.LJIIIZ(params, "params");
        NLEEditor nLEEditor = new NLEEditor();
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = params.recordData;
        int i = 0;
        if (multiEditVideoStatusRecordData != null && multiEditVideoStatusRecordData.isMultiEditRetake) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (multiEditVideoStatusRecordData.segmentSizeChange || this.LJIILIIL) {
                MultiEditVideoRecordData multiEditVideoRecordData = multiEditVideoStatusRecordData.curMultiEditVideoRecordData;
                int i2 = multiEditVideoStatusRecordData.currentEditIndex;
                Pair<Integer, Integer> playInOutTime = multiEditVideoRecordData.getPlayInOutTime();
                Integer num = (Integer) playInOutTime.first;
                Integer num2 = (Integer) playInOutTime.second;
                List<MultiEditVideoSegmentRecordData> list = multiEditVideoRecordData.segmentDataList;
                o.LJIIIIZZ(list, "editVideoRecordData.segmentDataList");
                for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : list) {
                    int i3 = i + 1;
                    if (i >= 0) {
                        MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData2 = multiEditVideoSegmentRecordData;
                        if (i < i2) {
                            multiEditVideoSegmentRecordData2.getEndTime();
                            multiEditVideoSegmentRecordData2.getStartTime();
                        }
                        i = i3;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
                VERecordData LJIIJJI = C46104I7o.LJIIJJI(multiEditVideoRecordData);
                LJIIJJI.setTimeRange(num.intValue() * 1000, num2.intValue() * 1000);
                ((C133765Mu) LJJ()).LLLILZ(true);
                if (LJJIJIIJIL(params)) {
                    C127344zC.LIZ(LJIIJJI, nLEEditor);
                } else {
                    C127344zC.LIZIZ(LJIIJJI, nLEEditor);
                }
            } else {
                MultiEditVideoRecordData multiEditVideoRecordData2 = multiEditVideoStatusRecordData.curMultiEditVideoRecordData;
                int i4 = multiEditVideoStatusRecordData.currentEditIndex;
                if (!C77413UZt.LJIILL(multiEditVideoRecordData2.segmentDataList)) {
                    MultiEditVideoRecordData LIZIZ = C6BI.LIZIZ(multiEditVideoRecordData2, null);
                    LIZIZ.resetTimeData();
                    Object obj = ListProtector.get(LIZIZ.segmentDataList, i4);
                    LIZIZ.segmentDataList.clear();
                    LIZIZ.segmentDataList.add(obj);
                    List<MultiEditVideoSegmentRecordData> list2 = multiEditVideoRecordData2.segmentDataList;
                    o.LJIIIIZZ(list2, "multiEditVideoRecordData.segmentDataList");
                    for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData3 : list2) {
                        int i5 = i + 1;
                        if (i >= 0) {
                            MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData4 = multiEditVideoSegmentRecordData3;
                            if (i < i4) {
                                multiEditVideoSegmentRecordData4.getEndTime();
                                multiEditVideoSegmentRecordData4.getStartTime();
                            }
                            i = i5;
                        } else {
                            C47261Igj.LJJJJJ();
                            throw null;
                        }
                    }
                    ((C133765Mu) LJJ()).LLLILZ(true);
                    if (LJJIJIIJIL(params)) {
                        C127344zC.LIZ(C46104I7o.LJIIJJI(LIZIZ), nLEEditor);
                    } else {
                        C127344zC.LIZIZ(C46104I7o.LJIIJJI(LIZIZ), nLEEditor);
                    }
                }
            }
            return nLEEditor;
        }
        Pair<Integer, Integer> playInOutTime2 = multiEditVideoStatusRecordData.curMultiEditVideoRecordData.getPlayInOutTime();
        Integer num3 = (Integer) playInOutTime2.first;
        Integer num4 = (Integer) playInOutTime2.second;
        MultiEditVideoRecordData multiEditVideoRecordData3 = params.recordData.curMultiEditVideoRecordData;
        o.LJIIIIZZ(multiEditVideoRecordData3, "veParams.recordData.curMultiEditVideoRecordData");
        VERecordData LJIIJJI2 = C46104I7o.LJIIJJI(multiEditVideoRecordData3);
        LJIIJJI2.setTimeRange(num3.intValue() * 1000, num4.intValue() * 1000);
        if (LJJIJIIJIL(params)) {
            C127344zC.LIZ(LJIIJJI2, nLEEditor);
            return nLEEditor;
        }
        C127344zC.LIZIZ(LJIIJJI2, nLEEditor);
        return nLEEditor;
    }

    @Override // X.C5MG
    public final boolean LJIIJJI(VEPreviewMusicParams params) {
        o.LJIIIZ(params, "params");
        super.LJIIJJI(params);
        return false;
    }

    @Override // X.C5MG
    public final void LJJIIZI(SurfaceView surfaceView) {
        surfaceView.getHolder().addCallback(new SurfaceHolder.Callback() { // from class: X.5O5
            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceCreated(SurfaceHolder holder) {
                o.LJIIIZ(holder, "holder");
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceDestroyed(SurfaceHolder holder) {
                o.LJIIIZ(holder, "holder");
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceChanged(SurfaceHolder holder, int i, int i2, int i3) {
                boolean z;
                o.LJIIIZ(holder, "holder");
                C132555Id c132555Id = C132555Id.this;
                if (c132555Id.LJJIJIIJI == i2 && c132555Id.LJJIJIIJIL == i3) {
                    return;
                }
                VESize LLJJIII = ((C133765Mu) c132555Id.LJIJ()).LLJJIII(i2, i3);
                int i4 = LLJJIII.width;
                int i5 = LLJJIII.height;
                C5O6.LJI = i2;
                C5O6.LJII = i3;
                C5O6.LJIIIIZZ = i4;
                C5O6.LJIIIZ = i5;
                C133765Mu c133765Mu = (C133765Mu) C132555Id.this.LJIJ();
                c133765Mu.LLLFFI(VEEditor.SCALE_MODE.SCALE_MODE_CENTER_INSIDE_WITH_2DENGINE);
                if (C5O6.LJFF > 0 && C5O6.LJ > 0) {
                    c133765Mu.LLJIJIL(C5O6.LJ, C5O6.LJFF);
                }
                InterfaceC153045zY LJIJ = C132555Id.this.LJIJ();
                if (C5O6.LJI > 0 && C5O6.LJII > 0 && C5O6.LJIIIIZZ > 0 && C5O6.LJIIIZ > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (C5O6.LIZLLL > 0 && C5O6.LIZJ > 0 && C5O6.LIZ > 0 && C5O6.LIZIZ > 0 && z) {
                    ((C133765Mu) LJIJ).LLJJIJI(C5O6.LIZJ / C5O6.LJIIIIZZ, C5O6.LIZLLL / C5O6.LJIIIZ, 0.0f, -(((C5O6.LJI / 2) - (C5O6.LIZJ / 2)) - C5O6.LIZ), ((C5O6.LJII / 2) - (C5O6.LIZLLL / 2)) - C5O6.LIZIZ);
                }
                C132555Id c132555Id2 = C132555Id.this;
                c132555Id2.LJJIJIIJI = i2;
                c132555Id2.LJJIJIIJIL = i3;
            }
        });
    }

    public static void LJJIJIL(InterfaceC153045zY interfaceC153045zY, MultiEditVideoRecordData multiEditVideoRecordData) {
        InterfaceC123794tT LJFF;
        if (multiEditVideoRecordData.hasRetake) {
            return;
        }
        if (!C170626mo.LIZJ(C60903NvH.LJ, multiEditVideoRecordData.musicPath)) {
            return;
        }
        if (multiEditVideoRecordData.musicDuration <= 0) {
            multiEditVideoRecordData.musicDuration = HOH.LIZIZ(6, multiEditVideoRecordData.musicPath);
        }
        C121914qR c121914qR = new C121914qR();
        c121914qR.LIZ = multiEditVideoRecordData.musicPath;
        c121914qR.LJ = 0L;
        int i = multiEditVideoRecordData.musicDuration;
        int i2 = multiEditVideoRecordData.musicTrimIn;
        c121914qR.LJFF = i - i2;
        c121914qR.LIZJ = i2;
        c121914qR.LIZLLL = i;
        c121914qR.LJI = multiEditVideoRecordData.musicVolume;
        C122034qd LJJI = C17N.LJJI(interfaceC153045zY);
        if (LJJI == null || (LJFF = LJJI.LJFF()) == null) {
            return;
        }
        LJFF.LJJJJJL(c121914qR);
    }

    @Override // X.C5MG
    public final void LJJI(NLEModel nLEModel, boolean z) {
        super.LJJI(nLEModel, z);
        LJJIJIIJI();
    }

    @Override // X.C5MG
    public final void LJJIFFI(String str, boolean z) {
        super.LJJIFFI(str, z);
        LJJIJIIJI();
    }

    @Override // X.C5MG
    public final int LJJII(Context context, InterfaceC133095Kf params, SurfaceView surfaceView, LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(params, "params");
        super.LJJII(context, params, surfaceView, lifecycleOwner);
        if (this.LJIIZILJ == 1) {
            LJIJ().LLLILZ(false);
        } else {
            LJIJ().LLLILZ(true);
        }
        return 0;
    }
}
