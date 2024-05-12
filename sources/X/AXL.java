package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AXL implements InterfaceC252619vl {
    public final /* synthetic */ C53665L4j LJLIL;

    public AXL(C53665L4j c53665L4j) {
        this.LJLIL = c53665L4j;
    }

    @Override // X.InterfaceC252619vl
    public final void t0(int i, User user, User user2) {
        boolean z;
        boolean z2;
        UrlModel avatarVideoUri;
        List<String> urlList;
        UrlModel avatarMedium;
        List<String> urlList2;
        if (user2 == null || user == null) {
            return;
        }
        if (o.LJ(user.getAvatarMedium(), user2.getAvatarMedium()) || (avatarMedium = user2.getAvatarMedium()) == null || (urlList2 = avatarMedium.getUrlList()) == null || urlList2.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (o.LJ(user.getAvatarVideoUri(), user2.getAvatarVideoUri()) || (avatarVideoUri = user2.getAvatarVideoUri()) == null || (urlList = avatarVideoUri.getUrlList()) == null || urlList.isEmpty()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z && !z2) {
            return;
        }
        C53665L4j c53665L4j = this.LJLIL;
        C71799SFv c71799SFv = c53665L4j.LJLILLLLZI;
        if (c71799SFv != null) {
            AU3.LIZIZ(c71799SFv, c53665L4j.LJLJJL, user2);
            if (!this.LJLIL.LJJ().containsKey(EnumC53663L4h.PROFILE)) {
                return;
            }
            List<String> list = user2.boldFields;
            if (z) {
                if (list != null) {
                    if (!list.contains("photo")) {
                        list = ORZ.LLIIJI("photo", list);
                    }
                } else {
                    list = C47261Igj.LJJIJIL("photo");
                }
            }
            if (z2) {
                if (list != null) {
                    if (!list.contains("video")) {
                        list = ORZ.LLIIJI("video", list);
                    }
                } else {
                    list = C47261Igj.LJJIJIL("video");
                }
            }
            ((RBX) HG3.LJIILL()).getCurUser().boldFields = list;
            user2.setBoldFields(list);
            this.LJLIL.LJIIIIZZ(user2, false, null);
            return;
        }
        o.LJIJI("avatarView");
        throw null;
    }
}
