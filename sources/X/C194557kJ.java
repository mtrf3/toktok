package X;

import com.ss.android.ugc.aweme.now.NowPostInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* renamed from: X.7kJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C194557kJ {
    public static boolean LIZ(InterfaceC194547kI interfaceC194547kI, InterfaceC57784Mm4 other) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        o.LJIIIZ(other, "other");
        if (!(other instanceof InterfaceC194547kI)) {
            return false;
        }
        InterfaceC194547kI interfaceC194547kI2 = (InterfaceC194547kI) other;
        if (!o.LJ(interfaceC194547kI.getAweme().getAid(), interfaceC194547kI2.getAweme().getAid()) || interfaceC194547kI.z() != interfaceC194547kI2.z()) {
            return false;
        }
        User author = interfaceC194547kI.getAweme().getAuthor();
        Integer num6 = null;
        if (author != null) {
            num = Integer.valueOf(author.getFollowStatus());
        } else {
            num = null;
        }
        User author2 = interfaceC194547kI2.getAweme().getAuthor();
        if (author2 != null) {
            num2 = Integer.valueOf(author2.getFollowStatus());
        } else {
            num2 = null;
        }
        if (!o.LJ(num, num2)) {
            return false;
        }
        User author3 = interfaceC194547kI.getAweme().getAuthor();
        if (author3 != null) {
            num3 = Integer.valueOf(author3.getFollowerStatus());
        } else {
            num3 = null;
        }
        User author4 = interfaceC194547kI2.getAweme().getAuthor();
        if (author4 != null) {
            num4 = Integer.valueOf(author4.getFollowerStatus());
        } else {
            num4 = null;
        }
        if (!o.LJ(num3, num4)) {
            return false;
        }
        NowPostInfo nowPostInfo = interfaceC194547kI.getAweme().nowPostInfo;
        if (nowPostInfo != null) {
            num5 = nowPostInfo.getNowStatus();
        } else {
            num5 = null;
        }
        NowPostInfo nowPostInfo2 = interfaceC194547kI2.getAweme().nowPostInfo;
        if (nowPostInfo2 != null) {
            num6 = nowPostInfo2.getNowStatus();
        }
        if (!o.LJ(num5, num6) || interfaceC194547kI.G() != interfaceC194547kI2.G()) {
            return false;
        }
        return true;
    }

    public static boolean LIZIZ(InterfaceC194547kI interfaceC194547kI, InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (!(interfaceC57784Mm4 instanceof InterfaceC194547kI)) {
            return false;
        }
        if (interfaceC194547kI.G() || ((InterfaceC194547kI) interfaceC57784Mm4).G()) {
            return true;
        }
        return o.LJ(interfaceC57784Mm4, interfaceC194547kI);
    }
}
