package X;

import com.ss.android.ugc.aweme.shortvideo.edit.capcut.EditCapCutViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.edit.capcut.EditCapCutViewModel$prepareGoToCCInEP$1", f = "EditCapCutViewModel.kt", l = {124}, m = "invokeSuspend")
/* renamed from: X.5Z3, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5Z3 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ EditCapCutViewModel LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5Z3(EditCapCutViewModel editCapCutViewModel, InterfaceC67352kd<? super C5Z3> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = editCapCutViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C5Z3(this.LJLILLLLZI, interfaceC67352kd);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:35:0x0063
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    @Override // fjb.a
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            X.NAu r7 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r9.LJLIL
            r8 = 1
            if (r0 == 0) goto Lf
            if (r0 != r8) goto Lbe
            X.C141335gf.LIZJ(r10)
        Lc:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        Lf:
            X.C141335gf.LIZJ(r10)
            com.ss.android.ugc.aweme.shortvideo.edit.capcut.EditCapCutViewModel r1 = r9.LJLILLLLZI
            X.5vJ r0 = X.C150415vJ.LJLIL
            r1.setStateImmediate(r0)
            com.ss.android.ugc.aweme.shortvideo.edit.capcut.EditCapCutViewModel r1 = r9.LJLILLLLZI
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r1.LJLLI
            java.lang.String r3 = "it.creationId"
            if (r0 == 0) goto L31
            java.lang.String r2 = r0.getCreationId()
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r3)
            java.lang.String r1 = r1.Jv0()
            java.lang.String r0 = "go_to_capcut"
            X.C134625Qc.LIZ(r2, r0, r1)
        L31:
            com.ss.android.ugc.aweme.shortvideo.edit.capcut.EditCapCutViewModel r4 = r9.LJLILLLLZI
            r4.getClass()
            android.app.Application r6 = X.PTW.LIZ
            if (r6 == 0) goto Lc6
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L63
            java.lang.String r2 = "com.lemon.lvoverseas"
            r0 = 28
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            if (r5 < r0) goto L54
            android.content.pm.PackageManager r0 = r6.getPackageManager()     // Catch: java.lang.Exception -> L63
            android.content.pm.PackageInfo r0 = X.C16880lQ.LLLLLLZ(r0, r2, r1)     // Catch: java.lang.Exception -> L63
            if (r0 != 0) goto L4f
            goto L63
        L4f:
            long r5 = r0.getLongVersionCode()     // Catch: java.lang.Exception -> L63
            goto L65
        L54:
            android.content.pm.PackageManager r0 = r6.getPackageManager()     // Catch: java.lang.Exception -> L63
            android.content.pm.PackageInfo r0 = X.C16880lQ.LLLLLLZ(r0, r2, r1)     // Catch: java.lang.Exception -> L63
            if (r0 != 0) goto L5f
            goto L63
        L5f:
            int r0 = r0.versionCode     // Catch: java.lang.Exception -> L63
            long r5 = (long) r0     // Catch: java.lang.Exception -> L63
            goto L65
        L63:
            r5 = 0
        L65:
            X.PQ7 r2 = X.PTW.LIZ()
            java.lang.String r1 = "CCVersion "
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            java.lang.String r1 = kotlin.jvm.internal.o.LJIILLIIL(r0, r1)
            java.lang.String r0 = "nletodraft"
            r2.i(r0, r1)
            r1 = 80000(0x13880, double:3.95253E-319)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 < 0) goto L8a
            com.ss.android.ugc.aweme.shortvideo.edit.capcut.EditCapCutViewModel r0 = r9.LJLILLLLZI
            r9.LJLIL = r8
            java.lang.Object r0 = r0.Lv0(r9)
            if (r0 != r7) goto Lc
            return r7
        L8a:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r4.LJLLI
            if (r0 == 0) goto Lb7
            java.lang.String r1 = r0.getCreationId()
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r3)
            java.lang.String r3 = r4.Jv0()
            X.5oB r2 = new X.5oB
            r2.<init>()
            java.lang.String r0 = "creation_id"
            r2.LJI(r0, r1)
            java.lang.String r1 = "action"
            java.lang.String r0 = "show"
            r2.LJI(r1, r0)
            java.lang.String r0 = "enter_from"
            r2.LJI(r0, r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
            java.lang.String r0 = "capcut_download_page"
            X.GXR.LIZ(r0, r1)
        Lb7:
            X.5vL r0 = X.C150435vL.LJLIL
            r4.setStateImmediate(r0)
            goto Lc
        Lbe:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lc6:
            java.lang.String r0 = "application"
            kotlin.jvm.internal.o.LJIJI(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5Z3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
