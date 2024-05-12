package com.ss.android.ugc.aweme.legoImp.service;

import X.C03880Dg;
import X.C0RN;
import X.C16880lQ;
import X.C33949DUb;
import X.C34710Djm;
import X.C36089EEj;
import X.C36093EEn;
import X.C36508EUm;
import X.C36922EeM;
import X.C37179EiV;
import X.C39519Ff9;
import X.C65300Pk0;
import X.EE1;
import X.EEP;
import X.EEZ;
import X.EF2;
import X.EFK;
import X.EWV;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FA5;
import X.FA6;
import X.FA7;
import X.FA8;
import X.FA9;
import X.FAA;
import X.FAB;
import X.FAC;
import X.FAE;
import X.FAI;
import X.FKM;
import X.X1D;
import Y.ARunnableS1S0001000_6;
import Y.ARunnableS9S0201000_6;
import Y.IDDListenerS393S0100000_6;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.os.MessageQueue;
import android.util.Log;
import android.util.Printer;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewParent;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class MainLooperOptService implements EEP {
    public static int LLFF = 4;
    public static boolean LLFFF = true;
    public static final FAE LLFII = new FAE(C16880lQ.LLJJJJ());
    public FAB LJLILLLLZI;
    public Handler LJLJI;
    public Handler LJLJJI;
    public Handler LJLJJL;
    public Handler LJLJJLL;
    public Handler LJLJL;
    public MessageQueue LJLJLJ;
    public Choreographer LJLJLLL;
    public Object LJLL;
    public Class<?> LJLLI;
    public Field LJLLILLLL;
    public Field LJLLJ;
    public FA8 LJLLL;
    public FA7 LJLLLL;
    public FA6 LJLLLLLL;
    public final Map<FAB, Boolean> LJLIL = new HashMap(FAB.values().length);
    public final FAA LJLZ = new FAA(this);
    public final FA9 LJZ = new FA9(this);
    public Printer LJZI = null;
    public boolean LJZL = false;
    public boolean LL = false;
    public final FAC LLD = new FAC(this);
    public final IDDListenerS393S0100000_6 LLF = new IDDListenerS393S0100000_6(this, 1);

    public static Object LIZLLL(Object obj, Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-333487723956193647"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    public final Handler LJIILLIIL() {
        try {
            return (Handler) C36508EUm.LIZJ(LIZLLL(null, C36508EUm.LIZIZ(this.LJLLI, "currentActivityThread", new Class[0]), new Object[0]), "mH");
        } catch (Throwable th) {
            Log.getStackTraceString(th);
            return null;
        }
    }

    public final void LJIJ() {
        Printer printer;
        try {
            LLFFF = false;
            this.LL = true;
            if (C34710Djm.LJIIIZ()) {
                FA8 fa8 = this.LJLLL;
                if (fa8 != null) {
                    fa8.LIZIZ();
                }
                FA7 fa7 = this.LJLLLL;
                if (fa7 != null) {
                    fa7.LIZ();
                }
                FA6 fa6 = this.LJLLLLLL;
                if (fa6 != null) {
                    fa6.LIZ();
                }
            }
            try {
                printer = (Printer) C36508EUm.LIZJ(C16880lQ.LLJJJJ(), "mLogging");
            } catch (Exception e) {
                Log.getStackTraceString(e);
                printer = null;
            }
            if (((Boolean) C34710Djm.LJJII.getValue()).booleanValue()) {
                if (printer == this.LJZ) {
                    C16880lQ.LLJJJJ().setMessageLogging(this.LJZI);
                }
                FAI.LIZJ(this.LJZ);
            } else {
                if (printer == this.LJLZ) {
                    C16880lQ.LLJJJJ().setMessageLogging(this.LJZI);
                }
                FAI.LIZJ(this.LJLZ);
            }
            if (C34710Djm.LJIIIIZZ()) {
                FKM.LIZ().unregisterActivityLifecycleCallbacks(this.LLD);
            }
            this.LJLJI = null;
            this.LJLJJI = null;
            this.LJLJJL = null;
            this.LJLJJLL = null;
            this.LJLJL = null;
            this.LJLJLLL = null;
            this.LJZL = true;
        } catch (Throwable unused) {
        }
    }

    @Override // X.EEY
    public final String key() {
        return "MainLooperOptService";
    }

    @Override // X.EEY
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.EEY
    public final /* synthetic */ String prefix() {
        return "service_";
    }

    @Override // X.EEY
    public final /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    public static void LJII() {
        MainLooperOptService LJIIJ;
        if (LLFFF && (LJIIJ = LJIIJ(null)) != null) {
            ((HashMap) LJIIJ.LJLIL).put(FAB.WATCH_EXECUTE_TRANSACTION, Boolean.TRUE);
        }
    }

    public final Message LJIIZILJ() {
        try {
            return (Message) this.LJLLILLLL.get(this.LJLJLJ);
        } catch (Exception e) {
            Log.getStackTraceString(e);
            return null;
        }
    }

    public final void LJIJI() {
        try {
            if (LLFFF && C34710Djm.LJIIIZ()) {
                Message message = (Message) this.LJLLILLLL.get(this.LJLJLJ);
                while (message != null) {
                    if (message.what == 0 && message.getTarget() == this.LJLJJI && message.getCallback() == this.LJLL) {
                        Message obtain = Message.obtain(message);
                        this.LJLJJI.removeMessages(message.what, message.obj);
                        obtain.setTarget(this.LJLLLL);
                        obtain.sendToTarget();
                        return;
                    }
                    message = LJIIJJI(message);
                }
            }
        } catch (Exception e) {
            Log.getStackTraceString(e);
        }
    }

    @Override // X.EEY
    public final EnumC36103EEx triggerType() {
        EF2 ef2 = EF2.LIZIZ;
        EFK type = type();
        Map<Object, EnumC36103EEx> map = ef2.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("service");
        LIZ.append(type.name());
        return (EnumC36103EEx) ((HashMap) map).get(X1D.LIZIZ(LIZ));
    }

    public MainLooperOptService() {
        try {
            this.LJLJLLL = C16880lQ.LLIIIJ();
            LLFFF = ((Boolean) C34710Djm.LJJJLZIJ.getValue()).booleanValue();
        } catch (Throwable th) {
            LLFFF = false;
            Log.getStackTraceString(th);
        }
    }

    public final void LJIILIIL() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("move ");
        LIZ.append(this.LJLILLLLZI.name());
        LIZ.append(" success");
        X1D.LIZIZ(LIZ);
    }

    @Override // X.EEY
    public final int targetProcess() {
        if (C33949DUb.LIZIZ()) {
            return 1;
        }
        return 16777215;
    }

    /* loaded from: classes7.dex */
    public class ResetTask implements EE1 {
        @Override // X.EEY
        public final String key() {
            return "MainLooperOptService$ResetTask";
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

        public ResetTask() {
        }

        @Override // X.EEY
        public final void run(Context context) {
            C36922EeM.LJ("ResetTask");
            MainLooperOptService.this.LJIJ();
        }
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EEP
    public final EFK type() {
        return EFK.BACKGROUND;
    }

    public static MainLooperOptService LJIIJ(FAB fab) {
        MainLooperOptService mainLooperOptService;
        try {
            C36093EEn.LIZ.getClass();
            mainLooperOptService = (MainLooperOptService) C36093EEn.LJII(MainLooperOptService.class);
            if (fab != null) {
                try {
                    mainLooperOptService.LJIJJLI(fab);
                } catch (Exception e) {
                    e = e;
                    Log.getStackTraceString(e);
                    return mainLooperOptService;
                }
            }
        } catch (Exception e2) {
            e = e2;
            mainLooperOptService = null;
        }
        return mainLooperOptService;
    }

    public final Message LJIIJJI(Message message) {
        try {
            Object obj = this.LJLLJ.get(message);
            if (obj != null) {
                return (Message) obj;
            }
            return null;
        } catch (Exception e) {
            Log.getStackTraceString(e);
            return null;
        }
    }

    public final void LJIIL(Context context) {
        Handler handler;
        Object obj;
        MessageQueue messageQueue;
        Field field;
        Field field2;
        FKM.LIZ().registerActivityLifecycleCallbacks(new EWV(this));
        if (!LLFFF) {
            return;
        }
        try {
            this.LJLLI = Class.forName("android.app.ActivityThread");
            C36922EeM.LJ("MainLooperOptService");
            this.LJLJI = LJIILLIIL();
            Printer printer = null;
            try {
                handler = (Handler) C36508EUm.LIZJ(this.LJLJLLL, "mHandler");
            } catch (Throwable th) {
                Log.getStackTraceString(th);
                handler = null;
            }
            this.LJLJJI = handler;
            try {
                obj = C36508EUm.LIZJ(this.LJLJLLL, "mDisplayEventReceiver");
            } catch (Throwable th2) {
                Log.getStackTraceString(th2);
                obj = null;
            }
            this.LJLL = obj;
            try {
                messageQueue = (MessageQueue) C36508EUm.LIZJ(C16880lQ.LLJJJJ(), "mQueue");
            } catch (Throwable th3) {
                Log.getStackTraceString(th3);
                messageQueue = null;
            }
            this.LJLJLJ = messageQueue;
            try {
                field = C36508EUm.LIZ(MessageQueue.class, "mMessages");
            } catch (Throwable th4) {
                Log.getStackTraceString(th4);
                field = null;
            }
            this.LJLLILLLL = field;
            try {
                field2 = C36508EUm.LIZ(Message.class, "next");
            } catch (Throwable th5) {
                Log.getStackTraceString(th5);
                field2 = null;
            }
            this.LJLLJ = field2;
            if (this.LJLJI != null && this.LJLJJI != null && this.LJLJLJ != null) {
                for (FAB fab : FAB.values()) {
                    ((HashMap) this.LJLIL).put(fab, Boolean.FALSE);
                }
                Map<FAB, Boolean> map = this.LJLIL;
                FAB fab2 = FAB.WATCH_INIT;
                this.LJLILLLLZI = fab2;
                ((HashMap) map).put(fab2, Boolean.TRUE);
                if (!C34710Djm.LJIIIZ()) {
                    this.LJLJJLL = LJIILLIIL();
                    try {
                    } catch (Throwable th6) {
                        Log.getStackTraceString(th6);
                    }
                    try {
                        printer = (Printer) C36508EUm.LIZJ(C16880lQ.LLJJJJ(), "mLogging");
                    } catch (Exception e) {
                        Log.getStackTraceString(e);
                    }
                    this.LJZI = printer;
                    C16880lQ.LLJJJJ().setMessageLogging(this.LJLZ);
                } else {
                    FA8 fa8 = new FA8(this, this.LJLJI);
                    this.LJLLL = fa8;
                    if (fa8.LIZIZ) {
                        FA5.LIZIZ(fa8.LIZ, fa8);
                    }
                    FA7 fa7 = new FA7(this, this.LJLJJI);
                    this.LJLLLL = fa7;
                    if (fa7.LIZIZ) {
                        FA5.LIZIZ(fa7.LIZ, fa7);
                    }
                    if (((Boolean) C34710Djm.LJJII.getValue()).booleanValue()) {
                        try {
                            printer = (Printer) C36508EUm.LIZJ(C16880lQ.LLJJJJ(), "mLogging");
                        } catch (Exception e2) {
                            Log.getStackTraceString(e2);
                        }
                        this.LJZI = printer;
                        C16880lQ.LLJJJJ().setMessageLogging(this.LJZ);
                    }
                }
            }
            if (C34710Djm.LJIIIIZZ()) {
                FKM.LIZ().registerActivityLifecycleCallbacks(this.LLD);
            }
            C36093EEn.LIZ.getClass();
            C36089EEj LJIIIZ = C36093EEn.LJIIIZ();
            LJIIIZ.LIZIZ(new ResetTask(), true);
            LJIIIZ.LIZJ();
        } catch (Exception unused) {
        }
    }

    public final boolean LJIILL(Object obj) {
        try {
            Message LJIIZILJ = LJIIZILJ();
            while (LJIIZILJ != null) {
                if (LJIIZILJ.what == 0 && LJIIZILJ.getCallback() == obj) {
                    Handler target = LJIIZILJ.getTarget();
                    Object obj2 = LJIIZILJ.obj;
                    Message obtain = Message.obtain(LJIIZILJ);
                    target.removeMessages(LJIIZILJ.what, obj2);
                    target.sendMessageAtTime(obtain, -1L);
                    LJIILIIL();
                    return true;
                }
                LJIIZILJ = LJIIJJI(LJIIZILJ);
            }
            return false;
        } catch (Exception e) {
            Log.getStackTraceString(e);
            return false;
        }
    }

    public final void LJIJJ(View view) {
        View rootView;
        Handler handler;
        if (!LLFFF || view == null || (rootView = view.getRootView()) == null) {
            return;
        }
        ViewParent parent = rootView.getParent();
        Handler handler2 = null;
        try {
            handler = (Handler) C36508EUm.LIZJ(parent, "mHandler");
        } catch (Throwable th) {
            Log.getStackTraceString(th);
            handler = null;
        }
        this.LJLJJL = handler;
        try {
            handler2 = (Handler) C36508EUm.LIZJ(parent, "mHandler");
        } catch (Throwable th2) {
            Log.getStackTraceString(th2);
        }
        this.LJLJL = handler2;
        if (C34710Djm.LJIIIZ()) {
            FA6 fa6 = new FA6(this, this.LJLJJL, parent);
            this.LJLLLLLL = fa6;
            if (fa6.LIZJ) {
                FA5.LIZIZ(fa6.LIZ, fa6);
            }
        }
        if (!((Boolean) C34710Djm.LJJIIZ.getValue()).booleanValue()) {
            return;
        }
        rootView.getViewTreeObserver().addOnPreDrawListener(this.LLF);
        C37179EiV.LIZ().postDelayed(new ARunnableS9S0201000_6(1, this, rootView, 4), 2000L);
    }

    public final void LJIJJLI(FAB fab) {
        if (LLFFF) {
            C36093EEn.LIZ.getClass();
            if (EEZ.LIZJ()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("update state to: ");
                LIZ.append(fab);
                X1D.LIZIZ(LIZ);
                this.LJLILLLLZI = fab;
                ((HashMap) this.LJLIL).put(fab, Boolean.FALSE);
            }
        }
    }

    @Override // X.EEP, X.EEY
    public final void run(Context context) {
        LJIIL(context);
    }

    public static boolean LJ(Choreographer choreographer, Runnable runnable) {
        try {
            Method LIZIZ = C36508EUm.LIZIZ(choreographer.getClass(), "postCallbackDelayed", Integer.TYPE, Runnable.class, Object.class, Long.TYPE);
            while (true) {
                int i = LLFF;
                if (i < 0) {
                    break;
                }
                try {
                    LIZLLL(choreographer, LIZIZ, new Object[]{Integer.valueOf(i), new ARunnableS1S0001000_6(0, 21), null, 0});
                    break;
                } catch (Throwable unused) {
                    LLFF--;
                }
            }
            int i2 = LLFF;
            if (i2 != 0) {
                LIZLLL(choreographer, LIZIZ, new Object[]{Integer.valueOf(i2), runnable, null, 0});
                return true;
            }
        } catch (Throwable unused2) {
        }
        return false;
    }

    public final boolean LJIILJJIL(int i, Handler handler) {
        try {
            Message LJIIZILJ = LJIIZILJ();
            while (LJIIZILJ != null) {
                if (LJIIZILJ.what == i && LJIIZILJ.getTarget() == handler) {
                    Object obj = LJIIZILJ.obj;
                    Message obtain = Message.obtain(LJIIZILJ);
                    handler.removeMessages(LJIIZILJ.what, obj);
                    handler.sendMessageAtTime(obtain, -1L);
                    LJIILIIL();
                    return true;
                }
                LJIIZILJ = LJIIJJI(LJIIZILJ);
            }
            return false;
        } catch (Exception e) {
            Log.getStackTraceString(e);
            return false;
        }
    }
}
