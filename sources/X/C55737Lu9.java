package X;

import androidx.fragment.app.Fragment;
import com.bytedance.ies.ugc.aweme.commercialize.splash.realtimesplash.IRealTimeSplashManager;
import kotlin.jvm.internal.o;

/* renamed from: X.Lu9, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55737Lu9 implements InterfaceC54992Li8 {
    public C54993Li9 LIZ;
    public InterfaceC55739LuB LIZIZ;
    public Fragment LIZJ;
    public final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C55740LuC.LJLIL);

    /* JADX WARN: Code restructure failed: missing block: B:96:0x005b, code lost:
    
        if (r1.LJIJJLI(r0, false) == false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIZI() {
        /*
            Method dump skipped, instructions count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55737Lu9.LJJIIZI():void");
    }

    public final IRealTimeSplashManager LJJIJ() {
        Object value = this.LIZLLL.getValue();
        o.LJIIIIZZ(value, "<get-realTimeSplashManager>(...)");
        return (IRealTimeSplashManager) value;
    }

    public final void LJJIJIIJI() {
        Fragment fragment = this.LIZJ;
        if (fragment != null) {
            ActivityC45651qj mo49getActivity = fragment.mo49getActivity();
            if (mo49getActivity != null) {
                LPY.LIZ(mo49getActivity).LJLJJI.setValue(Boolean.FALSE);
            }
            C55511LqV.LIZLLL = null;
            C55511LqV.LJ = null;
            return;
        }
        o.LJIJI("fragment");
        throw null;
    }

    @Override // X.InterfaceC54992Li8
    public final void onPause() {
        LJJIJ().release();
        LJJIJ().LIZIZ(false);
    }

    @Override // X.InterfaceC54992Li8
    public final void LJII() {
        LJJIIZI();
    }

    @Override // X.InterfaceC54992Li8
    public final void onResume() {
        LJJIIZI();
    }

    @Override // X.InterfaceC48872JGa
    public final void init(JGV adSceneDepend) {
        o.LJIIIZ(adSceneDepend, "adSceneDepend");
        C54993Li9 c54993Li9 = (C54993Li9) adSceneDepend;
        this.LIZ = c54993Li9;
        InterfaceC48875JGd interfaceC48875JGd = c54993Li9.LIZ;
        o.LJII(interfaceC48875JGd, "null cannot be cast to non-null type com.bytedance.ies.ugc.aweme.commercialize.scene.api.feed_recommend.IFeedRecommendFragmentAdSceneCallBack");
        this.LIZIZ = (InterfaceC55739LuB) interfaceC48875JGd;
        C54993Li9 c54993Li92 = this.LIZ;
        if (c54993Li92 != null) {
            Fragment fragment = c54993Li92.LIZIZ;
            if (fragment != null) {
                this.LIZJ = fragment;
                return;
            } else {
                o.LJIJI("fragment");
                throw null;
            }
        }
        o.LJIJI("feedRecommendFragmentAdDepend");
        throw null;
    }
}
