package X;

import com.bytedance.ies.abmock.ClientExpManager;

/* renamed from: X.FNf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38867FNf extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C38867FNf LJLIL = new C38867FNf();

    public C38867FNf() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i;
        try {
            i = FFL.LJIIIZ().LJIIJJI(ClientExpManager.new_user_feed_total_aggre(), "new_user_feed_total_aggre");
        } catch (Exception unused) {
            i = 0;
        }
        return Integer.valueOf(i);
    }
}
