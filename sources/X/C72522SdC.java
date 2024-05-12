package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import kotlin.jvm.internal.o;

/* renamed from: X.SdC, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72522SdC extends C72520SdA {
    @Override // X.C72520SdA, X.C72523SdD, X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (super.areItemTheSame(interfaceC57784Mm4) && (interfaceC57784Mm4 instanceof C72522SdC)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72522SdC(MusNotice notice, boolean z, int i) {
        super(notice, z, i);
        o.LJIIIZ(notice, "notice");
    }
}
