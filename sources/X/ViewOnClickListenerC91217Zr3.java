package X;

import android.content.Context;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.Zr3, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class ViewOnClickListenerC91217Zr3 implements View.OnClickListener {
    public final /* synthetic */ View LJLIL;
    public final /* synthetic */ Context LJLILLLLZI;
    public final /* synthetic */ InterfaceC91296ZsK LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;

    public ViewOnClickListenerC91217Zr3(View view, ActivityC45651qj activityC45651qj, InterfaceC91296ZsK interfaceC91296ZsK, String str, String str2) {
        this.LJLIL = view;
        this.LJLILLLLZI = activityC45651qj;
        this.LJLJI = interfaceC91296ZsK;
        this.LJLJJI = str;
        this.LJLJJL = str2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View contentView = this.LJLIL;
        o.LJIIIIZZ(contentView, "contentView");
        ASQ.LIZLLL(contentView, ASY.LIZ);
        C91218Zr4.LJFF(this.LJLILLLLZI, this.LJLJI.LJII(), false, 12);
        C91249ZrZ.LJIILL(C91293ZsH.LIZ(this.LJLJJI), this.LJLJI.getEventData(), "background_play", this.LJLJJL, this.LJLJI.getEventData().LJ, null, 96);
    }
}
