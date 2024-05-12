package com.ss.android.ugc.aweme.hybrid.container;

import X.C59055NFr;
import X.ND5;
import X.ND6;
import X.ND7;
import X.NGS;
import X.ORZ;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ujb.o;

/* loaded from: classes11.dex */
public final class AnoleAdHybridGecko implements NGS<Aweme> {
    @Override // X.NGS
    public ND7 obtainGeckoConfig(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AnoleModel anoleModel;
        Map<String, AnoleComponentModel> components;
        Collection<AnoleComponentModel> values;
        String LIZ = C59055NFr.LIZ("scene_anole_format");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (anoleModel = awemeRawAd.getAnoleModel()) != null && (components = anoleModel.getComponents()) != null && (values = components.values()) != null) {
            for (AnoleComponentModel anoleComponentModel : values) {
                List<String> geckoChannels = anoleComponentModel.getGeckoChannels();
                if (geckoChannels != null) {
                    ArrayList arrayList = new ArrayList();
                    for (String str : geckoChannels) {
                        if (!o.LJJJJJL(str)) {
                            arrayList.add(str);
                        }
                    }
                    List LLJI = ORZ.LLJI(arrayList);
                    if (LLJI != null) {
                        linkedHashMap.put(new ND6(LIZ, anoleComponentModel.getType()), LLJI);
                    }
                }
            }
        }
        return new ND5(linkedHashMap);
    }
}
