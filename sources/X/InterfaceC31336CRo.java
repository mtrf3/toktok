package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.CRo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC31336CRo extends InterfaceC2301691o, LifecycleOwner {
    Context getContext();

    String getLogTag();

    DataChannel provideDataChannel();
}
