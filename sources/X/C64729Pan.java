package X;

import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import defpackage.a1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.Pan, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64729Pan extends RunnableC39007FSp {
    public final /* synthetic */ EnumC64748Pb6 LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;
    public final /* synthetic */ C64734Pas LJLJL;

    public final void LIZJ() {
        int i;
        String str;
        List list;
        C64734Pas c64734Pas = this.LJLJL;
        EnumC64748Pb6 enumC64748Pb6 = this.LJLJJL;
        boolean z = this.LJLJJLL;
        c64734Pas.getClass();
        Logger.debug();
        try {
            if (C2NU.LIZ.LIZIZ()) {
                c64734Pas.LJIIZILJ();
                if (c64734Pas.LJ()) {
                    c64734Pas.LJLJI.set(false);
                    return;
                }
                if (z) {
                    C64734Pas.LJIIIIZZ();
                    if (C64734Pas.LJIIIIZZ().length >= 1) {
                        String str2 = C64734Pas.LJIIIIZZ()[0];
                        if (!TextUtils.isEmpty(str2)) {
                            String LJ = a1.LJ("https://", str2, "/get_domains/v5/");
                            InterfaceC64715PaZ interfaceC64715PaZ = C64735Pat.LJI;
                            if (interfaceC64715PaZ != null) {
                                str = interfaceC64715PaZ.LIZLLL(LJ);
                            } else {
                                str = LJ;
                            }
                            if (!LJ.equals(str)) {
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                try {
                                    EZX.LIZLLL(str, linkedHashMap);
                                    if (linkedHashMap.containsKey("device_id") && (list = (List) linkedHashMap.get("device_id")) != null) {
                                        Iterator it = list.iterator();
                                        while (it.hasNext()) {
                                            if (!((String) it.next()).equals(CardStruct.IStatusCode.DEFAULT)) {
                                            }
                                        }
                                    }
                                } catch (Exception unused) {
                                }
                            }
                        }
                    }
                    Logger.debug();
                    c64734Pas.LLI.sendEmptyMessageDelayed(104, 5000L);
                    c64734Pas.LJLJI.set(false);
                    return;
                }
                if (C64728Pam.LJFF().LJ(c64734Pas.LJLJJL, true, enumC64748Pb6, c64734Pas.LLFFF) || C64728Pam.LJFF().LJ(c64734Pas.LJLJJL, false, EnumC64748Pb6.PORTRETRY, c64734Pas.LLFFF)) {
                    i = 101;
                } else {
                    i = 102;
                }
                c64734Pas.LLI.sendEmptyMessage(i);
                c64734Pas.LLI.removeMessages(103);
                c64734Pas.LLI.sendEmptyMessageDelayed(103, c64734Pas.LLFII.get() * 1000);
            }
        } catch (Exception unused2) {
        }
    }

    @Override // X.RunnableC39007FSp, java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZJ();
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C64729Pan(C64734Pas c64734Pas, EnumC64748Pb6 enumC64748Pb6, boolean z) {
        super((Object) null);
        this.LJLJL = c64734Pas;
        this.LJLJJL = enumC64748Pb6;
        this.LJLJJLL = z;
    }
}
