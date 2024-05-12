package Y;

import X.C06490Nh;
import X.C16880lQ;
import X.C47403Ij1;
import X.C47404Ij2;
import X.C47405Ij3;
import X.C47620ImW;
import X.C47750Ioc;
import X.C47751Iod;
import X.C47965Is5;
import X.C47966Is6;
import X.C47967Is7;
import X.C48270Ix0;
import X.C50937Jyv;
import X.C78253UnR;
import X.C82492WZc;
import X.C82493WZd;
import X.H78;
import X.IH1;
import X.InterfaceC47408Ij6;
import X.WZ5;
import X.X1D;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.mammon.audiosdk.enums.SAMICorePropertyId;
import com.mammon.audiosdk.structures.SAMICoreProperty;
import com.ss.android.ugc.aweme.legoImp.task.OverDrawMonitorTask$RenderNodeCollectThread;
import com.ss.android.ugc.aweme.net.mutli.network.SpeedModeServiceImpl;
import com.ss.android.ugc.aweme.setting.page.datasave.SpeedModeSettingImpl;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.ttvideoengine.TTVideoEngineImpl;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public class IDHandlerS21S0100000_8 extends Handler {
    public final int $t;
    public Object l0;

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        switch (this.$t) {
            case 1:
                dispatchMessage$0(this, message);
                return;
            default:
                super.dispatchMessage(message);
                return;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (this.$t) {
            case 0:
                handleMessage$0(this, message);
                return;
            case 1:
            default:
                super.handleMessage(message);
                return;
            case 2:
                handleMessage$1(this, message);
                return;
            case 3:
                handleMessage$2(this, message);
                return;
            case 4:
                handleMessage$3(this, message);
                return;
            case 5:
                handleMessage$4(this, message);
                return;
            case 6:
                handleMessage$5(this, message);
                return;
            case 7:
                handleMessage$6(this, message);
                return;
        }
    }

    public static final void dispatchMessage$0(IDHandlerS21S0100000_8 iDHandlerS21S0100000_8, Message msg) {
        o.LJIIIZ(msg, "msg");
        ((OverDrawMonitorTask$RenderNodeCollectThread) iDHandlerS21S0100000_8.l0).getClass();
        System.currentTimeMillis();
        throw null;
    }

    public static final void handleMessage$0(IDHandlerS21S0100000_8 iDHandlerS21S0100000_8, Message msg) {
        WeakReference weakReference;
        o.LJIIIZ(msg, "msg");
        int i = msg.what;
        boolean z = false;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5 || o.LJ(msg.obj, ((C47404Ij2) iDHandlerS21S0100000_8.l0).LIZLLL)) {
                            return;
                        }
                        ((C47404Ij2) iDHandlerS21S0100000_8.l0).LJII.remove(msg.obj);
                        return;
                    }
                    if (o.LJ(msg.obj, ((C47404Ij2) iDHandlerS21S0100000_8.l0).LIZLLL)) {
                        return;
                    }
                    ((C47404Ij2) iDHandlerS21S0100000_8.l0).LJII.put(msg.obj, 1);
                    return;
                }
                C47404Ij2 c47404Ij2 = (C47404Ij2) iDHandlerS21S0100000_8.l0;
                Object obj = msg.obj;
                if (obj != null) {
                    c47404Ij2.LIZIZ(((Boolean) obj).booleanValue());
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
            }
            C47404Ij2 c47404Ij22 = (C47404Ij2) iDHandlerS21S0100000_8.l0;
            c47404Ij22.getClass();
            Object obj2 = msg.obj;
            if (!(obj2 instanceof C47403Ij1)) {
                return;
            }
            if (obj2 != null) {
                C47403Ij1 c47403Ij1 = (C47403Ij1) obj2;
                c47404Ij22.LIZJ();
                if (c47404Ij22.LIZJ == null) {
                    return;
                }
                c47404Ij22.LJII();
                if (!c47404Ij22.LJ.containsKey(c47403Ij1.LIZIZ) && !c47404Ij22.LJFF.containsKey(c47403Ij1.LIZIZ) && !C47404Ij2.LIZLLL(c47404Ij22.LJI, c47403Ij1.LIZIZ)) {
                    return;
                }
                c47404Ij22.LJ.remove(c47403Ij1.LIZIZ);
                c47404Ij22.LJFF.remove(c47403Ij1.LIZIZ);
                C47404Ij2.LJ(c47404Ij22.LJI, c47403Ij1.LIZIZ);
                if (!c47404Ij22.LJ.isEmpty() || !c47404Ij22.LJFF.isEmpty() || !c47404Ij22.LJI.isEmpty()) {
                    return;
                }
                try {
                    AudioManager audioManager = c47404Ij22.LIZJ;
                    o.LJI(audioManager);
                    audioManager.abandonAudioFocus(c47404Ij22.LIZLLL);
                } catch (Throwable unused) {
                }
                c47404Ij22.LIZIZ = false;
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.player.sdk.audio.SimAudioFocusManager.AudioFocusMsg");
        }
        C47404Ij2 c47404Ij23 = (C47404Ij2) iDHandlerS21S0100000_8.l0;
        c47404Ij23.getClass();
        Object obj3 = msg.obj;
        if (!(obj3 instanceof C47403Ij1)) {
            return;
        }
        if (obj3 != null) {
            C47403Ij1 c47403Ij12 = (C47403Ij1) obj3;
            c47404Ij23.LIZJ();
            if (c47404Ij23.LIZJ == null) {
                return;
            }
            c47404Ij23.LJII();
            if (!c47404Ij23.LJ.containsKey(c47403Ij12.LIZIZ)) {
                c47404Ij23.LJFF.putAll(c47404Ij23.LJ);
            }
            c47404Ij23.LJ.clear();
            WeakHashMap<Object, C47405Ij3> weakHashMap = c47404Ij23.LJ;
            Object obj4 = c47403Ij12.LIZIZ;
            int i2 = c47403Ij12.LIZ;
            WeakReference weakReference2 = new WeakReference(c47403Ij12.LIZIZ);
            InterfaceC47408Ij6 interfaceC47408Ij6 = c47403Ij12.LIZJ;
            WeakReference weakReference3 = null;
            if (interfaceC47408Ij6 == null) {
                weakReference = null;
            } else {
                weakReference = new WeakReference(interfaceC47408Ij6);
            }
            Handler handler = c47403Ij12.LIZLLL;
            if (handler != null) {
                weakReference3 = new WeakReference(handler);
            }
            weakHashMap.put(obj4, new C47405Ij3(i2, weakReference2, weakReference, weakReference3));
            if (!c47404Ij23.LIZIZ) {
                try {
                    AudioManager audioManager2 = c47404Ij23.LIZJ;
                    o.LJI(audioManager2);
                    int LLJJJJLIIL = C16880lQ.LLJJJJLIIL(audioManager2, c47404Ij23.LIZLLL, 3, 1);
                    if (LLJJJJLIIL == 1 || LLJJJJLIIL == 2 || LLJJJJLIIL == 3 || LLJJJJLIIL == 4) {
                        z = true;
                    }
                } catch (Throwable unused2) {
                }
                c47404Ij23.LIZIZ = z;
            }
            c47404Ij23.LIZIZ(c47404Ij23.LIZIZ);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.player.sdk.audio.SimAudioFocusManager.AudioFocusMsg");
    }

    public static final void handleMessage$1(IDHandlerS21S0100000_8 iDHandlerS21S0100000_8, Message msg) {
        o.LJIIIZ(msg, "msg");
        super.handleMessage(msg);
        if (msg.what == ((SpeedModeSettingImpl) iDHandlerS21S0100000_8.l0).LIZLLL && SpeedModeServiceImpl.LJII().LIZJ()) {
            ((SpeedModeSettingImpl) iDHandlerS21S0100000_8.l0).LIZ();
        }
    }

    public static final void handleMessage$2(IDHandlerS21S0100000_8 iDHandlerS21S0100000_8, Message message) {
        C47750Ioc c47750Ioc;
        String str;
        C47751Iod c47751Iod;
        String str2;
        super.handleMessage(message);
        int i = message.what;
        if (i == 10) {
            String str3 = (String) message.obj;
            long j = message.arg1;
            int i2 = message.arg2;
            String str4 = ((TTVideoEngineImpl) iDHandlerS21S0100000_8.l0).c5.get("video");
            String str5 = ((TTVideoEngineImpl) iDHandlerS21S0100000_8.l0).c5.get("audio");
            if (((TTVideoEngineImpl) iDHandlerS21S0100000_8.l0).LJIIJJI == 5) {
                return;
            }
            if (!TextUtils.isEmpty(str5) && str5.equals(str3)) {
                C47750Ioc c47750Ioc2 = ((TTVideoEngineImpl) iDHandlerS21S0100000_8.l0).e;
                if (c47750Ioc2 != null) {
                    C47751Iod c47751Iod2 = c47750Ioc2.LIZIZ;
                    if (c47751Iod2 != null) {
                        c47751Iod2.LLLII = j;
                    }
                    c47750Ioc2.LJJIIZI(183, i2);
                }
            } else if (!TextUtils.isEmpty(str4) && str4.equals(str3) && (c47750Ioc = ((TTVideoEngineImpl) iDHandlerS21S0100000_8.l0).e) != null) {
                C47751Iod c47751Iod3 = c47750Ioc.LIZIZ;
                if (c47751Iod3 != null) {
                    c47751Iod3.LLLI = j;
                }
                c47750Ioc.LJJIIZI(182, i2);
            }
            ArrayList<String> arrayList = ((TTVideoEngineImpl) iDHandlerS21S0100000_8.l0).E0;
            String str6 = "";
            if (arrayList != null && arrayList.contains(str3)) {
                TTVideoEngineImpl tTVideoEngineImpl = (TTVideoEngineImpl) iDHandlerS21S0100000_8.l0;
                long j2 = tTVideoEngineImpl.U2 + j;
                tTVideoEngineImpl.U2 = j2;
                C47750Ioc c47750Ioc3 = tTVideoEngineImpl.e;
                if (c47750Ioc3 != null) {
                    C47751Iod c47751Iod4 = c47750Ioc3.LIZIZ;
                    if (c47751Iod4 != null) {
                        c47751Iod4.LLLFZ = j2;
                    }
                    c47750Ioc3.LJJIIZI(181, i2);
                }
                StringBuilder LIZJ = C06490Nh.LIZJ("using mdl cache, key :", str3, " size = ", j);
                LIZJ.append(" vid = ");
                if (TextUtils.isEmpty(((TTVideoEngineImpl) iDHandlerS21S0100000_8.l0).LLLZZ)) {
                    str2 = "";
                } else {
                    str2 = ((TTVideoEngineImpl) iDHandlerS21S0100000_8.l0).LLLZZ;
                }
                LIZJ.append(str2);
                LIZJ.append(" groupid = ");
                if (!TextUtils.isEmpty(((TTVideoEngineImpl) iDHandlerS21S0100000_8.l0).P7)) {
                    str6 = ((TTVideoEngineImpl) iDHandlerS21S0100000_8.l0).P7;
                }
                LIZJ.append(str6);
                LIZJ.append(" miss reason = ");
                LIZJ.append(i2);
                C78253UnR.LJI("TTVideoEngine", X1D.LIZIZ(LIZJ));
                if ((((TTVideoEngineImpl) iDHandlerS21S0100000_8.l0).c5.size() < 2 || ((TTVideoEngineImpl) iDHandlerS21S0100000_8.l0).c5.containsValue(str3)) && ((TTVideoEngineImpl) iDHandlerS21S0100000_8.l0).LLZLLLL != null) {
                    C47620ImW c47620ImW = new C47620ImW();
                    c47620ImW.LIZ = "mdlfilepathhitcachesize";
                    c47620ImW.LJ = j;
                    ((TTVideoEngineImpl) iDHandlerS21S0100000_8.l0).LLLFFI(c47620ImW, true);
                    return;
                }
                return;
            }
            ArrayList<String> arrayList2 = ((TTVideoEngineImpl) iDHandlerS21S0100000_8.l0).D0;
            if (arrayList2 != null && arrayList2.contains(str3)) {
                TTVideoEngineImpl tTVideoEngineImpl2 = (TTVideoEngineImpl) iDHandlerS21S0100000_8.l0;
                long j3 = tTVideoEngineImpl2.U2 + j;
                tTVideoEngineImpl2.U2 = j3;
                C47750Ioc c47750Ioc4 = tTVideoEngineImpl2.e;
                if (c47750Ioc4 != null && (c47751Iod = c47750Ioc4.LIZIZ) != null) {
                    c47751Iod.LLLFZ = j3;
                }
                StringBuilder LIZJ2 = C06490Nh.LIZJ("using mdl cache, key :", str3, " size = ", j);
                LIZJ2.append(" vid = ");
                if (TextUtils.isEmpty(((TTVideoEngineImpl) iDHandlerS21S0100000_8.l0).LLLZZ)) {
                    str = "";
                } else {
                    str = ((TTVideoEngineImpl) iDHandlerS21S0100000_8.l0).LLLZZ;
                }
                LIZJ2.append(str);
                LIZJ2.append(" groupid = ");
                if (!TextUtils.isEmpty(((TTVideoEngineImpl) iDHandlerS21S0100000_8.l0).P7)) {
                    str6 = ((TTVideoEngineImpl) iDHandlerS21S0100000_8.l0).P7;
                }
                LIZJ2.append(str6);
                LIZJ2.append(" miss reason = ");
                LIZJ2.append(i2);
                C78253UnR.LJI("TTVideoEngine", X1D.LIZIZ(LIZJ2));
                if ((((TTVideoEngineImpl) iDHandlerS21S0100000_8.l0).c5.size() < 2 || ((TTVideoEngineImpl) iDHandlerS21S0100000_8.l0).c5.containsValue(str3)) && ((TTVideoEngineImpl) iDHandlerS21S0100000_8.l0).LLZLLLL != null) {
                    C47620ImW c47620ImW2 = new C47620ImW();
                    c47620ImW2.LIZ = "mdlhitcachesize";
                    c47620ImW2.LIZLLL = str3;
                    c47620ImW2.LJ = j;
                    ((TTVideoEngineImpl) iDHandlerS21S0100000_8.l0).LLLFFI(c47620ImW2, true);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 33) {
            ((TTVideoEngineImpl) iDHandlerS21S0100000_8.l0).LJJJJJL();
        }
    }

    public static final void handleMessage$3(IDHandlerS21S0100000_8 iDHandlerS21S0100000_8, Message msg) {
        o.LJIIIZ(msg, "msg");
        int i = msg.arg1;
        Object obj = msg.obj;
        C82492WZc c82492WZc = (C82492WZc) iDHandlerS21S0100000_8.l0;
        if (i != 777) {
            if (i != 10010) {
                switch (i) {
                    case 1:
                        c82492WZc.LJLLLLLL.LIZJ();
                        return;
                    case 2:
                        C82493WZd c82493WZd = c82492WZc.LJLLLLLL;
                        o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.effectmanager.effect.model.Effect");
                        c82493WZd.LJFF((Effect) obj);
                        return;
                    case 3:
                        C82493WZd c82493WZd2 = c82492WZc.LJLLLLLL;
                        o.LJII(obj, "null cannot be cast to non-null type kotlin.ByteArray");
                        c82493WZd2.LIZLLL((byte[]) obj, true);
                        return;
                    case 4:
                        c82492WZc.LJLLLLLL.LJII();
                        return;
                    case 5:
                        c82492WZc.LJLLLLLL.LJ();
                        return;
                    case 6:
                        c82492WZc.LJLLLLLL.LJI();
                        return;
                    case 7:
                        C82493WZd c82493WZd3 = c82492WZc.LJLLLLLL;
                        synchronized (c82493WZd3) {
                            try {
                                c82493WZd3.LJLJI.lock();
                                if (!c82493WZd3.LJLJL) {
                                    return;
                                }
                                c82493WZd3.LJLJL = false;
                                if (c82493WZd3.LJLJJL) {
                                    return;
                                }
                                c82493WZd3.LJLJJL = true;
                                System.currentTimeMillis();
                                SAMICoreProperty sAMICoreProperty = new SAMICoreProperty();
                                sAMICoreProperty.id = SAMICorePropertyId.SAMICorePropertyId_VC_Online_Close_Loudspeaker;
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append("zxzzz_SamiSVC: Close_Loudspeaker START ... , isShootingScene = ");
                                LIZ.append(c82493WZd3.LJLLLL);
                                LIZ.append(", isPreviewScene = ");
                                LIZ.append(c82493WZd3.LJLLL);
                                LIZ.append(", thread_id = ");
                                LIZ.append(Process.myTid());
                                LIZ.append(", thread_name = ");
                                LIZ.append(C16880lQ.LLLLIIIILLL().getName());
                                H78.LIZJ(X1D.LIZIZ(LIZ));
                                int SAMICoreSetProperty = c82493WZd3.LJLJJLL.SAMICoreSetProperty(SAMICorePropertyId.SAMICorePropertyId_VC_Online, sAMICoreProperty);
                                StringBuilder LIZ2 = X1D.LIZ();
                                LIZ2.append("zxzzz_SamiSVC: ... Close_Loudspeaker STOP , isShootingScene = ");
                                LIZ2.append(c82493WZd3.LJLLLL);
                                LIZ2.append(", isPreviewScene = ");
                                LIZ2.append(c82493WZd3.LJLLL);
                                LIZ2.append(", thread_id = ");
                                LIZ2.append(Process.myTid());
                                LIZ2.append(", thread_name = ");
                                LIZ2.append(C16880lQ.LLLLIIIILLL().getName());
                                H78.LIZJ(X1D.LIZIZ(LIZ2));
                                if (SAMICoreSetProperty != 0) {
                                    c82493WZd3.LJIIIIZZ(new WZ5("EVENT_SDK_FAILED"));
                                }
                                System.currentTimeMillis();
                                StringBuilder LIZ3 = X1D.LIZ();
                                LIZ3.append("zxzzz_SamiSVC: SAMICoreDestroyHandle START ... , isShootingScene = ");
                                LIZ3.append(c82493WZd3.LJLLLL);
                                LIZ3.append(", isPreviewScene = ");
                                LIZ3.append(c82493WZd3.LJLLL);
                                LIZ3.append(", thread_id = ");
                                LIZ3.append(Process.myTid());
                                LIZ3.append(", thread_name = ");
                                LIZ3.append(C16880lQ.LLLLIIIILLL().getName());
                                H78.LIZJ(X1D.LIZIZ(LIZ3));
                                int SAMICoreDestroyHandle = c82493WZd3.LJLJJLL.SAMICoreDestroyHandle();
                                StringBuilder LIZ4 = X1D.LIZ();
                                LIZ4.append("zxzzz_SamiSVC: ... SAMICoreDestroyHandle STOP , isShootingScene = ");
                                LIZ4.append(c82493WZd3.LJLLLL);
                                LIZ4.append(", isPreviewScene = ");
                                LIZ4.append(c82493WZd3.LJLLL);
                                LIZ4.append(", thread_id = ");
                                LIZ4.append(Process.myTid());
                                LIZ4.append(", thread_name = ");
                                LIZ4.append(C16880lQ.LLLLIIIILLL().getName());
                                H78.LIZJ(X1D.LIZIZ(LIZ4));
                                if (SAMICoreDestroyHandle != 0) {
                                    c82493WZd3.LJIIIIZZ(new WZ5("EVENT_SDK_FAILED"));
                                }
                                return;
                            } finally {
                                c82493WZd3.LJLJI.unlock();
                            }
                        }
                    default:
                        c82492WZc.getClass();
                        return;
                }
            }
            c82492WZc.LJFF();
            return;
        }
        c82492WZc.LJLLLLLL.LIZIZ(C48270Ix0.LJLIL);
    }

    public static final void handleMessage$4(IDHandlerS21S0100000_8 iDHandlerS21S0100000_8, Message message) {
        if (message == null) {
            return;
        }
        super.handleMessage(message);
        ((C47966Is6) iDHandlerS21S0100000_8.l0).LJIILL = new C47967Is7((C47966Is6) iDHandlerS21S0100000_8.l0);
        ((C47966Is6) iDHandlerS21S0100000_8.l0).LJIILLIIL = new C47965Is5((C47966Is6) iDHandlerS21S0100000_8.l0);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.wifi.RSSI_CHANGED");
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        C47966Is6 c47966Is6 = (C47966Is6) iDHandlerS21S0100000_8.l0;
        C16880lQ.LJJLIIIJILLIZJL(c47966Is6.LJIILLIIL, c47966Is6.LIZIZ, intentFilter);
        ((C47966Is6) iDHandlerS21S0100000_8.l0).LIZIZ();
    }

    public static final void handleMessage$5(IDHandlerS21S0100000_8 iDHandlerS21S0100000_8, Message msg) {
        Fragment fragment;
        o.LJIIIZ(msg, "msg");
        super.handleMessage(msg);
        if (msg.what == 1) {
            Object obj = msg.obj;
            if (!(obj instanceof Fragment) || (fragment = (Fragment) obj) == null) {
                return;
            }
            C50937Jyv c50937Jyv = (C50937Jyv) iDHandlerS21S0100000_8.l0;
            c50937Jyv.LJLJI = 0L;
            c50937Jyv.LJFF(fragment);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005f, code lost:
    
        if (r8 == (-1)) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void handleMessage$6(Y.IDHandlerS21S0100000_8 r9, android.os.Message r10) {
        /*
            Method dump skipped, instructions count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDHandlerS21S0100000_8.handleMessage$6(Y.IDHandlerS21S0100000_8, android.os.Message):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDHandlerS21S0100000_8(IH1 ih1, Looper looper, int i) {
        super(looper, null);
        this.$t = i;
        this.l0 = ih1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDHandlerS21S0100000_8(Object obj, Looper looper, int i) {
        super(looper);
        this.$t = i;
        this.l0 = obj;
    }
}
