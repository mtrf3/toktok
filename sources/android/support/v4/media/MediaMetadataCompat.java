package android.support.v4.media;

import X.C01O;
import X.C1HQ;
import Y.IDCreatorS45S0000000;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;

/* loaded from: classes.dex */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;
    public static final C1HQ<String, Integer> LJLILLLLZI;
    public static final String[] PREFERRED_BITMAP_ORDER;
    public static final String[] PREFERRED_DESCRIPTION_ORDER;
    public static final String[] PREFERRED_URI_ORDER;
    public final Bundle LJLIL;
    public MediaDescriptionCompat mDescription;
    public MediaMetadata mMetadataFwk;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        C1HQ<String, Integer> c1hq = new C1HQ<>();
        LJLILLLLZI = c1hq;
        c1hq.put("android.media.metadata.TITLE", 1);
        c1hq.put("android.media.metadata.ARTIST", 1);
        c1hq.put("android.media.metadata.DURATION", 0);
        c1hq.put("android.media.metadata.ALBUM", 1);
        c1hq.put("android.media.metadata.AUTHOR", 1);
        c1hq.put("android.media.metadata.WRITER", 1);
        c1hq.put("android.media.metadata.COMPOSER", 1);
        c1hq.put("android.media.metadata.COMPILATION", 1);
        c1hq.put("android.media.metadata.DATE", 1);
        c1hq.put("android.media.metadata.YEAR", 0);
        c1hq.put("android.media.metadata.GENRE", 1);
        c1hq.put("android.media.metadata.TRACK_NUMBER", 0);
        c1hq.put("android.media.metadata.NUM_TRACKS", 0);
        c1hq.put("android.media.metadata.DISC_NUMBER", 0);
        c1hq.put("android.media.metadata.ALBUM_ARTIST", 1);
        c1hq.put("android.media.metadata.ART", 2);
        c1hq.put("android.media.metadata.ART_URI", 1);
        c1hq.put("android.media.metadata.ALBUM_ART", 2);
        c1hq.put("android.media.metadata.ALBUM_ART_URI", 1);
        c1hq.put("android.media.metadata.USER_RATING", 3);
        c1hq.put("android.media.metadata.RATING", 3);
        c1hq.put("android.media.metadata.DISPLAY_TITLE", 1);
        c1hq.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        c1hq.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        c1hq.put("android.media.metadata.DISPLAY_ICON", 2);
        c1hq.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        c1hq.put("android.media.metadata.MEDIA_ID", 1);
        c1hq.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        c1hq.put("android.media.metadata.MEDIA_URI", 1);
        c1hq.put("android.media.metadata.ADVERTISEMENT", 0);
        c1hq.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        PREFERRED_DESCRIPTION_ORDER = new String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};
        PREFERRED_BITMAP_ORDER = new String[]{"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};
        PREFERRED_URI_ORDER = new String[]{"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};
        CREATOR = new IDCreatorS45S0000000(2);
    }

    public final MediaDescriptionCompat LIZIZ() {
        String str;
        Bitmap bitmap;
        Uri uri;
        String str2;
        String str3;
        MediaDescriptionCompat mediaDescriptionCompat = this.mDescription;
        if (mediaDescriptionCompat != null) {
            return mediaDescriptionCompat;
        }
        CharSequence charSequence = this.LJLIL.getCharSequence("android.media.metadata.MEDIA_ID");
        Uri uri2 = null;
        if (charSequence != null) {
            str = charSequence.toString();
        } else {
            str = null;
        }
        CharSequence[] charSequenceArr = new CharSequence[3];
        CharSequence charSequence2 = this.LJLIL.getCharSequence("android.media.metadata.DISPLAY_TITLE");
        if (!TextUtils.isEmpty(charSequence2)) {
            charSequenceArr[0] = charSequence2;
            charSequenceArr[1] = this.LJLIL.getCharSequence("android.media.metadata.DISPLAY_SUBTITLE");
            charSequenceArr[2] = this.LJLIL.getCharSequence("android.media.metadata.DISPLAY_DESCRIPTION");
        } else {
            int i = 0;
            int i2 = 0;
            do {
                String[] strArr = PREFERRED_DESCRIPTION_ORDER;
                if (i2 >= strArr.length) {
                    break;
                }
                int i3 = i2 + 1;
                CharSequence charSequence3 = this.LJLIL.getCharSequence(strArr[i2]);
                if (!TextUtils.isEmpty(charSequence3)) {
                    charSequenceArr[i] = charSequence3;
                    i++;
                }
                i2 = i3;
            } while (i < 3);
        }
        int i4 = 0;
        while (true) {
            String[] strArr2 = PREFERRED_BITMAP_ORDER;
            if (i4 < strArr2.length) {
                try {
                    bitmap = (Bitmap) this.LJLIL.getParcelable(strArr2[i4]);
                } catch (Exception unused) {
                }
                if (bitmap != null) {
                    break;
                }
                i4++;
            } else {
                bitmap = null;
                break;
            }
        }
        int i5 = 0;
        while (true) {
            String[] strArr3 = PREFERRED_URI_ORDER;
            if (i5 < strArr3.length) {
                CharSequence charSequence4 = this.LJLIL.getCharSequence(strArr3[i5]);
                if (charSequence4 != null) {
                    str3 = charSequence4.toString();
                } else {
                    str3 = null;
                }
                if (!TextUtils.isEmpty(str3)) {
                    uri = UriProtector.parse(str3);
                    break;
                }
                i5++;
            } else {
                uri = null;
                break;
            }
        }
        CharSequence charSequence5 = this.LJLIL.getCharSequence("android.media.metadata.MEDIA_URI");
        if (charSequence5 != null) {
            str2 = charSequence5.toString();
        } else {
            str2 = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            uri2 = UriProtector.parse(str2);
        }
        C01O c01o = new C01O();
        c01o.LIZ = str;
        c01o.LIZIZ = charSequenceArr[0];
        c01o.LIZJ = charSequenceArr[1];
        c01o.LIZLLL = charSequenceArr[2];
        c01o.LJ = bitmap;
        c01o.LJFF = uri;
        c01o.LJII = uri2;
        Bundle bundle = new Bundle();
        if (this.LJLIL.containsKey("android.media.metadata.BT_FOLDER_TYPE")) {
            bundle.putLong("android.media.extra.BT_FOLDER_TYPE", this.LJLIL.getLong("android.media.metadata.BT_FOLDER_TYPE", 0L));
        }
        if (this.LJLIL.containsKey("android.media.metadata.DOWNLOAD_STATUS")) {
            bundle.putLong("android.media.extra.DOWNLOAD_STATUS", this.LJLIL.getLong("android.media.metadata.DOWNLOAD_STATUS", 0L));
        }
        if (!bundle.isEmpty()) {
            c01o.LJI = bundle;
        }
        MediaDescriptionCompat mediaDescriptionCompat2 = new MediaDescriptionCompat(c01o.LIZ, c01o.LIZIZ, c01o.LIZJ, c01o.LIZLLL, c01o.LJ, c01o.LJFF, c01o.LJI, c01o.LJII);
        this.mDescription = mediaDescriptionCompat2;
        return mediaDescriptionCompat2;
    }

    public final Object LIZLLL() {
        if (this.mMetadataFwk == null) {
            Parcel obtain = Parcel.obtain();
            writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            this.mMetadataFwk = (MediaMetadata) MediaMetadata.CREATOR.createFromParcel(obtain);
            obtain.recycle();
        }
        return this.mMetadataFwk;
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.LJLIL = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }

    public static MediaMetadataCompat LIZ(Object obj) {
        if (obj != null) {
            Parcel obtain = Parcel.obtain();
            MediaMetadata mediaMetadata = (MediaMetadata) obj;
            mediaMetadata.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            MediaMetadataCompat createFromParcel = CREATOR.createFromParcel(obtain);
            obtain.recycle();
            createFromParcel.mMetadataFwk = mediaMetadata;
            return createFromParcel;
        }
        return null;
    }

    public MediaMetadataCompat(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.LJLIL = bundle2;
        MediaSessionCompat.LIZ(bundle2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.LJLIL);
    }
}
