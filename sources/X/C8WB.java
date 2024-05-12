package X;

import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.8WB, reason: invalid class name */
/* loaded from: classes4.dex */
public class C8WB implements InterfaceC55235Lm3 {
    public final Object host;
    public final String key;
    public C55252LmK lazyVScopeTree;
    public final C5H3 tree$delegate;

    @Override // X.InterfaceC55235Lm3
    public C55252LmK getTree() {
        return (C55252LmK) this.tree$delegate.getValue();
    }

    @Override // X.InterfaceC55235Lm3
    public Object getHost() {
        return this.host;
    }

    @Override // X.InterfaceC55235Lm3
    public String getKey() {
        return this.key;
    }

    public C8WB(String key, Object obj) {
        o.LJIIIZ(key, "key");
        this.key = key;
        this.host = obj;
        this.tree$delegate = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1610));
    }

    public /* synthetic */ C8WB(String str, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : obj);
    }
}
