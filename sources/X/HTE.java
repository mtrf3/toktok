package X;

/* loaded from: classes8.dex */
public enum HTE {
    RECORD_COROUTINE_SCOPE_INACTIVE(1, "buildRecordReturnArguments is not active"),
    UPLOAD_COROUTINE_SCOPE_INACTIVE(2, "buildUploadReturnArguments is not active"),
    IMAGE_BITMAP_NULL(3, "image_bitmap_null"),
    IMAGE_BITMAP_OUT_OF_MEMORY_ERROR(4, "image_bitmap_OutOfMemoryError"),
    IMAGE_SAVE_BITMAP_WRONG(5, "image save bitmap wrong"),
    VIDEO_COMPRESS_TASK_ERROR(6, "video compress task error"),
    VIDEO_COMPRESS_TASK_CANCEL(7, "video compress task cancel"),
    VIDEO_EXTRACT_FRAME_NULL(8, "video extract frame is null"),
    VIDEO_COVER_BIMAP_NULL(9, "video cover bimap is null"),
    RECORD_PHOTO_PROCESS_TIMEOUT(10, "record photo compress procedure timeout"),
    RECORD_VIDEO_PROCESS_TIMEOUT(11, "record video compress procedure timeout"),
    UPLOAD_MIX_PROCESS_TIMEOUT(12, "upload mix compress procedure timeout"),
    RECORD_AUTH_DENY(13, "record authority deny"),
    ALBUM_AUTH_DENY(14, "album authority deny");

    public final int LJLIL;
    public final String LJLILLLLZI;

    public static HTE valueOf(String str) {
        return (HTE) V0N.LJJJ(HTE.class, str);
    }

    public final int getErrorCode() {
        return this.LJLIL;
    }

    public final String getErrorDesc() {
        return this.LJLILLLLZI;
    }

    HTE(int i, String str) {
        this.LJLIL = i;
        this.LJLILLLLZI = str;
    }
}
