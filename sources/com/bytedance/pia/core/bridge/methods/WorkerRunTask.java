package com.bytedance.pia.core.bridge.methods;

import X.BQ6;
import X.C37364ElU;
import X.C37394Ely;
import X.C37399Em3;
import X.C37400Em4;
import X.C37403Em7;
import X.C37441Emj;
import X.C37449Emr;
import X.C37463En5;
import X.C37558Eoc;
import X.C37561Eof;
import X.C37613EpV;
import X.EnumC37404Em8;
import X.InterfaceC37405Em9;
import X.InterfaceC37408EmC;
import X.InterfaceC65349Pkn;
import X.RunnableC28744BPw;
import X.X1D;
import android.text.TextUtils;
import com.bytedance.pia.core.bridge.methods.WorkerRunTask;
import com.google.gson.j;
import com.google.gson.l;
import com.google.gson.m;
import java.lang.ref.WeakReference;

/* loaded from: classes7.dex */
public final class WorkerRunTask implements InterfaceC37405Em9<Params, Result> {
    public static final C37403Em7<Params, Result> LIZ = new C37403Em7<>("pia.internal.worker.runTask", EnumC37404Em8.Render, new InterfaceC37408EmC() { // from class: X.En1
        @Override // X.InterfaceC37408EmC
        public final Object create() {
            return new WorkerRunTask();
        }

        @Override // X.InterfaceC37408EmC
        public final Object LIZ(Object obj) {
            return create();
        }
    });

    /* loaded from: classes7.dex */
    public static class Params {

        @InterfaceC65349Pkn("execute_time_limit")
        public Long executeTimeLimit;

        @InterfaceC65349Pkn("location")
        public String location;

        @InterfaceC65349Pkn("name")
        public String name;

        @InterfaceC65349Pkn("params")
        public j params;

        @InterfaceC65349Pkn("url")
        public String url;
    }

    /* loaded from: classes7.dex */
    public static class Result {

        @InterfaceC65349Pkn("result")
        public final m result;

        public Result(m mVar) {
            this.result = mVar;
        }
    }

    @Override // X.InterfaceC37405Em9
    public final void LIZ(C37449Emr c37449Emr, Object obj, final C37399Em3 c37399Em3, final C37400Em4 c37400Em4) {
        String str;
        long j;
        Params params = (Params) obj;
        if (params.url == null) {
            C37364ElU.LIZ("Parameter 'url' is required!", c37400Em4);
            return;
        }
        if (!TextUtils.isEmpty(params.name)) {
            str = params.name;
        } else {
            str = "RunTask";
        }
        Long l = params.executeTimeLimit;
        if (l != null) {
            if (l.longValue() >= 0 && params.executeTimeLimit.longValue() <= 600) {
                j = params.executeTimeLimit.longValue();
            } else {
                C37364ElU.LIZ("Parameter 'execute_time_limit' should be in range 0~600!", c37400Em4);
                return;
            }
        } else {
            j = 30;
        }
        Object obj2 = params.params;
        if (obj2 == null || (obj2 instanceof l)) {
            obj2 = new m();
        } else if (!(obj2 instanceof m)) {
            C37364ElU.LIZ("Parameters 'params' must be an object!", c37400Em4);
            return;
        }
        C37463En5 c37463En5 = c37449Emr.LIZIZ;
        C37441Emj c37441Emj = new C37441Emj();
        c37441Emj.LIZJ = c37463En5;
        c37441Emj.LJII = str;
        c37441Emj.LIZ = params.location;
        c37441Emj.LIZIZ = params.url;
        c37441Emj.LJ = new BQ6() { // from class: X.Emx
            @Override // X.BQ6
            public final void accept(Object obj3) {
                c37399Em3.accept(new WorkerRunTask.Result((m) obj3));
            }
        };
        c37441Emj.LJIIIIZZ = c37463En5.LJIIL;
        C37561Eof LIZ2 = c37441Emj.LIZ();
        if (LIZ2 == null) {
            c37400Em4.accept(new C37394Ely(-10001));
            return;
        }
        Object obj3 = c37463En5.get(LIZ2.LIZJ);
        if (obj3 instanceof String) {
            Object obj4 = c37463En5.get((String) obj3);
            if ((obj4 instanceof C37558Eoc) && ((C37558Eoc) obj4).LIZ()) {
                c37400Em4.accept(new C37394Ely(-10005));
                return;
            }
        }
        try {
            final C37558Eoc c37558Eoc = new C37558Eoc(LIZ2);
            String LIZJ = c37449Emr.LIZIZ.LIZJ(c37558Eoc);
            C37463En5 c37463En52 = c37449Emr.LIZIZ;
            String uri = c37558Eoc.LJII.toString();
            if (TextUtils.isEmpty(uri)) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("javascript:");
                LIZ3.append(c37558Eoc.LJIIIIZZ);
                uri = X1D.LIZIZ(LIZ3);
            }
            c37463En52.LIZ(LIZJ, uri);
            C37613EpV.LIZ().postDelayed(new RunnableC28744BPw(new WeakReference(c37449Emr.LIZIZ), LIZJ, c37400Em4), j * 1000);
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("!function(a){globalThis._pia_task_={params:a,callback:function(a){NativeModules.get(\"BaseModule\").terminateWithResult(a)}}}(");
            LIZ4.append(obj2);
            LIZ4.append(")");
            c37558Eoc.LIZIZ(X1D.LIZIZ(LIZ4));
            c37558Eoc.LJFF();
            c37558Eoc.LIZJ.LIZJ(new BQ6() { // from class: X.ElP
                @Override // X.BQ6
                public final void accept(Object obj5) {
                    StringBuilder LIZ5 = X1D.LIZ();
                    LIZ5.append("[RunTask] unhandled message: ");
                    LIZ5.append(obj5);
                    C37238EjS.LJFF(X1D.LIZIZ(LIZ5));
                }
            });
            c37558Eoc.LJ(new BQ6() { // from class: X.Elv
                @Override // X.BQ6
                public final void accept(Object obj5) {
                    BQ6 bq6 = c37400Em4;
                    C37558Eoc c37558Eoc2 = c37558Eoc;
                    bq6.accept(new C37394Ely(-10007, (String) obj5));
                    c37558Eoc2.LJI(null);
                }
            });
        } catch (Throwable th) {
            if (th instanceof C37394Ely) {
                c37400Em4.accept(th);
            } else {
                c37400Em4.accept(new C37394Ely(th.toString()));
            }
        }
    }
}
