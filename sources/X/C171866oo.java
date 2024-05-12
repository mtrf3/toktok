package X;

import android.content.Intent;
import com.ss.android.ugc.cut_ui.MediaItem;
import com.ss.android.ugc.cut_ui.TextItem;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.6oo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C171866oo {
    public static C171856on LIZ(Intent intent) {
        o.LJIIIZ(intent, "intent");
        ArrayList processItems = intent.getParcelableArrayListExtra("arg_data_process_items");
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("arg_data_all_items");
        ArrayList parcelableArrayListExtra2 = intent.getParcelableArrayListExtra("arg_data_text_items");
        if (processItems == null || processItems.isEmpty()) {
            return null;
        }
        o.LJIIIIZZ(processItems, "processItems");
        return new C171856on((ArrayList<MediaItem>) processItems, (ArrayList<MediaItem>) parcelableArrayListExtra, (ArrayList<TextItem>) parcelableArrayListExtra2);
    }
}
