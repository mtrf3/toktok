package X;

import Y.ARunnableS41S0100000_5;
import Y.IDaS216S0100000_5;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.roomfunction.PostponeRequestBatchShareListSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.Box, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29935Box implements InterfaceC12640ea {
    public final Room LIZ;
    public final Fragment LIZIZ;
    public final View LIZJ;
    public final Context LIZLLL;
    public final DataChannel LJ;
    public DialogInterface LJFF;
    public final C29936Boy LJI;

    public final void LIZ() {
        int value = PostponeRequestBatchShareListSetting.INSTANCE.getValue();
        if (value <= 0) {
            this.LJI.LIZ(this.LIZ.getId(), this.LIZIZ, null);
        } else {
            this.LIZJ.postDelayed(new ARunnableS41S0100000_5(this, 240), TimeUnit.SECONDS.toMillis(value));
        }
    }

    public final void LIZIZ() {
        DialogInterface dialogInterface = this.LJFF;
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        IDaS216S0100000_5 iDaS216S0100000_5 = new IDaS216S0100000_5(this, 5);
        C29936Boy c29936Boy = this.LJI;
        if ((!((ArrayList) c29936Boy.LIZ).isEmpty()) || (!((ArrayList) c29936Boy.LIZIZ).isEmpty())) {
            iDaS216S0100000_5.run();
            this.LJI.LIZ(this.LIZ.getId(), this.LIZIZ, null);
        } else {
            this.LJI.LIZ(this.LIZ.getId(), this.LIZIZ, iDaS216S0100000_5);
        }
    }

    public C29935Box(Room mRoom, Fragment fragment, View view, Context context, DataChannel dataChannel) {
        o.LJIIIZ(mRoom, "mRoom");
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(view, "view");
        o.LJIIIZ(dataChannel, "dataChannel");
        this.LIZ = mRoom;
        this.LIZIZ = fragment;
        this.LIZJ = view;
        this.LIZLLL = context;
        this.LJ = dataChannel;
        this.LJI = new C29936Boy();
    }
}
