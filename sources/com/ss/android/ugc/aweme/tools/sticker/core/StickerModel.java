package com.ss.android.ugc.aweme.tools.sticker.core;

import X.EnumC157656Gr;
import X.OSZ;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import java.io.Serializable;

/* loaded from: classes3.dex */
public interface StickerModel extends Parcelable, Serializable {
    BaseStickerModel getBaseSticker();

    int getId();

    InteractStickerStruct getInteractStickerStruct();

    EnumC157656Gr getStickerType();

    boolean isNotEmptyModel();

    StickerModel updateMediaSize(OSZ<Integer, Integer> osz);
}
