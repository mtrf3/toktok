package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.Hti, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45518Hti extends AbstractViewOnClickListenerC81978WFi {
    public final /* synthetic */ C45473Hsz LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45518Hti(C45473Hsz c45473Hsz) {
        super(1100, 2);
        this.LJLJJLL = c45473Hsz;
    }

    @Override // X.AbstractViewOnClickListenerC81978WFi
    public final void LIZ(View v) {
        InterfaceC45289Hq1 interfaceC45289Hq1;
        o.LJIIIZ(v, "v");
        C45473Hsz c45473Hsz = this.LJLJJLL;
        if (c45473Hsz.LJJIJL && (interfaceC45289Hq1 = c45473Hsz.LJIJ) != null) {
            interfaceC45289Hq1.LIZ(c45473Hsz.LJJIIJZLJL());
        }
    }
}
