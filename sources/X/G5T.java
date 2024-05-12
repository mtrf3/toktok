package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* loaded from: classes8.dex */
public final /* synthetic */ class G5T implements InterfaceC88471Ynr {
    public final /* synthetic */ int LJLIL;

    public /* synthetic */ G5T(int i) {
        this.LJLIL = i;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Object obj, Object obj2) {
        switch (this.LJLIL) {
            case 0:
                return Boolean.valueOf(TextUtils.equals(((Aweme) obj).getAid(), ((Aweme) obj2).getAid()));
            default:
                return null;
        }
    }
}
