package X;

import Y.ARunnableS3S0301000_2;
import Y.ARunnableS9S0000000_2;
import android.graphics.PointF;
import android.text.TextUtils;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEFilter;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLEStyCrop;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVideoAnimation;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.vesdk.VEEditor;
import com.ss.ugc.android.editor.core.tracklinkage.TrackLinkageManagerProvider;
import com.ss.ugc.android.editor.core.utils.LiveDataBus;
import com.zhiliaoapp.musically.R;
import defpackage.g0;
import defpackage.i0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.o;

/* renamed from: X.4v5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C124794v5 extends C124704uw implements InterfaceC125464wA {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [X.4wy] */
    @Override // X.InterfaceC125464wA
    public final void LJII() {
        final NLETrackSlot LJJLIIIJ;
        NLESegmentVideo LJJ;
        String str;
        String str2;
        NLESegment LJI;
        NLEResourceNode LIZIZ;
        NLESegmentAudio nLESegmentAudio;
        NLEResourceAV LJIIJJI;
        NLESegment LJI2;
        NLEResourceNode LIZIZ2;
        final NLETrack LJJLIIIIJ = LJJLIIIIJ();
        if (LJJLIIIIJ != null && (LJJLIIIJ = LJJLIIIJ()) != null && (LJJ = NLESegmentVideo.LJJ(LJJLIIIJ.LJI())) != null) {
            if (LJJ.LIZIZ().LJFF() != EnumC123874tb.VIDEO) {
                C132105Gk.LIZIZ(R.string.jbs);
                return;
            }
            this.LJLJJL.pause();
            long H9 = this.LJLJJL.H9();
            String str3 = null;
            if (LJJ.getRewind()) {
                NLETrackSlot LIZIZ3 = C124864vC.LIZIZ(r9(), LJJLIIIJ);
                if (LIZIZ3 != null && (LJI2 = LIZIZ3.LJI()) != null && (LIZIZ2 = LJI2.LIZIZ()) != null) {
                    str3 = LIZIZ2.LIZJ();
                }
                String LIZJ = LJJLIIIJ.LJI().LIZIZ().LIZJ();
                o.LJIIIIZZ(LIZJ, "slot.mainSegment.resource.resourceFile");
                LJJLIIIJJI(str3, LIZJ, LJJLIIIIJ, LJJLIIIJ, false);
            } else {
                NLEResourceAV LJIIJJI2 = LJJ.LJIIJJI();
                if (LJIIJJI2 == null || (str = LJIIJJI2.LIZJ()) == null) {
                    str = "";
                }
                NLETrackSlot LIZIZ4 = C124864vC.LIZIZ(r9(), LJJLIIIJ);
                if (LIZIZ4 != null && (nLESegmentAudio = (NLESegmentAudio) NLESegmentAudio.class.getMethod("LIZLLL", NLENode.class).invoke(null, LIZIZ4.LJI())) != null && (LJIIJJI = nLESegmentAudio.LJIIJJI()) != null) {
                    str2 = LJIIJJI.LIZJ();
                } else {
                    str2 = null;
                }
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str)) {
                    File file = new File(str);
                    if (file.exists() && file.length() > 0) {
                        LJJLIIIJJI(str2, str, LJJLIIIIJ, LJJLIIIJ, true);
                    }
                }
                String sourceVideoPath = LJJLIIIJ.LJI().LIZIZ().LIZJ();
                NLETrackSlot LIZIZ5 = C124864vC.LIZIZ(r9(), LJJLIIIJ);
                if (LIZIZ5 != null && (LJI = LIZIZ5.LJI()) != null && (LIZIZ = LJI.LIZIZ()) != null) {
                    str3 = LIZIZ.LIZJ();
                }
                InterfaceC127784zu player = this.LJLIL.getPlayer();
                o.LJIIIIZZ(sourceVideoPath, "sourceVideoPath");
                player.ba(sourceVideoPath, str3, new InterfaceC132735Iv() { // from class: X.4wy
                    @Override // X.InterfaceC132735Iv
                    public final void LIZ(int i) {
                        C124794v5 c124794v5 = C124794v5.this;
                        c124794v5.LJLJJI.post(new ARunnableS3S0301000_2(i, c124794v5, LJJLIIIIJ, LJJLIIIJ, 2));
                    }

                    @Override // X.InterfaceC132735Iv
                    public final void LIZIZ(double d) {
                        C124794v5.this.LJLJJI.post(new ARunnableS9S0000000_2(d, 5));
                    }
                });
            }
            this.LJLJJL.M9(C78926UyI.LJJJI(H9));
        }
    }

    @Override // X.InterfaceC125464wA
    public final void LJJIJ() {
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // X.InterfaceC125464wA
    public final float LJJJJJ() {
        NLESegmentVideo LJJ;
        NLETrackSlot LJJLIIIJ = LJJLIIIJ();
        if (LJJLIIIJ != null && (LJJ = NLESegmentVideo.LJJ(LJJLIIIJ.LJI())) != null) {
            return LJJ.getAbsSpeed();
        }
        return 1.0f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C124794v5(InterfaceC124924vI editorContext) {
        super(editorContext);
        o.LJIIIZ(editorContext, "editorContext");
    }

    @Override // X.InterfaceC125464wA
    public final boolean LIZJ(EnumC124724uy enumC124724uy) {
        NLETrackSlot LJJLIIIJ;
        boolean z;
        boolean z2 = false;
        if (LJJLIIIIJ() == null || (LJJLIIIJ = LJJLIIIJ()) == null) {
            return false;
        }
        int abs = Math.abs(Boolean.compare(LJJLIIIJ.getMirror_X(), true));
        if (abs == 1) {
            z = true;
        } else {
            z = false;
        }
        LJJLIIIJ.setMirror_X(z);
        if (abs == 2) {
            z2 = true;
        }
        LJJLIIIJ.setMirror_Y(z2);
        LJJJZ(enumC124724uy, null);
        return true;
    }

    @Override // X.InterfaceC125464wA
    public final boolean LJIIL(EnumC124724uy enumC124724uy) {
        return C124774v3.LIZIZ(this.LJLIL, enumC124724uy);
    }

    @Override // X.InterfaceC125464wA
    public final boolean LJJIJL(EnumC124724uy enumC124724uy) {
        NLETrackSlot LJJLIIIJ;
        NLETrackSlot LIZ;
        NLEResourceAV LJ;
        String LIZJ;
        boolean z;
        int i;
        long j;
        NLETrackSlot LIZ2;
        NLETrackSlot LIZ3;
        int LIZ4;
        NLETrack LIZIZ;
        NLETrackSlot LJIILIIL;
        NLETrack LJJLIIIIJ = LJJLIIIIJ();
        if (LJJLIIIIJ == null || (LJJLIIIJ = LJJLIIIJ()) == null || (LIZ = NLETrackSlot.LIZ(LJJLIIIJ.deepClone(true))) == null) {
            return false;
        }
        LIZ.setStartTime(LJJLIIIJ.getEndTime());
        LIZ.setEndTime(LJJLIIIJ.getDuration() + LIZ.getStartTime());
        NLEFilter LIZIZ2 = LIZ.LIZIZ();
        if (LIZIZ2 != null) {
            LIZIZ2.setStartTime(LIZ.getStartTime());
            LIZIZ2.setEndTime(LIZ.getEndTime());
        }
        LIZ.setExtra("is_editorpro_copy_video_clip", "1");
        if (LJJLIIIIJ.LJIIJ()) {
            NLEModel beforeActionNLEModel = NLEModel.dynamicCast(C79057V0z.LJJI(this.LJLIL).deepClone());
            NLETrack mainTrack = r9().getMainTrack();
            long j2 = 0;
            if (mainTrack != null) {
                j = mainTrack.LJIIJJI();
            } else {
                j = 0;
            }
            NLEModel nleModel = r9();
            o.LJIIIZ(nleModel, "nleModel");
            C124864vC.LJFF.getClass();
            NLETrack LIZ5 = C120994ox.LIZ(nleModel);
            if (LIZ5 != null && (LIZ2 = C120984ow.LIZ(LJJLIIIJ, LIZ5)) != null && (LIZ3 = NLETrackSlot.LIZ(LIZ2.deepClone(true))) != null) {
                LIZ3.setStartTime(LIZ2.getEndTime());
                LIZ3.setEndTime(LIZ2.getDuration() + LIZ3.getStartTime());
                LIZ.setExtra("extra_associated_vc_slot_id", LIZ3.getUUID());
                LIZ5.LIZIZ(LIZ3);
            }
            if (C124864vC.LIZJ && (LIZ4 = C124864vC.LIZ(nleModel, LJJLIIIJ)) >= 0 && (LIZIZ = C141335gf.LIZIZ(nleModel)) != null && (LJIILIIL = LIZIZ.LJIILIIL(LIZ4)) != null) {
                EnumC123864ta LJIIZILJ = LIZIZ.LJIIZILJ();
                o.LJIIIIZZ(LJIIZILJ, "originAudioTrack.trackType");
                int LIZ6 = C122524rQ.LIZ(nleModel, LJIIZILJ);
                NLETrackSlot LIZ7 = NLETrackSlot.LIZ(LJIILIIL.deepClone(true));
                if (LIZ7 != null) {
                    LIZ7.setStartTime(LJIILIIL.getEndTime());
                    LIZ7.setEndTime(LJIILIIL.getDuration() + LIZ7.getStartTime());
                    NLEFilter LIZIZ3 = LIZ7.LIZIZ();
                    if (LIZIZ3 != null) {
                        LIZIZ3.setStartTime(LIZ7.getStartTime());
                        LIZIZ3.setEndTime(LIZ7.getEndTime());
                    }
                    LIZ7.setLayer(LIZ6);
                    LIZIZ.LIZJ(LIZ7, LJIILIIL);
                }
            }
            LJJLIIIIJ.LIZJ(LIZ, LJJLIIIJ);
            C124864vC.LJ(r9());
            C124864vC.LIZLLL(r9());
            this.LJLIL.getMainTrack().LJJIFFI();
            EnumC127484zQ enumC127484zQ = EnumC127484zQ.ENABLE_TRACK_LINKAGE;
            Boolean bool = Boolean.FALSE;
            if (((Boolean) C5BA.LIZ(enumC127484zQ, bool)).booleanValue()) {
                TrackLinkageManagerProvider.Companion.getClass();
                AbstractC123304sg businessTrackLinkageManager = C124944vK.LIZ().getBusinessTrackLinkageManager();
                if (businessTrackLinkageManager != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new C123434st(null, LIZ, new OSZ(-1, Integer.valueOf(LJJLIIIIJ.LJIILJJIL(LIZ))), null, 8));
                    o.LJIIIIZZ(beforeActionNLEModel, "beforeActionNLEModel");
                    businessTrackLinkageManager.LIZIZ(new C123314sh("add_video", arrayList, beforeActionNLEModel));
                }
            }
            if (((Boolean) C5BA.LIZ(EnumC127484zQ.ENABLE_AUTO_ALIGN_BGM, bool)).booleanValue()) {
                NLETrack mainTrack2 = r9().getMainTrack();
                if (mainTrack2 != null) {
                    j2 = mainTrack2.LJIIJJI();
                }
                if (j2 > j) {
                    C124614un.LIZIZ(j, this.LJLIL);
                }
            }
        } else {
            NLESegmentVideo LJJ = NLESegmentVideo.LJJ(LIZ.LJI());
            if (LJJ == null || (LJ = LJJ.LJ()) == null || (LIZJ = LJ.LIZJ()) == null) {
                return false;
            }
            NLETrack LJFF = C124614un.LJFF(this.LJLIL, LIZ.getStartTime(), LIZJ);
            List<NLETrack> LJIJI = C124574uj.LJIJI(C79057V0z.LJJI(this.LJLIL));
            if (LJFF == null) {
                z = true;
            } else {
                z = false;
            }
            if (LJIJI == null || LJIJI.isEmpty()) {
                i = 0;
            } else {
                ArrayList arrayList2 = new ArrayList(C32I.LJJL(LJIJI, 10));
                Iterator<NLETrack> it = LJIJI.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Integer.valueOf(it.next().getLayer()));
                }
                Iterator it2 = arrayList2.iterator();
                if (it2.hasNext()) {
                    int intValue = ((Number) it2.next()).intValue();
                    while (it2.hasNext()) {
                        int intValue2 = ((Number) it2.next()).intValue();
                        if (intValue < intValue2) {
                            intValue = intValue2;
                        }
                    }
                    i = intValue + 1;
                } else {
                    throw new NoSuchElementException();
                }
            }
            if (!z && LJFF != null) {
                i = LJFF.getLayer();
            }
            LIZ.setTransformZ(i + 1);
            if (!((Boolean) C5BA.LIZ(EnumC127484zQ.ENABLE_SUBTRACK_OVER_MAIN, Boolean.TRUE)).booleanValue()) {
                long LIZLLL = C124574uj.LIZLLL(C79057V0z.LJJI(this.LJLIL));
                long endTime = LIZ.getEndTime();
                long j3 = endTime - LIZLLL;
                if (endTime > LIZLLL) {
                    LIZ.setEndTime(LIZLLL);
                    NLESegmentVideo LJJ2 = NLESegmentVideo.LJJ(LIZ.LJI());
                    if (LJJ2 != null) {
                        LJJ2.LJIJJ(LJJ2.LJIIL() - j3);
                    }
                }
            }
            if (LJFF == null) {
                NLETrack nLETrack = new NLETrack();
                nLETrack.setLayer(i);
                C124574uj.LJJLIIIJILLIZJL(nLETrack, "video");
                nLETrack.LJIL(EnumC123864ta.VIDEO);
                nLETrack.LJJ(false);
                nLETrack.LIZIZ(LIZ);
                nLETrack.setExtra("track_layer", String.valueOf(i));
                nLETrack.setExtra("track_extra_pip", "true");
                r9().addTrack(nLETrack);
            } else {
                LJFF.LIZIZ(LIZ);
            }
        }
        C79057V0z.LJIILL(this.LJLIL, C6YK.LIZ(new C139795eB(EnumC126814yL.COPY.getNameId(), null, null, null, null, 30)));
        C79057V0z.LJJJJL(this.LJLIL, "select_slot_event", new C127594zb(LIZ, null, 14));
        this.LJLIL.getPlayer().M9(LIZ.getStartTime() + 1000);
        LiveDataBus.getInstance().with("key_mainViewModel", Integer.TYPE).postValue(7);
        return true;
    }

    @Override // X.InterfaceC125464wA
    public final boolean LJJJI(EnumC124724uy enumC124724uy) {
        NLETrackSlot LJJLIIIJ;
        String LIZ;
        NLETrack LJJLIIIIJ = LJJLIIIIJ();
        if (LJJLIIIIJ == null || (LJJLIIIJ = LJJLIIIJ()) == null) {
            return false;
        }
        int rotation = (((int) LJJLIIIJ.getRotation()) - 90) % 360;
        String valueOf = String.valueOf((int) Math.abs(LJJLIIIJ.getRotation()));
        String valueOf2 = String.valueOf(Math.abs(rotation));
        if (Math.abs(rotation) == 90 || Math.abs(rotation) == 270) {
            if (LJJLIIIJ.getScale() == 1.0f) {
                LJJLIIIJ.setScale(LJJLIIIJILLIZJL(LJJLIIIJ));
            }
        } else if ((Math.abs(rotation) == 0 || Math.abs(rotation) == 180) && LJJLIIIJ.getScale() == LJJLIIIJILLIZJL(LJJLIIIJ)) {
            LJJLIIIJ.setScale(1.0f);
        }
        LJJLIIIJ.setRotation(rotation);
        C79057V0z.LJJJJL(this.LJLIL, "rotate_changed_event", Integer.valueOf(rotation));
        int i = -rotation;
        C79057V0z.LJJJJL(this.LJLIL, "update_rotate_degree", new C125894wr(true, String.valueOf(i)));
        C79057V0z.LJJJJL(this.LJLIL, "current_rotate_degree", Integer.valueOf(i));
        if (!LJJLIIIIJ.hasExtra("track_extra_is_rotated")) {
            LJJLIIIIJ.setExtra("track_extra_is_rotated", "true");
        }
        C139795eB c139795eB = new C139795eB(EnumC126814yL.ROTATE_FUNCTION.getNameId(), valueOf, valueOf2, null, null, 24);
        this.LJLIL.getKeyframeEditor().LJJIJIIJIL(false);
        if (this.LJLIL.getKeyframeEditor().LIZIZ()) {
            LIZ = "";
        } else {
            LIZ = C6YK.LIZ(c139795eB);
        }
        LJJJZ(enumC124724uy, LIZ);
        return true;
    }

    public final float LJJLIIIJILLIZJL(NLETrackSlot nLETrackSlot) {
        NLEStyCrop LJJIFFI;
        float LJI = (float) nLETrackSlot.LJI().LIZIZ().LJI();
        float LIZIZ = (float) nLETrackSlot.LJI().LIZIZ().LIZIZ();
        NLESegmentVideo LJJ = NLESegmentVideo.LJJ(nLETrackSlot.LJI());
        if (LJJ != null && (LJJIFFI = LJJ.LJJIFFI()) != null) {
            float NLEStyCrop_getXRight = NLEEditorJniJNI.NLEStyCrop_getXRight(LJJIFFI.LIZ, LJJIFFI) - NLEEditorJniJNI.NLEStyCrop_getXLeft(LJJIFFI.LIZ, LJJIFFI);
            float NLEStyCrop_getYLower = NLEEditorJniJNI.NLEStyCrop_getYLower(LJJIFFI.LIZ, LJJIFFI) - NLEEditorJniJNI.NLEStyCrop_getYUpper(LJJIFFI.LIZ, LJJIFFI);
            if (!Float.isInfinite(NLEStyCrop_getXRight) && !Float.isNaN(NLEStyCrop_getXRight) && NLEStyCrop_getXRight != 0.0f) {
                LJI *= NLEStyCrop_getXRight;
            }
            if (!Float.isInfinite(NLEStyCrop_getYLower) && !Float.isNaN(NLEStyCrop_getYLower) && NLEStyCrop_getYLower != 0.0f) {
                LIZIZ *= NLEStyCrop_getYLower;
            }
        }
        float canvasRatio = this.LJLIL.getEditor().s9().LJ().getCanvasRatio();
        if (canvasRatio == 0.0f) {
            canvasRatio = 0.5625f;
        }
        float f = LJI / LIZIZ;
        if (f >= canvasRatio) {
            if (1.0f / f > canvasRatio) {
                return f;
            }
            return 1.0f / canvasRatio;
        }
        float f2 = 1.0f / f;
        if (f2 >= canvasRatio) {
            return canvasRatio;
        }
        return f2;
    }

    @Override // X.InterfaceC125464wA
    public final void LJFF(C124804v6 c124804v6, EnumC124724uy enumC124724uy) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        NLETrackSlot LJJLIIIJ = LJJLIIIJ();
        if (LJJLIIIJ != null) {
            NLESegmentVideo LJJ = NLESegmentVideo.LJJ(LJJLIIIJ.LJI());
            NLEStyCrop nLEStyCrop = new NLEStyCrop();
            PointF pointF = c124804v6.LIZ;
            float f8 = 0.0f;
            if (pointF != null) {
                f = pointF.x;
            } else {
                f = 0.0f;
            }
            NLEEditorJniJNI.NLEStyCrop_setXLeft(nLEStyCrop.LIZ, nLEStyCrop, f);
            PointF pointF2 = c124804v6.LIZ;
            if (pointF2 != null) {
                f2 = pointF2.y;
            } else {
                f2 = 0.0f;
            }
            NLEEditorJniJNI.NLEStyCrop_setYUpper(nLEStyCrop.LIZ, nLEStyCrop, f2);
            PointF pointF3 = c124804v6.LIZJ;
            if (pointF3 != null) {
                f3 = pointF3.x;
            } else {
                f3 = 0.0f;
            }
            NLEEditorJniJNI.NLEStyCrop_setXLeftLower(nLEStyCrop.LIZ, nLEStyCrop, f3);
            PointF pointF4 = c124804v6.LIZJ;
            if (pointF4 != null) {
                f4 = pointF4.y;
            } else {
                f4 = 0.0f;
            }
            NLEEditorJniJNI.NLEStyCrop_setYLeftLower(nLEStyCrop.LIZ, nLEStyCrop, f4);
            PointF pointF5 = c124804v6.LIZIZ;
            if (pointF5 != null) {
                f5 = pointF5.x;
            } else {
                f5 = 0.0f;
            }
            NLEEditorJniJNI.NLEStyCrop_setXRightUpper(nLEStyCrop.LIZ, nLEStyCrop, f5);
            PointF pointF6 = c124804v6.LIZIZ;
            if (pointF6 != null) {
                f6 = pointF6.y;
            } else {
                f6 = 0.0f;
            }
            NLEEditorJniJNI.NLEStyCrop_setYRightUpper(nLEStyCrop.LIZ, nLEStyCrop, f6);
            PointF pointF7 = c124804v6.LIZLLL;
            if (pointF7 != null) {
                f7 = pointF7.x;
            } else {
                f7 = 0.0f;
            }
            NLEEditorJniJNI.NLEStyCrop_setXRight(nLEStyCrop.LIZ, nLEStyCrop, f7);
            PointF pointF8 = c124804v6.LIZLLL;
            if (pointF8 != null) {
                f8 = pointF8.y;
            }
            NLEEditorJniJNI.NLEStyCrop_setYLower(nLEStyCrop.LIZ, nLEStyCrop, f8);
            boolean z = true;
            NLEEditorJniJNI.NLESegmentVideo_setIsWithEffect(LJJ.LJ, LJJ, true);
            if ((Math.abs(LJJLIIIJ.getRotation()) != 90.0f && Math.abs(LJJLIIIJ.getRotation()) != 270.0f) || LJJLIIIJ.getScale() != LJJLIIIJILLIZJL(LJJLIIIJ)) {
                z = false;
            }
            LJJ.LJJIIJ(nLEStyCrop);
            if (z) {
                LJJLIIIJ.setScale(LJJLIIIJILLIZJL(LJJLIIIJ));
            }
            LJJJZ(enumC124724uy, C6YK.LIZ(new C139795eB(EnumC126814yL.CROP.getNameId(), null, null, null, null, 30)));
            this.LJLIL.getPlayer().W9(Integer.valueOf(VEEditor.SEEK_MODE.EDITOR_REFRESH_MODE_FOECE.getValue()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0172 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0124  */
    @Override // X.InterfaceC125464wA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(float r16, X.EnumC124724uy r17) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C124794v5.LJI(float, X.4uy):void");
    }

    @Override // X.InterfaceC125464wA
    public final void LJJIJIIJI(boolean z, EnumC124724uy enumC124724uy) {
        NLETrack mainTrack;
        float f;
        NLETrackSlot LJIILIIL;
        String nameId;
        NLETrack LIZIZ;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        this.LJLIL.getMainTrack().setExtra("is_maintrack_mute", String.valueOf(z));
        Iterator<NLETrackSlot> it = this.LJLIL.getMainTrack().LJIILLIIL().iterator();
        while (it.hasNext()) {
            NLETrackSlot slot = it.next();
            o.LJIIIIZZ(slot, "slot");
            NLESegmentVideo nLESegmentVideo = (NLESegmentVideo) NLESegmentVideo.class.getMethod("LJJ", NLENode.class).invoke(null, slot.LJI());
            if (z) {
                if (nLESegmentVideo != null) {
                    f3 = nLESegmentVideo.LJIILJJIL();
                } else {
                    f3 = 0.0f;
                }
                slot.setExtra("slot_mute_volume", String.valueOf(f3));
                if (nLESegmentVideo != null) {
                    nLESegmentVideo.LJIL(0.0f);
                }
                Iterator<NLETrackSlot> it2 = slot.LJFF().iterator();
                while (it2.hasNext()) {
                    NLETrackSlot keyframe = it2.next();
                    o.LJIIIIZZ(keyframe, "keyframe");
                    NLESegmentAudio nLESegmentAudio = (NLESegmentAudio) NLESegmentVideo.class.getMethod("LJJ", NLENode.class).invoke(null, keyframe.LJI());
                    if (nLESegmentAudio != null) {
                        f4 = nLESegmentAudio.LJIILJJIL();
                    } else {
                        f4 = 0.0f;
                    }
                    keyframe.setExtra("slot_mute_volume", String.valueOf(f4));
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("muteVolume open save keyframe volume ");
                    LIZ.append(f4);
                    LIZ.append(" slot ");
                    LIZ.append(keyframe.getUUID());
                    C131935Ft.LIZ(X1D.LIZIZ(LIZ));
                    NLESegmentAudio nLESegmentAudio2 = (NLESegmentAudio) NLESegmentVideo.class.getMethod("LJJ", NLENode.class).invoke(null, keyframe.LJI());
                    if (nLESegmentAudio2 != null) {
                        nLESegmentAudio2.LJIL(0.0f);
                    }
                }
            } else {
                String extra = slot.getExtra("slot_mute_volume");
                o.LJIIIIZZ(extra, "slot.getExtra(Constants.SLOT_MUTE_VOLUME_KEY)");
                Float LJJIJLIJ = C38350F3i.LJJIJLIJ(extra);
                if (LJJIJLIJ == null || LJJIJLIJ.floatValue() <= 0.0f) {
                    LJJIJLIJ = Float.valueOf(1.0f);
                }
                if (nLESegmentVideo != null) {
                    if (C124574uj.LJJIJIIJI(slot)) {
                        f7 = LJJIJLIJ.floatValue();
                    } else {
                        f7 = 0.0f;
                    }
                    nLESegmentVideo.LJIL(f7);
                    nLESegmentVideo.LJJIIJZLJL(true);
                }
                Iterator<NLETrackSlot> it3 = slot.LJFF().iterator();
                while (it3.hasNext()) {
                    NLETrackSlot next = it3.next();
                    String extra2 = next.getExtra("slot_mute_volume");
                    o.LJIIIIZZ(extra2, "keyframe.getExtra(Constants.SLOT_MUTE_VOLUME_KEY)");
                    Float LJJIJLIJ2 = C38350F3i.LJJIJLIJ(extra2);
                    if (LJJIJLIJ2 != null) {
                        f5 = LJJIJLIJ2.floatValue();
                    } else {
                        f5 = 1.0f;
                    }
                    NLESegmentVideo nLESegmentVideo2 = (NLESegmentVideo) NLESegmentVideo.class.getMethod("LJJ", NLENode.class).invoke(null, next.LJI());
                    if (nLESegmentVideo2 != null) {
                        if (C124574uj.LJJIJIIJI(slot)) {
                            f6 = f5;
                        } else {
                            f6 = 0.0f;
                        }
                        nLESegmentVideo2.LJIL(f6);
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("muteVolume close reset  keyframe volume ");
                        LIZ2.append(nLESegmentVideo2.LJIILJJIL());
                        LIZ2.append("  ");
                        LIZ2.append(f5);
                        LIZ2.append("  slot ");
                        LIZ2.append(next.getUUID());
                        C131935Ft.LIZ(X1D.LIZIZ(LIZ2));
                        nLESegmentVideo2.LJJIIJZLJL(true);
                    }
                }
            }
        }
        NLEModel nleModel = r9();
        o.LJIIIZ(nleModel, "nleModel");
        if (C124864vC.LIZJ && (LIZIZ = C141335gf.LIZIZ(nleModel)) != null) {
            Iterator<NLETrackSlot> it4 = LIZIZ.LJIILLIIL().iterator();
            int i = 0;
            while (it4.hasNext()) {
                NLETrackSlot next2 = it4.next();
                int i2 = i + 1;
                if (i >= 0) {
                    NLETrackSlot slot2 = next2;
                    o.LJIIIIZZ(slot2, "slot");
                    NLESegmentAudio nLESegmentAudio3 = (NLESegmentAudio) NLESegmentAudio.class.getMethod("LIZLLL", NLENode.class).invoke(null, slot2.LJI());
                    if (nLESegmentAudio3 != null) {
                        if (z) {
                            slot2.setExtra("slot_mute_volume", String.valueOf(nLESegmentAudio3.LJIILJJIL()));
                            nLESegmentAudio3.LJIL(0.0f);
                        } else {
                            String extra3 = slot2.getExtra("slot_mute_volume");
                            o.LJIIIIZZ(extra3, "slot.getExtra(SLOT_MUTE_VOLUME_KEY)");
                            Float LJJIJLIJ3 = C38350F3i.LJJIJLIJ(extra3);
                            if (LJJIJLIJ3 != null) {
                                f2 = LJJIJLIJ3.floatValue();
                            } else {
                                f2 = 1.0f;
                            }
                            nLESegmentAudio3.LJIL(f2);
                        }
                    }
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
        C124864vC.LJFF.getClass();
        NLETrack LIZ3 = C120994ox.LIZ(nleModel);
        if (LIZ3 != null && (mainTrack = nleModel.getMainTrack()) != null) {
            Iterator<NLETrackSlot> it5 = mainTrack.LJIILL().iterator();
            while (it5.hasNext()) {
                NLETrackSlot it6 = it5.next();
                o.LJIIIIZZ(it6, "it");
                NLETrackSlot LIZ4 = C120984ow.LIZ(it6, LIZ3);
                if (LIZ4 != null) {
                    int LIZ5 = C124864vC.LIZ(nleModel, it6);
                    NLETrack LIZIZ2 = C141335gf.LIZIZ(nleModel);
                    if (LIZIZ2 != null && (LJIILIIL = LIZIZ2.LJIILIIL(LIZ5)) != null) {
                        NLESegment LJI = LJIILIIL.LJI();
                        o.LJIIIIZZ(LJI, "originSlot.mainSegment");
                        C124574uj.LJJLIIIJJI(LJI, 0.0f);
                    } else {
                        NLESegmentVideo.LJJ(it6.LJI()).LJJIIJZLJL(false);
                    }
                    NLESegmentAudio nLESegmentAudio4 = (NLESegmentAudio) NLESegmentAudio.class.getMethod("LIZLLL", NLENode.class).invoke(null, LIZ4.LJI());
                    if (nLESegmentAudio4 != null) {
                        if (z) {
                            LIZ4.setExtra("slot_mute_volume", String.valueOf(nLESegmentAudio4.LJIILJJIL()));
                            nLESegmentAudio4.LJIL(0.0f);
                        } else {
                            String extra4 = LIZ4.getExtra("slot_mute_volume");
                            o.LJIIIIZZ(extra4, "vcSlot.getExtra(Constants.SLOT_MUTE_VOLUME_KEY)");
                            Float LJJIJLIJ4 = C38350F3i.LJJIJLIJ(extra4);
                            if (LJJIJLIJ4 != null) {
                                f = LJJIJLIJ4.floatValue();
                            } else {
                                f = 1.0f;
                            }
                            nLESegmentAudio4.LJIL(f);
                        }
                    }
                }
            }
        }
        if (z) {
            nameId = EnumC126814yL.CLOSE_VOLUME.getNameId();
        } else {
            nameId = EnumC126814yL.OPEN_VOLUME.getNameId();
        }
        LJJJZ(enumC124724uy, C6YK.LIZ(new C139795eB(nameId, null, null, null, null, 30)));
        this.LJLIL.getKeyframeEditor().LIZLLL(C78926UyI.LJJJI(C79057V0z.LJIJJLI(this.LJLIL)));
    }

    @Override // X.InterfaceC125464wA
    public final OSZ<NLETrack, NLETrackSlot> LJJJJL(NLETrackSlot nLETrackSlot, EnumC124724uy enumC124724uy) {
        NLETrack trackBySlot;
        boolean z;
        boolean z2;
        NLETrackSlot nLETrackSlot2 = nLETrackSlot;
        if (nLETrackSlot2 == null) {
            nLETrackSlot2 = LJJLIIIJ();
            trackBySlot = LJJLIIIIJ();
        } else {
            trackBySlot = C79057V0z.LJJI(this.LJLIL).getTrackBySlot(nLETrackSlot2);
        }
        if (trackBySlot != null && (!trackBySlot.LJIIJ() || trackBySlot.LJIILL().size() > 1)) {
            z = true;
        } else {
            z = false;
        }
        if (z && trackBySlot != null && nLETrackSlot2 != null) {
            if (trackBySlot.LJIIJ()) {
                VecNLETrackSlotSPtr LJIILLIIL = trackBySlot.LJIILLIIL();
                int LJIILJJIL = trackBySlot.LJIILJJIL(nLETrackSlot2);
                NLEModel beforeActionNLEModel = NLEModel.dynamicCast(C79057V0z.LJJI(this.LJLIL).deepClone());
                NLETrackSlot LIZ = NLETrackSlot.LIZ(nLETrackSlot2.deepClone());
                if (LJIILJJIL == 0) {
                    if (1 < LJIILLIIL.size()) {
                        LJIILLIIL.get(1);
                    }
                } else {
                    int size = LJIILLIIL.size();
                    int i = LJIILJJIL - 1;
                    if (i >= 0 && i < size) {
                        LJIILLIIL.get(i);
                    }
                }
                C124864vC.LJI(C79057V0z.LJJI(this.LJLIL), nLETrackSlot2);
                trackBySlot.LJIJJLI(nLETrackSlot2);
                trackBySlot.LJJIFFI();
                trackBySlot.LJIILIIL(trackBySlot.LJIILL().size() - 1).LJIIJJI(null);
                if (!((Boolean) C5BA.LIZ(EnumC127484zQ.ENABLE_OPERATE_CAUSE_BLACK_SLOT, Boolean.TRUE)).booleanValue()) {
                    C124614un.LIZJ(this.LJLIL);
                }
                if (trackBySlot.LJIILL().size() == 1) {
                    NLESegment LJI = ((NLETrackSlot) ORZ.LJLLJ(trackBySlot.LJIILL())).LJI();
                    o.LJIIIIZZ(LJI, "onlySlot.mainSegment");
                    if (C124574uj.LJJIIZI(LJI) == 0.0f) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2 && trackBySlot.hasExtra("is_maintrack_mute") && !Boolean.parseBoolean(trackBySlot.getExtra("is_maintrack_mute"))) {
                        trackBySlot.setExtra("is_maintrack_mute", "true");
                    }
                }
                if (!r9().hasExtra("model_extra_is_video_deleted")) {
                    r9().setExtra("model_extra_is_video_deleted", "true");
                }
                if (((Boolean) C5BA.LIZ(EnumC127484zQ.ENABLE_TRACK_LINKAGE, Boolean.FALSE)).booleanValue()) {
                    TrackLinkageManagerProvider.Companion.getClass();
                    AbstractC123304sg businessTrackLinkageManager = C124944vK.LIZ().getBusinessTrackLinkageManager();
                    if (businessTrackLinkageManager != null) {
                        ArrayList LJII = C47261Igj.LJII(new C123434st(LIZ, nLETrackSlot2, new OSZ(Integer.valueOf(LJIILJJIL), -1), null, 8));
                        o.LJIIIIZZ(beforeActionNLEModel, "beforeActionNLEModel");
                        businessTrackLinkageManager.LIZIZ(new C123314sh("delete_video", LJII, beforeActionNLEModel));
                    }
                }
            } else {
                if (trackBySlot.LJIILLIIL().size() > 1) {
                    trackBySlot.LJIJJLI(nLETrackSlot2);
                } else {
                    r9().removeTrack(trackBySlot);
                }
                trackBySlot.LJJIFFI();
            }
            LJJJZ(enumC124724uy, C6YK.LIZ(new C139795eB(EnumC126814yL.DELETE.getNameId(), null, null, null, null, 30)));
            return new OSZ<>(trackBySlot, nLETrackSlot2);
        }
        return new OSZ<>(null, null);
    }

    @Override // X.InterfaceC125464wA
    public final void LJJJJZI(C124824v8 c124824v8, EnumC124724uy enumC124724uy) {
        float absSpeed;
        boolean LJIIIZ;
        NLETrackSlot selectedTrackSlot;
        VecNLETrackSlotSPtr LJIILLIIL;
        int indexOf;
        NLETrackSlot nLETrackSlot;
        NLETrack nLETrack;
        boolean z;
        NLETrackSlot LJJLIIIJ = LJJLIIIJ();
        if (LJJLIIIJ != null) {
            this.LJLIL.getNleSession().X8().LJIILL(30);
            NLESegmentVideo LJJ = NLESegmentVideo.LJJ(LJJLIIIJ.LJI());
            if (LJJ != null) {
                Float f = c124824v8.LIZ;
                if (f != null) {
                    absSpeed = f.floatValue();
                } else {
                    absSpeed = LJJ.getAbsSpeed();
                }
                Boolean bool = c124824v8.LIZIZ;
                if (bool != null) {
                    LJIIIZ = bool.booleanValue();
                } else {
                    LJIIIZ = LJJ.LJIIIZ();
                }
                if (!c124824v8.LIZJ) {
                    NLEModel beforeActionNLEModel = NLEModel.dynamicCast(C79057V0z.LJJI(this.LJLIL).deepClone());
                    NLETrackSlot LIZ = NLETrackSlot.LIZ(LJJLIIIJ.deepClone());
                    this.LJLJJL.pause();
                    LJJ.setAbsSpeed(absSpeed);
                    long LJIIL = ((float) (LJJ.LJIIL() - LJJ.LJIILIIL())) / LJJ.getAbsSpeed();
                    LJJLIIIJ.setEndTime(LJJLIIIJ.getStartTime() + LJIIL);
                    Iterator<NLEVideoAnimation> it = LJJLIIIJ.LJIIIZ().iterator();
                    while (it.hasNext()) {
                        NLEVideoAnimation next = it.next();
                        next.setEndTime(next.getStartTime() + (((float) (next.getEndTime() - next.getStartTime())) / absSpeed));
                    }
                    LJJ.LJIJI(LJIIIZ);
                    C124864vC.LJII(C79057V0z.LJJI(this.LJLIL), LJJLIIIJ, c124824v8);
                    InterfaceC124924vI editorContext = this.LJLIL;
                    long startTime = LJJLIIIJ.getStartTime();
                    long endTime = LJJLIIIJ.getEndTime();
                    o.LJIIIZ(editorContext, "editorContext");
                    NLETrack selectedTrack = editorContext.getSelectedTrack();
                    if (selectedTrack != null && (selectedTrackSlot = editorContext.getSelectedTrackSlot()) != null && C124574uj.LJJJJL(editorContext) && ((!selectedTrack.LJIILL().contains(selectedTrackSlot) || !((NLENode) ORZ.LLFF(selectedTrack.LJIILLIIL())).equals((NLENode) selectedTrackSlot)) && selectedTrack.LJIILL().contains(selectedTrackSlot) && (indexOf = (LJIILLIIL = selectedTrack.LJIILLIIL()).indexOf(selectedTrackSlot)) < LJIILLIIL.size() - 1 && (nLETrackSlot = LJIILLIIL.get(indexOf + 1)) != null && endTime > nLETrackSlot.getStartTime())) {
                        Iterator<NLETrack> it2 = C124574uj.LJIJI(C79057V0z.LJJI(editorContext)).iterator();
                        loop1: while (true) {
                            if (it2.hasNext()) {
                                nLETrack = it2.next();
                                Iterator<NLETrackSlot> it3 = nLETrack.LJIILLIIL().iterator();
                                while (it3.hasNext()) {
                                    NLETrackSlot next2 = it3.next();
                                    NLETrackSlot nLETrackSlot2 = next2;
                                    if ((nLETrackSlot2.getStartTime() >= startTime || nLETrackSlot2.getEndTime() <= startTime) && ((nLETrackSlot2.getStartTime() < startTime || nLETrackSlot2.getEndTime() > endTime) && (nLETrackSlot2.getStartTime() >= endTime || nLETrackSlot2.getEndTime() <= endTime))) {
                                    }
                                }
                                break loop1;
                            }
                            nLETrack = null;
                            break;
                        }
                        selectedTrack.LJIJJLI(selectedTrackSlot);
                        if (nLETrack != null) {
                            selectedTrackSlot.setTransformZ(nLETrack.getLayer() + 1);
                            nLETrack.LIZIZ(selectedTrackSlot);
                        } else {
                            NLEModel LJJI = C79057V0z.LJJI(editorContext);
                            List<NLETrack> LJIJI = C124574uj.LJIJI(LJJI);
                            int indexOf2 = LJIJI.indexOf(selectedTrack);
                            if (C124574uj.LJIJI(LJJI).indexOf(selectedTrack) == r0.size() - 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            int layer = selectedTrack.getLayer() + 1;
                            NLETrack nLETrack2 = new NLETrack();
                            nLETrack2.setLayer(layer);
                            C124574uj.LJJLIIIJILLIZJL(nLETrack2, "video");
                            nLETrack2.LJJ(false);
                            nLETrack2.LJIL(EnumC123864ta.VIDEO);
                            nLETrack2.setExtra("track_layer", String.valueOf(layer));
                            nLETrack2.setExtra("track_extra_pip", "true");
                            LJJI.addTrack(nLETrack2);
                            if (!z) {
                                for (NLETrack nLETrack3 : LJIJI.subList(indexOf2 + 1, LJIJI.size())) {
                                    int layer2 = nLETrack3.getLayer() + 1;
                                    nLETrack3.setLayer(layer2);
                                    nLETrack3.setExtra("track_layer", String.valueOf(layer2));
                                }
                            }
                            selectedTrackSlot.setTransformZ(nLETrack2.getLayer() + 1);
                            nLETrack2.LIZIZ(selectedTrackSlot);
                        }
                        C79057V0z.LJJJJL(editorContext, "select_slot_event", new C127594zb(selectedTrackSlot, null, 10));
                    }
                    this.LJLIL.getKeyframeEditor().LJJJJLL(LJJLIIIJ);
                    NLETrack LJJLIIIIJ = LJJLIIIIJ();
                    if (LJJLIIIIJ != null && LJJLIIIIJ.LJIIJ()) {
                        if (LJIIL < 200000) {
                            LJJLIIIJ.LJIIJJI(null);
                            NLETrackSlot nLETrackSlot3 = (NLETrackSlot) ORZ.LJLLLLLL(this.LJLIL.getMainTrack().LJIILLIIL().indexOf(LJJLIIIJ) - 1, this.LJLIL.getMainTrack().LJIILLIIL());
                            if (nLETrackSlot3 != null) {
                                nLETrackSlot3.LJIIJJI(null);
                            }
                        }
                        if (((Boolean) C5BA.LIZ(EnumC127484zQ.ENABLE_TRACK_LINKAGE, Boolean.FALSE)).booleanValue()) {
                            TrackLinkageManagerProvider.Companion.getClass();
                            AbstractC123304sg businessTrackLinkageManager = C124944vK.LIZ().getBusinessTrackLinkageManager();
                            if (businessTrackLinkageManager != null) {
                                ArrayList LJII = C47261Igj.LJII(new C123434st(LIZ, LJJLIIIJ, null, null, 12));
                                o.LJIIIIZZ(beforeActionNLEModel, "beforeActionNLEModel");
                                businessTrackLinkageManager.LIZIZ(new C123314sh("speed_video", LJII, beforeActionNLEModel));
                            }
                        }
                    }
                    LJJJZ(enumC124724uy, null);
                }
                if (LJJ.LJFF() != 1.0d) {
                    NLEEditorJniJNI.NLESegmentAudio_clearCurveSpeedPoint(LJJ.LIZJ, LJJ);
                    LJJ.setExtra("curve_speed_name", "");
                    LJJJZ(enumC124724uy, null);
                }
                InterfaceC124814v7 interfaceC124814v7 = c124824v8.LIZLLL;
                if (interfaceC124814v7 != null) {
                    interfaceC124814v7.LIZ(absSpeed, LJIIIZ);
                }
            }
        }
    }

    public final int LJJLIIIJJI(String str, String str2, NLETrack nLETrack, NLETrackSlot nLETrackSlot, boolean z) {
        Long valueOf;
        NLETrackSlot LJIILIIL;
        NLESegmentAudio nLESegmentAudio;
        long j;
        String nameId;
        long j2;
        NLESegmentVideo LJJ = NLESegmentVideo.LJJ(nLETrackSlot.LJI());
        if (LJJ != null) {
            if (z) {
                EnumC123874tb LIZJ = LJJ.LIZJ();
                o.LJIIIIZZ(LIZJ, "it.type");
                valueOf = Long.valueOf(C78926UyI.LJJJI(C124574uj.LIZJ(str2, LIZJ, C125444w8.LIZ().LIZ()).LJLJJL));
            } else {
                String LIZJ2 = LJJ.LIZIZ().LIZJ();
                o.LJIIIIZZ(LIZJ2, "it.resource.resourceFile");
                EnumC123874tb LIZJ3 = LJJ.LIZJ();
                o.LJIIIIZZ(LIZJ3, "it.type");
                valueOf = Long.valueOf(C78926UyI.LJJJI(C124574uj.LIZJ(LIZJ2, LIZJ3, C125444w8.LIZ().LIZ()).LJLJJL));
            }
            if (valueOf == null) {
                return -1;
            }
            LJJ.LIZIZ().setDuration(valueOf.longValue());
            if (z) {
                nLETrack.setExtra(LJJ.LIZIZ().LIZJ(), str2);
                NLEResourceAV LJIILL = NLEResourceAV.LJIILL(LJJ.LJ().deepClone(true));
                long j3 = LJJ.LIZJ;
                if (LJIILL == null) {
                    j2 = 0;
                } else {
                    j2 = LJIILL.LIZJ;
                }
                NLEEditorJniJNI.NLESegmentAudio_setReversedAVFile(j3, LJJ, j2, LJIILL);
                LJJ.LJIIJJI().LJIIIZ(str2);
                LJJ.LJIIJJI().setDuration(valueOf.longValue());
            }
            NLEModel nleModel = r9();
            long longValue = valueOf.longValue();
            o.LJIIIZ(nleModel, "nleModel");
            if (str != null && C124864vC.LIZJ) {
                int LIZ = C124864vC.LIZ(nleModel, nLETrackSlot);
                NLETrack LIZIZ = C141335gf.LIZIZ(nleModel);
                if (LIZIZ != null && (LJIILIIL = LIZIZ.LJIILIIL(LIZ)) != null && (nLESegmentAudio = (NLESegmentAudio) NLESegmentAudio.class.getMethod("LIZLLL", NLENode.class).invoke(null, LJIILIIL.LJI())) != null) {
                    NLEEditorJniJNI.NLESegmentAudio_setRewind(nLESegmentAudio.LIZJ, nLESegmentAudio, z);
                    if (z) {
                        NLEResourceAV LJIILL2 = NLEResourceAV.LJIILL(nLESegmentAudio.LJ().deepClone(true));
                        long j4 = nLESegmentAudio.LIZJ;
                        if (LJIILL2 == null) {
                            j = 0;
                        } else {
                            j = LJIILL2.LIZJ;
                        }
                        NLEEditorJniJNI.NLESegmentAudio_setReversedAVFile(j4, nLESegmentAudio, j, LJIILL2);
                        nLESegmentAudio.LJIIJJI().LJIIIZ(str);
                        nLESegmentAudio.LJIIJJI().setDuration(longValue);
                    }
                    if (nLESegmentAudio.LJIIL() > longValue) {
                        nLESegmentAudio.LJIJJ(longValue);
                    }
                    long LJIIL = longValue - nLESegmentAudio.LJIIL();
                    nLESegmentAudio.LJIJJ(longValue - nLESegmentAudio.LJIILIIL());
                    nLESegmentAudio.LJIJJLI(LJIIL);
                    LJIILIIL.setEndTime(nLESegmentAudio.getDuration() + LJIILIIL.getStartTime());
                }
            }
            NLEEditorJniJNI.NLESegmentAudio_setRewind(LJJ.LIZJ, LJJ, z);
            if (LJJ.LJIIL() > valueOf.longValue()) {
                LJJ.LJIJJ(valueOf.longValue());
            }
            long longValue2 = valueOf.longValue() - LJJ.LJIIL();
            LJJ.LJIJJ(valueOf.longValue() - LJJ.LJIILIIL());
            LJJ.LJIJJLI(longValue2);
            nLETrackSlot.setEndTime(LJJ.getDuration() + nLETrackSlot.getStartTime());
            if (z) {
                nameId = EnumC126814yL.REVERSE_VIDEO.getNameId();
            } else {
                nameId = EnumC126814yL.CANCEL_REVERSE.getNameId();
            }
            this.LJLIL.getKeyframeEditor().LJJJJLL(nLETrackSlot);
            g0.LJIILIIL((NLEEditor) this.LJLJI.getValue(), true, C6YK.LIZ(new C139795eB(nameId, null, null, null, null, 30)), false, false, 12);
            InterfaceC127784zu interfaceC127784zu = this.LJLJJL;
            interfaceC127784zu.seek(interfaceC127784zu.H9());
            return 0;
        }
        throw new IllegalStateException("video segment is null, invalid data");
    }
}
