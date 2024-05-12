package X;

import com.ss.android.ugc.aweme.im.service.model.IMUser;
import kotlin.jvm.internal.o;

/* renamed from: X.9f6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C242289f6 implements C33Q {
    public final C43I<C242419fJ> LJLIL;
    public final C43I<IMUser> LJLILLLLZI;
    public final C43I<IMUser> LJLJI;
    public final C43I<EnumC246719mF> LJLJJI;
    public final C43I<String> LJLJJL;
    public final C43I<Boolean> LJLJJLL;

    public C242289f6() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C242289f6)) {
            return false;
        }
        C242289f6 c242289f6 = (C242289f6) obj;
        return o.LJ(this.LJLIL, c242289f6.LJLIL) && o.LJ(this.LJLILLLLZI, c242289f6.LJLILLLLZI) && o.LJ(this.LJLJI, c242289f6.LJLJI) && o.LJ(this.LJLJJI, c242289f6.LJLJJI) && o.LJ(this.LJLJJL, c242289f6.LJLJJL) && o.LJ(this.LJLJJLL, c242289f6.LJLJJLL);
    }

    public final int hashCode() {
        C43I<C242419fJ> c43i = this.LJLIL;
        int hashCode = (c43i == null ? 0 : c43i.hashCode()) * 31;
        C43I<IMUser> c43i2 = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (c43i2 == null ? 0 : c43i2.hashCode())) * 31;
        C43I<IMUser> c43i3 = this.LJLJI;
        int hashCode3 = (hashCode2 + (c43i3 == null ? 0 : c43i3.hashCode())) * 31;
        C43I<EnumC246719mF> c43i4 = this.LJLJJI;
        int hashCode4 = (hashCode3 + (c43i4 == null ? 0 : c43i4.hashCode())) * 31;
        C43I<String> c43i5 = this.LJLJJL;
        int hashCode5 = (hashCode4 + (c43i5 == null ? 0 : c43i5.hashCode())) * 31;
        C43I<Boolean> c43i6 = this.LJLJJLL;
        return hashCode5 + (c43i6 != null ? c43i6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SelectorState(allFriends=");
        LIZ.append(this.LJLIL);
        LIZ.append(", tagChangedUser=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", blockUser=");
        LIZ.append(this.LJLJI);
        LIZ.append(", event=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", toast=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", endSearchState=");
        return C61845OOz.LIZIZ(LIZ, this.LJLJJLL, ')', LIZ);
    }

    public /* synthetic */ C242289f6(int i) {
        this(null, null, null, null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C242289f6(C43I<C242419fJ> c43i, C43I<? extends IMUser> c43i2, C43I<? extends IMUser> c43i3, C43I<? extends EnumC246719mF> c43i4, C43I<String> c43i5, C43I<Boolean> c43i6) {
        this.LJLIL = c43i;
        this.LJLILLLLZI = c43i2;
        this.LJLJI = c43i3;
        this.LJLJJI = c43i4;
        this.LJLJJL = c43i5;
        this.LJLJJLL = c43i6;
    }

    public static C242289f6 LIZ(C242289f6 c242289f6, C43I c43i, C43I c43i2, C43I c43i3, C43I c43i4, C43I c43i5, C43I c43i6, int i) {
        C43I c43i7 = c43i6;
        C43I c43i8 = c43i5;
        C43I c43i9 = c43i4;
        C43I c43i10 = c43i3;
        C43I c43i11 = c43i;
        C43I c43i12 = c43i2;
        if ((i & 1) != 0) {
            c43i11 = c242289f6.LJLIL;
        }
        if ((i & 2) != 0) {
            c43i12 = c242289f6.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            c43i10 = c242289f6.LJLJI;
        }
        if ((i & 8) != 0) {
            c43i9 = c242289f6.LJLJJI;
        }
        if ((i & 16) != 0) {
            c43i8 = c242289f6.LJLJJL;
        }
        if ((i & 32) != 0) {
            c43i7 = c242289f6.LJLJJLL;
        }
        c242289f6.getClass();
        return new C242289f6(c43i11, c43i12, c43i10, c43i9, c43i8, c43i7);
    }
}
