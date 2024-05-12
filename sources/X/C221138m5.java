package X;

import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.8m5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C221138m5<T> implements C5H3<T> {
    public final EnumC221088m0 LJLIL;
    public final InterfaceC65784Pro<T> LJLILLLLZI;
    public final InterfaceC65784Pro<Boolean> LJLJI;
    public final C5H3<T> LJLJJI;
    public Object LJLJJL;
    public final C221138m5<T> LJLJJLL;
    public boolean LJLJL;

    @Override // X.C5H3
    public final T getValue() {
        T t = (T) this.LJLJJL;
        if (t != null || this.LJLJL) {
            return t;
        }
        InterfaceC65784Pro<Boolean> interfaceC65784Pro = this.LJLJI;
        if (interfaceC65784Pro != null && interfaceC65784Pro.invoke().booleanValue()) {
            this.LJLJL = true;
            return (T) this.LJLJJL;
        }
        T value = this.LJLJJI.getValue();
        this.LJLJJL = value;
        if (this.LJLIL != EnumC221088m0.SYNCHRONIZED) {
            if (value == null) {
                this.LJLJJL = this.LJLILLLLZI.invoke();
            }
        } else {
            synchronized (this.LJLJJLL) {
                if (this.LJLJJL == null) {
                    this.LJLJJL = this.LJLILLLLZI.invoke();
                }
            }
        }
        return (T) this.LJLJJL;
    }

    @Override // X.C5H3
    public final boolean isInitialized() {
        return this.LJLJJI.isInitialized();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C221138m5(EnumC221088m0 mode, InterfaceC65784Pro<? extends T> initializer, InterfaceC65784Pro<Boolean> interfaceC65784Pro) {
        o.LJIIIZ(mode, "mode");
        o.LJIIIZ(initializer, "initializer");
        this.LJLIL = mode;
        this.LJLILLLLZI = initializer;
        this.LJLJI = interfaceC65784Pro;
        this.LJLJJI = C221108m2.LIZ(mode, new AqS153S0100000_3(this, 1694));
        this.LJLJJLL = this;
    }
}
