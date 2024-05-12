package com.bytedance.android.livesdk.hotword;

import X.AbstractC32809CuD;
import X.BCW;
import X.C0NB;
import X.C221108m2;
import X.C29044Baa;
import X.C31089CIb;
import X.C32142CjS;
import X.C32796Cu0;
import X.C32805Cu9;
import X.C32822CuQ;
import X.C61172af;
import X.C62822Ol8;
import X.C67512kt;
import X.C69607RTn;
import X.C73026SlK;
import X.C76937UHl;
import X.C77319UWd;
import X.C77342UXa;
import X.C77344UXc;
import X.C78613UtF;
import X.CIW;
import X.EnumC32737Ct3;
import X.EnumC32853Cuv;
import X.EnumC76934UHi;
import X.IO8;
import X.InterfaceC15800jg;
import X.U5H;
import X.UVW;
import X.UXA;
import X.UXD;
import X.UXE;
import X.UXG;
import X.UXI;
import X.UXN;
import X.UXR;
import X.UXX;
import X.UXZ;
import X.V16;
import X.X1D;
import X.XKQ;
import X.XKX;
import android.text.Editable;
import android.text.style.CharacterStyle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.RechargeExchangeCoinsDialogShowing;
import com.bytedance.android.livesdk.chatroom.ui.LiveEmojiInputDialogFragment;
import com.bytedance.android.livesdk.hotword.ui.HotWordBackgroundSpan;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftSenderRefactorV1Setting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS32S0210000_13;
import kotlin.jvm.internal.IDqS437S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class HotWordGiftViewModel extends ViewModel {
    public static final /* synthetic */ int LL = 0;
    public UXX LJLIL;
    public UXI LJLILLLLZI;
    public UXN LJLJI;
    public UXG LJLJJI;
    public DataChannel LJLJJL;
    public InterfaceC15800jg LJLJJLL;
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 228));
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(C77344UXc.LJLIL);
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(UXZ.LJLIL);
    public final NextLiveData<UXE> LJLL;
    public final NextLiveData LJLLI;
    public final NextLiveData<C69607RTn> LJLLILLLL;
    public final NextLiveData LJLLJ;
    public final NextLiveData<C61172af> LJLLL;
    public final NextLiveData LJLLLL;
    public volatile boolean LJLLLLLL;
    public XKQ LJLZ;
    public boolean LJZ;
    public boolean LJZI;
    public final AqS163S0100000_13 LJZL;

    public final UXD hv0() {
        UXE value = this.LJLL.getValue();
        if (value != null) {
            return value.LIZJ;
        }
        return null;
    }

    public final IO8 iv0() {
        return (IO8) this.LJLJL.getValue();
    }

    public final void ov0() {
        String str;
        C31089CIb c31089CIb;
        InterfaceC15800jg interfaceC15800jg = this.LJLJJLL;
        if (interfaceC15800jg != null) {
            LiveEmojiInputDialogFragment liveEmojiInputDialogFragment = ((CIW) interfaceC15800jg).LIZ.LLILLIZIL;
            if (liveEmojiInputDialogFragment != null) {
                if (!liveEmojiInputDialogFragment.isAdded() || (c31089CIb = liveEmojiInputDialogFragment.LLI) == null || c31089CIb.getText() == null || liveEmojiInputDialogFragment.LLJL == null || (str = liveEmojiInputDialogFragment.LLI.getText().toString()) == null) {
                    return;
                }
            } else {
                str = "";
            }
            lv0(str, false);
        }
    }

    public HotWordGiftViewModel() {
        C221108m2.LIZIZ(C77342UXa.LJLIL);
        NextLiveData<UXE> nextLiveData = new NextLiveData<>();
        this.LJLL = nextLiveData;
        this.LJLLI = nextLiveData;
        NextLiveData<C69607RTn> nextLiveData2 = new NextLiveData<>();
        this.LJLLILLLL = nextLiveData2;
        this.LJLLJ = nextLiveData2;
        NextLiveData<C61172af> nextLiveData3 = new NextLiveData<>();
        this.LJLLL = nextLiveData3;
        this.LJLLLL = nextLiveData3;
        this.LJZL = new AqS163S0100000_13(this, 227);
    }

    public final void jv0() {
        LiveEmojiInputDialogFragment liveEmojiInputDialogFragment;
        C31089CIb c31089CIb;
        Editable text;
        CharacterStyle[] characterStyleArr;
        iv0().removeMessages(101);
        this.LJLL.postValue(new UXE(false, null, null, 14));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Clearing highlights of type ");
        LIZ.append(HotWordBackgroundSpan.class);
        C0NB.LIZIZ("HotWordGift", X1D.LIZIZ(LIZ));
        InterfaceC15800jg interfaceC15800jg = this.LJLJJLL;
        if (interfaceC15800jg == null || (liveEmojiInputDialogFragment = ((CIW) interfaceC15800jg).LIZ.LLILLIZIL) == null || (c31089CIb = liveEmojiInputDialogFragment.LLI) == null || liveEmojiInputDialogFragment.LLJL == null || (text = c31089CIb.getText()) == null || text.length() <= 0 || (characterStyleArr = (CharacterStyle[]) text.getSpans(0, text.length(), HotWordBackgroundSpan.class)) == null) {
            return;
        }
        for (CharacterStyle characterStyle : characterStyleArr) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Removing span: ");
            LIZ2.append(characterStyle);
            C0NB.LIZIZ("HotWordGift", X1D.LIZIZ(LIZ2));
            if (characterStyle != null) {
                text.removeSpan(characterStyle);
            }
        }
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        iv0().removeCallbacksAndMessages(null);
        this.LJLJJLL = null;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        dataChannelGlobal.getClass();
        dataChannelGlobal.jv0(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object gv0(java.lang.String r16, X.InterfaceC67352kd r17) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.hotword.HotWordGiftViewModel.gv0(java.lang.String, X.2kd):java.lang.Object");
    }

    public final void kv0(boolean z, boolean z2) {
        boolean z3;
        IDqS437S0100000_13 iDqS437S0100000_13 = new IDqS437S0100000_13(this, 2);
        if (z2) {
            if (!this.LJZI) {
                this.LJZI = true;
                DataChannel dataChannel = this.LJLJJL;
                if (dataChannel != null) {
                    dataChannel.mv0(RechargeExchangeCoinsDialogShowing.class, this, new AqS32S0210000_13(this, iDqS437S0100000_13, z, 1));
                    return;
                } else {
                    o.LJIJI("dataChannel");
                    throw null;
                }
            }
            return;
        }
        C69607RTn value = this.LJLLILLLL.getValue();
        if (value != null) {
            z3 = value.LIZLLL;
        } else {
            z3 = false;
        }
        iDqS437S0100000_13.invoke(Boolean.valueOf(z3), Boolean.FALSE, Boolean.valueOf(z));
    }

    public final void lv0(String str, boolean z) {
        if (!this.LJLLLLLL || str.length() == 0) {
            return;
        }
        DataChannel dataChannel = this.LJLJJL;
        if (dataChannel != null) {
            if (o.LJ(dataChannel.kv0(BCW.class), Boolean.FALSE)) {
                return;
            }
            DataChannel dataChannel2 = this.LJLJJL;
            if (dataChannel2 != null) {
                if (!C32142CjS.LIZ(dataChannel2)) {
                    return;
                }
                if (UXR.LIZ != null && o.LJ(str, "dfc")) {
                    UXG uxg = this.LJLJJI;
                    if (uxg != null) {
                        uxg.clearData();
                        return;
                    } else {
                        o.LJIJI("freqController");
                        throw null;
                    }
                }
                UXE value = this.LJLL.getValue();
                if (value != null && value.LIZ) {
                    return;
                }
                XKQ xkq = this.LJLZ;
                if (xkq != null) {
                    xkq.LIZIZ(null);
                }
                this.LJLZ = XKX.LIZLLL(ViewModelKt.getViewModelScope(this), C78613UtF.LIZ, null, new C67512kt(this, str, z, null), 2);
                return;
            }
            o.LJIJI("dataChannel");
            throw null;
        }
        o.LJIJI("dataChannel");
        throw null;
    }

    public final void mv0(UXD uxd, int i) {
        XKX.LIZLLL(ViewModelKt.getViewModelScope(this), C78613UtF.LIZJ, null, new C77319UWd(this, uxd, i, null), 2);
    }

    public final void nv0(Gift gift, EnumC32853Cuv closeReason) {
        o.LJIIIZ(gift, "gift");
        o.LJIIIZ(closeReason, "closeReason");
        jv0();
        UXG uxg = this.LJLJJI;
        if (uxg != null) {
            uxg.LJFF();
            UXD hv0 = hv0();
            if (hv0 == null) {
                return;
            }
            UXA.LIZJ(gift.id, closeReason, iv0().LIZ(), hv0.LIZ());
            Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
            if (room == null) {
                C0NB.LIZIZ("HotWordGift", "CurrentRoomGlobalData is null when sending gift");
                return;
            }
            if (LiveGiftSenderRefactorV1Setting.INSTANCE.enable()) {
                UVW uvw = UVW.LJI;
                User owner = room.getOwner();
                o.LJIIIIZZ(owner, "room.owner");
                C32822CuQ LIZ = U5H.LIZ(owner);
                DataChannel dataChannel = this.LJLJJL;
                if (dataChannel != null) {
                    AbstractC32809CuD.LIZJ(uvw, new C76937UHl(gift, room, LIZ, V16.LJIIJ(room, dataChannel), hv0.LIZ()));
                    return;
                } else {
                    o.LJIJI("dataChannel");
                    throw null;
                }
            }
            long j = gift.id;
            String LIZ2 = hv0.LIZ();
            C32805Cu9 c32805Cu9 = new C32805Cu9(j, 1, false, room, 0, new C73026SlK(EnumC32737Ct3.HOT_WORD_GIFT_GUIDE, EnumC76934UHi.ANCHOR));
            c32805Cu9.LJIILJJIL = "gift_guide_popup_comment_key_words";
            boolean z = true;
            if (gift.type == 1) {
                z = false;
            }
            c32805Cu9.LJIILL = z;
            c32805Cu9.LJIIIZ = gift.diamondCount;
            User owner2 = room.getOwner();
            o.LJIIIIZZ(owner2, "room.owner");
            c32805Cu9.LJIILIIL = U5H.LIZ(owner2);
            c32805Cu9.LJIL = gift.isEffectBEFView;
            c32805Cu9.LJJIIJZLJL = LIZ2;
            c32805Cu9.LJJIIZ = "gift_guide_popup_comment_key_words";
            c32805Cu9.LJIJI = "click";
            c32805Cu9.LJIJJLI = gift.isBroadcastGift;
            DataChannel dataChannel2 = this.LJLJJL;
            if (dataChannel2 != null) {
                C32796Cu0.LIZIZ(dataChannel2, c32805Cu9);
                return;
            } else {
                o.LJIJI("dataChannel");
                throw null;
            }
        }
        o.LJIJI("freqController");
        throw null;
    }
}
