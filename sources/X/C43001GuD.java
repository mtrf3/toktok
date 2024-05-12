package X;

import Y.ACallableS30S1100000_2;
import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.NowsShootModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.image.model.ImageAlbumData;
import com.ss.android.ugc.aweme.image.model.SingleImageData;
import com.ss.android.ugc.aweme.image.model.SrcImageInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.StoryGroupPublishModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.shortvideo.recoverpanel.PublishFailureReason;
import com.ss.ugc.android.editor.track.TrackPanelActionListener;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.GuD, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C43001GuD implements InterfaceC43002GuE, C0K7, TrackPanelActionListener {
    public static final C43001GuD LJLIL = new C43001GuD();
    public static final char[] LJLILLLLZI = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static String LJLJI = "";
    public static boolean LJLJJI;

    public static final int LJIIL(int i) {
        if (i != 1) {
            return (i == 2 || i == 3) ? 330 : 222;
        }
        return 222;
    }

    @Override // com.ss.ugc.android.editor.track.TrackPanelActionListener
    public NLETrackSlot getSelectedKeyframe() {
        return null;
    }

    @Override // com.ss.ugc.android.editor.track.TrackPanelActionListener
    public void mobSubTrackClipEvent(C5AE state, NLETrackSlot slot, int i) {
        o.LJIIIZ(state, "state");
        o.LJIIIZ(slot, "slot");
    }

    @Override // com.ss.ugc.android.editor.track.TrackPanelActionListener
    public void onClipStart(NLETrackSlot slot) {
        o.LJIIIZ(slot, "slot");
    }

    @Override // com.ss.ugc.android.editor.track.TrackPanelActionListener
    public void onKeyframeSelected(NLETrackSlot nLETrackSlot) {
    }

    @Override // com.ss.ugc.android.editor.track.TrackPanelActionListener
    public void onSaveSnapShot(Bitmap bitmap, boolean z) {
        o.LJIIIZ(bitmap, "bitmap");
    }

    @Override // com.ss.ugc.android.editor.track.TrackPanelActionListener
    public void onScale(float f) {
    }

    @Override // com.ss.ugc.android.editor.track.TrackPanelActionListener
    public void onUpdateVideoCover() {
    }

    @Override // com.ss.ugc.android.editor.track.TrackPanelActionListener
    public void sendFindNextSlotEvent() {
    }

    @Override // X.InterfaceC43002GuE
    public boolean LIZIZ() {
        C74682wS.LIZ.getClass();
        return C74682wS.LIZJ;
    }

    public static final String LJIILJJIL() {
        return C00F.LIZIZ(((RBX) HG3.LJIILL()).getCurUserId(), '_', "key_show_gps_dialog_in_poi_detail_discovery");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final PublishModel LJFF(Bundle bundle) {
        NowsShootModel nowsShootModel;
        GWB gwb;
        List<SingleImageData> imageList;
        SingleImageData singleImageData;
        SrcImageInfo srcImageInfo;
        String path;
        o.LJIIIZ(bundle, "<this>");
        String str = "";
        String shootWay = bundle.getString("shoot_way", "");
        int i = 0;
        boolean z = bundle.getBoolean("publish_retry", false);
        boolean z2 = bundle.getBoolean("shoutouts_video_fast_publish", false);
        int i2 = bundle.getInt("publish_permission", -1);
        boolean z3 = bundle.getBoolean("isEditSave", false);
        boolean z4 = bundle.getBoolean("isEditPrePublish", false);
        if (bundle.containsKey("extra_video_publish_args")) {
            Serializable serializable = bundle.getSerializable("extra_video_publish_args");
            o.LJII(serializable, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel");
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) serializable;
            int i3 = bundle.getInt("video_type", 0);
            int i4 = bundle.getInt("pre_publish_type", 0);
            if (!videoPublishEditModel.creativeInfo.isValid()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("VideoPublishEditModel NullCreationId shootWay:");
                LIZ.append(videoPublishEditModel.mShootWay);
                GUH.LJJI(X1D.LIZIZ(LIZ));
                videoPublishEditModel.creativeInfo = new CreativeInfo(null, i, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
            }
            String creationId = videoPublishEditModel.getCreationId();
            if (bundle.getBoolean("com.ss.android.ugc.aweme.intent.extra.EXTRA_NOW_PUBLISH", false)) {
                nowsShootModel = videoPublishEditModel.creativeModel.nowsShootModel;
            } else {
                nowsShootModel = null;
            }
            if (z) {
                gwb = GWB.RETRY_BY_USER;
            } else {
                gwb = GWB.NOT_RETRY;
            }
            o.LJIIIIZZ(shootWay, "shootWay");
            o.LJIIIIZZ(creationId, "creationId");
            List LJJIJ = C47261Igj.LJJIJ("");
            if ((videoPublishEditModel.isMvThemeVideoType() && !H7R.LJJJJL(videoPublishEditModel)) || videoPublishEditModel.isMultiVideoEdit()) {
                InterfaceC171126nc LIZIZ = C5YW.LIZIZ();
                CreativeInfo creativeInfo = videoPublishEditModel.creativeInfo;
                o.LJIIIIZZ(creativeInfo, "publishArgs.creativeInfo");
                String LJJJJZI = LIZIZ.LJJJJZI(creativeInfo);
                LJJIJ = C47261Igj.LJJIJ(LJJJJZI);
                C10K.LIZJ(new ACallableS30S1100000_2(videoPublishEditModel, LJJJJZI, 3));
            } else {
                String validVideoCoverPath = videoPublishEditModel.getValidVideoCoverPath();
                if (validVideoCoverPath != null) {
                    LJJIJ = C47261Igj.LJJIJ(validVideoCoverPath);
                } else if (H7R.LJJJJL(videoPublishEditModel)) {
                    ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
                    if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null && (singleImageData = (SingleImageData) ORZ.LJLLLLLL(videoPublishEditModel.getCoverPublishModel().getImageCurrentIndex(), imageList)) != null && (srcImageInfo = singleImageData.getSrcImageInfo()) != null && (path = srcImageInfo.getPath()) != null) {
                        str = path;
                    }
                    if (C44687HgJ.LIZIZ(str)) {
                        LJJIJ = C47261Igj.LJJIJ(str);
                    }
                }
            }
            PublishModel publishModel = new PublishModel(shootWay, creationId, i4, gwb, z2, i3, i2, LJJIJ, videoPublishEditModel, nowsShootModel, bundle.getBoolean("publish_story_mode", false), H7R.LJIJJLI(videoPublishEditModel), bundle.getBoolean("fromTTEPEffectPreview", false), z3, z4, false, bundle.getString("extra_expect_publish_task_id", null), bundle.getBoolean("extra_disable_progress_view", false), (StoryGroupPublishModel) bundle.getParcelable("extra_story_group_model"), 32768, null);
            publishModel.LIZIZ = (PublishFailureReason) bundle.getParcelable("retry_reason");
            return publishModel;
        }
        throw new AssertionError("publish service not supported this publish");
    }

    public static JSONObject LJI(JSONObject jSONObject) {
        LinkedList linkedList = new LinkedList();
        Iterator<String> keys = jSONObject.keys();
        if (keys == null) {
            return null;
        }
        while (keys.hasNext()) {
            linkedList.add(keys.next());
        }
        try {
            return new JSONObject(jSONObject, (String[]) linkedList.toArray(new String[0]));
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return jSONObject;
        }
    }

    public static JSONObject LJII(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new JSONObject(jSONObject.toString());
        } catch (Throwable unused) {
            return jSONObject;
        }
    }

    public static final Fragment LJIIIIZZ(LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner instanceof BaseFragment) {
            return (Fragment) lifecycleOwner;
        }
        if (lifecycleOwner instanceof UIAssem) {
            return LJIIIIZZ(((C8W0) lifecycleOwner).getParent());
        }
        if (lifecycleOwner instanceof ReusedAssem) {
            return LJIIIIZZ(((C8W0) lifecycleOwner).getParent());
        }
        if (lifecycleOwner instanceof PowerCell) {
            return LJIIIIZZ(((PowerCell) lifecycleOwner).getParent());
        }
        return null;
    }

    public static final C145995oB LJIIIZ(String str) {
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", LJLJI);
        c145995oB.LJI("shoot_way", str);
        c145995oB.LJI("enter_from", "template_preview_page");
        return c145995oB;
    }

    public static boolean LJIILIIL(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return true;
        }
        return false;
    }

    public static JSONArray LJIJJ(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        if (length == 0) {
            return jSONArray;
        }
        try {
            JSONArray jSONArray2 = new JSONArray();
            for (int i = 0; i < length; i++) {
                Object obj = jSONArray.get(i);
                if (obj instanceof JSONObject) {
                    jSONArray2.put(LJIJJLI((JSONObject) obj));
                } else if (obj instanceof JSONArray) {
                    jSONArray2.put(LJIJJ((JSONArray) obj));
                } else {
                    jSONArray2.put(obj);
                }
            }
        } catch (Throwable unused) {
        }
        return jSONArray;
    }

    public static JSONObject LJIJJLI(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Iterator<String> keys = jSONObject.keys();
        if (keys == null) {
            return jSONObject;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            while (keys.hasNext()) {
                String next = keys.next();
                Object opt = jSONObject.opt(next);
                if (opt instanceof JSONObject) {
                    jSONObject2.put(next, LJIJJLI((JSONObject) opt));
                } else if (opt instanceof JSONArray) {
                    jSONObject2.put(next, LJIJJ((JSONArray) opt));
                } else {
                    jSONObject2.put(next, opt);
                }
            }
            return jSONObject2;
        } catch (Throwable unused) {
            return jSONObject;
        }
    }

    public static final String LJJ(Boolean bool) {
        if (bool != null) {
            if (bool.booleanValue()) {
                return "1";
            }
            return CardStruct.IStatusCode.DEFAULT;
        }
        return null;
    }

    @Override // X.InterfaceC43002GuE
    public void LIZ(EnumC123114sN action) {
        C1AU c1au;
        o.LJIIIZ(action, "action");
        if (action == EnumC123114sN.REFRESH_CART_COUNT) {
            Activity LIZIZ = FKM.LIZIZ();
            if ((LIZIZ instanceof ActivityC45651qj) && (c1au = (C1AU) LIZIZ) != null) {
                C74682wS.LIZ.getClass();
                if (C74682wS.LIZJ && o.LJ(C74682wS.LIZLLL, ((IAccountUserService) C74682wS.LIZIZ.getValue()).getCurUserId())) {
                    return;
                }
                C74682wS.LIZJ = false;
                String curUserId = ((IAccountUserService) C74682wS.LIZIZ.getValue()).getCurUserId();
                o.LJIIIIZZ(curUserId, "userService.curUserId");
                C74682wS.LIZLLL = curUserId;
                XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(c1au), C78613UtF.LIZJ, null, new C74522wC(null), 2);
            }
        }
    }

    public IMUser LJIIJ(C109544Rq c109544Rq) {
        return C80533Eb.LJIIJ(String.valueOf(c109544Rq.getSender()), c109544Rq.getSecSender());
    }

    @Override // X.C0K7
    public void LJIILLIIL(LiveDialog liveDialog) {
        liveDialog.dismiss();
    }

    public static final void LIZJ(String str, java.util.Map map) {
        Object LIZ;
        Object opt;
        if (str != null) {
            map.put("collect_info", str);
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> keys = jSONObject.keys();
                o.LJIIIIZZ(keys, "jsonObject.keys()");
                while (keys.hasNext()) {
                    String key = keys.next();
                    if (C78685UuP.LJJJZ(key) && (opt = jSONObject.opt(key)) != null) {
                        o.LJIIIIZZ(key, "key");
                    }
                }
                LIZ = C76800UCe.LIZ;
                C3C5.m7constructorimpl(LIZ);
            } catch (Throwable th) {
                LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
            }
            C3C5.m6boximpl(LIZ);
        }
    }

    public static final void LIZLLL(String str, java.util.Map map) {
        Object LIZ;
        Object opt;
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> keys = jSONObject.keys();
                o.LJIIIIZZ(keys, "jsonObject.keys()");
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (C78685UuP.LJJJZ(next) && (opt = jSONObject.opt(next)) != null) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("page_");
                        LIZ2.append(next);
                    }
                }
                LIZ = C76800UCe.LIZ;
                C3C5.m7constructorimpl(LIZ);
            } catch (Throwable th) {
                LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
            }
            C3C5.m6boximpl(LIZ);
        }
    }

    public static final void LJ(C188727au c188727au, String str) {
        Object LIZ;
        Object opt;
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> keys = jSONObject.keys();
                o.LJIIIIZZ(keys, "jsonObject.keys()");
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (C78685UuP.LJJJZ(next) && (opt = jSONObject.opt(next)) != null) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("page_");
                        LIZ2.append(next);
                        c188727au.LJI(X1D.LIZIZ(LIZ2), opt.toString());
                    }
                }
                LIZ = C76800UCe.LIZ;
                C3C5.m7constructorimpl(LIZ);
            } catch (Throwable th) {
                LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
            }
            C3C5.m6boximpl(LIZ);
        }
    }

    public static void LJIL(View view, final InterfaceC88472Yns interfaceC88472Yns) {
        final long j = 400;
        C16880lQ.LJIIJ(new View.OnClickListener() { // from class: X.3bo
            @Override // android.view.View.OnClickListener
            public final void onClick(View it) {
                if (C6ZT.LIZIZ(it, j)) {
                    return;
                }
                InterfaceC88472Yns<View, C76800UCe> interfaceC88472Yns2 = interfaceC88472Yns;
                o.LJIIIIZZ(it, "it");
                interfaceC88472Yns2.invoke(it);
            }
        }, view);
    }

    public IMUser LJIIJJI(String str, String str2) {
        return C80533Eb.LJIIJ(str, str2);
    }

    public static int LJIJ(String str, String str2, JSONObject jSONObject) {
        JSONObject LJIJI = LJIJI("performance_modules", str, jSONObject);
        if (LJIJI == null) {
            return 0;
        }
        return LJIJI.optInt(str2, 0);
    }

    public static JSONObject LJIJI(String str, String str2, JSONObject jSONObject) {
        JSONObject optJSONObject;
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject(str)) == null) {
            return null;
        }
        return optJSONObject.optJSONObject(str2);
    }

    public static final void LJIILL(int i, String str, String shootWay, long j) {
        o.LJIIIZ(shootWay, "shootWay");
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("item_id", str);
        c145995oB.LIZ(i, "action");
        c145995oB.LIZIZ(System.currentTimeMillis() - j, "duration");
        c145995oB.LJI("shoot_way", shootWay);
        FMX.LJIIL("ugc_template_preview_page_duration", c145995oB.LIZ);
    }

    public static final void LJIIZILJ(int i, String str, String str2, long j, String shootWay) {
        o.LJIIIZ(shootWay, "shootWay");
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("item_id", str);
        c145995oB.LIZIZ(System.currentTimeMillis() - j, "duration");
        c145995oB.LIZ(i, "error_code");
        c145995oB.LJI("error_msg", str2);
        c145995oB.LJI("shoot_way", shootWay);
        FMX.LJIIL("ugc_template_preview_first_frame", c145995oB.LIZ);
    }
}
