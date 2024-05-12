package X;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import com.facebook.share.model.ShareMedia;
import com.facebook.share.model.ShareOpenGraphAction;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareVideo;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.o;
import m43.u;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ujb.s;

/* loaded from: classes12.dex */
public final class Q6F {
    public static final /* synthetic */ int LIZ = 0;

    public static final Pair<String, String> LIZIZ(String str) {
        String str2;
        int i;
        int LJJLIIIJJIZ = s.LJJLIIIJJIZ(str, ':', 0, false, 6);
        if (LJJLIIIJJIZ != -1 && str.length() > (i = LJJLIIIJJIZ + 1)) {
            str2 = str.substring(0, LJJLIIIJJIZ);
            o.LJIIIIZZ(str2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            str = str.substring(i);
            o.LJIIIIZZ(str, "(this as java.lang.String).substring(startIndex)");
        } else {
            str2 = null;
        }
        return new Pair<>(str2, str);
    }

    public static final String LIZLLL(android.net.Uri uri) {
        if (uri == null) {
            return null;
        }
        String uri2 = uri.toString();
        o.LJIIIIZZ(uri2, "uri.toString()");
        int LJJLIIIJLLLLLLLZ = s.LJJLIIIJLLLLLLLZ(uri2, '.', 0, 6);
        if (LJJLIIIJLLLLLLLZ == -1) {
            return null;
        }
        String substring = uri2.substring(LJJLIIIJLLLLLLLZ);
        o.LJIIIIZZ(substring, "(this as java.lang.String).substring(startIndex)");
        return substring;
    }

    public static final JSONArray LJII(JSONArray jsonArray) {
        o.LJIIIZ(jsonArray, "jsonArray");
        JSONArray jSONArray = new JSONArray();
        int length = jsonArray.length();
        if (length > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                Object obj = jsonArray.get(i);
                if (obj instanceof JSONArray) {
                    obj = LJII((JSONArray) obj);
                } else if (obj instanceof JSONObject) {
                    obj = LJIIIIZZ((JSONObject) obj, true);
                }
                jSONArray.put(obj);
                if (i2 >= length) {
                    break;
                }
                i = i2;
            }
        }
        return jSONArray;
    }

    public static C66379Q3j LIZ(UUID callId, ShareMedia shareMedia) {
        android.net.Uri uri;
        Bitmap bitmap;
        if (shareMedia instanceof SharePhoto) {
            SharePhoto sharePhoto = (SharePhoto) shareMedia;
            bitmap = sharePhoto.bitmap;
            uri = sharePhoto.imageUrl;
        } else if (shareMedia instanceof ShareVideo) {
            uri = ((ShareVideo) shareMedia).localUrl;
            bitmap = null;
        } else {
            uri = null;
            bitmap = null;
        }
        if (bitmap != null) {
            o.LJIIIZ(callId, "callId");
            return new C66379Q3j(bitmap, null, callId);
        }
        if (uri == null) {
            return null;
        }
        o.LJIIIZ(callId, "callId");
        return new C66379Q3j(null, uri, callId);
    }

    public static final List<String> LIZJ(SharePhotoContent sharePhotoContent, UUID appCallId) {
        List<SharePhoto> list;
        o.LJIIIZ(appCallId, "appCallId");
        if (sharePhotoContent == null || (list = sharePhotoContent.photos) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<SharePhoto> it = list.iterator();
        while (it.hasNext()) {
            C66379Q3j LIZ2 = LIZ(appCallId, it.next());
            if (LIZ2 != null) {
                arrayList.add(LIZ2);
            }
        }
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((C66379Q3j) it2.next()).LIZLLL);
        }
        C66378Q3i.LIZ(arrayList);
        return arrayList2;
    }

    public static void LJFF(String str, String str2) {
        u.LIZJ();
        Bundle bundle = new Bundle();
        bundle.putString("fb_share_dialog_outcome", str);
        if (str2 != null) {
            bundle.putString("error_message", str2);
        }
    }

    public static final JSONObject LJIIIIZZ(JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            JSONArray names = jSONObject.names();
            if (names == null) {
                return null;
            }
            int length = names.length();
            if (length > 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    String key = names.getString(i);
                    Object obj = jSONObject.get(key);
                    if (obj instanceof JSONObject) {
                        obj = LJIIIIZZ((JSONObject) obj, true);
                    } else if (obj instanceof JSONArray) {
                        obj = LJII((JSONArray) obj);
                    }
                    o.LJIIIIZZ(key, "key");
                    Pair<String, String> LIZIZ = LIZIZ(key);
                    Object obj2 = LIZIZ.first;
                    String str = (String) LIZIZ.second;
                    if (z) {
                        if (obj2 != null && o.LJ(obj2, "fbsdk")) {
                            jSONObject2.put(key, obj);
                        } else if (obj2 == null || o.LJ(obj2, "og")) {
                            jSONObject2.put(str, obj);
                        } else {
                            jSONObject3.put(str, obj);
                        }
                    } else if (obj2 != null && o.LJ(obj2, "fb")) {
                        jSONObject2.put(key, obj);
                    } else {
                        jSONObject2.put(str, obj);
                    }
                    if (i2 >= length) {
                        break;
                    }
                    i = i2;
                }
            }
            if (jSONObject3.length() > 0) {
                jSONObject2.put("data", jSONObject3);
            }
            return jSONObject2;
        } catch (JSONException unused) {
            throw new Q4W("Failed to create json object from share content");
        }
    }

    public static final JSONObject LJIIIZ(final UUID callId, ShareOpenGraphContent content) {
        o.LJIIIZ(callId, "callId");
        o.LJIIIZ(content, "content");
        ShareOpenGraphAction shareOpenGraphAction = content.action;
        final ArrayList arrayList = new ArrayList();
        JSONObject LIZ2 = Q6P.LIZ(shareOpenGraphAction, new Q6N() { // from class: X.Q6G
            @Override // X.Q6N
            public final JSONObject LIZ(SharePhoto photo) {
                UUID callId2 = callId;
                ArrayList attachments = arrayList;
                o.LJIIIZ(callId2, "$callId");
                o.LJIIIZ(attachments, "$attachments");
                o.LJIIIZ(photo, "photo");
                C66379Q3j LIZ3 = Q6F.LIZ(callId2, photo);
                if (LIZ3 == null) {
                    return null;
                }
                attachments.add(LIZ3);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("url", LIZ3.LIZLLL);
                    if (!photo.userGenerated) {
                        return jSONObject;
                    }
                    jSONObject.put("user_generated", true);
                    return jSONObject;
                } catch (JSONException e) {
                    throw new Q4W("Unable to attach images", e);
                }
            }
        });
        if (LIZ2 == null) {
            return null;
        }
        C66378Q3i.LIZ(arrayList);
        if (content.placeId != null && C66373Q3d.LJIJJ(LIZ2.optString("place"))) {
            LIZ2.put("place", content.placeId);
        }
        if (content.peopleIds != null) {
            JSONArray optJSONArray = LIZ2.optJSONArray("tags");
            HashSet hashSet = new HashSet();
            if (optJSONArray != null) {
                hashSet.addAll(C66373Q3d.LJIL(optJSONArray));
            }
            Iterator<String> it = content.peopleIds.iterator();
            while (it.hasNext()) {
                hashSet.add(it.next());
            }
            LIZ2.put("tags", new JSONArray((Collection) hashSet));
        }
        return LIZ2;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0032 A[Catch: all -> 0x00c9, TRY_ENTER, TRY_LEAVE, TryCatch #2 {, blocks: (B:8:0x000c, B:15:0x0019, B:17:0x0023, B:22:0x0032), top: B:7:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x008d A[Catch: all -> 0x004f, TryCatch #4 {all -> 0x004f, blocks: (B:50:0x0063, B:53:0x006e, B:55:0x0074, B:58:0x008d, B:60:0x0093, B:61:0x0098, B:62:0x007b, B:65:0x0086), top: B:49:0x0063 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LJ(int r6, android.content.Intent r7, a04.IDfS0S0100000_11 r8) {
        /*
            java.util.UUID r5 = X.Q5A.LJIIIZ(r7)
            r4 = 0
            r0 = 0
            if (r5 != 0) goto L9
        L8:
            return r4
        L9:
            X.Q6I r2 = X.Q6H.LIZLLL
            monitor-enter(r2)
            java.lang.Class<X.Q6H> r1 = X.Q6H.class
            boolean r1 = X.C40700FyC.LIZ(r1)     // Catch: java.lang.Throwable -> Lc9
            if (r1 == 0) goto L15
            goto L30
        L15:
            X.Q6H r3 = X.Q6H.LJ     // Catch: java.lang.Throwable -> L30
            if (r3 == 0) goto L30
            java.util.UUID r1 = r3.LIZ()     // Catch: java.lang.Throwable -> Lc9
            boolean r1 = kotlin.jvm.internal.o.LJ(r1, r5)     // Catch: java.lang.Throwable -> Lc9
            if (r1 == 0) goto L30
            boolean r1 = X.C40700FyC.LIZ(r3)     // Catch: java.lang.Throwable -> Lc9
            if (r1 == 0) goto L2a
            goto L2d
        L2a:
            int r1 = r3.LIZ     // Catch: java.lang.Throwable -> L2d
            goto L2e
        L2d:
            r1 = 0
        L2e:
            if (r1 == r6) goto L32
        L30:
            monitor-exit(r2)
            goto L8
        L32:
            r2.LIZ(r0)     // Catch: java.lang.Throwable -> Lc9
            monitor-exit(r2)
            java.util.UUID r2 = r3.LIZ()
            java.lang.String r1 = "callId"
            kotlin.jvm.internal.o.LJIIIZ(r2, r1)
            java.io.File r1 = X.C66378Q3i.LIZJ(r2, r4)
            if (r1 != 0) goto Lc4
        L45:
            if (r7 == 0) goto La7
            java.lang.Class<X.Q5A> r1 = X.Q5A.class
            boolean r1 = X.C40700FyC.LIZ(r1)
            if (r1 == 0) goto L63
        L4f:
            r1 = r0
        L50:
            X.Q4W r1 = X.Q5A.LJIIJ(r1)
            if (r1 == 0) goto L9d
            boolean r0 = r1 instanceof X.C66406Q4k
            if (r0 == 0) goto L5f
            r8.LLLLZ$0(r3)
        L5d:
            r0 = 1
            return r0
        L5f:
            r8.LLLLZIL$1(r3, r1)
            goto L5d
        L63:
            java.lang.Class<X.Q5A> r1 = X.Q5A.class
            boolean r1 = X.C40700FyC.LIZ(r1)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r2 = "error"
            if (r1 == 0) goto L6e
            goto L4f
        L6e:
            android.os.Bundle r1 = X.Q5A.LJIIIIZZ(r7)     // Catch: java.lang.Throwable -> L4f
            if (r1 != 0) goto L7b
        L74:
            java.lang.String r1 = "com.facebook.platform.status.ERROR_TYPE"
            boolean r1 = r7.hasExtra(r1)     // Catch: java.lang.Throwable -> L4f
            goto L8a
        L7b:
            boolean r1 = r1.containsKey(r2)     // Catch: java.lang.Throwable -> L4f
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L4f
            if (r1 != 0) goto L86
            goto L74
        L86:
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L4f
        L8a:
            if (r1 != 0) goto L8d
            goto L4f
        L8d:
            android.os.Bundle r1 = X.Q5A.LJIIIIZZ(r7)     // Catch: java.lang.Throwable -> L4f
            if (r1 == 0) goto L98
            android.os.Bundle r1 = r1.getBundle(r2)     // Catch: java.lang.Throwable -> L4f
            goto L50
        L98:
            android.os.Bundle r1 = X.C16880lQ.LLJJIJI(r7)     // Catch: java.lang.Throwable -> L4f
            goto L50
        L9d:
            if (r7 == 0) goto La7
            java.lang.Class<X.Q5A> r1 = X.Q5A.class
            boolean r1 = X.C40700FyC.LIZ(r1)
            if (r1 == 0) goto Lab
        La7:
            r8.LLLLZLLIL$2(r3, r0)
            goto L5d
        Lab:
            int r1 = X.Q5A.LJIILJJIL(r7)     // Catch: java.lang.Throwable -> La7
            android.os.Bundle r2 = X.C16880lQ.LLJJIJI(r7)     // Catch: java.lang.Throwable -> La7
            boolean r1 = X.Q5A.LJIILL(r1)     // Catch: java.lang.Throwable -> La7
            if (r1 == 0) goto Lbb
            if (r2 != 0) goto Lbd
        Lbb:
            r0 = r2
            goto La7
        Lbd:
            java.lang.String r1 = "com.facebook.platform.protocol.RESULT_ARGS"
            android.os.Bundle r0 = r2.getBundle(r1)     // Catch: java.lang.Throwable -> La7
            goto La7
        Lc4:
            X.OR7.LLLIIL(r1)
            goto L45
        Lc9:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q6F.LJ(int, android.content.Intent, a04.IDfS0S0100000_11):boolean");
    }

    public static final GraphRequest LJI(AccessToken accessToken, android.net.Uri uri, C65837Psf c65837Psf) {
        String path = uri.getPath();
        if (ujb.o.LJJJJIZL("file", uri.getScheme(), true) && path != null) {
            GraphRequest.ParcelableResourceWithMimeType parcelableResourceWithMimeType = new GraphRequest.ParcelableResourceWithMimeType(ParcelFileDescriptor.open(new File(path), 268435456));
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("file", parcelableResourceWithMimeType);
            return new GraphRequest(accessToken, "me/staging_resources", bundle, EnumC66377Q3h.POST, c65837Psf, 32);
        }
        if (ujb.o.LJJJJIZL("content", uri.getScheme(), true)) {
            GraphRequest.ParcelableResourceWithMimeType parcelableResourceWithMimeType2 = new GraphRequest.ParcelableResourceWithMimeType(uri);
            Bundle bundle2 = new Bundle(1);
            bundle2.putParcelable("file", parcelableResourceWithMimeType2);
            return new GraphRequest(accessToken, "me/staging_resources", bundle2, EnumC66377Q3h.POST, c65837Psf, 32);
        }
        throw new Q4W("The image Uri must be either a file:// or content:// Uri");
    }
}
