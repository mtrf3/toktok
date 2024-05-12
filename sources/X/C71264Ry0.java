package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.model.ShortTouchPreviewSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.jvm.internal.o;

/* renamed from: X.Ry0, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71264Ry0 implements UOY {
    public final Room LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final C71885SJd LIZLLL;
    public final /* synthetic */ C71188Rwm LJ;

    @Override // X.UOY
    public final void LIZIZ() {
    }

    @Override // X.UOY
    public final void LLLLZLL() {
    }

    @Override // X.UOY
    public final View LIZJ() {
        return this.LIZLLL;
    }

    @Override // X.UOY
    public final UOV LIZ(ViewGroup viewGroup) {
        int i;
        ViewGroup.MarginLayoutParams LJFF = C27570Aru.LJFF(viewGroup);
        if (LJFF != null) {
            i = LJFF.getMarginStart();
        } else {
            i = 0;
        }
        this.LIZLLL.addAnimatorListener(new C71201Rwz(this, this.LJ, i, viewGroup, new C34K()));
        return new C71282RyI(this);
    }

    public C71264Ry0(C71188Rwm c71188Rwm, Room room, String name, String schema, ShortTouchPreviewSetting shortTouchPreviewSetting) {
        o.LJIIIZ(room, "room");
        o.LJIIIZ(name, "name");
        o.LJIIIZ(schema, "schema");
        this.LJ = c71188Rwm;
        this.LIZ = room;
        this.LIZIZ = name;
        this.LIZJ = schema;
        Context context = c71188Rwm.LJLJJLL;
        N27 n27 = N27.LOTTIE;
        String str = shortTouchPreviewSetting.amountText;
        str = str == null ? "" : str;
        String str2 = shortTouchPreviewSetting.discountText;
        this.LIZLLL = new C71885SJd(context, new C62847OlX(name, 96, 105, n27, new C71266Ry2(str, str2 != null ? str2 : "")));
    }
}
