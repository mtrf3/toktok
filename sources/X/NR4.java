package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes11.dex */
public class NR4 implements NIT, InterfaceC59118NIc {
    public final NRC LIZ;
    public final InterfaceC59118NIc LIZIZ;
    public View LIZJ;
    public Aweme LIZLLL;

    @Override // X.InterfaceC59118NIc
    public final InterfaceC65784Pro<Long> LIZJ() {
        return this.LIZIZ.LIZJ();
    }

    @Override // X.InterfaceC59118NIc
    public final void LJ(String str) {
        this.LIZIZ.LJ(str);
    }

    @Override // X.InterfaceC59118NIc
    public final void LJIIIIZZ(InterfaceC65784Pro<Long> interfaceC65784Pro) {
        this.LIZIZ.LJIIIIZZ(interfaceC65784Pro);
    }

    @Override // X.InterfaceC59118NIc
    public final View LJIILIIL() {
        return this.LIZIZ.LJIILIIL();
    }

    @Override // X.InterfaceC59118NIc
    public final void LJIILJJIL() {
        this.LIZIZ.LJIILJJIL();
    }

    @Override // X.InterfaceC59118NIc
    public final InterfaceC88471Ynr<String, String, C76800UCe> LJIILL() {
        return this.LIZIZ.LJIILL();
    }

    @Override // X.InterfaceC59118NIc
    public final void LJIILLIIL(InterfaceC65784Pro<Long> interfaceC65784Pro) {
        this.LIZIZ.LJIILLIIL(interfaceC65784Pro);
    }

    @Override // X.InterfaceC59118NIc
    public final void LJIJI(InterfaceC88471Ynr<? super String, ? super String, C76800UCe> interfaceC88471Ynr) {
        this.LIZIZ.LJIJI(interfaceC88471Ynr);
    }

    @Override // X.InterfaceC59118NIc
    public final boolean LJIJJ() {
        return this.LIZIZ.LJIJJ();
    }

    @Override // X.InterfaceC59118NIc
    public final InterfaceC65784Pro<Long> getDuration() {
        return this.LIZIZ.getDuration();
    }

    @Override // X.InterfaceC59118NIc
    public final InterfaceC65784Pro<C59079NGp> getTracker() {
        return this.LIZIZ.getTracker();
    }

    @Override // X.InterfaceC59118NIc
    public final void setTracker(InterfaceC65784Pro<C59079NGp> interfaceC65784Pro) {
        this.LIZIZ.setTracker(interfaceC65784Pro);
    }

    @Override // X.NIT
    public final View LIZIZ() {
        return this.LIZJ;
    }

    @Override // X.NIT
    public final Aweme getAweme() {
        return this.LIZLLL;
    }

    public NR4(NRC omsdkService) {
        C59081NGr c59081NGr = new C59081NGr();
        o.LJIIIZ(omsdkService, "omsdkService");
        this.LIZ = omsdkService;
        this.LIZIZ = c59081NGr;
        C16880lQ.LJLLJ(getClass());
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.NRF LJIJJLI(com.ss.android.ugc.aweme.feed.model.Aweme r10) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NR4.LJIJJLI(com.ss.android.ugc.aweme.feed.model.Aweme):X.NRF");
    }

    public View LJIL(Activity activity) {
        return activity.findViewById(R.id.j7n);
    }

    @Override // X.NIT
    public final void LIZLLL(Context context, Aweme aweme) {
        this.LIZ.LJIIIIZZ(context, LJIJJLI(aweme));
    }

    @Override // X.NIT
    public final void LJIIIZ(View view, Aweme aweme) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(aweme, "aweme");
        this.LIZJ = view;
        this.LIZLLL = aweme;
    }

    @Override // X.NIT
    public final void LJIJ(Context context, Aweme aweme) {
        List list;
        NRF LJIJJLI = LJIJJLI(aweme);
        this.LIZ.LIZIZ(this.LIZIZ);
        this.LIZ.LJIIL(context, LJIJJLI);
        if (!NNV.LIZLLL(aweme)) {
            return;
        }
        NRC nrc = this.LIZ;
        if (C59269NNx.LIZLLL(aweme).length() == 0 || C59269NNx.LJ(aweme).length() == 0) {
            list = C61878OQg.INSTANCE;
        } else {
            try {
                String LIZLLL = C59269NNx.LIZLLL(aweme);
                String LJ = C59269NNx.LJ(aweme);
                String LJFF = C59269NNx.LJFF(aweme);
                if (LJFF.length() == 0) {
                    LJFF = "placementId=1&placementName=test";
                }
                if (s.LJJJLZIJ(LJFF, "{TS}", false) || s.LJJJLZIJ(LJFF, "__TS__", false)) {
                    String valueOf = String.valueOf(System.currentTimeMillis());
                    LJFF = ujb.o.LJJJJZ(ujb.o.LJJJJZ(LJFF, "{TS}", valueOf, false), "__TS__", valueOf, false);
                }
                list = C47261Igj.LJJIJ(new NRM(LIZLLL, LJ, LJFF));
            } catch (MalformedURLException e) {
                C78983UzD.LJIIZILJ(e);
                list = C61878OQg.INSTANCE;
            }
        }
        nrc.LJII(context, list, LJIJJLI);
    }

    public final List<View> LJJ(Context context, View adView) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(adView, "adView");
        Activity LJIILL = C78949Uyf.LJIILL(context);
        if (LJIILL == null) {
            return C61878OQg.INSTANCE;
        }
        View rootView = LJIILL.getWindow().getDecorView().findViewById(android.R.id.content);
        int LJIIIZ = KL2.LJIIIZ(LJIILL);
        int LJIIJJI = KL2.LJIIJJI(LJIILL);
        o.LJIIIIZZ(rootView, "rootView");
        List<View> LIZJ = C59269NNx.LIZJ(LJIIIZ, LJIIJJI, rootView);
        ArrayList arrayList = (ArrayList) LIZJ;
        arrayList.remove(adView);
        View LJIL = LJIL(LJIILL);
        if (LJIL != null) {
            arrayList.removeAll(C59269NNx.LIZJ(LJIIIZ, LJIIJJI, LJIL));
        }
        return LIZJ;
    }

    @Override // X.NIT
    public final void LIZ(Context context, View view, Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(view, "view");
        this.LIZ.LIZLLL(context, LJIJJLI(aweme));
    }

    @Override // X.NIT
    public final void LJFF(Context context, View view, Aweme aweme) {
        this.LIZ.LJIIIZ(LJIJJLI(aweme), view, LJJ(context, view));
    }

    @Override // X.NIT
    public void LJIIJJI(Context context, View view, Aweme aweme) {
        o.LJIIIZ(context, "context");
        this.LIZ.LJIIIIZZ(context, LJIJJLI(aweme));
    }

    @Override // X.NIT
    public void LJII(int i, Context context, View view, Aweme aweme) {
        o.LJIIIZ(context, "context");
        this.LIZ.LIZJ(LJIJJLI(aweme), context, i);
    }

    @Override // X.NIT
    public void LJIIJ(int i, Context context, View view, Aweme aweme) {
        o.LJIIIZ(context, "context");
        this.LIZ.LJI(LJIJJLI(aweme), context, i);
    }

    @Override // X.NIT
    public final void LJIIL(int i, Context context, View view, Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(view, "view");
        this.LIZ.LJFF(LJIJJLI(aweme), context, i);
    }

    @Override // X.NIT
    public void LJIIZILJ(int i, Context context, View view, Aweme aweme) {
        this.LIZ.LJIIJ(LJIJJLI(aweme), context, i, view);
    }
}
