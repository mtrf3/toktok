package X;

import com.ss.android.ugc.aweme.nows.archive.assem.NowArchiveCalendarListAssem;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.7Dn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C182317Dn extends AbstractC65781Prl implements InterfaceC88472Yns<C182307Dm, C76800UCe> {
    public final /* synthetic */ NowArchiveCalendarListAssem LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C182317Dn(NowArchiveCalendarListAssem nowArchiveCalendarListAssem) {
        super(1);
        this.LJLIL = nowArchiveCalendarListAssem;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C182307Dm it) {
        Object LIZ;
        o.LJIIIZ(it, "it");
        java.util.Set<Map.Entry> entrySet = ((LinkedHashMap) C7GZ.LIZJ).entrySet();
        NowArchiveCalendarListAssem nowArchiveCalendarListAssem = this.LJLIL;
        for (Map.Entry entry : entrySet) {
            try {
                nowArchiveCalendarListAssem.v3().getState().LJIILL(((Number) entry.getKey()).intValue(), (InterfaceC57784Mm4) entry.getValue());
                LIZ = C76800UCe.LIZ;
                C3C5.m7constructorimpl(LIZ);
            } catch (Throwable th) {
                LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
            }
            Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
            if (m10exceptionOrNullimpl != null) {
                C36922EeM.LJFF(m10exceptionOrNullimpl);
            }
        }
        return C76800UCe.LIZ;
    }
}
