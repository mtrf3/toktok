package X;

import kotlin.jvm.internal.o;

/* renamed from: X.JnG, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50214JnG extends F9E {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final EnumC50192Jmu LJLJJL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL};
    }

    public C50214JnG(String id, String str, String imageUrl, String thirdPartyUrl, EnumC50192Jmu type) {
        o.LJIIIZ(id, "id");
        o.LJIIIZ(imageUrl, "imageUrl");
        o.LJIIIZ(thirdPartyUrl, "thirdPartyUrl");
        o.LJIIIZ(type, "type");
        this.LJLIL = id;
        this.LJLILLLLZI = str;
        this.LJLJI = imageUrl;
        this.LJLJJI = thirdPartyUrl;
        this.LJLJJL = type;
    }
}
