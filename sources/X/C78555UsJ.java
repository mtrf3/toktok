package X;

import Y.ARunnableS49S0100000_13;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkPopup;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.lynx.spark.schema.model.SparkPopupSchemaParam;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.sdk.xbridge.runtime.depend.BackPressConfig;
import com.bytedance.sdk.xbridge.runtime.depend.PopupConfig;
import com.bytedance.tux.input.TuxTextView;
import com.google.android.gms.common.GoogleApiAvailability;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.draft.model.AVDraftExtras;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.draft.model.DraftSavePreProcessException;
import com.ss.android.ugc.aweme.draft.model.DraftSavePreProcessResult;
import com.ss.android.ugc.aweme.draft.model.DraftSavePreProcessResults;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleInfoResponseData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.story.Story;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatRoomViewModel;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.setting.performance.ToolsBaseInfoConfig;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.ugc.effectplatform.model.CategoryEffectModel;
import defpackage.e1;
import fjb.a;
import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CompletedExceptionally;

/* renamed from: X.UsJ, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C78555UsJ implements InterfaceC48038ItG, InterfaceC78559UsN, InterfaceC63353Oth {
    public static final C78555UsJ LJLIL = new C78555UsJ();
    public static F9Q LJLILLLLZI;

    public static String LJJIIZI() {
        if (TextUtils.isEmpty("")) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update("".getBytes());
            byte[] digest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                int i = b & 255;
                if (i < 16) {
                    sb.append(0);
                }
                sb.append(Integer.toString(i, 16));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public static final void LJJJJ() {
        InterfaceC78558UsM.LIZ.getClass();
        InterfaceC78558UsM interfaceC78558UsM = (InterfaceC78558UsM) C78556UsK.LIZIZ.getValue();
        if (interfaceC78558UsM != null) {
            interfaceC78558UsM.LIZ();
        }
    }

    public static final EnumC58928NAu LJIIZILJ() {
        return EnumC58928NAu.COROUTINE_SUSPENDED;
    }

    public static final VideoItemParams LJFF(C222588oQ c222588oQ) {
        o.LJIIIZ(c222588oQ, "<this>");
        VideoItemParams newBuilder = VideoItemParams.newBuilder();
        newBuilder.setEventType(c222588oQ.LJ.eventType);
        newBuilder.setMyProfile(c222588oQ.LJ.isMyProfile);
        newBuilder.setPageType(c222588oQ.LJ.pageType);
        newBuilder.setFromPostList(c222588oQ.LJ.isFromPostList);
        newBuilder.setFragment(c222588oQ.LIZJ);
        newBuilder.setBaseFeedParams(c222588oQ.LJ);
        newBuilder.setFrom(c222588oQ.LJ.param.getFrom());
        newBuilder.setAwemeFromPage(c222588oQ.LJ.awemeFromPage);
        newBuilder.trackerData = c222588oQ.LJ.param.getTracker();
        return newBuilder;
    }

    public static void LJII(Object obj) {
        if (obj != null) {
        } else {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public static final void LJIILJJIL(T5T t5t) {
        o.LJIIIZ(t5t, "<this>");
        t5t.requestFocus();
        if (t5t.hasWindowFocus()) {
            if (t5t.isFocused()) {
                t5t.post(new ARunnableS49S0100000_13(t5t, 152));
                return;
            }
            return;
        }
        t5t.getViewTreeObserver().addOnWindowFocusChangeListener(new ViewTreeObserverOnWindowFocusChangeListenerC76918UGs(t5t));
    }

    public static Activity LJIILLIIL(Context context) {
        while (context != null) {
            Activity LJIJJ = C45804HyK.LJIJJ(context);
            if (LJIJJ != null) {
                return LJIJJ;
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public static int LJIJI(Context context) {
        try {
            return C16880lQ.LLLLLZIL(GoogleApiAvailability.getInstance(), C16880lQ.LLLLL(context));
        } catch (Exception unused) {
            return 1;
        }
    }

    public static final C109544Rq LJIJJ(ChatRoomViewModel chatRoomViewModel) {
        List LJIJJLI = LJIJJLI(chatRoomViewModel);
        if (LJIJJLI != null) {
            return (C109544Rq) ORZ.LJLLLL(LJIJJLI);
        }
        return null;
    }

    public static final List LJIJJLI(ChatRoomViewModel chatRoomViewModel) {
        InterfaceC99713vj interfaceC99713vj;
        if (chatRoomViewModel != null && (interfaceC99713vj = chatRoomViewModel.LJLL) != null) {
            return interfaceC99713vj.LJ();
        }
        return null;
    }

    public static final C109544Rq LJIL(ChatRoomViewModel chatRoomViewModel) {
        List LJIJJLI = LJIJJLI(chatRoomViewModel);
        if (LJIJJLI != null) {
            return (C109544Rq) ORZ.LJLLLLLL(1, LJIJJLI);
        }
        return null;
    }

    public static final CompileProbeResult LJJ(VideoPublishEditModel videoPublishEditModel) {
        o.LJIIIZ(videoPublishEditModel, "<this>");
        CompileProbeResult compileProbeResult = videoPublishEditModel.getCompileProbeResult();
        if (compileProbeResult != null && compileProbeResult.isSw()) {
            return videoPublishEditModel.getCompileProbeResult();
        }
        return null;
    }

    public static String LJJIFFI(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            StringBuilder sb = new StringBuilder();
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt > 31 && charAt < 127) {
                    sb.append(charAt);
                }
                sb.append(C16880lQ.LLLZ("\\u%04x", new Object[]{Integer.valueOf(charAt)}));
            }
            return sb.toString();
        } catch (Throwable unused) {
            return str;
        }
    }

    public static final InterfaceC67352kd LJJII(InterfaceC67352kd interfaceC67352kd) {
        C3CS c3cs;
        InterfaceC67352kd<Object> intercepted;
        o.LJIIIZ(interfaceC67352kd, "<this>");
        if (!(interfaceC67352kd instanceof C3CS) || (c3cs = (C3CS) interfaceC67352kd) == null || (intercepted = c3cs.intercepted()) == null) {
            return interfaceC67352kd;
        }
        return intercepted;
    }

    public static final boolean LJJIII(Aweme aweme) {
        o.LJIIIZ(aweme, "<this>");
        Story story = aweme.getStory();
        if (story == null || !story.isFaked()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final DraftSavePreProcessResults LJJIJL(AwemeDraft awemeDraft) {
        EditPreviewInfo LIZJ;
        o.LJIIIZ(awemeDraft, "<this>");
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        if (awemeDraft.LJJJJI.isFastImport && !awemeDraft.LJIIJJI() && (LIZJ = C41802Gas.LIZJ(awemeDraft)) != null) {
            CreativeInfo LIZIZ = awemeDraft.LIZIZ();
            ArrayList arrayList2 = new ArrayList();
            int size = LIZJ.getVideoList().size();
            int i2 = 0;
            while (i2 < size) {
                EditVideoSegment editVideoSegment = (EditVideoSegment) ListProtector.get(LIZJ.getVideoList(), i2);
                if (C78966Uyw.LJJIJIIJIL(editVideoSegment.getVideoPath()) && editVideoSegment.getVideoCutInfo() != null) {
                    VideoCutInfo videoCutInfo = editVideoSegment.getVideoCutInfo();
                    o.LJI(videoCutInfo);
                    int start = (int) videoCutInfo.getStart();
                    VideoCutInfo videoCutInfo2 = editVideoSegment.getVideoCutInfo();
                    o.LJI(videoCutInfo2);
                    int end = (int) videoCutInfo2.getEnd();
                    if (editVideoSegment.getVideoFileInfo().getDuration() - (end - start) > 5000) {
                        int[] iArr = new int[2];
                        iArr[i] = start;
                        iArr[1] = end;
                        String LIZLLL = C43073GvN.LIZLLL(C62850Ola.LJ(), LIZIZ, EnumC43649HBd.EXTERNAL_SAVE, String.valueOf(System.currentTimeMillis()), i, 8);
                        File file = new File(LIZLLL);
                        if (file.exists()) {
                            C16880lQ.LLLZZIL(file);
                        }
                        C78966Uyw.LJJJJZ(file);
                        String videoPath = editVideoSegment.getVideoPath();
                        int[] iArr2 = new int[2];
                        iArr2[i] = start;
                        iArr2[1] = end;
                        int nativeTrimFile = TEVideoUtils.nativeTrimFile(videoPath, LIZLLL, iArr2, iArr);
                        if (nativeTrimFile != 0) {
                            arrayList2.add(new DraftSavePreProcessResult(1, new DraftSavePreProcessException(nativeTrimFile - 20000, new RuntimeException(KMP.LJ("VEUtils.trimToDraft invoke ; retCode : ", nativeTrimFile)))));
                        } else {
                            List<EditVideoSegment> videoList = LIZJ.getVideoList();
                            EditVideoSegment editVideoSegment2 = new EditVideoSegment(LIZLLL, editVideoSegment.getAudioPath(), VideoFileInfo.copy$default(editVideoSegment.getVideoFileInfo(), i, i, 0L, i, i, i, i, i, 0.0f, 511, null));
                            VideoCutInfo videoCutInfo3 = editVideoSegment.getVideoCutInfo();
                            if (videoCutInfo3 != null) {
                                editVideoSegment2.setVideoCutInfo(new VideoCutInfo(iArr[i], iArr[1], videoCutInfo3.getSpeed(), videoCutInfo3.getRotate()));
                            }
                            ListProtector.set(videoList, i2, editVideoSegment2);
                        }
                    }
                }
                i2++;
                i = 0;
            }
            arrayList.addAll(arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        if (C41647GWd.LIZ() || C41649GWf.LIZ()) {
            AVDraftExtras aVDraftExtras = awemeDraft.LJJJJI;
            if (aVDraftExtras.creationMode == 2 && aVDraftExtras.imageAlbumData == null) {
                arrayList3.add(new DraftSavePreProcessResult(0, new DraftSavePreProcessException(-513, new IllegalStateException("Image Mode album data is null")), 1, null));
            }
        }
        C43659HBn.LJJIIJ(awemeDraft);
        return new DraftSavePreProcessResults(System.currentTimeMillis() - currentTimeMillis, arrayList3, arrayList);
    }

    public static final void LJJJJIZL(ShortVideoContext shortVideoContext) {
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        if (!C78548UsC.LIZ()) {
            return;
        }
        C78553UsH c78553UsH = C3B9.LIZ;
        c78553UsH.LIZ = shortVideoContext.LJI();
        c78553UsH.LJFF = shortVideoContext.shootWay;
        c78553UsH.LJIILIIL = Boolean.valueOf(C6H4.LJFF(shortVideoContext.creativeModel.stickerModel));
        C78542Us6 c78542Us6 = C3B0.LIZ;
        c78542Us6.LIZ = shortVideoContext.LJI();
        c78542Us6.LJFF = shortVideoContext.shootWay;
    }

    public static final void LJJJJJ(VideoPublishEditModel videoPublishEditModel) {
        boolean z;
        ToolsBaseInfoConfig value = (ToolsBaseInfoConfig) C78548UsC.LIZJ.getValue();
        o.LJIIIIZZ(value, "value");
        if (!value.getEnable()) {
            return;
        }
        C78553UsH c78553UsH = C3B9.LIZ;
        boolean z2 = false;
        if (videoPublishEditModel != null) {
            c78553UsH.LIZ = videoPublishEditModel.getCreationId();
            c78553UsH.LIZIZ = videoPublishEditModel.enterFrom;
            c78553UsH.LIZJ = H7R.LJIIIIZZ(videoPublishEditModel);
            c78553UsH.LIZLLL = H7R.LJIIIZ(videoPublishEditModel);
            c78553UsH.LJ = Boolean.valueOf(C60903NvH.LJIIJJI().getPublishService().LJJI(videoPublishEditModel));
            c78553UsH.LJFF = videoPublishEditModel.mShootWay;
            if (C44228HXk.LIZJ() == 1) {
                z = true;
            } else {
                z = false;
            }
            c78553UsH.LJII = Boolean.valueOf(z);
            c78553UsH.LJI = videoPublishEditModel.getEditEffectListStr();
            c78553UsH.LJIIJ = videoPublishEditModel.getInfoStickerList();
            c78553UsH.LJIIIZ = videoPublishEditModel.getFilterIds();
            c78553UsH.LJIIJJI = videoPublishEditModel.getStickers();
            c78553UsH.LJIIL = videoPublishEditModel.getMusicId();
            c78553UsH.LJIILL = Integer.valueOf(videoPublishEditModel.getPreviewInfo().getPreviewVideoLength());
            c78553UsH.LJIIIIZZ = Boolean.valueOf(C60903NvH.LJIIJJI().getPublishService().LJIILJJIL(videoPublishEditModel));
            c78553UsH.LJIILIIL = Boolean.valueOf(C6H4.LJFF(videoPublishEditModel.creativeModel.stickerModel));
        }
        C78542Us6 c78542Us6 = C3B0.LIZ;
        if (videoPublishEditModel != null) {
            c78542Us6.LIZ = videoPublishEditModel.getCreationId();
            c78542Us6.LIZIZ = videoPublishEditModel.enterFrom;
            c78542Us6.LIZJ = H7R.LJIIIIZZ(videoPublishEditModel);
            c78542Us6.LIZLLL = H7R.LJIIIZ(videoPublishEditModel);
            c78542Us6.LJ = Boolean.valueOf(C60903NvH.LJIIJJI().getPublishService().LJJI(videoPublishEditModel));
            c78542Us6.LJFF = videoPublishEditModel.mShootWay;
            if (C44228HXk.LIZJ() == 1) {
                z2 = true;
            }
            c78542Us6.LJII = Boolean.valueOf(z2);
            c78542Us6.LJI = videoPublishEditModel.getEditEffectListStr();
            c78542Us6.LJIIJ = videoPublishEditModel.getInfoStickerList();
            c78542Us6.LJIIIZ = videoPublishEditModel.getFilterIds();
            c78542Us6.LJIIJJI = videoPublishEditModel.getStickers();
            c78542Us6.LJIIL = videoPublishEditModel.getMusicId();
            c78542Us6.LJIILL = Integer.valueOf(videoPublishEditModel.getPreviewInfo().getPreviewVideoLength());
            c78542Us6.LJIIIIZZ = Boolean.valueOf(C60903NvH.LJIIJJI().getPublishService().LJIILJJIL(videoPublishEditModel));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        CategoryEffectModel it = (CategoryEffectModel) obj;
        o.LJIIIZ(it, "it");
        return new CategoryPageModel(new com.ss.ugc.effectplatform.model.CategoryPageModel(it, null, 0 == true ? 1 : 0, 6, 0 == true ? 1 : 0));
    }

    @Override // X.InterfaceC63353Oth
    public /* bridge */ /* synthetic */ void LIZLLL(Object obj) {
    }

    public static void LJI(Object obj, String str) {
        if (obj != null) {
        } else {
            throw new NullPointerException(str);
        }
    }

    public static final long LJIIIIZZ(long j, long j2) {
        return C78996UzQ.LIZIZ(C78842Uww.LJIIL((int) (j2 >> 32), C23360vs.LJIIIZ(j), C23360vs.LJII(j)), C78842Uww.LJIIL(C23490w5.LIZIZ(j2), C23360vs.LJIIIIZZ(j), C23360vs.LJI(j)));
    }

    public static final long LJIIIZ(long j, long j2) {
        return LIZJ(C78842Uww.LJIIL(C23360vs.LJIIIZ(j2), C23360vs.LJIIIZ(j), C23360vs.LJII(j)), C78842Uww.LJIIL(C23360vs.LJII(j2), C23360vs.LJIIIZ(j), C23360vs.LJII(j)), C78842Uww.LJIIL(C23360vs.LJIIIIZZ(j2), C23360vs.LJIIIIZZ(j), C23360vs.LJI(j)), C78842Uww.LJIIL(C23360vs.LJI(j2), C23360vs.LJIIIIZZ(j), C23360vs.LJI(j)));
    }

    public static final int LJIIJ(int i, long j) {
        return C78842Uww.LJIIL(i, C23360vs.LJIIIIZZ(j), C23360vs.LJI(j));
    }

    public static final int LJIIJJI(int i, long j) {
        return C78842Uww.LJIIL(i, C23360vs.LJIIIZ(j), C23360vs.LJII(j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC67352kd LJIIL(InterfaceC88472Yns interfaceC88472Yns, InterfaceC67352kd completion) {
        o.LJIIIZ(interfaceC88472Yns, "<this>");
        o.LJIIIZ(completion, "completion");
        if (interfaceC88472Yns instanceof a) {
            return ((a) interfaceC88472Yns).create(completion);
        }
        MBA context = completion.getContext();
        if (context == MBB.INSTANCE) {
            return new C66609QCf(completion, interfaceC88472Yns);
        }
        return new C66611QCh(completion, context, interfaceC88472Yns);
    }

    public static final TuxTextView LJIJ(Context context, CharSequence charSequence) {
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        float f = 32;
        C26338AVi.LJI(tuxTextView, Integer.valueOf(O6R.LJJIIZ(TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics()))), 0, Integer.valueOf(O6R.LJJIIZ(TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics()))), 0, false, 16);
        tuxTextView.setText(charSequence);
        tuxTextView.setMovementMethod(AnonymousClass898.LIZ);
        return tuxTextView;
    }

    public static String LJJIIJ(InterfaceC63833P3l interfaceC63833P3l, String str) {
        if (!TextUtils.isEmpty(str) && interfaceC63833P3l != null) {
            String LIZ = interfaceC63833P3l.LIZ(str);
            if (!TextUtils.isEmpty(LIZ)) {
                return LIZ;
            }
            return null;
        }
        return null;
    }

    public static final int LJJIIZ(NLEModel nLEModel, VideoPublishEditModel videoPublishEditModel) {
        List<C122224qw> LIZ;
        int hashCode;
        Number number;
        long j;
        o.LJIIIZ(videoPublishEditModel, "<this>");
        H7B.LIZ("AudioCopyrightDetect -> materialHash() start");
        HashMap<String, String> pathMap = videoPublishEditModel.creativeModel.audioCopyrightDetectModel.getPathMap();
        int i = 0;
        int i2 = 0;
        for (EditVideoSegment editVideoSegment : videoPublishEditModel.getPreviewInfo().getVideoList()) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("AudioCopyrightDetect -> materialHash() -> segment.videoPath = ");
            LIZ2.append(editVideoSegment.getVideoPath());
            H7B.LIZ(X1D.LIZIZ(LIZ2));
            if (pathMap.containsKey(editVideoSegment.getVideoPath())) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("AudioCopyrightDetect -> materialHash() -> HashCode = ");
                LIZ3.append(pathMap.get(editVideoSegment.getVideoPath()));
                H7B.LIZ(X1D.LIZIZ(LIZ3));
                String str = pathMap.get(editVideoSegment.getVideoPath());
                if (str != null) {
                    hashCode = str.hashCode();
                } else {
                    hashCode = 0;
                }
            } else {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("AudioCopyrightDetect -> materialHash() -> HashCode = ");
                LIZ4.append(editVideoSegment.getVideoPath());
                H7B.LIZ(X1D.LIZIZ(LIZ4));
                hashCode = editVideoSegment.getVideoPath().hashCode();
            }
            int i3 = i2 + hashCode;
            VideoCutInfo videoCutInfo = editVideoSegment.getVideoCutInfo();
            if (videoCutInfo != null) {
                number = Float.valueOf(videoCutInfo.getSpeed());
            } else {
                number = 0;
            }
            int hashCode2 = number.hashCode() + i3;
            VideoCutInfo videoCutInfo2 = editVideoSegment.getVideoCutInfo();
            long j2 = 0;
            if (videoCutInfo2 != null) {
                j = videoCutInfo2.getStart();
            } else {
                j = 0;
            }
            int LLJIJIL = C16880lQ.LLJIJIL(j) + hashCode2;
            VideoCutInfo videoCutInfo3 = editVideoSegment.getVideoCutInfo();
            if (videoCutInfo3 != null) {
                j2 = videoCutInfo3.getEnd();
            }
            i2 = LLJIJIL + C16880lQ.LLJIJIL(j2);
        }
        if (nLEModel == null) {
            String str2 = videoPublishEditModel.nleData;
            if (str2 == null || str2.length() == 0) {
                LIZ = new ArrayList();
            } else {
                NLEEditor nLEEditor = new NLEEditor();
                nLEEditor.LJI(str2);
                LIZ = C120734oX.LIZ(nLEEditor.LJ());
            }
        } else {
            LIZ = C120734oX.LIZ(nLEModel);
        }
        for (C122224qw c122224qw : LIZ) {
            i2 += C16880lQ.LLJIJIL(c122224qw.LIZIZ + c122224qw.LIZJ + c122224qw.LJ + c122224qw.LIZLLL);
        }
        if (videoPublishEditModel.voiceVolume > 0.0f) {
            i = 1;
        }
        int i4 = i2 + i;
        AudioRecorderParam audioRecorderParam = videoPublishEditModel.veAudioRecorderParam;
        if (audioRecorderParam != null) {
            return (videoPublishEditModel.veAudioRecorderParam.getNeedOriginalSound() ? 1 : 0) + (audioRecorderParam.getHasOriginalSound() ? 1 : 0) + i4;
        }
        return i4;
    }

    public static final void LJJIJIL(T5T t5t, InterfaceC65784Pro interfaceC65784Pro) {
        o.LJIIIZ(t5t, "<this>");
        t5t.requestFocus();
        if (t5t.hasWindowFocus()) {
            interfaceC65784Pro.invoke();
        } else {
            t5t.getViewTreeObserver().addOnWindowFocusChangeListener(new ViewTreeObserverOnWindowFocusChangeListenerC61007Nwx(t5t, interfaceC65784Pro));
        }
    }

    public static final void LJJIJLIJ(int i, View view) {
        o.LJIIIZ(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
        view.requestLayout();
    }

    public static final boolean LJJIL(Activity activity, VideoPublishEditModel videoPublishEditModel) {
        o.LJIIIZ(videoPublishEditModel, "<this>");
        o.LJIIIZ(activity, "activity");
        if (videoPublishEditModel.isPrivate() == 1 || !C1B8.LIZJ() || !yq4.a.LJFF().LJJIIZ(activity) || H7R.LJJJJL(videoPublishEditModel) || !C151965xo.LIZJ(videoPublishEditModel)) {
            return false;
        }
        return true;
    }

    public static final boolean LJJIZ(Activity activity, VideoPublishEditModel videoPublishEditModel) {
        o.LJIIIZ(videoPublishEditModel, "<this>");
        o.LJIIIZ(activity, "activity");
        if (e1.LIZ(31744, "studio_story_lightning_editpage_popup_with_settings_up", true, false) && LJJIL(activity, videoPublishEditModel)) {
            return true;
        }
        return false;
    }

    public static final boolean LJJJ(Activity activity, VideoPublishEditModel videoPublishEditModel) {
        o.LJIIIZ(videoPublishEditModel, "<this>");
        o.LJIIIZ(activity, "activity");
        if (e1.LIZ(31744, "studio_story_lightning_editpage_popup_remove", true, false) && LJJIL(activity, videoPublishEditModel) && (!IMService.createIIMServicebyMonsterPlugin(false).getCameraService().LIZ() || !videoPublishEditModel.isEnterFromDM())) {
            return true;
        }
        return false;
    }

    public static final C35635Dyh LJJJJI(ProductPackStruct productPackStruct, BundleInfoResponseData bundleInfoResponseData) {
        o.LJIIIZ(productPackStruct, "<this>");
        return new C35635Dyh(bundleInfoResponseData);
    }

    @Override // X.InterfaceC78559UsN
    public void LIZ(InterfaceC38263Ezz interfaceC38263Ezz, PopupConfig popupConfig) {
        InterfaceC37930Euc interfaceC37930Euc;
        String LIZ;
        if (interfaceC38263Ezz != null && (interfaceC37930Euc = (InterfaceC37930Euc) interfaceC38263Ezz.LJ(InterfaceC37930Euc.class)) != null && (LIZ = interfaceC37930Euc.LIZ()) != null) {
            SparkContext.Companion.getClass();
            InterfaceC40159FpT LIZ2 = C39359FcZ.LIZ(LIZ);
            if (LIZ2 != null && (LIZ2 instanceof SparkPopup)) {
                Integer enablePullDownClose = popupConfig.getEnablePullDownClose();
                if (enablePullDownClose != null) {
                    if (enablePullDownClose.intValue() == 1) {
                        ((SparkPopup) LIZ2).Ql(true);
                    } else if (enablePullDownClose.intValue() == 0) {
                        ((SparkPopup) LIZ2).Ql(false);
                    }
                }
                Integer disableMaskClickClose = popupConfig.getDisableMaskClickClose();
                if (disableMaskClickClose == null) {
                    return;
                }
                if (disableMaskClickClose.intValue() == 1) {
                    SparkPopupSchemaParam sparkPopupSchemaParam = ((SparkPopup) LIZ2).LJLL;
                    if (sparkPopupSchemaParam != null) {
                        sparkPopupSchemaParam.setDisableOutsideClickClose(true);
                        return;
                    } else {
                        o.LJIJI("schemaParam");
                        throw null;
                    }
                }
                if (disableMaskClickClose.intValue() != 0) {
                    return;
                }
                SparkPopupSchemaParam sparkPopupSchemaParam2 = ((SparkPopup) LIZ2).LJLL;
                if (sparkPopupSchemaParam2 != null) {
                    sparkPopupSchemaParam2.setDisableOutsideClickClose(false);
                } else {
                    o.LJIJI("schemaParam");
                    throw null;
                }
            }
        }
    }

    @Override // X.InterfaceC78559UsN
    public void LIZIZ(InterfaceC38263Ezz interfaceC38263Ezz, BackPressConfig backPressConfig) {
        InterfaceC37930Euc interfaceC37930Euc;
        String LIZ;
        Integer disableBackPress;
        if (interfaceC38263Ezz == null || (interfaceC37930Euc = (InterfaceC37930Euc) interfaceC38263Ezz.LJ(InterfaceC37930Euc.class)) == null || (LIZ = interfaceC37930Euc.LIZ()) == null || (disableBackPress = backPressConfig.getDisableBackPress()) == null) {
            return;
        }
        if (disableBackPress.intValue() == 1) {
            C37789EsL.LIZIZ.put(LIZ, Boolean.TRUE);
        } else {
            if (disableBackPress.intValue() != 0) {
                return;
            }
            C37789EsL.LIZIZ.put(LIZ, Boolean.FALSE);
        }
    }

    public static /* synthetic */ long LJ(int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i = Integer.MAX_VALUE;
        }
        if ((i3 & 8) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        return LIZJ(0, i, 0, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC67352kd LJIILIIL(InterfaceC88471Ynr interfaceC88471Ynr, Object obj, InterfaceC67352kd completion) {
        o.LJIIIZ(interfaceC88471Ynr, "<this>");
        o.LJIIIZ(completion, "completion");
        if (interfaceC88471Ynr instanceof a) {
            return ((a) interfaceC88471Ynr).create(obj, completion);
        }
        MBA context = completion.getContext();
        if (context == MBB.INSTANCE) {
            return new C66608QCe(completion, interfaceC88471Ynr, obj);
        }
        return new C66610QCg(completion, context, interfaceC88471Ynr, obj);
    }

    public static C122144qo LJIILL(VideoPublishEditModel videoPublishEditModel, boolean z, int i) {
        boolean z2;
        if ((i & 1) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        o.LJIIIZ(videoPublishEditModel, "<this>");
        boolean LJFF = H7R.LJFF(videoPublishEditModel);
        int i2 = videoPublishEditModel.autoEnhanceType;
        boolean LIZ = C1539462k.LIZ();
        String LIZIZ = C1539462k.LIZIZ();
        boolean LIZ2 = C136345Ws.LIZ(videoPublishEditModel, z);
        InterfaceC43072GvM LJ = C62850Ola.LJ();
        CreativeInfo creativeInfo = videoPublishEditModel.creativeInfo;
        o.LJIIIIZZ(creativeInfo, "model.creativeInfo");
        return new C122144qo(LJFF, i2, z2, LIZ, LIZIZ, new C122154qp(C43073GvN.LIZIZ(LJ, creativeInfo, EnumC43650HBe.VE_LENS_ONE_KEY_HDR, null, 12), LIZ2, C136345Ws.LIZ(videoPublishEditModel, z)));
    }

    public static final void LJJIIJZLJL(C64797Pbt c64797Pbt, String str, Object value) {
        C48489J1h c48489J1h;
        o.LJIIIZ(value, "value");
        if (C48488J1g.LIZ) {
            c48489J1h = (C48489J1h) C48488J1g.LIZJ.getValue();
        } else {
            c48489J1h = C48488J1g.LIZIZ;
            if (c48489J1h == null) {
                o.LJIJI("config");
                throw null;
            }
        }
        c48489J1h.LIZIZ(c64797Pbt, str, value);
    }

    public static final long LJJIJIIJIL(int i, int i2, long j) {
        int LJIIIZ = C23360vs.LJIIIZ(j) + i;
        int i3 = 0;
        if (LJIIIZ < 0) {
            LJIIIZ = 0;
        }
        int LJII = C23360vs.LJII(j);
        if (LJII != Integer.MAX_VALUE && (LJII = LJII + i) < 0) {
            LJII = 0;
        }
        int LJIIIIZZ = C23360vs.LJIIIIZZ(j) + i2;
        if (LJIIIIZZ < 0) {
            LJIIIIZZ = 0;
        }
        int LJI = C23360vs.LJI(j);
        if (LJI == Integer.MAX_VALUE || (LJI = LJI + i2) >= 0) {
            i3 = LJI;
        }
        return LIZJ(LJIIIZ, LJII, LJIIIIZZ, i3);
    }

    public static final void LJJJI(C3C9 c3c9, Object obj, InterfaceC67352kd completion) {
        o.LJIIIZ(completion, "completion");
        try {
            C65777Prh.LJ(2, c3c9);
            Object invoke = c3c9.invoke(obj, completion);
            if (invoke != EnumC58928NAu.COROUTINE_SUSPENDED) {
                C3C5.m7constructorimpl(invoke);
                completion.resumeWith(invoke);
            }
        } catch (Throwable th) {
            OUR.LJ(th, completion);
        }
    }

    public static final Object LJJJIL(C84662XKo c84662XKo, C84662XKo c84662XKo2, InterfaceC88471Ynr interfaceC88471Ynr) {
        Object completedExceptionally;
        Object LJJLIIIIJ;
        int i = 2;
        try {
        } catch (Throwable th) {
            completedExceptionally = new CompletedExceptionally(th, false, i, null);
        }
        if (interfaceC88471Ynr != null) {
            C65777Prh.LJ(2, interfaceC88471Ynr);
            completedExceptionally = interfaceC88471Ynr.invoke(c84662XKo2, c84662XKo);
            EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
            if (completedExceptionally == enumC58928NAu || (LJJLIIIIJ = c84662XKo.LJJLIIIIJ(completedExceptionally)) == C84667XKt.LIZIZ) {
                return enumC58928NAu;
            }
            if (!(LJJLIIIIJ instanceof CompletedExceptionally)) {
                return C84667XKt.LIZ(LJJLIIIIJ);
            }
            throw ((CompletedExceptionally) LJJLIIIIJ).cause;
        }
        throw new NullPointerException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
    }

    public static final long LIZJ(int i, int i2, int i3, int i4) {
        boolean z;
        if (i2 >= i) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i4 >= i3) {
                if (i >= 0 && i3 >= 0) {
                    return C23350vr.LIZIZ(i, i2, i3, i4);
                }
                String LJIIJJI = C48690J9a.LJIIJJI("minWidth(", i, ") and minHeight(", i3, ") must be >= 0");
                LJIIJJI.toString();
                throw new IllegalArgumentException(LJIIJJI);
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("maxHeight(");
            LIZ.append(i4);
            LIZ.append(") must be >= than minHeight(");
            LIZ.append(i3);
            LIZ.append(')');
            String LIZIZ = X1D.LIZIZ(LIZ);
            LIZIZ.toString();
            throw new IllegalArgumentException(LIZIZ);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("maxWidth(");
        LIZ2.append(i2);
        LIZ2.append(") must be >= than minWidth(");
        LIZ2.append(i);
        LIZ2.append(')');
        String LIZIZ2 = X1D.LIZIZ(LIZ2);
        LIZIZ2.toString();
        throw new IllegalArgumentException(LIZIZ2);
    }

    public static int LJJI(int i, int i2, int i3, int i4) {
        double parseDouble;
        double parseDouble2;
        if (i <= 0 || i2 <= 0) {
            return 1;
        }
        if (i <= i2 || i3 >= i4) {
            if (i < i2 && i3 > i4) {
                return 2;
            }
            double d = i / i2;
            double d2 = i3 / i4;
            try {
                Locale locale = Locale.US;
                parseDouble = CastDoubleProtector.parseDouble(C16880lQ.LLLZI(locale, "%.2f", new Object[]{Double.valueOf(d)}));
                parseDouble2 = CastDoubleProtector.parseDouble(C16880lQ.LLLZI(locale, "%.2f", new Object[]{Double.valueOf(d2)}));
            } catch (Throwable th) {
                C36922EeM.LJFF(th);
            }
            if (parseDouble <= LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX || parseDouble2 <= LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX || parseDouble == parseDouble2) {
                return 0;
            }
            return 3;
        }
        return 2;
    }

    public static final void LJJIJIIJI(Long l, long j, long j2, long j3, long j4, long j5) {
        long j6;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (l != null) {
            j6 = l.longValue();
        } else {
            j6 = 0;
        }
        linkedHashMap.put("fragmentId", Long.valueOf(j6));
        linkedHashMap.put("room_id", Long.valueOf(j));
        linkedHashMap.put("current_time", Long.valueOf(j2));
        linkedHashMap.put("start_live_time", Long.valueOf(j3));
        linkedHashMap.put("live_duration", Long.valueOf(j4));
        linkedHashMap.put("last_record_time", Long.valueOf(j5));
        C0K2.LJII(0, O5Y.LJJL("ttlive_highlight_button_click_result"), linkedHashMap);
    }

    public static final void LJJIJ(int i, int i2, long j, long j2, long j3, long j4, long j5, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("error_code", Integer.valueOf(i));
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("error_msg", str);
        linkedHashMap.put("error_type", Integer.valueOf(i2));
        linkedHashMap.put("current_time", Long.valueOf(j));
        linkedHashMap.put("start_live_time", Long.valueOf(j2));
        linkedHashMap.put("live_duration", Long.valueOf(j3));
        linkedHashMap.put("last_record_time", Long.valueOf(j4));
        linkedHashMap.put("room_id", Long.valueOf(j5));
        C0K2.LJII(1, O5Y.LJJL("ttlive_highlight_button_click_result"), linkedHashMap);
    }
}
