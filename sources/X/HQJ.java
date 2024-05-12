package X;

import android.app.Dialog;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.google.gson.o;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.internal.PrivacyServiceImpl;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.external.ui.AutoCutAnchorConfig;
import com.ss.android.ugc.aweme.shortvideo.model.UgcTemplateSlot;
import defpackage.e1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS111S0300000_7;
import kotlin.jvm.internal.AqS173S0100000_7;

/* loaded from: classes8.dex */
public final class HQJ extends HSS {
    public final String LJLJLJ = "AutoCutAnchorMaker";

    @Override // X.S1E
    public final S1E clone() {
        return new HQJ();
    }

    @Override // X.HSS, X.S1E
    public final int type() {
        return EnumC42934Gt8.ANCHOR_AUTO_CUT.getTYPE();
    }

    public static boolean LJJJJJ(AnchorCommonStruct anchorCommonStruct) {
        try {
            String schema = anchorCommonStruct.getSchema();
            if (schema != null) {
                new o();
                if (o.LIZ(schema).LJIIZILJ().LJJIJ("is_commerce_autocut_music").LJIILJJIL() == 1) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    @Override // X.HSS, X.S1E
    public final void LJ(C188727au eventMapBuilder) {
        String str;
        AnchorCommonStruct anchorCommonStruct;
        kotlin.jvm.internal.o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        List<AnchorCommonStruct> anchors = LJJII().getAnchors();
        kotlin.jvm.internal.o.LJIIIIZZ(anchors, "aweme().anchors");
        Iterator<AnchorCommonStruct> it = anchors.iterator();
        while (true) {
            str = null;
            if (it.hasNext()) {
                anchorCommonStruct = it.next();
                if (anchorCommonStruct.getType() == EnumC42934Gt8.ANCHOR_AUTO_CUT.getTYPE()) {
                    break;
                }
            } else {
                anchorCommonStruct = null;
                break;
            }
        }
        AnchorCommonStruct anchorCommonStruct2 = anchorCommonStruct;
        if (anchorCommonStruct2 != null) {
            str = anchorCommonStruct2.getId();
        }
        eventMapBuilder.LJI("TT_template_id", str);
        LJJJI(eventMapBuilder);
    }

    @Override // X.HSS, X.S1E
    public final EnumC26289ATl LJFF(List<AnchorCommonStruct> list) {
        String str;
        Object obj;
        if (PrivacyServiceImpl.LIZIZ().isChildrenMode()) {
            return EnumC26289ATl.NOT_FOUND;
        }
        if (C00F.LIZ(31744, 0, "show_autocut_anchor", true) == 1 && C00F.LIZ(31744, 0, "autocut_support_anchor", true) == 1) {
            Iterator it = ((ArrayList) list).iterator();
            while (true) {
                str = null;
                if (it.hasNext()) {
                    obj = it.next();
                    if (((AnchorCommonStruct) obj).getType() == type()) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            AnchorCommonStruct anchorCommonStruct = (AnchorCommonStruct) obj;
            if (CommerceMediaServiceImpl.LIZJ().LIZ()) {
                if (!e1.LIZ(31744, "studio_autocut_enable_ttba_anchor", true, false)) {
                    return EnumC26289ATl.NOT_FOUND;
                }
                if (anchorCommonStruct != null && !LJJJJJ(anchorCommonStruct)) {
                    return EnumC26289ATl.NOT_FOUND;
                }
            }
            ArrayList<Long> arrayList = new ArrayList<>();
            new C68322mC();
            if (anchorCommonStruct != null) {
                try {
                    str = anchorCommonStruct.getExtra();
                } catch (Exception unused) {
                    return EnumC26289ATl.NOT_FOUND;
                }
            }
            new o();
            String LJJIFFI = o.LIZ(str).LJIIZILJ().LJJIJ("nle_summary").LJJIFFI();
            if (TextUtils.isEmpty(LJJIFFI)) {
                return EnumC26289ATl.NOT_FOUND;
            }
            new o();
            List LIZLLL = C75792yF.LIZLLL(UgcTemplateSlot[].class, o.LIZ(LJJIFFI).LJIIZILJ().LJJIJ("slots").LJJIFFI());
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : LIZLLL) {
                if (!kotlin.jvm.internal.o.LJ(((UgcTemplateSlot) obj2).type, "audio")) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList arrayList3 = new ArrayList(C32I.LJJL(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(Float.valueOf((float) ((UgcTemplateSlot) it2.next()).getDuration()));
            }
            if (arrayList3.isEmpty()) {
                return EnumC26289ATl.NOT_FOUND;
            }
            new o();
            arrayList.addAll((List) C75792yF.LIZIZ().LIZLLL(o.LIZ(LJJIFFI).LJIIZILJ().LJJIJ("featurebits").LJIILLIIL(), new HQK().getType()));
            if (!AVExternalServiceImpl.LIZ().infoService().supportFeatureBits(arrayList)) {
                return EnumC26289ATl.NOT_FOUND;
            }
            return super.LJFF(list);
        }
        return EnumC26289ATl.NOT_FOUND;
    }

    @Override // X.HSS, X.S1E
    public final void LJI(C188727au c188727au) {
        String str;
        AnchorCommonStruct anchorCommonStruct;
        List<AnchorCommonStruct> anchors = LJJII().getAnchors();
        kotlin.jvm.internal.o.LJIIIIZZ(anchors, "aweme().anchors");
        Iterator<AnchorCommonStruct> it = anchors.iterator();
        while (true) {
            str = null;
            if (it.hasNext()) {
                anchorCommonStruct = it.next();
                if (anchorCommonStruct.getType() == EnumC42934Gt8.ANCHOR_AUTO_CUT.getTYPE()) {
                    break;
                }
            } else {
                anchorCommonStruct = null;
                break;
            }
        }
        AnchorCommonStruct anchorCommonStruct2 = anchorCommonStruct;
        if (anchorCommonStruct2 != null) {
            str = anchorCommonStruct2.getId();
        }
        c188727au.LJI("TT_template_id", str);
        LJJJ(c188727au);
    }

    @Override // X.S1E
    public final void LJIIIIZZ(C188727au eventMapBuilder) {
        String str;
        AnchorCommonStruct anchorCommonStruct;
        kotlin.jvm.internal.o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLJLJ);
        LIZ.append(' ');
        LIZ.append("startAutoCutAlbumActivity");
        H7B.LJ(X1D.LIZIZ(LIZ));
        LJJJJIZL(new AqS173S0100000_7(this, 244));
        List<AnchorCommonStruct> anchors = LJJII().getAnchors();
        kotlin.jvm.internal.o.LJIIIIZZ(anchors, "aweme().anchors");
        Iterator<AnchorCommonStruct> it = anchors.iterator();
        while (true) {
            str = null;
            if (it.hasNext()) {
                anchorCommonStruct = it.next();
                if (anchorCommonStruct.getType() == EnumC42934Gt8.ANCHOR_AUTO_CUT.getTYPE()) {
                    break;
                }
            } else {
                anchorCommonStruct = null;
                break;
            }
        }
        AnchorCommonStruct anchorCommonStruct2 = anchorCommonStruct;
        if (anchorCommonStruct2 != null) {
            str = anchorCommonStruct2.getId();
        }
        eventMapBuilder.LJI("TT_template_id", str);
        HSS.LJJIZ(this, eventMapBuilder, 6);
    }

    @Override // X.HSS, X.S1E
    public final void LJIIJ(ViewGroup viewGroup, Dialog dialog, C188727au c188727au, int i) {
        kotlin.jvm.internal.o.LJIIIZ(dialog, "dialog");
        LJJJJIZL(new AqS111S0300000_7(viewGroup, this, c188727au, 15));
    }

    public static void LJJJJJL(HQJ hqj, boolean z, String str, AutoCutAnchorConfig autoCutAnchorConfig, Integer num, String str2, int i) {
        String str3;
        Boolean bool;
        Integer num2;
        Integer num3;
        List<Float> durationList;
        String templateId;
        String str4 = null;
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            autoCutAnchorConfig = null;
        }
        if ((i & 8) != 0) {
            num = null;
        }
        if ((i & 16) != 0) {
            str2 = null;
        }
        hqj.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("mobAutoCutAnchorParseData: success = ");
        LIZ.append(z);
        LIZ.append(", templateId = ");
        LIZ.append(str);
        LIZ.append(", errCode = ");
        LIZ.append(num);
        LIZ.append(", errMsg = ");
        LIZ.append(str2);
        LIZ.append(", config = ");
        LIZ.append(autoCutAnchorConfig);
        String LIZIZ = X1D.LIZIZ(LIZ);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(hqj.LJLJLJ);
        LIZ2.append(' ');
        LIZ2.append(LIZIZ);
        H7B.LJ(X1D.LIZIZ(LIZ2));
        C188727au c188727au = new C188727au();
        c188727au.LIZLLL(!z ? 1 : 0, "status");
        c188727au.LJFF(num, "error_code");
        c188727au.LJIIIZ("error_msg", str2);
        if (autoCutAnchorConfig != null && (templateId = autoCutAnchorConfig.getTemplateId()) != null) {
            str = templateId;
        }
        c188727au.LJIIIZ("template_id", str);
        if (autoCutAnchorConfig != null) {
            str3 = autoCutAnchorConfig.getMusicId();
        } else {
            str3 = null;
        }
        c188727au.LJIIIZ("music_id", str3);
        if (autoCutAnchorConfig != null) {
            bool = Boolean.valueOf(autoCutAnchorConfig.isCommerceMusic());
        } else {
            bool = null;
        }
        c188727au.LJFF(bool, "is_commerce_music");
        if (autoCutAnchorConfig != null) {
            num2 = Integer.valueOf(autoCutAnchorConfig.getMinClips());
        } else {
            num2 = null;
        }
        c188727au.LJFF(num2, "min_clips");
        if (autoCutAnchorConfig != null) {
            num3 = Integer.valueOf(autoCutAnchorConfig.getMaxClips());
        } else {
            num3 = null;
        }
        c188727au.LJFF(num3, "max_clips");
        if (autoCutAnchorConfig != null && (durationList = autoCutAnchorConfig.getDurationList()) != null) {
            str4 = ORZ.LLD(durationList, null, null, null, null, 63);
        }
        c188727au.LJIIIZ("duration_list", str4);
        FMX.LJIIL("tool_performance_autocut_anchor_parse_data", c188727au.LIZ);
    }
}
