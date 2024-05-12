package com.ss.android.ugc.aweme.share.improve.pkg;

import X.C38352F3k;
import X.C42599Gnj;
import X.C4LD;
import X.C62058OXe;
import X.C62313Ocv;
import X.C62374Odu;
import X.C66580QBc;
import X.C76800UCe;
import X.InterfaceC62225ObV;
import X.InterfaceC62573Oh7;
import X.InterfaceC88472Yns;
import X.O18;
import X.X1D;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.BaseBundle;
import android.view.View;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.io.File;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class Base64ImageSharePackage extends SharePackage {
    public static final C62058OXe Companion = new C62058OXe();
    public String imageData;
    public int shareMode;
    public String type;

    public Base64ImageSharePackage(C62374Odu c62374Odu) {
        super(c62374Odu);
        this.shareMode = 2;
        this.imageData = "";
        this.type = "";
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final boolean LIZLLL(InterfaceC62225ObV channel, Context context, View view, InterfaceC62573Oh7 interfaceC62573Oh7, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(context, "context");
        C4LD.LIZIZ.LJJIL(0, channel.key());
        C62058OXe c62058OXe = Companion;
        int i = this.shareMode;
        String str = this.type;
        String str2 = this.imageData;
        c62058OXe.getClass();
        if (C62058OXe.LIZIZ(i, str, str2)) {
            Bitmap LIZ = C42599Gnj.LIZ(this.imageData);
            String shareOutDir = C66580QBc.LJIILL(context);
            StringBuilder LIZ2 = X1D.LIZ();
            StringBuilder LIZ3 = X1D.LIZ();
            String str3 = "";
            LIZ3.append("");
            LIZ3.append(System.currentTimeMillis());
            LIZ2.append(C38352F3k.LIZJ(X1D.LIZIZ(LIZ3)));
            LIZ2.append(".png");
            String LIZIZ = X1D.LIZIZ(LIZ2);
            o.LJIIIIZZ(shareOutDir, "shareOutDir");
            String LIZLLL = C42599Gnj.LIZLLL(LIZ, shareOutDir, LIZIZ);
            if (LIZLLL != null) {
                Uri LIZ4 = O18.LIZ(context, new File(LIZLLL));
                o.LJIIIIZZ(LIZ4, "getFileProviderUri(context, File(outPath))");
                C62313Ocv c62313Ocv = new C62313Ocv(LIZ4, LIZLLL, null, null, null, null, false, 252);
                String str4 = c62313Ocv.LJFF;
                if (str4 != null) {
                    str3 = str4;
                }
                ((BaseBundle) c62313Ocv.LIZ).putString("content_url", str3);
                ((BaseBundle) c62313Ocv.LIZ).putString("media_type", "image/png");
                channel.LJII(c62313Ocv, context, null);
            }
            interfaceC88472Yns.invoke(Boolean.TRUE);
            return true;
        }
        return true;
    }
}
