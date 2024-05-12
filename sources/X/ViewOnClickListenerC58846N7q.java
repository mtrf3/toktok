package X;

import android.content.Context;
import android.view.View;
import com.bytedance.ies.android.base.runtime.depend.IAppLogDepend;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.SpecialSticker;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.N7q, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class ViewOnClickListenerC58846N7q implements NI4, View.OnClickListener {
    public final C62846OlW LJLIL;
    public Aweme LJLILLLLZI;
    public String LJLJI = "";
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(C58849N7t.LJLIL);

    public ViewOnClickListenerC58846N7q(C58850N7u c58850N7u) {
        this.LJLIL = c58850N7u.LIZ;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC58848N7s interfaceC58848N7s;
        Context context;
        IAppLogDepend LIZ;
        String uid;
        String uid2;
        Context context2;
        Aweme aweme = this.LJLILLLLZI;
        List<String> list = null;
        if (aweme != null) {
            User author = aweme.getAuthor();
            Aweme aweme2 = this.LJLILLLLZI;
            if (aweme2 != null) {
                if (C58847N7r.LIZIZ(aweme2)) {
                    InterfaceC58848N7s interfaceC58848N7s2 = (InterfaceC58848N7s) this.LJLJJI.getValue();
                    if (interfaceC58848N7s2 != null) {
                        Context context3 = this.LJLIL.getContext();
                        o.LJIIIIZZ(context3, "adRedPacketIv.context");
                        Aweme aweme3 = this.LJLILLLLZI;
                        if (aweme3 != null) {
                            interfaceC58848N7s2.LIZ(context3, aweme3, 9, C58775N4x.LIZ);
                            return;
                        } else {
                            o.LJIJI("aweme");
                            throw null;
                        }
                    }
                    return;
                }
                Aweme aweme4 = this.LJLILLLLZI;
                if (aweme4 != null) {
                    String str = "";
                    if (C58847N7r.LIZ(aweme4)) {
                        InterfaceC58848N7s interfaceC58848N7s3 = (InterfaceC58848N7s) this.LJLJJI.getValue();
                        if (interfaceC58848N7s3 != null) {
                            if (view != null) {
                                context2 = view.getContext();
                            } else {
                                context2 = null;
                            }
                            Aweme aweme5 = this.LJLILLLLZI;
                            if (aweme5 != null) {
                                interfaceC58848N7s3.LJIL(context2, aweme5);
                            } else {
                                o.LJIJI("aweme");
                                throw null;
                            }
                        }
                        IAppLogDepend LIZ2 = C59835Ne3.LIZ();
                        if (LIZ2 != null) {
                            C188727au c188727au = new C188727au();
                            c188727au.LJIIIZ("enter_from", this.LJLJI);
                            Aweme aweme6 = this.LJLILLLLZI;
                            if (aweme6 != null) {
                                c188727au.LJIIIZ("group_id", aweme6.getAid());
                                if (author != null && (uid2 = author.getUid()) != null) {
                                    str = uid2;
                                }
                                c188727au.LJIIIZ("author_id", str);
                                LIZ2.onEventV3Map("click_brand_sticker", c188727au.LIZ);
                            } else {
                                o.LJIJI("aweme");
                                throw null;
                            }
                        }
                        C58768N4q c58768N4q = new C58768N4q(this);
                        Aweme aweme7 = this.LJLILLLLZI;
                        if (aweme7 != null) {
                            UrlModel clickTrackUrlList = aweme7.getActivityPendant().getClickTrackUrlList();
                            if (clickTrackUrlList != null) {
                                list = clickTrackUrlList.getUrlList();
                            }
                            N94.LIZ(c58768N4q, list, true);
                            return;
                        }
                        o.LJIJI("aweme");
                        throw null;
                    }
                    Aweme aweme8 = this.LJLILLLLZI;
                    if (aweme8 != null) {
                        if (!C58847N7r.LIZJ(aweme8) || (interfaceC58848N7s = (InterfaceC58848N7s) this.LJLJJI.getValue()) == null) {
                            return;
                        }
                        if (view != null) {
                            context = view.getContext();
                        } else {
                            context = null;
                        }
                        Aweme aweme9 = this.LJLILLLLZI;
                        if (aweme9 != null) {
                            if (!interfaceC58848N7s.LJJII(context, aweme9) || (LIZ = C59835Ne3.LIZ()) == null) {
                                return;
                            }
                            C188727au c188727au2 = new C188727au();
                            c188727au2.LJIIIZ("enter_from", this.LJLJI);
                            Aweme aweme10 = this.LJLILLLLZI;
                            if (aweme10 != null) {
                                c188727au2.LJIIIZ("group_id", aweme10.getAid());
                                if (author != null && (uid = author.getUid()) != null) {
                                    str = uid;
                                }
                                c188727au2.LJIIIZ("author_id", str);
                                Aweme aweme11 = this.LJLILLLLZI;
                                if (aweme11 != null) {
                                    c188727au2.LJIIIZ("sticker_id", aweme11.getSpecialSticker().getStickerId());
                                    LIZ.onEventV3Map("click_brand_sticker", c188727au2.LIZ);
                                    return;
                                } else {
                                    o.LJIJI("aweme");
                                    throw null;
                                }
                            }
                            o.LJIJI("aweme");
                            throw null;
                        }
                        o.LJIJI("aweme");
                        throw null;
                    }
                    o.LJIJI("aweme");
                    throw null;
                }
                o.LJIJI("aweme");
                throw null;
            }
            o.LJIJI("aweme");
            throw null;
        }
        o.LJIJI("aweme");
        throw null;
    }

    @Override // X.NI4
    public final void LJIIIIZZ(Aweme aweme, String eventType, boolean z) {
        IAppLogDepend LIZ;
        String uid;
        String uid2;
        o.LJIIIZ(eventType, "eventType");
        this.LJLILLLLZI = aweme;
        this.LJLJI = eventType;
        C16880lQ.LJJJJJL(this.LJLIL, this);
        List<String> list = null;
        UrlModel urlModel = null;
        if (C58847N7r.LIZIZ(aweme)) {
            this.LJLIL.setVisibility(0);
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                urlModel = awemeRawAd.getRedImageUrl();
            }
            C78766Uvi.LIZ(this.LJLIL, urlModel, new N5Y(z, aweme));
            if (z) {
                AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                if (awemeRawAd2 != null) {
                    N5T.LJI("redpacket", "show_result", awemeRawAd2.getCreativeId(), awemeRawAd2.getLogExtra(), aweme.getAid(), 0);
                }
                AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
                C55707Ltf c55707Ltf = new C55707Ltf();
                c55707Ltf.LIZ = awemeRawAd3;
                c55707Ltf.LIZIZ = "redpacket";
                JSONObject LIZ2 = c55707Ltf.LIZ();
                o.LJIIIIZZ(LIZ2, "ExtraJsonBuilder()\n     …                .create()");
                if (awemeRawAd3 != null) {
                    C58776N4y.LIZ("draw_ad", "othershow", LIZ2, awemeRawAd3);
                }
                C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "othershow", awemeRawAd);
                LIZLLL.LIZJ("redpacket", "refer");
                LIZLLL.LJII();
                return;
            }
            return;
        }
        String str = "";
        if (C58847N7r.LIZ(aweme)) {
            this.LJLIL.setVisibility(0);
            UrlModel image = aweme.getActivityPendant().getImage();
            C62846OlW c62846OlW = this.LJLIL;
            C78766Uvi.LIZ(c62846OlW, image, new OPY(c62846OlW));
            User author = aweme.getAuthor();
            if (!z) {
                return;
            }
            IAppLogDepend LIZ3 = C59835Ne3.LIZ();
            if (LIZ3 != null) {
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("enter_from", eventType);
                c188727au.LJIIIZ("group_id", aweme.getAid());
                if (author != null && (uid2 = author.getUid()) != null) {
                    str = uid2;
                }
                c188727au.LJIIIZ("author_id", str);
                LIZ3.onEventV3Map("show_brand_sticker", c188727au.LIZ);
            }
            C58767N4p c58767N4p = new C58767N4p(aweme);
            UrlModel trackUrlList = aweme.getActivityPendant().getTrackUrlList();
            if (trackUrlList != null) {
                list = trackUrlList.getUrlList();
            }
            N94.LIZ(c58767N4p, list, true);
            return;
        }
        if (C58847N7r.LIZJ(aweme)) {
            this.LJLIL.setVisibility(0);
            SpecialSticker specialSticker = aweme.getSpecialSticker();
            if (specialSticker != null) {
                C62846OlW c62846OlW2 = this.LJLIL;
                C78766Uvi.LIZ(c62846OlW2, specialSticker.getIconUrl(), new OPY(c62846OlW2));
            }
            User author2 = aweme.getAuthor();
            if (!z || (LIZ = C59835Ne3.LIZ()) == null) {
                return;
            }
            C188727au c188727au2 = new C188727au();
            c188727au2.LJIIIZ("enter_from", eventType);
            c188727au2.LJIIIZ("group_id", aweme.getAid());
            if (author2 != null && (uid = author2.getUid()) != null) {
                str = uid;
            }
            c188727au2.LJIIIZ("author_id", str);
            c188727au2.LJIIIZ("sticker_id", aweme.getSpecialSticker().getStickerId());
            LIZ.onEventV3Map("show_brand_sticker", c188727au2.LIZ);
            return;
        }
        this.LJLIL.setVisibility(8);
    }
}
