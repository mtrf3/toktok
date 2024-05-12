package X;

import android.os.SystemClock;
import android.view.View;
import com.ss.android.ugc.aweme.ecommercelive.business.player.live.ECLynxLiveView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.SIt, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71875SIt implements InterfaceC32188CkC {
    public final /* synthetic */ ECLynxLiveView LJLIL;

    @Override // X.InterfaceC32188CkC
    public final boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC32188CkC
    public final boolean LIZLLL() {
        return true;
    }

    @Override // X.InterfaceC32188CkC
    public final void LJII(C28272B7s c28272B7s) {
    }

    @Override // X.InterfaceC32188CkC
    public final void LJIIIZ() {
        if (this.LJLIL.LJLLI) {
            this.LJLIL.LJLL = true;
        }
        this.LJLIL.LJJ("play", null);
        this.LJLIL.LJIJJLI(true);
        C36746EbW.LIZ(6, "playing");
    }

    @Override // X.InterfaceC32188CkC
    public final void LLLZL() {
        this.LJLIL.LJJ("firstframe", null);
        if (this.LJLIL.LJLLILLLL > 0 && this.LJLIL.LJLLI) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.LJLIL.LJLLILLLL;
            this.LJLIL.LJLLILLLL = -1L;
            ECLynxLiveView eCLynxLiveView = this.LJLIL;
            String valueOf = String.valueOf(elapsedRealtime);
            EnumC71876SIu enumC71876SIu = EnumC71876SIu.SUCCESS;
            eCLynxLiveView.LJJI("1", valueOf, C113554cx.LJJLIIIIJ(new OSZ("code", Integer.valueOf(enumC71876SIu.getCode())), new OSZ("msg", enumC71876SIu.getMsg())));
        }
        C36746EbW.LIZ(6, "firstFrame");
    }

    public C71875SIt(ECLynxLiveView eCLynxLiveView) {
        this.LJLIL = eCLynxLiveView;
    }

    @Override // X.InterfaceC32188CkC
    public final void LJI(String s) {
        o.LJIIIZ(s, "s");
        this.LJLIL.LJJ("prepared", null);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("playPrepared: ");
        LIZ.append(s);
        C36746EbW.LIZ(6, X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC32188CkC
    public final void LJIIIIZZ(String msg) {
        o.LJIIIZ(msg, "msg");
        this.LJLIL.LJJ("ended", null);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("playCompleted: ");
        LIZ.append(msg);
        C36746EbW.LIZ(6, X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC32188CkC
    public final void LJIIJJI(String str) {
        this.LJLIL.LJJ("sei", C113554cx.LJJLIIIIJ(new OSZ("sei", str)));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("seiUpdate: ");
        LIZ.append(str);
        C36746EbW.LIZ(6, X1D.LIZIZ(LIZ));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.ss.android.ugc.aweme.ecommercelive.business.player.live.ECLynxLiveView] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    @Override // X.InterfaceC32188CkC
    public final void LJIIL(String error) {
        ?? r5;
        Object obj = "code";
        o.LJIIIZ(error, "error");
        try {
            JSONObject jSONObject = new JSONObject(error);
            obj = C113554cx.LJJLIIIIJ(new OSZ("code", Integer.valueOf(jSONObject.optInt("error_code"))), new OSZ("msg", jSONObject.optString("error_description")));
            r5 = obj;
        } catch (Throwable unused) {
            EnumC71876SIu enumC71876SIu = EnumC71876SIu.DATA_ERROR;
            r5 = C113554cx.LJJLIIIIJ(new OSZ(obj, Integer.valueOf(enumC71876SIu.getCode())), new OSZ("msg", enumC71876SIu.getMsg()));
        }
        if (this.LJLIL.LJLLILLLL > 0 && this.LJLIL.LJLLI) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.LJLIL.LJLLILLLL;
            this.LJLIL.LJLLILLLL = -1L;
            this.LJLIL.LJJI(CardStruct.IStatusCode.DEFAULT, String.valueOf(elapsedRealtime), r5);
        }
        C36746EbW.LIZ(6, "playerMediaError: ".concat(error));
    }

    @Override // X.InterfaceC32188CkC
    public final void LIZJ(EnumC79342VBy message, Object obj) {
        o.LJIIIZ(message, "message");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onPlayerMessage: ");
        LIZ.append(message.name());
        C36746EbW.LIZ(6, X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC32188CkC
    public final void LJIIJ(int i, int i2, View view) {
        C36746EbW.LIZ(6, "onVideoSizeChange: video size changed");
    }
}
