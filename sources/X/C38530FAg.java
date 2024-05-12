package X;

import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ugc.aweme.shortvideo.ImportVideoInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.wavepublish.story.DescriptionData;
import com.ss.android.ugc.aweme.wavepublish.story.DescriptionDataWrapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.FAg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38530FAg {
    public static final String LIZ(VideoPublishEditModel editModel) {
        String str;
        DescriptionDataWrapper descriptionDataWrapper;
        DescriptionData data;
        o.LJIIIZ(editModel, "editModel");
        if (editModel.importInfoList.isEmpty() || !editModel.isUploadVideo()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        ArrayList<ImportVideoInfo> arrayList = editModel.importInfoList;
        if (arrayList != null) {
            Iterator<ImportVideoInfo> it = arrayList.iterator();
            while (it.hasNext()) {
                HashMap<String, String> metaData = TEVideoUtils.getMetaData(it.next().getRealImportPath());
                if (metaData == null || metaData.isEmpty() || (descriptionDataWrapper = (DescriptionDataWrapper) C75792yF.LIZ(metaData.get("com.apple.quicktime.information"), DescriptionDataWrapper.class)) == null || (data = descriptionDataWrapper.getData()) == null || (str = data.getPropList()) == null) {
                    str = "";
                }
                if (str.length() > 0) {
                    if (sb.length() > 0) {
                        sb.append(",");
                    }
                    sb.append(str);
                }
            }
        }
        List<String> LLILLL = ORZ.LLILLL(ORZ.LLJJ(s.LJLJJI(sb, new char[]{','}, false, 6)), 5);
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : LLILLL) {
            if (sb2.length() > 0) {
                sb2.append(",");
            }
            sb2.append(str2);
        }
        String sb3 = sb2.toString();
        o.LJIIIIZZ(sb3, "filteredStringBuilder.toString()");
        return sb3;
    }
}
