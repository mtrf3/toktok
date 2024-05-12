package X;

import Y.IDComparatorS35S0000000_7;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.model.PublishExtensionModel;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class GTI implements GTK {
    public static boolean LIZJ(CreateAnchorInfo createAnchorInfo) {
        if (createAnchorInfo.getType() == EnumC42934Gt8.DONATION_STICKER.getTYPE() || createAnchorInfo.getType() == EnumC42934Gt8.PROP.getTYPE() || createAnchorInfo.getType() == EnumC42934Gt8.ANCHOR_SOUND_SYNC.getTYPE() || createAnchorInfo.getType() == EnumC42934Gt8.ANCHOR_EDIT_EFFECT.getTYPE() || createAnchorInfo.getType() == EnumC42934Gt8.ANCHOR_UGC_TEMPLATE.getTYPE() || createAnchorInfo.getType() == EnumC42934Gt8.ANCHOR_PUGC_TEMPLATE.getTYPE() || createAnchorInfo.getType() == EnumC42934Gt8.TTS_VOICE.getTYPE() || createAnchorInfo.getType() == EnumC42934Gt8.ANCHOR_VOICECONVERSION.getTYPE() || createAnchorInfo.getType() == EnumC42934Gt8.ANCHOR_EDITOR_PRO.getTYPE()) {
            return true;
        }
        return false;
    }

    @Override // X.GTK
    public final void LIZIZ(BaseShortVideoContext baseShortVideoContext, List<CreateAnchorInfo> list) {
        java.util.Map LJJJLIIL;
        PublishExtensionModel fromContext = PublishExtensionModel.fromContext(baseShortVideoContext);
        String str = fromContext.anchorContent;
        if (str == null || (LJJJLIIL = (HashMap) GsonProtectorUtils.fromJson(C75792yF.LIZIZ(), str, (Class) new HashMap().getClass())) == null) {
            LJJJLIIL = C113554cx.LJJJLIIL();
        }
        if (o.LJ(LJJJLIIL.get("common_type"), Boolean.TRUE)) {
            int i = fromContext.anchorBusinessType;
            String str2 = fromContext.anchorTitle;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            String str4 = fromContext.anchorContent;
            if (str4 != null) {
                str3 = str4;
            }
            ((ArrayList) list).add(new CreateAnchorInfo(i, str2, "", "", str3, null, null, null, null, null, fromContext.anchorSubtype, null, false, 7136, null));
        }
    }

    @Override // X.GTK
    public final void LIZ(BaseShortVideoContext videoContext, LinkedHashMap<String, String> linkedHashMap, List<CreateAnchorInfo> list) {
        java.util.Map LJJJLIIL;
        String str;
        int i;
        String str2 = "";
        o.LJIIIZ(videoContext, "videoContext");
        List<CreateAnchorInfo> list2 = PublishExtensionModel.fromContext(videoContext).createAnchorInfos;
        if (list2 != null) {
            if (C53258KvG.LIZIZ()) {
                if (C53258KvG.LIZ() == 5 && list != null) {
                    Iterator it = ((ArrayList) list).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (((CreateAnchorInfo) it.next()).getType() == EnumC42934Gt8.POI.getTYPE()) {
                            list2.clear();
                            break;
                        }
                    }
                }
                if (list2.size() == 1) {
                    Object obj = ListProtector.get(list2, 0);
                    o.LJIIIIZZ(obj, "it[0]");
                    if (LIZJ((CreateAnchorInfo) obj)) {
                        if (list != null) {
                            ORS.LJJLIL(new AqS173S0100000_7(list2, (List<AutoCutThemeData>) 228), list);
                        } else {
                            return;
                        }
                    } else if (list == null) {
                        return;
                    } else {
                        ((ArrayList) list).clear();
                    }
                    if (((ArrayList) list).isEmpty()) {
                        ((ArrayList) list).addAll(list2);
                        return;
                    }
                    return;
                }
            } else {
                ORS.LJJLIL(new AqS173S0100000_7(this, 229), list2);
                if (list != null) {
                    ((ArrayList) list).addAll(list2);
                }
            }
        }
        PublishExtensionModel fromContext = PublishExtensionModel.fromContext(videoContext);
        String str3 = fromContext.anchorContent;
        if (str3 == null || (LJJJLIIL = (HashMap) GsonProtectorUtils.fromJson(C75792yF.LIZIZ(), str3, (Class) new HashMap().getClass())) == null) {
            LJJJLIIL = C113554cx.LJJJLIIL();
        }
        if (o.LJ(LJJJLIIL.get("common_type"), Boolean.TRUE)) {
            try {
                String str4 = fromContext.anchorContent;
                if (str4 == null) {
                    str4 = "";
                }
                str = new JSONObject(str4).optString("url");
                o.LJIIIIZZ(str, "jsonObject.optString(\"url\")");
            } catch (Exception unused) {
                str = "";
            }
            if (list != null) {
                int i2 = fromContext.anchorBusinessType;
                String str5 = fromContext.anchorTitle;
                if (str5 == null) {
                    str5 = "";
                }
                String str6 = fromContext.anchorContent;
                if (str6 != null) {
                    str2 = str6;
                }
                ((ArrayList) list).add(new CreateAnchorInfo(i2, str5, str, "", str2, null, null, null, null, null, fromContext.anchorSubtype, null, false, 7136, null));
            }
        }
        if (C53258KvG.LIZIZ()) {
            if (list != null) {
                ArrayList arrayList = (ArrayList) list;
                if (arrayList.isEmpty() || arrayList.size() == 1) {
                    return;
                }
                if (arrayList.size() > 1) {
                    C40675Fxn.LJJLIIIJ(list, new IDComparatorS35S0000000_7(5));
                }
                if (arrayList.isEmpty()) {
                    i = 0;
                } else {
                    Iterator it2 = arrayList.iterator();
                    i = 0;
                    while (it2.hasNext()) {
                        if (((CreateAnchorInfo) ListProtector.get(list, 0)).getType() == ((CreateAnchorInfo) it2.next()).getType() && (i = i + 1) < 0) {
                            C47261Igj.LJJJJIZL();
                            throw null;
                        }
                    }
                }
                arrayList.removeAll(ORZ.LLIILZL(ORZ.LLIIIL(C78842Uww.LJJ(0, i - 1), C78842Uww.LJJ(i, arrayList.size())), list));
                return;
            }
            return;
        }
        if (list == null) {
            return;
        }
        Collections.reverse(list);
        if (((ArrayList) list).size() <= 1) {
            return;
        }
        C40675Fxn.LJJLIIIJ(list, new IDComparatorS35S0000000_7(6));
    }
}
