package X;

import android.text.Editable;
import android.text.style.CharacterStyle;
import com.bytedance.android.livesdk.chatroom.ui.LiveEmojiInputDialogFragment;
import com.bytedance.android.livesdk.hotword.HotWordGiftViewModel;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.hotword.HotWordGiftViewModel$findMatches$2", f = "HotWordGiftViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class UXB extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ HotWordGiftViewModel LJLIL;
    public final /* synthetic */ C33781Ug LJLILLLLZI;
    public final /* synthetic */ UXT LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UXB(HotWordGiftViewModel hotWordGiftViewModel, C33781Ug c33781Ug, UXT uxt, InterfaceC67352kd<? super UXB> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = hotWordGiftViewModel;
        this.LJLILLLLZI = c33781Ug;
        this.LJLJI = uxt;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new UXB(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        LiveEmojiInputDialogFragment liveEmojiInputDialogFragment;
        C31089CIb c31089CIb;
        Editable text;
        C141335gf.LIZJ(obj);
        HotWordGiftViewModel hotWordGiftViewModel = this.LJLIL;
        C33781Ug c33781Ug = this.LJLILLLLZI;
        UXT uxt = this.LJLJI;
        hotWordGiftViewModel.getClass();
        Gift LJJLIIJ = C45804HyK.LJJLIIJ(c33781Ug.LJLILLLLZI);
        if (LJJLIIJ != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onBestMatchFound, span: ");
            LIZ.append(c33781Ug.LJLJJL);
            LIZ.append(", start: ");
            LIZ.append(c33781Ug.LJLJI);
            LIZ.append(", end: ");
            LIZ.append(c33781Ug.LJLJJI);
            LIZ.append(", flags: ");
            LIZ.append(c33781Ug.LJLJJLL);
            LIZ.append(", keyword: ");
            C31811Ce7.LJ(LIZ, c33781Ug.LJLIL, LIZ, "HotWordGift");
            InterfaceC15800jg interfaceC15800jg = hotWordGiftViewModel.LJLJJLL;
            if (interfaceC15800jg != null && (liveEmojiInputDialogFragment = ((CIW) interfaceC15800jg).LIZ.LLILLIZIL) != null && (c31089CIb = liveEmojiInputDialogFragment.LLI) != null && liveEmojiInputDialogFragment.LLJL != null && liveEmojiInputDialogFragment.LJLJI && (text = c31089CIb.getText()) != null && text.length() > 0) {
                int i = c33781Ug.LJLJI;
                int i2 = c33781Ug.LJLJJI + 1;
                CharacterStyle characterStyle = c33781Ug.LJLJJL;
                int i3 = c33781Ug.LJLJJLL;
                StringBuilder LIZJ = C06460Ne.LIZJ("Start: ", i, ", End: ", i2, ", Flags: ");
                LIZJ.append(i3);
                LIZJ.append(", Keyword: ");
                LIZJ.append(c33781Ug.LJLIL);
                String LIZIZ = X1D.LIZIZ(LIZJ);
                if (characterStyle == null) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("Span is null -> ");
                    LIZ2.append(LIZIZ);
                    C0NB.LIZIZ("HotWordGift", X1D.LIZIZ(LIZ2));
                    C0K2.LIZ(LIZIZ, new NullPointerException("Null span found in CommentHighlightInfo"));
                } else if (i >= 0 && i2 <= text.length() && i < i2) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("Setting span: ");
                    LIZ3.append(characterStyle);
                    LIZ3.append(", ");
                    LIZ3.append(LIZIZ);
                    C0NB.LIZIZ("HotWordGift", X1D.LIZIZ(LIZ3));
                    text.setSpan(characterStyle, i, i2, i3);
                }
            }
            UXD uxd = new UXD(LJJLIIJ, uxt);
            NextLiveData<UXE> nextLiveData = hotWordGiftViewModel.LJLL;
            UXN uxn = hotWordGiftViewModel.LJLJI;
            if (uxn != null) {
                nextLiveData.postValue(new UXE(true, uxd, uxn.LIZ(), 2));
            } else {
                o.LJIJI("userRepository");
                throw null;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
