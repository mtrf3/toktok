package X;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.bpea.cert.token.TokenCert;
import com.google.gson.internal.b;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.highlights.model.HighlightCellItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.highlights.model.HighlightVideoInfo;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.highlights.powerlist.HighlightCell;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.highlights.viewmodel.HighlightsListViewModel;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.HOw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44006HOw extends TAT {
    public final /* synthetic */ HighlightCell LJLJJI;
    public final /* synthetic */ boolean LJLJJL;
    public final /* synthetic */ HighlightCellItem LJLJJLL;

    @Override // X.TAT
    public final void LIZ(View view) {
        long j;
        String str;
        ActivityC45651qj activityC45651qj;
        String fragmentId;
        DownloadInfo downloadInfo;
        String LIZIZ;
        String url;
        HashMap LJ;
        Long length;
        if (view != null) {
            HighlightsListViewModel highlightsListViewModel = (HighlightsListViewModel) this.LJLJJI.LJLIL.getValue();
            Context context = this.LJLJJI.getContext();
            boolean z = this.LJLJJL;
            HighlightCellItem item = this.LJLJJLL;
            o.LJIIIZ(item, "item");
            String roomId = highlightsListViewModel.LJLILLLLZI;
            String authorId = highlightsListViewModel.LJLJI;
            HighlightVideoInfo videoInfo = item.getVideoInfo();
            if (videoInfo != null && (length = videoInfo.getLength()) != null) {
                j = length.longValue();
            } else {
                j = 0;
            }
            HighlightVideoInfo videoInfo2 = item.getVideoInfo();
            String str2 = "";
            if (videoInfo2 == null || (str = videoInfo2.getFragmentId()) == null) {
                str = "";
            }
            String daInfo = item.getDaInfo();
            o.LJIIIZ(roomId, "roomId");
            o.LJIIIZ(authorId, "authorId");
            java.util.Map LIZ = C44008HOy.LIZ(roomId, authorId, z);
            LIZ.put("label", "ecom");
            LIZ.put("time", Long.valueOf(j));
            LIZ.put("fragment_id", str);
            if (daInfo != null && (LJ = C44008HOy.LJ(daInfo)) != null) {
                LIZ.putAll(LJ);
            }
            b.LJJIJIIJI("livesdk_live_highlight_cover_click", LIZ);
            highlightsListViewModel.LJLJLJ = z;
            highlightsListViewModel.LJLJLLL = item;
            highlightsListViewModel.LJLL = System.currentTimeMillis();
            if (context != null) {
                activityC45651qj = C45804HyK.LJJIFFI(context);
            } else {
                activityC45651qj = null;
            }
            HighlightVideoInfo videoInfo3 = item.getVideoInfo();
            if (videoInfo3 == null || (fragmentId = videoInfo3.getFragmentId()) == null) {
                fragmentId = String.valueOf(System.currentTimeMillis());
            }
            if (activityC45651qj != null) {
                HighlightVideoInfo videoInfo4 = item.getVideoInfo();
                if (videoInfo4 != null && (url = videoInfo4.getUrl()) != null) {
                    str2 = url;
                }
                HCZ hcz = new HCZ(highlightsListViewModel, item, activityC45651qj);
                o.LJIIIZ(fragmentId, "fragmentId");
                List<DownloadInfo> allDownloadInfo = Downloader.getInstance(EF7.LIZIZ()).getAllDownloadInfo();
                if (allDownloadInfo != null) {
                    Iterator<DownloadInfo> it = allDownloadInfo.iterator();
                    while (it.hasNext()) {
                        downloadInfo = it.next();
                        if (downloadInfo != null && TextUtils.equals(downloadInfo.getUrl(), str2)) {
                            LIZIZ = downloadInfo.getName();
                            o.LJIIIIZZ(LIZIZ, "{\n            info.name\n        }");
                            break;
                        }
                    }
                }
                downloadInfo = null;
                StringBuilder LIZ2 = X1D.LIZ();
                byte[] bytes = fragmentId.getBytes(PVC.LIZ);
                o.LJIIIIZZ(bytes, "this as java.lang.String).getBytes(charset)");
                LIZ2.append(C77119UOl.LJIIJJI(bytes));
                LIZ2.append(".mp4");
                LIZIZ = X1D.LIZIZ(LIZ2);
                TokenCert with = TokenCert.Companion.with("bpea-ecom_highlight_store_video");
                C44003HOt c44003HOt = new C44003HOt(activityC45651qj, str2, downloadInfo, LIZIZ, hcz);
                if (Build.VERSION.SDK_INT >= 33) {
                    if (C04330Ez.LIZ(activityC45651qj, "android.permission.READ_MEDIA_VIDEO") == 0) {
                        c44003HOt.invoke();
                        return;
                    } else {
                        C44005HOv.LIZ(activityC45651qj, with, hcz, c44003HOt);
                        return;
                    }
                }
                if (C04330Ez.LIZ(activityC45651qj, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                    c44003HOt.invoke();
                } else {
                    C44005HOv.LIZ(activityC45651qj, with, hcz, c44003HOt);
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44006HOw(HighlightCell highlightCell, boolean z, HighlightCellItem highlightCellItem) {
        super(700L);
        this.LJLJJI = highlightCell;
        this.LJLJJL = z;
        this.LJLJJLL = highlightCellItem;
    }
}
