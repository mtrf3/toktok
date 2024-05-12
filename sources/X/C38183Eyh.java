package X;

import com.bytedance.ies.web.jsbridge2.TimeLineEvent;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Eyh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38183Eyh implements InterfaceC38140Ey0 {
    public final /* synthetic */ C38182Eyg LIZ;

    @Override // X.InterfaceC38140Ey0
    public final void LIZIZ(String str, String str2, int i, String str3, C17230lz c17230lz) {
    }

    @Override // X.InterfaceC38140Ey0
    public final /* synthetic */ void LIZJ(C38117Exd c38117Exd, int i) {
    }

    public C38183Eyh(C38182Eyg c38182Eyg) {
        this.LIZ = c38182Eyg;
    }

    @Override // X.InterfaceC38140Ey0
    public final void LIZ(String str, String str2, C17230lz c17230lz) {
        Object obj;
        try {
            List list = (List) c17230lz.LIZJ;
            C76800UCe c76800UCe = null;
            if (list != null) {
                int LJJIIZ = C51029K0z.LJJIIZ(C32I.LJJL(list, 10));
                if (LJJIIZ < 16) {
                    LJJIIZ = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(LJJIIZ);
                for (Object obj2 : list) {
                    TimeLineEvent it = (TimeLineEvent) obj2;
                    o.LJFF(it, "it");
                    linkedHashMap.put(it.getLabel(), obj2);
                }
                TimeLineEvent timeLineEvent = (TimeLineEvent) linkedHashMap.get("label_create_java_call");
                if (timeLineEvent != null) {
                    HashMap<String, Object> extra = timeLineEvent.getExtra();
                    if (extra != null) {
                        obj = extra.get("callbackId");
                    } else {
                        obj = null;
                    }
                    if (!(obj instanceof String)) {
                        obj = null;
                    }
                    String str3 = (String) obj;
                    if (str3 != null) {
                        C38182Eyg c38182Eyg = this.LIZ;
                        C38184Eyi c38184Eyi = (C38184Eyi) ((LinkedHashMap) c38182Eyg.LJIILLIIL).get(str3);
                        if (c38184Eyi == null) {
                            c38184Eyi = new C38184Eyi();
                            c38182Eyg.LJIILLIIL.put(str3, c38184Eyi);
                        }
                        TimeLineEvent timeLineEvent2 = (TimeLineEvent) linkedHashMap.get("label_pre_call_origin_url");
                        if (timeLineEvent2 != null) {
                            long timeInMillis = timeLineEvent2.getTimeInMillis();
                            if (timeInMillis <= 0) {
                                timeInMillis = System.currentTimeMillis();
                            }
                            c38184Eyi.LIZ = timeInMillis;
                            c38184Eyi.LIZIZ = timeInMillis;
                        }
                        TimeLineEvent timeLineEvent3 = (TimeLineEvent) linkedHashMap.get("label_call_origin_url");
                        if (timeLineEvent3 != null) {
                            long timeInMillis2 = timeLineEvent3.getTimeInMillis();
                            if (timeInMillis2 <= 0) {
                                timeInMillis2 = System.currentTimeMillis();
                            }
                            c38184Eyi.LIZJ = timeInMillis2;
                        }
                        TimeLineEvent timeLineEvent4 = (TimeLineEvent) linkedHashMap.get("label_pre_handle_origin_url");
                        if (timeLineEvent4 != null) {
                            long timeInMillis3 = timeLineEvent4.getTimeInMillis();
                            if (timeInMillis3 <= 0) {
                                timeInMillis3 = System.currentTimeMillis();
                            }
                            c38184Eyi.LIZLLL = timeInMillis3;
                        }
                        if (c38184Eyi.LIZ()) {
                            this.LIZ.LJIILLIIL.remove(str3);
                            C38219EzH c38219EzH = this.LIZ.LJIILJJIL;
                            if (c38219EzH != null) {
                                if (str2 == null) {
                                    str2 = "";
                                }
                            }
                        }
                        c76800UCe = C76800UCe.LIZ;
                    }
                }
            }
            C3C5.m7constructorimpl(c76800UCe);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }
}
