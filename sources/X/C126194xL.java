package X;

import android.text.TextUtils;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEMediaPublicJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentEffect;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVideoEffect;
import com.bytedance.ies.nle.editor_jni.VecNLEResourceNodeSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecString;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.shortvideo.edit.EditorProModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.model.CreativeFlowData;
import defpackage.b1;
import defpackage.e1;
import defpackage.t1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import ujb.o;

/* renamed from: X.4xL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C126194xL {
    public static final /* synthetic */ int LIZ = 0;

    static {
        C5K0.LIZ(2);
    }

    public static boolean LIZ(NLEVideoEffect nLEVideoEffect) {
        String extra;
        NLESegmentEffect LIZIZ;
        String NLESegmentEffect_getJsonParam;
        if (!nLEVideoEffect.hasExtra("ep_magic_resource_id") || (extra = nLEVideoEffect.getExtra("ep_magic_resource_id")) == null || !(!o.LJJJJJL(extra)) || (LIZIZ = nLEVideoEffect.LIZIZ()) == null || (NLESegmentEffect_getJsonParam = NLEEditorJniJNI.NLESegmentEffect_getJsonParam(LIZIZ.LIZJ, LIZIZ)) == null || TextUtils.isEmpty(NLESegmentEffect_getJsonParam)) {
            return false;
        }
        return !TextUtils.isEmpty(new JSONObject(NLESegmentEffect_getJsonParam).optString("editing_effect_algorithm_cache_url"));
    }

    public static void LIZJ(NLEModel nLEModel, java.util.Map filePathMap) {
        kotlin.jvm.internal.o.LJIIIZ(filePathMap, "filePathMap");
        VecNLEResourceNodeSPtr allResources = nLEModel.getAllResources();
        kotlin.jvm.internal.o.LJIIIIZZ(allResources, "nleModel.allResources");
        Iterator<NLEResourceNode> it = allResources.iterator();
        while (it.hasNext()) {
            NLEResourceNode next = it.next();
            if (C78685UuP.LJJJZ(next.LIZJ()) && filePathMap.containsKey(next.LIZJ())) {
                String str = (String) filePathMap.get(next.LIZJ());
                if (C78685UuP.LJJJZ(str)) {
                    next.LJIIIZ(str);
                }
            }
        }
    }

    public static void LIZIZ(AwemeDraft draft, boolean z, int i) {
        Object obj;
        Object obj2;
        boolean z2;
        Object obj3;
        boolean z3;
        NLESegmentEffect LIZIZ;
        String NLESegmentEffect_getJsonParam;
        List list;
        List<String> list2;
        List<String> list3;
        NLEResourceAV nLEResourceAV;
        Integer valueOf;
        String str;
        String str2;
        EditorProModel editorProModel;
        EditorProModel editorProModel2;
        NLETrack nLETrack;
        NLESegment nLESegment;
        NLEResourceAV LJ;
        EditPreviewInfo editPreviewInfo;
        String[] reverseAudioArray;
        String str3;
        NLETrack nLETrack2;
        NLESegment nLESegment2;
        NLEResourceAV LJ2;
        EditPreviewInfo editPreviewInfo2;
        String[] reverseVideoArray;
        String str4;
        Object obj4;
        NLEResourceAV LJ3;
        EditVideoSegment editVideoSegment;
        String audioPath;
        List<EditVideoSegment> videoList;
        NLEResourceAV LJ4;
        EditPreviewInfo editPreviewInfo3;
        List<EditVideoSegment> videoList2;
        EditVideoSegment editVideoSegment2;
        String videoPath;
        NLEResourceAV LJ5;
        CanvasVideoData canvasVideoData;
        List<String> sourceInfo;
        String str5;
        String str6;
        boolean z4 = z;
        if ((i & 4) != 0) {
            z4 = false;
        }
        kotlin.jvm.internal.o.LJIIIZ(draft, "draft");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("NLEFeedbackLog updateNLEPath start nleData: ");
        LIZ2.append(draft.LJIIJ);
        C5GW.LIZ(X1D.LIZIZ(LIZ2));
        long currentTimeMillis = System.currentTimeMillis();
        List list4 = null;
        if (!draft.LJIJI.isEmpty()) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("[NLE update]: copyResMap size ");
            LIZ3.append(draft.LJIJI.keySet().size());
            C126344xa.LIZ(X1D.LIZIZ(LIZ3));
            StringBuilder sb = new StringBuilder();
            if (C78685UuP.LJJJZ(draft.LJIIJ)) {
                for (String key : draft.LJIJI.keySet()) {
                    String str7 = draft.LJIJI.get(key);
                    if (str7 != null && str7.length() != 0 && key != null && key.length() != 0 && str7 != null) {
                        StringBuilder LIZ4 = X1D.LIZ();
                        LIZ4.append(key);
                        LIZ4.append(" -> ");
                        LIZ4.append(str7);
                        LIZ4.append("; ");
                        sb.append(X1D.LIZIZ(LIZ4));
                        String str8 = draft.LJIIJ;
                        if (str8 != null) {
                            kotlin.jvm.internal.o.LJIIIIZZ(key, "key");
                            str6 = o.LJJJJZ(str8, key, str7, false);
                        } else {
                            str6 = null;
                        }
                        draft.LJIIJ = str6;
                    }
                }
            }
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("NLEFeedbackLog updateNLEPath replaceMap str: ");
            LIZ5.append((Object) sb);
            C5GW.LIZ(X1D.LIZIZ(LIZ5));
        } else {
            C126344xa.LIZ("[NLE update]: moveFileMap empty");
        }
        if (C78685UuP.LJJJZ(draft.LJIIJ)) {
            NLEEditor nLEEditor = new NLEEditor();
            nLEEditor.LJI(draft.LJIIJ);
            NLEModel LJ6 = nLEEditor.LJ();
            kotlin.jvm.internal.o.LJIIIIZZ(LJ6, "nleEditor.model");
            Iterator LIZJ = t1.LIZJ(LJ6, "model.tracks");
            while (true) {
                if (LIZJ.hasNext()) {
                    obj = LIZJ.next();
                    if (kotlin.jvm.internal.o.LJ(((NLENode) obj).getExtra("RewindTrackType"), EnumC121854qL.VIDEO.name())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            NLETrack nLETrack3 = (NLETrack) obj;
            if (nLETrack3 != null && !nLETrack3.getEnable()) {
                C126344xa.LIZ("removeDisabledRewindTrack has disabled reverse video track, delete it");
                LJ6.removeTrack(nLETrack3);
            }
            Iterator LIZJ2 = t1.LIZJ(LJ6, "model.tracks");
            while (true) {
                if (LIZJ2.hasNext()) {
                    obj2 = LIZJ2.next();
                    if (kotlin.jvm.internal.o.LJ(((NLENode) obj2).getExtra("RewindTrackType"), EnumC121854qL.AUDIO.name())) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            NLETrack nLETrack4 = (NLETrack) obj2;
            if (nLETrack4 != null && !nLETrack4.getEnable()) {
                C126344xa.LIZ("removeDisabledRewindTrack has disabled reverse audio track, delete it");
                LJ6.removeTrack(nLETrack4);
            }
            if (C126204xM.LIZ()) {
                NLEModel LJ7 = nLEEditor.LJ();
                kotlin.jvm.internal.o.LJIIIIZZ(LJ7, "nleEditor.model");
                VecNLEResourceNodeSPtr allResources = LJ7.getAllResources();
                kotlin.jvm.internal.o.LJIIIIZZ(allResources, "nleModel.allResources");
                Iterator<NLEResourceNode> it = allResources.iterator();
                while (it.hasNext()) {
                    NLEResourceNode next = it.next();
                    C124144u2.LIZ.getClass();
                    C124144u2.LIZ(next);
                }
            }
            if (e1.LIZ(31744, "fix_broken_nle_draft", true, true) && (!C139895eL.LIZIZ)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                NLEModel LJ8 = nLEEditor.LJ();
                kotlin.jvm.internal.o.LJIIIIZZ(LJ8, "nleEditor.model");
                if (draft.LJJJJI.canvasVideoData != null) {
                    NLETrack mainTrack = LJ8.getMainTrack();
                    if (mainTrack != null) {
                        Iterator<NLETrackSlot> it2 = mainTrack.LJIILLIIL().iterator();
                        int i2 = 0;
                        while (it2.hasNext()) {
                            NLETrackSlot next2 = it2.next();
                            int i3 = i2 + 1;
                            if (i2 >= 0) {
                                NLESegmentVideo LJJIZ = C78609UtB.LJJIZ(next2);
                                if (LJJIZ != null && (LJ5 = LJJIZ.LJ()) != null && !C44687HgJ.LIZIZ(LJ5.LIZJ()) && (canvasVideoData = draft.LJJJJI.canvasVideoData) != null && (sourceInfo = canvasVideoData.getSourceInfo()) != null && (str5 = (String) ORZ.LJLLLLLL(i2, sourceInfo)) != null) {
                                    StringBuilder LIZ6 = X1D.LIZ();
                                    LIZ6.append("fixBrokenNLEDraft photo_canvas mainTrack ");
                                    LIZ6.append(LJ5.LIZJ());
                                    LIZ6.append(" not exists,replace with ");
                                    LIZ6.append(str5);
                                    C126344xa.LIZ(X1D.LIZIZ(LIZ6));
                                    LJ5.LJIIIZ(str5);
                                }
                                i2 = i3;
                            } else {
                                C47261Igj.LJJJJJ();
                                throw null;
                            }
                        }
                    }
                    C122474rL.LIZ(LJ8);
                } else {
                    NLETrack mainTrack2 = LJ8.getMainTrack();
                    if (mainTrack2 != null) {
                        Iterator<NLETrackSlot> it3 = mainTrack2.LJIILLIIL().iterator();
                        int i4 = 0;
                        while (it3.hasNext()) {
                            NLETrackSlot next3 = it3.next();
                            int i5 = i4 + 1;
                            if (i4 >= 0) {
                                NLESegmentVideo LJJIZ2 = C78609UtB.LJJIZ(next3);
                                if (LJJIZ2 != null && (LJ4 = LJJIZ2.LJ()) != null && !C44687HgJ.LIZIZ(LJ4.LIZJ()) && (editPreviewInfo3 = draft.LJJJJI.previewInfo) != null && (videoList2 = editPreviewInfo3.getVideoList()) != null && (editVideoSegment2 = (EditVideoSegment) ORZ.LJLLLLLL(i4, videoList2)) != null && (videoPath = editVideoSegment2.getVideoPath()) != null && videoPath.length() != 0) {
                                    StringBuilder LIZ7 = X1D.LIZ();
                                    LIZ7.append("fixBrokenNLEDraft mainTrack ");
                                    LIZ7.append(LJ4.LIZJ());
                                    LIZ7.append(" not exists, replace with ");
                                    LIZ7.append(videoPath);
                                    C126344xa.LIZ(X1D.LIZIZ(LIZ7));
                                    LJ4.LJIIIZ(videoPath);
                                }
                                i4 = i5;
                                list4 = null;
                            } else {
                                C47261Igj.LJJJJJ();
                                throw null;
                            }
                        }
                    }
                    EditPreviewInfo editPreviewInfo4 = draft.LJJJJI.previewInfo;
                    if (editPreviewInfo4 != null && (videoList = editPreviewInfo4.getVideoList()) != null) {
                        ArrayList arrayList = new ArrayList();
                        for (EditVideoSegment editVideoSegment3 : videoList) {
                            if (C78685UuP.LJJJZ(editVideoSegment3.getAudioPath())) {
                                arrayList.add(editVideoSegment3);
                            }
                        }
                        list = ORZ.LLJI(arrayList);
                    } else {
                        list = list4;
                    }
                    VecNLETrackSPtr tracks = LJ8.getTracks();
                    if (tracks != null) {
                        Iterator<NLETrack> it4 = tracks.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                obj4 = it4.next();
                                if (kotlin.jvm.internal.o.LJ(((NLENode) obj4).getExtra("AudioTrackType"), EnumC122254qz.ORIGIN.name())) {
                                    break;
                                }
                            } else {
                                obj4 = list4;
                                break;
                            }
                        }
                        NLETrack nLETrack5 = (NLETrack) obj4;
                        if (nLETrack5 != null) {
                            Iterator<NLETrackSlot> it5 = nLETrack5.LJIILLIIL().iterator();
                            int i6 = 0;
                            while (it5.hasNext()) {
                                NLETrackSlot next4 = it5.next();
                                int i7 = i6 + 1;
                                if (i6 >= 0) {
                                    NLESegmentAudio LIZLLL = NLESegmentAudio.LIZLLL(next4.LJI());
                                    if (LIZLLL != null && (LJ3 = LIZLLL.LJ()) != null && !C44687HgJ.LIZIZ(LJ3.LIZJ()) && list != null && (editVideoSegment = (EditVideoSegment) ORZ.LJLLLLLL(i6, list)) != null && (audioPath = editVideoSegment.getAudioPath()) != null) {
                                        StringBuilder LIZ8 = X1D.LIZ();
                                        LIZ8.append("fixBrokenNLEDraft origin audio track ");
                                        LIZ8.append(LJ3.LIZJ());
                                        LIZ8.append(" not exists, replace with ");
                                        LIZ8.append(audioPath);
                                        C126344xa.LIZ(X1D.LIZIZ(LIZ8));
                                        LJ3.LJIIIZ(audioPath);
                                    }
                                    i6 = i7;
                                } else {
                                    C47261Igj.LJJJJJ();
                                    throw null;
                                }
                            }
                        }
                    }
                    VecNLETrackSPtr tracks2 = LJ8.getTracks();
                    if (tracks2 != null) {
                        Iterator<NLETrack> it6 = tracks2.iterator();
                        while (true) {
                            if (it6.hasNext()) {
                                nLETrack2 = it6.next();
                                NLETrack nLETrack6 = nLETrack2;
                                if (kotlin.jvm.internal.o.LJ(nLETrack6.getExtra("RewindTrackType"), EnumC121854qL.VIDEO.name()) && nLETrack6.getEnable()) {
                                    break;
                                }
                            } else {
                                nLETrack2 = null;
                                break;
                            }
                        }
                        NLETrack nLETrack7 = nLETrack2;
                        if (nLETrack7 != null) {
                            NLETrackSlot nLETrackSlot = (NLETrackSlot) ORZ.LJLLLLLL(0, nLETrack7.LJIILL());
                            if (nLETrackSlot != null) {
                                nLESegment2 = nLETrackSlot.LJI();
                            } else {
                                nLESegment2 = null;
                            }
                            NLESegmentVideo LJJ = NLESegmentVideo.LJJ(nLESegment2);
                            if (LJJ != null && (LJ2 = LJJ.LJ()) != null && !C44687HgJ.LIZIZ(LJ2.LIZJ()) && (editPreviewInfo2 = draft.LJJJJI.previewInfo) != null && (reverseVideoArray = editPreviewInfo2.getReverseVideoArray()) != null && (str4 = (String) ORY.LJJJJI(0, reverseVideoArray)) != null) {
                                StringBuilder LIZ9 = X1D.LIZ();
                                LIZ9.append("fixBrokenNLEDraft video rewind track ");
                                LIZ9.append(LJ2.LIZJ());
                                LIZ9.append(" not exists, replace with ");
                                LIZ9.append(str4);
                                C126344xa.LIZ(X1D.LIZIZ(LIZ9));
                                LJ2.LJIIIZ(str4);
                            }
                        }
                    }
                    VecNLETrackSPtr tracks3 = LJ8.getTracks();
                    if (tracks3 != null) {
                        Iterator<NLETrack> it7 = tracks3.iterator();
                        while (true) {
                            if (it7.hasNext()) {
                                nLETrack = it7.next();
                                NLETrack nLETrack8 = nLETrack;
                                if (kotlin.jvm.internal.o.LJ(nLETrack8.getExtra("RewindTrackType"), EnumC121854qL.AUDIO.name()) && nLETrack8.getEnable()) {
                                    break;
                                }
                            } else {
                                nLETrack = null;
                                break;
                            }
                        }
                        NLETrack nLETrack9 = nLETrack;
                        if (nLETrack9 != null) {
                            NLETrackSlot nLETrackSlot2 = (NLETrackSlot) ORZ.LJLLLLLL(0, nLETrack9.LJIILL());
                            if (nLETrackSlot2 != null) {
                                nLESegment = nLETrackSlot2.LJI();
                            } else {
                                nLESegment = null;
                            }
                            NLESegmentAudio LIZLLL2 = NLESegmentAudio.LIZLLL(nLESegment);
                            if (LIZLLL2 != null && (LJ = LIZLLL2.LJ()) != null && !C44687HgJ.LIZIZ(LJ.LIZJ()) && (editPreviewInfo = draft.LJJJJI.previewInfo) != null && (reverseAudioArray = editPreviewInfo.getReverseAudioArray()) != null && (str3 = (String) ORY.LJJJJI(0, reverseAudioArray)) != null) {
                                StringBuilder LIZ10 = X1D.LIZ();
                                LIZ10.append("fixBrokenNLEDraft audio rewind track ");
                                LIZ10.append(LJ.LIZJ());
                                LIZ10.append(" not exists, replace with ");
                                LIZ10.append(str3);
                                C126344xa.LIZ(X1D.LIZIZ(LIZ10));
                                LJ.LJIIIZ(str3);
                            }
                        }
                    }
                    CreativeFlowData creativeFlowData = draft.LJJJJI.creativeFlowData;
                    if (creativeFlowData != null && (editorProModel2 = creativeFlowData.getEditorProModel()) != null) {
                        list2 = editorProModel2.getPipResourcePaths();
                    } else {
                        list2 = null;
                    }
                    CreativeFlowData creativeFlowData2 = draft.LJJJJI.creativeFlowData;
                    if (creativeFlowData2 != null && (editorProModel = creativeFlowData2.getEditorProModel()) != null) {
                        list3 = editorProModel.getPipSlotUuidList();
                    } else {
                        list3 = null;
                    }
                    VecNLETrackSPtr tracks4 = LJ8.getTracks();
                    if (tracks4 != null) {
                        ArrayList arrayList2 = new ArrayList();
                        Iterator<NLETrack> it8 = tracks4.iterator();
                        while (it8.hasNext()) {
                            NLETrack next5 = it8.next();
                            if (kotlin.jvm.internal.o.LJ(next5.getExtra("track_extra_pip"), "true")) {
                                arrayList2.add(next5);
                            }
                        }
                        Iterator it9 = arrayList2.iterator();
                        boolean z5 = false;
                        while (it9.hasNext()) {
                            NLETrack nLETrack10 = (NLETrack) it9.next();
                            Iterator<NLETrackSlot> it10 = nLETrack10.LJIILL().iterator();
                            while (it10.hasNext()) {
                                NLETrackSlot next6 = it10.next();
                                NLESegmentVideo LJJIZ3 = C78609UtB.LJJIZ(next6);
                                if (LJJIZ3 != null) {
                                    nLEResourceAV = LJJIZ3.LJ();
                                } else {
                                    nLEResourceAV = null;
                                }
                                if (nLEResourceAV != null && !C44687HgJ.LIZIZ(nLEResourceAV.LIZJ())) {
                                    if (list3 != null && (valueOf = Integer.valueOf(list3.indexOf(next6.getUUID()))) != null && valueOf.intValue() != -1) {
                                        if (list2 != null) {
                                            str = (String) ORZ.LJLLLLLL(valueOf.intValue(), list2);
                                        } else {
                                            str = null;
                                        }
                                        if (C78685UuP.LJJJZ(str)) {
                                            if (list2 != null && (str2 = (String) ORZ.LJLLLLLL(valueOf.intValue(), list2)) != null) {
                                                StringBuilder LIZ11 = X1D.LIZ();
                                                LIZ11.append("fixBrokenNLEDraft pip track ");
                                                LIZ11.append(nLEResourceAV.LIZJ());
                                                LIZ11.append(" not exists, replace with ");
                                                LIZ11.append(str2);
                                                C126344xa.LIZ(X1D.LIZIZ(LIZ11));
                                                nLEResourceAV.LJIIIZ(str2);
                                            }
                                        }
                                    }
                                    nLETrack10.LJIJJLI(next6);
                                    z5 = true;
                                }
                            }
                        }
                        if (z5) {
                            C60903NvH.LJIIJJI().LJJIIZI().LJIIZILJ("pip file does not exist when restore from draft");
                        }
                    }
                    if (e1.LIZ(31744, "fix_nle_res_type_when_process_draft", true, true)) {
                        C122474rL.LIZ(LJ8);
                    }
                }
            }
            NLEModel LJ9 = nLEEditor.LJ();
            kotlin.jvm.internal.o.LJIIIIZZ(LJ9, "nleEditor.model");
            Iterator<NLETrackSlot> it11 = LJ9.getMainTrack().LJIILL().iterator();
            while (it11.hasNext()) {
                Iterator<NLEVideoEffect> it12 = it11.next().LJIIJ().iterator();
                while (it12.hasNext()) {
                    NLEVideoEffect effect = it12.next();
                    kotlin.jvm.internal.o.LJIIIIZZ(effect, "effect");
                    if (LIZ(effect) && (LIZIZ = effect.LIZIZ()) != null && (NLESegmentEffect_getJsonParam = NLEEditorJniJNI.NLESegmentEffect_getJsonParam(LIZIZ.LIZJ, LIZIZ)) != null && !TextUtils.isEmpty(NLESegmentEffect_getJsonParam)) {
                        String optString = new JSONObject(NLESegmentEffect_getJsonParam).optString("editing_effect_algorithm_cache_url");
                        if (!TextUtils.isEmpty(optString)) {
                            VecString vecString = new VecString(new String[]{optString});
                            NLEMediaPublicJniJNI.NLEMediaUtil_operateGlobalAllowedPaths(VecString.LIZJ(vecString), vecString, EnumC123984tm.NLE_ALLOWLISTOPERATION_TYPE_ADD.swigValue());
                        }
                    }
                }
            }
            nLEEditor.LIZIZ();
            nLEEditor.LIZJ();
            StringBuilder LIZ12 = X1D.LIZ();
            LIZ12.append("NLEFeedbackLog updateNLEPath nleModel result: ");
            LIZ12.append(nLEEditor.LJ());
            C5GW.LIZ(X1D.LIZIZ(LIZ12));
            StringBuilder LIZ13 = X1D.LIZ();
            LIZ13.append("updateNLEPath nleModel result: ");
            LIZ13.append(nLEEditor.LJ());
            C126344xa.LIZ(X1D.LIZIZ(LIZ13));
            NLEModel LJ10 = nLEEditor.LJ();
            kotlin.jvm.internal.o.LJIIIIZZ(LJ10, "nleEditor.model");
            StringBuilder LJI = JBR.LJI("DraftCreativeRestoreHandler -> check volume -> isFromDraft:true, isSave=", z4, ", creationId=");
            LJI.append(draft.LIZ());
            LJI.append('\n');
            String LIZIZ2 = X1D.LIZIZ(LJI);
            Iterator it13 = ((ArrayList) V0N.LJIIZILJ(LJ10)).iterator();
            while (true) {
                if (it13.hasNext()) {
                    obj3 = it13.next();
                    NLETrack nLETrack11 = (NLETrack) obj3;
                    if (nLETrack11.LJIIZILJ() == EnumC123864ta.AUDIO && (kotlin.jvm.internal.o.LJ(nLETrack11.getExtra("AudioTrackType"), "BGM") || kotlin.jvm.internal.o.LJ(nLETrack11.getExtra("AudioTrackType"), "EDITOR_MUSIC"))) {
                        break;
                    }
                } else {
                    obj3 = null;
                    break;
                }
            }
            NLETrack nLETrack12 = (NLETrack) obj3;
            if (nLETrack12 != null) {
                StringBuilder LIZJ3 = b1.LIZJ(LIZIZ2, "has BGM, volume=");
                LIZJ3.append(NLEEditorJniJNI.NLETrack_getVolume(nLETrack12.LIZ, nLETrack12));
                LIZJ3.append('\n');
                LIZIZ2 = X1D.LIZIZ(LIZJ3);
            }
            NLETrack mainTrack3 = LJ10.getMainTrack();
            if (mainTrack3 != null) {
                Iterator<NLETrackSlot> it14 = mainTrack3.LJIILLIIL().iterator();
                int i8 = 0;
                while (it14.hasNext()) {
                    NLETrackSlot next7 = it14.next();
                    int i9 = i8 + 1;
                    if (i8 >= 0) {
                        NLESegmentVideo LJJ2 = NLESegmentVideo.LJJ(next7.LJI());
                        if (LJJ2 != null) {
                            if (LJJ2.LIZJ() == EnumC123874tb.IMAGE) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            StringBuilder LJ11 = C7MY.LJ(LIZIZ2, i8, ": volume=");
                            LJ11.append(LJJ2.LJIILJJIL());
                            LJ11.append(", isImage=");
                            LJ11.append(z3);
                            LJ11.append(", path=");
                            LJ11.append(LJJ2.LJ().LIZJ());
                            LJ11.append('\n');
                            LIZIZ2 = X1D.LIZIZ(LJ11);
                        }
                        i8 = i9;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
            }
            C126344xa.LIZ(LIZIZ2);
            draft.LJIIJ = nLEEditor.LJIIIIZZ();
        }
        StringBuilder LIZ14 = X1D.LIZ();
        LIZ14.append("updateNLEPathDirectly cost: ");
        LIZ14.append(System.currentTimeMillis() - currentTimeMillis);
        C126344xa.LIZ(X1D.LIZIZ(LIZ14));
    }
}
