package X;

import android.graphics.Bitmap;
import android.view.View;
import com.ss.android.ugc.aweme.framework.services.StaticServiceImplManager;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final /* synthetic */ class OUR implements EVY {
    public static /* synthetic */ long LIZIZ(String str) {
        long j;
        long j2;
        int length = str.length();
        if (length == 0) {
            throw new NumberFormatException("empty string");
        }
        int i = 10;
        long j3 = 10;
        long j4 = Long.MIN_VALUE;
        int i2 = 0;
        if (j3 < 0) {
            j = Long.MAX_VALUE < (j3 ^ Long.MIN_VALUE) ? 0L : 1L;
        } else {
            long j5 = (Long.MAX_VALUE / j3) << 1;
            j = j5 + ((((-1) - (j5 * j3)) ^ Long.MIN_VALUE) >= (j3 ^ Long.MIN_VALUE) ? 1 : 0);
        }
        if (str.charAt(0) == '+' && length > 1) {
            i2 = 1;
        }
        long j6 = 0;
        while (i2 < length) {
            int digit = Character.digit(str.charAt(i2), i);
            if (digit == -1) {
                throw new NumberFormatException(str);
            }
            if (j6 >= 0 && j6 <= j) {
                if (j6 == j) {
                    if (j3 < 0) {
                        j2 = Long.MAX_VALUE < (j3 ^ j4) ? -1L : (-1) - j3;
                    } else {
                        long j7 = (-1) - (((Long.MAX_VALUE / j3) << 1) * j3);
                        j2 = j7 - ((j7 ^ j4) >= (j3 ^ j4) ? j3 : 0L);
                    }
                    if (digit <= ((int) j2)) {
                    }
                }
                j6 = (j6 * j3) + digit;
                i2++;
                i = 10;
                j4 = Long.MIN_VALUE;
            }
            throw new NumberFormatException("Too large for unsigned long: ".concat(str));
        }
        return j6;
    }

    @Override // X.EVY
    public void LIZ() {
        StaticServiceImplManager.getInstance();
    }

    public static Bitmap LIZJ(VideoPublishEditModel videoPublishEditModel, Bitmap bitmap) {
        return videoPublishEditModel.getCoverPublishModel().getEffectTextModel().mergeCoverText(bitmap);
    }

    public static C70919RsR LIZLLL(View view, String str) {
        o.LJIIIIZZ(view, str);
        return new C70919RsR();
    }

    public static void LJ(Throwable th, InterfaceC67352kd interfaceC67352kd) {
        C3C4 LIZ = C141335gf.LIZ(th);
        C3C5.m7constructorimpl(LIZ);
        interfaceC67352kd.resumeWith(LIZ);
    }
}
