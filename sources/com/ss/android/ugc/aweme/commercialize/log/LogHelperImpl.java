package com.ss.android.ugc.aweme.commercialize.log;

import X.AXU;
import X.C1799074g;
import X.C188577af;
import X.C235399Lr;
import X.C40443Fu3;
import X.C50913JyX;
import X.C58096Mr6;
import X.C78688UuS;
import X.C7ZV;
import X.E1X;
import X.FMX;
import X.InterfaceC1798974f;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.notice.api.helper.LogHelper;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LogHelperImpl implements LogHelper {
    public static LogHelper LJIIIIZZ() {
        Object LIZ = C58096Mr6.LIZ(LogHelper.class, false);
        if (LIZ != null) {
            return (LogHelper) LIZ;
        }
        if (C58096Mr6.LLLLLLL == null) {
            synchronized (LogHelper.class) {
                if (C58096Mr6.LLLLLLL == null) {
                    C58096Mr6.LLLLLLL = new LogHelperImpl();
                }
            }
        }
        return C58096Mr6.LLLLLLL;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.helper.LogHelper
    public final void LIZIZ() {
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", "message");
        hashMap.put("ui_type", "new_type");
        FMX.LJIIL("enter_live_merge", hashMap);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.helper.LogHelper
    public final void LIZLLL() {
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", "message");
        hashMap.put("ui_type", "normal_type");
        FMX.LJIIL("live_merge_show", hashMap);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.helper.LogHelper
    public final void LIZ(RecyclerView recyclerView) {
        C40443Fu3.LIZ("mus_new_notification").LJIIIIZZ(recyclerView);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.helper.LogHelper
    public final void LJ(String str) {
        C50913JyX c50913JyX = new C50913JyX(0);
        c50913JyX.LJLJJLL = str;
        c50913JyX.LJIILIIL();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.helper.LogHelper
    public final void LIZJ(int i, String str, String str2) {
        C188577af c188577af = new C188577af();
        c188577af.LIZLLL = "member_list";
        c188577af.LJJL = "message";
        c188577af.LJJLI = "other_places";
        c188577af.LJJLIIIJL = "follow_button";
        c188577af.LJJLIIIJ = str;
        c188577af.LJJLJ = str2;
        c188577af.LJJZZIII = i;
        c188577af.LJIILIIL();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.helper.LogHelper
    public final void LJFF(User user, String enterFrom, String str) {
        boolean z;
        String str2;
        o.LJIIIZ(enterFrom, "enterFrom");
        boolean z2 = false;
        if (E1X.LIZ() && user.getFollowStatus() == 1) {
            z = true;
        } else {
            z = false;
            if (AXU.LIZJ(user)) {
                z2 = true;
            }
        }
        C235399Lr c235399Lr = new C235399Lr("follow_refuse");
        C1799074g c1799074g = InterfaceC1798974f.LIZ;
        c235399Lr.LJ("enter_from", enterFrom, c1799074g);
        c235399Lr.LJ("to_user_id", user.getUid(), c1799074g);
        String str3 = "1";
        if (z2) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c235399Lr.LJ("has_label", str2, c1799074g);
        if (!z) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        c235399Lr.LJ("has_follow_tag", str3, c1799074g);
        c235399Lr.LJIILIIL();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.helper.LogHelper
    public final void LJII(int i, String enterFrom, String str) {
        o.LJIIIZ(enterFrom, "enterFrom");
        C7ZV c7zv = new C7ZV();
        c7zv.LIZLLL = enterFrom;
        c7zv.LJJLI = "click_card";
        c7zv.LJJLIIIJJIZ = str;
        c7zv.LJLILLLLZI = i;
        c7zv.LJIILIIL();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.helper.LogHelper
    public final void LJI(Context context, String str, long j, String str2) {
        C78688UuS.LJJJJLL(1, str2, j, C78688UuS.LJJIJIL("message", "head", str));
    }
}
