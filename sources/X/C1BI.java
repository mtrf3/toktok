package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1BI, reason: invalid class name */
/* loaded from: classes.dex */
public class C1BI implements C09U {
    public final Messenger LIZ;

    public final IBinder LIZ() {
        return this.LIZ.getBinder();
    }

    public C1BI(Messenger messenger) {
        this.LIZ = messenger;
    }

    public final void LIZIZ(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle, Bundle bundle2) {
        ArrayList<? extends Parcelable> arrayList;
        Bundle bundle3 = new Bundle();
        bundle3.putString("data_media_item_id", str);
        bundle3.putBundle("data_options", bundle);
        bundle3.putBundle("data_notify_children_changed_options", bundle2);
        if (list != null) {
            if (list instanceof ArrayList) {
                arrayList = (ArrayList) list;
            } else {
                arrayList = new ArrayList<>(list);
            }
            bundle3.putParcelableArrayList("data_media_item_list", arrayList);
        }
        Message obtain = Message.obtain();
        obtain.what = 3;
        obtain.arg1 = 2;
        obtain.setData(bundle3);
        this.LIZ.send(obtain);
    }
}
