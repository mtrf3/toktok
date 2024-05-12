package X;

import android.util.Size;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.List;

/* renamed from: X.Htp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45525Htp {
    public static /* synthetic */ void LIZ(InterfaceC45485HtB interfaceC45485HtB, ShortVideoContext shortVideoContext, EnumC44979Hl1 enumC44979Hl1, String str, Size size, String str2, int i, Integer num, boolean z, boolean z2, boolean z3, String str3, String str4, int i2, int i3, String str5, boolean z4, boolean z5, boolean z6, int i4) {
        boolean z7 = z5;
        boolean z8 = z4;
        int i5 = i3;
        String str6 = str3;
        int i6 = i2;
        String str7 = null;
        if ((i4 & 1024) != 0) {
            str6 = null;
        }
        if ((i4 & 2048) == 0) {
            str7 = str4;
        }
        if ((i4 & 4096) != 0) {
            i6 = 0;
        }
        if ((i4 & FileUtils.BUFFER_SIZE) != 0) {
            i5 = 0;
        }
        if ((32768 & i4) != 0) {
            z8 = false;
        }
        if ((i4 & 65536) != 0) {
            z7 = false;
        }
        interfaceC45485HtB.LJIIIZ(shortVideoContext, enumC44979Hl1, str, size, str2, i, num, z, z2, z3, str6, str7, i6, i5, z8, z7, z6);
    }

    public static /* synthetic */ void LIZIZ(InterfaceC45485HtB interfaceC45485HtB, ShortVideoContext shortVideoContext, List list, EnumC44979Hl1 enumC44979Hl1, String str, Size size, String str2, int i, Integer num, boolean z, boolean z2, boolean z3, String str3, String str4, boolean z4, int i2, int i3, boolean z5, boolean z6, boolean z7, int i4) {
        boolean z8 = z6;
        int i5 = i3;
        String str5 = str3;
        int i6 = i2;
        String str6 = null;
        if ((i4 & 2048) != 0) {
            str5 = null;
        }
        if ((i4 & 4096) == 0) {
            str6 = str4;
        }
        if ((i4 & 16384) != 0) {
            i6 = 0;
        }
        if ((32768 & i4) != 0) {
            i5 = 0;
        }
        if ((i4 & 131072) != 0) {
            z8 = false;
        }
        interfaceC45485HtB.LIZ(shortVideoContext, list, enumC44979Hl1, str, size, str2, i, num, z, z2, z3, str5, str6, z4, i6, i5, z5, z8);
    }
}
