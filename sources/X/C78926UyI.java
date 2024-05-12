package X;

import android.text.Editable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3GuestGoLivePreviewPanelOpt;
import com.bytedance.android.livesdk.model.KaraokeSong;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.effecteditor.swig.UIAnnotationErrorCode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.j;
import com.google.gson.m;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.canvas.CanvasExtra;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.model.CutSameModel;
import com.ss.android.ugc.aweme.draft.model.DraftVideoSegment;
import com.ss.android.ugc.aweme.ecommerce.smartcheck.core.roma.RomaJoinPatternItem;
import com.ss.android.ugc.aweme.ecommerce.smartcheck.core.roma.RomaPatternKey;
import com.ss.android.ugc.aweme.ecommerce.smartcheck.core.roma.RomaPatternOption;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VolumeAdjustmentExperimentParams;
import com.ss.android.ugc.feed.platform.container.core.BaseContainer;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffectResponse;
import com.ss.android.vesdk.VECherEffectParam;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.VEUtils;
import com.ss.ugc.android.editor.base.resource.ResourceItem;
import dmt.av.video.VEPreviewParams;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS58S0110000_1;
import kotlin.jvm.internal.AqS60S0110000_3;
import kotlin.jvm.internal.AqS61S0110000_4;
import kotlin.jvm.internal.o;
import ujb.s;
import webcast.data.ReqSong;

/* renamed from: X.UyI */
/* loaded from: classes14.dex */
public class C78926UyI implements InterfaceC73592SuS, C2V, InterfaceC1296256w {
    public static final C78926UyI LJLIL = new C78926UyI();

    @Override // X.InterfaceC30685C2n
    public void onSuccess() {
    }

    public static final boolean LJJIJIL() {
        MultiGuestDataHolder LIZ = TRK.LIZ();
        if (LIZ != null && C78857UxB.LJJJI(LIZ.LJJIJLIJ)) {
            return LJJIJLIJ(C29306Beo.LJJIL(DataChannelGlobal.LJLJJI));
        }
        MultiGuestDataHolder LIZ2 = TRK.LIZ();
        if (LIZ2 == null || !C78857UxB.LJJJ(LIZ2.LJJIJLIJ)) {
            return false;
        }
        return LJJIJL(C29306Beo.LJJIL(DataChannelGlobal.LJLJJI));
    }

    public static void LJIIIIZZ(File file) {
        File[] listFiles;
        if (file == null) {
            return;
        }
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                LJIIIIZZ(file2);
            }
        }
        C16880lQ.LLLZZIL(file);
    }

    public static final String LJIIJ(int[] iArr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i : iArr) {
            sb.append(i);
            sb.append(", ");
        }
        return C0EH.LIZJ(sb, "]", "strBuilder.toString()");
    }

    public static final AqS153S0100000_3 LJIIJJI(ActivityC45651qj activityC45651qj) {
        o.LJIIIZ(activityC45651qj, "<this>");
        return new AqS153S0100000_3(activityC45651qj, 1476);
    }

    public static final int LJIILIIL(JQX jqx) {
        JP7 LLLLIIL;
        if (jqx != null && (LLLLIIL = jqx.LLLLIIL()) != null) {
            return LLLLIIL.LLJJJ();
        }
        return -1;
    }

    public static final AqS153S0100000_3 LJIILL(ActivityC45651qj activityC45651qj) {
        o.LJIIIZ(activityC45651qj, "<this>");
        return new AqS153S0100000_3(activityC45651qj, 1477);
    }

    public static final int LJIJ(JQX jqx) {
        JP7 LLLLIIL;
        if (jqx != null && (LLLLIIL = jqx.LLLLIIL()) != null) {
            return LLLLIIL.LJLL();
        }
        return -1;
    }

    public static final AqS153S0100000_3 LJIJJ(C8W0 c8w0) {
        o.LJIIIZ(c8w0, "<this>");
        return new AqS153S0100000_3(c8w0, 1478);
    }

    public static final java.util.Map LJIJJLI(android.net.Uri uri) {
        String[] strArr = {"x-use-ppe", "ppe", "x-use-boe", "boe"};
        ArrayList arrayList = new ArrayList(4);
        int i = 0;
        do {
            String str = strArr[i];
            arrayList.add(new OSZ(str, LJJJJI(uri, str)));
            i++;
        } while (i < 4);
        java.util.Map LJJLIIIJLJLI = C113554cx.LJJLIIIJLJLI(arrayList);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : LJJLIIIJLJLI.entrySet()) {
            if (!TextUtils.isEmpty((CharSequence) entry.getValue())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public static final String LJIL(C58055MqR c58055MqR) {
        o.LJIIIZ(c58055MqR, "<this>");
        if (c58055MqR == C58050MqM.LIZIZ || c58055MqR == C58050MqM.LIZLLL || c58055MqR == C58050MqM.LIZJ) {
            return "card";
        }
        if (c58055MqR == C58050MqM.LJIIJ || c58055MqR == C58050MqM.LJIIJJI || c58055MqR == C58050MqM.LJIJ || o.LJ(c58055MqR, C58050MqM.LJIJI)) {
            return "item";
        }
        if (c58055MqR == C58050MqM.LJIIL || c58055MqR == C58050MqM.LJIILL || c58055MqR == C58050MqM.LJIILLIIL || c58055MqR == C58050MqM.LJIIZILJ || c58055MqR == C58050MqM.LJI || c58055MqR == C58050MqM.LJII || c58055MqR == C58050MqM.LJ || c58055MqR == C58050MqM.LJFF || c58055MqR == C58050MqM.LJIIIIZZ || c58055MqR == C58050MqM.LJIIIZ || c58055MqR == C58050MqM.LJIILIIL || c58055MqR == C58050MqM.LJIILJJIL) {
            return "relation_label";
        }
        return "";
    }

    public static final AqS153S0100000_3 LJJI(C8W0 c8w0) {
        o.LJIIIZ(c8w0, "<this>");
        return new AqS153S0100000_3(c8w0, 1479);
    }

    public static final AqS153S0100000_3 LJJIFFI(C8W0 c8w0) {
        o.LJIIIZ(c8w0, "<this>");
        return new AqS153S0100000_3(c8w0, 1480);
    }

    public static final int LJJIII(EditText editText) {
        if (editText == null) {
            return 0;
        }
        try {
            String obj = editText.getText().toString();
            Editable text = editText.getText();
            o.LJIIIIZZ(text, "text");
            if (s.LJJLI(text, " ")) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(s.LJLL(obj, new C40517FvF(0, obj.length() - 2)));
                LIZ.append('-');
                obj = X1D.LIZIZ(LIZ);
            }
            return new StaticLayout(obj, editText.getPaint(), editText.getMaxWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount();
        } catch (Exception unused) {
            return 0;
        }
    }

    public static boolean LJJIIZ(IXO ixo) {
        if (ixo != null) {
            if (ixo.LIZIZ != null) {
                return true;
            }
            if (!TextUtils.isEmpty(ixo.LJ)) {
                return ixo.LJIIIIZZ;
            }
        }
        return false;
    }

    public static final boolean LJJIJIIJI(C10410az c10410az) {
        o.LJIIIZ(c10410az, "<this>");
        if (C10340as.LIZIZ(c10410az.LJ) == C10340as.LIZJ(c10410az.LJ) && C10340as.LIZIZ(c10410az.LJ) == C10340as.LIZIZ(c10410az.LJFF) && C10340as.LIZIZ(c10410az.LJ) == C10340as.LIZJ(c10410az.LJFF) && C10340as.LIZIZ(c10410az.LJ) == C10340as.LIZIZ(c10410az.LJI) && C10340as.LIZIZ(c10410az.LJ) == C10340as.LIZJ(c10410az.LJI) && C10340as.LIZIZ(c10410az.LJ) == C10340as.LIZIZ(c10410az.LJII) && C10340as.LIZIZ(c10410az.LJ) == C10340as.LIZJ(c10410az.LJII)) {
            return true;
        }
        return false;
    }

    public static final boolean LJJIJIIJIL(MobileEffectResponse mobileEffectResponse) {
        o.LJIIIZ(mobileEffectResponse, "<this>");
        if (mobileEffectResponse.statusCode == 0) {
            return true;
        }
        return false;
    }

    public static final boolean LJJIJL(Room room) {
        if (!MultiGuestV3GuestGoLivePreviewPanelOpt.INSTANCE.enableCloseAndPauseAndSilentMicWhenInPreviewPanel() || room == null || room.getHostWebcastSdkVersion() < 2480) {
            return false;
        }
        return true;
    }

    public static final boolean LJJIJLIJ(Room room) {
        if (!MultiGuestV3GuestGoLivePreviewPanelOpt.INSTANCE.isSupportPauseGoLiveInPreviewPanel() || room == null || room.getHostWebcastSdkVersion() < 2480) {
            return false;
        }
        return true;
    }

    public static final int LJJIZ(long j) {
        return (int) TimeUnit.MICROSECONDS.toMillis(j);
    }

    public static final long LJJJ(int i) {
        return TimeUnit.MILLISECONDS.toMicros(i);
    }

    public static final long LJJJI(long j) {
        return TimeUnit.MILLISECONDS.toMicros(j);
    }

    public static final void LJJJIL(EnumC14070gt notificationType) {
        o.LJIIIZ(notificationType, "notificationType");
        BZI LIZ = C28787BRn.LIZ("livesdk_live_guide_notification_close_click");
        C06510Nj.LIZ((C29374Bfu) B83.LIZ().LIZIZ(), LIZ, "anchor_id");
        LIZ.LJIJJ(LiveMode.SCREEN_RECORD.logStreamingType, "live_type");
        LIZ.LJIJJ(notificationType.getValue(), "notification_type");
        LIZ.LJIJJ("hover", "event_page");
        LIZ.LJJIIJZLJL();
    }

    public static final void LJJJJIZL(EditText editText) {
        if (editText == null) {
            return;
        }
        editText.setFocusable(true);
        editText.setFocusableInTouchMode(true);
        editText.requestFocus();
        KeyboardUtils.LIZLLL(editText);
        editText.setSelection(editText.getText().length());
    }

    public static final EditVideoSegment LJJJJJ(DraftVideoSegment draftVideoSegment) {
        o.LJIIIZ(draftVideoSegment, "<this>");
        String str = draftVideoSegment.videoPath;
        EditVideoSegment editVideoSegment = new EditVideoSegment(str, draftVideoSegment.audioPath, LJJJLZIJ(str));
        editVideoSegment.setVideoCutInfo(new VideoCutInfo(draftVideoSegment.start, draftVideoSegment.end, draftVideoSegment.speed, draftVideoSegment.rotate));
        return editVideoSegment;
    }

    public static final EditVideoSegment LJJJJJL(VideoSegment videoSegment) {
        o.LJIIIZ(videoSegment, "<this>");
        String LJII = videoSegment.LJII(false);
        LJII.toString();
        EditVideoSegment editVideoSegment = new EditVideoSegment(LJII, null, new VideoFileInfo(videoSegment.width, videoSegment.height, videoSegment.duration, videoSegment.LJI(), videoSegment.LIZIZ(), 0, 0, 0, 0.0f, 480, null));
        editVideoSegment.setVideoCutInfo(new VideoCutInfo(videoSegment.LJIIIZ(), videoSegment.LJ(), videoSegment.LJIIIIZZ(), videoSegment.rotate));
        return editVideoSegment;
    }

    public static final VideoFileInfo LJJJJZI(VEUtils.VEVideoFileInfo vEVideoFileInfo) {
        return new VideoFileInfo(vEVideoFileInfo.width, vEVideoFileInfo.height, vEVideoFileInfo.duration, vEVideoFileInfo.fps, vEVideoFileInfo.bitrate, vEVideoFileInfo.codec, vEVideoFileInfo.keyFrameCount, 0, vEVideoFileInfo.floatFPS, 128, null);
    }

    public static final JGI LJJJLL(JQX jqx) {
        InterfaceC48907JHj interfaceC48907JHj;
        if (jqx != null) {
            interfaceC48907JHj = jqx.getPlayerView();
        } else {
            interfaceC48907JHj = null;
        }
        if (!(interfaceC48907JHj instanceof C48887JGp)) {
            return null;
        }
        return ((C48887JGp) interfaceC48907JHj).getCore();
    }

    public static final VideoFileInfo LJJJLZIJ(String str) {
        int[] iArr = new int[10];
        if (str != null && VEUtils.getVideoFileInfo(str, iArr) == 0) {
            return new VideoFileInfo(iArr[0], iArr[1], iArr[3], iArr[7], iArr[6], 0, 0, 0, 0.0f, 480, null);
        }
        return new VideoFileInfo(0, 0, 0L, 0, 0, 0, 0, 0, 0.0f, 496, null);
    }

    @Override // X.C2V
    public void LIZIZ(UIAnnotationErrorCode uIAnnotationErrorCode) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DiyPropParser#previewText errorCode:");
        LIZ.append(uIAnnotationErrorCode);
        H78.LIZIZ("DiyProp", X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC73592SuS
    public boolean test(Object it) {
        o.LJIIIZ(it, "it");
        if (it == EnumC74492TLk.PRE_SHOW || it == EnumC74492TLk.PRE_HIDE) {
            return true;
        }
        return false;
    }

    public static final void LJFF(BaseContainer baseContainer, InterfaceC88472Yns interfaceC88472Yns) {
        o.LJIIIZ(baseContainer, "<this>");
        if (C16880lQ.LLJJIJIL(baseContainer.getLifecycle().getCurrentState(), Lifecycle.State.DESTROYED) <= 0) {
            return;
        }
        C8VR.LIZ(baseContainer, interfaceC88472Yns);
        C8P7.LIZ(baseContainer).gv0(baseContainer);
    }

    public static final EnumC36074EDu LJI(String str, RomaPatternKey romaPatternKey) {
        boolean z = false;
        if (str == null || str.length() == 0) {
            return EnumC36074EDu.EMPTY;
        }
        List<RomaPatternOption> options = romaPatternKey.getOptions();
        if (options != null) {
            Iterator<RomaPatternOption> it = options.iterator();
            while (it.hasNext()) {
                if (o.LJ(it.next().getValue(), str)) {
                    z = true;
                }
            }
            if (C76800UCe.LIZ != null) {
                if (!z) {
                    return EnumC36074EDu.OUT_OF_RANGE;
                }
                return EnumC36074EDu.UNKNOWN;
            }
        }
        return EnumC36074EDu.OUT_OF_RANGE;
    }

    public static final AqS60S0110000_3 LJIILJJIL(C8W0 c8w0, boolean z) {
        o.LJIIIZ(c8w0, "<this>");
        return new AqS60S0110000_3(c8w0, z, 4);
    }

    public static final AqS60S0110000_3 LJIILLIIL(Fragment fragment, boolean z) {
        o.LJIIIZ(fragment, "<this>");
        return new AqS60S0110000_3(fragment, z, 5);
    }

    public static final AqS60S0110000_3 LJIIZILJ(C8W0 c8w0, boolean z) {
        o.LJIIIZ(c8w0, "<this>");
        return new AqS60S0110000_3(c8w0, z, 6);
    }

    public static Object LJIJI(String str, java.util.Map map) {
        try {
            Object obj = map.get(str);
            if (obj != null) {
                return obj;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final AqS60S0110000_3 LJJ(Fragment fragment, boolean z) {
        o.LJIIIZ(fragment, "<this>");
        return new AqS60S0110000_3(fragment, z, 8);
    }

    public static final AqS61S0110000_4 LJJII(LifecycleOwner lifecycleOwner, boolean z) {
        o.LJIIIZ(lifecycleOwner, "<this>");
        return new AqS61S0110000_4(lifecycleOwner, z, 11);
    }

    public static String LJJIIJ(String str, java.util.Map map) {
        if (map != null && map.containsKey(str)) {
            Object obj = map.get(str);
            if (obj instanceof String) {
                return (String) obj;
            }
            return null;
        }
        return null;
    }

    public static final AqS60S0110000_3 LJJIIJZLJL(ViewModelStoreOwner viewModelStoreOwner, boolean z) {
        o.LJIIIZ(viewModelStoreOwner, "<this>");
        return new AqS60S0110000_3(viewModelStoreOwner, z, 9);
    }

    public static boolean LJJIJ(W8X w8x, C79238V7y c79238V7y) {
        if (w8x == null) {
            return false;
        }
        w8x.LJIILIIL();
        int i = w8x.LJLJJI;
        if (i != 90 && i != 270) {
            w8x.LJIILIIL();
            int i2 = w8x.LJLJJLL;
            w8x.LJIILIIL();
            return LJJIIZI(i2, w8x.LJLJL, c79238V7y);
        }
        w8x.LJIILIIL();
        int i3 = w8x.LJLJL;
        w8x.LJIILIIL();
        return LJJIIZI(i3, w8x.LJLJJLL, c79238V7y);
    }

    public static final void LJJIL(EditText editText, int i) {
        Editable text;
        if (editText != null && (text = editText.getText()) != null && text.length() != 0 && LJJIII(editText) > i) {
            String obj = editText.getText().toString();
            int i2 = i * 50;
            if (obj.length() >= i2) {
                obj = obj.substring(0, i2);
                o.LJIIIIZZ(obj, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            String LIZIZ = C58314Muc.LIZIZ(obj, 1, 0, "this as java.lang.String…ing(startIndex, endIndex)");
            for (int length = LIZIZ.length() - 1; length >= 0 && Character.isHighSurrogate(LIZIZ.charAt(length)); length--) {
                LIZIZ = LIZIZ.substring(0, length);
                o.LJIIIIZZ(LIZIZ, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            editText.setText(LIZIZ);
            editText.setSelection(editText.getText().length());
        }
    }

    public static final void LJJJJ(EnumC14070gt notificationType, EnumC14060gs eventPage) {
        o.LJIIIZ(notificationType, "notificationType");
        o.LJIIIZ(eventPage, "eventPage");
        BZI LIZ = C28787BRn.LIZ("livesdk_live_guide_notification_show");
        C06510Nj.LIZ((C29374Bfu) B83.LIZ().LIZIZ(), LIZ, "anchor_id");
        LIZ.LJIJJ(LiveMode.SCREEN_RECORD.logStreamingType, "live_type");
        LIZ.LJIJJ(notificationType.getValue(), "notification_type");
        LIZ.LJIJJ(eventPage.getValue(), "event_page");
        LIZ.LJIJJ("", "if_close");
        LIZ.LJJIIJZLJL();
    }

    public static final String LJJJJI(android.net.Uri safeGetQueryParameter, String key) {
        o.LJIIJ(safeGetQueryParameter, "$this$safeGetQueryParameter");
        o.LJIIJ(key, "key");
        try {
            return UriProtector.getQueryParameter(safeGetQueryParameter, key);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c3, code lost:
    
        if (r5 != null) goto L118;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C279917z LJJJJL(com.bytedance.android.livesdk.model.KaraokeSong r19, X.AnonymousClass010 r20) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78926UyI.LJJJJL(com.bytedance.android.livesdk.model.KaraokeSong, X.010):X.17z");
    }

    public static final C279917z LJJJJLI(ReqSong reqSong, AnonymousClass010 anonymousClass010) {
        KaraokeSong karaokeSong;
        List<User> list;
        if (reqSong != null && (karaokeSong = reqSong.song) != null) {
            C279917z LJJJJL = LJJJJL(karaokeSong, anonymousClass010);
            LJJJJL.LJIILJJIL = (int) reqSong.reqCount;
            int size = reqSong.userList.size();
            int i = LJJJJL.LJIILJJIL;
            if (size > i) {
                list = reqSong.userList.subList(0, i);
            } else if (size < i && size < 3) {
                int min = Math.min(i, 3);
                while (size < min) {
                    reqSong.userList.add(new User());
                    size++;
                }
                list = reqSong.userList;
            } else {
                list = reqSong.userList;
            }
            for (User user : list) {
                List<ImageModel> LJI = LJJJJL.LJI();
                ImageModel avatarThumb = user.getAvatarThumb();
                if (avatarThumb == null) {
                    avatarThumb = new ImageModel();
                }
                LJI.add(avatarThumb);
            }
            return LJJJJL;
        }
        return AnonymousClass014.LIZ();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a0, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final float LJJJZ(com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo r16, boolean r17) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78926UyI.LJJJZ(com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo, boolean):float");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x0030. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJIIL(android.content.Context r4, com.ss.android.ugc.aweme.feed.model.Aweme r5, boolean r6) {
        /*
            java.lang.String r1 = ""
            if (r4 != 0) goto L5
            return r1
        L5:
            if (r5 != 0) goto L8
            return r1
        L8:
            boolean r0 = r5.isAd()
            if (r0 != 0) goto Lf
            return r1
        Lf:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r3 = r5.getAwemeRawAd()
            if (r3 != 0) goto L16
        L15:
            return r1
        L16:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r5.getAwemeRawAd()
            java.lang.String r2 = r0.getType()
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L25
            goto L15
        L25:
            java.lang.String r3 = r3.getButtonText()
            r2.getClass()
            int r0 = r2.hashCode()
            switch(r0) {
                case -1354573786: goto Ld9;
                case -958252434: goto Lcf;
                case 96801: goto L67;
                case 117588: goto L5c;
                case 3148996: goto L51;
                case 106642798: goto L48;
                case 957829685: goto L3d;
                case 1893962841: goto L34;
                default: goto L33;
            }
        L33:
            goto L15
        L34:
            java.lang.String r0 = "redpacket"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L78
            goto L15
        L3d:
            java.lang.String r0 = "counsel"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L46
            goto L15
        L46:
            r0 = 6
            goto L71
        L48:
            java.lang.String r0 = "phone"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L91
            goto L15
        L51:
            java.lang.String r0 = "form"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L5a
            goto L15
        L5a:
            r0 = 4
            goto L71
        L5c:
            java.lang.String r0 = "web"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L65
            goto L15
        L65:
            r0 = 3
            goto L71
        L67:
            java.lang.String r0 = "app"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L70
            goto L15
        L70:
            r0 = 2
        L71:
            r2 = 2131823188(0x7f110a54, float:1.9279169E38)
            switch(r0) {
                case 0: goto Le3;
                case 1: goto Lf2;
                case 2: goto Lc3;
                case 3: goto Lb7;
                case 4: goto La0;
                case 5: goto L91;
                case 6: goto L86;
                case 7: goto L78;
                default: goto L77;
            }
        L77:
            goto L15
        L78:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto Lf2
            r0 = 2131823180(0x7f110a4c, float:1.9279152E38)
            java.lang.String r1 = r4.getString(r0)
            goto L15
        L86:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto Lf2
            java.lang.String r1 = r4.getString(r2)
            goto L15
        L91:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto Lf2
            r0 = 2131823176(0x7f110a48, float:1.9279144E38)
            java.lang.String r1 = r4.getString(r0)
            goto L15
        La0:
            if (r6 == 0) goto La8
            java.lang.String r1 = r4.getString(r2)
            goto L15
        La8:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto Lf2
            r0 = 2131823161(0x7f110a39, float:1.9279114E38)
            java.lang.String r1 = r4.getString(r0)
            goto L15
        Lb7:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto Lf2
            java.lang.String r1 = r4.getString(r2)
            goto L15
        Lc3:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto Lf2
            java.lang.String r1 = r4.getString(r2)
            goto L15
        Lcf:
            java.lang.String r0 = "live_appoint"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Lf2
            goto L15
        Ld9:
            java.lang.String r0 = "coupon"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Le3
            goto L15
        Le3:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto Lf2
            r0 = 2131823159(0x7f110a37, float:1.927911E38)
            java.lang.String r1 = r4.getString(r0)
            goto L15
        Lf2:
            r1 = r3
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78926UyI.LJIIL(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, boolean):java.lang.String");
    }

    public static boolean LJJIIZI(int i, int i2, C79238V7y c79238V7y) {
        if (c79238V7y == null) {
            if (((int) (i * 1.3333334f)) < 2048.0f || ((int) (i2 * 1.3333334f)) < 2048) {
                return false;
            }
            return true;
        }
        if (((int) (i * 1.3333334f)) < c79238V7y.LIZ || ((int) (i2 * 1.3333334f)) < c79238V7y.LIZIZ) {
            return false;
        }
        return true;
    }

    public static final void LJII(String str, E92 info, RomaPatternKey romaPatternKey, EDP edp) {
        String str2;
        List<RomaPatternKey> patternKey;
        o.LJIIIZ(info, "info");
        if (str == null || str.length() == 0) {
            edp.LIZIZ(romaPatternKey.getKey(), EnumC36074EDu.EMPTY, romaPatternKey.getRequired());
            return;
        }
        String key = romaPatternKey.getKey();
        j joinPatternItem = romaPatternKey.getJoinPatternItem();
        if (joinPatternItem != null) {
            try {
                if (joinPatternItem instanceof m) {
                    RomaJoinPatternItem romaJoinPatternItem = (RomaJoinPatternItem) C75792yF.LIZ(joinPatternItem.LJIIZILJ().toString(), RomaJoinPatternItem.class);
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    if (romaJoinPatternItem != null && (patternKey = romaJoinPatternItem.getPatternKey()) != null) {
                        for (RomaPatternKey romaPatternKey2 : patternKey) {
                            linkedHashSet.add(romaPatternKey2.getKey());
                            C78923UyF.LJFF(romaPatternKey2, info, edp, key, null);
                        }
                    }
                    E94 e94 = info.LIZLLL;
                    e94.getClass();
                    if (key != null) {
                        str2 = key;
                    } else {
                        str2 = "default";
                    }
                    LinkedHashMap linkedHashMap = (LinkedHashMap) C113554cx.LJJLIL(e94.LIZIZ(str2));
                    linkedHashMap.keySet().removeAll(linkedHashSet);
                    Iterator it = linkedHashMap.keySet().iterator();
                    while (it.hasNext()) {
                        edp.LIZIZ((String) it.next(), EnumC36074EDu.REDUNDANT, false);
                    }
                }
                if (C76800UCe.LIZ != null) {
                    return;
                }
            } catch (Exception unused) {
                edp.LIZIZ(key, EnumC36074EDu.WRONG_TYPE, romaPatternKey.getRequired());
                return;
            }
        }
        edp.LIZIZ(key, EnumC36074EDu.WRONG_TYPE, romaPatternKey.getRequired());
    }

    public static final VEPreviewParams LJJJJLL(VideoPublishEditModel videoPublishEditModel, int i, int i2, int i3) {
        long j;
        int i4;
        VideoFileInfo videoFileInfo;
        CanvasExtra extra;
        CanvasExtra extra2;
        o.LJIIIZ(videoPublishEditModel, "<this>");
        VEPreviewParams vEPreviewParams = new VEPreviewParams();
        EditPreviewInfo previewInfo = videoPublishEditModel.getPreviewInfo();
        int size = previewInfo.getVideoList().size();
        String[] strArr = new String[size];
        for (int i5 = 0; i5 < size; i5++) {
            strArr[i5] = "";
        }
        vEPreviewParams.mVideoPaths = strArr;
        String[] strArr2 = new String[size];
        for (int i6 = 0; i6 < size; i6++) {
            strArr2[i6] = "";
        }
        vEPreviewParams.mAudioPaths = strArr2;
        int i7 = 0;
        for (EditVideoSegment editVideoSegment : previewInfo.getVideoList()) {
            int i8 = i7 + 1;
            if (i7 >= 0) {
                EditVideoSegment editVideoSegment2 = editVideoSegment;
                vEPreviewParams.mVideoPaths[i7] = editVideoSegment2.getVideoPath();
                vEPreviewParams.mAudioPaths[i7] = editVideoSegment2.getAudioPath();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("EditPageModelExt -> toPreviewParams: videoPath: ");
                LIZ.append(editVideoSegment2.getVideoPath());
                LIZ.append('.');
                H78.LIZ(X1D.LIZIZ(LIZ));
                VideoCutInfo videoCutInfo = editVideoSegment2.getVideoCutInfo();
                float f = 1.0f;
                if (videoCutInfo != null) {
                    if (vEPreviewParams.mSpeedArray == null) {
                        float[] fArr = new float[size];
                        for (int i9 = 0; i9 < size; i9++) {
                            fArr[i9] = 1.0f;
                        }
                        vEPreviewParams.mSpeedArray = fArr;
                    }
                    if (vEPreviewParams.mRotateArray == null) {
                        int[] iArr = new int[size];
                        for (int i10 = 0; i10 < size; i10++) {
                            iArr[i10] = 0;
                        }
                        vEPreviewParams.mRotateArray = iArr;
                    }
                    if (vEPreviewParams.mVTrimIn == null) {
                        int[] iArr2 = new int[size];
                        for (int i11 = 0; i11 < size; i11++) {
                            iArr2[i11] = 0;
                        }
                        vEPreviewParams.mVTrimIn = iArr2;
                    }
                    if (vEPreviewParams.mVTrimOut == null) {
                        int[] iArr3 = new int[size];
                        for (int i12 = 0; i12 < size; i12++) {
                            iArr3[i12] = -1;
                        }
                        vEPreviewParams.mVTrimOut = iArr3;
                    }
                    vEPreviewParams.getSpeedArray()[i7] = videoCutInfo.getSpeed();
                    vEPreviewParams.getRotateArray()[i7] = videoCutInfo.getRotate();
                    vEPreviewParams.mVTrimIn[i7] = (int) videoCutInfo.getStart();
                    vEPreviewParams.mVTrimOut[i7] = (int) videoCutInfo.getEnd();
                }
                if (videoPublishEditModel.getVideoEditorType() == 11) {
                    if (vEPreviewParams.mSpeedArray == null) {
                        float[] fArr2 = new float[size];
                        for (int i13 = 0; i13 < size; i13++) {
                            fArr2[i13] = 1.0f;
                        }
                        vEPreviewParams.mSpeedArray = fArr2;
                    }
                    if (vEPreviewParams.mRotateArray == null) {
                        int[] iArr4 = new int[size];
                        for (int i14 = 0; i14 < size; i14++) {
                            iArr4[i14] = 0;
                        }
                        vEPreviewParams.mRotateArray = iArr4;
                    }
                    if (vEPreviewParams.mVTrimIn == null) {
                        int[] iArr5 = new int[size];
                        for (int i15 = 0; i15 < size; i15++) {
                            iArr5[i15] = 0;
                        }
                        vEPreviewParams.mVTrimIn = iArr5;
                    }
                    if (vEPreviewParams.mVTrimOut == null) {
                        int[] iArr6 = new int[size];
                        for (int i16 = 0; i16 < size; i16++) {
                            iArr6[i16] = -1;
                        }
                        vEPreviewParams.mVTrimOut = iArr6;
                    }
                    if (i7 == 0) {
                        float[] fArr3 = vEPreviewParams.mSpeedArray;
                        CanvasVideoData canvasVideoData = videoPublishEditModel.canvasVideoData;
                        if (canvasVideoData != null && (extra2 = canvasVideoData.getExtra()) != null) {
                            f = extra2.getSpeed();
                        }
                        fArr3[i7] = f;
                    }
                    int[] iArr7 = vEPreviewParams.mVTrimIn;
                    CanvasVideoData canvasVideoData2 = videoPublishEditModel.canvasVideoData;
                    if (canvasVideoData2 != null && (extra = canvasVideoData2.getExtra()) != null) {
                        j = extra.getStartTime();
                    } else {
                        j = 0;
                    }
                    iArr7[i7] = (int) j;
                    int[] iArr8 = vEPreviewParams.mVTrimOut;
                    int i17 = vEPreviewParams.mVTrimIn[i7];
                    if (i3 <= 0) {
                        EditVideoSegment editVideoSegment3 = (EditVideoSegment) ORZ.LJLLLL(videoPublishEditModel.getPreviewInfo().getVideoList());
                        if (editVideoSegment3 != null && (videoFileInfo = editVideoSegment3.getVideoFileInfo()) != null) {
                            i4 = (int) videoFileInfo.getDuration();
                        } else {
                            i4 = 5000;
                        }
                    } else {
                        i4 = i3;
                    }
                    iArr8[i7] = i17 + i4;
                }
                i7 = i8;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        vEPreviewParams.sceneIn = (int) previewInfo.getSceneIn();
        vEPreviewParams.sceneOut = (int) previewInfo.getSceneOut();
        vEPreviewParams.mPreviewWidth = previewInfo.getPreviewWidth();
        vEPreviewParams.mPreviewHeight = previewInfo.getPreviewHeight();
        if (i != -1) {
            vEPreviewParams.mPageType = i;
        }
        if (i2 != -1) {
            vEPreviewParams.mFps = i2;
        }
        vEPreviewParams.isFromCut = videoPublishEditModel.mFromCut;
        vEPreviewParams.mWorkspace = C60903NvH.LJIIJJI().LJJIJL().getPathAdapter().LJJJJI(videoPublishEditModel);
        vEPreviewParams.setCanvasWidth(videoPublishEditModel.mVideoCanvasWidth);
        vEPreviewParams.setCanvasHeight(videoPublishEditModel.mVideoCanvasHeight);
        vEPreviewParams.mVolume = videoPublishEditModel.voiceVolume;
        vEPreviewParams.mMusicVolume = videoPublishEditModel.musicVolume;
        C5P9.LIZ.getClass();
        vEPreviewParams.mDbRange = ((VolumeAdjustmentExperimentParams) C5P9.LIZJ.getValue()).getDbRange();
        vEPreviewParams.mMusicInPoint = videoPublishEditModel.getMMusicStart();
        vEPreviewParams.mMusicOutPoint = videoPublishEditModel.getMMusicEnd();
        vEPreviewParams.mMusicPath = videoPublishEditModel.getMMusicPath();
        vEPreviewParams.isFastImport = videoPublishEditModel.isFastImport;
        vEPreviewParams.isCutSameType = videoPublishEditModel.isCutSameVideoType();
        vEPreviewParams.mIsFromDraft = videoPublishEditModel.mIsFromDraft;
        vEPreviewParams.videoEditorType = videoPublishEditModel.getVideoEditorType();
        vEPreviewParams.mvCreateVideoData = videoPublishEditModel.mvCreateVideoData;
        vEPreviewParams.recordData = videoPublishEditModel.multiEditVideoRecordData;
        vEPreviewParams.stitchParams = videoPublishEditModel.stitchParams;
        if (videoPublishEditModel.veCherEffectParam != null) {
            String[] matrix = videoPublishEditModel.veCherEffectParam.getMatrix();
            double[] duration = videoPublishEditModel.veCherEffectParam.getDuration();
            boolean[] segUseCher = videoPublishEditModel.veCherEffectParam.getSegUseCher();
            o.LJI(segUseCher);
            vEPreviewParams.veCherEffectParam = new VECherEffectParam(matrix, duration, segUseCher);
        }
        AudioEffectParam audioEffectParam = videoPublishEditModel.veAudioEffectParam;
        if (audioEffectParam != null) {
            vEPreviewParams.setVeAudioEffectParam(audioEffectParam);
        }
        if (videoPublishEditModel.isFastImport || videoPublishEditModel.isCutSameVideoType()) {
            vEPreviewParams.mAudioPaths = null;
        }
        vEPreviewParams.audioAecDelayTime = videoPublishEditModel.audioAecDelayTime;
        vEPreviewParams.isStoryEditMode = videoPublishEditModel.isStoryEditMode;
        vEPreviewParams.canvasVideoPreviewData = videoPublishEditModel.canvasVideoData;
        vEPreviewParams.singleImageCoverBitmapData = videoPublishEditModel.singleImageCoverBitmapData;
        vEPreviewParams.isVideoImageMixFastImport = H7R.LJJJJLI(videoPublishEditModel);
        vEPreviewParams.setEnableMusicSync(H7R.LJIIL(videoPublishEditModel));
        vEPreviewParams.isMusicSyncMode = videoPublishEditModel.editMusicSyncMode;
        CutSameModel cutSameModel = videoPublishEditModel.creativeModel.cutSameModel;
        if (cutSameModel != null) {
            vEPreviewParams.selectedTemplateStr = cutSameModel.selectedTemplate;
            vEPreviewParams.selectedTemplateMediaItemList = new ArrayList<>(cutSameModel.selectedTemplateMediaItemList);
        }
        String[] strArr3 = vEPreviewParams.mAudioPaths;
        if (strArr3 != null && ((ArrayList) ORY.LJJIJLIJ(strArr3)).isEmpty()) {
            vEPreviewParams.mAudioPaths = null;
        }
        H78.LIZ("EditPageModelExt -> toPreviewParams: " + vEPreviewParams);
        return vEPreviewParams;
    }

    public static /* synthetic */ VEPreviewParams LJJJJZ(VideoPublishEditModel videoPublishEditModel, int i, int i2, int i3) {
        int i4 = -1;
        if ((i3 & 1) != 0) {
            i = -1;
        }
        if ((i3 & 2) != 0) {
            i2 = -1;
        }
        if ((i3 & 4) == 0) {
            i4 = 0;
        }
        return LJJJJLL(videoPublishEditModel, i, i2, i4);
    }

    public void LIZ(ResourceItem resourceItem, int i, boolean z, C127254z3 c127254z3) {
        c127254z3.LIZ(false);
    }

    public static final C10410az LIZLLL(long j, float f, float f2, float f3, float f4) {
        long LJI = C78897Uxp.LJI(C10340as.LIZIZ(j), C10340as.LIZJ(j));
        return new C10410az(f, f2, f3, f4, LJI, LJI, LJI, LJI);
    }

    public static final int LJJLI(EditPreviewInfo editPreviewInfo, boolean z, boolean z2, boolean z3, VideoPublishEditModel videoPublishEditModel) {
        boolean z4;
        CanvasVideoData canvasVideoData;
        o.LJIIIZ(editPreviewInfo, "<this>");
        if (videoPublishEditModel != null && videoPublishEditModel.isNLECanvas()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            int previewHeight = editPreviewInfo.getPreviewHeight();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("EditPreviewInfo.videoHeight");
            LIZ.append(" : ");
            LIZ.append(previewHeight);
            LIZ.append(" --- info : NLECanvas ;");
            C5Z5.LIZIZ(X1D.LIZIZ(LIZ));
            return previewHeight;
        }
        if (z || z3) {
            if (editPreviewInfo.getCalculateHeight() <= 0) {
                VESize calcTargetRes = VEUtils.calcTargetRes(editPreviewInfo.getTotalVideoWidth(), editPreviewInfo.getTotalVideoHeight(), C17N.LJJLIIIJILLIZJL(editPreviewInfo), editPreviewInfo.getPreviewWidth());
                editPreviewInfo.setCalculateWidth(calcTargetRes.width);
                editPreviewInfo.setCalculateHeight(calcTargetRes.height);
            }
            int calculateHeight = editPreviewInfo.getCalculateHeight();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("EditPreviewInfo.videoHeight");
            LIZ2.append(" : ");
            LIZ2.append(calculateHeight);
            LIZ2.append(" ; info --- isFastImport : ");
            LIZ2.append(z);
            LIZ2.append(" || forceCalculateVideoSize : ");
            LIZ2.append(z3);
            LIZ2.append(" ;totalVideoWidth : ");
            LIZ2.append(LJIIJ(editPreviewInfo.getTotalVideoWidth()));
            LIZ2.append(" ; totalVideoHeight : ");
            LIZ2.append(LJIIJ(editPreviewInfo.getTotalVideoHeight()));
            LIZ2.append("; previewWidth : ");
            LIZ2.append(editPreviewInfo.getPreviewWidth());
            LIZ2.append(';');
            C5Z5.LIZIZ(X1D.LIZIZ(LIZ2));
            return calculateHeight;
        }
        if (z2 && editPreviewInfo.getVideoList().size() >= 2) {
            int height = ((EditVideoSegment) ListProtector.get(editPreviewInfo.getVideoList(), 1)).getVideoFileInfo().getHeight();
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("EditPreviewInfo.videoHeight");
            LIZ3.append(" : ");
            LIZ3.append(height);
            LIZ3.append(" ; info --- isStitchMode : ");
            LIZ3.append(z2);
            LIZ3.append(" ; fileInfo : ");
            LIZ3.append(((EditVideoSegment) ListProtector.get(editPreviewInfo.getVideoList(), 1)).getVideoFileInfo());
            C5Z5.LIZIZ(X1D.LIZIZ(LIZ3));
            return height;
        }
        if (videoPublishEditModel != null && (canvasVideoData = videoPublishEditModel.canvasVideoData) != null && C79004UzY.LJJJI(canvasVideoData)) {
            int previewHeight2 = editPreviewInfo.getPreviewHeight();
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("EditPreviewInfo.videoHeight");
            LIZ4.append(" : ");
            LIZ4.append(previewHeight2);
            LIZ4.append(" ; info --- isVideoCanvas");
            C5Z5.LIZIZ(X1D.LIZIZ(LIZ4));
            return previewHeight2;
        }
        int height2 = ((EditVideoSegment) ListProtector.get(editPreviewInfo.getVideoList(), 0)).getVideoFileInfo().getHeight();
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("EditPreviewInfo.videoHeight");
        LIZ5.append(" : ");
        LIZ5.append(height2);
        LIZ5.append(" ; info --- default ; fileInfo : ");
        LIZ5.append(((EditVideoSegment) ListProtector.get(editPreviewInfo.getVideoList(), 0)).getVideoFileInfo());
        C5Z5.LIZIZ(X1D.LIZIZ(LIZ5));
        return height2;
    }

    public static final int LJJLIIIIJ(EditPreviewInfo editPreviewInfo, boolean z, boolean z2, boolean z3, VideoPublishEditModel videoPublishEditModel) {
        boolean z4;
        CanvasVideoData canvasVideoData;
        o.LJIIIZ(editPreviewInfo, "<this>");
        if (videoPublishEditModel != null && videoPublishEditModel.isNLECanvas()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            int previewWidth = editPreviewInfo.getPreviewWidth();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("EditPreviewInfo.videoWidth");
            LIZ.append(" : ");
            LIZ.append(previewWidth);
            LIZ.append(" --- info : NLECanvas ;");
            C5Z5.LIZIZ(X1D.LIZIZ(LIZ));
            return previewWidth;
        }
        if (z || z3) {
            if (editPreviewInfo.getCalculateWidth() <= 0) {
                VESize calcTargetRes = VEUtils.calcTargetRes(editPreviewInfo.getTotalVideoWidth(), editPreviewInfo.getTotalVideoHeight(), C17N.LJJLIIIJILLIZJL(editPreviewInfo), editPreviewInfo.getPreviewWidth());
                editPreviewInfo.setCalculateWidth(calcTargetRes.width);
                editPreviewInfo.setCalculateHeight(calcTargetRes.height);
            }
            int calculateWidth = editPreviewInfo.getCalculateWidth();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("EditPreviewInfo.videoWidth");
            LIZ2.append(" : ");
            LIZ2.append(calculateWidth);
            LIZ2.append(" ; info --- isFastImport : ");
            LIZ2.append(z);
            LIZ2.append(" || forceCalculateVideoSize : ");
            LIZ2.append(z3);
            LIZ2.append(" ;totalVideoWidth : ");
            LIZ2.append(LJIIJ(editPreviewInfo.getTotalVideoWidth()));
            LIZ2.append(" ; totalVideoHeight : ");
            LIZ2.append(LJIIJ(editPreviewInfo.getTotalVideoHeight()));
            LIZ2.append("; previewWidth : ");
            LIZ2.append(editPreviewInfo.getPreviewWidth());
            LIZ2.append(';');
            C5Z5.LIZIZ(X1D.LIZIZ(LIZ2));
            return calculateWidth;
        }
        if (z2 && editPreviewInfo.getVideoList().size() >= 2) {
            int width = ((EditVideoSegment) ListProtector.get(editPreviewInfo.getVideoList(), 1)).getVideoFileInfo().getWidth();
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("EditPreviewInfo.videoWidth");
            LIZ3.append(" : ");
            LIZ3.append(width);
            LIZ3.append(" ; info --- isStitchMode : ");
            LIZ3.append(z2);
            LIZ3.append(" ; fileInfo : ");
            LIZ3.append(((EditVideoSegment) ListProtector.get(editPreviewInfo.getVideoList(), 1)).getVideoFileInfo());
            C5Z5.LIZIZ(X1D.LIZIZ(LIZ3));
            return width;
        }
        if (videoPublishEditModel != null && (canvasVideoData = videoPublishEditModel.canvasVideoData) != null && C79004UzY.LJJJI(canvasVideoData)) {
            int previewWidth2 = editPreviewInfo.getPreviewWidth();
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("EditPreviewInfo.videoWidth");
            LIZ4.append(" : ");
            LIZ4.append(previewWidth2);
            LIZ4.append(" ; info --- isVideoCanvas");
            C5Z5.LIZIZ(X1D.LIZIZ(LIZ4));
            return previewWidth2;
        }
        int width2 = ((EditVideoSegment) ListProtector.get(editPreviewInfo.getVideoList(), 0)).getVideoFileInfo().getWidth();
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("EditPreviewInfo.videoWidth");
        LIZ5.append(" : ");
        LIZ5.append(width2);
        LIZ5.append(" ; info --- default ; fileInfo : ");
        LIZ5.append(((EditVideoSegment) ListProtector.get(editPreviewInfo.getVideoList(), 0)).getVideoFileInfo());
        C5Z5.LIZIZ(X1D.LIZIZ(LIZ5));
        return width2;
    }

    public static final C214298b3 LJ(C8W0 c8w0, C65776Prg c65776Prg, AbstractC241239dP abstractC241239dP, InterfaceC65784Pro keyFactory, InterfaceC88472Yns argumentsAcceptor, InterfaceC65784Pro interfaceC65784Pro) {
        C214298b3 c214298b3;
        InterfaceC65784Pro interfaceC65784Pro2 = interfaceC65784Pro;
        o.LJIIIZ(c8w0, "<this>");
        o.LJIIIZ(keyFactory, "keyFactory");
        o.LJIIIZ(argumentsAcceptor, "argumentsAcceptor");
        if (o.LJ(abstractC241239dP, C9BD.LIZ)) {
            C214528bQ c214528bQ = C214528bQ.LJLIL;
            AqS58S0110000_1 aqS58S0110000_1 = new AqS58S0110000_1(c8w0, true, 8);
            AqS60S0110000_3 aqS60S0110000_3 = new AqS60S0110000_3(c8w0, true, 7);
            if (interfaceC65784Pro2 == null) {
                interfaceC65784Pro2 = C184077Kh.LJLIL;
            }
            c214298b3 = new C214298b3(keyFactory, c214528bQ, aqS58S0110000_1, aqS60S0110000_3, interfaceC65784Pro2, LJIILJJIL(c8w0, true), LJIIZILJ(c8w0, true), argumentsAcceptor, c65776Prg);
        } else if (o.LJ(abstractC241239dP, C9BE.LIZ)) {
            C214528bQ c214528bQ2 = C214528bQ.LJLIL;
            AqS58S0110000_1 aqS58S0110000_12 = new AqS58S0110000_1(c8w0, false, 8);
            AqS60S0110000_3 aqS60S0110000_32 = new AqS60S0110000_3(c8w0, false, 7);
            if (interfaceC65784Pro2 == null) {
                interfaceC65784Pro2 = C184077Kh.LJLIL;
            }
            c214298b3 = new C214298b3(keyFactory, c214528bQ2, aqS58S0110000_12, aqS60S0110000_32, interfaceC65784Pro2, LJIILJJIL(c8w0, false), LJIIZILJ(c8w0, false), argumentsAcceptor, c65776Prg);
        } else if (abstractC241239dP == null || o.LJ(abstractC241239dP, C9XN.LIZ)) {
            C214528bQ c214528bQ3 = C214528bQ.LJLIL;
            AqS61S0110000_4 LJJII = LJJII(c8w0, false);
            AqS60S0110000_3 LJJIIJZLJL = LJJIIJZLJL(c8w0, false);
            if (interfaceC65784Pro2 == null) {
                interfaceC65784Pro2 = C184077Kh.LJLIL;
            }
            c214298b3 = new C214298b3(keyFactory, c214528bQ3, LJJII, LJJIIJZLJL, interfaceC65784Pro2, LJJI(c8w0), LJJIFFI(c8w0), argumentsAcceptor, c65776Prg);
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        return c214298b3;
    }

    public static final void LJIIIZ(C08490Uz c08490Uz, InterfaceC11750d9 interfaceC11750d9, AbstractC11740d8 abstractC11740d8, float f, C11770dB c11770dB, C22080to c22080to) {
        ArrayList arrayList = (ArrayList) c08490Uz.LJII;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C1NC c1nc = (C1NC) ListProtector.get(arrayList, i);
            c1nc.LJLIL.LJIILJJIL(interfaceC11750d9, abstractC11740d8, f, c11770dB, c22080to, null);
            interfaceC11750d9.LJIILLIIL(0.0f, c1nc.LJLIL.getHeight());
        }
    }

    public static final float[] LJJJLIIL(float f, float f2, int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        float f3 = i3;
        float f4 = i;
        float f5 = (f3 * 1.0f) / f4;
        float f6 = i4;
        float f7 = i2;
        float f8 = (1.0f * f6) / f7;
        if (f5 == f8) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new float[]{f, f2};
        }
        float max = Math.max(f5, f8);
        if (max == f5) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            f2 = (((f2 * f7) * max) - (((f7 * max) - f6) / 2.0f)) / f6;
        } else {
            f = (((f * f4) * max) - (((f4 * max) - f3) / 2.0f)) / f3;
        }
        return new float[]{f, f2};
    }
}
