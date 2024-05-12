package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* renamed from: X.Bu4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30252Bu4 {
    public static final /* synthetic */ int LJ = 0;
    public final Context LIZ;
    public final LifecycleOwner LIZIZ;
    public final DataChannel LIZJ;
    public final EnumC30259BuB LIZLLL;

    public C30252Bu4(Context context, LifecycleOwner lifecycleOwner, DataChannel dataChannel, EnumC30259BuB theme) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(dataChannel, "dataChannel");
        o.LJIIIZ(theme, "theme");
        this.LIZ = context;
        this.LIZIZ = lifecycleOwner;
        this.LIZJ = dataChannel;
        this.LIZLLL = theme;
    }
}
