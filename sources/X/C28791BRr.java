package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.android.livesdk.livesetting.feed.FeedPreloadSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveFeedPreloadSetting;

/* renamed from: X.BRr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28791BRr implements BMN, InterfaceC83317Wmv, WGM, T9V {
    public static final C28791BRr LJLIL = new C28791BRr();

    @Override // X.BMN
    public String D8() {
        return "";
    }

    @Override // X.WGM
    public boolean LIZ(float f) {
        return false;
    }

    @Override // X.T9V
    public void LIZIZ() {
    }

    @Override // X.BMN
    public void Yj() {
    }

    @Override // X.BMN
    public void i7() {
    }

    @Override // X.BMN
    public int Ef() {
        int i = (LiveFeedPreloadSetting.INSTANCE.getValue().feedPreloadStyleTwo - 1) * 2;
        if (i <= 1) {
            int value = FeedPreloadSetting.INSTANCE.getValue();
            if (value <= 1) {
                return 4;
            }
            return value;
        }
        return i;
    }

    @Override // X.InterfaceC83317Wmv
    public String LIZJ() {
        return AnonymousClass629.LIZ("UUID.randomUUID().toString()");
    }

    @Override // X.BMN
    public String url() {
        if (!C38354F3m.LJ(BO2.LIZIZ())) {
            return BO2.LIZIZ();
        }
        return "";
    }

    public static final C60193Njp LIZLLL(View view) {
        if (view == null || !(view instanceof C60193Njp)) {
            return null;
        }
        return (C60193Njp) view;
    }

    public static final C81053Gb LJ(C30897CAr c30897CAr) {
        return new C81053Gb(c30897CAr.LJLIL, c30897CAr.LJLILLLLZI, c30897CAr.LJLJJI);
    }

    public static final void LJFF(C60193Njp c60193Njp, InterfaceC88472Yns interfaceC88472Yns) {
        ViewParent parent = c60193Njp.getParent();
        if (parent != null && (parent instanceof ViewGroup)) {
            interfaceC88472Yns.invoke(parent);
        }
    }
}
