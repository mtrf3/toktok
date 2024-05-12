package X;

import com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.commentfilter.subadapters.dislike.PermissionSettingItemViewModel;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.commentfilter.subadapters.dislike.PermissionSettingSheet;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS41S0210000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.SLi, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71942SLi extends SLJ {
    public final /* synthetic */ PermissionSettingSheet LJLL;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C71942SLi(com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.commentfilter.subadapters.dislike.PermissionSettingSheet r6) {
        /*
            r5 = this;
            r5.LJLL = r6
            android.content.Context r0 = r6.getContext()
            kotlin.jvm.internal.o.LJI(r0)
            r5.<init>(r0)
            X.SL4 r1 = new X.SL4
            r1.<init>()
            r0 = 1
            r1.LJIILLIIL = r0
            boolean r0 = r6.LJLILLLLZI
            r5.LLFZ(r1, r0)
            r0 = 2131826362(0x7f1116ba, float:1.9285606E38)
            X.AbstractC71913SKf.LIZJ(r1, r0)
            boolean r0 = r6.LJLILLLLZI
            if (r0 != 0) goto L2c
            r0 = 2131826363(0x7f1116bb, float:1.9285608E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.LJ = r0
        L2c:
            X.SKZ r0 = r1.LIZ()
            r5.LJLLLLLL(r0)
            X.SL4 r1 = new X.SL4
            r1.<init>()
            r0 = 2
            r1.LJIILLIIL = r0
            r2 = 0
            r5.LLFZ(r1, r2)
            r0 = 2131826364(0x7f1116bc, float:1.928561E38)
            X.AbstractC71913SKf.LIZJ(r1, r0)
            boolean r0 = r6.LJLILLLLZI
            if (r0 != 0) goto L52
            r0 = 2131826365(0x7f1116bd, float:1.9285612E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.LJ = r0
        L52:
            X.SKZ r0 = r1.LIZ()
            r5.LJLLLLLL(r0)
            X.SL4 r1 = new X.SL4
            r1.<init>()
            r0 = 3
            r1.LJIILLIIL = r0
            r5.LLFZ(r1, r2)
            r0 = 2131826366(0x7f1116be, float:1.9285614E38)
            X.AbstractC71913SKf.LIZJ(r1, r0)
            boolean r0 = r6.LJLILLLLZI
            if (r0 != 0) goto L77
            r0 = 2131826367(0x7f1116bf, float:1.9285616E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.LJ = r0
        L77:
            X.SKZ r0 = r1.LIZ()
            r5.LJLLLLLL(r0)
            com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.commentfilter.subadapters.dislike.PermissionSettingItemViewModel r0 = r6.LJLJJI
            r4 = 0
            java.lang.String r3 = "viewModel"
            if (r0 == 0) goto La6
            androidx.lifecycle.MutableLiveData<java.lang.Integer> r2 = r0.LJLJI
            Y.AObserverS80S0100000_12 r1 = new Y.AObserverS80S0100000_12
            r0 = 16
            r1.<init>(r5, r0)
            r2.observe(r6, r1)
            com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.commentfilter.subadapters.dislike.PermissionSettingItemViewModel r0 = r6.LJLJJI
            if (r0 == 0) goto La2
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> r2 = r0.LJLJJI
            Y.AObserverS80S0100000_12 r1 = new Y.AObserverS80S0100000_12
            r0 = 17
            r1.<init>(r5, r0)
            r2.observe(r6, r1)
            return
        La2:
            kotlin.jvm.internal.o.LJIJI(r3)
            throw r4
        La6:
            kotlin.jvm.internal.o.LJIJI(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71942SLi.<init>(com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.commentfilter.subadapters.dislike.PermissionSettingSheet):void");
    }

    public final void LLFZ(SL4 sl4, boolean z) {
        PermissionSettingItemViewModel permissionSettingItemViewModel = this.LJLL.LJLJJI;
        if (permissionSettingItemViewModel != null) {
            sl4.LJ(permissionSettingItemViewModel);
            sl4.LJIIIZ = new AqS41S0210000_12(z, this.LJLL, sl4, 0);
            sl4.LJIIIIZZ = new AqS178S0100000_12(this.LJLL, 103);
            sl4.LJII = new C71943SLj(z);
            return;
        }
        o.LJIJI("viewModel");
        throw null;
    }
}
