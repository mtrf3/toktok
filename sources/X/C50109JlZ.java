package X;

import kotlin.jvm.internal.o;

/* renamed from: X.JlZ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50109JlZ extends F9E {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final boolean LJLJJI;

    public C50109JlZ() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, Boolean.valueOf(this.LJLJJI)};
    }

    public /* synthetic */ C50109JlZ(int i) {
        this("unknown", "unknown", "unknown", false);
    }

    public C50109JlZ(@InterfaceC50111Jlb String str, @InterfaceC50111Jlb String str2, @InterfaceC50111Jlb String str3, boolean z) {
        HH1.LIZ(str, "style", str2, "subStyle", str3, "originalStyle");
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
        this.LJLJJI = z;
    }

    public static C50109JlZ L(C50109JlZ c50109JlZ, String style, String subStyle, String originalStyle, boolean z, int i) {
        if ((i & 1) != 0) {
            style = c50109JlZ.LJLIL;
        }
        if ((i & 2) != 0) {
            subStyle = c50109JlZ.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            originalStyle = c50109JlZ.LJLJI;
        }
        if ((i & 8) != 0) {
            z = c50109JlZ.LJLJJI;
        }
        o.LJIIIZ(style, "style");
        o.LJIIIZ(subStyle, "subStyle");
        o.LJIIIZ(originalStyle, "originalStyle");
        return new C50109JlZ(style, subStyle, originalStyle, z);
    }
}
