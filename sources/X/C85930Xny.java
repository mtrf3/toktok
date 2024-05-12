package X;

import Y.ACListenerS35S0100000_15;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushItem;
import kotlin.jvm.internal.o;

/* renamed from: X.Xny, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85930Xny extends AbstractC85929Xnx {
    public final PushItem LJLJJLL;

    @Override // X.C25860ACy
    /* renamed from: LJIIJJI */
    public final C25859ACx LJIIIIZZ() {
        return new C25859ACx(this.LJLJJLL.display.title, LJIILJJIL(), new ACListenerS35S0100000_15(this, 196), null, C85919Xnn.LIZ(this.LJLJJL), null, null, null, false, false, null, this.LJLJJLL.display.description, LJIILL(), false, null, null, null, 8376296);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85930Xny(PushItem pushItem) {
        super(pushItem);
        o.LJIIIZ(pushItem, "pushItem");
        this.LJLJJLL = pushItem;
    }
}
