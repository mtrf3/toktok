package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import kotlin.jvm.internal.o;

/* renamed from: X.SdA, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C72520SdA extends C72523SdD {
    public final MusNotice LJLILLLLZI;
    public final boolean LJLJI;

    @Override // X.C72523SdD, X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (!areItemTheSame(interfaceC57784Mm4)) {
            return false;
        }
        return o.LJ(this.LJLILLLLZI, ((C72520SdA) interfaceC57784Mm4).LJLILLLLZI);
    }

    @Override // X.C72523SdD, X.InterfaceC57784Mm4
    public boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (!(interfaceC57784Mm4 instanceof C72520SdA) || this.LJLILLLLZI.getUniqueId() != ((C72520SdA) interfaceC57784Mm4).LJLILLLLZI.getUniqueId()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72520SdA(MusNotice notice, boolean z, int i) {
        super(i);
        o.LJIIIZ(notice, "notice");
        this.LJLILLLLZI = notice;
        this.LJLJI = z;
    }
}
