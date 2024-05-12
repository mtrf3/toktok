package X;

import android.content.Context;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastUploadVideoImageHeightSetting;
import com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.event.SearchAdEventLogger;
import com.bytedance.ies.ugc.aweme.commercialize.search.setting.CommerceSearchAdConfigSetting;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.search.AwemeSearchAdModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N6D extends C58797N5t implements InterfaceC49070JNq {
    public final N6L LJLJL;
    public final String LJLJLJ;
    public final C58824N6u LJLJLLL;
    public final SearchAdEventLogger LJLL;
    public InterfaceC55057LjB LJLLI;
    public N6E LJLLILLLL;
    public final List<N6E> LJLLJ;

    @Override // X.InterfaceC49070JNq
    public final void F20() {
        C58824N6u c58824N6u = this.LJLJLLL;
        if (c58824N6u != null) {
            c58824N6u.LIZJ(N6F.TRACK_PRODUCT_SHOW);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003f  */
    @Override // X.InterfaceC49070JNq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.ViewGroup LJLLILLLL() {
        /*
            r4 = this;
            java.util.List<X.N6P> r0 = r4.LJLJI
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r2 = r0.iterator()
        L8:
            boolean r0 = r2.hasNext()
            r3 = 0
            if (r0 == 0) goto L5a
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.N6X
            if (r0 == 0) goto L8
        L17:
            X.N6P r1 = (X.N6P) r1
            if (r1 == 0) goto L58
            java.util.List<X.N6Q<android.view.View>> r0 = r1.LJLILLLLZI
            if (r0 == 0) goto L58
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r2 = r0.iterator()
        L25:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L56
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.C58816N6m
            if (r0 == 0) goto L25
        L33:
            X.N6Q r1 = (X.N6Q) r1
            if (r1 == 0) goto L58
            android.view.View r1 = r1.LIZ()
        L3b:
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L42
            r3 = r1
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
        L42:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "getProductAnchor view = "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.N8M.LIZ(r0)
            return r3
        L56:
            r1 = r3
            goto L33
        L58:
            r1 = r3
            goto L3b
        L5a:
            r1 = r3
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N6D.LJLLILLLL():android.view.ViewGroup");
    }

    @Override // X.InterfaceC49070JNq
    public final boolean T() {
        boolean z;
        AwemeRawAd awemeRawAd;
        AwemeSearchAdModel searchAdInfo;
        Aweme aweme = this.LJLJL.getAweme();
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (searchAdInfo = awemeRawAd.getSearchAdInfo()) != null) {
            z = o.LJ(searchAdInfo.isAutoPlayEnable(), Boolean.TRUE);
        } else {
            z = false;
        }
        return !z;
    }

    @Override // X.C58797N5t, X.JGZ
    public final void LIZJ() {
        int i;
        String str;
        Integer num;
        super.LIZJ();
        N6E n6e = this.LJLLILLLL;
        if (n6e == null) {
            i = -1;
        } else {
            i = N6G.LIZ[n6e.ordinal()];
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            this.LJLJJL = null;
                        } else {
                            this.LJLJJL = 56;
                        }
                    } else {
                        this.LJLJJL = 57;
                    }
                } else {
                    this.LJLJJL = 55;
                }
            } else {
                this.LJLJJL = 53;
            }
        } else {
            this.LJLJJL = 54;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("beforeEnterDetailPage cardClickType = ");
        N6E n6e2 = this.LJLLILLLL;
        if (n6e2 != null) {
            str = n6e2.name();
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(" transformOpenClickType = ");
        LIZ.append(this.LJLJJL);
        LIZ.append("  adPlayTimes = ");
        InterfaceC58799N5v interfaceC58799N5v = this.LJLJJLL;
        if (interfaceC58799N5v != null) {
            num = Integer.valueOf(interfaceC58799N5v.d0());
        } else {
            num = null;
        }
        LIZ.append(num);
        N8M.LIZ(X1D.LIZIZ(LIZ));
        this.LJLLILLLL = null;
    }

    @Override // X.C58797N5t, X.JK9
    public final void LLLLZI() {
        super.LLLLZI();
        C58824N6u c58824N6u = this.LJLJLLL;
        if (c58824N6u != null) {
            N6J.LIZJ(c58824N6u, this.LJLJL.getAweme());
        }
        C58824N6u c58824N6u2 = this.LJLJLLL;
        if (c58824N6u2 != null) {
            c58824N6u2.LIZLLL(N6F.CTA_CLICK, new AqS160S0100000_10(this, 639));
        }
        C58824N6u c58824N6u3 = this.LJLJLLL;
        if (c58824N6u3 != null) {
            c58824N6u3.LIZLLL(N6F.MASK_CTA_CLICK, new AqS160S0100000_10(this, LiveBroadcastUploadVideoImageHeightSetting.DEFAULT));
        }
        C58824N6u c58824N6u4 = this.LJLJLLL;
        if (c58824N6u4 != null) {
            c58824N6u4.LIZLLL(N6F.MASK_SHOW, new AqS160S0100000_10(this, 641));
        }
        C58824N6u c58824N6u5 = this.LJLJLLL;
        if (c58824N6u5 != null) {
            c58824N6u5.LIZLLL(N6F.MASK_HIDE, new AqS160S0100000_10(this, 642));
        }
    }

    @Override // X.C58797N5t, X.JK9
    public final void onViewAttachedToWindow() {
        EnumC58785N5h enumC58785N5h;
        C58786N5i LIZIZ;
        Aweme aweme;
        C58786N5i LIZIZ2;
        super.onViewAttachedToWindow();
        InterfaceC49504Jbo interfaceC49504Jbo = this.LJLILLLLZI;
        if (interfaceC49504Jbo != null && (LIZIZ2 = interfaceC49504Jbo.LIZIZ()) != null) {
            enumC58785N5h = LIZIZ2.LIZ(this.LJLJL.getAweme());
        } else {
            enumC58785N5h = null;
        }
        if (enumC58785N5h == EnumC58785N5h.NOT_TRACK || ((aweme = this.LJLJL.getAweme()) != null && !O5Y.LJJJLZIJ(aweme))) {
            N6J.LJFF(this.LJLL, this.LJLJL.getAweme(), this.LJLJL.getEnterFrom());
            InterfaceC49504Jbo interfaceC49504Jbo2 = this.LJLILLLLZI;
            if (interfaceC49504Jbo2 != null && (LIZIZ = interfaceC49504Jbo2.LIZIZ()) != null) {
                LIZIZ.LIZIZ(this.LJLJL.getAweme(), EnumC58785N5h.HAS_TRACKED_IN_RESULT_PAGE);
            }
            C58824N6u c58824N6u = this.LJLJLLL;
            if (c58824N6u != null) {
                c58824N6u.LIZ(N6I.L((N6I) c58824N6u.LIZLLL.getValue(), false, 0, true, 0, 123));
            }
        } else {
            SearchAdEventLogger searchAdEventLogger = this.LJLL;
            C58777N4z.LIZ.getClass();
            searchAdEventLogger.LJIILIIL(C58777N4z.LJIIIIZZ);
        }
        if (!CommerceSearchAdConfigSetting.LIZ().disableFpsMonitorForSearchAd) {
            if (this.LJLLI == null) {
                try {
                    this.LJLLI = C40443Fu3.LIZ("search_ad_video");
                } catch (Exception unused) {
                }
            }
            InterfaceC55057LjB interfaceC55057LjB = this.LJLLI;
            if (interfaceC55057LjB != null) {
                interfaceC55057LjB.start();
            }
        }
    }

    @Override // X.C58797N5t, X.JK9
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        InterfaceC55057LjB interfaceC55057LjB = this.LJLLI;
        if (interfaceC55057LjB != null) {
            interfaceC55057LjB.stop();
        }
        C58824N6u c58824N6u = this.LJLJLLL;
        if (c58824N6u != null) {
            N6J.LIZLLL(c58824N6u);
        }
    }

    @Override // X.InterfaceC41034G8o
    public final /* bridge */ /* synthetic */ InterfaceC58801N5x L9() {
        return this.LJLJL;
    }

    @Override // X.C58797N5t
    public final /* bridge */ /* synthetic */ InterfaceC58801N5x LJ() {
        return this.LJLJL;
    }

    @Override // X.C58797N5t
    public final N6K LJFF() {
        return this.LJLJLLL;
    }

    @Override // X.C58797N5t
    public final String LJI() {
        return this.LJLJLJ;
    }

    public N6D(C49043JMp c49043JMp) {
        super(c49043JMp);
        C58824N6u c58824N6u;
        ActivityC45651qj LJJIFFI;
        this.LJLJL = c49043JMp;
        this.LJLJLJ = " SearchAdNormalVideoModule";
        Context context = c49043JMp.LIZIZ.LJLJLJ;
        if (context != null && (LJJIFFI = C45804HyK.LJJIFFI(context)) != null) {
            c58824N6u = new C58824N6u(LJJIFFI);
        } else {
            c58824N6u = null;
        }
        this.LJLJLLL = c58824N6u;
        SearchAdEventLogger searchAdEventLogger = new SearchAdEventLogger(new Object[]{c49043JMp.LIZ});
        this.LJLL = searchAdEventLogger;
        C58809N6f c58809N6f = new C58809N6f(c49043JMp.LIZIZ.LJZI, null, N6V.NORMAL_VIDEO_AD, c58824N6u, searchAdEventLogger, this.LJLJJI, c49043JMp);
        N6X n6x = new N6X(C58809N6f.LIZ(c58809N6f, c49043JMp.LIZIZ.LLFZ));
        N6S n6s = new N6S(C58809N6f.LIZ(c58809N6f, c49043JMp.LIZIZ.LLFII));
        ArrayList arrayList = (ArrayList) this.LJLJI;
        arrayList.add(n6x);
        arrayList.add(n6s);
        this.LJLLJ = C47261Igj.LJJIJIIJI(N6E.BOTTOM_CTA, N6E.MASK_CTA, N6E.TRANSFORM_SOURCE, N6E.TRANSFORM_LIKE, N6E.TRANSFORM_DESC, N6E.PRODUCT_ANCHOR);
    }

    @Override // X.C58797N5t
    public final void Kn(C58798N5u c58798N5u) {
        super.Kn(c58798N5u);
    }

    @Override // X.C58797N5t, X.JGZ
    public final void LIZIZ(String str) {
        super.LIZIZ(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (X.O5Y.LJIILLIIL(r2) == false) goto L10;
     */
    @Override // X.InterfaceC49070JNq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(java.lang.String r10) {
        /*
            r9 = this;
            X.N6L r0 = r9.LJLJL
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            r4 = 0
            if (r0 == 0) goto L6f
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r0.getAwemeRawAd()
            if (r2 == 0) goto L6f
            boolean r0 = X.O5Y.LJJJJIZL(r2)
            r1 = 1
            if (r0 != r1) goto L6f
            boolean r0 = X.O5Y.LJIILLIIL(r2)
            if (r0 != 0) goto L6f
        L1c:
            java.lang.String r8 = "like"
            java.lang.String r7 = "desc"
            java.lang.String r6 = "source"
            r5 = 3321751(0x32af97, float:4.654765E-39)
            r3 = 3079825(0x2efe91, float:4.315754E-39)
            r2 = -896505829(0xffffffffca90681b, float:-4731917.5)
            if (r1 == 0) goto L3b
            int r0 = r10.hashCode()
            if (r0 == r2) goto L65
            if (r0 == r3) goto L5c
            if (r0 == r5) goto L52
        L37:
            X.N6E r0 = r9.LJLLILLLL
        L39:
            r9.LJLLILLLL = r0
        L3b:
            java.lang.String r0 = "search_product_anchor"
            boolean r0 = kotlin.jvm.internal.o.LJ(r10, r0)
            if (r0 == 0) goto L47
            X.N6E r0 = X.N6E.PRODUCT_ANCHOR
            r9.LJLLILLLL = r0
        L47:
            java.util.List<X.N6E> r1 = r9.LJLLJ
            X.N6E r0 = r9.LJLLILLLL
            boolean r0 = X.ORZ.LJLJJI(r0, r1)
            if (r0 == 0) goto L71
            return
        L52:
            boolean r0 = r10.equals(r8)
            if (r0 != 0) goto L59
            goto L37
        L59:
            X.N6E r0 = X.N6E.TRANSFORM_LIKE
            goto L39
        L5c:
            boolean r0 = r10.equals(r7)
            if (r0 == 0) goto L37
            X.N6E r0 = X.N6E.TRANSFORM_DESC
            goto L39
        L65:
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto L6c
            goto L37
        L6c:
            X.N6E r0 = X.N6E.TRANSFORM_SOURCE
            goto L39
        L6f:
            r1 = 0
            goto L1c
        L71:
            int r0 = r10.hashCode()
            if (r0 == r2) goto Laa
            if (r0 == r3) goto La1
            if (r0 == r5) goto L97
        L7b:
            X.N6E r0 = X.N6E.VIDEO
        L7d:
            r9.LJLLILLLL = r0
            com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.event.SearchAdEventLogger r3 = r9.LJLL
            X.N4z r0 = X.C58777N4z.LIZ
            r0.getClass()
            X.N0f r2 = X.C58777N4z.LJ
            kotlin.jvm.internal.AqS176S0100000_10 r1 = new kotlin.jvm.internal.AqS176S0100000_10
            r0 = 274(0x112, float:3.84E-43)
            r1.<init>(r9, r0)
            r3.LJ(r2, r1)
            X.N4S r0 = r9.LJLJJI
            r0.LJLJJL = r4
            return
        L97:
            boolean r0 = r10.equals(r8)
            if (r0 != 0) goto L9e
            goto L7b
        L9e:
            X.N6E r0 = X.N6E.LIKE
            goto L7d
        La1:
            boolean r0 = r10.equals(r7)
            if (r0 == 0) goto L7b
            X.N6E r0 = X.N6E.DESC
            goto L7d
        Laa:
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto Lb1
            goto L7b
        Lb1:
            X.N6E r0 = X.N6E.SOURCE
            goto L7d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N6D.onClick(java.lang.String):void");
    }
}
