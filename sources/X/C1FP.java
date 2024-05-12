package X;

import Y.ACallableS80S0200000_2;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.comment.model.CommentImageStruct;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.cut.BackgroundVideoCompileConfigure;
import com.ss.android.ugc.aweme.shortvideo.cut.DiyPropVideoCompileConfigure;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VolumeAdjustmentExperimentParams;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.File;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;

/* renamed from: X.1FP, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1FP implements InterfaceC60495Noh, InterfaceC170896nF, InterfaceC47522Ikw {
    public static ExecutorService LJLIL;
    public static HashSet LJLILLLLZI;

    @Override // X.InterfaceC47522Ikw
    public boolean LIZ(String str) {
        return true;
    }

    @Override // X.InterfaceC47522Ikw
    public boolean clear() {
        return true;
    }

    @Override // X.InterfaceC47522Ikw
    public String getString(String str) {
        return "";
    }

    @Override // X.InterfaceC60495Noh
    public void onFailed() {
    }

    @Override // X.InterfaceC47522Ikw
    public boolean putString(String str, String str2) {
        return true;
    }

    public static final void LIZLLL() {
        C65757PrN.LIZ("", "use_sticker");
    }

    public static long LJIIJ() {
        try {
            return ((Long) Class.forName("com.ss.android.agilelogger.ALog").getMethod("getALogSimpleWriteFuncAddr", new Class[0]).invoke(null, new Object[0])).longValue();
        } catch (Exception unused) {
            return 0L;
        }
    }

    public /* synthetic */ C1FP() {
    }

    public static final BackgroundVideoCompileConfigure LJFF(Workspace workspace) {
        String path = workspace.LJLIL.LLLII().getPath();
        o.LJIIIIZZ(path, "getNewBackgroundVideoFile(\"\").path");
        String path2 = workspace.LJLIL.LJLLI().getPath();
        o.LJIIIIZZ(path2, "getNewBackgroundAudioFile(\"\").path");
        return new BackgroundVideoCompileConfigure(path, path2);
    }

    public static final DiyPropVideoCompileConfigure LJI(Workspace workspace) {
        String path = workspace.LJLIL.LLLLII().getPath();
        o.LJIIIIZZ(path, "getNewDiyPropVideoFile(\"\").path");
        return new DiyPropVideoCompileConfigure(path);
    }

    public static final boolean LJII(UpvoteStruct upvoteStruct) {
        o.LJIIIZ(upvoteStruct, "<this>");
        String text = upvoteStruct.getText();
        if ((text != null && text.length() != 0) || LJIILL(upvoteStruct)) {
            return false;
        }
        return true;
    }

    public static final UpvoteStruct LJIIIIZZ(UpvoteList upvoteList) {
        List<UpvoteStruct> upvotes;
        UpvoteStruct upvoteStruct = null;
        if (upvoteList == null || (upvotes = upvoteList.getUpvotes()) == null) {
            return null;
        }
        Iterator<UpvoteStruct> it = upvotes.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            UpvoteStruct next = it.next();
            if (AV1.LJIJ(next.getUser())) {
                upvoteStruct = next;
                break;
            }
        }
        return upvoteStruct;
    }

    public static final String LJIIIZ(double d) {
        return Q8U.LIZIZ(new Object[]{Double.valueOf(d)}, 1, "%.2f", "format(format, *args)");
    }

    public static final String LJIIJJI(C112454bB c112454bB) {
        o.LJIIIZ(c112454bB, "<this>");
        if (c112454bB.LIZ == 12) {
            return "tcm";
        }
        Integer num = c112454bB.LIZJ;
        int i = AbstractC63505Ow9.LIZIZ;
        if (num == null || num.intValue() != i) {
            int i2 = AbstractC63505Ow9.LIZ;
            if (num == null || num.intValue() != i2) {
                return "";
            }
            return "private";
        }
        return "group";
    }

    public static String LJIIL(long j) {
        if (j >= 1000000) {
            StringBuilder LIZ = X1D.LIZ();
            return C03660Ck.LIZIZ("%.2f", new Object[]{C1DD.LIZJ(j, 1.0d, 1000000.0d)}, LIZ, "m", LIZ);
        }
        if (j >= 1000) {
            StringBuilder LIZ2 = X1D.LIZ();
            return C03660Ck.LIZIZ("%.2f", new Object[]{C1DD.LIZJ(j, 1.0d, 1000.0d)}, LIZ2, "k", LIZ2);
        }
        return String.valueOf(j);
    }

    public static final long LJIILIIL(File file) {
        File[] listFiles;
        long j = 0;
        if (!file.exists()) {
            return 0L;
        }
        if (file.isFile()) {
            return 0 + file.length();
        }
        if (!file.isDirectory() || (listFiles = file.listFiles()) == null) {
            return 0L;
        }
        for (File it : listFiles) {
            o.LJIIIIZZ(it, "it");
            j += LJIILIIL(it);
        }
        return j;
    }

    public static final String LJIILJJIL(C112454bB c112454bB) {
        C109544Rq c109544Rq;
        C109544Rq c109544Rq2 = null;
        if (c112454bB != null) {
            c109544Rq = c112454bB.LJIJI;
        } else {
            c109544Rq = null;
        }
        if (C4FU.LJI(c109544Rq)) {
            return EnumC106154Ep.NUDGE_BACK.getValue();
        }
        if (c112454bB != null) {
            c109544Rq2 = c112454bB.LJIJI;
        }
        if (C4FU.LJFF(c109544Rq2)) {
            return EnumC106154Ep.NUDGE.getValue();
        }
        return "click_push_im";
    }

    public static final boolean LJIILL(UpvoteStruct upvoteStruct) {
        List<CommentImageStruct> imageList;
        o.LJIIIZ(upvoteStruct, "<this>");
        if (upvoteStruct.getUpvoteWithPhoto()) {
            return true;
        }
        if (upvoteStruct.getImageList() != null && (imageList = upvoteStruct.getImageList()) != null && !imageList.isEmpty()) {
            return true;
        }
        return false;
    }

    public static final boolean LJIIZILJ(Throwable th) {
        if ((th instanceof C38306F1q) && ((C38306F1q) th).getErrorCode() == 7) {
            return true;
        }
        return false;
    }

    public static boolean LJIJ(String str) {
        boolean z = false;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty("sMiuiThemeEnabled")) {
            return false;
        }
        try {
            Field declaredField = Class.forName(str).getDeclaredField("sMiuiThemeEnabled");
            if (declaredField == null) {
                return false;
            }
            declaredField.setAccessible(true);
            declaredField.setBoolean(null, false);
            z = true;
            return true;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return z;
        }
    }

    public static final void LJIJI(InterfaceC65784Pro block) {
        o.LJIIIZ(block, "block");
        try {
            block.invoke();
        } catch (Throwable unused) {
        }
    }

    public static int LJIJJ(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }

    public static int LJIJJLI(Object obj) {
        int hashCode;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return LJIJJ(hashCode);
    }

    public static final void LJJ(String stickerName) {
        o.LJIIIZ(stickerName, "stickerName");
        C65757PrN.LIZ(stickerName, "use_sticker");
    }

    public static int LJJI(int i) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        int i2 = 0;
        do {
            int i3 = iArr[i2];
            int i4 = i3 - 1;
            if (i3 != 0) {
                if (i4 == i) {
                    return i3;
                }
                i2++;
            } else {
                throw null;
            }
        } while (i2 < 6);
        return 1;
    }

    @Override // X.InterfaceC170896nF
    public void LIZIZ(C131055Cj kvWriter) {
        o.LJIIIZ(kvWriter, "kvWriter");
        EnumC127484zQ enumC127484zQ = EnumC127484zQ.ENABLE_LOG;
        Boolean bool = Boolean.FALSE;
        kvWriter.LIZ(enumC127484zQ, bool);
        kvWriter.LIZ(EnumC127484zQ.ENABLE_DRAFT_BOX, bool);
        kvWriter.LIZ(EnumC127484zQ.IS_DEFAULT_SAVE_IN_ALBUM, bool);
        kvWriter.LIZ(EnumC127484zQ.IS_LOOP_PLAY_VIDEO, bool);
        kvWriter.LIZ(EnumC127484zQ.PICTURE_TRACK_TIME, 3000L);
        EnumC127484zQ enumC127484zQ2 = EnumC127484zQ.ENABLE_EFFECT_AMAZING;
        Boolean bool2 = Boolean.TRUE;
        kvWriter.LIZ(enumC127484zQ2, bool2);
        kvWriter.LIZ(EnumC127484zQ.ENABLE_CLICK_WHEN_DISABLE_FUNCTION_ITEM, bool2);
        kvWriter.LIZ(EnumC127484zQ.MAX_EDIT_VIDEO_LIMIT_TIME_MILLIS, Long.valueOf(C152345yQ.LIZ()));
        kvWriter.LIZ(EnumC127484zQ.VIDEO_CLIP_MIN_DURATION, 100L);
        if (C5P9.LIZ()) {
            kvWriter.LIZ(EnumC127484zQ.ENABLE_VOLUME_ADJUST_OPTIMIZATION, bool2);
            EnumC127484zQ enumC127484zQ3 = EnumC127484zQ.VOLUME_DB_RANGE;
            C5P9.LIZ.getClass();
            kvWriter.LIZ(enumC127484zQ3, Double.valueOf(((VolumeAdjustmentExperimentParams) C5P9.LIZJ.getValue()).getDbRange()));
            kvWriter.LIZ(EnumC127484zQ.VOLUME_DEFAULT, Float.valueOf(C5P9.LIZIZ()));
        } else {
            kvWriter.LIZ(EnumC127484zQ.ENABLE_VOLUME_ADJUST_OPTIMIZATION, bool);
        }
        kvWriter.LIZ(EnumC127484zQ.MAX_PIP_TRACK_COUNT, 6);
        C10K.LIZJ(new ACallableS80S0200000_2(kvWriter, this, 14));
        if (AnonymousClass515.LIZ()) {
            kvWriter.LIZ(EnumC127484zQ.ENABLE_MENU_HIERARCHY_OPTIMIZATION, bool2);
        }
        if (C130915Bv.LIZ()) {
            kvWriter.LIZ(EnumC127484zQ.ENABLE_SUBTRACK_UX_OPTIMIZATION, bool2);
        }
        if (C00F.LIZ(31744, 0, "studio_editor_pro_optimize_enter_experience", true) == 2) {
            kvWriter.LIZ(EnumC127484zQ.ENABLE_TRANSITION_ANIM_ON_BOTTOM_MENU, bool2);
        }
        kvWriter.LIZ(EnumC127484zQ.ENABLE_TRACK_LABEL_SCROLLABLE, bool2);
        EnumC127484zQ enumC127484zQ4 = EnumC127484zQ.ENABLE_TRACK_LINKAGE;
        FFL.LJIIIZ().getClass();
        kvWriter.LIZ(enumC127484zQ4, Boolean.valueOf(FFL.LJ(31744, "studio_editor_pro_tracksync", true, false)));
        kvWriter.LIZ(EnumC127484zQ.ENABLE_EFFECT, Boolean.valueOf(C1292855o.LIZ()));
        kvWriter.LIZ(EnumC127484zQ.ENABLE_NLE_COMPOSER_FOR_EFFECT, Boolean.valueOf(C126234xP.LIZ()));
        kvWriter.LIZ(EnumC127484zQ.ENABLE_EDIT_PAGE_FRAMEWORK_MERGENCE, bool2);
        int LIZ = C00F.LIZ(31744, 0, "editor_pro_black_frame_optimization", true);
        if (LIZ != 0) {
            if (LIZ != 1) {
                if (LIZ != 2) {
                    if (LIZ == 3) {
                        kvWriter.LIZ(EnumC127484zQ.ENABLE_SUBTRACK_OVER_MAIN, bool);
                        kvWriter.LIZ(EnumC127484zQ.ENABLE_OPERATE_CAUSE_BLACK_SLOT, bool);
                        kvWriter.LIZ(EnumC127484zQ.ENABLE_BLACK_SLOT_OPERATE, bool);
                    }
                } else {
                    kvWriter.LIZ(EnumC127484zQ.ENABLE_SUBTRACK_OVER_MAIN, bool);
                    kvWriter.LIZ(EnumC127484zQ.ENABLE_OPERATE_CAUSE_BLACK_SLOT, bool2);
                    kvWriter.LIZ(EnumC127484zQ.ENABLE_BLACK_SLOT_OPERATE, bool2);
                }
            } else {
                kvWriter.LIZ(EnumC127484zQ.ENABLE_SUBTRACK_OVER_MAIN, bool2);
                kvWriter.LIZ(EnumC127484zQ.ENABLE_OPERATE_CAUSE_BLACK_SLOT, bool2);
                kvWriter.LIZ(EnumC127484zQ.ENABLE_BLACK_SLOT_OPERATE, bool2);
            }
        } else {
            kvWriter.LIZ(EnumC127484zQ.ENABLE_SUBTRACK_OVER_MAIN, bool2);
            kvWriter.LIZ(EnumC127484zQ.ENABLE_OPERATE_CAUSE_BLACK_SLOT, bool2);
            kvWriter.LIZ(EnumC127484zQ.ENABLE_BLACK_SLOT_OPERATE, bool);
        }
        EnumC127484zQ enumC127484zQ5 = EnumC127484zQ.ENABLE_VIDEO_TRANSITION;
        FFL.LJIIIZ().getClass();
        kvWriter.LIZ(enumC127484zQ5, Boolean.valueOf(FFL.LJ(31744, "studio_editor_pro_add_transition", true, false)));
        EnumC127484zQ enumC127484zQ6 = EnumC127484zQ.ENABLE_AUTO_ALIGN_BGM;
        FFL.LJIIIZ().getClass();
        kvWriter.LIZ(enumC127484zQ6, Boolean.valueOf(FFL.LJ(31744, "studio_editor_pro_enable_soundtrack_align_videotrack", true, false)));
        kvWriter.LIZ(EnumC127484zQ.ENABLE_NEW_ROUND_CORNER_UX_OPTIMIZATION, Boolean.valueOf(C58B.LIZ()));
        EnumC127484zQ enumC127484zQ7 = EnumC127484zQ.ENABLE_VE_HOT_UPDATE_EXPERIMENT;
        FFL.LJIIIZ().getClass();
        kvWriter.LIZ(enumC127484zQ7, Boolean.valueOf(FFL.LJ(31744, "studio_nle_public_enable_hot_update", true, false)));
        kvWriter.LIZ(EnumC127484zQ.ENABLE_CHANGE_ADD_SOUND_LOGIC, Boolean.valueOf(C133005Jw.LIZ()));
    }

    public static final long LIZJ(float f, float f2) {
        return (Float.floatToIntBits(f2) & 4294967295L) | (Float.floatToIntBits(f) << 32);
    }

    public static int LJ(double d, int i) {
        int max = Math.max(i, 2);
        int highestOneBit = Integer.highestOneBit(max);
        if (max > ((int) (d * highestOneBit))) {
            int i2 = highestOneBit << 1;
            if (i2 > 0) {
                return i2;
            }
            return 1073741824;
        }
        return highestOneBit;
    }

    public static boolean LJIILLIIL(TEZ isEffectDownloading, Effect effect) {
        o.LJIIIZ(isEffectDownloading, "$this$isEffectDownloading");
        o.LJIIIZ(effect, "effect");
        InterfaceC74528TMu isEffectDownloading2 = isEffectDownloading.LJJJJLL().LJIJJLI();
        o.LJIIIZ(isEffectDownloading2, "$this$isEffectDownloading");
        OSZ<EnumC74565TOf, Boolean> LIZJ = isEffectDownloading2.LIZJ(new C74397THt(effect, false, null, 6));
        if (LIZJ == null) {
            return false;
        }
        EnumC74565TOf first = LIZJ.getFirst();
        boolean booleanValue = LIZJ.getSecond().booleanValue();
        if ((first != EnumC74565TOf.PENDING && first != EnumC74565TOf.START) || !booleanValue) {
            return false;
        }
        return true;
    }

    public static final long LJIL(long j, long j2) {
        boolean z;
        float LIZLLL = C10430b1.LIZLLL(j);
        long j3 = AnonymousClass163.LIZ;
        if (j2 != j3) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) * LIZLLL;
            float LIZIZ = C10430b1.LIZIZ(j);
            if (j2 != j3) {
                return C1DF.LIZIZ(intBitsToFloat, Float.intBitsToFloat((int) (j2 & 4294967295L)) * LIZIZ);
            }
            "ScaleFactor is unspecified".toString();
            throw new IllegalStateException("ScaleFactor is unspecified");
        }
        "ScaleFactor is unspecified".toString();
        throw new IllegalStateException("ScaleFactor is unspecified");
    }

    public /* synthetic */ C1FP(C60498Nok c60498Nok, C60318Nlq c60318Nlq, String str) {
    }
}
