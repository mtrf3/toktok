package X;

import com.bytedance.mt.protector.impl.UriProtector;

/* renamed from: X.Iwr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48261Iwr {
    public static final C1HQ LIZ = new C1HQ();

    /* JADX WARN: Multi-variable type inference failed */
    public static synchronized android.net.Uri LIZ() {
        synchronized (C48261Iwr.class) {
            C1HQ c1hq = LIZ;
            android.net.Uri uri = (android.net.Uri) c1hq.getOrDefault("com.google.android.gms.measurement", null);
            if (uri == null) {
                android.net.Uri parse = UriProtector.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(android.net.Uri.encode("com.google.android.gms.measurement"))));
                c1hq.put("com.google.android.gms.measurement", parse);
                return parse;
            }
            return uri;
        }
    }
}
