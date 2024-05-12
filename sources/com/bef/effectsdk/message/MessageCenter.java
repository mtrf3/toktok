package com.bef.effectsdk.message;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class MessageCenter {
    public static HandlerThread sMessageCenterThread;
    public static Handler sMessageHandler;
    public static final Object sMessageCenterThreadLock = new Object();
    public static final List<Listener> sListeners = new ArrayList();

    /* loaded from: classes.dex */
    public interface Listener {
        void onMessageReceived(int i, int i2, int i3, String str);
    }

    public static void destroy() {
        List<Listener> list = sListeners;
        synchronized (list) {
            if (!list.isEmpty()) {
                return;
            }
            synchronized (sMessageCenterThreadLock) {
                Handler handler = sMessageHandler;
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                    sMessageHandler = null;
                }
                HandlerThread handlerThread = sMessageCenterThread;
                if (handlerThread != null) {
                    handlerThread.quit();
                    sMessageCenterThread = null;
                }
            }
            list.clear();
        }
    }

    public static void init() {
        synchronized (sMessageCenterThreadLock) {
            HandlerThread handlerThread = sMessageCenterThread;
            if (handlerThread == null || !handlerThread.isAlive() || sMessageCenterThread.getLooper() == null) {
                HandlerThread handlerThread2 = new HandlerThread("MessageCenter");
                sMessageCenterThread = handlerThread2;
                handlerThread2.start();
                sMessageHandler = new MessageHandler(sMessageCenterThread.getLooper());
            }
        }
    }

    public static void removeAllListener() {
        List<Listener> list = sListeners;
        synchronized (list) {
            list.clear();
            destroy();
        }
    }

    /* loaded from: classes.dex */
    public static class MessageHandler extends Handler {
        public MessageHandler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            MessageCenter.handleMessage(message);
        }
    }

    public static void addListener(Listener listener) {
        List<Listener> list = sListeners;
        synchronized (list) {
            if (list.isEmpty()) {
                init();
            }
            list.add(listener);
        }
    }

    public static void handleMessage(Message message) {
        int size;
        Listener[] listenerArr;
        List<Listener> list = sListeners;
        synchronized (list) {
            size = list.size();
            listenerArr = new Listener[size];
            list.toArray(listenerArr);
        }
        if (size <= 0) {
            return;
        }
        int i = 0;
        do {
            listenerArr[i].onMessageReceived(message.what, message.arg1, message.arg2, (String) message.obj);
            i++;
        } while (i < size);
    }

    public static void removeListener(Listener listener) {
        List<Listener> list = sListeners;
        synchronized (list) {
            list.remove(listener);
            if (list.isEmpty()) {
                destroy();
            }
        }
    }

    public static void setListener(Listener listener) {
        synchronized (sListeners) {
            addListener(listener);
        }
    }

    public static void postMessage(int i, int i2, int i3, String str) {
        synchronized (sMessageCenterThreadLock) {
            Handler handler = sMessageHandler;
            if (handler == null) {
                return;
            }
            Message.obtain(handler, i, i2, i3, str).sendToTarget();
        }
    }
}
