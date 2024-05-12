package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.template.EffectCategoryResponseTemplate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.5OL, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5OL {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C5OM.LJLIL);
    public static final C48292IxM LIZIZ = new C48292IxM(4);

    public static List LIZIZ() {
        return (List) LIZ.getValue();
    }

    public static boolean LIZ(VideoPublishEditModel mModel) {
        o.LJIIIZ(mModel, "mModel");
        if ((mModel.isMvThemeVideoType() && !mModel.isPhotoMvMode) || mModel.isCurrentAutoCutMode()) {
            return true;
        }
        return false;
    }

    public static void LIZLLL(List list) {
        LIZIZ().clear();
        if (list != null) {
            LIZIZ().addAll(list);
        }
    }

    public static boolean LJ(NLEModel nLEModel, VideoPublishEditModel mModel) {
        MultiEditVideoRecordData multiEditVideoRecordData;
        List<MultiEditVideoSegmentRecordData> list;
        o.LJIIIZ(mModel, "mModel");
        if (mModel.isTimeEffectApply()) {
            return true;
        }
        if (!H7R.LJJIL(mModel) && !mModel.isStitchMode() && !mModel.isMvThemeVideoType() && !mModel.isCutSameVideoType() && mModel.getLibraryMaterialCount() == 0 && !H7R.LJJII(mModel)) {
            if (nLEModel != null) {
                if (!mModel.getEditorProModel().isPipUsed()) {
                    MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = mModel.multiEditVideoRecordData;
                    if (multiEditVideoStatusRecordData != null && (multiEditVideoRecordData = multiEditVideoStatusRecordData.curMultiEditVideoRecordData) != null && (list = multiEditVideoRecordData.segmentDataList) != null && !list.isEmpty()) {
                        Iterator<MultiEditVideoSegmentRecordData> it = list.iterator();
                        while (it.hasNext()) {
                            String str = it.next().audioPath;
                            if (str == null || str.length() == 0) {
                                if (!list.isEmpty()) {
                                    for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : list) {
                                        if (C78685UuP.LJJJZ(multiEditVideoSegmentRecordData.audioPath) && !o.LJ(multiEditVideoSegmentRecordData.videoPath, multiEditVideoSegmentRecordData.audioPath)) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (mModel.isCurrentAutoCutMode() || C78685UuP.LJJJZ(mModel.creativeModel.musicBuzModel.stsTemplateId)) {
                break;
            }
            return true;
        }
        return false;
    }

    public static void LJFF(VideoPublishEditModel editModel, NLEModel nleModel, java.util.Map map) {
        boolean z;
        o.LJIIIZ(editModel, "editModel");
        o.LJIIIZ(nleModel, "nleModel");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 1;
        if (map == null) {
            List LJJIII = C17J.LJJIII(nleModel);
            ArrayList arrayList = new ArrayList();
            Iterator it = LJJIII.iterator();
            while (it.hasNext()) {
                ORS.LJJLIIIJILLIZJL(((NLETrack) it.next()).LJIILL(), arrayList);
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                String extra = ((NLENode) it2.next()).getExtra("extra_video_effect_source");
                if (extra == null) {
                    extra = CardStruct.IStatusCode.DEFAULT;
                }
                if (extra.length() > 0) {
                    linkedHashMap.put(Integer.valueOf(CastIntegerProtector.parseInt(extra)), Boolean.TRUE);
                }
            }
            map = linkedHashMap;
        }
        if (map.isEmpty()) {
            editModel.setEffectSource(false, -1);
            return;
        }
        Boolean bool = (Boolean) map.get(Integer.valueOf(EnumC126794yJ.MULTI_TRACK.getValue()));
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        if (!o.LJ(map.get(Integer.valueOf(EnumC126794yJ.EDITOR_PRO.getValue())), Boolean.TRUE)) {
            i = 0;
        } else if (map.size() != 1) {
            i = 2;
        }
        editModel.setEffectSource(z, i);
    }

    public static void LIZJ(boolean z, boolean z2, boolean z3, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            EffectCategoryResponseTemplate effectCategoryResponseTemplate = (EffectCategoryResponseTemplate) it.next();
            ArrayList arrayList = new ArrayList();
            for (Effect effect : effectCategoryResponseTemplate.getTotalEffects()) {
                String extra = effect.getExtra();
                if (extra != null && extra.length() != 0) {
                    try {
                        String extra2 = effect.getExtra();
                        if (extra2 == null) {
                            extra2 = "";
                        }
                        JSONObject jSONObject = new JSONObject(extra2);
                        if (z || !jSONObject.optBoolean("tt_prop")) {
                            if (z3 || !jSONObject.optBoolean("if_goto_capcut")) {
                                if (!z2 && jSONObject.optBoolean("if_capcut")) {
                                }
                            }
                        }
                    } catch (JSONException unused) {
                    }
                }
                arrayList.add(effect);
            }
            effectCategoryResponseTemplate.setTotalEffects(arrayList);
        }
    }
}
