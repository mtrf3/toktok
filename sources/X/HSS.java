package X;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.keva.Keva;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS151S0200000_4;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.AqS53S0400000_7;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public abstract class HSS extends HSW {
    public AnchorCommonStruct LJLJJL;
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(HSU.LJLIL);
    public long LJLJL = -1;

    @Override // X.S1E
    public CharSequence LIZJ() {
        return null;
    }

    @Override // X.S1E
    public void LJIILL(View view, Aweme aweme, boolean z) {
    }

    @Override // X.S1E
    public void LJIJJ(Aweme aweme) {
    }

    @Override // X.InterfaceC71405S0r
    public void LJIJJLI(C188727au c188727au) {
    }

    public boolean LJJIIJZLJL() {
        return this instanceof C44089HSb;
    }

    public boolean LJJIJ() {
        return this instanceof HSD;
    }

    public String LJJIJIL() {
        return "webview";
    }

    public void LJJIJL(AnchorCommonStruct anchor) {
        o.LJIIIZ(anchor, "anchor");
    }

    @Override // X.S1E
    public String LIZ() {
        String keyword;
        AnchorCommonStruct anchorCommonStruct = this.LJLJJL;
        if (anchorCommonStruct == null || (keyword = anchorCommonStruct.getKeyword()) == null) {
            return "";
        }
        return keyword;
    }

    public final C188727au LJJIJIIJI() {
        String str;
        C188727au c188727au = new C188727au();
        String authorUid = LJJII().getAuthorUid();
        String str2 = "";
        if (authorUid == null) {
            authorUid = "";
        }
        c188727au.LJIIIZ("author_id", authorUid);
        String aid = LJJII().getAid();
        if (aid != null) {
            str2 = aid;
        }
        c188727au.LJIIIZ("group_id", str2);
        c188727au.LJIIIZ("enter_from", LJJIIZI());
        c188727au.LJIIIZ("anchor_type", LJIJI().LIZLLL());
        c188727au.LJIIIZ("anchor_name", LJIJI().LIZJ());
        c188727au.LJIIIZ("anchor_id", LJIJI().LIZ());
        AnchorCommonStruct anchorCommonStruct = this.LJLJJL;
        boolean z = false;
        if (anchorCommonStruct != null) {
            try {
                z = new JSONObject(anchorCommonStruct.getExtra()).optBoolean("mobile_effect_type");
            } catch (JSONException unused) {
            }
            if (z) {
                str = "1";
                c188727au.LJIIIZ("is_mobile_effect", str);
                c188727au.LJIIIZ("music_id", C227768wm.LJIIJJI(LJJII()));
                return c188727au;
            }
        }
        str = CardStruct.IStatusCode.DEFAULT;
        c188727au.LJIIIZ("is_mobile_effect", str);
        c188727au.LJIIIZ("music_id", C227768wm.LJIIJJI(LJJII()));
        return c188727au;
    }

    public final boolean LJJIJIIJIL() {
        if (this.LJLJJL == null) {
            return true;
        }
        return false;
    }

    @Override // X.S1E
    public int type() {
        return EnumC42934Gt8.NO_TYPE.getTYPE();
    }

    public final Activity LJJI() {
        return LJIIIZ().LIZ();
    }

    public final Aweme LJJII() {
        return LJIIIZ().LJJLL();
    }

    public final String LJJIIZ() {
        return LJIIIZ().LJJLIIIJLLLLLLLZ();
    }

    public final String LJJIIZI() {
        return LJIIIZ().LJJLJLI();
    }

    public final JSONObject LJJIJLIJ() {
        return LJIIIZ().LJJLIL();
    }

    @Override // X.S1E
    public void LIZLLL(SmartImageView imageView) {
        o.LJIIIZ(imageView, "imageView");
        LJJJJI(imageView, new AqS151S0200000_4(this, imageView, 29));
    }

    @Override // X.S1E
    public void LJ(C188727au eventMapBuilder) {
        o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        LJJJI(eventMapBuilder);
        if (LJJIJ()) {
            String LJJLJLI = LJIIIZ().LJJLJLI();
            Aweme LJJLL = LJIIIZ().LJJLL();
            C188727au LJJIJIIJI = LJJIJIIJI();
            LJJIJIIJI.LJIIIZ("enter_from", LJJLJLI);
            String authorUid = LJJLL.getAuthorUid();
            String str = "";
            if (authorUid == null) {
                authorUid = "";
            }
            LJJIJIIJI.LJIIIZ("author_id", authorUid);
            LJJIJIIJI.LJIIIZ("music_id", C227768wm.LJIIJJI(LJJLL));
            String aid = LJJLL.getAid();
            if (aid != null) {
                str = aid;
            }
            LJJIJIIJI.LJIIIZ("group_id", str);
            FMX.LJIIL("anchor_entrance_show", LJJIJIIJI.LIZ);
        }
    }

    @Override // X.S1E
    public EnumC26289ATl LJFF(List<AnchorCommonStruct> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) list;
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((AnchorCommonStruct) next).getType() == type()) {
                arrayList.add(next);
            }
        }
        if (arrayList.size() == 0) {
            return EnumC26289ATl.NOT_FOUND;
        }
        AnchorCommonStruct anchorCommonStruct = (AnchorCommonStruct) ListProtector.get(arrayList, 0);
        arrayList2.remove(anchorCommonStruct);
        LJJIJL(anchorCommonStruct);
        LJJ(anchorCommonStruct);
        this.LJLJJL = anchorCommonStruct;
        if (arrayList.size() == 1) {
            return EnumC26289ATl.DONE;
        }
        return EnumC26289ATl.PROCEED;
    }

    @Override // X.S1E
    public void LJI(C188727au c188727au) {
        LJJJ(c188727au);
    }

    public final java.util.Map<String, String> LJJIII(C188727au eventMapBuilder) {
        o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        String LJJLJLI = LJIIIZ().LJJLJLI();
        Aweme LJJLL = LJIIIZ().LJJLL();
        eventMapBuilder.LJIIIZ("enter_from", LJJLJLI);
        String authorUid = LJJLL.getAuthorUid();
        String str = "";
        if (authorUid == null) {
            authorUid = "";
        }
        eventMapBuilder.LJIIIZ("author_id", authorUid);
        String aid = LJJLL.getAid();
        if (aid != null) {
            str = aid;
        }
        eventMapBuilder.LJIIIZ("group_id", str);
        eventMapBuilder.LJIIIZ("music_id", C227768wm.LJIIJJI(LJJLL));
        java.util.Map<String, String> map = eventMapBuilder.LIZ;
        o.LJIIIIZZ(map, "eventMapBuilder\n        …))\n            .builder()");
        return map;
    }

    public final boolean LJJIIJ(String anchorId) {
        o.LJIIIZ(anchorId, "anchorId");
        Keva keva = (Keva) this.LJLJJLL.getValue();
        StringBuilder LJFF = C72972SkS.LJFF(anchorId, '@');
        LJFF.append(LJJII().getAid());
        return keva.getBoolean(X1D.LIZIZ(LJFF), false);
    }

    public void LJJJ(C188727au eventMapBuilder) {
        String str;
        o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        Aweme LJJII = LJJII();
        String LJJIIZI = LJJIIZI();
        java.util.Map<String, String> LJJIII = LJJIII(eventMapBuilder);
        if (LJJII != null && LJJII.isAd()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        HashMap hashMap = (HashMap) LJJIII;
        hashMap.put("is_ad", str);
        hashMap.put("hit_fcp", String.valueOf(FRY.LIZ()));
        C211648Si.LIZLLL++;
        FMX.LJIIL("multi_anchor_entrance_click", LJJIII);
        if (LJJIJ()) {
            C188727au LJJIJIIJI = LJJIJIIJI();
            LJJIJIIJI.LJIIIZ("enter_method", LJJIIZ());
            LJJIJIIJI.LJIIIZ("enter_from", LJJIIZI);
            String authorUid = LJJII.getAuthorUid();
            String str2 = "";
            if (authorUid == null) {
                authorUid = "";
            }
            LJJIJIIJI.LJIIIZ("author_id", authorUid);
            String aid = LJJII.getAid();
            if (aid != null) {
                str2 = aid;
            }
            LJJIJIIJI.LJIIIZ("group_id", str2);
            LJJIJIIJI.LJIIIZ("music_id", C227768wm.LJIIJJI(LJJII));
            FMX.LJIIL("anchor_entrance_click", LJJIJIIJI.LIZ);
        }
    }

    public void LJJJI(C188727au eventMapBuilder) {
        o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        String LJJLJLI = LJIIIZ().LJJLJLI();
        Aweme LJJLL = LJIIIZ().LJJLL();
        C211648Si.LIZ(eventMapBuilder, LJJLL, LJJLJLI, true);
        eventMapBuilder.LJIIIZ("enter_method", LJJIIZ());
        eventMapBuilder.LJIIIZ("enter_from", LJJLJLI);
        String authorUid = LJJLL.getAuthorUid();
        String str = "";
        if (authorUid == null) {
            authorUid = "";
        }
        eventMapBuilder.LJIIIZ("author_id", authorUid);
        eventMapBuilder.LJIIIZ("music_id", C227768wm.LJIIJJI(LJJLL));
        String aid = LJJLL.getAid();
        if (aid != null) {
            str = aid;
        }
        eventMapBuilder.LJIIIZ("group_id", str);
        FMX.LJIIL("multi_anchor_entrance_show", eventMapBuilder.LIZ);
    }

    public final void LJJJIL(String anchorId) {
        o.LJIIIZ(anchorId, "anchorId");
        Keva keva = (Keva) this.LJLJJLL.getValue();
        StringBuilder LJFF = C72972SkS.LJFF(anchorId, '@');
        LJFF.append(LJJII().getAid());
        keva.storeBoolean(X1D.LIZIZ(LJFF), true);
    }

    public void LJJJJ(C72209SVp c72209SVp) {
        LJJJJIZL(new AqS173S0100000_7(c72209SVp, 242));
    }

    public final void LJJJJIZL(InterfaceC88472Yns<? super AnchorCommonStruct, C76800UCe> action) {
        o.LJIIIZ(action, "action");
        AnchorCommonStruct anchorCommonStruct = this.LJLJJL;
        if (anchorCommonStruct != null) {
            action.invoke(anchorCommonStruct);
        }
    }

    public static void LJJIFFI(C188727au c188727au, JSONObject jSONObject) {
        o.LJIIIZ(c188727au, "<this>");
        Iterator<String> keys = jSONObject.keys();
        o.LJIIIIZZ(keys, "jsonObject.keys()");
        while (keys.hasNext()) {
            String next = keys.next();
            String optString = jSONObject.optString(next, "");
            if (C78857UxB.LJJJIL(optString)) {
                c188727au.LJI(next, optString);
            }
        }
    }

    public final void LJJJJI(SmartImageView imageView, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        UrlModel newStyleBubbleIcon;
        o.LJIIIZ(imageView, "imageView");
        AnchorCommonStruct anchorCommonStruct = this.LJLJJL;
        if (anchorCommonStruct != null && (newStyleBubbleIcon = anchorCommonStruct.getNewStyleBubbleIcon()) != null && this.LJLJJI) {
            W5F LJII = W5U.LJII(C78939UyV.LJ(newStyleBubbleIcon));
            LJII.LJJIIJ = imageView;
            C16880lQ.LLJJJ(LJII);
            return;
        }
        interfaceC65784Pro.invoke();
    }

    public static /* synthetic */ void LJJIZ(HSS hss, C188727au c188727au, int i) {
        boolean z;
        boolean z2 = true;
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 4) == 0) {
            z2 = false;
        }
        hss.LJJIL(c188727au, z, z2);
    }

    public void LJJIL(C188727au eventMapBuilder, boolean z, boolean z2) {
        String str;
        o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        String LJJLJLI = LJIIIZ().LJJLJLI();
        Aweme LJJLL = LJIIIZ().LJJLL();
        String str2 = null;
        String str3 = "";
        if (z) {
            C188727au c188727au = new C188727au();
            C88547Yp5 c88547Yp5 = C88547Yp5.LIZIZ;
            if (c88547Yp5.LJIJI()) {
                c188727au.LIZLLL(c88547Yp5.LJIJJ(C227768wm.LIZIZ(LJJLL)), "spammy_tag_cnt");
            }
            c188727au.LJIIIZ("enter_method", LJJIIZ());
            c188727au.LJII(new HashMap(eventMapBuilder.LIZ));
            c188727au.LJIIIZ("enter_from", LJJLJLI);
            AnchorCommonStruct anchorCommonStruct = this.LJLJJL;
            if (anchorCommonStruct != null) {
                str = anchorCommonStruct.getKeyword();
            } else {
                str = null;
            }
            c188727au.LJIIIZ("anchor_entry", str);
            String authorUid = LJJLL.getAuthorUid();
            if (authorUid == null) {
                authorUid = "";
            }
            c188727au.LJIIIZ("author_id", authorUid);
            String aid = LJJLL.getAid();
            if (aid == null) {
                aid = "";
            }
            c188727au.LJIIIZ("group_id", aid);
            c188727au.LJIIIZ("click_type", LJJIJIL());
            c188727au.LJIIIZ("music_id", C227768wm.LJIIJJI(LJJLL));
            FMX.LJIIL("enter_multi_anchor_detail", c188727au.LIZ);
        }
        if (LJJIJ() && z && z2) {
            String LJJLJLI2 = LJIIIZ().LJJLJLI();
            Aweme LJJLL2 = LJIIIZ().LJJLL();
            C188727au LJJIJIIJI = LJJIJIIJI();
            LJJIJIIJI.LJIIIZ("enter_from", LJJLJLI2);
            AnchorCommonStruct anchorCommonStruct2 = this.LJLJJL;
            if (anchorCommonStruct2 != null) {
                str2 = anchorCommonStruct2.getKeyword();
            }
            LJJIJIIJI.LJIIIZ("anchor_entry", str2);
            String authorUid2 = LJJLL2.getAuthorUid();
            if (authorUid2 == null) {
                authorUid2 = "";
            }
            LJJIJIIJI.LJIIIZ("author_id", authorUid2);
            String aid2 = LJJLL2.getAid();
            if (aid2 != null) {
                str3 = aid2;
            }
            LJJIJIIJI.LJIIIZ("group_id", str3);
            LJJIJIIJI.LJIIIZ("music_id", C227768wm.LJIIJJI(LJJLL2));
            FMX.LJIIL("enter_anchor_detail", LJJIJIIJI.LIZ);
        }
    }

    @Override // X.InterfaceC71405S0r
    public void LIZIZ(ViewGroup viewGroup, Dialog dialog, C188727au c188727au, int i) {
        o.LJIIIZ(dialog, "dialog");
        LJIIJ(viewGroup, dialog, c188727au, i);
    }

    @Override // X.S1E
    public void LJIIJ(ViewGroup viewGroup, Dialog dialog, C188727au c188727au, int i) {
        o.LJIIIZ(dialog, "dialog");
        LJJJJIZL(new AqS53S0400000_7(viewGroup, this, c188727au, dialog, 5));
    }
}
