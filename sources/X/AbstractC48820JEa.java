package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import defpackage.b1;
import java.util.Collection;
import kotlin.jvm.internal.o;

/* renamed from: X.JEa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC48820JEa {
    public static final /* synthetic */ int LJ = 0;
    public final String LIZ;
    public final String LIZIZ;
    public final byte LIZJ;
    public final boolean LIZLLL;

    public final void LIZJ(InterfaceC65784Pro<String> invoke) {
        o.LJIIIZ(invoke, "invoke");
        if (!this.LIZLLL) {
            return;
        }
        LIZ(null, invoke.invoke());
    }

    public final void LIZLLL(String message) {
        o.LJIIIZ(message, "message");
        if (!this.LIZLLL) {
            return;
        }
        LJ(this.LIZIZ, message);
    }

    public final void LJI(InterfaceC65784Pro<String> invoke) {
        o.LJIIIZ(invoke, "invoke");
        if (!this.LIZLLL) {
            return;
        }
        LIZLLL(invoke.invoke());
    }

    public final void LJIIIIZZ(String message) {
        o.LJIIIZ(message, "message");
        LJIIIZ(this.LIZIZ, null, message);
    }

    public final void LJIIJ(InterfaceC65784Pro<String> invoke) {
        o.LJIIIZ(invoke, "invoke");
        if (!this.LIZLLL) {
            return;
        }
        LJII(null, invoke.invoke());
    }

    public final void LJIIL(String message) {
        o.LJIIIZ(message, "message");
        if (!this.LIZLLL) {
            return;
        }
        LJIILIIL(this.LIZIZ, message);
    }

    public AbstractC48820JEa(String str, String module) {
        o.LJIIIZ(module, "module");
        this.LIZ = str;
        this.LIZIZ = module;
        this.LIZJ = (byte) 7;
        this.LIZLLL = ((Boolean) C48821JEb.LIZ.getValue()).booleanValue();
    }

    public final void LIZ(Object obj, String message) {
        o.LJIIIZ(message, "message");
        if (!this.LIZLLL) {
            return;
        }
        LIZIZ(this.LIZIZ, obj, message);
    }

    public final void LJ(String tag, String message) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(message, "message");
        if (this.LIZLLL && ((byte) (this.LIZJ & 1)) != 0) {
            LJIIJJI(6, tag, message, null);
        }
    }

    public final void LJFF(String str, Throwable err) {
        o.LJIIIZ(err, "err");
        if (!this.LIZLLL) {
            return;
        }
        String tag = this.LIZIZ;
        o.LJIIIZ(tag, "tag");
        if (!this.LIZLLL) {
            return;
        }
        String message = err.getMessage();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(", ");
        LIZ.append(message);
        LJ(tag, X1D.LIZIZ(LIZ));
    }

    public final void LJII(Object obj, String message) {
        o.LJIIIZ(message, "message");
        if (!this.LIZLLL) {
            return;
        }
        LJIIIZ(this.LIZIZ, obj, message);
    }

    public final void LJIILIIL(String tag, String message) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(message, "message");
        if (!this.LIZLLL || ((byte) (this.LIZJ & 2)) == 0) {
            return;
        }
        LJIIJJI(5, tag, message, null);
    }

    public final void LJIILJJIL(String message, Throwable th) {
        String str;
        o.LJIIIZ(message, "message");
        if (!this.LIZLLL) {
            return;
        }
        String tag = this.LIZIZ;
        o.LJIIIZ(tag, "tag");
        if (!this.LIZLLL) {
            return;
        }
        if (th != null) {
            str = th.getMessage();
        } else {
            str = null;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(message);
        LIZ.append(", ");
        LIZ.append(str);
        LJIILIIL(tag, X1D.LIZIZ(LIZ));
    }

    public final void LIZIZ(String tag, Object obj, String message) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(message, "message");
        if (!this.LIZLLL || ((byte) (this.LIZJ & 8)) == 0) {
            return;
        }
        LJIIJJI(3, tag, message, obj);
    }

    public final void LJIIIZ(String tag, Object obj, String message) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(message, "message");
        if (!this.LIZLLL || ((byte) (this.LIZJ & 4)) == 0) {
            return;
        }
        LJIIJJI(4, tag, message, obj);
    }

    public final void LJIIJJI(int i, String str, String str2, Object obj) {
        String LIZIZ;
        boolean z;
        String LIZ;
        if (obj != null) {
            StringBuilder LIZJ = b1.LIZJ(str2, ", ");
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                LIZIZ = "action:" + intent.getAction() + ",ds:" + intent.getDataString();
                o.LJIIIIZZ(LIZIZ, "sb.toString()");
            } else if (obj instanceof Collection) {
                LIZIZ = String.valueOf(((Collection) obj).size());
            } else if (obj instanceof Aweme) {
                Aweme aweme = (Aweme) obj;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(aweme.getAid());
                LIZ2.append(',');
                LIZ2.append(aweme.getLogPbString());
                LIZIZ = X1D.LIZIZ(LIZ2);
            } else {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(C16880lQ.LJLLJ(obj.getClass()));
                LIZ3.append(", ");
                LIZ3.append(obj);
                LIZIZ = X1D.LIZIZ(LIZ3);
            }
            LIZJ.append(LIZIZ);
            str2 = X1D.LIZIZ(LIZJ);
        }
        if (this.LIZIZ.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append(this.LIZ);
            LIZ4.append('_');
            LIZ = C0MT.LIZ(LIZ4, this.LIZIZ, '_', str, LIZ4);
        } else {
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ = C0MT.LIZ(LIZ5, this.LIZ, '_', str, LIZ5);
        }
        if (str2.length() > 1024) {
            String substring = str2.substring(0, 1024);
            o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            C36922EeM.LIZLLL(i, LIZ, substring);
            return;
        }
        C36922EeM.LIZLLL(i, LIZ, str2);
    }
}
