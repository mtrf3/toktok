package X;

import android.content.Context;
import kotlin.jvm.internal.o;

/* renamed from: X.Zx6, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91592Zx6 extends AbstractC65781Prl implements InterfaceC88472Yns<ARN, C76800UCe> {
    public final /* synthetic */ Context LJLIL;
    public final /* synthetic */ InterfaceC91296ZsK LJLILLLLZI;
    public final /* synthetic */ C91473ZvB LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C91592Zx6(Context context, InterfaceC91296ZsK interfaceC91296ZsK, C91473ZvB c91473ZvB, String str) {
        super(1);
        this.LJLIL = context;
        this.LJLILLLLZI = interfaceC91296ZsK;
        this.LJLJI = c91473ZvB;
        this.LJLJJI = str;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(ARN it) {
        o.LJIIIZ(it, "it");
        C91218Zr4.LJFF(this.LJLIL, this.LJLILLLLZI.LJII(), false, 12);
        C91249ZrZ.LJIILL(C91293ZsH.LIZ(this.LJLJI.LJLIL), this.LJLILLLLZI.getEventData(), "stream_limit", this.LJLJJI, this.LJLILLLLZI.getEventData().LJ, null, 96);
        return C76800UCe.LIZ;
    }
}
