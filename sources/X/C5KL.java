package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVideoEffect;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLEVideoEffectSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.vesdk.clipparam.VEClipAlgorithmParam;
import com.ss.android.vesdk.filterparam.VEImageTransformFilterParam;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.5KL, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5KL {
    public static final /* synthetic */ int LIZLLL = 0;
    public InterfaceC153045zY LIZ;
    public boolean LIZIZ;
    public final List<Integer> LIZJ = new ArrayList();

    public final void LIZ() {
        if (this.LIZ == null || C77413UZt.LJIILL(this.LIZJ)) {
            return;
        }
        int size = ((ArrayList) this.LIZJ).size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = ((Number) ListProtector.get(this.LIZJ, i)).intValue();
        }
        ((ArrayList) this.LIZJ).clear();
        InterfaceC153045zY interfaceC153045zY = this.LIZ;
        o.LJI(interfaceC153045zY);
        interfaceC153045zY.LLJZ(iArr);
    }

    public final void LIZIZ(List<? extends VideoSegment> list) {
        C122034qd LJJI;
        boolean z;
        C133765Mu c133765Mu;
        C122034qd LJI;
        InterfaceC122994sB LIZJ;
        NLEModel LJJ;
        NLETrack mainTrack;
        EnumC123874tb enumC123874tb;
        C43117Gw5.LIZ.getClass();
        if (C45771Hxn.LIZIZ && this.LIZ != null) {
            boolean z2 = false;
            if (list == null || list.isEmpty()) {
                return;
            }
            InterfaceC153045zY interfaceC153045zY = this.LIZ;
            if (interfaceC153045zY != null && (LJJ = C17N.LJJ(interfaceC153045zY)) != null && (mainTrack = LJJ.getMainTrack()) != null) {
                VecNLETrackSlotSPtr LJIILL = mainTrack.LJIILL();
                if (!LJIILL.isEmpty()) {
                    Iterator<NLETrackSlot> it = LJIILL.iterator();
                    while (it.hasNext()) {
                        NLETrackSlot it2 = it.next();
                        o.LJIIIIZZ(it2, "it");
                        NLESegmentVideo LJJ2 = NLESegmentVideo.LJJ(it2.LJI());
                        if (LJJ2 != null) {
                            NLEResourceNode LIZIZ = LJJ2.LIZIZ();
                            if (LIZIZ != null) {
                                enumC123874tb = LIZIZ.LJFF();
                            } else {
                                enumC123874tb = null;
                            }
                            if (enumC123874tb == EnumC123874tb.IMAGE) {
                                VecNLEVideoEffectSPtr LJIIJ = it2.LJIIJ();
                                if (LJIIJ.isEmpty()) {
                                    continue;
                                } else {
                                    Iterator<NLEVideoEffect> it3 = LJIIJ.iterator();
                                    while (it3.hasNext()) {
                                        NLEVideoEffect it4 = it3.next();
                                        o.LJIIIIZZ(it4, "it");
                                        if (C126194xL.LIZ(it4)) {
                                            return;
                                        }
                                    }
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
            }
            InterfaceC153045zY interfaceC153045zY2 = this.LIZ;
            if ((interfaceC153045zY2 instanceof C133765Mu) && (c133765Mu = (C133765Mu) interfaceC153045zY2) != null && (LJI = c133765Mu.LJI()) != null && (LIZJ = LJI.LIZJ()) != null) {
                LIZJ.LJJIIZI();
            }
            if (!this.LIZIZ) {
                return;
            }
            if (!C77413UZt.LJIILL(list)) {
                o.LJI(list);
                for (VideoSegment videoSegment : list) {
                    if (!videoSegment.isDeleted) {
                        C43117Gw5 c43117Gw5 = C43117Gw5.LIZ;
                        String LJII = videoSegment.LJII(false);
                        c43117Gw5.getClass();
                        if (!C43117Gw5.LJIIIZ(LJII)) {
                            int i = VEClipAlgorithmParam.BINGO_EFFECT_ZOOMIN;
                            InterfaceC153045zY interfaceC153045zY3 = this.LIZ;
                            if (interfaceC153045zY3 == null || (LJJI = C17N.LJJI(interfaceC153045zY3)) == null) {
                                return;
                            }
                            C122104qk c122104qk = new C122104qk();
                            C115524g8 c115524g8 = new C115524g8(OJ4.LJJJJ(ORZ.LJLIIIL(list), C5KM.LJLIL));
                            long j = 0;
                            while (c115524g8.hasNext()) {
                                VideoSegment videoSegment2 = (VideoSegment) c115524g8.next();
                                long LJ = videoSegment2.LJ() - videoSegment2.LJIIIZ();
                                String LJII2 = videoSegment2.LJII(z2);
                                if (!C44694HgQ.LJIL(LJII2) && OR7.LLLIILIL(new File(LJII2)).length() == 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (C44694HgQ.LJIJI(LJII2, z)) {
                                    videoSegment2.imageTranslationType = i;
                                    VEImageTransformFilterParam LIZ = C5K7.LIZ(i);
                                    if (LIZ != null) {
                                        C5K9 c5k9 = new C5K9();
                                        c122104qk.LIZ.add(c5k9);
                                        C120774ob c120774ob = new C120774ob();
                                        c120774ob.LIZJ = LIZ.beginScale;
                                        c120774ob.LIZLLL = LIZ.endScale;
                                        c120774ob.LIZ = j;
                                        c120774ob.LIZIZ = j + LJ;
                                        c5k9.LJIILL = c120774ob;
                                        c5k9.LJIILIIL = LJII2;
                                    }
                                } else {
                                    int i2 = VEClipAlgorithmParam.BINGO_EFFECT_ZOOMOUT;
                                    if (i == i2) {
                                        i2 = VEClipAlgorithmParam.BINGO_EFFECT_ZOOMIN;
                                    }
                                    i = i2;
                                }
                                j += LJ;
                                z2 = false;
                            }
                            if (!(!c122104qk.LIZ.isEmpty())) {
                                return;
                            }
                            LJJI.LIZJ().LJJJJL(c122104qk);
                            return;
                        }
                    }
                }
            }
            Iterator<? extends VideoSegment> it5 = list.iterator();
            while (it5.hasNext()) {
                it5.next().imageTranslationType = VEClipAlgorithmParam.BINGO_EFFECT_NULL;
            }
        }
    }

    public final void LIZJ(VideoSegment videoSegment, boolean z) {
        InterfaceC153045zY interfaceC153045zY;
        VEImageTransformFilterParam LIZ;
        C133765Mu c133765Mu;
        C122034qd LJI;
        InterfaceC122994sB LIZJ;
        C43117Gw5.LIZ.getClass();
        if (!C45771Hxn.LIZIZ || (interfaceC153045zY = this.LIZ) == null || videoSegment == null) {
            return;
        }
        if (z) {
            if ((interfaceC153045zY instanceof C133765Mu) && (c133765Mu = (C133765Mu) interfaceC153045zY) != null && (LJI = c133765Mu.LJI()) != null && (LIZJ = LJI.LIZJ()) != null) {
                LIZJ.LJJIIZI();
            }
        } else {
            LIZ();
        }
        if (!this.LIZIZ || !C44694HgQ.LJIJI(videoSegment.LJII(false), false) || (LIZ = C5K7.LIZ(videoSegment.imageTranslationType)) == null) {
            return;
        }
        if (z) {
            InterfaceC153045zY interfaceC153045zY2 = this.LIZ;
            if (interfaceC153045zY2 == null) {
                return;
            }
            C122104qk c122104qk = new C122104qk();
            C5K9 c5k9 = new C5K9();
            C120774ob c120774ob = new C120774ob();
            c120774ob.LIZJ = LIZ.beginScale;
            c120774ob.LIZLLL = LIZ.endScale;
            c120774ob.LIZ = 0L;
            c120774ob.LIZIZ = videoSegment.LJ() - videoSegment.LJIIIZ();
            c5k9.LJIILL = c120774ob;
            c5k9.LJIILIIL = videoSegment.LJII(false);
            c122104qk.LIZ.add(c5k9);
            C122034qd LJJI = C17N.LJJI(interfaceC153045zY2);
            if (LJJI != null) {
                LJJI.LIZJ().LJJJJL(c122104qk);
                return;
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        InterfaceC153045zY interfaceC153045zY3 = this.LIZ;
        o.LJI(interfaceC153045zY3);
        int LLLIIII = interfaceC153045zY3.LLLIIII(LIZ, (int) videoSegment.LJIIIZ(), (int) (videoSegment.LJ() - videoSegment.LJIIIZ()));
        InterfaceC153045zY interfaceC153045zY4 = this.LIZ;
        o.LJI(interfaceC153045zY4);
        interfaceC153045zY4.updateTrackFilterParam(LLLIIII, LIZ);
        ((ArrayList) this.LIZJ).add(Integer.valueOf(LLLIIII));
    }
}
