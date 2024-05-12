package X;

/* renamed from: X.Jlg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50116Jlg {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Code restructure failed: missing block: B:24:0x009d, code lost:
    
        if (X.C50117Jlh.LIZ(r7) != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a6, code lost:
    
        r2 = "double_column";
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00af, code lost:
    
        r2 = "single_column";
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a4, code lost:
    
        if (r2.length() == 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ad, code lost:
    
        if (r2.length() == 0) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ(int r6, java.lang.String r7, boolean r8) {
        /*
            java.lang.String r0 = "searchSource"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            X.Jls r0 = X.C50128Jls.LIZ
            r0.getClass()
            com.bytedance.ies.abmock.SettingsManager r0 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()
            r0.getClass()
            java.lang.String r0 = "search_result_page_switch_source_list"
            java.lang.String r3 = ""
            java.lang.String r4 = com.bytedance.ies.abmock.SettingsManager.LJI(r0, r3)
            java.lang.String r0 = "getInstance()\n          …ListSettings::class.java)"
            kotlin.jvm.internal.o.LJIIIIZZ(r4, r0)
            java.lang.String r0 = ","
            java.lang.String[] r2 = new java.lang.String[]{r0}
            r1 = 6
            r0 = 0
            java.util.List r0 = ujb.s.LJLJJL(r4, r2, r0, r1)
            int r1 = r0.indexOf(r7)
            r0 = -1
            r5 = 1
            if (r1 == r0) goto L6c
            r0 = 1
        L33:
            r4 = 4
            if (r0 == 0) goto L6a
            int r0 = X.C49967JjH.LIZ()
            if (r0 != r4) goto L6a
            r0 = 1
        L3d:
            if (r8 != 0) goto L41
            if (r0 == 0) goto L6e
        L41:
            com.ss.android.ugc.aweme.search.pages.core.ui.activity.SearchResultActivity r0 = X.C50989Jzl.LJ()
            if (r0 == 0) goto L68
            androidx.lifecycle.ViewModelProvider r1 = androidx.lifecycle.ViewModelProviders.of(r0)
            java.lang.Class<com.ss.android.ugc.aweme.search.common.viewmodel.SearchGlobalViewModel> r0 = com.ss.android.ugc.aweme.search.common.viewmodel.SearchGlobalViewModel.class
            androidx.lifecycle.ViewModel r0 = r1.get(r0)
            com.ss.android.ugc.aweme.search.common.viewmodel.SearchGlobalViewModel r0 = (com.ss.android.ugc.aweme.search.common.viewmodel.SearchGlobalViewModel) r0
            if (r0 == 0) goto L68
            java.lang.String r1 = r0.jv0()
        L59:
            boolean r0 = X.C78685UuP.LJJJZ(r1)
            if (r0 == 0) goto L6e
            java.lang.String r0 = "unknown"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 != 0) goto L6e
            return r1
        L68:
            r1 = r3
            goto L59
        L6a:
            r0 = 0
            goto L3d
        L6c:
            r0 = 0
            goto L33
        L6e:
            if (r6 != 0) goto Lb6
            com.bytedance.keva.Keva r1 = X.C50234Jna.LIZIZ()
            java.lang.String r0 = "user_top_feed_style"
            java.lang.String r2 = r1.getString(r0, r3)
            java.lang.String r0 = "SearchKeva.get().getStri…_TOP_FEED_STYLE_PREF, \"\")"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            int r1 = X.C49967JjH.LIZ()
            if (r1 == r5) goto Lb3
            r0 = 2
            if (r1 == r0) goto La9
            r0 = 3
            if (r1 == r0) goto La0
            if (r1 == r4) goto L8e
        L8d:
            return r3
        L8e:
            int r0 = r2.length()
            if (r0 != 0) goto Lb1
            X.Jlh r0 = X.C50117Jlh.LIZ
            r0.getClass()
            boolean r0 = X.C50117Jlh.LIZ(r7)
            if (r0 == 0) goto La6
            goto Laf
        La0:
            int r0 = r2.length()
            if (r0 != 0) goto Lb1
        La6:
            java.lang.String r2 = "double_column"
            goto Lb1
        La9:
            int r0 = r2.length()
            if (r0 != 0) goto Lb1
        Laf:
            java.lang.String r2 = "single_column"
        Lb1:
            r3 = r2
            goto L8d
        Lb3:
            java.lang.String r3 = "auto"
            goto L8d
        Lb6:
            com.ss.android.ugc.aweme.search.pages.core.ui.activity.SearchResultActivity r0 = X.C50989Jzl.LJ()
            if (r0 == 0) goto Lcf
            androidx.lifecycle.ViewModelProvider r1 = androidx.lifecycle.ViewModelProviders.of(r0)
            java.lang.Class<com.ss.android.ugc.aweme.search.pages.result.topsearch.core.repo.SearchOptPreferLayoutViewModel> r0 = com.ss.android.ugc.aweme.search.pages.result.topsearch.core.repo.SearchOptPreferLayoutViewModel.class
            androidx.lifecycle.ViewModel r0 = r1.get(r0)
            com.ss.android.ugc.aweme.search.pages.result.topsearch.core.repo.SearchOptPreferLayoutViewModel r0 = (com.ss.android.ugc.aweme.search.pages.result.topsearch.core.repo.SearchOptPreferLayoutViewModel) r0
            if (r0 == 0) goto Lcf
            java.lang.String r0 = r0.LJLIL
            if (r0 == 0) goto Lcf
            r3 = r0
        Lcf:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50116Jlg.LIZ(int, java.lang.String, boolean):java.lang.String");
    }
}
