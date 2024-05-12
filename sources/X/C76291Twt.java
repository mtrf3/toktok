package X;

import Y.ARunnableS49S0100000_13;
import com.bytedance.android.live.liveinteract.api.event.TwoMatchCutShortEvent;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchReDesignAnchorSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Twt, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76291Twt<T> implements InterfaceC64592gB {
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLIL;
    public final /* synthetic */ C76279Twh LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ boolean LJLJJL;

    public C76291Twt(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, C76279Twh c76279Twh, int i, boolean z, boolean z2) {
        this.LJLIL = interfaceC65784Pro;
        this.LJLILLLLZI = c76279Twh;
        this.LJLJI = i;
        this.LJLJJI = z;
        this.LJLJJL = z2;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLIL;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        C76279Twh c76279Twh = this.LJLILLLLZI;
        c76279Twh.LJI = false;
        if (c76279Twh.LIZLLL == 0) {
            return;
        }
        c76279Twh.LJJIJL(this.LJLJI, this.LJLJJI);
        if (this.LJLJJL && this.LJLJI == 104 && LiveMatchReDesignAnchorSetting.INSTANCE.isEnabled()) {
            int i = -1;
            if (!C76265TwT.LIZ.LJJIFFI && this.LJLJJI) {
                C0NB.LJIIIZ("TwoMatchViewAnchorPrese", "post TwoMatchCutShortEvent");
                DataChannel LJI = this.LJLILLLLZI.LJI();
                if (LJI != null) {
                    InterfaceC76313TxF interfaceC76313TxF = (InterfaceC76313TxF) this.LJLILLLLZI.LIZLLL;
                    if (interfaceC76313TxF != null) {
                        i = interfaceC76313TxF.LJLJJL();
                    }
                    LJI.qv0(TwoMatchCutShortEvent.class, new C76349Txp(i, false));
                }
            } else {
                C0NB.LJIIIZ("TwoMatchViewAnchorPrese", "post TwoMatchCutShortEvent");
                DataChannel LJI2 = this.LJLILLLLZI.LJI();
                if (LJI2 != null) {
                    InterfaceC76313TxF interfaceC76313TxF2 = (InterfaceC76313TxF) this.LJLILLLLZI.LIZLLL;
                    if (interfaceC76313TxF2 != null) {
                        i = interfaceC76313TxF2.LJLJJL();
                    }
                    LJI2.qv0(TwoMatchCutShortEvent.class, new C76349Txp(i, true));
                }
            }
        }
        boolean z = this.LJLJJL;
        boolean z2 = this.LJLJJI;
        JSONObject jSONObject = new JSONObject();
        C76272Twa c76272Twa = C76272Twa.LIZ;
        c76272Twa.LJIIL(th, jSONObject);
        C05630Jz.LJI(jSONObject, "cut_short", String.valueOf(z ? 1 : 0));
        C05630Jz.LJI(jSONObject, "other_left", String.valueOf(z2 ? 1 : 0));
        C05630Jz.LJFF(jSONObject, "cost", System.currentTimeMillis() - C76272Twa.LJIIIZ);
        C76272Twa.LJIJJ(jSONObject, false);
        C76272Twa.LJJJLIIL(c76272Twa, "battle_finish_failed", jSONObject, false, null, 48);
        C0NB.LJIIIZ("TwoMatchViewAnchorPrese", "finish, failed");
        if (!this.LJLJJL) {
            C76279Twh c76279Twh2 = this.LJLILLLLZI;
            c76279Twh2.LJIIJ.postDelayed(new ARunnableS49S0100000_13(c76279Twh2, 100), 1000L);
        }
        C76279Twh c76279Twh3 = this.LJLILLLLZI;
        o.LJI(th);
        c76279Twh3.LJIIIIZZ(th);
    }
}
