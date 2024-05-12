package X;

import Y.IDComparatorS30S0000000_2;
import android.content.Context;
import android.content.Intent;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.ugc.android.editor.core.EditorProContext;
import com.zhiliaoapp.musically.R;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.636, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass636 implements AnonymousClass639, InterfaceC73592SuS {
    public static final AnonymousClass636 LJLIL = new AnonymousClass636();

    @Override // X.AnonymousClass639
    public IDComparatorS30S0000000_2 get() {
        return new IDComparatorS30S0000000_2(68);
    }

    public static final void LIZLLL(Intent intent) {
        int intExtra = intent.getIntExtra("is_from_push", 0);
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "push_id");
        String str = "";
        if (LLJJIJIIJIL == null) {
            LLJJIJIIJIL = "";
        }
        String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(intent, "id");
        if (LLJJIJIIJIL2 != null) {
            str = LLJJIJIIJIL2;
        }
        if (intExtra > 0 && !TextUtils.isEmpty(LLJJIJIIJIL)) {
            HashMap<String, String> hashMap = AnonymousClass638.LIZ;
            hashMap.put("is_from_push", String.valueOf(intExtra));
            hashMap.put("push_id", LLJJIJIIJIL);
            hashMap.put("push_aid", str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final List LJ(List list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AutoCutMediaModel autoCutMediaModel = (AutoCutMediaModel) it.next();
                autoCutMediaModel.getClass();
                arrayList.add(new AutoCutMediaModel(autoCutMediaModel.filePath, autoCutMediaModel.fileUriPath, autoCutMediaModel.width, autoCutMediaModel.height, autoCutMediaModel.isVideoType, autoCutMediaModel.duration, autoCutMediaModel.cutStartTime, autoCutMediaModel.cutDuration, autoCutMediaModel.speed, null, 512, 0 == true ? 1 : 0));
            }
        }
        return ORZ.LLJI(arrayList);
    }

    public static final AutoCutThemeData LJII(AutoCutModel autoCutModel) {
        AutoCutThemeData autoCutThemeData;
        o.LJIIIZ(autoCutModel, "<this>");
        Iterator<AutoCutThemeData> it = autoCutModel.templateList.iterator();
        while (true) {
            if (it.hasNext()) {
                autoCutThemeData = it.next();
                if (autoCutThemeData.isPreset) {
                    break;
                }
            } else {
                autoCutThemeData = null;
                break;
            }
        }
        return autoCutThemeData;
    }

    public static final boolean LJIIJJI(NLETrackSlot nLETrackSlot) {
        NLESegmentAudio nLESegmentAudio = (NLESegmentAudio) NLESegmentAudio.class.getMethod("LIZLLL", NLENode.class).invoke(null, nLETrackSlot.LJI());
        if (nLESegmentAudio == null || nLESegmentAudio.LJIILJJIL() == 0.0f) {
            return true;
        }
        return false;
    }

    public static final boolean LJIIL(NLETrackSlot nLETrackSlot) {
        o.LJIIIZ(nLETrackSlot, "<this>");
        return o.LJ(nLETrackSlot.getExtra("text_slot_type"), "SUBTITLE");
    }

    public static final boolean LJIILIIL(C132205Gu c132205Gu) {
        o.LJIIIZ(c132205Gu, "<this>");
        List LJJIJIIJI = C47261Igj.LJJIJIIJI(1, 6, 101, 102);
        if (!TextUtils.isEmpty(c132205Gu.LJLIL) && LJJIJIIJI.contains(Integer.valueOf(c132205Gu.LJLJI))) {
            return true;
        }
        return false;
    }

    public static final boolean LJIILJJIL(Context context) {
        o.LJIIIZ(context, "<this>");
        if (context.getResources().getInteger(R.integer.c7) != 0) {
            return true;
        }
        return false;
    }

    public static final boolean LJIILL(NLETrackSlot nLETrackSlot) {
        o.LJIIIZ(nLETrackSlot, "<this>");
        return o.LJ(nLETrackSlot.getExtra("text_slot_type"), "TEXT_STICKER");
    }

    public static final TextStickerData LJIL(NLETrackSlot nLETrackSlot) {
        o.LJIIIZ(nLETrackSlot, "<this>");
        String extra = nLETrackSlot.getExtra("text_sticker_data");
        o.LJIIIIZZ(extra, "slot.getExtra(\n         …A_FOR_SLOT,\n            )");
        TextStickerData LIZIZ = C132815Jd.LIZIZ(extra);
        LIZIZ.setRotation(nLETrackSlot.getRotation());
        LIZIZ.setScale(nLETrackSlot.getScale());
        long j = 1000;
        LIZIZ.setStartTime((int) (nLETrackSlot.getStartTime() / j));
        LIZIZ.setEndTime((int) (nLETrackSlot.getEndTime() / j));
        String extra2 = nLETrackSlot.getExtra("color");
        o.LJIIIIZZ(extra2, "slot.getExtra(KEY_COLOR_FOR_SLOT)");
        LIZIZ.setColor(CastIntegerProtector.parseInt(extra2));
        String extra3 = nLETrackSlot.getExtra("text_wrap_list");
        o.LJIIIIZZ(extra3, "slot.getExtra(KEY_TEXT_WRAP_LIST_FOR_SLOT)");
        LIZIZ.setTextWrapList(C132815Jd.LIZJ(extra3));
        LIZIZ.setFontType(nLETrackSlot.getExtra("font_type"));
        String extra4 = nLETrackSlot.getExtra("align");
        o.LJIIIIZZ(extra4, "slot.getExtra(KEY_ALIGN_FOR_SLOT)");
        LIZIZ.setAlign(CastIntegerProtector.parseInt(extra4));
        String extra5 = nLETrackSlot.getExtra("bg_mode");
        o.LJIIIIZZ(extra5, "slot.getExtra(KEY_BG_MODE_FOR_SLOT)");
        LIZIZ.setBgMode(CastIntegerProtector.parseInt(extra5));
        LIZIZ.setTextStr(nLETrackSlot.getExtra("text"));
        LIZIZ.setX(nLETrackSlot.getTransformX() + 0.5f);
        LIZIZ.setY(nLETrackSlot.getTransformY() + 0.5f);
        LIZIZ.setPlaceholderSlotId(nLETrackSlot.getUUID());
        return LIZIZ;
    }

    public static final C63A LJJ(int i) {
        if (i >= 0 && i < C63A.values().length) {
            return C63A.values()[i];
        }
        return null;
    }

    public static final boolean LJJI(NLEModel nLEModel) {
        boolean z;
        boolean z2;
        NLEResourceAV LJ;
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList LIZ = C07080Po.LIZ(tracks, "tracks");
        Iterator<NLETrack> it = tracks.iterator();
        while (it.hasNext()) {
            NLETrack next = it.next();
            NLETrack nLETrack = next;
            if (nLETrack.LJIIZILJ() == EnumC123864ta.VIDEO || C124574uj.LJJJJIZL(nLETrack) || o.LJ(nLETrack.getExtra("AudioTrackType"), EnumC122254qz.ORIGIN_VOICE_CONVERSION.name())) {
                LIZ.add(next);
            }
        }
        Iterator it2 = LIZ.iterator();
        while (it2.hasNext()) {
            Iterator<NLETrackSlot> it3 = ((NLETrack) it2.next()).LJIILL().iterator();
            while (it3.hasNext()) {
                NLETrackSlot it4 = it3.next();
                o.LJIIIIZZ(it4, "it");
                Float f = null;
                NLESegmentVideo nLESegmentVideo = (NLESegmentVideo) NLESegmentVideo.class.getMethod("LJJ", NLENode.class).invoke(null, it4.LJI());
                if (nLESegmentVideo != null) {
                    z = nLESegmentVideo.LJJII();
                } else {
                    z = true;
                }
                NLESegmentAudio nLESegmentAudio = (NLESegmentAudio) NLESegmentVideo.class.getMethod("LJJ", NLENode.class).invoke(null, it4.LJI());
                if (nLESegmentAudio != null && (LJ = nLESegmentAudio.LJ()) != null) {
                    z2 = LJ.LJIIZILJ();
                } else {
                    z2 = true;
                }
                NLESegment LJI = it4.LJI();
                if (LJI != null) {
                    f = Float.valueOf(C124574uj.LJJIIZI(LJI));
                }
                if (!o.LIZJ(f, 0.0f) && z2 && z) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // X.InterfaceC73592SuS
    public boolean test(Object it) {
        o.LJIIIZ(it, "it");
        if (it == EnumC74492TLk.PRE_SHOW || it == EnumC74492TLk.PRE_HIDE) {
            return true;
        }
        return false;
    }

    public static final void LIZ(String str, JSONObject jSONObject) {
        HashMap<String, String> hashMap = AnonymousClass638.LIZ;
        String str2 = hashMap.get("push_aid");
        if (str2 != null && o.LJ(str2, str) && AnonymousClass638.LIZ() > 0) {
            jSONObject.put("is_from_push", AnonymousClass638.LIZ());
            jSONObject.put("push_id", hashMap.get("push_id"));
        }
    }

    public static final void LIZIZ(C188727au c188727au, String str) {
        HashMap<String, String> hashMap = AnonymousClass638.LIZ;
        String str2 = hashMap.get("push_aid");
        if (str2 != null && o.LJ(str2, str) && AnonymousClass638.LIZ() > 0) {
            c188727au.LIZLLL(AnonymousClass638.LIZ(), "is_from_push");
            c188727au.LJI("push_id", hashMap.get("push_id"));
        }
    }

    public static final void LIZJ(JHM jhm, String str) {
        o.LJIIIZ(jhm, "<this>");
        HashMap<String, String> hashMap = AnonymousClass638.LIZ;
        String str2 = hashMap.get("push_aid");
        if (str2 != null && o.LJ(str2, str) && AnonymousClass638.LIZ() > 0) {
            jhm.LIZJ(AnonymousClass638.LIZ(), "is_from_push");
            jhm.LIZLLL("push_id", hashMap.get("push_id"));
        }
    }

    public static final void LJFF(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                V0N.LJFF(th, th2);
            }
        }
    }

    public static final int LJI(AutoCutModel autoCutModel, int i) {
        o.LJIIIZ(autoCutModel, "<this>");
        return C45063HmN.LIZIZ(LJIIIZ(autoCutModel, i), autoCutModel.curIndexFromSource, LJJ(autoCutModel.curSource));
    }

    public static final int LJIIIIZZ(int i, Context context) {
        o.LJIIIZ(context, "<this>");
        Integer LJI = C79045V0n.LJI(i, context);
        if (LJI != null) {
            return LJI.intValue();
        }
        Integer LJI2 = C79045V0n.LJI(i, new C25600zU(context, R.style.ul));
        if (LJI2 != null) {
            return LJI2.intValue();
        }
        return -1;
    }

    public static final List LJIIIZ(AutoCutModel autoCutModel, int i) {
        AutoCutThemeData autoCutThemeData;
        AutoCutThemeData autoCutThemeData2;
        String str;
        boolean LJ;
        o.LJIIIZ(autoCutModel, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator<AutoCutThemeData> it = autoCutModel.templateList.iterator();
        while (true) {
            if (it.hasNext()) {
                autoCutThemeData = it.next();
                if (autoCutThemeData.LIZ() == C63A.ACTION_AI) {
                    break;
                }
            } else {
                autoCutThemeData = null;
                break;
            }
        }
        AutoCutThemeData autoCutThemeData3 = autoCutThemeData;
        if (autoCutThemeData3 != null) {
            arrayList.add(autoCutThemeData3);
        }
        Iterator<AutoCutThemeData> it2 = autoCutModel.templateList.iterator();
        while (true) {
            if (it2.hasNext()) {
                autoCutThemeData2 = it2.next();
                if (autoCutThemeData2.LIZ() == C63A.SOUND_SYNC) {
                    break;
                }
            } else {
                autoCutThemeData2 = null;
                break;
            }
        }
        AutoCutThemeData autoCutThemeData4 = autoCutThemeData2;
        if (autoCutThemeData4 != null) {
            arrayList.add(autoCutThemeData4);
        }
        List<AutoCutThemeData> list = autoCutModel.templateList;
        ArrayList arrayList2 = new ArrayList();
        for (AutoCutThemeData autoCutThemeData5 : list) {
            AutoCutThemeData autoCutThemeData6 = autoCutThemeData5;
            if (autoCutThemeData6.LIZ() == C63A.AUTO_CUT && autoCutThemeData6.indexFromSource >= 0) {
                String str2 = autoCutThemeData6.musicId;
                if (autoCutThemeData4 != null) {
                    str = autoCutThemeData4.musicId;
                } else {
                    str = null;
                }
                if (!o.LJ(str2, str) || autoCutThemeData6.templateType == EnumC43998HOo.CUT_SAME.getValue()) {
                    if (autoCutThemeData3 != null) {
                        if (autoCutThemeData3.templateType == EnumC43998HOo.CUT_SAME.getValue()) {
                            LJ = o.LJ(autoCutThemeData3.templateId, autoCutThemeData6.templateId);
                        } else {
                            LJ = o.LJ(autoCutThemeData3.musicId, autoCutThemeData6.musicId);
                        }
                        if (LJ) {
                        }
                    }
                    arrayList2.add(autoCutThemeData5);
                }
            }
        }
        arrayList.addAll(ORZ.LLILII(new IDComparatorS30S0000000_2(25), arrayList2));
        if (arrayList.size() > i && i > 0) {
            return arrayList.subList(0, i);
        }
        return arrayList;
    }

    public static final boolean LJIIJ(List list, List list2) {
        o.LJIIIZ(list, "<this>");
        o.LJIIIZ(list2, "list");
        if (list.size() != list2.size()) {
            return false;
        }
        if (list.isEmpty()) {
            return true;
        }
        boolean z = true;
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i >= 0) {
                AutoCutMediaModel autoCutMediaModel = (AutoCutMediaModel) obj;
                if (z && o.LJ(autoCutMediaModel.filePath, ((AutoCutMediaModel) ListProtector.get(list2, i)).filePath)) {
                    z = true;
                } else {
                    z = false;
                }
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        return z;
    }

    public static final boolean LJIJJ(NLEModel nLEModel, VideoPublishEditModel videoPublishEditModel) {
        CreativeModel creativeModel;
        if (C138615cH.LIZ(nLEModel, videoPublishEditModel)) {
            return false;
        }
        NLETrack LIZLLL = C5FC.LIZLLL(nLEModel);
        if ((((LIZLLL != null && LIZLLL.LJIILL() != null) || (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null && creativeModel.inlineCaptionModel != null)) && C5FC.LJIIIZ(nLEModel)) || !LJJI(nLEModel)) {
            return false;
        }
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList LIZ = C07080Po.LIZ(tracks, "tracks");
        Iterator<NLETrack> it = tracks.iterator();
        while (it.hasNext()) {
            NLETrack next = it.next();
            NLETrack it2 = next;
            o.LJIIIIZZ(it2, "it");
            if (C124574uj.LJJIJIL(it2)) {
                LIZ.add(next);
            }
        }
        Iterator it3 = LIZ.iterator();
        while (it3.hasNext()) {
            Iterator<NLETrackSlot> it4 = ((NLETrack) it3.next()).LJIILL().iterator();
            while (it4.hasNext()) {
                NLETrackSlot it5 = it4.next();
                o.LJIIIIZZ(it5, "it");
                if (!LJIIJJI(it5)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final ArrayList LJIILLIIL(EditorProContext editorProContext, Integer num, Integer num2) {
        if (editorProContext == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        NLETrack LIZLLL = C5FC.LIZLLL(C79057V0z.LJJI(editorProContext));
        if (LIZLLL != null) {
            Iterator<NLETrackSlot> it = LIZLLL.LJIILL().iterator();
            while (it.hasNext()) {
                NLETrackSlot slot = it.next();
                o.LJIIIIZZ(slot, "slot");
                TextStickerData LJIL = LJIL(slot);
                if (num2 != null && num != null) {
                    LJIL.setX(LJIL.getX() * num.intValue());
                    LJIL.setY(LJIL.getY() * num2.intValue());
                }
                arrayList.add(LJIL);
            }
        }
        if (arrayList.size() > 1) {
            C40675Fxn.LJJLIIIJ(arrayList, new IDComparatorS30S0000000_2(70));
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public static final void LJIIZILJ(View view, Integer num, Integer num2) {
        int intValue;
        int intValue2;
        o.LJIIIZ(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        boolean z = false;
        if (num != null && layoutParams.width != (intValue2 = num.intValue())) {
            layoutParams.width = intValue2;
            z = true;
        }
        if (num2 != null && layoutParams.height != (intValue = num2.intValue())) {
            layoutParams.height = intValue;
        } else if (!z) {
            return;
        }
        view.setLayoutParams(layoutParams);
    }

    public static void LJIJI(SpannableString spannableString, int i, int i2) {
        int max = Math.max(0, i);
        if (TextUtils.isEmpty(spannableString) || max > i2 || max >= spannableString.length() || i2 > spannableString.length()) {
            return;
        }
        spannableString.setSpan(new StyleSpan(1), max, i2, 17);
    }

    public static /* synthetic */ void LJIJ(View view, Integer num, Integer num2, int i) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        LJIIZILJ(view, num, num2);
    }

    public static final void LJIJJLI(AutoCutModel autoCutModel, int i, C63A c63a, int i2, String str, String str2) {
        int i3;
        o.LJIIIZ(autoCutModel, "<this>");
        autoCutModel.curIndexFromSource = i;
        if (c63a != null) {
            i3 = c63a.ordinal();
        } else {
            i3 = -1;
        }
        autoCutModel.curSource = i3;
        autoCutModel.curTemplateType = i2;
        autoCutModel.curTemplateId = str;
        autoCutModel.curTemplateGroupId = str2;
    }
}
