package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* loaded from: classes11.dex */
public final class NID<T> implements InterfaceC64592gB {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    public NID(String str, String str2, String str3) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        C64799Pbv c64799Pbv;
        Throwable th = (Throwable) obj;
        if ((th instanceof C64799Pbv) && (c64799Pbv = (C64799Pbv) th) != null && c64799Pbv.getStatusCode() == 204) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", this.LJLIL);
            c188727au.LJIIIZ("session_id", this.LJLILLLLZI);
            c188727au.LJIIIZ("is_success", "1");
            c188727au.LJIIIZ("promote_by", this.LJLJI);
            c188727au.LJIIIZ("store_country", C64707PaR.LIZJ);
            FMX.LJIIL("promote_entrance_click", c188727au.LIZ);
            return;
        }
        C188727au c188727au2 = new C188727au();
        c188727au2.LJIIIZ("enter_from", this.LJLIL);
        c188727au2.LJIIIZ("session_id", this.LJLILLLLZI);
        c188727au2.LJIIIZ("is_success", CardStruct.IStatusCode.DEFAULT);
        c188727au2.LJIIIZ("promote_by", this.LJLJI);
        c188727au2.LJIIIZ("store_country", C64707PaR.LIZJ);
        FMX.LJIIL("promote_entrance_click", c188727au2.LIZ);
    }
}
