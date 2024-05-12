package X;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.scene.navigation.NavigationScene;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.commercialize.adexperience.AceSurveyUserConvert;
import com.ss.android.ugc.aweme.feed.model.commercialize.adexperience.CommerceAceSurveyInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import com.ss.ugc.android.editor.core.EditorProContext;
import defpackage.g0;
import defpackage.i0;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.V0z, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79057V0z implements InterfaceC122454rJ, OVT, InterfaceC19570pl {
    public static int LIZ;
    public static Method LIZIZ;

    public static void LJIIJJI(Object obj, Method method, Object[] objArr) {
        if (new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "1318010759150947895")).LIZ) {
            return;
        }
        method.invoke(obj, objArr);
    }

    public static final boolean LJJIIZI(int i, int i2) {
        return (i & (1 << i2)) != 0;
    }

    @Override // X.InterfaceC122454rJ
    public void onChanged() {
    }

    @Override // X.OVT
    public boolean LIZ() {
        return LFH.LIZIZ.LIZLLL().block().LIZ();
    }

    public static final boolean LJIIIZ(InterfaceC124924vI interfaceC124924vI) {
        o.LJIIIZ(interfaceC124924vI, "<this>");
        return interfaceC124924vI.getUndoRedoManager().LIZJ();
    }

    public static final boolean LJIIJ(InterfaceC124924vI interfaceC124924vI) {
        o.LJIIIZ(interfaceC124924vI, "<this>");
        return interfaceC124924vI.getUndoRedoManager().LIZIZ();
    }

    public static final void LJIIL(InterfaceC124924vI interfaceC124924vI) {
        o.LJIIIZ(interfaceC124924vI, "<this>");
        interfaceC124924vI.getEditor().s9().LIZIZ();
    }

    public static final CommerceAceSurveyInfo LJIJI(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            return awemeRawAd.getCommerceAceSurveyInfo();
        }
        return null;
    }

    public static final String LJIJJ(Aweme aweme) {
        AceSurveyUserConvert userConvert;
        CommerceAceSurveyInfo LJIJI = LJIJI(aweme);
        if (LJIJI != null && (userConvert = LJIJI.getUserConvert()) != null) {
            return userConvert.getCid();
        }
        return null;
    }

    public static final long LJIJJLI(InterfaceC124924vI interfaceC124924vI) {
        o.LJIIIZ(interfaceC124924vI, "<this>");
        return interfaceC124924vI.getPlayer().H9();
    }

    public static final NLEEditor LJJ(InterfaceC124924vI interfaceC124924vI) {
        o.LJIIIZ(interfaceC124924vI, "<this>");
        return interfaceC124924vI.getEditor().s9();
    }

    public static final NLEModel LJJI(InterfaceC124924vI interfaceC124924vI) {
        o.LJIIIZ(interfaceC124924vI, "<this>");
        NLEModel r9 = interfaceC124924vI.getEditor().r9();
        if (!o.LJ("true", r9.getExtra("DisableGlobalEffect"))) {
            r9.setExtra("DisableGlobalEffect", "true");
        }
        return r9;
    }

    public static final long LJJII(EditorProContext editorProContext) {
        o.LJIIIZ(editorProContext, "<this>");
        return editorProContext.getEditor().r9().getMaxTargetEnd() / 1000;
    }

    public static UrlModel LJJIIZ(ImageModel imageModel) {
        if (imageModel == null) {
            return null;
        }
        UrlModel urlModel = new UrlModel();
        urlModel.setWidth(imageModel.getWidth());
        urlModel.setHeight(imageModel.getHeight());
        urlModel.setUri(imageModel.getUri());
        urlModel.setUrlList(imageModel.getUrls());
        return urlModel;
    }

    public static final boolean LJJIJ(MyMediaModel myMediaModel) {
        int i;
        o.LJIIIZ(myMediaModel, "<this>");
        if (myMediaModel.startTime > 0 || ((i = myMediaModel.endTime) > 0 && i < myMediaModel.duration)) {
            return true;
        }
        return false;
    }

    public static final String LJJIJIIJI(String joinFileSeperator) {
        o.LJIIJ(joinFileSeperator, "$this$joinFileSeperator");
        String str = C10820be.LIZ;
        if (ujb.o.LJJJJ(joinFileSeperator, str, false)) {
            return joinFileSeperator;
        }
        return i0.LJFF(joinFileSeperator, str);
    }

    public static final EnumC123864ta LJJIJIL(NLETrack nLETrack) {
        if (nLETrack == null) {
            return EnumC123864ta.NONE;
        }
        EnumC123864ta LJIIZILJ = nLETrack.LJIIZILJ();
        EnumC123864ta LJII = nLETrack.LJII();
        EnumC123864ta enumC123864ta = EnumC123864ta.NONE;
        if (LJIIZILJ != enumC123864ta && LJIIZILJ != EnumC123864ta.FILTER) {
            o.LJIIIIZZ(LJIIZILJ, "{\n        trackType\n    }");
            return LJIIZILJ;
        }
        if (LJII != enumC123864ta) {
            o.LJIIIIZZ(LJII, "{\n        extTrackType\n    }");
            return LJII;
        }
        return enumC123864ta;
    }

    public static final JSONObject LJJIJL(String str) {
        if (str != null && (!ujb.o.LJJJJJL(str))) {
            return new JSONObject(str);
        }
        return new JSONObject();
    }

    public static final void LJJIZ(InterfaceC45863HzH interfaceC45863HzH) {
        C60903NvH.LJIIJJI().getApplicationService().getClass();
        interfaceC45863HzH.run();
    }

    public static final NLETrack LJJJJ(InterfaceC124924vI interfaceC124924vI) {
        o.LJIIIZ(interfaceC124924vI, "<this>");
        return (NLETrack) interfaceC124924vI.getEnvVariables().LIZJ("selected_video_cover_track", null);
    }

    public static final NLETrackSlot LJJJJI(InterfaceC124924vI interfaceC124924vI) {
        o.LJIIIZ(interfaceC124924vI, "<this>");
        return (NLETrackSlot) interfaceC124924vI.getEnvVariables().LIZJ("selected_video_cover_track_slot", null);
    }

    public static final boolean LJJJJLL(Aweme aweme) {
        CommerceAceSurveyInfo LJIJI;
        Integer styleType;
        if (aweme != null && aweme.isAd() && (LJIJI = LJIJI(aweme)) != null && (styleType = LJIJI.getStyleType()) != null && styleType.intValue() == 0) {
            return true;
        }
        return false;
    }

    public static User LJJJJZI(com.ss.android.ugc.aweme.profile.model.User user) {
        String uid;
        if (user == null) {
            return null;
        }
        User user2 = new User();
        user2.setNickName(user.getNickname());
        user2.setAvatarThumb(LJJJLZIJ(user.getAvatarThumb()));
        user2.setAvatarMedium(LJJJLZIJ(user.getAvatarMedium()));
        user2.setAvatarLarge(LJJJLZIJ(user.getAvatarLarger()));
        user2.setIdStr(user.getUid());
        String uid2 = user.getUid();
        String str = CardStruct.IStatusCode.DEFAULT;
        if (uid2 == null) {
            uid = CardStruct.IStatusCode.DEFAULT;
        } else {
            uid = user.getUid();
        }
        user2.setId(CastLongProtector.parseLong(uid));
        if (user.getSecUid() != null) {
            str = user.getSecUid();
        }
        user2.setSecUid(str);
        user2.setFollowStatus(user.getFollowStatus());
        User.sSubPermission = user.isEnableSubscription();
        return user2;
    }

    public static final HFP LJJJLIIL(EditVideoSegment editVideoSegment) {
        o.LJIIIZ(editVideoSegment, "<this>");
        VideoCutInfo videoCutInfo = editVideoSegment.getVideoCutInfo();
        if (videoCutInfo != null) {
            return new HFP(editVideoSegment.getVideoPath(), videoCutInfo.getStart(), videoCutInfo.getEnd() - videoCutInfo.getStart());
        }
        return new HFP(editVideoSegment.getVideoPath(), 0L, editVideoSegment.getVideoFileInfo().getDuration());
    }

    public static ImageModel LJJJLZIJ(UrlModel urlModel) {
        if (urlModel == null) {
            return null;
        }
        ImageModel imageModel = new ImageModel();
        imageModel.width = urlModel.getWidth();
        imageModel.height = urlModel.getHeight();
        imageModel.setUri(urlModel.getUri());
        imageModel.setUrls(urlModel.getUrlList());
        return imageModel;
    }

    @Override // X.OVT
    public boolean LIZIZ(boolean z) {
        return LFH.LIZIZ.LIZLLL().LJIILLIIL().LIZIZ(z);
    }

    @Override // X.InterfaceC19570pl
    public boolean LIZJ(Activity activity) {
        o.LJIIIZ(activity, "activity");
        if (activity instanceof InterfaceC18040nI) {
            return true;
        }
        if (o.LJ(C16880lQ.LJLLJ(activity.getClass()), "MainActivity") && activity.getIntent().getBooleanExtra("pre_mainactivity_first_enter", false)) {
            return true;
        }
        return false;
    }

    @Override // X.OVT
    public int LIZLLL(ActivityC45651qj activityC45651qj) {
        LFH.LIZIZ.LIZLLL().LJIILIIL();
        return C53816LAe.LIZLLL(activityC45651qj);
    }

    public static final void LJFF(EditorProContext editorProContext, InterfaceC126664y6 listener) {
        o.LJIIIZ(editorProContext, "<this>");
        o.LJIIIZ(listener, "listener");
        editorProContext.getUndoRedoManager().LJ(listener);
    }

    public static final void LJI(InterfaceC83624Wrs addView, View child) {
        o.LJIIIZ(addView, "$this$addView");
        o.LJIIIZ(child, "child");
        addView.getViewFunction().LJZI(child);
    }

    public static final MutableLiveData LJII(EditorProContext editorProContext, String str) {
        o.LJIIIZ(editorProContext, "<this>");
        return editorProContext.getEnvVariables().LIZ(str);
    }

    public static void LJIILIIL(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null || jSONObject2 == null) {
            return;
        }
        try {
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                LJJJIL(jSONObject, next, jSONObject2.opt(next));
            }
        } catch (Exception unused) {
            C70657RoD.LJIILL();
        }
    }

    public static final void LJIILJJIL(InterfaceC124924vI interfaceC124924vI, boolean z) {
        o.LJIIIZ(interfaceC124924vI, "<this>");
        g0.LJIIJJI(interfaceC124924vI.getEditor().s9(), false, z, 1);
    }

    public static final void LJIILL(InterfaceC124924vI interfaceC124924vI, String str) {
        o.LJIIIZ(interfaceC124924vI, "<this>");
        g0.LJIILIIL(interfaceC124924vI.getEditor().s9(), false, str, false, false, 13);
    }

    public static final boolean LJIILLIIL(NavigationScene navigationScene, WM7 scene) {
        o.LJIIIZ(scene, "scene");
        Iterator it = ((ArrayList) navigationScene.getSceneList()).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (o.LJ(next, scene)) {
                if (next != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean LJIIZILJ(NavigationScene navigationScene, Class cls) {
        Iterator it = ((ArrayList) navigationScene.getSceneList()).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (o.LJ(next.getClass(), cls)) {
                if (next != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final int LJIL(Keva keva, String key) {
        o.LJIIIZ(keva, "<this>");
        o.LJIIIZ(key, "key");
        return keva.getInt(key, 0);
    }

    public static final String LJJIFFI(Keva keva, String key) {
        o.LJIIIZ(keva, "<this>");
        o.LJIIIZ(key, "key");
        return keva.getString(key, null);
    }

    public static final Object LJJIIJ(InterfaceC124924vI interfaceC124924vI, String str) {
        o.LJIIIZ(interfaceC124924vI, "<this>");
        return interfaceC124924vI.getEnvVariables().LIZJ(str, null);
    }

    public static void LJJIIJZLJL(Context context, LiveEditText liveEditText) {
        InputMethodManager inputMethodManager;
        if (context != null && (inputMethodManager = (InputMethodManager) C16880lQ.LLILL(context, "input_method")) != null) {
            inputMethodManager.hideSoftInputFromWindow(liveEditText.getWindowToken(), 0);
        }
    }

    public static final void LJJIJIIJIL(Keva keva, String key) {
        o.LJIIIZ(keva, "<this>");
        o.LJIIIZ(key, "key");
        keva.erase(key);
    }

    public static final void LJJIL(EditorProContext editorProContext, InterfaceC126664y6 listener) {
        o.LJIIIZ(editorProContext, "<this>");
        o.LJIIIZ(listener, "listener");
        editorProContext.getUndoRedoManager().LIZ(listener);
    }

    public static final void LJJJ(View view, Runnable runnable) {
        o.LJIIIZ(view, "<this>");
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                view.post(runnable);
            } else {
                C1DH.LJJIJIIJI(runnable);
            }
        } catch (NullPointerException unused) {
            view.post(runnable);
        }
    }

    public static void LJJJJZ(Context context, LiveEditText liveEditText) {
        InputMethodManager inputMethodManager;
        if (context != null && liveEditText != null && (inputMethodManager = (InputMethodManager) C16880lQ.LLILL(context, "input_method")) != null) {
            inputMethodManager.showSoftInput(liveEditText, 1);
        }
    }

    public static int LJLIL(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void LJLILLLLZI(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    public static final void LJ(InterfaceC07790Sh modifier, InterfaceC24520xk interfaceC24520xk, int i) {
        o.LJIIIZ(modifier, "modifier");
        interfaceC24520xk.LJJIIJ(-72882467);
        C1P0 c1p0 = new InterfaceC273215k() { // from class: X.1P0
            @Override // X.InterfaceC273215k
            public final /* synthetic */ int LIZ(AbstractC538029g abstractC538029g, List list, int i2) {
                return C79061V1d.LIZIZ(this, abstractC538029g, list, i2);
            }

            @Override // X.InterfaceC273215k
            public final /* synthetic */ int LIZIZ(AbstractC538029g abstractC538029g, List list, int i2) {
                return C79061V1d.LIZLLL(this, abstractC538029g, list, i2);
            }

            @Override // X.InterfaceC273215k
            public final /* synthetic */ int LIZLLL(AbstractC538029g abstractC538029g, List list, int i2) {
                return C79061V1d.LIZ(this, abstractC538029g, list, i2);
            }

            @Override // X.InterfaceC273215k
            public final /* synthetic */ int LJ(AbstractC538029g abstractC538029g, List list, int i2) {
                return C79061V1d.LIZJ(this, abstractC538029g, list, i2);
            }

            @Override // X.InterfaceC273215k
            public final InterfaceC273515n LIZJ(InterfaceC44861pS measure, List<? extends InterfaceC39071g7> measurables, long j) {
                int i2;
                InterfaceC273515n LJJLIL;
                o.LJIIIZ(measure, "$this$measure");
                o.LJIIIZ(measurables, "measurables");
                int i3 = 0;
                if (C23360vs.LJFF(j)) {
                    i2 = C23360vs.LJII(j);
                } else {
                    i2 = 0;
                }
                if (C23360vs.LJ(j)) {
                    i3 = C23360vs.LJI(j);
                }
                LJJLIL = measure.LJJLIL(i2, i3, C113554cx.LJJJLIIL(), C50861z8.LJLIL);
                return LJJLIL;
            }
        };
        interfaceC24520xk.LJJIIJ(-1323940314);
        Object LJIILLIIL = interfaceC24520xk.LJIILLIIL(AnonymousClass057.LJ);
        Object LJIILLIIL2 = interfaceC24520xk.LJIILLIIL(AnonymousClass057.LJIIJ);
        InterfaceC015404g interfaceC015404g = (InterfaceC015404g) interfaceC24520xk.LJIILLIIL(AnonymousClass057.LJIILJJIL);
        InterfaceC03730Cr.LJ.getClass();
        C46041rM c46041rM = C03720Cq.LIZIZ;
        C40431iJ LJIIL = C56509MFt.LJIIL(modifier);
        int i2 = (((((i << 3) & 112) | 384) << 9) & 7168) | 6;
        if (interfaceC24520xk.LJJ() instanceof InterfaceC24420xa) {
            interfaceC24520xk.LJIJI();
            if (interfaceC24520xk.LJIJJLI()) {
                interfaceC24520xk.LJJI(c46041rM);
            } else {
                interfaceC24520xk.LIZIZ();
            }
            interfaceC24520xk.LJJIIZI();
            C24830yF.LIZ(interfaceC24520xk, c1p0, C03720Cq.LJ);
            C24830yF.LIZ(interfaceC24520xk, LJIILLIIL, C03720Cq.LIZLLL);
            C24830yF.LIZ(interfaceC24520xk, LJIILLIIL2, C03720Cq.LJFF);
            LJIIL.invoke(V1I.LIZIZ(interfaceC24520xk, interfaceC015404g, C03720Cq.LJI, interfaceC24520xk), interfaceC24520xk, Integer.valueOf((i2 >> 3) & 112));
            interfaceC24520xk.LJJIIJ(2058660585);
            interfaceC24520xk.LJJIIJ(1142320198);
            if (((i2 >> 9) & 14 & 11) == 2 && interfaceC24520xk.LIZ()) {
                interfaceC24520xk.LIZLLL();
            }
            interfaceC24520xk.LJJIJIIJIL();
            interfaceC24520xk.LJJIJIIJIL();
            interfaceC24520xk.LJIJ();
            interfaceC24520xk.LJJIJIIJIL();
            interfaceC24520xk.LJJIJIIJIL();
            return;
        }
        C78929UyL.LJIILJJIL();
        throw null;
    }

    public static final NFL LJIIIIZZ(int i, String enterFrom, Aweme aweme) {
        CommerceAceSurveyInfo LJIJI;
        Long l;
        Long l2;
        String str;
        String str2;
        o.LJIIIZ(enterFrom, "enterFrom");
        String str3 = null;
        if (aweme == null || (LJIJI = LJIJI(aweme)) == null) {
            return null;
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null) {
            l = awemeRawAd.getAdId();
        } else {
            l = null;
        }
        String valueOf = String.valueOf(l);
        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
        if (awemeRawAd2 != null) {
            l2 = awemeRawAd2.getCreativeId();
        } else {
            l2 = null;
        }
        String valueOf2 = String.valueOf(l2);
        AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
        if (awemeRawAd3 != null) {
            str3 = awemeRawAd3.getLogExtra();
        }
        String str4 = "";
        if (str3 == null) {
            str3 = "";
        }
        try {
            str = new Gson().LJIILL(LJIJI.getUserConvert());
            o.LJIIIIZZ(str, "Gson().toJson(this.userConvert)");
        } catch (Throwable th) {
            C3C4 LIZ2 = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ2);
            C3C5.m10exceptionOrNullimpl(LIZ2);
            str = "";
        }
        String brandName = LJIJI.getBrandName();
        if (brandName != null) {
            str4 = brandName;
        }
        String valueOf3 = String.valueOf(i);
        Integer styleType = LJIJI.getStyleType();
        if (styleType == null || styleType.intValue() != 0) {
            str2 = "6";
        } else {
            str2 = "5";
        }
        return new NFL(valueOf, valueOf2, str3, str, str4, valueOf3, str2, enterFrom, String.valueOf(LJIJI.getSendNoticeTime()));
    }

    public static final boolean LJIJ(Keva keva, String key, boolean z) {
        o.LJIIIZ(keva, "<this>");
        o.LJIIIZ(key, "key");
        return keva.getBoolean(key, z);
    }

    public static final Object LJJIII(EditorProContext editorProContext, String str, Object defaultVal) {
        o.LJIIIZ(editorProContext, "<this>");
        o.LJIIIZ(defaultVal, "defaultVal");
        Object LIZJ = editorProContext.getEnvVariables().LIZJ(str, defaultVal);
        o.LJI(LIZJ);
        return LIZJ;
    }

    public static final void LJJIJLIJ(JSONObject jSONObject, String str, Object obj) {
        Object LIZ2;
        try {
            LIZ2 = jSONObject.putOpt(str, obj);
            C3C5.m7constructorimpl(LIZ2);
        } catch (Throwable th) {
            LIZ2 = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ2);
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ2);
        if (m10exceptionOrNullimpl != null) {
            C78983UzD.LJIIZILJ(m10exceptionOrNullimpl);
        }
    }

    public static void LJJJI(String str, String str2, JSONObject jSONObject) {
        try {
            jSONObject.put(str, str2);
        } catch (Exception unused) {
            C70657RoD.LJIILL();
        }
    }

    public static void LJJJIL(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException unused) {
            C70657RoD.LJIILL();
        }
    }

    public static final void LJJJJIZL(int i, Keva keva, String key) {
        o.LJIIIZ(keva, "<this>");
        o.LJIIIZ(key, "key");
        keva.storeInt(key, i);
    }

    public static final void LJJJJJ(Keva keva, String key, String value) {
        o.LJIIIZ(keva, "<this>");
        o.LJIIIZ(key, "key");
        o.LJIIIZ(value, "value");
        keva.storeString(key, value);
    }

    public static final void LJJJJJL(Keva keva, String key, boolean z) {
        o.LJIIIZ(keva, "<this>");
        o.LJIIIZ(key, "key");
        keva.storeBoolean(key, z);
    }

    public static final void LJJJJL(InterfaceC124924vI interfaceC124924vI, String str, Object obj) {
        o.LJIIIZ(interfaceC124924vI, "<this>");
        interfaceC124924vI.getEnvVariables().LIZIZ(str, false, obj);
    }

    public static final void LJJJLL(AbstractC58982NCw abstractC58982NCw, String reason, java.util.Map map) {
        Long l;
        AnoleModel anoleModel;
        o.LJIIIZ(abstractC58982NCw, "<this>");
        o.LJIIIZ(reason, "reason");
        String tag = abstractC58982NCw.LJLIL.getTag();
        if (tag == null) {
            tag = "anole_ad";
        }
        C58655N0h LIZLLL = C58704N2e.LIZLLL(tag, "othershow_fail", abstractC58982NCw.LJLILLLLZI.getAwemeRawAd());
        LIZLLL.LIZJ(abstractC58982NCw.LJLIL.getRefer(), "refer");
        LIZLLL.LIZIZ(reason, "fail_reason");
        LIZLLL.LIZIZ(Long.valueOf(abstractC58982NCw.LJLIL.getID()), "component_id");
        AwemeRawAd awemeRawAd = abstractC58982NCw.LJLILLLLZI.getAwemeRawAd();
        if (awemeRawAd != null && (anoleModel = awemeRawAd.getAnoleModel()) != null) {
            l = Long.valueOf(anoleModel.getTemplateID());
        } else {
            l = null;
        }
        LIZLLL.LIZIZ(l, "template_id");
        LIZLLL.LIZIZ(abstractC58982NCw.LJLIL.getType(), "component_type");
        LIZLLL.LIZ(map);
        LIZLLL.LJI();
    }

    public static void LJJJZ(Parcel parcel, int i, boolean z) {
        parcel.writeInt(i | 262144);
        parcel.writeInt(z ? 1 : 0);
    }

    public static void LJJL(Parcel parcel, int i, Boolean bool) {
        if (bool == null) {
            return;
        }
        C1FL.LJ(parcel, i | 262144, bool);
    }

    public static void LJJLI(Parcel parcel, int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int LJLIL = LJLIL(parcel, i);
        parcel.writeBundle(bundle);
        LJLILLLLZI(parcel, LJLIL);
    }

    public static void LJJLIIIIJ(Parcel parcel, int i, byte b) {
        parcel.writeInt(i | 262144);
        parcel.writeInt(b);
    }

    public static void LJJLIIIJILLIZJL(Parcel parcel, int i, double d) {
        parcel.writeInt(i | 524288);
        parcel.writeDouble(d);
    }

    public static void LJJLIIIJJI(Parcel parcel, int i, Double d) {
        if (d == null) {
            return;
        }
        parcel.writeInt(i | 524288);
        parcel.writeDouble(d.doubleValue());
    }

    public static void LJJLIIIJJIZ(Parcel parcel, int i, float f) {
        parcel.writeInt(i | 262144);
        parcel.writeFloat(f);
    }

    public static void LJJLIIIJL(Parcel parcel, int i, Float f) {
        if (f == null) {
            return;
        }
        C0MT.LIZJ(parcel, i | 262144, f);
    }

    public static void LJJLIIIJLJLI(Parcel parcel, int i, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int LJLIL = LJLIL(parcel, i);
        parcel.writeStrongBinder(iBinder);
        LJLILLLLZI(parcel, LJLIL);
    }

    public static void LJJLIIIJLLLLLLLZ(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | 262144);
        parcel.writeInt(i2);
    }

    public static void LJJLIIJ(Parcel parcel, int i, int[] iArr) {
        if (iArr == null) {
            return;
        }
        int LJLIL = LJLIL(parcel, i);
        parcel.writeIntArray(iArr);
        LJLILLLLZI(parcel, LJLIL);
    }

    public static void LJJLIL(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int LJLIL = LJLIL(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(((Integer) ListProtector.get(list, i2)).intValue());
        }
        LJLILLLLZI(parcel, LJLIL);
    }

    public static void LJJLJ(Parcel parcel, int i, Integer num) {
        if (num == null) {
            return;
        }
        C1FJ.LJ(parcel, i | 262144, num);
    }

    public static void LJJLJLI(Parcel parcel, int i, long j) {
        parcel.writeInt(i | 524288);
        parcel.writeLong(j);
    }

    public static void LJJLL(Parcel parcel, int i, long[] jArr) {
        if (jArr == null) {
            return;
        }
        int LJLIL = LJLIL(parcel, i);
        parcel.writeLongArray(jArr);
        LJLILLLLZI(parcel, LJLIL);
    }

    public static void LJJZ(Parcel parcel, int i, Long l) {
        if (l == null) {
            return;
        }
        C05040Hs.LIZLLL(parcel, i | 524288, l);
    }

    public static void LJL(Parcel parcel, int i, String[] strArr) {
        if (strArr == null) {
            return;
        }
        int LJLIL = LJLIL(parcel, i);
        parcel.writeStringArray(strArr);
        LJLILLLLZI(parcel, LJLIL);
    }

    public static void LJLI(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int LJLIL = LJLIL(parcel, i);
        parcel.writeStringList(list);
        LJLILLLLZI(parcel, LJLIL);
    }

    public static void LJLJI(Parcel parcel, Parcelable parcelable, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    public static final void LJJJJLI(InterfaceC124924vI interfaceC124924vI, String str, Object obj, boolean z) {
        o.LJIIIZ(interfaceC124924vI, "<this>");
        interfaceC124924vI.getEnvVariables().LIZIZ(str, z, obj);
    }

    public static void LJJLIIIJ(Parcel parcel, int i, byte[] bArr, boolean z) {
        if (bArr == null) {
            if (z) {
                parcel.writeInt(i);
            }
        } else {
            int LJLIL = LJLIL(parcel, i);
            parcel.writeByteArray(bArr);
            LJLILLLLZI(parcel, LJLIL);
        }
    }

    public static void LJJZZIII(Parcel parcel, int i, String str, boolean z) {
        if (str == null) {
            if (z) {
                parcel.writeInt(i);
            }
        } else {
            int LJLIL = LJLIL(parcel, i);
            parcel.writeString(str);
            LJLILLLLZI(parcel, LJLIL);
        }
    }

    public static void LJLIIIL(Parcel parcel, int i, Parcelable[] parcelableArr, int i2) {
        if (parcelableArr == null) {
            return;
        }
        int LJLIL = LJLIL(parcel, i);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                LJLJI(parcel, parcelable, i2);
            }
        }
        LJLILLLLZI(parcel, LJLIL);
    }

    public static void LJLIIL(Parcel parcel, int i, List list, boolean z) {
        if (list == null) {
            if (z) {
                parcel.writeInt(i);
                return;
            }
            return;
        }
        int LJLIL = LJLIL(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            Parcelable parcelable = (Parcelable) ListProtector.get(list, i2);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                LJLJI(parcel, parcelable, 0);
            }
        }
        LJLILLLLZI(parcel, LJLIL);
    }

    public static void LJJZZI(Parcel parcel, int i, Parcelable parcelable, int i2, boolean z) {
        if (parcelable == null) {
            if (z) {
                parcel.writeInt(i);
            }
        } else {
            int LJLIL = LJLIL(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            LJLILLLLZI(parcel, LJLIL);
        }
    }
}
