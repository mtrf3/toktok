package X;

import android.util.SparseArray;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.live.pin.PinMessageViewModel;
import com.bytedance.android.live.publicscreen.api.ExtendedPublicScreenFilterTypeChannel;
import com.bytedance.android.livesdk.IBarrageService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.CQy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31320CQy extends C31319CQx<CS0> {
    public CRG LLJZIJLIL;
    public final SparseArray<InterfaceC31338CRq<CRD>> LLJZ = new SparseArray<>();
    public final C62822Ol8 LLL = C221108m2.LIZIZ(CEF.LJLIL);
    public final C62822Ol8 LLLF = C221108m2.LIZIZ(CEG.LJLIL);

    @Override // X.C31319CQx, X.InterfaceC29574Bj8
    public final boolean LJIILIIL() {
        return true;
    }

    @Override // X.C31319CQx
    public final void LJJLIIIJJIZ() {
    }

    @Override // X.C31319CQx, X.CR9
    public final void LJJJJ() {
        this.LJLIL.LIZ(new C31383CTj());
        this.LJLIL.LIZ(new C31384CTk());
    }

    @Override // X.C31319CQx
    public final void LJJJJI() {
        IMessageManager iMessageManager = this.mMessageManager;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(EnumC31509CYf.ROOM.getIntType(), (OnIMMessageListener) this);
            this.mMessageManager.addMessageListener(EnumC31509CYf.CHAT.getIntType(), (OnIMMessageListener) this);
            this.mMessageManager.addMessageListener(EnumC31509CYf.EMOTE_CHAT.getIntType(), (OnIMMessageListener) this);
            this.mMessageManager.addMessageListener(EnumC31509CYf.GIFT.getIntType(), (OnIMMessageListener) this);
            this.mMessageManager.addMessageListener(EnumC31509CYf.MEMBER.getIntType(), (OnIMMessageListener) this);
            this.mMessageManager.addMessageListener(EnumC31509CYf.LIVE_UNAUTHORIZED_MEMBER_MESSAGE.getIntType(), (OnIMMessageListener) this);
            this.mMessageManager.addMessageListener(EnumC31509CYf.DIGG.getIntType(), (OnIMMessageListener) this);
            InterfaceC29980Bpg hq0 = ((IBarrageService) CN1.LIZ(IBarrageService.class)).hq0(this.LLIILZL.LJIIJJI);
            if (hq0 != null && hq0.isEnabled()) {
                this.mMessageManager.addMessageListener(EnumC31509CYf.LIKE.getIntType(), (OnIMMessageListener) this);
            }
            this.mMessageManager.addMessageListener(EnumC31509CYf.SOCIAL.getIntType(), (OnIMMessageListener) this);
            this.mMessageManager.addMessageListener(EnumC31509CYf.CONTROL.getIntType(), (OnIMMessageListener) this);
            this.mMessageManager.addMessageListener(EnumC31509CYf.SCREEN.getIntType(), (OnIMMessageListener) this);
            this.mMessageManager.addMessageListener(EnumC31509CYf.COMMENT_IMAGE.getIntType(), (OnIMMessageListener) this);
            this.mMessageManager.addMessageListener(EnumC31509CYf.GOODS_ORDER.getIntType(), (OnIMMessageListener) this);
            this.mMessageManager.addMessageListener(EnumC31509CYf.ASSET_MESSAGE.getIntType(), (OnIMMessageListener) this);
            this.mMessageManager.addMessageListener(EnumC31509CYf.PORTAL_MESSAGE.getIntType(), (OnIMMessageListener) this);
            this.mMessageManager.addMessageListener(EnumC31509CYf.LIVE_INTRO_MESSAGE.getIntType(), (OnIMMessageListener) this);
            this.mMessageManager.addMessageListener(EnumC31509CYf.ROOM_VERIFY.getIntType(), (OnIMMessageListener) this);
            this.mMessageManager.addMessageListener(EnumC31509CYf.IM_DELETE.getIntType(), (OnIMMessageListener) this);
            this.mMessageManager.addMessageListener(EnumC31509CYf.QUESTION_DELETE_MESSAGE.getIntType(), (OnIMMessageListener) this);
            this.mMessageManager.addMessageListener(EnumC31509CYf.RED_ENVELOPE_MESSAGE.getIntType(), (OnIMMessageListener) this);
            this.mMessageManager.addMessageListener(EnumC31509CYf.ENVELOPE_PORTAL_MESSAGE.getIntType(), (OnIMMessageListener) this);
            this.mMessageManager.addMessageListener(EnumC31509CYf.WISH_LIST_UPDATE_MESSAGE.getIntType(), (OnIMMessageListener) this);
            this.mMessageManager.addMessageListener(EnumC31509CYf.SUB_NOTIFY_MESSAGE.getIntType(), (OnIMMessageListener) this);
            this.mMessageManager.addMessageListener(EnumC31509CYf.GIFT_COLLECTION_UPDATE_MESSAGE.getIntType(), (OnIMMessageListener) this);
            this.mMessageManager.addMessageListener(EnumC31509CYf.MODERATOR_OPERATE_MESSAGE.getIntType(), (OnIMMessageListener) this);
        }
    }

    @Override // X.C31319CQx
    public final void LJJJLIIL() {
        Fragment hs;
        CRA cra;
        Fragment hs2;
        CRA cra2 = (CRA) this.mView;
        if (cra2 != null && (hs = cra2.hs()) != null && (cra = (CRA) this.mView) != null && (hs2 = cra.hs()) != null && hs2.mo49getActivity() != null) {
            this.LJLILLLLZI = (PinMessageViewModel) ViewModelProviders.of(hs).get("extended", PinMessageViewModel.class);
        }
    }

    @Override // X.C31319CQx
    public final int LJJLIIIJILLIZJL() {
        if (((Boolean) this.LLLF.getValue()).booleanValue()) {
            return ((Number) this.LLL.getValue()).intValue();
        }
        return this.LJLLI;
    }

    public final void LJLLLLLL() {
        boolean isEmpty;
        CRD crd;
        String title;
        Integer num;
        if (((Boolean) this.LLLF.getValue()).booleanValue()) {
            CR1<CRD> cr1 = this.LJZI;
            if (cr1.LJI) {
                isEmpty = cr1.LIZJ.isEmpty();
            } else {
                isEmpty = cr1.LIZIZ.isEmpty();
            }
            if (isEmpty && ((crd = this.LLILLL) == null || C29306Beo.LJJIFFI(Boolean.valueOf(this.LJZI.LIZJ(crd))))) {
                DataChannel dataChannel = this.dataChannel;
                if (dataChannel == null || (num = (Integer) dataChannel.kv0(ExtendedPublicScreenFilterTypeChannel.class)) == null || num.intValue() != 1) {
                    title = C15380j0.LJIILJJIL(R.string.mzm);
                } else {
                    title = C15380j0.LJIILJJIL(R.string.mzn);
                }
                CS0 cs0 = (CS0) this.mView;
                o.LJIIIIZZ(title, "title");
                cs0.dB(title);
                return;
            }
            ((CS0) this.mView).Rs();
        }
    }

    @Override // X.C31319CQx
    public final CRY LJL() {
        return CRY.ExtendedMain;
    }

    @Override // X.C31319CQx, X.AbstractC31497CXt
    /* renamed from: LJLLLL, reason: merged with bridge method [inline-methods] */
    public final void attachView(CS0 iView) {
        Boolean bool;
        o.LJIIIZ(iView, "iView");
        super.attachView(iView);
        this.LLIILZL.LJIIZILJ = true;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            LiveMode liveMode = (LiveMode) dataChannel.kv0(BCX.class);
            if (liveMode != null) {
                bool = Boolean.valueOf(C28509BGv.LJI(liveMode));
            } else {
                bool = null;
            }
            if (C29306Beo.LJJIFFI(bool)) {
                this.LLJZ.clear();
                SparseArray<InterfaceC31338CRq<CRD>> sparseArray = this.LLJZ;
                sparseArray.put(1, new C31339CRr());
                sparseArray.put(2, new CRW());
                sparseArray.put(4, new CRL());
                sparseArray.put(8, new C31340CRs());
                this.dataChannel.lv0(iView, ExtendedPublicScreenFilterTypeChannel.class, new AqS171S0100000_5(this, 646));
            }
        }
    }
}
