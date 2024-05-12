package X;

import Y.AfS54S0100000_2;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.guide.EditorProGuideTargetUserApi;
import kotlin.jvm.internal.AqS133S0200000_2;

/* renamed from: X.6Dv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C156916Dv {
    public static boolean LJIILIIL;
    public final ActivityC45651qj LIZ;
    public final VideoPublishEditModel LIZIZ;
    public final InterfaceC153275zv LIZJ;
    public Boolean LIZLLL;
    public Boolean LJ;
    public TuxSheet LJFF;
    public final C62822Ol8 LJI;
    public final C62822Ol8 LJII;
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;
    public final boolean LJIIJ;
    public final boolean LJIIJJI;
    public final boolean LJIIL;

    public final void LIZ(InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        C78934UyQ.LJLIL.getCommerceService();
        if (HH2.LIZ() >= 10000) {
            interfaceC88472Yns.invoke(Boolean.TRUE);
        } else {
            ((C73318Sq2) this.LJII.getValue()).LIZ(((EditorProGuideTargetUserApi.Api) ((EditorProGuideTargetUserApi) this.LJI.getValue()).LIZ.getValue()).requestIsEpGuideTargetUser(true, false).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS54S0100000_2(interfaceC88472Yns, 28), new AfS54S0100000_2(interfaceC88472Yns, 29)));
        }
    }

    public final void LIZIZ(InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        boolean z;
        Boolean bool = this.LIZLLL;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if ((this.LJIIJ && booleanValue) || this.LJIIJJI || (this.LJIIL && booleanValue)) {
                z = true;
            } else {
                z = false;
            }
            interfaceC88472Yns.invoke(Boolean.valueOf(z));
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        LIZ(new AqS133S0200000_2(this, (C156916Dv) interfaceC88472Yns, (InterfaceC88472Yns<? super Boolean, C76800UCe>) 117));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C156916Dv(X.ActivityC45651qj r3, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4, X.InterfaceC153275zv r5) {
        /*
            r2 = this;
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            java.lang.String r0 = "mModel"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            r2.<init>()
            r2.LIZ = r3
            r2.LIZIZ = r4
            r2.LIZJ = r5
            X.6E1 r0 = X.C6E1.LJLIL
            X.Ol8 r0 = X.C221108m2.LIZIZ(r0)
            r2.LJI = r0
            X.5eC r0 = X.C139805eC.LJLIL
            X.Ol8 r0 = X.C221108m2.LIZIZ(r0)
            r2.LJII = r0
            X.6E2 r0 = X.C6E2.LIZ
            r0.getClass()
            boolean r0 = X.C6E2.LIZ()
            r1 = 0
            if (r0 == 0) goto Lcb
            X.6Dt r0 = X.C156896Dt.LIZ
            r0.getClass()
            boolean r0 = X.C156896Dt.LIZ()
            if (r0 != 0) goto Lcb
            X.6E3 r0 = X.C6E3.LIZ
            r0.getClass()
            boolean r0 = X.C6E3.LIZ()
            if (r0 != 0) goto Lcb
            r0 = 1
        L46:
            r2.LJIIIIZZ = r0
            boolean r0 = X.C6E2.LIZ()
            if (r0 != 0) goto Lc9
            X.6Dt r0 = X.C156896Dt.LIZ
            r0.getClass()
            boolean r0 = X.C156896Dt.LIZ()
            if (r0 != 0) goto Lc9
            X.6E3 r0 = X.C6E3.LIZ
            r0.getClass()
            boolean r0 = X.C6E3.LIZ()
            if (r0 != 0) goto Lc9
            r0 = 1
        L65:
            r2.LJIIIZ = r0
            boolean r0 = X.C6E2.LIZ()
            if (r0 == 0) goto Lc7
            X.6Dt r0 = X.C156896Dt.LIZ
            r0.getClass()
            boolean r0 = X.C156896Dt.LIZ()
            if (r0 != 0) goto Lc7
            X.6E3 r0 = X.C6E3.LIZ
            r0.getClass()
            boolean r0 = X.C6E3.LIZ()
            if (r0 == 0) goto Lc7
            r0 = 1
        L84:
            r2.LJIIJ = r0
            boolean r0 = X.C6E2.LIZ()
            if (r0 != 0) goto Lc5
            X.6Dt r0 = X.C156896Dt.LIZ
            r0.getClass()
            boolean r0 = X.C156896Dt.LIZ()
            if (r0 == 0) goto Lc5
            X.6E3 r0 = X.C6E3.LIZ
            r0.getClass()
            boolean r0 = X.C6E3.LIZ()
            if (r0 != 0) goto Lc5
            r0 = 1
        La3:
            r2.LJIIJJI = r0
            boolean r0 = X.C6E2.LIZ()
            if (r0 != 0) goto Lc2
            X.6Dt r0 = X.C156896Dt.LIZ
            r0.getClass()
            boolean r0 = X.C156896Dt.LIZ()
            if (r0 == 0) goto Lc2
            X.6E3 r0 = X.C6E3.LIZ
            r0.getClass()
            boolean r0 = X.C6E3.LIZ()
            if (r0 == 0) goto Lc2
            r1 = 1
        Lc2:
            r2.LJIIL = r1
            return
        Lc5:
            r0 = 0
            goto La3
        Lc7:
            r0 = 0
            goto L84
        Lc9:
            r0 = 0
            goto L65
        Lcb:
            r0 = 0
            goto L46
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C156916Dv.<init>(X.1qj, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, X.5zv):void");
    }
}
