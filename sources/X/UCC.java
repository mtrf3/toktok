package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.DslLayout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DslLayoutKt;
import com.bytedance.android.livesdk.comp.api.linkcore.model.FullDsl;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Scene;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicSdkGeckoDslDownloadSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestUseLinkmicAloggerSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostResource;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS12S0202000_13;
import kotlin.jvm.internal.AqS16S1201000_13;
import kotlin.jvm.internal.AqS67S1200000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UCC implements InterfaceC75011TcF {
    public UC5 LIZ = UC5.LOCAL;
    public final ConcurrentHashMap<String, DslLayout> LIZIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, Layout> LIZJ = new ConcurrentHashMap<>();

    public final String LJIIIZ() {
        this.LIZ = UC5.LOCAL;
        InterfaceC06390Mx LIZ = CN1.LIZ(IHostAppContext.class);
        o.LJIIIIZZ(LIZ, "getService(T::class.java)");
        return LJIIJ(new InputStreamReader(((IHostAppContext) LIZ).context().getAssets().open("tiktok_live_link_mic_local/dsl.json")));
    }

    public final void LJII() {
        if (LinkMicSdkGeckoDslDownloadSetting.getValue() && this.LIZ == UC5.LOCAL) {
            LJ(null);
        }
    }

    @Override // X.InterfaceC75011TcF
    public final void init() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("tryToUpdateGecko ");
        LIZ.append(C16880lQ.LLLLIIIILLL().getName());
        C0NB.LJIIIZ("LiveDslManagerV2", X1D.LIZIZ(LIZ));
        InterfaceC06390Mx LIZ2 = CN1.LIZ(IHostResource.class);
        o.LJIIIIZZ(LIZ2, "getService(T::class.java)");
        ((IHostResource) LIZ2).FN(new UCF(), "tiktok_live_link_mic");
    }

    @Override // X.InterfaceC75011TcF
    public final UC5 LIZLLL() {
        return this.LIZ;
    }

    public static String LJIIIIZZ(int i) {
        if (MultiGuestUseLinkmicAloggerSetting.INSTANCE.isEnable()) {
            StackTraceElement LJ = C32014ChO.LJ();
            StringBuilder LIZ = X1D.LIZ();
            return C77800Ug8.LIZLLL(U44.LAYOUT, LIZ, "_LiveDslManagerV2_", LJ, LIZ);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        return C17M.LIZ(U44.LAYOUT, LIZ2, "_LiveDslManagerV2_", i, LIZ2);
    }

    public static String LJIIJ(InputStreamReader inputStreamReader) {
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        while (true) {
            try {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        sb.append(readLine);
                    } else {
                        bufferedReader.close();
                        return sb.toString();
                    }
                } catch (IOException e) {
                    U8K.LIZLLL(false, 10001, e.toString());
                    C0K2.LIZ("LinkMic DSL IO exception occurs.", e);
                    bufferedReader.close();
                    return null;
                }
            } catch (Throwable th) {
                bufferedReader.close();
                throw th;
            }
        }
    }

    @Override // X.InterfaceC75011TcF
    public final String LIZJ(String layoutId) {
        o.LJIIIZ(layoutId, "layoutId");
        Iterator LIZLLL = C47135Ieh.LIZLLL(this.LIZIZ, "cache.values");
        String str = null;
        while (LIZLLL.hasNext()) {
            DslLayout dslLayout = (DslLayout) LIZLLL.next();
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
        C31811Ce7.LJ(LIZ, str2, LIZ, "LiveDslManagerV2");
        return str2;
    }

    public final XKQ LJ(InterfaceC65784Pro interfaceC65784Pro) {
        return XKX.LIZLLL(C48841JEv.LIZIZ(), C78613UtF.LIZJ, null, new UCE(this, interfaceC65784Pro, null), 2);
    }

    public final void LJFF(FullDsl fullDsl) {
        Layout layout;
        for (Scene scene : fullDsl.getScene()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, String> entry : scene.getLayoutId().entrySet()) {
                Iterator<Layout> it = fullDsl.getLayouts().iterator();
                while (true) {
                    if (it.hasNext()) {
                        layout = it.next();
                        if (o.LJ(layout.getLayoutId(), entry.getValue())) {
                            break;
                        }
                    } else {
                        layout = null;
                        break;
                    }
                }
                Layout layout2 = layout;
                if (layout2 != null) {
                    linkedHashMap.put(entry.getKey(), layout2);
                    layout2.setScene(scene.getScene());
                    layout2.setVersion(scene.getVersion());
                    layout2.setBusinessType(entry.getKey());
                }
            }
            this.LIZIZ.put(LJI(scene.getScene(), scene.getVersion()), new DslLayout(scene.getScene(), scene.getVersion(), linkedHashMap));
        }
        for (Layout layout3 : fullDsl.getLayouts()) {
            this.LIZJ.put(layout3.getLayoutId(), layout3);
        }
    }

    @Override // X.InterfaceC75011TcF
    public final boolean LJIILL(String layoutId) {
        o.LJIIIZ(layoutId, "layoutId");
        return this.LIZJ.containsKey(layoutId);
    }

    public static final String LJI(int i, int i2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(i);
        LIZ.append('_');
        LIZ.append(i2);
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC75011TcF
    public final void LIZ(String str, UC6 uc6) {
        FP1.LJFF("query ", str, "LiveDslManagerV2");
        Layout layout = this.LIZJ.get(str);
        if (layout != null) {
            C0NB.LJIIIZ("LiveDslManagerV2", "queryForCheck target cache");
            uc6.LIZ(layout);
            LJII();
            return;
        }
        LJ(new AqS67S1200000_13(str, this, uc6, 1));
    }

    @Override // X.InterfaceC75011TcF
    public final DslLayout LIZIZ(int i, int i2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("query scene=");
        LIZ.append(i);
        LIZ.append(" version=");
        LIZ.append(i2);
        C0NB.LJIIIZ("LiveDslManagerV2", X1D.LIZIZ(LIZ));
        DslLayout dslLayout = this.LIZIZ.get(LJI(i, i2));
        if (dslLayout == null) {
            return DslLayoutKt.getDefaultDsl();
        }
        return dslLayout;
    }

    @Override // X.InterfaceC75011TcF
    public final void LJIIZILJ(int i, String layoutId, UC6 uc6) {
        o.LJIIIZ(layoutId, "layoutId");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("query ");
        LIZ.append(i);
        LIZ.append(' ');
        LIZ.append(layoutId);
        C0NB.LJIIIZ("LiveDslManagerV2", X1D.LIZIZ(LIZ));
        Layout layout = this.LIZJ.get(layoutId);
        if (layout != null) {
            C0NB.LJIIIZ("LiveDslManagerV2", "target cache");
            uc6.LIZ(layout);
            LJII();
            return;
        }
        LJ(new AqS16S1201000_13(i, layoutId, this, uc6, 3));
    }

    @Override // X.InterfaceC75011TcF
    public final void LJJI(int i, int i2, UC4 uc4) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("query scene=");
        LIZ.append(i);
        LIZ.append(" version=");
        LIZ.append(i2);
        C0NB.LJIIIZ("LiveDslManagerV2", X1D.LIZIZ(LIZ));
        DslLayout dslLayout = this.LIZIZ.get(LJI(i, i2));
        if (dslLayout != null) {
            C0NB.LJIIIZ("LiveDslManagerV2", "target cache");
            uc4.LIZ(dslLayout);
            LJII();
            return;
        }
        LJ(new AqS12S0202000_13(i, i2, uc4, this, 0));
    }
}
