package X;

import com.bytedance.android.livesdk.livesetting.clientai.LiveClientTriggerConfig;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.280, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass280 extends AbstractC65781Prl implements InterfaceC65784Pro<java.util.Map<Integer, ? extends String>> {
    public static final AnonymousClass280 LJLIL = new AnonymousClass280();

    public AnonymousClass280() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final java.util.Map<Integer, ? extends String> invoke() {
        List<String> imEventList = LiveClientTriggerConfig.INSTANCE.imEventList();
        int LJJIIZ = C51029K0z.LJJIIZ(C32I.LJJL(imEventList, 10));
        if (LJJIIZ < 16) {
            LJJIIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(LJJIIZ);
        for (String str : imEventList) {
            Integer num = EnumC31509CYf.SERVICE_WSMETHOD_MAP.get(str);
            if (num == null) {
                num = -1000;
            }
            OSZ osz = new OSZ(num, str);
            linkedHashMap.put(osz.getFirst(), osz.getSecond());
        }
        return linkedHashMap;
    }
}
