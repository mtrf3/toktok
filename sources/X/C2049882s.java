package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import java.util.List;

/* renamed from: X.82s, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2049882s extends AbstractC29229BdZ {
    public List<PhotoModeImageUrlModel> LJLJJLL;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LJLJJLL.size();
    }

    public C2049882s(Context context) {
        super(context, C16880lQ.LLZIL(context), 1);
        this.LJLJJLL = C61878OQg.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0063, code lost:
    
        if ((!r0.isEmpty()) == true) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0069, code lost:
    
        if (r3.getUrlList() != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006c, code lost:
    
        r5 = X.W5U.LJIIIZ(new X.C62562cu(r3.getUrlList()));
        r5.LJIJI = android.graphics.Bitmap.Config.RGB_565;
        r6 = r3.getWidth();
        r3 = r3.getHeight();
        r2 = X.X1D.LIZ();
        r2.append("calculatePhotoScaleType imageWidth:");
        r2.append(r6);
        r2.append(", imageHeight:");
        r2.append(r3);
        X.X1D.LIZIZ(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00aa, code lost:
    
        if (X.LFH.LIZIZ.LIZLLL().LJIILLIIL().LIZJ() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ac, code lost:
    
        r0 = X.EnumC72807Shn.FIT_CENTER;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ae, code lost:
    
        r5.LJIJJ = r0;
        r5.LJJIIJ = r1.LIZLLL;
        r5.LJIIL = 0;
        r5.LIZLLL(r1.LJ);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00bc, code lost:
    
        if (r3 != 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00be, code lost:
    
        r2 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c0, code lost:
    
        r3 = X.X1D.LIZ();
        r3.append("calculatePhotoScaleType aspectRatio:");
        r3.append(r2);
        r3.append(", threshold:");
        r3.append(0.75f);
        X.X1D.LIZIZ(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00db, code lost:
    
        if (r2 > 0.75f) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00dd, code lost:
    
        r0 = X.EnumC72807Shn.CENTER_CROP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e4, code lost:
    
        r0 = X.EnumC72807Shn.FIT_CENTER;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e0, code lost:
    
        r2 = r6 / r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00eb, code lost:
    
        if (r3 != null) goto L17;
     */
    @Override // X.AbstractC29229BdZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View LJJIII(int r8, android.view.View r9, android.view.ViewGroup r10) {
        /*
            r7 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.o.LJIIIZ(r10, r0)
            r4 = 0
            if (r9 != 0) goto Lef
            r0 = 2131562126(0x7f0d0e8e, float:1.8749672E38)
            android.view.View r9 = X.C28289B8j.LIZ(r10, r0, r10, r4)
            X.82r r1 = new X.82r
            r1.<init>(r9)
            r9.setTag(r1)
        L17:
            int r0 = r7.getCount()
            if (r0 <= 0) goto L6b
            java.util.List<com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel> r0 = r7.LJLJJLL
            java.lang.Object r5 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r8)
            com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel r5 = (com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel) r5
            java.lang.String r0 = "photoModel"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            java.util.List r0 = r5.getBitrateImages()
            if (r0 == 0) goto Le7
            java.lang.Object r3 = X.ORZ.LJLLLLLL(r4, r0)
            com.ss.android.ugc.aweme.feed.model.MultiImageUrlInfo r3 = (com.ss.android.ugc.aweme.feed.model.MultiImageUrlInfo) r3
            if (r3 == 0) goto Le7
            java.lang.StringBuilder r2 = X.X1D.LIZ()
            java.lang.String r0 = "PhotoMode Image getTargetImageModel bitrate_image_gear: "
            r2.append(r0)
            java.lang.String r0 = r3.getName()
            r2.append(r0)
            r0 = 32
            r2.append(r0)
            X.X1D.LIZIZ(r2)
            com.ss.android.ugc.aweme.base.model.UrlModel r3 = r3.getImage()
            if (r3 == 0) goto Le7
            java.util.List r0 = r3.getUrlList()
            if (r0 == 0) goto Le7
            boolean r0 = r0.isEmpty()
            r2 = 1
            r0 = r0 ^ 1
            if (r0 != r2) goto Le7
        L65:
            java.util.List r0 = r3.getUrlList()
            if (r0 != 0) goto L6c
        L6b:
            return r9
        L6c:
            X.2cu r2 = new X.2cu
            java.util.List r0 = r3.getUrlList()
            r2.<init>(r0)
            X.W5F r5 = X.W5U.LJIIIZ(r2)
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGB_565
            r5.LJIJI = r0
            int r6 = r3.getWidth()
            int r3 = r3.getHeight()
            java.lang.StringBuilder r2 = X.X1D.LIZ()
            java.lang.String r0 = "calculatePhotoScaleType imageWidth:"
            r2.append(r0)
            r2.append(r6)
            java.lang.String r0 = ", imageHeight:"
            r2.append(r0)
            r2.append(r3)
            X.X1D.LIZIZ(r2)
            X.LFH r0 = X.LFH.LIZIZ
            X.LEp r0 = r0.LIZLLL()
            X.LEh r0 = r0.LJIILLIIL()
            boolean r0 = r0.LIZJ()
            if (r0 == 0) goto Lbc
            X.Shn r0 = X.EnumC72807Shn.FIT_CENTER
        Lae:
            r5.LJIJJ = r0
            X.WdE r0 = r1.LIZLLL
            r5.LJJIIJ = r0
            r5.LJIIL = r4
            X.82t r0 = r1.LJ
            r5.LIZLLL(r0)
            goto L6b
        Lbc:
            if (r3 != 0) goto Le0
            r2 = 1065353216(0x3f800000, float:1.0)
        Lc0:
            java.lang.StringBuilder r3 = X.X1D.LIZ()
            java.lang.String r0 = "calculatePhotoScaleType aspectRatio:"
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = ", threshold:"
            r3.append(r0)
            r0 = 1061158912(0x3f400000, float:0.75)
            r3.append(r0)
            X.X1D.LIZIZ(r3)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 > 0) goto Le4
            X.Shn r0 = X.EnumC72807Shn.CENTER_CROP
            goto Lae
        Le0:
            float r2 = (float) r6
            float r0 = (float) r3
            float r2 = r2 / r0
            goto Lc0
        Le4:
            X.Shn r0 = X.EnumC72807Shn.FIT_CENTER
            goto Lae
        Le7:
            com.ss.android.ugc.aweme.base.model.UrlModel r3 = r5.getDisplayImageNoWatermark()
            if (r3 == 0) goto L6b
            goto L65
        Lef:
            java.lang.Object r1 = r9.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.ui.feed.photos.PhotosItemViewHolder"
            kotlin.jvm.internal.o.LJII(r1, r0)
            X.82r r1 = (X.C2049782r) r1
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2049882s.LJJIII(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
