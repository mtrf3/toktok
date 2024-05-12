package X;

import Y.ACallableS105S0100000_2;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.NLEInfoModel;
import com.ss.android.ugc.aweme.creative.model.SoundEffect;
import com.ss.android.ugc.aweme.creative.model.SoundEffectInfoModel;
import com.ss.android.ugc.aweme.draft.model.AVDraftExtras;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.CreativeFlowData;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.GWt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41663GWt {
    public static void LIZ(final AwemeDraft awemeDraft) {
        awemeDraft.LIZLLL = null;
        awemeDraft.LJI = null;
        final boolean z = false;
        awemeDraft.LJIILIIL = 0;
        awemeDraft.LJIIIZ = (int) ((WUK.LJIJI / WUK.LJIJJ) * 100.0f);
        AVDraftExtras aVDraftExtras = awemeDraft.LJJJJI;
        aVDraftExtras.isDraftMusicIllegal = true;
        awemeDraft.LIZIZ = 2;
        CreativeFlowData creativeFlowData = aVDraftExtras.creativeFlowData;
        if (creativeFlowData != null && creativeFlowData.getEditorProModel() != null && awemeDraft.LJJJJI.creativeFlowData.getEditorProModel().isAdvancedEditDraft()) {
            z = true;
        }
        C78841Uwv.LJJIIZ("DraftEditHelper.clearMusicAndRefreshDraft", new InterfaceC65784Pro() { // from class: X.4s6
            @Override // X.InterfaceC65784Pro
            public final Object invoke() {
                AwemeDraft awemeDraft2 = AwemeDraft.this;
                NLEEditor LIZLLL = C41663GWt.LIZLLL(awemeDraft2, Boolean.valueOf(z));
                if (LIZLLL == null) {
                    return null;
                }
                Iterator<NLETrack> it = LIZLLL.LJ().getTracks().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    NLETrack next = it.next();
                    if (EnumC122254qz.BGM.name().equals(next.getExtra("AudioTrackType"))) {
                        LIZLLL.LJ().removeTrack(next);
                        break;
                    }
                }
                LIZLLL.LIZIZ();
                LIZLLL.LIZJ();
                awemeDraft2.LJIIJ = LIZLLL.LJIIIIZZ();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("clearMusic finally set nle data ");
                LIZ.append(awemeDraft2.LJIIJ);
                C126344xa.LIZ(X1D.LIZIZ(LIZ));
                return null;
            }
        });
    }

    public static void LJ(AwemeDraft awemeDraft) {
        List<String> LIZJ = C60903NvH.LJIIJJI().getPublishService().LJIILIIL().LIZJ();
        if (LIZJ.isEmpty()) {
            return;
        }
        String str = (String) ListProtector.get(LIZJ, 0);
        if (TextUtils.equals(awemeDraft.LIZJ(), str)) {
            C60903NvH.LJIIJJI().getPublishService().LJIILIIL();
            C41958GdO.LJIILJJIL(str);
            C78934UyQ.LJLIL.getPublishService().getClass();
            C2U8.LIZ(new C41668GWy(false, false));
        }
    }

    public static void LJFF(VideoPublishEditModel videoPublishEditModel) {
        String creationId;
        String creationId2;
        C42562Gn8 c42562Gn8 = C42562Gn8.LIZIZ;
        if (videoPublishEditModel == null) {
            creationId = null;
        } else {
            creationId = videoPublishEditModel.getCreationId();
        }
        c42562Gn8.LIZ(creationId);
        if (videoPublishEditModel == null) {
            creationId2 = null;
        } else {
            creationId2 = videoPublishEditModel.getCreationId();
        }
        c42562Gn8.LIZIZ(creationId2, new C42097Gfd(EnumC42099Gff.DRAFT_BACK, videoPublishEditModel, null), null);
    }

    public static boolean LJI(VideoPublishEditModel videoPublishEditModel) {
        boolean LJIIIIZZ = C1DG.LJIIIIZZ();
        if (C79004UzY.LJJIIJ(videoPublishEditModel.canvasVideoData) || H7R.LJJLIIIJJIZ(videoPublishEditModel)) {
            return true;
        }
        if (C153255zt.LIZ() && ((C43465H4b.LIZ() != 0 || videoPublishEditModel.getOriginal() != 1 || videoPublishEditModel.mShootMode != 14) && !videoPublishEditModel.isShoutout() && !LJIIIIZZ)) {
            return true;
        }
        return false;
    }

    public static NLEEditor LIZLLL(AwemeDraft awemeDraft, Boolean bool) {
        String str;
        if (!TextUtils.isEmpty(awemeDraft.LIZ.nleInfoModel.nleDataPath)) {
            str = awemeDraft.LIZ.nleInfoModel.nleDataPath;
        } else {
            str = awemeDraft.LJJJJI.nleDataPath;
        }
        NLEInfoModel nLEInfoModel = awemeDraft.LIZ.nleInfoModel;
        nLEInfoModel.nleDataVersion = C122954s7.LIZ(nLEInfoModel.nleDataVersion, str, bool.booleanValue()).getSecond().intValue();
        if (TextUtils.isEmpty(awemeDraft.LJIIJ) && !TextUtils.isEmpty(str)) {
            awemeDraft.LJIIJ = C39579Fg7.LJIJI(str);
            StringBuilder LIZIZ = C25620zW.LIZIZ("generateNLEEditor read nle path ", str, " data ");
            LIZIZ.append(awemeDraft.LJIIJ);
            C126344xa.LIZ(X1D.LIZIZ(LIZIZ));
        }
        if (TextUtils.isEmpty(awemeDraft.LJIIJ)) {
            return null;
        }
        C60903NvH.LJIIJJI().LJIJ();
        C5K0.LIZ(2);
        NLEEditor nLEEditor = new NLEEditor();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DraftEditHelper restore nle data: ");
        LIZ.append(awemeDraft.LJIIJ);
        H78.LJI(X1D.LIZIZ(LIZ));
        nLEEditor.LJI(awemeDraft.LJIIJ);
        return nLEEditor;
    }

    public static Boolean LJIIIIZZ(final AwemeDraft awemeDraft, List<C123244sa> list) {
        final boolean z;
        String str;
        String str2;
        Boolean bool = Boolean.FALSE;
        int i = 1;
        final Long[] lArr = {0L};
        ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        List<SoundEffect> list2 = awemeDraft.LIZ.soundEffectInfoModel.soundEffectList;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = (ArrayList) list;
        Iterator it = arrayList4.iterator();
        while (it.hasNext()) {
            C123244sa c123244sa = (C123244sa) it.next();
            if (!c123244sa.LJLILLLLZI) {
                bool = Boolean.TRUE;
                arrayList.add(c123244sa.LJLIL);
                arrayList2.add(c123244sa);
            } else if (!c123244sa.LJLJI) {
                arrayList2.add(c123244sa);
            } else {
                arrayList3.add(ListProtector.get(list2, arrayList4.indexOf(c123244sa)));
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("newSoundEffectList:");
        LIZ.append(arrayList3);
        H7C.LJI(3, "SoundEffect", null, X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("removedList:");
        LIZ2.append(arrayList2);
        H7C.LJI(3, "SoundEffect", null, X1D.LIZIZ(LIZ2));
        SoundEffectInfoModel soundEffectInfoModel = awemeDraft.LIZ.soundEffectInfoModel;
        soundEffectInfoModel.getClass();
        soundEffectInfoModel.soundEffectList = arrayList3;
        if (arrayList2.isEmpty()) {
            return Boolean.FALSE;
        }
        CreativeFlowData creativeFlowData = awemeDraft.LJJJJI.creativeFlowData;
        if (creativeFlowData != null && creativeFlowData.getEditorProModel() != null && awemeDraft.LJJJJI.creativeFlowData.getEditorProModel().isAdvancedEditDraft()) {
            z = true;
        } else {
            z = false;
        }
        C78841Uwv.LJJIIZ("DraftEditHelper.removeSoundEffectIfNeeded", new InterfaceC65784Pro() { // from class: X.4sZ
            @Override // X.InterfaceC65784Pro
            public final Object invoke() {
                AwemeDraft awemeDraft2 = AwemeDraft.this;
                boolean z2 = z;
                ArrayList arrayList5 = arrayList2;
                Long[] lArr2 = lArr;
                NLEEditor LIZLLL = C41663GWt.LIZLLL(awemeDraft2, Boolean.valueOf(z2));
                if (LIZLLL != null) {
                    Iterator it2 = arrayList5.iterator();
                    while (it2.hasNext()) {
                        C123244sa c123244sa2 = (C123244sa) it2.next();
                        NLEModel nleModel = LIZLLL.LJ();
                        String musicId = c123244sa2.LJLIL;
                        o.LJIIIZ(nleModel, "nleModel");
                        o.LJIIIZ(musicId, "musicId");
                        VecNLETrackSPtr tracks = nleModel.getTracks();
                        o.LJIIIIZZ(tracks, "nleModel.tracks");
                        ArrayList arrayList6 = new ArrayList();
                        Iterator<NLETrack> it3 = tracks.iterator();
                        while (it3.hasNext()) {
                            NLETrack next = it3.next();
                            NLETrack it4 = next;
                            o.LJIIIIZZ(it4, "it");
                            if (C124574uj.LJJJJLL(it4)) {
                                arrayList6.add(next);
                            }
                        }
                        Iterator it5 = arrayList6.iterator();
                        while (it5.hasNext()) {
                            NLETrack nLETrack = (NLETrack) it5.next();
                            Iterator<NLETrackSlot> it6 = nLETrack.LJIILLIIL().iterator();
                            while (it6.hasNext()) {
                                NLETrackSlot next2 = it6.next();
                                String extra = next2.getExtra("slot_extra_music_id");
                                if (extra != null && o.LJ(extra, musicId)) {
                                    nLETrack.LJIJJLI(next2);
                                }
                            }
                        }
                    }
                    C124604um.LJIIIIZZ(LIZLLL.LJ());
                    LIZLLL.LIZIZ();
                    LIZLLL.LIZJ();
                    awemeDraft2.LJIIJ = LIZLLL.LJIIIIZZ();
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("removeSoundEffectIfNeeded finally set nle data ");
                    LIZ3.append(awemeDraft2.LJIIJ);
                    C126344xa.LIZ(X1D.LIZIZ(LIZ3));
                    lArr2[0] = Long.valueOf(LIZLLL.LJ().getDuration());
                } else {
                    H7C.LJI(3, "SoundEffect", null, "nleEditor is null");
                }
                return null;
            }
        });
        if (bool.booleanValue()) {
            long longValue = lArr[0].longValue();
            C145995oB c145995oB = new C145995oB();
            c145995oB.LJI("shoot_way", awemeDraft.LJJJJI.shootWay);
            int i2 = awemeDraft.LJJJJI.from;
            if (i2 == 0 || i2 == 1 || awemeDraft.LJIIL()) {
                str = "upload";
            } else {
                str = "shoot";
            }
            c145995oB.LJI("content_source", str);
            c145995oB.LJI("content_type", C41802Gas.LIZIZ(awemeDraft));
            c145995oB.LIZIZ(longValue, "creation_duration");
            c145995oB.LJI("creation_id", awemeDraft.LIZ());
            if (awemeDraft.LIZ.reuseSoundAndEffectModel.isMusicFromDiscoveryPage()) {
                str2 = "prop_panel_discovery";
            } else {
                str2 = awemeDraft.LJJJJI.musicOrigin;
            }
            c145995oB.LJI("music_selected_from", str2);
            AVDraftExtras aVDraftExtras = awemeDraft.LJJJJI;
            if (aVDraftExtras.videoCount + aVDraftExtras.photoCount <= 1) {
                i = 0;
            }
            c145995oB.LIZ(i, "is_multi_content");
            c145995oB.LIZ(awemeDraft.LJJJJI.videoCount, "video_cnt");
            c145995oB.LIZ(awemeDraft.LJJJJI.photoCount, "pic_cnt");
            c145995oB.LJI("draft_way", "general_draft_list");
            c145995oB.LJI("sound_effect_list", arrayList.toString());
            c145995oB.LJI("draft_id", awemeDraft.LJJJJI.newDraftId);
            FMX.LJIIL("draft_sound_effect_delete_toast", c145995oB.LIZ);
        }
        return bool;
    }

    public static void LJII(AwemeDraft awemeDraft, VideoPublishEditModel videoPublishEditModel, boolean z) {
        String str;
        String str2;
        String str3;
        int i;
        int nextInt = new SecureRandom().nextInt(Integer.MAX_VALUE);
        AVDraftExtras aVDraftExtras = awemeDraft.LJJJJI;
        aVDraftExtras.draftId = nextInt;
        if (TextUtils.isEmpty(aVDraftExtras.newDraftId)) {
            String newDraftId = C43081GvV.LIZ();
            o.LJIIIZ(newDraftId, "newDraftId");
            AVDraftExtras aVDraftExtras2 = awemeDraft.LJJJJI;
            aVDraftExtras2.getClass();
            aVDraftExtras2.newDraftId = newDraftId;
            C10K.LIZJ(new ACallableS105S0100000_2(awemeDraft, 23));
        }
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", awemeDraft.LIZ());
        c145995oB.LJI("shoot_way", awemeDraft.LJJJJI.shootWay);
        c145995oB.LIZ(awemeDraft.LJIIJJI + 1, "draft_list_order");
        c145995oB.LIZJ(Double.valueOf(V1M.LJJIJL(awemeDraft.saveTime)), "since_first_save_time");
        int i2 = awemeDraft.LJJJJI.draftId;
        if (i2 != 0) {
            c145995oB.LIZ(i2, "draft_id");
        }
        if (!TextUtils.isEmpty(awemeDraft.LJJJJI.newDraftId)) {
            c145995oB.LIZLLL("new_draft_id", awemeDraft.LJJJJI.newDraftId);
        }
        H53.LIZIZ(awemeDraft.LIZ());
        if (awemeDraft.LJJJJI.isPhotoMvMode) {
            str = "slideshow";
        } else if (awemeDraft.LJIIL() || awemeDraft.LJJJJI.cutSameData != null) {
            str = "mv";
        } else if (awemeDraft.LJIIIIZZ()) {
            str = "autocut";
        } else {
            str = "video";
        }
        c145995oB.LJI("content_type", str);
        if (awemeDraft.LJIIL() || (i = awemeDraft.LJJJJI.from) == 1 || i == 0) {
            str2 = "upload";
        } else {
            str2 = "shoot";
        }
        c145995oB.LIZLLL("content_source", str2);
        AVMusic aVMusic = awemeDraft.LIZLLL;
        if (aVMusic != null) {
            c145995oB.LIZIZ(aVMusic.id, "music_id");
        }
        c145995oB.LIZ(videoPublishEditModel.isDefaultProp ? 1 : 0, "is_default_prop");
        c145995oB.LJI("prop_list", videoPublishEditModel.getStickers());
        c145995oB.LIZLLL("from_prop_id", videoPublishEditModel.fromPropId);
        c145995oB.LIZLLL("draft_way", "general_draft_list");
        if (awemeDraft.LJJJ) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        c145995oB.LIZLLL("is_posted_draft", str3);
        c145995oB.LIZLLL("enter_from", "personal_homepage");
        c145995oB.LIZ(z ? 1 : 0, "is_available_sound");
        FMX.LJIIL("edit_draft", c145995oB.LIZ);
    }

    public static Intent LIZIZ(VideoPublishEditModel videoPublishEditModel, int i, long j, AwemeDraft awemeDraft, boolean z) {
        Intent LJFF = C43543H7b.LJFF(i, videoPublishEditModel, z);
        LJFF.putExtra("shoot_way", videoPublishEditModel.mShootWay);
        LJFF.putExtra("translation_type", 3);
        C170666ms.LIZIZ("GoPublishActivity from draft");
        LJFF.putExtra("fromDraft", 1);
        LJFF.putExtra("draft_to_edit_from", i);
        LJFF.putExtra("edit_publish_session_end_together", true);
        LJFF.putExtra("draft_to_edit_start_time", j);
        LJFF.putExtra("draft_modify_time", awemeDraft.lastEditTime);
        C68395Qsp c68395Qsp = new C68395Qsp(3);
        LJFF.putExtra("extra_auto_caption_setting", videoPublishEditModel.allowAutoCaptionSetting);
        c68395Qsp.LJLIL = awemeDraft;
        LJFF.putExtra("draft_file_size", c68395Qsp.LIZIZ());
        LJFF.putExtra("auto_selected_anchor", videoPublishEditModel.autoAttachedAnchor);
        LJFF.putExtra("open_platform_extra", videoPublishEditModel.openPlatformExtra);
        LJFF.putExtra("open_platform_client_key", videoPublishEditModel.openPlatformClientKey);
        LJFF.putExtra("extra_apply_voice_to_all_text", videoPublishEditModel.getApplyVoiceToAllTextSwitch());
        LJFF.putExtra("extra_has_multi_audio_loudness_normalization", videoPublishEditModel.hasMultiAudioLoudnessNormalization);
        return LJFF;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ad, code lost:
    
        if (X.L1L.LIZIZ() != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b3, code lost:
    
        if (X.C151965xo.LIZIZ() == false) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0053  */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [X.MBA, X.2kd, X.XKY] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.GWh] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(final X.ActivityC45651qj r8, com.ss.android.ugc.aweme.draft.model.AwemeDraft r9, final int r10, final long r11, X.GNG r13, final X.GMH r14) {
        /*
            r7 = r9
            if (r7 != 0) goto L4
            return
        L4:
            X.GWv r1 = new X.GWv
            r6 = r8
            r8 = r10
            r0 = r13
            r1.<init>(r6, r8, r0)
            X.GWh r5 = new X.GWh
            r9 = r11
            r11 = r14
            r5.<init>()
            boolean r0 = r7.LJIIIZ()
            X.C139895eL.LIZIZ = r0
            boolean r0 = r7.LJIIIZ()
            r10 = 0
            r11 = 0
            if (r0 == 0) goto L74
            X.HEa r0 = X.C78934UyQ.LJLIL
            X.HF1 r0 = r0.LIZLLL()
            r0.getClass()
            X.2c0 r0 = X.C62002c0.LIZ
            r0.getClass()
            boolean r0 = X.C62002c0.LIZ()
            if (r0 != 0) goto L74
            r8 = -3
            r0 = 2131834682(0x7f11373a, float:1.9302481E38)
            java.lang.String r9 = r6.getString(r0)
            java.lang.String r0 = "proxy.context.getString(…o_mode_unavailbale_toast)"
            kotlin.jvm.internal.o.LJIIIIZZ(r9, r0)
            r12 = 12
            X.6eR r2 = X.C5DB.LIZ(r7, r8, r9, r10, r11, r12)
        L48:
            r3 = 2
            if (r2 == 0) goto L53
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r5.invoke(r0, r2)
        L52:
            return
        L53:
            X.GXC r4 = new X.GXC
            X.GLI r2 = new X.GLI
            java.lang.String r0 = "AwemeDraftViewHolder"
            r2.<init>(r0, r11, r3)
            r4.<init>(r1, r7, r2)
            X.GWu r3 = new X.GWu
            r3.<init>(r7, r1, r5)
            X.XIF r0 = X.EXT.LIZ
            X.2gm r2 = X.C48841JEv.LIZ(r0)
            X.GXB r1 = new X.GXB
            r1.<init>(r3, r4, r10)
            r0 = 3
            X.XKX.LIZLLL(r2, r10, r10, r1, r0)
            goto L52
        L74:
            com.ss.android.ugc.aweme.draft.model.AVDraftExtras r2 = r7.LJJJJI
            com.ss.android.ugc.aweme.status.StatusCreateVideoData r0 = r2.statusCreateVideoData
            if (r0 == 0) goto L86
        L7a:
            r8 = -4
            r12 = 14
            r7 = r7
            r9 = r10
            r10 = r10
            r11 = r11
            X.6eR r2 = X.C5DB.LIZ(r7, r8, r9, r10, r11, r12)
            goto L48
        L86:
            com.ss.android.ugc.aweme.photomovie.PhotoMovieContext r0 = r7.photoMovieContext
            if (r0 == 0) goto L8b
            goto L7a
        L8b:
            com.ss.android.ugc.aweme.shortvideo.reaction.ReactionParams r0 = r2.reactionParams
            if (r0 == 0) goto L90
            goto L7a
        L90:
            com.ss.android.ugc.aweme.canvas.CanvasVideoData r0 = r2.canvasVideoData
            boolean r0 = X.C79004UzY.LJJIII(r0)
            if (r0 == 0) goto Lb5
            com.ss.android.ugc.aweme.services.IAVServiceProxy r0 = com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(r11)
            X.5qb r0 = r0.getStoryService()
            r0.getClass()
            boolean r0 = X.L1S.LIZIZ()
            if (r0 == 0) goto Laf
            boolean r0 = X.L1L.LIZIZ()
            if (r0 != 0) goto Lc7
        Laf:
            boolean r0 = X.C151965xo.LIZIZ()
            if (r0 == 0) goto Lc7
        Lb5:
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r7.LIZ
            com.ss.android.ugc.aweme.creative.model.NowsShootModel r0 = r0.nowsShootModel
            if (r0 == 0) goto Ldc
            boolean r0 = X.GX0.LIZ()
            if (r0 == 0) goto Lc7
            boolean r0 = X.C41669GWz.LIZ()
            if (r0 != 0) goto Ldc
        Lc7:
            r8 = -7
            r0 = 2131828371(0x7f111e93, float:1.928968E38)
            java.lang.String r9 = r6.getString(r0)
            java.lang.String r0 = "proxy.context.getString(…ring.drafts_upgrade_body)"
            kotlin.jvm.internal.o.LJIIIIZZ(r9, r0)
            r12 = 12
            X.6eR r2 = X.C5DB.LIZ(r7, r8, r9, r10, r11, r12)
            goto L48
        Ldc:
            r2 = r10
            goto L48
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41663GWt.LIZJ(X.1qj, com.ss.android.ugc.aweme.draft.model.AwemeDraft, int, long, X.GNG, X.GMH):void");
    }
}
