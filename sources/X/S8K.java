package X;

import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.core.UIAssem;
import com.zhiliaoapp.musically.R;

/* loaded from: classes13.dex */
public final class S8K extends AbstractC65781Prl implements InterfaceC88471Ynr<UIAssem, String, C76800UCe> {
    public static final S8K LJLIL = new S8K();

    public S8K() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(UIAssem uIAssem, String str) {
        View view;
        String str2 = str;
        View LIZJ = C012403c.LIZJ(uIAssem, "$this$selectSubscribe", str2, "it");
        if (LIZJ != null) {
            view = LIZJ.findViewById(R.id.lvz);
        } else {
            view = null;
        }
        ((TextView) view).setText(str2);
        return C76800UCe.LIZ;
    }
}