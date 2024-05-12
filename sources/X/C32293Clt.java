package X;

import android.content.Context;
import com.bytedance.android.livesdk.gift.base.debug.event.UpdateTrayMessageSizeEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.Clt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32293Clt implements CML {
    public C32293Clt(Context context, DataChannel dataChannel) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(dataChannel, "dataChannel");
        dataChannel.mv0(UpdateTrayMessageSizeEvent.class, this, new AqS171S0100000_5(this, 791));
    }
}
