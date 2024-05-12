package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;

/* renamed from: X.Hwf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45701Hwf implements InterfaceC42346Gje {
    public final /* synthetic */ MyMediaModel LJLIL;
    public final /* synthetic */ float LJLILLLLZI;
    public final /* synthetic */ C45703Hwh LJLJI;
    public final /* synthetic */ C45700Hwe LJLJJI;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0098 A[LOOP:1: B:13:0x0064->B:20:0x0098, LOOP_END] */
    @Override // X.InterfaceC42346Gje
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(android.graphics.Bitmap r10) {
        /*
            r9 = this;
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel r0 = r9.LJLIL
            java.lang.String r0 = r0.fileLocalUriPath
            r1.append(r0)
            float r0 = r9.LJLILLLLZI
            int r0 = (int) r0
            r1.append(r0)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            X.Hwh r0 = r9.LJLJI
            com.bytedance.lighten.loader.SmartImageView r0 = r0.LJLILLLLZI
            java.lang.Object r0 = r0.getTag()
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L33
            X.Hwh r0 = r9.LJLJI
            com.bytedance.lighten.loader.SmartImageView r1 = r0.LJLILLLLZI
            X.Shn r0 = X.EnumC72807Shn.FIT_CENTER
            r1.setActualImageScaleType(r0)
            X.Hwh r0 = r9.LJLJI
            com.bytedance.lighten.loader.SmartImageView r0 = r0.LJLILLLLZI
            r0.setImageBitmap(r10)
        L33:
            X.Hwh r0 = r9.LJLJI
            int r2 = r0.getBindingAdapterPosition()
            X.Hwe r1 = r9.LJLJJI
            int r0 = r1.LJLJI
            int r0 = r0 + (-1)
            if (r2 != r0) goto La5
            java.util.Set<com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel> r0 = r1.LJLJLLL
            java.util.Iterator r8 = r0.iterator()
        L47:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L9e
            java.lang.Object r7 = r8.next()
            com.ss.android.ugc.aweme.mediachoose.helper.MediaModel r7 = (com.ss.android.ugc.aweme.mediachoose.helper.MediaModel) r7
            X.Hwe r6 = r9.LJLJJI
            r6.getClass()
            int r1 = r7.width
            int r0 = r7.height
            r6.LJZ(r1, r0)
            int r5 = r6.LJLJI
            if (r5 < 0) goto L47
            r4 = 0
        L64:
            X.Hum<java.lang.String> r2 = r6.LJLJJL
            if (r2 == 0) goto L9b
            java.lang.String r1 = r7.id
            java.lang.String r0 = "it.id"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.util.Map<ID_TYPE, com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel> r0 = r2.LIZ
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.lang.Object r0 = r0.get(r1)
            com.ss.android.ugc.aweme.mediachoose.helper.MediaModel r0 = (com.ss.android.ugc.aweme.mediachoose.helper.MediaModel) r0
            if (r0 == 0) goto L9b
            long r2 = r0.duration
        L7d:
            float r1 = (float) r4
            int r0 = r6.LJLJI
            float r0 = (float) r0
            float r1 = r1 / r0
            float r0 = (float) r2
            float r1 = r1 * r0
            com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.VEMediaParserProviderV2 r3 = r6.LJLJLJ
            java.lang.String r2 = r7.fileLocalUriPath
            java.lang.String r0 = "it.fileLocalUriPath"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            int r1 = (int) r1
            X.T1n r0 = new X.T1n
            r0.<init>()
            r3.LIZIZ(r4, r2, r1, r0)
            if (r4 == r5) goto L47
            int r4 = r4 + 1
            goto L64
        L9b:
            long r2 = r7.duration
            goto L7d
        L9e:
            X.Hwe r0 = r9.LJLJJI
            java.util.Set<com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel> r0 = r0.LJLJLLL
            r0.clear()
        La5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45701Hwf.LJ(android.graphics.Bitmap):void");
    }

    public C45701Hwf(MyMediaModel myMediaModel, float f, C45703Hwh c45703Hwh, C45700Hwe c45700Hwe) {
        this.LJLIL = myMediaModel;
        this.LJLILLLLZI = f;
        this.LJLJI = c45703Hwh;
        this.LJLJJI = c45700Hwe;
    }
}
