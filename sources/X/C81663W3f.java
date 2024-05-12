package X;

import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.sticker.favorite.FavoriteSticker;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.AqS189S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.W3f, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C81663W3f extends ESP implements TGM, TGT {
    public InterfaceC81664W3g LJLILLLLZI;
    public boolean LJLJI;
    public Effect LJLJJI;
    public final C29S LJLJJL;
    public final THX LJLJJLL;
    public final TEZ LJLJL;
    public final InterfaceC74343TFr LJLJLJ;
    public final InterfaceC78118UlG LJLJLLL;
    public final InterfaceC88471Ynr<Effect, Boolean, C76800UCe> LJLL;
    public final InterfaceC88472Yns<Effect, Boolean> LJLLI;
    public final InterfaceC65784Pro<TGD> LJLLILLLL;

    @Override // X.TGM
    public final void LJI() {
    }

    @Override // X.TGM
    public final void LJII(IDK state) {
        o.LJIIIZ(state, "state");
    }

    @Override // X.ESP
    public boolean LJIIJ(T4Q session) {
        o.LJIIIZ(session, "session");
        return true;
    }

    @Override // X.ESP
    public final void LJIIJJI() {
        this.LJLJJI = null;
        InterfaceC81664W3g interfaceC81664W3g = this.LJLILLLLZI;
        if (interfaceC81664W3g != null) {
            LJIILIIL(interfaceC81664W3g, false);
            interfaceC81664W3g.LIZIZ(null);
        }
    }

    @Override // X.TGT
    public final void LLIIIL() {
        InterfaceC81664W3g interfaceC81664W3g = this.LJLILLLLZI;
        if (interfaceC81664W3g != null) {
            LJIILIIL(interfaceC81664W3g, false);
        }
    }

    @Override // X.TGT
    public final void LLIIIZ() {
        InterfaceC81664W3g interfaceC81664W3g = this.LJLILLLLZI;
        if (interfaceC81664W3g != null) {
            LJIILIIL(interfaceC81664W3g, true);
        }
    }

    @Override // X.TGT
    public final boolean LLIIIJ() {
        return this.LJLJI;
    }

    @Override // X.TGM
    public final void LIZ(View stickerView) {
        o.LJIIIZ(stickerView, "stickerView");
        this.LJLILLLLZI = LJIILL(stickerView);
    }

    @Override // X.TGM
    public final void LIZJ(IDK state) {
        o.LJIIIZ(state, "state");
        if (!LJIILJJIL(this.LJLJJI, new AqS164S0100000_14(this, 383)) && state == IDK.AFTER_ANIMATE) {
            if (this.LJLJJI != null && !this.LJLJI && this.LJLJL.LJJJJLI()) {
                LLIIIZ();
            }
            InterfaceC81664W3g interfaceC81664W3g = this.LJLILLLLZI;
            if (interfaceC81664W3g != null) {
                interfaceC81664W3g.LIZIZ(this.LJLJJI);
            }
        }
    }

    public InterfaceC81664W3g LJIILL(View stickerView) {
        o.LJIIIZ(stickerView, "stickerView");
        C29S c29s = this.LJLJJL;
        TEZ tez = this.LJLJL;
        InterfaceC74343TFr interfaceC74343TFr = this.LJLJLJ;
        THX thx = this.LJLJJLL;
        View findViewById = stickerView.findViewById(R.id.fm_);
        o.LJIIIIZZ(findViewById, "stickerView.findViewById(R.id.layout_sticker_like)");
        View findViewById2 = stickerView.findViewById(R.id.ek2);
        o.LJIIIIZZ(findViewById2, "stickerView.findViewById(R.id.img_sticker_like)");
        return new FavoriteSticker(c29s, tez, interfaceC74343TFr, thx, (FrameLayout) findViewById, (C81658W3a) findViewById2, this.LJLJLLL, this.LJLLILLLL, this.LJLL);
    }

    @Override // X.ESP
    public final void LJIIL(ERS result, T4Q session) {
        InterfaceC81664W3g interfaceC81664W3g;
        o.LJIIIZ(result, "result");
        o.LJIIIZ(session, "session");
        if (C78866UxK.LJJJJLL(this.LJLJL, session.LIZ)) {
            return;
        }
        Effect effect = session.LIZ;
        this.LJLJJI = effect;
        if (LJIILJJIL(effect, new AqS164S0100000_14(this, 384))) {
            return;
        }
        if (session.LIZJ == EnumC44267HYx.UI_CLICK) {
            this.LJLJL.LJIJJ(true);
        }
        if (this.LJLJL.LJJJJLI() && (interfaceC81664W3g = this.LJLILLLLZI) != null) {
            LJIILIIL(interfaceC81664W3g, true);
            interfaceC81664W3g.LIZIZ(session.LIZ);
        }
    }

    public final void LJIILIIL(InterfaceC81664W3g interfaceC81664W3g, boolean z) {
        this.LJLJI = z;
        interfaceC81664W3g.LIZ(z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        if (new org.json.JSONObject(r2).optBoolean("forbid_favorite") == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        if (r1 != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0035, code lost:
    
        if (r6 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIILJJIL(com.ss.android.ugc.effectmanager.effect.model.Effect r6, X.InterfaceC65784Pro<X.C76800UCe> r7) {
        /*
            r5 = this;
            X.Yns<com.ss.android.ugc.effectmanager.effect.model.Effect, java.lang.Boolean> r0 = r5.LJLLI
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L34
            if (r6 == 0) goto L3b
            java.lang.Object r0 = r0.invoke(r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L34
            r1 = 1
        L15:
            java.lang.String r2 = r6.getExtra()
            if (r2 == 0) goto L38
            int r0 = r2.length()
            if (r0 <= 0) goto L38
            if (r1 != 0) goto L30
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>(r2)
            java.lang.String r0 = "forbid_favorite"
            boolean r0 = r1.optBoolean(r0)
            if (r0 == 0) goto L3b
        L30:
            r7.invoke()
            return r4
        L34:
            r1 = 0
            if (r6 == 0) goto L38
            goto L15
        L38:
            if (r1 == 0) goto L3b
            goto L30
        L3b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C81663W3f.LJIILJJIL(com.ss.android.ugc.effectmanager.effect.model.Effect, X.Pro):boolean");
    }

    public C81663W3f(C29S activity, THX thx, TEZ stickerDataManager, InterfaceC74343TFr stickerMobHelper, InterfaceC78118UlG interfaceC78118UlG, AqS189S0100000_7 aqS189S0100000_7, AqS173S0100000_7 aqS173S0100000_7, InterfaceC65784Pro interfaceC65784Pro, int i) {
        aqS189S0100000_7 = (i & 32) != 0 ? null : aqS189S0100000_7;
        aqS173S0100000_7 = (i & 64) != 0 ? null : aqS173S0100000_7;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(stickerDataManager, "stickerDataManager");
        o.LJIIIZ(stickerMobHelper, "stickerMobHelper");
        this.LJLJJL = activity;
        this.LJLJJLL = thx;
        this.LJLJL = stickerDataManager;
        this.LJLJLJ = stickerMobHelper;
        this.LJLJLLL = interfaceC78118UlG;
        this.LJLL = aqS189S0100000_7;
        this.LJLLI = aqS173S0100000_7;
        this.LJLLILLLL = interfaceC65784Pro;
    }
}
