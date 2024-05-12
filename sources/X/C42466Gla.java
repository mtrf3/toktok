package X;

import java.io.Serializable;
import kotlin.jvm.internal.o;

/* renamed from: X.Gla, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42466Gla implements Serializable {
    public String LJLIL = "";
    public String LJLILLLLZI = "";
    public String LJLJI = "";
    public String LJLJJI = "";

    public final String getAid() {
        return this.LJLJI;
    }

    public final String getCover() {
        return this.LJLILLLLZI;
    }

    public final String getMid() {
        return this.LJLJJI;
    }

    public final String getVid() {
        return this.LJLIL;
    }

    public final void setAid(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LJLJI = str;
    }

    public final void setCover(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LJLILLLLZI = str;
    }

    public final void setMid(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LJLJJI = str;
    }

    public final void setVid(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LJLIL = str;
    }
}
