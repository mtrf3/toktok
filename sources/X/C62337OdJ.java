package X;

import com.ss.android.ugc.aweme.share.base.model.ShareContentType;

/* renamed from: X.OdJ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62337OdJ {
    public static final java.util.Map<ShareContentType, String> LIZ;
    public static final java.util.Map<Integer, ShareContentType> LIZIZ;

    static {
        ShareContentType shareContentType = ShareContentType.LINK;
        ShareContentType shareContentType2 = ShareContentType.VIDEO;
        ShareContentType shareContentType3 = ShareContentType.PHOTO;
        ShareContentType shareContentType4 = ShareContentType.PHOTOS;
        ShareContentType shareContentType5 = ShareContentType.LINK_PLUS_PHOTO;
        ShareContentType shareContentType6 = ShareContentType.LINK_PLUS_VIDEO;
        LIZ = C113554cx.LJJL(new OSZ(shareContentType, "url_form"), new OSZ(shareContentType2, "video_form"), new OSZ(shareContentType3, "photo_form"), new OSZ(shareContentType4, "photo_form"), new OSZ(shareContentType5, "url_photo_form"), new OSZ(shareContentType6, "url_video_form"));
        ShareContentType shareContentType7 = ShareContentType.DISABLE_SHARE;
        ShareContentType shareContentType8 = ShareContentType.ILEGAL;
        LIZIZ = C113554cx.LJJL(new OSZ(Integer.valueOf(shareContentType.getNum()), shareContentType), new OSZ(Integer.valueOf(shareContentType2.getNum()), shareContentType2), new OSZ(Integer.valueOf(shareContentType3.getNum()), shareContentType3), new OSZ(Integer.valueOf(shareContentType4.getNum()), shareContentType4), new OSZ(Integer.valueOf(shareContentType5.getNum()), shareContentType5), new OSZ(Integer.valueOf(shareContentType6.getNum()), shareContentType6), new OSZ(Integer.valueOf(shareContentType7.getNum()), shareContentType7), new OSZ(Integer.valueOf(shareContentType8.getNum()), shareContentType8));
    }
}
