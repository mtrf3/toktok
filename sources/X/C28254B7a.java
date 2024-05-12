package X;

import com.bytedance.android.live.network.response.BaseResponse;
import com.zhiliaoapp.musically.R;

/* renamed from: X.B7a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28254B7a<T> implements InterfaceC64592gB {
    public static final C28254B7a<T> LJLIL = new C28254B7a<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        if (((BaseResponse) obj).statusCode != 0) {
            C30868C9o.LIZJ(R.string.mg2);
        }
    }
}
