package X;

import com.bytedance.services.slardar.config.IConfigManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PEB implements InterfaceC64103PDv {
    public final java.util.Map<String, Boolean> LJLIL = new ConcurrentHashMap();
    public final java.util.Map<String, Boolean> LJLILLLLZI = new ConcurrentHashMap();
    public final List<String> LJLJI;
    public final List<String> LJLJJI;
    public final List<String> LJLJJL;
    public final List<String> LJLJJLL;
    public final java.util.Map<String, String> LJLJL;
    public volatile JSONObject LJLJLJ;

    @Override // X.InterfaceC64103PDv
    public final void LIZ() {
    }

    public PEB() {
        HashMap hashMap = new HashMap();
        this.LJLJL = hashMap;
        LinkedList linkedList = new LinkedList();
        this.LJLJI = linkedList;
        linkedList.addAll(Arrays.asList("battery", "smooth", "cpu", "disk", "memory", "thread", "fd", "page_load", "page_load_trace", "start", "start_trace", "traffic", "ui"));
        ArrayList arrayList = new ArrayList();
        this.LJLJJI = arrayList;
        C19U.LIZLLL(arrayList, "enable_upload", "drop_enable_upload", "serious_block_enable_upload", "block_enable_upload");
        arrayList.add("slow_method_enable_upload");
        LinkedList linkedList2 = new LinkedList();
        this.LJLJJL = linkedList2;
        linkedList2.add("enable_perf_data_collect");
        LinkedList linkedList3 = new LinkedList();
        this.LJLJJLL = linkedList3;
        linkedList3.add("enable_exception_upload");
        hashMap.put("enable_upload", "fps");
        hashMap.put("drop_enable_upload", "fps_drop");
        hashMap.put("block_enable_upload", "block_monitor");
        hashMap.put("slow_method_enable_upload", "drop_frame_stack");
        hashMap.put("serious_block_enable_upload", "serious_block_monitor");
        ((IConfigManager) C171096nZ.LIZ(IConfigManager.class)).registerConfigListener(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0097 A[SYNTHETIC] */
    @Override // X.InterfaceC64103PDv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(org.json.JSONObject r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PEB.LJ(org.json.JSONObject, boolean):void");
    }
}
