package X;

/* renamed from: X.Iqi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C47880Iqi implements InterfaceC47879Iqh {
    public static final int LIZ(String str) {
        if (str == null) {
            return 0;
        }
        String lowerCase = str.toLowerCase();
        if (lowerCase.contains(".m3u8?") || lowerCase.endsWith(".m3u8") || lowerCase.contains(".m3u?") || lowerCase.endsWith(".m3u")) {
            return 1;
        }
        if (!lowerCase.endsWith(".mpd") && !lowerCase.contains(".mpd?")) {
            return 0;
        }
        return 2;
    }
}
