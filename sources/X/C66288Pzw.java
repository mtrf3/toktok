package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;

/* renamed from: X.Pzw, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66288Pzw implements InterfaceC66280Pzo {
    @Override // X.InterfaceC66280Pzo
    public final J1T LIZ(java.util.Map<String, String> map) {
        String str = map.get("period");
        if (str == null) {
            str = String.valueOf(60000L);
        }
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return new C66287Pzv(60000L);
            }
        }
        return new C66287Pzv(CastLongProtector.parseLong(str));
    }
}
