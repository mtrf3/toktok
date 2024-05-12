package X;

import android.content.Intent;
import com.ss.android.ugc.cut_ui.MediaItem;
import com.ss.android.ugc.cut_ui.TextItem;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.6on, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C171856on {
    public final ArrayList<MediaItem> LIZ;
    public final ArrayList<MediaItem> LIZIZ;
    public final ArrayList<TextItem> LIZJ;

    public final void LIZ(Intent intent) {
        intent.putParcelableArrayListExtra("arg_data_process_items", this.LIZ);
        ArrayList<MediaItem> arrayList = this.LIZIZ;
        if (arrayList != null) {
            intent.putParcelableArrayListExtra("arg_data_all_items", arrayList);
        }
        ArrayList<TextItem> arrayList2 = this.LIZJ;
        if (arrayList2 != null) {
            intent.putParcelableArrayListExtra("arg_data_text_items", arrayList2);
        }
    }

    public C171856on(ArrayList<MediaItem> processItems, ArrayList<MediaItem> arrayList, ArrayList<TextItem> arrayList2) {
        o.LJIIIZ(processItems, "processItems");
        this.LIZ = processItems;
        this.LIZIZ = arrayList;
        this.LIZJ = arrayList2;
    }

    public /* synthetic */ C171856on(ArrayList arrayList, ArrayList arrayList2, int i) {
        this((ArrayList<MediaItem>) arrayList, (ArrayList<MediaItem>) ((i & 2) != 0 ? null : arrayList2), (ArrayList<TextItem>) null);
    }
}
