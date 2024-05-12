package X;

import com.ss.android.ugc.aweme.ecommerce.base.common.model.Video;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickStyle;

/* renamed from: X.AsN, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27599AsN extends F9E implements InterfaceC27624Asm {
    public final Video LJLIL;
    public final boolean LJLILLLLZI;
    public final int LJLJI = EnumC27721AuL.DESCRIPTION.getValue();

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Boolean.valueOf(this.LJLILLLLZI)};
    }

    @Override // X.InterfaceC27624Asm
    public final String getStyle() {
        return "video";
    }

    @Override // X.InterfaceC27632Asu
    public final BrickStyle m() {
        return null;
    }

    @Override // X.InterfaceC27632Asu
    public final int getBrickName() {
        return this.LJLJI;
    }

    public C27599AsN(Video video, boolean z) {
        this.LJLIL = video;
        this.LJLILLLLZI = z;
    }
}
