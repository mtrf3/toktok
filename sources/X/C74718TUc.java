package X;

import com.bytedance.android.live.network.response.BaseResponse;
import kotlin.jvm.internal.o;

/* renamed from: X.TUc, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74718TUc<T> implements InterfaceC64592gB {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ int LJLJI = 1;
    public final /* synthetic */ String LJLJJI;

    public C74718TUc(long j, String str, String str2) {
        this.LJLIL = j;
        this.LJLILLLLZI = str;
        this.LJLJJI = str2;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        InterfaceC75441TjB R6;
        U8H LJJZZI;
        long LIZIZ = C31012CFc.LIZIZ() - this.LJLIL;
        String str = ((BaseResponse) obj).LIZIZ;
        o.LJIIIIZZ(str, "it.logId");
        C74824TYe.LJJLIIIJJIZ(LIZIZ, "update_setting", str, this.LJLILLLLZI);
        if (this.LJLJI == 1 && (R6 = C8E.LJ().R6()) != null && (LJJZZI = R6.LJJZZI()) != null) {
            LJJZZI.A1(this.LJLJJI, true);
        }
    }
}
