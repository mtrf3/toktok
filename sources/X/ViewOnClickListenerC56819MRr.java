package X;

import Y.IDTListenerS118S0100000_9;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.BidiFormatter;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeChannelInfo;
import com.ss.android.ugc.aweme.notice.repo.list.bean.SystemNoticeData;
import com.ss.android.ugc.aweme.notification.perf.NoticeVideoManager;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.MRr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ViewOnClickListenerC56819MRr extends RecyclerView.ViewHolder implements View.OnClickListener {
    public final Fragment LJLIL;
    public final MOH LJLILLLLZI;
    public final C81367VwZ LJLJI;
    public final Context LJLJJI;
    public SystemNoticeData LJLJJL;
    public final String LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final C62822Ol8 LJLL;
    public final C62822Ol8 LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public final C62822Ol8 LJLLL;
    public final C62822Ol8 LJLLLL;
    public final C62822Ol8 LJLLLLLL;
    public final C62822Ol8 LJLZ;
    public final C62822Ol8 LJZ;
    public final C62822Ol8 LJZI;
    public final C62822Ol8 LJZL;
    public final C62822Ol8 LL;
    public final C62822Ol8 LLD;
    public final C62822Ol8 LLF;
    public final java.util.Map<Integer, String> LLFF;
    public String LLFFF;
    public String LLFII;
    public int LLFZ;
    public InterfaceC65784Pro<C76800UCe> LLI;
    public List<? extends InterfaceC56825MRx> LLIFFJFJJ;
    public Drawable LLII;

    public final C1AH T() {
        Object value = this.LLF.getValue();
        o.LJIIIIZZ(value, "<get-gAction>(...)");
        return (C1AH) value;
    }

    public final C1AH U() {
        Object value = this.LJLLJ.getValue();
        o.LJIIIIZZ(value, "<get-gBigCover>(...)");
        return (C1AH) value;
    }

    public final C1AH V() {
        Object value = this.LJLLI.getValue();
        o.LJIIIIZZ(value, "<get-gChannel>(...)");
        return (C1AH) value;
    }

    public final SHA X() {
        Object value = this.LJLLL.getValue();
        o.LJIIIIZZ(value, "<get-ivRightCover>(...)");
        return (SHA) value;
    }

    public final View Y() {
        Object value = this.LL.getValue();
        o.LJIIIIZZ(value, "<get-seeMoreLayout>(...)");
        return (View) value;
    }

    public final TuxTextView a0() {
        Object value = this.LJZ.getValue();
        o.LJIIIIZZ(value, "<get-tvContent>(...)");
        return (TuxTextView) value;
    }

    public final TuxTextView c0() {
        Object value = this.LJLLLL.getValue();
        o.LJIIIIZZ(value, "<get-tvTitle>(...)");
        return (TuxTextView) value;
    }

    public final void i0() {
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LLI;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public static SpannableStringBuilder P(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((char) 8296);
        spannableStringBuilder.append((CharSequence) str);
        spannableStringBuilder.append((char) 8297);
        return spannableStringBuilder;
    }

    public final void g0(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        android.net.Uri parse = UriProtector.parse(str);
        o.LJIIIIZZ(parse, "parse(url)");
        Context context = this.LJLJJI;
        o.LJIIIIZZ(context, "context");
        Activity LJIJJ = C45804HyK.LJIJJ(context);
        if (LJIJJ != null) {
            C61200O0e LIZLLL = C61200O0e.LIZLLL();
            C39061g6 c39061g6 = new C39061g6(str);
            String queryParameter = UriProtector.getQueryParameter(parse, "show_comment");
            if (queryParameter == null) {
                queryParameter = CardStruct.IStatusCode.DEFAULT;
            }
            c39061g6.LIZIZ("comment_force_open_reply", queryParameter);
            String queryParameter2 = UriProtector.getQueryParameter(parse, "enter_method");
            if (queryParameter2 == null) {
                queryParameter2 = "click";
            }
            c39061g6.LIZIZ("enter_method", queryParameter2);
            NoticeVideoManager.LIZLLL(c39061g6, str);
            LIZLLL.LJI(LJIJJ, c39061g6.LIZJ());
        }
    }

    public final void l0(boolean z) {
        if (z) {
            if (V().getVisibility() == 0) {
                Object value = this.LJLJLLL.getValue();
                o.LJIIIIZZ(value, "<get-ivMoreOperation>(...)");
                ((ImageView) value).setVisibility(0);
                Object value2 = this.LJZL.getValue();
                o.LJIIIIZZ(value2, "<get-ivMoreOperationWithTitle>(...)");
                ((ImageView) value2).setVisibility(8);
                return;
            }
            Object value3 = this.LJLJLLL.getValue();
            o.LJIIIIZZ(value3, "<get-ivMoreOperation>(...)");
            ((ImageView) value3).setVisibility(8);
            Object value4 = this.LJZL.getValue();
            o.LJIIIIZZ(value4, "<get-ivMoreOperationWithTitle>(...)");
            ((ImageView) value4).setVisibility(0);
            return;
        }
        Object value5 = this.LJLJLLL.getValue();
        o.LJIIIIZZ(value5, "<get-ivMoreOperation>(...)");
        ((ImageView) value5).setVisibility(8);
        Object value6 = this.LJZL.getValue();
        o.LJIIIIZZ(value6, "<get-ivMoreOperationWithTitle>(...)");
        ((ImageView) value6).setVisibility(8);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SystemNoticeData systemNoticeData;
        MusNotice notice;
        MusNotice notice2;
        if (view == null || (systemNoticeData = this.LJLJJL) == null || (notice = systemNoticeData.getNotice()) == null) {
            return;
        }
        if (view.getId() == R.id.b9e) {
            i0();
            SmartRoute buildRoute = SmartRouter.buildRoute(this.LJLIL, "aweme://inbox/system_notice");
            buildRoute.withParam("group", notice.channelInfo.group);
            C0NY.LIZJ(buildRoute, "title", notice.channelInfo.name, "single_channel", true);
            SystemNoticeData systemNoticeData2 = this.LJLJJL;
            if (systemNoticeData2 == null || (notice2 = systemNoticeData2.getNotice()) == null) {
                return;
            }
            C188727au c188727au = new C188727au();
            N(c188727au, notice2);
            FMX.LJIIL("enter_official_account", c188727au.LIZ);
            return;
        }
        int id = view.getId();
        if (id == R.id.evy) {
            i0();
            String str = (String) ((LinkedHashMap) this.LLFF).get(Integer.valueOf(view.getId()));
            EnumC56821MRt enumC56821MRt = EnumC56821MRt.MIDDLE_BANNER;
            if (!f0(view, str, enumC56821MRt)) {
                g0(str);
            }
            h0(EnumC56820MRs.Click, enumC56821MRt);
            return;
        }
        if (id == R.id.eww) {
            i0();
            String str2 = (String) ((LinkedHashMap) this.LLFF).get(Integer.valueOf(view.getId()));
            EnumC56821MRt enumC56821MRt2 = EnumC56821MRt.RIGHT_COVER;
            if (!f0(view, str2, enumC56821MRt2)) {
                g0(str2);
            }
            h0(EnumC56820MRs.Click, enumC56821MRt2);
            return;
        }
        if (id == R.id.lvf) {
            i0();
            String str3 = (String) ((LinkedHashMap) this.LLFF).get(Integer.valueOf(view.getId()));
            EnumC56821MRt enumC56821MRt3 = EnumC56821MRt.BOTTOM_ACTION;
            if (!f0(view, str3, enumC56821MRt3)) {
                g0(str3);
            }
            h0(EnumC56820MRs.Click, enumC56821MRt3);
            return;
        }
        i0();
        String str4 = this.LLFFF;
        EnumC56821MRt enumC56821MRt4 = EnumC56821MRt.ROOT;
        if (!f0(view, str4, enumC56821MRt4)) {
            g0(str4);
        }
        h0(EnumC56820MRs.Click, enumC56821MRt4);
    }

    public final void M(String str, String str2) {
        if (str == null || str.length() == 0) {
            T().setVisibility(8);
            return;
        }
        this.LLFFF = str;
        this.LLFF.put(Integer.valueOf(R.id.lvf), str);
        T().setVisibility(0);
        Object value = this.LLD.getValue();
        o.LJIIIIZZ(value, "<get-tvAction>(...)");
        C116724i4 c116724i4 = new C116724i4();
        c116724i4.LIZIZ(str2);
        ((TextView) value).setText(c116724i4.LIZ.toString());
    }

    public final void N(C188727au c188727au, MusNotice musNotice) {
        String str;
        int i;
        long j = musNotice.taskId;
        c188727au.LJIIIZ("enter_from", this.LJLILLLLZI.LJIIJ());
        NoticeChannelInfo noticeChannelInfo = musNotice.channelInfo;
        String str2 = null;
        if (noticeChannelInfo != null) {
            str = noticeChannelInfo.accountType;
        } else {
            str = null;
        }
        c188727au.LJIIIZ("account_type", str);
        c188727au.LJIIIZ("content_id", musNotice.nid);
        c188727au.LJIIIZ("template_id", musNotice.templateId);
        if (j != 0) {
            str2 = String.valueOf(j);
        }
        c188727au.LJIIIZ("task_id", str2);
        String str3 = this.LLFFF;
        if (str3 == null || str3.length() == 0) {
            i = 1;
        } else {
            i = 0;
        }
        c188727au.LIZLLL(i ^ 1, "is_land");
        c188727au.LIZLLL(musNotice.hasRead ? 1 : 0, "is_read");
    }

    public final SpannableStringBuilder Q(String str, MusNotice musNotice) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((char) 8296);
        spannableStringBuilder.append((CharSequence) str);
        spannableStringBuilder.append((char) 8297);
        MVV.addCreateTimeSpan(spannableStringBuilder, musNotice, this.LJLJJI);
        return spannableStringBuilder;
    }

    public final void h0(EnumC56820MRs enumC56820MRs, EnumC56821MRt enumC56821MRt) {
        MusNotice notice;
        JSONObject jSONObject;
        String str;
        String str2;
        SystemNoticeData systemNoticeData = this.LJLJJL;
        if (systemNoticeData == null || (notice = systemNoticeData.getNotice()) == null) {
            return;
        }
        try {
            C188727au c188727au = new C188727au();
            GeneralTemplateNotice generalTemplateNotice = notice.templateNotice;
            if (generalTemplateNotice != null && (str2 = generalTemplateNotice.messageExtra) != null) {
                jSONObject = new JSONObject(str2);
            } else {
                jSONObject = new JSONObject();
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<String> keys = jSONObject.keys();
            o.LJIIIIZZ(keys, "json.keys()");
            while (keys.hasNext()) {
                String key = keys.next();
                try {
                    if (o.LJ(key, "business_extra")) {
                        JSONObject jSONObject2 = new JSONObject(jSONObject.optString(key));
                        Iterator<String> keys2 = jSONObject2.keys();
                        o.LJIIIIZZ(keys2, "business.keys()");
                        while (keys2.hasNext()) {
                            String businessKey = keys2.next();
                            o.LJIIIIZZ(businessKey, "businessKey");
                            String optString = jSONObject2.optString(businessKey);
                            o.LJIIIIZZ(optString, "business.optString(businessKey)");
                            linkedHashMap.put(businessKey, optString);
                        }
                    } else if (!linkedHashMap.containsKey(key)) {
                        o.LJIIIIZZ(key, "key");
                        String optString2 = jSONObject.optString(key);
                        o.LJIIIIZZ(optString2, "json.optString(key)");
                        linkedHashMap.put(key, optString2);
                    }
                    C3C5.m7constructorimpl(C76800UCe.LIZ);
                } catch (Throwable th) {
                    C3C5.m7constructorimpl(C141335gf.LIZ(th));
                }
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                c188727au.LJI((String) entry.getKey(), (String) entry.getValue());
            }
            N(c188727au, notice);
            c188727au.LJI("action_type", enumC56820MRs.getValue());
            if (enumC56820MRs == EnumC56820MRs.Show) {
                str = "";
            } else if (C56822MRu.LIZ[enumC56821MRt.ordinal()] == 1) {
                str = "view_more";
            } else {
                str = "click_content";
            }
            c188727au.LJI("enter_method", str);
            c188727au.LJI("category_type", String.valueOf(notice.channelCategory));
            c188727au.LJI("subscribe_status", notice.unsubscribeStatusToMob());
            c188727au.LIZLLL(this.LLFZ, "client_order");
            c188727au.LJ(notice.createTime, "message_time");
            c188727au.LJI("page_name", this.LJLILLLLZI.LJIIJ());
            FMX.LJIIL("official_message_inner_message", c188727au.LIZ);
        } catch (Exception e) {
            C221018lt.LJ(e);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC56819MRr(Fragment fragment, MOH model, C81367VwZ c81367VwZ) {
        super(c81367VwZ);
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(model, "model");
        this.LJLIL = fragment;
        this.LJLILLLLZI = model;
        this.LJLJI = c81367VwZ;
        Context context = c81367VwZ.getContext();
        this.LJLJJI = context;
        String string = context.getString(R.string.hft);
        o.LJIIIIZZ(string, "context.getString(R.stri…ication_single_view_more)");
        this.LJLJJLL = string;
        this.LJLJL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 454));
        this.LJLJLJ = C221108m2.LIZIZ(new AqS159S0100000_9(this, 462));
        this.LJLJLLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 455));
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS159S0100000_9(this, 449));
        this.LJLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 459));
        this.LJLLI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 452));
        C62822Ol8 LIZIZ2 = C221108m2.LIZIZ(new AqS159S0100000_9(this, 453));
        this.LJLLILLLL = LIZIZ2;
        this.LJLLJ = C221108m2.LIZIZ(new AqS159S0100000_9(this, 451));
        this.LJLLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 457));
        this.LJLLLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 464));
        this.LJLLLLLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 458));
        this.LJLZ = C221108m2.LIZIZ(new AqS159S0100000_9(this, 465));
        this.LJZ = C221108m2.LIZIZ(new AqS159S0100000_9(this, 463));
        this.LJZI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 466));
        this.LJZL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 456));
        this.LL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 460));
        C62822Ol8 LIZIZ3 = C221108m2.LIZIZ(new AqS159S0100000_9(this, 461));
        this.LLD = LIZIZ3;
        this.LLF = C221108m2.LIZIZ(new AqS159S0100000_9(this, 450));
        this.LLFF = new LinkedHashMap();
        this.LLFII = "";
        this.LLIFFJFJJ = C61878OQg.INSTANCE;
        IDTListenerS118S0100000_9 iDTListenerS118S0100000_9 = new IDTListenerS118S0100000_9(this, 2);
        IDTListenerS118S0100000_9 iDTListenerS118S0100000_92 = new IDTListenerS118S0100000_9(this, 1);
        c81367VwZ.setOnClickListener(new ViewOnClickListenerC13880ga(this));
        Object value = LIZIZ.getValue();
        o.LJIIIIZZ(value, "<get-channelClickArea>(...)");
        C16880lQ.LJIIJ(this, (View) value);
        Object value2 = LIZIZ2.getValue();
        o.LJIIIIZZ(value2, "<get-ivBigCover>(...)");
        ((View) value2).setOnClickListener(new ViewOnClickListenerC13880ga(this));
        X().setOnClickListener(new ViewOnClickListenerC13880ga(this));
        Object value3 = LIZIZ3.getValue();
        o.LJIIIIZZ(value3, "<get-tvAction>(...)");
        C16880lQ.LJJJJI((TuxTextView) value3, this);
        if (C53341Kwb.LIZ()) {
            Object value4 = LIZIZ.getValue();
            o.LJIIIIZZ(value4, "<get-channelClickArea>(...)");
            ((View) value4).setOnTouchListener(iDTListenerS118S0100000_9);
            Object value5 = LIZIZ3.getValue();
            o.LJIIIIZZ(value5, "<get-tvAction>(...)");
            ((View) value5).setOnTouchListener(iDTListenerS118S0100000_92);
            c81367VwZ.setOnTouchListener(iDTListenerS118S0100000_92);
        }
    }

    public final boolean f0(View view, String str, EnumC56821MRt enumC56821MRt) {
        GeneralTemplateNotice generalTemplateNotice;
        MWI mwi;
        MusNotice notice;
        MusNotice notice2;
        SystemNoticeData systemNoticeData = this.LJLJJL;
        String str2 = null;
        if (systemNoticeData != null && (notice2 = systemNoticeData.getNotice()) != null) {
            generalTemplateNotice = notice2.templateNotice;
        } else {
            generalTemplateNotice = null;
        }
        if (generalTemplateNotice == null) {
            return false;
        }
        int i = C56822MRu.LIZ[enumC56821MRt.ordinal()];
        if (i != 1) {
            if (i != 2) {
                mwi = MWI.Middle;
            } else {
                mwi = MWI.Right;
            }
        } else {
            mwi = MWI.Root;
        }
        int i2 = this.LLFZ;
        MOH moh = this.LJLILLLLZI;
        String str3 = moh.LJLJJL;
        String LJIIJ = moh.LJIIJ();
        SystemNoticeData systemNoticeData2 = this.LJLJJL;
        if (systemNoticeData2 != null && (notice = systemNoticeData2.getNotice()) != null) {
            str2 = notice.getAccountType();
        }
        C56889MUj c56889MUj = new C56889MUj(generalTemplateNotice, view, str, mwi, i2, "", str3, LJIIJ, true, str2, null);
        List<? extends InterfaceC56825MRx> list = this.LLIFFJFJJ;
        if (list != null) {
            Iterator<? extends InterfaceC56825MRx> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().LIZJ(c56889MUj)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final void L(String str, String str2, String str3, MusNotice musNotice) {
        this.LLFII = str;
        Object value = this.LJZI.getValue();
        o.LJIIIIZZ(value, "<get-vContentBottomMargin>(...)");
        ((View) value).setVisibility(0);
        Y().setVisibility(8);
        if (str2 == null || str2.length() == 0) {
            c0().setText(Q(str, musNotice));
            a0().setVisibility(8);
        } else {
            c0().setText(P(str));
            a0().setVisibility(0);
            this.LJLJI.LJJLL(Q(str2, musNotice), BidiFormatter.getInstance().isRtl(str2));
        }
        M(str3, this.LJLJJLL);
    }
}
