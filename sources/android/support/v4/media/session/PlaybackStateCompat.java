package android.support.v4.media.session;

import X.C007301d;
import X.C007401e;
import X.X1D;
import Y.IDCreatorS45S0000000;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final long ACTION_SET_SHUFFLE_MODE_ENABLED = 524288;
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new IDCreatorS45S0000000(9);
    public final long mActions;
    public final long mActiveItemId;
    public final long mBufferedPosition;
    public List<CustomAction> mCustomActions;
    public final int mErrorCode;
    public final CharSequence mErrorMessage;
    public final Bundle mExtras;
    public final long mPosition;
    public final float mSpeed;
    public final int mState;
    public PlaybackState mStateFwk;
    public final long mUpdateTime;

    /* loaded from: classes.dex */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new IDCreatorS45S0000000(8);
        public final String mAction;
        public PlaybackState.CustomAction mCustomActionFwk;
        public final Bundle mExtras;
        public final int mIcon;
        public final CharSequence mName;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final Object LIZIZ() {
            PlaybackState.CustomAction customAction = this.mCustomActionFwk;
            if (customAction == null) {
                PlaybackState.CustomAction.Builder LJ = C007301d.LJ(this.mAction, this.mName, this.mIcon);
                C007301d.LJIL(LJ, this.mExtras);
                return C007301d.LIZIZ(LJ);
            }
            return customAction;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Action:mName='");
            LIZ.append((Object) this.mName);
            LIZ.append(", mIcon=");
            LIZ.append(this.mIcon);
            LIZ.append(", mExtras=");
            LIZ.append(this.mExtras);
            return X1D.LIZIZ(LIZ);
        }

        public CustomAction(Parcel parcel) {
            this.mAction = parcel.readString();
            this.mName = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.mIcon = parcel.readInt();
            this.mExtras = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        public static CustomAction LIZ(Object obj) {
            if (obj != null) {
                PlaybackState.CustomAction customAction = (PlaybackState.CustomAction) obj;
                Bundle LJIIJJI = C007301d.LJIIJJI(customAction);
                MediaSessionCompat.LIZ(LJIIJJI);
                CustomAction customAction2 = new CustomAction(C007301d.LJFF(customAction), C007301d.LJIILJJIL(customAction), C007301d.LJIIL(customAction), LJIIJJI);
                customAction2.mCustomActionFwk = customAction;
                return customAction2;
            }
            return null;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.mAction);
            TextUtils.writeToParcel(this.mName, parcel, i);
            parcel.writeInt(this.mIcon);
            parcel.writeBundle(this.mExtras);
        }

        public CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.mAction = str;
            this.mName = charSequence;
            this.mIcon = i;
            this.mExtras = bundle;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Object LIZIZ() {
        if (this.mStateFwk == null) {
            PlaybackState.Builder LIZLLL = C007301d.LIZLLL();
            C007301d.LJJ(LIZLLL, this.mState, this.mPosition, this.mSpeed, this.mUpdateTime);
            C007301d.LJIJJ(LIZLLL, this.mBufferedPosition);
            C007301d.LJIJ(LIZLLL, this.mActions);
            C007301d.LJIJJLI(LIZLLL, this.mErrorMessage);
            Iterator<CustomAction> it = this.mCustomActions.iterator();
            while (it.hasNext()) {
                C007301d.LIZ(LIZLLL, (PlaybackState.CustomAction) it.next().LIZIZ());
            }
            C007301d.LJIJI(LIZLLL, this.mActiveItemId);
            if (Build.VERSION.SDK_INT >= 22) {
                C007401e.LIZIZ(LIZLLL, this.mExtras);
            }
            this.mStateFwk = C007301d.LIZJ(LIZLLL);
        }
        return this.mStateFwk;
    }

    public final String toString() {
        return "PlaybackState {state=" + this.mState + ", position=" + this.mPosition + ", buffered position=" + this.mBufferedPosition + ", speed=" + this.mSpeed + ", updated=" + this.mUpdateTime + ", actions=" + this.mActions + ", error code=" + this.mErrorCode + ", error message=" + this.mErrorMessage + ", custom actions=" + this.mCustomActions + ", active item id=" + this.mActiveItemId + "}";
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.mState = parcel.readInt();
        this.mPosition = parcel.readLong();
        this.mSpeed = parcel.readFloat();
        this.mUpdateTime = parcel.readLong();
        this.mBufferedPosition = parcel.readLong();
        this.mActions = parcel.readLong();
        this.mErrorMessage = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.mCustomActions = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.mActiveItemId = parcel.readLong();
        this.mExtras = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.mErrorCode = parcel.readInt();
    }

    public static PlaybackStateCompat LIZ(Object obj) {
        ArrayList arrayList;
        Bundle bundle = null;
        if (obj == null) {
            return null;
        }
        PlaybackState playbackState = (PlaybackState) obj;
        List<PlaybackState.CustomAction> LJIIIZ = C007301d.LJIIIZ(playbackState);
        if (LJIIIZ != null) {
            arrayList = new ArrayList(LJIIIZ.size());
            Iterator<PlaybackState.CustomAction> it = LJIIIZ.iterator();
            while (it.hasNext()) {
                arrayList.add(CustomAction.LIZ(it.next()));
            }
        } else {
            arrayList = null;
        }
        if (Build.VERSION.SDK_INT >= 22) {
            bundle = C007401e.LIZ(playbackState);
            MediaSessionCompat.LIZ(bundle);
        }
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(C007301d.LJIIZILJ(playbackState), C007301d.LJIILLIIL(playbackState), C007301d.LJIIIIZZ(playbackState), C007301d.LJIILL(playbackState), C007301d.LJI(playbackState), 0, C007301d.LJIIJ(playbackState), C007301d.LJIILIIL(playbackState), arrayList, C007301d.LJII(playbackState), bundle);
        playbackStateCompat.mStateFwk = playbackState;
        return playbackStateCompat;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mState);
        parcel.writeLong(this.mPosition);
        parcel.writeFloat(this.mSpeed);
        parcel.writeLong(this.mUpdateTime);
        parcel.writeLong(this.mBufferedPosition);
        parcel.writeLong(this.mActions);
        TextUtils.writeToParcel(this.mErrorMessage, parcel, i);
        parcel.writeTypedList(this.mCustomActions);
        parcel.writeLong(this.mActiveItemId);
        parcel.writeBundle(this.mExtras);
        parcel.writeInt(this.mErrorCode);
    }

    public PlaybackStateCompat(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, List<CustomAction> list, long j5, Bundle bundle) {
        this.mState = i;
        this.mPosition = j;
        this.mBufferedPosition = j2;
        this.mSpeed = f;
        this.mActions = j3;
        this.mErrorCode = i2;
        this.mErrorMessage = charSequence;
        this.mUpdateTime = j4;
        this.mCustomActions = new ArrayList(list);
        this.mActiveItemId = j5;
        this.mExtras = bundle;
    }
}
