package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ui.EmbaddedWindowInfo;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public final class HMI {
    static {
        C16880lQ.LJLLJ(HMI.class);
    }

    public static String LIZ(ShortVideoContext shortVideoContext) {
        List<EmbaddedWindowInfo> list;
        String path = shortVideoContext.cameraComponentModel.mWorkspace.E().getPath();
        Integer valueOf = Integer.valueOf((int) shortVideoContext.cameraComponentModel.mTotalRecordingTime);
        Integer valueOf2 = Integer.valueOf(shortVideoContext.cameraComponentModel.mVideoWidth);
        Integer valueOf3 = Integer.valueOf(shortVideoContext.cameraComponentModel.mVideoHeight);
        if (shortVideoContext.LJJJI()) {
            list = shortVideoContext.cameraComponentModel.duetContext.windowInfoList;
        } else {
            list = null;
        }
        return LIZIZ(path, valueOf, valueOf2, valueOf3, list);
    }

    public static String LIZIZ(String str, Integer num, Integer num2, Integer num3, List list) {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList(1);
        arrayList2.add(str);
        ArrayList arrayList3 = new ArrayList(1);
        arrayList3.add(num);
        ArrayList arrayList4 = new ArrayList(1);
        arrayList4.add(num2);
        ArrayList arrayList5 = new ArrayList(1);
        arrayList5.add(num3);
        if (list != null) {
            arrayList = new ArrayList();
            arrayList.add(list);
        } else {
            arrayList = null;
        }
        return LIZJ(true, false, arrayList2, arrayList3, arrayList4, arrayList5, null, arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x005f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZJ(boolean r12, boolean r13, java.util.List r14, java.util.List r15, java.util.List r16, java.util.List r17, java.util.List r18, java.util.List r19) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HMI.LIZJ(boolean, boolean, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List):java.lang.String");
    }
}
