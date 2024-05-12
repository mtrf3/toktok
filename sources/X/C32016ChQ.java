package X;

import kotlin.jvm.internal.o;

/* renamed from: X.ChQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32016ChQ extends F9E {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL};
    }

    public C32016ChQ(String str, String linkMicId, String channelId, String str2, String str3) {
        o.LJIIIZ(linkMicId, "linkMicId");
        o.LJIIIZ(channelId, "channelId");
        this.LJLIL = str;
        this.LJLILLLLZI = linkMicId;
        this.LJLJI = channelId;
        this.LJLJJI = str2;
        this.LJLJJL = str3;
    }
}
