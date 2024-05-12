package X;

/* loaded from: classes7.dex */
public final class FK3 {
    public static String LIZ(android.net.Uri uri) {
        String authority = uri.getAuthority();
        if (authority != null) {
            int hashCode = authority.hashCode();
            if (hashCode != -845193793) {
                if (hashCode == -456066902 && authority.equals("com.android.calendar")) {
                    return "calendar";
                }
            } else if (authority.equals("com.android.contacts")) {
                return "contact";
            }
        }
        return "contentProvider";
    }
}
