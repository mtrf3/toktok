package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C141335gf;
import X.C26867AgZ;
import X.C36746EbW;
import X.C3C5;
import X.C43921HLp;
import X.C51762KTe;
import X.C53710L6c;
import X.C56045Lz7;
import X.C76800UCe;
import X.InterfaceC55235Lm3;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.L6Y;
import X.OJD;
import X.X1D;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.FashionMallFragment;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.ui.MallShopCartAssem;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.feed.ui.share.SharedVideoDeepLinkHelper;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.feed.common.StoryFeedViewModel;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import ujb.s;

/* loaded from: classes10.dex */
public class AqS64S1200000_9 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS64S1200000_9 aqS64S1200000_9) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(aqS64S1200000_9.s0);
        LIZ.append(", clazz: ");
        LIZ.append((Class) aqS64S1200000_9.l1);
        LIZ.append(", scope: ");
        LIZ.append((InterfaceC55235Lm3) aqS64S1200000_9.l2);
        return X1D.LIZIZ(LIZ);
    }

    public static final Object invoke$1(AqS64S1200000_9 aqS64S1200000_9) {
        if (((StoryFeedViewModel) aqS64S1200000_9.l1).Gv0(aqS64S1200000_9.s0)) {
            C43921HLp c43921HLp = C43921HLp.LIZ;
            UserStory it = (UserStory) aqS64S1200000_9.l2;
            o.LJIIIIZZ(it, "it");
            c43921HLp.LJ(it);
        }
        ((StoryFeedViewModel) aqS64S1200000_9.l1).sv0(aqS64S1200000_9.s0);
        ((StoryFeedViewModel) aqS64S1200000_9.l1).jv0((UserStory) aqS64S1200000_9.l2, "LOAD_USER_STORY_SUCCESS");
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS64S1200000_9 aqS64S1200000_9) {
        ((SharedVideoDeepLinkHelper) aqS64S1200000_9.l1).LIZIZ((User) aqS64S1200000_9.l2, aqS64S1200000_9.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS64S1200000_9 aqS64S1200000_9) {
        Context context = (Context) aqS64S1200000_9.l1;
        MallShopCartAssem mallShopCartAssem = (MallShopCartAssem) aqS64S1200000_9.l2;
        String str = aqS64S1200000_9.s0;
        mallShopCartAssem.getClass();
        if (!TextUtils.isEmpty(str)) {
            FashionMallFragment.LJZ.getClass();
            String str2 = null;
            if (!C51762KTe.LIZIZ()) {
                try {
                    Uri parse = UriProtector.parse(str);
                    String queryParameter = UriProtector.getQueryParameter(parse, "trackParams");
                    if (queryParameter != null) {
                        JSONObject jSONObject = new JSONObject(queryParameter);
                        if (!jSONObject.has("traffic_source_list")) {
                            jSONObject.putOpt("traffic_source_list", new JSONArray(new int[]{6}));
                        }
                        String uri = parse.toString();
                        if (uri != null && s.LJJJLZIJ(uri, "trackParams=", false)) {
                            String uri2 = parse.toString();
                            o.LJIIIIZZ(uri2, "targetUri.toString()");
                            OJD ojd = new OJD("(trackParams=[^&]*)");
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("trackParams=");
                            LIZ.append(URLEncoder.encode(jSONObject.toString(), "UTF-8"));
                            str = ojd.replace(uri2, X1D.LIZIZ(LIZ));
                        }
                        str2 = queryParameter;
                    }
                    C3C5.m7constructorimpl(str2);
                } catch (Throwable th) {
                    C3C5.m7constructorimpl(C141335gf.LIZ(th));
                }
            } else {
                try {
                    Uri parse2 = UriProtector.parse(str);
                    String queryParameter2 = UriProtector.getQueryParameter(parse2, "trackParams");
                    if (queryParameter2 != null) {
                        JSONObject jSONObject2 = new JSONObject(queryParameter2);
                        if (jSONObject2.has("enter_from")) {
                            C56045Lz7.LIZ.getClass();
                            jSONObject2.put("enter_from", C56045Lz7.LIZIZ());
                        }
                        String uri3 = parse2.toString();
                        o.LJIIIIZZ(uri3, "targetUri.toString()");
                        OJD ojd2 = new OJD("(trackParams=[^&]*)");
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("trackParams=");
                        LIZ2.append(URLEncoder.encode(jSONObject2.toString(), "UTF-8"));
                        str = ojd2.replace(uri3, X1D.LIZIZ(LIZ2));
                        str2 = queryParameter2;
                    }
                    C3C5.m7constructorimpl(str2);
                } catch (Throwable th2) {
                    C3C5.m7constructorimpl(C141335gf.LIZ(th2));
                }
                C36746EbW.LIZ(3, str);
            }
        }
        C26867AgZ.LIZIZ(context, str, new LinkedHashMap(), false).open();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS64S1200000_9 aqS64S1200000_9) {
        int i;
        C53710L6c c53710L6c;
        Integer valueOf;
        String str = aqS64S1200000_9.s0;
        if (str != null && (c53710L6c = ((L6Y) aqS64S1200000_9.l2).M().get(str)) != null && (valueOf = Integer.valueOf(c53710L6c.LIZ)) != null) {
            i = valueOf.intValue();
        } else {
            i = -1;
        }
        ((InterfaceC88472Yns) aqS64S1200000_9.l1).invoke(Integer.valueOf(i));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS64S1200000_9(InterfaceC55235Lm3 interfaceC55235Lm3, Class cls, String str, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = cls;
        this.l2 = interfaceC55235Lm3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS64S1200000_9(Context context, MallShopCartAssem mallShopCartAssem, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = context;
        this.l2 = mallShopCartAssem;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS64S1200000_9(SharedVideoDeepLinkHelper sharedVideoDeepLinkHelper, String str, User user, int i) {
        super(0);
        this.$t = i;
        this.l1 = sharedVideoDeepLinkHelper;
        this.s0 = str;
        this.l2 = user;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS64S1200000_9(StoryFeedViewModel storyFeedViewModel, String str, UserStory userStory, int i) {
        super(0);
        this.$t = i;
        this.l1 = storyFeedViewModel;
        this.s0 = str;
        this.l2 = userStory;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS64S1200000_9(String str, AqS167S0100000_1 aqS167S0100000_1, L6Y l6y, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = aqS167S0100000_1;
        this.l2 = l6y;
    }
}
