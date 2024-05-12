package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveCapsuleMsgMaxDisplayNameLenSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveAudienceImageCacheRefactorSetting;
import com.bytedance.android.livesdk.model.message.CapsuleMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.BnW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29846BnW extends CQO<CapsuleMessage> implements InterfaceC29964BpQ {
    public static final int LJJII = LiveCapsuleMsgMaxDisplayNameLenSetting.INSTANCE.getMaxDisplayNameLen();
    public final Integer LJIL;
    public final InterfaceC65784Pro<C76800UCe> LJJ;
    public boolean LJJI;
    public COL LJJIFFI;

    @Override // X.InterfaceC31078CHq, X.CXK
    public final User getUser() {
        return null;
    }

    @Override // X.InterfaceC29964BpQ
    public final CharSequence LJFF() {
        return BXZ.LIZ(((CapsuleMessage) this.LJIJJLI).buttonText, this);
    }

    @Override // X.CQL, X.InterfaceC29967BpT
    public final int LJJJ() {
        Integer num = this.LJIL;
        if (num != null) {
            return num.intValue();
        }
        return R.drawable.d2a;
    }

    @Override // X.InterfaceC29964BpQ
    public final C29847BnX LJJJJJL() {
        return new C29847BnX(this);
    }

    @Override // X.CQL, X.InterfaceC29967BpT
    public final ImageModel LJJLJ() {
        return ((CapsuleMessage) this.LJIJJLI).icon;
    }

    @Override // X.CQO, X.CQL
    public final Text LJLI() {
        return ((CapsuleMessage) this.LJIJJLI).desc;
    }

    @Override // X.CQL
    public final void LJLLJ() {
        List<InterfaceC29848BnY> hr0 = ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).hr0(((CapsuleMessage) this.LJIJJLI).capsuleType);
        if (hr0 != null) {
            for (InterfaceC29848BnY interfaceC29848BnY : hr0) {
                if (interfaceC29848BnY != null) {
                    interfaceC29848BnY.LIZ(this);
                }
            }
        }
    }

    @Override // X.CQO, X.CQL
    public final boolean LL() {
        if (((CapsuleMessage) this.LJIJJLI).desc != null) {
            return true;
        }
        return false;
    }

    @Override // X.CQL, X.InterfaceC31368CSu
    public final void onAttach() {
        super.onAttach();
        List<InterfaceC29848BnY> hr0 = ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).hr0(((CapsuleMessage) this.LJIJJLI).capsuleType);
        if (!this.LJJI) {
            this.LJJI = true;
            if (hr0 != null) {
                for (InterfaceC29848BnY interfaceC29848BnY : hr0) {
                    if (interfaceC29848BnY != null) {
                        interfaceC29848BnY.LJ(this);
                    }
                }
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (hr0 != null) {
            for (InterfaceC29848BnY interfaceC29848BnY2 : hr0) {
                if (interfaceC29848BnY2 != null) {
                    interfaceC29848BnY2.LIZLLL(this);
                    interfaceC29848BnY2.LIZIZ(this, linkedHashMap);
                }
            }
        }
        MESSAGE message = this.LJIJJLI;
        LJLIIL();
        C29827BnD.LIZJ(message);
        BZI LIZ = C28787BRn.LIZ("livesdk_live_capsule_show");
        LIZ.LJIILLIIL(LJLIIL().LJIIIIZZ);
        LIZ.LJIJJ(LLD(), "admin_type");
        LIZ.LJIJJ(Long.valueOf(this.LJIJJLI.getMessageId()), "msg_id");
        LIZ.LJIJJ(((CapsuleMessage) this.LJIJJLI).scene, "msg_name");
        LIZ.LJIJJ(Integer.valueOf(((CapsuleMessage) this.LJIJJLI).capsuleType), "msg_type");
        LIZ.LJJIFFI(linkedHashMap);
        LIZ.LJJIIJZLJL();
    }

    @Override // X.CQL, X.CXK
    public final int LJJJJIZL() {
        return LJJII;
    }

    @Override // X.CQL, X.InterfaceC31341CRt
    public final void LJIILLIIL(CQQ publicScreenContext) {
        o.LJIIIZ(publicScreenContext, "publicScreenContext");
        super.LJIILLIIL(publicScreenContext);
        ImageModel LJJLJ = LJJLJ();
        if (LJJLJ != null) {
            if (LiveAudienceImageCacheRefactorSetting.INSTANCE.getValue()) {
                int dimensionPixelSize = publicScreenContext.LIZ.getResources().getDimensionPixelSize(R.dimen.acu);
                C78720Uuy LIZ = C15650jR.LIZ().LIZ(LJJLJ.getUrls());
                LIZ.LJI = dimensionPixelSize;
                LIZ.LJII = dimensionPixelSize;
                LIZ.LJIJI = Boolean.TRUE;
                LIZ.LJIILLIIL();
                return;
            }
            C15620jO.LJFF(LJJLJ);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29846BnW(CapsuleMessage message, Integer num, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(message);
        o.LJIIIZ(message, "message");
        this.LJIL = num;
        this.LJJ = interfaceC65784Pro;
    }
}
