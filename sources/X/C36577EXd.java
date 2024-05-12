package X;

import com.ss.android.ugc.aweme.influencer.ecommercelive.business.broadcaster.beforelive.slot.preview.model.ProductNum;
import com.ss.android.ugc.aweme.influencer.ecommercelive.framework.network.BaseResponse;

/* renamed from: X.EXd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36577EXd implements InterfaceC36621EYv<BaseResponse<ProductNum>> {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ C71226RxO LJLILLLLZI;

    public C36577EXd(long j, C71226RxO c71226RxO) {
        this.LJLIL = j;
        this.LJLILLLLZI = c71226RxO;
    }

    @Override // X.InterfaceC36621EYv
    public final void LIZJ(InterfaceC37276Ek4<BaseResponse<ProductNum>> interfaceC37276Ek4, Throwable th) {
        String str;
        long currentTimeMillis = System.currentTimeMillis() - this.LJLIL;
        String LJIIL = C71226RxO.LJIIL();
        EnumC71217RxF enumC71217RxF = EnumC71217RxF.ROOM_OWNER;
        if (th != null) {
            str = th.getMessage();
        } else {
            str = null;
        }
        C71202Rx0.LIZIZ(LJIIL, false, currentTimeMillis, enumC71217RxF, -7, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b0, code lost:
    
        if (r12 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b6, code lost:
    
        if (r12 != null) goto L33;
     */
    @Override // X.InterfaceC36621EYv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(X.InterfaceC37276Ek4<com.ss.android.ugc.aweme.influencer.ecommercelive.framework.network.BaseResponse<com.ss.android.ugc.aweme.influencer.ecommercelive.business.broadcaster.beforelive.slot.preview.model.ProductNum>> r11, X.C64797Pbt<com.ss.android.ugc.aweme.influencer.ecommercelive.framework.network.BaseResponse<com.ss.android.ugc.aweme.influencer.ecommercelive.business.broadcaster.beforelive.slot.preview.model.ProductNum>> r12) {
        /*
            r10 = this;
            long r5 = java.lang.System.currentTimeMillis()
            long r0 = r10.LJLIL
            long r5 = r5 - r0
            r4 = 1
            if (r12 == 0) goto Lbb
            boolean r0 = r12.LIZIZ()
            if (r0 != r4) goto Lbb
            r0 = 1
        L11:
            r9 = 0
            if (r0 == 0) goto Lb6
            T r0 = r12.LIZIZ
            com.ss.android.ugc.aweme.influencer.ecommercelive.framework.network.BaseResponse r0 = (com.ss.android.ugc.aweme.influencer.ecommercelive.framework.network.BaseResponse) r0
            java.lang.Object r0 = r0.getData()
            com.ss.android.ugc.aweme.influencer.ecommercelive.business.broadcaster.beforelive.slot.preview.model.ProductNum r0 = (com.ss.android.ugc.aweme.influencer.ecommercelive.business.broadcaster.beforelive.slot.preview.model.ProductNum) r0
            if (r0 == 0) goto Lb3
            java.lang.Integer r0 = r0.totalNumber
            if (r0 == 0) goto Lb3
            int r0 = r0.intValue()
        L28:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            int r0 = r1.length()
            if (r0 <= 0) goto L47
            java.lang.String r0 = "0"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 != 0) goto L47
            X.RxO r0 = r10.LJLILLLLZI
            com.bytedance.android.live.slot.IIconSlot$SlotViewModel r0 = r0.LJLJL
            if (r0 == 0) goto L47
            androidx.lifecycle.MutableLiveData<java.lang.String> r0 = r0.LJLJJI
            if (r0 == 0) goto L47
            r0.postValue(r1)
        L47:
            T r0 = r12.LIZIZ
            com.ss.android.ugc.aweme.influencer.ecommercelive.framework.network.BaseResponse r0 = (com.ss.android.ugc.aweme.influencer.ecommercelive.framework.network.BaseResponse) r0
            if (r0 == 0) goto L5d
            java.lang.Object r0 = r0.getData()
            com.ss.android.ugc.aweme.influencer.ecommercelive.business.broadcaster.beforelive.slot.preview.model.ProductNum r0 = (com.ss.android.ugc.aweme.influencer.ecommercelive.business.broadcaster.beforelive.slot.preview.model.ProductNum) r0
            if (r0 == 0) goto L5d
            java.lang.Integer r0 = r0.totalNumber
            if (r0 == 0) goto L5d
            r0.intValue()
        L5d:
            java.lang.String r3 = X.C71227RxP.LIZLLL
            if (r3 == 0) goto L70
            X.FSJ r0 = X.C36576EXc.LIZIZ
            X.2gm r2 = X.C48841JEv.LIZ(r0)
            X.EXe r1 = new X.EXe
            r1.<init>(r3, r9)
            r0 = 3
            X.XKX.LIZLLL(r2, r9, r9, r1, r0)
        L70:
            boolean r0 = r12.LIZIZ()
            if (r0 != r4) goto Lb9
            T r0 = r12.LIZIZ
            com.ss.android.ugc.aweme.influencer.ecommercelive.framework.network.BaseResponse r0 = (com.ss.android.ugc.aweme.influencer.ecommercelive.framework.network.BaseResponse) r0
            if (r0 == 0) goto Lb9
            java.lang.Object r0 = r0.getData()
            com.ss.android.ugc.aweme.influencer.ecommercelive.business.broadcaster.beforelive.slot.preview.model.ProductNum r0 = (com.ss.android.ugc.aweme.influencer.ecommercelive.business.broadcaster.beforelive.slot.preview.model.ProductNum) r0
            if (r0 == 0) goto Lb9
            java.lang.Integer r0 = r0.totalNumber
            if (r0 == 0) goto Lb9
            int r0 = r0.intValue()
            if (r0 <= 0) goto Lb9
            r4 = 1
        L8f:
            java.lang.String r3 = X.C71226RxO.LJIIL()
            X.RxF r7 = X.EnumC71217RxF.ROOM_OWNER
            if (r12 == 0) goto Laf
            T r0 = r12.LIZIZ
            com.ss.android.ugc.aweme.influencer.ecommercelive.framework.network.BaseResponse r0 = (com.ss.android.ugc.aweme.influencer.ecommercelive.framework.network.BaseResponse) r0
            if (r0 == 0) goto Laf
            int r8 = r0.getCode()
        La1:
            T r0 = r12.LIZIZ
            com.ss.android.ugc.aweme.influencer.ecommercelive.framework.network.BaseResponse r0 = (com.ss.android.ugc.aweme.influencer.ecommercelive.framework.network.BaseResponse) r0
            if (r0 == 0) goto Lab
            java.lang.String r9 = r0.getMessage()
        Lab:
            X.C71202Rx0.LIZIZ(r3, r4, r5, r7, r8, r9)
            return
        Laf:
            r8 = 0
            if (r12 == 0) goto Lab
            goto La1
        Lb3:
            r0 = 0
            goto L28
        Lb6:
            if (r12 == 0) goto Lb9
            goto L70
        Lb9:
            r4 = 0
            goto L8f
        Lbb:
            r0 = 0
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36577EXd.LJII(X.Ek4, X.Pbt):void");
    }
}
