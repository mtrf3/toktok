package X;

import com.ss.android.ugc.aweme.captionsheet.CaptionsPanelFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.ABo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25824ABo extends AbstractC65781Prl implements InterfaceC88472Yns<C25846ACk, C25846ACk> {
    public final /* synthetic */ C25825ABp LJLIL;
    public final /* synthetic */ CaptionsPanelFragment LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ boolean LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25824ABo(C25825ABp c25825ABp, CaptionsPanelFragment captionsPanelFragment, boolean z, boolean z2) {
        super(1);
        this.LJLIL = c25825ABp;
        this.LJLILLLLZI = captionsPanelFragment;
        this.LJLJI = z;
        this.LJLJJI = z2;
    }

    @Override // X.InterfaceC88472Yns
    public final C25846ACk invoke(C25846ACk c25846ACk) {
        C25846ACk it = c25846ACk;
        o.LJIIIZ(it, "it");
        return C25846ACk.LJIILJJIL(it, false, new ViewOnClickListenerC25823ABn(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI), false, false, null, null, false, false, 131067);
    }
}
