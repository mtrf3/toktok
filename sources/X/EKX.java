package X;

import android.content.SharedPreferences;
import com.ss.android.ugc.aweme.AutobackupService;

/* loaded from: classes7.dex */
public final class EKX extends AbstractC65781Prl implements InterfaceC65784Pro<SharedPreferences> {
    public static final EKX LJLIL = new EKX();

    public EKX() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final SharedPreferences invoke() {
        return AutobackupService.LIZJ().LIZIZ();
    }
}
