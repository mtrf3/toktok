package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* renamed from: X.8m4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C221128m4 {
    public final String LIZ;
    public final User LIZIZ;
    public final Aweme LIZJ;

    public final void LIZ(EnumC57365MfJ enumC57365MfJ) {
        C220488l2 c220488l2 = C220488l2.LIZIZ;
        C57362MfG c57362MfG = new C57362MfG();
        c57362MfG.LJJIJ("share_link");
        c57362MfG.LJJIIZI(this.LIZ);
        c57362MfG.LJJJJIZL(this.LIZIZ);
        c57362MfG.LJJLIIIIJ = enumC57365MfJ;
        c57362MfG.LJJLI = EnumC57366MfK.CARD;
        c57362MfG.LJJJJI();
        c57362MfG.LJLL = C55786Luw.LJI(C55786Luw.LJ(this.LIZIZ));
        Object LJII = c220488l2.LJII(this.LIZJ, c57362MfG);
        C222578oP.LIZJ(LJII, this.LIZJ, null, null, 14);
        ((JHM) LJII).LJIILIIL();
    }

    public final void LIZIZ(String str) {
        String str2;
        OSZ[] oszArr = new OSZ[7];
        oszArr[0] = new OSZ("enter_from", this.LIZ);
        oszArr[1] = new OSZ("action_type", str);
        oszArr[2] = new OSZ("to_user_id", this.LIZIZ.getUid());
        oszArr[3] = new OSZ("follow_status", C227768wm.LJIJ(this.LIZIZ));
        oszArr[4] = new OSZ("author_id", this.LIZJ.getAuthorUid());
        oszArr[5] = new OSZ("group_id", this.LIZJ.getAid());
        if (((RBX) HG3.LJIILL()).isLogin()) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        oszArr[6] = new OSZ("is_login", str2);
        java.util.Map LJJLIIIIJ = C113554cx.LJJLIIIIJ(oszArr);
        Object LJI = C55786Luw.LJI(C55786Luw.LJ(this.LIZIZ));
        if (LJI == null) {
            LJI = C113554cx.LJJJLIIL();
        }
        LJJLIIIIJ.putAll(LJI);
        FMX.LJIIL("share_user_info_popup", LJJLIIIIJ);
    }

    public C221128m4(String str, User user, Aweme sharedAweme) {
        o.LJIIIZ(sharedAweme, "sharedAweme");
        this.LIZ = str;
        this.LIZIZ = user;
        this.LIZJ = sharedAweme;
    }
}
