package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes11.dex */
public final class N3S extends AbstractC65781Prl implements InterfaceC88472Yns<java.util.Map<String, Object>, C76800UCe> {
    public final /* synthetic */ C68322mC<Integer> LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ Integer LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ android.net.Uri LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ java.util.Map<String, Object> LJLJL;
    public final /* synthetic */ String LJLJLJ;
    public final /* synthetic */ String LJLJLLL;
    public final /* synthetic */ boolean LJLL;
    public final /* synthetic */ Long LJLLI;
    public final /* synthetic */ Long LJLLILLLL;
    public final /* synthetic */ Long LJLLJ;
    public final /* synthetic */ Long LJLLL;
    public final /* synthetic */ Long LJLLLL;
    public final /* synthetic */ String LJLLLLLL;
    public final /* synthetic */ String LJLZ;
    public final /* synthetic */ String LJZ;
    public final /* synthetic */ Long LJZI;
    public final /* synthetic */ Long LJZL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N3S(C68322mC<Integer> c68322mC, String str, Integer num, String str2, android.net.Uri uri, String str3, java.util.Map<String, ? extends Object> map, String str4, String str5, boolean z, Long l, Long l2, Long l3, Long l4, Long l5, String str6, String str7, String str8, Long l6, Long l7) {
        super(1);
        this.LJLIL = c68322mC;
        this.LJLILLLLZI = str;
        this.LJLJI = num;
        this.LJLJJI = str2;
        this.LJLJJL = uri;
        this.LJLJJLL = str3;
        this.LJLJL = map;
        this.LJLJLJ = str4;
        this.LJLJLLL = str5;
        this.LJLL = z;
        this.LJLLI = l;
        this.LJLLILLLL = l2;
        this.LJLLJ = l3;
        this.LJLLL = l4;
        this.LJLLLL = l5;
        this.LJLLLLLL = str6;
        this.LJLZ = str7;
        this.LJZ = str8;
        this.LJZI = l6;
        this.LJZL = l7;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(java.util.Map<String, Object> map) {
        int i;
        Float valueOf;
        Object obj;
        Object obj2;
        java.util.Map<String, Object> sendLog = map;
        o.LJIIIZ(sendLog, "$this$sendLog");
        Integer num = this.LJLIL.element;
        if (num != null) {
            sendLog.put("error_code", Integer.valueOf(num.intValue()));
        }
        String str = this.LJLILLLLZI;
        int i2 = 0;
        if (str != null) {
            if (str.length() > 500) {
                str = str.substring(0, LiveMaxRetainAlogMessageSizeSetting.DEFAULT);
                o.LJIIIIZZ(str, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            sendLog.put("error_msg", str);
        }
        Integer num2 = this.LJLJI;
        if (num2 != null) {
            sendLog.put("categorized_code", Integer.valueOf(num2.intValue()));
        }
        String str2 = this.LJLJJI;
        int i3 = 2;
        if (str2 != null) {
            List LJLJJL = s.LJLJJL(str2, new String[]{"x"}, 0, 6);
            if (LJLJJL.size() == 2) {
                try {
                    OSZ osz = new OSZ(Integer.valueOf(CastIntegerProtector.parseInt((String) ListProtector.get(LJLJJL, 0))), Integer.valueOf(CastIntegerProtector.parseInt((String) ListProtector.get(LJLJJL, 1))));
                    sendLog.put("width", osz.getFirst());
                    sendLog.put("height", osz.getSecond());
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable unused) {
                }
            }
        }
        N3T LJIJ = C1GE.LJIJ(this.LJLJJL);
        if (LJIJ != null) {
            Object obj3 = LJIJ.LIZIZ;
            if (obj3 != null) {
                sendLog.put("page_name", obj3);
            }
            Object obj4 = LJIJ.LIZJ;
            if (obj4 != null) {
                sendLog.put("module", obj4);
            }
            Object obj5 = LJIJ.LIZLLL;
            if (obj5 != null) {
                sendLog.put("ec_biz_cls", obj5);
            }
            Object obj6 = LJIJ.LIZ;
            if (obj6 == null) {
                obj6 = "unknown";
            }
            sendLog.put("ec_biz_scene", obj6);
        }
        Object LIZ = C58403Mw3.LIZ(this.LJLJJLL, "order");
        if (LIZ != null && (obj2 = LIZ.toString()) != null) {
            sendLog.put("order", obj2);
        }
        Object LIZ2 = C58403Mw3.LIZ(this.LJLJJLL, "data_source");
        if (LIZ2 != null && (obj = LIZ2.toString()) != null) {
            sendLog.put("data_source", obj);
        }
        Object obj7 = this.LJLJL;
        if (obj7 != null) {
            sendLog.put("trackParams", obj7);
        }
        sendLog.put("dpr", Integer.valueOf(C39441Fdt.LIZ));
        sendLog.put("image_url", this.LJLJJL);
        Object obj8 = this.LJLJLJ;
        if (obj8 != null) {
            sendLog.put("host", obj8);
        }
        Object obj9 = this.LJLJLLL;
        if (obj9 != null) {
            sendLog.put("path", obj9);
        }
        sendLog.put("success", Integer.valueOf(this.LJLL ? 1 : 0));
        String url = this.LJLJJLL;
        o.LJIIIZ(url, "url");
        N3J LIZ3 = new N3M(url).LIZ();
        if (LIZ3 != null) {
            sendLog.put("service_id", LIZ3.LIZ);
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("tplv-");
            LIZ4.append(LIZ3.LIZ);
            LIZ4.append('-');
            LIZ4.append(LIZ3.LIZIZ);
            sendLog.put("imagex_template_name", X1D.LIZIZ(LIZ4));
        }
        Long l = this.LJLLI;
        if (l != null) {
            sendLog.put("queue_duration", Long.valueOf(l.longValue()));
        }
        Long l2 = this.LJLLILLLL;
        if (l2 != null) {
            long longValue = l2.longValue();
            sendLog.put("download_duration", Long.valueOf(longValue));
            sendLog.put("duration", Long.valueOf(longValue));
        }
        Long l3 = this.LJLLJ;
        if (l3 != null) {
            sendLog.put("decode_duration", Long.valueOf(l3.longValue()));
        }
        Long l4 = this.LJLLL;
        if (l4 != null) {
            l4.longValue();
            sendLog.put("request_duration", l4);
        }
        Long l5 = this.LJLLLL;
        if (l5 != null) {
            l5.longValue();
            sendLog.put("total_duration", l5);
        }
        if (this.LJLLL == null) {
            i = 3;
        } else if (this.LJLLJ == null) {
            i = 2;
        } else if (this.LJLLILLLL == null) {
            i = 4;
        } else {
            i = 1;
        }
        sendLog.put("disk_hit", Integer.valueOf(i));
        Object obj10 = this.LJLLLLLL;
        if (obj10 != null) {
            sendLog.put("content_type", obj10);
        }
        String str3 = this.LJLZ;
        if (str3 != null) {
            sendLog.put("cdn_hit", Integer.valueOf(o.LJ(str3, "1") ? 1 : 0));
        }
        Object obj11 = this.LJZ;
        if (obj11 != null) {
            sendLog.put("intended_image_size", obj11);
        }
        Object obj12 = this.LJLJJI;
        if (obj12 != null) {
            sendLog.put("applied_image_size", obj12);
        }
        String str4 = this.LJZ;
        String str5 = this.LJLJJI;
        Float LIZJ = C61831OOl.LIZJ(str4);
        Float LIZJ2 = C61831OOl.LIZJ(str5);
        if (LIZJ != null && LIZJ2 != null) {
            if (o.LIZJ(LIZJ, 0.0f)) {
                valueOf = Float.valueOf(0.0f);
            } else {
                valueOf = Float.valueOf(LIZJ2.floatValue() / LIZJ.floatValue());
            }
            if (valueOf != null) {
                float floatValue = valueOf.floatValue();
                sendLog.put("image_size_diff", Float.valueOf(floatValue));
                if (floatValue >= C39441Fdt.LIZJ) {
                    i2 = 1;
                }
            }
        }
        Long l6 = this.LJZI;
        if (l6 != null) {
            long longValue2 = l6.longValue();
            sendLog.put("image_size", Long.valueOf(longValue2));
            if (longValue2 < C39441Fdt.LIZIZ) {
                i3 = i2;
            }
            i2 = i3;
        }
        Long l7 = this.LJZL;
        if (l7 != null) {
            sendLog.put("memory_size", Long.valueOf(l7.longValue()));
        }
        sendLog.put("is_large_image", Integer.valueOf(i2));
        return C76800UCe.LIZ;
    }
}
