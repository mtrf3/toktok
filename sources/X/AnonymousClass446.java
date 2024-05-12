package X;

import java.io.Serializable;

/* renamed from: X.446, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass446 implements Serializable {
    public String LJLIL;
    public String LJLILLLLZI;
    public String LJLJI;
    public String LJLJJI;

    public String getAdId() {
        return this.LJLJI;
    }

    public String getCreativeId() {
        return this.LJLILLLLZI;
    }

    public String getLogExtra() {
        return this.LJLIL;
    }

    public String getReqId() {
        return this.LJLJJI;
    }

    public AnonymousClass446 setAdId(String str) {
        this.LJLJI = str;
        return this;
    }

    public void setCreativeId(String str) {
        this.LJLILLLLZI = str;
    }

    public void setLogExtra(String str) {
        this.LJLIL = str;
    }

    public AnonymousClass446 setReqId(String str) {
        this.LJLJJI = str;
        return this;
    }

    public AnonymousClass446(String str, String str2) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
    }
}
