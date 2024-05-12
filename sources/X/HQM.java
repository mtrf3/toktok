package X;

import android.app.Dialog;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.internal.PrivacyServiceImpl;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import defpackage.e1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS111S0300000_7;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HQM extends HSS {
    @Override // X.S1E
    public final S1E clone() {
        return new HQM();
    }

    @Override // X.HSS, X.S1E
    public final int type() {
        return EnumC42934Gt8.ANCHOR_UGC_TEMPLATE.getTYPE();
    }

    @Override // X.HSS, X.S1E
    public final void LJ(C188727au eventMapBuilder) {
        String str;
        AnchorCommonStruct anchorCommonStruct;
        o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        List<AnchorCommonStruct> anchors = LJJII().getAnchors();
        o.LJIIIIZZ(anchors, "aweme().anchors");
        Iterator<AnchorCommonStruct> it = anchors.iterator();
        while (true) {
            str = null;
            if (it.hasNext()) {
                anchorCommonStruct = it.next();
                if (anchorCommonStruct.getType() == EnumC42934Gt8.ANCHOR_UGC_TEMPLATE.getTYPE()) {
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
        Object obj;
        MusicModel convertToMusicModel;
        if (PrivacyServiceImpl.LIZIZ().isChildrenMode()) {
            return EnumC26289ATl.NOT_FOUND;
        }
        Music music = LJJII().getMusic();
        String str = null;
        if (music != null && (convertToMusicModel = music.convertToMusicModel()) != null && CommerceMediaServiceImpl.LIZJ().LIZ() && !convertToMusicModel.isCommerceMusic()) {
            return EnumC26289ATl.NOT_FOUND;
        }
        ArrayList<Long> arrayList = new ArrayList<>();
        try {
            Iterator it = ((ArrayList) list).iterator();
            while (true) {
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
            if (anchorCommonStruct != null) {
                str = anchorCommonStruct.getExtra();
            }
            new com.google.gson.o();
            String LJJIFFI = com.google.gson.o.LIZ(str).LJIIZILJ().LJJIJ("nle_summary").LJJIFFI();
            if (TextUtils.isEmpty(LJJIFFI)) {
                return EnumC26289ATl.NOT_FOUND;
            }
            new com.google.gson.o();
            arrayList.addAll((List) C75792yF.LIZIZ().LIZLLL(com.google.gson.o.LIZ(LJJIFFI).LJIIZILJ().LJJIJ("featurebits").LJIILLIIL(), new HQN().getType()));
            if (!AVExternalServiceImpl.LIZ().infoService().supportFeatureBits(arrayList)) {
                return EnumC26289ATl.NOT_FOUND;
            }
            if (!e1.LIZ(31744, "studio_creation_enable_ugc_template_anchor", true, false)) {
                return EnumC26289ATl.NOT_FOUND;
            }
            return super.LJFF(list);
        } catch (Exception unused) {
            return EnumC26289ATl.NOT_FOUND;
        }
    }

    @Override // X.HSS, X.S1E
    public final void LJI(C188727au c188727au) {
        String str;
        AnchorCommonStruct anchorCommonStruct;
        List<AnchorCommonStruct> anchors = LJJII().getAnchors();
        o.LJIIIIZZ(anchors, "aweme().anchors");
        Iterator<AnchorCommonStruct> it = anchors.iterator();
        while (true) {
            str = null;
            if (it.hasNext()) {
                anchorCommonStruct = it.next();
                if (anchorCommonStruct.getType() == EnumC42934Gt8.ANCHOR_UGC_TEMPLATE.getTYPE()) {
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
        o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        LJJJJIZL(new AqS173S0100000_7(this, 251));
        List<AnchorCommonStruct> anchors = LJJII().getAnchors();
        o.LJIIIIZZ(anchors, "aweme().anchors");
        Iterator<AnchorCommonStruct> it = anchors.iterator();
        while (true) {
            str = null;
            if (it.hasNext()) {
                anchorCommonStruct = it.next();
                if (anchorCommonStruct.getType() == EnumC42934Gt8.ANCHOR_PUGC_TEMPLATE.getTYPE()) {
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
        o.LJIIIZ(dialog, "dialog");
        LJJJJIZL(new AqS111S0300000_7(viewGroup, this, c188727au, 22));
    }
}
