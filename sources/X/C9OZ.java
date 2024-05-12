package X;

import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.9OZ, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9OZ extends F9E implements C33Q {
    public final C236019Ob LJLIL;
    public final C236029Oc LJLILLLLZI;

    public C9OZ() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    public /* synthetic */ C9OZ(int i) {
        this(new C236019Ob(System.currentTimeMillis(), new ArrayList()), new C236029Oc(System.currentTimeMillis(), EnumC245179jl.TYPE_INIT));
    }

    public C9OZ(C236019Ob c236019Ob, C236029Oc loginModel) {
        o.LJIIIZ(loginModel, "loginModel");
        this.LJLIL = c236019Ob;
        this.LJLILLLLZI = loginModel;
    }
}
