package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.business.broadcaster.duringlive.slot.ECDuringLiveBroadcasterWidget$onSlotCreated$1", f = "ECDuringLiveBroadcasterWidget.kt", l = {234}, m = "invokeSuspend")
/* renamed from: X.RwO, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71164RwO extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ C71219RxH LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71164RwO(C71219RxH c71219RxH, InterfaceC67352kd<? super C71164RwO> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c71219RxH;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C71164RwO(this.LJLJI, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        MutableLiveData<Boolean> mutableLiveData;
        String roomId;
        MutableLiveData<Boolean> mutableLiveData2;
        boolean z;
        Boolean bool;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
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
            Room room = this.LJLJI.LJZ;
            if (room != null) {
                str = room.getIdStr();
            } else {
                str = null;
            }
            IIconSlot.SlotViewModel slotViewModel = this.LJLJI.LJLJJLL;
            if (slotViewModel != null && (mutableLiveData = slotViewModel.LJZL) != null) {
                mutableLiveData.setValue(Boolean.FALSE);
            }
            if (str != null) {
                this.LJLIL = str;
                this.LJLILLLLZI = 1;
                Object LIZ = C71020Ru4.LIZ(str, null, this);
                roomId = str;
                if (LIZ == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            return C76800UCe.LIZ;
        }
        IIconSlot.SlotViewModel slotViewModel2 = this.LJLJI.LJLJJLL;
        if (slotViewModel2 != null && (mutableLiveData2 = slotViewModel2.LJZL) != null) {
            o.LJIIIZ(roomId, "roomId");
            C71022Ru6 c71022Ru6 = C71023Ru7.LIZ.get(roomId);
            if (c71022Ru6 != null && (bool = c71022Ru6.LIZ) != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            mutableLiveData2.setValue(Boolean.valueOf(z));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
