package Y;

import X.JBR;
import X.X1D;
import Y.IDCreatorS45S0000000;
import android.media.MediaDescription;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.os.ResultReceiver;
import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.AppCompatSpinner$SavedState;
import androidx.compose.foundation.lazy.layout.DefaultLazyKey;
import androidx.core.widget.NestedScrollView$SavedState;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableByte;
import androidx.databinding.ObservableChar;
import androidx.databinding.ObservableDouble;
import androidx.databinding.ObservableFloat;
import androidx.databinding.ObservableInt;
import androidx.databinding.ObservableLong;
import androidx.databinding.ObservableParcelable;
import androidx.databinding.ObservableShort;
import androidx.fragment.app.BackStackState;
import androidx.fragment.app.FragmentManagerState;
import androidx.fragment.app.FragmentState;
import androidx.fragment.app.FragmentTabHost$SavedState;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.versionedparcelable.ParcelImpl;
import bytedance.io.BdMediaFolder;
import bytedance.io.BdMediaItem;
import com.airbnb.lottie.LottieAnimationView$SavedState;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.RoomStatus;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.effect.sticker.list.SpannedGridLayoutManager;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public class IDCreatorS45S0000000 implements Parcelable.Creator {
    public final int $t;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.$t) {
            case 0:
                return createFromParcel$0(this, parcel);
            case 1:
                return createFromParcel$1(this, parcel);
            case 2:
                return createFromParcel$2(this, parcel);
            case 3:
                return createFromParcel$3(this, parcel);
            case 4:
                return createFromParcel$4(this, parcel);
            case 5:
                return createFromParcel$5(this, parcel);
            case 6:
                return createFromParcel$6(this, parcel);
            case 7:
                return createFromParcel$7(this, parcel);
            case 8:
                return createFromParcel$8(this, parcel);
            case 9:
                return createFromParcel$9(this, parcel);
            case 10:
                return createFromParcel$10(this, parcel);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return createFromParcel$11(this, parcel);
            case 12:
                return createFromParcel$12(this, parcel);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return createFromParcel$13(this, parcel);
            case 14:
                return createFromParcel$14(this, parcel);
            case 15:
                return createFromParcel$15(this, parcel);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return createFromParcel$16(this, parcel);
            case 17:
                return createFromParcel$17(this, parcel);
            case 18:
                return createFromParcel$18(this, parcel);
            case 19:
                return createFromParcel$19(this, parcel);
            case 20:
                return createFromParcel$20(this, parcel);
            case 21:
                return createFromParcel$21(this, parcel);
            case 22:
                return createFromParcel$22(this, parcel);
            case 23:
                return createFromParcel$23(this, parcel);
            case 24:
                return createFromParcel$24(this, parcel);
            case 25:
                return createFromParcel$25(this, parcel);
            case 26:
                return createFromParcel$26(this, parcel);
            case 27:
                return createFromParcel$27(this, parcel);
            case 28:
                return createFromParcel$28(this, parcel);
            case 29:
                return createFromParcel$29(this, parcel);
            case 30:
                return createFromParcel$30(this, parcel);
            case 31:
                return createFromParcel$31(this, parcel);
            case 32:
                return createFromParcel$32(this, parcel);
            case 33:
                return createFromParcel$33(this, parcel);
            case 34:
                return createFromParcel$34(this, parcel);
            case 35:
                return createFromParcel$35(this, parcel);
            case 36:
                return createFromParcel$36(this, parcel);
            case 37:
                return createFromParcel$37(this, parcel);
            case 38:
                return createFromParcel$38(this, parcel);
            case 39:
                return createFromParcel$39(this, parcel);
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                return createFromParcel$40(this, parcel);
            case 41:
                return createFromParcel$41(this, parcel);
            case 42:
                return createFromParcel$42(this, parcel);
            default:
                return null;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.$t) {
            case 0:
                return newArray$0(this, i);
            case 1:
                return newArray$1(this, i);
            case 2:
                return newArray$2(this, i);
            case 3:
                return newArray$3(this, i);
            case 4:
                return newArray$4(this, i);
            case 5:
                return newArray$5(this, i);
            case 6:
                return newArray$6(this, i);
            case 7:
                return newArray$7(this, i);
            case 8:
                return newArray$8(this, i);
            case 9:
                return newArray$9(this, i);
            case 10:
                return newArray$10(this, i);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return newArray$11(this, i);
            case 12:
                return newArray$12(this, i);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return newArray$13(this, i);
            case 14:
                return newArray$14(this, i);
            case 15:
                return newArray$15(this, i);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return newArray$16(this, i);
            case 17:
                return newArray$17(this, i);
            case 18:
                return newArray$18(this, i);
            case 19:
                return newArray$19(this, i);
            case 20:
                return newArray$20(this, i);
            case 21:
                return newArray$21(this, i);
            case 22:
                return newArray$22(this, i);
            case 23:
                return newArray$23(this, i);
            case 24:
                return newArray$24(this, i);
            case 25:
                return newArray$25(this, i);
            case 26:
                return newArray$26(this, i);
            case 27:
                return newArray$27(this, i);
            case 28:
                return newArray$28(this, i);
            case 29:
                return newArray$29(this, i);
            case 30:
                return newArray$30(this, i);
            case 31:
                return newArray$31(this, i);
            case 32:
                return newArray$32(this, i);
            case 33:
                return newArray$33(this, i);
            case 34:
                return newArray$34(this, i);
            case 35:
                return newArray$35(this, i);
            case 36:
                return newArray$36(this, i);
            case 37:
                return newArray$37(this, i);
            case 38:
                return newArray$38(this, i);
            case 39:
                return newArray$39(this, i);
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                return newArray$40(this, i);
            case 41:
                return newArray$41(this, i);
            case 42:
                return newArray$42(this, i);
            default:
                return new Object[0];
        }
    }

    public IDCreatorS45S0000000(int i) {
        this.$t = i;
    }

    public static final Object createFromParcel$0(IDCreatorS45S0000000 iDCreatorS45S0000000, Parcel parcel) {
        return new MediaBrowserCompat.MediaItem(parcel);
    }

    public static final Object createFromParcel$1(IDCreatorS45S0000000 iDCreatorS45S0000000, Parcel parcel) {
        return MediaDescriptionCompat.LIZ(MediaDescription.CREATOR.createFromParcel(parcel));
    }

    public static final Object createFromParcel$10(IDCreatorS45S0000000 iDCreatorS45S0000000, Parcel parcel) {
        return new ResultReceiver(parcel);
    }

    public static final Object createFromParcel$11(IDCreatorS45S0000000 iDCreatorS45S0000000, Parcel parcel) {
        return new ActivityResult(parcel);
    }

    public static final Object createFromParcel$12(IDCreatorS45S0000000 iDCreatorS45S0000000, Parcel parcel) {
        return new IntentSenderRequest(parcel);
    }

    public static final Object createFromParcel$13(IDCreatorS45S0000000 iDCreatorS45S0000000, Parcel parcel) {
        return new ActionMenuPresenter.SavedState(parcel);
    }

    public static final Object createFromParcel$14(IDCreatorS45S0000000 iDCreatorS45S0000000, Parcel parcel) {
        return new AppCompatSpinner$SavedState(parcel);
    }

    public static final Object createFromParcel$15(IDCreatorS45S0000000 iDCreatorS45S0000000, Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new DefaultLazyKey(parcel.readInt());
    }

    public static final Object createFromParcel$16(IDCreatorS45S0000000 iDCreatorS45S0000000, Parcel parcel) {
        return new NestedScrollView$SavedState(parcel);
    }

    public static final Object createFromParcel$17(IDCreatorS45S0000000 iDCreatorS45S0000000, Parcel parcel) {
        boolean z = true;
        if (parcel.readInt() != 1) {
            z = false;
        }
        return new ObservableBoolean(z);
    }

    public static final Object createFromParcel$18(IDCreatorS45S0000000 iDCreatorS45S0000000, Parcel parcel) {
        return new ObservableByte(parcel.readByte());
    }

    public static final Object createFromParcel$19(IDCreatorS45S0000000 iDCreatorS45S0000000, Parcel parcel) {
        return new ObservableChar((char) parcel.readInt());
    }

    public static final Object createFromParcel$2(IDCreatorS45S0000000 iDCreatorS45S0000000, Parcel parcel) {
        return new MediaMetadataCompat(parcel);
    }

    public static final Object createFromParcel$20(IDCreatorS45S0000000 iDCreatorS45S0000000, Parcel parcel) {
        return new ObservableDouble(parcel.readDouble());
    }

    public static final Object createFromParcel$21(IDCreatorS45S0000000 iDCreatorS45S0000000, Parcel parcel) {
        return new ObservableFloat(parcel.readFloat());
    }

    public static final Object createFromParcel$22(IDCreatorS45S0000000 iDCreatorS45S0000000, Parcel parcel) {
        return new ObservableInt(parcel.readInt());
    }

    public static final Object createFromParcel$23(IDCreatorS45S0000000 iDCreatorS45S0000000, Parcel parcel) {
        return new ObservableLong(parcel.readLong());
    }

    public static final Object createFromParcel$24(IDCreatorS45S0000000 iDCreatorS45S0000000, Parcel parcel) {
        return new ObservableParcelable(parcel.readParcelable(IDCreatorS45S0000000.class.getClassLoader()));
    }

    public static final Object createFromParcel$25(IDCreatorS45S0000000 iDCreatorS45S0000000, Parcel parcel) {
        return new ObservableShort((short) parcel.readInt());
    }

    public static final Object createFromParcel$26(IDCreatorS45S0000000 iDCreatorS45S0000000, Parcel parcel) {
        return new BackStackState(parcel);
    }

    public static final Object createFromParcel$27(IDCreatorS45S0000000 iDCreatorS45S0000000, Parcel parcel) {
        return new FragmentManagerState(parcel);
    }

    public static final Object createFromParcel$28(IDCreatorS45S0000000 iDCreatorS45S0000000, Parcel parcel) {
        return new FragmentState(parcel);
    }

    public static final Object createFromParcel$29(IDCreatorS45S0000000 iDCreatorS45S0000000, final Parcel parcel) {
        return new View.BaseSavedState(parcel) { // from class: androidx.fragment.app.FragmentTabHost$SavedState
            public static final Parcelable.Creator<FragmentTabHost$SavedState> CREATOR = new IDCreatorS45S0000000(29);
            public final String LJLIL;

            public final String toString() {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("FragmentTabHost.SavedState{");
                LIZ.append(Integer.toHexString(System.identityHashCode(this)));
                LIZ.append(" curTab=");
                return JBR.LJFF(LIZ, this.LJLIL, "}", LIZ);
            }

            {
                super(parcel);
                this.LJLIL = parcel.readString();
            }

            @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
            public final void writeToParcel(Parcel parcel2, int i) {
                super.writeToParcel(parcel2, i);
                parcel2.writeString(this.LJLIL);
            }
        };
    }

    public static final Object createFromParcel$3(IDCreatorS45S0000000 iDCreatorS45S0000000, Parcel parcel) {
        return new RatingCompat(parcel.readInt(), parcel.readFloat());
    }

    public static final Object createFromParcel$30(IDCreatorS45S0000000 iDCreatorS45S0000000, Parcel parcel) {
        return new LinearLayoutManager.SavedState(parcel);
    }

    public static final Object createFromParcel$31(IDCreatorS45S0000000 iDCreatorS45S0000000, Parcel parcel) {
        return new StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem(parcel);
    }

    public static final Object createFromParcel$32(IDCreatorS45S0000000 iDCreatorS45S0000000, Parcel parcel) {
        return new StaggeredGridLayoutManager.SavedState(parcel);
    }

    public static final Object createFromParcel$33(IDCreatorS45S0000000 iDCreatorS45S0000000, Parcel parcel) {
        return new ParcelImpl(parcel);
    }

    public static final Object createFromParcel$34(IDCreatorS45S0000000 iDCreatorS45S0000000, Parcel parcel) {
        return new BdMediaFolder(parcel);
    }

    public static final Object createFromParcel$35(IDCreatorS45S0000000 iDCreatorS45S0000000, Parcel parcel) {
        return new BdMediaItem(parcel);
    }

    public static final Object createFromParcel$36(IDCreatorS45S0000000 iDCreatorS45S0000000, Parcel parcel) {
        return new LottieAnimationView$SavedState(parcel);
    }

    public static final Object createFromParcel$37(IDCreatorS45S0000000 iDCreatorS45S0000000, Parcel parcel) {
        return new ImageModel.Content(parcel);
    }

    public static final Object createFromParcel$38(IDCreatorS45S0000000 iDCreatorS45S0000000, Parcel parcel) {
        return new ImageModel(parcel);
    }

    public static final Object createFromParcel$39(IDCreatorS45S0000000 iDCreatorS45S0000000, Parcel parcel) {
        return new RoomStatus(parcel);
    }

    public static final Object createFromParcel$4(IDCreatorS45S0000000 iDCreatorS45S0000000, Parcel parcel) {
        return new MediaSessionCompat.QueueItem(parcel);
    }

    public static final Object createFromParcel$40(IDCreatorS45S0000000 iDCreatorS45S0000000, Parcel parcel) {
        return new EmoteModel(parcel);
    }

    public static final Object createFromParcel$41(IDCreatorS45S0000000 iDCreatorS45S0000000, Parcel parcel) {
        return new SheetOptions(parcel);
    }

    public static final Object createFromParcel$42(IDCreatorS45S0000000 iDCreatorS45S0000000, Parcel source) {
        o.LJIIIZ(source, "source");
        return new SpannedGridLayoutManager.SavedState(source.readInt());
    }

    public static final Object createFromParcel$5(IDCreatorS45S0000000 iDCreatorS45S0000000, Parcel parcel) {
        return new MediaSessionCompat.ResultReceiverWrapper(parcel);
    }

    public static final Object createFromParcel$6(IDCreatorS45S0000000 iDCreatorS45S0000000, Parcel parcel) {
        return new MediaSessionCompat.Token(parcel.readParcelable(null), null);
    }

    public static final Object createFromParcel$7(IDCreatorS45S0000000 iDCreatorS45S0000000, Parcel parcel) {
        return new ParcelableVolumeInfo(parcel);
    }

    public static final Object createFromParcel$8(IDCreatorS45S0000000 iDCreatorS45S0000000, Parcel parcel) {
        return new PlaybackStateCompat.CustomAction(parcel);
    }

    public static final Object createFromParcel$9(IDCreatorS45S0000000 iDCreatorS45S0000000, Parcel parcel) {
        return new PlaybackStateCompat(parcel);
    }

    public static final Object[] newArray$0(IDCreatorS45S0000000 iDCreatorS45S0000000, int i) {
        return new MediaBrowserCompat.MediaItem[i];
    }

    public static final Object[] newArray$1(IDCreatorS45S0000000 iDCreatorS45S0000000, int i) {
        return new MediaDescriptionCompat[i];
    }

    public static final Object[] newArray$10(IDCreatorS45S0000000 iDCreatorS45S0000000, int i) {
        return new ResultReceiver[i];
    }

    public static final Object[] newArray$11(IDCreatorS45S0000000 iDCreatorS45S0000000, int i) {
        return new ActivityResult[i];
    }

    public static final Object[] newArray$12(IDCreatorS45S0000000 iDCreatorS45S0000000, int i) {
        return new IntentSenderRequest[i];
    }

    public static final Object[] newArray$13(IDCreatorS45S0000000 iDCreatorS45S0000000, int i) {
        return new ActionMenuPresenter.SavedState[i];
    }

    public static final Object[] newArray$14(IDCreatorS45S0000000 iDCreatorS45S0000000, int i) {
        return new AppCompatSpinner$SavedState[i];
    }

    public static final Object[] newArray$15(IDCreatorS45S0000000 iDCreatorS45S0000000, int i) {
        return new DefaultLazyKey[i];
    }

    public static final Object[] newArray$16(IDCreatorS45S0000000 iDCreatorS45S0000000, int i) {
        return new NestedScrollView$SavedState[i];
    }

    public static final Object[] newArray$17(IDCreatorS45S0000000 iDCreatorS45S0000000, int i) {
        return new ObservableBoolean[i];
    }

    public static final Object[] newArray$18(IDCreatorS45S0000000 iDCreatorS45S0000000, int i) {
        return new ObservableByte[i];
    }

    public static final Object[] newArray$19(IDCreatorS45S0000000 iDCreatorS45S0000000, int i) {
        return new ObservableChar[i];
    }

    public static final Object[] newArray$2(IDCreatorS45S0000000 iDCreatorS45S0000000, int i) {
        return new MediaMetadataCompat[i];
    }

    public static final Object[] newArray$20(IDCreatorS45S0000000 iDCreatorS45S0000000, int i) {
        return new ObservableDouble[i];
    }

    public static final Object[] newArray$21(IDCreatorS45S0000000 iDCreatorS45S0000000, int i) {
        return new ObservableFloat[i];
    }

    public static final Object[] newArray$22(IDCreatorS45S0000000 iDCreatorS45S0000000, int i) {
        return new ObservableInt[i];
    }

    public static final Object[] newArray$23(IDCreatorS45S0000000 iDCreatorS45S0000000, int i) {
        return new ObservableLong[i];
    }

    public static final Object[] newArray$24(IDCreatorS45S0000000 iDCreatorS45S0000000, int i) {
        return new ObservableParcelable[i];
    }

    public static final Object[] newArray$25(IDCreatorS45S0000000 iDCreatorS45S0000000, int i) {
        return new ObservableShort[i];
    }

    public static final Object[] newArray$26(IDCreatorS45S0000000 iDCreatorS45S0000000, int i) {
        return new BackStackState[i];
    }

    public static final Object[] newArray$27(IDCreatorS45S0000000 iDCreatorS45S0000000, int i) {
        return new FragmentManagerState[i];
    }

    public static final Object[] newArray$28(IDCreatorS45S0000000 iDCreatorS45S0000000, int i) {
        return new FragmentState[i];
    }

    public static final Object[] newArray$29(IDCreatorS45S0000000 iDCreatorS45S0000000, int i) {
        return new FragmentTabHost$SavedState[i];
    }

    public static final Object[] newArray$3(IDCreatorS45S0000000 iDCreatorS45S0000000, int i) {
        return new RatingCompat[i];
    }

    public static final Object[] newArray$30(IDCreatorS45S0000000 iDCreatorS45S0000000, int i) {
        return new LinearLayoutManager.SavedState[i];
    }

    public static final Object[] newArray$31(IDCreatorS45S0000000 iDCreatorS45S0000000, int i) {
        return new StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem[i];
    }

    public static final Object[] newArray$32(IDCreatorS45S0000000 iDCreatorS45S0000000, int i) {
        return new StaggeredGridLayoutManager.SavedState[i];
    }

    public static final Object[] newArray$33(IDCreatorS45S0000000 iDCreatorS45S0000000, int i) {
        return new ParcelImpl[i];
    }

    public static final Object[] newArray$34(IDCreatorS45S0000000 iDCreatorS45S0000000, int i) {
        return new BdMediaFolder[i];
    }

    public static final Object[] newArray$35(IDCreatorS45S0000000 iDCreatorS45S0000000, int i) {
        return new BdMediaItem[i];
    }

    public static final Object[] newArray$36(IDCreatorS45S0000000 iDCreatorS45S0000000, int i) {
        return new LottieAnimationView$SavedState[i];
    }

    public static final Object[] newArray$37(IDCreatorS45S0000000 iDCreatorS45S0000000, int i) {
        return new ImageModel.Content[i];
    }

    public static final Object[] newArray$38(IDCreatorS45S0000000 iDCreatorS45S0000000, int i) {
        return new ImageModel[i];
    }

    public static final Object[] newArray$39(IDCreatorS45S0000000 iDCreatorS45S0000000, int i) {
        return new RoomStatus[i];
    }

    public static final Object[] newArray$4(IDCreatorS45S0000000 iDCreatorS45S0000000, int i) {
        return new MediaSessionCompat.QueueItem[i];
    }

    public static final Object[] newArray$40(IDCreatorS45S0000000 iDCreatorS45S0000000, int i) {
        return new EmoteModel[i];
    }

    public static final Object[] newArray$41(IDCreatorS45S0000000 iDCreatorS45S0000000, int i) {
        return new SheetOptions[i];
    }

    public static final Object[] newArray$42(IDCreatorS45S0000000 iDCreatorS45S0000000, int i) {
        return new SpannedGridLayoutManager.SavedState[i];
    }

    public static final Object[] newArray$5(IDCreatorS45S0000000 iDCreatorS45S0000000, int i) {
        return new MediaSessionCompat.ResultReceiverWrapper[i];
    }

    public static final Object[] newArray$6(IDCreatorS45S0000000 iDCreatorS45S0000000, int i) {
        return new MediaSessionCompat.Token[i];
    }

    public static final Object[] newArray$7(IDCreatorS45S0000000 iDCreatorS45S0000000, int i) {
        return new ParcelableVolumeInfo[i];
    }

    public static final Object[] newArray$8(IDCreatorS45S0000000 iDCreatorS45S0000000, int i) {
        return new PlaybackStateCompat.CustomAction[i];
    }

    public static final Object[] newArray$9(IDCreatorS45S0000000 iDCreatorS45S0000000, int i) {
        return new PlaybackStateCompat[i];
    }
}
