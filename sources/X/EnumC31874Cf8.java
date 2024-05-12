package X;

import android.os.Environment;
import java.io.File;
import kotlin.jvm.internal.o;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'NS_MODEL' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: X.Cf8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC31874Cf8 {
    public static final EnumC31874Cf8 CROP_VIEW;
    public static final C31877CfB Companion;
    public static final EnumC31874Cf8 DCIM_DIR;
    public static final EnumC31874Cf8 DRAW_GUESS;
    public static final EnumC31874Cf8 INVOICE;
    public static final EnumC31874Cf8 KYC_UPLOAD_FILES;
    public static final EnumC31874Cf8 LIVE_GOAL;
    public static final EnumC31874Cf8 LIVE_KARAOKE;
    public static final EnumC31874Cf8 LIVE_REPLAY_CLIP_VIDEO;
    public static final /* synthetic */ EnumC31874Cf8[] LJLJJLL;
    public static final EnumC31874Cf8 METRIC_MODEL;
    public static final EnumC31874Cf8 MUSIC_ACC;
    public static final EnumC31874Cf8 MUSIC_BGM;
    public static final EnumC31874Cf8 NS_MODEL;
    public static final EnumC31874Cf8 SHARE_EFFECT;
    public static final EnumC31874Cf8 SOUND_EFFECT;
    public static final EnumC31874Cf8 STICKER;
    public static final EnumC31874Cf8 TRY_MODE_WEBP;
    public static final EnumC31874Cf8 UPLOAD_ENCRYPT_PHOTO;
    public static final EnumC31874Cf8 UPLOAD_PHOTO;
    public final String LJLIL;
    public final boolean LJLILLLLZI;
    public final boolean LJLJI;
    public volatile String LJLJJI;
    public volatile String LJLJJL;

    public static EnumC31874Cf8 valueOf(String str) {
        return (EnumC31874Cf8) V0N.LJJJ(EnumC31874Cf8.class, str);
    }

    public static EnumC31874Cf8[] values() {
        return (EnumC31874Cf8[]) LJLJJLL.clone();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.CfB] */
    static {
        boolean z = false;
        EnumC31874Cf8 enumC31874Cf8 = new EnumC31874Cf8("DCIM_DIR", 0, "Camera", false, false);
        DCIM_DIR = enumC31874Cf8;
        boolean z2 = false;
        int i = 6;
        EnumC31874Cf8 enumC31874Cf82 = new EnumC31874Cf8("NS_MODEL", "ns_model", 1, z, i);
        NS_MODEL = enumC31874Cf82;
        int i2 = 2;
        EnumC31874Cf8 enumC31874Cf83 = new EnumC31874Cf8("METRIC_MODEL", "metrics_model", i2, z, i);
        METRIC_MODEL = enumC31874Cf83;
        EnumC31874Cf8 enumC31874Cf84 = new EnumC31874Cf8("SOUND_EFFECT", "sound_effect", 3, (boolean) (1 == true ? 1 : 0), i2);
        SOUND_EFFECT = enumC31874Cf84;
        EnumC31874Cf8 enumC31874Cf85 = new EnumC31874Cf8("STICKER", "sticker", 4, false, i);
        STICKER = enumC31874Cf85;
        EnumC31874Cf8 enumC31874Cf86 = new EnumC31874Cf8("CROP_VIEW", "crop_view", 5, false, i);
        CROP_VIEW = enumC31874Cf86;
        EnumC31874Cf8 enumC31874Cf87 = new EnumC31874Cf8("INVOICE", 6, "invoice", false, true);
        INVOICE = enumC31874Cf87;
        EnumC31874Cf8 enumC31874Cf88 = new EnumC31874Cf8("UPLOAD_PHOTO", "upload_photo", 7, z2, i);
        UPLOAD_PHOTO = enumC31874Cf88;
        EnumC31874Cf8 enumC31874Cf89 = new EnumC31874Cf8("UPLOAD_ENCRYPT_PHOTO", "upload_encrypt_photo", 8, z2, i);
        UPLOAD_ENCRYPT_PHOTO = enumC31874Cf89;
        int i3 = 2;
        EnumC31874Cf8 enumC31874Cf810 = new EnumC31874Cf8("MUSIC_ACC", "music_accompaniment", 9, z2, i3);
        MUSIC_ACC = enumC31874Cf810;
        EnumC31874Cf8 enumC31874Cf811 = new EnumC31874Cf8("MUSIC_BGM", "music_bgm", 10, z2, i);
        MUSIC_BGM = enumC31874Cf811;
        EnumC31874Cf8 enumC31874Cf812 = new EnumC31874Cf8("DRAW_GUESS", "draw_guess", 11, true, i3);
        DRAW_GUESS = enumC31874Cf812;
        EnumC31874Cf8 enumC31874Cf813 = new EnumC31874Cf8("KYC_UPLOAD_FILES", "kyc_upload_files", 12, false, i);
        KYC_UPLOAD_FILES = enumC31874Cf813;
        EnumC31874Cf8 enumC31874Cf814 = new EnumC31874Cf8("LIVE_REPLAY_CLIP_VIDEO", 13, "live_replay_clip_video", false, true);
        LIVE_REPLAY_CLIP_VIDEO = enumC31874Cf814;
        EnumC31874Cf8 enumC31874Cf815 = new EnumC31874Cf8("LIVE_GOAL", 14, "live_goal", false, true);
        LIVE_GOAL = enumC31874Cf815;
        EnumC31874Cf8 enumC31874Cf816 = new EnumC31874Cf8("LIVE_KARAOKE", 15, "live_karaoke", false, true);
        LIVE_KARAOKE = enumC31874Cf816;
        EnumC31874Cf8 enumC31874Cf817 = new EnumC31874Cf8("SHARE_EFFECT", 16, "share_effect", false, true);
        SHARE_EFFECT = enumC31874Cf817;
        EnumC31874Cf8 enumC31874Cf818 = new EnumC31874Cf8("TRY_MODE_WEBP", 17, "try_mode_webp", false, true);
        TRY_MODE_WEBP = enumC31874Cf818;
        LJLJJLL = new EnumC31874Cf8[]{enumC31874Cf8, enumC31874Cf82, enumC31874Cf83, enumC31874Cf84, enumC31874Cf85, enumC31874Cf86, enumC31874Cf87, enumC31874Cf88, enumC31874Cf89, enumC31874Cf810, enumC31874Cf811, enumC31874Cf812, enumC31874Cf813, enumC31874Cf814, enumC31874Cf815, enumC31874Cf816, enumC31874Cf817, enumC31874Cf818};
        Companion = new Object() { // from class: X.CfB
        };
    }

    public final String getFullPath() {
        String LIZIZ;
        if (this.LJLJJI.length() > 0) {
            return this.LJLJJI;
        }
        String str = "";
        if (this == DCIM_DIR) {
            LIZIZ = C268613q.LJFF(C15380j0.LIZLLL(), "").toString();
            o.LJIIIIZZ(LIZIZ, "createVideoUri(ResUtil.g…Context(), \"\").toString()");
        } else {
            String str2 = null;
            if (!this.LJLILLLLZI && (o.LJ("mounted", C16880lQ.LLLLLLLZIL()) || !Environment.isExternalStorageRemovable())) {
                if (this.LJLJI) {
                    File LLIIIZ = C16880lQ.LLIIIZ(C15380j0.LIZLLL());
                    if (LLIIIZ != null) {
                        str = LLIIIZ.getAbsolutePath();
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append(str);
                        String str3 = File.separator;
                        C1DI.LIZIZ(LIZ, str3, "ttlive", str3);
                        LIZ.append(this.LJLIL);
                        LIZIZ = X1D.LIZIZ(LIZ);
                    }
                    str = str2;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(str);
                    String str32 = File.separator;
                    C1DI.LIZIZ(LIZ2, str32, "ttlive", str32);
                    LIZ2.append(this.LJLIL);
                    LIZIZ = X1D.LIZIZ(LIZ2);
                } else {
                    File LLIIJI = C16880lQ.LLIIJI(C15380j0.LIZLLL(), null);
                    if (LLIIJI != null) {
                        str = LLIIJI.getAbsolutePath();
                        StringBuilder LIZ22 = X1D.LIZ();
                        LIZ22.append(str);
                        String str322 = File.separator;
                        C1DI.LIZIZ(LIZ22, str322, "ttlive", str322);
                        LIZ22.append(this.LJLIL);
                        LIZIZ = X1D.LIZIZ(LIZ22);
                    }
                    str = str2;
                    StringBuilder LIZ222 = X1D.LIZ();
                    LIZ222.append(str);
                    String str3222 = File.separator;
                    C1DI.LIZIZ(LIZ222, str3222, "ttlive", str3222);
                    LIZ222.append(this.LJLIL);
                    LIZIZ = X1D.LIZIZ(LIZ222);
                }
            } else if (this.LJLJI) {
                StringBuilder LIZ2222 = X1D.LIZ();
                LIZ2222.append(str);
                String str32222 = File.separator;
                C1DI.LIZIZ(LIZ2222, str32222, "ttlive", str32222);
                LIZ2222.append(this.LJLIL);
                LIZIZ = X1D.LIZIZ(LIZ2222);
            } else {
                StringBuilder LIZ22222 = X1D.LIZ();
                LIZ22222.append(str);
                String str322222 = File.separator;
                C1DI.LIZIZ(LIZ22222, str322222, "ttlive", str322222);
                LIZ22222.append(this.LJLIL);
                LIZIZ = X1D.LIZIZ(LIZ22222);
            }
        }
        this.LJLJJI = C78983UzD.LJIJJ(LIZIZ);
        return this.LJLJJI;
    }

    public final String getSimpleString$livebase_release() {
        String str;
        if (this.LJLJJL.length() > 0) {
            return this.LJLJJL;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLJJL);
        LIZ.append(this.LJLIL);
        this.LJLJJL = X1D.LIZIZ(LIZ);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(this.LJLJJL);
        if (this.LJLILLLLZI) {
            str = "-in";
        } else {
            str = "-out";
        }
        LIZ2.append(str);
        this.LJLJJL = X1D.LIZIZ(LIZ2);
        if (this.LJLJI) {
            StringBuilder LIZ3 = X1D.LIZ();
            this.LJLJJL = JBR.LJFF(LIZ3, this.LJLJJL, "-cache", LIZ3);
        }
        return this.LJLJJL;
    }

    public final String getFullPathWithoutPostSuffix() {
        String fullPath = getFullPath();
        o.LJIIIZ(fullPath, "<this>");
        String separator = File.separator;
        o.LJIIIIZZ(separator, "separator");
        if (ujb.o.LJJJJ(fullPath, separator, false) && fullPath.length() > 0) {
            return C58314Muc.LIZIZ(fullPath, 1, 0, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        return fullPath;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ EnumC31874Cf8(java.lang.String r7, java.lang.String r8, int r9, boolean r10, int r11) {
        /*
            r6 = this;
            r5 = r10
            r0 = r11 & 2
            if (r0 == 0) goto L13
            r4 = 1
        L6:
            r0 = r11 & 4
            if (r0 == 0) goto Lb
            r5 = 1
        Lb:
            r1 = r7
            r0 = r6
            r3 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return
        L13:
            r4 = 0
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EnumC31874Cf8.<init>(java.lang.String, java.lang.String, int, boolean, int):void");
    }

    public EnumC31874Cf8(String str, int i, String str2, boolean z, boolean z2) {
        this.LJLIL = str2;
        this.LJLILLLLZI = z;
        this.LJLJI = z2;
        this.LJLJJI = "";
        this.LJLJJL = "";
    }
}
