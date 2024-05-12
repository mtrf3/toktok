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
import X.EnumC37404Em8;
import X.InterfaceC37405Em9;
import X.InterfaceC37408EmC;
import X.InterfaceC65349Pkn;
import com.bytedance.pia.core.bridge.methods.WorkerCreate;
import com.google.gson.m;

/* loaded from: classes7.dex */
public final class WorkerCreate implements InterfaceC37405Em9<Params, Result> {
    public static final C37403Em7<Params, Result> LIZ = new C37403Em7<>("pia.internal.worker.create", EnumC37404Em8.Render, new InterfaceC37408EmC() { // from class: X.En0
        @Override // X.InterfaceC37408EmC
        public final Object create() {
            return new WorkerCreate();
        }

        @Override // X.InterfaceC37408EmC
        public final Object LIZ(Object obj) {
            return create();
        }
    });

    /* loaded from: classes7.dex */
    public static class Params {

        @InterfaceC65349Pkn("location")
        public String location;

        @InterfaceC65349Pkn("name")
        public String name;

        @InterfaceC65349Pkn("url")
        public String url;
    }

    /* loaded from: classes7.dex */
    public static class Result {

        @InterfaceC65349Pkn("worker")
        public final String worker;

        public Result(String str) {
            this.worker = str;
        }
    }

    @Override // X.InterfaceC37405Em9
    public final void LIZ(final C37449Emr c37449Emr, Object obj, C37399Em3 c37399Em3, C37400Em4 c37400Em4) {
        Params params = (Params) obj;
        String str = params.url;
        if (str == null) {
            C37364ElU.LIZ("Parameter 'url' is required!", c37400Em4);
            return;
        }
        C37463En5 c37463En5 = c37449Emr.LIZIZ;
        C37441Emj c37441Emj = new C37441Emj();
        c37441Emj.LIZJ = c37463En5;
        c37441Emj.LJII = params.name;
        c37441Emj.LIZ = params.location;
        c37441Emj.LIZIZ = str;
        c37441Emj.LJIIIIZZ = c37463En5.LJIIL;
        C37561Eof LIZ2 = c37441Emj.LIZ();
        if (LIZ2 == null) {
            c37400Em4.accept(new C37394Ely(-10001));
            return;
        }
        try {
            C37558Eoc c37558Eoc = new C37558Eoc(LIZ2);
            c37558Eoc.LJFF();
            final String LIZJ = c37463En5.LIZJ(c37558Eoc);
            if (LIZJ == null) {
                c37400Em4.accept(new C37394Ely(-10002));
            } else {
                c37558Eoc.LIZJ.LIZJ(new BQ6() { // from class: X.Emy
                    @Override // X.BQ6
                    public final void accept(Object obj2) {
                        InterfaceC37460En2 interfaceC37460En2 = c37449Emr;
                        final String str2 = LIZJ;
                        final m mVar = (m) obj2;
                        if (mVar == null) {
                            return;
                        }
                        interfaceC37460En2.LIZ(new Object(str2, mVar) { // from class: com.bytedance.pia.core.bridge.methods.WorkerOnMessage$Params

                            @InterfaceC65349Pkn("message")
                            public m message;

                            @InterfaceC65349Pkn("worker")
                            public String worker;

                            {
                                this.worker = str2;
                                this.message = mVar;
                            }
                        }, "pia.internal.worker.onMessage");
                    }
                });
                c37558Eoc.LJ(new BQ6() { // from class: X.Emz
                    @Override // X.BQ6
                    public final void accept(Object obj2) {
                        InterfaceC37460En2 interfaceC37460En2 = c37449Emr;
                        final String str2 = LIZJ;
                        final String str3 = (String) obj2;
                        if (str3 == null) {
                            return;
                        }
                        interfaceC37460En2.LIZ(new Object(str2, str3) { // from class: com.bytedance.pia.core.bridge.methods.WorkerOnError$Params

                            @InterfaceC65349Pkn("error")
                            public String error;

                            @InterfaceC65349Pkn("worker")
                            public String worker;

                            {
                                this.worker = str2;
                                this.error = str3;
                            }
                        }, "pia.internal.worker.onError");
                    }
                });
                c37399Em3.accept(new Result(LIZJ));
            }
        } catch (Throwable th) {
            if (th instanceof C37394Ely) {
                c37400Em4.accept(th);
            } else {
                c37400Em4.accept(new C37394Ely(-10002, th.toString()));
            }
        }
    }
}
