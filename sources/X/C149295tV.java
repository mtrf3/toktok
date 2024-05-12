package X;

import android.os.Bundle;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.5tV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C149295tV extends AbstractC149325tY {
    public final C82622Wbi LJLLL;
    public final WMH LJLLLL;
    public final int LJLLLLLL;

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        WMH LJJLIIIJILLIZJL = LJJLIIIJILLIZJL();
        int i = this.LJLLLLLL;
        final C82622Wbi diContainer = getDiContainer();
        LJJLIIIJILLIZJL.add(i, new C153175zl(diContainer) { // from class: X.5vp
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(diContainer);
                o.LJIIIZ(diContainer, "diContainer");
            }

            @Override // X.WM7
            public final void onActivityCreated(Bundle bundle) {
                super.onActivityCreated(bundle);
                if (LLJJ().mIsFromDraft && LLJJ().mOrigin == 0 && LLJJ().creativeModel.forwardEditPublishData == null && C153255zt.LIZ()) {
                    LLJILJIL().setImageResource(R.drawable.b3x);
                } else {
                    LLJILJIL().setImageResource(R.drawable.axo);
                }
            }
        }, "EditTitleBarScene");
    }

    @Override // X.AbstractC149325tY
    public WMH LJJLIIIJILLIZJL() {
        return this.LJLLLL;
    }

    @Override // X.AbstractC149325tY, X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLLL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C149295tV(C82622Wbi diContainer, WMH parentScene, int i) {
        super(diContainer, parentScene);
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(parentScene, "parentScene");
        this.LJLLL = diContainer;
        this.LJLLLL = parentScene;
        this.LJLLLLLL = i;
    }
}
