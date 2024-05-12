package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import com.ss.android.ugc.tiktok.tpsc.TPSCPageBuildConfigs;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.SKb, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71909SKb {
    public static InterfaceC71947SLn LIZIZ;
    public static SKK LIZJ;
    public static final C71909SKb LIZ = new C71909SKb();
    public static final java.util.Map<String, InterfaceC65784Pro<TPSCPageBuildConfigs>> LIZLLL = new LinkedHashMap();

    public static InterfaceC71947SLn LIZJ() {
        InterfaceC71947SLn interfaceC71947SLn = LIZIZ;
        if (interfaceC71947SLn != null) {
            return interfaceC71947SLn;
        }
        throw new C72061SPx("TPSCConfigs Not initialized");
    }

    public static SKK LIZLLL() {
        SKK skk = LIZJ;
        if (skk != null) {
            return skk;
        }
        throw new C72061SPx("Not initialized");
    }

    public static void LIZ(String str, InterfaceC65784Pro configCreator) {
        o.LJIIIZ(configCreator, "configCreator");
        LIZLLL.put(str, configCreator);
    }

    public static List LIZIZ(Context context, ViewModelStoreOwner viewModelStoreOwner, LifecycleOwner lifecycleOwner, TPSCPageBuildConfigs configs, SKL skl) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(configs, "configs");
        return SHI.LIZ(context, viewModelStoreOwner, lifecycleOwner, configs.contentConfigs, skl);
    }
}
