package X;

import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.landscape.cell.assem.top.TopAreaContainerAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.8Kt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C209678Kt extends AbstractC65781Prl implements InterfaceC88471Ynr<TopAreaContainerAssem, Float, C76800UCe> {
    public static final C209678Kt LJLIL = new C209678Kt();

    public C209678Kt() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(TopAreaContainerAssem topAreaContainerAssem, Float f) {
        TopAreaContainerAssem selectSubscribe = topAreaContainerAssem;
        float floatValue = f.floatValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        TuxTextView tuxTextView = selectSubscribe.LLF;
        if (tuxTextView != null) {
            tuxTextView.setText(C125314vv.LIZ(floatValue));
            return C76800UCe.LIZ;
        }
        o.LJIJI("speedButton");
        throw null;
    }
}
