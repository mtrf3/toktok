package X;

import java.util.LinkedHashSet;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.2xi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C75462xi extends AbstractC65781Prl implements InterfaceC65784Pro<CopyOnWriteArraySet<C4ZB>> {
    public static final C75462xi LJLIL = new C75462xi();

    public C75462xi() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final CopyOnWriteArraySet<C4ZB> invoke() {
        return new CopyOnWriteArraySet<>(new LinkedHashSet());
    }
}
