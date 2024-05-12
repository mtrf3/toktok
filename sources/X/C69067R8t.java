package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.R8t, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C69067R8t<T> implements InterfaceC73518StG {
    public final /* synthetic */ java.util.Map<String, String> LIZ;
    public final /* synthetic */ InterfaceC69056R8i LIZIZ;
    public final /* synthetic */ Fragment LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ String LJ;
    public final /* synthetic */ String LJFF;
    public final /* synthetic */ String LJI;

    public C69067R8t(Fragment fragment, InterfaceC69056R8i interfaceC69056R8i, String str, String str2, String str3, String str4, java.util.Map map) {
        this.LIZ = map;
        this.LIZIZ = interfaceC69056R8i;
        this.LIZJ = fragment;
        this.LIZLLL = str;
        this.LJ = str2;
        this.LJFF = str3;
        this.LJI = str4;
    }

    @Override // X.InterfaceC73518StG
    public final void LIZ(C73516StE c73516StE) {
        String str;
        C69065R8r c69065R8r = new C69065R8r(this.LIZIZ, c73516StE);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        RA4.Companion.getClass();
        C69093R9t.LJJIIJ(RA4.ruleStrategies$delegate.getValue(), linkedHashMap);
        java.util.Map<String, String> map = this.LIZ;
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        this.LIZIZ.bi(c69065R8r);
        Context context = this.LIZJ.getContext();
        if (context != null) {
            String platform = this.LIZLLL;
            String pass = this.LJ;
            String conditionalLoginTicket = this.LJFF;
            String ticket = this.LJI;
            o.LJIIIZ(platform, "platform");
            o.LJIIIZ(pass, "pass");
            o.LJIIIZ(conditionalLoginTicket, "conditionalLoginTicket");
            o.LJIIIZ(ticket, "ticket");
            C69069R8v c69069R8v = new C69069R8v(pass, conditionalLoginTicket, ticket);
            QQN qqn = new QQN();
            if (o.LJ(platform, "email")) {
                str = "/passport/password/forced_reset_by_email_ticket/";
            } else {
                str = "/passport/password/forced_reset_by_mobile_ticket/";
            }
            qqn.LIZ = str;
            boolean z = !o.LJ(platform, "email");
            HashMap hashMap = new HashMap();
            hashMap.put("conditional_login_ticket", C38354F3m.LIZIZ(conditionalLoginTicket));
            hashMap.put("password", C38354F3m.LIZIZ(pass));
            if (z) {
                ticket = C38354F3m.LIZIZ(ticket);
            }
            hashMap.put("ticket", ticket);
            hashMap.put("mix_mode", "1");
            hashMap.putAll(linkedHashMap);
            qqn.LIZLLL(hashMap);
            C69066R8s c69066R8s = new C69066R8s(context, qqn.LJFF(), c69069R8v, c69065R8r);
            c69066R8s.LJIIIIZZ = !o.LJ(platform, "email");
            c69066R8s.LJIIIZ();
        }
    }
}
