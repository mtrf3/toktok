package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;

/* renamed from: X.F2r, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38333F2r extends C38306F1q {
    public static Gson LJLJLJ;
    public Object LJLILLLLZI;
    public String LJLJI;
    public String LJLJJI;
    public String LJLJJL;
    public int LJLJJLL;
    public String LJLJL;

    public String convertResponseToString() {
        Object obj = this.LJLILLLLZI;
        if (obj instanceof String) {
            return (String) obj;
        }
        if (LJLJLJ == null) {
            LJLJLJ = new Gson();
        }
        String json = GsonProtectorUtils.toJson(LJLJLJ, this.LJLILLLLZI);
        this.LJLILLLLZI = json;
        return json;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        if (getPath() == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ApiServerException,error code is ");
            LIZ.append(getErrorCode());
            return X1D.LIZIZ(LIZ);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("ApiServerException,error code is ");
        LIZ2.append(getErrorCode());
        LIZ2.append(";request path :");
        LIZ2.append(getPath());
        return X1D.LIZIZ(LIZ2);
    }

    public String getResponse() {
        return convertResponseToString();
    }

    public int getBlockCode() {
        return this.LJLJJLL;
    }

    public String getErrorMsg() {
        return this.LJLJI;
    }

    public String getPath() {
        return this.LJLJL;
    }

    public String getPrompt() {
        return this.LJLJJI;
    }

    public Object getRawResponse() {
        return this.LJLILLLLZI;
    }

    public String getUrl() {
        return this.LJLJJL;
    }

    public C38333F2r(int i) {
        super(i);
    }

    public void setBlockCode(int i) {
        this.LJLJJLL = i;
    }

    public C38333F2r setErrorMsg(String str) {
        this.LJLJI = str;
        return this;
    }

    public void setPath(String str) {
        this.LJLJL = str;
    }

    public C38333F2r setPrompt(String str) {
        this.LJLJJI = str;
        return this;
    }

    public C38333F2r setResponse(Object obj) {
        this.LJLILLLLZI = obj;
        return this;
    }

    public C38333F2r setUrl(String str) {
        this.LJLJJL = str;
        return this;
    }

    public C38333F2r setResponse(String str) {
        this.LJLILLLLZI = str;
        return this;
    }
}
