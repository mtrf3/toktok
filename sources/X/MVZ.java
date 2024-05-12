package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeGroupAttrs;
import com.ss.android.ugc.aweme.notice.repo.list.bean.ActionToReportStruct;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.NoticeUITemplate;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.TitleTemplate;
import com.ss.android.ugc.aweme.notification.api.NotificationApi;
import com.ss.android.ugc.aweme.notification.vm.NotificationDetailVM;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MVZ extends MVY implements InterfaceC56930MVy {
    public final InterfaceC88472Yns<Integer, C76800UCe> LJLIL;
    public MusNotice LJLILLLLZI;
    public String LJLJI;
    public boolean LJLJJI;
    public String LJLJJL;
    public int LJLJJLL;
    public String LJLJL;
    public boolean LJLJLJ;
    public List<? extends InterfaceC56825MRx> LJLJLLL;
    public C56927MVv LJLL;
    public String LJLLI;
    public NotificationDetailVM LJLLILLLL;

    @Override // X.InterfaceC56930MVy
    public final MVZ LJJIJL() {
        return this;
    }

    @Override // X.InterfaceC56930MVy
    public final boolean LLILII() {
        GeneralTemplateNotice generalTemplateNotice;
        NoticeUITemplate noticeUITemplate;
        TitleTemplate titleTemplate;
        List<User> list;
        User user;
        String str;
        MusNotice musNotice = this.LJLILLLLZI;
        if (musNotice != null && (generalTemplateNotice = musNotice.templateNotice) != null && (noticeUITemplate = generalTemplateNotice.uiTemplate) != null && (titleTemplate = noticeUITemplate.titleTemplate) != null && (list = titleTemplate.fromUsers) != null && (user = (User) ORZ.LJLLLL(list)) != null) {
            String str2 = AX5.LIZ;
            EnumC57366MfK enumC57366MfK = EnumC57366MfK.RELATION_LABEL;
            BaseNotice baseNotice = this.mMTBaseNotice;
            if (baseNotice != null) {
                str = baseNotice.getAccountType();
            } else {
                str = null;
            }
            enterProfileWithRecommendParams(user, "notification_page", str2, enumC57366MfK, true, str);
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC56930MVy
    public final void D() {
        P(EnumC56820MRs.Click);
        LLJJJIL();
    }

    @Override // X.InterfaceC56930MVy
    public final void LIZJ() {
        InterfaceC88472Yns<Integer, C76800UCe> interfaceC88472Yns = this.LJLIL;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Integer.valueOf(getWrappedAdapterPosition()));
        }
    }

    @Override // X.InterfaceC56930MVy
    public final String LLILIL() {
        C56927MVv c56927MVv = this.LJLL;
        if (c56927MVv != null) {
            return c56927MVv.LIZ(this.LJLJLJ);
        }
        return null;
    }

    @Override // X.InterfaceC56930MVy
    public final String LLJILJILJ() {
        MusNotice musNotice = this.LJLILLLLZI;
        if (musNotice != null) {
            return musNotice.getAccountType();
        }
        return null;
    }

    @Override // X.InterfaceC56930MVy
    public final void LLJJJIL() {
        MusNotice musNotice = this.LJLILLLLZI;
        if (musNotice == null) {
            return;
        }
        musNotice.hasRead = true;
    }

    public final void N() {
        MusNotice musNotice = this.LJLILLLLZI;
        if (musNotice != null) {
            int i = this.LJLJJLL;
            String str = this.LJLJL;
            String str2 = this.LJLJI;
            String str3 = this.LJLJJL;
            if (str3 == null) {
                str3 = "";
            }
            C56890MUk c56890MUk = new C56890MUk(musNotice, i, str, str2, str3, this.LJLJJI);
            Iterator<? extends InterfaceC56825MRx> it = this.LJLJLLL.iterator();
            while (it.hasNext()) {
                it.next().LIZ(c56890MUk);
            }
        }
    }

    @Override // X.InterfaceC56930MVy
    public final Fragment getCurFragment() {
        Fragment fragment = this.mFragment;
        o.LJIIIIZZ(fragment, "fragment");
        return fragment;
    }

    @Override // X.MVY
    public final boolean isFromAggregatedAvatar() {
        GeneralTemplateNotice generalTemplateNotice;
        NoticeUITemplate noticeUITemplate;
        TitleTemplate titleTemplate;
        List<User> list;
        Integer valueOf;
        MusNotice musNotice = this.LJLILLLLZI;
        if (musNotice != null && (generalTemplateNotice = musNotice.templateNotice) != null && (noticeUITemplate = generalTemplateNotice.uiTemplate) != null && (titleTemplate = noticeUITemplate.titleTemplate) != null && (list = titleTemplate.fromUsers) != null && (valueOf = Integer.valueOf(list.size())) != null && valueOf.intValue() > 1) {
            return true;
        }
        return false;
    }

    @Override // X.MVV, X.ViewOnClickListenerC56908MVc
    public final boolean needLongClick() {
        GeneralTemplateNotice generalTemplateNotice;
        MusNotice musNotice = this.LJLILLLLZI;
        if (musNotice == null || (generalTemplateNotice = musNotice.templateNotice) == null || generalTemplateNotice.shouldKeep) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC56930MVy
    public final HashMap<String, String> r() {
        String str;
        String str2;
        String str3;
        MWH Kg0;
        MWH Kg02;
        HashMap<String, String> hashMap = new HashMap<>();
        BaseNotice baseNotice = this.mMTBaseNotice;
        String str4 = null;
        if (baseNotice != null) {
            str = baseNotice.getAccountType();
        } else {
            str = null;
        }
        hashMap.put("account_type", str);
        String str5 = AX5.LIZ;
        if (str5 != null) {
            hashMap.put("inbox_position", str5);
        }
        BaseNotice baseNotice2 = this.mMTBaseNotice;
        if (baseNotice2 == null || (str2 = Integer.valueOf(baseNotice2.type).toString()) == null) {
            str2 = "";
        }
        hashMap.put("notice_message_type", str2);
        InterfaceC56771MPv interfaceC56771MPv = this.vm;
        if (interfaceC56771MPv != null && (Kg02 = interfaceC56771MPv.Kg0()) != null) {
            str3 = Kg02.LIZ;
        } else {
            str3 = null;
        }
        hashMap.put("sort_option_name", str3);
        InterfaceC56771MPv interfaceC56771MPv2 = this.vm;
        if (interfaceC56771MPv2 != null && (Kg0 = interfaceC56771MPv2.Kg0()) != null) {
            str4 = Kg0.LIZIZ;
        }
        hashMap.put("notification_tab_name", str4);
        return hashMap;
    }

    @Override // X.InterfaceC56930MVy
    public final void s() {
        GeneralTemplateNotice generalTemplateNotice;
        Object LIZ;
        Long l;
        MusNotice musNotice = this.LJLILLLLZI;
        if (musNotice != null && (generalTemplateNotice = musNotice.templateNotice) != null) {
            try {
                l = generalTemplateNotice.nid;
            } catch (Throwable th) {
                LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
            }
            if (l != null) {
                l.longValue();
                ActionToReportStruct actionToReportStruct = generalTemplateNotice.actions;
                if (actionToReportStruct != null && actionToReportStruct.click) {
                    LIZ = MOQ.LIZ(NotificationApi.LIZ(), l.longValue(), EnumC124194u7.NOTICE_ACTION_CLICK.getValue(), generalTemplateNotice.actionMeta, null, 8).LJJL(T16.LIZ()).LJJJJZ();
                    C3C5.m7constructorimpl(LIZ);
                    C3C5.m6boximpl(LIZ);
                }
            }
            LIZ = null;
            C3C5.m7constructorimpl(LIZ);
            C3C5.m6boximpl(LIZ);
        }
        onItemClick();
        markHasRead(null);
    }

    @Override // X.MVY
    public final User getUserFromNotice() {
        GeneralTemplateNotice generalTemplateNotice;
        NoticeUITemplate noticeUITemplate;
        TitleTemplate titleTemplate;
        List<User> list;
        GeneralTemplateNotice generalTemplateNotice2;
        NoticeUITemplate noticeUITemplate2;
        TitleTemplate titleTemplate2;
        List<User> list2;
        if (C53357Kwr.LIZJ()) {
            MusNotice musNotice = this.LJLILLLLZI;
            if (musNotice == null || (generalTemplateNotice2 = musNotice.templateNotice) == null || (noticeUITemplate2 = generalTemplateNotice2.uiTemplate) == null || (titleTemplate2 = noticeUITemplate2.titleTemplate) == null || (list2 = titleTemplate2.fromUsers) == null || !(true ^ list2.isEmpty())) {
                return null;
            }
            return (User) ListProtector.get(list2, 0);
        }
        MusNotice musNotice2 = this.LJLILLLLZI;
        if (musNotice2 == null || (generalTemplateNotice = musNotice2.templateNotice) == null || (noticeUITemplate = generalTemplateNotice.uiTemplate) == null || (titleTemplate = noticeUITemplate.titleTemplate) == null || (list = titleTemplate.fromUsers) == null || list.size() != 1) {
            return null;
        }
        return (User) ListProtector.get(list, 0);
    }

    @Override // X.MVV
    public final void reportShowEvent() {
        super.reportShowEvent();
        InterfaceC56771MPv interfaceC56771MPv = this.vm;
        if (interfaceC56771MPv != null) {
            interfaceC56771MPv.vP(this.LJLILLLLZI, new AqS159S0100000_9(this, 469));
            return;
        }
        NotificationDetailVM notificationDetailVM = this.LJLLILLLL;
        if (notificationDetailVM == null) {
            return;
        }
        notificationDetailVM.vP(this.LJLILLLLZI, new AqS159S0100000_9(this, 470));
    }

    @Override // X.ViewOnClickListenerC56908MVc
    public final LifecycleOwner requireLifeCycleOwner() {
        LifecycleOwner requireLifeCycleOwner = super.requireLifeCycleOwner();
        o.LJIIIIZZ(requireLifeCycleOwner, "super.requireLifeCycleOwner()");
        return requireLifeCycleOwner;
    }

    @Override // X.InterfaceC56930MVy
    public final boolean LLLL() {
        return this.LJLJJI;
    }

    @Override // X.InterfaceC56930MVy
    public final int LLLLZI() {
        return this.LJLJJLL;
    }

    @Override // X.InterfaceC56930MVy
    public final C56927MVv LLZZ() {
        return this.LJLL;
    }

    @Override // X.InterfaceC56930MVy
    public final String getEnterFrom() {
        return this.LJLJJL;
    }

    @Override // X.InterfaceC56930MVy
    public final List<InterfaceC56825MRx> getInterceptors() {
        return this.LJLJLLL;
    }

    @Override // X.InterfaceC56930MVy
    public final String getPageName() {
        return this.LJLLI;
    }

    @Override // X.InterfaceC56930MVy
    public final String getTabName() {
        return this.LJLJI;
    }

    @Override // X.MVV, X.ViewOnClickListenerC56908MVc
    public final void onDetached() {
        super.onDetached();
    }

    @Override // X.InterfaceC56930MVy
    public final String t() {
        return this.LJLJL;
    }

    @Override // X.InterfaceC56930MVy
    public final void LLLIIIIL(int i) {
        LVG lvg;
        NoticeGroupAttrs LJIIIIZZ = C54362LVe.LJIIIIZZ(i);
        if (LJIIIIZZ != null) {
            lvg = LJIIIIZZ.clearOccasion;
        } else {
            lvg = null;
        }
        if (lvg == LVG.AfterClick && C54362LVe.LJIIZILJ(i)) {
            C54362LVe.LIZIZ(i);
            C2U8.LIZ(new C54058LJm());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x01cc, code lost:
    
        if (r6 == true) goto L96;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01be A[Catch: Exception -> 0x0512, TryCatch #6 {Exception -> 0x0512, blocks: (B:69:0x0136, B:71:0x013a, B:73:0x013e, B:75:0x0142, B:76:0x0147, B:80:0x0158, B:82:0x015c, B:84:0x0179, B:85:0x0162, B:87:0x0172, B:90:0x0180, B:92:0x0190, B:93:0x0192, B:95:0x01af, B:97:0x01b3, B:98:0x01b5, B:100:0x01be, B:101:0x01c0, B:103:0x01c9, B:105:0x01ce, B:106:0x01df, B:108:0x01e5, B:121:0x023b, B:134:0x024e, B:135:0x0256, B:137:0x025c, B:139:0x0272, B:142:0x027d, B:143:0x0280, B:145:0x0284, B:147:0x0288, B:149:0x028e, B:152:0x029c, B:154:0x02a2, B:156:0x02c1, B:158:0x02c5, B:160:0x02cb, B:162:0x02df, B:164:0x02e5, B:165:0x02ea, B:167:0x02f4, B:173:0x030c, B:175:0x0310, B:177:0x0314, B:179:0x0318, B:181:0x0322, B:182:0x032a, B:184:0x0332, B:186:0x033a, B:188:0x033e, B:189:0x0340, B:191:0x0346, B:192:0x034d, B:194:0x0351, B:196:0x0355, B:198:0x0359, B:200:0x035d, B:202:0x0361, B:204:0x0366, B:206:0x036c, B:208:0x0372, B:211:0x0381, B:212:0x0387, B:213:0x038c, B:215:0x0390, B:217:0x0394, B:219:0x03b4, B:221:0x03bc, B:223:0x03c0, B:225:0x03c4, B:227:0x03c8, B:229:0x03cc, B:231:0x03d0, B:233:0x03d7, B:235:0x03df, B:236:0x0398, B:238:0x039c, B:239:0x03a4, B:241:0x03a8, B:242:0x03ac, B:245:0x03fc, B:247:0x0414, B:249:0x0418, B:250:0x041a, B:251:0x04cc, B:253:0x04d0, B:259:0x0428, B:261:0x042c, B:263:0x0430, B:265:0x0434, B:267:0x0438, B:269:0x043c, B:271:0x0443, B:273:0x044b, B:274:0x0454, B:276:0x0458, B:278:0x045c, B:280:0x0493, B:283:0x049b, B:284:0x0471, B:286:0x0480, B:287:0x048b, B:290:0x04ad, B:291:0x0460, B:292:0x04b1, B:294:0x04b7, B:296:0x04bb, B:297:0x04bd, B:299:0x04df, B:301:0x04ee, B:302:0x04f9, B:306:0x02fd, B:313:0x0150), top: B:68:0x0136, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01c9 A[Catch: Exception -> 0x0512, TryCatch #6 {Exception -> 0x0512, blocks: (B:69:0x0136, B:71:0x013a, B:73:0x013e, B:75:0x0142, B:76:0x0147, B:80:0x0158, B:82:0x015c, B:84:0x0179, B:85:0x0162, B:87:0x0172, B:90:0x0180, B:92:0x0190, B:93:0x0192, B:95:0x01af, B:97:0x01b3, B:98:0x01b5, B:100:0x01be, B:101:0x01c0, B:103:0x01c9, B:105:0x01ce, B:106:0x01df, B:108:0x01e5, B:121:0x023b, B:134:0x024e, B:135:0x0256, B:137:0x025c, B:139:0x0272, B:142:0x027d, B:143:0x0280, B:145:0x0284, B:147:0x0288, B:149:0x028e, B:152:0x029c, B:154:0x02a2, B:156:0x02c1, B:158:0x02c5, B:160:0x02cb, B:162:0x02df, B:164:0x02e5, B:165:0x02ea, B:167:0x02f4, B:173:0x030c, B:175:0x0310, B:177:0x0314, B:179:0x0318, B:181:0x0322, B:182:0x032a, B:184:0x0332, B:186:0x033a, B:188:0x033e, B:189:0x0340, B:191:0x0346, B:192:0x034d, B:194:0x0351, B:196:0x0355, B:198:0x0359, B:200:0x035d, B:202:0x0361, B:204:0x0366, B:206:0x036c, B:208:0x0372, B:211:0x0381, B:212:0x0387, B:213:0x038c, B:215:0x0390, B:217:0x0394, B:219:0x03b4, B:221:0x03bc, B:223:0x03c0, B:225:0x03c4, B:227:0x03c8, B:229:0x03cc, B:231:0x03d0, B:233:0x03d7, B:235:0x03df, B:236:0x0398, B:238:0x039c, B:239:0x03a4, B:241:0x03a8, B:242:0x03ac, B:245:0x03fc, B:247:0x0414, B:249:0x0418, B:250:0x041a, B:251:0x04cc, B:253:0x04d0, B:259:0x0428, B:261:0x042c, B:263:0x0430, B:265:0x0434, B:267:0x0438, B:269:0x043c, B:271:0x0443, B:273:0x044b, B:274:0x0454, B:276:0x0458, B:278:0x045c, B:280:0x0493, B:283:0x049b, B:284:0x0471, B:286:0x0480, B:287:0x048b, B:290:0x04ad, B:291:0x0460, B:292:0x04b1, B:294:0x04b7, B:296:0x04bb, B:297:0x04bd, B:299:0x04df, B:301:0x04ee, B:302:0x04f9, B:306:0x02fd, B:313:0x0150), top: B:68:0x0136, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01e5 A[Catch: Exception -> 0x0512, TRY_LEAVE, TryCatch #6 {Exception -> 0x0512, blocks: (B:69:0x0136, B:71:0x013a, B:73:0x013e, B:75:0x0142, B:76:0x0147, B:80:0x0158, B:82:0x015c, B:84:0x0179, B:85:0x0162, B:87:0x0172, B:90:0x0180, B:92:0x0190, B:93:0x0192, B:95:0x01af, B:97:0x01b3, B:98:0x01b5, B:100:0x01be, B:101:0x01c0, B:103:0x01c9, B:105:0x01ce, B:106:0x01df, B:108:0x01e5, B:121:0x023b, B:134:0x024e, B:135:0x0256, B:137:0x025c, B:139:0x0272, B:142:0x027d, B:143:0x0280, B:145:0x0284, B:147:0x0288, B:149:0x028e, B:152:0x029c, B:154:0x02a2, B:156:0x02c1, B:158:0x02c5, B:160:0x02cb, B:162:0x02df, B:164:0x02e5, B:165:0x02ea, B:167:0x02f4, B:173:0x030c, B:175:0x0310, B:177:0x0314, B:179:0x0318, B:181:0x0322, B:182:0x032a, B:184:0x0332, B:186:0x033a, B:188:0x033e, B:189:0x0340, B:191:0x0346, B:192:0x034d, B:194:0x0351, B:196:0x0355, B:198:0x0359, B:200:0x035d, B:202:0x0361, B:204:0x0366, B:206:0x036c, B:208:0x0372, B:211:0x0381, B:212:0x0387, B:213:0x038c, B:215:0x0390, B:217:0x0394, B:219:0x03b4, B:221:0x03bc, B:223:0x03c0, B:225:0x03c4, B:227:0x03c8, B:229:0x03cc, B:231:0x03d0, B:233:0x03d7, B:235:0x03df, B:236:0x0398, B:238:0x039c, B:239:0x03a4, B:241:0x03a8, B:242:0x03ac, B:245:0x03fc, B:247:0x0414, B:249:0x0418, B:250:0x041a, B:251:0x04cc, B:253:0x04d0, B:259:0x0428, B:261:0x042c, B:263:0x0430, B:265:0x0434, B:267:0x0438, B:269:0x043c, B:271:0x0443, B:273:0x044b, B:274:0x0454, B:276:0x0458, B:278:0x045c, B:280:0x0493, B:283:0x049b, B:284:0x0471, B:286:0x0480, B:287:0x048b, B:290:0x04ad, B:291:0x0460, B:292:0x04b1, B:294:0x04b7, B:296:0x04bb, B:297:0x04bd, B:299:0x04df, B:301:0x04ee, B:302:0x04f9, B:306:0x02fd, B:313:0x0150), top: B:68:0x0136, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x025c A[Catch: Exception -> 0x0512, LOOP:4: B:135:0x0256->B:137:0x025c, LOOP_END, TryCatch #6 {Exception -> 0x0512, blocks: (B:69:0x0136, B:71:0x013a, B:73:0x013e, B:75:0x0142, B:76:0x0147, B:80:0x0158, B:82:0x015c, B:84:0x0179, B:85:0x0162, B:87:0x0172, B:90:0x0180, B:92:0x0190, B:93:0x0192, B:95:0x01af, B:97:0x01b3, B:98:0x01b5, B:100:0x01be, B:101:0x01c0, B:103:0x01c9, B:105:0x01ce, B:106:0x01df, B:108:0x01e5, B:121:0x023b, B:134:0x024e, B:135:0x0256, B:137:0x025c, B:139:0x0272, B:142:0x027d, B:143:0x0280, B:145:0x0284, B:147:0x0288, B:149:0x028e, B:152:0x029c, B:154:0x02a2, B:156:0x02c1, B:158:0x02c5, B:160:0x02cb, B:162:0x02df, B:164:0x02e5, B:165:0x02ea, B:167:0x02f4, B:173:0x030c, B:175:0x0310, B:177:0x0314, B:179:0x0318, B:181:0x0322, B:182:0x032a, B:184:0x0332, B:186:0x033a, B:188:0x033e, B:189:0x0340, B:191:0x0346, B:192:0x034d, B:194:0x0351, B:196:0x0355, B:198:0x0359, B:200:0x035d, B:202:0x0361, B:204:0x0366, B:206:0x036c, B:208:0x0372, B:211:0x0381, B:212:0x0387, B:213:0x038c, B:215:0x0390, B:217:0x0394, B:219:0x03b4, B:221:0x03bc, B:223:0x03c0, B:225:0x03c4, B:227:0x03c8, B:229:0x03cc, B:231:0x03d0, B:233:0x03d7, B:235:0x03df, B:236:0x0398, B:238:0x039c, B:239:0x03a4, B:241:0x03a8, B:242:0x03ac, B:245:0x03fc, B:247:0x0414, B:249:0x0418, B:250:0x041a, B:251:0x04cc, B:253:0x04d0, B:259:0x0428, B:261:0x042c, B:263:0x0430, B:265:0x0434, B:267:0x0438, B:269:0x043c, B:271:0x0443, B:273:0x044b, B:274:0x0454, B:276:0x0458, B:278:0x045c, B:280:0x0493, B:283:0x049b, B:284:0x0471, B:286:0x0480, B:287:0x048b, B:290:0x04ad, B:291:0x0460, B:292:0x04b1, B:294:0x04b7, B:296:0x04bb, B:297:0x04bd, B:299:0x04df, B:301:0x04ee, B:302:0x04f9, B:306:0x02fd, B:313:0x0150), top: B:68:0x0136, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x027d A[Catch: Exception -> 0x0512, TRY_ENTER, TryCatch #6 {Exception -> 0x0512, blocks: (B:69:0x0136, B:71:0x013a, B:73:0x013e, B:75:0x0142, B:76:0x0147, B:80:0x0158, B:82:0x015c, B:84:0x0179, B:85:0x0162, B:87:0x0172, B:90:0x0180, B:92:0x0190, B:93:0x0192, B:95:0x01af, B:97:0x01b3, B:98:0x01b5, B:100:0x01be, B:101:0x01c0, B:103:0x01c9, B:105:0x01ce, B:106:0x01df, B:108:0x01e5, B:121:0x023b, B:134:0x024e, B:135:0x0256, B:137:0x025c, B:139:0x0272, B:142:0x027d, B:143:0x0280, B:145:0x0284, B:147:0x0288, B:149:0x028e, B:152:0x029c, B:154:0x02a2, B:156:0x02c1, B:158:0x02c5, B:160:0x02cb, B:162:0x02df, B:164:0x02e5, B:165:0x02ea, B:167:0x02f4, B:173:0x030c, B:175:0x0310, B:177:0x0314, B:179:0x0318, B:181:0x0322, B:182:0x032a, B:184:0x0332, B:186:0x033a, B:188:0x033e, B:189:0x0340, B:191:0x0346, B:192:0x034d, B:194:0x0351, B:196:0x0355, B:198:0x0359, B:200:0x035d, B:202:0x0361, B:204:0x0366, B:206:0x036c, B:208:0x0372, B:211:0x0381, B:212:0x0387, B:213:0x038c, B:215:0x0390, B:217:0x0394, B:219:0x03b4, B:221:0x03bc, B:223:0x03c0, B:225:0x03c4, B:227:0x03c8, B:229:0x03cc, B:231:0x03d0, B:233:0x03d7, B:235:0x03df, B:236:0x0398, B:238:0x039c, B:239:0x03a4, B:241:0x03a8, B:242:0x03ac, B:245:0x03fc, B:247:0x0414, B:249:0x0418, B:250:0x041a, B:251:0x04cc, B:253:0x04d0, B:259:0x0428, B:261:0x042c, B:263:0x0430, B:265:0x0434, B:267:0x0438, B:269:0x043c, B:271:0x0443, B:273:0x044b, B:274:0x0454, B:276:0x0458, B:278:0x045c, B:280:0x0493, B:283:0x049b, B:284:0x0471, B:286:0x0480, B:287:0x048b, B:290:0x04ad, B:291:0x0460, B:292:0x04b1, B:294:0x04b7, B:296:0x04bb, B:297:0x04bd, B:299:0x04df, B:301:0x04ee, B:302:0x04f9, B:306:0x02fd, B:313:0x0150), top: B:68:0x0136, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02c1 A[Catch: Exception -> 0x0512, TryCatch #6 {Exception -> 0x0512, blocks: (B:69:0x0136, B:71:0x013a, B:73:0x013e, B:75:0x0142, B:76:0x0147, B:80:0x0158, B:82:0x015c, B:84:0x0179, B:85:0x0162, B:87:0x0172, B:90:0x0180, B:92:0x0190, B:93:0x0192, B:95:0x01af, B:97:0x01b3, B:98:0x01b5, B:100:0x01be, B:101:0x01c0, B:103:0x01c9, B:105:0x01ce, B:106:0x01df, B:108:0x01e5, B:121:0x023b, B:134:0x024e, B:135:0x0256, B:137:0x025c, B:139:0x0272, B:142:0x027d, B:143:0x0280, B:145:0x0284, B:147:0x0288, B:149:0x028e, B:152:0x029c, B:154:0x02a2, B:156:0x02c1, B:158:0x02c5, B:160:0x02cb, B:162:0x02df, B:164:0x02e5, B:165:0x02ea, B:167:0x02f4, B:173:0x030c, B:175:0x0310, B:177:0x0314, B:179:0x0318, B:181:0x0322, B:182:0x032a, B:184:0x0332, B:186:0x033a, B:188:0x033e, B:189:0x0340, B:191:0x0346, B:192:0x034d, B:194:0x0351, B:196:0x0355, B:198:0x0359, B:200:0x035d, B:202:0x0361, B:204:0x0366, B:206:0x036c, B:208:0x0372, B:211:0x0381, B:212:0x0387, B:213:0x038c, B:215:0x0390, B:217:0x0394, B:219:0x03b4, B:221:0x03bc, B:223:0x03c0, B:225:0x03c4, B:227:0x03c8, B:229:0x03cc, B:231:0x03d0, B:233:0x03d7, B:235:0x03df, B:236:0x0398, B:238:0x039c, B:239:0x03a4, B:241:0x03a8, B:242:0x03ac, B:245:0x03fc, B:247:0x0414, B:249:0x0418, B:250:0x041a, B:251:0x04cc, B:253:0x04d0, B:259:0x0428, B:261:0x042c, B:263:0x0430, B:265:0x0434, B:267:0x0438, B:269:0x043c, B:271:0x0443, B:273:0x044b, B:274:0x0454, B:276:0x0458, B:278:0x045c, B:280:0x0493, B:283:0x049b, B:284:0x0471, B:286:0x0480, B:287:0x048b, B:290:0x04ad, B:291:0x0460, B:292:0x04b1, B:294:0x04b7, B:296:0x04bb, B:297:0x04bd, B:299:0x04df, B:301:0x04ee, B:302:0x04f9, B:306:0x02fd, B:313:0x0150), top: B:68:0x0136, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x030c A[Catch: Exception -> 0x0512, TRY_ENTER, TryCatch #6 {Exception -> 0x0512, blocks: (B:69:0x0136, B:71:0x013a, B:73:0x013e, B:75:0x0142, B:76:0x0147, B:80:0x0158, B:82:0x015c, B:84:0x0179, B:85:0x0162, B:87:0x0172, B:90:0x0180, B:92:0x0190, B:93:0x0192, B:95:0x01af, B:97:0x01b3, B:98:0x01b5, B:100:0x01be, B:101:0x01c0, B:103:0x01c9, B:105:0x01ce, B:106:0x01df, B:108:0x01e5, B:121:0x023b, B:134:0x024e, B:135:0x0256, B:137:0x025c, B:139:0x0272, B:142:0x027d, B:143:0x0280, B:145:0x0284, B:147:0x0288, B:149:0x028e, B:152:0x029c, B:154:0x02a2, B:156:0x02c1, B:158:0x02c5, B:160:0x02cb, B:162:0x02df, B:164:0x02e5, B:165:0x02ea, B:167:0x02f4, B:173:0x030c, B:175:0x0310, B:177:0x0314, B:179:0x0318, B:181:0x0322, B:182:0x032a, B:184:0x0332, B:186:0x033a, B:188:0x033e, B:189:0x0340, B:191:0x0346, B:192:0x034d, B:194:0x0351, B:196:0x0355, B:198:0x0359, B:200:0x035d, B:202:0x0361, B:204:0x0366, B:206:0x036c, B:208:0x0372, B:211:0x0381, B:212:0x0387, B:213:0x038c, B:215:0x0390, B:217:0x0394, B:219:0x03b4, B:221:0x03bc, B:223:0x03c0, B:225:0x03c4, B:227:0x03c8, B:229:0x03cc, B:231:0x03d0, B:233:0x03d7, B:235:0x03df, B:236:0x0398, B:238:0x039c, B:239:0x03a4, B:241:0x03a8, B:242:0x03ac, B:245:0x03fc, B:247:0x0414, B:249:0x0418, B:250:0x041a, B:251:0x04cc, B:253:0x04d0, B:259:0x0428, B:261:0x042c, B:263:0x0430, B:265:0x0434, B:267:0x0438, B:269:0x043c, B:271:0x0443, B:273:0x044b, B:274:0x0454, B:276:0x0458, B:278:0x045c, B:280:0x0493, B:283:0x049b, B:284:0x0471, B:286:0x0480, B:287:0x048b, B:290:0x04ad, B:291:0x0460, B:292:0x04b1, B:294:0x04b7, B:296:0x04bb, B:297:0x04bd, B:299:0x04df, B:301:0x04ee, B:302:0x04f9, B:306:0x02fd, B:313:0x0150), top: B:68:0x0136, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x033a A[Catch: Exception -> 0x0512, TryCatch #6 {Exception -> 0x0512, blocks: (B:69:0x0136, B:71:0x013a, B:73:0x013e, B:75:0x0142, B:76:0x0147, B:80:0x0158, B:82:0x015c, B:84:0x0179, B:85:0x0162, B:87:0x0172, B:90:0x0180, B:92:0x0190, B:93:0x0192, B:95:0x01af, B:97:0x01b3, B:98:0x01b5, B:100:0x01be, B:101:0x01c0, B:103:0x01c9, B:105:0x01ce, B:106:0x01df, B:108:0x01e5, B:121:0x023b, B:134:0x024e, B:135:0x0256, B:137:0x025c, B:139:0x0272, B:142:0x027d, B:143:0x0280, B:145:0x0284, B:147:0x0288, B:149:0x028e, B:152:0x029c, B:154:0x02a2, B:156:0x02c1, B:158:0x02c5, B:160:0x02cb, B:162:0x02df, B:164:0x02e5, B:165:0x02ea, B:167:0x02f4, B:173:0x030c, B:175:0x0310, B:177:0x0314, B:179:0x0318, B:181:0x0322, B:182:0x032a, B:184:0x0332, B:186:0x033a, B:188:0x033e, B:189:0x0340, B:191:0x0346, B:192:0x034d, B:194:0x0351, B:196:0x0355, B:198:0x0359, B:200:0x035d, B:202:0x0361, B:204:0x0366, B:206:0x036c, B:208:0x0372, B:211:0x0381, B:212:0x0387, B:213:0x038c, B:215:0x0390, B:217:0x0394, B:219:0x03b4, B:221:0x03bc, B:223:0x03c0, B:225:0x03c4, B:227:0x03c8, B:229:0x03cc, B:231:0x03d0, B:233:0x03d7, B:235:0x03df, B:236:0x0398, B:238:0x039c, B:239:0x03a4, B:241:0x03a8, B:242:0x03ac, B:245:0x03fc, B:247:0x0414, B:249:0x0418, B:250:0x041a, B:251:0x04cc, B:253:0x04d0, B:259:0x0428, B:261:0x042c, B:263:0x0430, B:265:0x0434, B:267:0x0438, B:269:0x043c, B:271:0x0443, B:273:0x044b, B:274:0x0454, B:276:0x0458, B:278:0x045c, B:280:0x0493, B:283:0x049b, B:284:0x0471, B:286:0x0480, B:287:0x048b, B:290:0x04ad, B:291:0x0460, B:292:0x04b1, B:294:0x04b7, B:296:0x04bb, B:297:0x04bd, B:299:0x04df, B:301:0x04ee, B:302:0x04f9, B:306:0x02fd, B:313:0x0150), top: B:68:0x0136, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0346 A[Catch: Exception -> 0x0512, TryCatch #6 {Exception -> 0x0512, blocks: (B:69:0x0136, B:71:0x013a, B:73:0x013e, B:75:0x0142, B:76:0x0147, B:80:0x0158, B:82:0x015c, B:84:0x0179, B:85:0x0162, B:87:0x0172, B:90:0x0180, B:92:0x0190, B:93:0x0192, B:95:0x01af, B:97:0x01b3, B:98:0x01b5, B:100:0x01be, B:101:0x01c0, B:103:0x01c9, B:105:0x01ce, B:106:0x01df, B:108:0x01e5, B:121:0x023b, B:134:0x024e, B:135:0x0256, B:137:0x025c, B:139:0x0272, B:142:0x027d, B:143:0x0280, B:145:0x0284, B:147:0x0288, B:149:0x028e, B:152:0x029c, B:154:0x02a2, B:156:0x02c1, B:158:0x02c5, B:160:0x02cb, B:162:0x02df, B:164:0x02e5, B:165:0x02ea, B:167:0x02f4, B:173:0x030c, B:175:0x0310, B:177:0x0314, B:179:0x0318, B:181:0x0322, B:182:0x032a, B:184:0x0332, B:186:0x033a, B:188:0x033e, B:189:0x0340, B:191:0x0346, B:192:0x034d, B:194:0x0351, B:196:0x0355, B:198:0x0359, B:200:0x035d, B:202:0x0361, B:204:0x0366, B:206:0x036c, B:208:0x0372, B:211:0x0381, B:212:0x0387, B:213:0x038c, B:215:0x0390, B:217:0x0394, B:219:0x03b4, B:221:0x03bc, B:223:0x03c0, B:225:0x03c4, B:227:0x03c8, B:229:0x03cc, B:231:0x03d0, B:233:0x03d7, B:235:0x03df, B:236:0x0398, B:238:0x039c, B:239:0x03a4, B:241:0x03a8, B:242:0x03ac, B:245:0x03fc, B:247:0x0414, B:249:0x0418, B:250:0x041a, B:251:0x04cc, B:253:0x04d0, B:259:0x0428, B:261:0x042c, B:263:0x0430, B:265:0x0434, B:267:0x0438, B:269:0x043c, B:271:0x0443, B:273:0x044b, B:274:0x0454, B:276:0x0458, B:278:0x045c, B:280:0x0493, B:283:0x049b, B:284:0x0471, B:286:0x0480, B:287:0x048b, B:290:0x04ad, B:291:0x0460, B:292:0x04b1, B:294:0x04b7, B:296:0x04bb, B:297:0x04bd, B:299:0x04df, B:301:0x04ee, B:302:0x04f9, B:306:0x02fd, B:313:0x0150), top: B:68:0x0136, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0351 A[Catch: Exception -> 0x0512, TryCatch #6 {Exception -> 0x0512, blocks: (B:69:0x0136, B:71:0x013a, B:73:0x013e, B:75:0x0142, B:76:0x0147, B:80:0x0158, B:82:0x015c, B:84:0x0179, B:85:0x0162, B:87:0x0172, B:90:0x0180, B:92:0x0190, B:93:0x0192, B:95:0x01af, B:97:0x01b3, B:98:0x01b5, B:100:0x01be, B:101:0x01c0, B:103:0x01c9, B:105:0x01ce, B:106:0x01df, B:108:0x01e5, B:121:0x023b, B:134:0x024e, B:135:0x0256, B:137:0x025c, B:139:0x0272, B:142:0x027d, B:143:0x0280, B:145:0x0284, B:147:0x0288, B:149:0x028e, B:152:0x029c, B:154:0x02a2, B:156:0x02c1, B:158:0x02c5, B:160:0x02cb, B:162:0x02df, B:164:0x02e5, B:165:0x02ea, B:167:0x02f4, B:173:0x030c, B:175:0x0310, B:177:0x0314, B:179:0x0318, B:181:0x0322, B:182:0x032a, B:184:0x0332, B:186:0x033a, B:188:0x033e, B:189:0x0340, B:191:0x0346, B:192:0x034d, B:194:0x0351, B:196:0x0355, B:198:0x0359, B:200:0x035d, B:202:0x0361, B:204:0x0366, B:206:0x036c, B:208:0x0372, B:211:0x0381, B:212:0x0387, B:213:0x038c, B:215:0x0390, B:217:0x0394, B:219:0x03b4, B:221:0x03bc, B:223:0x03c0, B:225:0x03c4, B:227:0x03c8, B:229:0x03cc, B:231:0x03d0, B:233:0x03d7, B:235:0x03df, B:236:0x0398, B:238:0x039c, B:239:0x03a4, B:241:0x03a8, B:242:0x03ac, B:245:0x03fc, B:247:0x0414, B:249:0x0418, B:250:0x041a, B:251:0x04cc, B:253:0x04d0, B:259:0x0428, B:261:0x042c, B:263:0x0430, B:265:0x0434, B:267:0x0438, B:269:0x043c, B:271:0x0443, B:273:0x044b, B:274:0x0454, B:276:0x0458, B:278:0x045c, B:280:0x0493, B:283:0x049b, B:284:0x0471, B:286:0x0480, B:287:0x048b, B:290:0x04ad, B:291:0x0460, B:292:0x04b1, B:294:0x04b7, B:296:0x04bb, B:297:0x04bd, B:299:0x04df, B:301:0x04ee, B:302:0x04f9, B:306:0x02fd, B:313:0x0150), top: B:68:0x0136, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0381 A[Catch: Exception -> 0x0512, TRY_ENTER, TryCatch #6 {Exception -> 0x0512, blocks: (B:69:0x0136, B:71:0x013a, B:73:0x013e, B:75:0x0142, B:76:0x0147, B:80:0x0158, B:82:0x015c, B:84:0x0179, B:85:0x0162, B:87:0x0172, B:90:0x0180, B:92:0x0190, B:93:0x0192, B:95:0x01af, B:97:0x01b3, B:98:0x01b5, B:100:0x01be, B:101:0x01c0, B:103:0x01c9, B:105:0x01ce, B:106:0x01df, B:108:0x01e5, B:121:0x023b, B:134:0x024e, B:135:0x0256, B:137:0x025c, B:139:0x0272, B:142:0x027d, B:143:0x0280, B:145:0x0284, B:147:0x0288, B:149:0x028e, B:152:0x029c, B:154:0x02a2, B:156:0x02c1, B:158:0x02c5, B:160:0x02cb, B:162:0x02df, B:164:0x02e5, B:165:0x02ea, B:167:0x02f4, B:173:0x030c, B:175:0x0310, B:177:0x0314, B:179:0x0318, B:181:0x0322, B:182:0x032a, B:184:0x0332, B:186:0x033a, B:188:0x033e, B:189:0x0340, B:191:0x0346, B:192:0x034d, B:194:0x0351, B:196:0x0355, B:198:0x0359, B:200:0x035d, B:202:0x0361, B:204:0x0366, B:206:0x036c, B:208:0x0372, B:211:0x0381, B:212:0x0387, B:213:0x038c, B:215:0x0390, B:217:0x0394, B:219:0x03b4, B:221:0x03bc, B:223:0x03c0, B:225:0x03c4, B:227:0x03c8, B:229:0x03cc, B:231:0x03d0, B:233:0x03d7, B:235:0x03df, B:236:0x0398, B:238:0x039c, B:239:0x03a4, B:241:0x03a8, B:242:0x03ac, B:245:0x03fc, B:247:0x0414, B:249:0x0418, B:250:0x041a, B:251:0x04cc, B:253:0x04d0, B:259:0x0428, B:261:0x042c, B:263:0x0430, B:265:0x0434, B:267:0x0438, B:269:0x043c, B:271:0x0443, B:273:0x044b, B:274:0x0454, B:276:0x0458, B:278:0x045c, B:280:0x0493, B:283:0x049b, B:284:0x0471, B:286:0x0480, B:287:0x048b, B:290:0x04ad, B:291:0x0460, B:292:0x04b1, B:294:0x04b7, B:296:0x04bb, B:297:0x04bd, B:299:0x04df, B:301:0x04ee, B:302:0x04f9, B:306:0x02fd, B:313:0x0150), top: B:68:0x0136, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0387 A[Catch: Exception -> 0x0512, TryCatch #6 {Exception -> 0x0512, blocks: (B:69:0x0136, B:71:0x013a, B:73:0x013e, B:75:0x0142, B:76:0x0147, B:80:0x0158, B:82:0x015c, B:84:0x0179, B:85:0x0162, B:87:0x0172, B:90:0x0180, B:92:0x0190, B:93:0x0192, B:95:0x01af, B:97:0x01b3, B:98:0x01b5, B:100:0x01be, B:101:0x01c0, B:103:0x01c9, B:105:0x01ce, B:106:0x01df, B:108:0x01e5, B:121:0x023b, B:134:0x024e, B:135:0x0256, B:137:0x025c, B:139:0x0272, B:142:0x027d, B:143:0x0280, B:145:0x0284, B:147:0x0288, B:149:0x028e, B:152:0x029c, B:154:0x02a2, B:156:0x02c1, B:158:0x02c5, B:160:0x02cb, B:162:0x02df, B:164:0x02e5, B:165:0x02ea, B:167:0x02f4, B:173:0x030c, B:175:0x0310, B:177:0x0314, B:179:0x0318, B:181:0x0322, B:182:0x032a, B:184:0x0332, B:186:0x033a, B:188:0x033e, B:189:0x0340, B:191:0x0346, B:192:0x034d, B:194:0x0351, B:196:0x0355, B:198:0x0359, B:200:0x035d, B:202:0x0361, B:204:0x0366, B:206:0x036c, B:208:0x0372, B:211:0x0381, B:212:0x0387, B:213:0x038c, B:215:0x0390, B:217:0x0394, B:219:0x03b4, B:221:0x03bc, B:223:0x03c0, B:225:0x03c4, B:227:0x03c8, B:229:0x03cc, B:231:0x03d0, B:233:0x03d7, B:235:0x03df, B:236:0x0398, B:238:0x039c, B:239:0x03a4, B:241:0x03a8, B:242:0x03ac, B:245:0x03fc, B:247:0x0414, B:249:0x0418, B:250:0x041a, B:251:0x04cc, B:253:0x04d0, B:259:0x0428, B:261:0x042c, B:263:0x0430, B:265:0x0434, B:267:0x0438, B:269:0x043c, B:271:0x0443, B:273:0x044b, B:274:0x0454, B:276:0x0458, B:278:0x045c, B:280:0x0493, B:283:0x049b, B:284:0x0471, B:286:0x0480, B:287:0x048b, B:290:0x04ad, B:291:0x0460, B:292:0x04b1, B:294:0x04b7, B:296:0x04bb, B:297:0x04bd, B:299:0x04df, B:301:0x04ee, B:302:0x04f9, B:306:0x02fd, B:313:0x0150), top: B:68:0x0136, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0390 A[Catch: Exception -> 0x0512, TryCatch #6 {Exception -> 0x0512, blocks: (B:69:0x0136, B:71:0x013a, B:73:0x013e, B:75:0x0142, B:76:0x0147, B:80:0x0158, B:82:0x015c, B:84:0x0179, B:85:0x0162, B:87:0x0172, B:90:0x0180, B:92:0x0190, B:93:0x0192, B:95:0x01af, B:97:0x01b3, B:98:0x01b5, B:100:0x01be, B:101:0x01c0, B:103:0x01c9, B:105:0x01ce, B:106:0x01df, B:108:0x01e5, B:121:0x023b, B:134:0x024e, B:135:0x0256, B:137:0x025c, B:139:0x0272, B:142:0x027d, B:143:0x0280, B:145:0x0284, B:147:0x0288, B:149:0x028e, B:152:0x029c, B:154:0x02a2, B:156:0x02c1, B:158:0x02c5, B:160:0x02cb, B:162:0x02df, B:164:0x02e5, B:165:0x02ea, B:167:0x02f4, B:173:0x030c, B:175:0x0310, B:177:0x0314, B:179:0x0318, B:181:0x0322, B:182:0x032a, B:184:0x0332, B:186:0x033a, B:188:0x033e, B:189:0x0340, B:191:0x0346, B:192:0x034d, B:194:0x0351, B:196:0x0355, B:198:0x0359, B:200:0x035d, B:202:0x0361, B:204:0x0366, B:206:0x036c, B:208:0x0372, B:211:0x0381, B:212:0x0387, B:213:0x038c, B:215:0x0390, B:217:0x0394, B:219:0x03b4, B:221:0x03bc, B:223:0x03c0, B:225:0x03c4, B:227:0x03c8, B:229:0x03cc, B:231:0x03d0, B:233:0x03d7, B:235:0x03df, B:236:0x0398, B:238:0x039c, B:239:0x03a4, B:241:0x03a8, B:242:0x03ac, B:245:0x03fc, B:247:0x0414, B:249:0x0418, B:250:0x041a, B:251:0x04cc, B:253:0x04d0, B:259:0x0428, B:261:0x042c, B:263:0x0430, B:265:0x0434, B:267:0x0438, B:269:0x043c, B:271:0x0443, B:273:0x044b, B:274:0x0454, B:276:0x0458, B:278:0x045c, B:280:0x0493, B:283:0x049b, B:284:0x0471, B:286:0x0480, B:287:0x048b, B:290:0x04ad, B:291:0x0460, B:292:0x04b1, B:294:0x04b7, B:296:0x04bb, B:297:0x04bd, B:299:0x04df, B:301:0x04ee, B:302:0x04f9, B:306:0x02fd, B:313:0x0150), top: B:68:0x0136, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x039c A[Catch: Exception -> 0x0512, TryCatch #6 {Exception -> 0x0512, blocks: (B:69:0x0136, B:71:0x013a, B:73:0x013e, B:75:0x0142, B:76:0x0147, B:80:0x0158, B:82:0x015c, B:84:0x0179, B:85:0x0162, B:87:0x0172, B:90:0x0180, B:92:0x0190, B:93:0x0192, B:95:0x01af, B:97:0x01b3, B:98:0x01b5, B:100:0x01be, B:101:0x01c0, B:103:0x01c9, B:105:0x01ce, B:106:0x01df, B:108:0x01e5, B:121:0x023b, B:134:0x024e, B:135:0x0256, B:137:0x025c, B:139:0x0272, B:142:0x027d, B:143:0x0280, B:145:0x0284, B:147:0x0288, B:149:0x028e, B:152:0x029c, B:154:0x02a2, B:156:0x02c1, B:158:0x02c5, B:160:0x02cb, B:162:0x02df, B:164:0x02e5, B:165:0x02ea, B:167:0x02f4, B:173:0x030c, B:175:0x0310, B:177:0x0314, B:179:0x0318, B:181:0x0322, B:182:0x032a, B:184:0x0332, B:186:0x033a, B:188:0x033e, B:189:0x0340, B:191:0x0346, B:192:0x034d, B:194:0x0351, B:196:0x0355, B:198:0x0359, B:200:0x035d, B:202:0x0361, B:204:0x0366, B:206:0x036c, B:208:0x0372, B:211:0x0381, B:212:0x0387, B:213:0x038c, B:215:0x0390, B:217:0x0394, B:219:0x03b4, B:221:0x03bc, B:223:0x03c0, B:225:0x03c4, B:227:0x03c8, B:229:0x03cc, B:231:0x03d0, B:233:0x03d7, B:235:0x03df, B:236:0x0398, B:238:0x039c, B:239:0x03a4, B:241:0x03a8, B:242:0x03ac, B:245:0x03fc, B:247:0x0414, B:249:0x0418, B:250:0x041a, B:251:0x04cc, B:253:0x04d0, B:259:0x0428, B:261:0x042c, B:263:0x0430, B:265:0x0434, B:267:0x0438, B:269:0x043c, B:271:0x0443, B:273:0x044b, B:274:0x0454, B:276:0x0458, B:278:0x045c, B:280:0x0493, B:283:0x049b, B:284:0x0471, B:286:0x0480, B:287:0x048b, B:290:0x04ad, B:291:0x0460, B:292:0x04b1, B:294:0x04b7, B:296:0x04bb, B:297:0x04bd, B:299:0x04df, B:301:0x04ee, B:302:0x04f9, B:306:0x02fd, B:313:0x0150), top: B:68:0x0136, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x03a8 A[Catch: Exception -> 0x0512, TryCatch #6 {Exception -> 0x0512, blocks: (B:69:0x0136, B:71:0x013a, B:73:0x013e, B:75:0x0142, B:76:0x0147, B:80:0x0158, B:82:0x015c, B:84:0x0179, B:85:0x0162, B:87:0x0172, B:90:0x0180, B:92:0x0190, B:93:0x0192, B:95:0x01af, B:97:0x01b3, B:98:0x01b5, B:100:0x01be, B:101:0x01c0, B:103:0x01c9, B:105:0x01ce, B:106:0x01df, B:108:0x01e5, B:121:0x023b, B:134:0x024e, B:135:0x0256, B:137:0x025c, B:139:0x0272, B:142:0x027d, B:143:0x0280, B:145:0x0284, B:147:0x0288, B:149:0x028e, B:152:0x029c, B:154:0x02a2, B:156:0x02c1, B:158:0x02c5, B:160:0x02cb, B:162:0x02df, B:164:0x02e5, B:165:0x02ea, B:167:0x02f4, B:173:0x030c, B:175:0x0310, B:177:0x0314, B:179:0x0318, B:181:0x0322, B:182:0x032a, B:184:0x0332, B:186:0x033a, B:188:0x033e, B:189:0x0340, B:191:0x0346, B:192:0x034d, B:194:0x0351, B:196:0x0355, B:198:0x0359, B:200:0x035d, B:202:0x0361, B:204:0x0366, B:206:0x036c, B:208:0x0372, B:211:0x0381, B:212:0x0387, B:213:0x038c, B:215:0x0390, B:217:0x0394, B:219:0x03b4, B:221:0x03bc, B:223:0x03c0, B:225:0x03c4, B:227:0x03c8, B:229:0x03cc, B:231:0x03d0, B:233:0x03d7, B:235:0x03df, B:236:0x0398, B:238:0x039c, B:239:0x03a4, B:241:0x03a8, B:242:0x03ac, B:245:0x03fc, B:247:0x0414, B:249:0x0418, B:250:0x041a, B:251:0x04cc, B:253:0x04d0, B:259:0x0428, B:261:0x042c, B:263:0x0430, B:265:0x0434, B:267:0x0438, B:269:0x043c, B:271:0x0443, B:273:0x044b, B:274:0x0454, B:276:0x0458, B:278:0x045c, B:280:0x0493, B:283:0x049b, B:284:0x0471, B:286:0x0480, B:287:0x048b, B:290:0x04ad, B:291:0x0460, B:292:0x04b1, B:294:0x04b7, B:296:0x04bb, B:297:0x04bd, B:299:0x04df, B:301:0x04ee, B:302:0x04f9, B:306:0x02fd, B:313:0x0150), top: B:68:0x0136, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x03fc A[Catch: Exception -> 0x0512, TRY_ENTER, TryCatch #6 {Exception -> 0x0512, blocks: (B:69:0x0136, B:71:0x013a, B:73:0x013e, B:75:0x0142, B:76:0x0147, B:80:0x0158, B:82:0x015c, B:84:0x0179, B:85:0x0162, B:87:0x0172, B:90:0x0180, B:92:0x0190, B:93:0x0192, B:95:0x01af, B:97:0x01b3, B:98:0x01b5, B:100:0x01be, B:101:0x01c0, B:103:0x01c9, B:105:0x01ce, B:106:0x01df, B:108:0x01e5, B:121:0x023b, B:134:0x024e, B:135:0x0256, B:137:0x025c, B:139:0x0272, B:142:0x027d, B:143:0x0280, B:145:0x0284, B:147:0x0288, B:149:0x028e, B:152:0x029c, B:154:0x02a2, B:156:0x02c1, B:158:0x02c5, B:160:0x02cb, B:162:0x02df, B:164:0x02e5, B:165:0x02ea, B:167:0x02f4, B:173:0x030c, B:175:0x0310, B:177:0x0314, B:179:0x0318, B:181:0x0322, B:182:0x032a, B:184:0x0332, B:186:0x033a, B:188:0x033e, B:189:0x0340, B:191:0x0346, B:192:0x034d, B:194:0x0351, B:196:0x0355, B:198:0x0359, B:200:0x035d, B:202:0x0361, B:204:0x0366, B:206:0x036c, B:208:0x0372, B:211:0x0381, B:212:0x0387, B:213:0x038c, B:215:0x0390, B:217:0x0394, B:219:0x03b4, B:221:0x03bc, B:223:0x03c0, B:225:0x03c4, B:227:0x03c8, B:229:0x03cc, B:231:0x03d0, B:233:0x03d7, B:235:0x03df, B:236:0x0398, B:238:0x039c, B:239:0x03a4, B:241:0x03a8, B:242:0x03ac, B:245:0x03fc, B:247:0x0414, B:249:0x0418, B:250:0x041a, B:251:0x04cc, B:253:0x04d0, B:259:0x0428, B:261:0x042c, B:263:0x0430, B:265:0x0434, B:267:0x0438, B:269:0x043c, B:271:0x0443, B:273:0x044b, B:274:0x0454, B:276:0x0458, B:278:0x045c, B:280:0x0493, B:283:0x049b, B:284:0x0471, B:286:0x0480, B:287:0x048b, B:290:0x04ad, B:291:0x0460, B:292:0x04b1, B:294:0x04b7, B:296:0x04bb, B:297:0x04bd, B:299:0x04df, B:301:0x04ee, B:302:0x04f9, B:306:0x02fd, B:313:0x0150), top: B:68:0x0136, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x04d0 A[Catch: Exception -> 0x0512, TryCatch #6 {Exception -> 0x0512, blocks: (B:69:0x0136, B:71:0x013a, B:73:0x013e, B:75:0x0142, B:76:0x0147, B:80:0x0158, B:82:0x015c, B:84:0x0179, B:85:0x0162, B:87:0x0172, B:90:0x0180, B:92:0x0190, B:93:0x0192, B:95:0x01af, B:97:0x01b3, B:98:0x01b5, B:100:0x01be, B:101:0x01c0, B:103:0x01c9, B:105:0x01ce, B:106:0x01df, B:108:0x01e5, B:121:0x023b, B:134:0x024e, B:135:0x0256, B:137:0x025c, B:139:0x0272, B:142:0x027d, B:143:0x0280, B:145:0x0284, B:147:0x0288, B:149:0x028e, B:152:0x029c, B:154:0x02a2, B:156:0x02c1, B:158:0x02c5, B:160:0x02cb, B:162:0x02df, B:164:0x02e5, B:165:0x02ea, B:167:0x02f4, B:173:0x030c, B:175:0x0310, B:177:0x0314, B:179:0x0318, B:181:0x0322, B:182:0x032a, B:184:0x0332, B:186:0x033a, B:188:0x033e, B:189:0x0340, B:191:0x0346, B:192:0x034d, B:194:0x0351, B:196:0x0355, B:198:0x0359, B:200:0x035d, B:202:0x0361, B:204:0x0366, B:206:0x036c, B:208:0x0372, B:211:0x0381, B:212:0x0387, B:213:0x038c, B:215:0x0390, B:217:0x0394, B:219:0x03b4, B:221:0x03bc, B:223:0x03c0, B:225:0x03c4, B:227:0x03c8, B:229:0x03cc, B:231:0x03d0, B:233:0x03d7, B:235:0x03df, B:236:0x0398, B:238:0x039c, B:239:0x03a4, B:241:0x03a8, B:242:0x03ac, B:245:0x03fc, B:247:0x0414, B:249:0x0418, B:250:0x041a, B:251:0x04cc, B:253:0x04d0, B:259:0x0428, B:261:0x042c, B:263:0x0430, B:265:0x0434, B:267:0x0438, B:269:0x043c, B:271:0x0443, B:273:0x044b, B:274:0x0454, B:276:0x0458, B:278:0x045c, B:280:0x0493, B:283:0x049b, B:284:0x0471, B:286:0x0480, B:287:0x048b, B:290:0x04ad, B:291:0x0460, B:292:0x04b1, B:294:0x04b7, B:296:0x04bb, B:297:0x04bd, B:299:0x04df, B:301:0x04ee, B:302:0x04f9, B:306:0x02fd, B:313:0x0150), top: B:68:0x0136, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:257:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:292:0x04b1 A[Catch: Exception -> 0x0512, TryCatch #6 {Exception -> 0x0512, blocks: (B:69:0x0136, B:71:0x013a, B:73:0x013e, B:75:0x0142, B:76:0x0147, B:80:0x0158, B:82:0x015c, B:84:0x0179, B:85:0x0162, B:87:0x0172, B:90:0x0180, B:92:0x0190, B:93:0x0192, B:95:0x01af, B:97:0x01b3, B:98:0x01b5, B:100:0x01be, B:101:0x01c0, B:103:0x01c9, B:105:0x01ce, B:106:0x01df, B:108:0x01e5, B:121:0x023b, B:134:0x024e, B:135:0x0256, B:137:0x025c, B:139:0x0272, B:142:0x027d, B:143:0x0280, B:145:0x0284, B:147:0x0288, B:149:0x028e, B:152:0x029c, B:154:0x02a2, B:156:0x02c1, B:158:0x02c5, B:160:0x02cb, B:162:0x02df, B:164:0x02e5, B:165:0x02ea, B:167:0x02f4, B:173:0x030c, B:175:0x0310, B:177:0x0314, B:179:0x0318, B:181:0x0322, B:182:0x032a, B:184:0x0332, B:186:0x033a, B:188:0x033e, B:189:0x0340, B:191:0x0346, B:192:0x034d, B:194:0x0351, B:196:0x0355, B:198:0x0359, B:200:0x035d, B:202:0x0361, B:204:0x0366, B:206:0x036c, B:208:0x0372, B:211:0x0381, B:212:0x0387, B:213:0x038c, B:215:0x0390, B:217:0x0394, B:219:0x03b4, B:221:0x03bc, B:223:0x03c0, B:225:0x03c4, B:227:0x03c8, B:229:0x03cc, B:231:0x03d0, B:233:0x03d7, B:235:0x03df, B:236:0x0398, B:238:0x039c, B:239:0x03a4, B:241:0x03a8, B:242:0x03ac, B:245:0x03fc, B:247:0x0414, B:249:0x0418, B:250:0x041a, B:251:0x04cc, B:253:0x04d0, B:259:0x0428, B:261:0x042c, B:263:0x0430, B:265:0x0434, B:267:0x0438, B:269:0x043c, B:271:0x0443, B:273:0x044b, B:274:0x0454, B:276:0x0458, B:278:0x045c, B:280:0x0493, B:283:0x049b, B:284:0x0471, B:286:0x0480, B:287:0x048b, B:290:0x04ad, B:291:0x0460, B:292:0x04b1, B:294:0x04b7, B:296:0x04bb, B:297:0x04bd, B:299:0x04df, B:301:0x04ee, B:302:0x04f9, B:306:0x02fd, B:313:0x0150), top: B:68:0x0136, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x02fd A[Catch: Exception -> 0x0512, TryCatch #6 {Exception -> 0x0512, blocks: (B:69:0x0136, B:71:0x013a, B:73:0x013e, B:75:0x0142, B:76:0x0147, B:80:0x0158, B:82:0x015c, B:84:0x0179, B:85:0x0162, B:87:0x0172, B:90:0x0180, B:92:0x0190, B:93:0x0192, B:95:0x01af, B:97:0x01b3, B:98:0x01b5, B:100:0x01be, B:101:0x01c0, B:103:0x01c9, B:105:0x01ce, B:106:0x01df, B:108:0x01e5, B:121:0x023b, B:134:0x024e, B:135:0x0256, B:137:0x025c, B:139:0x0272, B:142:0x027d, B:143:0x0280, B:145:0x0284, B:147:0x0288, B:149:0x028e, B:152:0x029c, B:154:0x02a2, B:156:0x02c1, B:158:0x02c5, B:160:0x02cb, B:162:0x02df, B:164:0x02e5, B:165:0x02ea, B:167:0x02f4, B:173:0x030c, B:175:0x0310, B:177:0x0314, B:179:0x0318, B:181:0x0322, B:182:0x032a, B:184:0x0332, B:186:0x033a, B:188:0x033e, B:189:0x0340, B:191:0x0346, B:192:0x034d, B:194:0x0351, B:196:0x0355, B:198:0x0359, B:200:0x035d, B:202:0x0361, B:204:0x0366, B:206:0x036c, B:208:0x0372, B:211:0x0381, B:212:0x0387, B:213:0x038c, B:215:0x0390, B:217:0x0394, B:219:0x03b4, B:221:0x03bc, B:223:0x03c0, B:225:0x03c4, B:227:0x03c8, B:229:0x03cc, B:231:0x03d0, B:233:0x03d7, B:235:0x03df, B:236:0x0398, B:238:0x039c, B:239:0x03a4, B:241:0x03a8, B:242:0x03ac, B:245:0x03fc, B:247:0x0414, B:249:0x0418, B:250:0x041a, B:251:0x04cc, B:253:0x04d0, B:259:0x0428, B:261:0x042c, B:263:0x0430, B:265:0x0434, B:267:0x0438, B:269:0x043c, B:271:0x0443, B:273:0x044b, B:274:0x0454, B:276:0x0458, B:278:0x045c, B:280:0x0493, B:283:0x049b, B:284:0x0471, B:286:0x0480, B:287:0x048b, B:290:0x04ad, B:291:0x0460, B:292:0x04b1, B:294:0x04b7, B:296:0x04bb, B:297:0x04bd, B:299:0x04df, B:301:0x04ee, B:302:0x04f9, B:306:0x02fd, B:313:0x0150), top: B:68:0x0136, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0190 A[Catch: Exception -> 0x0512, TryCatch #6 {Exception -> 0x0512, blocks: (B:69:0x0136, B:71:0x013a, B:73:0x013e, B:75:0x0142, B:76:0x0147, B:80:0x0158, B:82:0x015c, B:84:0x0179, B:85:0x0162, B:87:0x0172, B:90:0x0180, B:92:0x0190, B:93:0x0192, B:95:0x01af, B:97:0x01b3, B:98:0x01b5, B:100:0x01be, B:101:0x01c0, B:103:0x01c9, B:105:0x01ce, B:106:0x01df, B:108:0x01e5, B:121:0x023b, B:134:0x024e, B:135:0x0256, B:137:0x025c, B:139:0x0272, B:142:0x027d, B:143:0x0280, B:145:0x0284, B:147:0x0288, B:149:0x028e, B:152:0x029c, B:154:0x02a2, B:156:0x02c1, B:158:0x02c5, B:160:0x02cb, B:162:0x02df, B:164:0x02e5, B:165:0x02ea, B:167:0x02f4, B:173:0x030c, B:175:0x0310, B:177:0x0314, B:179:0x0318, B:181:0x0322, B:182:0x032a, B:184:0x0332, B:186:0x033a, B:188:0x033e, B:189:0x0340, B:191:0x0346, B:192:0x034d, B:194:0x0351, B:196:0x0355, B:198:0x0359, B:200:0x035d, B:202:0x0361, B:204:0x0366, B:206:0x036c, B:208:0x0372, B:211:0x0381, B:212:0x0387, B:213:0x038c, B:215:0x0390, B:217:0x0394, B:219:0x03b4, B:221:0x03bc, B:223:0x03c0, B:225:0x03c4, B:227:0x03c8, B:229:0x03cc, B:231:0x03d0, B:233:0x03d7, B:235:0x03df, B:236:0x0398, B:238:0x039c, B:239:0x03a4, B:241:0x03a8, B:242:0x03ac, B:245:0x03fc, B:247:0x0414, B:249:0x0418, B:250:0x041a, B:251:0x04cc, B:253:0x04d0, B:259:0x0428, B:261:0x042c, B:263:0x0430, B:265:0x0434, B:267:0x0438, B:269:0x043c, B:271:0x0443, B:273:0x044b, B:274:0x0454, B:276:0x0458, B:278:0x045c, B:280:0x0493, B:283:0x049b, B:284:0x0471, B:286:0x0480, B:287:0x048b, B:290:0x04ad, B:291:0x0460, B:292:0x04b1, B:294:0x04b7, B:296:0x04bb, B:297:0x04bd, B:299:0x04df, B:301:0x04ee, B:302:0x04f9, B:306:0x02fd, B:313:0x0150), top: B:68:0x0136, inners: #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P(X.EnumC56820MRs r25) {
        /*
            Method dump skipped, instructions count: 1303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MVZ.P(X.MRs):void");
    }

    @Override // X.MVV
    public final void applyNewCover(int i) {
        super.applyNewCover(i);
        C56915MVj c56915MVj = (C56915MVj) this.itemView.findViewById(R.id.h5o);
        applyCoverSize(i, c56915MVj.LJFF(R.id.j2s));
        C115634gJ c115634gJ = (C115634gJ) c56915MVj.LJFF(R.id.j2t);
        LinkedHashMap linkedHashMap = (LinkedHashMap) c115634gJ.LJLJI;
        View view = (View) linkedHashMap.get(Integer.valueOf(R.id.h5s));
        if (view == null) {
            view = c115634gJ.findViewById(R.id.h5s);
            if (view != null) {
                linkedHashMap.put(Integer.valueOf(R.id.h5s), view);
            } else {
                view = null;
            }
        }
        applyCoverSize(i, view);
        ViewGroup.LayoutParams layoutParams = c56915MVj.LJFF(R.id.j2t).getLayoutParams();
        layoutParams.width = C47959Irz.LIZJ(8, i);
        layoutParams.height = C47959Irz.LIZJ(6, i);
    }

    @Override // X.MVY, X.MVV
    public final void applyNewStyle(C96533qb c96533qb) {
        super.applyNewStyle(c96533qb);
        C56919MVn c56919MVn = (C56919MVn) this.itemView.findViewById(R.id.h57);
        applyHead(c96533qb, c56919MVn.LJFF(R.id.h4z));
        applyHeadStoryRing(c96533qb, c56919MVn.LJFF(R.id.h4y));
        View LJFF = c56919MVn.LJFF(R.id.h50);
        applyAggregatedHead(c96533qb, c56919MVn.LJFF(R.id.h4w), LJFF, c56919MVn.LJFF(R.id.h51));
        if (c96533qb != null) {
            int LIZJ = C47959Irz.LIZJ(2, c96533qb.LIZIZ - c96533qb.LIZJ);
            ViewGroup.LayoutParams layoutParams = LJFF.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = LIZJ;
            marginLayoutParams.setMarginEnd(LIZJ);
            LJFF.setLayoutParams(marginLayoutParams);
        }
        C56912MVg c56912MVg = (C56912MVg) this.itemView.findViewById(R.id.h5e);
        if (c96533qb != null) {
            c56912MVg.setMinimumHeight(c96533qb.LIZIZ);
        }
        applyTitleSize(c96533qb, c56912MVg.getNotification_name());
        applyContentColor(c96533qb, (TextView) c56912MVg.LJFF(R.id.h4l));
        C56915MVj c56915MVj = (C56915MVj) this.itemView.findViewById(R.id.h5o);
        applyArrow(c96533qb, c56915MVj.LJFF(R.id.h4d));
        if (c96533qb != null && c96533qb.LIZIZ == C7MY.LIZIZ(56)) {
            View LJFF2 = c56915MVj.LJFF(R.id.h4e);
            View LJFF3 = c56915MVj.LJFF(R.id.h4e);
            int i = MVV.LARGE_AVATAR_ADD_SPACE;
            resetViewTopMargin(LJFF2, getViewTopMarginAddSpace(LJFF3, i));
            resetViewTopMargin(c56915MVj.LJFF(R.id.h4i), getViewTopMarginAddSpace(c56915MVj.LJFF(R.id.h4i), i));
            resetViewTopMargin(c56915MVj.LJFF(R.id.iu_), getViewTopMarginAddSpace(c56915MVj.LJFF(R.id.iu_), i));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x014e, code lost:
    
        r1 = com.bytedance.router.SmartRouter.buildRoute(X.EF7.LIZIZ(), r3);
        r0 = X.AX5.LIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0158, code lost:
    
        if (r0 != null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x015a, code lost:
    
        r0 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x015b, code lost:
    
        r1.withParam("inbox_position", r0);
        kotlin.jvm.internal.o.LJIIIIZZ(r1, "buildRoute(AppContextMan…                        )");
        com.ss.android.ugc.aweme.notification.perf.NoticeVideoManager.LIZJ(r1, r3);
        X.C57258Mda.LJ(r1, r());
        r1.open();
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0172, code lost:
    
        r0 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0175, code lost:
    
        if (r1 != null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00d0, code lost:
    
        if (r3.length() == 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00d2, code lost:
    
        r0 = r19.LJLILLLLZI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00d4, code lost:
    
        if (r0 == null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00d6, code lost:
    
        r0 = r0.templateNotice;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00d8, code lost:
    
        if (r0 == null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00da, code lost:
    
        r0 = r0.uiTemplate;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00dc, code lost:
    
        if (r0 == null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00de, code lost:
    
        r5 = r0.toastText;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00e0, code lost:
    
        if (r5 == null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00e2, code lost:
    
        r1 = r19.itemView;
        kotlin.jvm.internal.o.LJIIIIZZ(r1, "itemView");
        r2 = new X.C26045AKb(r1);
        r2.LJIIIZ(r5);
        r2.LJIIJ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00f4, code lost:
    
        X.C221018lt.LJFF("MTTemplateNotificationHolder", "schemaUrl is null");
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00fb, code lost:
    
        if (r3 == null) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00fd, code lost:
    
        D();
        r0 = r19.LJLILLLLZI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0102, code lost:
    
        if (r0 == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0104, code lost:
    
        r0 = r0.templateNotice;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0106, code lost:
    
        if (r0 == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0108, code lost:
    
        r0 = r0.LIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x010a, code lost:
    
        LLLIIIIL(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0114, code lost:
    
        if (ujb.s.LJJJLZIJ(r3, "profile/viewer", false) == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0116, code lost:
    
        com.ss.android.ugc.aweme.profile.ProfileServiceImpl.LIZ().mobClickEnterProfileViewer();
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x011d, code lost:
    
        r1 = r19.mContext;
        kotlin.jvm.internal.o.LJIIIIZZ(r1, "context");
        r0 = X.C45804HyK.LJIJJ(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x012a, code lost:
    
        if (r0 == null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x012c, code lost:
    
        r1 = com.bytedance.router.SmartRouter.buildRoute(r0, r3);
        kotlin.jvm.internal.o.LJIIIIZZ(r1, "buildRoute(activity, url)");
        com.ss.android.ugc.aweme.notification.perf.NoticeVideoManager.LIZJ(r1, r3);
        X.C57258Mda.LJ(r1, r());
        r0 = X.AX5.LIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0141, code lost:
    
        if (r0 != null) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0143, code lost:
    
        r0 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0144, code lost:
    
        r1.withParam("inbox_position", r0);
        r1.open();
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x014c, code lost:
    
        if (X.C76800UCe.LIZ != null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:?, code lost:
    
        return;
     */
    @Override // X.ViewOnClickListenerC56908MVc, android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r20) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MVZ.onClick(android.view.View):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MVZ(View itemView, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns) {
        super(itemView);
        o.LJIIIZ(itemView, "itemView");
        this.LJLIL = interfaceC88472Yns;
        this.LJLJJLL = -1;
        this.LJLJL = "";
        this.LJLJLJ = true;
        this.LJLJLLL = C61878OQg.INSTANCE;
        C16880lQ.LJIIJ(this, itemView);
        itemView.setOnLongClickListener(this);
        if (C53341Kwb.LIZ()) {
            MVR.LIZ(itemView.findViewById(R.id.h5p), MVP.CELL, 0.0f);
            return;
        }
        View findViewById = itemView.findViewById(R.id.h5p);
        o.LJIIIIZZ(findViewById, "itemView.notification_root");
        MVR.LJ(findViewById);
    }

    @Override // X.C56906MVa
    public final void onNameClicked(View v, User user, int i) {
        o.LJIIIZ(v, "v");
        s();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
    
        if (r3 == null) goto L20;
     */
    @Override // X.InterfaceC56930MVy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLJL(com.ss.android.ugc.aweme.profile.model.User r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
            r5 = this;
            X.7au r4 = new X.7au
            r4.<init>()
            java.lang.String r1 = "enter_from"
            java.lang.String r0 = "notification_page"
            r4.LJIIIZ(r1, r0)
            java.lang.String r0 = "position"
            r4.LJIIIZ(r0, r8)
            java.lang.String r0 = "account_type"
            r4.LJIIIZ(r0, r9)
            if (r6 == 0) goto L60
            java.lang.String r1 = r6.getUid()
        L1c:
            java.lang.String r0 = "to_user_id"
            r4.LJIIIZ(r0, r1)
            java.lang.String r0 = "enter_method"
            r4.LJIIIZ(r0, r7)
            X.Yp3 r3 = X.C88545Yp3.LIZIZ
            java.lang.String r2 = ""
            if (r3 == 0) goto L32
            java.lang.String r1 = r3.LJ()
            if (r1 != 0) goto L35
        L32:
            r1 = r2
            if (r3 == 0) goto L5e
        L35:
            boolean r0 = r3.isConnected()
        L39:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.LJFF(r0, r1)
            if (r3 == 0) goto L48
            java.lang.String r1 = r3.LIZIZ()
            if (r1 != 0) goto L4b
        L48:
            r1 = r2
            if (r3 == 0) goto L51
        L4b:
            java.lang.String r0 = r3.LJIILJJIL()
            if (r0 != 0) goto L5c
        L51:
            r4.LJIIIZ(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r1 = r4.LIZ
            java.lang.String r0 = "enter_personal_detail"
            X.FMX.LJIIL(r0, r1)
            return
        L5c:
            r2 = r0
            goto L51
        L5e:
            r0 = 0
            goto L39
        L60:
            r1 = 0
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MVZ.LLLJL(com.ss.android.ugc.aweme.profile.model.User, java.lang.String, java.lang.String, java.lang.String):void");
    }

    @Override // X.InterfaceC56930MVy
    public final void G(TuxTextView tuxTextView, List list, Integer num, MusNotice musNotice, String str) {
        setTemplateClickableNameText(tuxTextView, list, num, musNotice, str);
    }

    @Override // X.InterfaceC56930MVy
    public final void LLIILZL(String str, String str2, BaseNotice baseNotice, boolean z, String str3) {
        MW4.LIZ(C56906MVa.Companion, str, str2, baseNotice, z, str3, r(), 32);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(35:1|(1:3)|4|(1:6)|7|(1:9)|10|(28:14|(2:16|(2:18|(2:20|(1:22))(1:128))(1:129))(1:130)|23|(1:25)|26|(1:30)|31|32|33|(2:35|(1:100)(12:39|40|(8:78|79|80|(2:82|(3:84|85|(1:87)))|89|(1:98)(1:97)|85|(0))|42|(1:77)(1:46)|(3:48|(3:50|(2:54|(1:56))|52)|57)|58|(3:60|(1:62)|63)|64|(5:66|(1:68)|69|(2:72|70)|73)|74|75))|126|102|(1:104)(1:125)|105|(14:107|(2:109|(1:111))|40|(0)|42|(1:44)|77|(0)|58|(0)|64|(0)|74|75)(14:113|(1:124)|40|(0)|42|(0)|77|(0)|58|(0)|64|(0)|74|75)|112|40|(0)|42|(0)|77|(0)|58|(0)|64|(0)|74|75)|131|23|(0)|26|(2:28|30)|31|32|33|(0)|126|102|(0)(0)|105|(0)(0)|112|40|(0)|42|(0)|77|(0)|58|(0)|64|(0)|74|75) */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0118, code lost:
    
        if (r13 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0186, code lost:
    
        if (X.ORY.LJJIJ(r12.intValue(), r0) != false) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0122 A[Catch: Exception -> 0x0154, TryCatch #1 {Exception -> 0x0154, blocks: (B:33:0x00ed, B:35:0x00f3, B:37:0x00fb, B:100:0x0116, B:102:0x011c, B:104:0x0122, B:105:0x012a, B:109:0x023b, B:113:0x0133, B:116:0x013c, B:118:0x0140, B:120:0x0144, B:122:0x0148), top: B:32:0x00ed }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0133 A[Catch: Exception -> 0x0154, TryCatch #1 {Exception -> 0x0154, blocks: (B:33:0x00ed, B:35:0x00f3, B:37:0x00fb, B:100:0x0116, B:102:0x011c, B:104:0x0122, B:105:0x012a, B:109:0x023b, B:113:0x0133, B:116:0x013c, B:118:0x0140, B:120:0x0144, B:122:0x0148), top: B:32:0x00ed }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f3 A[Catch: Exception -> 0x0154, TryCatch #1 {Exception -> 0x0154, blocks: (B:33:0x00ed, B:35:0x00f3, B:37:0x00fb, B:100:0x0116, B:102:0x011c, B:104:0x0122, B:105:0x012a, B:109:0x023b, B:113:0x0133, B:116:0x013c, B:118:0x0140, B:120:0x0144, B:122:0x0148), top: B:32:0x00ed }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0234  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void M(X.MVZ r16, com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r17, int r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, boolean r22, java.util.List r23, boolean r24, boolean r25, java.lang.String r26, int r27) {
        /*
            Method dump skipped, instructions count: 627
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MVZ.M(X.MVZ, com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice, int, java.lang.String, java.lang.String, java.lang.String, boolean, java.util.List, boolean, boolean, java.lang.String, int):void");
    }
}
