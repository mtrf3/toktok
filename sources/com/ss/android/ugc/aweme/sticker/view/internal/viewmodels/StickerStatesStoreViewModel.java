package com.ss.android.ugc.aweme.sticker.view.internal.viewmodels;

import X.C73366Sqo;
import X.InterfaceC73367Sqp;
import X.InterfaceC73389SrB;
import X.InterfaceC84497XEf;
import androidx.lifecycle.ViewModel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class StickerStatesStoreViewModel extends ViewModel {
    public final Map<String, InterfaceC73367Sqp> LJLIL = new LinkedHashMap();

    public final InterfaceC73367Sqp gv0(InterfaceC73389SrB interfaceC73389SrB, String category, InterfaceC84497XEf interfaceC84497XEf) {
        o.LJIIIZ(category, "category");
        InterfaceC73367Sqp interfaceC73367Sqp = (InterfaceC73367Sqp) ((LinkedHashMap) this.LJLIL).get(category);
        if (interfaceC73367Sqp != null) {
            return interfaceC73367Sqp;
        }
        C73366Sqo c73366Sqo = new C73366Sqo(interfaceC73389SrB, interfaceC84497XEf);
        this.LJLIL.put(category, c73366Sqo);
        return c73366Sqo;
    }

    public static /* synthetic */ InterfaceC73367Sqp hv0(StickerStatesStoreViewModel stickerStatesStoreViewModel, InterfaceC73389SrB interfaceC73389SrB, String str, int i) {
        if ((i & 1) != 0) {
            interfaceC73389SrB = null;
        }
        if ((i & 2) != 0) {
            str = "defaultCategory";
        }
        return stickerStatesStoreViewModel.gv0(interfaceC73389SrB, str, null);
    }
}
