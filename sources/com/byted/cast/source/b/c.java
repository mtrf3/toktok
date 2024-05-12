package com.byted.cast.source.b;

import X.C16880lQ;
import X.X1D;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.byted.cast.common.Logger;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Vector;

/* loaded from: classes29.dex */
public class c {
    public String a;
    public d b;
    public HandlerThread c;

    /* loaded from: classes29.dex */
    public static class b {
        public c a;
        public long b;
        public int c;
        public String d;
        public com.byted.cast.source.b.a e;
        public com.byted.cast.source.b.a f;
        public com.byted.cast.source.b.a g;

        public b(c cVar, Message message, String str, com.byted.cast.source.b.a aVar, com.byted.cast.source.b.a aVar2, com.byted.cast.source.b.a aVar3) {
            a(cVar, message, str, aVar, aVar2, aVar3);
        }

        public void a(c cVar, Message message, String str, com.byted.cast.source.b.a aVar, com.byted.cast.source.b.a aVar2, com.byted.cast.source.b.a aVar3) {
            this.a = cVar;
            this.b = System.currentTimeMillis();
            this.c = message != null ? message.what : 0;
            this.d = str;
            this.e = aVar;
            this.f = aVar2;
            this.g = aVar3;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("time=");
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(this.b);
            sb.append(C16880lQ.LLLZ("%tm-%td %tH:%tM:%tS.%tL", new Object[]{calendar, calendar, calendar, calendar, calendar, calendar}));
            sb.append(" processed=");
            com.byted.cast.source.b.a aVar = this.e;
            sb.append(aVar == null ? "<null>" : aVar.a());
            sb.append(" org=");
            com.byted.cast.source.b.a aVar2 = this.f;
            sb.append(aVar2 == null ? "<null>" : aVar2.a());
            sb.append(" dest=");
            com.byted.cast.source.b.a aVar3 = this.g;
            sb.append(aVar3 != null ? aVar3.a() : "<null>");
            sb.append(" what=");
            c cVar = this.a;
            String a = cVar != null ? cVar.a(this.c) : "";
            if (TextUtils.isEmpty(a)) {
                sb.append(this.c);
                sb.append("(0x");
                sb.append(Integer.toHexString(this.c));
                a = ")";
            }
            sb.append(a);
            if (!TextUtils.isEmpty(this.d)) {
                sb.append(" ");
                sb.append(this.d);
            }
            return sb.toString();
        }
    }

    /* renamed from: com.byted.cast.source.b.c$c, reason: collision with other inner class name */
    /* loaded from: classes29.dex */
    public static class C0015c {
        public Vector<b> a;
        public int b;
        public int c;
        public int d;
        public boolean e;

        public C0015c() {
            this.a = new Vector<>();
            this.b = 20;
            this.c = 0;
            this.d = 0;
            this.e = false;
        }

        public synchronized void a() {
            this.a.clear();
        }

        public synchronized void a(c cVar, Message message, String str, com.byted.cast.source.b.a aVar, com.byted.cast.source.b.a aVar2, com.byted.cast.source.b.a aVar3) {
            this.d++;
            if (this.a.size() < this.b) {
                this.a.add(new b(cVar, message, str, aVar, aVar2, aVar3));
            } else {
                b bVar = this.a.get(this.c);
                int i = this.c + 1;
                this.c = i;
                if (i >= this.b) {
                    this.c = 0;
                }
                bVar.a(cVar, message, str, aVar, aVar2, aVar3);
            }
        }

        public synchronized boolean b() {
            return this.e;
        }
    }

    /* loaded from: classes29.dex */
    public static class d extends Handler {
        public static final Object q = new Object();
        public boolean a;
        public boolean b;
        public Message c;
        public C0015c d;
        public boolean e;
        public C0016c[] f;
        public int g;
        public C0016c[] h;
        public int i;
        public a j;
        public b k;
        public c l;
        public HashMap<com.byted.cast.source.b.b, C0016c> m;

        /* renamed from: n, reason: collision with root package name */
        public com.byted.cast.source.b.b f113n;
        public com.byted.cast.source.b.b o;
        public ArrayList<Message> p;

        /* loaded from: classes29.dex */
        public class b extends com.byted.cast.source.b.b {
            public b(d dVar) {
            }

            @Override // com.byted.cast.source.b.b
            public boolean a(Message message) {
                return false;
            }
        }

        /* renamed from: com.byted.cast.source.b.c$d$c, reason: collision with other inner class name */
        /* loaded from: classes29.dex */
        public class C0016c {
            public com.byted.cast.source.b.b a;
            public C0016c b;
            public boolean c;

            public C0016c(d dVar) {
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("state=");
                sb.append(this.a.a());
                sb.append(",active=");
                sb.append(this.c);
                sb.append(",parent=");
                C0016c c0016c = this.b;
                sb.append(c0016c == null ? "null" : c0016c.a.a());
                return sb.toString();
            }
        }

        private final void a(int i) {
            while (i <= this.g) {
                if (this.b) {
                    c cVar = this.l;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("invokeEnterMethods: ");
                    LIZ.append(this.f[i].a.a());
                    cVar.a(X1D.LIZIZ(LIZ));
                }
                this.f[i].a.b();
                this.f[i].c = true;
                i++;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void a(Message message) {
            if (this.b) {
                c cVar = this.l;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("deferMessage: msg=");
                LIZ.append(message.what);
                cVar.a(X1D.LIZIZ(LIZ));
            }
            Message obtainMessage = obtainMessage();
            obtainMessage.copyFrom(message);
            this.p.add(obtainMessage);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void a(com.byted.cast.source.b.a aVar) {
            this.o = (com.byted.cast.source.b.b) aVar;
            if (this.b) {
                c cVar = this.l;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("transitionTo: destState=");
                LIZ.append(this.o.a());
                cVar.a(X1D.LIZIZ(LIZ));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void a(com.byted.cast.source.b.b bVar) {
            if (this.b) {
                c cVar = this.l;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("setInitialState: initialState=");
                LIZ.append(bVar.a());
                cVar.a(X1D.LIZIZ(LIZ));
            }
            this.f113n = bVar;
        }

        private void a(com.byted.cast.source.b.b bVar, Message message) {
            com.byted.cast.source.b.b bVar2 = this.f[this.g].a;
            boolean z = this.l.d(this.c) && message.obj != q;
            if (!this.d.b() ? z : this.o != null) {
                C0015c c0015c = this.d;
                c cVar = this.l;
                Message message2 = this.c;
                c0015c.a(cVar, message2, cVar.b(message2), bVar, bVar2, this.o);
            }
            com.byted.cast.source.b.b bVar3 = this.o;
            if (bVar3 != null) {
                while (true) {
                    if (this.b) {
                        this.l.a("handleMessage: new destination call exit/enter");
                    }
                    a(b(bVar3));
                    a(d());
                    c();
                    com.byted.cast.source.b.b bVar4 = this.o;
                    if (bVar3 == bVar4) {
                        break;
                    } else {
                        bVar3 = bVar4;
                    }
                }
                this.o = null;
                if (bVar3 != null) {
                    if (bVar3 == this.k) {
                        this.l.b();
                        a();
                    } else if (bVar3 == this.j) {
                        this.l.a();
                    }
                }
            }
        }

        private final void a(C0016c c0016c) {
            C0016c c0016c2;
            while (true) {
                int i = this.g;
                if (i < 0 || (c0016c2 = this.f[i]) == c0016c) {
                    return;
                }
                com.byted.cast.source.b.b bVar = c0016c2.a;
                if (this.b) {
                    c cVar = this.l;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("invokeExitMethods: ");
                    LIZ.append(bVar.a());
                    cVar.a(X1D.LIZIZ(LIZ));
                }
                bVar.c();
                C0016c[] c0016cArr = this.f;
                int i2 = this.g;
                c0016cArr[i2].c = false;
                this.g = i2 - 1;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void a(boolean z) {
            this.b = z;
        }

        private final C0016c b(com.byted.cast.source.b.b bVar) {
            this.i = 0;
            C0016c c0016c = this.m.get(bVar);
            do {
                C0016c[] c0016cArr = this.h;
                int i = this.i;
                this.i = i + 1;
                c0016cArr[i] = c0016c;
                c0016c = c0016c.b;
                if (c0016c == null) {
                    break;
                }
            } while (!c0016c.c);
            if (this.b) {
                c cVar = this.l;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("setupTempStateStackWithStatesToEnter: X mTempStateStackCount=");
                LIZ.append(this.i);
                LIZ.append(",curStateInfo: ");
                LIZ.append(c0016c);
                cVar.a(X1D.LIZIZ(LIZ));
            }
            return c0016c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void b() {
            if (this.b) {
                this.l.a("completeConstruction: E");
            }
            int i = 0;
            for (C0016c c0016c : this.m.values()) {
                int i2 = 0;
                while (c0016c != null) {
                    c0016c = c0016c.b;
                    i2++;
                }
                if (i < i2) {
                    i = i2;
                }
            }
            if (this.b) {
                c cVar = this.l;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("completeConstruction: maxDepth=");
                LIZ.append(i);
                cVar.a(X1D.LIZIZ(LIZ));
            }
            this.f = new C0016c[i];
            this.h = new C0016c[i];
            f();
            sendMessageAtFrontOfQueue(obtainMessage(-2, q));
            if (this.b) {
                this.l.a("completeConstruction: X");
            }
        }

        private final boolean b(Message message) {
            return message.what == -1 && message.obj == q;
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x0030, code lost:
        
            if (r3 != null) goto L9;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final com.byted.cast.source.b.b c(android.os.Message r6) {
            /*
                r5 = this;
                com.byted.cast.source.b.c$d$c[] r1 = r5.f
                int r0 = r5.g
                r3 = r1[r0]
                boolean r0 = r5.b
                java.lang.String r4 = "processMsg: "
                if (r0 == 0) goto L25
                com.byted.cast.source.b.c r2 = r5.l
                java.lang.StringBuilder r1 = X.X1D.LIZ()
                r1.append(r4)
                com.byted.cast.source.b.b r0 = r3.a
                java.lang.String r0 = r0.a()
                r1.append(r0)
                java.lang.String r0 = X.X1D.LIZIZ(r1)
                r2.a(r0)
            L25:
                boolean r0 = r5.b(r6)
                if (r0 == 0) goto L35
                com.byted.cast.source.b.c$d$b r0 = r5.k
                r5.a(r0)
                if (r3 == 0) goto L46
            L32:
                com.byted.cast.source.b.b r0 = r3.a
            L34:
                return r0
            L35:
                com.byted.cast.source.b.b r0 = r3.a
                boolean r0 = r0.a(r6)
                if (r0 != 0) goto L32
                com.byted.cast.source.b.c$d$c r3 = r3.b
                if (r3 != 0) goto L48
                com.byted.cast.source.b.c r0 = r5.l
                r0.e(r6)
            L46:
                r0 = 0
                goto L34
            L48:
                boolean r0 = r5.b
                if (r0 == 0) goto L35
                com.byted.cast.source.b.c r2 = r5.l
                java.lang.StringBuilder r1 = X.X1D.LIZ()
                r1.append(r4)
                com.byted.cast.source.b.b r0 = r3.a
                java.lang.String r0 = r0.a()
                r1.append(r0)
                java.lang.String r0 = X.X1D.LIZIZ(r1)
                r2.a(r0)
                goto L35
            */
            throw new UnsupportedOperationException("Method not decompiled: com.byted.cast.source.b.c.d.c(android.os.Message):com.byted.cast.source.b.b");
        }

        private final void c() {
            for (int size = this.p.size() - 1; size >= 0; size--) {
                Message message = (Message) ListProtector.get(this.p, size);
                if (this.b) {
                    c cVar = this.l;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("moveDeferredMessageAtFrontOfQueue; what=");
                    LIZ.append(message.what);
                    cVar.a(X1D.LIZIZ(LIZ));
                }
                sendMessageAtFrontOfQueue(message);
            }
            this.p.clear();
        }

        private final int d() {
            int i = this.g + 1;
            int i2 = i;
            for (int i3 = this.i - 1; i3 >= 0; i3--) {
                if (this.b) {
                    c cVar = this.l;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("moveTempStackToStateStack: i=");
                    LIZ.append(i3);
                    LIZ.append(",j=");
                    LIZ.append(i2);
                    cVar.a(X1D.LIZIZ(LIZ));
                }
                this.f[i2] = this.h[i3];
                i2++;
            }
            this.g = i2 - 1;
            if (this.b) {
                c cVar2 = this.l;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("moveTempStackToStateStack: X mStateStackTop=");
                LIZ2.append(this.g);
                LIZ2.append(",startingIndex=");
                LIZ2.append(i);
                LIZ2.append(",Top=");
                LIZ2.append(this.f[this.g].a.a());
                cVar2.a(X1D.LIZIZ(LIZ2));
            }
            return i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void e() {
            if (this.b) {
                this.l.a("quit:");
            }
            sendMessage(obtainMessage(-1, q));
        }

        private final void f() {
            if (this.b) {
                c cVar = this.l;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("setupInitialStateStack: E mInitialState=");
                LIZ.append(this.f113n.a());
                cVar.a(X1D.LIZIZ(LIZ));
            }
            C0016c c0016c = this.m.get(this.f113n);
            this.i = 0;
            while (c0016c != null) {
                C0016c[] c0016cArr = this.h;
                int i = this.i;
                c0016cArr[i] = c0016c;
                c0016c = c0016c.b;
                this.i = i + 1;
            }
            this.g = -1;
            d();
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            com.byted.cast.source.b.b bVar;
            c cVar;
            if (this.a) {
                return;
            }
            if (this.b) {
                c cVar2 = this.l;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("handleMessage: E msg.what=");
                LIZ.append(message.what);
                cVar2.a(X1D.LIZIZ(LIZ));
            }
            this.c = message;
            if (this.e) {
                bVar = c(message);
            } else {
                if (message.what != -2 || message.obj != q) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("StateMachine.handleMessage: The start method not called, received msg: ");
                    LIZ2.append(message);
                    throw new RuntimeException(X1D.LIZIZ(LIZ2));
                }
                this.e = true;
                a(0);
                bVar = null;
            }
            a(bVar, message);
            if (!this.b || (cVar = this.l) == null) {
                return;
            }
            cVar.a("handleMessage: X");
        }

        private final void a() {
            if (this.l.c != null) {
                getLooper().quit();
                this.l.c = null;
            }
            this.l.b = null;
            this.l = null;
            this.c = null;
            this.d.a();
            this.f = null;
            this.h = null;
            this.m.clear();
            this.f113n = null;
            this.o = null;
            this.p.clear();
            this.a = true;
        }

        /* loaded from: classes29.dex */
        public class a extends com.byted.cast.source.b.b {
            public a() {
            }

            @Override // com.byted.cast.source.b.b
            public boolean a(Message message) {
                d.this.l.c(message);
                return true;
            }
        }

        public d(Looper looper, c cVar) {
            super(looper);
            this.a = false;
            this.b = false;
            this.d = new C0015c();
            this.g = -1;
            this.j = new a();
            this.k = new b(this);
            this.m = new HashMap<>();
            this.p = new ArrayList<>();
            this.l = cVar;
            a(this.j, (com.byted.cast.source.b.b) null);
            a(this.k, (com.byted.cast.source.b.b) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final C0016c a(com.byted.cast.source.b.b bVar, com.byted.cast.source.b.b bVar2) {
            C0016c c0016c;
            String a2;
            if (this.b) {
                c cVar = this.l;
                StringBuilder sb = new StringBuilder("addStateInternal: E state=");
                sb.append(bVar.a());
                sb.append(",parent=");
                if (bVar2 == null) {
                    a2 = "";
                } else {
                    a2 = bVar2.a();
                }
                sb.append(a2);
                cVar.a(sb.toString());
            }
            if (bVar2 != null) {
                c0016c = this.m.get(bVar2);
                if (c0016c == null) {
                    c0016c = a(bVar2, (com.byted.cast.source.b.b) null);
                }
            } else {
                c0016c = null;
            }
            C0016c c0016c2 = this.m.get(bVar);
            if (c0016c2 == null) {
                c0016c2 = new C0016c(this);
                this.m.put(bVar, c0016c2);
            }
            C0016c c0016c3 = c0016c2.b;
            if (c0016c3 == null || c0016c3 == c0016c) {
                c0016c2.a = bVar;
                c0016c2.b = c0016c;
                c0016c2.c = false;
                if (this.b) {
                    c cVar2 = this.l;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("addStateInternal: X stateInfo: ");
                    LIZ.append(c0016c2);
                    cVar2.a(X1D.LIZIZ(LIZ));
                }
                return c0016c2;
            }
            throw new RuntimeException("state already added");
        }
    }

    public c(String str) {
        HandlerThread handlerThread = new HandlerThread(str);
        this.c = handlerThread;
        handlerThread.start();
        a(str, this.c.getLooper());
    }

    public final Message a(int i, Object obj) {
        return Message.obtain(this.b, i, obj);
    }

    public String a(int i) {
        return null;
    }

    public void a() {
    }

    public final void a(Message message) {
        this.b.a(message);
    }

    public final void a(Message message, long j) {
        d dVar = this.b;
        if (dVar == null) {
            return;
        }
        dVar.sendMessageDelayed(message, j);
    }

    public final void a(com.byted.cast.source.b.a aVar) {
        this.b.a(aVar);
    }

    public final void a(com.byted.cast.source.b.b bVar) {
        this.b.a(bVar);
    }

    public final void a(com.byted.cast.source.b.b bVar, com.byted.cast.source.b.b bVar2) {
        this.b.a(bVar, bVar2);
    }

    public void a(String str) {
        Logger.d(this.a, str);
    }

    public void a(boolean z) {
        d dVar = this.b;
        if (dVar == null) {
            return;
        }
        dVar.a(z);
    }

    public String b(Message message) {
        return "";
    }

    public void b() {
    }

    public final void b(int i) {
        d dVar = this.b;
        if (dVar == null) {
            return;
        }
        dVar.removeMessages(i);
    }

    public void b(String str) {
        Logger.e(this.a, str);
    }

    public final void c() {
        d dVar = this.b;
        if (dVar == null) {
            return;
        }
        dVar.e();
    }

    public void c(Message message) {
    }

    public void d() {
        d dVar = this.b;
        if (dVar == null) {
            return;
        }
        dVar.b();
    }

    public boolean d(Message message) {
        return true;
    }

    public void e(Message message) {
        if (this.b.b) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(" - unhandledMessage: msg.what=");
            LIZ.append(message.what);
            b(X1D.LIZIZ(LIZ));
        }
    }

    private void a(String str, Looper looper) {
        this.a = str;
        this.b = new d(looper, this);
    }
}
