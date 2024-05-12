package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.publicscreen.api.GiftHistoryManagerChannel;
import com.bytedance.android.livesdk.dataChannel.LiveExtendedScreenStatus;
import com.bytedance.android.livesdk.dataChannel.LiveExtendedScreenType;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CR2 extends C31319CQx<CS0> {
    public final C31326CRe LLJZ = new C31326CRe(this);

    @Override // X.C31319CQx
    public final int LJJLIIIJILLIZJL() {
        return Integer.MAX_VALUE;
    }

    @Override // X.C31319CQx
    public final void LJJLIIIJJIZ() {
    }

    @Override // X.C31319CQx
    public final void LJJJJI() {
        DataChannel dataChannel;
        InterfaceC31286CPq interfaceC31286CPq;
        CQQ cqq = this.LLIILZL;
        if (cqq != null && (dataChannel = cqq.LJIIIIZZ) != null && (interfaceC31286CPq = (InterfaceC31286CPq) dataChannel.kv0(GiftHistoryManagerChannel.class)) != null) {
            interfaceC31286CPq.LJ(this.LLJZ);
        }
    }

    @Override // X.C31319CQx, X.AbstractC31497CXt, X.BY9
    public final void detachView() {
        DataChannel dataChannel;
        InterfaceC31286CPq interfaceC31286CPq;
        super.detachView();
        CQQ cqq = this.LLIILZL;
        if (cqq != null && (dataChannel = cqq.LJIIIIZZ) != null && (interfaceC31286CPq = (InterfaceC31286CPq) dataChannel.kv0(GiftHistoryManagerChannel.class)) != null) {
            interfaceC31286CPq.LIZJ(this.LLJZ);
        }
    }

    @Override // X.C31319CQx
    public final CRY LJL() {
        return CRY.ExtendedGift;
    }

    @Override // X.C31319CQx, X.AbstractC31497CXt
    /* renamed from: LJLLLL, reason: merged with bridge method [inline-methods] */
    public final void attachView(CS0 iView) {
        InterfaceC31286CPq interfaceC31286CPq;
        o.LJIIIZ(iView, "iView");
        DataChannel provideDataChannel = iView.provideDataChannel();
        this.dataChannel = provideDataChannel;
        if (provideDataChannel != null && (interfaceC31286CPq = (InterfaceC31286CPq) provideDataChannel.kv0(GiftHistoryManagerChannel.class)) != null) {
            List<GiftMessage> LIZ = interfaceC31286CPq.LIZ();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("manager size =");
            LIZ2.append(LIZ.size());
            C0NB.LJIIIZ("ExtendedPublicScreenGiftPresenter", X1D.LIZIZ(LIZ2));
            Iterator<GiftMessage> it = LIZ.iterator();
            while (it.hasNext()) {
                CQO<? extends CR6> LJ = CPR.LJ(it.next());
                if (LJ != null) {
                    this.LJZI.LIZ(LJ);
                }
            }
            interfaceC31286CPq.LIZIZ();
        }
        super.attachView(iView);
        this.LLIILZL.LJIIZILJ = true;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.lv0((LifecycleOwner) this.mView, LiveExtendedScreenStatus.class, new AqS171S0100000_5(this, 644));
            dataChannel.lv0((LifecycleOwner) this.mView, LiveExtendedScreenType.class, new AqS171S0100000_5(this, 645));
        }
    }
}
