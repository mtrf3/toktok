package android.support.v4.media.session;

import X.AbstractC007001a;
import X.AnonymousClass184;
import X.BinderC39721hA;
import X.C007501f;
import X.C0H1;
import X.InterfaceC007201c;
import X.InterfaceC007701h;
import X.InterfaceC06180Mc;
import X.X1D;
import Y.IDCreatorS45S0000000;
import android.media.MediaMetadata;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class MediaSessionCompat {
    public static int LIZLLL;
    public final AnonymousClass184 LIZ;
    public final MediaControllerCompat LIZIZ;
    public final ArrayList<InterfaceC007201c> LIZJ = new ArrayList<>();

    /* loaded from: classes.dex */
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new IDCreatorS45S0000000(6);
        public InterfaceC007701h mExtraBinder;
        public final Object mInner;
        public final Object mLock = new Object();
        public InterfaceC06180Mc mSession2Token = null;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final InterfaceC007701h LIZ() {
            InterfaceC007701h interfaceC007701h;
            synchronized (this.mLock) {
                interfaceC007701h = this.mExtraBinder;
            }
            return interfaceC007701h;
        }

        public final InterfaceC06180Mc LIZIZ() {
            InterfaceC06180Mc interfaceC06180Mc;
            synchronized (this.mLock) {
                interfaceC06180Mc = this.mSession2Token;
            }
            return interfaceC06180Mc;
        }

        public final int hashCode() {
            Object obj = this.mInner;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public final void LIZLLL(InterfaceC007701h interfaceC007701h) {
            synchronized (this.mLock) {
                this.mExtraBinder = interfaceC007701h;
            }
        }

        public final void LJ(InterfaceC06180Mc interfaceC06180Mc) {
            synchronized (this.mLock) {
                this.mSession2Token = interfaceC06180Mc;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            Object obj2 = this.mInner;
            if (obj2 == null) {
                if (token.mInner == null) {
                    return true;
                }
                return false;
            }
            Object obj3 = token.mInner;
            if (obj3 == null) {
                return false;
            }
            return obj2.equals(obj3);
        }

        public Token(Object obj, BinderC39721hA binderC39721hA) {
            this.mInner = obj;
            this.mExtraBinder = binderC39721hA;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable((Parcelable) this.mInner, i);
        }
    }

    /* loaded from: classes.dex */
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new IDCreatorS45S0000000(4);
        public final MediaDescriptionCompat mDescription;
        public final long mId;
        public MediaSession.QueueItem mItemFwk;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("MediaSession.QueueItem {Description=");
            LIZ.append(this.mDescription);
            LIZ.append(", Id=");
            return C0H1.LIZJ(LIZ, this.mId, " }", LIZ);
        }

        public QueueItem(Parcel parcel) {
            this.mDescription = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.mId = parcel.readLong();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.mDescription.writeToParcel(parcel, i);
            parcel.writeLong(this.mId);
        }

        public QueueItem(MediaSession.QueueItem queueItem, MediaDescriptionCompat mediaDescriptionCompat, long j) {
            if (mediaDescriptionCompat != null) {
                if (j != -1) {
                    this.mDescription = mediaDescriptionCompat;
                    this.mId = j;
                    this.mItemFwk = queueItem;
                    return;
                }
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
            throw new IllegalArgumentException("Description cannot be null");
        }
    }

    public final boolean LIZJ() {
        return this.LIZ.LIZ.isActive();
    }

    public final void LIZLLL() {
        AnonymousClass184 anonymousClass184 = this.LIZ;
        anonymousClass184.LJ = true;
        anonymousClass184.LJFF.kill();
        if (Build.VERSION.SDK_INT == 27) {
            try {
                Field declaredField = anonymousClass184.LIZ.getClass().getDeclaredField("mCallback");
                declaredField.setAccessible(true);
                Handler handler = (Handler) declaredField.get(anonymousClass184.LIZ);
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
            } catch (Exception unused) {
            }
        }
        anonymousClass184.LIZ.setCallback(null);
        anonymousClass184.LIZ.release();
    }

    /* loaded from: classes.dex */
    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new IDCreatorS45S0000000(5);
        public final ResultReceiver LJLIL;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public ResultReceiverWrapper(Parcel parcel) {
            this.LJLIL = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.LJLIL.writeToParcel(parcel, i);
        }
    }

    public static void LIZ(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    public final void LJ(boolean z) {
        this.LIZ.LIZ.setActive(z);
        Iterator<InterfaceC007201c> it = this.LIZJ.iterator();
        while (it.hasNext()) {
            it.next().LIZ();
        }
    }

    public final void LJI(MediaMetadataCompat mediaMetadataCompat) {
        AnonymousClass184 anonymousClass184 = this.LIZ;
        anonymousClass184.LJII = mediaMetadataCompat;
        anonymousClass184.LIZ.setMetadata((MediaMetadata) mediaMetadataCompat.LIZLLL());
    }

    public final void LJII(PlaybackStateCompat playbackStateCompat) {
        AnonymousClass184 anonymousClass184 = this.LIZ;
        anonymousClass184.LJI = playbackStateCompat;
        synchronized (anonymousClass184.LIZJ) {
            int beginBroadcast = anonymousClass184.LJFF.beginBroadcast();
            while (true) {
                beginBroadcast--;
                if (beginBroadcast >= 0) {
                    try {
                        anonymousClass184.LJFF.getBroadcastItem(beginBroadcast).LLJLLL(playbackStateCompat);
                    } catch (RemoteException unused) {
                    }
                } else {
                    anonymousClass184.LJFF.finishBroadcast();
                }
            }
        }
        anonymousClass184.LIZ.setPlaybackState((PlaybackState) playbackStateCompat.LIZIZ());
    }

    public static PlaybackStateCompat LIZIZ(PlaybackStateCompat playbackStateCompat, MediaMetadataCompat mediaMetadataCompat) {
        if (playbackStateCompat == null || playbackStateCompat.mPosition == -1) {
            return playbackStateCompat;
        }
        int i = playbackStateCompat.mState;
        if (i != 3 && i != 4 && i != 5) {
            return playbackStateCompat;
        }
        long j = 0;
        if (playbackStateCompat.mUpdateTime <= 0) {
            return playbackStateCompat;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = (playbackStateCompat.mSpeed * ((float) (elapsedRealtime - r7))) + playbackStateCompat.mPosition;
        if (mediaMetadataCompat != null && mediaMetadataCompat.LJLIL.containsKey("android.media.metadata.DURATION")) {
            long j3 = mediaMetadataCompat.LJLIL.getLong("android.media.metadata.DURATION", 0L);
            if (j3 >= 0 && j2 > j3) {
                j = j3;
                C007501f c007501f = new C007501f(playbackStateCompat);
                int i2 = playbackStateCompat.mState;
                float f = playbackStateCompat.mSpeed;
                c007501f.LIZIZ = i2;
                c007501f.LIZJ = j;
                c007501f.LJIIIIZZ = elapsedRealtime;
                c007501f.LJ = f;
                return c007501f.LIZ();
            }
        }
        if (j2 >= 0) {
            j = j2;
        }
        C007501f c007501f2 = new C007501f(playbackStateCompat);
        int i22 = playbackStateCompat.mState;
        float f2 = playbackStateCompat.mSpeed;
        c007501f2.LIZIZ = i22;
        c007501f2.LIZJ = j;
        c007501f2.LJIIIIZZ = elapsedRealtime;
        c007501f2.LJ = f2;
        return c007501f2.LIZ();
    }

    public final void LJFF(AbstractC007001a abstractC007001a, Handler handler) {
        if (abstractC007001a == null) {
            this.LIZ.LJFF(null, null);
            return;
        }
        AnonymousClass184 anonymousClass184 = this.LIZ;
        if (handler == null) {
            handler = new Handler();
        }
        anonymousClass184.LJFF(abstractC007001a, handler);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MediaSessionCompat(final android.content.Context r7, final java.lang.String r8, android.content.ComponentName r9, android.app.PendingIntent r10) {
        /*
            r6 = this;
            r6.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r6.LIZJ = r0
            if (r7 == 0) goto Ld7
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto Lcf
            r4 = 0
            r2 = 1
            java.lang.String r5 = "android.intent.action.MEDIA_BUTTON"
            if (r9 != 0) goto L43
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r5)
            java.lang.String r0 = r7.getPackageName()
            r1.setPackage(r0)
            android.content.pm.PackageManager r0 = r7.getPackageManager()
            java.util.List r1 = r0.queryBroadcastReceivers(r1, r4)
            int r0 = r1.size()
            if (r0 != r2) goto Lcb
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r4)
            android.content.pm.ResolveInfo r0 = (android.content.pm.ResolveInfo) r0
            android.content.ComponentName r9 = new android.content.ComponentName
            android.content.pm.ActivityInfo r0 = r0.activityInfo
            java.lang.String r1 = r0.packageName
            java.lang.String r0 = r0.name
            r9.<init>(r1, r0)
        L43:
            if (r10 != 0) goto L59
            android.content.Intent r3 = new android.content.Intent
            r3.<init>(r5)
            r3.setComponent(r9)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 31
            if (r1 < r0) goto Lc9
            r0 = 33554432(0x2000000, float:9.403955E-38)
        L55:
            android.app.PendingIntent r10 = android.app.PendingIntent.getBroadcast(r7, r4, r3, r0)
        L59:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto La9
            X.29R r0 = new X.29R
            r0.<init>(r7, r8)
            r6.LIZ = r0
        L66:
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.myLooper()
            if (r0 == 0) goto La4
            android.os.Looper r0 = android.os.Looper.myLooper()
        L72:
            r1.<init>(r0)
            X.189 r0 = new X.189
            r0.<init>()
            r6.LJFF(r0, r1)
            X.184 r0 = r6.LIZ
            android.media.session.MediaSession r0 = r0.LIZ
            r0.setMediaButtonReceiver(r10)
            android.support.v4.media.session.MediaControllerCompat r0 = new android.support.v4.media.session.MediaControllerCompat
            r0.<init>(r7, r6)
            r6.LIZIZ = r0
            int r0 = android.support.v4.media.session.MediaSessionCompat.LIZLLL
            if (r0 != 0) goto La3
            android.content.res.Resources r0 = r7.getResources()
            android.util.DisplayMetrics r1 = r0.getDisplayMetrics()
            r0 = 1134559232(0x43a00000, float:320.0)
            float r1 = android.util.TypedValue.applyDimension(r2, r0, r1)
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            int r0 = (int) r1
            android.support.v4.media.session.MediaSessionCompat.LIZLLL = r0
        La3:
            return
        La4:
            android.os.Looper r0 = X.C16880lQ.LLJJJJ()
            goto L72
        La9:
            r0 = 28
            if (r1 < r0) goto Lb5
            X.1pv r0 = new X.1pv
            r0.<init>(r7, r8)
            r6.LIZ = r0
            goto L66
        Lb5:
            r0 = 22
            if (r1 < r0) goto Lc1
            X.1hB r0 = new X.1hB
            r0.<init>(r7, r8)
            r6.LIZ = r0
            goto L66
        Lc1:
            X.184 r0 = new X.184
            r0.<init>(r7, r8)
            r6.LIZ = r0
            goto L66
        Lc9:
            r0 = 0
            goto L55
        Lcb:
            r1.size()
            goto L59
        Lcf:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "tag must not be null or empty"
            r1.<init>(r0)
            throw r1
        Ld7:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "context must not be null"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaSessionCompat.<init>(android.content.Context, java.lang.String, android.content.ComponentName, android.app.PendingIntent):void");
    }
}
