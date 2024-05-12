package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class QXA<V> implements Callable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ String LJLJJL;

    public QXA(int i, String str, boolean z, String str2, String str3) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = i;
        this.LJLJJI = z;
        this.LJLJJL = str3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        String str2 = this.LJLIL;
        String str3 = this.LJLILLLLZI;
        int i = this.LJLJI;
        boolean z = this.LJLJJI;
        String str4 = this.LJLJJL;
        HashMap hashMap = new HashMap();
        hashMap.put("page_from", String.valueOf(i));
        if (str4 != null) {
            hashMap.put("enter_source", str4);
        }
        if (o.LJ(str2, "unique_id")) {
            hashMap.put("login_name", str3);
            hashMap.put("mt_update_username", "mt_update_username");
            return QX5.LIZIZ(hashMap);
        }
        hashMap.put(str2, str3);
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("confirmed", str);
        return QX5.LIZIZ(hashMap);
    }
}
