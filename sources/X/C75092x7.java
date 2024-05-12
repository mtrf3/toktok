package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommercelive.business.audience.api.data.BagData;
import com.ss.android.ugc.aweme.ecommercelive.business.audience.api.data.PreviewData;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommercelive.business.audience.slot.ECAudienceWidget$updateBagOnUnbannedMessage$1$1", f = "ECAudienceWidget.kt", l = {1267}, m = "invokeSuspend")
/* renamed from: X.2x7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C75092x7 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C71188Rwm LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C75092x7(C71188Rwm c71188Rwm, InterfaceC67352kd<? super C75092x7> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c71188Rwm;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C75092x7(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Long l;
        Long l2;
        BagData bagData;
        int i;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i2 = this.LJLIL;
        PreviewData previewData = null;
        if (i2 != 0) {
            if (i2 == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            Room room = this.LJLILLLLZI.LJLJLLL;
            if (room != null) {
                l = new Long(room.getId());
            } else {
                l = null;
            }
            String valueOf = String.valueOf(l);
            Room room2 = this.LJLILLLLZI.LJLJLLL;
            if (room2 != null) {
                l2 = new Long(room2.getOwnerUserId());
            } else {
                l2 = null;
            }
            String valueOf2 = String.valueOf(l2);
            this.LJLIL = 1;
            obj = C72852tV.LIZ.LIZ(valueOf, valueOf2, false, true, false, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        String str = (String) obj;
        if (str.length() > 0) {
            try {
                Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), str, C65330PkU.LIZJ(C65352Pkq.LJI(PreviewData.class)));
                if (!(fromJson instanceof PreviewData)) {
                    fromJson = null;
                }
                previewData = (PreviewData) fromJson;
            } catch (s unused) {
            }
            if (previewData != null && (bagData = previewData.bagData) != null) {
                i = bagData.total;
                C71188Rwm c71188Rwm = this.LJLILLLLZI;
                c71188Rwm.LLJILLL = i;
                c71188Rwm.LLJJ = 0;
                C71150RwA.LIZ = i;
                c71188Rwm.LJJIIJZLJL(false);
                this.LJLILLLLZI.LJIILLIIL(i);
                return C76800UCe.LIZ;
            }
        }
        i = 0;
        C71188Rwm c71188Rwm2 = this.LJLILLLLZI;
        c71188Rwm2.LLJILLL = i;
        c71188Rwm2.LLJJ = 0;
        C71150RwA.LIZ = i;
        c71188Rwm2.LJJIIJZLJL(false);
        this.LJLILLLLZI.LJIILLIIL(i);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
