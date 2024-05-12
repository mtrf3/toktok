package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.PoiAnchorData;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.7fy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C191867fy {
    public static PoiAnchorData LIZ(Aweme aweme) {
        AnchorCommonStruct anchorCommonStruct;
        o.LJIIIZ(aweme, "aweme");
        List<AnchorCommonStruct> anchors = aweme.getAnchors();
        PoiAnchorData poiAnchorData = null;
        if (anchors == null) {
            return null;
        }
        Iterator<AnchorCommonStruct> it = anchors.iterator();
        while (true) {
            if (it.hasNext()) {
                anchorCommonStruct = it.next();
                AnchorCommonStruct anchorCommonStruct2 = anchorCommonStruct;
                if (anchorCommonStruct2.getType() == 45 && anchorCommonStruct2.getExtra().length() > 0) {
                    break;
                }
            } else {
                anchorCommonStruct = null;
                break;
            }
        }
        AnchorCommonStruct anchorCommonStruct3 = anchorCommonStruct;
        if (anchorCommonStruct3 == null) {
            return null;
        }
        try {
            PoiAnchorData poiAnchorData2 = (PoiAnchorData) C75792yF.LIZIZ().LJI(anchorCommonStruct3.getExtra(), PoiAnchorData.class);
            String keyword = anchorCommonStruct3.getKeyword();
            String description = anchorCommonStruct3.getDescription();
            UrlModel icon = anchorCommonStruct3.getIcon();
            String groupId = aweme.getGroupId();
            o.LJIIIIZZ(poiAnchorData2, "poiAnchorData");
            poiAnchorData = PoiAnchorData.copy$default(poiAnchorData2, null, keyword, null, description, 0, null, null, null, null, groupId, icon, null, 2533, null);
            return poiAnchorData;
        } catch (Exception unused) {
            return poiAnchorData;
        }
    }
}
