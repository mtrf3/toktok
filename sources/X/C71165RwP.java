package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommercelive.business.audience.slot.ECAudienceWidget$checkAudiencePermission$1", f = "ECAudienceWidget.kt", l = {2238}, m = "invokeSuspend")
/* renamed from: X.RwP, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71165RwP extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ C71188Rwm LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71165RwP(C71188Rwm c71188Rwm, InterfaceC67352kd<? super C71165RwP> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c71188Rwm;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C71165RwP(this.LJLJI, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String roomId;
        MutableLiveData<Boolean> mutableLiveData;
        boolean z;
        Boolean bool;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        String str2 = null;
        if (i != 0) {
            if (i == 1) {
                Object obj2 = this.LJLIL;
                C141335gf.LIZJ(obj);
                roomId = obj2;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            Room room = this.LJLJI.LJLJLLL;
            if (room != null) {
                str = room.getIdStr();
            } else {
                str = null;
            }
            Room room2 = this.LJLJI.LJLJLLL;
            if (room2 != null) {
                str2 = new Long(room2.getOwnerUserId()).toString();
            }
            if (str != null && str2 != null) {
                this.LJLIL = str;
                this.LJLILLLLZI = 1;
                Object LIZ = C71020Ru4.LIZ(str, str2, this);
                roomId = str;
                if (LIZ == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            return C76800UCe.LIZ;
        }
        IIconSlot.SlotViewModel slotViewModel = this.LJLJI.LJLJL;
        if (slotViewModel != null && (mutableLiveData = slotViewModel.LJZL) != null) {
            o.LJIIIZ(roomId, "roomId");
            C71022Ru6 c71022Ru6 = C71023Ru7.LIZ.get(roomId);
            if (c71022Ru6 != null && (bool = c71022Ru6.LIZ) != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            mutableLiveData.setValue(Boolean.valueOf(z));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
