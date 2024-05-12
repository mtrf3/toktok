package X;

import com.ss.android.ugc.aweme.setting.serverpush.api.PushSettingsApiManager;
import java.util.concurrent.Callable;

/* renamed from: X.XnK, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class CallableC85890XnK implements Callable {
    public final /* synthetic */ Object[] LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Object[] objArr = this.LJLIL;
        if (objArr.length == 2) {
            return PushSettingsApiManager.LJIIIZ(this.LJLJI, this.LJLILLLLZI);
        }
        if (objArr.length == 3) {
            Object obj = objArr[2];
            if (obj instanceof Integer) {
                return PushSettingsApiManager.LJIIIIZZ(this.LJLJI, ((Integer) obj).intValue(), this.LJLILLLLZI);
            }
        }
        if (objArr.length == 4) {
            PushSettingsApiManager.LJIIIZ(this.LJLJI, this.LJLILLLLZI);
            Object[] objArr2 = this.LJLIL;
            return PushSettingsApiManager.LJIIIZ(((Integer) objArr2[3]).intValue(), (String) objArr2[2]);
        }
        if (objArr.length == 5) {
            PushSettingsApiManager.LJIIIIZZ(this.LJLJI, ((Integer) objArr[4]).intValue(), this.LJLILLLLZI);
            Object[] objArr3 = this.LJLIL;
            return PushSettingsApiManager.LJIIIZ(((Integer) objArr3[3]).intValue(), (String) objArr3[2]);
        }
        return PushSettingsApiManager.LJIIJ(this.LJLJI, this.LJLILLLLZI, (String) objArr[2]);
    }

    public CallableC85890XnK(Object[] objArr, String str, int i) {
        this.LJLIL = objArr;
        this.LJLILLLLZI = str;
        this.LJLJI = i;
    }
}
