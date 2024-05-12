package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.TEq, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74316TEq extends F9E {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final int LJLJJI;
    public final int LJLJJL;
    public final java.util.Map<String, String> LJLJJLL;
    public final boolean LJLJL;
    public final String LJLJLJ;
    public final boolean LJLJLLL;
    public final boolean LJLL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, Integer.valueOf(this.LJLJJI), Integer.valueOf(this.LJLJJL), this.LJLJJLL, Boolean.valueOf(this.LJLJL), this.LJLJLJ, Boolean.valueOf(this.LJLJLLL), Boolean.valueOf(this.LJLL)};
    }

    public C74316TEq(String str, String keyword, int i, java.util.Map extraParams, String host, int i2) {
        str = (i2 & 1) != 0 ? null : str;
        String searchId = (i2 & 2) != 0 ? CardStruct.IStatusCode.DEFAULT : null;
        i = (i2 & 8) != 0 ? 60 : i;
        extraParams = (i2 & 32) != 0 ? C113554cx.LJJJLIIL() : extraParams;
        host = (i2 & 128) != 0 ? "" : host;
        o.LJIIIZ(searchId, "searchId");
        o.LJIIIZ(keyword, "keyword");
        o.LJIIIZ(extraParams, "extraParams");
        o.LJIIIZ(host, "host");
        this.LJLIL = str;
        this.LJLILLLLZI = searchId;
        this.LJLJI = keyword;
        this.LJLJJI = i;
        this.LJLJJL = 0;
        this.LJLJJLL = extraParams;
        this.LJLJL = false;
        this.LJLJLJ = host;
        this.LJLJLLL = false;
        this.LJLL = false;
    }
}
