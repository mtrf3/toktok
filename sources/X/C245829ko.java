package X;

import com.bytedance.assem.arch.core.UIAssem;
import com.ss.android.ugc.aweme.profile.model.BlockStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.9ko, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C245829ko extends AbstractC65781Prl implements InterfaceC88471Ynr<UIAssem, BlockStruct, C76800UCe> {
    public static final C245829ko LJLIL = new C245829ko();

    public C245829ko() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(UIAssem uIAssem, BlockStruct blockStruct) {
        InterfaceC235089Km interfaceC235089Km;
        UIAssem selectSubscribe = uIAssem;
        BlockStruct blockStruct2 = blockStruct;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (blockStruct2 != null && (interfaceC235089Km = (InterfaceC235089Km) C8VC.LJFF(selectSubscribe, C65352Pkq.LIZ(InterfaceC235089Km.class), null)) != null) {
            interfaceC235089Km.M4(blockStruct2.blockStatus);
        }
        return C76800UCe.LIZ;
    }
}
