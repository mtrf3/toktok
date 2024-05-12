package X;

import Y.AfS60S0100000_8;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.feed.AdReRankServiceManager;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.commercialize.feed.assem.midad.MidAdCellComponent;
import com.ss.android.ugc.aweme.commercialize.feed.assem.midad.MidAdVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.jvm.internal.o;
import yq4.a;

/* renamed from: X.JAm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48728JAm extends AbstractC65781Prl implements InterfaceC88471Ynr<MidAdCellComponent, C43I<? extends Long>, C76800UCe> {
    public static final C48728JAm LJLIL = new C48728JAm();

    public C48728JAm() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(MidAdCellComponent midAdCellComponent, C43I<? extends Long> c43i) {
        String str;
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        Integer valueOf;
        Aweme aweme2;
        AwemeCommerceStruct commerceVideoAuthInfo;
        Long valueOf2;
        AwemeCommerceStruct commerceVideoAuthInfo2;
        Long valueOf3;
        String authorUid;
        Aweme aweme3;
        String aid;
        AwemeCommerceStruct commerceVideoAuthInfo3;
        AwemeRawAd awemeRawAd2;
        String creativeIdStr;
        MidAdCellComponent selectSubscribe = midAdCellComponent;
        C43I<? extends Long> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null) {
            Aweme aweme4 = selectSubscribe.A4().LJLJLLL;
            AwemeRawAd awemeRawAd3 = null;
            if (aweme4 != null) {
                str = aweme4.getAid();
            } else {
                str = null;
            }
            if (!JAY.LIZ(str)) {
                MidAdVM A4 = selectSubscribe.A4();
                long longValue = ((Number) c43i2.LIZ).longValue();
                JB2 blockState = selectSubscribe.LLIIL;
                A4.getClass();
                o.LJIIIZ(blockState, "blockState");
                JBB jbb = (JBB) A4.getState();
                if (C1DJ.LJIJJLI(A4.LJLJLLL)) {
                    if (A4.LJLLI == -1 && (aweme2 = A4.LJLJLLL) != null && (commerceVideoAuthInfo = aweme2.getCommerceVideoAuthInfo()) != null && (valueOf2 = Long.valueOf(commerceVideoAuthInfo.getInsertAdTime())) != null) {
                        long longValue2 = valueOf2.longValue();
                        long j = longValue2 - 5000;
                        Aweme aweme5 = A4.LJLJLLL;
                        if (aweme5 != null && (commerceVideoAuthInfo2 = aweme5.getCommerceVideoAuthInfo()) != null && (valueOf3 = Long.valueOf(commerceVideoAuthInfo2.getRequestMidAdTime())) != null) {
                            long longValue3 = valueOf3.longValue();
                            if ((j > longValue || longValue > longValue2) && A4.LJLLILLLL) {
                                A4.setState(C48733JAr.LJLIL);
                            }
                            if (longValue > longValue2) {
                                if (!blockState.LIZIZ() && longValue <= longValue2 + 350 && A4.LJLLILLLL && !A4.LJLZ) {
                                    A4.LJLLI = longValue;
                                    Aweme aweme6 = A4.LJLL;
                                    if (aweme6 != null && (awemeRawAd2 = aweme6.getAwemeRawAd()) != null && (creativeIdStr = awemeRawAd2.getCreativeIdStr()) != null) {
                                        JAY.LIZLLL.put(creativeIdStr, Long.valueOf(longValue));
                                    }
                                    A4.setStateImmediate(C48732JAq.LJLIL);
                                }
                            } else if (longValue > j) {
                                if (!A4.LJLLLLLL && longValue < j + 350) {
                                    A4.LJLLLLLL = true;
                                    FMX.onEventV3("reach_countdown_timing");
                                    if (blockState.LIZIZ()) {
                                        Aweme aweme7 = A4.LJLL;
                                        if (aweme7 != null) {
                                            awemeRawAd3 = aweme7.getAwemeRawAd();
                                        }
                                        C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "show_fail", awemeRawAd3);
                                        LIZLLL.LIZIZ(blockState.LIZ(), "fail_reason");
                                        LIZLLL.LJI();
                                        if (blockState.LIZJ()) {
                                            A4.LJLZ = true;
                                        }
                                    }
                                }
                                if (jbb.LJLIL.LIZ.booleanValue() && !A4.LJLZ) {
                                    if (blockState.LIZJ()) {
                                        Aweme aweme8 = A4.LJLL;
                                        if (aweme8 != null) {
                                            awemeRawAd3 = aweme8.getAwemeRawAd();
                                        }
                                        C58655N0h LIZLLL2 = C58704N2e.LIZLLL("draw_ad", "show_fail", awemeRawAd3);
                                        LIZLLL2.LIZIZ(blockState.LIZ(), "fail_reason");
                                        LIZLLL2.LJI();
                                        A4.LJLZ = true;
                                    } else {
                                        A4.LJLLILLLL = true;
                                        A4.setStateImmediate(new C48729JAn(longValue2, longValue));
                                    }
                                }
                            } else if (longValue > longValue3 && !A4.LJLLLL && longValue < longValue3 + 350 && A4.LJLL == null && !A4.LJLZ) {
                                A4.LJLLLL = true;
                                FMX.onEventV3("reach_midroll_ads_request_timing");
                                if (blockState.LIZIZ()) {
                                    C188727au c188727au = new C188727au();
                                    c188727au.LJIIIZ("fail_reason", blockState.LIZ());
                                    FMX.LJIIL("midroll_ads_request_failed", c188727au.LIZ);
                                    if (blockState.LIZJ()) {
                                        A4.LJLZ = true;
                                    }
                                } else {
                                    Aweme aweme9 = A4.LJLJLLL;
                                    if (aweme9 != null && (commerceVideoAuthInfo3 = aweme9.getCommerceVideoAuthInfo()) != null) {
                                        Integer valueOf4 = Integer.valueOf(commerceVideoAuthInfo3.getDisableMidRollStatusCode());
                                        if (valueOf4.intValue() != 0) {
                                            int intValue = valueOf4.intValue();
                                            C188727au c188727au2 = new C188727au();
                                            c188727au2.LJIIIZ("fail_reason", String.valueOf(intValue));
                                            FMX.LJIIL("midroll_ads_blocked", c188727au2.LIZ);
                                        }
                                    }
                                    Aweme aweme10 = A4.LJLJLLL;
                                    if (aweme10 != null && (authorUid = aweme10.getAuthorUid()) != null && (aweme3 = A4.LJLJLLL) != null && (aid = aweme3.getAid()) != null) {
                                        C78999UzT.LJFF(A4.LJLLJ.request(authorUid, AdReRankServiceManager.LIZJ().LIZIZ(ILE.FEED).LIZLLL(), CastLongProtector.parseLong(aid), a.LJIIZILJ().LIZJ(), FLE.LIZ("feed")).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS60S0100000_8(A4, 15), new InterfaceC64592gB() { // from class: X.34F
                                            @Override // X.InterfaceC64592gB
                                            public final void accept(Object obj) {
                                                C38306F1q c38306F1q;
                                                Throwable th = (Throwable) obj;
                                                C188727au c188727au3 = new C188727au();
                                                String str2 = null;
                                                if ((th instanceof C38333F2r) && (c38306F1q = (C38306F1q) th) != null) {
                                                    str2 = Integer.valueOf(c38306F1q.getErrorCode()).toString();
                                                }
                                                c188727au3.LJIIIZ("fail_reason", str2);
                                                FMX.LJIIL("midroll_ads_blocked", c188727au3.LIZ);
                                                C78983UzD.LJIIZILJ(th);
                                            }
                                        }), A4.LJLLL);
                                    }
                                }
                            }
                        }
                    }
                } else if (C1DJ.LJJ(A4.LJLJLLL) && (aweme = A4.LJLJLLL) != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (valueOf = Integer.valueOf(awemeRawAd.getSkipAdTime())) != null) {
                    int intValue2 = valueOf.intValue();
                    Integer num = jbb.LJLJI.LIZ;
                    if (num == null || num.intValue() != 0) {
                        Integer num2 = jbb.LJLJI.LIZ;
                        int i = -1;
                        if (num2 == null || num2.intValue() != -1) {
                            if (intValue2 != -1) {
                                i = (int) ((intValue2 / 1000) - (longValue / 1000));
                            }
                            A4.setStateImmediate(new C48731JAp(i, intValue2));
                        }
                    }
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
