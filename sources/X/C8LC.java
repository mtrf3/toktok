package X;

import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.landscape.cell.assem.seekbar.LandscapeCellSeekBarAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.8LC, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8LC extends AbstractC65781Prl implements InterfaceC88471Ynr<LandscapeCellSeekBarAssem, Float, C76800UCe> {
    public static final C8LC LJLIL = new C8LC();

    public C8LC() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(LandscapeCellSeekBarAssem landscapeCellSeekBarAssem, Float f) {
        LandscapeCellSeekBarAssem selectSubscribe = landscapeCellSeekBarAssem;
        float floatValue = f.floatValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        TuxTextView tuxTextView = selectSubscribe.LLD;
        if (tuxTextView != null) {
            tuxTextView.setText(C125314vv.LIZ(floatValue));
            return C76800UCe.LIZ;
        }
        o.LJIJI("playSpeedTv");
        throw null;
    }
}
