package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.DslLayout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DslLayoutKt;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicSdkGeckoDslDownloadSetting;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UCD implements InterfaceC75011TcF {
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C76644U6e.LJLIL);
    public final ConcurrentHashMap<String, DslLayout> LIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, Layout> LIZIZ = new ConcurrentHashMap<>();
    public UC5 LIZJ = UC5.LOCAL;

    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF() {
        /*
            Method dump skipped, instructions count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UCD.LJFF():void");
    }

    @Override // X.InterfaceC75011TcF
    public final void init() {
        C0NB.LJIIIZ("LiveDslManager", "init start");
        U7V.LJIILJJIL(new AqS163S0100000_13(this, 425));
    }

    @Override // X.InterfaceC75011TcF
    public final UC5 LIZLLL() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC75011TcF
    public final String LIZJ(String layoutId) {
        o.LJIIIZ(layoutId, "layoutId");
        Iterator LIZLLL2 = C47135Ieh.LIZLLL(this.LIZ, "cache.values");
        String str = null;
        while (LIZLLL2.hasNext()) {
            DslLayout dslLayout = (DslLayout) LIZLLL2.next();
            dslLayout.getScene();
            Iterator<Map.Entry<String, Layout>> it = dslLayout.getData().entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    Map.Entry<String, Layout> next = it.next();
                    if (o.LJ(next.getValue().getLayoutId(), layoutId) && dslLayout.getScene() == 4) {
                        str = next.getKey();
                        break;
                    }
                }
            }
        }
        StringBuilder LIZ = C06830Op.LIZ("queryDslLayoutName scene:", 4, " layoutId:", layoutId, " name:");
        String str2 = str;
        C31811Ce7.LJ(LIZ, str2, LIZ, "LiveDslManager");
        return str2;
    }

    @Override // X.InterfaceC75011TcF
    public final boolean LJIILL(String layoutId) {
        o.LJIIIZ(layoutId, "layoutId");
        return this.LIZIZ.containsKey(layoutId);
    }

    public static final String LJ(int i, int i2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(i);
        LIZ.append('_');
        LIZ.append(i2);
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC75011TcF
    public final void LIZ(String str, UC6 uc6) {
        FP1.LJFF("queryForCheck ", str, "LiveDslManager");
        if (this.LIZIZ.get(str) == null) {
            C0NB.LJIIIZ("LiveDslManager", "queryForCheck cache is null");
            LJFF();
        } else if (LinkMicSdkGeckoDslDownloadSetting.getValue() && this.LIZJ == UC5.LOCAL) {
            C0NB.LJIIIZ("LiveDslManager", "queryForCheck cache is not null, try to update cache if it is local");
            U7V.LJIILJJIL(new AqS163S0100000_13(this, 427));
        }
        if (this.LIZIZ.get(str) == null) {
            C0NB.LJIIIZ("LiveDslManager", "queryForCheck cache is not null, try to update cache if it is local");
        }
        uc6.LIZ(this.LIZIZ.get(str));
    }

    @Override // X.InterfaceC75011TcF
    public final DslLayout LIZIZ(int i, int i2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("query scene=");
        LIZ.append(i);
        LIZ.append(" version=");
        LIZ.append(i2);
        C0NB.LJIIIZ("LiveDslManager", X1D.LIZIZ(LIZ));
        if (this.LIZ.get(LJ(i, i2)) == null) {
            C0NB.LJIIIZ("LiveDslManager", "query cache is null");
            LJFF();
        } else if (LinkMicSdkGeckoDslDownloadSetting.getValue() && this.LIZJ == UC5.LOCAL) {
            C0NB.LJIIIZ("LiveDslManager", "query cache is not null, try to update cache if it is local");
            U7V.LJIILJJIL(new AqS163S0100000_13(this, 426));
        }
        DslLayout dslLayout = this.LIZ.get(LJ(i, i2));
        if (dslLayout == null) {
            return DslLayoutKt.getDefaultDsl();
        }
        return dslLayout;
    }

    @Override // X.InterfaceC75011TcF
    public final void LJIIZILJ(int i, String layoutId, UC6 uc6) {
        boolean z;
        o.LJIIIZ(layoutId, "layoutId");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("query ");
        LIZ.append(layoutId);
        C0NB.LJIIIZ("LiveDslManager", X1D.LIZIZ(LIZ));
        if (this.LIZIZ.get(layoutId) == null) {
            C0NB.LJIIIZ("LiveDslManager", "query cache is null");
            LJFF();
        } else if (LinkMicSdkGeckoDslDownloadSetting.getValue() && this.LIZJ == UC5.LOCAL) {
            C0NB.LJIIIZ("LiveDslManager", "query cache is not null, try to update cache if it is local");
            U7V.LJIILJJIL(new AqS163S0100000_13(this, 428));
        }
        if (this.LIZIZ.get(layoutId) == null) {
            if (this.LIZJ == UC5.LOCAL) {
                z = true;
            } else {
                z = false;
            }
            U8K.LJ(layoutId, i, z, LinkMicSdkGeckoDslDownloadSetting.getValue());
        }
        uc6.LIZ(this.LIZIZ.get(layoutId));
    }

    @Override // X.InterfaceC75011TcF
    public final void LJJI(int i, int i2, UC4 uc4) {
        uc4.LIZ(LIZIZ(i, i2));
    }
}
