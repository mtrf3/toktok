package X;

import com.bytedance.sysoptimizer.StackLeakChecker;
import com.bytedance.sysoptimizer.StackLeakItem;
import com.ss.android.ugc.aweme.legoImp.task.SysOptimizerTask;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Ek6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37278Ek6 implements StackLeakChecker.StackLeakListener {
    @Override // com.bytedance.sysoptimizer.StackLeakChecker.StackLeakListener
    public final void onLeakReport(ArrayList<StackLeakItem> arrayList) {
        Iterator<StackLeakItem> it = arrayList.iterator();
        while (it.hasNext()) {
            StackLeakItem next = it.next();
            Throwable th = new Throwable(next.getLeakItem());
            th.setStackTrace(new StackTraceElement[]{new StackTraceElement("StackLeakSoName", next.getSoName(), next.getSoName(), next.getLeakCount())});
            SysOptimizerTask.LJIJ("stack_leak_info", "stackleak", "stackleak", "stackleak", "StackLeakChecker Thread", th);
        }
    }
}
