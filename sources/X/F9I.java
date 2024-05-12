package X;

import X.C0RN;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FLE;
import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class F9I<T> implements InterfaceC64592gB {
    public static final F9I<T> LJLIL = new F9I<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        if (!((Boolean) obj).booleanValue() || !FLE.LIZLLL()) {
            return;
        }
        C36093EEn.LIZ.getClass();
        C36089EEj LJIIIZ = C36093EEn.LJIIIZ();
        LJIIIZ.LIZIZ(new EE1() { // from class: com.ss.android.ugc.aweme.commercialize.util.AdUserAgentManager$updateUserAgent$1$1
            @Override // X.EEY
            public final String key() {
                return "AdUserAgentManager$updateUserAgent$1$1";
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
                return EFK.IDLE;
            }

            @Override // X.EEY
            public final void run(Context context) {
                o.LJIIIZ(context, "context");
                FLE.LIZJ().edit().putString("ad_user_agent_sp", (String) FLE.LIZLLL.getValue()).apply();
            }
        }, true);
        LJIIIZ.LIZJ();
    }
}
