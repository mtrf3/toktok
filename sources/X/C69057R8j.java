package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.R8j, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C69057R8j extends AbstractC69088R9o {
    public final int LIZJ;
    public final String LIZLLL;

    @Override // X.AbstractC69088R9o
    public final boolean LIZ() {
        if (this.LIZIZ.isViewValid()) {
            InterfaceC69056R8i interfaceC69056R8i = this.LIZIZ;
            int i = this.LIZJ;
            interfaceC69056R8i.Sg(i, R4R.LIZ(Integer.valueOf(i), this.LIZLLL));
            return true;
        }
        return true;
    }

    public C69057R8j(Fragment fragment, InterfaceC69056R8i interfaceC69056R8i, int i, String str) {
        super(fragment, interfaceC69056R8i);
        this.LIZJ = i;
        this.LIZLLL = str;
    }
}
