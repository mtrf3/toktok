package com.ss.ugc.aweme.creation.base;

import X.EnumC35446Dve;
import X.HID;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class BasicModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<BasicModel> CREATOR = new HID();

    @InterfaceC65349Pkn("addyours")
    public AddYoursModel addyours;

    @InterfaceC65349Pkn("anchors")
    public List<AnchorModel> anchors;

    @InterfaceC65349Pkn("challenge")
    public ChallengeModel challenge;

    @InterfaceC65349Pkn("compose_type")
    public EnumC35446Dve composeType;

    @InterfaceC65349Pkn("creation_id")
    public String creationId;

    @InterfaceC65349Pkn("disable_draft")
    public Boolean disableDraft;

    /* renamed from: import, reason: not valid java name */
    @InterfaceC65349Pkn("import")
    public ImportModel f34import;

    @InterfaceC65349Pkn("mention")
    public MentionModel mention;

    @InterfaceC65349Pkn("music")
    public MusicModel music;

    @InterfaceC65349Pkn("publish_title")
    public String publishTitle;

    @InterfaceC65349Pkn("track")
    public TrackModel track;

    /* JADX WARN: Multi-variable type inference failed */
    public BasicModel() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 2047, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        o.LJIIIZ(parcel, "parcel");
        parcel.writeString(this.composeType.name());
        parcel.writeParcelable(this.f34import, i);
        parcel.writeParcelable(this.challenge, i);
        parcel.writeParcelable(this.mention, i);
        List<AnchorModel> list = this.anchors;
        parcel.writeInt(list.size());
        Iterator<AnchorModel> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), i);
        }
        parcel.writeParcelable(this.track, i);
        parcel.writeParcelable(this.music, i);
        parcel.writeParcelable(this.addyours, i);
        parcel.writeString(this.publishTitle);
        Boolean bool = this.disableDraft;
        if (bool != null) {
            parcel.writeInt(1);
            i2 = bool.booleanValue();
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
        parcel.writeString(this.creationId);
    }

    public final AddYoursModel getAddyours() {
        return this.addyours;
    }

    public final List<AnchorModel> getAnchors() {
        return this.anchors;
    }

    public final ChallengeModel getChallenge() {
        return this.challenge;
    }

    public final EnumC35446Dve getComposeType() {
        return this.composeType;
    }

    public final String getCreationId() {
        return this.creationId;
    }

    public final Boolean getDisableDraft() {
        return this.disableDraft;
    }

    public final ImportModel getImport() {
        return this.f34import;
    }

    public final MentionModel getMention() {
        return this.mention;
    }

    public final MusicModel getMusic() {
        return this.music;
    }

    public final String getPublishTitle() {
        return this.publishTitle;
    }

    public final TrackModel getTrack() {
        return this.track;
    }

    public final void setAddyours(AddYoursModel addYoursModel) {
        this.addyours = addYoursModel;
    }

    public final void setAnchors(List<AnchorModel> list) {
        o.LJIIIZ(list, "<set-?>");
        this.anchors = list;
    }

    public final void setChallenge(ChallengeModel challengeModel) {
        this.challenge = challengeModel;
    }

    public final void setComposeType(EnumC35446Dve enumC35446Dve) {
        o.LJIIIZ(enumC35446Dve, "<set-?>");
        this.composeType = enumC35446Dve;
    }

    public final void setCreationId(String str) {
        this.creationId = str;
    }

    public final void setDisableDraft(Boolean bool) {
        this.disableDraft = bool;
    }

    public final void setImport(ImportModel importModel) {
        this.f34import = importModel;
    }

    public final void setMention(MentionModel mentionModel) {
        this.mention = mentionModel;
    }

    public final void setMusic(MusicModel musicModel) {
        this.music = musicModel;
    }

    public final void setPublishTitle(String str) {
        this.publishTitle = str;
    }

    public final void setTrack(TrackModel trackModel) {
        this.track = trackModel;
    }

    public BasicModel(EnumC35446Dve composeType, ImportModel importModel, ChallengeModel challengeModel, MentionModel mentionModel, List<AnchorModel> anchors, TrackModel trackModel, MusicModel musicModel, AddYoursModel addYoursModel, String str, Boolean bool, String str2) {
        o.LJIIIZ(composeType, "composeType");
        o.LJIIIZ(anchors, "anchors");
        this.composeType = composeType;
        this.f34import = importModel;
        this.challenge = challengeModel;
        this.mention = mentionModel;
        this.anchors = anchors;
        this.track = trackModel;
        this.music = musicModel;
        this.addyours = addYoursModel;
        this.publishTitle = str;
        this.disableDraft = bool;
        this.creationId = str2;
    }

    public /* synthetic */ BasicModel(EnumC35446Dve enumC35446Dve, ImportModel importModel, ChallengeModel challengeModel, MentionModel mentionModel, List list, TrackModel trackModel, MusicModel musicModel, AddYoursModel addYoursModel, String str, Boolean bool, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? EnumC35446Dve.ComposeType_Default : enumC35446Dve, (i & 2) != 0 ? null : importModel, (i & 4) != 0 ? null : challengeModel, (i & 8) != 0 ? null : mentionModel, (i & 16) != 0 ? new ArrayList() : list, (i & 32) != 0 ? null : trackModel, (i & 64) != 0 ? null : musicModel, (i & 128) != 0 ? null : addYoursModel, (i & 256) != 0 ? null : str, (i & 512) != 0 ? null : bool, (i & 1024) == 0 ? str2 : null);
    }
}
