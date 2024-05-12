package X;

import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;

/* renamed from: X.Jsf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50549Jsf extends AbstractC244919jL {
    public final /* synthetic */ IViewPagerComponentAbility LIZ;
    public final /* synthetic */ java.util.Map<String, String> LIZIZ;
    public final /* synthetic */ C68322mC<String> LIZJ;
    public final /* synthetic */ String LIZLLL;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r3 == null) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [T, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    @Override // X.AbstractC244919jL, X.InterfaceC55109Lk1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onShow() {
        /*
            r5 = this;
            com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility r0 = r5.LIZ
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getCurrentAweme()
            java.lang.String r4 = "search_result_id"
            if (r0 == 0) goto L10
            java.lang.String r3 = r0.getAid()
            if (r3 != 0) goto L18
        L10:
            java.util.Map<java.lang.String, java.lang.String> r0 = r5.LIZIZ
            java.lang.Object r3 = r0.get(r4)
            java.lang.String r3 = (java.lang.String) r3
        L18:
            X.2mC<java.lang.String> r0 = r5.LIZJ
            T r0 = r0.element
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r3)
            if (r0 == 0) goto L23
            return
        L23:
            X.2mC<java.lang.String> r0 = r5.LIZJ
            r0.element = r3
            X.Jsg r2 = new X.Jsg
            r2.<init>()
            java.util.Map<java.lang.String, java.lang.String> r0 = r5.LIZIZ
            java.lang.String r1 = "search_id"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r2.LJIIZILJ(r1, r0)
            java.util.Map<java.lang.String, java.lang.String> r0 = r5.LIZIZ
            java.lang.String r1 = "search_keyword"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r2.LJIIZILJ(r1, r0)
            java.lang.String r0 = r5.LIZLLL
            r2.LJIJI(r0)
            r2.LJIJ(r4, r3)
            r2.LJIILIIL()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50549Jsf.onShow():void");
    }

    public C50549Jsf(IViewPagerComponentAbility iViewPagerComponentAbility, java.util.Map<String, String> map, C68322mC<String> c68322mC, String str) {
        this.LIZ = iViewPagerComponentAbility;
        this.LIZIZ = map;
        this.LIZJ = c68322mC;
        this.LIZLLL = str;
    }
}
