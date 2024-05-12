package com.ss.android.ugc.aweme.share.base.download.configuration.protocol;

import X.AbstractC44957Hkf;
import X.InterfaceC87755YcJ;
import X.InterfaceC99233ux;
import android.content.Context;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import java.util.List;

/* loaded from: classes17.dex */
public abstract class DownloadAbilityProtocol implements InterfaceC99233ux {
    public final String LJLIL = "";

    public abstract void LIZ(Context context);

    public abstract boolean LIZJ(String str, String str2, String str3);

    public InterfaceC87755YcJ LIZLLL() {
        return null;
    }

    public abstract List<String> LJFF();

    public abstract void LJI();

    public abstract void LJII(AbsDownloadListener absDownloadListener);

    public abstract boolean LJIIIIZZ(String str, String str2, String str3, String str4);

    public String LJ() {
        return this.LJLIL;
    }

    public DownloadAbilityProtocol(AbstractC44957Hkf abstractC44957Hkf) {
    }
}
