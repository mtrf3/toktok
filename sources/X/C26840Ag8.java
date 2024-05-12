package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickStyle;

/* renamed from: X.Ag8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26840Ag8 extends F9E implements InterfaceC27632Asu {
    public final float LJLIL;
    public final boolean LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;
    public final int LJLJJL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Float.valueOf(this.LJLIL), Boolean.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLJI), Integer.valueOf(this.LJLJJI)};
    }

    @Override // X.InterfaceC27632Asu
    public final BrickStyle m() {
        return null;
    }

    @Override // X.InterfaceC27632Asu
    public final int getBrickName() {
        return this.LJLJJL;
    }

    public C26840Ag8(boolean z, int i, float f, int i2) {
        this.LJLIL = f;
        this.LJLILLLLZI = z;
        this.LJLJI = i;
        this.LJLJJI = i2;
        this.LJLJJL = EnumC27721AuL.BLANK.getValue();
    }

    public /* synthetic */ C26840Ag8(float f, boolean z, int i, int i2) {
        this(z, 0, f, (i2 & 8) != 0 ? 0 : i);
    }
}
