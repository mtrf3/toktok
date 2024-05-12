package X;

import Y.AObserverS77S0100000_9;
import android.os.Bundle;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notification.vm.NotificationVM;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.MPl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56761MPl extends C56766MPq {
    public final C5H3 LJLILLLLZI = V1B.LJZI(new AqS159S0100000_9(this, 958));
    public final C5H3 LJLJI = V1B.LJZI(new AqS159S0100000_9(this, 957));
    public final C5H3 LJLJJI = V1B.LJZI(new AqS159S0100000_9(this, 955));
    public final C5H3 LJLJJL = V1B.LJZI(new AqS159S0100000_9(this, 956));
    public boolean LJLJJLL = true;
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(C56773MPx.LJLIL);

    @Override // X.C56766MPq
    public final void LJII() {
        C56757MPh hv0 = ((NotificationVM) this.LJLILLLLZI.getValue()).hv0();
        if ((hv0 instanceof MP2) && ((Boolean) this.LJLJL.getValue()).booleanValue()) {
            MP2 mp2 = (MP2) hv0;
            mp2.LJIIJ(new AqS159S0100000_9(mp2, 931));
        }
    }

    public final void LJIIL(int i) {
        C56767MPr c56767MPr;
        try {
            List<MusNotice> data = ((C56759MPj) this.LJLJJI.getValue()).getData();
            int i2 = 0;
            if (i >= 0 && i < data.size()) {
                Object obj = ListProtector.get(data, i);
                if ((obj instanceof C56767MPr) && (c56767MPr = (C56767MPr) obj) != null) {
                    List<MusNotice> LLILLL = ORZ.LLILLL(data, i);
                    if (!(LLILLL instanceof Collection) || !LLILLL.isEmpty()) {
                        i2 = 0;
                        for (MusNotice musNotice : LLILLL) {
                            if ((musNotice instanceof MPH) || (musNotice instanceof MPN) || (musNotice instanceof C56646MLa) || (musNotice instanceof C56880MUa)) {
                                i2++;
                                if (i2 < 0) {
                                    C47261Igj.LJJJJIZL();
                                    throw null;
                                }
                            }
                        }
                    }
                    C56760MPk.LJFF(c56767MPr, i - i2);
                }
            }
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    @Override // X.C56766MPq
    public final void LJIIIZ(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        ((NotificationVM) this.LJLILLLLZI.getValue()).iv0(C56702MNe.LIZ).LJIIIIZZ().observe(LIZ(), new AObserverS77S0100000_9(this, 96));
    }
}
