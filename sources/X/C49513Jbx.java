package X;

import com.ss.android.ugc.aweme.search.pages.result.bot.SearchBotHolder;
import kotlin.jvm.internal.AqS155S0200000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.Jbx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49513Jbx implements InterfaceC116744i6 {
    public final /* synthetic */ SearchBotHolder LIZ;

    public C49513Jbx(SearchBotHolder searchBotHolder) {
        this.LIZ = searchBotHolder;
    }

    @Override // X.InterfaceC116744i6
    public final void LIZ(C48R span) {
        o.LJIIIZ(span, "span");
    }

    @Override // X.InterfaceC116744i6
    public final void LIZIZ(C48R span, CharSequence charSequence, java.util.Map<String, ? extends Object> map) {
        o.LJIIIZ(span, "span");
        if (span.LJI()) {
            try {
                new AqS155S0200000_8(charSequence, this.LIZ, 8).invoke();
            } catch (Exception unused) {
            }
        }
    }
}
