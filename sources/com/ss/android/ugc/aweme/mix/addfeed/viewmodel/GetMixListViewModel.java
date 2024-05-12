package com.ss.android.ugc.aweme.mix.addfeed.viewmodel;

import X.C221108m2;
import X.C62822Ol8;
import X.C85429Xft;
import X.C85433Xfx;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS159S0100000_9;

/* loaded from: classes16.dex */
public final class GetMixListViewModel extends ViewModel {
    public C85433Xfx LJLILLLLZI;
    public boolean LJLJJI;
    public Aweme LJLJL;
    public boolean LJLL;
    public int LJLIL = -1;
    public boolean LJLJI = true;
    public final List<C85429Xft> LJLJJL = new ArrayList();
    public String LJLJJLL = "";
    public String LJLJLJ = "";
    public String LJLJLLL = "";
    public final C62822Ol8 LJLLI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 325));

    /* JADX WARN: Code restructure failed: missing block: B:29:0x007e, code lost:
    
        if (r10.isEmpty() != false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.C85433Xfx> gv0(java.util.List<com.ss.android.ugc.aweme.mix.model.MixStruct> r10, boolean r11) {
        /*
            r9 = this;
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2 = 0
            r4 = 1
            if (r10 == 0) goto L80
            boolean r0 = r9.LJLJI
            if (r0 == 0) goto L6b
            if (r11 != 0) goto L6b
            X.Xft r0 = new X.Xft
            r0.<init>(r2)
            r0.LJLJJI = r2
            r3.add(r0)
        L19:
            java.util.Iterator r8 = r10.iterator()
            r6 = 0
        L1e:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L7a
            int r7 = r6 + 1
            java.lang.Object r1 = r8.next()
            com.ss.android.ugc.aweme.mix.model.MixStruct r1 = (com.ss.android.ugc.aweme.mix.model.MixStruct) r1
            X.Xft r5 = new X.Xft
            r5.<init>(r2)
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r1.getIcon()
            r5.LJLJI = r0
            java.lang.String r0 = r1.getMixName()
            r5.LJLILLLLZI = r0
            java.lang.String r0 = r1.mixId
            r5.LJLJJL = r0
            r5.LJLJJI = r4
            if (r11 != 0) goto L66
            java.lang.String r0 = r9.LJLJJLL
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L66
            java.lang.String r1 = r1.mixId
            java.lang.String r0 = r9.LJLJJLL
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L66
            r5.LJLJJLL = r4
            boolean r0 = r9.LJLJI
            if (r0 != 0) goto L61
            boolean r0 = r9.LJLJJI
            if (r0 == 0) goto L62
        L61:
            r6 = r7
        L62:
            r9.LJLIL = r6
            r9.LJLILLLLZI = r5
        L66:
            r3.add(r5)
            r6 = r7
            goto L1e
        L6b:
            boolean r0 = r9.LJLJJI
            if (r0 == 0) goto L19
            if (r11 != 0) goto L19
            X.Xfv r0 = new X.Xfv
            r0.<init>(r2)
            r3.add(r0)
            goto L19
        L7a:
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L8e
        L80:
            boolean r0 = r9.LJLJJI
            if (r0 == 0) goto L8e
            if (r11 != 0) goto L8e
            X.Xfv r0 = new X.Xfv
            r0.<init>(r2)
            r3.add(r0)
        L8e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.mix.addfeed.viewmodel.GetMixListViewModel.gv0(java.util.List, boolean):java.util.List");
    }
}
