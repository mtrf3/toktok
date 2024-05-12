package X;

/* loaded from: classes16.dex */
public interface YOC {
    int addImageSticker(String str, float f, float f2, float f3, float f4);

    int addInfoSticker(String str, String[] strArr);

    void clearNativeFromSticker();

    float[] getInfoStickerBoundingBox(int i);

    int getSrtInfoStickerInitPosition(int i, float[] fArr);

    int removeInfoSticker(int i);

    int setInfoStickerAlpha(int i, float f);

    int setInfoStickerLayer(int i, int i2);

    int setInfoStickerPosition(int i, float f, float f2);

    int setInfoStickerRestoreMode(int i);

    int setInfoStickerRotation(int i, float f);

    int setInfoStickerScale(int i, float f);

    int setInfoStickerTime(int i, int i2, int i3);
}
