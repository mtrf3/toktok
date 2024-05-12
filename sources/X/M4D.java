package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;

/* loaded from: classes10.dex */
public final class M4D extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ java.util.Map<String, String> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M4D(int i, long j, String str, java.util.Map map, boolean z) {
        super(0);
        this.LJLIL = i;
        this.LJLILLLLZI = z;
        this.LJLJI = str;
        this.LJLJJI = j;
        this.LJLJJL = map;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        String str;
        HashMap hashMap = new HashMap();
        int i = this.LJLIL;
        boolean z = this.LJLILLLLZI;
        String str2 = this.LJLJI;
        long j = this.LJLJJI;
        java.util.Map<String, String> map = this.LJLJJL;
        hashMap.put("ec_message_cnt", String.valueOf(i));
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_load_data", str);
        hashMap.put("quit_type", str2);
        hashMap.put("stay_time", String.valueOf(j));
        hashMap.putAll(map);
        FMX.LJIIL("tiktokec_stay_page", hashMap);
        return C76800UCe.LIZ;
    }
}
