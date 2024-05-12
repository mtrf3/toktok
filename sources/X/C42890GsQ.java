package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.common.AnchorTransData;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.GsQ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42890GsQ {
    public static AnchorTransData LIZ(CreateAnchorInfo anchorInfo) {
        boolean z;
        o.LJIIIZ(anchorInfo, "anchorInfo");
        int type = anchorInfo.getType();
        String content = anchorInfo.getContent();
        String keyword = anchorInfo.getKeyword();
        UrlModel urlModel = new UrlModel();
        urlModel.setUrlList(C47261Igj.LJII(anchorInfo.getIconUrl()));
        urlModel.setUri(android.net.Uri.decode(anchorInfo.getIconUrl()));
        String url = anchorInfo.getUrl();
        String extra = anchorInfo.getExtra();
        Boolean canDelete = anchorInfo.getCanDelete();
        if (canDelete != null) {
            z = canDelete.booleanValue();
        } else {
            z = true;
        }
        return new AnchorTransData(type, content, keyword, null, null, null, urlModel, z, url, null, null, extra, null, false, 13880, null);
    }
}
