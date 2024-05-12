package X;

import com.bytedance.scene.group.GroupRecord;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes15.dex */
public final class WMT {
    public List<GroupRecord> LIZ = new ArrayList();
    public final java.util.Map<WM7, GroupRecord> LIZIZ = new HashMap();
    public final java.util.Map<String, GroupRecord> LIZJ = new HashMap();

    public final GroupRecord LIZ(WM7 wm7) {
        return (GroupRecord) ((HashMap) this.LIZIZ).get(wm7);
    }
}
