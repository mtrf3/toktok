package X;

import android.content.Context;
import android.os.Parcelable;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import com.ss.android.ugc.tiktok.tpsc.settings.account.DisclosureAdapterConfigs;
import com.ss.android.ugc.tiktok.tpsc.settings.account.GroupTitleAdapterConfigs;
import com.ss.android.ugc.tiktok.tpsc.settings.account.PrivacySettingsAdapterConfigs;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.batchdelete.BatchDeleteAdapterConfigs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SHI {
    public static final java.util.Map<Class<?>, SHH> LIZ = new LinkedHashMap();
    public static final java.util.Map<Class<?>, SHH> LIZIZ = C113554cx.LJJL(new OSZ(PrivacySettingsAdapterConfigs.class, C72000SNo.LIZ), new OSZ(BatchDeleteAdapterConfigs.class, SHL.LIZ), new OSZ(GroupTitleAdapterConfigs.class, SHJ.LIZ), new OSZ(DisclosureAdapterConfigs.class, SHE.LIZ));

    public static List LIZ(Context context, ViewModelStoreOwner viewModelStoreOwner, LifecycleOwner lifecycleOwner, List contentConfigs, SKL skl) {
        SHK shk;
        List<SLJ> LIZ2;
        SHG shg;
        SLJ LIZ3;
        o.LJIIIZ(viewModelStoreOwner, "viewModelStoreOwner");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(contentConfigs, "contentConfigs");
        ArrayList arrayList = new ArrayList();
        Iterator it = contentConfigs.iterator();
        while (it.hasNext()) {
            Parcelable parcelable = (Parcelable) it.next();
            Class<?> cls = parcelable.getClass();
            SHH shh = (SHH) ((LinkedHashMap) LIZ).get(cls);
            if (shh == null) {
                shh = LIZIZ.get(cls);
            }
            if ((shh instanceof SHG) && (shg = (SHG) shh) != null && (LIZ3 = shg.LIZ(context, viewModelStoreOwner, lifecycleOwner, parcelable, skl)) != null) {
                arrayList.add(LIZ3);
            }
            if ((shh instanceof SHK) && (shk = (SHK) shh) != null && (LIZ2 = shk.LIZ(context, viewModelStoreOwner, lifecycleOwner, parcelable, skl)) != null) {
                arrayList.addAll(LIZ2);
            }
        }
        return arrayList;
    }
}
