package com.facebook;

import X.AsyncTaskC66391Q3v;
import X.BMV;
import X.C00F;
import X.C16880lQ;
import X.C63144OqK;
import X.C66381Q3l;
import X.C66388Q3s;
import X.C66390Q3u;
import X.C66395Q3z;
import X.EnumC66377Q3h;
import X.EnumC66383Q3n;
import X.ORY;
import X.Q44;
import X.Q4J;
import X.Q4Q;
import X.Q4W;
import X.Q8U;
import X.X1D;
import Y.IDCreatorS54S0000000_11;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b1;
import java.security.SecureRandom;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.jvm.internal.o;
import m43.u;

/* loaded from: classes12.dex */
public final class GraphRequest {
    public static final String LJII;
    public static final Pattern LJIIIIZZ;
    public static volatile String LJIIIZ;
    public final AccessToken LIZ;
    public final String LIZIZ;
    public Bundle LIZJ;
    public final String LIZLLL;
    public BMV LJ;
    public EnumC66377Q3h LJFF;
    public boolean LJI;

    public GraphRequest() {
        this(null, null, null, null, null, 63);
    }

    public final C66381Q3l LIZJ() {
        List requests = ORY.LJJZZIII(new GraphRequest[]{this});
        o.LJIIIZ(requests, "requests");
        List LIZJ = C66388Q3s.LIZJ(new C66390Q3u(requests));
        if (LIZJ.size() == 1) {
            return (C66381Q3l) LIZJ.get(0);
        }
        throw new Q4W("invalid state: expected a single response");
    }

    public final AsyncTaskC66391Q3v LIZLLL() {
        List requests = ORY.LJJZZIII(new GraphRequest[]{this});
        o.LJIIIZ(requests, "requests");
        C66390Q3u c66390Q3u = new C66390Q3u(requests);
        Q4J.LJ(c66390Q3u);
        AsyncTaskC66391Q3v asyncTaskC66391Q3v = new AsyncTaskC66391Q3v(c66390Q3u);
        asyncTaskC66391Q3v.executeOnExecutor(u.LJ(), new Void[0]);
        return asyncTaskC66391Q3v;
    }

    static {
        C16880lQ.LJLLJ(GraphRequest.class);
        char[] charArray = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        o.LJIIIIZZ(charArray, "(this as java.lang.String).toCharArray()");
        StringBuilder sb = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        int nextInt = secureRandom.nextInt(11) + 30;
        if (nextInt > 0) {
            int i = 0;
            do {
                i++;
                sb.append(charArray[secureRandom.nextInt(charArray.length)]);
            } while (i < nextInt);
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "buffer.toString()");
        LJII = sb2;
        LJIIIIZZ = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        if (r3 != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
    
        if (LJIIIIZZ() != false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            r5 = this;
            android.os.Bundle r2 = r5.LIZJ
            java.lang.String r1 = r5.LJ()
            r4 = 0
            if (r1 != 0) goto L4e
            r3 = 0
        La:
            java.lang.String r1 = m43.u.LJFF()
            java.lang.String r0 = "instagram.com"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 != 0) goto L66
        L16:
            java.lang.String r1 = "access_token"
            if (r4 == 0) goto L44
            java.lang.String r0 = LJFF()
            r2.putString(r1, r0)
        L21:
            boolean r0 = r2.containsKey(r1)
            if (r0 != 0) goto L2b
        L28:
            X.C16880lQ.LLIIZ()
        L2b:
            java.lang.String r1 = "sdk"
            java.lang.String r0 = "android"
            r2.putString(r1, r0)
            java.lang.String r1 = "format"
            java.lang.String r0 = "json"
            r2.putString(r1, r0)
            X.Q3n r0 = X.EnumC66383Q3n.GRAPH_API_DEBUG_INFO
            m43.u.LJIIIIZZ(r0)
            X.Q3n r0 = X.EnumC66383Q3n.GRAPH_API_DEBUG_WARNING
            m43.u.LJIIIIZZ(r0)
            return
        L44:
            java.lang.String r0 = r5.LJ()
            if (r0 == 0) goto L21
            r2.putString(r1, r0)
            goto L21
        L4e:
            java.lang.String r0 = "|"
            boolean r3 = ujb.s.LJJJLZIJ(r1, r0, r4)
            java.lang.String r0 = "IG"
            boolean r0 = ujb.o.LJJJLIIL(r1, r0, r4)
            if (r0 == 0) goto La
            if (r3 != 0) goto La
            boolean r0 = r5.LJIIIIZZ()
            if (r0 == 0) goto La
            goto L70
        L66:
            boolean r0 = r5.LJIIIIZZ()
            r0 = r0 ^ 1
            if (r0 != 0) goto L16
            if (r3 != 0) goto L16
        L70:
            r4 = 1
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.GraphRequest.LIZ():void");
    }

    public final String LJ() {
        AccessToken accessToken = this.LIZ;
        if (accessToken != null) {
            if (!this.LIZJ.containsKey("access_token")) {
                String accessToken2 = accessToken.token;
                Q44 q44 = C66395Q3z.LIZLLL;
                synchronized (q44) {
                    o.LJIIIZ(accessToken2, "accessToken");
                    u.LJIIIIZZ(EnumC66383Q3n.INCLUDE_ACCESS_TOKENS);
                    q44.LIZIZ(accessToken2);
                }
                return accessToken2;
            }
        } else if (!this.LIZJ.containsKey("access_token")) {
            return LJFF();
        }
        return this.LIZJ.getString("access_token");
    }

    public final String LJI() {
        String LIZIZ;
        String str = this.LIZIZ;
        if (this.LJFF == EnumC66377Q3h.POST && str != null && ujb.o.LJJJJ(str, "/videos", false)) {
            LIZIZ = Q8U.LIZIZ(new Object[]{u.LJFF()}, 1, "https://graph-video.%s", "java.lang.String.format(format, *args)");
        } else {
            String subdomain = u.LJFF();
            o.LJIIIZ(subdomain, "subdomain");
            LIZIZ = Q8U.LIZIZ(new Object[]{subdomain}, 1, "https://graph.%s", "java.lang.String.format(format, *args)");
        }
        String LJII2 = LJII(LIZIZ);
        LIZ();
        return LIZIZ(LJII2, false);
    }

    public final boolean LJIIIIZZ() {
        if (this.LIZIZ == null) {
            return false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("^/?");
        LIZ.append(u.LIZLLL());
        LIZ.append("/?.*");
        String LIZIZ = X1D.LIZIZ(LIZ);
        if (!this.LJI && !Pattern.matches(LIZIZ, this.LIZIZ) && !Pattern.matches("^/?app/?.*", this.LIZIZ)) {
            return false;
        }
        return true;
    }

    public static String LJFF() {
        String LIZLLL = u.LIZLLL();
        String LLIIZ = C16880lQ.LLIIZ();
        if (LIZLLL.length() > 0 && LLIIZ.length() > 0) {
            return C00F.LIZIZ(LIZLLL, '|', LLIIZ);
        }
        return null;
    }

    public final String toString() {
        StringBuilder LIZJ = b1.LIZJ("{Request: ", " accessToken: ");
        Object obj = this.LIZ;
        if (obj == null) {
            obj = "null";
        }
        LIZJ.append(obj);
        LIZJ.append(", graphPath: ");
        LIZJ.append(this.LIZIZ);
        LIZJ.append(", graphObject: ");
        LIZJ.append((Object) null);
        LIZJ.append(", httpMethod: ");
        LIZJ.append(this.LJFF);
        LIZJ.append(", parameters: ");
        LIZJ.append(this.LIZJ);
        LIZJ.append("}");
        String LIZIZ = X1D.LIZIZ(LIZJ);
        o.LJIIIIZZ(LIZIZ, "StringBuilder()\n        .append(\"{Request: \")\n        .append(\" accessToken: \")\n        .append(if (accessToken == null) \"null\" else accessToken)\n        .append(\", graphPath: \")\n        .append(graphPath)\n        .append(\", graphObject: \")\n        .append(graphObject)\n        .append(\", httpMethod: \")\n        .append(httpMethod)\n        .append(\", parameters: \")\n        .append(parameters)\n        .append(\"}\")\n        .toString()");
        return LIZIZ;
    }

    /* loaded from: classes12.dex */
    public static final class ParcelableResourceWithMimeType<RESOURCE extends Parcelable> implements Parcelable {
        public final String mimeType;
        public final RESOURCE resource;
        public static final Q4Q Companion = new Q4Q();
        public static final Parcelable.Creator<ParcelableResourceWithMimeType<?>> CREATOR = new IDCreatorS54S0000000_11(17);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 1;
        }

        public ParcelableResourceWithMimeType(Parcel parcel) {
            this.mimeType = parcel.readString();
            this.resource = (RESOURCE) parcel.readParcelable(u.LIZJ().getClassLoader());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ParcelableResourceWithMimeType(Parcelable parcelable) {
            this.mimeType = "image/png";
            this.resource = parcelable;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel out, int i) {
            o.LJIIIZ(out, "out");
            out.writeString(this.mimeType);
            out.writeParcelable(this.resource, i);
        }
    }

    public final String LJII(String str) {
        boolean z;
        String LIZIZ;
        if (!o.LJ(u.LJFF(), "instagram.com")) {
            z = true;
        } else {
            z = !LJIIIIZZ();
        }
        if (!z) {
            str = Q8U.LIZIZ(new Object[]{u.LJIILLIIL}, 1, "https://graph.%s", "java.lang.String.format(format, *args)");
        }
        Object[] objArr = new Object[2];
        objArr[0] = str;
        if (LJIIIIZZ.matcher(this.LIZIZ).matches()) {
            LIZIZ = this.LIZIZ;
        } else {
            LIZIZ = Q8U.LIZIZ(new Object[]{this.LIZLLL, this.LIZIZ}, 2, "%s/%s", "java.lang.String.format(format, *args)");
        }
        objArr[1] = LIZIZ;
        return Q8U.LIZIZ(objArr, 2, "%s/%s", "java.lang.String.format(format, *args)");
    }

    public final void LJIIIZ(EnumC66377Q3h enumC66377Q3h) {
        if (enumC66377Q3h == null) {
            enumC66377Q3h = EnumC66377Q3h.GET;
        }
        this.LJFF = enumC66377Q3h;
    }

    public final String LIZIZ(String str, boolean z) {
        if (!z && this.LJFF == EnumC66377Q3h.POST) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (String str2 : this.LIZJ.keySet()) {
            Object LLJJIII = C16880lQ.LLJJIII(this.LIZJ, str2);
            if (LLJJIII == null) {
                LLJJIII = "";
            }
            if (C66388Q3s.LJFF(LLJJIII)) {
                String LJII2 = C66388Q3s.LJII(LLJJIII);
                LJII2.toString();
                buildUpon.appendQueryParameter(str2, LJII2);
            } else if (this.LJFF != EnumC66377Q3h.GET) {
                throw new IllegalArgumentException(C63144OqK.LIZIZ(new Object[]{C16880lQ.LJLLJ(LLJJIII.getClass())}, 1, Locale.US, "Unsupported parameter type for GET request: %s", "java.lang.String.format(locale, format, *args)"));
            }
        }
        String builder = buildUpon.toString();
        o.LJIIIIZZ(builder, "uriBuilder.toString()");
        return builder;
    }

    public GraphRequest(AccessToken accessToken, String str, Bundle bundle, EnumC66377Q3h enumC66377Q3h, BMV bmv, int i) {
        accessToken = (i & 1) != 0 ? null : accessToken;
        str = (i & 2) != 0 ? null : str;
        bundle = (i & 4) != 0 ? null : bundle;
        enumC66377Q3h = (i & 8) != 0 ? null : enumC66377Q3h;
        bmv = (i & 16) != 0 ? null : bmv;
        this.LIZ = accessToken;
        this.LIZIZ = str;
        this.LIZLLL = null;
        u.LJIIIIZZ(EnumC66383Q3n.GRAPH_API_DEBUG_INFO);
        u.LJIIIIZZ(EnumC66383Q3n.GRAPH_API_DEBUG_WARNING);
        this.LJ = bmv;
        LJIIIZ(enumC66377Q3h);
        if (bundle != null) {
            this.LIZJ = new Bundle(bundle);
        } else {
            this.LIZJ = new Bundle();
        }
        this.LIZLLL = C16880lQ.LLIL();
    }
}
