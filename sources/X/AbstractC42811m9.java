package X;

import Y.IDObserverS225S0100000;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.dialogoeventbserver.LiveDialogStatusEventObserverManager;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.ies.sdk.widgets.ElementSpecImpl;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.1m9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC42811m9 extends ElementSpecImpl {
    public final C1O4 LJLIL;
    public boolean LJLILLLLZI;
    public int LJLJI;
    public boolean LJLJJI;

    public final int LIZ() {
        int height = (int) ((1 - this.LJLIL.LJII) * r1.getContainer().getHeight());
        C1O4 c1o4 = this.LJLIL;
        return (height - c1o4.LJIIIIZZ) - (c1o4.LIZLLL * 2);
    }

    public abstract void LIZIZ(C006900z c006900z);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC42811m9(int i, C1O4 layeredElementContext) {
        super(i);
        MutableLiveData<C006900z> mutableLiveData;
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
        this.LJLIL = layeredElementContext;
        LiveDialogStatusEventObserverManager liveDialogStatusEventObserverManager = (LiveDialogStatusEventObserverManager) C221108m2.LIZIZ(new IDqS420S0100000(this, LiveTryModeCountDownThresholdSetting.DEFAULT)).getValue();
        if (liveDialogStatusEventObserverManager != null && (mutableLiveData = liveDialogStatusEventObserverManager.LJLJI) != null) {
            mutableLiveData.observe(layeredElementContext.LIZ.LJLIL, new IDObserverS225S0100000(this, 12));
        }
    }
}
