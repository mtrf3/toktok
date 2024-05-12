package X;

import android.content.Context;
import com.bytedance.android.livesdk.livesetting.game.GameLiveMemoryLeakOptSetting;
import com.bytedance.android.livesdk.util.GlobalContext;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Bbo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29120Bbo implements InterfaceC28918BWo {
    @Override // X.InterfaceC28918BWo
    public final boolean LIZ() {
        return true;
    }

    @Override // X.InterfaceC28918BWo
    public final int getErrorCode() {
        return 108;
    }

    @Override // X.InterfaceC28918BWo
    public final Object LIZIZ(BIK bik, AbstractC65782Prm abstractC65782Prm) {
        Context applicationContext;
        Context context = bik.LIZ;
        if (!GameLiveMemoryLeakOptSetting.INSTANCE.getValue()) {
            applicationContext = context;
        } else {
            applicationContext = GlobalContext.getApplicationContext();
        }
        if (C48189Ivh.LJ(applicationContext) == EnumC48190Ivi.MOBILE_2G) {
            C30868C9o.LIZLLL(R.string.sz8, context);
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
