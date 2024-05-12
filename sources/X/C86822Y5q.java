package X;

import com.bytedance.pipo.ocr.view.component.IOcrComponent;
import java.util.ServiceLoader;
import kotlin.jvm.internal.o;

/* renamed from: X.Y5q, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86822Y5q extends AbstractC65781Prl implements InterfaceC65784Pro<IOcrComponent> {
    public static final C86822Y5q LJLIL = new C86822Y5q();

    public C86822Y5q() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.bytedance.pipo.ocr.view.component.IOcrComponent, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final IOcrComponent invoke() {
        ServiceLoader load = ServiceLoader.load(IOcrComponent.class);
        o.LJIIIIZZ(load, "ServiceLoader.load(IOcrComponent::class.java)");
        return ORZ.LJLLL(load);
    }
}
