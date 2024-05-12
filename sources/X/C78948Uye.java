package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.placediscovery.param.MapBounds;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import com.zhiliaoapp.musically.R;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.Uye, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C78948Uye implements InterfaceC81635W2d, InterfaceC78962Uys, InterfaceC32195CkJ, C14Q, InterfaceC169146kQ, InterfaceC44316HaK, R6I, InterfaceC37239EjT {
    public static final C78948Uye LJLIL = new C78948Uye();
    public static PThreadPoolExecutor LJLILLLLZI = null;
    public static long LJLJI = -1;
    public static long LJLJJI;
    public static long LJLJJL;

    public static Executor LJIIIZ() {
        if (LJLILLLLZI == null) {
            PThreadPoolExecutor pThreadPoolExecutor = new PThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC63825P3d());
            LJLILLLLZI = pThreadPoolExecutor;
            pThreadPoolExecutor.allowCoreThreadTimeOut(true);
        }
        return LJLILLLLZI;
    }

    public static Object LJIIJ(Object obj, Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-8937276080345288612"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    public void LJIJI(InterfaceC75966Tre interfaceC75966Tre, InterfaceC28306B9a interfaceC28306B9a, int i) {
        throw null;
    }

    @Override // X.InterfaceC169146kQ
    public void LIZ() {
        H7B.LIZJ("ExceptionDraftMusicProcessor , musicModel is null");
    }

    public static final M3B LJIIJJI(MapBounds mapBounds) {
        Object LIZ;
        Object obj = null;
        if (mapBounds == null) {
            return null;
        }
        try {
            LIZ = new M3B(CastDoubleProtector.parseDouble(mapBounds.getMaxLng()), CastDoubleProtector.parseDouble(mapBounds.getMaxLat()), CastDoubleProtector.parseDouble(mapBounds.getMinLng()), CastDoubleProtector.parseDouble(mapBounds.getMinLat()));
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (!C3C5.m12isFailureimpl(LIZ)) {
            obj = LIZ;
        }
        return (M3B) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public static final InterfaceC71003Rtn LJIILIIL(View view) {
        InterfaceC71003Rtn interfaceC71003Rtn;
        InterfaceC71003Rtn interfaceC71003Rtn2;
        o.LJIIIZ(view, "<this>");
        ?? r1 = view;
        while (r1 != 0) {
            Object tag = r1.getTag(R.id.cli);
            if ((tag instanceof InterfaceC71003Rtn) && (interfaceC71003Rtn2 = (InterfaceC71003Rtn) tag) != null) {
                return interfaceC71003Rtn2;
            }
            Object parent = r1.getParent();
            if (parent instanceof View) {
                r1 = (View) parent;
            } else {
                r1 = 0;
            }
            if (r1 instanceof InterfaceC71003Rtn) {
                return (InterfaceC71003Rtn) r1;
            }
        }
        InterfaceC36571c5 LJIIIZ = C79234V7u.LJIIIZ(view);
        if (!(LJIIIZ instanceof InterfaceC71003Rtn) || (interfaceC71003Rtn = (InterfaceC71003Rtn) LJIIIZ) == null) {
            Context context = view.getContext();
            if (context == null) {
                return null;
            }
            return LJIIZILJ(context);
        }
        return interfaceC71003Rtn;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC71003Rtn LJIIZILJ(Context context) {
        o.LJIIIZ(context, "<this>");
        if (context instanceof InterfaceC71003Rtn) {
            return (InterfaceC71003Rtn) context;
        }
        if (context instanceof ContextWrapper) {
            ContextWrapper contextWrapper = (ContextWrapper) context;
            if (contextWrapper.getBaseContext() instanceof InterfaceC71003Rtn) {
                Object baseContext = contextWrapper.getBaseContext();
                o.LJII(baseContext, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.slark.api.ITrackNode");
                return (InterfaceC71003Rtn) baseContext;
            }
            return null;
        }
        return null;
    }

    @Override // X.InterfaceC78962Uys
    public C42348Gjg LIZJ(InputStream inputStream) {
        Bitmap bitmap = BitmapFactory.decodeStream(inputStream);
        o.LJIIIIZZ(bitmap, "bitmap");
        return new C42348Gjg(bitmap.getWidth(), bitmap.getHeight(), bitmap);
    }

    @Override // X.InterfaceC44316HaK
    public List LJ(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        ArrayList arrayList = new ArrayList();
        diContainer.LJ(ShortVideoContext.class, null);
        I38 i38 = I38.RECORD_LIGHTENING_PHOTO_AND_VIDEO;
        arrayList.add(new I3R(C78688UuS.LJJJI(i38.getNameResId()), i38.getTag(), "quick", true, diContainer));
        return arrayList;
    }

    @Override // X.C14Q
    public Object apply(Object obj) {
        C63088OpQ coreInfo;
        String icon;
        C63120Opw c63120Opw = (C63120Opw) obj;
        if (c63120Opw != null && (coreInfo = c63120Opw.getCoreInfo()) != null && (icon = coreInfo.getIcon()) != null) {
            return C4AS.LJIIJ(icon);
        }
        return null;
    }

    public static final LaneParams LJIILJJIL(InterfaceC71003Rtn interfaceC71003Rtn, String lane) {
        o.LJIIIZ(interfaceC71003Rtn, "<this>");
        o.LJIIIZ(lane, "lane");
        C70975RtL c70975RtL = new C70975RtL(lane);
        c70975RtL.LJFF = interfaceC71003Rtn;
        AbstractC70995Rtf.LIZLLL(c70975RtL);
        return c70975RtL.LJ;
    }

    public static final void LJIJJLI(View view, InterfaceC71003Rtn interfaceC71003Rtn) {
        o.LJIIIZ(view, "<this>");
        view.setTag(R.id.cli, interfaceC71003Rtn);
    }

    @Override // X.InterfaceC81635W2d
    public void LIZLLL(C8HR c8hr, C74365TGn c74365TGn) {
        if (c8hr == null) {
            return;
        }
        c8hr.setVisibility(8);
    }

    @Override // X.InterfaceC81635W2d
    public void LJI(BottomSheetBehavior bottomSheetBehavior, C8HR c8hr) {
        if (bottomSheetBehavior != null) {
            if (bottomSheetBehavior.getState() == 5) {
                return;
            } else {
                bottomSheetBehavior.setState(5);
            }
        }
        if (c8hr == null) {
            return;
        }
        c8hr.setVisibility(8);
    }

    @Override // X.InterfaceC78962Uys
    public void LJIIIIZZ(OutputStream outputStream, C42348Gjg c42348Gjg) {
        ((Bitmap) c42348Gjg.LJLJI).compress(Bitmap.CompressFormat.PNG, 100, outputStream);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000b A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x000c  */
    @Override // X.InterfaceC81635W2d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LJII(com.google.android.material.bottomsheet.BottomSheetBehavior r3, X.C8HR r4, X.C74365TGn r5) {
        /*
            r2 = this;
            r1 = 5
            if (r3 == 0) goto L15
            int r0 = r3.getState()
            if (r0 != r1) goto L12
        L9:
            if (r4 != 0) goto Lc
        Lb:
            return
        Lc:
            r0 = 8
            r4.setVisibility(r0)
            goto Lb
        L12:
            r3.setState(r1)
        L15:
            if (r5 == 0) goto L9
            r5.hide()
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78948Uye.LJII(com.google.android.material.bottomsheet.BottomSheetBehavior, X.8HR, X.TGn):void");
    }

    @Override // X.R6I
    public void LJIILLIIL(AuthResult authResult, int i, C69008R6m c69008R6m) {
        int i2;
        String str;
        C69008R6m LIZIZ = C69007R6l.LIZIZ(this, authResult, c69008R6m, "vk");
        if (LIZIZ == null) {
            return;
        }
        o.LJI(authResult);
        C66504Q8e c66504Q8e = authResult.mErrorCause;
        if (c66504Q8e != null) {
            i2 = c66504Q8e.getErrorCode();
            str = c66504Q8e.getMessage();
        } else {
            i2 = 0;
            str = null;
        }
        if (authResult.mIsSuccessful) {
            C69009R6n.LIZLLL(LIZIZ);
            return;
        }
        if (authResult.mIsCancelled) {
            C69007R6l.LIZ(i, 2, "vk", i2, str);
            C69009R6n.LIZIZ(LIZIZ, null, i2, str);
            return;
        }
        C69007R6l.LIZ(i, 1, "vk", i2, str);
        V16.LJJJLIIL(str, "vk");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("errorCode: ");
        LIZ.append(i2);
        C69009R6n.LIZJ(LIZIZ, X1D.LIZIZ(LIZ), i2, str);
    }

    public static final void LJIJ(TokenCert bpeaCert, TokenCert tokenCert, InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns interfaceC88472Yns2) {
        o.LJIIIZ(bpeaCert, "bpeaCert");
        C51733KSb.LIZ("poi", "places_discovery", bpeaCert, tokenCert, new C56172M2u(interfaceC88472Yns, interfaceC88472Yns2), 32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0096 A[Catch: Exception -> 0x00e8, TryCatch #0 {Exception -> 0x00e8, blocks: (B:3:0x0001, B:5:0x001d, B:6:0x0022, B:8:0x0036, B:10:0x0043, B:14:0x0053, B:15:0x004a, B:17:0x0050, B:22:0x0058, B:24:0x005c, B:26:0x0086, B:28:0x0096, B:29:0x009c, B:31:0x00b3, B:32:0x00c6, B:36:0x00bd, B:37:0x00ae, B:38:0x0060, B:39:0x006f, B:41:0x0073, B:42:0x0078, B:43:0x0031), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b3 A[Catch: Exception -> 0x00e8, TryCatch #0 {Exception -> 0x00e8, blocks: (B:3:0x0001, B:5:0x001d, B:6:0x0022, B:8:0x0036, B:10:0x0043, B:14:0x0053, B:15:0x004a, B:17:0x0050, B:22:0x0058, B:24:0x005c, B:26:0x0086, B:28:0x0096, B:29:0x009c, B:31:0x00b3, B:32:0x00c6, B:36:0x00bd, B:37:0x00ae, B:38:0x0060, B:39:0x006f, B:41:0x0073, B:42:0x0078, B:43:0x0031), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd A[Catch: Exception -> 0x00e8, TryCatch #0 {Exception -> 0x00e8, blocks: (B:3:0x0001, B:5:0x001d, B:6:0x0022, B:8:0x0036, B:10:0x0043, B:14:0x0053, B:15:0x004a, B:17:0x0050, B:22:0x0058, B:24:0x005c, B:26:0x0086, B:28:0x0096, B:29:0x009c, B:31:0x00b3, B:32:0x00c6, B:36:0x00bd, B:37:0x00ae, B:38:0x0060, B:39:0x006f, B:41:0x0073, B:42:0x0078, B:43:0x0031), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ae A[Catch: Exception -> 0x00e8, TryCatch #0 {Exception -> 0x00e8, blocks: (B:3:0x0001, B:5:0x001d, B:6:0x0022, B:8:0x0036, B:10:0x0043, B:14:0x0053, B:15:0x004a, B:17:0x0050, B:22:0x0058, B:24:0x005c, B:26:0x0086, B:28:0x0096, B:29:0x009c, B:31:0x00b3, B:32:0x00c6, B:36:0x00bd, B:37:0x00ae, B:38:0x0060, B:39:0x006f, B:41:0x0073, B:42:0x0078, B:43:0x0031), top: B:2:0x0001 }] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.List, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    @Override // X.InterfaceC37239EjT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean LIZIZ(java.lang.ClassLoader r11, java.lang.String r12, boolean r13, boolean r14) {
        /*
            r10 = this;
            r4 = 0
            java.lang.Class<dalvik.system.BaseDexClassLoader> r1 = dalvik.system.BaseDexClassLoader.class
            java.lang.String r0 = "pathList"
            java.lang.reflect.Field r0 = X.EZG.LIZ(r1, r0)     // Catch: java.lang.Exception -> Le8
            java.lang.Object r5 = r0.get(r11)     // Catch: java.lang.Exception -> Le8
            java.lang.Class r1 = r5.getClass()     // Catch: java.lang.Exception -> Le8
            java.lang.String r0 = "nativeLibraryDirectories"
            java.lang.reflect.Field r6 = X.EZG.LIZ(r1, r0)     // Catch: java.lang.Exception -> Le8
            java.lang.Object r7 = r6.get(r5)     // Catch: java.lang.Exception -> Le8
            if (r7 != 0) goto L31
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Exception -> Le8
            r7.<init>()     // Catch: java.lang.Exception -> Le8
        L22:
            java.lang.String r0 = ":"
            java.lang.String[] r9 = r12.split(r0)     // Catch: java.lang.Exception -> Le8
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Exception -> Le8
            int r0 = r9.length     // Catch: java.lang.Exception -> Le8
            r8.<init>(r0)     // Catch: java.lang.Exception -> Le8
            int r3 = r9.length     // Catch: java.lang.Exception -> Le8
            r2 = 0
            goto L34
        L31:
            java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Exception -> Le8
            goto L22
        L34:
            if (r2 >= r3) goto L56
            r0 = r9[r2]     // Catch: java.lang.Exception -> Le8
            java.io.File r1 = new java.io.File     // Catch: java.lang.Exception -> Le8
            r1.<init>(r0)     // Catch: java.lang.Exception -> Le8
            boolean r0 = r1.exists()     // Catch: java.lang.Exception -> Le8
            if (r0 != 0) goto L4a
            boolean r0 = r1.mkdirs()     // Catch: java.lang.Exception -> Le8
            if (r0 != 0) goto L4a
            goto L53
        L4a:
            boolean r0 = r7.contains(r1)     // Catch: java.lang.Exception -> Le8
            if (r0 != 0) goto L53
            r8.add(r1)     // Catch: java.lang.Exception -> Le8
        L53:
            int r2 = r2 + 1
            goto L34
        L56:
            if (r13 == 0) goto L6f
            boolean r0 = r7 instanceof java.util.concurrent.CopyOnWriteArrayList     // Catch: java.lang.Exception -> Le8
            if (r0 == 0) goto L60
            r7.addAll(r4, r8)     // Catch: java.lang.Exception -> Le8
            goto L76
        L60:
            java.util.concurrent.CopyOnWriteArrayList r3 = new java.util.concurrent.CopyOnWriteArrayList     // Catch: java.lang.Exception -> Le8
            r3.<init>()     // Catch: java.lang.Exception -> Le8
            r3.addAll(r8)     // Catch: java.lang.Exception -> Le8
            r3.addAll(r7)     // Catch: java.lang.Exception -> Le8
            r6.set(r5, r3)     // Catch: java.lang.Exception -> Le8
            goto L86
        L6f:
            boolean r0 = r7 instanceof java.util.concurrent.CopyOnWriteArrayList     // Catch: java.lang.Exception -> Le8
            if (r0 == 0) goto L78
            r7.addAll(r8)     // Catch: java.lang.Exception -> Le8
        L76:
            r3 = r7
            goto L86
        L78:
            java.util.concurrent.CopyOnWriteArrayList r3 = new java.util.concurrent.CopyOnWriteArrayList     // Catch: java.lang.Exception -> Le8
            r3.<init>()     // Catch: java.lang.Exception -> Le8
            r3.addAll(r7)     // Catch: java.lang.Exception -> Le8
            r3.addAll(r8)     // Catch: java.lang.Exception -> Le8
            r6.set(r5, r3)     // Catch: java.lang.Exception -> Le8
        L86:
            java.lang.String r1 = "systemNativeLibraryDirectories"
            java.lang.Class r0 = r5.getClass()     // Catch: java.lang.Exception -> Le8
            java.lang.reflect.Field r0 = X.EZG.LIZ(r0, r1)     // Catch: java.lang.Exception -> Le8
            java.lang.Object r6 = r0.get(r5)     // Catch: java.lang.Exception -> Le8
            if (r6 != 0) goto Lae
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Exception -> Le8
            r0 = 2
            r6.<init>(r0)     // Catch: java.lang.Exception -> Le8
        L9c:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Exception -> Le8
            int r1 = r3.size()     // Catch: java.lang.Exception -> Le8
            int r0 = r6.size()     // Catch: java.lang.Exception -> Le8
            int r1 = r1 + r0
            r3 = 1
            int r0 = r1 + 1
            r2.<init>(r0)     // Catch: java.lang.Exception -> Le8
            goto Lb1
        Lae:
            java.util.List r6 = (java.util.List) r6     // Catch: java.lang.Exception -> Le8
            goto L9c
        Lb1:
            if (r13 == 0) goto Lbd
            r2.addAll(r8)     // Catch: java.lang.Exception -> Le8
            r2.addAll(r7)     // Catch: java.lang.Exception -> Le8
            r2.addAll(r6)     // Catch: java.lang.Exception -> Le8
            goto Lc6
        Lbd:
            r2.addAll(r7)     // Catch: java.lang.Exception -> Le8
            r2.addAll(r8)     // Catch: java.lang.Exception -> Le8
            r2.addAll(r6)     // Catch: java.lang.Exception -> Le8
        Lc6:
            java.lang.Class[] r1 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> Le8
            java.lang.Class<java.util.List> r0 = java.util.List.class
            r1[r4] = r0     // Catch: java.lang.Exception -> Le8
            java.lang.reflect.Method r1 = X.EZG.LIZIZ(r5, r1)     // Catch: java.lang.Exception -> Le8
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> Le8
            r0[r4] = r2     // Catch: java.lang.Exception -> Le8
            java.lang.Object r2 = LJIIJ(r5, r1, r0)     // Catch: java.lang.Exception -> Le8
            java.lang.Object[] r2 = (java.lang.Object[]) r2     // Catch: java.lang.Exception -> Le8
            java.lang.String r1 = "nativeLibraryPathElements"
            java.lang.Class r0 = r5.getClass()     // Catch: java.lang.Exception -> Le8
            java.lang.reflect.Field r0 = X.EZG.LIZ(r0, r1)     // Catch: java.lang.Exception -> Le8
            r0.set(r5, r2)     // Catch: java.lang.Exception -> Le8
            return r3
        Le8:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78948Uye.LIZIZ(java.lang.ClassLoader, java.lang.String, boolean, boolean):boolean");
    }

    @Override // X.InterfaceC81635W2d
    public void LJFF(BottomSheetBehavior bottomSheetBehavior, C8HR c8hr, C74365TGn c74365TGn, Boolean bool) {
        if (o.LJ(bool, Boolean.TRUE)) {
            if (bottomSheetBehavior != null) {
                if (bottomSheetBehavior.getState() == 5) {
                    return;
                } else {
                    bottomSheetBehavior.setState(5);
                }
            }
            if (c74365TGn != null) {
                c74365TGn.LLJILJIL(0);
            }
            if (c8hr == null) {
                return;
            }
            c8hr.setVisibility(0);
            return;
        }
        if (bottomSheetBehavior != null) {
            if (bottomSheetBehavior.getState() == 5) {
                return;
            } else {
                bottomSheetBehavior.setState(5);
            }
        }
        if (c74365TGn != null) {
            c74365TGn.LLJILJIL(0);
        }
        if (c8hr == null) {
            return;
        }
        c8hr.setVisibility(8);
    }

    public void LJIJJ(InterfaceC75966Tre viewHolder, InterfaceC28306B9a data, int i, List payloads) {
        o.LJIIIZ(viewHolder, "viewHolder");
        o.LJIIIZ(data, "data");
        o.LJIIIZ(payloads, "payloads");
        LJIJI(viewHolder, data, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0171, code lost:
    
        if (r38 != false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.TGD LJIIL(X.ActivityC45651qj r34, X.InterfaceC82086WJm r35, boolean r36, boolean r37, boolean r38, X.TEZ r39, X.WMH r40, int r41) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78948Uye.LJIIL(X.1qj, X.WJm, boolean, boolean, boolean, X.TEZ, X.WMH, int):X.TGD");
    }
}
