package com.ss.android.ugc.aweme.share.improve.channel;

import X.AbstractC62625Ohx;
import X.AnonymousClass114;
import X.C00F;
import X.C0DC;
import X.C108634Od;
import X.C16880lQ;
import X.C2068389v;
import X.C44384HbQ;
import X.C4NQ;
import X.C4R6;
import X.C4RB;
import X.C58704N2e;
import X.C62387Oe7;
import X.C62394OeE;
import X.C78609UtB;
import X.C86V;
import X.EF7;
import X.HG3;
import X.InterfaceC109344Qw;
import X.InterfaceC62573Oh7;
import X.J9P;
import X.OOS;
import X.RBX;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.channel.share.model.PureLogicChannel;
import com.ss.android.ugc.aweme.commercialize.log.FeedRawAdLogUtilsImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.share.improve.channel.ImChannel;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ImChannel extends PureLogicChannel {
    public final SharePackage LJLIL;
    public final String LJLILLLLZI;
    public boolean LJLJI;
    public C4RB LJLJJI;
    public boolean LJLJJL;

    @Override // X.InterfaceC62225ObV
    public final boolean LIZ(Context context, AbstractC62625Ohx content) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(content, "content");
        return true;
    }

    @Override // X.InterfaceC62225ObV
    public final String key() {
        return "chat_merge";
    }

    @Override // X.InterfaceC62225ObV
    public final String label() {
        if (C00F.LIZ(31744, 0, "im_icon_redesign", true) == 4) {
            String LJFF = C86V.LJFF(R.string.pxx);
            o.LJIIIIZZ(LJFF, "getString(R.string.redes…n_dm_icon_tiktok_friends)");
            return LJFF;
        }
        String LJFF2 = C86V.LJFF(R.string.r5l);
        o.LJIIIIZZ(LJFF2, "getString(R.string.share_to_friend)");
        return LJFF2;
    }

    @Override // X.InterfaceC62225ObV
    public final Drawable LIZJ(Context context) {
        String str;
        int i;
        C4R6 imShareAnalytics = IMService.createIIMServicebyMonsterPlugin(false).getImShareAnalytics();
        String str2 = this.LJLILLLLZI;
        if (o.LJ(str2, "group_invite")) {
            str = "group_chat";
        } else {
            str = "post_page";
            if (!o.LJ(str2, "post_page")) {
                str = "share_panel";
            }
        }
        imShareAnalytics.LIZ(str, "show");
        if (context != null) {
            C2068389v c2068389v = new C2068389v();
            if (C00F.LIZ(31744, 0, "im_icon_redesign", true) == 4) {
                i = R.raw.icon_color_dm_icon_experiment_v1;
            } else {
                i = R.raw.icon_color_direct_message_circle;
            }
            c2068389v.LIZ = i;
            return c2068389v.LIZ(context);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.PureLogicChannel, X.InterfaceC62225ObV
    public final void LJIIJJI(int i) {
        if (this.LJLJJL) {
            Bundle bundle = this.LJLIL.extras;
            bundle.putInt("rank_num", i);
            bundle.putString("button_type", "airplane");
            IMService.createIIMServicebyMonsterPlugin(false).getShareService().LJIIJ(this.LJLIL);
            this.LJLJJL = false;
        }
    }

    public ImChannel(SharePackage sharePackage, String enterFrom) {
        o.LJIIIZ(sharePackage, "sharePackage");
        o.LJIIIZ(enterFrom, "enterFrom");
        this.LJLIL = sharePackage;
        this.LJLILLLLZI = enterFrom;
        IMService.createIIMServicebyMonsterPlugin(false).getShareService().LJFF(new C108634Od(EF7.LIZIZ(), sharePackage));
        this.LJLJI = true;
        this.LJLJJL = true;
    }

    @Override // X.InterfaceC62225ObV
    public final boolean LJIIJ(AbstractC62625Ohx content, Context context, InterfaceC62573Oh7 interfaceC62573Oh7) {
        String str;
        Aweme m6;
        o.LJIIIZ(content, "content");
        o.LJIIIZ(context, "context");
        C4R6 imShareAnalytics = IMService.createIIMServicebyMonsterPlugin(false).getImShareAnalytics();
        String str2 = this.LJLILLLLZI;
        if (o.LJ(str2, "group_invite")) {
            str = "group_chat";
        } else {
            str = "post_page";
            if (!o.LJ(str2, "post_page")) {
                str = "share_panel";
            }
        }
        imShareAnalytics.LIZ(str, "click");
        if (o.LJ(this.LJLILLLLZI, "homepage_hot")) {
            IMService.createIIMServicebyMonsterPlugin(false).getShareService().LJIIIZ(this.LJLIL.extras.getLong("clicked_time", System.currentTimeMillis()), "icon");
        }
        AwemeRawAd awemeRawAd = null;
        if (!((RBX) HG3.LJIILL()).isLogin()) {
            J9P.LIZIZ(C78609UtB.LJJLIIIJ(context), this.LJLILLLLZI, "click_shareim_button", null, null);
            return true;
        }
        Activity LJJLIIIJ = C78609UtB.LJJLIIIJ(context);
        if (LJJLIIIJ == null) {
            return false;
        }
        if (!this.LJLJI) {
            AnonymousClass114.LIZ(LJJLIIIJ, R.string.qgv);
            return true;
        }
        this.LJLIL.extras.putString("button_type", "airplane");
        IMService.createIIMServicebyMonsterPlugin(false).getShareService().LJ(this.LJLIL);
        InterfaceC109344Qw shareService = IMService.createIIMServicebyMonsterPlugin(false).getShareService();
        C62394OeE c62394OeE = new C62394OeE();
        c62394OeE.LJIIZILJ = this.LJLIL;
        OOS LJI = shareService.LJI(LJJLIIIJ, new C62387Oe7(c62394OeE), new C4NQ() { // from class: X.4R4
            @Override // X.C4NQ
            public final void LJI() {
            }

            @Override // X.C4NQ
            public final void LIZ(SharePackage sharePackage) {
                o.LJIIIZ(sharePackage, "sharePackage");
                C4RB c4rb = ImChannel.this.LJLJJI;
                if (c4rb != null) {
                    c4rb.LIZLLL(sharePackage);
                }
            }

            @Override // X.C4NQ
            public final void LIZIZ(SharePackage sharePackage) {
                o.LJIIIZ(sharePackage, "sharePackage");
                C4RB c4rb = ImChannel.this.LJLJJI;
                if (c4rb != null) {
                    c4rb.LIZJ(sharePackage);
                }
            }

            @Override // X.C4NQ
            public final void LIZJ(SharePackage sharePackage) {
                o.LJIIIZ(sharePackage, "sharePackage");
                C4RB c4rb = ImChannel.this.LJLJJI;
                if (c4rb != null) {
                    c4rb.LJII(sharePackage);
                }
            }

            @Override // X.C4NQ
            public final void LJFF(SharePackage sharePackage) {
                o.LJIIIZ(sharePackage, "sharePackage");
                C4RB c4rb = ImChannel.this.LJLJJI;
                if (c4rb != null) {
                    c4rb.LIZ(sharePackage);
                }
            }

            @Override // X.C4NQ
            public final void LIZLLL(Dialog dialog, SharePackage sharePackage) {
                C108624Oc.LIZ(dialog, sharePackage);
            }

            @Override // X.C4NQ
            public final void LJ(Dialog dialog, SharePackage sharePackage) {
                C108624Oc.LIZIZ(dialog, sharePackage);
            }
        });
        if (LJI != null) {
            C16880lQ.LIZ(LJI);
        }
        C44384HbQ.LLII("chat_merge");
        long j = this.LJLIL.extras.getLong("ad_id");
        if (j != 0 && (m6 = AwemeService.LIZ().m6(String.valueOf(j))) != null && m6.isAd()) {
            FeedRawAdLogUtilsImpl.LIZIZ().LIZ(context, m6);
            if (m6 != null) {
                awemeRawAd = m6.getAwemeRawAd();
            }
            C0DC.LIZJ(m6, C58704N2e.LIZLLL("draw_ad", "share", awemeRawAd), "anchor_id", m6, "room_id");
        }
        return true;
    }
}
