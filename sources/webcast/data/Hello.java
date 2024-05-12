package webcast.data;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes10.dex */
public final class Hello extends F9E {

    @InterfaceC65349Pkn("content")
    public String content;

    @InterfaceC65349Pkn("id")
    public Long id;

    @Override // X.F9E
    public final Object[] getObjects() {
        String str = this.content;
        Long l = this.id;
        return new Object[]{str, str, l, l};
    }
}
