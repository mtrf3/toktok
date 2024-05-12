package X;

import com.ss.android.ugc.aweme.search.pages.result.bot.component.SearchTakoCardAssem;
import kotlin.jvm.internal.AqS155S0200000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.Jbr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49507Jbr implements InterfaceC116744i6 {
    public final /* synthetic */ SearchTakoCardAssem LIZ;

    public C49507Jbr(SearchTakoCardAssem searchTakoCardAssem) {
        this.LIZ = searchTakoCardAssem;
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
                new AqS155S0200000_8(charSequence, this.LIZ, 1).invoke();
            } catch (Exception unused) {
            }
        }
    }
}
