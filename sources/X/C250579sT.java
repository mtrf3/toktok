package X;

import android.content.Context;
import com.bytedance.touchpoint.core.model.Control;
import com.bytedance.touchpoint.core.model.InAppPush;
import com.bytedance.touchpoint.data.request.INetworkApi;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* renamed from: X.9sT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C250579sT extends C112554bL implements InterfaceC86486Xww {
    public static volatile InAppPush LIZIZ;
    public static boolean LIZJ;
    public static final C250579sT LIZ = new C250579sT();
    public static final int[] LIZLLL = {23};

    @Override // X.InterfaceC86486Xww
    public final boolean LIZLLL(InnerPushMessage innerPushMessage) {
        return false;
    }

    @Override // X.InterfaceC86486Xww
    public final boolean LJFF(InnerPushMessage innerPushMessage) {
        return true;
    }

    @Override // X.InterfaceC86486Xww
    public final boolean LJIIIIZZ(InnerPushMessage message) {
        o.LJIIIZ(message, "message");
        return true;
    }

    @Override // X.C112554bL, X.InterfaceC86533Xxh
    public final void LJIIIZ() {
        InAppPush inAppPush = LIZIZ;
        if (inAppPush != null) {
            C250569sS.LIZ(inAppPush, "close");
        }
    }

    @Override // X.InterfaceC86486Xww
    public final int[] LIZ() {
        return LIZLLL;
    }

    @Override // X.InterfaceC86486Xww
    public final boolean LIZIZ(int i, InnerPushMessage innerPushMessage) {
        Integer num;
        String str;
        InAppPush inAppPush = LIZIZ;
        if (inAppPush != null) {
            Context LJIIIIZZ = C84763XOl.LJIIIIZZ();
            if (LJIIIIZZ == null) {
                LJIIIIZZ = EF7.LIZIZ();
            }
            C250569sS.LIZ(inAppPush, "ok");
            if (inAppPush.LIZIZ.length() > 0) {
                C247519nX c247519nX = C247519nX.LIZ;
                int i2 = inAppPush.LIZ;
                OSZ[] oszArr = new OSZ[3];
                oszArr[0] = new OSZ("click_position", "ok");
                Control control = inAppPush.control;
                if (control != null) {
                    num = Integer.valueOf(control.type);
                } else {
                    num = null;
                }
                oszArr[1] = new OSZ("sub_type", String.valueOf(num));
                Control control2 = inAppPush.control;
                if (control2 == null || (str = control2.taskName) == null) {
                    str = "";
                }
                oszArr[2] = new OSZ("task_key", str);
                C247519nX.LJIIIZ(c247519nX, i2, C113554cx.LJJLIIIIJ(oszArr), null, null, 28);
            }
            String str2 = inAppPush.jumpLink;
            if (str2 != null) {
                C250729si.LIZ(LJIIIIZZ, str2, inAppPush.LIZIZ, inAppPush.LJ, false);
            }
        }
        LIZJ = true;
        C86550Xxy.LIZIZ.LJIILIIL(EnumC86549Xxx.CLICK, innerPushMessage, "click");
        return true;
    }

    @Override // X.InterfaceC86486Xww
    public final C119904nC LJ(C86507XxH c86507XxH, InnerPushMessage innerPushMessage) {
        Integer num;
        String str;
        Integer num2;
        String str2;
        InAppPush inAppPush = LIZIZ;
        if (inAppPush != null) {
            InterfaceC247459nR interfaceC247459nR = C95J.LIZ;
            if (interfaceC247459nR != null) {
                OSZ[] oszArr = new OSZ[4];
                Control control = inAppPush.control;
                if (control != null) {
                    num2 = Integer.valueOf(control.type);
                } else {
                    num2 = null;
                }
                oszArr[0] = new OSZ("type", String.valueOf(num2));
                String str3 = inAppPush.inAppPushName;
                String str4 = "";
                if (str3 == null) {
                    str3 = "";
                }
                oszArr[1] = new OSZ("name", str3);
                String str5 = inAppPush.taskIds;
                if (str5 != null) {
                    str4 = str5;
                }
                oszArr[2] = new OSZ("task_id", str4);
                AbstractC247499nV abstractC247499nV = (AbstractC247499nV) C95J.LIZ(0);
                if (abstractC247499nV != null) {
                    str2 = abstractC247499nV.LJIIJ();
                } else {
                    str2 = null;
                }
                oszArr[3] = new OSZ("region", str2);
                interfaceC247459nR.LIZIZ("inapp_push_show", C113554cx.LJJLIIIIJ(oszArr));
            }
            if (inAppPush.LIZIZ.length() > 0) {
                C247519nX c247519nX = C247519nX.LIZ;
                int i = inAppPush.LIZ;
                OSZ[] oszArr2 = new OSZ[2];
                Control control2 = inAppPush.control;
                if (control2 != null) {
                    num = Integer.valueOf(control2.type);
                } else {
                    num = null;
                }
                oszArr2[0] = new OSZ("sub_type", String.valueOf(num));
                Control control3 = inAppPush.control;
                if (control3 != null) {
                    str = control3.taskName;
                } else {
                    str = null;
                }
                oszArr2[1] = new OSZ("task_key", str);
                C247519nX.LJIIL(c247519nX, i, C113554cx.LJJLIIIIJ(oszArr2), null, null, 60);
            }
        }
        return null;
    }

    @Override // X.C112554bL, X.InterfaceC86533Xxh
    public final void LJII(InnerPushMessage innerPushMessage, boolean z, String str) {
        final InAppPush inAppPush = LIZIZ;
        if (inAppPush != null) {
            final boolean z2 = LIZJ;
            C10K.LIZJ(new Callable() { // from class: X.9nw
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    INetworkApi LJFF;
                    int i;
                    InterfaceC247459nR interfaceC247459nR = C95J.LIZ;
                    if (interfaceC247459nR != null && (LJFF = interfaceC247459nR.LJFF()) != null) {
                        Integer num = InAppPush.this.inAppPushId;
                        if (num != null) {
                            i = num.intValue();
                        } else {
                            i = 0;
                        }
                        return LJFF.requestOnPopupClick(i, !z2 ? 1 : 0);
                    }
                    return null;
                }
            });
        }
        LIZJ = false;
    }
}
