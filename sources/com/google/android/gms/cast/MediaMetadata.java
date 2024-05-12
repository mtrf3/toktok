package com.google.android.gms.cast;

import X.C16880lQ;
import X.C79057V0z;
import X.C90068ZWm;
import X.C90071ZWp;
import X.C90209Zan;
import X.C90468Zey;
import X.C90497ZfR;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes29.dex */
public class MediaMetadata extends AbstractSafeParcelable {
    public static final C90068ZWm zzc;
    public final Bundle LJLIL;
    public final List<WebImage> zzd;
    public int zze;
    public final C90209Zan zzf;
    public static final String[] zzb = {LiveGiftNewGifterBadgeSetting.DEFAULT, "String", "int", "double", "ISO-8601 date String", "Time in milliseconds as long"};
    public static final Parcelable.Creator<MediaMetadata> CREATOR = new C90071ZWp();

    public MediaMetadata() {
        this(0);
    }

    static {
        C90068ZWm c90068ZWm = new C90068ZWm();
        c90068ZWm.LIZIZ(4, "com.google.android.gms.cast.metadata.CREATION_DATE", "creationDateTime");
        c90068ZWm.LIZIZ(4, "com.google.android.gms.cast.metadata.RELEASE_DATE", "releaseDate");
        c90068ZWm.LIZIZ(4, "com.google.android.gms.cast.metadata.BROADCAST_DATE", "originalAirdate");
        c90068ZWm.LIZIZ(1, "com.google.android.gms.cast.metadata.TITLE", "title");
        c90068ZWm.LIZIZ(1, "com.google.android.gms.cast.metadata.SUBTITLE", "subtitle");
        c90068ZWm.LIZIZ(1, "com.google.android.gms.cast.metadata.ARTIST", "artist");
        c90068ZWm.LIZIZ(1, "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "albumArtist");
        c90068ZWm.LIZIZ(1, "com.google.android.gms.cast.metadata.ALBUM_TITLE", "albumName");
        c90068ZWm.LIZIZ(1, "com.google.android.gms.cast.metadata.COMPOSER", "composer");
        c90068ZWm.LIZIZ(2, "com.google.android.gms.cast.metadata.DISC_NUMBER", "discNumber");
        c90068ZWm.LIZIZ(2, "com.google.android.gms.cast.metadata.TRACK_NUMBER", "trackNumber");
        c90068ZWm.LIZIZ(2, "com.google.android.gms.cast.metadata.SEASON_NUMBER", "season");
        c90068ZWm.LIZIZ(2, "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "episode");
        c90068ZWm.LIZIZ(1, "com.google.android.gms.cast.metadata.SERIES_TITLE", "seriesTitle");
        c90068ZWm.LIZIZ(1, "com.google.android.gms.cast.metadata.STUDIO", "studio");
        c90068ZWm.LIZIZ(2, "com.google.android.gms.cast.metadata.WIDTH", "width");
        c90068ZWm.LIZIZ(2, "com.google.android.gms.cast.metadata.HEIGHT", "height");
        c90068ZWm.LIZIZ(1, "com.google.android.gms.cast.metadata.LOCATION_NAME", "location");
        c90068ZWm.LIZIZ(3, "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "latitude");
        c90068ZWm.LIZIZ(3, "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "longitude");
        c90068ZWm.LIZIZ(5, "com.google.android.gms.cast.metadata.SECTION_DURATION", "sectionDuration");
        c90068ZWm.LIZIZ(5, "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "sectionStartTimeInMedia");
        c90068ZWm.LIZIZ(5, "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "sectionStartAbsoluteTime");
        c90068ZWm.LIZIZ(5, "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "sectionStartTimeInContainer");
        c90068ZWm.LIZIZ(2, "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID", "queueItemId");
        c90068ZWm.LIZIZ(1, "com.google.android.gms.cast.metadata.BOOK_TITLE", "bookTitle");
        c90068ZWm.LIZIZ(2, "com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "chapterNumber");
        c90068ZWm.LIZIZ(1, "com.google.android.gms.cast.metadata.CHAPTER_TITLE", "chapterTitle");
        zzc = c90068ZWm;
    }

    public final JSONObject LJJJLIIL() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("metadataType", this.zze);
        } catch (JSONException unused) {
        }
        JSONArray LIZIZ = C90497ZfR.LIZIZ(this.zzd);
        if (LIZIZ.length() != 0) {
            try {
                jSONObject.put("images", LIZIZ);
            } catch (JSONException unused2) {
            }
        }
        ArrayList arrayList = new ArrayList();
        int i = this.zze;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.CHAPTER_TITLE", "com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.BOOK_TITLE", "com.google.android.gms.cast.metadata.SUBTITLE");
                            }
                        } else {
                            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE");
                        }
                    } else {
                        Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.ALBUM_TITLE", "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", "com.google.android.gms.cast.metadata.RELEASE_DATE");
                    }
                } else {
                    Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE");
                }
            } else {
                Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.STUDIO", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
            }
        } else {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        }
        Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.SECTION_DURATION", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID");
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (str != null && this.LJLIL.containsKey(str)) {
                    C90068ZWm c90068ZWm = zzc;
                    String str2 = (String) ((HashMap) c90068ZWm.LIZ).get(str);
                    if (str2 != null) {
                        int LIZ = c90068ZWm.LIZ(str);
                        if (LIZ != 1) {
                            if (LIZ != 2) {
                                if (LIZ != 3) {
                                    if (LIZ != 4) {
                                        if (LIZ == 5) {
                                            jSONObject.put(str2, C90468Zey.LIZ(this.LJLIL.getLong(str)));
                                        }
                                    }
                                } else {
                                    jSONObject.put(str2, this.LJLIL.getDouble(str));
                                }
                            } else {
                                jSONObject.put(str2, this.LJLIL.getInt(str));
                            }
                        }
                        jSONObject.put(str2, this.LJLIL.getString(str));
                    }
                }
            }
            for (String str3 : this.LJLIL.keySet()) {
                if (!str3.startsWith("com.google.")) {
                    Object LLJJIII = C16880lQ.LLJJIII(this.LJLIL, str3);
                    if (LLJJIII instanceof String) {
                        jSONObject.put(str3, LLJJIII);
                    } else if (LLJJIII instanceof Integer) {
                        jSONObject.put(str3, LLJJIII);
                    } else if (LLJJIII instanceof Double) {
                        jSONObject.put(str3, LLJJIII);
                    }
                }
            }
        } catch (JSONException unused3) {
        }
        return jSONObject;
    }

    public final int hashCode() {
        int i;
        Bundle bundle = this.LJLIL;
        int i2 = 17;
        if (bundle != null) {
            Iterator<String> it = bundle.keySet().iterator();
            while (it.hasNext()) {
                Object LLJJIII = C16880lQ.LLJJIII(this.LJLIL, it.next());
                int i3 = i2 * 31;
                if (LLJJIII != null) {
                    i = LLJJIII.hashCode();
                } else {
                    i = 0;
                }
                i2 = i3 + i;
            }
        }
        return (i2 * 31) + this.zzd.hashCode();
    }

    public MediaMetadata(int i) {
        this(new ArrayList(), new Bundle(), i);
    }

    public final boolean LJJJJL(String str) {
        return this.LJLIL.containsKey(str);
    }

    public final String LJJJJZ(String str) {
        LJJJJZI(1, str);
        return this.LJLIL.getString(str);
    }

    public final void LJJL(JSONObject jSONObject) {
        this.LJLIL.clear();
        this.zzd.clear();
        this.zze = 0;
        try {
            this.zze = JSONObjectProtectorUtils.getInt(jSONObject, "metadataType");
        } catch (JSONException unused) {
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        if (optJSONArray != null) {
            List<WebImage> list = this.zzd;
            try {
                list.clear();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    try {
                        list.add(new WebImage(JSONArrayProtectorUtils.getJSONObject(optJSONArray, i)));
                    } catch (IllegalArgumentException unused2) {
                    }
                }
            } catch (JSONException unused3) {
            }
        }
        ArrayList arrayList = new ArrayList();
        int i2 = this.zze;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 == 5) {
                                Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.CHAPTER_TITLE", "com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.BOOK_TITLE", "com.google.android.gms.cast.metadata.SUBTITLE");
                            }
                        } else {
                            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE");
                        }
                    } else {
                        Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ALBUM_TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", "com.google.android.gms.cast.metadata.RELEASE_DATE");
                    }
                } else {
                    Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE");
                }
            } else {
                Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.STUDIO", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
            }
        } else {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        }
        Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.SECTION_DURATION", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID");
        HashSet hashSet = new HashSet(arrayList);
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next != null && !"metadataType".equals(next)) {
                    C90068ZWm c90068ZWm = zzc;
                    String str = (String) ((HashMap) c90068ZWm.LIZIZ).get(next);
                    if (str != null) {
                        if (hashSet.contains(str)) {
                            try {
                                Object obj = jSONObject.get(next);
                                if (obj != null) {
                                    int LIZ = c90068ZWm.LIZ(str);
                                    if (LIZ != 1) {
                                        if (LIZ != 2) {
                                            if (LIZ != 3) {
                                                if (LIZ != 4) {
                                                    if (LIZ == 5) {
                                                        this.LJLIL.putLong(str, jSONObject.optLong(next) * 1000);
                                                    }
                                                } else if (obj instanceof String) {
                                                    String str2 = (String) obj;
                                                    if (C90497ZfR.LIZ(str2) != null) {
                                                        this.LJLIL.putString(str, str2);
                                                    }
                                                }
                                            } else {
                                                double optDouble = jSONObject.optDouble(next);
                                                if (!Double.isNaN(optDouble)) {
                                                    this.LJLIL.putDouble(str, optDouble);
                                                }
                                            }
                                        } else if (obj instanceof Integer) {
                                            this.LJLIL.putInt(str, ((Integer) obj).intValue());
                                        }
                                    } else if (obj instanceof String) {
                                        this.LJLIL.putString(str, (String) obj);
                                    }
                                }
                            } catch (JSONException unused4) {
                            }
                        }
                    } else {
                        Object obj2 = jSONObject.get(next);
                        if (obj2 instanceof String) {
                            this.LJLIL.putString(next, (String) obj2);
                        } else if (obj2 instanceof Integer) {
                            this.LJLIL.putInt(next, ((Integer) obj2).intValue());
                        } else if (obj2 instanceof Double) {
                            this.LJLIL.putDouble(next, ((Double) obj2).doubleValue());
                        }
                    }
                }
            }
        } catch (JSONException unused5) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaMetadata)) {
            return false;
        }
        MediaMetadata mediaMetadata = (MediaMetadata) obj;
        if (LJJLIIIIJ(this.LJLIL, mediaMetadata.LJLIL) && this.zzd.equals(mediaMetadata.zzd)) {
            return true;
        }
        return false;
    }

    public static void LJJJJZI(int i, String str) {
        if (!TextUtils.isEmpty(str)) {
            int LIZ = zzc.LIZ(str);
            if (LIZ == i || LIZ == 0) {
                return;
            }
            String str2 = zzb[i];
            int length = String.valueOf(str).length();
            StringBuilder sb = new StringBuilder(length + 21 + String.valueOf(str2).length());
            sb.append("Value for ");
            sb.append(str);
            sb.append(" must be a ");
            sb.append(str2);
            throw new IllegalArgumentException(sb.toString());
        }
        throw new IllegalArgumentException("null and empty keys are not allowed");
    }

    public static boolean LJJLIIIIJ(Bundle bundle, Bundle bundle2) {
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object LLJJIII = C16880lQ.LLJJIII(bundle, str);
            Object LLJJIII2 = C16880lQ.LLJJIII(bundle2, str);
            if ((LLJJIII instanceof Bundle) && (LLJJIII2 instanceof Bundle) && !LJJLIIIIJ((Bundle) LLJJIII, (Bundle) LLJJIII2)) {
                return false;
            }
            if (LLJJIII == null) {
                if (LLJJIII2 != null || !bundle2.containsKey(str)) {
                    return false;
                }
            } else if (!LLJJIII.equals(LLJJIII2)) {
                return false;
            }
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJLIIL(parcel, 2, this.zzd, false);
        C79057V0z.LJJLI(parcel, 3, this.LJLIL);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 4, this.zze);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public MediaMetadata(List<WebImage> list, Bundle bundle, int i) {
        this.zzf = new C90209Zan();
        this.zzd = list;
        this.LJLIL = bundle;
        this.zze = i;
    }
}
