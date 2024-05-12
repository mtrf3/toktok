package X;

import com.ss.android.ugc.aweme.upvote.event.UpvotePublishMobParam;
import java.util.List;

/* renamed from: X.4cX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C113294cX {
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void LIZIZ(C7HV c7hv, String str, boolean z, UpvotePublishMobParam upvotePublishMobParam, boolean z2, InterfaceC65784Pro interfaceC65784Pro, int i) {
        if ((i & 8) != 0) {
            z2 = false;
        }
        if ((i & 16) != 0) {
            interfaceC65784Pro = null;
        }
        c7hv.LJIILLIIL(str, z, upvotePublishMobParam, z2, interfaceC65784Pro);
    }

    public static /* synthetic */ void LIZ(C7HV c7hv, String str, UpvotePublishMobParam upvotePublishMobParam, String str2, List list, List list2, boolean z, InterfaceC65784Pro interfaceC65784Pro, Integer num, boolean z2, int i) {
        List list3 = list;
        String str3 = str2;
        Integer num2 = num;
        List list4 = list2;
        boolean z3 = z;
        boolean z4 = z2;
        InterfaceC65784Pro interfaceC65784Pro2 = null;
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            list3 = null;
        }
        if ((i & 16) != 0) {
            list4 = null;
        }
        if ((i & 32) != 0) {
            z3 = false;
        }
        if ((i & 64) == 0) {
            interfaceC65784Pro2 = interfaceC65784Pro;
        }
        if ((i & 128) != 0) {
            num2 = 0;
        }
        if ((i & 256) != 0) {
            z4 = false;
        }
        c7hv.LJIIL(str, upvotePublishMobParam, str3, list3, list4, z3, interfaceC65784Pro2, num2, z4);
    }
}
