package X;

import android.text.SpannableStringBuilder;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.model.MGetTranslationRequest;
import com.bytedance.android.livesdk.chatroom.model.MGetTranslationResponse;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveAutoTranslateIngoreContentLanguageSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import kotlin.jvm.internal.o;

/* renamed from: X.CSk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31358CSk extends CQK<CVC> implements CSC, CTT, InterfaceC31365CSr {
    public final boolean LJJIIJZLJL;
    public final String LJJIIZ;
    public final long LJJIIZI;
    public boolean LJJIJ;
    public boolean LJJIJIIJI;
    public boolean LJJIJIIJIL;
    public boolean LJJIJIL;
    public CharSequence LJJIJL;

    @Override // X.CTT
    public final void LJIIJJI() {
        this.LJJIJIIJIL = true;
    }

    @Override // X.CSC
    public final void LJJL(java.util.Map<Long, Long> map) {
        o.LJIIIZ(map, "map");
    }

    @Override // X.CSC
    public final boolean LJJLIIIJLJLI() {
        return true;
    }

    @Override // X.CQL
    public final String LJLIL() {
        return "normal";
    }

    @Override // X.CQK
    public final String LLFZ() {
        return "live_star_comment";
    }

    @Override // X.InterfaceC31365CSr
    public final MGetTranslationRequest.Text LJJIJIL() {
        MGetTranslationRequest.Text text = new MGetTranslationRequest.Text();
        text.text = ((CVC) this.LJIJJLI).LJLJI;
        text.msgId = getMessageId();
        text.textSource = 1;
        return text;
    }

    @Override // X.CTT
    public final boolean LJJJJI() {
        if (this.LJJIJIL || this.LJJIJ) {
            return false;
        }
        if (!this.LJJIIJZLJL && (((CVC) this.LJIJJLI).LJLJLJ.length() <= 0 || o.LJ(((CVC) this.LJIJJLI).LJLJLJ, "un") || o.LJ(((CVC) this.LJIJJLI).LJLJLJ, this.LJJIIZ) || getUser().getId() == this.LJJIIZI)) {
            return false;
        }
        return true;
    }

    @Override // X.CSC
    public final CharSequence LJJLIIIJJIZ() {
        return ((CVC) this.LJIJJLI).LJLJI;
    }

    @Override // X.CQL
    public final CharSequence LJJZZIII() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(((CVC) this.LJIJJLI).LJLJI);
        spannableStringBuilder.setSpan(new CSZ(this), 0, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    @Override // X.CQK
    public final String LLI() {
        return ((CVC) this.LJIJJLI).LJLJI;
    }

    @Override // X.InterfaceC31078CHq, X.CXK
    public final User getUser() {
        return ((CVC) this.LJIJJLI).LJLILLLLZI;
    }

    @Override // X.CTT
    public final boolean LJIILL() {
        return this.LJJIJIIJIL;
    }

    @Override // X.CSC
    public final boolean LJIIZILJ() {
        return this.LJJIJ;
    }

    @Override // X.CTT
    public final boolean LJJJJLL() {
        return this.LJJIJIIJI;
    }

    @Override // X.CSC
    public final CharSequence LJJJLIIL() {
        return this.LJJIJL;
    }

    @Override // X.CSC
    public final boolean LJJLIIIJLLLLLLLZ() {
        return this.LJJIJIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31358CSk(CVC message) {
        super(message);
        o.LJIIIZ(message, "message");
        this.LJJIIJZLJL = LiveAutoTranslateIngoreContentLanguageSetting.getValue();
        this.LJJIIZ = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).currentLocale().getLanguage();
        this.LJJIIZI = C025908h.LIZ();
    }

    @Override // X.CSC
    public final void LJJIIJ(boolean z) {
        this.LJJIJ = z;
    }

    @Override // X.InterfaceC31365CSr
    public final void LJJIIZ(java.util.Map<String, MGetTranslationResponse.Data.Translation> map) {
        MGetTranslationResponse.Data.Translation translation = map.get(((CVC) this.LJIJJLI).LJLJI);
        if (translation != null && translation.translated) {
            this.LJJIJIL = true;
            LJJJJL(translation.translation);
        }
    }

    @Override // X.CTT
    public final void LJJIJLIJ(boolean z) {
        this.LJJIJIIJI = z;
    }

    @Override // X.CSC
    public final void LJJIZ(boolean z) {
        this.LJJIJIL = z;
    }

    @Override // X.CSC
    public final void LJJJJL(CharSequence charSequence) {
        if (charSequence != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            spannableStringBuilder.setSpan(new C31348CSa(this), 0, spannableStringBuilder.length(), 33);
            this.LJJIJL = spannableStringBuilder;
        }
    }
}
