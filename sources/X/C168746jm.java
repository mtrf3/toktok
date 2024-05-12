package X;

import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreException;
import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreResult;
import com.ss.android.ugc.aweme.image.model.ImageAlbumData;
import com.ss.android.ugc.aweme.image.model.SingleImageData;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.ss.android.ugc.effectmanager.algorithm.FetchResourcesListener;
import java.util.List;
import kotlin.jvm.internal.AqS149S0200000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6jm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C168746jm implements InterfaceC168706ji {
    public final C169096kL LIZ;
    public java.util.Map<SingleImageData, Integer> LIZIZ;

    @Override // X.InterfaceC168706ji
    public final int LIZ() {
        return 11;
    }

    @Override // X.InterfaceC168706ji
    public final int getPriority() {
        return 1100;
    }

    @Override // X.InterfaceC168706ji
    public final C169096kL getParams() {
        return this.LIZ;
    }

    public C168746jm(C169096kL params) {
        o.LJIIIZ(params, "params");
        this.LIZ = params;
    }

    @Override // X.InterfaceC168706ji
    public final Object LIZIZ(InterfaceC67352kd<? super List<DraftFileRestoreResult>> interfaceC67352kd) {
        final XKS xks = new XKS(1, C78555UsJ.LJJII(interfaceC67352kd));
        xks.LJIIL();
        C5Z2.LIZ("DraftImageModeRestoreHandler ; restore start ...");
        java.util.Map<SingleImageData, Integer> map = this.LIZIZ;
        if (map == null || map.isEmpty()) {
            List LJJIJ = C47261Igj.LJJIJ(C168716jj.LIZIZ(this, null, null, 7));
            C3C5.m7constructorimpl(LJJIJ);
            xks.resumeWith(LJJIJ);
        } else {
            FetchResourcesListener fetchResourcesListener = new FetchResourcesListener() { // from class: X.6jn
                @Override // com.ss.android.ugc.effectmanager.algorithm.FetchResourcesListener
                public final void onSuccess() {
                    java.util.Map<SingleImageData, Integer> map2 = this.LIZIZ;
                    o.LJI(map2);
                    ImageAlbumData imageAlbumData = ((AwemeDraft) this.LIZ.LIZLLL).LJJJJI.imageAlbumData;
                    o.LJI(imageAlbumData);
                    C151525x6.LIZ(map2, imageAlbumData, CreativeInfo.copy$default(((AwemeDraft) this.LIZ.LIZLLL).LIZIZ(), null, ((AwemeDraft) this.LIZ.LIZLLL).LIZIZ().getVersion() + 1, null, 5, null), new AqS149S0200000_2((XJL) xks, (XJL<? super List<DraftFileRestoreResult>>) this, (C168746jm) 88));
                }

                @Override // com.ss.android.ugc.effectmanager.algorithm.FetchResourcesListener
                public final void onFailed(Exception exc) {
                    XJL<List<DraftFileRestoreResult>> xjl = xks;
                    List LJJIJ2 = C47261Igj.LJJIJ(C168716jj.LIZIZ(this, null, new DraftFileRestoreException(-3000, exc), 3));
                    C3C5.m7constructorimpl(LJJIJ2);
                    xjl.resumeWith(LJJIJ2);
                }
            };
            ImageAlbumData imageAlbumData = ((AwemeDraft) this.LIZ.LIZLLL).LJJJJI.imageAlbumData;
            if (imageAlbumData != null && imageAlbumData.getAutoEnhanceOn() && !C44384HbQ.LJLJLJ("lens_hdr")) {
                DownloadableModelSupport.getInstance().fetchResourcesWithModelNames(0, new String[]{"lens_hdr"}, fetchResourcesListener);
            } else {
                fetchResourcesListener.onSuccess();
            }
        }
        return xks.LJIIJJI();
    }

    @Override // X.InterfaceC168706ji
    public final Object LIZLLL(InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        java.util.Map<SingleImageData, Integer> map;
        boolean z;
        ImageAlbumData imageAlbumData = ((AwemeDraft) this.LIZ.LIZLLL).LJJJJI.imageAlbumData;
        if (imageAlbumData != null) {
            map = imageAlbumData.getNeedCompileImages();
        } else {
            map = null;
        }
        this.LIZIZ = map;
        if (map == null || map.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // X.InterfaceC168706ji
    public final DraftFileRestoreResult LIZJ(Integer num, boolean z, DraftFileRestoreException draftFileRestoreException) {
        return C168716jj.LIZ(this, num, z, draftFileRestoreException);
    }
}
