package com.ss.android.ugc.aweme.share.improve.pkg;

import X.AbstractC62625Ohx;
import X.AnonymousClass030;
import X.C0H1;
import X.C16880lQ;
import X.C188727au;
import X.C38281F0r;
import X.C44498HdG;
import X.C4LD;
import X.C53293Kvp;
import X.C62082OYc;
import X.C62083OYd;
import X.C62084OYe;
import X.C62217ObN;
import X.C62220ObQ;
import X.C62227ObX;
import X.C62239Obj;
import X.C62240Obk;
import X.C62242Obm;
import X.C62243Obn;
import X.C62244Obo;
import X.C62246Obq;
import X.C62248Obs;
import X.C62250Obu;
import X.C62252Obw;
import X.C62255Obz;
import X.C62256Oc0;
import X.C62285OcT;
import X.C62326Od8;
import X.C62340OdM;
import X.C62358Ode;
import X.C62374Odu;
import X.C62434Oes;
import X.C73969T1h;
import X.C76800UCe;
import X.C78609UtB;
import X.EF7;
import X.EnumC62261Oc5;
import X.FMX;
import X.HME;
import X.InterfaceC114114dr;
import X.InterfaceC62085OYf;
import X.InterfaceC62225ObV;
import X.InterfaceC62486Ofi;
import X.InterfaceC62573Oh7;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.OY9;
import X.OYF;
import X.T16;
import X.X1D;
import Y.AfS62S0100000_10;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.aweme.compliance.api.services.share.IShareWarningInfoService;
import com.ss.android.ugc.aweme.feed.model.ACLCommonShare;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.core.ui.campaign.OperationPlatform;
import com.ss.android.ugc.aweme.share.core.ui.campaign.SharingOperationConfig;
import com.ss.android.ugc.aweme.share.improve.channel.QrCodeChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS157S0200000_10;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes11.dex */
public final class AwemeSharePackage extends KtfDefaultSharePackage {
    public Aweme aweme;
    public InterfaceC114114dr interceptChannelClick;
    public static final C62434Oes Companion = new C62434Oes();
    public static final int $stable = 8;

    public final Aweme LJIILLIIL() {
        Aweme aweme = this.aweme;
        if (aweme != null) {
            return aweme;
        }
        o.LJIJI("aweme");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.share.improve.pkg.KtfDefaultSharePackage
    public final Aweme LJIILL() {
        return LJIILLIIL();
    }

    public AwemeSharePackage(C62374Odu c62374Odu) {
        super(c62374Odu);
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final boolean LIZ(InterfaceC62225ObV channel) {
        String str;
        OperationPlatform operationPlatform;
        o.LJIIIZ(channel, "channel");
        String key = channel.key();
        SharingOperationConfig LIZ = C62285OcT.LIZ();
        if (LIZ != null && (operationPlatform = LIZ.operationPlatform) != null) {
            str = operationPlatform.platformId;
        } else {
            str = null;
        }
        return !o.LJ(key, str);
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final boolean LIZIZ(Context context, InterfaceC62225ObV channel) {
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(context, "context");
        InterfaceC114114dr interfaceC114114dr = this.interceptChannelClick;
        if (interfaceC114114dr != null && interfaceC114114dr.LIZ(context, channel)) {
            return true;
        }
        super.LIZIZ(context, channel);
        return false;
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final boolean LJIIIIZZ(InterfaceC62486Ofi action, Context context) {
        o.LJIIIZ(action, "action");
        o.LJIIIZ(context, "context");
        if (!o.LJ(action.key(), "download") || C16880lQ.LLIIJI(EF7.LIZIZ(), null) != null || C78609UtB.LJJJJ(context)) {
            return false;
        }
        OYF.LJII(context, TokenCert.Companion.with("bpea-request_intercept_download_aweme_storage_permission"), null);
        return false;
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final void LJIILIIL(InterfaceC62225ObV channel, InterfaceC88472Yns<? super AbstractC62625Ohx, C76800UCe> interfaceC88472Yns) {
        String LJ;
        o.LJIIIZ(channel, "channel");
        String LIZ = C62358Ode.LIZ(channel, this.itemType, this.description);
        if (TextUtils.isEmpty(this.extras.getString("share_campaign_id"))) {
            LJ = this.url;
        } else {
            C38281F0r c38281F0r = new C38281F0r(this.url);
            String string = this.extras.getString("share_campaign_id");
            String str = CardStruct.IStatusCode.DEFAULT;
            if (string == null) {
                string = CardStruct.IStatusCode.DEFAULT;
            }
            String string2 = this.extras.getString("share_template_id");
            if (string2 == null) {
                string2 = CardStruct.IStatusCode.DEFAULT;
            }
            String string3 = this.extras.getString("share_display_tag_id");
            if (string3 == null) {
                string3 = CardStruct.IStatusCode.DEFAULT;
            }
            String string4 = this.extras.getString("share_copy_id");
            if (string4 != null) {
                str = string4;
            }
            String string5 = this.extras.getString("app_language");
            if (string5 == null) {
                string5 = "en";
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(string);
            LIZ2.append('_');
            LIZ2.append(string2);
            LIZ2.append('_');
            LIZ2.append(string3);
            LIZ2.append('_');
            LIZ2.append(str);
            LIZ2.append('_');
            LIZ2.append(string5);
            c38281F0r.LIZLLL("share_operation", X1D.LIZIZ(LIZ2));
            LJ = c38281F0r.LJ();
            o.LJIIIIZZ(LJ, "urlBuilder.build()");
        }
        OYF.LIZLLL(channel, LJ, this.itemType).LJIIJ(new OY9(this, channel, LIZ)).LJIJJ(T16.LIZ()).LJIIL(C73969T1h.LIZIZ()).LJIILLIIL(new AfS62S0100000_10(interfaceC88472Yns, 21));
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final void LJIIIZ(Context context, InterfaceC62486Ofi action, AqS157S0200000_10 aqS157S0200000_10) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(action, "action");
        String str = "download";
        if (o.LJ(action.key(), "download") || o.LJ(action.key(), "save") || o.LJ(action.key(), "gif")) {
            String key = action.key();
            if (!o.LJ(key, "download") && !o.LJ(key, "save")) {
                str = key;
            }
            Bundle LIZ = C0H1.LIZ("enter_from", str);
            IShareWarningInfoService LJIJ = a.LJIJ();
            if (LJIJ != null && LJIJ.LIZIZ(context, LJIILLIIL(), LIZ, aqS157S0200000_10)) {
                return;
            }
        }
        super.LJIIIZ(context, action, aqS157S0200000_10);
    }

    @Override // com.ss.android.ugc.aweme.share.improve.pkg.KtfDefaultSharePackage, com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final void LJI(Context context, InterfaceC62225ObV interfaceC62225ObV, View view, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        String str;
        AwemeStatus status;
        o.LJIIIZ(context, "context");
        AwemeStatus status2 = LJIILLIIL().getStatus();
        if (status2 != null && status2.isInReviewing() && (status = LJIILLIIL().getStatus()) != null && status.isSelfSee()) {
            if (view != null) {
                AnonymousClass030.LJ(view, R.string.ses);
                return;
            }
            return;
        }
        Bundle bundle = new Bundle();
        if (interfaceC62225ObV == null || (str = interfaceC62225ObV.key()) == null) {
            str = "send_to";
        }
        bundle.putString("enter_from", str);
        IShareWarningInfoService LJIJ = a.LJIJ();
        if (LJIJ != null && LJIJ.LIZIZ(context, LJIILLIIL(), bundle, interfaceC65784Pro)) {
            return;
        }
        super.LJI(context, interfaceC62225ObV, view, interfaceC65784Pro);
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final boolean LIZLLL(InterfaceC62225ObV channel, Context context, View view, InterfaceC62573Oh7 interfaceC62573Oh7, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        OperationPlatform operationPlatform;
        InterfaceC62085OYf c62252Obw;
        ACLCommonShare LJII;
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(context, "context");
        C4LD.LIZIZ.LJJIL(0, channel.key());
        ShareDependService.LIZ.getClass();
        C44498HdG.LIZ().LJIJJ(channel);
        if (this.aweme == null) {
            return false;
        }
        if (!C53293Kvp.LIZIZ()) {
            String string = this.extras.getString("panel_source");
            if (string == null) {
                string = "";
            }
            if (TextUtils.equals("screenshot_popup", string)) {
                if (o.LJ(channel.key(), "chat_merge")) {
                    if (C4LD.LIZIZ.LJIIZILJ(context, LJIILLIIL())) {
                        return false;
                    }
                    if (LJIILLIIL().isAd()) {
                        interfaceC88472Yns.invoke(Boolean.FALSE);
                    } else {
                        interfaceC88472Yns.invoke(Boolean.TRUE);
                    }
                    return true;
                }
                if (new C62326Od8(channel).LIZ(context, this, new C62243Obn(interfaceC88472Yns, interfaceC62573Oh7)) == EnumC62261Oc5.ILLEGAL) {
                    return false;
                }
                return true;
            }
        }
        if ((o.LJ(channel.key(), "chat_merge") || (channel instanceof QrCodeChannel)) && !C4LD.LIZIZ.LJIIZILJ(context, LJIILLIIL())) {
            if (LJIILLIIL().isAd()) {
                interfaceC88472Yns.invoke(Boolean.FALSE);
            } else {
                interfaceC88472Yns.invoke(Boolean.TRUE);
            }
            return true;
        }
        if (!o.LJ(channel.key(), "chat_merge") && !(channel instanceof QrCodeChannel)) {
            if (C62340OdM.LJIIL(channel.key()) && (LJII = C62340OdM.LJII(LJIILLIIL(), channel.key())) != null) {
                C188727au c188727au = new C188727au();
                c188727au.LIZLLL(LJII.getCode(), "code");
                c188727au.LIZLLL(LJII.getShowType(), "show_type");
                c188727au.LJIIIZ("toast_msg", LJII.getToastMsg());
                c188727au.LJIIIZ("extra", LJII.getExtra());
                c188727au.LIZLLL(LJII.getTranscode(), "transcode");
                c188727au.LJFF(Boolean.valueOf(LJII.getMute()), "mute");
                c188727au.LJIIIZ("popup_msg", LJII.getPopupMsg());
                FMX.LJIIL("share_video_acl", c188727au.LIZ);
            }
            List list = (List) HME.LIZJ.getValue();
            if (list == null) {
                list = new ArrayList();
            }
            SharingOperationConfig LIZ = C62285OcT.LIZ();
            String str = null;
            if (LIZ != null) {
                operationPlatform = LIZ.operationPlatform;
            } else {
                operationPlatform = null;
            }
            String key = channel.key();
            if (list.contains(key)) {
                c62252Obw = new C62256Oc0(channel);
            } else if (o.LJ(key, "facebook")) {
                c62252Obw = new C62240Obk(channel);
            } else if (o.LJ(key, "facebook_lite")) {
                c62252Obw = new C62246Obq(channel);
            } else if (o.LJ(key, "email")) {
                c62252Obw = new C62239Obj(channel);
            } else if (o.LJ(key, "instagram")) {
                c62252Obw = new C62227ObX(channel);
            } else if (o.LJ(key, "instagram_story")) {
                c62252Obw = new C62242Obm(channel);
            } else if (o.LJ(key, "snapchat")) {
                c62252Obw = new C62217ObN(channel);
            } else if (o.LJ(key, "kakaotalk")) {
                c62252Obw = new C62248Obs(channel);
            } else if (o.LJ(key, "whatsapp")) {
                c62252Obw = new C62244Obo(channel);
            } else if (o.LJ(key, "messenger")) {
                c62252Obw = new C62250Obu(channel);
            } else if (o.LJ(key, "sms")) {
                c62252Obw = new C62255Obz(channel);
            } else if (o.LJ(key, "repost")) {
                c62252Obw = new C62083OYd(channel);
            } else if (o.LJ(key, "share_to_story")) {
                c62252Obw = new C62084OYe(channel);
            } else {
                if (operationPlatform != null) {
                    str = operationPlatform.platformId;
                }
                if (o.LJ(key, str)) {
                    c62252Obw = new C62220ObQ(channel);
                } else {
                    c62252Obw = new C62252Obw(channel);
                }
            }
            return c62252Obw.LIZ(context, view, this, interfaceC62573Oh7, interfaceC88472Yns);
        }
        if (!(channel instanceof QrCodeChannel)) {
            return false;
        }
        new C62082OYc(channel).LIZ(context, view, this, interfaceC62573Oh7, interfaceC88472Yns);
        return true;
    }
}
