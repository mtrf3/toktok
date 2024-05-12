package com.ss.android.ugc.aweme.share.improve.pkg;

import X.AnonymousClass030;
import X.C05L;
import X.C38352F3k;
import X.C42599Gnj;
import X.C47261Igj;
import X.C4LD;
import X.C62054OXa;
import X.C62063OXj;
import X.C62313Ocv;
import X.C62374Odu;
import X.C66580QBc;
import X.C76800UCe;
import X.InterfaceC62225ObV;
import X.InterfaceC62573Oh7;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.O18;
import X.OYF;
import X.OYP;
import X.X1D;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.BaseBundle;
import android.view.View;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.ss.android.ugc.aweme.web.share.model.WebShareInfo;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class HybridImageSharePackage extends SharePackage {
    public InterfaceC65784Pro<? extends Object> callback;
    public WebShareInfo.HybridContainerInfo hybridContainerInfo;
    public boolean isHybridLoadFailed;
    public boolean isHybridLoadFinish;
    public int shareMode;
    public static final C62054OXa Companion = new C62054OXa();
    public static final List<String> NOT_SUPPORT_LINK_CHANNEL_LIST = C47261Igj.LJJIJIIJI("whatsapp_status", "instagram", "instagram_story", "snapchat");
    public static final List<String> NOT_SUPPORT_PHOTO_CHANNEL_LIST = C47261Igj.LJJIJ("copy");
    public static final List<String> NOT_SUPPORT_LINK_AND_PHOTO_CHANNEL_LIST = C47261Igj.LJJIJIIJI("whatsapp_status", "copy", "messenger", "instagram", "instagram_story", "facebook", "reddit", "facebook_lite", "line", "messenger_lite", "kakaotalk", "kakao_story", "facebook_group");

    public HybridImageSharePackage(C62374Odu c62374Odu) {
        super(c62374Odu);
        this.shareMode = 3;
    }

    public static void LJIILLIIL(InterfaceC62225ObV interfaceC62225ObV, String str, Context context) {
        Uri LIZ = O18.LIZ(context, new File(str));
        o.LJIIIIZZ(LIZ, "getFileProviderUri(context, File(outPath))");
        C62313Ocv c62313Ocv = new C62313Ocv(LIZ, str, null, null, null, null, false, 252);
        ((BaseBundle) c62313Ocv.LIZ).putString("media_type", "image/png");
        interfaceC62225ObV.LJII(c62313Ocv, context, null);
    }

    public final void LJIILL(InterfaceC62225ObV interfaceC62225ObV, String str, Context context) {
        String LIZJ = C62063OXj.LIZJ(this.extras.getBoolean("enable_copylink_desc"), interfaceC62225ObV, this.description);
        String LIZJ2 = OYF.LIZJ(interfaceC62225ObV, str, this.itemType);
        OYP oyp = new OYP(LIZJ2, LIZJ, 4);
        if (o.LJ(interfaceC62225ObV.key(), "email")) {
            oyp = new OYP(LIZJ2, this.title, LIZJ);
        }
        interfaceC62225ObV.LJIJ(oyp, context, null);
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final void LJI(Context context, InterfaceC62225ObV interfaceC62225ObV, View view, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        o.LJIIIZ(context, "context");
        if (this.isHybridLoadFailed) {
            if (view != null) {
                AnonymousClass030.LJ(view, R.string.pye);
            }
        } else {
            if (!this.isHybridLoadFinish) {
                if (view != null) {
                    AnonymousClass030.LJ(view, R.string.pyf);
                    return;
                }
                return;
            }
            super.LJI(context, interfaceC62225ObV, view, interfaceC65784Pro);
        }
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final boolean LIZLLL(InterfaceC62225ObV channel, Context context, View view, InterfaceC62573Oh7 interfaceC62573Oh7, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        Object obj;
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(context, "context");
        boolean z = false;
        C4LD.LIZIZ.LJJIL(0, channel.key());
        if (o.LJ(channel.key(), "chat_merge")) {
            return false;
        }
        InterfaceC65784Pro<? extends Object> interfaceC65784Pro = this.callback;
        if (interfaceC65784Pro != null) {
            obj = interfaceC65784Pro.invoke();
        } else {
            obj = null;
        }
        Bitmap bitmap = (Bitmap) obj;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ReferralImageSharePackage bitmap is null == ");
        if (bitmap == null) {
            z = true;
        }
        LIZ.append(z);
        X1D.LIZIZ(LIZ);
        if (bitmap != null) {
            String shareOutDir = C66580QBc.LJIILL(context);
            StringBuilder LIZ2 = X1D.LIZ();
            StringBuilder LIZ3 = X1D.LIZ();
            String str = "";
            LIZ3.append("");
            LIZ3.append(System.currentTimeMillis());
            LIZ2.append(C38352F3k.LIZJ(X1D.LIZIZ(LIZ3)));
            LIZ2.append(".png");
            String LIZIZ = X1D.LIZIZ(LIZ2);
            o.LJIIIIZZ(shareOutDir, "shareOutDir");
            String LIZLLL = C42599Gnj.LIZLLL(bitmap, shareOutDir, LIZIZ);
            if (LIZLLL != null) {
                int i = this.shareMode;
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            LJIILL(channel, this.url, context);
                        }
                    } else {
                        LJIILLIIL(channel, LIZLLL, context);
                    }
                } else if (NOT_SUPPORT_LINK_AND_PHOTO_CHANNEL_LIST.contains(channel.key())) {
                    if (!NOT_SUPPORT_LINK_CHANNEL_LIST.contains(channel.key())) {
                        LJIILL(channel, this.url, context);
                    } else {
                        LJIILLIIL(channel, LIZLLL, context);
                    }
                } else {
                    String str2 = this.url;
                    String LIZJ = C62063OXj.LIZJ(this.extras.getBoolean("enable_copylink_desc"), channel, this.description);
                    String LIZJ2 = OYF.LIZJ(channel, str2, this.itemType);
                    Uri LIZ4 = O18.LIZ(context, new File(LIZLLL));
                    o.LJIIIIZZ(LIZ4, "getFileProviderUri(context, File(outPath))");
                    C62313Ocv c62313Ocv = new C62313Ocv(LIZ4, LIZLLL, LIZJ, null, LIZJ2, null, false, 192);
                    if (o.LJ(channel.key(), "email") || o.LJ(channel.key(), "reddit")) {
                        c62313Ocv.LJ = this.title;
                    }
                    String str3 = c62313Ocv.LJFF;
                    if (str3 != null) {
                        str = str3;
                    }
                    ((BaseBundle) c62313Ocv.LIZ).putString("content_url", str);
                    ((BaseBundle) c62313Ocv.LIZ).putString("media_type", "image/png");
                    channel.LJII(c62313Ocv, context, null);
                }
            }
            interfaceC88472Yns.invoke(Boolean.TRUE);
            return true;
        }
        C05L.LIZLLL(context, R.string.pye);
        interfaceC88472Yns.invoke(Boolean.FALSE);
        return true;
    }
}
