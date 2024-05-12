package X;

import Y.AObjectS58S0000000_7;
import android.content.Intent;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.jsb.comment.ExteriorRecordModel;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.RecordPageOptionalConfig;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.HSu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44108HSu {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZIZ(Integer num, HRG status) {
        HTE hte;
        o.LJIIIZ(status, "status");
        if (num != null) {
            num.intValue();
            if (status == HRG.FAILED) {
                hte = HTE.ALBUM_AUTH_DENY;
            } else {
                hte = null;
            }
            LIZ(num, status, EnumC44110HSw.ALBUM_AUTH, hte);
        }
    }

    public static final void LJIIIIZZ(Intent intent, HRG status, AObjectS58S0000000_7 aObjectS58S0000000_7) {
        HTE hte;
        String str;
        HB8 hb8;
        o.LJIIIZ(intent, "intent");
        o.LJIIIZ(status, "status");
        if (intent.hasExtra("exterior_record_model")) {
            ExteriorRecordModel exteriorRecordModel = (ExteriorRecordModel) intent.getParcelableExtra("exterior_record_model");
            String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "shoot_way");
            Integer num = null;
            if (status == HRG.FAILED) {
                hte = HTE.RECORD_AUTH_DENY;
            } else {
                hte = null;
            }
            if (exteriorRecordModel != null && (hb8 = exteriorRecordModel.recordPageType) != null) {
                num = Integer.valueOf(hb8.getType());
            }
            LIZ(num, status, EnumC44110HSw.RECORD_AUTH, hte);
            if (aObjectS58S0000000_7 != null) {
                if (exteriorRecordModel == null || (str = exteriorRecordModel.PreviousPage) == null) {
                    str = "";
                }
                if (LLJJIJIIJIL == null) {
                    LLJJIJIIJIL = "";
                }
                aObjectS58S0000000_7.invoke(str, LLJJIJIIJIL);
            }
        }
    }

    public static void LIZ(Integer num, HRG hrg, EnumC44110HSw enumC44110HSw, HTE hte) {
        int type = HR3.ECOMMERCE_COMMENT.getType();
        if (num == null || num.intValue() != type) {
            int type2 = HR3.PHOTO_SEARCH.getType();
            if (num == null || num.intValue() != type2) {
                return;
            }
            LJI(EnumC62532cr.EC_SEARCH, enumC44110HSw, hrg, null, hte, 0L, 0);
            return;
        }
        LJI(EnumC62532cr.EC_COMMENT, enumC44110HSw, hrg, null, hte, 0L, 0);
    }

    public static void LJII(int i, String str, String str2, boolean z, Intent intent, Boolean bool) {
        if ((intent != null && intent.hasExtra("exterior_record_model")) || o.LJ(bool, Boolean.TRUE)) {
            C145995oB c145995oB = new C145995oB();
            c145995oB.LIZLLL("previous_page", str);
            c145995oB.LIZ(i, "step");
            c145995oB.LIZLLL("shoot_way", str2);
            c145995oB.LIZ(z ? 1 : 0, "activity_is_valid");
            FMX.LJIIL("external_creation_trace_performance", c145995oB.LIZ);
        }
    }

    public static final void LIZJ(ShortVideoContext shortVideoContext, String originLocalUrl, String contentType, HTE errorData, String contentSource, long j, String str) {
        Integer num;
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        o.LJIIIZ(originLocalUrl, "originLocalUrl");
        o.LJIIIZ(contentType, "contentType");
        o.LJIIIZ(errorData, "errorData");
        o.LJIIIZ(contentSource, "contentSource");
        C145995oB c145995oB = new C145995oB();
        c145995oB.LIZLLL("shoot_way", shortVideoContext.shootWay);
        c145995oB.LIZLLL("creation_id", shortVideoContext.LJI());
        c145995oB.LJ("origin_file_exist", C44687HgJ.LIZIZ(originLocalUrl));
        c145995oB.LIZIZ(C44687HgJ.LJIIIIZZ(originLocalUrl), "origin_file_size");
        c145995oB.LIZLLL("resolution", str);
        c145995oB.LIZLLL("content_type", contentType);
        c145995oB.LIZLLL("failed_reason", errorData.getErrorDesc());
        c145995oB.LIZLLL("content_source", contentSource);
        FMX.LJIIL("compress_failure", c145995oB.LIZ);
        RecordPageOptionalConfig recordPageOptionalConfig = shortVideoContext.creativeModel.initialModel.recordPageOptionalConfig;
        if (recordPageOptionalConfig != null) {
            num = Integer.valueOf(recordPageOptionalConfig.exteriorRecordPageType);
        } else {
            num = null;
        }
        LJ(num, HRG.FAILED, EnumC44110HSw.COMPRESS_SAVE, contentType, errorData, j, (int) C44687HgJ.LJIIIIZZ(originLocalUrl));
    }

    public static final void LJ(Integer num, HRG status, EnumC44110HSw stage, String contentType, HTE hte, long j, int i) {
        EnumC44109HSv enumC44109HSv;
        o.LJIIIZ(status, "status");
        o.LJIIIZ(stage, "stage");
        o.LJIIIZ(contentType, "contentType");
        int hashCode = contentType.hashCode();
        if (hashCode != 108124) {
            if (hashCode != 106642994) {
                if (hashCode == 112202875 && contentType.equals("video")) {
                    enumC44109HSv = EnumC44109HSv.VIDEO;
                }
                enumC44109HSv = EnumC44109HSv.UNKNOWN;
            } else {
                if (contentType.equals("photo")) {
                    enumC44109HSv = EnumC44109HSv.PHOTO;
                }
                enumC44109HSv = EnumC44109HSv.UNKNOWN;
            }
        } else {
            if (contentType.equals("mix")) {
                enumC44109HSv = EnumC44109HSv.MIX;
            }
            enumC44109HSv = EnumC44109HSv.UNKNOWN;
        }
        int type = HR3.ECOMMERCE_COMMENT.getType();
        if (num == null || num.intValue() != type) {
            int type2 = HR3.PHOTO_SEARCH.getType();
            if (num == null || num.intValue() != type2) {
                return;
            }
            LJI(EnumC62532cr.EC_SEARCH, stage, status, enumC44109HSv, hte, j, i);
            return;
        }
        LJI(EnumC62532cr.EC_COMMENT, stage, status, enumC44109HSv, hte, j, i);
    }

    public static void LJI(EnumC62532cr enumC62532cr, EnumC44110HSw enumC44110HSw, HRG hrg, EnumC44109HSv enumC44109HSv, HTE hte, long j, int i) {
        Integer num;
        Integer num2;
        C145995oB c145995oB = new C145995oB();
        String name = enumC62532cr.name();
        Locale locale = Locale.ROOT;
        String lowerCase = name.toLowerCase(locale);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        c145995oB.LIZLLL("previous_page", lowerCase);
        String lowerCase2 = enumC44110HSw.name().toLowerCase(locale);
        o.LJIIIIZZ(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        c145995oB.LIZLLL("stage", lowerCase2);
        c145995oB.LIZ(hrg.getValue(), "status");
        String str = null;
        if (enumC44109HSv != null) {
            num = Integer.valueOf(enumC44109HSv.getValue());
        } else {
            num = null;
        }
        c145995oB.LIZJ(num, "media_type");
        if (hrg == HRG.FAILED) {
            if (hte != null) {
                num2 = Integer.valueOf(hte.getErrorCode());
            } else {
                num2 = null;
            }
            c145995oB.LIZJ(num2, "error_code");
            if (hte != null) {
                str = hte.getErrorDesc();
            }
            c145995oB.LIZLLL("error_desc", str);
        }
        c145995oB.LIZJ(Float.valueOf((float) j), "duration");
        if (enumC44110HSw == EnumC44110HSw.COMPRESS_SAVE) {
            c145995oB.LIZ(i, "file_size");
        }
        FMX.LJIIL("external_creation_performance", c145995oB.LIZ);
    }

    public static final void LJFF(ShortVideoContext shortVideoContext, String originLocalUrl, String compressFilePath, String str, String contentSource, String str2, long j, String str3) {
        Integer num;
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        o.LJIIIZ(originLocalUrl, "originLocalUrl");
        o.LJIIIZ(compressFilePath, "compressFilePath");
        o.LJIIIZ(contentSource, "contentSource");
        C145995oB c145995oB = new C145995oB();
        c145995oB.LIZLLL("shoot_way", shortVideoContext.shootWay);
        c145995oB.LIZLLL("creation_id", shortVideoContext.LJI());
        c145995oB.LJ("origin_file_exist", C44687HgJ.LIZIZ(originLocalUrl));
        c145995oB.LIZIZ(C44687HgJ.LJIIIIZZ(originLocalUrl), "origin_file_size");
        c145995oB.LJ("compress_file_exist", C44687HgJ.LIZIZ(compressFilePath));
        c145995oB.LIZIZ(C44687HgJ.LJIIIIZZ(compressFilePath), "compress_file_size");
        c145995oB.LIZLLL("resolution", str3);
        c145995oB.LIZLLL("process_name", str2);
        c145995oB.LIZLLL("content_type", str);
        c145995oB.LIZLLL("content_source", contentSource);
        FMX.LJIIL("compress_success", c145995oB.LIZ);
        if (o.LJ(str2, "video_compress")) {
            return;
        }
        RecordPageOptionalConfig recordPageOptionalConfig = shortVideoContext.creativeModel.initialModel.recordPageOptionalConfig;
        if (recordPageOptionalConfig != null) {
            num = Integer.valueOf(recordPageOptionalConfig.exteriorRecordPageType);
        } else {
            num = null;
        }
        LJ(num, HRG.SUCCESS, EnumC44110HSw.COMPRESS_SAVE, str, null, j, (int) C44687HgJ.LJIIIIZZ(compressFilePath));
    }
}
