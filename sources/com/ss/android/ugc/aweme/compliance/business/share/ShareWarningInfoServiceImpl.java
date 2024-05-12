package com.ss.android.ugc.aweme.compliance.business.share;

import X.AR6;
import X.ActivityC45651qj;
import X.C188727au;
import X.C2068389v;
import X.C242989gE;
import X.C244659iv;
import X.C26224AQy;
import X.C26227ARb;
import X.C3AW;
import X.C42510GmI;
import X.C45804HyK;
import X.C54840Lfg;
import X.C72062SPy;
import X.C76800UCe;
import X.C77123UOp;
import X.C8G2;
import X.FMX;
import X.InterfaceC65784Pro;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.compliance.api.services.share.IShareWarningInfoService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.ShareWarnInfo;
import com.ss.android.ugc.aweme.feed.model.ShareWarnModule;
import com.ss.android.ugc.aweme.feed.model.ShareWarnPopAccessory;
import com.ss.android.ugc.aweme.feed.model.ShareWarnPopContent;
import com.ss.android.ugc.aweme.feed.model.ShareWarnPopWindow;
import com.ss.android.ugc.aweme.feed.model.TextWithInlineLink;
import com.ss.android.ugc.aweme.shortvideo.AVUploadMiscInfoStruct;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS132S0200000_1;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class ShareWarningInfoServiceImpl implements IShareWarningInfoService {
    @Override // com.ss.android.ugc.aweme.compliance.api.services.share.IShareWarningInfoService
    public final void LIZ(Aweme aweme) {
        AVUploadMiscInfoStruct uploadMiscInfoStruct;
        ShareWarnModule shareWarnModule;
        ShareWarnInfo shareWarnInfo = null;
        if (aweme != null) {
            AVUploadMiscInfoStruct uploadMiscInfoStruct2 = aweme.getUploadMiscInfoStruct();
            if (uploadMiscInfoStruct2 != null) {
                shareWarnInfo = uploadMiscInfoStruct2.samShareWarnInfo;
            }
            if (shareWarnInfo != null) {
                shareWarnInfo.setHasShown(false);
            }
            if (aweme == null || (uploadMiscInfoStruct = aweme.getUploadMiscInfoStruct()) == null || (shareWarnModule = uploadMiscInfoStruct.shareWarnModule) == null) {
                return;
            }
            shareWarnModule.setHasShown(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.compliance.api.services.share.IShareWarningInfoService
    public final boolean LIZIZ(Context activity, Aweme aweme, Bundle bundle, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        ShareWarnInfo shareWarnInfo;
        AVUploadMiscInfoStruct uploadMiscInfoStruct;
        ShareWarnModule shareWarnModule;
        CharSequence charSequence;
        TextWithInlineLink linkText;
        o.LJIIIZ(activity, "activity");
        if (aweme == null || (shareWarnInfo = aweme.getUploadMiscInfoStruct().samShareWarnInfo) == null || shareWarnInfo.getHasShown()) {
            if (aweme == null || (uploadMiscInfoStruct = aweme.getUploadMiscInfoStruct()) == null || (shareWarnModule = uploadMiscInfoStruct.shareWarnModule) == null || shareWarnModule.getHasShown() || shareWarnModule.getPopWindow() == null) {
                return false;
            }
            shareWarnModule.setHasShown(true);
            ShareWarnPopWindow popWindow = shareWarnModule.getPopWindow();
            if (popWindow != null) {
                String str = "";
                if (!(!popWindow.getContent().isEmpty()) || (linkText = ((ShareWarnPopContent) ListProtector.get(popWindow.getContent(), 0)).getLinkText()) == null) {
                    charSequence = "";
                } else {
                    charSequence = C54840Lfg.LJJLIIIJLLLLLLLZ(linkText, activity, null, 6);
                }
                C26227ARb LIZ = C3AW.LIZ(activity);
                LIZ.LJIIIZ = new C244659iv(LIZ.LIZ, R.raw.icon_shield_exclamation, null, 0);
                LIZ.LJFF(popWindow.getTitle());
                LIZ.LIZIZ(charSequence);
                C77123UOp.LJIILL(LIZ, new AqS132S0200000_1(activity, (Context) interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 65));
                LIZ.LJII = false;
                ShareWarnPopAccessory accessory = popWindow.getAccessory();
                if (accessory != null) {
                    C242989gE c242989gE = new C242989gE(activity);
                    c242989gE.LIZJ();
                    c242989gE.LIZLLL(accessory.getText());
                    c242989gE.LJ(new AqS132S0200000_1(activity, accessory, 64));
                    LIZ.LJIIJJI = c242989gE;
                }
                LIZ.LJI().LIZLLL();
                C188727au c188727au = new C188727au();
                String string = bundle.getString("enter_from");
                if (string != null) {
                    str = string;
                }
                c188727au.LJIIIZ("enter_from", str);
                FMX.LJIIL("tns_br_election_share_prompt", c188727au.LIZ);
                return true;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        shareWarnInfo.setHasShown(true);
        C26224AQy c26224AQy = new C26224AQy();
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_info_circle;
        c26224AQy.LIZ = c2068389v.LIZ(activity);
        c26224AQy.LIZLLL = 3;
        String text = shareWarnInfo.getTitle();
        o.LJIIIZ(text, "text");
        c26224AQy.LJ = text;
        C72062SPy c72062SPy = new C72062SPy();
        c72062SPy.LIZLLL(shareWarnInfo.getLearnMoreText());
        c72062SPy.LJ(0);
        c72062SPy.LIZ = false;
        c72062SPy.LIZIZ(43);
        c72062SPy.LJFF = new AqS154S0200000_7(activity, shareWarnInfo, 84);
        c26224AQy.LIZLLL(new AR6(R.raw.icon_flag, null, C8G2.LIZ(shareWarnInfo.getSubTitle1(), c72062SPy.LIZ(activity))), new AR6(shareWarnInfo.getSubTitle2()));
        c26224AQy.LJIILIIL = true;
        String string2 = activity.getString(R.string.hou);
        C42510GmI c42510GmI = C42510GmI.LJLIL;
        c26224AQy.LJII = string2;
        c26224AQy.LJIIIZ = c42510GmI;
        String string3 = activity.getString(R.string.how);
        AqS173S0100000_7 aqS173S0100000_7 = new AqS173S0100000_7(interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 288);
        c26224AQy.LJIIIIZZ = string3;
        c26224AQy.LJIIJ = aqS173S0100000_7;
        c26224AQy.LJIILL = true;
        TuxSheet tuxSheet = c26224AQy.LIZ().LIZ;
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(activity);
        o.LJI(LJJIFFI);
        FragmentManager supportFragmentManager = LJJIFFI.getSupportFragmentManager();
        o.LJIIIIZZ(supportFragmentManager, "context.fragmentActivity!!.supportFragmentManager");
        tuxSheet.show(supportFragmentManager, "SamShareWarningDialog");
        return true;
    }
}
