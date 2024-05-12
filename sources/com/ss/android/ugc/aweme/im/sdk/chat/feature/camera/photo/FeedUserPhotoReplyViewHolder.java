package com.ss.android.ugc.aweme.im.sdk.chat.feature.camera.photo;

import X.C222588oQ;
import X.C223338pd;
import X.C72809Shp;
import X.ViewOnTouchListenerC80851VoF;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class FeedUserPhotoReplyViewHolder extends VideoViewCell {
    public static final /* synthetic */ int LLZZZZ = 0;
    public ViewStub LLZZ;
    public ViewGroup LLZZJLIL;
    public C223338pd LLZZLLIL;
    public C72809Shp LLZZZIL;

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void LLJZIJLIL(String str) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.InterfaceC222708oc
    public final void Y2(Aweme aweme) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.InterfaceC55219Lln
    public final void ug(Video video) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedUserPhotoReplyViewHolder(C222588oQ params) {
        super(params);
        o.LJIIIZ(params, "params");
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void LJLLLL(Aweme aweme) {
        super.LJLLLL(aweme);
        b2(true);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C2MA
    public final void t7(boolean z) {
        ViewOnTouchListenerC80851VoF viewOnTouchListenerC80851VoF;
        super.t7(z);
        C72809Shp c72809Shp = this.LLZZZIL;
        if (c72809Shp != null && (viewOnTouchListenerC80851VoF = c72809Shp.LJLJLJ) != null) {
            viewOnTouchListenerC80851VoF.LJII();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x009c, code lost:
    
        if (r4 != null) goto L39;
     */
    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2MA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLZ(int r6, com.ss.android.ugc.aweme.feed.model.Aweme r7) {
        /*
            r5 = this;
            super.LLLZ(r6, r7)
            X.8oQ r0 = r5.LJLLILLLL
            android.view.View r1 = r0.LIZ
            r0 = 2131364138(0x7f0a092a, float:1.8348105E38)
            android.view.View r1 = r1.findViewById(r0)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            r5.LLZZ = r1
            if (r1 != 0) goto Lb6
        L14:
            android.view.ViewGroup r0 = r5.LLZZJLIL
            r3 = 0
            r2 = 0
            if (r0 != 0) goto L2c
            android.view.ViewStub r0 = r5.LLZZ
            if (r0 == 0) goto Lb3
            android.view.View r1 = r0.inflate()
        L22:
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto Lb0
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
        L28:
            r5.LLZZJLIL = r1
            if (r1 != 0) goto Lab
        L2c:
            android.view.ViewGroup r1 = r5.LLZZJLIL
            if (r1 == 0) goto La9
            r0 = 2131378661(0x7f0a41e5, float:1.837756E38)
            android.view.View r1 = r1.findViewById(r0)
            X.8pd r1 = (X.C223338pd) r1
        L39:
            boolean r0 = r1 instanceof X.C223338pd
            if (r0 == 0) goto La7
        L3d:
            r5.LLZZLLIL = r1
            if (r1 != 0) goto La3
        L41:
            X.8pd r0 = r5.LLZZLLIL
            if (r0 == 0) goto L48
            r0.LIZIZ()
        L48:
            android.view.ViewGroup r1 = r5.LLZZJLIL
            if (r1 == 0) goto La1
            r0 = 2131381032(0x7f0a4b28, float:1.838237E38)
            android.view.View r1 = r1.findViewById(r0)
            X.Shp r1 = (X.C72809Shp) r1
        L55:
            boolean r0 = r1 instanceof X.C72809Shp
            if (r0 == 0) goto L9f
        L59:
            r5.LLZZZIL = r1
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = X.C78996UzQ.LJIILJJIL(r7)
            if (r4 == 0) goto L6b
            com.ss.android.ugc.aweme.feed.model.Video r0 = r4.getVideo()
            if (r0 == 0) goto L6b
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = r0.getCover()
        L6b:
            com.ss.android.ugc.aweme.base.ImageUrlModel r0 = X.C78939UyV.LJ(r2)
            X.W5F r3 = X.W5U.LJII(r0)
            r2 = -1
            if (r4 == 0) goto L9b
            com.ss.android.ugc.aweme.feed.model.Video r0 = r4.getVideo()
            if (r0 == 0) goto L9b
            int r1 = r0.getWidth()
        L80:
            com.ss.android.ugc.aweme.feed.model.Video r0 = r4.getVideo()
            if (r0 == 0) goto L8a
            int r2 = r0.getHeight()
        L8a:
            r3.LJII = r1
            r3.LJIIIIZZ = r2
            X.Shp r0 = r5.LLZZZIL
            r3.LJJIIJ = r0
            X.9xv r0 = new X.9xv
            r0.<init>()
            r3.LIZLLL(r0)
            return
        L9b:
            r1 = -1
            if (r4 == 0) goto L8a
            goto L80
        L9f:
            r1 = r2
            goto L59
        La1:
            r1 = r2
            goto L55
        La3:
            r1.setVisibility(r3)
            goto L41
        La7:
            r1 = r2
            goto L3d
        La9:
            r1 = r2
            goto L39
        Lab:
            r1.setVisibility(r3)
            goto L2c
        Lb0:
            r1 = r2
            goto L28
        Lb3:
            r1 = r2
            goto L22
        Lb6:
            r0 = 2131560698(0x7f0d08fa, float:1.8746776E38)
            r1.setLayoutResource(r0)
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.camera.photo.FeedUserPhotoReplyViewHolder.LLLZ(int, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }
}
