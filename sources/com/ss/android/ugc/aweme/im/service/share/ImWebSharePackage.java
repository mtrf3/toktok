package com.ss.android.ugc.aweme.im.service.share;

import X.AbstractC62625Ohx;
import X.C62374Odu;
import X.C78765Uvh;
import X.InterfaceC62225ObV;
import X.OYP;
import android.os.BaseBundle;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class ImWebSharePackage extends SharePackage {
    public String imagePath;
    public boolean needImTips;

    public ImWebSharePackage(C62374Odu c62374Odu) {
        super(c62374Odu);
        this.needImTips = true;
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final AbstractC62625Ohx LJIIJJI(InterfaceC62225ObV channel) {
        o.LJIIIZ(channel, "channel");
        OYP oyp = new OYP(this.url, this.title, this.description);
        String downloadedPath = C78765Uvh.LJIIJJI(this.imagePath);
        if (!TextUtils.isEmpty(downloadedPath)) {
            o.LJIIIIZZ(downloadedPath, "downloadedPath");
            ((BaseBundle) oyp.LIZ).putString("thumb_path", downloadedPath);
        }
        return oyp;
    }
}
