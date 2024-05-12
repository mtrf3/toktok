package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiLiveApi;

/* renamed from: X.TUa */
/* loaded from: classes14.dex */
public final class C74716TUa {
    public static /* synthetic */ AbstractC73638SvC LIZ(MultiLiveApi multiLiveApi, long j, long j2, long j3, String str, int i, int i2) {
        return multiLiveApi.getListByType(j, j2, j3, str, i, 0, i2, 0);
    }

    public static /* synthetic */ AbstractC73672Svk LIZIZ(MultiLiveApi multiLiveApi, long j, long j2, long j3, int i, int i2, int i3, int i4, String str, String str2, int i5, int i6, long j4, int i7) {
        if ((i7 & 512) != 0) {
            i5 = 0;
        }
        if ((i7 & 2048) != 0) {
            j4 = 0;
        }
        return multiLiveApi.updateAnchorPanelSettings(j, j2, j3, i, i2, i3, i4, str, str2, i5, i6, j4);
    }
}
