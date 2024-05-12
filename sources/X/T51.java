package X;

import Y.AObjectS47S0101000_2;
import android.view.View;
import android.view.ViewStub;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class T51 implements T54 {
    public final ViewStub LIZ;
    public final InterfaceC65784Pro<Void> LIZIZ;
    public final C74065T4z LIZJ;
    public final C92163jY LIZLLL;
    public final C57492Nl LJ;
    public final C57482Nk LJFF;
    public final C57502Nm LJI;
    public View LJII;

    /* JADX WARN: Removed duplicated region for block: B:104:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    @Override // X.T54
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.ss.android.ugc.aweme.sticker.model.CommerceSticker r29) {
        /*
            Method dump skipped, instructions count: 1482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T51.LIZ(com.ss.android.ugc.aweme.sticker.model.CommerceSticker):void");
    }

    public T51(ViewStub adTagVs, ViewStub authorVs, ViewStub descVs, ViewStub disclaimerVs, ViewStub linkVs, ViewStub missionVs, AObjectS47S0101000_2 aObjectS47S0101000_2) {
        o.LJIIIZ(adTagVs, "adTagVs");
        o.LJIIIZ(authorVs, "authorVs");
        o.LJIIIZ(descVs, "descVs");
        o.LJIIIZ(disclaimerVs, "disclaimerVs");
        o.LJIIIZ(linkVs, "linkVs");
        o.LJIIIZ(missionVs, "missionVs");
        this.LIZ = missionVs;
        this.LIZIZ = aObjectS47S0101000_2;
        C74065T4z c74065T4z = new C74065T4z();
        this.LIZJ = c74065T4z;
        if (adTagVs.getParent() != null) {
            adTagVs.setLayoutResource(R.layout.a7y);
            adTagVs.setInflatedId(R.id.ud);
            View inflate = adTagVs.inflate();
            o.LJII(inflate, "null cannot be cast to non-null type com.ss.android.ugc.aweme.commercialize.sticker.view.CommerceStickerDetailAdTagLayout");
            this.LIZLLL = (C92163jY) inflate;
        } else {
            this.LIZLLL = (C92163jY) adTagVs.findViewById(R.id.ud);
        }
        if (authorVs.getParent() != null) {
            authorVs.setLayoutResource(R.layout.a80);
            authorVs.setInflatedId(R.id.t_);
            View inflate2 = authorVs.inflate();
            o.LJII(inflate2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.commercialize.sticker.view.CommerceStickerDetailAuthorLayout");
            this.LJ = (C57492Nl) inflate2;
        } else {
            this.LJ = (C57492Nl) authorVs.findViewById(R.id.t_);
        }
        c74065T4z.LJI(descVs);
        if (disclaimerVs.getParent() != null) {
            disclaimerVs.setLayoutResource(R.layout.a82);
            disclaimerVs.setInflatedId(R.id.nf3);
            View inflate3 = disclaimerVs.inflate();
            o.LJII(inflate3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.commercialize.sticker.view.CommerceStickerDetailDisclaimerLayout");
            this.LJFF = (C57482Nk) inflate3;
        } else {
            this.LJFF = (C57482Nk) disclaimerVs.findViewById(R.id.nf3);
        }
        if (linkVs.getParent() != null) {
            linkVs.setLayoutResource(R.layout.a84);
            linkVs.setInflatedId(R.id.fjh);
            View inflate4 = linkVs.inflate();
            o.LJII(inflate4, "null cannot be cast to non-null type com.ss.android.ugc.aweme.commercialize.sticker.view.CommerceStickerDetailLinkLayout");
            this.LJI = (C57502Nm) inflate4;
            return;
        }
        this.LJI = (C57502Nm) linkVs.findViewById(R.id.fjh);
    }
}
