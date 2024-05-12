package X;

import com.bytedance.android.livesdk.model.message.ext.ECommerceMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;
import com.ss.android.ugc.aweme.ecommercelive.common.data.PopProductResp;

/* renamed from: X.Rwr, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71193Rwr implements InterfaceC36621EYv<BaseResponse<PopProductResp>> {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ AbstractC71187Rwl LJLILLLLZI;
    public final /* synthetic */ ECommerceMessage LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ boolean LJLJJL;

    @Override // X.InterfaceC36621EYv
    public final void LIZJ(InterfaceC37276Ek4<BaseResponse<PopProductResp>> interfaceC37276Ek4, Throwable th) {
        String str;
        String str2;
        boolean z;
        String str3;
        long currentTimeMillis = System.currentTimeMillis() - this.LJLIL;
        String LJIILLIIL = AbstractC71187Rwl.LJIILLIIL();
        Room room = this.LJLILLLLZI.LJLLI;
        String str4 = null;
        if (room != null) {
            str = C17280m4.LIZ(room);
        } else {
            str = null;
        }
        if (th != null) {
            str2 = th.getMessage();
        } else {
            str2 = null;
        }
        if (this.LJLJI != null) {
            z = true;
        } else {
            z = false;
        }
        C71162RwM.LIZLLL(LJIILLIIL, str, false, currentTimeMillis, -7, str2, z, this.LJLILLLLZI.LJIJ(), false);
        Room room2 = this.LJLILLLLZI.LJLLI;
        if (room2 != null) {
            str3 = C17280m4.LIZ(room2);
        } else {
            str3 = null;
        }
        if (th != null) {
            str4 = th.getMessage();
        }
        C71150RwA.LIZIZ(str3, str4, false, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d9, code lost:
    
        if (r21 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d5, code lost:
    
        if (r21 != null) goto L41;
     */
    @Override // X.InterfaceC36621EYv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(X.InterfaceC37276Ek4<com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse<com.ss.android.ugc.aweme.ecommercelive.common.data.PopProductResp>> r20, X.C64797Pbt<com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse<com.ss.android.ugc.aweme.ecommercelive.common.data.PopProductResp>> r21) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71193Rwr.LJII(X.Ek4, X.Pbt):void");
    }

    public C71193Rwr(long j, AbstractC71187Rwl abstractC71187Rwl, ECommerceMessage eCommerceMessage, boolean z, boolean z2) {
        this.LJLIL = j;
        this.LJLILLLLZI = abstractC71187Rwl;
        this.LJLJI = eCommerceMessage;
        this.LJLJJI = z;
        this.LJLJJL = z2;
    }
}
