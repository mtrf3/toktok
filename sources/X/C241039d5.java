package X;

import com.ss.android.ugc.aweme.music.assem.list.cell.assem.MineMusicCellAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.9d5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C241039d5 extends AbstractC65781Prl implements InterfaceC88471Ynr<MineMusicCellAssem, Boolean, C76800UCe> {
    public static final C241039d5 LJLIL = new C241039d5();

    public C241039d5() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(MineMusicCellAssem mineMusicCellAssem, Boolean bool) {
        int i;
        MineMusicCellAssem selectSubscribe = mineMusicCellAssem;
        boolean booleanValue = bool.booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        W5G w5g = (W5G) selectSubscribe.getContainerView().findViewById(R.id.f75);
        if (booleanValue) {
            i = R.drawable.bxt;
        } else {
            i = R.drawable.by9;
        }
        w5g.setImageResource(i);
        return C76800UCe.LIZ;
    }
}
