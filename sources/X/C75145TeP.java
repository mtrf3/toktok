package X;

import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.voicechat.main.common.assem.VoiceChatMaskAssem;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* renamed from: X.TeP, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75145TeP {
    public final InterfaceC75179Tex LIZ;
    public final Context LIZIZ;
    public final LifecycleOwner LIZJ;
    public ViewGroup LIZLLL;
    public DataChannel LJ;

    public C75145TeP(InterfaceC75179Tex window, Context context, VoiceChatMaskAssem lifecycleOwner) {
        o.LJIIIZ(window, "window");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LIZ = window;
        this.LIZIZ = context;
        this.LIZJ = lifecycleOwner;
    }
}
