package com.ss.android.message.log;

import X.C16880lQ;
import X.C35532Dx2;
import X.C38413F5t;
import X.C66163Pxv;
import X.C84763XOl;
import X.QP5;
import X.QP8;
import X.QP9;
import X.QPB;
import X.QPG;
import X.QQS;
import X.X1D;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import com.bytedance.common.utility.collection.WeakHandler;
import java.util.ArrayList;
import org.json.JSONArray;

/* loaded from: classes12.dex */
public class LogService extends Service implements WeakHandler.IHandler {
    public Messenger LJLIL;

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onCreate ");
        LIZ.append(this);
        X1D.LIZIZ(LIZ);
        try {
            QP9 qp9 = (QP9) QPG.LIZ(QP9.class);
            if (qp9 != null) {
                qp9.LJIJ();
            }
        } catch (Throwable unused) {
        }
        QP5.LIZ().getClass();
        this.LJLIL = new Messenger(new WeakHandler(QP5.LJLJI.getLooper(), this));
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        if (!C84763XOl.LJIIJJI && C38413F5t.LIZ("serviceAttachBaseContext")) {
            C35532Dx2.LIZJ();
        }
        super.attachBaseContext(context);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        QPB qpb;
        Messenger messenger;
        long[] longArray;
        try {
            try {
                qpb = QPB.LIZIZ(this);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                qpb = null;
            }
            int i = message.what;
            if (i == 0) {
                Messenger messenger2 = message.replyTo;
                if (messenger2 != null) {
                    long j = ((Bundle) message.obj).getLong("start_id", 0L);
                    if (qpb == null) {
                        messenger2.send(Message.obtain((Handler) null, 2));
                        return;
                    }
                    JSONArray LIZ = qpb.LIZ(j);
                    if (LIZ == null) {
                        messenger2.send(Message.obtain((Handler) null, 2));
                        return;
                    }
                    Message obtain = Message.obtain((Handler) null, 0);
                    Bundle bundle = new Bundle();
                    bundle.putString("events", LIZ.toString());
                    if (LIZ.length() >= 5) {
                        bundle.putBoolean("has_more", true);
                    } else {
                        bundle.putBoolean("has_more", false);
                    }
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("events = ");
                    LIZ2.append(C16880lQ.LLJJIII(bundle, "events"));
                    LIZ2.append(" has_more = ");
                    LIZ2.append(C16880lQ.LLJJIII(bundle, "has_more"));
                    X1D.LIZIZ(LIZ2);
                    obtain.obj = bundle;
                    messenger2.send(obtain);
                    return;
                }
                return;
            }
            if (i != 1 || (messenger = message.replyTo) == null || (longArray = ((Bundle) message.obj).getLongArray("event_ids")) == null) {
                return;
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("event_ids = ");
            ArrayList arrayList = new ArrayList();
            for (long j2 : longArray) {
                arrayList.add(Long.valueOf(j2));
            }
            LIZ3.append(arrayList);
            X1D.LIZIZ(LIZ3);
            if (qpb == null) {
                messenger.send(Message.obtain((Handler) null, 2));
                return;
            }
            for (long j3 : longArray) {
                synchronized (qpb) {
                    SQLiteDatabase sQLiteDatabase = qpb.LIZ;
                    if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                        qpb.LIZ.delete("event", "_id = ?", new String[]{String.valueOf(j3)});
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onBind ");
        LIZ.append(this);
        X1D.LIZIZ(LIZ);
        return this.LJLIL.getBinder();
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onUnBind ");
        LIZ.append(this);
        X1D.LIZIZ(LIZ);
        return super.onUnbind(intent);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        C66163Pxv.LIZ(this, intent, i, i2);
        int onStartCommand = super.onStartCommand(intent, i, i2);
        QQS LIZ = QP8.LIZ();
        if (LIZ == null || LIZ.LJ()) {
            return 2;
        }
        return onStartCommand;
    }
}
