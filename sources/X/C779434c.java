package X;

import Y.ARunnableS20S0200000_1;
import android.app.Activity;
import androidx.lifecycle.MutableLiveData;
import com.byted.cast.common.bean.SinkDeviceInfo;
import com.byted.cast.common.source.ServiceInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.panel.autoscroll.IAutoAScrollAbility;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.34c, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C779434c implements InterfaceC71012qX, InterfaceC70982qU {
    public SinkDeviceInfo LIZ;
    public Long LIZIZ;
    public Long LIZJ;
    public Long LIZLLL;
    public final MutableLiveData<Boolean> LJ = new MutableLiveData<>(Boolean.FALSE);
    public final MutableLiveData<List<ServiceInfo>> LJFF = new MutableLiveData<>(C61878OQg.INSTANCE);
    public final C779734f LJI = new C779734f();
    public final MutableLiveData<ServiceInfo> LJII = new MutableLiveData<>(null);
    public final MutableLiveData<ServiceInfo> LJIIIIZZ = new MutableLiveData<>(null);
    public final MutableLiveData<ServiceInfo> LJIIIZ = new MutableLiveData<>(null);
    public final C779734f LJIIJ = new C779734f();

    @Override // X.InterfaceC70982qU
    public final void LIZIZ() {
        this.LIZ = null;
    }

    public final String LJII() {
        String str;
        ServiceInfo value = this.LJIIIIZZ.getValue();
        if (value == null || (str = value.connectID) == null) {
            return "";
        }
        return str;
    }

    public final String LJIIIIZZ() {
        String str;
        ServiceInfo value = this.LJIIIIZZ.getValue();
        if (value == null || (str = value.deviceID) == null) {
            return "";
        }
        return str;
    }

    public final boolean LJIIIZ() {
        if (this.LJIIIIZZ.getValue() != null) {
            return true;
        }
        return false;
    }

    public final boolean LJIIJ() {
        String str;
        SinkDeviceInfo sinkDeviceInfo = this.LIZ;
        if (sinkDeviceInfo == null || (str = sinkDeviceInfo.googleSinkInfo) == null || str.length() == 0) {
            return true;
        }
        return false;
    }

    public final void LJIILIIL() {
        C71052qb c71052qb;
        C70922qO.LIZ("CastingServiceManager", "stopQueryServices");
        C71082qe c71082qe = C71042qa.LIZIZ;
        if (c71082qe != null && (c71052qb = c71082qe.LIZ) != null) {
            c71052qb.LJIILJJIL();
        }
        C779734f c779734f = this.LJI;
        ARunnableS20S0200000_1 aRunnableS20S0200000_1 = c779734f.LIZ;
        if (aRunnableS20S0200000_1 != null) {
            c779734f.LIZIZ.removeCallbacks(aRunnableS20S0200000_1);
        }
        c779734f.LIZ = null;
        this.LJ.postValue(Boolean.FALSE);
    }

    @Override // X.InterfaceC71012qX
    public final void LJ(ServiceInfo serviceInfo) {
        ServiceInfo value;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onDisconnect ");
        LIZ.append(serviceInfo);
        C70922qO.LIZ("CastingServiceManager", X1D.LIZIZ(LIZ));
        if (serviceInfo != null && (value = this.LJIIIIZZ.getValue()) != null && C44384HbQ.LJLZ(value, serviceInfo)) {
            this.LJIIIIZZ.postValue(null);
            this.LJII.postValue(null);
        }
    }

    @Override // X.InterfaceC70982qU
    public final void LJFF(SinkDeviceInfo sinkDeviceInfo) {
        this.LIZ = sinkDeviceInfo;
    }

    public final void LJI(ServiceInfo service) {
        long j;
        String str;
        String str2;
        String str3;
        C71052qb c71052qb;
        o.LJIIIZ(service, "service");
        long currentTimeMillis = System.currentTimeMillis();
        Long l = this.LIZJ;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 1 + currentTimeMillis;
        }
        long j2 = currentTimeMillis - j;
        C71082qe c71082qe = C71042qa.LIZIZ;
        if (c71082qe == null) {
            return;
        }
        Aweme aweme = c71082qe.LIZJ.LIZIZ;
        if (aweme != null) {
            str = aweme.getGroupId();
        } else {
            str = null;
        }
        Aweme aweme2 = c71082qe.LIZJ.LIZIZ;
        if (aweme2 != null) {
            str2 = aweme2.getAuthorUid();
        } else {
            str2 = null;
        }
        C34L c34l = c71082qe.LIZJ;
        String str4 = c34l.LIZJ;
        boolean z = !c34l.LJ;
        String str5 = service.name;
        String LJIIIIZZ = LJIIIIZZ();
        C85323Wm LIZJ = C05040Hs.LIZJ(str4, "enterFrom", "eventSender");
        C1HQ LIZIZ = C48339Iy7.LIZIZ("enter_from", str4);
        if (str == null) {
            str = "";
        }
        LIZIZ.put("group_id", str);
        if (str2 == null) {
            str2 = "";
        }
        LIZIZ.put("author_id", str2);
        if (z) {
            str3 = "autoscroll";
        } else {
            str3 = "autoscroll_disabled";
        }
        LIZIZ.put("play_mode", str3);
        if (str5 == null) {
            str5 = "";
        }
        LIZIZ.put("tv_device_name", str5);
        LIZIZ.put("is_tt_app", String.valueOf(true));
        LIZIZ.put("casting_device_id", LJIIIIZZ);
        LIZIZ.put("action_from", "disconnect");
        LIZIZ.put("duration", String.valueOf(j2));
        LIZJ.LIZIZ("casting_time_sender", LIZIZ);
        ServiceInfo value = this.LJIIIIZZ.getValue();
        if (value != null && C44384HbQ.LJLZ(value, service)) {
            this.LJIIIIZZ.postValue(null);
        }
        C71082qe c71082qe2 = C71042qa.LIZIZ;
        if (c71082qe2 != null && (c71052qb = c71082qe2.LIZ) != null) {
            c71052qb.LJ(service);
        }
    }

    public final void LJIIJJI(Aweme aweme) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Long l;
        C34L c34l;
        if (aweme != null) {
            str = aweme.getGroupId();
            str2 = aweme.getAuthorUid();
        } else {
            str = null;
            str2 = null;
        }
        C71082qe c71082qe = C71042qa.LIZIZ;
        if (c71082qe != null && (c34l = c71082qe.LIZJ) != null) {
            str3 = c34l.LIZJ;
        } else {
            str3 = null;
        }
        boolean LJIIIZ = LJIIIZ();
        Integer valueOf = Integer.valueOf(EF7.LJIIIZ);
        ServiceInfo value = this.LJII.getValue();
        if (value != null) {
            str4 = value.name;
        } else {
            str4 = null;
        }
        ServiceInfo value2 = this.LJII.getValue();
        if (value2 != null) {
            str5 = value2.deviceID;
        } else {
            str5 = null;
        }
        Long l2 = this.LIZLLL;
        if (l2 != null) {
            l = C44847Hit.LIZ(l2.longValue());
        } else {
            l = null;
        }
        C779934h.LIZ(str, str2, str3, "onConnectError", LJIIIZ, valueOf, str4, str5, l, false);
        this.LJIIIZ.postValue(this.LJII.getValue());
        this.LJII.postValue(null);
    }

    @QD3
    public final void onEvent(C76522zQ event) {
        ServiceInfo value;
        o.LJIIIZ(event, "event");
        if (event.LJLIL != 2 && LJIIIZ() && (value = this.LJIIIIZZ.getValue()) != null) {
            LJI(value);
        }
    }

    @Override // X.InterfaceC71012qX
    public final void LIZ(int i, Aweme aweme) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onConnectError ");
        LIZ.append(i);
        C70922qO.LIZ("CastingServiceManager", X1D.LIZIZ(LIZ));
        LJIIJJI(aweme);
    }

    @Override // X.InterfaceC71012qX
    public final void LIZLLL(ServiceInfo serviceInfo, Aweme aweme) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Long l;
        C71082qe c71082qe;
        C71052qb c71052qb;
        IAutoAScrollAbility LIZ;
        C34L c34l;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onConnectSuccess ");
        LIZ2.append(serviceInfo);
        C70922qO.LIZ("CastingServiceManager", X1D.LIZIZ(LIZ2));
        this.LIZJ = Long.valueOf(System.currentTimeMillis());
        if (aweme != null) {
            str = aweme.getGroupId();
            str2 = aweme.getAuthorUid();
        } else {
            str = null;
            str2 = null;
        }
        C71082qe c71082qe2 = C71042qa.LIZIZ;
        if (c71082qe2 != null && (c34l = c71082qe2.LIZJ) != null) {
            str3 = c34l.LIZJ;
        } else {
            str3 = null;
        }
        boolean LJIIIZ = LJIIIZ();
        Integer valueOf = Integer.valueOf(EF7.LJIIIZ);
        if (serviceInfo != null) {
            str4 = serviceInfo.name;
            str5 = serviceInfo.deviceID;
        } else {
            str4 = null;
            str5 = null;
        }
        Long l2 = this.LIZLLL;
        if (l2 != null) {
            l = C44847Hit.LIZ(l2.longValue());
        } else {
            l = null;
        }
        C779934h.LIZ(str, str2, str3, "", LJIIIZ, valueOf, str4, str5, l, true);
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if ((LJIIIIZZ instanceof ActivityC45651qj) && (LIZ = C224888s8.LIZ((ActivityC45651qj) LJIIIIZZ)) != null) {
            LIZ.j60("tv_casting");
        }
        C779734f c779734f = this.LJIIJ;
        ARunnableS20S0200000_1 aRunnableS20S0200000_1 = c779734f.LIZ;
        if (aRunnableS20S0200000_1 != null) {
            c779734f.LIZIZ.removeCallbacks(aRunnableS20S0200000_1);
        }
        c779734f.LIZ = null;
        this.LJIIIIZZ.postValue(serviceInfo);
        this.LJII.postValue(null);
        if (serviceInfo != null && (c71082qe = C71042qa.LIZIZ) != null && (c71052qb = c71082qe.LIZ) != null) {
            c71052qb.LJI(serviceInfo);
        }
    }

    public final void LJIIL(Aweme aweme, boolean z) {
        C34L c34l;
        String str;
        String str2;
        C71052qb c71052qb;
        Boolean value = this.LJ.getValue();
        Boolean bool = Boolean.TRUE;
        if (o.LJ(value, bool)) {
            return;
        }
        if (z) {
            List<ServiceInfo> value2 = this.LJFF.getValue();
            if (value2 == null) {
                value2 = C61878OQg.INSTANCE;
            }
            if (!value2.isEmpty()) {
                return;
            }
        }
        C70922qO.LIZ("CastingServiceManager", "startBrowseService");
        C779734f c779734f = this.LJI;
        ARunnableS20S0200000_1 aRunnableS20S0200000_1 = new ARunnableS20S0200000_1(this, aweme, 49);
        c779734f.getClass();
        ARunnableS20S0200000_1 aRunnableS20S0200000_12 = new ARunnableS20S0200000_1(aRunnableS20S0200000_1, c779734f, 47);
        c779734f.LIZ = aRunnableS20S0200000_12;
        c779734f.LIZIZ.postDelayed(aRunnableS20S0200000_12, 60000L);
        C71082qe c71082qe = C71042qa.LIZIZ;
        String str3 = null;
        if (c71082qe != null && (c71052qb = c71082qe.LIZ) != null) {
            C70922qO.LIZ("CastingManager", "startBrowseService");
            XKX.LIZLLL(c71052qb.LJFF(), null, null, new C70882qK(c71052qb, aweme, null), 3);
        }
        this.LJ.postValue(bool);
        this.LIZIZ = Long.valueOf(System.currentTimeMillis());
        C71082qe c71082qe2 = C71042qa.LIZIZ;
        if (c71082qe2 != null && (c34l = c71082qe2.LIZJ) != null) {
            if (aweme != null) {
                str = aweme.getGroupId();
                str3 = aweme.getAuthorUid();
            } else {
                str = null;
            }
            String str4 = c34l.LIZJ;
            boolean LJFF = c34l.LJFF();
            C85323Wm LIZ = C772831o.LIZ();
            C1HQ LIZ2 = C77800Ug8.LIZ(LIZ, "eventSender");
            if (str4 == null) {
                str4 = "";
            }
            LIZ2.put("enter_from", str4);
            if (z) {
                str2 = "auto_trigger";
            } else if (!z) {
                str2 = "click_trigger";
            } else {
                throw new C162476Zf();
            }
            LIZ2.put("message_type", str2);
            if (str == null) {
                str = "";
            }
            LIZ2.put("group_id", str);
            if (str3 == null) {
                str3 = "";
            }
            LIZ2.put("author_id", str3);
            LIZ2.put("is_casting", String.valueOf(LJFF));
            LIZ.LIZIZ("casting_device_search_start", LIZ2);
        }
    }

    @Override // X.InterfaceC71012qX
    public final void LIZJ(int i, Aweme aweme, List serviceList) {
        String str;
        String str2;
        Long l;
        String str3;
        String str4;
        o.LJIIIZ(serviceList, "serviceList");
        StringBuilder LJ = C7MY.LJ("browse service statusCode: ", i, ", serviceList size: ");
        LJ.append(serviceList.size());
        C70922qO.LIZ("CastingServiceManager", X1D.LIZIZ(LJ));
        LJIILIIL();
        this.LJFF.postValue(serviceList);
        if (serviceList.size() > 0) {
            str = "device_found_state";
        } else {
            str = "no_device_found_state";
        }
        String str5 = "";
        if (i != 3) {
            str2 = "";
        } else {
            str2 = "BROWSE_ERROR";
            str = "network_error_state";
        }
        Long l2 = this.LIZIZ;
        String str6 = null;
        if (l2 != null) {
            l = C44847Hit.LIZ(l2.longValue());
        } else {
            l = null;
        }
        C71082qe c71082qe = C71042qa.LIZIZ;
        if (c71082qe == null) {
            return;
        }
        if (aweme != null) {
            str3 = aweme.getGroupId();
            str6 = aweme.getAuthorUid();
        } else {
            str3 = null;
        }
        C34L c34l = c71082qe.LIZJ;
        String str7 = c34l.LIZJ;
        boolean LJFF = c34l.LJFF();
        int size = serviceList.size();
        C85323Wm LIZ = C772831o.LIZ();
        C1HQ LIZ2 = C77800Ug8.LIZ(LIZ, "eventSender");
        LIZ2.put("is_casting", String.valueOf(LJFF));
        if (str7 == null) {
            str7 = "";
        }
        LIZ2.put("enter_from", str7);
        LIZ2.put("error_name", str2);
        LIZ2.put("device_num", String.valueOf(size));
        if (l == null || (str4 = l.toString()) == null) {
            str4 = "";
        }
        LIZ2.put("duration", str4);
        LIZ2.put("result", str);
        if (str3 == null) {
            str3 = "";
        }
        LIZ2.put("group_id", str3);
        if (str6 != null) {
            str5 = str6;
        }
        LIZ2.put("author_id", str5);
        LIZ2.put("is_casting", String.valueOf(LJFF));
        LIZ.LIZIZ("casting_device_search_result_show", LIZ2);
    }
}
