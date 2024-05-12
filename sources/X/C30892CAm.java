package X;

import androidx.fragment.app.DialogFragment;
import com.bytedance.android.live.core.widget.BaseDialogFragment;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.spark.schema.model.SparkPopupSchemaParam;
import com.bytedance.lynx.spark.schema.model.SparkSchemaParam;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.CAm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30892CAm {
    public static final /* synthetic */ int LIZJ = 0;
    public final java.util.Map<String, List<BaseDialogFragment>> LIZ = new ConcurrentHashMap();
    public final java.util.Map<String, BaseDialogFragment> LIZIZ = new ConcurrentHashMap();

    public final void LIZ() {
        SparkContext sparkContext;
        InterfaceC40159FpT LJIILL;
        ((ConcurrentHashMap) this.LIZIZ).clear();
        Iterator it = ((ConcurrentHashMap) this.LIZ).entrySet().iterator();
        while (it.hasNext()) {
            for (DialogFragment dialogFragment : (Iterable) ((Map.Entry) it.next()).getValue()) {
                if (dialogFragment.isAdded()) {
                    dialogFragment.dismissAllowingStateLoss();
                }
            }
        }
        ((ConcurrentHashMap) this.LIZ).clear();
        for (Map.Entry<String, WeakReference<SparkContext>> entry : C30874C9u.LIZ.entrySet()) {
            String key = entry.getKey();
            WeakReference<SparkContext> value = entry.getValue();
            SparkSchemaParam sparkSchemaParam = null;
            if (value != null) {
                sparkContext = value.get();
                if (sparkContext != null) {
                    sparkSchemaParam = sparkContext.LJIIZILJ(-1);
                }
            } else {
                sparkContext = null;
            }
            if (sparkSchemaParam instanceof SparkPopupSchemaParam) {
                if (sparkContext != null && (LJIILL = sparkContext.LJIILL()) != null) {
                    LJIILL.close();
                }
                C30874C9u.LIZ.remove(key);
            }
        }
    }

    public final void LIZJ(BaseDialogFragment dialog) {
        o.LJIIIZ(dialog, "dialog");
        ((ConcurrentHashMap) this.LIZIZ).remove(dialog.zk());
        for (Map.Entry entry : ((ConcurrentHashMap) this.LIZ).entrySet()) {
            List list = (List) entry.getValue();
            if (list.contains(dialog)) {
                list.remove(dialog);
                if (list.isEmpty()) {
                    ((ConcurrentHashMap) this.LIZ).remove(entry.getKey());
                }
            }
        }
    }

    public final void LIZIZ(String groupName, BaseDialogFragment dialog) {
        o.LJIIIZ(groupName, "groupName");
        o.LJIIIZ(dialog, "dialog");
        List list = (List) ((ConcurrentHashMap) this.LIZ).get(groupName);
        java.util.Map<String, BaseDialogFragment> map = this.LIZIZ;
        String zk = dialog.zk();
        o.LJIIIIZZ(zk, "dialog.containerId");
        ((ConcurrentHashMap) map).put(zk, dialog);
        if (list == null) {
            list = new ArrayList();
            ((ConcurrentHashMap) this.LIZ).put(groupName, list);
        }
        list.add(dialog);
    }
}
