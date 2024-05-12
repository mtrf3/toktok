package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import defpackage.i0;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import kotlin.jvm.internal.AqS23S0010000_7;
import kotlin.jvm.internal.o;
import webcast.api.room.FrequencyControlData;

/* renamed from: X.Wa3, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82519Wa3 implements InterfaceC28696BOa, InterfaceC48038ItG {
    public static final char[] LJLIL = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final C82519Wa3 LJLILLLLZI = new C82519Wa3();

    @Override // X.InterfaceC28696BOa
    public void LIZ(FrequencyControlData frequencyControlData) {
    }

    @Override // X.InterfaceC28696BOa
    public void LJIILLIIL() {
    }

    @Override // X.InterfaceC28696BOa
    public void onFailed(Throwable throwable) {
        o.LJIIIZ(throwable, "throwable");
    }

    public static String LIZJ(String str) {
        if (TextUtils.isEmpty(str)) {
            return "HBMonitorSDK";
        }
        if (!str.startsWith("HBMonitorSDK")) {
            return i0.LJFF("HBMonitorSDK_", str);
        }
        return str;
    }

    public static String LJ(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                    messageDigest.update(str.getBytes(Charset.forName("UTF-8")));
                    return LJI(messageDigest.digest());
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static final void LJFF(boolean z) {
        GGO ggo;
        if (z) {
            ggo = GGO.SHOW;
        } else {
            ggo = GGO.DISMISS;
        }
        C42303Gix.LIZ(1017, ggo, EnumC42283Gid.DUAL_BALL, EnumC42282Gic.CLOSE_VISIBLE_5S, null);
    }

    public static String LJI(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            if (length <= bArr.length) {
                int i = length * 2;
                char[] cArr = new char[i];
                int i2 = 0;
                for (byte b : bArr) {
                    int i3 = b & 255;
                    int i4 = i2 + 1;
                    char[] cArr2 = LJLIL;
                    cArr[i2] = cArr2[i3 >> 4];
                    i2 = i4 + 1;
                    cArr[i4] = cArr2[i3 & 15];
                }
                return new String(cArr, 0, i);
            }
            throw new IndexOutOfBoundsException();
        }
        throw new NullPointerException("bytes is null");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        TJU state = (TJU) obj;
        o.LJIIIZ(state, "state");
        if (state instanceof TJW) {
            return C74413TIj.LIZIZ();
        }
        if (state instanceof TJS) {
            T t = state.LIZ;
            if (t != 0) {
                return C74413TIj.LIZJ(t);
            }
            throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.sticker.image.TemplatesPanelResp");
        }
        if (state instanceof TJQ) {
            return C74413TIj.LIZ((Throwable) state.LIZ);
        }
        throw new C162476Zf();
    }

    public static void LIZLLL(String str, String str2) {
        EV4.LIZJ(EV4.LIZIZ("i"), LIZJ(str), str2);
    }

    public static C83113Wjd LIZIZ(C82622Wbi diContainer, InterfaceC65784Pro interfaceC65784Pro, int i) {
        boolean z;
        C63081OpJ logicStore;
        boolean z2;
        InterfaceC65784Pro curPageProvider = interfaceC65784Pro;
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 4) != 0) {
            logicStore = new C63081OpJ();
        } else {
            logicStore = null;
        }
        if ((i & 64) != 0) {
            curPageProvider = C82520Wa4.LJLIL;
        }
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(logicStore, "logicStore");
        o.LJIIIZ(curPageProvider, "curPageProvider");
        C82515WZz c82515WZz = C82515WZz.LJLIL;
        ShortVideoContext shortVideoContext = (ShortVideoContext) diContainer.LJIIIIZZ(null, ShortVideoContext.class);
        if (shortVideoContext != null && shortVideoContext.isStory) {
            z2 = true;
        } else {
            z2 = false;
        }
        return new C83113Wjd(diContainer, true, C45448Hsa.LIZ(), new AqS23S0010000_7(z2, 2), C2307793x.LJLIL, logicStore, C5SL.LIZ, c82515WZz, new WSM(null, diContainer, z, z2, curPageProvider));
    }
}
