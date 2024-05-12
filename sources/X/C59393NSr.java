package X;

import Y.ARunnableS29S0200000_10;
import Y.ARunnableS9S0210000_10;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.NSr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59393NSr implements InterfaceC59325NQb {
    public final LinearLayout LJLIL;
    public Aweme LJLILLLLZI;
    public AbstractViewOnClickListenerC59394NSs LJLJI;
    public NQD LJLJJI;
    public RelativeLayout LJLJJL;

    @Override // X.InterfaceC59325NQb
    public final boolean LIZLLL() {
        if (this.LJLIL.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00dc, code lost:
    
        if (r1.getAnimationType() == 2) goto L48;
     */
    @Override // X.InterfaceC59325NQb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ() {
        /*
            Method dump skipped, instructions count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59393NSr.LJIIIZ():void");
    }

    public C59393NSr(LinearLayout linearLayout) {
        this.LJLIL = linearLayout;
    }

    @Override // X.InterfaceC59325NQb
    public final boolean LIZIZ(NSQ nsq) {
        HashMap hashMap;
        if (this.LJLJI == null) {
            return false;
        }
        Aweme aweme = this.LJLILLLLZI;
        if (aweme != null) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("background_type", String.valueOf(awemeRawAd.getNativeCardType()));
                if (hashMap2.size() != 0) {
                    hashMap = new HashMap();
                    hashMap.put("ad_extra_data", GsonProtectorUtils.toJson(new Gson(), hashMap2));
                } else {
                    hashMap = null;
                }
                C55707Ltf c55707Ltf = new C55707Ltf();
                c55707Ltf.LIZ = awemeRawAd;
                c55707Ltf.LJ = hashMap;
                c55707Ltf.LIZJ = false;
                JSONObject LIZ = c55707Ltf.LIZ();
                o.LJIIIIZZ(LIZ, "ExtraJsonBuilder()\n     …                .create()");
                C58776N4y.LIZ("background_ad", "othershow", LIZ, awemeRawAd);
                C58655N0h LIZLLL = C58704N2e.LIZLLL("background_ad", "othershow", awemeRawAd);
                LIZLLL.LIZIZ(String.valueOf(awemeRawAd.getNativeCardType()), "background_type");
                LIZLLL.LIZIZ(0, "is_lynx");
                LIZLLL.LJII();
            }
            this.LJLIL.setAlpha(0.0f);
            RelativeLayout relativeLayout = this.LJLJJL;
            if (relativeLayout != null) {
                relativeLayout.setAlpha(1.0f);
                RelativeLayout relativeLayout2 = this.LJLJJL;
                if (relativeLayout2 != null) {
                    relativeLayout2.animate().alpha(0.0f).setDuration(150L).withEndAction(new ARunnableS29S0200000_10(this, nsq, 45)).start();
                    return true;
                }
                o.LJIJI("widgetContainer");
                throw null;
            }
            o.LJIJI("widgetContainer");
            throw null;
        }
        o.LJIJI("mAweme");
        throw null;
    }

    @Override // X.InterfaceC59325NQb
    public final void LJ(NQD nqd) {
        if (nqd.LIZ != null) {
            Aweme aweme = nqd.LIZIZ;
            if (aweme != null) {
                this.LJLILLLLZI = aweme;
                RelativeLayout relativeLayout = nqd.LJ;
                if (relativeLayout != null) {
                    this.LJLJJL = relativeLayout;
                    this.LJLJJI = nqd;
                    return;
                } else {
                    o.LJIJI("widgetContainer");
                    throw null;
                }
            }
            o.LJIJI("aweme");
            throw null;
        }
        o.LJIJI("context");
        throw null;
    }

    @Override // X.InterfaceC59325NQb
    public final void LIZJ(boolean z, NQ6 nq6) {
        if (this.LJLJI == null) {
            return;
        }
        this.LJLIL.setAlpha(1.0f);
        this.LJLIL.animate().alpha(0.0f).setDuration(150L).withEndAction(new ARunnableS9S0210000_10(nq6, this, z, 3)).start();
        if (!nq6.LIZ()) {
            RelativeLayout relativeLayout = this.LJLJJL;
            if (relativeLayout != null) {
                relativeLayout.setAlpha(0.0f);
                RelativeLayout relativeLayout2 = this.LJLJJL;
                if (relativeLayout2 != null) {
                    relativeLayout2.setVisibility(0);
                    RelativeLayout relativeLayout3 = this.LJLJJL;
                    if (relativeLayout3 != null) {
                        relativeLayout3.animate().alpha(1.0f).setDuration(150L).start();
                        return;
                    } else {
                        o.LJIJI("widgetContainer");
                        throw null;
                    }
                }
                o.LJIJI("widgetContainer");
                throw null;
            }
            o.LJIJI("widgetContainer");
            throw null;
        }
    }
}
