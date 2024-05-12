package Y;

import X.C15100iY;
import X.C16880lQ;
import X.C1DH;
import X.C35532Dx2;
import X.C38413F5t;
import X.C38523F9z;
import X.C84763XOl;
import X.C91287ZsB;
import X.C91299ZsN;
import X.C91437Zub;
import X.C91443Zuh;
import X.C91483ZvL;
import X.C91502Zve;
import X.C91605ZxJ;
import X.InterfaceC91227ZrD;
import X.InterfaceC91459Zux;
import X.X1D;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.ss.android.ugc.aweme.feed.earphone.IEarphonePlayerControlService;
import com.ss.android.ugc.feed.platform.panel.earphone.EarphonePlayerControl;
import java.util.ArrayList;

/* loaded from: classes22.dex */
public class IDBReceiverS12S0100000_29 extends BroadcastReceiver {
    public final int $t;
    public Object l0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.$t) {
            case 0:
                onReceive$0(this, context, intent);
                return;
            case 1:
                onReceive$1(this, context, intent);
                return;
            default:
                super.onReceive(context, intent);
                return;
        }
    }

    public final void LIZ$1() {
        if (((C91443Zuh) this.l0).LIZLLL.LIZJ()) {
            if (C16880lQ.LLLLIIIILLL() == C16880lQ.LLJJJJ().getThread()) {
                IEarphonePlayerControlService LJII = EarphonePlayerControl.LJII();
                if (LJII.LIZIZ()) {
                    LJII.LJ("music", true);
                }
                ((C91443Zuh) this.l0).LIZIZ.LJIL(new C91299ZsN("PAUSE_FROM_AUDIO_OUTPUT_CHANGED"));
                return;
            }
            C1DH.LJJIJIIJI(new IDRunnableS88S0100000_29((C91443Zuh) this.l0, 21));
        }
    }

    public final void LIZ$0(Intent intent) {
        Intent intent2;
        if (intent == null || (intent2 = (Intent) intent.getParcelableExtra("EXTRA_MEDIA_BUTTON_DATA")) == null) {
            return;
        }
        C91437Zub c91437Zub = ((C91502Zve) this.l0).LJLJJLL;
        if (c91437Zub != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("notification, handleReceivedNotificationCommand isActive = ");
            LIZ.append(c91437Zub.LJII);
            X1D.LIZIZ(LIZ);
            if (c91437Zub.LJII && c91437Zub.LJFF.LJ == intent2.getIntExtra("EXTRA_KEY_FACTORY_ID", -1)) {
                InterfaceC91459Zux interfaceC91459Zux = null;
                switch (intent2.getIntExtra("EXTRA_KEY_COMMAND_FROM_NOTIFICATION", -1)) {
                    case 1:
                    case 2:
                        c91437Zub.LJ();
                        break;
                    case 3:
                        InterfaceC91227ZrD interfaceC91227ZrD = c91437Zub.LIZJ;
                        if (interfaceC91227ZrD != null && interfaceC91227ZrD.LIZ()) {
                            c91437Zub.LIZJ.pullAppToForeground();
                            break;
                        }
                        break;
                    case 4:
                        C91605ZxJ c91605ZxJ = c91437Zub.LIZLLL;
                        if (c91605ZxJ.LJIJI().isPlayingState()) {
                            c91605ZxJ.LJIL(new C91299ZsN("PAUSE_FROM_NOTIFICATION_CLICK"));
                            break;
                        } else {
                            C91287ZsB.LIZ(c91605ZxJ, new C91299ZsN("PLAY_FROM_NOTIFICATION_CLICK"), 2);
                            break;
                        }
                    case 5:
                        if (c91437Zub.LIZLLL.LJFF()) {
                            InterfaceC91459Zux interfaceC91459Zux2 = c91437Zub.LIZLLL.LJLJJI.LJLILLLLZI.get(C91483ZvL.class);
                            if (interfaceC91459Zux2 instanceof C91483ZvL) {
                                interfaceC91459Zux = interfaceC91459Zux2;
                            }
                            C91483ZvL c91483ZvL = (C91483ZvL) interfaceC91459Zux;
                            if (c91483ZvL != null) {
                                c91483ZvL.LJIJJ(new C91299ZsN("operation_from_notification_skip_to_next"));
                                break;
                            }
                        }
                        break;
                    case 6:
                        if (c91437Zub.LIZLLL.LJIIIIZZ() != null) {
                            InterfaceC91459Zux interfaceC91459Zux3 = c91437Zub.LIZLLL.LJLJJI.LJLILLLLZI.get(C91483ZvL.class);
                            if (interfaceC91459Zux3 instanceof C91483ZvL) {
                                interfaceC91459Zux = interfaceC91459Zux3;
                            }
                            C91483ZvL c91483ZvL2 = (C91483ZvL) interfaceC91459Zux;
                            if (c91483ZvL2 != null) {
                                c91483ZvL2.LJIJJLI(new C91299ZsN("operation_from_notification_skip_to_prev"));
                                break;
                            }
                        }
                        break;
                }
            }
        }
        C91443Zuh c91443Zuh = ((C91502Zve) this.l0).LJLJL;
        if (c91443Zuh == null) {
            return;
        }
        C15100iY.LIZIZ(c91443Zuh.LIZLLL, intent2);
    }

    public IDBReceiverS12S0100000_29(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onReceive$0(IDBReceiverS12S0100000_29 iDBReceiverS12S0100000_29, Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            iDBReceiverS12S0100000_29.LIZ$0(intent);
        } else {
            C38523F9z.LIZ();
            iDBReceiverS12S0100000_29.LIZ$0(intent);
        }
    }

    public static final void onReceive$1(IDBReceiverS12S0100000_29 iDBReceiverS12S0100000_29, Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            iDBReceiverS12S0100000_29.LIZ$1();
        } else {
            C38523F9z.LIZ();
            iDBReceiverS12S0100000_29.LIZ$1();
        }
    }
}
