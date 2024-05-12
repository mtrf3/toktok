package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.texturerender.VideoSurface;
import com.ss.ttm.player.AudioProcessor;
import com.ss.ttm.player.IMediaDataSource;
import com.ss.ttm.player.TraitObject;
import com.ss.ttvideoengine.TTVideoEngineImpl;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.io.FileDescriptor;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONObject;

/* renamed from: X.Iof, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class HandlerC47753Iof extends Handler {
    public final WeakReference<TTVideoEngineImpl> LIZ;
    public final /* synthetic */ C47767Iot LIZIZ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r4v24 */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        java.util.Map map;
        Object obj;
        Condition condition;
        boolean z;
        boolean z2;
        float f;
        boolean z3;
        boolean z4;
        String str;
        HandlerC47753Iof handlerC47753Iof;
        ?? r4;
        ?? r42;
        boolean z5;
        boolean z6;
        String str2;
        int i;
        int currentPosition;
        int duration;
        long longOption;
        int i2;
        TTVideoEngineImpl tTVideoEngineImpl = this.LIZ.get();
        if (tTVideoEngineImpl == null) {
            TTVideoEngineLog.w("TTVideoEngineLooperThread", "engine is null, return.");
            return;
        }
        Object obj2 = message.obj;
        java.util.Map<Integer, String> map2 = null;
        r4 = null;
        r4 = null;
        Object obj3 = null;
        r4 = null;
        String str3 = null;
        r4 = null;
        String str4 = null;
        r4 = null;
        String str5 = null;
        map2 = null;
        if (obj2 != null) {
            map = (java.util.Map) obj2;
            if (map.containsKey("msgCond")) {
                condition = (Condition) map.get("msgCond");
            } else {
                condition = null;
            }
            if (map.containsKey("paramObj")) {
                obj = map.get("paramObj");
            } else {
                obj = null;
            }
        } else {
            map = null;
            obj = null;
            condition = null;
        }
        int i3 = message.what;
        if (i3 != 111) {
            if (i3 != 300) {
                if (i3 != 301) {
                    switch (i3) {
                        case 1:
                            tTVideoEngineImpl.LJJJIL();
                            break;
                        case 2:
                            tTVideoEngineImpl.LJJJI();
                            break;
                        case 3:
                            tTVideoEngineImpl.LJJLIIIJLLLLLLLZ();
                            break;
                        case 4:
                            tTVideoEngineImpl.LJJJJI();
                            break;
                        case 5:
                            tTVideoEngineImpl.LJJJJIZL();
                            break;
                        case 6:
                            if (message.arg1 == 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            tTVideoEngineImpl.LJJJZ(z);
                            break;
                        case 7:
                            tTVideoEngineImpl.LJZI(message.arg1, false);
                            break;
                        case 8:
                            if (obj != null) {
                                EnumC47176IfM enumC47176IfM = (EnumC47176IfM) obj;
                                if (map != null && map.containsKey("paramObj1")) {
                                    map2 = (java.util.Map) map.get("paramObj1");
                                }
                                tTVideoEngineImpl.LLIIII(enumC47176IfM, map2);
                                break;
                            } else {
                                TTVideoEngineLog.w("TTVideoEngineLooperThread", "_configResolution invalid param");
                                break;
                            }
                            break;
                        case 9:
                            if (obj != null) {
                                float floatValue = ((Float) obj).floatValue();
                                if (map != null && map.containsKey("paramObj1")) {
                                    tTVideoEngineImpl.LJIJJLI(floatValue, ((Float) map.get("paramObj1")).floatValue());
                                    break;
                                } else {
                                    tTVideoEngineImpl.LJIJJLI(floatValue, floatValue);
                                    break;
                                }
                            } else {
                                TTVideoEngineLog.w("TTVideoEngineLooperThread", "_setPlayerVolume invalid param");
                                break;
                            }
                        case 10:
                            if (message.arg1 == 1) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            C78253UnR.LJI("TTVideoEngine", C16880lQ.LLLZ("setIsMute:%s", new Object[]{Boolean.valueOf(z2)}));
                            tTVideoEngineImpl.LJJJLL = z2;
                            InterfaceC47775Ip1 interfaceC47775Ip1 = tTVideoEngineImpl.LJ;
                            if (interfaceC47775Ip1 != null) {
                                if (interfaceC47775Ip1.LJI()) {
                                    if (z2) {
                                        f = 0.0f;
                                    } else {
                                        f = 1.0f;
                                    }
                                    try {
                                        interfaceC47775Ip1.setVolume(f, f);
                                        break;
                                    } catch (Exception unused) {
                                        break;
                                    }
                                } else {
                                    interfaceC47775Ip1.LJIIJ(z2);
                                    break;
                                }
                            }
                            break;
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                            C78253UnR.LJI("TTVideoEngine", "_pause ");
                            if (!tTVideoEngineImpl.LJJIJIIJIL) {
                                tTVideoEngineImpl.LJJIJ = true;
                                break;
                            } else {
                                InterfaceC47775Ip1 interfaceC47775Ip12 = tTVideoEngineImpl.LJ;
                                if (interfaceC47775Ip12 != null) {
                                    C78253UnR.LJI("TTVideoEngine", "player will pause by interruption");
                                    interfaceC47775Ip12.pause();
                                    tTVideoEngineImpl.LJIIL = 2;
                                    break;
                                }
                            }
                            break;
                        case 12:
                            if (obj != null) {
                                tTVideoEngineImpl.LJJII();
                                tTVideoEngineImpl.q0 = (FileDescriptor) obj;
                                C47750Ioc c47750Ioc = tTVideoEngineImpl.e;
                                if (c47750Ioc != null) {
                                    c47750Ioc.LJJJJ(6, null);
                                    break;
                                }
                            } else {
                                TTVideoEngineLog.w("TTVideoEngineLooperThread", "_doSetDataSource invalid param");
                                break;
                            }
                            break;
                        case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                            if (obj != null) {
                                tTVideoEngineImpl.LJJII();
                                tTVideoEngineImpl.t0 = (IMediaDataSource) obj;
                                C47750Ioc c47750Ioc2 = tTVideoEngineImpl.e;
                                if (c47750Ioc2 != null) {
                                    c47750Ioc2.LJJJJ(7, null);
                                    break;
                                }
                            } else {
                                TTVideoEngineLog.w("TTVideoEngineLooperThread", "_doSetDataSource invalid param");
                                break;
                            }
                            break;
                        case 14:
                            if (obj != null) {
                                tTVideoEngineImpl.LJJLIIIJL((String) obj);
                                break;
                            } else {
                                TTVideoEngineLog.w("TTVideoEngineLooperThread", "_doSetVideoID invalid param");
                                break;
                            }
                        case 15:
                            if (obj != null) {
                                C47901Ir3 c47901Ir3 = (C47901Ir3) obj;
                                tTVideoEngineImpl.f126n = EnumC47176IfM.Standard;
                                tTVideoEngineImpl.LJJII();
                                C47901Ir3 c47901Ir32 = tTVideoEngineImpl.V;
                                if (c47901Ir32 != null && !c47901Ir32.equals(c47901Ir3)) {
                                    tTVideoEngineImpl.LJLLJ();
                                    tTVideoEngineImpl.LJJI = false;
                                    z3 = true;
                                    tTVideoEngineImpl.e0 = true;
                                    tTVideoEngineImpl.g0 = true;
                                    tTVideoEngineImpl.f0 = true;
                                    tTVideoEngineImpl.LJIIJJI = 0;
                                    tTVideoEngineImpl.LJJIIZI = false;
                                    tTVideoEngineImpl.LJJJJLL = 0;
                                    tTVideoEngineImpl.h = null;
                                    tTVideoEngineImpl.A = null;
                                } else {
                                    z3 = true;
                                }
                                tTVideoEngineImpl.LJJIJIIJI = false;
                                tTVideoEngineImpl.U = z3;
                                tTVideoEngineImpl.V = c47901Ir3;
                                tTVideoEngineImpl.p0 = 0L;
                                tTVideoEngineImpl.LLLZZ = null;
                                tTVideoEngineImpl.e.LJJJJ(3, null);
                                C78253UnR.LJI("TTVideoEngine", "set preloaderitem");
                                break;
                            } else {
                                TTVideoEngineLog.w("TTVideoEngineLooperThread", "_doSetVideoID invalid param");
                                break;
                            }
                            break;
                        case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                            if (obj != null) {
                                tTVideoEngineImpl.LJJLIIIJLJLI((InterfaceC47616ImS) obj);
                                break;
                            } else {
                                TTVideoEngineLog.w("TTVideoEngineLooperThread", "_doSetVideoModel invalid param");
                                break;
                            }
                        case 17:
                            if (obj != null) {
                                C47900Ir2 c47900Ir2 = (C47900Ir2) obj;
                                if (System.currentTimeMillis() / 1000 > 0) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (TextUtils.isEmpty(null) || z4) {
                                    if (tTVideoEngineImpl.b5.LIZ(false)) {
                                        tTVideoEngineImpl.b5.LIZLLL(14, 0, 0, null);
                                        break;
                                    } else {
                                        tTVideoEngineImpl.LJJLIIIJL(null);
                                        break;
                                    }
                                } else {
                                    tTVideoEngineImpl.LJJII();
                                    if (!c47900Ir2.equals(tTVideoEngineImpl.d0)) {
                                        if (tTVideoEngineImpl.d0 != null) {
                                            tTVideoEngineImpl.LJLLJ();
                                        }
                                        tTVideoEngineImpl.c0 = true;
                                        tTVideoEngineImpl.e0 = true;
                                        tTVideoEngineImpl.g0 = true;
                                        tTVideoEngineImpl.f0 = true;
                                        tTVideoEngineImpl.LJIIJJI = 0;
                                        tTVideoEngineImpl.LJJIIZI = false;
                                        tTVideoEngineImpl.LJJJJLL = 0;
                                        tTVideoEngineImpl.A = null;
                                    }
                                    tTVideoEngineImpl.LJJIJIIJI = false;
                                    tTVideoEngineImpl.d0 = c47900Ir2;
                                    tTVideoEngineImpl.p0 = 0L;
                                    tTVideoEngineImpl.LLLZZ = null;
                                    tTVideoEngineImpl.e.LJJJJ(2, null);
                                    break;
                                }
                            } else {
                                TTVideoEngineLog.w("TTVideoEngineLooperThread", "_doSetPlayItem invalid param");
                                break;
                            }
                        case 18:
                            if (obj != null) {
                                tTVideoEngineImpl.LJJJLL((String) obj);
                                break;
                            } else {
                                TTVideoEngineLog.w("TTVideoEngineLooperThread", "_doSetLocalURL invalid param");
                                break;
                            }
                        case 19:
                            if (obj != null) {
                                String str6 = (String) obj;
                                if (map != null && map.containsKey("paramObj1")) {
                                    map.get("paramObj1");
                                    tTVideoEngineImpl.LJJJJLL(str6, new String[]{str6});
                                    break;
                                } else {
                                    tTVideoEngineImpl.LJJJJLL(str6, new String[]{str6});
                                    break;
                                }
                            } else {
                                TTVideoEngineLog.w("TTVideoEngineLooperThread", "_doSetDirectURL invalid param");
                                break;
                            }
                            break;
                        case 20:
                            if (obj != null) {
                                String[] strArr = (String[]) obj;
                                if (map != null) {
                                    if (map.containsKey("paramObj1")) {
                                        str = (String) map.get("paramObj1");
                                    } else {
                                        str = null;
                                    }
                                    if (map.containsKey("paramObj2")) {
                                        str5 = (String) map.get("paramObj2");
                                    }
                                } else {
                                    str = null;
                                }
                                tTVideoEngineImpl.LJJJJZ(0L, str, str5, strArr);
                                break;
                            } else {
                                TTVideoEngineLog.w("TTVideoEngineLooperThread", "setDirectUrlUseDataLoader invalid param");
                                break;
                            }
                        case 21:
                            if (obj != null) {
                                String str7 = (String) obj;
                                if (map != null && map.containsKey("paramObj1")) {
                                    str4 = (String) map.get("paramObj1");
                                }
                                String[] strArr2 = {str7};
                                if (TextUtils.isEmpty(str7)) {
                                    C78253UnR.LIZLLL("TTVideoEngine", "invalid urls list, it is empty");
                                    break;
                                } else if (TextUtils.isEmpty(str4)) {
                                    tTVideoEngineImpl.LLLLJ(strArr2[0]);
                                    tTVideoEngineImpl.e.LJJIIZI(174, EnumC47719Io7.EmptyFilepath.ordinal());
                                    break;
                                } else if (tTVideoEngineImpl.LIZ(160, tTVideoEngineImpl.A0) == 0) {
                                    tTVideoEngineImpl.LLLLJ(strArr2[0]);
                                    tTVideoEngineImpl.e.LJJIIZI(174, EnumC47719Io7.OptionNotSet.ordinal());
                                    break;
                                } else {
                                    tTVideoEngineImpl.LJLLLL();
                                    String LJIIL = C47756Ioi.LJIIL(tTVideoEngineImpl.LIZLLL, str4);
                                    String LJLJI = tTVideoEngineImpl.LJLJI(LJIIL, tTVideoEngineImpl.LLLZZ, tTVideoEngineImpl.LIZ(161, tTVideoEngineImpl.C0), strArr2, EnumC47176IfM.Undefine, tTVideoEngineImpl.Q, null, str4, null, 0L);
                                    if (!((ArrayList) tTVideoEngineImpl.i5).contains(LJIIL)) {
                                        ((ArrayList) tTVideoEngineImpl.i5).add(LJIIL);
                                    }
                                    if (TextUtils.isEmpty(LJLJI)) {
                                        tTVideoEngineImpl.LLLLJ(strArr2[0]);
                                        break;
                                    } else {
                                        tTVideoEngineImpl.LLLLJ(LJLJI);
                                        break;
                                    }
                                }
                            } else {
                                TTVideoEngineLog.w("TTVideoEngineLooperThread", "setDirectUrlUseDataLoader invalid param");
                                break;
                            }
                            break;
                        case 22:
                            tTVideoEngineImpl.LJJJJ();
                            break;
                        case 23:
                            tTVideoEngineImpl.LJJIIJZLJL = true;
                            tTVideoEngineImpl.LJJIIZ = false;
                            tTVideoEngineImpl.LJJIIZI = false;
                            tTVideoEngineImpl.LJJJIL = 0;
                            tTVideoEngineImpl.LJLJL(true);
                            tTVideoEngineImpl.LJJJJ = false;
                            break;
                        case 24:
                            tTVideoEngineImpl.LLIIIILZ();
                            if (tTVideoEngineImpl.LIZ(160, tTVideoEngineImpl.A0) > 0) {
                                C47148Ieu.LIZ.LJJJJJ();
                            }
                            C47767Iot c47767Iot = tTVideoEngineImpl.b5;
                            int LIZ = tTVideoEngineImpl.LIZ(657, tTVideoEngineImpl.R5);
                            if (c47767Iot.LJIIIZ.LJIIJJI != 5 && (handlerC47753Iof = c47767Iot.LIZIZ) != null) {
                                HashMap hashMap = new HashMap();
                                hashMap.put("paramObj", null);
                                Message obtainMessage = handlerC47753Iof.obtainMessage(24, 0, 0);
                                obtainMessage.obj = hashMap;
                                handlerC47753Iof.postDelayed(new ETG(handlerC47753Iof, obtainMessage), LIZ);
                                break;
                            }
                            break;
                        default:
                            switch (i3) {
                                case 26:
                                    if (obj != null) {
                                        TTVideoEngineLog.d("TTVideoEngineLooperThread", "looper setStrategySource");
                                        InterfaceC47596Im8 interfaceC47596Im8 = (InterfaceC47596Im8) obj;
                                        tTVideoEngineImpl.LJJII();
                                        try {
                                            tTVideoEngineImpl.E6.LIZ(interfaceC47596Im8);
                                            break;
                                        } catch (C47867IqV e) {
                                            C16880lQ.LLLLIIL(e);
                                            break;
                                        }
                                    } else {
                                        TTVideoEngineLog.w("TTVideoEngineLooperThread", "setStrategySource invalid param");
                                        break;
                                    }
                                case 27:
                                    TTVideoEngineLog.d("TTVideoEngineLooperThread", "looper forceDraw");
                                    StringBuilder LIZ2 = X1D.LIZ();
                                    LIZ2.append("forceDraw ");
                                    LIZ2.append(tTVideoEngineImpl.O0);
                                    TTVideoEngineLog.d("TTVideoEngine", X1D.LIZIZ(LIZ2));
                                    VideoSurface videoSurface = tTVideoEngineImpl.O0;
                                    if (videoSurface != null) {
                                        videoSurface.LJJ(25, 1);
                                        break;
                                    }
                                    break;
                                case 28:
                                    StringBuilder LIZ3 = X1D.LIZ();
                                    LIZ3.append("looper setRotation ");
                                    C47956Irw.LIZIZ(LIZ3, message.arg1, LIZ3, "TTVideoEngineLooperThread");
                                    int i4 = message.arg1;
                                    VideoSurface videoSurface2 = tTVideoEngineImpl.O0;
                                    if (videoSurface2 != null) {
                                        if (i4 != 0 && i4 != 90 && i4 != 180 && i4 != 270) {
                                            i4 = 0;
                                        }
                                        tTVideoEngineImpl.LLIIIL = i4;
                                        videoSurface2.LJJ(29, i4);
                                        break;
                                    }
                                    break;
                                case 29:
                                    StringBuilder LIZ4 = X1D.LIZ();
                                    LIZ4.append("looper setMirrorHorizontal ");
                                    C47956Irw.LIZIZ(LIZ4, message.arg1, LIZ4, "TTVideoEngineLooperThread");
                                    if (message.arg1 > 0) {
                                        r4 = 1;
                                    } else {
                                        r4 = 0;
                                    }
                                    VideoSurface videoSurface3 = tTVideoEngineImpl.O0;
                                    if (videoSurface3 != 0) {
                                        tTVideoEngineImpl.LLIIIZ = r4;
                                        videoSurface3.LJJ(30, r4);
                                        break;
                                    }
                                    break;
                                case 30:
                                    StringBuilder LIZ5 = X1D.LIZ();
                                    LIZ5.append("looper setMirrorVertical ");
                                    C47956Irw.LIZIZ(LIZ5, message.arg1, LIZ5, "TTVideoEngineLooperThread");
                                    if (message.arg1 > 0) {
                                        r42 = 1;
                                    } else {
                                        r42 = 0;
                                    }
                                    VideoSurface videoSurface4 = tTVideoEngineImpl.O0;
                                    if (videoSurface4 != 0) {
                                        tTVideoEngineImpl.LLIIJI = r42;
                                        videoSurface4.LJJ(31, r42);
                                        break;
                                    }
                                    break;
                                case 31:
                                    if (obj != null) {
                                        TTVideoEngineLog.d("TTVideoEngineLooperThread", "looper setPlayAuthToken");
                                        tTVideoEngineImpl.LLIZLLLIL((String) obj);
                                        break;
                                    } else {
                                        TTVideoEngineLog.w("TTVideoEngineLooperThread", "doSetPlayAuthToken invalid param");
                                        break;
                                    }
                                case 32:
                                    if (obj != null) {
                                        C47866IqU c47866IqU = (C47866IqU) obj;
                                        tTVideoEngineImpl.LJJJJZ(c47866IqU.LIZJ, c47866IqU.LIZLLL, c47866IqU.LIZ, c47866IqU.LIZIZ);
                                        break;
                                    } else {
                                        TTVideoEngineLog.w("TTVideoEngineLooperThread", "setDirectUrlUseDataLoader invalid param");
                                        break;
                                    }
                                case 33:
                                    tTVideoEngineImpl.LJJJJJL();
                                    break;
                                case 34:
                                    C78253UnR.LJI("TTVideoEngine", "create player async");
                                    if (tTVideoEngineImpl.e3 == null) {
                                        tTVideoEngineImpl.e3 = tTVideoEngineImpl.LLILZ();
                                        break;
                                    }
                                    break;
                                default:
                                    switch (i3) {
                                        case 50:
                                            if (message.arg1 == 1) {
                                                z5 = true;
                                            } else {
                                                z5 = false;
                                            }
                                            tTVideoEngineImpl.LJJJJL(message.arg2, z5);
                                            break;
                                        case 51:
                                            if (obj != null) {
                                                tTVideoEngineImpl.LLFZ((int[]) obj);
                                                break;
                                            } else {
                                                TTVideoEngineLog.w("TTVideoEngineLooperThread", "_setUnSupportSampleRates invalid param");
                                                break;
                                            }
                                        case 52:
                                            int i5 = message.arg1;
                                            InterfaceC47775Ip1 interfaceC47775Ip13 = tTVideoEngineImpl.LJ;
                                            if (interfaceC47775Ip13 != null) {
                                                interfaceC47775Ip13.LJ(79, i5);
                                                break;
                                            }
                                            break;
                                        case 53:
                                            if (obj != null) {
                                                tTVideoEngineImpl.LJJL((C46886Iag) obj);
                                                break;
                                            } else {
                                                TTVideoEngineLog.w("TTVideoEngineLooperThread", "_doSetPlaybackParams invalid param");
                                                break;
                                            }
                                        case 54:
                                            tTVideoEngineImpl.LJJLIIIJILLIZJL((Surface) obj);
                                            break;
                                        case 55:
                                            SurfaceHolder surfaceHolder = (SurfaceHolder) obj;
                                            if (message.arg1 == 1) {
                                                z6 = true;
                                            } else {
                                                z6 = false;
                                            }
                                            tTVideoEngineImpl.LJJLIIIJJI(surfaceHolder, z6);
                                            break;
                                        case 56:
                                            tTVideoEngineImpl.LJJLI(message.arg1, (Surface) obj);
                                            break;
                                        case 57:
                                            String str8 = (String) obj;
                                            if (map != null && map.containsKey("paramObj1")) {
                                                str3 = (String) map.get("paramObj1");
                                            }
                                            tTVideoEngineImpl.LJJJJLI(str8, str3);
                                            break;
                                        default:
                                            switch (i3) {
                                                case 101:
                                                    tTVideoEngineImpl.LJJJJZI(message.arg1, message.arg2);
                                                    break;
                                                case 102:
                                                    if (obj != null) {
                                                        tTVideoEngineImpl.LJJJLZIJ(message.arg1, ((Long) obj).longValue());
                                                        break;
                                                    } else {
                                                        StringBuilder LIZ6 = X1D.LIZ();
                                                        LIZ6.append("_doSetLongOption invalid param for key:");
                                                        LIZ6.append(message.arg1);
                                                        TTVideoEngineLog.w("TTVideoEngineLooperThread", X1D.LIZIZ(LIZ6));
                                                        break;
                                                    }
                                                case 103:
                                                    int LJJIJIIJIL = tTVideoEngineImpl.LJJIJIIJIL(message.arg1);
                                                    this.LIZIZ.LIZLLL.setDataPosition(0);
                                                    this.LIZIZ.LIZLLL.writeInt(LJJIJIIJIL);
                                                    break;
                                                case 104:
                                                    long LJJIJIL = tTVideoEngineImpl.LJJIJIL(message.arg1);
                                                    this.LIZIZ.LIZLLL.setDataPosition(0);
                                                    this.LIZIZ.LIZLLL.writeLong(LJJIJIL);
                                                    break;
                                                default:
                                                    switch (i3) {
                                                        case 106:
                                                            float LJJIJIIJI = tTVideoEngineImpl.LJJIJIIJI(message.arg1);
                                                            this.LIZIZ.LIZLLL.setDataPosition(0);
                                                            this.LIZIZ.LIZLLL.writeFloat(LJJIJIIJI);
                                                            break;
                                                        case 107:
                                                            String LJJIJL = tTVideoEngineImpl.LJJIJL(message.arg1);
                                                            this.LIZIZ.LIZLLL.setDataPosition(0);
                                                            this.LIZIZ.LIZLLL.writeString(LJJIJL);
                                                            break;
                                                        case 108:
                                                            if (obj != null) {
                                                                tTVideoEngineImpl.LJJLIIIIJ(message.arg1, (String) obj);
                                                                break;
                                                            } else {
                                                                StringBuilder LIZ7 = X1D.LIZ();
                                                                LIZ7.append("_doSetStrungOption invalid param for key:");
                                                                LIZ7.append(message.arg1);
                                                                TTVideoEngineLog.w("TTVideoEngineLooperThread", X1D.LIZIZ(LIZ7));
                                                                break;
                                                            }
                                                        case 109:
                                                            if (obj != null) {
                                                                if (message.arg1 == 441 && (obj instanceof AudioProcessor)) {
                                                                    AudioProcessor audioProcessor = (AudioProcessor) obj;
                                                                    tTVideoEngineImpl.I0 = audioProcessor;
                                                                    InterfaceC47775Ip1 interfaceC47775Ip14 = tTVideoEngineImpl.LJ;
                                                                    if (interfaceC47775Ip14 != null) {
                                                                        ((C48433Izd) interfaceC47775Ip14).LJJIFFI(audioProcessor);
                                                                        break;
                                                                    }
                                                                }
                                                            } else {
                                                                StringBuilder LIZ8 = X1D.LIZ();
                                                                LIZ8.append("_doSetObjectOption invalid param for key:");
                                                                LIZ8.append(message.arg1);
                                                                TTVideoEngineLog.w("TTVideoEngineLooperThread", X1D.LIZIZ(LIZ8));
                                                                break;
                                                            }
                                                            break;
                                                        default:
                                                            switch (i3) {
                                                                case 150:
                                                                    boolean LJJIL = tTVideoEngineImpl.LJJIL();
                                                                    this.LIZIZ.LIZLLL.setDataPosition(0);
                                                                    this.LIZIZ.LIZLLL.writeInt(LJJIL ? 1 : 0);
                                                                    break;
                                                                case 151:
                                                                    if (tTVideoEngineImpl.B || (tTVideoEngineImpl.LLLLIIL == 0 && tTVideoEngineImpl.LJJJJJL)) {
                                                                        i = tTVideoEngineImpl.LJJJJLL;
                                                                    } else {
                                                                        i = tTVideoEngineImpl.LJJZ();
                                                                    }
                                                                    tTVideoEngineImpl.LLIIIL(i);
                                                                    this.LIZIZ.LIZLLL.setDataPosition(0);
                                                                    this.LIZIZ.LIZLLL.writeInt(i);
                                                                    break;
                                                                case 152:
                                                                    int LJ = tTVideoEngineImpl.LJ();
                                                                    this.LIZIZ.LIZLLL.setDataPosition(0);
                                                                    this.LIZIZ.LIZLLL.writeInt(LJ);
                                                                    break;
                                                                case 153:
                                                                    int LIZLLL = tTVideoEngineImpl.LIZLLL();
                                                                    this.LIZIZ.LIZLLL.setDataPosition(0);
                                                                    this.LIZIZ.LIZLLL.writeInt(LIZLLL);
                                                                    break;
                                                                case 154:
                                                                    try {
                                                                        InterfaceC47775Ip1 interfaceC47775Ip15 = tTVideoEngineImpl.LJ;
                                                                        if (interfaceC47775Ip15 != null && interfaceC47775Ip15.LJIIJJI(5000, 0) != 0) {
                                                                            JSONObject jSONObject = new JSONObject();
                                                                            String LIZIZ = tTVideoEngineImpl.LJ.LIZIZ(5001);
                                                                            if (tTVideoEngineImpl.LJ.LJIIJJI(26, 1) == 1) {
                                                                                str2 = "breakpad crash";
                                                                            } else {
                                                                                str2 = "simple crash";
                                                                            }
                                                                            jSONObject.put(str2, LIZIZ);
                                                                            obj3 = jSONObject.toString();
                                                                        }
                                                                    } catch (Throwable unused2) {
                                                                    }
                                                                    this.LIZIZ.LIZLLL.setDataPosition(0);
                                                                    this.LIZIZ.LIZLLL.writeValue(obj3);
                                                                    break;
                                                                case 155:
                                                                    boolean LJJIJLIJ = tTVideoEngineImpl.LJJIJLIJ();
                                                                    this.LIZIZ.LIZLLL.setDataPosition(0);
                                                                    this.LIZIZ.LIZLLL.writeInt(LJJIJLIJ ? 1 : 0);
                                                                    break;
                                                                case 156:
                                                                    this.LIZIZ.LIZLLL.writeInt(tTVideoEngineImpl.LJJLIIJ() ? 1 : 0);
                                                                    break;
                                                                case 157:
                                                                    InterfaceC47775Ip1 interfaceC47775Ip16 = tTVideoEngineImpl.LJ;
                                                                    if (interfaceC47775Ip16 != null) {
                                                                        try {
                                                                            currentPosition = interfaceC47775Ip16.getCurrentPosition();
                                                                            duration = tTVideoEngineImpl.LJ.getDuration();
                                                                            longOption = tTVideoEngineImpl.LJ.getLongOption(72, -1L);
                                                                        } catch (Exception unused3) {
                                                                        }
                                                                        if (tTVideoEngineImpl.LJ.LJIIJJI(157, -1) == 7 && tTVideoEngineImpl.LJIIL == 1 && tTVideoEngineImpl.LJIILIIL == 1 && currentPosition >= 1000 && duration - currentPosition >= 1000 && longOption >= 500) {
                                                                            int LJIIJJI = tTVideoEngineImpl.LJ.LJIIJJI(160, 100);
                                                                            long longOption2 = tTVideoEngineImpl.LJ.getLongOption(152, -1L);
                                                                            int LJIIJJI2 = tTVideoEngineImpl.LJ.LJIIJJI(153, -1);
                                                                            float floatOption = tTVideoEngineImpl.LJ.getFloatOption(151, 0.0f);
                                                                            if (floatOption > tTVideoEngineImpl.LIZ(205, tTVideoEngineImpl.LLJ)) {
                                                                                floatOption /= 2.0f;
                                                                            }
                                                                            int LIZ9 = tTVideoEngineImpl.LIZ(207, tTVideoEngineImpl.LLJJJIL);
                                                                            int i6 = (((int) floatOption) * LIZ9) / (LIZ9 + 1);
                                                                            if (longOption2 <= -350) {
                                                                                if (LJIIJJI2 >= (i6 * 2) / 3 && LJIIJJI > 2) {
                                                                                    i2 = 0;
                                                                                    this.LIZIZ.LIZLLL.writeInt(i2);
                                                                                    break;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    i2 = 1;
                                                                    this.LIZIZ.LIZLLL.writeInt(i2);
                                                                    break;
                                                                default:
                                                                    StringBuilder LIZ10 = X1D.LIZ();
                                                                    LIZ10.append("unknown message: ");
                                                                    LIZ10.append(message.what);
                                                                    TTVideoEngineLog.w("TTVideoEngineLooperThread", X1D.LIZIZ(LIZ10));
                                                                    break;
                                                            }
                                                    }
                                            }
                                    }
                            }
                    }
                } else if (obj != null) {
                    tTVideoEngineImpl.LJJJ((InterfaceC47616ImS) obj);
                } else {
                    TTVideoEngineLog.w("TTVideoEngineLooperThread", "_doParseDNSComplete no model");
                }
            } else if (obj != null) {
                tTVideoEngineImpl.LJJIZ((String) obj);
            } else {
                TTVideoEngineLog.w("TTVideoEngineLooperThread", "_doParseDNSComplete invalid param");
            }
        } else {
            this.LIZIZ.LJIIL.LJJLIIIJJIZ(message.arg1, (TraitObject) obj);
        }
        Lock lock = this.LIZIZ.LIZJ;
        if (condition != null) {
            ReentrantLock reentrantLock = (ReentrantLock) lock;
            reentrantLock.lock();
            condition.signal();
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC47753Iof(C47767Iot c47767Iot, TTVideoEngineImpl tTVideoEngineImpl, Looper looper) {
        super(looper);
        this.LIZIZ = c47767Iot;
        this.LIZ = new WeakReference<>(tTVideoEngineImpl);
    }
}
