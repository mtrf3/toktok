package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* renamed from: X.5tU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C149285tU extends AbstractC149325tY {
    public final C82622Wbi LJLLL;
    public final WMH LJLLLL;
    public final int LJLLLLLL;
    public final int LJLZ;

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        WMH LJJLIIIJILLIZJL = LJJLIIIJILLIZJL();
        if (C44384HbQ.LJLLLLLL((VideoPublishEditModel) getDiContainer().LJ(VideoPublishEditModel.class, null))) {
            C79234V7u.LIZIZ(LJJLIIIJILLIZJL, this.LJLLLLLL, new C153175zl(getDiContainer()), "EditTitleBarScene");
            C79234V7u.LIZIZ(LJJLIIIJILLIZJL, this.LJLZ, new C60N(getDiContainer()), "EditBottomBarScene");
        } else if (TextUtils.equals(((VideoPublishEditModel) getDiContainer().LJ(VideoPublishEditModel.class, null)).enterFrom, "effect_qr_scan")) {
            LJJLIIIJILLIZJL.add(this.LJLLLLLL, new C143625kM(getDiContainer()), "TTEPEditTitleBarScene");
            LJJLIIIJILLIZJL.add(this.LJLZ, new C145955o7(getDiContainer()), "TTEPEditBottomBarScene");
        } else {
            LJJLIIIJILLIZJL.add(this.LJLLLLLL, new C153175zl(getDiContainer()), "EditTitleBarScene");
            LJJLIIIJILLIZJL.add(this.LJLZ, new C60N(getDiContainer()), "EditBottomBarScene");
        }
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
    public C149285tU(C82622Wbi diContainer, WMH parentScene, int i, int i2) {
        super(diContainer, parentScene);
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(parentScene, "parentScene");
        this.LJLLL = diContainer;
        this.LJLLLL = parentScene;
        this.LJLLLLLL = i;
        this.LJLZ = i2;
    }
}
