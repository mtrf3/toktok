package X;

import com.bytedance.assem.arch.core.UIAssem;
import com.ss.android.ugc.aweme.music.model.TT2DSPSongInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.aj1, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94563aj1 extends AbstractC65781Prl implements InterfaceC88471Ynr<UIAssem, C43I<? extends TT2DSPSongInfo>, C76800UCe> {
    public static final C94563aj1 LJLIL = new C94563aj1();

    public C94563aj1() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(UIAssem uIAssem, C43I<? extends TT2DSPSongInfo> c43i) {
        UIAssem selectSubscribe = uIAssem;
        C43I<? extends TT2DSPSongInfo> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null) {
            ((InterfaceC94505ai5) C8VC.LIZ(selectSubscribe, C65352Pkq.LIZ(InterfaceC94505ai5.class), null)).N4((TT2DSPSongInfo) c43i2.LIZ);
        }
        return C76800UCe.LIZ;
    }
}
