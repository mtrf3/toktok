package X;

import Y.ARunnableS42S0100000_6;
import Y.ARunnableS45S0100000_9;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.friendstab.model.UserNewContent;
import com.ss.android.ugc.aweme.friendstab.service.ISocial2TabRedDotService;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LHZ implements ISocial2TabRedDotService {
    public static final LHZ LIZ = new LHZ();

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabRedDotService
    public final String getRedDotRequestId() {
        String str = C36203EIt.LIZ;
        C36203EIt.LIZ = null;
        return str;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabRedDotService
    public final C35585Dxt getRedDotMetadataBeforeEnteringTab() {
        return C36207EIx.LIZ().Yi();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabRedDotService
    public final LIV getSocialTabNoticeData() {
        return C36207EIx.LIZ().getSocialTabNoticeData();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabRedDotService
    public final LHX redDotAsListener() {
        return C36207EIx.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabRedDotService
    public final InterfaceC54017LHx redDotInterface() {
        return C36207EIx.LIZ().zA();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabRedDotService
    public final InterfaceC53995LHb redDotLogic() {
        return C36207EIx.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabRedDotService
    public final java.util.Set<String> originalNumberDotList() {
        return C36203EIt.LJIIIIZZ;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabRedDotService
    public final int numberCountByTag(String tag) {
        o.LJIIIZ(tag, "tag");
        return C36207EIx.LIZ().KY(tag);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabRedDotService
    public final void visitSocial2Tab(String tabName) {
        o.LJIIIZ(tabName, "tabName");
        LAT.LIZIZ(tabName);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabRedDotService
    public final void onAwemeRead(int i, Aweme aweme) {
        ArrayList<UserNewContent> arrayList;
        o.LJIIIZ(aweme, "aweme");
        if (i != 31) {
            String aid = aweme.getAid();
            long currentTimeMillis = System.currentTimeMillis();
            String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
            o.LJIIIIZZ(aid, "aid");
            o.LJIIIIZZ(curUserId, "curUserId");
            C54859Lfz c54859Lfz = new C54859Lfz(aid, currentTimeMillis, i, curUserId, 0, 96);
            LW8 lw8 = LW8.LIZIZ;
            lw8.LIZ.LJII(c54859Lfz);
            if (C36203EIt.LJIIIIZZ.contains(aweme.getAid())) {
                C36203EIt.LJII.remove(aweme.getAid());
                String aid2 = aweme.getAid();
                o.LJIIIIZZ(aid2, "aweme.aid");
                long currentTimeMillis2 = System.currentTimeMillis();
                String curUserId2 = ((RBX) HG3.LJIILL()).getCurUserId();
                o.LJIIIIZZ(curUserId2, "userService().curUserId");
                lw8.LIZ.LJII(new C54859Lfz(aid2, currentTimeMillis2, i, curUserId2, 1, 64));
                C2NH.LIZ.post(new ARunnableS42S0100000_6(aweme, 148));
            }
            ArrayList<UserNewContent> arrayList2 = C36203EIt.LJI;
            if (arrayList2 != null) {
                Iterator<UserNewContent> it = arrayList2.iterator();
                int i2 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    UserNewContent next = it.next();
                    if (o.LJ(aweme.getAid(), next.getItemId()) && o.LJ(aweme.getAuthorUid(), next.getUser().getUid())) {
                        if (i2 >= 0 && (arrayList = C36203EIt.LJI) != null) {
                            ListProtector.remove(arrayList, i2);
                        }
                    } else {
                        i2++;
                    }
                }
            }
            C2NH.LIZ.post(new ARunnableS45S0100000_9(aweme, 162));
        }
    }
}
