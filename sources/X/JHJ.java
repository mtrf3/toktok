package X;

import android.text.TextUtils;
import java.util.HashMap;

/* loaded from: classes9.dex */
public final class JHJ extends J8E {
    public int LJLILLLLZI;
    public String LJLJI;
    public String LJLJJI;
    public String LJLJJL;
    public String LJLJJLL;
    public String LJLJL;
    public String LJLJLJ;

    @Override // X.J8E
    public HashMap<String, String> buildParams() {
        String valueOf = String.valueOf(this.LJLILLLLZI);
        C1799074g c1799074g = InterfaceC1798974f.LIZ;
        appendParam("order", valueOf, c1799074g);
        appendParam("search_keyword", this.LJLJI, c1799074g);
        appendParam("enter_from", this.LJLJJL, c1799074g);
        appendParam("enter_method", this.LJLJJLL, c1799074g);
        if (!TextUtils.isEmpty(this.LJLJL)) {
            appendParam("search_result_id", this.LJLJL, c1799074g);
        }
        if (!TextUtils.isEmpty(this.LJLJLJ)) {
            appendParam("list_item_id", this.LJLJLJ, c1799074g);
        }
        if (!TextUtils.isEmpty(this.LJLJJI)) {
            appendParam("request_id", this.LJLJJI, c1799074g);
            appendParam("log_pb", C3A5.LIZ.LIZIZ(this.LJLJJI), c1799074g);
        }
        return this.LJLIL;
    }

    public JHJ setEnterFrom(String str) {
        this.LJLJJL = str;
        return this;
    }

    public JHJ setEnterMethod(String str) {
        this.LJLJJLL = str;
        return this;
    }

    public JHJ setListItemId(String str) {
        this.LJLJLJ = str;
        return this;
    }

    public JHJ setOrder(int i) {
        this.LJLILLLLZI = i;
        return this;
    }

    public JHJ setRid(String str) {
        this.LJLJJI = str;
        return this;
    }

    public JHJ setSearchKeyword(String str) {
        this.LJLJI = str;
        return this;
    }

    public JHJ setSearchResultId(String str) {
        this.LJLJL = str;
        return this;
    }
}
