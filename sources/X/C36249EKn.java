package X;

import com.google.gson.g;
import com.google.gson.j;
import com.google.gson.m;
import com.ss.android.ugc.aweme.request_combine.common.ServerPortraitCollections;
import com.ss.android.ugc.aweme.requestcombine.IServerPortraitService;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.EKn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36249EKn extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final C36249EKn LJLIL = new C36249EKn();

    public C36249EKn() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        m mVar;
        String str;
        String str2;
        g gVar;
        m mVar2;
        j jVar;
        j jVar2;
        g gVar2;
        g gVar3;
        j LJJIJ;
        j LJJIJ2;
        j LJJIJ3;
        j LJJIJ4;
        try {
            IServerPortraitService LIZJ = ServerPortraitCollections.LIZJ();
            if (LIZJ != null) {
                mVar = LIZJ.LIZ();
            } else {
                mVar = null;
            }
            if (mVar != null && (LJJIJ4 = mVar.LJJIJ("speed_4g_label")) != null) {
                str = LJJIJ4.LJJIFFI();
            } else {
                str = null;
            }
            if (mVar != null && (LJJIJ3 = mVar.LJJIJ("speed_wifi_label")) != null) {
                str2 = LJJIJ3.LJJIFFI();
            } else {
                str2 = null;
            }
            if (mVar != null && (LJJIJ2 = mVar.LJJIJ("speed_4g")) != null) {
                LJJIJ2.LJJIFFI();
            }
            if (mVar != null && (LJJIJ = mVar.LJJIJ("speed_wifi")) != null) {
                LJJIJ.LJJIFFI();
            }
            String str3 = new String();
            EnumC48190Ivi LJ = C48189Ivh.LJ(EF7.LIZIZ());
            o.LJIIIIZZ(LJ, "getNetworkType(AppContex….getApplicationContext())");
            FFL.LJIIIZ().getClass();
            j jVar3 = (j) FFL.LJIJ(true, "player_socket_dynamic_timeout_strategy", 31744, j.class, null);
            if (jVar3 != null) {
                gVar = jVar3.LJIILLIIL();
            } else {
                gVar = null;
            }
            if (gVar != null) {
                Iterator<j> it = gVar.iterator();
                boolean z = false;
                loop0: while (it.hasNext()) {
                    j next = it.next();
                    o.LJIIIIZZ(next, "jsonArray!!");
                    m LJIIZILJ = next.LJIIZILJ();
                    j LJJIJ5 = LJIIZILJ.LJJIJ("condition");
                    if (LJJIJ5 != null) {
                        mVar2 = LJJIJ5.LJIIZILJ();
                    } else {
                        mVar2 = null;
                    }
                    if (mVar2 != null) {
                        jVar = mVar2.LJJIJ("speed_wifi_label");
                    } else {
                        jVar = null;
                    }
                    if (mVar2 != null) {
                        jVar2 = mVar2.LJJIJ("speed_4g_label");
                    } else {
                        jVar2 = null;
                    }
                    if (jVar != null) {
                        gVar2 = jVar.LJIILLIIL();
                    } else {
                        gVar2 = null;
                    }
                    if (gVar2 == null) {
                        gVar2 = new g();
                    }
                    if (jVar2 != null) {
                        gVar3 = jVar2.LJIILLIIL();
                    } else {
                        gVar3 = null;
                    }
                    if (gVar3 == null) {
                        gVar3 = new g();
                    }
                    if (LJ.is4GOrHigher()) {
                        Iterator<j> it2 = gVar3.iterator();
                        while (it2.hasNext()) {
                            j next2 = it2.next();
                            o.LJIIIIZZ(next2, "speed4gLabelArray!!");
                            String LJJIFFI = next2.LJIJ().LJJIFFI();
                            if (LJJIFFI != null && LJJIFFI.equals(str)) {
                                str3 = C34540Dh2.LIZ(LJIIZILJ);
                                z = true;
                            }
                            if (z) {
                                break loop0;
                            }
                        }
                    } else if (LJ.isWifi()) {
                        Iterator<j> it3 = gVar2.iterator();
                        while (it3.hasNext()) {
                            j next3 = it3.next();
                            o.LJIIIIZZ(next3, "speedWifiLabelArray!!");
                            String LJJIFFI2 = next3.LJIJ().LJJIFFI();
                            if (LJJIFFI2 != null && LJJIFFI2.equals(str2)) {
                                str3 = C34540Dh2.LIZ(LJIIZILJ);
                                z = true;
                            }
                            if (z) {
                                break loop0;
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
            return str3;
        } catch (Throwable unused) {
            return null;
        }
    }
}
