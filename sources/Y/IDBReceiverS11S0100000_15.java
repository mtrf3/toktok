package Y;

import X.C15100iY;
import X.C16880lQ;
import X.C1DH;
import X.C35532Dx2;
import X.C38413F5t;
import X.C38523F9z;
import X.C48651J7n;
import X.C84735XNj;
import X.C84740XNo;
import X.C84741XNp;
import X.C84742XNq;
import X.C84743XNr;
import X.C84751XNz;
import X.C84763XOl;
import X.C85062XZy;
import X.C85068Xa4;
import X.InterfaceC80020Vaq;
import X.InterfaceC80022Vas;
import X.UC7;
import X.XO0;
import X.XO6;
import X.XOH;
import X.XOX;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.ss.android.ugc.aweme.audiomode.fullepisodev2.notification.BackgroundAudioService;
import com.ss.android.ugc.aweme.feed.background.BackgroundAudioBrowserService;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class IDBReceiverS11S0100000_15 extends BroadcastReceiver {
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
            case 2:
                onReceive$2(this, context, intent);
                return;
            case 3:
                onReceive$3(this, context, intent);
                return;
            default:
                super.onReceive(context, intent);
                return;
        }
    }

    public final void LIZ$2() {
        if (((C84742XNq) this.l0).LJ.LIZJ()) {
            if (C16880lQ.LLLLIIIILLL() == C16880lQ.LLJJJJ().getThread()) {
                ((C84742XNq) this.l0).LIZIZ.LJ(new C84735XNj("PAUSE_FROM_AUDIO_OUTPUT_CHANGED"));
            } else {
                C1DH.LJJIJIIJI(new ARunnableS51S0100000_15((C84742XNq) this.l0, 84));
            }
        }
    }

    public final void LIZ$0(Intent intent) {
        Intent intent2;
        if (intent == null || (intent2 = (Intent) intent.getParcelableExtra("EXTRA_MEDIA_BUTTON_DATA")) == null) {
            return;
        }
        XO0 xo0 = ((BackgroundAudioService) this.l0).LJLJLJ;
        if (xo0 != null) {
            if (xo0.LIZIZ().LIZ) {
                int intExtra = intent2.getIntExtra("EXTRA_KEY_COMMAND_FROM_NOTIFICATION", -1);
                if (intExtra == -1) {
                    UC7.LIZLLL("receive a unknown command: ", intExtra);
                } else if (intExtra != 1 && intExtra != 2) {
                    if (intExtra != 3) {
                        if (intExtra != 4) {
                            if (intExtra != 7) {
                                if (intExtra == 8) {
                                    long LIZJ = xo0.LIZIZ.LIZJ() - 10000;
                                    if (LIZJ <= 0) {
                                        LIZJ = 0;
                                    }
                                    xo0.LIZIZ.LJI(LIZJ);
                                    XOX LIZIZ = xo0.LIZIZ.LIZIZ();
                                    if (LIZIZ.isStopState()) {
                                        XOH.LIZ(xo0.LIZIZ, new C84735XNj("RESUME_FROM_SEEK"), 2);
                                        xo0.LIZIZ.LJ(new C84735XNj("PAUSE_FROM_NOTIFICATION_CLICK"));
                                    } else if (LIZIZ.isErrorState()) {
                                        XOH.LIZ(xo0.LIZIZ, new C84735XNj("RESUME_FROM_SEEK"), 2);
                                    }
                                    xo0.LJ.invoke();
                                    C85062XZy.LJ(1, xo0.LIZLLL);
                                }
                            } else if (!xo0.LIZIZ.LIZIZ().isStopState()) {
                                long LIZJ2 = xo0.LIZIZ.LIZJ() + 10000;
                                xo0.LIZIZ.LJI(LIZJ2);
                                XOX LIZIZ2 = xo0.LIZIZ.LIZIZ();
                                if (LIZIZ2.isPauseState()) {
                                    if (LIZJ2 >= xo0.LIZIZ.LIZLLL()) {
                                        XOH.LIZ(xo0.LIZIZ, new C84735XNj("RESUME_FROM_SEEK"), 2);
                                    }
                                } else if (LIZIZ2.isStopState()) {
                                    XOH.LIZ(xo0.LIZIZ, new C84735XNj("RESUME_FROM_SEEK"), 2);
                                } else if (LIZIZ2.isErrorState()) {
                                    XOH.LIZ(xo0.LIZIZ, new C84735XNj("RESUME_FROM_SEEK"), 2);
                                }
                                xo0.LJ.invoke();
                                C85062XZy.LIZIZ(1, xo0.LIZLLL);
                            }
                        } else {
                            C85068Xa4 c85068Xa4 = xo0.LIZIZ;
                            if (c85068Xa4.LIZIZ().isPlayingState()) {
                                c85068Xa4.LJ(new C84735XNj("PAUSE_FROM_NOTIFICATION_CLICK"));
                                C85062XZy.LJFF((int) xo0.LIZIZ.LIZLLL(), 1, xo0.LIZLLL);
                            } else {
                                XOH.LIZ(c85068Xa4, new C84735XNj("PLAY_FROM_NOTIFICATION_CLICK"), 2);
                                C85062XZy.LIZJ((int) xo0.LIZIZ.LIZLLL(), 1, xo0.LIZLLL);
                            }
                        }
                    } else {
                        InterfaceC80020Vaq interfaceC80020Vaq = xo0.LIZJ;
                        if (interfaceC80020Vaq != null && interfaceC80020Vaq.isAppBackground()) {
                            xo0.LIZJ.pullAppToForeground();
                        }
                    }
                } else {
                    xo0.LIZJ();
                }
            }
            C84742XNq c84742XNq = ((BackgroundAudioService) this.l0).LJLJLLL;
            if (c84742XNq != null) {
                C15100iY.LIZIZ(c84742XNq.LJ, intent2);
                return;
            } else {
                o.LJIJI("xAndroidSessionController");
                throw null;
            }
        }
        o.LJIJI("xNotificationController");
        throw null;
    }

    public final void LIZ$1(Intent intent) {
        Intent intent2;
        if (intent == null || (intent2 = (Intent) intent.getParcelableExtra("EXTRA_MEDIA_BUTTON_DATA")) == null) {
            return;
        }
        C84751XNz c84751XNz = ((BackgroundAudioBrowserService) this.l0).LJLJLLL;
        if (c84751XNz != null) {
            if (c84751XNz.LIZJ().LIZ) {
                int intExtra = intent2.getIntExtra("EXTRA_KEY_COMMAND_FROM_NOTIFICATION", -1);
                if (intExtra == -1) {
                    UC7.LIZLLL("receive a unknown command: ", intExtra);
                } else {
                    switch (intExtra) {
                        case 1:
                        case 2:
                            c84751XNz.LIZLLL();
                            break;
                        case 3:
                            InterfaceC80020Vaq interfaceC80020Vaq = c84751XNz.LJ;
                            if (interfaceC80020Vaq != null && interfaceC80020Vaq.isAppBackground()) {
                                c84751XNz.LJ.pullAppToForeground();
                                break;
                            }
                            break;
                        case 4:
                            InterfaceC80022Vas interfaceC80022Vas = c84751XNz.LIZIZ;
                            if (interfaceC80022Vas.LJ().isPlayingState()) {
                                interfaceC80022Vas.LIZIZ(new C48651J7n("PAUSE_FROM_NOTIFICATION_CLICK"));
                                break;
                            } else {
                                interfaceC80022Vas.LJIIIZ(new C48651J7n("PLAY_FROM_NOTIFICATION_CLICK"));
                                break;
                            }
                        case 5:
                            if (c84751XNz.LIZLLL.LJFF()) {
                                c84751XNz.LIZJ.LJIIL(new C48651J7n("operation_from_media_session_skip_to_next"));
                                break;
                            }
                            break;
                        case 6:
                            if (c84751XNz.LIZLLL.LIZLLL()) {
                                c84751XNz.LIZJ.LJJ(new C48651J7n("operation_from_media_session_skip_to_prev"));
                                break;
                            }
                            break;
                    }
                }
            }
            C84741XNp c84741XNp = ((BackgroundAudioBrowserService) this.l0).LJLL;
            if (c84741XNp != null) {
                C15100iY.LIZIZ(c84741XNp.LJFF, intent2);
                return;
            } else {
                o.LJIJI("xAndroidSessionController");
                throw null;
            }
        }
        o.LJIJI("xNotificationController");
        throw null;
    }

    public final void LIZ$3(Intent intent) {
        Intent intent2;
        InterfaceC80020Vaq interfaceC80020Vaq;
        if (intent != null && (intent2 = (Intent) intent.getParcelableExtra("EXTRA_MEDIA_BUTTON_DATA")) != null) {
            XO6 xo6 = ((C84740XNo) ((AqS165S0100000_15) this.l0).l0).LJLJJL;
            if (xo6 != null && xo6.LIZJ().LIZ) {
                int intExtra = intent2.getIntExtra("command_from_notification", -1);
                if (intExtra == -1) {
                    UC7.LIZLLL("receive a unknown command: ", intExtra);
                } else if (intExtra != 1 && intExtra != 2) {
                    if (intExtra == 3 && (interfaceC80020Vaq = xo6.LJIIJ) != null && interfaceC80020Vaq.isAppBackground()) {
                        xo6.LJIIJ.pullAppToForeground();
                    }
                } else {
                    xo6.LIZLLL();
                }
            }
            C84743XNr c84743XNr = ((C84740XNo) ((AqS165S0100000_15) this.l0).l0).LJLJJLL;
            if (c84743XNr != null) {
                C15100iY.LIZIZ(c84743XNr.LIZ, intent2);
            }
        }
    }

    public IDBReceiverS11S0100000_15(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onReceive$0(IDBReceiverS11S0100000_15 iDBReceiverS11S0100000_15, Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            iDBReceiverS11S0100000_15.LIZ$0(intent);
        } else {
            C38523F9z.LIZ();
            iDBReceiverS11S0100000_15.LIZ$0(intent);
        }
    }

    public static final void onReceive$1(IDBReceiverS11S0100000_15 iDBReceiverS11S0100000_15, Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            iDBReceiverS11S0100000_15.LIZ$1(intent);
        } else {
            C38523F9z.LIZ();
            iDBReceiverS11S0100000_15.LIZ$1(intent);
        }
    }

    public static final void onReceive$2(IDBReceiverS11S0100000_15 iDBReceiverS11S0100000_15, Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            iDBReceiverS11S0100000_15.LIZ$2();
        } else {
            C38523F9z.LIZ();
            iDBReceiverS11S0100000_15.LIZ$2();
        }
    }

    public static final void onReceive$3(IDBReceiverS11S0100000_15 iDBReceiverS11S0100000_15, Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            iDBReceiverS11S0100000_15.LIZ$3(intent);
        } else {
            C38523F9z.LIZ();
            iDBReceiverS11S0100000_15.LIZ$3(intent);
        }
    }
}
