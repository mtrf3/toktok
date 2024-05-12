package X;

import com.bytedance.tux.input.TuxTextView;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AKG extends AbstractC65781Prl implements InterfaceC88471Ynr<TuxTextView, TuxTextView, Integer> {
    public static final AKG LJLIL = new AKG();

    public AKG() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final Integer invoke(TuxTextView tuxTextView, TuxTextView tuxTextView2) {
        int i;
        TuxTextView titleTV = tuxTextView;
        TuxTextView messageTV = tuxTextView2;
        o.LJIIIZ(titleTV, "titleTV");
        o.LJIIIZ(messageTV, "messageTV");
        if (messageTV.getLineCount() + titleTV.getLineCount() <= 1) {
            i = 15;
        } else {
            i = 10;
        }
        return Integer.valueOf(i);
    }
}
