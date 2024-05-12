package Y;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.comment.preload.CommentPreloadRequest;
import com.ss.android.ugc.aweme.comment.widgets.CommentEditText$MentionSpan;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.views.mention.MentionEditText$MentionSpan;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class IDCreatorS48S0000000_3 implements Parcelable.Creator {
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
            default:
                return new Object[0];
        }
    }

    public IDCreatorS48S0000000_3(int i) {
        this.$t = i;
    }

    public static final Object createFromParcel$0(IDCreatorS48S0000000_3 iDCreatorS48S0000000_3, Parcel parcel) {
        return new CommentPreloadRequest(parcel);
    }

    public static final Object createFromParcel$1(IDCreatorS48S0000000_3 iDCreatorS48S0000000_3, Parcel source) {
        o.LJIIIZ(source, "source");
        return new CommentEditText$MentionSpan(source);
    }

    public static final Object createFromParcel$2(IDCreatorS48S0000000_3 iDCreatorS48S0000000_3, Parcel parcel) {
        return new TextExtraStruct(parcel);
    }

    public static final Object createFromParcel$3(IDCreatorS48S0000000_3 iDCreatorS48S0000000_3, Parcel parcel) {
        return new MentionEditText$MentionSpan(parcel);
    }

    public static final Object[] newArray$0(IDCreatorS48S0000000_3 iDCreatorS48S0000000_3, int i) {
        return new CommentPreloadRequest[i];
    }

    public static final Object[] newArray$1(IDCreatorS48S0000000_3 iDCreatorS48S0000000_3, int i) {
        return new CommentEditText$MentionSpan[i];
    }

    public static final Object[] newArray$2(IDCreatorS48S0000000_3 iDCreatorS48S0000000_3, int i) {
        return new TextExtraStruct[i];
    }

    public static final Object[] newArray$3(IDCreatorS48S0000000_3 iDCreatorS48S0000000_3, int i) {
        return new MentionEditText$MentionSpan[i];
    }
}
