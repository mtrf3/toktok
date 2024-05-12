package X;

import java.util.ArrayList;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.H5u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43510H5u implements InterfaceC36938Eec {
    public final InterfaceC43387H1b LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final InterfaceC88471Ynr<Integer, Boolean, C76800UCe> LIZLLL;
    public C43458H3u LJ;
    public final C43513H5x LJFF;
    public final int LJI;
    public final C62822Ol8 LJII;
    public C73411SrX LJIIIIZZ;
    public final C62822Ol8 LJIIIZ;

    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC36938Eec
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onEvent(X.AbstractC41872Gc0 r6) {
        /*
            r5 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            X.H3u r0 = r5.LJ
            if (r0 != 0) goto L2c
            boolean r0 = r6 instanceof X.C41870Gby
            if (r0 == 0) goto L2c
            r0 = r6
            X.Gby r0 = (X.C41870Gby) r0
            X.ERR r0 = r0.LIZLLL
            java.util.List<java.lang.Object> r0 = r0.LIZ
            java.util.Iterator r2 = r0.iterator()
        L18:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Ldd
            java.lang.Object r1 = r2.next()
            if (r1 == 0) goto L28
            boolean r0 = r1 instanceof X.C43458H3u
            if (r0 == 0) goto L18
        L28:
            X.H3u r1 = (X.C43458H3u) r1
            r5.LJ = r1
        L2c:
            boolean r0 = r6 instanceof X.C41871Gbz
            if (r0 == 0) goto Lb9
            r4 = r6
            X.Gbz r4 = (X.C41871Gbz) r4
            java.lang.Object r0 = r4.LIZJ
            boolean r0 = r0 instanceof X.C41855Gbj
            if (r0 == 0) goto Lb9
            boolean r0 = X.H64.LIZIZ()
            java.lang.String r3 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.Progress"
            if (r0 == 0) goto Laa
            boolean r0 = r5.LIZJ
            if (r0 != 0) goto Laa
            X.SrX r0 = r5.LJIIIIZZ
            if (r0 != 0) goto L74
            int r0 = r5.LJI
            long r0 = (long) r0
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            X.SsD r1 = X.AbstractC73672Svk.LJJIJIIJI(r0, r2)
            X.T0k r0 = X.T16.LIZ()
            X.Sro r2 = r1.LJJL(r0)
            X.6l6 r1 = X.EnumC169566l6.LJLIL
            X.T0o r0 = new X.T0o
            r0.<init>(r1)
            X.SsE r2 = r2.LJJJ(r0)
            Y.AfS59S0100000_7 r1 = new Y.AfS59S0100000_7
            r0 = 53
            r1.<init>(r5, r0)
            X.3kP r0 = r2.LJJJJZI(r1)
            X.SrX r0 = (X.C73411SrX) r0
            r5.LJIIIIZZ = r0
        L74:
            X.Ol8 r0 = r5.LJII
            java.lang.Object r2 = r0.getValue()
            X.H5v r2 = (X.C43511H5v) r2
            java.lang.Object r1 = r6.LIZ
            java.lang.Object r0 = r4.LIZJ
            kotlin.jvm.internal.o.LJII(r0, r3)
            X.Gbj r0 = (X.C41855Gbj) r0
            float r0 = r0.LIZ
            r2.LIZ(r0, r1)
        L8a:
            java.lang.Object r1 = r6.LIZ
            java.lang.String r0 = r5.LIZIZ
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L9f
            boolean r0 = r6 instanceof X.C41852Gbg
            if (r0 == 0) goto La0
        L98:
            X.SrX r0 = r5.LJIIIIZZ
            if (r0 == 0) goto L9f
            r0.dispose()
        L9f:
            return
        La0:
            boolean r0 = r6 instanceof X.C41851Gbf
            if (r0 == 0) goto La5
            goto L98
        La5:
            boolean r0 = r6 instanceof X.C41868Gbw
            if (r0 == 0) goto L9f
            goto L98
        Laa:
            java.lang.Object r1 = r6.LIZ
            java.lang.Object r0 = r4.LIZJ
            kotlin.jvm.internal.o.LJII(r0, r3)
            X.Gbj r0 = (X.C41855Gbj) r0
            float r0 = r0.LIZ
            r5.LIZIZ(r0, r1)
            goto L8a
        Lb9:
            boolean r0 = r6 instanceof X.C41852Gbg
            if (r0 == 0) goto L8a
            boolean r0 = X.H64.LIZIZ()
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto Ld7
            boolean r0 = r5.LIZJ
            if (r0 != 0) goto Ld7
            X.Ol8 r0 = r5.LJII
            java.lang.Object r1 = r0.getValue()
            X.H5v r1 = (X.C43511H5v) r1
            java.lang.Object r0 = r6.LIZ
            r1.LIZ(r2, r0)
            goto L8a
        Ld7:
            java.lang.Object r0 = r6.LIZ
            r5.LIZIZ(r2, r0)
            goto L8a
        Ldd:
            r1 = 0
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43510H5u.onEvent(X.Gc0):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x0127, code lost:
    
        if (((X.C43515H5z) r0).LIZJ < r4.LIZJ) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(float r22, java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 825
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43510H5u.LIZIZ(float, java.lang.Object):void");
    }

    public /* synthetic */ C43510H5u(ArrayList arrayList, InterfaceC43387H1b interfaceC43387H1b, InterfaceC88471Ynr interfaceC88471Ynr) {
        this(arrayList, interfaceC43387H1b, "DMVideoWavePublisher", false, interfaceC88471Ynr);
    }

    public final void LIZ(float f, int i, Object obj) {
        boolean z;
        String obj2;
        C73411SrX c73411SrX;
        InterfaceC88471Ynr<Integer, Boolean, C76800UCe> interfaceC88471Ynr = this.LIZLLL;
        Integer valueOf = Integer.valueOf(i);
        C43458H3u c43458H3u = this.LJ;
        if (c43458H3u != null) {
            z = c43458H3u.LIZIZ;
        } else {
            z = false;
        }
        interfaceC88471Ynr.invoke(valueOf, Boolean.valueOf(z));
        if (i >= ((C43511H5v) this.LJII.getValue()).LIZIZ && (c73411SrX = this.LJIIIIZZ) != null) {
            c73411SrX.dispose();
        }
        if (obj == H1U.COMPILE) {
            obj2 = "STEP_SYNTHETISE";
        } else if (obj == H1U.AUTH_KEY) {
            obj2 = "QUERY_URL";
        } else if (obj == H1U.UPLOAD) {
            obj2 = "UPLOAD";
        } else if (obj == H1U.COVER_TEXT_UPLOAD) {
            obj2 = "UPLOAD_COVER_TEXT";
        } else if (obj == H1U.CREATE_AWEME) {
            obj2 = "CREATE_AWEME";
        } else {
            obj2 = obj.toString();
        }
        this.LIZ.LJIIIIZZ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("current step is: ");
        LIZ.append(obj2);
        LIZ.append(" and it's progress is: ");
        LIZ.append(f);
        LIZ.append(" overall progress is: ");
        LIZ.append(i);
        C41813Gb3.LJFF("ProgressBarUnification", X1D.LIZIZ(LIZ));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C43510H5u(ArrayList<C42982Gtu> arrayList, InterfaceC43387H1b dependency, String str, boolean z, InterfaceC88471Ynr<? super Integer, ? super Boolean, C76800UCe> interfaceC88471Ynr) {
        int i;
        o.LJIIIZ(dependency, "dependency");
        this.LIZ = dependency;
        this.LIZIZ = str;
        this.LIZJ = z;
        this.LIZLLL = interfaceC88471Ynr;
        this.LJFF = new C43513H5x(arrayList);
        if (C00F.LIZ(31744, 0, "studio_limit_upload_progress_refresh_fps", true) > 0) {
            FFL.LJIIIZ().getClass();
            i = 1000 / FFL.LJIIJ(31744, 0, "studio_limit_upload_progress_refresh_fps", true);
        } else {
            i = -1;
        }
        this.LJI = i;
        this.LJII = C221108m2.LIZIZ(new AqS154S0200000_7((ArrayList) arrayList, (ArrayList<C42982Gtu>) this, (C43510H5u) 122));
        this.LJIIIZ = C221108m2.LIZIZ(new AqS157S0100000_7(this, 619));
    }
}
