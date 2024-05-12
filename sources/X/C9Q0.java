package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.offlinemode.ui.sheet.OfflineModeSheetPageFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.9Q0, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9Q0 extends AbstractC65781Prl implements InterfaceC65784Pro<C9Q1> {
    public final /* synthetic */ OfflineModeSheetPageFragment LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9Q0(OfflineModeSheetPageFragment offlineModeSheetPageFragment) {
        super(0);
        this.LJLIL = offlineModeSheetPageFragment;
    }

    @Override // X.InterfaceC65784Pro
    public final C9Q1 invoke() {
        String str;
        Boolean bool;
        C9Q2 c9q2 = C9Q1.Companion;
        Bundle arguments = this.LJLIL.getArguments();
        if (arguments != null) {
            str = arguments.getString("page_name");
        } else {
            str = null;
        }
        Bundle arguments2 = this.LJLIL.getArguments();
        if (arguments2 != null) {
            bool = Boolean.valueOf(arguments2.getBoolean("with_back"));
        } else {
            bool = null;
        }
        c9q2.getClass();
        if (str == null || bool == null) {
            return null;
        }
        for (C9Q1 c9q1 : C9Q1.values()) {
            if (o.LJ(c9q1.getPageName(), str)) {
                c9q1.setWithBack(bool.booleanValue());
                return c9q1;
            }
        }
        return null;
    }
}
