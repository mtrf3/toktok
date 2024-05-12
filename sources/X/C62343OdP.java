package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import kotlin.jvm.internal.o;

/* renamed from: X.OdP, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62343OdP implements InterfaceC62382Oe2 {
    @Override // X.InterfaceC62382Oe2
    public final void LIZ(InterfaceC62225ObV channel, boolean z, BaseSharePackage baseSharePackage, Context context) {
        AwemeSharePackage awemeSharePackage;
        String shareUrl;
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(context, "context");
        Aweme aweme = null;
        if (baseSharePackage instanceof AwemeSharePackage) {
            awemeSharePackage = (AwemeSharePackage) baseSharePackage;
            if (awemeSharePackage != null) {
                aweme = awemeSharePackage.LJIILLIIL();
            }
        } else {
            awemeSharePackage = null;
        }
        if (z && awemeSharePackage != null && aweme != null) {
            C44384HbQ.LLII(channel.key());
            if (!o.LJ(channel.key(), "chat_merge")) {
                IMService.createIIMServicebyMonsterPlugin(false).getShareService().LJIIZILJ(channel.key());
            }
            C50921Jyf c50921Jyf = new C50921Jyf();
            String string = awemeSharePackage.extras.getString("enter_from");
            String str = "";
            if (string == null) {
                string = "";
            }
            c50921Jyf.LIZLLL = string;
            String string2 = awemeSharePackage.extras.getString("enter_method");
            if (string2 != null) {
                str = string2;
            }
            c50921Jyf.LJJLIL = str;
            c50921Jyf.LJJIIZ(aweme);
            c50921Jyf.LJJLIIIIJ = channel.key();
            c50921Jyf.LJJLIIIJ = C62340OdM.LJFF(channel.key()).ordinal();
            c50921Jyf.LJJZZI = 0;
            String string3 = baseSharePackage.extras.getString("share_form");
            if (string3 == null) {
                string3 = "url_form";
            }
            c50921Jyf.LJLLL = string3;
            c50921Jyf.LJJLJ = "screenshot_popup";
            if (o.LJ(baseSharePackage.extras.getString("share_form"), "url_form")) {
                shareUrl = baseSharePackage.extras.getString("share_url");
            } else {
                shareUrl = aweme.getShareInfo().getShareUrl();
                if (shareUrl == null) {
                    shareUrl = aweme.getShareUrl();
                }
            }
            c50921Jyf.LJJZZIII = shareUrl;
            C220488l2.LIZIZ.LJII(aweme, c50921Jyf);
            c50921Jyf.LJIILIIL();
        }
    }
}
