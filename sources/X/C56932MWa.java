package X;

import android.view.View;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* renamed from: X.MWa, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56932MWa extends AnonymousClass896 {
    public final User LJLJJI;
    public final int LJLJJL;
    public final InterfaceC56934MWc LJLJJLL;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View widget) {
        o.LJIIIZ(widget, "widget");
        this.LJLJJLL.LIZ(widget, this.LJLJJI, this.LJLJJL);
    }

    public C56932MWa(User user, int i, int i2, int i3, InterfaceC56934MWc interfaceC56934MWc) {
        super(i2, i3);
        this.LJLJJI = user;
        this.LJLJJL = i;
        this.LJLJJLL = interfaceC56934MWc;
    }
}
