package X;

import android.content.Context;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ui.IRecordService;
import com.ss.android.ugc.aweme.shortvideo.jsb.comment.ExteriorRecordModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HUG implements IExternalService.ServiceLoadCallback {
    public final /* synthetic */ HUF LIZ;
    public final /* synthetic */ List<HUJ> LIZIZ;
    public final /* synthetic */ HB9 LIZJ;
    public final /* synthetic */ HUH LIZLLL;
    public final /* synthetic */ BinderC44114HTa LJ;

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onDismiss() {
        IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onFailed() {
        IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onOK() {
        IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onLoad(AsyncAVService service, long j) {
        Context context;
        ActivityC45651qj LJJIFFI;
        long j2;
        long j3;
        Float f;
        Float f2;
        int i;
        o.LJIIIZ(service, "service");
        InterfaceC38263Ezz interfaceC38263Ezz = this.LIZ.LJLIL;
        if (interfaceC38263Ezz != null && (context = interfaceC38263Ezz.getContext()) != null && (LJJIFFI = C45804HyK.LJJIFFI(context)) != null) {
            List<HUJ> list = this.LIZIZ;
            HB9 hb9 = this.LIZJ;
            HUH huh = this.LIZLLL;
            BinderC44114HTa binderC44114HTa = this.LJ;
            IRecordService recordService = service.uiService().recordService();
            HB8 hb8 = HB8.ECOMMERCE_COMMENT;
            Number minRecordSeconds = huh.getMinRecordSeconds();
            if (minRecordSeconds != null) {
                j2 = minRecordSeconds.longValue() * 1000;
            } else {
                j2 = 6000;
            }
            Number maxRecordSeconds = huh.getMaxRecordSeconds();
            if (maxRecordSeconds != null) {
                j3 = maxRecordSeconds.longValue() * 1000;
            } else {
                j3 = 60000;
            }
            Number maxSelectVideoCount = huh.getMaxSelectVideoCount();
            o.LJII(maxSelectVideoCount, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) maxSelectVideoCount).intValue();
            Number maxSelectAssetCount = huh.getMaxSelectAssetCount();
            o.LJII(maxSelectAssetCount, "null cannot be cast to non-null type kotlin.Int");
            int intValue2 = ((Integer) maxSelectAssetCount).intValue();
            Number imageCompress = huh.getImageCompress();
            ArrayList arrayList = null;
            if (imageCompress != null) {
                f = Float.valueOf(imageCompress.floatValue());
            } else {
                f = null;
            }
            Number videoCompress = huh.getVideoCompress();
            if (videoCompress != null) {
                f2 = Float.valueOf(videoCompress.floatValue());
            } else {
                f2 = null;
            }
            HUL videoTargetSize = huh.getVideoTargetSize();
            boolean z = true;
            if (videoTargetSize != null) {
                Integer[] numArr = new Integer[2];
                Number width = videoTargetSize.getWidth();
                int i2 = 0;
                if (width != null) {
                    i = width.intValue();
                } else {
                    i = 0;
                }
                numArr[0] = Integer.valueOf(i);
                Number height = videoTargetSize.getHeight();
                if (height != null) {
                    i2 = height.intValue();
                }
                numArr[1] = Integer.valueOf(i2);
                arrayList = C47261Igj.LJII(numArr);
            }
            Boolean showPreviewAfterRecord = huh.getShowPreviewAfterRecord();
            if (showPreviewAfterRecord != null) {
                z = showPreviewAfterRecord.booleanValue();
            }
            recordService.startExteriorVideoRecordScene(LJJIFFI, new ExteriorRecordModel(hb8, list, hb9, j2, j3, intValue, intValue2, f, f2, arrayList, z, huh.getPreviousPage()), binderC44114HTa, "ec_write_review", null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HUG(HUF huf, List<? extends HUJ> list, HB9 hb9, HUH huh, BinderC44114HTa binderC44114HTa) {
        this.LIZ = huf;
        this.LIZIZ = list;
        this.LIZJ = hb9;
        this.LIZLLL = huh;
        this.LJ = binderC44114HTa;
    }
}
