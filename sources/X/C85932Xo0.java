package X;

import Y.ACListenerS35S0100000_15;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushItem;
import defpackage.e1;
import kotlin.jvm.internal.o;

/* renamed from: X.Xo0, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85932Xo0 extends AbstractC85929Xnx {
    public final PushItem LJLJJLL;

    @Override // X.C25860ACy
    /* renamed from: LJIIJJI */
    public final C25859ACx LJIIIIZZ() {
        return new C25859ACx(this.LJLJJLL.display.title, LJIILJJIL(), new ACListenerS35S0100000_15(this, 198), null, e1.LIZ(31744, "mute_push_notification", true, false), null, null, null, false, false, null, this.LJLJJLL.display.description, LJIILL(), false, null, null, null, 8376296);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85932Xo0(PushItem pushItem) {
        super(pushItem);
        o.LJIIIZ(pushItem, "pushItem");
        this.LJLJJLL = pushItem;
    }
}
