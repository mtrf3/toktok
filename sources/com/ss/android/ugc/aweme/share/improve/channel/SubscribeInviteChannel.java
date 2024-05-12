package com.ss.android.ugc.aweme.share.improve.channel;

import X.AbstractC62625Ohx;
import X.C2068389v;
import X.C4L0;
import X.C62374Odu;
import X.C78609UtB;
import X.C86V;
import X.InterfaceC62573Oh7;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.channel.share.model.PureLogicChannel;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.share.improve.pkg.LiveSubscribeSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SubscribeInviteChannel extends PureLogicChannel {
    public final SharePackage LJLIL;

    @Override // X.InterfaceC62225ObV
    public final boolean LIZ(Context context, AbstractC62625Ohx content) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(content, "content");
        return true;
    }

    @Override // X.InterfaceC62225ObV
    public final String key() {
        return "subscribe_invite";
    }

    @Override // X.InterfaceC62225ObV
    public final String label() {
        String LJFF = C86V.LJFF(R.string.r5l);
        o.LJIIIIZZ(LJFF, "getString(R.string.share_to_friend)");
        return LJFF;
    }

    public SubscribeInviteChannel(LiveSubscribeSharePackage liveSubscribeSharePackage) {
        this.LJLIL = liveSubscribeSharePackage;
    }

    @Override // X.InterfaceC62225ObV
    public final Drawable LIZJ(Context context) {
        if (context != null) {
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_color_direct_message_circle;
            return c2068389v.LIZ(context);
        }
        return null;
    }

    @Override // X.InterfaceC62225ObV
    public final boolean LJIIJ(AbstractC62625Ohx content, Context context, InterfaceC62573Oh7 interfaceC62573Oh7) {
        o.LJIIIZ(content, "content");
        o.LJIIIZ(context, "context");
        if (C78609UtB.LJJLIIIJ(context) == null || TextUtils.isEmpty(this.LJLIL.extras.getString("uid", ""))) {
            return false;
        }
        String string = this.LJLIL.extras.getString("uid", "");
        IMUser iMUser = new IMUser();
        iMUser.setUid(string);
        try {
            String imDesc = this.LJLIL.extras.getString("subscribe_third_party_desc", "");
            String linkUrl = this.LJLIL.extras.getString("url_for_im_share", "");
            C62374Odu c62374Odu = new C62374Odu();
            c62374Odu.LIZ = "subscribe_invite";
            c62374Odu.LJ(this.LJLIL.title);
            o.LJIIIIZZ(imDesc, "imDesc");
            c62374Odu.LJ = imDesc;
            c62374Odu.LIZJ(this.LJLIL.identifier);
            o.LJIIIIZZ(linkUrl, "linkUrl");
            c62374Odu.LJFF = linkUrl;
            SharePackage sharePackage = new SharePackage(c62374Odu);
            sharePackage.extras.putAll(this.LJLIL.extras);
            IMService.createIIMServicebyMonsterPlugin(false).getShareService().LIZIZ(iMUser, sharePackage, new C4L0() { // from class: X.4ja
                @Override // X.C4L0
                public final /* bridge */ /* synthetic */ void run(Object obj) {
                }
            });
            return true;
        } catch (Exception unused) {
            return true;
        }
    }
}
