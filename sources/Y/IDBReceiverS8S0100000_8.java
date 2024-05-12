package Y;

import X.C16880lQ;
import X.C2KM;
import X.C35532Dx2;
import X.C38413F5t;
import X.C38523F9z;
import X.C46315IFr;
import X.C47926IrS;
import X.C48189Ivh;
import X.C48305IxZ;
import X.C56509MFt;
import X.C59327NQd;
import X.C60018Nh0;
import X.C84763XOl;
import X.InterfaceC46330IGg;
import X.J8I;
import X.M89;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.discover.ui.DiscoverAndSearchFragment;
import com.ss.android.ugc.aweme.feed.landscape.LandscapeFragmentPanel;
import com.ss.android.ugc.aweme.feed.landscape.component.LandscapeFeedEarphonePlayerControlComponent;
import com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedPlayerAbility;
import com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedViewPagerAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.panel.earphone.EarphonePlayerControl;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public class IDBReceiverS8S0100000_8 extends BroadcastReceiver {
    public final int $t;
    public Object l0;

    public final void LIZ$4(Context context, Intent intent) {
        KeyguardManager keyguardManager;
        if (intent == null) {
            return;
        }
        if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            C60018Nh0.LIZ((C60018Nh0) this.l0, true);
        } else {
            if (!"android.intent.action.USER_PRESENT".equals(intent.getAction()) && (!"android.intent.action.SCREEN_ON".equals(intent.getAction()) || (keyguardManager = (KeyguardManager) C16880lQ.LLILL(context, "keyguard")) == null || keyguardManager.inKeyguardRestrictedInputMode())) {
                return;
            }
            C60018Nh0.LIZ((C60018Nh0) this.l0, false);
        }
    }

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
            case 4:
                onReceive$4(this, context, intent);
                return;
            case 5:
                onReceive$5(this, context, intent);
                return;
            case 6:
                onReceive$6(this, context, intent);
                return;
            case 7:
                onReceive$7(this, context, intent);
                return;
            default:
                super.onReceive(context, intent);
                return;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public IDBReceiverS8S0100000_8(int r3) {
        /*
            r2 = this;
            r2.$t = r3
            switch(r3) {
                case 4: goto Le;
                default: goto L5;
            }
        L5:
            r1 = r2
            X.NQd r0 = X.C59327NQd.LJ
            r1.l0 = r0
        La:
            r1.<init>()
            return
        Le:
            r1 = r2
            X.Nh0 r0 = X.C60018Nh0.LJFF
            r1.l0 = r0
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDBReceiverS8S0100000_8.<init>(int):void");
    }

    public final void LIZ$1(Intent intent) {
        String str;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (o.LJ(str, "android.media.AUDIO_BECOMING_NOISY")) {
            InterfaceC46330IGg interfaceC46330IGg = ((LandscapeFragmentPanel) this.l0).LJZI;
            if (interfaceC46330IGg != null && interfaceC46330IGg.isPlaying()) {
                LandscapeFragmentPanel landscapeFragmentPanel = (LandscapeFragmentPanel) this.l0;
                landscapeFragmentPanel.handlePlay(landscapeFragmentPanel.LJIIJJI());
                C46315IFr.LIZIZ("play", ((LandscapeFragmentPanel) this.l0).getCurrentAweme(), ((LandscapeFragmentPanel) this.l0).getEventType());
                if (((LandscapeFragmentPanel) this.l0).getCurrentAweme() != null) {
                    J8I j8i = new J8I();
                    j8i.LJJLIIIJJIZ = "earphone_disconnected";
                    Aweme currentAweme = ((LandscapeFragmentPanel) this.l0).getCurrentAweme();
                    M89 m89 = ((LandscapeFragmentPanel) this.l0).LJLLLLLL;
                    if (m89 != null) {
                        j8i.LJJIIZ(m89.getPageType(), currentAweme);
                        M89 m892 = ((LandscapeFragmentPanel) this.l0).LJLLLLLL;
                        if (m892 != null) {
                            String eventType = m892.getEventType();
                            o.LJI(eventType);
                            j8i.LJJL = eventType;
                            M89 m893 = ((LandscapeFragmentPanel) this.l0).LJLLLLLL;
                            if (m893 != null) {
                                String previousPage = m893.getPreviousPage();
                                M89 m894 = ((LandscapeFragmentPanel) this.l0).LJLLLLLL;
                                if (m894 != null) {
                                    j8i.LJJJZ = C2KM.LIZ(previousPage, m894.getFromGroupId());
                                    j8i.LJIILIIL();
                                } else {
                                    o.LJIJI("param");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("param");
                                throw null;
                            }
                        } else {
                            o.LJIJI("param");
                            throw null;
                        }
                    } else {
                        o.LJIJI("param");
                        throw null;
                    }
                }
                EarphonePlayerControl.LJII().LJ("landscape_feed", true);
                return;
            }
            C46315IFr.LIZIZ("pause", ((LandscapeFragmentPanel) this.l0).getCurrentAweme(), ((LandscapeFragmentPanel) this.l0).getEventType());
        }
    }

    public final void LIZ$2(Intent intent) {
        String str;
        Aweme aweme;
        Aweme currentPlayAweme;
        String str2;
        Aweme currentPlayAweme2;
        Aweme aweme2 = null;
        String str3 = null;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (o.LJ(str, "android.media.AUDIO_BECOMING_NOISY")) {
            LandscapeFeedPlayerAbility x3 = ((LandscapeFeedEarphonePlayerControlComponent) this.l0).x3();
            if (x3 != null && x3.isPlaying()) {
                LandscapeFeedPlayerAbility x32 = ((LandscapeFeedEarphonePlayerControlComponent) this.l0).x3();
                if (x32 != null) {
                    LandscapeFeedViewPagerAbility A3 = ((LandscapeFeedEarphonePlayerControlComponent) this.l0).A3();
                    if (A3 != null && (currentPlayAweme2 = A3.getCurrentPlayAweme()) != null) {
                        x32.handlePlay(currentPlayAweme2, true);
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
                String LIZLLL = C56509MFt.LIZLLL(((LandscapeFeedEarphonePlayerControlComponent) this.l0).getPanelContext());
                LandscapeFeedViewPagerAbility A32 = ((LandscapeFeedEarphonePlayerControlComponent) this.l0).A3();
                if (A32 != null) {
                    aweme = A32.getCurrentPlayAweme();
                } else {
                    aweme = null;
                }
                C46315IFr.LIZIZ("play", aweme, LIZLLL);
                LandscapeFeedViewPagerAbility A33 = ((LandscapeFeedEarphonePlayerControlComponent) this.l0).A3();
                if (A33 != null && (currentPlayAweme = A33.getCurrentPlayAweme()) != null) {
                    LandscapeFeedEarphonePlayerControlComponent landscapeFeedEarphonePlayerControlComponent = (LandscapeFeedEarphonePlayerControlComponent) this.l0;
                    J8I j8i = new J8I();
                    j8i.LJJLIIIJJIZ = "earphone_disconnected";
                    j8i.LJJIIZ(C56509MFt.LJFF(landscapeFeedEarphonePlayerControlComponent.getPanelContext()), currentPlayAweme);
                    j8i.LJJL = C56509MFt.LIZLLL(landscapeFeedEarphonePlayerControlComponent.getPanelContext());
                    M89 m89 = landscapeFeedEarphonePlayerControlComponent.getPanelContext().LIZJ;
                    if (m89 != null) {
                        str2 = m89.getPreviousPage();
                    } else {
                        str2 = null;
                    }
                    M89 m892 = landscapeFeedEarphonePlayerControlComponent.getPanelContext().LIZJ;
                    if (m892 != null) {
                        str3 = m892.getFromGroupId();
                    }
                    j8i.LJJJZ = C2KM.LIZ(str2, str3);
                    j8i.LJIILIIL();
                }
                EarphonePlayerControl.LJII().LJ("landscape_feed", true);
                return;
            }
            String LIZLLL2 = C56509MFt.LIZLLL(((LandscapeFeedEarphonePlayerControlComponent) this.l0).getPanelContext());
            LandscapeFeedViewPagerAbility A34 = ((LandscapeFeedEarphonePlayerControlComponent) this.l0).A3();
            if (A34 != null) {
                aweme2 = A34.getCurrentPlayAweme();
            }
            C46315IFr.LIZIZ("pause", aweme2, LIZLLL2);
        }
    }

    public final void LIZ$3(Intent intent) {
        if (intent == null) {
            return;
        }
        ((C47926IrS) this.l0).LIZ = intent.getIntExtra("temperature", 0) / 10.0f;
        ((C47926IrS) this.l0).LIZIZ = intent.getIntExtra("status", 1);
        C47926IrS c47926IrS = (C47926IrS) this.l0;
        intent.getIntExtra("plugged", -1);
        c47926IrS.getClass();
    }

    public IDBReceiverS8S0100000_8(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public final void LIZ$0(Context context, Intent intent) {
        String str;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(intent, "intent");
        if (o.LJ("android.intent.action.USER_PRESENT", intent.getAction()) && ((DiscoverAndSearchFragment) this.l0).getUserVisibleHint()) {
            DiscoverAndSearchFragment discoverAndSearchFragment = (DiscoverAndSearchFragment) this.l0;
            if (discoverAndSearchFragment.mStatusActive && !discoverAndSearchFragment.LJLJJL && discoverAndSearchFragment.LJLJJI) {
                Word word = discoverAndSearchFragment.LLFF;
                if (word != null) {
                    str = word.getWord();
                } else {
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    ((DiscoverAndSearchFragment) this.l0).getClass();
                }
                ((DiscoverAndSearchFragment) this.l0).LJLJJL = true;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$5(android.content.Context r3, android.content.Intent r4) {
        /*
            r2 = this;
            boolean r0 = r2.isInitialStickyBroadcast()
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.String r1 = "android.net.conn.CONNECTIVITY_CHANGE"
            java.lang.String r0 = r4.getAction()
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L14
            return
        L14:
            java.lang.String r0 = "connectivity"
            java.lang.Object r0 = X.C16880lQ.LLILL(r3, r0)     // Catch: java.lang.Exception -> L2c
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch: java.lang.Exception -> L2c
            if (r0 != 0) goto L1f
            goto L2c
        L1f:
            android.net.NetworkInfo r0 = X.C16880lQ.LJJLI(r0)     // Catch: java.lang.Exception -> L2c
            if (r0 == 0) goto L2c
            boolean r0 = r0.isConnected()     // Catch: java.lang.Exception -> L2c
            if (r0 == 0) goto L2c
            goto L2e
        L2c:
            r0 = 0
            goto L2f
        L2e:
            r0 = 1
        L2f:
            r1 = 1024(0x400, float:1.435E-42)
            if (r0 != 0) goto L44
            java.lang.Object r0 = r2.l0
            X.VDR r0 = (X.VDR) r0
            Y.IDHandlerS24S0100000_14 r0 = r0.LIZJ
            r0.removeMessages(r1)
            java.lang.Object r0 = r2.l0
            X.VDR r0 = (X.VDR) r0
            r0.LJIIIZ()
            return
        L44:
            java.lang.Object r0 = r2.l0
            X.VDR r0 = (X.VDR) r0
            Y.IDHandlerS24S0100000_14 r0 = r0.LIZJ
            r0.removeMessages(r1)
            java.lang.Object r0 = r2.l0
            X.VDR r0 = (X.VDR) r0
            r0.LJIIIZ()
            java.lang.Object r0 = r2.l0
            X.VDR r0 = (X.VDR) r0
            r0.LJIIJ()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDBReceiverS8S0100000_8.LIZ$5(android.content.Context, android.content.Intent):void");
    }

    public final void LIZ$6(Context context, Intent intent) {
        KeyguardManager keyguardManager;
        if (intent == null) {
            return;
        }
        if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            ((C59327NQd) this.l0).LIZ(true);
            return;
        }
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            ((C59327NQd) this.l0).LIZ(false);
        } else {
            if (!"android.intent.action.SCREEN_ON".equals(intent.getAction()) || (keyguardManager = (KeyguardManager) C16880lQ.LLILL(context, "keyguard")) == null || keyguardManager.inKeyguardRestrictedInputMode()) {
                return;
            }
            ((C59327NQd) this.l0).LIZ(false);
        }
    }

    public static final void onReceive$0(IDBReceiverS8S0100000_8 iDBReceiverS8S0100000_8, Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            iDBReceiverS8S0100000_8.LIZ$0(context, intent);
        } else {
            C38523F9z.LIZ();
            iDBReceiverS8S0100000_8.LIZ$0(context, intent);
        }
    }

    public static final void onReceive$1(IDBReceiverS8S0100000_8 iDBReceiverS8S0100000_8, Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            iDBReceiverS8S0100000_8.LIZ$1(intent);
        } else {
            C38523F9z.LIZ();
            iDBReceiverS8S0100000_8.LIZ$1(intent);
        }
    }

    public static final void onReceive$2(IDBReceiverS8S0100000_8 iDBReceiverS8S0100000_8, Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            iDBReceiverS8S0100000_8.LIZ$2(intent);
        } else {
            C38523F9z.LIZ();
            iDBReceiverS8S0100000_8.LIZ$2(intent);
        }
    }

    public static final void onReceive$3(IDBReceiverS8S0100000_8 iDBReceiverS8S0100000_8, Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            iDBReceiverS8S0100000_8.LIZ$3(intent);
        } else {
            C38523F9z.LIZ();
            iDBReceiverS8S0100000_8.LIZ$3(intent);
        }
    }

    public static final void onReceive$4(IDBReceiverS8S0100000_8 iDBReceiverS8S0100000_8, Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            iDBReceiverS8S0100000_8.LIZ$4(context, intent);
        } else {
            C38523F9z.LIZ();
            iDBReceiverS8S0100000_8.LIZ$4(context, intent);
        }
    }

    public static final void onReceive$5(IDBReceiverS8S0100000_8 iDBReceiverS8S0100000_8, Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            iDBReceiverS8S0100000_8.LIZ$5(context, intent);
        } else {
            C38523F9z.LIZ();
            iDBReceiverS8S0100000_8.LIZ$5(context, intent);
        }
    }

    public static final void onReceive$6(IDBReceiverS8S0100000_8 iDBReceiverS8S0100000_8, Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            C48305IxZ c48305IxZ = (C48305IxZ) iDBReceiverS8S0100000_8.l0;
            c48305IxZ.LIZIZ = C48189Ivh.LJ(c48305IxZ.LIZ);
            C48305IxZ.LIZLLL.set(true);
        } else {
            C38523F9z.LIZ();
            C48305IxZ c48305IxZ2 = (C48305IxZ) iDBReceiverS8S0100000_8.l0;
            c48305IxZ2.LIZIZ = C48189Ivh.LJ(c48305IxZ2.LIZ);
            C48305IxZ.LIZLLL.set(true);
        }
    }

    public static final void onReceive$7(IDBReceiverS8S0100000_8 iDBReceiverS8S0100000_8, Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            iDBReceiverS8S0100000_8.LIZ$6(context, intent);
        } else {
            C38523F9z.LIZ();
            iDBReceiverS8S0100000_8.LIZ$6(context, intent);
        }
    }
}
