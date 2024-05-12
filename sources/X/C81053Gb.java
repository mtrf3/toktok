package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3Gb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C81053Gb extends F9E {
    public final /* synthetic */ int LJLIL = 0;
    public final Comparable LJLILLLLZI;
    public final Comparable LJLJI;
    public final Enum LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        switch (this.LJLIL) {
            case 0:
                return new Object[]{this.LJLILLLLZI, this.LJLJI, this.LJLJJI};
            default:
                return new Object[]{this.LJLILLLLZI, this.LJLJI, this.LJLJJI};
        }
    }

    public C81053Gb(android.net.Uri originSchema, android.net.Uri uniqueSchema, EnumC53636L3g cacheType) {
        o.LJIIJ(originSchema, "originSchema");
        o.LJIIJ(uniqueSchema, "uniqueSchema");
        o.LJIIJ(cacheType, "cacheType");
        this.LJLILLLLZI = originSchema;
        this.LJLJI = uniqueSchema;
        this.LJLJJI = cacheType;
    }

    public C81053Gb(String conversationId, String str, EnumC62302cU type) {
        o.LJIIIZ(conversationId, "conversationId");
        o.LJIIIZ(type, "type");
        this.LJLILLLLZI = conversationId;
        this.LJLJI = str;
        this.LJLJJI = type;
    }
}
