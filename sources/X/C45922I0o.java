package X;

import android.content.Context;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.livesdk.wallet.CustomErrorExtra;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.I0o, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45922I0o {
    public final Context LIZ;
    public final Object LIZIZ;
    public final Object LIZJ;

    public final ShortVideoContext LIZ() {
        ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) ((ViewModelProvider) ((C82622Wbi) this.LIZJ).LJ(ViewModelProvider.class, null)).get(ShortVideoContextViewModel.class)).LJLIL;
        o.LJIIIIZZ(shortVideoContext, "viewModel().shortVideoContext");
        return shortVideoContext;
    }

    public /* synthetic */ C45922I0o(ActivityC45651qj activity, WRQ cameraApiComponent, C82622Wbi diContainer) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(cameraApiComponent, "cameraApiComponent");
        o.LJIIIZ(diContainer, "diContainer");
        this.LIZ = activity;
        this.LIZIZ = cameraApiComponent;
        this.LIZJ = diContainer;
    }

    public /* synthetic */ C45922I0o(Context context, CustomErrorExtra customErrorExtra, UI8 ui8) {
        o.LJIIIZ(context, "context");
        this.LIZ = context;
        this.LIZIZ = customErrorExtra;
        this.LIZJ = ui8;
    }
}
