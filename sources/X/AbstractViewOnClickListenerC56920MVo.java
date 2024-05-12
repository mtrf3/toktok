package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ecommerce.core.services.ECommerceService;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.NoticeUITemplate;
import com.ss.android.ugc.aweme.notification.perf.NoticeVideoManager;
import defpackage.a1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS156S0200000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.MVo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractViewOnClickListenerC56920MVo extends FrameLayout implements View.OnClickListener {
    public GeneralTemplateNotice LJLIL;
    public MusNotice LJLILLLLZI;
    public InterfaceC56930MVy LJLJI;
    public C56927MVv LJLJJI;
    public MW1 LJLJJL;

    public abstract String LIZJ(View view);

    public abstract boolean LIZLLL(View view);

    public abstract MWI getTemplatePosition();

    public final C56927MVv getExpandAbility() {
        return this.LJLJJI;
    }

    public final MusNotice getMBaseNotice() {
        return this.LJLILLLLZI;
    }

    public final InterfaceC56930MVy getMBridge() {
        return this.LJLJI;
    }

    public final GeneralTemplateNotice getTemplateNotice() {
        return this.LJLIL;
    }

    public final MW1 getViewHolderConfig() {
        return this.LJLJJL;
    }

    public final void LJ(String url) {
        Integer num;
        String str;
        Context LIZIZ;
        String str2;
        HashMap<String, String> hashMap;
        String queryParameter;
        NoticeUITemplate noticeUITemplate;
        String str3;
        o.LJIIIZ(url, "url");
        if (url.length() == 0) {
            GeneralTemplateNotice generalTemplateNotice = this.LJLIL;
            if (generalTemplateNotice != null && (noticeUITemplate = generalTemplateNotice.uiTemplate) != null && (str3 = noticeUITemplate.toastText) != null) {
                C26045AKb c26045AKb = new C26045AKb(this);
                c26045AKb.LJIIIZ(str3);
                c26045AKb.LJIIJ();
            }
            C221018lt.LJFF("NoticeTemplateView", "schema url is null");
            return;
        }
        MusNotice musNotice = this.LJLILLLLZI;
        HashMap hashMap2 = null;
        if (musNotice != null) {
            num = Integer.valueOf(musNotice.type);
        } else {
            num = null;
        }
        MusNotice musNotice2 = this.LJLILLLLZI;
        if (musNotice2 != null) {
            str = musNotice2.nid;
        } else {
            str = null;
        }
        YAL.LIZIZ(num, url, str);
        HandlerC56918MVm LIZ = NoticeVideoManager.LIZ();
        if (LIZ != null) {
            MS5.LJI(new AqS156S0200000_9(this.LJLILLLLZI, LIZ, 28));
        }
        InterfaceC56930MVy interfaceC56930MVy = this.LJLJI;
        if (interfaceC56930MVy != null) {
            interfaceC56930MVy.D();
        }
        android.net.Uri parse = UriProtector.parse(url);
        o.LJIIIIZZ(parse, "parse(url)");
        Context context = getContext();
        if (context == null || (LIZIZ = C45804HyK.LJIJJ(context)) == null) {
            LIZIZ = EF7.LIZIZ();
        }
        SmartRoute buildRoute = SmartRouter.buildRoute(LIZIZ, url);
        InterfaceC56930MVy interfaceC56930MVy2 = this.LJLJI;
        if (interfaceC56930MVy2 != null) {
            str2 = interfaceC56930MVy2.getTabName();
        } else {
            str2 = null;
        }
        buildRoute.withParam("second_tab_name", str2);
        String queryParameter2 = UriProtector.getQueryParameter(parse, "show_comment");
        if (queryParameter2 == null) {
            queryParameter2 = CardStruct.IStatusCode.DEFAULT;
        }
        buildRoute.withParam("comment_force_open_reply", queryParameter2);
        String queryParameter3 = UriProtector.getQueryParameter(parse, "enter_method");
        if (queryParameter3 == null) {
            queryParameter3 = "click";
        }
        buildRoute.withParam("enter_method", queryParameter3);
        o.LJIIIIZZ(buildRoute, "buildRoute(context, url)…) ?: CLICK,\n            )");
        NoticeVideoManager.LIZJ(buildRoute, url);
        InterfaceC56930MVy interfaceC56930MVy3 = this.LJLJI;
        if (interfaceC56930MVy3 != null) {
            hashMap = interfaceC56930MVy3.r();
        } else {
            hashMap = null;
        }
        C57258Mda.LJ(buildRoute, hashMap);
        if (this.LJLJJL != null && (queryParameter = UriProtector.getQueryParameter(parse, "story_uid")) != null) {
            hashMap2 = C113554cx.LJJJLZIJ(new OSZ("story_extra_author_uid", queryParameter));
        }
        buildRoute.withParam("feed_param_extra", hashMap2);
        buildRoute.open();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        NoticeUITemplate noticeUITemplate;
        String str;
        String str2;
        int i;
        Integer num;
        String str3;
        String LLILIL;
        InterfaceC56930MVy interfaceC56930MVy;
        GeneralTemplateNotice generalTemplateNotice;
        String str4;
        MVZ mvz;
        if (C6ZT.LIZ(view)) {
            return;
        }
        InterfaceC56930MVy interfaceC56930MVy2 = this.LJLJI;
        String str5 = null;
        if (interfaceC56930MVy2 != null && (generalTemplateNotice = this.LJLIL) != null) {
            String LIZJ = LIZJ(view);
            MWI templatePosition = getTemplatePosition();
            int LLLLZI = interfaceC56930MVy2.LLLLZI();
            String t = interfaceC56930MVy2.t();
            String tabName = interfaceC56930MVy2.getTabName();
            String enterFrom = interfaceC56930MVy2.getEnterFrom();
            if (enterFrom == null) {
                enterFrom = "";
            }
            boolean LLLL = interfaceC56930MVy2.LLLL();
            MusNotice musNotice = this.LJLILLLLZI;
            if (musNotice != null) {
                str4 = musNotice.getAccountType();
            } else {
                str4 = null;
            }
            if (interfaceC56930MVy2 instanceof MVZ) {
                mvz = (MVZ) interfaceC56930MVy2;
            } else {
                mvz = null;
            }
            C56889MUj c56889MUj = new C56889MUj(generalTemplateNotice, view, LIZJ, templatePosition, LLLLZI, t, tabName, enterFrom, LLLL, str4, mvz);
            interfaceC56930MVy2.s();
            List<InterfaceC56825MRx> interceptors = interfaceC56930MVy2.getInterceptors();
            if (interceptors != null) {
                Iterator<InterfaceC56825MRx> it = interceptors.iterator();
                while (it.hasNext()) {
                    if (it.next().LIZJ(c56889MUj)) {
                        InterfaceC56930MVy interfaceC56930MVy3 = this.LJLJI;
                        if (interfaceC56930MVy3 != null) {
                            interfaceC56930MVy3.D();
                            return;
                        }
                        return;
                    }
                }
            }
        }
        if (LIZLLL(view)) {
            return;
        }
        MW1 mw1 = this.LJLJJL;
        if (mw1 != null && mw1.LJIIIIZZ && (interfaceC56930MVy = this.LJLJI) != null && interfaceC56930MVy.LLILII()) {
            InterfaceC56930MVy interfaceC56930MVy4 = this.LJLJI;
            if (interfaceC56930MVy4 != null) {
                interfaceC56930MVy4.D();
                return;
            }
            return;
        }
        GeneralTemplateNotice generalTemplateNotice2 = this.LJLIL;
        if (generalTemplateNotice2 != null && (str2 = generalTemplateNotice2.schemaUrl) != null) {
            InterfaceC56930MVy interfaceC56930MVy5 = this.LJLJI;
            if (interfaceC56930MVy5 != null && (LLILIL = interfaceC56930MVy5.LLILIL()) != null) {
                str2 = LLILIL;
            }
            GeneralTemplateNotice generalTemplateNotice3 = this.LJLIL;
            if (generalTemplateNotice3 != null && (num = generalTemplateNotice3.type) != null && num.intValue() == 210) {
                IECommerceService createIECommerceServicebyMonsterPlugin = ECommerceService.createIECommerceServicebyMonsterPlugin(false);
                InterfaceC56930MVy interfaceC56930MVy6 = this.LJLJI;
                if (interfaceC56930MVy6 != null) {
                    str3 = interfaceC56930MVy6.getPageName();
                } else {
                    str3 = null;
                }
                InterfaceC56930MVy interfaceC56930MVy7 = this.LJLJI;
                if (interfaceC56930MVy7 != null) {
                    str5 = interfaceC56930MVy7.getEnterFrom();
                }
                str2 = createIECommerceServicebyMonsterPlugin.modifySchemaOfNotice(str2, str3, str5);
            }
            InterfaceC56930MVy interfaceC56930MVy8 = this.LJLJI;
            if (interfaceC56930MVy8 != null) {
                GeneralTemplateNotice generalTemplateNotice4 = this.LJLIL;
                if (generalTemplateNotice4 != null) {
                    i = generalTemplateNotice4.LIZ;
                } else {
                    i = -1;
                }
                interfaceC56930MVy8.LLLIIIIL(i);
            }
            LJ(str2);
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        GeneralTemplateNotice generalTemplateNotice5 = this.LJLIL;
        if (generalTemplateNotice5 != null && (noticeUITemplate = generalTemplateNotice5.uiTemplate) != null && (str = noticeUITemplate.toastText) != null) {
            C26045AKb c26045AKb = new C26045AKb(this);
            c26045AKb.LJIIIZ(str);
            c26045AKb.LJIIJ();
        }
        C221018lt.LJFF("NoticeTemplateView", "schema url is null");
    }

    public final void setExpandAbility(C56927MVv c56927MVv) {
        this.LJLJJI = c56927MVv;
    }

    public final void setMBaseNotice(MusNotice musNotice) {
        this.LJLILLLLZI = musNotice;
    }

    public final void setMBridge(InterfaceC56930MVy interfaceC56930MVy) {
        this.LJLJI = interfaceC56930MVy;
    }

    public final void setTemplateNotice(GeneralTemplateNotice generalTemplateNotice) {
        this.LJLIL = generalTemplateNotice;
    }

    public final void setViewHolderConfig(MW1 mw1) {
        this.LJLJJL = mw1;
    }

    public void LIZ(MusNotice notice, InterfaceC56930MVy provider) {
        MW1 mw1;
        o.LJIIIZ(notice, "notice");
        o.LJIIIZ(provider, "provider");
        this.LJLILLLLZI = notice;
        this.LJLIL = notice.templateNotice;
        this.LJLJI = provider;
        C56927MVv LLZZ = provider.LLZZ();
        this.LJLJJI = LLZZ;
        if (LLZZ != null) {
            mw1 = LLZZ.LIZIZ;
        } else {
            mw1 = null;
        }
        this.LJLJJL = mw1;
    }

    public final void LIZIZ(View.OnClickListener listener, View view) {
        MVZ LJJIJL;
        o.LJIIIZ(listener, "listener");
        if (view != null) {
            C16880lQ.LJIIJ(listener, view);
            InterfaceC56930MVy interfaceC56930MVy = this.LJLJI;
            if (interfaceC56930MVy != null && (LJJIJL = interfaceC56930MVy.LJJIJL()) != null) {
                view.setOnLongClickListener(LJJIJL);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractViewOnClickListenerC56920MVo(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
    }
}
