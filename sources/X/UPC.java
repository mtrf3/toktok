package X;

import android.content.Context;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public abstract class UPC {
    public Context LJLIL;
    public String LJLILLLLZI;
    public String LJLJI;
    public String LJLJJI;
    public java.util.Map<String, String> LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL = true;

    public abstract C73565Su1 LIZ();

    public abstract C73565Su1 LIZIZ();

    public abstract C73390SrC LJII();

    public abstract C73390SrC LJIIIIZZ();

    public abstract C73390SrC LJIIIZ(int i, boolean z);

    public abstract AbstractC73672Svk<C77150UPq> LJIIJ();

    public final Context LIZJ() {
        Context context = this.LJLIL;
        if (context != null) {
            return context;
        }
        o.LJIJI("context");
        throw null;
    }

    public final String LIZLLL() {
        String str = this.LJLJI;
        if (str != null) {
            return str;
        }
        o.LJIJI("enterFrom");
        throw null;
    }

    public final String LJ() {
        String str = this.LJLJJI;
        if (str != null) {
            return str;
        }
        o.LJIJI("enterMethod");
        throw null;
    }

    public final String LJFF() {
        String str = this.LJLILLLLZI;
        if (str != null) {
            return str;
        }
        o.LJIJI("uid");
        throw null;
    }

    public final void LJI(Context context, String uid, String enterFrom, String enterMethod, boolean z, boolean z2, java.util.Map<String, String> map) {
        o.LJIIJ(context, "context");
        o.LJIIJ(uid, "uid");
        o.LJIIJ(enterFrom, "enterFrom");
        o.LJIIJ(enterMethod, "enterMethod");
        this.LJLIL = context;
        this.LJLILLLLZI = uid;
        this.LJLJI = enterFrom;
        this.LJLJJI = enterMethod;
        this.LJLJJLL = z;
        this.LJLJL = z2;
        this.LJLJJL = map;
    }
}
