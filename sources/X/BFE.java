package X;

import Y.IDCListenerS206S0100000_5;
import android.widget.CompoundButton;
import com.bytedance.android.livesdk.moderator.ModeratorPermissionEditFragmentSheet;
import com.zhiliaoapp.musically.R;
import fjb.a;
import java.util.HashMap;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.moderator.ModeratorPermissionEditFragmentSheet$addPermission$1", f = "ModeratorPermissionEditFragmentSheet.kt", l = {340}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class BFE extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ ModeratorPermissionEditFragmentSheet LJLILLLLZI;
    public final /* synthetic */ CompoundButton LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BFE(ModeratorPermissionEditFragmentSheet moderatorPermissionEditFragmentSheet, CompoundButton compoundButton, InterfaceC67352kd<? super BFE> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = moderatorPermissionEditFragmentSheet;
        this.LJLJI = compoundButton;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new BFE(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            Integer num = (Integer) ((HashMap) this.LJLILLLLZI.LLII).get(this.LJLJI);
            BFC bfc = this.LJLILLLLZI.LLD;
            if (bfc != null) {
                this.LJLIL = 1;
                obj = bfc.LIZ(num, this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            } else {
                o.LJIJI("targetUser");
                throw null;
            }
        }
        Integer num2 = (Integer) obj;
        if (num2 == null || num2.intValue() != 0) {
            this.LJLJI.setOnCheckedChangeListener(null);
            this.LJLJI.setChecked(false);
            this.LJLJI.setOnCheckedChangeListener(new IDCListenerS206S0100000_5(this.LJLILLLLZI, 13));
            if (num2 != null && num2.intValue() == 4002167) {
                C30868C9o.LIZJ(R.string.n29);
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
