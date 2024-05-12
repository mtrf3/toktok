package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.VDa, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79370VDa implements InterfaceC79371VDb<List<String>> {
    public final /* synthetic */ VDR LIZ;

    public C79370VDa(VDR vdr) {
        this.LIZ = vdr;
    }

    @Override // X.InterfaceC79371VDb
    public final void call(List<String> list) {
        ((ArrayList) this.LIZ.LJII).addAll(list);
    }
}
