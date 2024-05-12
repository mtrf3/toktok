package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import defpackage.t1;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.5gi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C141365gi {
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.OSZ LIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r6) {
        /*
            java.lang.String r0 = r6.nleData
            boolean r0 = X.C78685UuP.LJJJZ(r0)
            r5 = 0
            r3 = 0
            if (r0 == 0) goto L61
            X.C5K0.LIZIZ()
            com.bytedance.ies.nle.editor_jni.NLEEditor r1 = new com.bytedance.ies.nle.editor_jni.NLEEditor
            r1.<init>()
            java.lang.String r0 = r6.nleData
            r1.LJI(r0)
            com.bytedance.ies.nle.editor_jni.NLEModel r0 = r1.LJ()
            com.bytedance.ies.nle.editor_jni.NLETrack r0 = r0.getMainTrack()
            if (r0 == 0) goto L61
            com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr r1 = r0.LJIILL()
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C32I.LJJL(r1, r0)
            r2.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L35:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L49
            java.lang.Object r0 = r1.next()
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r0 = (com.bytedance.ies.nle.editor_jni.NLETrackSlot) r0
            com.bytedance.ies.nle.editor_jni.NLESegment r0 = r0.LJI()
            r2.add(r0)
            goto L35
        L49:
            java.util.Iterator r2 = r2.iterator()
            r1 = 0
        L4e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L62
            java.lang.Object r0 = r2.next()
            com.bytedance.ies.nle.editor_jni.NLESegment r0 = (com.bytedance.ies.nle.editor_jni.NLESegment) r0
            int r1 = r1 + 1
            long r3 = r0.getDuration()
            goto L4e
        L61:
            r1 = 0
        L62:
            X.OSZ r2 = new X.OSZ
            r0 = 1
            if (r1 != r0) goto L68
            r5 = 1
        L68:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r2.<init>(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C141365gi.LIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):X.OSZ");
    }

    public static final boolean LIZIZ(VideoPublishEditModel model) {
        Integer num;
        o.LJIIIZ(model, "model");
        AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(model.creativeModel.musicBuzModel);
        if (extractAVMusic != null && CommerceMediaServiceImpl.LIZJ().LIZ() && !extractAVMusic.isCommerceMusic()) {
            return false;
        }
        OSZ LIZ = LIZ(model);
        if (((((Boolean) LIZ.getFirst()).booleanValue() && LJ(((Number) LIZ.getSecond()).longValue(), model)) || (!((Boolean) LIZ.getFirst()).booleanValue() && (model.getVideoEditorType() == 10 || model.getVideoEditorType() == 11))) && !H7R.LJJJJL(model) && !model.isCurrentAutoCutMode() && !H7R.LJJLIIIJL(model) && !H7R.LJJJLIIL(model) && model.hasMusic() && model.musicVolume > 0.0f && !C42000Ge4.LJIIJ(model) && !model.isTimeEffectApply() && !model.creativeModel.onThisDayData.isFromOnThisDay() && !C1DG.LJIIIIZZ() && !((RBX) HG3.LJIILL()).getCurUser().isAccuratePrivateAccount() && C19N.LJ("enable_upload_ugc_template_user", false) && LJI(model) && model.getVideoLength() <= 30000) {
            CreativeModel creativeModel = model.creativeModel;
            if ((!creativeModel.draftInfoModel.isDraft || (((num = creativeModel.ugcTemplateData.ugcTemplateVersion) != null && num.intValue() == 1) || model.isFromRestoreRecover)) && model.getEditorProModel().getMagicResourcePaths().isEmpty() && !o.LJ(model.mShootWay, "lv_sync") && ((ArrayList) C42000Ge4.LJIIIIZZ(model)).isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean LIZJ(VideoPublishEditModel model) {
        Integer num;
        o.LJIIIZ(model, "model");
        AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(model.creativeModel.musicBuzModel);
        if (extractAVMusic != null && ((CommerceMediaServiceImpl.LIZJ().LIZ() && !extractAVMusic.isCommerceMusic()) || extractAVMusic.isSpeechToSong() || extractAVMusic.musicType == 5)) {
            return false;
        }
        OSZ LIZ = LIZ(model);
        if (!((Boolean) LIZ.getFirst()).booleanValue() || !LJ(((Number) LIZ.getSecond()).longValue(), model)) {
            if (!((Boolean) LIZ.getFirst()).booleanValue() && ((model.getVideoEditorType() == 10 || model.getVideoEditorType() == 11) && !H7R.LJJJJL(model) && !model.isCurrentAutoCutMode() && !C42000Ge4.LJIIJ(model) && !model.isTimeEffectApply() && !H7R.LJJJLIIL(model) && !model.creativeModel.onThisDayData.isFromOnThisDay() && model.hasMusic() && model.musicVolume > 0.0f && ((!C141375gj.LIZ() || (C19N.LJ("enable_upload_ugc_template_user", false) && LJI(model) && model.getVideoLength() <= 30000 && !o.LJ(LIZLLL(model), Boolean.TRUE))) && !C1DG.LJIIIIZZ()))) {
                CreativeModel creativeModel = model.creativeModel;
                if ((!creativeModel.draftInfoModel.isDraft || (((num = creativeModel.ugcTemplateData.ugcTemplateVersion) != null && num.intValue() == 1) || model.isFromRestoreRecover)) && model.getEditorProModel().getMagicResourcePaths().isEmpty() && !o.LJ(model.mShootWay, "lv_sync") && ((ArrayList) C42000Ge4.LJIIIIZZ(model)).isEmpty()) {
                }
            }
            return false;
        }
        return true;
    }

    public static final Boolean LIZLLL(VideoPublishEditModel model) {
        String str;
        boolean z;
        Object obj;
        Object obj2;
        String str2;
        String str3;
        NLETrackSlot nLETrackSlot;
        NLETrackSlot nLETrackSlot2;
        boolean z2;
        boolean z3;
        NLESegment nLESegment;
        NLESegment nLESegment2;
        Long l;
        Long l2;
        long j;
        long j2;
        Boolean bool;
        Boolean bool2;
        Long l3;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        float f;
        String str4;
        String str5;
        NLEResourceNode LIZIZ;
        NLEResourceNode LIZIZ2;
        o.LJIIIZ(model, "model");
        Long l4 = null;
        if (!H7R.LJJLIIIJL(model) || (str = model.nleData) == null || str.length() == 0) {
            return null;
        }
        NLEEditor nLEEditor = new NLEEditor();
        nLEEditor.LJI(model.nleData);
        NLEEditor nLEEditor2 = new NLEEditor();
        String LJIJI = C39579Fg7.LJIJI(model.creativeModel.ugcTemplateData.originalNormalizedNLEPath);
        if (LJIJI == null || LJIJI.length() == 0) {
            return null;
        }
        nLEEditor2.LJI(LJIJI);
        NLEModel LJ = nLEEditor2.LJ();
        NLEModel LJ2 = nLEEditor.LJ();
        if (LJ != null && LJ2 != null) {
            long maxTargetEnd = LJ.getMaxTargetEnd();
            long maxTargetEnd2 = LJ2.getMaxTargetEnd();
            Iterator LIZJ = t1.LIZJ(LJ, "originalNLEModel.tracks");
            while (true) {
                if (LIZJ.hasNext()) {
                    obj = LIZJ.next();
                    if (o.LJ(((NLENode) obj).getExtra("AudioTrackType"), EnumC122254qz.BGM.name())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            NLETrack nLETrack = (NLETrack) obj;
            Iterator LIZJ2 = t1.LIZJ(LJ2, "curNLEModel.tracks");
            while (true) {
                if (LIZJ2.hasNext()) {
                    obj2 = LIZJ2.next();
                    if (o.LJ(((NLENode) obj2).getExtra("AudioTrackType"), EnumC122254qz.BGM.name())) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            NLETrack nLETrack2 = (NLETrack) obj2;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("original nle model: ");
            if (nLETrack != null) {
                str2 = nLETrack.toJsonString();
            } else {
                str2 = null;
            }
            LIZ.append(str2);
            C5GW.LIZ(X1D.LIZIZ(LIZ));
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("current nle model: ");
            if (nLETrack2 != null) {
                str3 = nLETrack2.toJsonString();
            } else {
                str3 = null;
            }
            LIZ2.append(str3);
            C5GW.LIZ(X1D.LIZIZ(LIZ2));
            if (nLETrack != null) {
                nLETrackSlot = (NLETrackSlot) ORZ.LJLLLL(nLETrack.LJIILL());
            } else {
                nLETrackSlot = null;
            }
            if (nLETrack2 != null) {
                nLETrackSlot2 = (NLETrackSlot) ORZ.LJLLLL(nLETrack2.LJIILL());
            } else {
                nLETrackSlot2 = null;
            }
            if (nLETrack != null && nLETrack.getEnable() && nLETrackSlot != null && nLETrackSlot.getEnable()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (nLETrack2 != null && nLETrack2.getEnable() && nLETrackSlot2 != null && nLETrackSlot2.getEnable()) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (nLETrackSlot != null) {
                nLESegment = nLETrackSlot.LJI();
            } else {
                nLESegment = null;
            }
            NLESegmentAudio LIZLLL = NLESegmentAudio.LIZLLL(nLESegment);
            if (nLETrackSlot2 != null) {
                nLESegment2 = nLETrackSlot2.LJI();
            } else {
                nLESegment2 = null;
            }
            NLESegmentAudio LIZLLL2 = NLESegmentAudio.LIZLLL(nLESegment2);
            if (z2 == z3) {
                if (nLETrackSlot != null) {
                    l = Long.valueOf(nLETrackSlot.getStartTime());
                } else {
                    l = null;
                }
                if (nLETrackSlot2 != null) {
                    l2 = Long.valueOf(nLETrackSlot2.getStartTime());
                } else {
                    l2 = null;
                }
                if (o.LJ(l, l2)) {
                    long j8 = 0;
                    if (nLETrackSlot != null) {
                        j = nLETrackSlot.getMeasuredEndTime();
                    } else {
                        j = 0;
                    }
                    if (nLETrackSlot2 != null) {
                        j2 = nLETrackSlot2.getMeasuredEndTime();
                    } else {
                        j2 = 0;
                    }
                    if (Math.abs(j - j2) < 1000) {
                        if (LIZLLL != null) {
                            bool = Boolean.valueOf(LIZLLL.getEnable());
                        } else {
                            bool = null;
                        }
                        if (LIZLLL2 != null) {
                            bool2 = Boolean.valueOf(LIZLLL2.getEnable());
                        } else {
                            bool2 = null;
                        }
                        if (o.LJ(bool, bool2)) {
                            if (LIZLLL != null) {
                                l3 = Long.valueOf(LIZLLL.LJIILIIL());
                            } else {
                                l3 = null;
                            }
                            if (LIZLLL2 != null) {
                                l4 = Long.valueOf(LIZLLL2.LJIILIIL());
                            }
                            if (o.LJ(l3, l4)) {
                                if (LIZLLL != null) {
                                    j3 = LIZLLL.LJIIL();
                                    j4 = LIZLLL.LJIILIIL();
                                } else {
                                    j3 = 0;
                                    j4 = 0;
                                }
                                long j9 = j3 - j4;
                                if (nLETrackSlot != null) {
                                    j5 = nLETrackSlot.getStartTime();
                                } else {
                                    j5 = 0;
                                }
                                long min = Math.min(j9, maxTargetEnd - j5);
                                if (LIZLLL2 != null) {
                                    j6 = LIZLLL2.LJIIL();
                                    j7 = LIZLLL2.LJIILIIL();
                                } else {
                                    j6 = 0;
                                    j7 = 0;
                                }
                                long j10 = j6 - j7;
                                if (nLETrackSlot2 != null) {
                                    j8 = nLETrackSlot2.getStartTime();
                                }
                                if (Math.abs(min - Math.min(j10, maxTargetEnd2 - j8)) < 1000) {
                                    float f2 = 0.0f;
                                    if (LIZLLL2 != null) {
                                        f = LIZLLL2.LJIILJJIL();
                                    } else {
                                        f = 0.0f;
                                    }
                                    if (LIZLLL != null) {
                                        f2 = LIZLLL.LJIILJJIL();
                                    }
                                    if (Math.abs(f - f2) < 0.01f) {
                                        if (LIZLLL != null && (LIZIZ2 = LIZLLL.LIZIZ()) != null) {
                                            str4 = LIZIZ2.getExtra("biz_res_id");
                                        } else {
                                            str4 = null;
                                        }
                                        if (LIZLLL2 != null && (LIZIZ = LIZLLL2.LIZIZ()) != null) {
                                            str5 = LIZIZ.getExtra("biz_res_id");
                                        } else {
                                            str5 = null;
                                        }
                                        if (o.LJ(str4, str5)) {
                                            z = true;
                                            StringBuilder LIZ3 = X1D.LIZ();
                                            LIZ3.append("original nle model equals to current nle model: ");
                                            LIZ3.append(z);
                                            H7B.LJ(X1D.LIZIZ(LIZ3));
                                            return Boolean.valueOf(z);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        z = false;
        StringBuilder LIZ32 = X1D.LIZ();
        LIZ32.append("original nle model equals to current nle model: ");
        LIZ32.append(z);
        H7B.LJ(X1D.LIZIZ(LIZ32));
        return Boolean.valueOf(z);
    }

    public static final boolean LJFF(VideoPublishEditModel model) {
        o.LJIIIZ(model, "model");
        if (!C141375gj.LIZ() || !C19N.LJ("enable_upload_ugc_template_user", false)) {
            return false;
        }
        if (model.creativeModel.ugcTemplateData.isUgcTemplateFromAnchor && o.LJ(LIZLLL(model), Boolean.TRUE)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0076, code lost:
    
        if (r4.editMusicSyncMode != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJI(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4) {
        /*
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r1 = r4.deepCopyFinalVideoList()
            java.lang.String r0 = "model.deepCopyFinalVideoList()"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.util.Iterator r1 = r1.iterator()
        L12:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L2e
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension r0 = (com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension) r0
            com.ss.android.ugc.aweme.shortvideo.model.SimpleEffect r0 = r0.getEffectInfo()
            if (r0 == 0) goto L12
            java.lang.String r0 = r0.getResourceId()
            if (r0 == 0) goto L12
            r2.add(r0)
            goto L12
        L2e:
            boolean r0 = r2.isEmpty()
            r3 = 1
            if (r0 == 0) goto L57
        L36:
            boolean r0 = X.H7R.LJJLIIIJJIZ(r4)
            if (r0 != 0) goto L79
            boolean r0 = r4.isDuet()
            if (r0 != 0) goto L79
            boolean r0 = r4.isStitchMode()
            if (r0 != 0) goto L79
            boolean r0 = r4.isStoryEditMode
            if (r0 != 0) goto L79
            boolean r0 = r4.isShoutout()
            if (r0 != 0) goto L79
            boolean r0 = r4.isPhotoMvMode
            if (r0 != 0) goto L79
        L56:
            return r3
        L57:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L5e
            goto L36
        L5e:
            java.util.Iterator r2 = r2.iterator()
        L62:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L36
            java.lang.Object r1 = r2.next()
            java.lang.String[] r0 = X.C141395gl.LIZ
            boolean r0 = X.ORY.LJJIJIIJIL(r1, r0)
            if (r0 != 0) goto L62
            boolean r0 = r4.editMusicSyncMode
            if (r0 == 0) goto L79
            goto L36
        L79:
            r3 = 0
            goto L56
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C141365gi.LJI(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0084, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJ(long r8, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r10) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C141365gi.LJ(long, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):boolean");
    }
}
