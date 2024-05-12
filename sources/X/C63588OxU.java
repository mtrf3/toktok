package X;

import com.bytedance.im.core.proto.Request;
import kotlin.jvm.internal.o;

/* renamed from: X.OxU, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63588OxU extends QXX {
    public final Request LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public long LJLJJLL;
    public boolean LJLJL;
    public final boolean LJLJLJ;
    public boolean LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63588OxU(Request request, int i) {
        super((Object) null);
        int i2;
        int i3;
        boolean z;
        if ((i & 2) != 0) {
            i2 = C63308Osy.LJI().LIZLLL().LJIIL;
        } else {
            i2 = 0;
        }
        if ((i & 4) != 0) {
            i3 = C63308Osy.LJI().LIZLLL().LJIILJJIL;
        } else {
            i3 = 0;
        }
        if ((i & 256) != 0) {
            z = true;
        } else {
            z = false;
        }
        o.LJIIIZ(request, "request");
        this.LJLIL = request;
        this.LJLILLLLZI = i2;
        this.LJLJI = i3;
        this.LJLJJI = 0;
        this.LJLJJL = 0;
        this.LJLJJLL = 0L;
        this.LJLJL = false;
        this.LJLJLJ = false;
        this.LJLJLLL = z;
    }
}
