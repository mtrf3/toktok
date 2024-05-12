package X;

import com.bytedance.android.live.liveinteract.api.LinkAnchorPermitGuestSuccessEvent;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitResult;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TZG implements InterfaceC75414Tik<PermitResult> {
    public final /* synthetic */ C74842TYw LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;

    @Override // X.InterfaceC75414Tik
    public final void onSuccess(PermitResult value) {
        o.LJIIIZ(value, "value");
        this.LJLIL.LJLJJI.pv0(LinkAnchorPermitGuestSuccessEvent.class);
        int i = this.LJLILLLLZI;
        if (i == 2) {
            C74987Tbr.LIZ("MultiGuestV3AnchorPresenter", "reject apply from guest succ");
            C74842TYw c74842TYw = this.LJLIL;
            long j = this.LJLJI;
            TZK tzk = c74842TYw.LJLJL;
            if (tzk != null) {
                tzk.LJI(j);
                return;
            }
            return;
        }
        if (i != 1) {
            return;
        }
        C74987Tbr.LIZ("MultiGuestV3AnchorPresenter", "permit apply from guest succ");
        this.LJLIL.LJJLIIIJILLIZJL(this.LJLJI, this.LJLJJI, this.LJLJJL);
        C30868C9o.LIZJ(R.string.n9c);
    }

    @Override // X.InterfaceC75414Tik
    public final void LJ(LinkCoreError error, Throwable th) {
        o.LJIIIZ(error, "error");
        int i = this.LJLILLLLZI;
        if (i == 2) {
            this.LJLIL.getClass();
        } else {
            if (i != 1) {
                return;
            }
            this.LJLIL.LJJLIIIJ(th, error, this.LJLJI, this.LJLJJI);
        }
    }

    public TZG(C74842TYw c74842TYw, int i, long j, String str, String str2) {
        this.LJLIL = c74842TYw;
        this.LJLILLLLZI = i;
        this.LJLJI = j;
        this.LJLJJI = str;
        this.LJLJJL = str2;
    }
}
