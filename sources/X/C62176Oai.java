package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import kotlin.jvm.internal.o;

/* renamed from: X.Oai, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62176Oai extends GKC {
    public final User LJLILLLLZI;

    public C62176Oai(User user) {
        o.LJIIIZ(user, "user");
        this.LJLILLLLZI = user;
    }

    @Override // X.InterfaceC62486Ofi
    public final void LIZLLL(Context context, BaseSharePackage sharePackage) {
        String str;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sharePackage, "sharePackage");
        Bundle bundle = new Bundle();
        bundle.putString("nick_name", this.LJLILLLLZI.getNickname());
        bundle.putString("unique_id", this.LJLILLLLZI.getUniqueId());
        String string = sharePackage.extras.getString("enter_from");
        String string2 = sharePackage.extras.getString("enter_method");
        String LJIIIIZZ = AV1.LJIIIIZZ(this.LJLILLLLZI);
        o.LJIIIIZZ(LJIIIIZZ, "getUid(user)");
        C62188Oau c62188Oau = new C62188Oau(4, LJIIIIZZ, bundle);
        Activity LJJLIIIJ = C78609UtB.LJJLIIIJ(context);
        if (LJJLIIIJ != null) {
            C4LD.LIZ.LJJJI(LJJLIIIJ, sharePackage.itemType, c62188Oau, string, string2);
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("platform", "qr_code");
        Bundle bundle2 = sharePackage.extras;
        if (bundle2 != null) {
            str = bundle2.getString("related_gid");
        } else {
            str = null;
        }
        String str2 = "";
        if (str == null) {
            str = "";
        }
        c188727au.LJIIIZ("from_gid", str);
        String string3 = sharePackage.extras.getString("enter_from");
        if (string3 == null) {
            string3 = "";
        }
        c188727au.LJIIIZ("enter_from", string3);
        String string4 = sharePackage.extras.getString("enter_method");
        if (string4 != null) {
            str2 = string4;
        }
        c188727au.LJIIIZ("enter_method", str2);
        c188727au.LJIIIZ("author_id", this.LJLILLLLZI.getUid());
        FMX.LJIIL("share_person", c188727au.LIZ);
    }
}
