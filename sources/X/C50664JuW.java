package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.JuW, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50664JuW extends C8BS<C50663JuV> {
    public final Aweme LJLIL;

    @Override // X.C8BS
    public final boolean checkParams(Object... params) {
        o.LJIIIZ(params, "params");
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T, X.JuV] */
    public C50664JuW(Aweme aweme) {
        this.LJLIL = aweme;
        this.mData = new C50663JuV();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C8BS
    public final boolean sendRequest(Object... params) {
        o.LJIIIZ(params, "params");
        ((ArrayList) ((C50663JuV) this.mData).LIZ).add(this.LJLIL);
        List<C8BT> list = this.mNotifyListeners;
        if (list != null) {
            Iterator<C8BT> it = list.iterator();
            while (it.hasNext()) {
                it.next().onSuccess();
            }
            return false;
        }
        return false;
    }
}
