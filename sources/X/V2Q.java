package X;

import Y.IDCListenerS202S0100000_1;
import android.content.Context;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicUploadConfig;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class V2Q implements C68D, InterfaceC73592SuS {
    public static final V2Q LJLIL = new V2Q();
    public static Long LJLILLLLZI = null;
    public static volatile boolean LJLJI = true;

    public static final long LJ() {
        Long l;
        Long l2 = LJLILLLLZI;
        if (l2 != null) {
            return l2.longValue();
        }
        InterfaceC06390Mx LIZ = CN1.LIZ(IHostAppContext.class);
        o.LJIIIIZZ(LIZ, "getService(T::class.java)");
        String serverDeviceId = ((IHostAppContext) LIZ).getServerDeviceId();
        if (serverDeviceId != null) {
            l = C38350F3i.LJJIZ(serverDeviceId);
        } else {
            l = null;
        }
        LJLILLLLZI = l;
        if (l == null) {
            return 0L;
        }
        return l.longValue();
    }

    public static final boolean LIZLLL(int i) {
        if (LJ() == 0) {
            if (LJLJI) {
                InterfaceC06390Mx LIZ = CN1.LIZ(IHostAppContext.class);
                o.LJIIIIZZ(LIZ, "getService(T::class.java)");
                String did = ((IHostAppContext) LIZ).getServerDeviceId();
                Throwable th = new Throwable();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("DEVICE_ID == null + ");
                LIZ2.append(did);
                LIZ2.append(' ');
                o.LJIIIIZZ(did, "did");
                LIZ2.append(C38350F3i.LJJIZ(did));
                C0K2.LIZ(X1D.LIZIZ(LIZ2), th);
                LJLJI = false;
            }
            return false;
        }
        if (LJ() % 100 >= i) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC73592SuS
    public boolean test(Object obj) {
        Boolean it = (Boolean) obj;
        o.LJIIIZ(it, "it");
        return it.booleanValue();
    }

    public static final int LJFF(LinkMicUploadConfig linkMicUploadConfig, int i) {
        int[] iArr;
        if (linkMicUploadConfig == null || linkMicUploadConfig.enable == 0 || ((iArr = linkMicUploadConfig.sample0ExceptionType) != null && ORY.LJJIJ(i, iArr))) {
            return 0;
        }
        int[] iArr2 = linkMicUploadConfig.sample1ExceptionType;
        if (iArr2 != null && ORY.LJJIJ(i, iArr2)) {
            return 1;
        }
        int[] iArr3 = linkMicUploadConfig.sample10ExceptionType;
        if (iArr3 != null && ORY.LJJIJ(i, iArr3)) {
            return 10;
        }
        int[] iArr4 = linkMicUploadConfig.sample50ExceptionType;
        if (iArr4 != null && ORY.LJJIJ(i, iArr4)) {
            return 50;
        }
        int[] iArr5 = linkMicUploadConfig.sample100ExceptionType;
        if (iArr5 != null && ORY.LJJIJ(i, iArr5)) {
            return 100;
        }
        if (linkMicUploadConfig.enable == 1) {
            return linkMicUploadConfig.defaultSample;
        }
        return 0;
    }

    @Override // X.C68D
    public C6DA LIZ(View contentView, C1552567l c1552567l, C82622Wbi c82622Wbi) {
        o.LJIIIZ(contentView, "contentView");
        return new C89464Z9g(contentView, c1552567l);
    }

    public static final InterfaceC115514g7 LJI(ReusedAssem reusedAssem, C65776Prg c65776Prg, AbstractC241239dP scope, InterfaceC65784Pro keyFactory, InterfaceC65784Pro interfaceC65784Pro, InterfaceC88472Yns argumentsAcceptor, InterfaceC88473Ynt interfaceC88473Ynt, InterfaceC88471Ynr interfaceC88471Ynr) {
        InterfaceC65784Pro interfaceC65784Pro2 = interfaceC65784Pro;
        o.LJIIIZ(reusedAssem, "<this>");
        o.LJIIIZ(scope, "scope");
        o.LJIIIZ(keyFactory, "keyFactory");
        o.LJIIIZ(argumentsAcceptor, "argumentsAcceptor");
        if (o.LJ(scope, C9BD.LIZ) || o.LJ(scope, C9BE.LIZ)) {
            final C214298b3 LJ = C78926UyI.LJ(reusedAssem, c65776Prg, scope, keyFactory, argumentsAcceptor, interfaceC65784Pro2);
            return new InterfaceC115514g7() { // from class: X.8bN
                @Override // X.InterfaceC115514g7
                public final Object LIZ(Object obj, InterfaceC74236TBo interfaceC74236TBo) {
                    o.LJIIIZ(interfaceC74236TBo, "<anonymous parameter 1>");
                    return LJ.getValue();
                }
            };
        }
        C240999d1 c240999d1 = C240999d1.LIZ;
        if (o.LJ(scope, c240999d1) || o.LJ(scope, C241249dQ.LIZ)) {
            C214458bJ c214458bJ = new C214458bJ(true);
            if (interfaceC65784Pro2 == null) {
                interfaceC65784Pro2 = new AqS153S0100000_3((C8W0) reusedAssem, 1729);
            }
            final C214248ay c214248ay = new C214248ay(reusedAssem, scope, keyFactory, c214458bJ, interfaceC65784Pro2, new AqS153S0100000_3((C8W0) reusedAssem, 1730), C78926UyI.LJJIFFI(reusedAssem), argumentsAcceptor, interfaceC88471Ynr, interfaceC88473Ynt, c65776Prg);
            if (o.LJ(c214248ay.LIZJ(), c240999d1)) {
                reusedAssem.LJLL = true;
            }
            reusedAssem.LJLJLLL.add(c214248ay);
            return new InterfaceC115514g7() { // from class: X.8bF
                @Override // X.InterfaceC115514g7
                public final Object LIZ(Object obj, InterfaceC74236TBo interfaceC74236TBo) {
                    o.LJIIIZ(interfaceC74236TBo, "<anonymous parameter 1>");
                    return c214248ay.LIZ();
                }
            };
        }
        throw new IllegalArgumentException("Don't support this VMScope here.");
    }

    public static final void LIZJ(M3S m3s, InterfaceC88472Yns interfaceC88472Yns, InterfaceC07790Sh interfaceC07790Sh, boolean z, String str, String str2, AIL ail, boolean z2, boolean z3, boolean z4, InterfaceC24520xk interfaceC24520xk, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        AI9 ai9;
        boolean z5 = z4;
        boolean z6 = z2;
        AIL ail2 = ail;
        InterfaceC88472Yns interfaceC88472Yns2 = interfaceC88472Yns;
        boolean z7 = z3;
        M3S m3s2 = m3s;
        InterfaceC07790Sh interfaceC07790Sh2 = interfaceC07790Sh;
        boolean z8 = z;
        String str3 = str;
        String str4 = str2;
        C35931b3 LJIL = interfaceC24520xk.LJIL(-982591008);
        int i17 = i3 & 1;
        if (i17 != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            if (LJIL.LJIJJ(m3s2)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i4 = i5 | i;
        } else {
            i4 = i;
        }
        int i18 = i3 & 2;
        if (i18 != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            if (LJIL.LJIJJ(interfaceC88472Yns2)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i4 |= i6;
        }
        int i19 = i3 & 4;
        if (i19 != 0) {
            i4 |= 384;
        } else if ((i & 896) == 0) {
            if (LJIL.LJIJJ(interfaceC07790Sh2)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i4 |= i7;
        }
        int i20 = i3 & 8;
        if (i20 != 0) {
            i4 |= 3072;
        } else if ((i & 7168) == 0) {
            if (LJIL.LJI(z8)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i4 |= i8;
        }
        int i21 = i3 & 16;
        if (i21 != 0) {
            i4 |= 24576;
        } else if ((57344 & i) == 0) {
            if (LJIL.LJIJJ(str3)) {
                i9 = 16384;
            } else {
                i9 = FileUtils.BUFFER_SIZE;
            }
            i4 |= i9;
        }
        int i22 = i3 & 32;
        if (i22 != 0) {
            i4 |= 196608;
        } else if ((458752 & i) == 0) {
            if (LJIL.LJIJJ(str4)) {
                i10 = 131072;
            } else {
                i10 = 65536;
            }
            i4 |= i10;
        }
        int i23 = i3 & 64;
        if (i23 != 0) {
            i4 |= 1572864;
        } else if ((3670016 & i) == 0) {
            if (LJIL.LJIJJ(ail2)) {
                i11 = 1048576;
            } else {
                i11 = 524288;
            }
            i4 |= i11;
        }
        int i24 = i3 & 128;
        if (i24 != 0) {
            i4 |= 12582912;
        } else if ((29360128 & i) == 0) {
            if (LJIL.LJI(z6)) {
                i12 = 8388608;
            } else {
                i12 = 4194304;
            }
            i4 |= i12;
        }
        int i25 = i3 & 256;
        if (i25 != 0) {
            i4 |= 100663296;
        } else if ((234881024 & i) == 0) {
            if (LJIL.LJI(z7)) {
                i13 = 67108864;
            } else {
                i13 = 33554432;
            }
            i4 |= i13;
        }
        int i26 = i3 & 512;
        if (i26 != 0) {
            i4 |= 805306368;
        } else if ((1879048192 & i) == 0) {
            if (LJIL.LJI(z5)) {
                i14 = 536870912;
            } else {
                i14 = 268435456;
            }
            i4 |= i14;
        }
        if ((i3 & 1024) != 0) {
            i15 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            if (LJIL.LJIJJ(null)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i15 = i2 | i16;
        } else {
            i15 = i2;
        }
        if ((i4 & 1533916891) != 306783378 || (i15 & 11) != 2 || !LJIL.LIZ()) {
            if (i17 != 0) {
                m3s2 = null;
            }
            if (i18 != 0) {
                interfaceC88472Yns2 = null;
            }
            if (i19 != 0) {
                interfaceC07790Sh2 = InterfaceC07790Sh.LJJJI;
            }
            if (i20 != 0) {
                z8 = true;
            }
            if (i21 != 0) {
                str3 = null;
            }
            if (i22 != 0) {
                str4 = null;
            }
            if (i23 != 0) {
                ail2 = AIL.PADDING_16;
            }
            if (i24 != 0) {
                z6 = false;
            }
            if (i25 != 0) {
                z7 = false;
            }
            if (i26 != 0) {
                z5 = false;
            }
            if (m3s2 != null) {
                ai9 = (AI9) m3s2.LIZ;
            } else {
                ai9 = null;
            }
            LJIL.LJJIIJ(-492369756);
            Object LJJJZ = LJIL.LJJJZ();
            InterfaceC24520xk.LIZ.getClass();
            if (LJJJZ == C24500xi.LIZIZ) {
                LJJJZ = C78966Uyw.LJJJIL(null);
                LJIL.LJLJLLL(LJJJZ);
            }
            LJIL.LJJJJJ(false);
            LJIL.LJJIIJ(-1495705061);
            LJIL.LJJJJJ(false);
            InterfaceC07790Sh interfaceC07790Sh3 = interfaceC07790Sh2;
            C24920yO.LIZ(C79204V6q.LJLJL, interfaceC07790Sh3, new AIJ(ai9, str3, str4, z8, ail2, z6, z7, z5, (InterfaceC35811ar) LJJJZ, interfaceC88472Yns2), LJIL, (i4 >> 3) & 112, 0);
        } else {
            LJIL.LIZLLL();
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new V2R(m3s2, interfaceC88472Yns2, interfaceC07790Sh2, z8, str3, str4, ail2, z6, z7, z5, i, i2, i3);
    }

    public static final void LIZIZ(InterfaceC65784Pro interfaceC65784Pro, InterfaceC88472Yns interfaceC88472Yns, InterfaceC07790Sh interfaceC07790Sh, boolean z, boolean z2, String str, String str2, AIL ail, boolean z3, boolean z4, boolean z5, InterfaceC24520xk interfaceC24520xk, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z6 = z5;
        boolean z7 = z4;
        boolean z8 = z3;
        AIL ail2 = ail;
        String str3 = str2;
        InterfaceC88472Yns interfaceC88472Yns2 = interfaceC88472Yns;
        InterfaceC65784Pro interfaceC65784Pro2 = interfaceC65784Pro;
        InterfaceC07790Sh interfaceC07790Sh2 = interfaceC07790Sh;
        boolean z9 = z;
        boolean z10 = z2;
        String str4 = str;
        C35931b3 LJIL = interfaceC24520xk.LJIL(-286571740);
        int i18 = i3 & 1;
        if (i18 != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            if (LJIL.LJIJJ(interfaceC65784Pro2)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i4 = i5 | i;
        } else {
            i4 = i;
        }
        int i19 = i3 & 2;
        if (i19 != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            if (LJIL.LJIJJ(interfaceC88472Yns2)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i4 |= i6;
        }
        int i20 = i3 & 4;
        if (i20 != 0) {
            i4 |= 384;
        } else if ((i & 896) == 0) {
            if (LJIL.LJIJJ(interfaceC07790Sh2)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i4 |= i7;
        }
        int i21 = i3 & 8;
        if (i21 != 0) {
            i4 |= 3072;
        } else if ((i & 7168) == 0) {
            if (LJIL.LJI(z9)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i4 |= i8;
        }
        int i22 = i3 & 16;
        if (i22 != 0) {
            i4 |= 24576;
        } else if ((i & 57344) == 0) {
            if (LJIL.LJI(z10)) {
                i9 = 16384;
            } else {
                i9 = FileUtils.BUFFER_SIZE;
            }
            i4 |= i9;
        }
        int i23 = i3 & 32;
        if (i23 != 0) {
            i4 |= 196608;
        } else if ((i & 458752) == 0) {
            if (LJIL.LJIJJ(str4)) {
                i10 = 131072;
            } else {
                i10 = 65536;
            }
            i4 |= i10;
        }
        int i24 = i3 & 64;
        if (i24 != 0) {
            i4 |= 1572864;
        } else if ((i & 3670016) == 0) {
            if (LJIL.LJIJJ(str3)) {
                i11 = 1048576;
            } else {
                i11 = 524288;
            }
            i4 |= i11;
        }
        int i25 = i3 & 128;
        if (i25 != 0) {
            i4 |= 12582912;
        } else if ((i & 29360128) == 0) {
            if (LJIL.LJIJJ(ail2)) {
                i12 = 8388608;
            } else {
                i12 = 4194304;
            }
            i4 |= i12;
        }
        int i26 = i3 & 256;
        if (i26 != 0) {
            i4 |= 100663296;
        } else if ((i & 234881024) == 0) {
            if (LJIL.LJI(z8)) {
                i13 = 67108864;
            } else {
                i13 = 33554432;
            }
            i4 |= i13;
        }
        int i27 = i3 & 512;
        if (i27 != 0) {
            i4 |= 805306368;
        } else if ((i & 1879048192) == 0) {
            if (LJIL.LJI(z7)) {
                i14 = 536870912;
            } else {
                i14 = 268435456;
            }
            i4 |= i14;
        }
        int i28 = i3 & 1024;
        if (i28 != 0) {
            i15 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            if (LJIL.LJI(z6)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i15 = i2 | i16;
        } else {
            i15 = i2;
        }
        if ((i3 & 2048) != 0) {
            i15 |= 48;
        } else if ((i2 & 112) == 0) {
            if (LJIL.LJIJJ(null)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i15 |= i17;
        }
        if ((1533916891 & i4) != 306783378 || (i15 & 91) != 18 || !LJIL.LIZ()) {
            if (i18 != 0) {
                interfaceC65784Pro2 = null;
            }
            if (i19 != 0) {
                interfaceC88472Yns2 = null;
            }
            if (i20 != 0) {
                interfaceC07790Sh2 = InterfaceC07790Sh.LJJJI;
            }
            if (i21 != 0) {
                z9 = false;
            }
            if (i22 != 0) {
                z10 = true;
            }
            if (i23 != 0) {
                str4 = null;
            }
            if (i24 != 0) {
                str3 = null;
            }
            if (i25 != 0) {
                ail2 = AIL.PADDING_16;
            }
            if (i26 != 0) {
                z8 = false;
            }
            if (i27 != 0) {
                z7 = false;
            }
            if (i28 != 0) {
                z6 = false;
            }
            Context context = (Context) LJIL.LJIILLIIL(C04Q.LIZJ);
            InterfaceC35811ar LJJJJIZL = C78966Uyw.LJJJJIZL(interfaceC65784Pro2, LJIL);
            int i29 = i4 >> 3;
            InterfaceC35811ar LJJJJIZL2 = C78966Uyw.LJJJJIZL(interfaceC88472Yns2, LJIL);
            LJIL.LJJIIJ(-492369756);
            Object LJJJZ = LJIL.LJJJZ();
            InterfaceC24520xk.LIZ.getClass();
            if (LJJJZ == C24500xi.LIZIZ) {
                AI2 ai2 = new AI2(context);
                ai2.LJIILL(new IDCListenerS202S0100000_1(LJJJJIZL2, 5));
                ai2.LJIILJJIL(new AqS151S0100000_1(LJJJJIZL, 778));
                LJJJZ = C78966Uyw.LJJJIL(ai2);
                LJIL.LJLJLLL(LJJJZ);
            }
            LJIL.LJJJJJ(false);
            InterfaceC35811ar interfaceC35811ar = (InterfaceC35811ar) LJJJZ;
            if (((AEY) interfaceC35811ar.getValue()).LJIIL() != z9) {
                ((AEY) interfaceC35811ar.getValue()).LJIILIIL(z9);
            }
            InterfaceC07790Sh interfaceC07790Sh3 = interfaceC07790Sh2;
            boolean z11 = z10;
            String str5 = str4;
            String str6 = str3;
            AIL ail3 = ail2;
            boolean z12 = z8;
            boolean z13 = z7;
            boolean z14 = z6;
            LIZJ(new M3S((AI2) interfaceC35811ar.getValue()), null, interfaceC07790Sh3, z11, str5, str6, ail3, z12, z13, z14, LJIL, (i29 & 234881024) | (i4 & 896) | (i29 & 7168) | (i29 & 57344) | (i29 & 458752) | (i29 & 3670016) | (i29 & 29360128) | ((i15 << 27) & 1879048192), (i15 >> 3) & 14, 2);
        } else {
            LJIL.LIZLLL();
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new V2S(interfaceC65784Pro2, interfaceC88472Yns2, interfaceC07790Sh2, z9, z10, str4, str3, ail2, z8, z7, z6, i, i2, i3);
    }
}
