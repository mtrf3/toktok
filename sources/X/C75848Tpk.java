package X;

import Y.IDcS172S0100000_13;
import Y.IDcS17S0300000_13;
import com.bytedance.android.live.design.app.LiveDialog;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.AqS179S0100000_13;

/* renamed from: X.Tpk, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75848Tpk extends AbstractC75856Tps {
    public static final /* synthetic */ int LIZJ = 0;
    public final C75841Tpd LIZIZ;

    @Override // X.InterfaceC75855Tpr
    public final void show() {
        String str;
        C34K c34k = new C34K();
        C34K c34k2 = new C34K();
        C39471gl c39471gl = new C39471gl();
        c39471gl.LIZ = C15380j0.LJIILJJIL(R.string.kk5);
        c39471gl.LIZJ = new IDcS17S0300000_13(c34k2, this, c34k, 5);
        C39481gm c39481gm = new C39481gm(c39471gl);
        C39491gn c39491gn = new C39491gn();
        c39491gn.LIZ = C15380j0.LJIILJJIL(R.string.kk6);
        c39491gn.LIZJ = new IDcS172S0100000_13(c34k2, 15);
        C39501go c39501go = new C39501go(c39491gn);
        AnonymousClass175 anonymousClass175 = new AnonymousClass175();
        anonymousClass175.LIZ(c39481gm);
        anonymousClass175.LIZ(c39501go);
        AnonymousClass176 anonymousClass176 = new AnonymousClass176(anonymousClass175);
        C47071t1 c47071t1 = new C47071t1(this.LIZIZ.LIZ);
        c47071t1.LJIILLIIL(R.string.kk8);
        c47071t1.LJFF(R.string.kk7);
        c47071t1.LIZJ(anonymousClass176);
        c47071t1.LJIILL = false;
        C75841Tpd c75841Tpd = this.LIZIZ;
        if (c75841Tpd.LIZIZ == 2 && c75841Tpd.LIZJ != 2) {
            c34k2.element = true;
            c47071t1.LJIJI = new C75947TrL(new AqS179S0100000_13(c34k, 388));
        }
        C75642TmQ c75642TmQ = C75642TmQ.LIZ;
        boolean z = c34k2.element;
        HashMap hashMap = new HashMap();
        C75642TmQ.LJIIL(null, hashMap);
        C75642TmQ.LJIILJJIL(hashMap);
        if (B5G.LIZIZ().LJFF != 0) {
            hashMap.put("channel_id", String.valueOf(B5G.LIZIZ().LJFF));
        }
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_dont_suggest_again_show", str);
        C75642TmQ.LIZ(hashMap);
        C75642TmQ.LJIIZILJ(c75642TmQ, hashMap);
        C75642TmQ.LJIJ(hashMap);
        C75545Tkr.LIZJ(hashMap, B5G.LIZIZ().LJIIJ, true);
        C75642TmQ.LJIILLIIL(hashMap, B5G.LIZIZ().LJJII, B5G.LIZIZ().LJJIII, B5G.LIZIZ().LJIIJ, B5G.LIZIZ().LJJJLL);
        C75642TmQ.LJJLIIJ("livesdk_disconnect_connection_popup_show", hashMap);
        LiveDialog LIZ = c47071t1.LIZ();
        this.LIZ = LIZ;
        C16880lQ.LIZ(LIZ);
    }

    public C75848Tpk(C75841Tpd c75841Tpd) {
        this.LIZIZ = c75841Tpd;
    }
}
