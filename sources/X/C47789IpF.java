package X;

import android.text.TextUtils;
import java.util.HashMap;

/* renamed from: X.IpF, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47789IpF {
    public int LIZ;
    public final int LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public final java.util.Map LJ;

    public C47789IpF() {
        throw null;
    }

    public final String toString() {
        Object[] objArr = new Object[4];
        objArr[0] = this.LIZJ;
        objArr[1] = Integer.valueOf(this.LIZ);
        objArr[2] = Integer.valueOf(this.LIZIZ);
        String str = this.LIZLLL;
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return C16880lQ.LLLZ("domain:%s, code:%d, internalCode:%d, description:%s", objArr);
    }

    public final int LIZJ() {
        if (this.LIZJ.equals("kTTVideoErrorDomainFetchingInfo")) {
            return 1000;
        }
        if (this.LIZJ.equals("kTTVideoErrorDomainLocalDNS") || this.LIZJ.equals("kTTVideoErrorDomainHTTPDNS")) {
            return 1001;
        }
        if (this.LIZJ.equals("kTTVideoErrorDomainVideoOwnPlayer") && LJ()) {
            return 1002;
        }
        return 1003;
    }

    public final boolean LIZLLL() {
        if (TextUtils.isEmpty(this.LIZJ)) {
            return false;
        }
        if (!this.LIZJ.equals("kTTVideoErrorDomainVideoOwnPlayer") && !this.LIZJ.equals("kTTVideoErrorDomainVideoOSPlayer") && !this.LIZJ.equals("kTTVideoErrorDomainVideoExoPlayer")) {
            return false;
        }
        return true;
    }

    public final boolean LJ() {
        int i = this.LIZ;
        if (i == -499999 || i == -499997 || i == -499996 || i == -499992 || i == -499991 || i == -499990 || i == -499989 || i == -2139062143) {
            return true;
        }
        return false;
    }

    public final HashMap LJFF() {
        HashMap hashMap = new HashMap();
        hashMap.put("domain", this.LIZJ);
        hashMap.put("code", Integer.valueOf(this.LIZ));
        int i = this.LIZIZ;
        if (i != 0) {
            hashMap.put("internalCode", Integer.valueOf(i));
        }
        String str = this.LIZLLL;
        if (str != null) {
            hashMap.put("description", str);
        }
        return hashMap;
    }

    public static String LIZIZ(InterfaceC47775Ip1 interfaceC47775Ip1) {
        if (interfaceC47775Ip1 == null) {
            return "";
        }
        int playerType = interfaceC47775Ip1.getPlayerType();
        if (playerType != 0) {
            if (playerType != 1 && playerType != 2 && playerType != 3 && playerType != 4) {
                if (playerType != 5) {
                    return "";
                }
                return "kTTVideoErrorDomainVideoExoPlayer";
            }
            return "kTTVideoErrorDomainVideoOwnPlayer";
        }
        return "kTTVideoErrorDomainVideoOSPlayer";
    }

    public C47789IpF(String str, int i) {
        this(str, i, 0, null);
    }

    public C47789IpF(String str, int i, String str2) {
        this(str, i, 0, str2);
    }

    public static C47789IpF LIZ(InterfaceC47775Ip1 interfaceC47775Ip1, int i, String str) {
        return new C47789IpF(LIZIZ(interfaceC47775Ip1), i, 0, str);
    }

    public C47789IpF(String str, int i, int i2, String str2) {
        this.LIZJ = str;
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZLLL = str2;
        this.LJ = new HashMap();
    }
}
