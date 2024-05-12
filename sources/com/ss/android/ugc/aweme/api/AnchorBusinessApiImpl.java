package com.ss.android.ugc.aweme.api;

import X.C58096Mr6;
import X.C75792yF;
import X.EnumC42934Gt8;
import X.HG3;
import X.HQT;
import X.RBX;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.internal.PrivacyServiceImpl;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import defpackage.e1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class AnchorBusinessApiImpl implements IAnchorBusinessApi {
    public static IAnchorBusinessApi LIZIZ() {
        Object LIZ = C58096Mr6.LIZ(IAnchorBusinessApi.class, false);
        if (LIZ != null) {
            return (IAnchorBusinessApi) LIZ;
        }
        if (C58096Mr6.LLIIIL == null) {
            synchronized (IAnchorBusinessApi.class) {
                if (C58096Mr6.LLIIIL == null) {
                    C58096Mr6.LLIIIL = new AnchorBusinessApiImpl();
                }
            }
        }
        return C58096Mr6.LLIIIL;
    }

    @Override // com.ss.android.ugc.aweme.api.IAnchorBusinessApi
    public final boolean LIZ(Aweme aweme) {
        AnchorCommonStruct anchorCommonStruct;
        boolean z;
        String str;
        String extra;
        String str2;
        MusicModel convertToMusicModel;
        o.LJIIIZ(aweme, "aweme");
        if (PrivacyServiceImpl.LIZIZ().isChildrenMode()) {
            return false;
        }
        Music music = aweme.getMusic();
        AnchorCommonStruct anchorCommonStruct2 = null;
        if (music != null && (convertToMusicModel = music.convertToMusicModel()) != null && CommerceMediaServiceImpl.LIZJ().LIZ() && !convertToMusicModel.isCommerceMusic()) {
            return false;
        }
        ArrayList<Long> arrayList = new ArrayList<>();
        try {
            List<AnchorCommonStruct> anchors = aweme.getAnchors();
            o.LJIIIIZZ(anchors, "aweme.anchors");
            Iterator<AnchorCommonStruct> it = anchors.iterator();
            while (true) {
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
            AnchorCommonStruct anchorCommonStruct3 = anchorCommonStruct;
            String str3 = "";
            if (anchorCommonStruct3 != null && (extra = anchorCommonStruct3.getExtra()) != null) {
                new com.google.gson.o();
                String LJJIFFI = com.google.gson.o.LIZ(extra).LJIIZILJ().LJJIJ("nle_summary").LJJIFFI();
                if (TextUtils.isEmpty(LJJIFFI)) {
                    return false;
                }
                new com.google.gson.o();
                arrayList.addAll((List) C75792yF.LIZIZ().LIZLLL(com.google.gson.o.LIZ(LJJIFFI).LJIIZILJ().LJJIJ("featurebits").LJIILLIIL(), new HQT().getType()));
                Object opt = new JSONObject(extra).opt("is_hide");
                if (opt == null || (str2 = opt.toString()) == null) {
                    str2 = "";
                }
                z = o.LJ("1", str2);
            } else {
                z = false;
            }
            if (!AVExternalServiceImpl.LIZ().infoService().supportFeatureBits(arrayList) || z) {
                return false;
            }
            if (aweme.getAnchors() != null) {
                List<AnchorCommonStruct> anchors2 = aweme.getAnchors();
                o.LJIIIIZZ(anchors2, "anchors");
                if (!anchors2.isEmpty()) {
                    List<AnchorCommonStruct> anchors3 = aweme.getAnchors();
                    o.LJIIIIZZ(anchors3, "anchors");
                    Iterator<AnchorCommonStruct> it2 = anchors3.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (it2.next().getType() == EnumC42934Gt8.ANCHOR_PUGC_TEMPLATE.getTYPE()) {
                            List<AnchorCommonStruct> anchors4 = aweme.getAnchors();
                            o.LJIIIIZZ(anchors4, "anchors");
                            Iterator<AnchorCommonStruct> it3 = anchors4.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    break;
                                }
                                AnchorCommonStruct next = it3.next();
                                if (next.getType() == EnumC42934Gt8.ANCHOR_PUGC_TEMPLATE.getTYPE()) {
                                    anchorCommonStruct2 = next;
                                    break;
                                }
                            }
                            AnchorCommonStruct anchorCommonStruct4 = anchorCommonStruct2;
                            if (anchorCommonStruct4 == null || (str = anchorCommonStruct4.getExtra()) == null) {
                                str = "";
                            }
                            try {
                                Object opt2 = new JSONObject(str).opt("author_id");
                                if (opt2 != null) {
                                    String obj = opt2.toString();
                                    if (obj != null) {
                                        str3 = obj;
                                    }
                                }
                            } catch (Exception unused) {
                            }
                            if (o.LJ(str3, ((RBX) HG3.LJIILL()).getCurUserId())) {
                                return true;
                            }
                        }
                    }
                }
            }
            if (!e1.LIZ(31744, "enable_pugc_template_anchor", true, false)) {
                return false;
            }
            return true;
        } catch (Exception unused2) {
            return false;
        }
    }
}
