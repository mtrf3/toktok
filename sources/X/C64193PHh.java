package X;

/* renamed from: X.PHh, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64193PHh extends AbstractRunnableC64070PCo {
    public final /* synthetic */ C64192PHg LJLJJI;

    public final void LIZ() {
        long j;
        long j2;
        double d;
        C46626IRq c46626IRq;
        EnumC64201PHp enumC64201PHp;
        if (C09970aH.LJII()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("run: ");
            LIZ.append(this.LJLJJI.LIZLLL);
            C64028PAy.LIZ("APM-CPU", X1D.LIZIZ(LIZ));
        }
        C64192PHg c64192PHg = this.LJLJJI;
        boolean LIZIZ = C64156PFw.LIZ.LIZIZ();
        C64200PHo c64200PHo = c64192PHg.LJII;
        if (LIZIZ) {
            j = c64200PHo.LIZJ;
        } else {
            j = c64200PHo.LIZLLL;
        }
        c64192PHg.LIZLLL = j * 1000;
        if (LIZIZ) {
            j2 = c64200PHo.LJFF;
        } else {
            j2 = c64200PHo.LJI;
        }
        c64192PHg.LJ = j2 * 1000;
        C64192PHg c64192PHg2 = this.LJLJJI;
        if (!c64192PHg2.LJIIIZ) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - c64192PHg2.LJFF >= c64192PHg2.LIZLLL) {
                c64192PHg2.LJFF = currentTimeMillis;
                if (FQS.LIZIZ() > 0) {
                    C64125PEr.LIZLLL().getClass();
                    long LIZ2 = FQS.LIZ();
                    C64125PEr.LIZLLL().getClass();
                    long LIZJ = C64125PEr.LIZJ();
                    try {
                        Thread.sleep(360L);
                        C64125PEr.LIZLLL().getClass();
                        long LIZ3 = FQS.LIZ();
                        C64125PEr.LIZLLL().getClass();
                        long LIZJ2 = C64125PEr.LIZJ() - LIZJ;
                        if (LIZJ2 > 0) {
                            d = (((float) LIZ3) - ((float) LIZ2)) / ((float) LIZJ2);
                            StringBuilder LIZ4 = X1D.LIZ();
                            LIZ4.append("appCpuRate -> ");
                            LIZ4.append(d);
                            X1D.LIZIZ(LIZ4);
                        } else {
                            d = -1.0d;
                        }
                        double d2 = (LIZ3 - LIZ2) * 1000.0d;
                        double currentTimeMillis2 = (d2 / (System.currentTimeMillis() - currentTimeMillis)) / FQS.LIZLLL();
                        if (C09970aH.LJII()) {
                            StringBuilder LIZ5 = X1D.LIZ();
                            LIZ5.append(String.valueOf(d2));
                            LIZ5.append(" ");
                            LIZ5.append(System.currentTimeMillis() - currentTimeMillis);
                            LIZ5.append(" ");
                            LIZ5.append(FQS.LIZLLL());
                            C64028PAy.LIZ("APM-CPU", X1D.LIZIZ(LIZ5));
                        }
                        if (C09970aH.LJII()) {
                            StringBuilder LIZ6 = X1D.LIZ();
                            LIZ6.append("appCpuSpeed -> ");
                            LIZ6.append(currentTimeMillis2);
                            X1D.LIZIZ(LIZ6);
                            StringBuilder LIZ7 = X1D.LIZ();
                            LIZ7.append("collect cpu data, rate: ");
                            LIZ7.append(d);
                            LIZ7.append(" speed: ");
                            LIZ7.append(currentTimeMillis2);
                            C64028PAy.LIZ("APM-CPU", X1D.LIZIZ(LIZ7));
                        }
                        try {
                            ((C46625IRp) c64192PHg2.LJIIIIZZ).LIZJ.LJI();
                            c46626IRq = ((C46625IRp) c64192PHg2.LJIIIIZZ).LIZIZ();
                        } catch (Throwable unused) {
                            c46626IRq = null;
                        }
                        if (c64192PHg2.LIZ.LIZ.get()) {
                            C64194PHi c64194PHi = c64192PHg2.LIZ;
                            if (c64194PHi.LIZ.get()) {
                                String str = PGQ.LIZ().LJ();
                                if (C78248UnM.LJIIJ()) {
                                    C64028PAy.LIZ("APM-CPU", str);
                                }
                                synchronized (C64194PHi.class) {
                                    if (C64156PFw.LIZ.LIZIZ()) {
                                        enumC64201PHp = EnumC64201PHp.FRONT;
                                    } else {
                                        enumC64201PHp = EnumC64201PHp.BACK;
                                    }
                                    C64197PHl LJIIIIZZ = C64194PHi.LJIIIIZZ(enumC64201PHp, c64194PHi.LJII(enumC64201PHp, str), d, currentTimeMillis2);
                                    c64194PHi.LJFF(enumC64201PHp, str, LJIIIIZZ);
                                    if (C78248UnM.LJIIJ()) {
                                        StringBuilder LIZ8 = X1D.LIZ();
                                        LIZ8.append("after add cache data: ");
                                        LIZ8.append(LJIIIIZZ);
                                        C64028PAy.LIZ("APM-CPU", X1D.LIZIZ(LIZ8));
                                    }
                                    EnumC64201PHp enumC64201PHp2 = EnumC64201PHp.MIX;
                                    c64194PHi.LJFF(enumC64201PHp2, str, C64194PHi.LJIIIIZZ(enumC64201PHp2, c64194PHi.LJII(enumC64201PHp2, str), d, currentTimeMillis2));
                                }
                            }
                            c64192PHg2.LIZ.LJIIJ(c46626IRq);
                        }
                        C64184PGy c64184PGy = C64157PFx.LIZ;
                        c64184PGy.LIZ = d;
                        c64184PGy.LIZIZ = currentTimeMillis2;
                        C64156PFw.LIZ.getClass();
                    } catch (InterruptedException unused2) {
                    }
                }
            }
            this.LJLJJI.LJFF();
        }
        this.LJLJJI.LJIIIZ = false;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C64193PHh(C64192PHg c64192PHg) {
        super(30000L, 30000L);
        this.LJLJJI = c64192PHg;
    }
}
