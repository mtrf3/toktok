package X;

import com.bytedance.poplayer.core.PopupManager;
import java.util.HashMap;

/* renamed from: X.M8c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC56310M8c implements Runnable {
    public final /* synthetic */ C56309M8b LJLIL;
    public final /* synthetic */ OSZ<Integer, String> LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ EnumC56314M8g LJLJJI;
    public final /* synthetic */ String LJLJJL;

    public RunnableC56310M8c(C56309M8b c56309M8b, EnumC56314M8g enumC56314M8g, String str, String str2, OSZ osz) {
        this.LJLIL = c56309M8b;
        this.LJLILLLLZI = osz;
        this.LJLJI = str;
        this.LJLJJI = enumC56314M8g;
        this.LJLJJL = str2;
    }

    public final void LIZ() {
        InterfaceC88471Ynr<String, HashMap<String, String>, C76800UCe> interfaceC88471Ynr = PopupManager.LIZLLL().LJFF;
        if (interfaceC88471Ynr != null) {
            C56309M8b c56309M8b = this.LJLIL;
            OSZ<Integer, String> osz = this.LJLILLLLZI;
            String str = this.LJLJI;
            EnumC56314M8g enumC56314M8g = this.LJLJJI;
            String str2 = this.LJLJJL;
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("task_id", c56309M8b.LJLILLLLZI);
            InterfaceC55642Lsc interfaceC55642Lsc = (InterfaceC55642Lsc) c56309M8b.LJLJJLL.getClass().getAnnotation(InterfaceC55642Lsc.class);
            if (interfaceC55642Lsc != null) {
                hashMap.put("popup_key", interfaceC55642Lsc.value());
            }
            if (osz != null) {
                hashMap.put("reason_code", String.valueOf(osz.getFirst().intValue()));
                hashMap.put("reason_msg", osz.getSecond());
            }
            hashMap.put("scene_id", str);
            hashMap.put("fail_code", String.valueOf(enumC56314M8g.getFailCode()));
            hashMap.put("reason", str2);
            interfaceC88471Ynr.invoke("pop_show_failed", hashMap);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
