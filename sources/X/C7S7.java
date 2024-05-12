package X;

import android.app.Activity;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.topic.book.BookTokServiceImpl;
import com.ss.android.ugc.aweme.topic.book.IBookTokService;
import com.ss.android.ugc.aweme.topic.common.model.TopicRawInfo;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.7S7, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7S7 implements InterfaceC212338Uz {
    public static boolean LJII;
    public Boolean LIZIZ;
    public int LJ;
    public final IBookTokService<?, ?, ?, ?> LIZ = BookTokServiceImpl.LJFF();
    public String LIZJ = "";
    public String LIZLLL = "";
    public String LJFF = "";
    public String LJI = "";

    @Override // X.InterfaceC72202SVi
    public final void LIZ() {
        LJII = false;
    }

    @Override // X.InterfaceC212338Uz
    public final boolean LIZIZ(AnchorCommonStruct anchorCommonStruct) {
        String extra;
        if (anchorCommonStruct != null && (extra = anchorCommonStruct.getExtra()) != null && extra.length() != 0) {
            try {
                String extra2 = anchorCommonStruct.getExtra();
                if (extra2 != null) {
                    return new JSONObject(extra2).optBoolean("is_collected", false);
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        return false;
    }

    @Override // X.InterfaceC72202SVi
    public final void LIZLLL(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        LJIILJJIL(aweme);
    }

    @Override // X.InterfaceC72202SVi
    public final void LJII(C7OJ c7oj) {
        if (c7oj != null) {
            C7OG.LIZJ(C7PV.BOOK, c7oj);
        }
    }

    @Override // X.InterfaceC72202SVi
    public final String LJIIIIZZ(AnchorCommonStruct anchorCommonStruct) {
        boolean z;
        if (anchorCommonStruct != null) {
            String extra = anchorCommonStruct.getExtra();
            if (extra == null || extra.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                try {
                    String extra2 = anchorCommonStruct.getExtra();
                    if (extra2 != null) {
                        String optString = new JSONObject(extra2).optString("third_id", "");
                        o.LJIIIIZZ(optString, "extraJson.optString(\"third_id\", \"\")");
                        return optString;
                    }
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        }
        return "";
    }

    @Override // X.InterfaceC72202SVi
    public final Boolean LJIIJ(String str) {
        if (str != null) {
            return C7OG.LIZIZ(C7PV.BOOK, str);
        }
        return null;
    }

    @Override // X.InterfaceC72202SVi
    public final void LJIIL(C7OJ c7oj) {
        if (c7oj != null) {
            C7OG.LIZ(C7PV.BOOK, c7oj);
        }
    }

    public final void LJIILJJIL(Aweme aweme) {
        String str;
        String groupId = aweme.getGroupId();
        o.LJIIIIZZ(groupId, "aweme.groupId");
        this.LJFF = groupId;
        this.LJ = 0;
        List<AnchorCommonStruct> anchors = aweme.getAnchors();
        if (anchors == null) {
            return;
        }
        Iterator<AnchorCommonStruct> it = anchors.iterator();
        while (true) {
            str = "";
            if (!it.hasNext()) {
                break;
            }
            AnchorCommonStruct next = it.next();
            if (next.getType() == EnumC42934Gt8.ANCHOR_BOOKTOK.getTYPE()) {
                try {
                    String extra = next.getExtra();
                    if (extra != null) {
                        JSONObject jSONObject = new JSONObject(extra);
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append(this.LIZJ);
                        LIZ.append(jSONObject.optString("third_id", ""));
                        LIZ.append(',');
                        this.LIZJ = X1D.LIZIZ(LIZ);
                    }
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(this.LIZLLL);
                    String keyword = next.getKeyword();
                    if (keyword != null) {
                        str = keyword;
                    }
                    LIZ2.append(str);
                    LIZ2.append(',');
                    this.LIZLLL = X1D.LIZIZ(LIZ2);
                    this.LJ++;
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        }
        List<AnchorCommonStruct> anchors2 = aweme.getAnchors();
        if (anchors2 != null) {
            str = ORZ.LLD(anchors2, null, null, null, C7SB.LJLIL, 31);
        }
        this.LJI = str;
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
                str = "books";
            } else {
                str = "links";
            }
            c188727au.LJIIIZ("panel_type", str);
            c188727au.LIZLLL(this.LJ, "book_num");
            c188727au.LJIIIZ("group_id", this.LJFF);
            c188727au.LJIIIZ("book_id", this.LIZJ);
            c188727au.LJIIIZ("book_title", this.LIZLLL);
            FMX.LJIIL("book_panel_show", c188727au.LIZ);
            LJII = true;
        }
    }

    public final void LJIILLIIL(Boolean bool, String str) {
        if (str != null && bool != null) {
            bool.booleanValue();
            C7OG.LIZLLL(C7PV.BOOK, str, bool.booleanValue());
        }
    }

    public static final void LJIILL(String bookId, boolean z, AnchorCommonStruct anchorCommonStruct) {
        String str;
        UrlModel urlModel;
        String description;
        o.LJIIIZ(bookId, "bookId");
        int type = C7PR.BOOK.getType();
        String str2 = "";
        if (anchorCommonStruct == null || (str = anchorCommonStruct.getKeyword()) == null) {
            str = "";
            if (anchorCommonStruct == null) {
                urlModel = null;
                if (anchorCommonStruct != null && (description = anchorCommonStruct.getDescription()) != null) {
                    str2 = description;
                }
                C2U8.LIZ(new C184807Nc(new TopicRawInfo(Integer.valueOf(type), bookId, str, urlModel, str2, null, null, null, null, 480, null), z));
            }
        }
        urlModel = anchorCommonStruct.getThumbnail();
        if (anchorCommonStruct != null) {
            str2 = description;
        }
        C2U8.LIZ(new C184807Nc(new TopicRawInfo(Integer.valueOf(type), bookId, str, urlModel, str2, null, null, null, null, 480, null), z));
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
        c188727au.LJIIIZ("book_id", LJIIIIZZ(anchorCommonStruct));
        if (anchorCommonStruct != null) {
            str4 = anchorCommonStruct.getKeyword();
        } else {
            str4 = null;
        }
        c188727au.LJIIIZ("book_title", str4);
        if (anchorCommonStruct != null) {
            str5 = anchorCommonStruct.getLogExtra();
        }
        LogPbBean logPbBean = new LogPbBean();
        logPbBean.setImprId(str5);
        String LIZ = C3A5.LIZ.LIZ(logPbBean);
        o.LJIIIIZZ(LIZ, "getInstance().formatLogPb(logPb)");
        c188727au.LJIIIZ("log_pb", LIZ);
        c188727au.LJIIIZ("category", "book");
        FMX.LJIIL("enter_topic_detail", c188727au.LIZ);
    }

    @Override // X.InterfaceC72202SVi
    public final void LJ(String id, boolean z, AnchorCommonStruct anchorCommonStruct) {
        InterfaceC65462ha<XGX<?>> LIZJ;
        o.LJIIIZ(id, "id");
        C64962gm LIZ = C48841JEv.LIZ(C78613UtF.LIZJ);
        if (this.LIZIZ == null) {
            this.LIZIZ = Boolean.valueOf(z);
        }
        if (!z) {
            LIZJ = this.LIZ.LJ(id);
        } else {
            LIZJ = this.LIZ.LIZJ(id);
        }
        XKX.LIZLLL(LIZ, null, null, new C185357Pf(LIZJ, this, id, !z, anchorCommonStruct, null), 3);
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
        c188727au.LIZLLL(this.LJ, "book_num");
        c188727au.LJIIIZ("book_id", this.LIZJ);
        c188727au.LJIIIZ("book_title", this.LIZLLL);
        C211648Si.LIZ(c188727au, aweme, str, true);
        FMX.LJIIL("multi_anchor_entrance_show", c188727au.LIZ);
    }

    @Override // X.InterfaceC72202SVi
    public final void LJIIJJI(Activity activity, AnchorCommonStruct anchorCommonStruct, String str) {
        o.LJIIIZ(activity, "activity");
        C7SW.LIZIZ("book_detail_page");
        C05040Hs.LJ(SmartRouter.buildRoute(activity, "//topic/book"), "book_id", LJIIIIZZ(anchorCommonStruct), "enter_from", str);
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
        c188727au.LIZLLL(this.LJ, "book_num");
        c188727au.LJIIIZ("book_id", this.LIZJ);
        c188727au.LJIIIZ("book_title", this.LIZLLL);
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
        c188727au.LJIIIZ("anchor_type", "book");
        c188727au.LIZLLL(this.LJ, "book_num");
        c188727au.LJIIIZ("book_id", this.LIZJ);
        c188727au.LJIIIZ("book_title", this.LIZLLL);
        C88547Yp5 c88547Yp5 = C88547Yp5.LIZIZ;
        if (c88547Yp5.LJIJI()) {
            c188727au.LIZLLL(c88547Yp5.LJIJJ(C227768wm.LIZIZ(aweme)), "spammy_tag_cnt");
        }
        FMX.LJIIL("enter_multi_anchor_detail", c188727au.LIZ);
    }
}
