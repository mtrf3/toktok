package com.ss.android.ugc.aweme.share.screenshot.strategy;

import X.C40681Fxt;
import X.C61878OQg;
import X.C62313Ocv;
import X.C62330OdC;
import X.C62333OdF;
import X.C62335OdH;
import X.C62336OdI;
import X.C62337OdJ;
import X.C76800UCe;
import X.EnumC62261Oc5;
import X.InterfaceC62225ObV;
import X.InterfaceC62264Oc8;
import X.InterfaceC88472Yns;
import android.content.Context;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import com.ss.android.ugc.aweme.share.base.model.ShareContentType;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public abstract class ScreenshotPhotoShareStrategy<T extends SharePackage> extends ScreenshotShareStrategy<T> {
    public final EnumC62261Oc5 LJLIL = EnumC62261Oc5.PHOTO;

    @Override // com.ss.android.ugc.aweme.share.screenshot.strategy.ScreenshotShareStrategy
    public final EnumC62261Oc5 LJI() {
        return this.LJLIL;
    }

    @Override // com.ss.android.ugc.aweme.share.screenshot.strategy.ScreenshotShareStrategy
    public final boolean LJ(InterfaceC62225ObV channel, Context context, SharePackage sharePackage, InterfaceC62264Oc8 interfaceC62264Oc8) {
        C62335OdH c62335OdH;
        String str;
        String str2;
        List list;
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sharePackage, "sharePackage");
        String LJII = LJII(channel, sharePackage);
        ShareContentType[] shareContentTypeArr = sharePackage.shareContentTypes;
        if (shareContentTypeArr == null) {
            shareContentTypeArr = new ShareContentType[]{ShareContentType.LINK};
        }
        int length = shareContentTypeArr.length;
        int i = 0;
        while (true) {
            if (i < length) {
                ShareContentType shareContentType = shareContentTypeArr[i];
                int i2 = C62336OdI.LIZ[shareContentType.ordinal()];
                if (i2 != 1 && i2 != 2) {
                    if (i2 != 3 && i2 != 4) {
                        if (i2 != 5) {
                            list = C61878OQg.INSTANCE;
                        } else {
                            list = C62330OdC.LIZ;
                        }
                    } else {
                        list = C62330OdC.LIZIZ;
                    }
                } else {
                    list = C62330OdC.LIZJ;
                }
                if (!list.contains(channel.key())) {
                    c62335OdH = new C62335OdH(shareContentType, LIZLLL(channel, sharePackage.itemType, shareContentType.getNum()), LIZJ(channel, sharePackage.itemType, shareContentType.getNum()), interfaceC62264Oc8);
                    break;
                }
                i++;
            } else {
                c62335OdH = new C62335OdH(ShareContentType.ILEGAL, false, false, interfaceC62264Oc8);
                break;
            }
        }
        int num = c62335OdH.LJLIL.getNum();
        boolean z = c62335OdH.LJLILLLLZI;
        boolean z2 = c62335OdH.LJLJI;
        InterfaceC88472Yns<Boolean, C76800UCe> onShareSuccessCallback = c62335OdH.LJLJJI.LIZ();
        o.LJIIIZ(onShareSuccessCallback, "onShareSuccessCallback");
        String str3 = "";
        if (!z2) {
            str = "";
        } else {
            str = sharePackage.description;
        }
        if (!z) {
            str2 = "";
        } else {
            str2 = sharePackage.title;
        }
        ShareContentType shareContentType2 = ShareContentType.PHOTO;
        if (num == shareContentType2.getNum()) {
            if (LJII != null) {
                Uri LIZ = C40681Fxt.LIZ(context, new File(LJII));
                o.LJIIIIZZ(LIZ, "getFileProviderUri(context, File(outPath))");
                C62313Ocv c62313Ocv = new C62313Ocv(LIZ, LJII, str, str2, null, null, false, 232);
                String str4 = c62313Ocv.LJFF;
                if (str4 == null) {
                    str4 = "";
                }
                ((BaseBundle) c62313Ocv.LIZ).putString("content_url", str4);
                ((BaseBundle) c62313Ocv.LIZ).putString("media_type", "image/png");
                channel.LJII(c62313Ocv, context, null);
                Bundle bundle = sharePackage.extras;
                String str5 = C62337OdJ.LIZ.get(shareContentType2);
                if (str5 != null) {
                    str3 = str5;
                }
                bundle.putString("share_form", str3);
                onShareSuccessCallback.invoke(Boolean.TRUE);
            }
        } else {
            if (num != ShareContentType.LINK_PLUS_PHOTO.getNum()) {
                return false;
            }
            if (LJII != null) {
                sharePackage.LJIILIIL(channel, new C62333OdF(context, LJII, str, str2, channel, sharePackage, onShareSuccessCallback));
            }
        }
        return true;
    }
}
