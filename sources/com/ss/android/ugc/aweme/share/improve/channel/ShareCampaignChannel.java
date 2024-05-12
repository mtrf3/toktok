package com.ss.android.ugc.aweme.share.improve.channel;

import X.ASL;
import X.AbstractC62625Ohx;
import X.ActivityC45651qj;
import X.C0H1;
import X.C119604mi;
import X.C39792FjY;
import X.C45804HyK;
import X.C62285OcT;
import X.C62291OcZ;
import X.C62385Oe5;
import X.C62387Oe7;
import X.C62389Oe9;
import X.C62394OeE;
import X.C62430Oeo;
import X.C62468OfQ;
import X.DialogInterfaceOnCancelListenerC62284OcS;
import X.InterfaceC62573Oh7;
import X.O3U;
import X.OI6;
import X.X1D;
import Y.IDDListenerS104S0200000_10;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.animation.ScaleAnimation;
import androidx.fragment.app.FragmentManager;
import com.bytedance.keva.Keva;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.channel.share.model.PureLogicChannel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.core.ui.campaign.OperationPlatform;
import com.ss.android.ugc.aweme.share.core.ui.campaign.ShareCampaignFragment;
import com.ss.android.ugc.aweme.share.core.ui.campaign.SharingOperationConfig;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class ShareCampaignChannel extends PureLogicChannel {
    public final SharePackage LJLIL;
    public final OperationPlatform LJLILLLLZI;
    public final C62385Oe5 LJLJI;

    @Override // X.InterfaceC62225ObV
    public final boolean LIZ(Context context, AbstractC62625Ohx content) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(content, "content");
        return true;
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.PureLogicChannel, X.InterfaceC62225ObV
    public final boolean LJIIIIZZ() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.PureLogicChannel, X.InterfaceC62225ObV
    public final boolean LJIIZILJ() {
        return false;
    }

    @Override // X.InterfaceC62225ObV
    public final String key() {
        String str = this.LJLILLLLZI.platformId;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // X.InterfaceC62225ObV
    public final String label() {
        String str = this.LJLILLLLZI.platformName;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // X.InterfaceC62225ObV
    public final Drawable LIZJ(Context context) {
        Activity activity;
        if (context != null) {
            activity = C45804HyK.LJIJJ(context);
        } else {
            activity = null;
        }
        return C62291OcZ.LIZJ(activity);
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.PureLogicChannel, X.InterfaceC62225ObV
    public final void LJ(C119604mi imageView, boolean z) {
        String str;
        o.LJIIIZ(imageView, "imageView");
        imageView.setImageDrawable(LIZJ(imageView.getContext()));
        Keva LIZ = C39792FjY.LIZ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("campaign_channel_breath_flag");
        SharingOperationConfig LIZ3 = C62285OcT.LIZ();
        String str2 = null;
        if (LIZ3 != null) {
            str = LIZ3.operationId;
        } else {
            str = null;
        }
        LIZ2.append(str);
        if (!LIZ.getBoolean(X1D.LIZIZ(LIZ2), false)) {
            ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.9f, 1.0f, 0.9f, 1, 0.5f, 1, 0.5f);
            scaleAnimation.setDuration(600L);
            scaleAnimation.setRepeatMode(2);
            scaleAnimation.setRepeatCount(3);
            imageView.startAnimation(scaleAnimation);
            Keva LIZ4 = C39792FjY.LIZ();
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("campaign_channel_breath_flag");
            SharingOperationConfig LIZ6 = C62285OcT.LIZ();
            if (LIZ6 != null) {
                str2 = LIZ6.operationId;
            }
            LIZ5.append(str2);
            LIZ4.storeBoolean(X1D.LIZIZ(LIZ5), true);
        }
    }

    public ShareCampaignChannel(AwemeSharePackage awemeSharePackage, OperationPlatform operationPlatform, C62385Oe5 awemeShare) {
        o.LJIIIZ(awemeShare, "awemeShare");
        this.LJLIL = awemeSharePackage;
        this.LJLILLLLZI = operationPlatform;
        this.LJLJI = awemeShare;
    }

    @Override // X.InterfaceC62225ObV
    public final boolean LJIIJ(AbstractC62625Ohx content, Context context, InterfaceC62573Oh7 interfaceC62573Oh7) {
        ActivityC45651qj activityC45651qj;
        FragmentManager supportFragmentManager;
        Bundle bundle;
        String string;
        o.LJIIIZ(content, "content");
        o.LJIIIZ(context, "context");
        SharePackage sharePackage = this.LJLIL;
        C62385Oe5 awemeShare = this.LJLJI;
        o.LJIIIZ(sharePackage, "sharePackage");
        o.LJIIIZ(awemeShare, "awemeShare");
        String LIZJ = O3U.LIZJ(OI6.LIZ, "ug_resource");
        String str = "";
        if (LIZJ == null) {
            LIZJ = "";
        }
        Bundle LIZ = C0H1.LIZ("template_resource_prefix", LIZJ);
        ShareCampaignFragment shareCampaignFragment = new ShareCampaignFragment();
        shareCampaignFragment.setArguments(LIZ);
        String string2 = sharePackage.extras.getString("share_display_tag_id");
        if (string2 == null) {
            string2 = CardStruct.IStatusCode.DEFAULT;
        }
        AwemeSharePackage awemeSharePackage = null;
        if (sharePackage instanceof AwemeSharePackage) {
            awemeSharePackage = (AwemeSharePackage) sharePackage;
        }
        if (awemeSharePackage != null && awemeSharePackage.aweme != null) {
            Aweme LJIILLIIL = awemeSharePackage.LJIILLIIL();
            String string3 = awemeSharePackage.extras.getString("enter_method");
            if (string3 == null) {
                string3 = "";
            }
            String string4 = awemeSharePackage.extras.getString("enter_from");
            if (string4 == null) {
                string4 = "";
            }
            C62394OeE c62394OeE = new C62394OeE();
            c62394OeE.LJIIZILJ = sharePackage;
            c62394OeE.LJJ = new C62430Oeo(interfaceC62573Oh7, awemeShare);
            C62389Oe9.LIZIZ(LJIILLIIL, c62394OeE, null, string4, string3, true, 68);
            c62394OeE.LJIIJJI = new AqS176S0100000_10(LJIILLIIL, 82);
            C62387Oe7 c62387Oe7 = new C62387Oe7(c62394OeE);
            shareCampaignFragment.LJLJI = c62387Oe7;
            BaseSharePackage baseSharePackage = c62387Oe7.LJIIJ;
            if (baseSharePackage != null && (bundle = baseSharePackage.extras) != null && (string = bundle.getString("aweme_cover_url_opt")) != null) {
                str = string;
            }
            shareCampaignFragment.LJLILLLLZI = str;
            shareCampaignFragment.LJLJJI = string2;
            if ((context instanceof ActivityC45651qj) && (supportFragmentManager = (activityC45651qj = (ActivityC45651qj) context).getSupportFragmentManager()) != null) {
                ASL asl = new ASL();
                TuxSheet tuxSheet = asl.LIZ;
                tuxSheet.LJLLJ = true;
                tuxSheet.LJZL = true;
                tuxSheet.LJZI = true;
                asl.LJFF(16);
                IDDListenerS104S0200000_10 iDDListenerS104S0200000_10 = new IDDListenerS104S0200000_10(shareCampaignFragment, activityC45651qj, 0);
                TuxSheet tuxSheet2 = asl.LIZ;
                tuxSheet2.LJLILLLLZI = iDDListenerS104S0200000_10;
                tuxSheet2.LJLIL = DialogInterfaceOnCancelListenerC62284OcS.LJLIL;
                tuxSheet2.LJLLILLLL = shareCampaignFragment;
                shareCampaignFragment.LJLJJLL = tuxSheet2;
                C62468OfQ.LJIIJ(tuxSheet2);
                TuxSheet tuxSheet3 = shareCampaignFragment.LJLJJLL;
                if (tuxSheet3 != null) {
                    tuxSheet3.show(supportFragmentManager, "SHARE_CAMPAIGN_FRAGMENT");
                }
            }
        }
        return true;
    }
}
