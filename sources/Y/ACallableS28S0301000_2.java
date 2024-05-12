package Y;

import X.C16880lQ;
import X.C173396rH;
import X.C173416rJ;
import X.C47261Igj;
import X.C5I9;
import X.C5LC;
import X.C76800UCe;
import X.HZU;
import X.InterfaceC126004x2;
import X.InterfaceC149485to;
import X.InterfaceC45790Hy6;
import X.ORZ;
import Y.ACallableS2S1202000_2;
import Y.ACallableS34S0110000_2;
import Y.AgS120S0100000_2;
import android.content.Context;
import com.bytedance.ies.nle.editor_jni.NLEClipAlgorithmParam;
import com.bytedance.ies.nle.editor_jni.NLEMediaJniJNI;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentTransition;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLEClipAlgorithmParam;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.creative.model.music.StickPointMusicAlg;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.editorpro.datastore.EditModelProvider;
import com.ss.android.vesdk.clipparam.VEAlgorithmPath;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class ACallableS28S0301000_2 implements Callable {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS28S0301000_2 aCallableS28S0301000_2) {
        AVMusic aVMusic;
        AVMusic aVMusic2 = (AVMusic) aCallableS28S0301000_2.l0;
        if (aVMusic2 == null || (aVMusic = aVMusic2.m156clone()) == null) {
            aVMusic = (AVMusic) ORZ.LJLLLL(((C5I9) aCallableS28S0301000_2.l1).LJ);
        }
        int size = ((C5I9) aCallableS28S0301000_2.l1).LIZ().getMainTrack().LJIILLIIL().size();
        StringBuilder sb = new StringBuilder();
        Iterator<NLETrackSlot> it = ((C5I9) aCallableS28S0301000_2.l1).LIZ().getMainTrack().LJIILLIIL().iterator();
        int i = 0;
        while (it.hasNext()) {
            NLETrackSlot next = it.next();
            int i2 = i + 1;
            if (i >= 0) {
                sb.append(next.getDuration() / 1000);
                if (i < size - 1) {
                    sb.append(",");
                }
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        C5LC LIZ = HZU.LIZ();
        Context LLLLLILLIL = C16880lQ.LLLLLILLIL(((C5I9) aCallableS28S0301000_2.l1).LIZ);
        String sb2 = sb.toString();
        final AVMusic aVMusic3 = (AVMusic) aCallableS28S0301000_2.l0;
        final InterfaceC126004x2 interfaceC126004x2 = (InterfaceC126004x2) aCallableS28S0301000_2.l2;
        final C5I9 c5i9 = (C5I9) aCallableS28S0301000_2.l1;
        final int i3 = aCallableS28S0301000_2.i3;
        LIZ.LIZ(size, 0L, LLLLLILLIL, new InterfaceC149485to() { // from class: X.4zH
            @Override // X.InterfaceC149485to
            public final void LIZ(AVMusic aVMusic4) {
            }

            @Override // X.InterfaceC149485to
            public final MusicBuzModel LIZIZ() {
                CreativeModel creativeModel;
                C5I9.this.getClass();
                VideoPublishEditModel LIZIZ = C132805Jc.LIZIZ(EditModelProvider.Companion);
                if (LIZIZ != null && (creativeModel = LIZIZ.creativeModel) != null) {
                    return creativeModel.musicBuzModel;
                }
                return null;
            }
        }, aVMusic, new InterfaceC45790Hy6() { // from class: X.5IA
            @Override // X.InterfaceC45790Hy6
            public final void LJFF() {
            }

            @Override // X.InterfaceC45790Hy6
            public final void LJI() {
            }

            @Override // X.InterfaceC45790Hy6
            public final void LIZ(AVMusic aVMusic4) {
                String str;
                if (aVMusic4 == null || (str = aVMusic4.getMusicId()) == null) {
                    str = "";
                }
                C6BJ.LIZIZ(false, 3, 0, str, null, null, null, 84);
                InterfaceC126004x2 interfaceC126004x22 = interfaceC126004x2;
                if (interfaceC126004x22 != null) {
                    interfaceC126004x22.onFailed();
                }
            }

            @Override // X.InterfaceC45790Hy6
            public final void LIZIZ(Exception exc) {
                String str;
                AVMusic aVMusic4 = aVMusic3;
                if (aVMusic4 == null || (str = aVMusic4.getMusicId()) == null) {
                    str = "";
                }
                C6BJ.LIZIZ(false, 1, 0, str, null, exc, null, 84);
                InterfaceC126004x2 interfaceC126004x22 = interfaceC126004x2;
                if (interfaceC126004x22 != null) {
                    interfaceC126004x22.onFailed();
                }
            }

            @Override // X.InterfaceC45790Hy6
            public final void LIZJ(List<? extends AVMusic> list) {
                c5i9.LJ.clear();
                if (list != null) {
                    C5I9 c5i92 = c5i9;
                    Iterator<? extends AVMusic> it2 = list.iterator();
                    while (it2.hasNext()) {
                        c5i92.LJ.add(it2.next());
                    }
                }
            }

            @Override // X.InterfaceC45790Hy6
            public final void LIZLLL(final AVMusic aVMusic4) {
                NLENode nLENode;
                if (aVMusic4 == null) {
                    C6BJ.LIZIZ(false, 9, 0, "", "onDownloadMusicAlgSucc but musicModel is null", null, null, 100);
                    InterfaceC126004x2 interfaceC126004x22 = interfaceC126004x2;
                    if (interfaceC126004x22 != null) {
                        interfaceC126004x22.onFailed();
                        return;
                    }
                    return;
                }
                final C5I9 c5i92 = c5i9;
                final int i4 = i3;
                final InterfaceC126004x2 interfaceC126004x23 = interfaceC126004x2;
                c5i92.getClass();
                String LJ = C45771Hxn.LJ(aVMusic4);
                NLETrack LJIJI = C32151Nz.LJIJI(c5i92.LIZ());
                if (LJIJI == null) {
                    if (LJ != null) {
                        c5i92.LIZIZ.LJIJJLI(aVMusic4, LJ, 0L, 0L, false, EnumC124724uy.NONE);
                    } else {
                        H7C.LJI(3, "music", "initMusicTrackForSync", "no local music file");
                    }
                } else {
                    LJIJI.setExtra("AudioTrackType", "BGM");
                }
                NLETrack LJIJI2 = C32151Nz.LJIJI(c5i92.LIZ());
                if (LJIJI2 != null && (nLENode = (NLENode) ORZ.LJLLLLLL(0, LJIJI2.LJIILLIIL())) != null) {
                    nLENode.setExtra("is_editor_pro_sync_used", "true");
                }
                C79057V0z.LJIIL(c5i92.LIZ());
                c5i92.LIZIZ.LJIIL(false);
                if (c5i92.LIZ().getNleSession().Y8().LJIIL() < 0) {
                    String musicId = aVMusic4.getMusicId();
                    o.LJIIIIZZ(musicId, "musicModel.musicId");
                    C6BJ.LIZIZ(false, 13, 0, musicId, null, null, null, 116);
                    if (interfaceC126004x23 != null) {
                        interfaceC126004x23.onFailed();
                        return;
                    }
                    return;
                }
                InterfaceC126004x2 interfaceC126004x24 = new InterfaceC126004x2() { // from class: X.5IL
                    @Override // X.InterfaceC126004x2
                    public final void onFailed() {
                        String musicId2 = aVMusic4.getMusicId();
                        o.LJIIIIZZ(musicId2, "musicModel.musicId");
                        C6BJ.LIZIZ(false, 4, 0, musicId2, null, null, null, 116);
                        InterfaceC126004x2 interfaceC126004x25 = interfaceC126004x23;
                        if (interfaceC126004x25 != null) {
                            interfaceC126004x25.onFailed();
                        }
                    }

                    /* JADX WARN: Type inference failed for: r14v0, types: [X.4x1] */
                    @Override // X.InterfaceC126004x2
                    public final void LIZ(int i5) {
                        StickPointMusicAlg stickPointMusicAlg;
                        String str;
                        final C5I9 c5i93 = c5i92;
                        final AVMusic aVMusic5 = aVMusic4;
                        final int i6 = i4;
                        final InterfaceC126004x2 interfaceC126004x25 = interfaceC126004x23;
                        c5i93.LIZJ = aVMusic5;
                        c5i93.LIZLLL.LIZIZ = aVMusic5;
                        if (aVMusic5 == null || aVMusic5.getStickPointMusicAlg() == null) {
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("musicModel:");
                            LIZ2.append(aVMusic5);
                            LIZ2.append(" alg:");
                            if (aVMusic5 != null) {
                                stickPointMusicAlg = aVMusic5.getStickPointMusicAlg();
                            } else {
                                stickPointMusicAlg = null;
                            }
                            LIZ2.append(stickPointMusicAlg);
                            String LIZIZ = X1D.LIZIZ(LIZ2);
                            if (aVMusic5 == null || (str = aVMusic5.getMusicId()) == null) {
                                str = "";
                            }
                            C6BJ.LIZIZ(false, 5, 0, str, LIZIZ, null, null, 100);
                            if (interfaceC126004x25 != null) {
                                interfaceC126004x25.onFailed();
                                return;
                            }
                            return;
                        }
                        final String LJ2 = C45771Hxn.LJ(aVMusic5);
                        if (!C45771Hxn.LJI(aVMusic5, LJ2)) {
                            String musicId2 = aVMusic5.getMusicId();
                            o.LJIIIIZZ(musicId2, "musicModel.musicId");
                            C6BJ.LIZIZ(false, 7, 0, musicId2, null, null, null, 116);
                            if (interfaceC126004x25 == null) {
                                return;
                            }
                            interfaceC126004x25.onFailed();
                            return;
                        }
                        c5i93.LIZLLL.getClass();
                        final VEAlgorithmPath LIZIZ2 = C45779Hxv.LIZIZ(aVMusic5);
                        final ?? r14 = new InterfaceC126004x2() { // from class: X.4x1
                            public final /* synthetic */ int LIZJ = 0;

                            @Override // X.InterfaceC126004x2
                            public final void onFailed() {
                                InterfaceC126004x2 interfaceC126004x26 = InterfaceC126004x2.this;
                                if (interfaceC126004x26 != null) {
                                    interfaceC126004x26.onFailed();
                                }
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r11v3 */
                            @Override // X.InterfaceC126004x2
                            public final void LIZ(int i7) {
                                Throwable th;
                                NLETrack nLETrack;
                                NLESegmentVideo nLESegmentVideo;
                                NLEResourceAV LJIIIIZZ;
                                NLESegmentAudio nLESegmentAudio;
                                NLETrack nLETrack2;
                                NLETimeSpaceNode nLETimeSpaceNode;
                                NLETrackSlot nLETrackSlot;
                                NLESegmentVideo LJJ;
                                C5I9 c5i94 = c5i93;
                                int i8 = this.LIZJ;
                                VecNLEClipAlgorithmParam LJIIJJI = c5i94.LIZ().getNleSession().Y8().LJIIJJI();
                                if (C77413UZt.LJIILL(LJIIJJI)) {
                                    c5i94.LIZ().getPlayer().seek(0L);
                                } else {
                                    Iterator<NLEClipAlgorithmParam> it2 = LJIIJJI.iterator();
                                    while (it2.hasNext()) {
                                        it2.next();
                                    }
                                    VecNLETrackSPtr tracks = C79057V0z.LJJI(c5i94.LIZ()).getTracks();
                                    o.LJIIIIZZ(tracks, "editorContext.getNLEModel().tracks");
                                    Iterator<NLETrack> it3 = tracks.iterator();
                                    while (true) {
                                        th = null;
                                        if (it3.hasNext()) {
                                            nLETrack = it3.next();
                                            if (nLETrack.LJIIJ()) {
                                                break;
                                            }
                                        } else {
                                            nLETrack = null;
                                            break;
                                        }
                                    }
                                    NLETrack nLETrack3 = nLETrack;
                                    if (nLETrack3 != null) {
                                        VecNLETrackSlotSPtr LJIILLIIL = nLETrack3.LJIILLIIL();
                                        int i9 = 1000;
                                        if (LJIILLIIL != null) {
                                            Iterator<NLETrackSlot> it4 = LJIILLIIL.iterator();
                                            long j = 0;
                                            int i10 = 0;
                                            while (it4.hasNext()) {
                                                NLETrackSlot next2 = it4.next();
                                                int i11 = i10 + 1;
                                                if (i10 >= 0) {
                                                    NLETrackSlot nLETrackSlot2 = next2;
                                                    Iterator<NLEClipAlgorithmParam> it5 = LJIIJJI.iterator();
                                                    NLESegmentTransition nLESegmentTransition = th;
                                                    while (it5.hasNext()) {
                                                        NLEClipAlgorithmParam next3 = it5.next();
                                                        if (NLEMediaJniJNI.NLEClipAlgorithmParam_index_get(next3.LIZ, next3) == i10) {
                                                            EnumC123874tb LJFF = nLETrackSlot2.LJI().LIZIZ().LJFF();
                                                            EnumC123874tb enumC123874tb = EnumC123874tb.IMAGE;
                                                            if (LJFF == enumC123874tb) {
                                                                nLETrackSlot2.setDuration(Math.max(nLETrackSlot2.getDuration(), i9 * NLEMediaJniJNI.NLEClipAlgorithmParam_range_get(next3.LIZ, next3)));
                                                                nLETrackSlot2.LJI().LIZIZ().setDuration(nLETrackSlot2.getDuration());
                                                            }
                                                            if (i8 != 0) {
                                                                if (i8 == 1 && (LJJ = NLESegmentVideo.LJJ(nLETrackSlot2.LJI())) != null) {
                                                                    long j2 = i9;
                                                                    LJJ.LJIJJLI(NLEMediaJniJNI.NLEClipAlgorithmParam_trimIn_get(next3.LIZ, next3) * j2);
                                                                    LJJ.LJIJJ(NLEMediaJniJNI.NLEClipAlgorithmParam_trimOut_get(next3.LIZ, next3) * j2);
                                                                    LJJ.setAbsSpeed(1.0f);
                                                                    nLETrackSlot2.setRotation(0.0f);
                                                                    nLETrackSlot2.setEnable(true);
                                                                    nLETrackSlot2.setStartTime(j);
                                                                    nLETrackSlot2.setEndTime((LJJ.LJIIL() - LJJ.LJIILIIL()) + nLETrackSlot2.getStartTime());
                                                                    nLETrackSlot2.LJIIJJI(nLESegmentTransition);
                                                                    j = nLETrackSlot2.getEndTime();
                                                                }
                                                            } else {
                                                                NLESegmentVideo LJJ2 = NLESegmentVideo.LJJ(nLETrackSlot2.LJI());
                                                                if (LJJ2 != null) {
                                                                    if (nLETrackSlot2.LJI().LIZIZ().LJFF() == enumC123874tb) {
                                                                        nLETrackSlot2.setDuration(NLEMediaJniJNI.NLEClipAlgorithmParam_range_get(next3.LIZ, next3) * i9);
                                                                        nLETrackSlot2.LJI().LIZIZ().setDuration(nLETrackSlot2.getDuration());
                                                                        NLESegmentVideo LJJ3 = NLESegmentVideo.LJJ(nLETrackSlot2.LJI());
                                                                        if (LJJ3 != null) {
                                                                            LJJ3.LJIJJLI(0L);
                                                                            LJJ3.LJIJJ(nLETrackSlot2.getDuration());
                                                                        }
                                                                    } else {
                                                                        long NLEClipAlgorithmParam_range_get = NLEMediaJniJNI.NLEClipAlgorithmParam_range_get(next3.LIZ, next3);
                                                                        if (NLEClipAlgorithmParam_range_get > 0 && LJJ2.getDuration() > 0) {
                                                                            long j3 = 2;
                                                                            long j4 = NLEClipAlgorithmParam_range_get * 1000;
                                                                            long LJIIL = (LJJ2.LJIIL() / j3) - (j4 / j3);
                                                                            if (LJIIL <= 0) {
                                                                                LJIIL = 0;
                                                                            }
                                                                            LJJ2.LJIJJLI(LJIIL);
                                                                            LJJ2.LJIJJ(LJJ2.LJIILIIL() + j4);
                                                                        }
                                                                    }
                                                                    LJJ2.setAbsSpeed(1.0f);
                                                                    nLETrackSlot2.setRotation(0.0f);
                                                                    nLETrackSlot2.setScale(1.0f);
                                                                    nLETrackSlot2.setTransformX(0.0f);
                                                                    nLETrackSlot2.setTransformY(0.0f);
                                                                    nLETrackSlot2.setEnable(true);
                                                                    nLETrackSlot2.setStartTime(j);
                                                                    nLETrackSlot2.setEndTime((LJJ2.LJIIL() - LJJ2.LJIILIIL()) + nLETrackSlot2.getStartTime());
                                                                    nLESegmentTransition = 0;
                                                                    nLETrackSlot2.LJIIJJI(null);
                                                                    j = nLETrackSlot2.getEndTime();
                                                                }
                                                            }
                                                        }
                                                        i9 = 1000;
                                                        nLESegmentTransition = nLESegmentTransition;
                                                    }
                                                    i10 = i11;
                                                    th = nLESegmentTransition;
                                                } else {
                                                    C47261Igj.LJJJJJ();
                                                    throw th;
                                                }
                                            }
                                            C124864vC.LIZLLL(C79057V0z.LJJI(c5i94.LIZ()));
                                            C124864vC.LIZJ(C79057V0z.LJJI(c5i94.LIZ()), c5i94.LIZ);
                                            C79057V0z.LJIIL(c5i94.LIZ());
                                        }
                                    }
                                    NLETrack LJIJI3 = C32151Nz.LJIJI(c5i94.LIZ());
                                    if (LJIJI3 != null && (nLETrackSlot = LJIJI3.LJIILLIIL().get(0)) != null) {
                                        nLETrackSlot.setStartTime(0L);
                                        nLETrackSlot.setEndTime(c5i94.LIZ().getMainTrack().getMeasuredEndTime());
                                        NLESegmentAudio LIZLLL = NLESegmentAudio.LIZLLL(nLETrackSlot.LJI());
                                        if (LIZLLL != null) {
                                            LIZLLL.LJ().setDuration(HOH.LIZIZ(6, LIZLLL.LIZIZ().LIZJ()) * 1000);
                                        }
                                    }
                                    if (i8 == 0) {
                                        VecNLETrackSPtr tracks2 = C79057V0z.LJJI(c5i94.LIZ()).getTracks();
                                        o.LJIIIIZZ(tracks2, "editorContext.getNLEModel().tracks");
                                        Iterator<NLETrack> it6 = tracks2.iterator();
                                        while (true) {
                                            if (it6.hasNext()) {
                                                nLETrack2 = it6.next();
                                                if (C124574uj.LJJIL(nLETrack2)) {
                                                    break;
                                                }
                                            } else {
                                                nLETrack2 = null;
                                                break;
                                            }
                                        }
                                        NLETrack nLETrack4 = nLETrack2;
                                        if (nLETrack4 != null) {
                                            long j5 = 1000;
                                            if (nLETrack4.getMeasuredEndTime() / j5 > c5i94.LIZ().getMainTrack().getMeasuredEndTime() / j5 && (nLETimeSpaceNode = (NLETimeSpaceNode) ORZ.LLFII(nLETrack4.LJIILLIIL())) != null) {
                                                nLETimeSpaceNode.setMeasuredEndTime(c5i94.LIZ().getMainTrack().getMeasuredEndTime());
                                                nLETimeSpaceNode.setEndTime(c5i94.LIZ().getMainTrack().getMeasuredEndTime());
                                            }
                                        }
                                    }
                                    if (!c5i94.LIZ().getMainTrack().hasExtra("is_maintrack_mute") || !Boolean.parseBoolean(c5i94.LIZ().getMainTrack().getExtra("is_maintrack_mute"))) {
                                        c5i94.LIZ().getEditor().LJJIJIIJI(true, EnumC124724uy.COMMIT);
                                    }
                                    Iterator<NLETrackSlot> it7 = c5i94.LIZ().getMainTrack().LJIILLIIL().iterator();
                                    while (it7.hasNext()) {
                                        NLETrackSlot slot = it7.next();
                                        o.LJIIIIZZ(slot, "slot");
                                        if (C124614un.LJIILIIL(slot) && C124574uj.LJJJJJ(slot) && (LJIIIIZZ = C124614un.LJIIIIZZ(slot)) != null && LJIIIIZZ.LJFF() == EnumC123874tb.VIDEO && LJIIIIZZ.getDuration() < slot.getDuration() && (nLESegmentAudio = (NLESegmentAudio) NLESegmentVideo.class.getMethod("LJJ", NLENode.class).invoke(null, slot.LJI())) != null) {
                                            nLESegmentAudio.setAbsSpeed(((float) LJIIIIZZ.getDuration()) / ((float) slot.getDuration()));
                                            if (nLESegmentAudio.LJIIL() > LJIIIIZZ.getDuration()) {
                                                nLESegmentAudio.LJIJJ(LJIIIIZZ.getDuration());
                                            }
                                        }
                                        if (!slot.hasExtra("extra_associated_vc_slot_id") && (nLESegmentVideo = (NLESegmentVideo) NLESegmentVideo.class.getMethod("LJJ", NLENode.class).invoke(null, slot.LJI())) != null) {
                                            nLESegmentVideo.LJJIIJZLJL(true);
                                        }
                                    }
                                    if (!((Boolean) C126574xx.LIZ.getValue()).booleanValue()) {
                                        C124614un.LJIILLIIL(C79057V0z.LJJI(c5i94.LIZ()));
                                    }
                                    c5i94.LIZ().getPlayer().da(Boolean.TRUE, new AqS152S0100000_2(c5i94, 721));
                                }
                                InterfaceC126004x2 interfaceC126004x26 = InterfaceC126004x2.this;
                                if (interfaceC126004x26 != null) {
                                    interfaceC126004x26.LIZ(i7);
                                }
                            }
                        };
                        C10H c10h = new C10H();
                        ((ArrayList) c5i93.LJFF).add(c10h);
                        C10K.LIZIZ(new ACallableS2S1202000_2(c5i93, LJ2, LIZIZ2, i6, 0), C10K.LJI, c10h.LIZIZ()).LJ(new C10I() { // from class: X.5IM
                            @Override // X.C10I
                            public final Object then(C10K<OSZ<C143235jj, Integer>> c10k) {
                                Object obj;
                                String musicId3;
                                String musicId4;
                                String musicId5;
                                String str2 = "";
                                if (c10k == null || c10k.LJIIJJI() == null) {
                                    AVMusic aVMusic6 = AVMusic.this;
                                    if (aVMusic6 != null && (musicId3 = aVMusic6.getMusicId()) != null) {
                                        str2 = musicId3;
                                    }
                                    obj = null;
                                    C6BJ.LIZIZ(false, 10, 0, str2, null, null, new C143235jj(-1, LJ2, null, LIZIZ2, Integer.valueOf(i6), null, null, null, null, 484), 52);
                                    InterfaceC126004x2 interfaceC126004x26 = r14;
                                    if (interfaceC126004x26 != null) {
                                        interfaceC126004x26.onFailed();
                                    }
                                } else if (c10k.LJIIJJI().getFirst().LIZ < 0) {
                                    int intValue = c10k.LJIIJJI().getSecond().intValue();
                                    int i7 = c10k.LJIIJJI().getFirst().LIZ;
                                    AVMusic aVMusic7 = AVMusic.this;
                                    if (aVMusic7 != null && (musicId5 = aVMusic7.getMusicId()) != null) {
                                        str2 = musicId5;
                                    }
                                    obj = null;
                                    C6BJ.LIZIZ(false, intValue, i7, str2, null, null, c10k.LJIIJJI().getFirst(), 48);
                                    InterfaceC126004x2 interfaceC126004x27 = r14;
                                    if (interfaceC126004x27 != null) {
                                        interfaceC126004x27.onFailed();
                                    }
                                } else {
                                    int i8 = c10k.LJIIJJI().getFirst().LIZ;
                                    AVMusic aVMusic8 = AVMusic.this;
                                    if (aVMusic8 != null && (musicId4 = aVMusic8.getMusicId()) != null) {
                                        str2 = musicId4;
                                    }
                                    obj = null;
                                    C6BJ.LIZIZ(true, 0, i8, str2, null, null, c10k.LJIIJJI().getFirst(), 48);
                                    InterfaceC126004x2 interfaceC126004x28 = r14;
                                    if (interfaceC126004x28 != null) {
                                        interfaceC126004x28.LIZ(c10k.LJIIJJI().getFirst().LIZ);
                                    }
                                }
                                return obj;
                            }
                        }, C10K.LJIIIIZZ, c10h.LIZIZ());
                    }
                };
                C10H c10h = new C10H();
                ((ArrayList) c5i92.LJFF).add(c10h);
                C10K.LIZIZ(new ACallableS34S0110000_2(c5i92, 0), C10K.LJI, c10h.LIZIZ()).LJ(new AgS120S0100000_2(interfaceC126004x24, 20), C10K.LJIIIIZZ, c10h.LIZIZ());
            }

            @Override // X.InterfaceC45790Hy6
            public final void LJ(Exception exc) {
                String str;
                AVMusic aVMusic4 = aVMusic3;
                if (aVMusic4 == null || (str = aVMusic4.getMusicId()) == null) {
                    str = "";
                }
                C6BJ.LIZIZ(false, 2, 0, str, null, exc, null, 84);
                InterfaceC126004x2 interfaceC126004x22 = interfaceC126004x2;
                if (interfaceC126004x22 != null) {
                    interfaceC126004x22.onFailed();
                }
            }

            @Override // X.InterfaceC45790Hy6
            public final void LJII(AVMusic aVMusic4) {
                String str;
                if (aVMusic4 == null || (str = aVMusic4.getMusicId()) == null) {
                    str = "";
                }
                C6BJ.LIZIZ(false, 5, 0, str, null, null, null, 116);
                InterfaceC126004x2 interfaceC126004x22 = interfaceC126004x2;
                if (interfaceC126004x22 != null) {
                    interfaceC126004x22.onFailed();
                }
            }
        }, sb2);
        return C76800UCe.LIZ;
    }

    public static final Object call$1(ACallableS28S0301000_2 aCallableS28S0301000_2) {
        CategoryEffectModel categoryEffects;
        Effect effect = (Effect) aCallableS28S0301000_2.l0;
        if (effect != null) {
            C173396rH c173396rH = (C173396rH) aCallableS28S0301000_2.l1;
            int i = aCallableS28S0301000_2.i3;
            CategoryPageModel categoryPageModel = c173396rH.LJLJLJ;
            if (categoryPageModel != null && (categoryEffects = categoryPageModel.getCategoryEffects()) != null) {
                List<? extends Effect> LLJILJILJ = ORZ.LLJILJILJ(categoryEffects.getEffects());
                ListProtector.set(LLJILJILJ, i - 1, effect);
                categoryEffects.setEffects(LLJILJILJ);
            }
        }
        ((C173396rH) aCallableS28S0301000_2.l1).LJLZ(aCallableS28S0301000_2.i3, 1);
        ((C173396rH) aCallableS28S0301000_2.l1).LJZ(aCallableS28S0301000_2.i3);
        C173416rJ c173416rJ = ((C173396rH) aCallableS28S0301000_2.l1).LJLLILLLL;
        if (c173416rJ != null) {
            c173416rJ.LLJILJILJ((Effect) aCallableS28S0301000_2.l2);
            return C76800UCe.LIZ;
        }
        return null;
    }

    public ACallableS28S0301000_2(int i, Object obj, Object obj2, Object obj3, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.l1 = obj3;
        this.l2 = obj2;
        this.i3 = i;
    }
}
