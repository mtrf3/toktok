package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeListsResponse;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MP6 implements InterfaceC29937Boz {
    public final /* synthetic */ InterfaceC73573Su9<C56769MPt<List<MusNotice>>> LIZ;
    public final /* synthetic */ MP1 LIZIZ;
    public final /* synthetic */ C68322mC<NoticeListsResponse> LIZJ;

    public MP6(C73433Srt c73433Srt, MP1 mp1, C68322mC c68322mC) {
        this.LIZ = c73433Srt;
        this.LIZIZ = mp1;
        this.LIZJ = c68322mC;
    }

    @Override // X.InterfaceC29937Boz
    public final void run() {
        if (C56805MRd.LIZJ()) {
            EnumC56806MRe.LJLJLJ.LIZLLL();
        }
        InterfaceC73573Su9<C56769MPt<List<MusNotice>>> emitter = this.LIZ;
        o.LJIIIIZZ(emitter, "emitter");
        MP1 mp1 = this.LIZIZ;
        mp1.LJIILJJIL(this.LIZJ.element, true);
        mp1.LJIILJJIL = false;
        mp1.LJIILL = false;
        C38891fp.LJJIJ(emitter, mp1.LJIILIIL(mp1.LIZIZ(), null));
    }
}
