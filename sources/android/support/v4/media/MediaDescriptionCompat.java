package android.support.v4.media;

import X.C01M;
import X.C01N;
import X.C01R;
import X.X1D;
import Y.IDCreatorS45S0000000;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new IDCreatorS45S0000000(1);
    public final CharSequence mDescription;
    public MediaDescription mDescriptionFwk;
    public final Bundle mExtras;
    public final Bitmap mIcon;
    public final Uri mIconUri;
    public final String mMediaId;
    public final Uri mMediaUri;
    public final CharSequence mSubtitle;
    public final CharSequence mTitle;

    public MediaDescriptionCompat() {
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append((Object) this.mTitle);
        LIZ.append(", ");
        LIZ.append((Object) this.mSubtitle);
        LIZ.append(", ");
        LIZ.append((Object) this.mDescription);
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.support.v4.media.MediaDescriptionCompat LIZ(java.lang.Object r16) {
        /*
            r2 = r16
            r8 = 0
            if (r2 == 0) goto L78
            X.01O r3 = new X.01O
            r3.<init>()
            android.media.MediaDescription r2 = (android.media.MediaDescription) r2
            java.lang.String r0 = X.C01M.LJI(r2)
            r3.LIZ = r0
            java.lang.CharSequence r0 = X.C01M.LJIIIIZZ(r2)
            r3.LIZIZ = r0
            java.lang.CharSequence r0 = X.C01M.LJII(r2)
            r3.LIZJ = r0
            java.lang.CharSequence r0 = X.C01M.LIZJ(r2)
            r3.LIZLLL = r0
            android.graphics.Bitmap r0 = X.C01M.LJ(r2)
            r3.LJ = r0
            android.net.Uri r0 = X.C01M.LJFF(r2)
            r3.LJFF = r0
            android.os.Bundle r7 = X.C01M.LIZLLL(r2)
            if (r7 == 0) goto L3e
            android.support.v4.media.session.MediaSessionCompat.LIZ(r7)
            r7.isEmpty()     // Catch: android.os.BadParcelableException -> L3d
            goto L3e
        L3d:
            r7 = r8
        L3e:
            java.lang.String r6 = "android.support.v4.media.description.MEDIA_URI"
            if (r7 == 0) goto L86
            android.os.Parcelable r5 = r7.getParcelable(r6)
            android.net.Uri r5 = (android.net.Uri) r5
            if (r5 == 0) goto L8e
            java.lang.String r4 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r0 = r7.containsKey(r4)
            if (r0 == 0) goto L88
            int r1 = r7.size()
            r0 = 2
            if (r1 != r0) goto L88
        L59:
            r3.LJI = r8
            if (r5 == 0) goto L79
            r3.LJII = r5
        L5f:
            android.support.v4.media.MediaDescriptionCompat r8 = new android.support.v4.media.MediaDescriptionCompat
            java.lang.String r9 = r3.LIZ
            java.lang.CharSequence r10 = r3.LIZIZ
            java.lang.CharSequence r11 = r3.LIZJ
            java.lang.CharSequence r12 = r3.LIZLLL
            android.graphics.Bitmap r13 = r3.LJ
            android.net.Uri r14 = r3.LJFF
            android.os.Bundle r15 = r3.LJI
            android.net.Uri r0 = r3.LJII
            r16 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            r8.mDescriptionFwk = r2
        L78:
            return r8
        L79:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 < r0) goto L5f
            android.net.Uri r0 = X.C01N.LIZ(r2)
            r3.LJII = r0
            goto L5f
        L86:
            r5 = r8
            goto L8e
        L88:
            r7.remove(r6)
            r7.remove(r4)
        L8e:
            r8 = r7
            goto L59
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaDescriptionCompat.LIZ(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle;
        MediaDescription mediaDescription = this.mDescriptionFwk;
        if (mediaDescription == null) {
            MediaDescription.Builder LIZIZ = C01M.LIZIZ();
            C01M.LJIILIIL(LIZIZ, this.mMediaId);
            C01M.LJIILL(LIZIZ, this.mTitle);
            C01M.LJIILJJIL(LIZIZ, this.mSubtitle);
            C01M.LJIIIZ(LIZIZ, this.mDescription);
            C01M.LJIIJJI(LIZIZ, this.mIcon);
            C01M.LJIIL(LIZIZ, this.mIconUri);
            int i2 = Build.VERSION.SDK_INT;
            if (i2 < 23 && this.mMediaUri != null) {
                if (this.mExtras == null) {
                    bundle = C01R.LIZ("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
                } else {
                    bundle = new Bundle(this.mExtras);
                }
                bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.mMediaUri);
                C01M.LJIIJ(LIZIZ, bundle);
            } else {
                C01M.LJIIJ(LIZIZ, this.mExtras);
                if (i2 >= 23) {
                    C01N.LIZIZ(LIZIZ, this.mMediaUri);
                }
            }
            mediaDescription = C01M.LIZ(LIZIZ);
            this.mDescriptionFwk = mediaDescription;
        }
        mediaDescription.writeToParcel(parcel, i);
    }

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.mMediaId = str;
        this.mTitle = charSequence;
        this.mSubtitle = charSequence2;
        this.mDescription = charSequence3;
        this.mIcon = bitmap;
        this.mIconUri = uri;
        this.mExtras = bundle;
        this.mMediaUri = uri2;
    }
}
