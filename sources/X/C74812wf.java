package X;

import com.ss.android.ugc.aweme.paidcontent.api.PaidCollectionApi;

/* renamed from: X.2wf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C74812wf {
    public static /* synthetic */ AbstractC73672Svk LIZ(PaidCollectionApi.GetPaidCollectionListApi getPaidCollectionListApi, long j, int i, Long l, int i2) {
        int i3;
        Long l2 = l;
        long j2 = j;
        int i4 = i;
        if ((i2 & 1) != 0) {
            j2 = 0;
        }
        if ((i2 & 2) != 0) {
            i4 = 1;
        }
        if ((i2 & 8) != 0) {
            i3 = 10;
        } else {
            i3 = 0;
        }
        if ((i2 & 16) != 0) {
            l2 = null;
        }
        return getPaidCollectionListApi.getPaidCollectionList(j2, i4, 0L, i3, l2);
    }
}
