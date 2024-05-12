package X;

import android.view.View;
import com.ss.android.ugc.aweme.image.model.ImageAlbumData;
import com.ss.android.ugc.aweme.image.model.ImageSynthesisResult;
import com.ss.android.ugc.aweme.image.model.SingleImageData;
import com.ss.android.ugc.aweme.image.model.SrcImageInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.G9v, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41067G9v implements GAH {
    public final /* synthetic */ C41051G9f LIZ;

    public C41067G9v(C41051G9f c41051G9f) {
        this.LIZ = c41051G9f;
    }

    @Override // X.GAH
    public final void onProgress(float f) {
        C41051G9f c41051G9f = this.LIZ;
        c41051G9f.LLIIJLIL = true;
        c41051G9f.LLIILZL = f;
        A90 a90 = c41051G9f.LLIILII;
        if (a90 != null) {
            a90.LIZLLL(f);
        }
    }

    @Override // X.GAH
    public final void onSuccess(List<SrcImageInfo> paths) {
        o.LJIIIZ(paths, "paths");
        VideoPublishEditModel videoPublishEditModel = this.LIZ.LJZ;
        if (videoPublishEditModel != null) {
            ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
            ArrayList arrayList = new ArrayList(C32I.LJJL(paths, 10));
            for (SrcImageInfo srcImageInfo : paths) {
                arrayList.add(new SingleImageData(null, srcImageInfo, null, null, null, null, null, new ImageSynthesisResult(srcImageInfo.getPath(), srcImageInfo.getWidth(), srcImageInfo.getHeight()), null, 0, null, 1913, null));
            }
            imageAlbumData.setImageList(arrayList);
            A90 a90 = this.LIZ.LLIILII;
            if (a90 != null && a90.isShowing()) {
                a90.dismiss();
            }
            C41051G9f c41051G9f = this.LIZ;
            c41051G9f.LLIIJI = true;
            c41051G9f.LLIIJLIL = false;
            GBX gbx = c41051G9f.LL;
            if (gbx == GBX.CLICK_PREVIEW) {
                View view = c41051G9f.LLD;
                if (view != null) {
                    c41051G9f.LLJJLIIIJLLLLLLLZ(c41051G9f.LLF, view);
                } else {
                    o.LJIJI("clickCoverView");
                    throw null;
                }
            } else if (gbx == GBX.CLICK_SELECT_COVER) {
                c41051G9f.LLJLILLLLZIIL();
            }
            this.LIZ.LL = GBX.NO_CLICK;
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
