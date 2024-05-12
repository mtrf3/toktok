package X;

import com.ss.android.ugc.aweme.global.config.settings.pojo.WhatsAppCodeItem;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.LRd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54257LRd extends AbstractC65781Prl implements InterfaceC65784Pro<List<WhatsAppCodeItem>> {
    public static final C54257LRd LJLIL = new C54257LRd();

    public C54257LRd() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final List<WhatsAppCodeItem> invoke() {
        try {
            List<WhatsAppCodeItem> it = C2YJ.LIZIZ.LIZ.getShowWhatsappByCallingCode();
            o.LJIIIIZZ(it, "it");
            if (!it.isEmpty()) {
                return it;
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
