package X;

import Y.ARunnableS44S0100000_8;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.playerkit.model.PlayerThreadPriorityConfig;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.IWs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class HandlerC46758IWs extends Handler {
    public final InterfaceC46747IWh LIZ;
    public volatile int LIZIZ;
    public boolean LIZJ;
    public final InterfaceC46765IWz LIZLLL;

    public final void LIZ(int i) {
        int i2;
        if (i > 0) {
            Object value = IZ8.LLZ.getValue();
            o.LJIIIIZZ(value, "<get-minProgressInterval>(...)");
            int intValue = ((Number) value).intValue();
            if (i < intValue) {
                i = intValue;
            }
            this.LIZIZ = i;
        }
        Object value2 = IZ8.LLZILL.getValue();
        o.LJIIIIZZ(value2, "<get-startProgressDelay>(...)");
        if (((Boolean) value2).booleanValue()) {
            i2 = this.LIZIZ;
        } else {
            i2 = 0;
        }
        sendEmptyMessageDelayed(12, i2);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        InterfaceC46747IWh interfaceC46747IWh = this.LIZ;
        if (interfaceC46747IWh == null || this.LIZJ) {
            return;
        }
        int i = message.what;
        boolean z = true;
        if (i != 1) {
            if (i != 255) {
                switch (i) {
                    case 3:
                        interfaceC46747IWh.start();
                        return;
                    case 4:
                        Object obj = message.obj;
                        if (obj == null) {
                            interfaceC46747IWh.resume();
                            return;
                        } else {
                            interfaceC46747IWh.LJLILLLLZI((String) obj);
                            return;
                        }
                    case 5:
                        interfaceC46747IWh.pause();
                        return;
                    case 6:
                        interfaceC46747IWh.stop();
                        return;
                    case 7:
                        Object obj2 = message.obj;
                        if ((obj2 instanceof Boolean) && ((Boolean) obj2).booleanValue()) {
                            if (1 == IZ8.LJJJI()) {
                                Object value = IZ8.b.getValue();
                                o.LJIIIIZZ(value, "<get-PLAYER_THREAD_PRIORITY_CONFIG>(...)");
                                this.LIZ.LJLJJI(((PlayerThreadPriorityConfig) value).getReleaseStoryValue());
                            } else {
                                this.LIZ.LJLIL(EnumC38817FLh.LOW);
                            }
                        }
                        this.LIZ.release();
                        this.LIZJ = true;
                        InterfaceC46765IWz interfaceC46765IWz = this.LIZLLL;
                        if (interfaceC46765IWz == null) {
                            return;
                        }
                        IXD ixd = (IXD) interfaceC46765IWz;
                        ixd.LIZIZ.LJI.post(new ARunnableS44S0100000_8(ixd, 172));
                        return;
                    case 8:
                        interfaceC46747IWh.LJJLIL();
                        return;
                    case 9:
                        Pair pair = (Pair) message.obj;
                        if (pair == null) {
                            return;
                        }
                        interfaceC46747IWh.setVolume(((Float) pair.first).floatValue(), ((Float) pair.second).floatValue());
                        return;
                    default:
                        switch (i) {
                            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                                interfaceC46747IWh.LJJIIJ(((Float) message.obj).floatValue());
                                return;
                            case 12:
                                interfaceC46747IWh.LJLJJL();
                                Object value2 = IZ8.LLLZLL.getValue();
                                o.LJIIIIZZ(value2, "<get-PROGRESS_CLEAR_OLD_MSG_BEFORE_NEW_MSG>(...)");
                                if (((Boolean) value2).booleanValue()) {
                                    removeMessages(12);
                                }
                                sendEmptyMessageDelayed(12, this.LIZIZ);
                                return;
                            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                                Pair pair2 = (Pair) message.obj;
                                if (pair2 == null) {
                                    return;
                                }
                                interfaceC46747IWh.LJLJLLL(((Integer) pair2.first).intValue(), ((Integer) pair2.second).intValue());
                                return;
                            case 14:
                                interfaceC46747IWh.setDisplay((SurfaceHolder) message.obj);
                                return;
                            case 15:
                                interfaceC46747IWh.setSurface((Surface) message.obj);
                                this.LIZ.LJLLJ((Surface) message.obj);
                                return;
                            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                                interfaceC46747IWh.init();
                                return;
                            case 17:
                                Object obj3 = message.obj;
                                if ((obj3 instanceof Boolean) && ((Boolean) obj3).booleanValue()) {
                                    if (1 == IZ8.LJJJI()) {
                                        Object value3 = IZ8.b.getValue();
                                        o.LJIIIIZZ(value3, "<get-PLAYER_THREAD_PRIORITY_CONFIG>(...)");
                                        this.LIZ.LJLJJI(((PlayerThreadPriorityConfig) value3).getCleanStoryValue());
                                    } else {
                                        this.LIZ.LJLIL(EnumC38817FLh.LOW);
                                    }
                                }
                                this.LIZ.LJLLJ(null);
                                this.LIZ.LJJLI();
                                Object value4 = IZ8.LJLZ.getValue();
                                o.LJIIIIZZ(value4, "<get-PLAYER_CLEAR_SURFACE_WHEN_RESET>(...)");
                                if (!((Boolean) value4).booleanValue()) {
                                    return;
                                }
                                this.LIZ.setSurface(null);
                                return;
                            case 18:
                                int i2 = message.arg1;
                                if (i2 == 0) {
                                    interfaceC46747IWh.LJJLIIIJLLLLLLLZ(message.arg2);
                                    return;
                                }
                                if (i2 == 1) {
                                    if (message.arg2 != 1) {
                                        z = false;
                                    }
                                    interfaceC46747IWh.LJLI(z);
                                    return;
                                } else if (i2 == 2) {
                                    interfaceC46747IWh.LJJLIIIJJIZ((InterfaceC46826IZi) message.obj);
                                    return;
                                } else {
                                    if (i2 != 3) {
                                        return;
                                    }
                                    interfaceC46747IWh.LJJLIIIJ(message.arg2, (JSONObject) message.obj);
                                    return;
                                }
                            case 19:
                                interfaceC46747IWh.LJJL();
                                return;
                            case 20:
                                interfaceC46747IWh.LJLLILLLL();
                                return;
                            case 21:
                                interfaceC46747IWh.setSurface((Surface) message.obj);
                                return;
                            case 22:
                                int i3 = message.arg1;
                                if (i3 == 0) {
                                    interfaceC46747IWh.LJJLIIIJILLIZJL(message.arg2);
                                    return;
                                } else {
                                    if (i3 != 2) {
                                        return;
                                    }
                                    interfaceC46747IWh.LJJLIIIIJ((InterfaceC46803IYl) message.obj);
                                    return;
                                }
                            case 23:
                                Bundle bundle = (Bundle) message.obj;
                                interfaceC46747IWh.LJLL(bundle.getBoolean("crop_param_open", false), bundle);
                                return;
                            case 24:
                                Bundle bundle2 = (Bundle) message.obj;
                                interfaceC46747IWh.LJJZ(bundle2.getInt("texture_layout_param", 0), bundle2);
                                return;
                            case 25:
                                C74152vb c74152vb = (C74152vb) message.obj;
                                if (c74152vb == null) {
                                    return;
                                }
                                interfaceC46747IWh.LJI(c74152vb);
                                return;
                            case 26:
                                interfaceC46747IWh.LJLLLLLL((InterfaceC47128Iea) message.obj);
                                return;
                            case 27:
                                interfaceC46747IWh.LJL((Bundle) message.obj);
                                return;
                            default:
                                return;
                        }
                }
            }
            interfaceC46747IWh.LIZJ((IU1) message.obj);
            return;
        }
        interfaceC46747IWh.LJLIIIL((IX4) message.obj);
        if (1 == IZ8.LJJJI()) {
            Object value5 = IZ8.b.getValue();
            o.LJIIIIZZ(value5, "<get-PLAYER_THREAD_PRIORITY_CONFIG>(...)");
            PlayerThreadPriorityConfig playerThreadPriorityConfig = (PlayerThreadPriorityConfig) value5;
            IX4 ix4 = (IX4) message.obj;
            if (ix4.LJJ && ix4.LJLLLL) {
                this.LIZ.LJLJJI(playerThreadPriorityConfig.getPreprepareStoryValue());
                return;
            } else {
                this.LIZ.LJLJJI(playerThreadPriorityConfig.getPrepareStoryValue());
                return;
            }
        }
        Object obj4 = message.obj;
        if (obj4 == null) {
            return;
        }
        IX4 ix42 = (IX4) obj4;
        if (!ix42.LJZ) {
            return;
        }
        if (ix42.LJJ && ix42.LJLLLL) {
            this.LIZ.LJLIL(EnumC38817FLh.LOW);
        } else {
            this.LIZ.LJLIL(EnumC38817FLh.NORMAL);
        }
    }

    public HandlerC46758IWs(IXD ixd, Looper looper, IXA ixa) {
        super(looper);
        Object value = IZ8.LLZ.getValue();
        o.LJIIIIZZ(value, "<get-minProgressInterval>(...)");
        int intValue = ((Number) value).intValue();
        this.LIZIZ = 300 >= intValue ? 300 : intValue;
        this.LIZ = ixa;
        this.LIZLLL = ixd;
    }
}
