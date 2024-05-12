package com.ss.android.ugc.aweme.share.improve.pkg;

import X.C30869C9p;
import X.C46181IAn;
import X.C4LD;
import X.C53293Kvp;
import X.C62262Oc6;
import X.C62326Od8;
import X.C62374Odu;
import X.C62390OeA;
import X.C76800UCe;
import X.EnumC62261Oc5;
import X.InterfaceC62225ObV;
import X.InterfaceC62486Ofi;
import X.InterfaceC62573Oh7;
import X.InterfaceC88472Yns;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.ss.android.ugc.aweme.profile.model.GeneralPermission;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class UserSharePackage extends LinkDefaultSharePackage {
    public User user;
    public static final C62390OeA Companion = new C62390OeA();
    public static final int $stable = 8;

    public final User LJIILL() {
        User user = this.user;
        if (user != null) {
            return user;
        }
        o.LJIJI("user");
        throw null;
    }

    public UserSharePackage(C62374Odu c62374Odu) {
        super(c62374Odu);
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final boolean LJIIIIZZ(InterfaceC62486Ofi action, Context context) {
        String shareProfileToast;
        o.LJIIIZ(action, "action");
        o.LJIIIZ(context, "context");
        if (action instanceof C46181IAn) {
            GeneralPermission generalPermission = LJIILL().getGeneralPermission();
            String str = null;
            if (generalPermission != null) {
                str = generalPermission.getShareProfileToast();
            }
            if (!TextUtils.isEmpty(str)) {
                GeneralPermission generalPermission2 = LJIILL().getGeneralPermission();
                if (generalPermission2 != null && (shareProfileToast = generalPermission2.getShareProfileToast()) != null) {
                    C30869C9p.LIZIZ(context, shareProfileToast);
                    return true;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.share.improve.pkg.LinkDefaultSharePackage, com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final boolean LIZLLL(InterfaceC62225ObV channel, Context context, View view, InterfaceC62573Oh7 interfaceC62573Oh7, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        String shareProfileToast;
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(context, "context");
        GeneralPermission generalPermission = LJIILL().getGeneralPermission();
        String str = null;
        if (generalPermission != null) {
            str = generalPermission.getShareProfileToast();
        }
        if (!TextUtils.isEmpty(str)) {
            GeneralPermission generalPermission2 = LJIILL().getGeneralPermission();
            if (generalPermission2 != null && (shareProfileToast = generalPermission2.getShareProfileToast()) != null) {
                C30869C9p.LIZIZ(context, shareProfileToast);
            }
            interfaceC88472Yns.invoke(Boolean.TRUE);
            return true;
        }
        C4LD.LIZIZ.LJJIL(0, channel.key());
        if (!C53293Kvp.LIZIZ()) {
            String string = this.extras.getString("panel_source");
            if (string == null) {
                string = "";
            }
            if (TextUtils.equals("screenshot_popup", string) && !o.LJ(channel.key(), "chat_merge") && new C62326Od8(channel).LIZ(context, this, new C62262Oc6(interfaceC88472Yns, interfaceC62573Oh7)) != EnumC62261Oc5.ILLEGAL) {
                return true;
            }
            return false;
        }
        return false;
    }
}
