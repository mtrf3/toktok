package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.ufr.contact.ContactUFR;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UPP extends AbstractC65781Prl implements InterfaceC88472Yns<C57391Mfj, C57391Mfj> {
    public final /* synthetic */ ContactUFR LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UPP(ContactUFR contactUFR, boolean z) {
        super(1);
        this.LJLIL = contactUFR;
        this.LJLILLLLZI = z;
    }

    @Override // X.InterfaceC88472Yns
    public final C57391Mfj invoke(C57391Mfj c57391Mfj) {
        C57391Mfj updateState = c57391Mfj;
        o.LJIIIZ(updateState, "$this$updateState");
        java.util.Map map = this.LJLIL.LJLJJL;
        if (map == null) {
            map = new LinkedHashMap();
        }
        Bundle LIZJ = V18.LIZJ(map);
        LIZJ.putBoolean("should_upload", this.LJLIL.LJLJL);
        return C57391Mfj.LIZ(updateState, EnumC58006Mpe.CHECKED, this.LJLILLLLZI, this.LJLIL.LIZLLL(), this.LJLIL.LJ(), LIZJ, 5);
    }
}
