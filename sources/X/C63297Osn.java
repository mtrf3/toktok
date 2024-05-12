package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;

/* renamed from: X.Osn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63297Osn implements InterfaceC63352Otg<Void> {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ C63294Osk LJLJL;

    @Override // X.InterfaceC63352Otg
    public final Void LIZIZ() {
        String str;
        HashMap hashMap = new HashMap();
        C63308Osy.LJI().getClass();
        hashMap.put("timestamp", String.valueOf(C63308Osy.LJ()));
        hashMap.put("per_user_cursor", String.valueOf(this.LJLIL));
        hashMap.put("conv_count", String.valueOf(this.LJLILLLLZI));
        hashMap.put("msg_count", String.valueOf(this.LJLJI));
        if (this.LJLJJI) {
            str = CardStruct.IStatusCode.DEFAULT;
        } else {
            str = "1";
        }
        hashMap.put("is_success", str);
        hashMap.put("error_msg", this.LJLJJL);
        hashMap.put("log_id", this.LJLJJLL);
        C63291Osh LIZ = C63291Osh.LIZ();
        int i = this.LJLJL.LIZJ;
        String abstractMap = hashMap.toString();
        InterfaceC63293Osj interfaceC63293Osj = C63291Osh.LIZLLL;
        LIZ.getClass();
        interfaceC63293Osj.putString(C63291Osh.LJIIIIZZ(i, "key_init_handler_snapshot"), abstractMap);
        return null;
    }

    public C63297Osn(C63294Osk c63294Osk, long j, int i, int i2, boolean z, String str, String str2) {
        this.LJLJL = c63294Osk;
        this.LJLIL = j;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
        this.LJLJJI = z;
        this.LJLJJL = str;
        this.LJLJJLL = str2;
    }
}
