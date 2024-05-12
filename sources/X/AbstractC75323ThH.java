package X;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.ILinkStateAbility;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.ThH, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC75323ThH implements N4W {
    public final DataChannel LIZ;
    public final String LIZIZ;
    public final C62822Ol8 LIZJ;
    public final C62822Ol8 LIZLLL;
    public final C62822Ol8 LJ;
    public final C62822Ol8 LJFF;
    public final C62822Ol8 LJI;
    public final C62822Ol8 LJII;
    public final C62822Ol8 LJIIIIZZ;
    public final C62822Ol8 LJIIIZ;
    public final C62822Ol8 LJIIJ;
    public final C75319ThD LJIIJJI;

    public abstract String LJIIIIZZ();

    public abstract String LJIIIZ();

    public abstract User LJIIJ();

    public final MutableLiveData<ImageModel> LJ() {
        return (MutableLiveData) this.LJ.getValue();
    }

    public final MutableLiveData<C75330ThO> LJFF() {
        return (MutableLiveData) this.LIZLLL.getValue();
    }

    public final MutableLiveData<Long> LJI() {
        return (MutableLiveData) this.LJFF.getValue();
    }

    public final MutableLiveData<String> LJII() {
        return (MutableLiveData) this.LJI.getValue();
    }

    public final MutableLiveData<Integer> LJIIJJI() {
        return (MutableLiveData) this.LJII.getValue();
    }

    public void LJIILIIL() {
        IMessageManager iMessageManager;
        TZM tzm;
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null && (tzm = (TZM) C79004UzY.LJIL(dataChannel, TZM.class)) != null) {
            tzm.LLLFF(this);
        }
        DataChannel dataChannel2 = this.LIZ;
        if (dataChannel2 != null && (iMessageManager = (IMessageManager) dataChannel2.kv0(C29927Bop.class)) != null) {
            iMessageManager.removeMessageListener(this.LJIIJJI);
        }
        LJI().removeObserver((Observer) this.LIZJ.getValue());
    }

    @Override // X.N4W
    public final void LIZJ(TZM keeper) {
        o.LJIIIZ(keeper, "keeper");
        LIZLLL(keeper.LLILZIL(this.LIZIZ));
    }

    public final void LIZLLL(int i) {
        Integer value = LJIIJJI().getValue();
        if (value == null || value.intValue() != i) {
            LJIIJJI().setValue(Integer.valueOf(i));
        }
    }

    public void LJIIL(ILinkStateAbility iLinkStateAbility) {
        Long l;
        TZM tzm;
        IMessageManager iMessageManager;
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.kv0(C29927Bop.class)) != null) {
            iMessageManager.addMessageListener(EnumC31509CYf.LINK_MIC.getIntType(), this.LJIIJJI);
            iMessageManager.addMessageListener(EnumC31509CYf.LINK_MIC_FAN_TICKET_METHOD.getIntType(), this.LJIIJJI);
        }
        DataChannel dataChannel2 = this.LIZ;
        if (dataChannel2 != null && (tzm = (TZM) C79004UzY.LJIL(dataChannel2, TZM.class)) != null) {
            tzm.LLIZ(this);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("userId:");
        User LJIIJ = LJIIJ();
        if (LJIIJ != null) {
            l = Long.valueOf(LJIIJ.getId());
        } else {
            l = null;
        }
        LIZ.append(l);
        C0NB.LIZIZ("MaskViewModel", X1D.LIZIZ(LIZ));
        LJI().observeForever((Observer) this.LIZJ.getValue());
    }

    public AbstractC75323ThH(DataChannel dataChannel, String linkMicId) {
        o.LJIIIZ(linkMicId, "linkMicId");
        this.LIZ = dataChannel;
        this.LIZIZ = linkMicId;
        this.LIZJ = C221108m2.LIZIZ(new AqS163S0100000_13(this, 159));
        this.LIZLLL = C221108m2.LIZIZ(C75332ThQ.LJLIL);
        this.LJ = C221108m2.LIZIZ(C75331ThP.LJLIL);
        this.LJFF = C221108m2.LIZIZ(C75347Thf.LJLIL);
        this.LJI = C221108m2.LIZIZ(C75333ThR.LJLIL);
        this.LJII = C221108m2.LIZIZ(C75327ThL.LJLIL);
        this.LJIIIIZZ = C221108m2.LIZIZ(C75340ThY.LJLIL);
        this.LJIIIZ = C221108m2.LIZIZ(C75334ThS.LJLIL);
        this.LJIIJ = C221108m2.LIZIZ(C75328ThM.LJLIL);
        this.LJIIJJI = new C75319ThD(this);
    }

    public static void LJIILJJIL(MutableLiveData data, Object obj) {
        o.LJIIIZ(data, "data");
        if (!o.LJ(data.getValue(), obj)) {
            data.setValue(obj);
        }
    }

    @Override // X.N4W
    public final void LIZ(TZM keeper, String interactId) {
        o.LJIIIZ(keeper, "keeper");
        o.LJIIIZ(interactId, "interactId");
        if (o.LJ(interactId, this.LIZIZ)) {
            ((LiveData) this.LJIIIZ.getValue()).setValue(Integer.valueOf(keeper.b(interactId)));
        }
    }

    @Override // X.N4W
    public final void LIZIZ(TZM keeper, String interactId) {
        o.LJIIIZ(keeper, "keeper");
        o.LJIIIZ(interactId, "interactId");
        if (o.LJ(interactId, this.LIZIZ)) {
            LIZLLL(keeper.LLILZIL(interactId));
        }
    }
}
