package X;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.bddatefmt.BDDateFormat;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.now.NowPostInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.7mX */
/* loaded from: classes4.dex */
public final class C195937mX {
    public static final C62822Ol8 LIZ;
    public static final C62822Ol8 LIZIZ;
    public static final C62822Ol8 LIZJ;
    public static final C62822Ol8 LIZLLL;
    public static final C62822Ol8 LJ;
    public static final C62822Ol8 LJFF;
    public static final C62822Ol8 LJI;
    public static final C62822Ol8 LJII;

    static {
        C221108m2.LIZIZ(C195987mc.LJLIL);
        C221108m2.LIZIZ(C196037mh.LJLIL);
        LIZ = C221108m2.LIZIZ(C195997md.LJLIL);
        LIZIZ = C221108m2.LIZIZ(C196017mf.LJLIL);
        LIZJ = C221108m2.LIZIZ(C195947mY.LJLIL);
        LIZLLL = C221108m2.LIZIZ(C195967ma.LJLIL);
        LJ = C221108m2.LIZIZ(C196007me.LJLIL);
        LJFF = C221108m2.LIZIZ(C196027mg.LJLIL);
        LJI = C221108m2.LIZIZ(C195957mZ.LJLIL);
        LJII = C221108m2.LIZIZ(C195977mb.LJLIL);
    }

    public static final boolean LIZ(InterfaceC194547kI item) {
        o.LJIIIZ(item, "item");
        if (((Number) C196117mp.LIZ.getValue()).intValue() != 1 || !C54218LPq.LJLIL.LIZ() || MWW.LIZIZ()) {
            return false;
        }
        if (item.z() != 2 && item.z() != 5) {
            return false;
        }
        return true;
    }

    public static final List<Aweme> LIZJ(List<? extends InterfaceC57784Mm4> list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (InterfaceC57784Mm4 interfaceC57784Mm4 : list) {
                if (interfaceC57784Mm4 instanceof C7ML) {
                    arrayList.add(interfaceC57784Mm4);
                }
            }
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((C7ML) it.next()).getAweme());
            }
            return arrayList2;
        }
        return C61878OQg.INSTANCE;
    }

    public static final String LIZLLL(long j) {
        long j2 = j * 1000;
        C85990Xow.LIZ.getClass();
        if (C85990Xow.LJIILJJIL() || C85990Xow.LJIILIIL()) {
            if (SU4.LIZLLL(j2)) {
                return BDDateFormat.LIZJ((BDDateFormat) LJ.getValue(), j2);
            }
            if (SU4.LJ(j2)) {
                return BDDateFormat.LIZJ((BDDateFormat) LJFF.getValue(), j2);
            }
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(j2);
            if (calendar2.get(1) == calendar.get(1)) {
                return BDDateFormat.LIZJ((BDDateFormat) LJI.getValue(), j2);
            }
            return BDDateFormat.LIZJ((BDDateFormat) LJII.getValue(), j2);
        }
        if (SU4.LIZLLL(j2)) {
            return BDDateFormat.LIZJ((BDDateFormat) LIZ.getValue(), j2);
        }
        if (SU4.LJ(j2)) {
            return BDDateFormat.LIZJ((BDDateFormat) LIZIZ.getValue(), j2);
        }
        Calendar calendar3 = Calendar.getInstance();
        Calendar calendar4 = Calendar.getInstance();
        calendar4.setTimeInMillis(j2);
        if (calendar4.get(1) == calendar3.get(1)) {
            return BDDateFormat.LIZJ((BDDateFormat) LIZJ.getValue(), j2);
        }
        return BDDateFormat.LIZJ((BDDateFormat) LIZLLL.getValue(), j2);
    }

    public static final boolean LJ(Aweme aweme) {
        o.LJIIIZ(aweme, "<this>");
        if (aweme.shouldShowReviewStatus()) {
            C196367nE c196367nE = C196367nE.LIZ;
            String authorUid = aweme.getAuthorUid();
            o.LJIIIIZZ(authorUid, "this.authorUid");
            c196367nE.getClass();
            if (C196367nE.LJI(authorUid)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean LJFF(Aweme aweme) {
        if (aweme == null || aweme.getAwemeType() != 43) {
            return false;
        }
        return true;
    }

    public static final boolean LJI(Aweme aweme) {
        NowPostInfo nowPostInfo;
        Integer nowStatus;
        if (aweme == null || (nowPostInfo = aweme.nowPostInfo) == null || (nowStatus = nowPostInfo.getNowStatus()) == null || nowStatus.intValue() != 1) {
            return false;
        }
        return true;
    }

    public static final boolean LJII(Aweme aweme) {
        if ((aweme != null && aweme.getAwemeType() == 41) || LJFF(aweme)) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ void LJIIIZ(SmartImageView smartImageView, UrlModel urlModel) {
        LJIIIIZZ(smartImageView, false, urlModel, null, null, C196047mi.LJLIL, C196057mj.LJLIL, C196067mk.LJLIL);
    }

    public static final boolean LJIIL(User user, int i) {
        if (user == null) {
            return false;
        }
        if ((!C78857UxB.LJJJIL(user.getCustomVerify()) && !C78857UxB.LJJJIL(user.getEnterpriseVerifyReason())) || !C47261Igj.LJJIJIIJI(2, 1, 5).contains(Integer.valueOf(i))) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        if (LJI(r1) == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LJIILIIL(X.C7ML r3, X.C7O2 r4) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            java.lang.String r0 = "coverState"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            boolean r0 = r4 instanceof X.C193997jP
            r2 = 1
            if (r0 == 0) goto L2a
        Lf:
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r3.getAweme()
            if (r1 == 0) goto L28
            X.7nE r0 = X.C196367nE.LIZ
            r0.getClass()
            boolean r0 = X.C196367nE.LJIIJJI(r1)
            if (r0 == 0) goto L28
            boolean r0 = LJI(r1)
            if (r0 != 0) goto L28
        L26:
            r1 = r2
        L27:
            return r1
        L28:
            r2 = 0
            goto L26
        L2a:
            boolean r0 = r4 instanceof X.C193967jM
            if (r0 == 0) goto L2f
            goto Lf
        L2f:
            boolean r0 = r4 instanceof X.C193977jN
            r1 = 0
            if (r0 == 0) goto L27
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C195937mX.LJIILIIL(X.7ML, X.7O2):boolean");
    }

    public static final boolean LJIILJJIL(C7ML c7ml, C7O2 coverState) {
        o.LJIIIZ(c7ml, "<this>");
        o.LJIIIZ(coverState, "coverState");
        C196367nE c196367nE = C196367nE.LIZ;
        Aweme aweme = c7ml.getAweme();
        c196367nE.getClass();
        if (C196367nE.LJFF(aweme) && C196367nE.LJIIJJI(c7ml.getAweme()) && ((coverState instanceof C193997jP) || (coverState instanceof C193967jM))) {
            return true;
        }
        return false;
    }

    public static final void LIZIZ(SmartImageView smartImageView, NowPostInfo nowPostInfo, Integer num) {
        if (nowPostInfo == null || nowPostInfo.getFrontImage() == null || nowPostInfo.getFrontImageThumbnail() == null) {
            smartImageView.setVisibility(8);
        } else {
            if (num == null) {
                return;
            }
            smartImageView.setVisibility(num.intValue());
        }
    }

    public static final void LJIIJ(SmartImageView smartImageView, C7ML item, int i, UrlModel urlModel, Drawable drawable, InterfaceC65784Pro<C76800UCe> onSuccess, InterfaceC65784Pro<C76800UCe> onFail) {
        o.LJIIIZ(item, "item");
        o.LJIIIZ(onSuccess, "onSuccess");
        o.LJIIIZ(onFail, "onFail");
        C68322mC c68322mC = new C68322mC();
        LJIIIIZZ(smartImageView, false, urlModel, drawable, null, new AqS151S0100000_1(c68322mC, (C68322mC<Long>) 1010), new C196097mn(smartImageView, onSuccess, c68322mC, item, i), new AqS153S0100000_3(onFail, (InterfaceC65784Pro<C76800UCe>) 1688));
    }

    public static /* synthetic */ void LJIIJJI(SmartImageView smartImageView, C7ML c7ml, int i, UrlModel urlModel, Drawable drawable, InterfaceC65784Pro interfaceC65784Pro, int i2) {
        Drawable drawable2 = drawable;
        InterfaceC65784Pro interfaceC65784Pro2 = interfaceC65784Pro;
        C196077ml c196077ml = null;
        if ((i2 & 8) != 0) {
            drawable2 = null;
        }
        if ((i2 & 16) != 0) {
            c196077ml = C196077ml.LJLIL;
        }
        if ((i2 & 32) != 0) {
            interfaceC65784Pro2 = C196087mm.LJLIL;
        }
        LJIIJ(smartImageView, c7ml, i, urlModel, drawable2, c196077ml, interfaceC65784Pro2);
    }

    public static final void LJIIIIZZ(SmartImageView smartImageView, boolean z, UrlModel urlModel, Drawable drawable, Integer num, final InterfaceC65784Pro<C76800UCe> onStart, final InterfaceC65784Pro<C76800UCe> onSuccess, final InterfaceC65784Pro<C76800UCe> onFail) {
        o.LJIIIZ(onStart, "onStart");
        o.LJIIIZ(onSuccess, "onSuccess");
        o.LJIIIZ(onFail, "onFail");
        smartImageView.setImageDrawable(null);
        smartImageView.setImageDrawable(drawable);
        if (urlModel == null) {
            return;
        }
        W5F LJII2 = W5U.LJII(C78939UyV.LJ(urlModel));
        LJII2.LIZJ = smartImageView.getContext();
        LJII2.LJJIIJ = smartImageView;
        LJII2.LIZLLL = true;
        if (z) {
            if (num != null) {
                num.intValue();
                int intValue = num.intValue();
                EnumC72807Shn enumC72807Shn = EnumC72807Shn.CENTER;
                LJII2.LJIIJJI = intValue;
                LJII2.LJIILJJIL = enumC72807Shn;
            }
        } else {
            C196367nE.LIZ.getClass();
            LJII2.LJIJI = C196367nE.LIZIZ();
            LJII2.LJIILIIL = drawable;
        }
        AbstractC72439Sbr abstractC72439Sbr = new AbstractC72439Sbr() { // from class: X.7Bv
            @Override // X.AbstractC72439Sbr, X.InterfaceC70769Rq1
            public final void T1(android.net.Uri uri, SmartImageView smartImageView2) {
                onStart.invoke();
            }

            @Override // X.InterfaceC70769Rq1
            public final void s2(android.net.Uri uri, View view, Throwable th) {
                onFail.invoke();
            }

            @Override // X.InterfaceC70769Rq1
            public final void U0(android.net.Uri uri, View view, C2047581v c2047581v, Animatable animatable) {
                onSuccess.invoke();
            }
        };
        if (C210188Ms.LIZLLL()) {
            LJII2.LJFF(abstractC72439Sbr);
        } else {
            LJII2.LIZLLL(abstractC72439Sbr);
        }
    }
}
