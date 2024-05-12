package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.ecommerce.core.ab.EcPdpSlowFuncOpt;
import com.ss.android.ugc.aweme.ecommerce.core.engine.BizParserInfo;
import com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService;
import com.ss.android.ugc.aweme.ecommerce.core.engine.PreBizParserResponseData;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.Am2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27206Am2 {
    public static boolean LIZ;
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C27208Am4.LJLIL);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C27209Am5.LJLIL);

    public static Keva LIZLLL() {
        Object value = LIZIZ.getValue();
        o.LJIIIIZZ(value, "<get-REPO>(...)");
        return (Keva) value;
    }

    public static String LIZJ(String str, String str2, String str3) {
        String str4;
        StringBuilder LJFF = C72972SkS.LJFF(str, '.');
        if (str2 != null) {
            str4 = str2.toUpperCase(Locale.ROOT);
            o.LJIIIIZZ(str4, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        } else {
            str4 = "";
        }
        return C0MT.LIZ(LJFF, str4, '.', str3, LJFF);
    }

    public static int LJ(EnumC28000Ayq biz, String page, String str) {
        int i;
        BizParserInfo bizParserInfo;
        Integer num;
        Integer LJJIL;
        String str2 = str;
        o.LJIIIZ(biz, "biz");
        o.LJIIIZ(page, "page");
        if (str2 == null) {
            str2 = C85990Xow.LIZ().toUpperCase();
            o.LJIIIIZZ(str2, "this as java.lang.String).toUpperCase()");
        }
        C62822Ol8 c62822Ol8 = LIZJ;
        Object value = c62822Ol8.getValue();
        o.LJIIIIZZ(value, "<get-debugPanelRepo>(...)");
        if (((Keva) value).getBoolean("enable_page_template_mock", false)) {
            Object value2 = c62822Ol8.getValue();
            o.LJIIIIZZ(value2, "<get-debugPanelRepo>(...)");
            String string = ((Keva) value2).getString(page, "");
            if (string != null && (LJJIL = C38350F3i.LJJIL(string)) != null) {
                return LJJIL.intValue();
            }
        }
        String LIZJ2 = LIZJ(biz.getBizName(), str2, page);
        if (LIZLLL().contains(LIZJ2)) {
            i = LIZLLL().getInt(LIZJ2, EnumC26549AbR.DEFAULT.getTemplate());
        } else {
            SettingsManager LIZLLL = SettingsManager.LIZLLL();
            PreBizParserResponseData preBizParserResponseData = C58652Rx.LIZ;
            PreBizParserResponseData preBizParserResponseData2 = (PreBizParserResponseData) LIZLLL.LJIIIIZZ("ecom_page_template_config", PreBizParserResponseData.class, preBizParserResponseData);
            if (preBizParserResponseData2 != null) {
                preBizParserResponseData = preBizParserResponseData2;
            }
            List<BizParserInfo> list = preBizParserResponseData.page_biz_list;
            if (list != null) {
                Iterator<BizParserInfo> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        bizParserInfo = it.next();
                        BizParserInfo bizParserInfo2 = bizParserInfo;
                        if (o.LJ(bizParserInfo2.biz_line, biz.getBizName()) && o.LJ(bizParserInfo2.page_name, page) && ujb.o.LJJJJIZL(bizParserInfo2.region, str2, true)) {
                            break;
                        }
                    } else {
                        bizParserInfo = null;
                        break;
                    }
                }
                BizParserInfo bizParserInfo3 = bizParserInfo;
                if (bizParserInfo3 != null && (num = bizParserInfo3.template) != null) {
                    i = num.intValue();
                }
            }
            i = LIZLLL().getInt(LIZJ2, EnumC26549AbR.DEFAULT.getTemplate());
        }
        if (EcPdpSlowFuncOpt.LIZIZ()) {
            XKX.LIZLLL(C780334l.LJLIL, C78613UtF.LIZJ, null, new C26868Aga(biz, page, str2, i, null), 2);
        } else {
            LJI(biz, page, str2, i);
        }
        return i;
    }

    public static boolean LJFF(EnumC28000Ayq biz, String str, int i) {
        o.LJIIIZ(biz, "biz");
        if (LJ(biz, str, null) == i) {
            return true;
        }
        return false;
    }

    public static IComponentStrategyService LIZIZ(EnumC28000Ayq biz, String page, String str, Integer num) {
        String str2;
        Object obj;
        int LJ;
        String str3;
        o.LJIIIZ(biz, "biz");
        o.LJIIIZ(page, "page");
        Object obj2 = null;
        if (str == null) {
            String LIZ2 = C85990Xow.LIZ();
            if (LIZ2 != null) {
                str2 = LIZ2.toUpperCase(Locale.ROOT);
                o.LJIIIIZZ(str2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            } else {
                str2 = null;
            }
        } else {
            str2 = str;
        }
        java.util.Set services = ServiceManager.get().getServices(IComponentStrategyService.class);
        o.LJFF(services, "ServiceManager.get().get…ices(SERVICE::class.java)");
        ArrayList arrayList = new ArrayList();
        Iterator it = services.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            Annotation[] annotations = next.getClass().getAnnotations();
            o.LJIIIIZZ(annotations, "it.javaClass.annotations");
            ArrayList arrayList2 = new ArrayList();
            for (Annotation annotation : annotations) {
                if (annotation instanceof InterfaceC27210Am6) {
                    arrayList2.add(annotation);
                }
            }
            InterfaceC27210Am6 interfaceC27210Am6 = (InterfaceC27210Am6) ORZ.LJLLLL(arrayList2);
            if (interfaceC27210Am6 != null) {
                str3 = interfaceC27210Am6.name();
            } else {
                str3 = null;
            }
            if (o.LJ(str3, page)) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (it2.hasNext()) {
                obj = it2.next();
                IComponentStrategyService iComponentStrategyService = (IComponentStrategyService) obj;
                if (str != null) {
                    LJ = LJ(biz, page, str2);
                } else if (num != null) {
                    LJ = num.intValue();
                } else {
                    LJ = LJ(biz, page, str2);
                }
                if (iComponentStrategyService.getType().getTemplate() == LJ) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        IComponentStrategyService iComponentStrategyService2 = (IComponentStrategyService) obj;
        if (iComponentStrategyService2 == null) {
            Iterator it3 = arrayList.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next2 = it3.next();
                if (((IComponentStrategyService) next2).getType().getTemplate() == EnumC26549AbR.DEFAULT.getTemplate()) {
                    obj2 = next2;
                    break;
                }
            }
            return (IComponentStrategyService) obj2;
        }
        return iComponentStrategyService2;
    }

    public static void LJI(EnumC28000Ayq enumC28000Ayq, String str, String str2, int i) {
        C48658J7u.LIZ("rd_tiktokec_template_monitor", C113554cx.LJJL(new OSZ("page_name", str), new OSZ("region", str2), new OSZ("biz", enumC28000Ayq.getBizName()), new OSZ("template", String.valueOf(i)), new OSZ("is_load_template", String.valueOf(LIZ ? 1 : 0))));
    }

    public static InterfaceC26883Agp LIZ(InterfaceC27538ArO interfaceC27538ArO, LifecycleOwner owner, EnumC28000Ayq biz, String str, InterfaceC65784Pro fallback, int i) {
        if ((i & 4) != 0) {
            str = null;
        }
        o.LJIIIZ(interfaceC27538ArO, "<this>");
        o.LJIIIZ(owner, "owner");
        o.LJIIIZ(biz, "biz");
        o.LJIIIZ(fallback, "fallback");
        IComponentStrategyService LIZIZ2 = LIZIZ(biz, interfaceC27538ArO.getPageName(), str, null);
        if (LIZIZ2 == null) {
            LIZIZ2 = (IComponentStrategyService) fallback.invoke();
        }
        return LIZIZ2.LIZJ(owner);
    }

    public static ViewModelProvider.Factory LJII(InterfaceC27538ArO interfaceC27538ArO, EnumC28000Ayq biz, String str, Integer num, InterfaceC65784Pro fallback, int i) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        o.LJIIIZ(interfaceC27538ArO, "<this>");
        o.LJIIIZ(biz, "biz");
        o.LJIIIZ(fallback, "fallback");
        IComponentStrategyService LIZIZ2 = LIZIZ(biz, interfaceC27538ArO.getPageName(), str, num);
        if (LIZIZ2 != null) {
            return LIZIZ2;
        }
        return (ViewModelProvider.Factory) fallback.invoke();
    }
}
