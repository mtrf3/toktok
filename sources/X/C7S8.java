package X;

import android.app.Activity;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.google.gson.s;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.topic.movie.IMovieTokService;
import com.ss.android.ugc.aweme.topic.movie.MovieTokServiceImpl;
import com.ss.android.ugc.aweme.topic.movie.model.MovieDetail;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.7S8, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7S8 implements C8V0 {
    public static boolean LJII;
    public Boolean LIZIZ;
    public int LJ;
    public final IMovieTokService<?, ?, ?, ?> LIZ = MovieTokServiceImpl.LJFF();
    public String LIZJ = "";
    public String LIZLLL = "";
    public String LJFF = "";
    public String LJI = "";

    @Override // X.InterfaceC72202SVi
    public final void LIZ() {
        LJII = false;
    }

    @Override // X.C8V0
    public final boolean LIZIZ(AnchorCommonStruct anchorCommonStruct) {
        String str = null;
        if (anchorCommonStruct != null) {
            str = anchorCommonStruct.getExtra();
        }
        boolean z = false;
        if (str == null || str.length() == 0 || anchorCommonStruct == null) {
            return false;
        }
        try {
            String extra = anchorCommonStruct.getExtra();
            if (extra == null) {
                return false;
            }
            z = new JSONObject(extra).optBoolean("is_collected", false);
            return z;
        } catch (JSONException e) {
            C36922EeM.LJFF(e);
            return z;
        }
    }

    @Override // X.InterfaceC72202SVi
    public final void LIZLLL(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        LJIILJJIL(aweme);
    }

    @Override // X.InterfaceC72202SVi
    public final void LJII(C7OJ c7oj) {
        if (c7oj != null) {
            C7OG.LIZJ(C7PV.MOVIE, c7oj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0016 A[Catch: JSONException -> 0x002b, TryCatch #0 {JSONException -> 0x002b, blocks: (B:6:0x0004, B:8:0x000a, B:13:0x0016), top: B:5:0x0004 }] */
    @Override // X.InterfaceC72202SVi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJIIIIZZ(com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r4) {
        /*
            r3 = this;
            java.lang.String r2 = ""
            if (r4 == 0) goto L2b
            java.lang.String r0 = r4.getExtra()     // Catch: org.json.JSONException -> L2b
            if (r0 == 0) goto L13
            int r0 = r0.length()     // Catch: org.json.JSONException -> L2b
            if (r0 != 0) goto L11
            goto L13
        L11:
            r0 = 0
            goto L14
        L13:
            r0 = 1
        L14:
            if (r0 != 0) goto L2b
            java.lang.String r0 = r4.getExtra()     // Catch: org.json.JSONException -> L2b
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L2b
            r1.<init>(r0)     // Catch: org.json.JSONException -> L2b
            java.lang.String r0 = "third_id"
            java.lang.String r1 = r1.optString(r0, r2)     // Catch: org.json.JSONException -> L2b
            java.lang.String r0 = "extraJson.optString(\"third_id\", \"\")"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)     // Catch: org.json.JSONException -> L2b
            return r1
        L2b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7S8.LJIIIIZZ(com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct):java.lang.String");
    }

    @Override // X.InterfaceC72202SVi
    public final Boolean LJIIJ(String str) {
        if (str != null) {
            return C7OG.LIZIZ(C7PV.MOVIE, str);
        }
        return null;
    }

    @Override // X.InterfaceC72202SVi
    public final void LJIIL(C7OJ c7oj) {
        if (c7oj != null) {
            C7OG.LIZ(C7PV.MOVIE, c7oj);
        }
    }

    public final void LJIILJJIL(Aweme aweme) {
        ArrayList arrayList;
        String str;
        String str2;
        List<AnchorCommonStruct> anchors;
        int i = 0;
        if (aweme != null && (anchors = aweme.getAnchors()) != null) {
            arrayList = new ArrayList();
            for (AnchorCommonStruct anchorCommonStruct : anchors) {
                if (anchorCommonStruct.getType() == EnumC42934Gt8.ANCHOR_MOVIETOK.getTYPE()) {
                    arrayList.add(anchorCommonStruct);
                }
            }
        } else {
            arrayList = null;
        }
        String groupId = aweme.getGroupId();
        o.LJIIIIZZ(groupId, "aweme.groupId");
        this.LJFF = groupId;
        if (arrayList != null) {
            i = arrayList.size();
        }
        this.LJ = i;
        String str3 = "";
        if (arrayList == null) {
            str = "";
        } else {
            str = ORZ.LLD(arrayList, ",", null, null, C7S9.INSTANCE, 30);
        }
        this.LIZJ = str;
        if (arrayList == null) {
            str2 = "";
        } else {
            str2 = ORZ.LLD(arrayList, null, null, null, C7SA.LJLIL, 31);
        }
        this.LIZLLL = str2;
        List<AnchorCommonStruct> anchors2 = aweme.getAnchors();
        if (anchors2 != null) {
            str3 = ORZ.LLD(anchors2, null, null, null, C7SC.LJLIL, 31);
        }
        this.LJI = str3;
    }

    @Override // X.InterfaceC72202SVi
    public final void LJI(Aweme aweme, boolean z) {
        String str;
        if (aweme != null) {
            LJIILJJIL(aweme);
        }
        if (!LJII) {
            C188727au c188727au = new C188727au();
            if (z) {
                str = "movies";
            } else {
                str = "links";
            }
            c188727au.LJIIIZ("panel_type", str);
            c188727au.LIZLLL(this.LJ, "movie_num");
            c188727au.LJIIIZ("group_id", this.LJFF);
            c188727au.LJIIIZ("movie_id", this.LIZJ);
            c188727au.LJIIIZ("movie_title", this.LIZLLL);
            FMX.LJIIL("movie_panel_show", c188727au.LIZ);
            LJII = true;
        }
    }

    public final void LJIILLIIL(Boolean bool, String str) {
        if (str != null && bool != null) {
            bool.booleanValue();
            C7OG.LIZLLL(C7PV.MOVIE, str, bool.booleanValue());
        }
    }

    public static final void LJIILL(String id, boolean z, AnchorCommonStruct anchorCommonStruct) {
        String extra;
        Integer valueOf;
        Double valueOf2;
        o.LJIIIZ(id, "id");
        String str = "";
        MovieDetail movieDetail = null;
        if (anchorCommonStruct != null) {
            try {
                extra = anchorCommonStruct.getExtra();
            } catch (s | JSONException unused) {
                if (0 == 0) {
                    return;
                }
            }
            if (extra != null && extra.length() != 0) {
                JSONObject jSONObject = new JSONObject(anchorCommonStruct.getExtra());
                String optString = jSONObject.optString("third_id", "");
                String keyword = anchorCommonStruct.getKeyword();
                if (keyword != null) {
                    str = keyword;
                }
                String optString2 = jSONObject.optString("title", str);
                UrlModel thumbnail = anchorCommonStruct.getThumbnail();
                int optInt = jSONObject.optInt("year", -1);
                if (optInt <= 0) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(optInt);
                }
                double optDouble = jSONObject.optDouble("imdb_rating", -1.0d);
                if (optDouble <= LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Double.valueOf(optDouble);
                }
                movieDetail = new MovieDetail(optString, optString2, valueOf, valueOf2, null, thumbnail, null, 80, null);
                C2U8.LIZ(new C184807Nc(movieDetail.LIZ(), z));
            }
        }
    }

    @Override // X.InterfaceC72202SVi
    public final void LIZJ(String str, Aweme aweme, AnchorCommonStruct anchorCommonStruct) {
        String str2;
        String str3;
        String str4;
        if (aweme != null) {
            LJIILJJIL(aweme);
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str);
        String str5 = null;
        if (aweme != null) {
            str2 = aweme.getAuthorUid();
        } else {
            str2 = null;
        }
        c188727au.LJIIIZ("author_id", str2);
        if (aweme == null || (str3 = aweme.getAid()) == null) {
            str3 = "";
        }
        c188727au.LJIIIZ("group_id", str3);
        c188727au.LJIIIZ("group_id", this.LJFF);
        c188727au.LJIIIZ("movie_id", LJIIIIZZ(anchorCommonStruct));
        if (anchorCommonStruct != null) {
            str4 = anchorCommonStruct.getKeyword();
        } else {
            str4 = null;
        }
        c188727au.LJIIIZ("movie_title", str4);
        if (anchorCommonStruct != null) {
            str5 = anchorCommonStruct.getLogExtra();
        }
        LogPbBean logPbBean = new LogPbBean();
        logPbBean.setImprId(str5);
        String LIZ = C3A5.LIZ.LIZ(logPbBean);
        o.LJIIIIZZ(LIZ, "getInstance().formatLogPb(logPb)");
        c188727au.LJIIIZ("log_pb", LIZ);
        c188727au.LJIIIZ("category", "movie");
        FMX.LJIIL("enter_topic_detail", c188727au.LIZ);
    }

    @Override // X.InterfaceC72202SVi
    public final void LJ(String id, boolean z, AnchorCommonStruct anchorCommonStruct) {
        InterfaceC65462ha<XGX<?>> LIZIZ;
        o.LJIIIZ(id, "id");
        C64962gm LIZ = C48841JEv.LIZ(C78613UtF.LIZJ);
        if (this.LIZIZ == null) {
            this.LIZIZ = Boolean.valueOf(z);
        }
        if (!z) {
            LIZIZ = this.LIZ.LIZLLL(id);
        } else {
            LIZIZ = this.LIZ.LIZIZ(id);
        }
        XKX.LIZLLL(LIZ, null, null, new C7S1(LIZIZ, this, id, !z, anchorCommonStruct, null), 3);
    }

    @Override // X.InterfaceC72202SVi
    public final void LJFF(C188727au c188727au, String str, Aweme aweme) {
        String str2;
        String aid;
        if (aweme != null) {
            LJIILJJIL(aweme);
        }
        if (c188727au == null) {
            c188727au = new C188727au();
        }
        c188727au.LJIIIZ("enter_from", str);
        String str3 = "";
        if (aweme == null || (str2 = aweme.getAuthorUid()) == null) {
            str2 = "";
        }
        c188727au.LJIIIZ("author_id", str2);
        if (aweme != null && (aid = aweme.getAid()) != null) {
            str3 = aid;
        }
        c188727au.LJIIIZ("group_id", str3);
        c188727au.LJIIIZ("music_id", C227768wm.LJIIJJI(aweme));
        c188727au.LJIIIZ("anchor_type", this.LJI);
        c188727au.LIZLLL(this.LJ, "movie_num");
        c188727au.LJIIIZ("movie_id", this.LIZJ);
        c188727au.LJIIIZ("movie_title", this.LIZLLL);
        C211648Si.LIZ(c188727au, aweme, str, true);
        FMX.LJIIL("multi_anchor_entrance_show", c188727au.LIZ);
    }

    @Override // X.InterfaceC72202SVi
    public final void LJIIJJI(Activity activity, AnchorCommonStruct anchorCommonStruct, String str) {
        o.LJIIIZ(activity, "activity");
        C7SW.LIZIZ("movie_detail_page");
        SmartRoute buildRoute = SmartRouter.buildRoute(activity, "//topic/movie");
        buildRoute.withParam("movie_id", LJIIIIZZ(anchorCommonStruct));
        buildRoute.open();
    }

    @Override // X.InterfaceC72202SVi
    public final void LJIILIIL(C188727au c188727au, String str, Aweme aweme) {
        String str2;
        String aid;
        c188727au.LJIIIZ("enter_from", str);
        String str3 = "";
        if (aweme == null || (str2 = aweme.getAuthorUid()) == null) {
            str2 = "";
        }
        c188727au.LJIIIZ("author_id", str2);
        if (aweme != null && (aid = aweme.getAid()) != null) {
            str3 = aid;
        }
        c188727au.LJIIIZ("group_id", str3);
        c188727au.LJIIIZ("music_id", C227768wm.LJIIJJI(aweme));
        c188727au.LJIIIZ("anchor_type", this.LJI);
        c188727au.LIZLLL(this.LJ, "movie_num");
        c188727au.LJIIIZ("movie_id", this.LIZJ);
        c188727au.LJIIIZ("movie_title", this.LIZLLL);
        C211648Si.LIZ(c188727au, aweme, str, false);
        FMX.LJIIL("multi_anchor_entrance_click", c188727au.LIZ);
    }

    @Override // X.InterfaceC72202SVi
    public final void LJIIIZ(C188727au c188727au, String str, Aweme aweme, String str2, AnchorCommonStruct anchorCommonStruct) {
        String str3;
        String aid;
        if (c188727au == null) {
            c188727au = new C188727au();
        }
        c188727au.LJIIIZ("enter_method", str2);
        c188727au.LJIIIZ("enter_from", str);
        String str4 = null;
        if (anchorCommonStruct != null) {
            str4 = anchorCommonStruct.getKeyword();
        }
        c188727au.LJIIIZ("anchor_entry", str4);
        String str5 = "";
        if (aweme == null || (str3 = aweme.getAuthorUid()) == null) {
            str3 = "";
        }
        c188727au.LJIIIZ("author_id", str3);
        if (aweme != null && (aid = aweme.getAid()) != null) {
            str5 = aid;
        }
        c188727au.LJIIIZ("group_id", str5);
        c188727au.LJIIIZ("click_type", "app_page");
        c188727au.LJIIIZ("music_id", C227768wm.LJIIJJI(aweme));
        c188727au.LJIIIZ("anchor_type", "movie");
        c188727au.LIZLLL(this.LJ, "movie_num");
        c188727au.LJIIIZ("movie_id", this.LIZJ);
        c188727au.LJIIIZ("movie_title", this.LIZLLL);
        C88547Yp5 c88547Yp5 = C88547Yp5.LIZIZ;
        if (c88547Yp5.LJIJI()) {
            c188727au.LIZLLL(c88547Yp5.LJIJJ(C227768wm.LIZIZ(aweme)), "spammy_tag_cnt");
        }
        FMX.LJIIL("enter_multi_anchor_detail", c188727au.LIZ);
    }
}
