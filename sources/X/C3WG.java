package X;

import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3WG, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3WG {
    /* JADX WARN: Multi-variable type inference failed */
    public static SharePanelViewModel LIZ(SharePackage sharePackage, InterfaceC83893Qz interfaceC83893Qz, List batchGroups, EnumC84123Rw enumC84123Rw, int i, EnumC84133Rx enumC84133Rx, boolean z, boolean z2, boolean z3, boolean z4, InterfaceC107704Ko interfaceC107704Ko, LifecycleOwner lifecycleOwner, int i2) {
        boolean z5;
        Bundle bundle;
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        InterfaceC107704Ko interfaceC107704Ko2 = interfaceC107704Ko;
        boolean z6 = z4;
        int i3 = i;
        EnumC84123Rw shareWidgetType = enumC84123Rw;
        boolean z7 = z2;
        EnumC84133Rx sortType = enumC84133Rx;
        boolean z8 = z;
        boolean z9 = z3;
        if ((i2 & 8) != 0) {
            shareWidgetType = EnumC84123Rw.NORMAL;
        }
        if ((i2 & 16) != 0) {
            i3 = 15;
        }
        if ((i2 & 32) != 0) {
            sortType = EnumC84133Rx.RECENT_SENT;
        }
        if ((i2 & 64) != 0) {
            z8 = false;
        }
        if ((i2 & 128) != 0) {
            z5 = false;
        } else {
            z5 = true;
        }
        if ((i2 & 256) != 0) {
            z7 = true;
        }
        if ((i2 & 512) != 0) {
            z9 = false;
        }
        if ((i2 & 2048) != 0) {
            z6 = false;
        }
        String str = null;
        str = null;
        if ((i2 & 4096) != 0) {
            interfaceC107704Ko2 = null;
        }
        if ((i2 & FileUtils.BUFFER_SIZE) != 0) {
            lifecycleOwner2 = null;
        }
        o.LJIIIZ(batchGroups, "batchGroups");
        o.LJIIIZ(shareWidgetType, "shareWidgetType");
        o.LJIIIZ(sortType, "sortType");
        C68322mC c68322mC = new C68322mC();
        C68322mC c68322mC2 = new C68322mC();
        if (z8 && ((Boolean) C53119Kt1.LIZIZ.getValue()).booleanValue()) {
            if (sharePackage != null && (bundle = sharePackage.extras) != null) {
                str = bundle.getString("author_id");
            }
            String str2 = "";
            T t = str;
            if (str == null) {
                t = "";
            }
            c68322mC.element = t;
            T t2 = str2;
            if (sharePackage != null) {
                Bundle bundle2 = sharePackage.extras;
                t2 = str2;
                if (bundle2 != null) {
                    String string = bundle2.getString("sec_user_id");
                    t2 = str2;
                    if (string != null) {
                        t2 = string;
                    }
                }
            }
            c68322mC2.element = t2;
        }
        return new SharePanelViewModel(sharePackage, interfaceC83893Qz, batchGroups, (C3R0) C221108m2.LIZIZ(new C3RA(sharePackage, shareWidgetType, sortType, z5, c68322mC2, c68322mC, z7, z9, false, i3)).getValue(), z8, i3, sortType, z6, interfaceC107704Ko2, lifecycleOwner2);
    }
}
