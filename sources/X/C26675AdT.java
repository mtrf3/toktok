package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRight;

/* renamed from: X.AdT, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26675AdT extends F9E implements InterfaceC26837Ag5 {
    public final UserRight LJLIL;

    @Override // X.InterfaceC26837Ag5
    public final String LJJLIL() {
        return "user_rights";
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL};
    }

    public C26675AdT(UserRight userRight) {
        this.LJLIL = userRight;
    }
}
