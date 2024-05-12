package X;

import Y.ACallableS90S0200000_13;
import Y.ALAdapterS10S0100000_13;
import Y.AgS114S0200000_13;
import android.animation.AnimatorSet;
import android.view.View;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import java.util.List;

/* renamed from: X.UZd, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77397UZd {
    public final ActivityC45651qj LIZ;
    public final UgAwemeActivitySetting LIZIZ;
    public UZV LIZJ;
    public final View LIZLLL;
    public int LJ;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public List<Integer> LJIIJJI;
    public int LJFF = 3;
    public int LJI = -1;
    public final C77403UZj LJIIL = new C77403UZj();
    public String LJIILIIL = "";

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0054, code lost:
    
        if (((X.InterfaceC54054LJi) r0).Oe() != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZIZ() {
        /*
            r4 = this;
            X.1qj r0 = r4.LIZ
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = X.LNH.LIZIZ(r0)
            r3 = 0
            r1 = 1
            if (r2 != 0) goto Lb
        La:
            return r3
        Lb:
            com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct r0 = r2.getCommerceVideoAuthInfo()
            if (r0 == 0) goto L18
            boolean r0 = r0.isAvoidGlobalPendant()
            if (r0 != r1) goto L18
            goto La
        L18:
            boolean r0 = r2.isAd()
            if (r0 == 0) goto L31
            boolean r0 = X.C63081OpJ.LJLIL(r2)
            if (r0 == 0) goto La
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r2.getAwemeRawAd()
            if (r0 == 0) goto L31
            int r0 = r0.getAdType()
            if (r0 != r1) goto L31
            goto La
        L31:
            X.1qj r1 = r4.LIZ
            boolean r0 = r1 instanceof X.InterfaceC55058LjC
            java.lang.String r2 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.main.IMainFragment"
            if (r0 == 0) goto L78
            X.LjC r1 = (X.InterfaceC55058LjC) r1
            androidx.fragment.app.Fragment r0 = r1.getCurFragment()
            boolean r0 = r0 instanceof X.InterfaceC54054LJi
            if (r0 == 0) goto L78
            X.1qj r0 = r4.LIZ
            X.LjC r0 = (X.InterfaceC55058LjC) r0
            androidx.fragment.app.Fragment r0 = r0.getCurFragment()
            kotlin.jvm.internal.o.LJII(r0, r2)
            X.LJi r0 = (X.InterfaceC54054LJi) r0
            boolean r0 = r0.Oe()
            if (r0 == 0) goto L78
        L56:
            boolean r0 = r4.LJII
            if (r0 != 0) goto La
            X.1qj r0 = r4.LIZ
            X.LRe r1 = X.LRD.LIZ(r0)
            java.lang.String r0 = "long_press_layer"
            boolean r0 = r1.LIZ(r0)
            if (r0 != 0) goto La
            X.1qj r0 = r4.LIZ
            X.LRe r1 = X.LRD.LIZ(r0)
            java.lang.String r0 = "upload_progress_fragment"
            boolean r0 = r1.LIZ(r0)
            if (r0 != 0) goto La
            r3 = 1
            goto La
        L78:
            X.1qj r1 = r4.LIZ
            boolean r0 = r1 instanceof X.InterfaceC55058LjC
            if (r0 == 0) goto La
            X.LjC r1 = (X.InterfaceC55058LjC) r1
            androidx.fragment.app.Fragment r0 = r1.getCurFragment()
            boolean r0 = r0 instanceof X.InterfaceC54054LJi
            if (r0 == 0) goto La
            X.1qj r0 = r4.LIZ
            X.LjC r0 = (X.InterfaceC55058LjC) r0
            androidx.fragment.app.Fragment r0 = r0.getCurFragment()
            kotlin.jvm.internal.o.LJII(r0, r2)
            X.LJi r0 = (X.InterfaceC54054LJi) r0
            boolean r0 = r0.lj()
            if (r0 == 0) goto La
            boolean r0 = r4.LJIIIIZZ
            if (r0 == 0) goto La
            goto L56
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C77397UZd.LIZIZ():boolean");
    }

    public final void LIZ(boolean z) {
        AbstractC77394UZa abstractC77394UZa;
        UZV uzv;
        AbstractC77394UZa abstractC77394UZa2;
        AbstractC77394UZa abstractC77394UZa3;
        if (LIZIZ()) {
            UZV uzv2 = this.LIZJ;
            if (uzv2 != null && !uzv2.getClosed() && (abstractC77394UZa3 = uzv2.LJLJI) != null) {
                abstractC77394UZa3.LIZLLL();
            }
            UZV uzv3 = this.LIZJ;
            if (uzv3 != null && uzv3.getVisibility() == 0 && z) {
                this.LJ++;
            }
            if (this.LJ >= this.LJFF && (uzv = this.LIZJ) != null && (abstractC77394UZa2 = uzv.LJLJI) != null && abstractC77394UZa2.LJLLJ && !abstractC77394UZa2.LJLLILLLL) {
                if (abstractC77394UZa2.LJLL) {
                    abstractC77394UZa2.LJLJJI.setVisibility(0);
                } else {
                    abstractC77394UZa2.LJLJJI.setVisibility(4);
                }
                abstractC77394UZa2.LJLLILLLL = true;
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playSequentially(abstractC77394UZa2.LJI(false), abstractC77394UZa2.LJFF(false), abstractC77394UZa2.LJ(false));
                animatorSet.addListener(new ALAdapterS10S0100000_13(abstractC77394UZa2, 53));
                animatorSet.start();
                return;
            }
            return;
        }
        UZV uzv4 = this.LIZJ;
        if (uzv4 == null || (abstractC77394UZa = uzv4.LJLJI) == null) {
            return;
        }
        abstractC77394UZa.LJLIL.setVisibility(8);
    }

    public final void LIZJ(ActivityC45651qj activityC45651qj) {
        if (activityC45651qj == null) {
            return;
        }
        C10K.LIZJ(new ACallableS90S0200000_13(this, activityC45651qj, 6)).LJ(new AgS114S0200000_13(this, activityC45651qj, 0), C10K.LJIIIIZZ, null);
    }

    public C77397UZd(View view, ActivityC45651qj activityC45651qj, UgAwemeActivitySetting ugAwemeActivitySetting) {
        this.LIZ = activityC45651qj;
        this.LIZIZ = ugAwemeActivitySetting;
        this.LIZLLL = view;
    }
}
