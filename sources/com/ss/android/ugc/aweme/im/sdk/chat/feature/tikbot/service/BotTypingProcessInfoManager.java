package com.ss.android.ugc.aweme.im.sdk.chat.feature.tikbot.service;

import X.C1035944t;
import X.C1036044u;
import X.C16880lQ;
import X.C221108m2;
import X.C34B;
import X.C48841JEv;
import X.C5H3;
import X.C76092yj;
import X.C76112yl;
import X.C76142yo;
import X.C78555UsJ;
import X.C78613UtF;
import X.C79146V4k;
import X.C97343ru;
import X.InterfaceC70422pa;
import X.InterfaceC76122ym;
import X.JBR;
import X.T2R;
import X.X1D;
import X.XKX;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.common.utility.collection.WeakHandler;
import com.zhiliaoapp.musically.R;
import defpackage.b1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class BotTypingProcessInfoManager implements WeakHandler.IHandler {
    public static final BotTypingProcessInfoManager INSTANCE;
    public static final String TAG;
    public static final C76112yl currentProcessInfo;
    public static String currentQueryMsgId;
    public static boolean hasStartedPolling;
    public static final C5H3 pollingMaxTimeLimit$delegate;
    public static long pollingStartTime;
    public static InterfaceC76122ym processInfoChangedListener;
    public static final C5H3 requestInterval$delegate;
    public static final InterfaceC70422pa scope;
    public static final WeakHandler weakHandler;

    static {
        BotTypingProcessInfoManager botTypingProcessInfoManager = new BotTypingProcessInfoManager();
        INSTANCE = botTypingProcessInfoManager;
        TAG = C16880lQ.LJLLJ(BotTypingProcessInfoManager.class);
        requestInterval$delegate = C221108m2.LIZIZ(C1036044u.LJLIL);
        pollingMaxTimeLimit$delegate = C221108m2.LIZIZ(C1035944t.LJLIL);
        weakHandler = new WeakHandler(botTypingProcessInfoManager);
        currentProcessInfo = new C76112yl(0);
        pollingStartTime = -1L;
        scope = C48841JEv.LIZ(C78613UtF.LIZ.plus(T2R.LJIIJJI()));
    }

    private final void cleanAllProcessInfo() {
        log("cleanAllProcessInfo");
        C76112yl c76112yl = currentProcessInfo;
        c76112yl.LJLJI = -1;
        c76112yl.LJLILLLLZI = -1;
        c76112yl.LJLIL.clear();
        pollingStartTime = -1L;
        currentQueryMsgId = null;
        processInfoChangedListener = null;
    }

    private final long getPollingMaxTimeLimit() {
        return ((Number) pollingMaxTimeLimit$delegate.getValue()).longValue();
    }

    private final long getRequestInterval() {
        return ((Number) requestInterval$delegate.getValue()).longValue();
    }

    private final C76142yo getSPAN_GENERATING_PROCESS_TEXT() {
        return new C76142yo(C97343ru.LJFF(R.string.cmf), 1, -1, -1);
    }

    private final boolean isEndOfStatus() {
        int i = currentProcessInfo.LJLJI;
        if (i != 0 && i != 2) {
            C78555UsJ.LJJJJ();
            return false;
        }
        return true;
    }

    public final C76142yo getPREPARING_NEW_FOR_YOU_FEED() {
        return new C76142yo(C97343ru.LJFF(R.string.gpt), 1, -1, -1);
    }

    public final boolean isTimeOut() {
        if (pollingStartTime != -1 && SystemClock.elapsedRealtime() - pollingStartTime > getPollingMaxTimeLimit()) {
            return true;
        }
        return false;
    }

    public final void stopPollingProcessInfo$im_base_release() {
        log("stopPollingProcessInfo");
        WeakHandler weakHandler2 = weakHandler;
        weakHandler2.removeMessages(101);
        weakHandler2.removeMessages(102);
        C79146V4k.LJIJJ(scope.getCoroutineContext());
        processInfoChangedListener = null;
        hasStartedPolling = false;
    }

    private final String getPREFIX_SEARCHING_FOR() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C97343ru.LJFF(R.string.cns));
        LIZ.append(' ');
        return X1D.LIZIZ(LIZ);
    }

    public final C76112yl getProcessingData$im_base_release() {
        C78555UsJ.LJJJJ();
        return currentProcessInfo;
    }

    public final String getTAG() {
        return TAG;
    }

    private final void fakeTimeOutData(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("fakeTimeOutData queryMsgId = ");
        LIZ.append(str);
        log(X1D.LIZIZ(LIZ));
        if (!isQueryMsgIdInvalid(str)) {
            C76112yl c76112yl = currentProcessInfo;
            if (!c76112yl.LJLIL.contains(getSPAN_GENERATING_PROCESS_TEXT())) {
                log("fakeTimeOutData add SPAN_GENERATING_PROCESS_TEXT");
                c76112yl.LJLJI = 0;
                c76112yl.LJLIL.add(getSPAN_GENERATING_PROCESS_TEXT());
                InterfaceC76122ym interfaceC76122ym = processInfoChangedListener;
                if (interfaceC76122ym != null) {
                    interfaceC76122ym.LIZ(c76112yl);
                }
                stopPollingProcessInfo$im_base_release();
            }
        }
    }

    private final boolean ifTimeOutThenFakeData(String str) {
        boolean isTimeOut = isTimeOut();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ifTimeOutThenFakeData queryMsgId = ");
        LIZ.append(str);
        log(X1D.LIZIZ(LIZ));
        if (isTimeOut) {
            fakeTimeOutData(str);
        }
        return isTimeOut;
    }

    public final void continuePollingProcessInfo(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("continuePollingProcessInfo queryMsgId = ");
        LIZ.append(str);
        log(X1D.LIZIZ(LIZ));
        if (hasStartedPolling && !isEndOfStatus() && !isQueryMsgIdInvalid(str) && !isTimeOut()) {
            WeakHandler weakHandler2 = weakHandler;
            Message obtain = Message.obtain();
            obtain.what = 101;
            obtain.obj = str;
            weakHandler2.sendMessageDelayed(obtain, getRequestInterval());
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        Integer valueOf;
        String str;
        String str2 = null;
        if (message == null || (valueOf = Integer.valueOf(message.what)) == null) {
            return;
        }
        if (valueOf.intValue() == 101) {
            Object obj = message.obj;
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                str = null;
            }
            XKX.LIZLLL(scope, null, null, new C76092yj(str, null), 3);
            return;
        }
        if (valueOf.intValue() != 102) {
            return;
        }
        log("on timeout!");
        Object obj2 = message.obj;
        if (obj2 instanceof String) {
            str2 = (String) obj2;
        }
        if (isQueryMsgIdInvalid(str2)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("3 isInvalid == true, queryMsgId = ");
            LIZ.append(str2);
            log(X1D.LIZIZ(LIZ));
            return;
        }
        fakeTimeOutData(str2);
    }

    public final boolean isQueryMsgIdInvalid(String str) {
        String str2 = currentQueryMsgId;
        if (str2 != null && str2.length() != 0 && o.LJ(str, currentQueryMsgId)) {
            return false;
        }
        return true;
    }

    public final void log(String str) {
        String str2 = TAG;
        StringBuilder LIZJ = b1.LIZJ(str, " ----currentInfo: currentQueryMsgId = ");
        LIZJ.append(currentQueryMsgId);
        LIZJ.append(", currentProcess Info = ");
        LIZJ.append(currentProcessInfo);
        LIZJ.append(' ');
        C34B.LIZIZ(str2, X1D.LIZIZ(LIZJ));
    }

    public final void setChangeListener$im_base_release(InterfaceC76122ym interfaceC76122ym) {
        processInfoChangedListener = interfaceC76122ym;
    }

    public final void setShownIndex$im_base_release(int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setShownIndex newShownIndex = ");
        LIZ.append(i);
        log(X1D.LIZIZ(LIZ));
        currentProcessInfo.LJLILLLLZI = i;
    }

    public final void startPollingProcessInfo$im_base_release(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("startPollingProcessInfo newQueryMsgId = ");
        LIZ.append(str);
        log(X1D.LIZIZ(LIZ));
        if (!o.LJ(currentQueryMsgId, str)) {
            cleanAllProcessInfo();
        }
        if (str == null || str.length() == 0) {
            return;
        }
        currentQueryMsgId = str;
        if (!isEndOfStatus() && !ifTimeOutThenFakeData(str)) {
            hasStartedPolling = true;
            if (pollingStartTime == -1) {
                pollingStartTime = SystemClock.elapsedRealtime();
            }
            long pollingMaxTimeLimit = getPollingMaxTimeLimit() - SystemClock.elapsedRealtime();
            long j = pollingStartTime;
            long j2 = pollingMaxTimeLimit + j;
            if (j2 < 0) {
                j2 = 0;
            }
            if (j2 <= j) {
                j = j2;
            }
            WeakHandler weakHandler2 = weakHandler;
            Message obtain = Message.obtain();
            obtain.what = 101;
            obtain.obj = str;
            weakHandler2.sendMessage(obtain);
            Message obtain2 = Message.obtain();
            obtain2.what = 102;
            obtain2.obj = str;
            weakHandler2.sendMessageDelayed(obtain2, j);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("startPollingProcessInfo setTimeOut = ");
            LIZ2.append(j);
            log(X1D.LIZIZ(LIZ2));
            return;
        }
        C78555UsJ.LJJJJ();
    }

    public final List<C76142yo> getSpannableList(List<String> list, int i) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            int i2 = 0;
            for (String str : list) {
                if (str.length() > 0 && (i2 = i2 + 1) <= 5) {
                    StringBuilder LIZ = X1D.LIZ();
                    BotTypingProcessInfoManager botTypingProcessInfoManager = INSTANCE;
                    String LJFF = JBR.LJFF(LIZ, botTypingProcessInfoManager.getPREFIX_SEARCHING_FOR(), str, LIZ);
                    arrayList.add(new C76142yo(LJFF, 3, botTypingProcessInfoManager.getPREFIX_SEARCHING_FOR().length(), LJFF.length()));
                }
            }
        }
        if (i == 0 || i == 2) {
            arrayList.add(getSPAN_GENERATING_PROCESS_TEXT());
        }
        return arrayList;
    }
}
