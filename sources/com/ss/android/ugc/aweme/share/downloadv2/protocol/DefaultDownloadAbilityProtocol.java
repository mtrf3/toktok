package com.ss.android.ugc.aweme.share.downloadv2.protocol;

import X.AbstractC44957Hkf;
import X.AbstractC45383HrX;
import android.content.Context;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadAbilityProtocol;
import com.ss.android.ugc.trill.download.DownloadServiceImpl;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public abstract class DefaultDownloadAbilityProtocol extends DownloadAbilityProtocol {
    public final AbstractC45383HrX LJLILLLLZI;

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadAbilityProtocol
    public final void LJI() {
        AbstractC45383HrX abstractC45383HrX = this.LJLILLLLZI;
        if (abstractC45383HrX != null && !abstractC45383HrX.LIZJ) {
            DownloadServiceManager.INSTANCE.getDownloadService().getPageLifeMonitor(abstractC45383HrX.LIZ).getClass();
        }
    }

    public DefaultDownloadAbilityProtocol(AbstractC44957Hkf abstractC44957Hkf) {
        super(abstractC44957Hkf);
        this.LJLILLLLZI = DownloadServiceImpl.LJ().LIZIZ(abstractC44957Hkf);
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadAbilityProtocol
    public final void LIZ(Context context) {
        o.LJIIIZ(context, "context");
        AbstractC45383HrX abstractC45383HrX = this.LJLILLLLZI;
        if (abstractC45383HrX != null) {
            Downloader.getInstance(context).cancel(abstractC45383HrX.LIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadAbilityProtocol
    public final void LJII(AbsDownloadListener absDownloadListener) {
        o.LJIIIZ(absDownloadListener, "absDownloadListener");
        AbstractC45383HrX abstractC45383HrX = this.LJLILLLLZI;
        if (abstractC45383HrX != null) {
            abstractC45383HrX.LIZIZ = absDownloadListener;
        }
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadAbilityProtocol
    public final boolean LIZJ(String str, String str2, String str3) {
        AbstractC45383HrX abstractC45383HrX = this.LJLILLLLZI;
        if (abstractC45383HrX != null) {
            return abstractC45383HrX.LIZ(str, str2, str3);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadAbilityProtocol
    public final boolean LJIIIIZZ(String str, String str2, String str3, String str4) {
        AbstractC45383HrX abstractC45383HrX = this.LJLILLLLZI;
        if (abstractC45383HrX != null) {
            return abstractC45383HrX.LIZIZ(str, str2, str3, str4);
        }
        return false;
    }
}
