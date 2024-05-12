package X;

import Y.ARunnableS14S0201000_11;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class V18 implements InterfaceC173286r6, InterfaceC80027Vax {
    public static int LJLIL = 200;

    public static final Bundle LIZJ(java.util.Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new OSZ(entry.getKey(), entry.getValue()));
        }
        OSZ[] oszArr = (OSZ[]) arrayList.toArray(new OSZ[0]);
        return V3N.LJ((OSZ[]) Arrays.copyOf(oszArr, oszArr.length));
    }

    public static final boolean LIZLLL(ShortVideoContext shortVideoContext) {
        o.LJIIIZ(shortVideoContext, "<this>");
        if (!HVI.LIZ()) {
            return false;
        }
        if (shortVideoContext.creativeModel.toUploadAlbum || C46140I8y.LIZ(shortVideoContext.enterFrom)) {
            return true;
        }
        if ((!C45810HyQ.LIZ() && !V1A.LIZ() && !V19.LIZ()) || !LJI(shortVideoContext)) {
            return false;
        }
        return true;
    }

    public static final boolean LJI(ShortVideoContext shortVideoContext) {
        o.LJIIIZ(shortVideoContext, "<this>");
        if (shortVideoContext.isStory || shortVideoContext.mIsFromDraft || C78685UuP.LJJJZ(shortVideoContext.newDraftId) || o.LJ(shortVideoContext.enterFrom, "super_entrance") || shortVideoContext.LJJIFFI()) {
            return false;
        }
        String str = shortVideoContext.presetEffectId;
        if ((str != null && str.length() != 0) || shortVideoContext.putPresetStickerAtFirst) {
            return false;
        }
        String str2 = shortVideoContext.fromPropId;
        if ((str2 != null && str2.length() != 0) || shortVideoContext.isSpecialPlusIcon != 0 || !"direct_shoot".equals(shortVideoContext.shootWay)) {
            return false;
        }
        return true;
    }

    public static final String LJII(User user) {
        o.LJIIIZ(user, "<this>");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("User(uid: ");
        LIZ.append(user.getUid());
        LIZ.append(", nickname: ");
        LIZ.append(user.getNickname());
        LIZ.append(", follow_status: ");
        LIZ.append(user.getFollowStatus());
        LIZ.append(", rid: ");
        LIZ.append(user.getRequestId());
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public void LJFF(Exception exception) {
        o.LJIIIZ(exception, "exception");
        C48027It5.LIZIZ(C64920Pds.LIZ(EF7.LIZIZ(), exception), "music", "list");
        C54502LaE.LIZLLL("single_song", EnumC1804076e.FAIL, 4);
    }

    public static final String LJ(android.net.Uri uri, String str) {
        o.LJIIIZ(uri, "<this>");
        String queryParameter = UriProtector.getQueryParameter(uri, str);
        if (queryParameter == null) {
            return null;
        }
        if (queryParameter.length() == 0) {
            queryParameter = null;
        }
        return queryParameter;
    }

    @Override // X.InterfaceC80027Vax
    public void LIZ(Object obj, AqS180S0100000_14 aqS180S0100000_14) {
        C73363Sql c73363Sql;
        V1L v1l = (V1L) obj;
        if (v1l == null) {
            c73363Sql = null;
        } else {
            c73363Sql = new C73363Sql(v1l.getPlayUrl(), v1l.getLocalPath(), v1l.getPlayModel(), 12);
        }
        aqS180S0100000_14.invoke(c73363Sql);
    }

    @Override // X.InterfaceC173286r6
    public void LJIILLIIL(boolean z, C67233Qa5 c67233Qa5, ARunnableS14S0201000_11 aRunnableS14S0201000_11) {
        if (z) {
            FMX.LJIIL("push_withdraw_success", C67233Qa5.LIZ(c67233Qa5));
        }
        aRunnableS14S0201000_11.run();
    }

    @Override // X.InterfaceC173286r6
    public void LIZIZ(Context context, C67230Qa2 c67230Qa2, List list, ARunnableS14S0201000_11 aRunnableS14S0201000_11) {
        C67231Qa3.LIZ(this, context, c67230Qa2, list, aRunnableS14S0201000_11);
    }
}
