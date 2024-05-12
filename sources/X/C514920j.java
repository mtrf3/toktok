package X;

import java.util.HashMap;
import kotlin.jvm.internal.IDqS13S0101000;
import kotlin.jvm.internal.IDqS15S1100000;
import kotlin.jvm.internal.IDqS16S0101000;
import kotlin.jvm.internal.IDqS4S0100100;
import kotlin.jvm.internal.o;

/* renamed from: X.20j, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C514920j extends AbstractC43131mf {
    public final InterfaceC32651Px LIZIZ;
    public HashMap<String, String> LIZJ;

    @Override // X.AbstractC43131mf, X.InterfaceC32651Px
    public final void LIZ(String key) {
        o.LJIIIZ(key, "key");
        super.LIZ(key);
        if (C19460pa.LJ() || C19460pa.LIZLLL()) {
            String LJIIZILJ = LJIIZILJ(key);
            if (this.LIZIZ.contains(LJIIZILJ)) {
                this.LIZIZ.LIZ(LJIIZILJ);
            }
        }
    }

    public final String LJIIZILJ(String str) {
        String str2 = this.LIZJ.get(str);
        if (str2 == null) {
            return str;
        }
        return str2;
    }

    @Override // X.AbstractC43131mf, X.InterfaceC32651Px
    public final boolean contains(String key) {
        o.LJIIIZ(key, "key");
        if (C19460pa.LJ()) {
            String str = this.LIZJ.get(key);
            if (str != null) {
                key = str;
            }
            return this.LIZIZ.contains(key);
        }
        return super.contains(key);
    }

    @Override // X.AbstractC43131mf, X.InterfaceC32651Px
    public final void LIZIZ(String key, String value) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(value, "value");
        LJIJJ(key, new IDqS15S1100000(this, value, 1));
        if (C19460pa.LJ() || C19460pa.LIZLLL()) {
            this.LIZIZ.LIZIZ(LJIIZILJ(key), value);
        }
    }

    @Override // X.AbstractC43131mf, X.InterfaceC32651Px
    public final void LIZJ(String key, long j) {
        o.LJIIIZ(key, "key");
        LJIJJ(key, new IDqS4S0100100(j, this, 4));
        if (C19460pa.LJ() || C19460pa.LIZLLL()) {
            this.LIZIZ.LIZJ(LJIIZILJ(key), j);
        }
    }

    @Override // X.AbstractC43131mf, X.InterfaceC32651Px
    public final void LIZLLL(String key, int i) {
        o.LJIIIZ(key, "key");
        LJIJJ(key, new IDqS13S0101000(i, this, 6));
        if (C19460pa.LJ() || C19460pa.LIZLLL()) {
            this.LIZIZ.LIZLLL(LJIIZILJ(key), i);
        }
    }

    @Override // X.AbstractC43131mf, X.InterfaceC32651Px
    public final void LJ(String key, double d) {
        o.LJIIIZ(key, "key");
        LJIJJ(key, new C514820i(d, this));
        if (C19460pa.LJ() || C19460pa.LIZLLL()) {
            this.LIZIZ.LJ(LJIIZILJ(key), d);
        }
    }

    @Override // X.AbstractC43131mf, X.InterfaceC32651Px
    public final void LJI(String key, boolean z) {
        o.LJIIIZ(key, "key");
        LJIJJ(key, new C514720h(this, z));
        if (C19460pa.LJ() || C19460pa.LIZLLL()) {
            this.LIZIZ.LJI(LJIIZILJ(key), z);
        }
    }

    public final Object LJIJ(String str, InterfaceC88473Ynt interfaceC88473Ynt) {
        Object invoke;
        if (C19460pa.LJ() && C19460pa.LIZLLL()) {
            clear();
            return interfaceC88473Ynt.invoke(LJIIZILJ(str), Boolean.TRUE, Boolean.FALSE);
        }
        if (super.contains(str)) {
            if (!C19460pa.LJ()) {
                String LJIIZILJ = LJIIZILJ(str);
                if (this.LIZIZ.contains(LJIIZILJ)) {
                    this.LIZIZ.LIZ(LJIIZILJ);
                }
            }
            Boolean bool = Boolean.FALSE;
            return interfaceC88473Ynt.invoke(str, bool, bool);
        }
        if (this.LIZJ.containsKey(str)) {
            if (super.contains(str)) {
                Boolean bool2 = Boolean.FALSE;
                return interfaceC88473Ynt.invoke(str, bool2, bool2);
            }
            synchronized (Boolean.TYPE) {
                if (!super.contains(str)) {
                    invoke = interfaceC88473Ynt.invoke(str, Boolean.FALSE, Boolean.TRUE);
                } else {
                    Boolean bool3 = Boolean.FALSE;
                    invoke = interfaceC88473Ynt.invoke(str, bool3, bool3);
                }
            }
            if (C19460pa.LJ()) {
                return invoke;
            }
            String LJIIZILJ2 = LJIIZILJ(str);
            if (!this.LIZIZ.contains(LJIIZILJ2)) {
                return invoke;
            }
            this.LIZIZ.LIZ(LJIIZILJ2);
            return invoke;
        }
        Boolean bool4 = Boolean.FALSE;
        return interfaceC88473Ynt.invoke(str, bool4, bool4);
    }

    public final void LJIJJ(String str, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns) {
        if (super.contains(str) || !this.LIZJ.containsKey(str)) {
            interfaceC88472Yns.invoke(str);
            return;
        }
        synchronized (Boolean.TYPE) {
            interfaceC88472Yns.invoke(str);
        }
    }

    @Override // X.AbstractC43131mf, X.InterfaceC32651Px
    public final boolean getBoolean(String key, boolean z) {
        o.LJIIIZ(key, "key");
        return ((Boolean) LJIJ(key, new C514320d(this, z))).booleanValue();
    }

    @Override // X.AbstractC43131mf, X.InterfaceC32651Px
    public final double getDouble(String key, double d) {
        o.LJIIIZ(key, "key");
        return ((Number) LJIJ(key, new C514420e(d, this))).doubleValue();
    }

    @Override // X.AbstractC43131mf, X.InterfaceC32651Px
    public final int getInt(String key, int i) {
        o.LJIIIZ(key, "key");
        return ((Number) LJIJ(key, new IDqS16S0101000(i, this, 0))).intValue();
    }

    @Override // X.AbstractC43131mf, X.InterfaceC32651Px
    public final long getLong(String key, long j) {
        o.LJIIIZ(key, "key");
        return ((Number) LJIJ(key, new C514520f(j, this))).longValue();
    }

    @Override // X.AbstractC43131mf, X.InterfaceC32651Px
    public final String getString(String key, String str) {
        o.LJIIIZ(key, "key");
        return (String) LJIJ(key, new C514620g(this, str));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C514920j(InterfaceC32651Px sourceRepo, InterfaceC32651Px targetRepo, HashMap<String, String> migrationKey) {
        super(targetRepo);
        o.LJIIIZ(sourceRepo, "sourceRepo");
        o.LJIIIZ(targetRepo, "targetRepo");
        o.LJIIIZ(migrationKey, "migrationKey");
        this.LIZIZ = sourceRepo;
        this.LIZJ = migrationKey;
    }

    public static final /* synthetic */ void LJIIL(C514920j c514920j, String str, boolean z) {
        super.LJI(str, z);
    }

    public static final /* synthetic */ void LJIILIIL(C514920j c514920j, String str, double d) {
        super.LJ(str, d);
    }

    public static final /* synthetic */ void LJIILJJIL(C514920j c514920j, String str, int i) {
        super.LIZLLL(str, i);
    }

    public static final /* synthetic */ void LJIILL(C514920j c514920j, String str, long j) {
        super.LIZJ(str, j);
    }

    public static final /* synthetic */ void LJIILLIIL(C514920j c514920j, String str, String str2) {
        super.LIZIZ(str, str2);
    }

    public final <T> void LJIJI(String str, T t, InterfaceC88471Ynr<? super String, ? super T, C76800UCe> interfaceC88471Ynr) {
        if (!super.contains(str)) {
            interfaceC88471Ynr.invoke(str, t);
        }
    }
}
