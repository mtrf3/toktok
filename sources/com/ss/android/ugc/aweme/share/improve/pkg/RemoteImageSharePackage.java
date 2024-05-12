package com.ss.android.ugc.aweme.share.improve.pkg;

import X.C15070iV;
import X.C1DD;
import X.C41272GHs;
import X.C42059Gf1;
import X.C43245Gy9;
import X.C4LD;
import X.C62056OXc;
import X.C62293Ocb;
import X.C62313Ocv;
import X.C62374Odu;
import X.C76800UCe;
import X.C78609UtB;
import X.InterfaceC62225ObV;
import X.InterfaceC62573Oh7;
import X.InterfaceC88472Yns;
import X.OYF;
import X.OYT;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.bytedance.ies.abmock.SettingsManager;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class RemoteImageSharePackage extends LinkDefaultSharePackage {
    public static final C62056OXc Companion = new C62056OXc();
    public String imageUrl;

    public RemoteImageSharePackage(C62374Odu c62374Odu) {
        super(c62374Odu);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.share.improve.pkg.LinkDefaultSharePackage, com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final boolean LIZLLL(InterfaceC62225ObV channel, Context context, View view, InterfaceC62573Oh7 interfaceC62573Oh7, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(context, "context");
        C4LD.LIZIZ.LJJIL(1, channel.key());
        try {
            SettingsManager.LIZLLL().getClass();
        } catch (Throwable unused) {
        }
        if (SettingsManager.LIZ("web_image_downloader_switch", false)) {
            C43245Gy9 c43245Gy9 = new C43245Gy9(new WeakReference(context));
            String str = this.imageUrl;
            Activity LJJLIIIJ = C78609UtB.LJJLIIIJ(context);
            o.LJI(LJJLIIIJ);
            C15070iV LIZ = c43245Gy9.LIZ(str, new C41272GHs(LJJLIIIJ));
            if (o.LJ(LIZ.LIZ, Boolean.TRUE) && LIZ.LIZIZ != 0) {
                S s = LIZ.LIZIZ;
                o.LJI(s);
                Uri LJ = OYF.LJ(context, (String) s);
                S s2 = LIZ.LIZIZ;
                o.LJI(s2);
                C62313Ocv c62313Ocv = new C62313Ocv(LJ, (String) s2, null, null, null, null, false, 252);
                if (channel.LIZ(context, c62313Ocv)) {
                    channel.LJIIJ(c62313Ocv, context, null);
                } else {
                    new C62293Ocb(C1DD.LIZLLL(R.string.h33, "chaosContext().getString…string.i18n_share_system)")).LJII(c62313Ocv, context, null);
                }
            }
            return false;
        }
        Activity LJJLIIIJ2 = C78609UtB.LJJLIIIJ(context);
        if (LJJLIIIJ2 != null) {
            new C42059Gf1(new WeakReference(context)).LIZ(this.imageUrl, new OYT(LJJLIIIJ2, channel, context));
        }
        return false;
    }
}
