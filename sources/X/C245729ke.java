package X;

import com.bytedance.assem.arch.core.UIAssem;
import com.ss.android.ugc.aweme.profile.model.BlockStruct;
import com.ss.android.ugc.aweme.profile.ui.v2.UserProfileAbility;
import kotlin.jvm.internal.o;

/* renamed from: X.9ke, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C245729ke extends AbstractC65781Prl implements InterfaceC88471Ynr<UIAssem, BlockStruct, C76800UCe> {
    public static final C245729ke LJLIL = new C245729ke();

    public C245729ke() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(UIAssem uIAssem, BlockStruct blockStruct) {
        UserProfileAbility userProfileAbility;
        UIAssem selectSubscribe = uIAssem;
        BlockStruct blockStruct2 = blockStruct;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (blockStruct2 != null && (userProfileAbility = (UserProfileAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(selectSubscribe), UserProfileAbility.class, null)) != null) {
            userProfileAbility.M4(blockStruct2.blockStatus);
        }
        return C76800UCe.LIZ;
    }
}
