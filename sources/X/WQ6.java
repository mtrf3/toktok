package X;

import android.widget.SeekBar;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WQ6 extends AbstractC65781Prl implements InterfaceC88472Yns<SeekBar, WQ7> {
    public static final WQ6 LJLIL = new WQ6();

    public WQ6() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final WQ7 invoke(SeekBar seekBar) {
        SeekBar it = seekBar;
        o.LJIIIZ(it, "it");
        return new WQ7(it);
    }
}
