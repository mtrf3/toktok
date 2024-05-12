package X;

import android.view.View;

/* loaded from: classes13.dex */
public final class T56 implements View.OnClickListener {
    public final /* synthetic */ T55 LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    public T56(T55 t55, String str, String str2) {
        this.LJLIL = t55;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
    
        if (r2.openAdOpenUrl(r1, r9.LJLILLLLZI, true) == true) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00af  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r10) {
        /*
            r9 = this;
            X.T58 r2 = X.NTK.LIZ()
            r8 = 0
            java.lang.String r7 = "mContext"
            r5 = 1
            if (r2 == 0) goto La2
            X.T55 r0 = r9.LJLIL
            android.content.Context r1 = r0.LJIIZILJ
            if (r1 == 0) goto Lbf
            java.lang.String r0 = r9.LJLILLLLZI
            boolean r0 = r2.LIZJ(r1, r0)
            if (r0 != r5) goto La2
            r0 = 1
        L19:
            java.lang.String r6 = "mChallenge"
            if (r0 != 0) goto L31
            X.T58 r2 = X.NTK.LIZ()
            if (r2 == 0) goto L72
            X.T55 r0 = r9.LJLIL
            android.content.Context r1 = r0.LJIIZILJ
            if (r1 == 0) goto Lb3
            java.lang.String r0 = r9.LJLILLLLZI
            boolean r0 = r2.openAdOpenUrl(r1, r0, r5)
            if (r0 != r5) goto L72
        L31:
            X.T55 r3 = r9.LJLIL
            r3.getClass()
            X.7au r2 = new X.7au
            r2.<init>()
            com.ss.android.ugc.aweme.discover.model.Challenge r0 = r3.LJIJI
            if (r0 == 0) goto Laf
            java.lang.String r1 = r0.getCid()
            java.lang.String r0 = "tag_id"
            r2.LJIIIZ(r0, r1)
            X.9Be r0 = r3.LJIJ
            if (r0 == 0) goto La9
            java.lang.String r1 = r0.LIZIZ
            java.lang.String r0 = "enter_from"
            r2.LJIIIZ(r0, r1)
            java.lang.String r1 = "page_type"
            java.lang.String r0 = "challenge"
            r2.LJIIIZ(r1, r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
            java.lang.String r0 = "click_variable_button"
            X.FMX.LJIIL(r0, r1)
            X.T58 r1 = X.NTK.LIZ()
            if (r1 == 0) goto L71
            com.ss.android.ugc.aweme.discover.model.Challenge r0 = r3.LJIJI
            if (r0 == 0) goto La5
            r0.getCid()
            r1.LIZ()
        L71:
            return
        L72:
            X.T58 r4 = X.NTK.LIZ()
            if (r4 == 0) goto L71
            X.T55 r0 = r9.LJLIL
            android.content.Context r3 = r0.LJIIZILJ
            if (r3 == 0) goto Lbb
            java.lang.String r1 = r9.LJLJI
            java.lang.String r0 = "webUrl"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.String r2 = X.SS3.LIZ(r1)
            X.T55 r0 = r9.LJLIL
            com.ss.android.ugc.aweme.discover.model.Challenge r0 = r0.LJIJI
            if (r0 == 0) goto Lb7
            java.lang.String r1 = r0.getCid()
            java.lang.String r0 = "challenge_transform_button"
            java.lang.String r1 = X.SS3.LIZIZ(r2, r0, r1)
            java.lang.String r0 = ""
            boolean r0 = r4.openAdWebUrl(r3, r1, r0)
            if (r0 != r5) goto L71
            goto L31
        La2:
            r0 = 0
            goto L19
        La5:
            kotlin.jvm.internal.o.LJIJI(r6)
            throw r8
        La9:
            java.lang.String r0 = "mHeaderParam"
            kotlin.jvm.internal.o.LJIJI(r0)
            throw r8
        Laf:
            kotlin.jvm.internal.o.LJIJI(r6)
            throw r8
        Lb3:
            kotlin.jvm.internal.o.LJIJI(r7)
            throw r8
        Lb7:
            kotlin.jvm.internal.o.LJIJI(r6)
            throw r8
        Lbb:
            kotlin.jvm.internal.o.LJIJI(r7)
            throw r8
        Lbf:
            kotlin.jvm.internal.o.LJIJI(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T56.onClick(android.view.View):void");
    }
}
