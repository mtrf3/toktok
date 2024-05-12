package com.ss.android.ugc.aweme.app;

import X.C16880lQ;
import X.C36922EeM;
import X.C38354F3m;
import X.C76L;
import X.E8M;
import X.EFJ;
import X.InterfaceC195747mE;
import X.InterfaceC195757mF;
import X.InterfaceC36229EJt;
import X.InterfaceC36921EeL;
import X.InterfaceC36924EeO;
import X.JBR;
import X.X1D;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.app.CommandDispatcher;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class CommandDispatcher implements InterfaceC36924EeO {
    public static final String LIZLLL;
    public static final AtomicBoolean LJ;
    public final LinkedHashSet<Long> LIZ = new LinkedHashSet<>();
    public HandlerThread LIZIZ;
    public WeakHandler LIZJ;

    /* loaded from: classes4.dex */
    public interface CommandDispatcherApi {
        @E8M
        @InterfaceC195757mF
        C76L<String> doPost(@InterfaceC195747mE String str, @InterfaceC36229EJt Map<String, String> map);
    }

    static {
        StringBuilder LIZ = X1D.LIZ();
        LIZLLL = JBR.LJFF(LIZ, EFJ.LIZ, "/command/feedback/", LIZ);
        LJ = new AtomicBoolean(false);
    }

    public final synchronized Handler LIZ() {
        CopyOnWriteArrayList<InterfaceC36921EeL> copyOnWriteArrayList;
        if (this.LIZIZ == null) {
            HandlerThread handlerThread = new HandlerThread("AppData-AsyncOp");
            this.LIZIZ = handlerThread;
            handlerThread.start();
            this.LIZJ = new WeakHandler(this.LIZIZ.getLooper(), new WeakHandler.IHandler() { // from class: X.EeK
                @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
                public final void handleMsg(Message message) {
                    CommandDispatcher.this.getClass();
                    try {
                        if (message.what == 104) {
                            try {
                                JSONObject jSONObject = (JSONObject) message.obj;
                                jSONObject.optLong("i");
                                jSONObject.optString("t");
                            } catch (Exception unused) {
                                Logger.debug();
                            }
                        }
                    } catch (Exception unused2) {
                    }
                }
            });
            if (C36922EeM.LIZ && (copyOnWriteArrayList = C36922EeM.LIZIZ) != null) {
                Iterator<InterfaceC36921EeL> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    InterfaceC36921EeL next = it.next();
                    if (next != null && next.isEnable()) {
                        next.getLogTag();
                        next.LIZIZ();
                    }
                }
            }
        }
        return this.LIZJ;
    }

    public CommandDispatcher() {
        new ArrayList();
    }

    public final void LIZIZ(List<String> list) {
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str != null && !C38354F3m.LJ(str)) {
                try {
                    JSONArray jSONArray = new JSONArray(str);
                    LinkedHashSet<Long> linkedHashSet = new LinkedHashSet<>();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject = JSONArrayProtectorUtils.getJSONObject(jSONArray, i);
                        long optLong = jSONObject.optLong("i");
                        if (optLong > 0) {
                            linkedHashSet.add(Long.valueOf(optLong));
                            LIZ().sendMessage(LIZ().obtainMessage(104, jSONObject));
                        }
                    }
                    if (!linkedHashSet.isEmpty()) {
                        LIZJ(linkedHashSet);
                        if (LJ.compareAndSet(false, true)) {
                            new PthreadThread() { // from class: X.8x5
                                public final void LIZLLL() {
                                    long lastActiveTime = AppLog.getLastActiveTime();
                                    while (System.currentTimeMillis() - lastActiveTime < 60000) {
                                        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                                        synchronized (CommandDispatcher.this.LIZ) {
                                            linkedHashSet2.addAll(CommandDispatcher.this.LIZ);
                                        }
                                        if (linkedHashSet2.isEmpty()) {
                                            break;
                                        }
                                        StringBuilder sb = new StringBuilder();
                                        Iterator it2 = linkedHashSet2.iterator();
                                        while (it2.hasNext()) {
                                            long longValue = ((Long) it2.next()).longValue();
                                            if (longValue > 0) {
                                                sb.append(longValue);
                                                sb.append(",");
                                            }
                                        }
                                        if (sb.length() == 0) {
                                            break;
                                        }
                                        try {
                                            if (!LJ(sb.substring(0, sb.length() - 1)).booleanValue()) {
                                                break;
                                            }
                                            synchronized (CommandDispatcher.this.LIZ) {
                                                CommandDispatcher.this.LIZ.removeAll(linkedHashSet2);
                                            }
                                            try {
                                                Thread.sleep(10000L);
                                            } catch (InterruptedException e) {
                                                C16880lQ.LLLLIIL(e);
                                            }
                                        } catch (Exception e2) {
                                            C16880lQ.LLLLIIL(e2);
                                        }
                                    }
                                    CommandDispatcher.LJ.set(false);
                                }

                                @Override // java.lang.Thread, java.lang.Runnable
                                public final void run() {
                                    boolean LIZ;
                                    try {
                                        LIZLLL();
                                    } finally {
                                        if (LIZ) {
                                        }
                                    }
                                }

                                {
                                    super("CommandDispatcher$CommandFeedbackThread");
                                }

                                public static Boolean LJ(String str2) {
                                    if (C38354F3m.LJ(str2)) {
                                        return Boolean.FALSE;
                                    }
                                    try {
                                        String str3 = ((CommandDispatcher.CommandDispatcherApi) RetrofitFactory.LIZLLL().LIZ(EFJ.LIZJ).LJFF().LIZ.LIZ(CommandDispatcher.CommandDispatcherApi.class)).doPost(CommandDispatcher.LIZLLL, C03660Ck.LIZJ("command_ids", str2)).get();
                                        if (str3 == null || str3.length() == 0) {
                                            return Boolean.FALSE;
                                        }
                                        return Boolean.valueOf("success".equals(JSONObjectProtectorUtils.getString(new JSONObject(str3), "message")));
                                    } catch (ExecutionException e) {
                                        throw e.getCause();
                                    }
                                }
                            }.start();
                        }
                    }
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        }
    }

    public final void LIZJ(LinkedHashSet<Long> linkedHashSet) {
        if (linkedHashSet.isEmpty()) {
            return;
        }
        synchronized (this.LIZ) {
            linkedHashSet.addAll(this.LIZ);
        }
        int size = linkedHashSet.size() - 100;
        Iterator<Long> it = linkedHashSet.iterator();
        int i = 0;
        while (it.hasNext()) {
            Long next = it.next();
            if (i > size) {
                break;
            }
            linkedHashSet.remove(next);
            i++;
        }
        synchronized (this.LIZ) {
            this.LIZ.addAll(linkedHashSet);
        }
    }
}
