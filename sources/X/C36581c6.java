package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import java.util.Locale;

/* renamed from: X.1c6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36581c6 implements InterfaceC79767VSh {
    public final /* synthetic */ int LIZ;
    public final Object LIZIZ;

    @Override // X.InterfaceC79767VSh
    public final int LIZ() {
        return ((List) this.LIZIZ).size();
    }

    public final boolean LIZIZ() {
        return ((C10H) this.LIZIZ).LIZJ();
    }

    public final String toString() {
        switch (this.LIZ) {
            case 0:
                return C16880lQ.LLLZI(Locale.US, "%s@%s[cancellationRequested=%s]", new Object[]{C36581c6.class.getName(), Integer.toHexString(hashCode()), Boolean.toString(((C10H) this.LIZIZ).LIZJ())});
            default:
                return super.toString();
        }
    }

    @Override // X.InterfaceC79767VSh
    public final Object getItem(int i) {
        if (i >= 0 && i < ((List) this.LIZIZ).size()) {
            return ListProtector.get((List) this.LIZIZ, i);
        }
        return "";
    }

    public /* synthetic */ C36581c6(int i, Object obj) {
        this.LIZ = i;
        this.LIZIZ = obj;
    }
}
