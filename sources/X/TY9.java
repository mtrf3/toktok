package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.DirectJoinResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TY9 implements InterfaceC75414Tik<DirectJoinResult> {
    public final /* synthetic */ TY7 LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ int LJLJJI;

    @Override // X.InterfaceC75414Tik
    public final void onSuccess(DirectJoinResult value) {
        o.LJIIIZ(value, "value");
        this.LJLIL.LJII(this.LJLJJI, this.LJLILLLLZI, this.LJLJI);
    }

    @Override // X.InterfaceC75414Tik
    public final void LJ(LinkCoreError error, Throwable th) {
        o.LJIIIZ(error, "error");
        this.LJLIL.LJI(this.LJLILLLLZI, this.LJLJI, error);
    }

    public TY9(TY7 ty7, long j, long j2, int i) {
        this.LJLIL = ty7;
        this.LJLILLLLZI = j;
        this.LJLJI = j2;
        this.LJLJJI = i;
    }
}
