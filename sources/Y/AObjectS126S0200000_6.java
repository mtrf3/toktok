package Y;

import X.C0RN;
import X.C36089EEj;
import X.C36093EEn;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.InterfaceC65784Pro;
import android.content.Context;
import com.ss.android.ugc.aweme.video.VideoBitRateABManager;
import java.util.List;

/* loaded from: classes7.dex */
public class AObjectS126S0200000_6 implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS126S0200000_6 aObjectS126S0200000_6) {
        VideoBitRateABManager videoBitRateABManager = (VideoBitRateABManager) aObjectS126S0200000_6.l0;
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) aObjectS126S0200000_6.l1;
        videoBitRateABManager.getClass();
        C36093EEn.LIZ.getClass();
        C36089EEj LJIIIZ = C36093EEn.LJIIIZ();
        LJIIIZ.LIZIZ(new EE1() { // from class: com.ss.android.ugc.aweme.video.VideoBitRateABManager.1
            @Override // X.EEY
            public final String key() {
                return "VideoBitRateABManager$1";
            }

            @Override // X.EEY
            public final /* synthetic */ boolean meetTrigger() {
                return true;
            }

            @Override // X.EEY
            public final /* synthetic */ String prefix() {
                return "task_";
            }

            @Override // X.EE1
            public final /* synthetic */ boolean serialExecute() {
                return false;
            }

            @Override // X.EEY
            public final /* synthetic */ int targetProcess() {
                return C0RN.LIZ();
            }

            @Override // X.EEY
            public final /* synthetic */ List triggerOtherLegoComponents() {
                return null;
            }

            @Override // X.EEY
            public final /* synthetic */ EnumC36103EEx triggerType() {
                return C0RN.LIZIZ(this);
            }

            @Override // X.EEY
            public final EnumC36092EEm scenesType() {
                return EnumC36092EEm.DEFAULT;
            }

            @Override // X.EE1
            public final EFK type() {
                return EFK.BOOT_FINISH;
            }

            public AnonymousClass1() {
            }

            @Override // X.EEY
            public final void run(Context context) {
                InterfaceC65784Pro.this.invoke();
            }
        }, true);
        LJIIIZ.LIZJ();
        return null;
    }

    public static final Object invoke$1(AObjectS126S0200000_6 aObjectS126S0200000_6) {
        ((List) aObjectS126S0200000_6.l0).add((EE1) aObjectS126S0200000_6.l1);
        return null;
    }

    public AObjectS126S0200000_6(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
