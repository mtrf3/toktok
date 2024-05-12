package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.aweme.creation.base.AddYoursModel;
import com.ss.ugc.aweme.creation.base.BasicModel;
import com.ss.ugc.aweme.creation.base.ChallengeModel;
import com.ss.ugc.aweme.creation.base.ImportModel;
import com.ss.ugc.aweme.creation.base.MentionModel;
import com.ss.ugc.aweme.creation.base.MusicModel;
import com.ss.ugc.aweme.creation.base.TrackModel;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class HID implements Parcelable.Creator<BasicModel> {
    @Override // android.os.Parcelable.Creator
    public final BasicModel createFromParcel(Parcel in) {
        Boolean bool;
        boolean z;
        o.LJIIIZ(in, "in");
        EnumC35446Dve enumC35446Dve = (EnumC35446Dve) V0N.LJJJ(EnumC35446Dve.class, in.readString());
        ImportModel importModel = (ImportModel) in.readParcelable(BasicModel.class.getClassLoader());
        ChallengeModel challengeModel = (ChallengeModel) in.readParcelable(BasicModel.class.getClassLoader());
        MentionModel mentionModel = (MentionModel) in.readParcelable(BasicModel.class.getClassLoader());
        int readInt = in.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        while (readInt != 0) {
            arrayList.add(in.readParcelable(BasicModel.class.getClassLoader()));
            readInt--;
        }
        TrackModel trackModel = (TrackModel) in.readParcelable(BasicModel.class.getClassLoader());
        MusicModel musicModel = (MusicModel) in.readParcelable(BasicModel.class.getClassLoader());
        AddYoursModel addYoursModel = (AddYoursModel) in.readParcelable(BasicModel.class.getClassLoader());
        String readString = in.readString();
        if (in.readInt() != 0) {
            if (in.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            bool = Boolean.valueOf(z);
        } else {
            bool = null;
        }
        return new BasicModel(enumC35446Dve, importModel, challengeModel, mentionModel, arrayList, trackModel, musicModel, addYoursModel, readString, bool, in.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final BasicModel[] newArray(int i) {
        return new BasicModel[i];
    }
}
