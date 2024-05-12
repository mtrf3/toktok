package com.ss.android.ugc.aweme.image.model;

import X.C00F;
import X.C61878OQg;
import X.F9E;
import X.InterfaceC65349Pkn;
import X.UC7;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.image.model.ImageStickerInfoNewEngine;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.hashtag.embed.EmbedHashTagStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.hashtag.global.GlobalHashTagStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.hashtag.single.SingleHashTagStickerModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class ImageStickerInfoNewEngine extends F9E implements Serializable, Parcelable {
    public static final Parcelable.Creator<ImageStickerInfoNewEngine> CREATOR = new Parcelable.Creator<ImageStickerInfoNewEngine>() { // from class: X.6Gs
        @Override // android.os.Parcelable.Creator
        public final ImageStickerInfoNewEngine createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = C5YW.LIZ(ImageStickerInfoNewEngine.class, parcel, arrayList, i2, 1);
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            int i3 = 0;
            while (i3 != readInt2) {
                i3 = C5YW.LIZ(ImageStickerInfoNewEngine.class, parcel, arrayList2, i3, 1);
            }
            int readInt3 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt3);
            while (i != readInt3) {
                i = C5YW.LIZ(ImageStickerInfoNewEngine.class, parcel, arrayList3, i, 1);
            }
            return new ImageStickerInfoNewEngine(arrayList, arrayList2, arrayList3);
        }

        @Override // android.os.Parcelable.Creator
        public final ImageStickerInfoNewEngine[] newArray(int i) {
            return new ImageStickerInfoNewEngine[i];
        }
    };

    @InterfaceC65349Pkn("hash_stickers_embed")
    public final List<EmbedHashTagStickerModel> hashStickersEmbed;

    @InterfaceC65349Pkn("hash_stickers_global")
    public final List<GlobalHashTagStickerModel> hashStickersGlobal;

    @InterfaceC65349Pkn("hash_stickers_single")
    public final List<SingleHashTagStickerModel> hashStickersSingle;

    public ImageStickerInfoNewEngine() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ImageStickerInfoNewEngine copy$default(ImageStickerInfoNewEngine imageStickerInfoNewEngine, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = imageStickerInfoNewEngine.hashStickersGlobal;
        }
        if ((i & 2) != 0) {
            list2 = imageStickerInfoNewEngine.hashStickersSingle;
        }
        if ((i & 4) != 0) {
            list3 = imageStickerInfoNewEngine.hashStickersEmbed;
        }
        return imageStickerInfoNewEngine.copy(list, list2, list3);
    }

    public final ImageStickerInfoNewEngine copy(List<GlobalHashTagStickerModel> hashStickersGlobal, List<SingleHashTagStickerModel> hashStickersSingle, List<EmbedHashTagStickerModel> hashStickersEmbed) {
        o.LJIIIZ(hashStickersGlobal, "hashStickersGlobal");
        o.LJIIIZ(hashStickersSingle, "hashStickersSingle");
        o.LJIIIZ(hashStickersEmbed, "hashStickersEmbed");
        return new ImageStickerInfoNewEngine(hashStickersGlobal, hashStickersSingle, hashStickersEmbed);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.hashStickersGlobal, this.hashStickersSingle, this.hashStickersEmbed};
    }

    public final List<StickerModel> getAllStickers() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.hashStickersGlobal);
        arrayList.addAll(this.hashStickersSingle);
        arrayList.addAll(this.hashStickersEmbed);
        return arrayList;
    }

    public final boolean hasSticker() {
        if ((!this.hashStickersGlobal.isEmpty()) || (!this.hashStickersSingle.isEmpty()) || (!this.hashStickersEmbed.isEmpty())) {
            return true;
        }
        return false;
    }

    public final List<EmbedHashTagStickerModel> getHashStickersEmbed() {
        return this.hashStickersEmbed;
    }

    public final List<GlobalHashTagStickerModel> getHashStickersGlobal() {
        return this.hashStickersGlobal;
    }

    public final List<SingleHashTagStickerModel> getHashStickersSingle() {
        return this.hashStickersSingle;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        Iterator LIZJ = UC7.LIZJ(this.hashStickersGlobal, out);
        while (LIZJ.hasNext()) {
            out.writeParcelable((Parcelable) LIZJ.next(), i);
        }
        Iterator LIZJ2 = UC7.LIZJ(this.hashStickersSingle, out);
        while (LIZJ2.hasNext()) {
            out.writeParcelable((Parcelable) LIZJ2.next(), i);
        }
        Iterator LIZJ3 = UC7.LIZJ(this.hashStickersEmbed, out);
        while (LIZJ3.hasNext()) {
            out.writeParcelable((Parcelable) LIZJ3.next(), i);
        }
    }

    public ImageStickerInfoNewEngine(List<GlobalHashTagStickerModel> list, List<SingleHashTagStickerModel> list2, List<EmbedHashTagStickerModel> list3) {
        C00F.LJ(list, "hashStickersGlobal", list2, "hashStickersSingle", list3, "hashStickersEmbed");
        this.hashStickersGlobal = list;
        this.hashStickersSingle = list2;
        this.hashStickersEmbed = list3;
    }

    public ImageStickerInfoNewEngine(List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C61878OQg.INSTANCE : list, (i & 2) != 0 ? C61878OQg.INSTANCE : list2, (i & 4) != 0 ? C61878OQg.INSTANCE : list3);
    }
}
