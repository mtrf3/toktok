package X;

import android.content.Context;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.RuntimeBehaviorServiceImpl;
import com.ss.android.ugc.aweme.services.watermark.IWaterMarkService;
import com.ss.android.ugc.aweme.share.downloadv2.event.newet.DownloadCancelEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.Hqw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45346Hqw implements InterfaceC45398Hrm {
    public final /* synthetic */ C45344Hqu LJLIL;

    public C45346Hqw(C45344Hqu c45344Hqu) {
        this.LJLIL = c45344Hqu;
    }

    @Override // X.InterfaceC45398Hrm
    public final void LIZIZ() {
        C44938HkM.LIZLLL = true;
        C45344Hqu.LLILZLL = true;
        if (C44938HkM.LIZIZ) {
            C45344Hqu c45344Hqu = this.LJLIL;
            C45386Hra c45386Hra = c45344Hqu.LLIIIILZ;
            Context context = c45344Hqu.LJLIL;
            c45386Hra.getClass();
            o.LJIIIZ(context, "context");
            Downloader.getInstance(context).cancel(c45386Hra.LIZ);
            C44938HkM.LIZIZ = false;
            RuntimeBehaviorServiceImpl.LJ().LIZ("download_cancel");
        } else if (C44938HkM.LIZJ) {
            IWaterMarkService iWaterMarkService = (IWaterMarkService) this.LJLIL.LLIIIL.get();
            if (iWaterMarkService != null) {
                iWaterMarkService.cancelWaterMark();
            }
            C44938HkM.LIZJ = false;
            RuntimeBehaviorServiceImpl.LJ().LIZ("water_mark_cancel");
        } else {
            RuntimeBehaviorServiceImpl.LJ().LIZ("water_mark_cancel");
        }
        this.LJLIL.LJI(true);
        if (C45403Hrr.LIZ()) {
            V16.LJJLIIIIJ(DownloadCancelEvent.class);
            return;
        }
        C45344Hqu c45344Hqu2 = this.LJLIL;
        String str = c45344Hqu2.LLIIJI;
        String str2 = c45344Hqu2.LLIIL;
        Aweme aweme = c45344Hqu2.LLF;
        if (aweme != null) {
            String aid = aweme.getAid();
            boolean LIZIZ = C44938HkM.LIZIZ();
            C193657ir.LJ(LIZIZ ? 1 : 0, this.LJLIL.LLIIJLIL, str, str2, aid);
            return;
        }
        o.LJIJI("mAweme");
        throw null;
    }
}
