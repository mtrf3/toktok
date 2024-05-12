package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.6wn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C176816wn implements InterfaceC174196sZ {
    public final /* synthetic */ Aweme LJLIL;
    public final /* synthetic */ C174366sq LJLILLLLZI;

    public C176816wn(C174366sq c174366sq, Aweme aweme) {
        this.LJLIL = aweme;
        this.LJLILLLLZI = c174366sq;
    }

    @Override // X.InterfaceC174196sZ
    public final void C9(int i, long j, boolean z) {
        String str;
        EnumC1804076e enumC1804076e;
        String str2;
        Aweme aweme = this.LJLIL;
        if (aweme != null) {
            if (z) {
                if (i == 0) {
                    str = "empty";
                } else {
                    str = "success";
                }
            } else {
                str = "fail";
            }
            String aid = aweme.getAid();
            String authorUid = this.LJLIL.getAuthorUid();
            C174366sq c174366sq = this.LJLILLLLZI;
            String str3 = null;
            if (c174366sq != null) {
                str3 = c174366sq.getEnterFrom();
            }
            C74Z.LJIJ(j, aid, authorUid, str3, str);
            if (z) {
                enumC1804076e = EnumC1804076e.SUCCESS;
            } else {
                enumC1804076e = EnumC1804076e.FAIL;
            }
            int i2 = !z ? 1 : 0;
            C174366sq c174366sq2 = this.LJLILLLLZI;
            if (c174366sq2 == null || (str2 = c174366sq2.getEnterFrom()) == null) {
                str2 = "";
            }
            C176786wk.LIZJ(i2, str2, false);
            C54502LaE.LIZLLL("comment", enumC1804076e, 4);
        }
    }
}
