package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.Logger;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.compliance.sandbox.serviceimpl.SandboxServiceImpl;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.StickerSetInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.message.template.component.ResolutionComponent;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.ugc.android.davinciresource.jni.AlgorithmResourceFinder;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.BindException;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.PortUnreachableException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.IDqS28S0300000;
import kotlin.jvm.internal.o;
import org.apache.http.conn.ConnectTimeoutException;
import ujb.s;
import yq4.a;

/* renamed from: X.1E4, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1E4 implements InterfaceC71013Rtx, RTU, XC2, InterfaceC74359TGh, InterfaceC176976x3 {
    public static final C1E4 LJLIL = new C1E4();
    public static long LJLILLLLZI;
    public static long LJLJI;

    public static Object LJIIIIZZ(Object obj, Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-2925355185458683142"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    @Override // X.InterfaceC71013Rtx
    public String LIZ() {
        return "";
    }

    @Override // X.InterfaceC71013Rtx
    public String LIZIZ() {
        return "";
    }

    public static int LJIIZILJ() {
        long currentTimeMillis = System.currentTimeMillis();
        long j = LJLILLLLZI;
        if (j > 0) {
            currentTimeMillis = (j + currentTimeMillis) - LJLJI;
        }
        return (int) (currentTimeMillis / 1000);
    }

    public static long LJIJ() {
        long currentTimeMillis = System.currentTimeMillis();
        long j = LJLILLLLZI;
        if (j > 0) {
            return (j + currentTimeMillis) - LJLJI;
        }
        return currentTimeMillis;
    }

    public static final boolean LJIJJLI() {
        if (!C35971E9v.LIZ() || ((Number) C90363ge.LIZ.getValue()).intValue() != 1 || !o.LJ(a.LJFF().LJFF().getValue(), Boolean.TRUE)) {
            return false;
        }
        return true;
    }

    public static final String LJIL() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append('2');
        LIZ.append(LJJIII());
        LIZ.append(LJJIII());
        return X1D.LIZIZ(LIZ);
    }

    public static final String LJJIII() {
        String str = "";
        String LJJJJZ = ujb.o.LJJJJZ(String.valueOf(Math.random()), ".", "", false);
        if (LJJJJZ.length() <= 6) {
            return LJJJJZ;
        }
        C40517FvF indices = C78842Uww.LJJ(1, 7);
        o.LJIIIZ(indices, "indices");
        if (!indices.isEmpty()) {
            str = s.LJLL(LJJJJZ, indices);
        }
        return str;
    }

    @Override // X.InterfaceC71013Rtx
    public String LIZJ() {
        Room room;
        C28246B6s LJIJI = BJM.LJIJI();
        if (LJIJI != null && (room = LJIJI.LIZIZ) != null) {
            LiveMode streamType = room.getStreamType();
            o.LJIIIIZZ(streamType, "it.streamType");
            return C28509BGv.LIZ(streamType);
        }
        return "";
    }

    public static int LJII(Throwable th) {
        int i = 1;
        if (th == null) {
            return 1;
        }
        int i2 = 40;
        if (th instanceof C64802Pby) {
            i = ((C64802Pby) th).getStatusCode();
        } else if (th instanceof C48185Ivd) {
            i = 20;
        } else {
            if (!(th instanceof ConnectTimeoutException)) {
                if (th instanceof SocketTimeoutException) {
                    if (C38354F3m.LJ(th.getMessage()) || !th.getMessage().contains("connect timed out")) {
                        i = 3;
                    }
                } else if (th instanceof BindException) {
                    i = 7;
                } else if (th instanceof ConnectException) {
                    i = 8;
                } else if (th instanceof NoRouteToHostException) {
                    i = 9;
                } else if (th instanceof PortUnreachableException) {
                    i = 10;
                } else if (th instanceof SocketException) {
                    String message = th.getMessage();
                    i = (message == null || message.indexOf("reset by peer") < 0) ? 5 : 6;
                } else if (th instanceof UnknownHostException) {
                    i = 11;
                } else if (th instanceof C63723Ozf) {
                    i = 18;
                } else if (th instanceof C64801Pbx) {
                    i = 19;
                } else if ((th instanceof IOException) && "request canceled".equals(th.getMessage())) {
                    i = 40;
                }
            }
            i = 2;
        }
        boolean z = th instanceof IOException;
        if (!z || !"Canceled".equals(th.getMessage())) {
            i2 = i;
        }
        try {
            if (z) {
                if ("network not available".equals(th.getMessage())) {
                    return 41;
                }
                i2 = 4;
            } else {
                if (i2 == 2) {
                    String message2 = th.getMessage();
                    Logger.debug();
                    Matcher matcher = Pattern.compile("Connect to +([\\w\\.\\-]+)?/(\\[([a-zA-Z0-9:]+)\\]|(\\d{1,3}(\\.\\d{1,3}){3,3})):(\\d+) +timed out").matcher(message2);
                    if (matcher.matches()) {
                        if (matcher.group(3) != null) {
                            matcher.group(3);
                        } else if (matcher.group(4) != null) {
                            matcher.group(4);
                        }
                    }
                    Logger.debug();
                    return i2;
                }
                if (i2 == 8) {
                    Throwable cause = th.getCause();
                    if (cause == null || !(cause instanceof ConnectException)) {
                        return i2;
                    }
                    String message3 = cause.getMessage();
                    Logger.debug();
                    Matcher matcher2 = Pattern.compile("failed to connect to +([\\w\\.\\-]+)?/(\\[([a-zA-Z0-9:]+)\\]|(\\d{1,3}(\\.\\d{1,3}){3,3})) \\(port \\d+\\)( +after \\d+ms)?: +\\w+ failed: (E[A-Z]+) .*").matcher(message3);
                    if (matcher2.matches()) {
                        if (matcher2.group(3) != null) {
                            matcher2.group(3);
                        } else if (matcher2.group(4) != null) {
                            matcher2.group(4);
                        }
                        String group = matcher2.group(7);
                        if (group != null) {
                            if ("ECONNRESET".equals(group)) {
                                i2 = 12;
                            } else if ("ECONNREFUSED".equals(group)) {
                                i2 = 13;
                            } else if ("EHOSTUNREACH".equals(group)) {
                                i2 = 14;
                            } else if ("ENETUNREACH".equals(group)) {
                                i2 = 15;
                            } else if ("EADDRNOTAVAIL".equals(group)) {
                                i2 = 16;
                            } else if ("EADDRINUSE".equals(group)) {
                                i2 = 17;
                            }
                        }
                    }
                    Logger.debug();
                    return i2;
                }
                if (i2 != 4) {
                    return i2;
                }
            }
            String message4 = th.getMessage();
            if (message4.indexOf(" EIO (I/O error)") > 0) {
                return 37;
            }
            if (!(th instanceof FileNotFoundException) && message4.indexOf(" ENOENT ") <= 0 && message4.indexOf("No such file or directory") <= 0) {
                if (message4.indexOf(" ENOSPC ") <= 0 && message4.indexOf("No space left on device") <= 0) {
                    if (message4.indexOf(" EDQUOT ") > 0) {
                        return 34;
                    }
                    if (message4.indexOf(" EROFS ") > 0) {
                        return 35;
                    }
                    if (message4.indexOf(" EACCES ") <= 0) {
                        return i2;
                    }
                    return 36;
                }
                return 32;
            }
            return 33;
        } catch (Exception unused) {
            return i2;
        }
    }

    public static final int LJIIJJI(StickerSetInfo stickerSetInfo) {
        o.LJIIIZ(stickerSetInfo, "<this>");
        C71572rR c71572rR = C71572rR.LJII;
        Long setId = stickerSetInfo.getSetId();
        List list = (List) c71572rR.LIZ.get(C71572rR.LJJI());
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (o.LJ(((StickerSetInfo) next).getSetId(), setId)) {
                    if (next != null) {
                        return EnumC71912rz.ADDED.getStatus();
                    }
                }
            }
        }
        return EnumC71912rz.IN_STORE.getStatus();
    }

    public static final OSZ LJIIL(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = PatternProtector.compile(":[0-9]*:[0-9]*").matcher(str);
        if (!matcher.find()) {
            return null;
        }
        String substring = str.substring(matcher.start(), matcher.end());
        o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        String substring2 = substring.substring(s.LJJLIIIJJIZ(substring, ':', 0, false, 6) + 1, s.LJJLIIIJLLLLLLLZ(substring, ':', 0, 6));
        o.LJIIIIZZ(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
        Integer LJJIL = C38350F3i.LJJIL(substring2);
        String substring3 = substring.substring(s.LJJLIIIJLLLLLLLZ(substring, ':', 0, 6) + 1, substring.length());
        o.LJIIIIZZ(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
        Integer LJJIL2 = C38350F3i.LJJIL(substring3);
        if (LJJIL == null || LJJIL2 == null) {
            return null;
        }
        return new OSZ(LJJIL, LJJIL2);
    }

    public static RectF LJIILJJIL(PointF[] pointFArr) {
        PointF pointF = pointFArr[0];
        float f = pointF.x;
        float f2 = pointF.y;
        float f3 = f;
        float f4 = f2;
        for (PointF pointF2 : pointFArr) {
            float f5 = pointF2.x;
            if (f5 < f) {
                f = f5;
            }
            if (f5 > f3) {
                f3 = f5;
            }
            float f6 = pointF2.y;
            if (f6 < f2) {
                f2 = f6;
            }
            if (f6 > f4) {
                f4 = f6;
            }
        }
        return new RectF(f, f2, f3, f4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        return (X.C1DT) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if ((r1.LJLJI & 8) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        r1 = r1.LJLJJL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        if (r1 == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0032, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x000d, code lost:
    
        if ((r1.LJLJI & 8) != 0) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if ((r1.LJLILLLLZI & 8) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if ((r1 instanceof X.C1DT) == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if (r1.LJJJJ().LJLILLLLZI == false) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.1M3] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v5, types: [X.1M3] */
    /* JADX WARN: Type inference failed for: r1v6, types: [X.1M3] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C1DT LJIILL(X.C29321Dc r1) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            X.0D4 r0 = r1.LLI
            X.1M3 r1 = r0.LJ
            int r0 = r1.LJLJI
            r0 = r0 & 8
            if (r0 == 0) goto L32
        Lf:
            int r0 = r1.LJLILLLLZI
            r0 = r0 & 8
            if (r0 == 0) goto L27
            boolean r0 = r1 instanceof X.C1DT
            if (r0 == 0) goto L27
            r0 = r1
            X.1DT r0 = (X.C1DT) r0
            X.1JY r0 = r0.LJJJJ()
            boolean r0 = r0.LJLILLLLZI
            if (r0 == 0) goto L27
        L24:
            X.1DT r1 = (X.C1DT) r1
            return r1
        L27:
            int r0 = r1.LJLJI
            r0 = r0 & 8
            if (r0 == 0) goto L32
            X.1M3 r1 = r1.LJLJJL
            if (r1 == 0) goto L32
            goto Lf
        L32:
            r1 = 0
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1E4.LJIILL(X.1Dc):X.1DT");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        if ((r1.LJLJI & 8) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0022, code lost:
    
        r1 = r1.LJLJJL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0024, code lost:
    
        if (r1 == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0027, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x000d, code lost:
    
        if ((r1.LJLJI & 8) != 0) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if ((r1.LJLILLLLZI & 8) == 0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if ((r1 instanceof X.C1DT) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        return (X.C1DT) r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.1M3] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v5, types: [X.1M3] */
    /* JADX WARN: Type inference failed for: r1v6, types: [X.1M3] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C1DT LJIILLIIL(X.C29321Dc r1) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            X.0D4 r0 = r1.LLI
            X.1M3 r1 = r0.LJ
            int r0 = r1.LJLJI
            r0 = r0 & 8
            if (r0 == 0) goto L27
        Lf:
            int r0 = r1.LJLILLLLZI
            r0 = r0 & 8
            if (r0 == 0) goto L1c
            boolean r0 = r1 instanceof X.C1DT
            if (r0 == 0) goto L1c
        L19:
            X.1DT r1 = (X.C1DT) r1
            return r1
        L1c:
            int r0 = r1.LJLJI
            r0 = r0 & 8
            if (r0 == 0) goto L27
            X.1M3 r1 = r1.LJLJJL
            if (r1 == 0) goto L27
            goto Lf
        L27:
            r1 = 0
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1E4.LJIILLIIL(X.1Dc):X.1DT");
    }

    public static int LJJIFFI(String str) {
        try {
            return CastIntegerProtector.parseInt(str);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static long LJJII(String str) {
        try {
            return CastLongProtector.parseLong(str);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static final void LJJIIJ(C49920JiW c49920JiW) {
        o.LJIIIZ(c49920JiW, "<this>");
        c49920JiW.LJJIII = JSH.LJLZ;
        c49920JiW.LJJIFFI = JSH.LJLLLLLL;
        JSH.LJLZ = -1L;
        JSH.LJLLLLLL = -1L;
    }

    public static final boolean LJJIJ(Aweme aweme) {
        if (C79057V0z.LJJJJLL(aweme) && !C59027NEp.LIZ().LIZIZ(C79057V0z.LJIJJ(aweme))) {
            return true;
        }
        return false;
    }

    public static final ResolutionComponent LJJIJIIJI(C79143V4h c79143V4h) {
        Integer num = c79143V4h.width;
        if (num == null) {
            num = C79143V4h.DEFAULT_WIDTH;
        }
        o.LJIIIIZZ(num, "width ?: Resolution.DEFAULT_WIDTH");
        int intValue = num.intValue();
        Integer num2 = c79143V4h.height;
        if (num2 == null) {
            num2 = C79143V4h.DEFAULT_HEIGHT;
        }
        o.LJIIIIZZ(num2, "height ?: Resolution.DEFAULT_HEIGHT");
        return new ResolutionComponent(intValue, num2.intValue());
    }

    public static final String LJJIJIIJIL(java.util.Set toJsonString) {
        o.LJIIIZ(toJsonString, "$this$toJsonString");
        ArrayList arrayList = new ArrayList(C32I.LJJL(toJsonString, 10));
        Iterator it = toJsonString.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append('\"');
            LIZ.append(str);
            LIZ.append('\"');
            arrayList.add(X1D.LIZIZ(LIZ));
        }
        return arrayList.toString();
    }

    @Override // X.XC2
    public String LIZLLL(String nameStr) {
        o.LJIIIZ(nameStr, "nameStr");
        String resourceFinder = AlgorithmResourceFinder.resourceFinder(null, "", nameStr);
        o.LJIIIIZZ(resourceFinder, "resourceFinder(null, \"\", nameStr)");
        return resourceFinder;
    }

    @Override // X.InterfaceC176976x3
    public void LJ(int i) {
        C176956x1 c176956x1 = MF2.LIZ;
        if (c176956x1 != null) {
            c176956x1.LIZJ(i, "homepage_other_profile_info", false);
        }
    }

    @Override // X.InterfaceC74359TGh
    public void LJFF(long j) {
        InterfaceC170656mr LJJIIZI = C60903NvH.LJIIJJI().LJJIIZI();
        C6BK c6bk = new C6BK();
        c6bk.LIZ.put("duration", Long.valueOf(j));
        LJJIIZI.LJIJ("sticker_user_wait_time", c6bk.LJ());
    }

    public static final void LJI(TypedArray typedArray, int i) {
        if (typedArray.hasValue(i)) {
        } else {
            throw new IllegalArgumentException("Attribute not defined in set.");
        }
    }

    public static boolean LJIIIZ(Rect rect, PointF[] pointFArr) {
        boolean z = false;
        if (pointFArr == null || rect == null) {
            return false;
        }
        RectF LJIILJJIL = LJIILJJIL(pointFArr);
        if (LJIILJJIL.right < rect.left) {
            z = true;
        }
        if (LJIILJJIL.left > rect.right) {
            z = true;
        }
        if (LJIILJJIL.bottom < rect.top) {
            z = true;
        }
        if (LJIILJJIL.top > rect.bottom) {
            return true;
        }
        return z;
    }

    public static final void LJIIJ(C29321Dc c29321Dc, List list) {
        C25710zf<C29321Dc> LJIL = c29321Dc.LJIL();
        int i = LJIL.LJLJI;
        if (i > 0) {
            C29321Dc[] c29321DcArr = LJIL.LJLIL;
            o.LJII(c29321DcArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int i2 = 0;
            do {
                C29321Dc c29321Dc2 = c29321DcArr[i2];
                C1DT LJIILLIIL = LJIILLIIL(c29321Dc2);
                if (LJIILLIIL != null) {
                    list.add(LJIILLIIL);
                } else {
                    LJIIJ(c29321Dc2, list);
                }
                i2++;
            } while (i2 < i);
        }
    }

    public static final String LJIJI(Context context, C107794Kx event) {
        IMContact iMContact;
        o.LJIIIZ(event, "event");
        List<IMContact> list = event.LJLILLLLZI;
        if (list == null || (iMContact = (IMContact) ORZ.LJLLLL(list)) == null) {
            iMContact = event.LJLIL;
        }
        int i = event.LJLL;
        if (i == 2) {
            String string = context.getString(R.string.bfx, iMContact.getDisplayName());
            o.LJIIIIZZ(string, "this.getString(R.string.…ers, contact.displayName)");
            return string;
        }
        if (i > 2) {
            String string2 = context.getString(R.string.bfy, iMContact.getDisplayName(), Integer.valueOf(event.LJLL - 1));
            o.LJIIIIZZ(string2, "this.getString(R.string.…Name, event.shareNum - 1)");
            return string2;
        }
        String string3 = context.getString(R.string.h0n, iMContact.getDisplayName());
        o.LJIIIIZZ(string3, "this.getString(R.string.…ser, contact.displayName)");
        return string3;
    }

    public static final InterfaceC35811ar LJJI(MutableLiveData mutableLiveData, InterfaceC24520xk interfaceC24520xk) {
        o.LJIIIZ(mutableLiveData, "<this>");
        interfaceC24520xk.LJJIIJ(-2027206144);
        InterfaceC35811ar LJJ = LJJ(mutableLiveData, mutableLiveData.getValue(), interfaceC24520xk);
        interfaceC24520xk.LJJIJIIJIL();
        return LJJ;
    }

    public static void LJJIIZI(Context context, String str) {
        Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
        intent.setData(android.net.Uri.fromFile(new File(str)));
        InterfaceC37231EjL appToAppService = SandboxServiceImpl.LIZ().getAppToAppService();
        if (appToAppService != null) {
            appToAppService.LIZ(intent);
        }
        context.sendBroadcast(intent);
    }

    @Override // X.RTU
    public Object apply(Object obj, Object obj2) {
        C84767XOp t1 = (C84767XOp) obj;
        C84767XOp t2 = (C84767XOp) obj2;
        o.LJIIIZ(t1, "t1");
        o.LJIIIZ(t2, "t2");
        return C1E5.LJIIIIZZ(t1, t2);
    }

    public static Method LJIILIIL(Class cls, String str, Class[] clsArr) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return cls.getMethod(str, clsArr);
            } catch (Throwable th) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("exception in getMethod, pkg : ");
                LIZ.append(cls.getName());
                LIZ.append(", function : ");
                LIZ.append(str);
                LIZ.append(", ");
                LIZ.append(th.toString());
                String LIZIZ = X1D.LIZIZ(LIZ);
                EV4.LIZJ(EV4.LIZIZ("e"), C82519Wa3.LIZJ("ReflectUtils"), LIZIZ);
                try {
                    return cls.getDeclaredMethod(str, clsArr);
                } catch (Throwable unused) {
                }
            }
        }
        return null;
    }

    public static Object LJIJJ(Class cls, String str, Object... objArr) {
        Object obj = null;
        if (!TextUtils.isEmpty(str)) {
            Object[] objArr2 = new Object[0];
            try {
                Method LJIILIIL = LJIILIIL(cls, str, new Class[0]);
                if (LJIILIIL != null) {
                    LJIILIIL.setAccessible(true);
                    if (objArr.length > 0) {
                        obj = LJIIIIZZ(objArr[0], LJIILIIL, objArr2);
                    } else {
                        obj = LJIIIIZZ(null, LJIILIIL, objArr2);
                    }
                }
            } catch (Throwable th) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("exception in invokeMethod, pkg : ");
                LIZ.append(cls.getName());
                LIZ.append(", function : ");
                LIZ.append(str);
                LIZ.append(", ");
                LIZ.append(th.toString());
                String LIZIZ = X1D.LIZIZ(LIZ);
                EV4.LIZJ(EV4.LIZIZ("e"), C82519Wa3.LIZJ("ReflectUtils"), LIZIZ);
            }
        }
        return obj;
    }

    public static final InterfaceC35811ar LJJ(MutableLiveData mutableLiveData, Object obj, InterfaceC24520xk interfaceC24520xk) {
        o.LJIIIZ(mutableLiveData, "<this>");
        interfaceC24520xk.LJJIIJ(411178300);
        LifecycleOwner lifecycleOwner = (LifecycleOwner) interfaceC24520xk.LJIILLIIL(C04Q.LJ);
        interfaceC24520xk.LJJIIJ(-492369756);
        Object LJIILL = interfaceC24520xk.LJIILL();
        InterfaceC24520xk.LIZ.getClass();
        if (LJIILL == C24500xi.LIZIZ) {
            LJIILL = C78966Uyw.LJJJIL(obj);
            interfaceC24520xk.LJJIII(LJIILL);
        }
        interfaceC24520xk.LJJIJIIJIL();
        InterfaceC35811ar interfaceC35811ar = (InterfaceC35811ar) LJIILL;
        C24610xt.LIZ(mutableLiveData, lifecycleOwner, new IDqS28S0300000(mutableLiveData, lifecycleOwner, interfaceC35811ar, 3), interfaceC24520xk);
        interfaceC24520xk.LJJIJIIJIL();
        return interfaceC35811ar;
    }

    public static final String LJJIIJZLJL(int i, int i2, String url) {
        o.LJIIIZ(url, "url");
        Matcher matcher = PatternProtector.compile(":[0-9]*:[0-9]*").matcher(url);
        if (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(':');
            LIZ.append(i);
            LIZ.append(':');
            LIZ.append(i2);
            return s.LJLIL(url, start, end, X1D.LIZIZ(LIZ)).toString();
        }
        return url;
    }

    public static final String LJJIIZ(String url, int i, int i2, EnumC70569Rmn imageScene) {
        o.LJIIIZ(url, "url");
        o.LJIIIZ(imageScene, "imageScene");
        Matcher matcher = PatternProtector.compile(":[0-9]*:[0-9]*").matcher(url);
        if (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(':');
            LIZ.append(i);
            LIZ.append(':');
            LIZ.append(i2);
            return C70657RoD.LJIIJJI(s.LJLIL(url, start, end, X1D.LIZIZ(LIZ)).toString(), imageScene);
        }
        return C70657RoD.LJIIJJI(url, imageScene);
    }
}
