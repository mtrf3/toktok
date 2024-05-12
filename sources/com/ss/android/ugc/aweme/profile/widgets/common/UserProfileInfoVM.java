package com.ss.android.ugc.aweme.profile.widgets.common;

import X.C234989Kc;
import X.C234999Kd;
import X.C237109Sg;
import X.C26175APb;
import X.C47704Ins;
import X.C55749LuL;
import X.C65352Pkq;
import X.C8VC;
import X.C9PN;
import X.EnumC235129Kq;
import X.InterfaceC214228aw;
import X.InterfaceC235069Kk;
import X.InterfaceC235089Km;
import X.InterfaceC237119Sh;
import X.XKX;
import android.text.TextUtils;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class UserProfileInfoVM extends AssemViewModel<C234989Kc> {
    public final InterfaceC214228aw<InterfaceC237119Sh> LJLIL;
    public final C55749LuL LJLILLLLZI;
    public String LJLJI;
    public String LJLJJI;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C234989Kc defaultState() {
        return new C234989Kc(0);
    }

    public final int gv0() {
        Integer num;
        String str;
        NewFaceStickerBean stickerEntranceInfo;
        C26175APb c26175APb = (C26175APb) this.LJLILLLLZI.getValue();
        String str2 = null;
        if (c26175APb != null) {
            num = Integer.valueOf(c26175APb.LJLJLLL);
        } else {
            num = null;
        }
        Aweme hv0 = hv0();
        if (hv0 != null && (stickerEntranceInfo = hv0.getStickerEntranceInfo()) != null) {
            str2 = stickerEntranceInfo.ownerId;
        }
        Aweme hv02 = hv0();
        if (hv02 != null) {
            str = hv02.getAuthorUid();
        } else {
            str = "";
        }
        boolean equals = TextUtils.equals(str2, str);
        if (TextUtils.equals(jv0(), "music_detail")) {
            return 1;
        }
        if (TextUtils.equals(jv0(), "prop_page")) {
            return 3;
        }
        if (!TextUtils.equals(jv0(), "general_search") || num == null || num.intValue() != 2) {
            if (!TextUtils.equals(jv0(), "general_search") || num == null || num.intValue() != 3) {
                if (!TextUtils.equals(jv0(), "general_search") || num == null || num.intValue() != 1) {
                    if (equals) {
                        return 7;
                    }
                    return 0;
                }
                return 6;
            }
            return 4;
        }
        return 2;
    }

    public final Aweme hv0() {
        C9PN c9pn = (C9PN) C8VC.LJIIIZ(this, C65352Pkq.LIZ(InterfaceC235089Km.class));
        if (c9pn != null) {
            return c9pn.LJI;
        }
        return null;
    }

    public final User iv0() {
        C234999Kd c234999Kd = (C234999Kd) C8VC.LJIIIZ(this, C65352Pkq.LIZ(InterfaceC235069Kk.class));
        if (c234999Kd != null) {
            return c234999Kd.LIZ;
        }
        return null;
    }

    public final String jv0() {
        String str;
        C9PN c9pn = (C9PN) C8VC.LJIIIZ(this, C65352Pkq.LIZ(InterfaceC235089Km.class));
        if (c9pn != null) {
            str = c9pn.LIZLLL;
        } else {
            str = null;
        }
        if (TextUtils.equals(str, "prop_page") && hv0() != null) {
            return "prop_page_detail_aweme";
        }
        return str;
    }

    public UserProfileInfoVM(InterfaceC214228aw<InterfaceC237119Sh> repository) {
        o.LJIIIZ(repository, "repository");
        this.LJLIL = repository;
        this.LJLILLLLZI = new C55749LuL(C47704Ins.LJFF(this, C26175APb.class, null), true);
    }

    public final void kv0(int i, EnumC235129Kq action) {
        o.LJIIIZ(action, "action");
        XKX.LIZLLL(getAssemVMScope(), null, null, new C237109Sg(this, i, action, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object lv0(com.ss.android.ugc.aweme.profile.presenter.UserResponse r18, X.EnumC235129Kq r19, X.InterfaceC67352kd<? super X.C76800UCe> r20) {
        /*
            Method dump skipped, instructions count: 736
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.widgets.common.UserProfileInfoVM.lv0(com.ss.android.ugc.aweme.profile.presenter.UserResponse, X.9Kq, X.2kd):java.lang.Object");
    }
}
