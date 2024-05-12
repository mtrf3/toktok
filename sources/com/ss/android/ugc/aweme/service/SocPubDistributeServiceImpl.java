package com.ss.android.ugc.aweme.service;

import X.AV1;
import X.C212068Ty;
import X.C26308AUe;
import X.C7EI;
import X.EnumC53719L6l;
import X.InterfaceC100393wp;
import X.InterfaceC88472Yns;
import X.L60;
import X.L61;
import X.L6M;
import X.L6Q;
import X.L6V;
import X.L6Y;
import X.UC0;
import com.ss.android.ugc.aweme.avatar.SocialAvatarEntry;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.AqS69S0400000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class SocPubDistributeServiceImpl implements ISocPubDistributeService {
    @Override // com.ss.android.ugc.aweme.service.ISocPubDistributeService
    public final C26308AUe LIZ() {
        return (C26308AUe) L6M.LIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.service.ISocPubDistributeService
    public final InterfaceC100393wp LIZIZ(C212068Ty c212068Ty) {
        if (!L60.LIZ(c212068Ty.LIZ).LJIIJJI(c212068Ty.LIZLLL)) {
            return new L6Q(c212068Ty);
        }
        SocialAvatarEntry socialAvatarEntry = new SocialAvatarEntry(c212068Ty.LIZ, c212068Ty.LIZIZ, c212068Ty.LIZJ, c212068Ty.LIZLLL);
        socialAvatarEntry.LJLJJLL = c212068Ty.LJFF;
        socialAvatarEntry.LJLJJL = c212068Ty.LJ;
        socialAvatarEntry.LJLJL = c212068Ty.LJI;
        socialAvatarEntry.LJLJLJ = c212068Ty.LJII;
        socialAvatarEntry.LJLJLLL = c212068Ty.LJIIIIZZ;
        socialAvatarEntry.LJLL = c212068Ty.LJIIIZ;
        socialAvatarEntry.LJLLI = c212068Ty.LJIIJ;
        socialAvatarEntry.LJLLLL = c212068Ty.LJIIL;
        socialAvatarEntry.LJLLLLLL = c212068Ty.LJIIJJI;
        return socialAvatarEntry;
    }

    @Override // com.ss.android.ugc.aweme.service.ISocPubDistributeService
    public final boolean LIZJ(EnumC53719L6l scene) {
        o.LJIIIZ(scene, "scene");
        return C7EI.LIZ(scene);
    }

    @Override // com.ss.android.ugc.aweme.service.ISocPubDistributeService
    public final boolean LJ(User user) {
        if (user != null && user.isLive() && UC0.LJJLI() && !AV1.LJIIZILJ(user, false)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.service.ISocPubDistributeService
    public final void LIZLLL(L61 bizTag, EnumC53719L6l enumC53719L6l, List list, InterfaceC88472Yns mapUser) {
        o.LJIIIZ(bizTag, "bizTag");
        o.LJIIIZ(mapUser, "mapUser");
        L6Y l6y = (L6Y) L6V.LIZIZ().get(bizTag);
        if (l6y == null || list == null) {
            return;
        }
        L6V.LIZ(new AqS69S0400000_9(list, (List<Object>) mapUser, (InterfaceC88472Yns<Object, ? extends User>) l6y, (L6Y) enumC53719L6l, (EnumC53719L6l) 5));
    }
}
