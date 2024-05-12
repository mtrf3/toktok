package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.commercialize.media.impl.logging.CommerceMusicLogger;
import kotlin.jvm.internal.AqS97S0101000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.MIp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56583MIp extends C0A6 {
    public final /* synthetic */ LinearLayoutManager LJLIL;
    public final /* synthetic */ C68322mC<C40517FvF> LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI = true;
    public final /* synthetic */ java.util.Map<Integer, Boolean> LJLJJI;
    public final /* synthetic */ InterfaceC56578MIk LJLJJL;
    public final /* synthetic */ InterfaceC58626Mze<?> LJLJJLL;
    public final /* synthetic */ InterfaceC88471Ynr<C58620MzY, Integer, C76800UCe> LJLJL;

    /* JADX WARN: Type inference failed for: r5v0, types: [T, java.lang.Object, X.Fv9, X.FvF] */
    @Override // X.C0A6
    public final void LJIILL(RecyclerView recyclerView, int i, int i2) {
        C40517FvF c40517FvF;
        o.LJIIIZ(recyclerView, "recyclerView");
        int LLIL = this.LJLIL.LLIL();
        ?? c40517FvF2 = new C40517FvF(LLIL, this.LJLIL.LLILLIZIL());
        if (o.LJ(c40517FvF2, this.LJLILLLLZI.element)) {
            return;
        }
        C40517FvF c40517FvF3 = this.LJLILLLLZI.element;
        if (c40517FvF3 == null) {
            c40517FvF = c40517FvF2;
        } else {
            c40517FvF = new C40517FvF(Math.min(c40517FvF3.LJLIL, LLIL), Math.max(c40517FvF3.LJLILLLLZI, c40517FvF2.LJLILLLLZI));
        }
        int i3 = c40517FvF.LJLIL;
        int i4 = c40517FvF.LJLILLLLZI;
        if (i3 <= i4) {
            while (true) {
                if (c40517FvF3 == null || !c40517FvF3.LJIILJJIL(i3)) {
                    int i5 = c40517FvF2.LJLIL;
                    if (i3 <= c40517FvF2.LJLILLLLZI && i5 <= i3 && (!this.LJLJI || this.LJLJJI.get(Integer.valueOf(i3)) == null)) {
                        this.LJLJJI.put(Integer.valueOf(i3), Boolean.TRUE);
                        this.LJLJJL.LJIILJJIL(this.LJLJJLL, new AqS97S0101000_9(i3, this.LJLJL, 7));
                    }
                }
                if (i3 == i4) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        this.LJLILLLLZI.element = c40517FvF2;
    }

    public C56583MIp(LinearLayoutManager linearLayoutManager, C68322mC c68322mC, java.util.Map map, CommerceMusicLogger commerceMusicLogger, C56588MIu c56588MIu, InterfaceC88471Ynr interfaceC88471Ynr) {
        this.LJLIL = linearLayoutManager;
        this.LJLILLLLZI = c68322mC;
        this.LJLJJI = map;
        this.LJLJJL = commerceMusicLogger;
        this.LJLJJLL = c56588MIu;
        this.LJLJL = interfaceC88471Ynr;
    }
}
