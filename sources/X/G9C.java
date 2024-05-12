package X;

import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.shortvideo.ui.PublishDefaultPermissionFragment;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class G9C<T> implements Observer {
    public final /* synthetic */ PublishDefaultPermissionFragment LJLIL;

    public G9C(PublishDefaultPermissionFragment publishDefaultPermissionFragment) {
        this.LJLIL = publishDefaultPermissionFragment;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns;
        C45927I0t c45927I0t = (C45927I0t) obj;
        if (c45927I0t == null) {
            return;
        }
        OSZ osz = (OSZ) c45927I0t.LIZIZ;
        int intValue = ((Number) osz.getFirst()).intValue();
        boolean booleanValue = ((Boolean) osz.getSecond()).booleanValue();
        Iterator it = ((LinkedHashMap) this.LJLIL.LJLJJI).entrySet().iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            int intValue2 = ((Number) entry.getKey()).intValue();
            AI9 accessory = ((AI8) entry.getValue()).getAccessory();
            o.LJII(accessory, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxCellAccessory.Radio");
            AEY aey = (AEY) accessory;
            if (intValue2 == intValue) {
                z = true;
            }
            aey.LJIILIIL(z);
        }
        if (((Boolean) ((OSZ) c45927I0t.LIZIZ).getSecond()).booleanValue()) {
            PublishDefaultPermissionFragment publishDefaultPermissionFragment = this.LJLIL;
            int currentPermission = publishDefaultPermissionFragment.Al().getCurrentPermission();
            int intValue3 = ((Number) ((OSZ) c45927I0t.LIZIZ).getFirst()).intValue();
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_method", publishDefaultPermissionFragment.Al().getEnterMethod());
            c188727au.LJIIIZ("from_status", PublishDefaultPermissionFragment.vl(currentPermission, false));
            c188727au.LJIIIZ("to_status", PublishDefaultPermissionFragment.vl(intValue3, false));
            FMX.LJIIL("change_video_visibility", c188727au.LIZ);
        }
        PublishDefaultPermissionFragment publishDefaultPermissionFragment2 = this.LJLIL;
        publishDefaultPermissionFragment2.LJLJL = intValue;
        if (!booleanValue || (interfaceC88472Yns = publishDefaultPermissionFragment2.LJLILLLLZI) == null) {
            return;
        }
        interfaceC88472Yns.invoke(Integer.valueOf(intValue));
    }
}
