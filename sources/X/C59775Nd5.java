package X;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* renamed from: X.Nd5, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59775Nd5 implements NQH {
    public final ViewGroup LIZ;
    public Aweme LIZIZ;
    public long LIZJ;
    public int LJ;
    public C60193Njp LJFF;
    public SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LJI;
    public boolean LJII;
    public InterfaceC40516FvE LJIIIIZZ;
    public long LIZLLL = 1;
    public final List<InterfaceC59776Nd6> LJIIIZ = new ArrayList();

    public final String LIZLLL() {
        String aid;
        Aweme aweme = this.LIZIZ;
        if (aweme == null || (aid = aweme.getAid()) == null) {
            return "";
        }
        return aid;
    }

    @Override // X.NQH
    public final void LJJJJLI() {
        LJFF(this, "play");
        this.LJ = 1;
    }

    @Override // X.NQH
    public final boolean isPlaying() {
        if (this.LJ == 1) {
            return true;
        }
        return false;
    }

    @Override // X.NQH
    public final void pausePlayer() {
        LJFF(this, "pause");
        this.LJ = 2;
    }

    @Override // X.NQH
    public final void show() {
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        Aweme aweme = this.LIZIZ;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && !awemeRawAd.isReshowAd()) {
            Aweme aweme2 = this.LIZIZ;
            if (aweme2 != null) {
                awemeRawAd2 = aweme2.getAwemeRawAd();
            } else {
                awemeRawAd2 = null;
            }
            C58704N2e.LIZLLL("draw_ad", "dc_show_success", awemeRawAd2).LJI();
        }
    }

    @Override // X.NQH
    public final void stopPlayer() {
        LJFF(this, "stop");
        this.LJ = 3;
        this.LIZJ = 0L;
    }

    @Override // X.NQH
    public final long getCurrentPosition() {
        return this.LIZJ;
    }

    @Override // X.NQH
    public final long getDuration() {
        return this.LIZLLL;
    }

    public C59775Nd5(ViewGroup viewGroup) {
        this.LIZ = viewGroup;
    }

    @Override // X.NQH
    public final void LIZ(C46319IFv c46319IFv) {
        ((ArrayList) this.LJIIIZ).remove(c46319IFv);
    }

    @Override // X.NQH
    public final void LIZIZ(Aweme aweme) {
        FrameLayout frameLayout;
        ViewGroup viewGroup;
        if (aweme == null) {
            return;
        }
        this.LIZIZ = aweme;
        if ((this.LIZ.getChildAt(0) instanceof C60193Njp) || (this.LIZ.getChildAt(0) instanceof SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS)) {
            C16880lQ.LLIFFJFJJ(0, this.LIZ);
            this.LJFF = null;
            this.LJI = null;
            this.LJIIIIZZ = null;
        }
        C59201NLh LJFF = C59198NLe.LJFF(LIZLLL());
        if (LJFF == null || LJFF.LIZJ != 1) {
            return;
        }
        if (LJFF.LJFF) {
            frameLayout = LJFF.LJ;
        } else {
            frameLayout = LJFF.LIZLLL;
        }
        if (frameLayout == null) {
            return;
        }
        if (frameLayout.getParent() != null) {
            ViewParent parent = frameLayout.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                C16880lQ.LJLLL(frameLayout, viewGroup);
            }
        }
        if (LJFF.LJFF) {
            this.LJI = LJFF.LJ;
            this.LJII = true;
        } else {
            this.LJFF = LJFF.LIZLLL;
            this.LJIIIIZZ = LJFF.LJI;
        }
        long j = LJFF.LJII;
        if (j <= 0) {
            j = 1;
        }
        this.LIZLLL = j;
        ViewGroup viewGroup2 = this.LIZ;
        if (viewGroup2 instanceof FrameLayout) {
            viewGroup2.addView(frameLayout, 0, new FrameLayout.LayoutParams(-1, -1, 17));
        } else {
            if (viewGroup2 instanceof RelativeLayout) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.addRule(13, -1);
                this.LIZ.addView(frameLayout, 0, layoutParams);
                return;
            }
            viewGroup2.addView(frameLayout, 0, new ViewGroup.LayoutParams(-1, -1));
        }
    }

    @Override // X.NQH
    public final void LIZJ(C46319IFv c46319IFv) {
        ((ArrayList) this.LJIIIZ).add(c46319IFv);
    }

    public final void LJ(InterfaceC88472Yns<? super InterfaceC59776Nd6, C76800UCe> interfaceC88472Yns) {
        Iterator it = ((ArrayList) this.LJIIIZ).iterator();
        while (it.hasNext()) {
            interfaceC88472Yns.invoke(it.next());
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onDynamicAdStatusEvent(C40495Fut event) {
        int i;
        JSONObject jSONObject;
        InterfaceC60761Nsz kitView;
        o.LJIIIZ(event, "event");
        int i2 = event.LJLIL;
        C60193Njp c60193Njp = this.LJFF;
        int i3 = 0;
        if (c60193Njp != null) {
            i = c60193Njp.hashCode();
        } else {
            i = 0;
        }
        if (i2 != i) {
            int i4 = event.LJLIL;
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJI;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView()) != null) {
                i3 = kitView.hashCode();
            }
            if (i4 != i3) {
                return;
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onDynamicAdStatusEvent, type: ");
        LIZ.append(event.LJLILLLLZI);
        LIZ.append(", params: ");
        LIZ.append(event.LJLJI);
        String msg = X1D.LIZIZ(LIZ);
        if (o.LJ(event.LJLILLLLZI, "updateTime")) {
            o.LJIIIZ(msg, "msg");
        } else {
            FDL.LIZ(msg);
        }
        String str = event.LJLILLLLZI;
        switch (str.hashCode()) {
            case -934426579:
                if (!str.equals("resume")) {
                    return;
                }
                LJ(new AqS176S0100000_10(this, 225));
                return;
            case -599445191:
                if (!str.equals("complete")) {
                    return;
                }
                LJ(new AqS176S0100000_10(this, 227));
                return;
            case -295931082:
                if (!str.equals("updateTime") || (jSONObject = event.LJLJI) == null) {
                    return;
                }
                this.LIZJ = (long) jSONObject.optDouble("time");
                LJ(new AqS176S0100000_10(this, 228));
                return;
            case 106440182:
                if (!str.equals("pause")) {
                    return;
                }
                LJ(new AqS176S0100000_10(this, 226));
                return;
            case 108386723:
                if (!str.equals("ready")) {
                    return;
                }
                LJ(new AqS176S0100000_10(this, 224));
                return;
            default:
                return;
        }
    }

    public static void LJFF(C59775Nd5 c59775Nd5, String str) {
        InterfaceC60761Nsz kitView;
        InterfaceC40516FvE interfaceC40516FvE;
        c59775Nd5.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sendEventToFe: ");
        LIZ.append(str);
        FDL.LIZ(X1D.LIZIZ(LIZ));
        if (!c59775Nd5.LJII && c59775Nd5.LJFF != null && (interfaceC40516FvE = c59775Nd5.LJIIIIZZ) != null) {
            interfaceC40516FvE.onEvent(new C59778Nd8(str, null));
            return;
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = c59775Nd5.LJI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS == null || (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView()) == null) {
            return;
        }
        kitView.LJIIIZ(str, new C59777Nd7());
    }
}
