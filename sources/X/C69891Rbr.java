package X;

import com.bytedance.android.livesdk.model.message.ext.PromotionItem;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Rbr, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69891Rbr extends AbstractC65781Prl implements InterfaceC88472Yns<PromotionItem, CharSequence> {
    public static final C69891Rbr LJLIL = new C69891Rbr();

    public C69891Rbr() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(PromotionItem promotionItem) {
        Object obj;
        PromotionItem it = promotionItem;
        o.LJIIIZ(it, "it");
        HashMap<String, Object> LJII = C27739Aud.LJII(it.getLog_extra());
        if (LJII != null) {
            obj = LJII.get("rights_content");
        } else {
            obj = null;
        }
        return String.valueOf(obj);
    }
}
