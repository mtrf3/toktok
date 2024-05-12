package X;

import X.C174376sr;
import java.io.Serializable;

/* renamed from: X.6sr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public class C174376sr<T extends C174376sr> implements Serializable {
    public static final long serialVersionUID = 9148864135191458444L;
    public String LJLIL;
    public String LJLILLLLZI;
    public String LJLJI;

    public String getAid() {
        return this.LJLILLLLZI;
    }

    public String getAuthorUid() {
        return this.LJLJI;
    }

    public String getCid() {
        return this.LJLIL;
    }

    public C174376sr(String str) {
        this.LJLILLLLZI = str;
    }

    public C174376sr setAid(String str) {
        this.LJLILLLLZI = str;
        return this;
    }

    public T setAuthorUid(String str) {
        this.LJLJI = str;
        return this;
    }

    public C174376sr setCid(String str) {
        this.LJLIL = str;
        return this;
    }
}
