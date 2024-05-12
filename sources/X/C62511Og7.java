package X;

import com.ss.android.ugc.aweme.share.base.model.ShareContentType;
import kotlin.jvm.internal.o;

/* renamed from: X.Og7, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62511Og7 extends F9E {
    public final ShareContentType LJLIL;
    public final boolean LJLILLLLZI;
    public final boolean LJLJI;
    public final InterfaceC62526OgM LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Boolean.valueOf(this.LJLILLLLZI), Boolean.valueOf(this.LJLJI), this.LJLJJI};
    }

    public C62511Og7(ShareContentType shareContentType, boolean z, boolean z2, InterfaceC62526OgM interfaceC62526OgM) {
        o.LJIIIZ(shareContentType, "shareContentType");
        this.LJLIL = shareContentType;
        this.LJLILLLLZI = z;
        this.LJLJI = z2;
        this.LJLJJI = interfaceC62526OgM;
    }
}
