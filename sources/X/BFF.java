package X;

import Y.IDCListenerS206S0100000_5;
import android.widget.CompoundButton;
import com.bytedance.android.livesdk.moderator.ModeratorPermissionEditFragment;
import com.zhiliaoapp.musically.R;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.moderator.ModeratorPermissionEditFragment$addPermission$1", f = "ModeratorPermissionEditFragment.kt", l = {341}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class BFF extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ ModeratorPermissionEditFragment LJLILLLLZI;
    public final /* synthetic */ Integer LJLJI;
    public final /* synthetic */ CompoundButton LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BFF(ModeratorPermissionEditFragment moderatorPermissionEditFragment, Integer num, CompoundButton compoundButton, InterfaceC67352kd<? super BFF> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = moderatorPermissionEditFragment;
        this.LJLJI = num;
        this.LJLJJI = compoundButton;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new BFF(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
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
            BFC bfc = this.LJLILLLLZI.LJLIL;
            if (bfc != null) {
                Integer num = this.LJLJI;
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
            this.LJLJJI.setOnCheckedChangeListener(null);
            this.LJLJJI.setChecked(false);
            this.LJLJJI.setOnCheckedChangeListener(new IDCListenerS206S0100000_5(this.LJLILLLLZI, 12));
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
