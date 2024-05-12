package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import defpackage.a1;

/* renamed from: X.Uv9, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78731Uv9 {
    public static AbstractC78707Uul LIZ(String str) {
        if ("aspectFit".equals(str)) {
            return InterfaceC78716Uuu.LJJL;
        }
        if ("aspectFill".equals(str)) {
            return InterfaceC78716Uuu.LJJLIIIJILLIZJL;
        }
        if ("scaleToFill".equals(str)) {
            return InterfaceC78716Uuu.LJJJLZIJ;
        }
        if ("center".equals(str)) {
            return InterfaceC78716Uuu.LJJLIIIIJ;
        }
        if (str == null || str.equals(LiveGiftNewGifterBadgeSetting.DEFAULT) || str.length() == 0) {
            return InterfaceC78716Uuu.LJJJLZIJ;
        }
        throw new RuntimeException(a1.LJ("Invalid resize mode: '", str, "'"));
    }
}
