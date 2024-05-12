package X;

import android.view.View;
import com.bytedance.effectcreatormobile.behaviour.view.card.extra.ICardObjectOffset;
import com.bytedance.news.common.service.manager.IService;
import kotlin.jvm.internal.o;

/* renamed from: X.adj, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94235adj implements InterfaceC93688aUu {
    public final /* synthetic */ C94218adS LIZ;

    public C94235adj(C94218adS c94218adS) {
        this.LIZ = c94218adS;
    }

    @Override // X.InterfaceC93688aUu
    public final void LIZ(View v, int i) {
        IService iService;
        o.LJIIIZ(v, "v");
        C93970aZS LIZ = C93971aZT.LIZ();
        if (LIZ != null) {
            iService = (IService) LIZ.LIZ(ICardObjectOffset.class);
        } else {
            iService = null;
        }
        ICardObjectOffset iCardObjectOffset = (ICardObjectOffset) iService;
        if (iCardObjectOffset != null) {
            iCardObjectOffset.updateScrollOffset(this.LIZ.LJLJL, i);
        }
    }
}
